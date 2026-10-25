package app.chalo.ondc.validation.metro;

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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketValidationAnalyticManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketValidationAnalyticManager implements ProductValidationAnalyticManager, AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f6813a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;

    public OndcMetroTicketValidationAnalyticManager(AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f6813a = analyticsContract;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
    }

    public static void K(OndcMetroTicketValidationAnalyticManager ondcMetroTicketValidationAnalyticManager, String str, Product product, String str2, Map map, int i) {
        if ((i & 16) != 0) {
            map = null;
        }
        ondcMetroTicketValidationAnalyticManager.getClass();
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isOndcTicketOrder", Boolean.TRUE), new Pair(PaymentConstants.ORDER_ID_CAMEL, product.f10666a), new Pair("productType", product.b), new Pair("productSubType", product.c));
        if (map != null) {
            linkedHashMapK.putAll(map);
        }
        AnalyticsContract.DefaultImpls.a(ondcMetroTicketValidationAnalyticManager, str, str2, linkedHashMapK, AnalyticsFrequency.Always.b, false, 16);
    }

    public static void L(OndcMetroTicketValidationAnalyticManager ondcMetroTicketValidationAnalyticManager, String str, ProductReceiptData productReceiptData, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isOndcTicketOrder", Boolean.TRUE);
        linkedHashMap.put("productId", productReceiptData.getF5392a());
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
        AnalyticsContract.DefaultImpls.a(ondcMetroTicketValidationAnalyticManager, str, str2, linkedHashMap, AnalyticsFrequency.Always.b, false, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation) {
        OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        if (continuation instanceof OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) {
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = (OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) continuation;
            int i = ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()), new Pair("validationAckDataType", ProductValidationAnalyticManager.DefaultImpls.b(bleValidationAckData)));
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$0 = linkedHashMapK;
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$1 = this;
            str = "ble validation ack data consumed";
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$2 = "ble validation ack data consumed";
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$3 = source;
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$3;
            str = (String) ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$1;
            Map map2 = (Map) ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$0;
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
        Intrinsics.i(punch, "punch");
        Intrinsics.i(source, "source");
        AppNotification.PunchNotification.OndcMetroPunchEvent ondcMetroPunchEvent = punch instanceof AppNotification.PunchNotification.OndcMetroPunchEvent ? (AppNotification.PunchNotification.OndcMetroPunchEvent) punch : null;
        if (ondcMetroPunchEvent == null) {
            return;
        }
        String str = ondcMetroPunchEvent.e;
        if (str.equals("ondcMetroTicket")) {
            AnalyticsContract.DefaultImpls.a(this, "ondc metro non receipt punch received", source, MapsKt.i(new Pair("productId", ondcMetroPunchEvent.c), new Pair("productType", ondcMetroPunchEvent.d), new Pair("productSubType", str), new Pair("punchTime", Long.valueOf(ondcMetroPunchEvent.f)), new Pair("isTripReceiptAvailable", Boolean.FALSE)), null, false, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl) {
        OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        Source source2;
        if (continuationImpl instanceof OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1) {
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = (OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1) continuationImpl;
            int i = ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
        }
        OndcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2 = ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1;
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label;
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
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label = 1;
                if (M(tITOTapInNotificationEventA, productValidationData, sourceName, validationNotificationDeliveryMedium, ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
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
                LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("reason", invalidData.b), new Pair(Constants.MessagePayloadKeys.RAW_DATA, invalidData.f10498a));
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$0 = linkedHashMapK;
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$1 = this;
                str = "invalid ble validation ack data received";
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$2 = "invalid ble validation ack data received";
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$3 = source;
                ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label = 2;
                if (J(linkedHashMapK, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
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
        Source source3 = (Source) ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$3;
        str = (String) ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$2;
        AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$1;
        Map map2 = (Map) ondcMetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$0;
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
        this.f6813a.F(name, source, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object G(ProductValidationData productValidationData, Continuation continuation) {
        OndcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof OndcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) {
            ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = (OndcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) continuation;
            int i = ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("type", "activationScreenTicketingProblemsV2"), new Pair("problemSource", "validationScreen"));
            ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$0 = linkedHashMapK;
            ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$1 = this;
            ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$2 = "report problem clicked v2";
            ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$3 = "validationScreen";
            ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "report problem clicked v2";
            str2 = "validationScreen";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$3;
            String str4 = (String) ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$1;
            Map map2 = (Map) ondcMetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$0;
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
        OndcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof OndcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) {
            ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = (OndcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) continuation;
            int i = ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$0 = linkedHashMapK;
            ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$1 = this;
            ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$2 = "view receipt post validation clicked";
            ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$3 = source;
            ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$3;
            String str2 = (String) ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$1;
            Map map2 = (Map) ondcMetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$0;
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
        OndcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuation instanceof OndcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) {
            ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = (OndcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) continuation;
            int i = ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isOndcTicketOrder", Boolean.TRUE), new Pair("isBlePermissionGranted", Boolean.valueOf(z)));
            ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$0 = linkedHashMapK;
            ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$1 = this;
            ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$2 = "BLE permission check on validation initialization";
            ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$3 = str;
            ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str2 = "BLE permission check on validation initialization";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$3;
            String str3 = (String) ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$1;
            Map map2 = (Map) ondcMetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$0;
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
        OndcMetroTicketValidationAnalyticManager$addProperties$1 ondcMetroTicketValidationAnalyticManager$addProperties$1;
        String str;
        Object objX;
        Map map;
        Map map2;
        if (continuationImpl instanceof OndcMetroTicketValidationAnalyticManager$addProperties$1) {
            ondcMetroTicketValidationAnalyticManager$addProperties$1 = (OndcMetroTicketValidationAnalyticManager$addProperties$1) continuationImpl;
            int i = ondcMetroTicketValidationAnalyticManager$addProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$addProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$addProperties$1 = new OndcMetroTicketValidationAnalyticManager$addProperties$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$addProperties$1 = new OndcMetroTicketValidationAnalyticManager$addProperties$1(this, continuationImpl);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$addProperties$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$addProperties$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            linkedHashMap.put("fullName", productValidationData.y().getC());
            BasicInfoContract basicInfoContract = this.b;
            long j = basicInfoContract.j();
            TimeUtilsContract timeUtilsContract = this.c;
            linkedHashMap.put("time", timeUtilsContract.e(j));
            linkedHashMap.put(CLConstants.SHARED_PREFERENCE_ITEM_DATE, timeUtilsContract.Q(basicInfoContract.j()));
            linkedHashMap.put("productType", "mobileTicket");
            linkedHashMap.put("productSubType", "ondcMetroTicket");
            linkedHashMap.put(PaymentConstants.ORDER_ID_CAMEL, productValidationData.getId());
            ondcMetroTicketValidationAnalyticManager$addProperties$1.L$0 = linkedHashMap;
            ondcMetroTicketValidationAnalyticManager$addProperties$1.L$1 = linkedHashMap;
            str = "activationTime";
            ondcMetroTicketValidationAnalyticManager$addProperties$1.L$2 = "activationTime";
            ondcMetroTicketValidationAnalyticManager$addProperties$1.label = 1;
            objX = productValidationData.x(ondcMetroTicketValidationAnalyticManager$addProperties$1);
            if (objX == obj2) {
                return obj2;
            }
            map = linkedHashMap;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) ondcMetroTicketValidationAnalyticManager$addProperties$1.L$2;
            Map map3 = (Map) ondcMetroTicketValidationAnalyticManager$addProperties$1.L$1;
            Map map4 = (Map) ondcMetroTicketValidationAnalyticManager$addProperties$1.L$0;
            ResultKt.b(obj);
            str = str2;
            map2 = map3;
            objX = obj;
            map = map4;
        }
        map2.put(str, objX);
        map.put("isOndcTicketOrder", Boolean.TRUE);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(TITOTapInNotificationEvent tITOTapInNotificationEvent, ProductValidationData productValidationData, String str, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Continuation continuation) {
        OndcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        Map map2;
        String str2;
        Map map3;
        if (continuation instanceof OndcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) {
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = (OndcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) continuation;
            int i = ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapB = tITOTapInNotificationEvent.b(MapsKt.d(), this.b.j());
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()));
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0 = linkedHashMapB;
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1 = linkedHashMapK;
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2 = linkedHashMapK;
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3 = this;
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4 = "tito tapIn notif recv on conductor flow";
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5 = str;
            ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) == obj2) {
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
            str = (String) ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5;
            String str3 = (String) ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3;
            Map map4 = (Map) ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2;
            Map map5 = (Map) ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1;
            map = (Map) ondcMetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0;
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
        this.f6813a.a(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        this.f6813a.b();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void c(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation open qr btn clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f6813a.d(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        this.f6813a.e(name, source, map, frequency, z);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void f(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "simple qr validation zoom qr clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        this.f6813a.g(d, d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object h(ProductValidationData productValidationData, Continuation continuation) {
        OndcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof OndcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) {
            ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = (OndcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) continuation;
            int i = ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(obj);
            ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$0 = linkedHashMapO;
            ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$1 = this;
            ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$2 = "view trip receipt from menu clicked";
            ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$3 = "validationScreen";
            ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label = 1;
            if (J(linkedHashMapO, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) == obj2) {
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
            String str3 = (String) ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$3;
            String str4 = (String) ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$1;
            Map map2 = (Map) ondcMetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$0;
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
        OndcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1;
        String str3;
        Map map2;
        if (continuation instanceof OndcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) {
            ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = (OndcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) continuation;
            int i = ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = new OndcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1(this, continuation);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = new OndcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1(this, continuation);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$0 = str;
            ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$1 = str2;
            ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$2 = analyticsFrequency;
            ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$3 = linkedHashMap;
            ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label = 1;
            if (J(linkedHashMap, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) == obj2) {
                return obj2;
            }
            str3 = str;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map3 = (Map) ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$3;
            analyticsFrequency = (AnalyticsFrequency) ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$2;
            str2 = (String) ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$1;
            String str4 = (String) ondcMetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$0;
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
        OndcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof OndcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) {
            ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = (OndcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) continuation;
            int i = ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = new OndcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = new OndcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$0 = linkedHashMapK;
            ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$1 = this;
            ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$2 = "view receipt post validation clicked";
            ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$3 = source;
            ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$3;
            String str2 = (String) ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$1;
            Map map2 = (Map) ondcMetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$0;
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
        OndcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuationImpl instanceof OndcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) {
            ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = (OndcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) continuationImpl;
            int i = ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = new OndcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
        }
        Object obj = ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("reason", str));
            ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$0 = linkedHashMapK;
            ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$1 = this;
            ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$2 = "syncing post ble validation failed";
            ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$3 = source;
            ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str2 = "syncing post ble validation failed";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$3;
            String str3 = (String) ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$1;
            Map map2 = (Map) ondcMetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$0;
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
        this.f6813a.o(str);
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
        this.f6813a.q();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void r(ProductReceiptData productReceiptData, String source) {
        Intrinsics.i(source, "source");
        L(this, "ondc metro ticket trip punched", productReceiptData, source);
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
        L(this, "ondc ticket view receipt clicked", productReceiptData, str);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void v(String username) {
        Intrinsics.i(username, "username");
        this.f6813a.v(username);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object w(ProductValidationData productValidationData, String str, Continuation continuation) {
        Object objA = ProductValidationAnalyticManager.DefaultImpls.a(this, "ondc metro ticket fetched", productValidationData, str, null, continuation, 24);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void x(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "ble bottom sheet clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        this.f6813a.y();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void z(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE denial qr option shown", product, source, null, 24);
    }
}
