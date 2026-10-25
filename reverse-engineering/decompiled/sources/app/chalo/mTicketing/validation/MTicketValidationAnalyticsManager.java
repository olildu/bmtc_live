package app.chalo.mTicketing.validation;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.TITOTapInNotificationEvent;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validation.superpass.SuperPassReceiptData;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckDataKt;
import app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium;
import app.chalo.validationsdk.legacy.Product;
import app.chalo.validationsdk.legacy.ProductKt;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketValidationAnalyticsManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketValidationAnalyticsManager implements ProductValidationAnalyticManager, AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalyticsContract f5395a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;

    public MTicketValidationAnalyticsManager(AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f5395a = analyticsContract;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
    }

    public static LinkedHashMap J(Product product) {
        return MapsKt.k(new Pair("productType", product.b), new Pair("isSuperPass", Boolean.FALSE), new Pair("productSubType", product.c), new Pair("bookingId", product.f10666a));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public static Map K(ProductValidationData productValidationData) {
        ?? r1;
        MTicketValidationData mTicketValidationData = productValidationData instanceof MTicketValidationData ? (MTicketValidationData) productValidationData : null;
        return (mTicketValidationData == null || (r1 = mTicketValidationData.i) == 0) ? MapsKt.d() : r1;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation) {
        LinkedHashMap linkedHashMapU = MapsKt.u(K(productValidationData));
        linkedHashMapU.put("validationAckDataType", ProductValidationAnalyticManager.DefaultImpls.b(bleValidationAckData));
        linkedHashMapU.put("notificationDeliveryMedium", validationNotificationDeliveryMedium.name());
        AnalyticsContract.DefaultImpls.a(this, "ble validation ack data consumed", source.getSourceName(), linkedHashMapU, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void B(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE permission rationale accepted", source, J(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void C(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation help btn clicked", source, J(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void D(AppNotification.PunchNotification punch, String source) {
        Intrinsics.i(punch, "punch");
        Intrinsics.i(source, "source");
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl) {
        boolean z = bleValidationAckData instanceof BleValidationAckData.ConductorValidationReceiptData;
        Unit unit = Unit.f17538a;
        if (z) {
            r(((BleValidationAckData.ConductorValidationReceiptData) bleValidationAckData).d, source.getSourceName());
            return unit;
        }
        if (bleValidationAckData instanceof BleValidationAckData.TITOTapInData) {
            Object objL = L(BleValidationAckDataKt.a((BleValidationAckData.TITOTapInData) bleValidationAckData), productValidationData, source.getSourceName(), validationNotificationDeliveryMedium, continuationImpl);
            return objL == CoroutineSingletons.COROUTINE_SUSPENDED ? objL : unit;
        }
        if (bleValidationAckData instanceof BleValidationAckData.TITOTapOutData) {
            return unit;
        }
        if (!(bleValidationAckData instanceof BleValidationAckData.InvalidData)) {
            throw new NoWhenBranchMatchedException();
        }
        LinkedHashMap linkedHashMapU = MapsKt.u(K(productValidationData));
        BleValidationAckData.InvalidData invalidData = (BleValidationAckData.InvalidData) bleValidationAckData;
        linkedHashMapU.put("reason", invalidData.b);
        linkedHashMapU.put(Constants.MessagePayloadKeys.RAW_DATA, invalidData.f10498a);
        linkedHashMapU.put("notificationDeliveryMedium", validationNotificationDeliveryMedium.name());
        AnalyticsContract.DefaultImpls.a(this, "invalid ble validation ack data received", source.getSourceName(), linkedHashMapU, null, false, 24);
        return unit;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void F(String name, String source, Map map) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        this.f5395a.F(name, source, map);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object G(ProductValidationData productValidationData, Continuation continuation) {
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("type", "activationScreenTicketingProblemsV2"), new Pair("problemSource", "validationScreen"));
        linkedHashMapK.putAll(K(productValidationData));
        AnalyticsContract.DefaultImpls.a(this, "report problem clicked v2", "validationScreen", linkedHashMapK, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object H(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        LinkedHashMap linkedHashMapU = MapsKt.u(K(productValidationData));
        linkedHashMapU.put("wasTitoValidation", Boolean.valueOf(z));
        AnalyticsContract.DefaultImpls.a(this, "view receipt post validation clicked", source.getSourceName(), linkedHashMapU, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object I(boolean z, ProductValidationData productValidationData, String str, Continuation continuation) {
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("productType", "singleJourneyTicket"), new Pair("isSuperPass", Boolean.FALSE), new Pair("productSubType", productValidationData.b()), new Pair("passId", productValidationData.getId()));
        linkedHashMapK.put("isBlePermissionGranted", Boolean.valueOf(z));
        AnalyticsContract.DefaultImpls.a(this, "BLE permission check on validation initialization", str, linkedHashMapK, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L(TITOTapInNotificationEvent tITOTapInNotificationEvent, ProductValidationData productValidationData, String str, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Continuation continuation) {
        MTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1;
        Map mapK;
        if (continuation instanceof MTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) {
            mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = (MTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) continuation;
            int i = mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new MTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new MTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
        }
        Object objC = mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            mapK = K(productValidationData);
            mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0 = str;
            mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1 = validationNotificationDeliveryMedium;
            mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2 = tITOTapInNotificationEvent;
            mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3 = mapK;
            mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = 1;
            objC = this.b.c(mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = (Map) mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3;
            TITOTapInNotificationEvent tITOTapInNotificationEvent2 = (TITOTapInNotificationEvent) mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2;
            validationNotificationDeliveryMedium = (ValidationNotificationDeliveryMedium) mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1;
            str = (String) mTicketValidationAnalyticsManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0;
            ResultKt.b(objC);
            mapK = map;
            tITOTapInNotificationEvent = tITOTapInNotificationEvent2;
        }
        String str2 = str;
        LinkedHashMap linkedHashMapU = MapsKt.u(tITOTapInNotificationEvent.b(mapK, ((Number) objC).longValue()));
        linkedHashMapU.put("notificationDeliveryMedium", validationNotificationDeliveryMedium.name());
        AnalyticsContract.DefaultImpls.a(this, "tito tapIn notif recv on conductor flow", str2, linkedHashMapU, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void a(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f5395a.a(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        this.f5395a.b();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void c(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation open qr btn clicked", source, J(product), null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f5395a.d(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        this.f5395a.e(name, source, map, frequency, z);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void f(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "simple qr validation zoom qr clicked", source, J(product), null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        this.f5395a.g(d, d2);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object h(ProductValidationData productValidationData, Continuation continuation) {
        AnalyticsContract.DefaultImpls.a(this, "view trip receipt from menu clicked", "validationScreen", K(productValidationData), null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void i(boolean z, Product product, String source) {
        Intrinsics.i(source, "source");
        if (z) {
            AnalyticsContract.DefaultImpls.a(this, "BLE permission granted", source, J(product), null, false, 24);
        } else {
            AnalyticsContract.DefaultImpls.a(this, "BLE permission denied", source, J(product), null, false, 24);
        }
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void j(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "mticket qr code zoomed", source, J(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void k(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation permission rationale screen opened", source, J(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object l(String str, ProductValidationData productValidationData, String str2, Map map, AnalyticsFrequency analyticsFrequency, Continuation continuation) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(K(productValidationData));
        AnalyticsContract.DefaultImpls.a(this, str, str2, linkedHashMap, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object m(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        LinkedHashMap linkedHashMapU = MapsKt.u(K(productValidationData));
        linkedHashMapU.put("wasTitoValidation", Boolean.valueOf(z));
        AnalyticsContract.DefaultImpls.a(this, "view receipt post validation clicked", source.getSourceName(), linkedHashMapU, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object n(ProductValidationData productValidationData, String str, Source source, ContinuationImpl continuationImpl) {
        LinkedHashMap linkedHashMapU = MapsKt.u(K(productValidationData));
        linkedHashMapU.put("failureReason", str);
        AnalyticsContract.DefaultImpls.a(this, "syncing post ble validation failed", source.getSourceName(), linkedHashMapU, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void o(String str) {
        this.f5395a.o(str);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void p(Source source, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct) {
        Intrinsics.i(validationProduct, "validationProduct");
        Intrinsics.i(validationProcessFlowDetails, "validationProcessFlowDetails");
        Intrinsics.i(source, "source");
        LinkedHashMap linkedHashMapJ = J(ProductKt.a(validationProduct));
        linkedHashMapJ.put("validationFlowType", ProductValidationAnalyticManager.DefaultImpls.c(validationProcessFlowDetails));
        AnalyticsContractImplKt.b(this, "ble screen open", source, linkedHashMapJ, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void q() {
        this.f5395a.q();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void r(ProductReceiptData productReceiptData, String source) {
        Intrinsics.i(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair pair = new Pair("isTripReceiptAvailable", Boolean.valueOf(productReceiptData.getC() != -1));
        Pair pair2 = new Pair("passId", productReceiptData.getF10462a());
        Pair pair3 = new Pair("productSubType", productReceiptData.getB());
        boolean z = productReceiptData instanceof SuperPassReceiptData;
        SuperPassReceiptData superPassReceiptData = z ? (SuperPassReceiptData) productReceiptData : null;
        Pair pair4 = new Pair("productType", String.valueOf(superPassReceiptData != null ? superPassReceiptData.k : null));
        Pair pair5 = new Pair("route name", productReceiptData.getI());
        Pair pair6 = new Pair("startStop", productReceiptData.getG());
        Pair pair7 = new Pair("endStop", productReceiptData.getH());
        Pair pair8 = new Pair("conductorId", productReceiptData.getF());
        SuperPassReceiptData superPassReceiptData2 = z ? (SuperPassReceiptData) productReceiptData : null;
        TimeUtilsContract timeUtilsContract = this.c;
        linkedHashMap.putAll(MapsKt.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("activationTime", String.valueOf(superPassReceiptData2 != null ? timeUtilsContract.i(superPassReceiptData2.l) : null)), new Pair("punchTime", timeUtilsContract.i(productReceiptData.getC())), new Pair("vehicleNo", productReceiptData.getE()), new Pair("endStopId", productReceiptData.getM())));
        if (productReceiptData.getC() != -1) {
            linkedHashMap.put("punch notification delay", Long.valueOf(this.b.j() - productReceiptData.getC()));
        }
        AnalyticsContract.DefaultImpls.a(this, "mTicket trip punch", source, linkedHashMap, null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void s(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation switch to qr got it clicked", source, J(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void t(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation permission settings screen opened", source, J(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object u(ProductReceiptData productReceiptData, String str, Continuation continuation) {
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void v(String username) {
        Intrinsics.i(username, "username");
        this.f5395a.v(username);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object w(ProductValidationData productValidationData, String str, Continuation continuation) {
        AnalyticsContract.DefaultImpls.a(this, "mticket fetched", str, K(productValidationData), null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void x(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "ble bottom sheet clicked", source, J(product), null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        this.f5395a.y();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void z(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE denial qr option shown", source, J(product), null, false, 24);
    }
}
