package app.chalo.ondc.validation;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ondc/validation/OndcTicketValidationAnalyticManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketValidationAnalyticManager implements ProductValidationAnalyticManager, AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f6803a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;

    public OndcTicketValidationAnalyticManager(AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f6803a = analyticsContract;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
    }

    public static void K(OndcTicketValidationAnalyticManager ondcTicketValidationAnalyticManager, String str, Product product, String str2, Map map, int i) {
        if ((i & 16) != 0) {
            map = null;
        }
        ondcTicketValidationAnalyticManager.getClass();
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isOndcTicketOrder", Boolean.TRUE), new Pair(PaymentConstants.ORDER_ID_CAMEL, product.f10666a), new Pair("productType", product.b), new Pair("productSubType", product.c));
        if (map != null) {
            linkedHashMapK.putAll(map);
        }
        AnalyticsContract.DefaultImpls.a(ondcTicketValidationAnalyticManager, str, str2, linkedHashMapK, AnalyticsFrequency.Always.b, false, 16);
    }

    public static void L(OndcTicketValidationAnalyticManager ondcTicketValidationAnalyticManager, String str, ProductReceiptData productReceiptData, String str2) {
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
        AnalyticsContract.DefaultImpls.a(ondcTicketValidationAnalyticManager, str, str2, linkedHashMap, AnalyticsFrequency.Always.b, false, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation) {
        OndcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        if (continuation instanceof OndcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) {
            ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = (OndcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) continuation;
            int i = ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = new OndcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = new OndcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()), new Pair("validationAckDataType", ProductValidationAnalyticManager.DefaultImpls.b(bleValidationAckData)));
            ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$0 = linkedHashMapK;
            ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$1 = this;
            str = "ble validation ack data consumed";
            ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$2 = "ble validation ack data consumed";
            ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$3 = source;
            ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$3;
            str = (String) ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$1;
            Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$0;
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
        AppNotification.PunchNotification.OndcTicketPunchEvent ondcTicketPunchEvent = punch instanceof AppNotification.PunchNotification.OndcTicketPunchEvent ? (AppNotification.PunchNotification.OndcTicketPunchEvent) punch : null;
        if (ondcTicketPunchEvent == null) {
            return;
        }
        String str = ondcTicketPunchEvent.e;
        if (str.equals("ondcTicket")) {
            AnalyticsContract.DefaultImpls.a(this, "ondc ticket non receipt punch received", source, MapsKt.i(new Pair("productId", ondcTicketPunchEvent.c), new Pair("productType", ondcTicketPunchEvent.d), new Pair("productSubType", str), new Pair("punchTime", Long.valueOf(ondcTicketPunchEvent.f)), new Pair("isTripReceiptAvailable", Boolean.FALSE)), null, false, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl) {
        OndcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        Source source2;
        if (continuationImpl instanceof OndcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1) {
            ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = (OndcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1) continuationImpl;
            int i = ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = new OndcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = new OndcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
        }
        OndcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2 = ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1;
        Object obj = ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label;
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
                ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label = 1;
                if (M(tITOTapInNotificationEventA, productValidationData, sourceName, validationNotificationDeliveryMedium, ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
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
                ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$0 = linkedHashMapK;
                ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$1 = this;
                str = "invalid ble validation ack data received";
                ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$2 = "invalid ble validation ack data received";
                ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$3 = source;
                ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label = 2;
                if (J(linkedHashMapK, productValidationData, ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
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
        Source source3 = (Source) ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$3;
        str = (String) ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$2;
        AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$1;
        Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$0;
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
        this.f6803a.F(name, source, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object G(ProductValidationData productValidationData, Continuation continuation) {
        OndcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof OndcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) {
            ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = (OndcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) continuation;
            int i = ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = new OndcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = new OndcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("type", "activationScreenTicketingProblemsV2"), new Pair("problemSource", "validationScreen"));
            ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$0 = linkedHashMapK;
            ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$1 = this;
            ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$2 = "report problem clicked v2";
            ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$3 = "";
            ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) == obj2) {
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
            String str3 = (String) ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$3;
            String str4 = (String) ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$1;
            Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$0;
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
        OndcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof OndcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) {
            ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = (OndcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) continuation;
            int i = ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = new OndcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = new OndcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$0 = linkedHashMapK;
            ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$1 = this;
            ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$2 = "view receipt post validation clicked";
            ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$3 = source;
            ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$3;
            String str2 = (String) ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$1;
            Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$0;
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
        OndcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuation instanceof OndcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) {
            ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = (OndcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) continuation;
            int i = ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = new OndcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = new OndcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isOndcTicketOrder", Boolean.TRUE), new Pair("isBlePermissionGranted", Boolean.valueOf(z)));
            ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$0 = linkedHashMapK;
            ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$1 = this;
            ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$2 = "BLE permission check on validation initialization";
            ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$3 = str;
            ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str2 = "BLE permission check on validation initialization";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$3;
            String str3 = (String) ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$1;
            Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$0;
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
        OndcTicketValidationAnalyticManager$addProperties$1 ondcTicketValidationAnalyticManager$addProperties$1;
        String str;
        Object objX;
        Map map;
        Map map2;
        if (continuationImpl instanceof OndcTicketValidationAnalyticManager$addProperties$1) {
            ondcTicketValidationAnalyticManager$addProperties$1 = (OndcTicketValidationAnalyticManager$addProperties$1) continuationImpl;
            int i = ondcTicketValidationAnalyticManager$addProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$addProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$addProperties$1 = new OndcTicketValidationAnalyticManager$addProperties$1(this, continuationImpl);
            }
        } else {
            ondcTicketValidationAnalyticManager$addProperties$1 = new OndcTicketValidationAnalyticManager$addProperties$1(this, continuationImpl);
        }
        Object obj = ondcTicketValidationAnalyticManager$addProperties$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$addProperties$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            linkedHashMap.put("fullName", productValidationData.y().getC());
            BasicInfoContract basicInfoContract = this.b;
            long j = basicInfoContract.j();
            TimeUtilsContract timeUtilsContract = this.c;
            linkedHashMap.put("time", timeUtilsContract.e(j));
            linkedHashMap.put(CLConstants.SHARED_PREFERENCE_ITEM_DATE, timeUtilsContract.Q(basicInfoContract.j()));
            linkedHashMap.put("productType", "mobileTicket");
            linkedHashMap.put("productSubType", "ondcTicket");
            linkedHashMap.put(PaymentConstants.ORDER_ID_CAMEL, productValidationData.getId());
            ondcTicketValidationAnalyticManager$addProperties$1.L$0 = linkedHashMap;
            ondcTicketValidationAnalyticManager$addProperties$1.L$1 = linkedHashMap;
            str = "activationTime";
            ondcTicketValidationAnalyticManager$addProperties$1.L$2 = "activationTime";
            ondcTicketValidationAnalyticManager$addProperties$1.label = 1;
            objX = productValidationData.x(ondcTicketValidationAnalyticManager$addProperties$1);
            if (objX == obj2) {
                return obj2;
            }
            map = linkedHashMap;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) ondcTicketValidationAnalyticManager$addProperties$1.L$2;
            Map map3 = (Map) ondcTicketValidationAnalyticManager$addProperties$1.L$1;
            Map map4 = (Map) ondcTicketValidationAnalyticManager$addProperties$1.L$0;
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
        OndcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        Map map2;
        String str2;
        Map map3;
        if (continuation instanceof OndcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) {
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = (OndcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) continuation;
            int i = ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new OndcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new OndcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapB = tITOTapInNotificationEvent.b(MapsKt.d(), this.b.j());
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()));
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0 = linkedHashMapB;
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1 = linkedHashMapK;
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2 = linkedHashMapK;
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3 = this;
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4 = "tito tapIn notif recv on conductor flow";
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5 = str;
            ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) == obj2) {
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
            str = (String) ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5;
            String str3 = (String) ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3;
            Map map4 = (Map) ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2;
            Map map5 = (Map) ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1;
            map = (Map) ondcTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0;
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
        this.f6803a.a(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        this.f6803a.b();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void c(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation open qr btn clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f6803a.d(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        this.f6803a.e(name, source, map, frequency, z);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void f(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "simple qr validation zoom qr clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        this.f6803a.g(d, d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object h(ProductValidationData productValidationData, Continuation continuation) {
        OndcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof OndcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) {
            ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = (OndcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) continuation;
            int i = ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = new OndcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = new OndcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(obj);
            ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$0 = linkedHashMapO;
            ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$1 = this;
            ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$2 = "view trip receipt from menu clicked";
            ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$3 = "validationScreen";
            ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label = 1;
            if (J(linkedHashMapO, productValidationData, ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) == obj2) {
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
            String str3 = (String) ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$3;
            String str4 = (String) ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$1;
            Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$0;
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
        OndcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1;
        String str3;
        Map map2;
        if (continuation instanceof OndcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) {
            ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = (OndcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) continuation;
            int i = ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = new OndcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1(this, continuation);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = new OndcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1(this, continuation);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$0 = str;
            ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$1 = str2;
            ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$2 = analyticsFrequency;
            ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$3 = linkedHashMap;
            ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label = 1;
            if (J(linkedHashMap, productValidationData, ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) == obj2) {
                return obj2;
            }
            str3 = str;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map3 = (Map) ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$3;
            analyticsFrequency = (AnalyticsFrequency) ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$2;
            str2 = (String) ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$1;
            String str4 = (String) ondcTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$0;
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
        OndcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof OndcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) {
            ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = (OndcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) continuation;
            int i = ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = new OndcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = new OndcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$0 = linkedHashMapK;
            ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$1 = this;
            ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$2 = "view receipt post validation clicked";
            ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$3 = source;
            ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$3;
            String str2 = (String) ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$1;
            Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$0;
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
        OndcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuationImpl instanceof OndcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) {
            ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = (OndcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) continuationImpl;
            int i = ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = new OndcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
            }
        } else {
            ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = new OndcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
        }
        Object obj = ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("reason", str));
            ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$0 = linkedHashMapK;
            ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$1 = this;
            ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$2 = "syncing post ble validation failed";
            ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$3 = source;
            ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str2 = "syncing post ble validation failed";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$3;
            String str3 = (String) ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$1;
            Map map2 = (Map) ondcTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$0;
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
        this.f6803a.o(str);
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
        this.f6803a.q();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void r(ProductReceiptData productReceiptData, String source) {
        Intrinsics.i(source, "source");
        L(this, "ondc ticket trip punched", productReceiptData, source);
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
        this.f6803a.v(username);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object w(ProductValidationData productValidationData, String str, Continuation continuation) {
        Object objA = ProductValidationAnalyticManager.DefaultImpls.a(this, "ondc ticket fetched", productValidationData, str, null, continuation, 24);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void x(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "ble bottom sheet clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        this.f6803a.y();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void z(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE denial qr option shown", product, source, null, 24);
    }
}
