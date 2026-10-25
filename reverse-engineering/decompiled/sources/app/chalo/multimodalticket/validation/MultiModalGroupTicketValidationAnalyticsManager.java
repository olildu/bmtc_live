package app.chalo.multimodalticket.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.constants.Source;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.InstantTicketReceiptNotificationEvent;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium;
import app.chalo.validationsdk.legacy.Product;
import defpackage.lj0;
import defpackage.vo1;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationAnalyticsManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketValidationAnalyticsManager implements ProductValidationAnalyticManager, AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f5973a;
    public final MultiModalGroupTicketValidationData b;
    public final MultiModalChildResolver c;

    public MultiModalGroupTicketValidationAnalyticsManager(AnalyticsContract analyticsContract, MultiModalGroupTicketValidationData multiModalGroupTicketValidationData, MultiModalChildResolver childResolver) {
        Intrinsics.i(childResolver, "childResolver");
        this.f5973a = analyticsContract;
        this.b = multiModalGroupTicketValidationData;
        this.c = childResolver;
    }

    public static final void J(MultiModalGroupTicketValidationAnalyticsManager multiModalGroupTicketValidationAnalyticsManager, String str, String str2, Map map) {
        String strConcat = "mmt validation: ".concat(str);
        LinkedHashMap linkedHashMapK = multiModalGroupTicketValidationAnalyticsManager.K();
        linkedHashMapK.put("originalEventName", str);
        linkedHashMapK.put("reason", "child identity not resolved");
        linkedHashMapK.putAll(map);
        AnalyticsContract.DefaultImpls.a(multiModalGroupTicketValidationAnalyticsManager, strConcat, str2, linkedHashMapK, null, false, 24);
    }

    public static ValidationPayloadIdentity L(BleValidationAckData bleValidationAckData) {
        if (bleValidationAckData instanceof BleValidationAckData.ConductorValidationReceiptData) {
            ProductReceiptData productReceiptData = ((BleValidationAckData.ConductorValidationReceiptData) bleValidationAckData).d;
            return new ValidationPayloadIdentity(productReceiptData.getF10462a(), null, productReceiptData.getB());
        }
        if (bleValidationAckData instanceof BleValidationAckData.TITOTapInData) {
            BleValidationAckData.TITOTapInData tITOTapInData = (BleValidationAckData.TITOTapInData) bleValidationAckData;
            return new ValidationPayloadIdentity(tITOTapInData.b, tITOTapInData.c, tITOTapInData.d);
        }
        if (bleValidationAckData instanceof BleValidationAckData.TITOTapOutData) {
            BleValidationAckData.TITOTapOutData tITOTapOutData = (BleValidationAckData.TITOTapOutData) bleValidationAckData;
            return new ValidationPayloadIdentity(tITOTapOutData.b, tITOTapOutData.c, tITOTapOutData.d);
        }
        if (bleValidationAckData instanceof BleValidationAckData.InvalidData) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation) {
        MultiModalChildValidationTarget multiModalChildValidationTargetB;
        ValidationPayloadIdentity validationPayloadIdentityL = L(bleValidationAckData);
        String sourceName = source.getSourceName();
        Map mapD = MapsKt.d();
        MultiModalChildResolver multiModalChildResolver = this.c;
        if (validationPayloadIdentityL == null || (multiModalChildValidationTargetB = multiModalChildResolver.a(validationPayloadIdentityL)) == null) {
            multiModalChildValidationTargetB = multiModalChildResolver.b(productValidationData);
        }
        if (multiModalChildValidationTargetB == null) {
            J(this, "ble validation ack data consumed", sourceName, mapD);
        } else {
            Object objA = multiModalChildValidationTargetB.b.getB().A(bleValidationAckData, multiModalChildValidationTargetB.f5972a, validationNotificationDeliveryMedium, source, continuation);
            if (objA == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objA;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void B(Product product, String source) {
        Intrinsics.i(source, "source");
        M("BLE permission rationale accepted", source);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void C(Product product, String source) {
        Intrinsics.i(source, "source");
        M("BLE validation help btn clicked", source);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void D(AppNotification.PunchNotification punch, String source) {
        String str;
        ValidationPayloadIdentity validationPayloadIdentityA;
        Intrinsics.i(punch, "punch");
        Intrinsics.i(source, "source");
        boolean z = punch instanceof InstantTicketReceiptNotificationEvent;
        if (z) {
            str = ((InstantTicketReceiptNotificationEvent) punch).d;
        } else {
            str = punch instanceof AppNotification.PunchNotification.OndcMetroPunchEvent ? ((AppNotification.PunchNotification.OndcMetroPunchEvent) punch).e : null;
        }
        if (str == null || (validationPayloadIdentityA = MultiModalGroupTicketValidationPayloadKt.a(punch)) == null) {
            return;
        }
        MapBuilder mapBuilder = new MapBuilder();
        if (z) {
            InstantTicketReceiptNotificationEvent instantTicketReceiptNotificationEvent = (InstantTicketReceiptNotificationEvent) punch;
            String str2 = instantTicketReceiptNotificationEvent.e;
            if (str2 != null) {
                mapBuilder.put("productId", str2);
            }
            String str3 = instantTicketReceiptNotificationEvent.c;
            if (str3 != null) {
                mapBuilder.put("productType", str3);
            }
            String str4 = instantTicketReceiptNotificationEvent.d;
            if (str4 != null) {
                mapBuilder.put("productSubType", str4);
            }
        } else if (punch instanceof AppNotification.PunchNotification.OndcMetroPunchEvent) {
            AppNotification.PunchNotification.OndcMetroPunchEvent ondcMetroPunchEvent = (AppNotification.PunchNotification.OndcMetroPunchEvent) punch;
            mapBuilder.put("productId", ondcMetroPunchEvent.c);
            mapBuilder.put("productType", ondcMetroPunchEvent.d);
            mapBuilder.put("productSubType", ondcMetroPunchEvent.e);
            mapBuilder.put("punchTime", Long.valueOf(ondcMetroPunchEvent.f));
        }
        mapBuilder.put("isTripReceiptAvailable", Boolean.FALSE);
        MapBuilder mapBuilderH = mapBuilder.h();
        MultiModalChildValidationTarget multiModalChildValidationTargetA = this.c.a(validationPayloadIdentityA);
        MultiModalChildValidationTarget multiModalChildValidationTarget = multiModalChildValidationTargetA != null ? multiModalChildValidationTargetA : null;
        if (multiModalChildValidationTarget == null) {
            J(this, "group ticket non receipt punch received", source, mapBuilderH);
        } else {
            multiModalChildValidationTarget.b.getB().D(punch, source);
        }
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl) {
        MultiModalChildValidationTarget multiModalChildValidationTargetB;
        ValidationPayloadIdentity validationPayloadIdentityL = L(bleValidationAckData);
        String sourceName = source.getSourceName();
        Map mapD = MapsKt.d();
        MultiModalChildResolver multiModalChildResolver = this.c;
        if (validationPayloadIdentityL == null || (multiModalChildValidationTargetB = multiModalChildResolver.a(validationPayloadIdentityL)) == null) {
            multiModalChildValidationTargetB = productValidationData != null ? multiModalChildResolver.b(productValidationData) : null;
        }
        if (multiModalChildValidationTargetB == null) {
            J(this, "invalid ble validation ack data received", sourceName, mapD);
        } else {
            Object objE = multiModalChildValidationTargetB.b.getB().E(bleValidationAckData, multiModalChildValidationTargetB.f5972a, validationNotificationDeliveryMedium, source, continuationImpl);
            if (objE == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objE;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void F(String name, String source, Map map) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        this.f5973a.F(name, source, map);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object G(ProductValidationData productValidationData, Continuation continuation) {
        LinkedHashMap linkedHashMapK = K();
        linkedHashMapK.put("type", "activationScreenTicketingProblemsV2");
        linkedHashMapK.put("problemSource", "validationScreen");
        AnalyticsContract.DefaultImpls.a(this, "report problem clicked v2", "validationScreen", linkedHashMapK, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object H(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        String sourceName = source.getSourceName();
        Map mapD = MapsKt.d();
        MultiModalChildValidationTarget multiModalChildValidationTargetB = this.c.b(productValidationData);
        if (multiModalChildValidationTargetB == null) {
            J(this, "view receipt post validation clicked", sourceName, mapD);
        } else {
            Object objH = multiModalChildValidationTargetB.b.getB().H(multiModalChildValidationTargetB.f5972a, z, source, continuation);
            if (objH == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objH;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object I(boolean z, ProductValidationData productValidationData, String str, Continuation continuation) {
        LinkedHashMap linkedHashMapK = K();
        linkedHashMapK.put("isBlePermissionGranted", Boolean.valueOf(z));
        AnalyticsContract.DefaultImpls.a(this, "BLE permission check on validation initialization", str, linkedHashMapK, null, false, 24);
        return Unit.f17538a;
    }

    public final LinkedHashMap K() {
        MultiModalGroupTicketValidationData multiModalGroupTicketValidationData = this.b;
        String id = multiModalGroupTicketValidationData.getId();
        String strA = multiModalGroupTicketValidationData.a();
        String strB = multiModalGroupTicketValidationData.b();
        List listG = multiModalGroupTicketValidationData.G();
        return MapsKt.k(new Pair("productType", strA), new Pair("productSubType", strB), new Pair("bookingId", id), new Pair(PaymentConstants.ORDER_ID_CAMEL, id), new Pair("totalGroupChildren", Integer.valueOf(listG.size())), new Pair("groupChildrenProducts", CollectionsKt.O(listG, null, null, null, new lj0(6), 31)));
    }

    public final void M(String str, String str2) {
        AnalyticsContract.DefaultImpls.a(this, str, str2, K(), null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void a(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f5973a.a(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        this.f5973a.b();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void c(Product product, String source) {
        Intrinsics.i(source, "source");
        M("BLE validation open qr btn clicked", source);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f5973a.d(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        this.f5973a.e(name, source, map, frequency, z);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void f(Product product, String source) {
        Intrinsics.i(source, "source");
        M("simple qr validation zoom qr clicked", source);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        this.f5973a.g(d, d2);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object h(ProductValidationData productValidationData, Continuation continuation) {
        AnalyticsContract.DefaultImpls.a(this, "view trip receipt from menu clicked", "validationScreen", K(), null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void i(boolean z, Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, z ? "BLE permission granted" : "BLE permission denied", source, K(), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void j(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "multi product validation screen open", source, K(), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void k(Product product, String source) {
        Intrinsics.i(source, "source");
        M("BLE validation permission rationale screen opened", source);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object l(String str, ProductValidationData productValidationData, String str2, Map map, AnalyticsFrequency analyticsFrequency, Continuation continuation) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(K());
        AnalyticsContract.DefaultImpls.a(this, str, str2, linkedHashMap, AnalyticsFrequency.Always.b, false, 16);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object m(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        String sourceName = source.getSourceName();
        Map mapD = MapsKt.d();
        MultiModalChildValidationTarget multiModalChildValidationTargetB = this.c.b(productValidationData);
        if (multiModalChildValidationTargetB == null) {
            J(this, "view receipt post validation clicked", sourceName, mapD);
        } else {
            Object objM = multiModalChildValidationTargetB.b.getB().m(multiModalChildValidationTargetB.f5972a, z, source, continuation);
            if (objM == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object n(ProductValidationData productValidationData, String str, Source source, ContinuationImpl continuationImpl) {
        String sourceName = source.getSourceName();
        Map mapS = vo1.s("failureReason", str);
        MultiModalChildValidationTarget multiModalChildValidationTargetB = this.c.b(productValidationData);
        if (multiModalChildValidationTargetB == null) {
            J(this, "syncing post ble validation failed", sourceName, mapS);
        } else {
            Object objN = multiModalChildValidationTargetB.b.getB().n(multiModalChildValidationTargetB.f5972a, str, source, continuationImpl);
            if (objN == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objN;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void o(String str) {
        this.f5973a.o(str);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void p(Source source, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct) {
        Intrinsics.i(validationProduct, "validationProduct");
        Intrinsics.i(validationProcessFlowDetails, "validationProcessFlowDetails");
        Intrinsics.i(source, "source");
        String sourceName = source.getSourceName();
        LinkedHashMap linkedHashMapK = K();
        linkedHashMapK.put("validationFlowType", ProductValidationAnalyticManager.DefaultImpls.c(validationProcessFlowDetails));
        AnalyticsContract.DefaultImpls.a(this, "ble screen open", sourceName, linkedHashMapK, null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void q() {
        this.f5973a.q();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void r(ProductReceiptData productReceiptData, String source) {
        Intrinsics.i(source, "source");
        ValidationPayloadIdentity validationPayloadIdentity = new ValidationPayloadIdentity(productReceiptData.getF10462a(), null, productReceiptData.getB());
        Map mapD = MapsKt.d();
        MultiModalChildValidationTarget multiModalChildValidationTargetA = this.c.a(validationPayloadIdentity);
        MultiModalChildValidationTarget multiModalChildValidationTarget = multiModalChildValidationTargetA != null ? multiModalChildValidationTargetA : null;
        if (multiModalChildValidationTarget == null) {
            J(this, "mTicket trip punch", source, mapD);
        } else {
            multiModalChildValidationTarget.b.getB().r(productReceiptData, source);
        }
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void s(Product product, String source) {
        Intrinsics.i(source, "source");
        M("BLE validation switch to qr got it clicked", source);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void t(Product product, String source) {
        Intrinsics.i(source, "source");
        M("BLE validation permission settings screen opened", source);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object u(ProductReceiptData productReceiptData, String str, Continuation continuation) {
        ValidationPayloadIdentity validationPayloadIdentity = new ValidationPayloadIdentity(productReceiptData.getF10462a(), null, productReceiptData.getB());
        Map mapD = MapsKt.d();
        MultiModalChildValidationTarget multiModalChildValidationTargetA = this.c.a(validationPayloadIdentity);
        MultiModalChildValidationTarget multiModalChildValidationTarget = multiModalChildValidationTargetA != null ? multiModalChildValidationTargetA : null;
        if (multiModalChildValidationTarget == null) {
            J(this, "view receipt post validation clicked", str, mapD);
        } else {
            Object objU = multiModalChildValidationTarget.b.getB().u(productReceiptData, str, continuation);
            if (objU == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objU;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void v(String username) {
        Intrinsics.i(username, "username");
        this.f5973a.v(username);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object w(ProductValidationData productValidationData, String str, Continuation continuation) {
        AnalyticsContract.DefaultImpls.a(this, "multi modal group ticket fetched", str, K(), null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void x(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "ble bottom sheet clicked", source, K(), null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        this.f5973a.y();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void z(Product product, String source) {
        Intrinsics.i(source, "source");
        M("BLE denial qr option shown", source);
    }
}
