package app.chalo.instantticket.validation;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.InstantTicketReceiptNotificationEvent;
import app.chalo.notification.models.TITOTapInNotificationEvent;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckDataKt;
import app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium;
import app.chalo.validationsdk.legacy.Product;
import app.chalo.validationsdk.legacy.ProductKt;
import com.google.firebase.messaging.Constants;
import defpackage.d;
import defpackage.vo1;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/instantticket/validation/InstantTicketValidationAnalyticManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketValidationAnalyticManager implements ProductValidationAnalyticManager, AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f3976a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;

    public InstantTicketValidationAnalyticManager(AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, CoroutineContextProvider coroutineContextProvider) {
        this.f3976a = analyticsContract;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
    }

    public static void K(InstantTicketValidationAnalyticManager instantTicketValidationAnalyticManager, String str, Product product, String str2, Map map, int i) {
        if ((i & 16) != 0) {
            map = null;
        }
        instantTicketValidationAnalyticManager.getClass();
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isInstantTicket", Boolean.TRUE), new Pair(PaymentConstants.ORDER_ID_CAMEL, product.f10666a), new Pair("productType", product.b), new Pair("productSubType", product.c));
        if (map != null) {
            linkedHashMapK.putAll(map);
        }
        AnalyticsContract.DefaultImpls.a(instantTicketValidationAnalyticManager, str, str2, linkedHashMapK, AnalyticsFrequency.Always.b, false, 16);
    }

    public static void L(InstantTicketValidationAnalyticManager instantTicketValidationAnalyticManager, String str, ProductReceiptData productReceiptData, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isInstantTicket", Boolean.TRUE);
        linkedHashMap.put("productId", productReceiptData.getF10462a());
        linkedHashMap.put("punchTime", Long.valueOf(productReceiptData.getC()));
        Long amount = productReceiptData.getAmount();
        if (amount != null) {
            linkedHashMap.put(PaymentConstants.AMOUNT, Long.valueOf(amount.longValue()));
        }
        linkedHashMap.put("vehicleNo", productReceiptData.getE());
        linkedHashMap.put("route name", productReceiptData.getI());
        linkedHashMap.put("startStop", productReceiptData.getG());
        linkedHashMap.put("endStop", productReceiptData.getH());
        linkedHashMap.put("conductorId", productReceiptData.getF());
        linkedHashMap.put("endStopId", productReceiptData.getM());
        AnalyticsContract.DefaultImpls.a(instantTicketValidationAnalyticManager, str, str2, linkedHashMap, AnalyticsFrequency.Always.b, false, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation) {
        InstantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        if (continuation instanceof InstantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) {
            instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = (InstantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) continuation;
            int i = instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = new InstantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = new InstantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()), new Pair("validationAckDataType", ProductValidationAnalyticManager.DefaultImpls.b(bleValidationAckData)));
            instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$0 = linkedHashMapK;
            instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$1 = this;
            str = "ble validation ack data consumed";
            instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$2 = "ble validation ack data consumed";
            instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$3 = source;
            instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$3;
            str = (String) instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$1;
            Map map2 = (Map) instantTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$0;
            ResultKt.b(obj);
            analyticsContract = analyticsContract2;
            map = map2;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, map, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void B(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE permission rationale accepted", product, source, null, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void C(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation help btn clicked", product, source, null, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void D(AppNotification.PunchNotification punch, String source) {
        String str;
        String str2;
        Intrinsics.i(punch, "punch");
        Intrinsics.i(source, "source");
        InstantTicketReceiptNotificationEvent instantTicketReceiptNotificationEvent = punch instanceof InstantTicketReceiptNotificationEvent ? (InstantTicketReceiptNotificationEvent) punch : null;
        if (instantTicketReceiptNotificationEvent == null || (str = instantTicketReceiptNotificationEvent.d) == null || !str.equals("instantTicket") || (str2 = instantTicketReceiptNotificationEvent.e) == null) {
            return;
        }
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("productId", str2);
        String str3 = instantTicketReceiptNotificationEvent.c;
        if (str3 != null) {
            mapBuilder.put("productType", str3);
        }
        mapBuilder.put("productSubType", str);
        mapBuilder.put("isTripReceiptAvailable", Boolean.FALSE);
        AnalyticsContract.DefaultImpls.a(this, "instant ticket non receipt punch received", source, mapBuilder.h(), null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl) {
        InstantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        Source source2;
        if (continuationImpl instanceof InstantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1) {
            instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = (InstantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1) continuationImpl;
            int i = instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = new InstantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = new InstantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
        }
        InstantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2 = instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1;
        Object obj = instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (bleValidationAckData instanceof BleValidationAckData.ConductorValidationReceiptData) {
                r(((BleValidationAckData.ConductorValidationReceiptData) bleValidationAckData).d, source.getSourceName());
                return unit;
            }
            if (bleValidationAckData instanceof BleValidationAckData.TITOTapInData) {
                TITOTapInNotificationEvent tITOTapInNotificationEventA = BleValidationAckDataKt.a((BleValidationAckData.TITOTapInData) bleValidationAckData);
                String sourceName = source.getSourceName();
                instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label = 1;
                if (M(tITOTapInNotificationEventA, productValidationData, sourceName, validationNotificationDeliveryMedium, instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
                    return unit;
                }
            } else {
                if (bleValidationAckData instanceof BleValidationAckData.TITOTapOutData) {
                    return unit;
                }
                if (!(bleValidationAckData instanceof BleValidationAckData.InvalidData)) {
                    throw new NoWhenBranchMatchedException();
                }
                BleValidationAckData.InvalidData invalidData = (BleValidationAckData.InvalidData) bleValidationAckData;
                LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("reason", invalidData.b), new Pair(Constants.MessagePayloadKeys.RAW_DATA, invalidData.f10498a), new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()));
                instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$0 = linkedHashMapK;
                instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$1 = this;
                str = "invalid ble validation ack data received";
                instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$2 = "invalid ble validation ack data received";
                instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$3 = source;
                instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label = 2;
                if (J(linkedHashMapK, productValidationData, instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
                    analyticsContract = this;
                    map = linkedHashMapK;
                    source2 = source;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
            return unit;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Source source3 = (Source) instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$3;
        str = (String) instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$2;
        AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$1;
        Map map2 = (Map) instantTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$0;
        ResultKt.b(obj);
        source2 = source3;
        analyticsContract = analyticsContract2;
        map = map2;
        AnalyticsContractImplKt.b(analyticsContract, str, source2, map, false, 24);
        return unit;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void F(String name, String source, Map map) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        this.f3976a.F(name, source, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object G(ProductValidationData productValidationData, Continuation continuation) {
        InstantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof InstantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) {
            instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = (InstantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) continuation;
            int i = instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = new InstantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = new InstantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("type", "activationScreenTicketingProblemsV2"), new Pair("problemSource", "validationScreen"));
            instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$0 = linkedHashMapK;
            instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$1 = this;
            instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$2 = "report problem clicked v2";
            instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$3 = "";
            instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "report problem clicked v2";
            str2 = "";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$3;
            String str4 = (String) instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$1;
            Map map2 = (Map) instantTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
            map = map2;
            str = str4;
            analyticsContract = analyticsContract2;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, map, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object H(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        InstantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof InstantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) {
            instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = (InstantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) continuation;
            int i = instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = new InstantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = new InstantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$0 = linkedHashMapK;
            instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$1 = this;
            instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$2 = "view receipt post validation clicked";
            instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$3 = source;
            instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$3;
            String str2 = (String) instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$1;
            Map map2 = (Map) instantTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$0;
            ResultKt.b(obj);
            str = str2;
            analyticsContract = analyticsContract2;
            map = map2;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, map, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object I(boolean z, ProductValidationData productValidationData, String str, Continuation continuation) {
        InstantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuation instanceof InstantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) {
            instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = (InstantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) continuation;
            int i = instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = new InstantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = new InstantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isInstantTicket", Boolean.TRUE), new Pair("isBlePermissionGranted", Boolean.valueOf(z)));
            instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$0 = linkedHashMapK;
            instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$1 = this;
            instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$2 = "BLE permission check on validation initialization";
            instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$3 = str;
            instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str2 = "BLE permission check on validation initialization";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$3;
            String str3 = (String) instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$1;
            Map map2 = (Map) instantTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
            analyticsContract = analyticsContract2;
            map = map2;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str, map, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(LinkedHashMap linkedHashMap, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        InstantTicketValidationAnalyticManager$addProperties$1 instantTicketValidationAnalyticManager$addProperties$1;
        String str;
        Object objX;
        Map map;
        Map map2;
        if (continuationImpl instanceof InstantTicketValidationAnalyticManager$addProperties$1) {
            instantTicketValidationAnalyticManager$addProperties$1 = (InstantTicketValidationAnalyticManager$addProperties$1) continuationImpl;
            int i = instantTicketValidationAnalyticManager$addProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$addProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$addProperties$1 = new InstantTicketValidationAnalyticManager$addProperties$1(this, continuationImpl);
            }
        } else {
            instantTicketValidationAnalyticManager$addProperties$1 = new InstantTicketValidationAnalyticManager$addProperties$1(this, continuationImpl);
        }
        Object obj = instantTicketValidationAnalyticManager$addProperties$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$addProperties$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            linkedHashMap.put("fullName", productValidationData.y().getC());
            BasicInfoContract basicInfoContract = this.b;
            long j = basicInfoContract.j();
            TimeUtilsContract timeUtilsContract = this.c;
            linkedHashMap.put("time", timeUtilsContract.e(j));
            linkedHashMap.put(CLConstants.SHARED_PREFERENCE_ITEM_DATE, timeUtilsContract.Q(basicInfoContract.j()));
            linkedHashMap.put("productType", "mobileTicket");
            linkedHashMap.put("productSubType", "instantTicket");
            linkedHashMap.put(PaymentConstants.ORDER_ID_CAMEL, productValidationData.getId());
            instantTicketValidationAnalyticManager$addProperties$1.L$0 = linkedHashMap;
            instantTicketValidationAnalyticManager$addProperties$1.L$1 = linkedHashMap;
            str = "activationTime";
            instantTicketValidationAnalyticManager$addProperties$1.L$2 = "activationTime";
            instantTicketValidationAnalyticManager$addProperties$1.label = 1;
            objX = productValidationData.x(instantTicketValidationAnalyticManager$addProperties$1);
            if (objX == obj2) {
                return obj2;
            }
            map = linkedHashMap;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) instantTicketValidationAnalyticManager$addProperties$1.L$2;
            Map map3 = (Map) instantTicketValidationAnalyticManager$addProperties$1.L$1;
            Map map4 = (Map) instantTicketValidationAnalyticManager$addProperties$1.L$0;
            ResultKt.b(obj);
            str = str2;
            map2 = map3;
            objX = obj;
            map = map4;
        }
        map2.put(str, objX);
        map.put("isInstantTicket", Boolean.TRUE);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(TITOTapInNotificationEvent tITOTapInNotificationEvent, ProductValidationData productValidationData, String str, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Continuation continuation) {
        InstantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        Map map2;
        String str2;
        Map map3;
        if (continuation instanceof InstantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) {
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = (InstantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) continuation;
            int i = instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new InstantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new InstantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapB = tITOTapInNotificationEvent.b(MapsKt.d(), this.b.j());
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()));
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0 = linkedHashMapB;
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1 = linkedHashMapK;
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2 = linkedHashMapK;
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3 = this;
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4 = "tito tapIn notif recv on conductor flow";
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5 = str;
            instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapB;
            map2 = linkedHashMapK;
            str2 = "tito tapIn notif recv on conductor flow";
            map3 = linkedHashMapK;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5;
            String str3 = (String) instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3;
            Map map4 = (Map) instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2;
            Map map5 = (Map) instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1;
            map = (Map) instantTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
            analyticsContract = analyticsContract2;
            map2 = map5;
            map3 = map4;
        }
        String str4 = str;
        map3.putAll(map);
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str4, map2, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void a(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f3976a.a(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        this.f3976a.b();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void c(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation open qr btn clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f3976a.d(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        this.f3976a.e(name, source, map, frequency, z);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void f(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "simple qr validation zoom qr clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        this.f3976a.g(d, d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object h(ProductValidationData productValidationData, Continuation continuation) {
        InstantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof InstantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) {
            instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = (InstantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) continuation;
            int i = instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = new InstantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = new InstantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(obj);
            instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$0 = linkedHashMapO;
            instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$1 = this;
            instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$2 = "view trip receipt from menu clicked";
            instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$3 = "validationScreen";
            instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label = 1;
            if (J(linkedHashMapO, productValidationData, instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapO;
            str = "view trip receipt from menu clicked";
            str2 = "validationScreen";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$3;
            String str4 = (String) instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$1;
            Map map2 = (Map) instantTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
            map = map2;
            str = str4;
            analyticsContract = analyticsContract2;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, map, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void i(boolean z, Product product, String source) {
        Intrinsics.i(source, "source");
        if (z) {
            K(this, "BLE permission granted", product, source, null, 24);
        } else {
            K(this, "BLE permission denied", product, source, null, 24);
        }
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void j(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "qr screen open", product, source, null, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void k(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation permission rationale screen opened", product, source, null, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object l(String str, ProductValidationData productValidationData, String str2, Map map, AnalyticsFrequency analyticsFrequency, Continuation continuation) {
        InstantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1;
        String str3;
        Map map2;
        if (continuation instanceof InstantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) {
            instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = (InstantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) continuation;
            int i = instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = new InstantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1(this, continuation);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = new InstantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1(this, continuation);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$0 = str;
            instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$1 = str2;
            instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$2 = analyticsFrequency;
            instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$3 = linkedHashMap;
            instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label = 1;
            if (J(linkedHashMap, productValidationData, instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) == obj2) {
                return obj2;
            }
            str3 = str;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map3 = (Map) instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$3;
            analyticsFrequency = (AnalyticsFrequency) instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$2;
            str2 = (String) instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$1;
            String str4 = (String) instantTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$0;
            ResultKt.b(obj);
            map2 = map3;
            str3 = str4;
        }
        AnalyticsContract.DefaultImpls.a(this, str3, str2, map2, analyticsFrequency, false, 16);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object m(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        InstantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof InstantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) {
            instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = (InstantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) continuation;
            int i = instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = new InstantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = new InstantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$0 = linkedHashMapK;
            instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$1 = this;
            instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$2 = "view receipt post validation clicked";
            instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$3 = source;
            instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label = 1;
            if (J(linkedHashMapK, productValidationData, instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$3;
            String str2 = (String) instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$1;
            Map map2 = (Map) instantTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$0;
            ResultKt.b(obj);
            str = str2;
            analyticsContract = analyticsContract2;
            map = map2;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, map, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object n(ProductValidationData productValidationData, String str, Source source, ContinuationImpl continuationImpl) {
        InstantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuationImpl instanceof InstantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) {
            instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = (InstantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) continuationImpl;
            int i = instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = new InstantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
            }
        } else {
            instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = new InstantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
        }
        Object obj = instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("reason", str));
            instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$0 = linkedHashMapK;
            instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$1 = this;
            instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$2 = "syncing post ble validation failed";
            instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$3 = source;
            instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str2 = "syncing post ble validation failed";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$3;
            String str3 = (String) instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$1;
            Map map2 = (Map) instantTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
            analyticsContract = analyticsContract2;
            map = map2;
        }
        AnalyticsContractImplKt.b(analyticsContract, str2, source, map, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void o(String str) {
        this.f3976a.o(str);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void p(Source source, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct) {
        Intrinsics.i(validationProduct, "validationProduct");
        Intrinsics.i(validationProcessFlowDetails, "validationProcessFlowDetails");
        Intrinsics.i(source, "source");
        K(this, "ble screen open", ProductKt.a(validationProduct), source.getSourceName(), vo1.s("validationFlowType", ProductValidationAnalyticManager.DefaultImpls.c(validationProcessFlowDetails)), 8);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void q() {
        this.f3976a.q();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void r(ProductReceiptData productReceiptData, String source) {
        Intrinsics.i(source, "source");
        L(this, "instant ticket trip punched", productReceiptData, source);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void s(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation switch to qr got it clicked", product, source, null, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void t(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation permission settings screen opened", product, source, null, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object u(ProductReceiptData productReceiptData, String str, Continuation continuation) {
        L(this, "instant ticket view receipt clicked", productReceiptData, str);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void v(String username) {
        Intrinsics.i(username, "username");
        this.f3976a.v(username);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object w(ProductValidationData productValidationData, String str, Continuation continuation) {
        Object objA = ProductValidationAnalyticManager.DefaultImpls.a(this, "instant ticket fetched", productValidationData, str, null, continuation, 24);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void x(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "ble bottom sheet clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        this.f3976a.y();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void z(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE denial qr option shown", product, source, null, 24);
    }
}
