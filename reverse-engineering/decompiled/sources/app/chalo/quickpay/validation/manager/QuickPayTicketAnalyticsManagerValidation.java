package app.chalo.quickpay.validation.manager;

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
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/quickpay/validation/manager/QuickPayTicketAnalyticsManagerValidation;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayTicketAnalyticsManagerValidation implements ProductValidationAnalyticManager, AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalyticsContract f8910a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;

    public QuickPayTicketAnalyticsManagerValidation(AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f8910a = analyticsContract;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
    }

    public static void K(QuickPayTicketAnalyticsManagerValidation quickPayTicketAnalyticsManagerValidation, String str, Product product, String str2, Map map, int i) {
        if ((i & 16) != 0) {
            map = null;
        }
        quickPayTicketAnalyticsManagerValidation.getClass();
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isChaloPay", Boolean.TRUE), new Pair(PaymentConstants.ORDER_ID_CAMEL, product.f10666a), new Pair("productType", product.b), new Pair("productSubType", product.c));
        if (map != null) {
            linkedHashMapK.putAll(map);
        }
        AnalyticsContract.DefaultImpls.a(quickPayTicketAnalyticsManagerValidation, str, str2, linkedHashMapK, AnalyticsFrequency.Always.b, false, 16);
    }

    public static LinkedHashMap M(ProductReceiptData productReceiptData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isChaloPay", Boolean.TRUE);
        linkedHashMap.put("productId", productReceiptData.getF10462a());
        linkedHashMap.put("punchTime", Long.valueOf(productReceiptData.getC()));
        Object amount = productReceiptData.getAmount();
        if (amount == null) {
            amount = "";
        }
        linkedHashMap.put("chalo pay trip amount", amount);
        linkedHashMap.put("vehicleNo", productReceiptData.getE());
        linkedHashMap.put("route name", productReceiptData.getI());
        linkedHashMap.put("startStop", productReceiptData.getG());
        linkedHashMap.put("endStop", productReceiptData.getH());
        linkedHashMap.put("conductorId", productReceiptData.getF());
        linkedHashMap.put("endStopId", productReceiptData.getM());
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation) {
        QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1 quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1;
        Map mapK;
        String str;
        AnalyticsContract analyticsContract;
        if (continuation instanceof QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1) {
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1 = (QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1) continuation;
            int i = quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            mapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()), new Pair("validationAckDataType", ProductValidationAnalyticManager.DefaultImpls.b(bleValidationAckData)));
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.L$0 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.L$1 = this;
            str = "ble validation ack data consumed";
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.L$2 = "ble validation ack data consumed";
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.L$3 = source;
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.label = 1;
            if (J(mapK, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.L$3;
            str = (String) quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.L$1;
            mapK = (Map) quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckConsumedEvent$1.L$0;
            ResultKt.b(obj);
            analyticsContract = analyticsContract2;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, mapK, false, 24);
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
        AppNotification.PunchNotification.QuickPayNotificationEvent quickPayNotificationEvent = punch instanceof AppNotification.PunchNotification.QuickPayNotificationEvent ? (AppNotification.PunchNotification.QuickPayNotificationEvent) punch : null;
        if (quickPayNotificationEvent == null || (str = quickPayNotificationEvent.f) == null || !str.equals("quickpay") || (str2 = quickPayNotificationEvent.c) == null) {
            return;
        }
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("productId", str2);
        String str3 = quickPayNotificationEvent.e;
        if (str3 != null) {
            mapBuilder.put("productType", str3);
        }
        mapBuilder.put("productSubType", str);
        mapBuilder.put("isTripReceiptAvailable", Boolean.FALSE);
        AnalyticsContract.DefaultImpls.a(this, "quickpay non receipt punch received", source, mapBuilder.h(), null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl) {
        QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1 quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        Source source2;
        if (continuationImpl instanceof QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1) {
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1 = (QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1) continuationImpl;
            int i = quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
        }
        QuickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1 quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2 = quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$1;
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.label;
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
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.label = 1;
                if (L(tITOTapInNotificationEventA, productValidationData, sourceName, validationNotificationDeliveryMedium, quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
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
                Map mapK = MapsKt.k(new Pair("reason", invalidData.b), new Pair(Constants.MessagePayloadKeys.RAW_DATA, invalidData.f10498a), new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()));
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.L$0 = mapK;
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.L$1 = this;
                str = "invalid ble validation ack data received";
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.L$2 = "invalid ble validation ack data received";
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.L$3 = source;
                quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.label = 2;
                if (J(mapK, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
                    analyticsContract = this;
                    map = mapK;
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
        Source source3 = (Source) quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.L$3;
        str = (String) quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.L$2;
        AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.L$1;
        Map map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseBleValidationAckDataReceivedEvent$2.L$0;
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
        this.f8910a.F(name, source, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object G(ProductValidationData productValidationData, Continuation continuation) {
        QuickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1 quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof QuickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1) {
            quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1 = (QuickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1) continuation;
            int i = quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map mapK = MapsKt.k(new Pair("type", "activationScreenTicketingProblemsV2"), new Pair("problemSource", "validationScreen"));
            quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.L$0 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.L$1 = this;
            quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.L$2 = "report problem clicked v2";
            quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.L$3 = "validationScreen";
            quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.label = 1;
            if (J(mapK, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = mapK;
            str = "report problem clicked v2";
            str2 = "validationScreen";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.L$3;
            String str4 = (String) quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.L$1;
            Map map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseReportHookClickedEvent$1.L$0;
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
        QuickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1 quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof QuickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1) {
            quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1 = (QuickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1) continuation;
            int i = quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map mapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.L$0 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.L$1 = this;
            quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.L$2 = "view receipt post validation clicked";
            quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.L$3 = source;
            quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.label = 1;
            if (J(mapK, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = mapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.L$3;
            String str2 = (String) quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.L$1;
            Map map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseExitPostValidationButtonClickedEvent$1.L$0;
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
        QuickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1 quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuation instanceof QuickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1) {
            quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1 = (QuickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1) continuation;
            int i = quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map mapK = MapsKt.k(new Pair("isChaloPay", Boolean.TRUE), new Pair("isBlePermissionGranted", Boolean.valueOf(z)));
            quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.L$0 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.L$1 = this;
            quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.L$2 = "BLE permission check on validation initialization";
            quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.L$3 = str;
            quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.label = 1;
            if (J(mapK, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = mapK;
            str2 = "BLE permission check on validation initialization";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.L$3;
            String str3 = (String) quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.L$1;
            Map map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseBlePermissionCheckOnInitializationEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
            analyticsContract = analyticsContract2;
            map = map2;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str, map, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(Map map, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        QuickPayTicketAnalyticsManagerValidation$addProperties$1 quickPayTicketAnalyticsManagerValidation$addProperties$1;
        String str;
        Object objC;
        Map map2;
        ProductValidationData productValidationData2;
        TimeUtilsContract timeUtilsContract;
        String str2;
        ProductValidationData productValidationData3;
        Map map3;
        Map map4;
        String str3;
        Map map5;
        Map map6;
        if (continuationImpl instanceof QuickPayTicketAnalyticsManagerValidation$addProperties$1) {
            quickPayTicketAnalyticsManagerValidation$addProperties$1 = (QuickPayTicketAnalyticsManagerValidation$addProperties$1) continuationImpl;
            int i = quickPayTicketAnalyticsManagerValidation$addProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$addProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$addProperties$1 = new QuickPayTicketAnalyticsManagerValidation$addProperties$1(this, continuationImpl);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$addProperties$1 = new QuickPayTicketAnalyticsManagerValidation$addProperties$1(this, continuationImpl);
        }
        Object objC2 = quickPayTicketAnalyticsManagerValidation$addProperties$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$addProperties$1.label;
        BasicInfoContract basicInfoContract = this.b;
        TimeUtilsContract timeUtilsContract2 = this.c;
        if (i2 == 0) {
            ResultKt.b(objC2);
            map.put("fullName", productValidationData.y().getC());
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$0 = map;
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$1 = productValidationData;
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$2 = map;
            str = "time";
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$3 = "time";
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$4 = timeUtilsContract2;
            quickPayTicketAnalyticsManagerValidation$addProperties$1.label = 1;
            objC = basicInfoContract.c(quickPayTicketAnalyticsManagerValidation$addProperties$1);
            if (objC != coroutineSingletons) {
                map2 = map;
                productValidationData2 = productValidationData;
                timeUtilsContract = timeUtilsContract2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            TimeUtilsContract timeUtilsContract3 = (TimeUtilsContract) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$4;
            String str4 = (String) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$3;
            Map map7 = (Map) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$2;
            productValidationData2 = (ProductValidationData) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$1;
            map2 = (Map) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$0;
            ResultKt.b(objC2);
            timeUtilsContract = timeUtilsContract3;
            map = map7;
            objC = objC2;
            str = str4;
        } else {
            if (i2 == 2) {
                timeUtilsContract2 = (TimeUtilsContract) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$4;
                str2 = (String) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$3;
                map3 = (Map) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$2;
                productValidationData3 = (ProductValidationData) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$1;
                map4 = (Map) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$0;
                ResultKt.b(objC2);
                map3.put(str2, timeUtilsContract2.Q(((Number) objC2).longValue()));
                map4.put("productType", "quickpay");
                map4.put(PaymentConstants.ORDER_ID_CAMEL, productValidationData3.getId());
                quickPayTicketAnalyticsManagerValidation$addProperties$1.L$0 = map4;
                quickPayTicketAnalyticsManagerValidation$addProperties$1.L$1 = map4;
                str3 = "activationTime";
                quickPayTicketAnalyticsManagerValidation$addProperties$1.L$2 = "activationTime";
                quickPayTicketAnalyticsManagerValidation$addProperties$1.L$3 = null;
                quickPayTicketAnalyticsManagerValidation$addProperties$1.L$4 = null;
                quickPayTicketAnalyticsManagerValidation$addProperties$1.label = 3;
                objC2 = productValidationData3.x(quickPayTicketAnalyticsManagerValidation$addProperties$1);
                if (objC2 != coroutineSingletons) {
                    map5 = map4;
                    map6 = map5;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$2;
            map5 = (Map) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$1;
            map6 = (Map) quickPayTicketAnalyticsManagerValidation$addProperties$1.L$0;
            ResultKt.b(objC2);
        }
        map5.put(str3, objC2);
        map6.put("isChaloPay", Boolean.TRUE);
        return Unit.f17538a;
        map.put(str, timeUtilsContract.e(((Number) objC).longValue()));
        quickPayTicketAnalyticsManagerValidation$addProperties$1.L$0 = map2;
        quickPayTicketAnalyticsManagerValidation$addProperties$1.L$1 = productValidationData2;
        quickPayTicketAnalyticsManagerValidation$addProperties$1.L$2 = map2;
        str2 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        quickPayTicketAnalyticsManagerValidation$addProperties$1.L$3 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        quickPayTicketAnalyticsManagerValidation$addProperties$1.L$4 = timeUtilsContract2;
        quickPayTicketAnalyticsManagerValidation$addProperties$1.label = 2;
        objC2 = basicInfoContract.c(quickPayTicketAnalyticsManagerValidation$addProperties$1);
        if (objC2 != coroutineSingletons) {
            productValidationData3 = productValidationData2;
            map3 = map2;
            map4 = map3;
            map3.put(str2, timeUtilsContract2.Q(((Number) objC2).longValue()));
            map4.put("productType", "quickpay");
            map4.put(PaymentConstants.ORDER_ID_CAMEL, productValidationData3.getId());
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$0 = map4;
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$1 = map4;
            str3 = "activationTime";
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$2 = "activationTime";
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$3 = null;
            quickPayTicketAnalyticsManagerValidation$addProperties$1.L$4 = null;
            quickPayTicketAnalyticsManagerValidation$addProperties$1.label = 3;
            objC2 = productValidationData3.x(quickPayTicketAnalyticsManagerValidation$addProperties$1);
            if (objC2 != coroutineSingletons) {
                map5 = map4;
                map6 = map5;
                map5.put(str3, objC2);
                map6.put("isChaloPay", Boolean.TRUE);
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [app.chalo.analytics.contract.AnalyticsContract] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r21v0, types: [app.chalo.quickpay.validation.manager.QuickPayTicketAnalyticsManagerValidation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final Object L(TITOTapInNotificationEvent tITOTapInNotificationEvent, ProductValidationData productValidationData, String str, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Continuation continuation) {
        QuickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1;
        Map mapK;
        Map mapD;
        TITOTapInNotificationEvent tITOTapInNotificationEvent2;
        String str2;
        ProductValidationData productValidationData2;
        String str3;
        Map map;
        Map map2;
        ?? r7;
        String str4;
        ?? r13;
        String str5;
        Map map3;
        if (continuation instanceof QuickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) {
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = (QuickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) continuation;
            int i = quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            mapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()));
            mapD = MapsKt.d();
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0 = productValidationData;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3 = mapD;
            tITOTapInNotificationEvent2 = tITOTapInNotificationEvent;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4 = tITOTapInNotificationEvent2;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$6 = this;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$7 = "tito tapIn notif recv on conductor flow";
            str2 = str;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$8 = str2;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = 1;
            Object objC = this.b.c(quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1);
            if (objC != coroutineSingletons) {
                productValidationData2 = productValidationData;
                obj = objC;
                str3 = "tito tapIn notif recv on conductor flow";
                map = mapK;
                map2 = map;
                r7 = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str6 = (String) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$8;
            str3 = (String) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$7;
            AnalyticsContract analyticsContract = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$6;
            mapK = (Map) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5;
            TITOTapInNotificationEvent tITOTapInNotificationEvent3 = (TITOTapInNotificationEvent) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4;
            mapD = (Map) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3;
            map = (Map) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2;
            map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1;
            productValidationData2 = (ProductValidationData) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str6;
            tITOTapInNotificationEvent2 = tITOTapInNotificationEvent3;
            r7 = analyticsContract;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str7 = (String) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3;
            String str8 = (String) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1;
            Map map4 = (Map) quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0;
            ResultKt.b(obj);
            map3 = map4;
            str5 = str7;
            str4 = str8;
            r13 = analyticsContract2;
        }
        AnalyticsContract.DefaultImpls.a(r13, str4, str5, map3, null, false, 24);
        return Unit.f17538a;
        mapK.putAll(tITOTapInNotificationEvent2.b(mapD, ((Number) obj).longValue()));
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0 = map2;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1 = r7;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2 = str3;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3 = str2;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4 = null;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5 = null;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$6 = null;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$7 = null;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$8 = null;
        quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = 2;
        if (J(map, productValidationData2, quickPayTicketAnalyticsManagerValidation$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) != coroutineSingletons) {
            str4 = str3;
            r13 = r7;
            str5 = str2;
            map3 = map2;
            AnalyticsContract.DefaultImpls.a(r13, str4, str5, map3, null, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void a(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f8910a.a(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        this.f8910a.b();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void c(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation open qr btn clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f8910a.d(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        this.f8910a.e(name, source, map, frequency, z);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void f(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "simple qr validation zoom qr clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        this.f8910a.g(d, d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object h(ProductValidationData productValidationData, Continuation continuation) {
        QuickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1 quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof QuickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1) {
            quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1 = (QuickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1) continuation;
            int i = quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.label;
        if (i2 == 0) {
            Map mapO = d.o(obj);
            quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.L$0 = mapO;
            quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.L$1 = this;
            quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.L$2 = "view trip receipt from menu clicked";
            quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.L$3 = "validationScreen";
            quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.label = 1;
            if (J(mapO, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = mapO;
            str = "view trip receipt from menu clicked";
            str2 = "validationScreen";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.L$3;
            String str4 = (String) quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.L$1;
            Map map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseViewTripReceiptMenuClickedEvent$1.L$0;
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
        QuickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1 quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1;
        AnalyticsContract analyticsContract;
        Map map2;
        if (continuation instanceof QuickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1) {
            quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1 = (QuickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1) continuation;
            int i = quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1 = new QuickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1(this, continuation);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1 = new QuickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1(this, continuation);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$0 = analyticsFrequency;
            quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$1 = linkedHashMap;
            quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$2 = this;
            quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$3 = str;
            quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$4 = str2;
            quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.label = 1;
            if (J(linkedHashMap, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$4;
            str = (String) quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$3;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$2;
            Map map3 = (Map) quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$1;
            analyticsFrequency = (AnalyticsFrequency) quickPayTicketAnalyticsManagerValidation$raiseAnalyticsEventWithProductData$1.L$0;
            ResultKt.b(obj);
            analyticsContract = analyticsContract2;
            map2 = map3;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, map2, analyticsFrequency, false, 16);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object m(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        QuickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2 quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof QuickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2) {
            quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2 = (QuickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2) continuation;
            int i = quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2 = new QuickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2 = new QuickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map mapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.L$0 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.L$1 = this;
            quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.L$2 = "view receipt post validation clicked";
            quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.L$3 = source;
            quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.label = 1;
            if (J(mapK, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = mapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.L$3;
            String str2 = (String) quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.L$1;
            Map map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseViewReceiptClickedEvent$2.L$0;
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
        QuickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1 quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuationImpl instanceof QuickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1) {
            quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1 = (QuickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1) continuationImpl;
            int i = quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
            }
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1 = new QuickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
        }
        Object obj = quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map mapK = MapsKt.k(new Pair("failureReason", str));
            quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.L$0 = mapK;
            quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.L$1 = this;
            quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.L$2 = "syncing post ble validation failed";
            quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.L$3 = source;
            quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.label = 1;
            if (J(mapK, productValidationData, quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = mapK;
            str2 = "syncing post ble validation failed";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.L$3;
            String str3 = (String) quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.L$1;
            Map map2 = (Map) quickPayTicketAnalyticsManagerValidation$raiseSyncingPostBleValidationFailedEvent$1.L$0;
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
        this.f8910a.o(str);
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
        this.f8910a.q();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void r(ProductReceiptData productReceiptData, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "chalo pay ticket punched", source, M(productReceiptData), null, false, 24);
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
        AnalyticsContract.DefaultImpls.a(this, "chalo pay view receipt clicked", str, M(productReceiptData), null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void v(String username) {
        Intrinsics.i(username, "username");
        this.f8910a.v(username);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object w(ProductValidationData productValidationData, String str, Continuation continuation) {
        Object objA = ProductValidationAnalyticManager.DefaultImpls.a(this, "chalo pay order fetched", productValidationData, str, null, continuation, 24);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void x(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "ble bottom sheet clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        this.f8910a.y();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void z(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE denial qr option shown", product, source, null, 24);
    }
}
