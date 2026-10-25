package app.chalo.metro.validation;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/metro/validation/MetroTicketValidationAnalyticManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketValidationAnalyticManager implements ProductValidationAnalyticManager, AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f5562a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;

    public MetroTicketValidationAnalyticManager(AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f5562a = analyticsContract;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
    }

    public static void K(MetroTicketValidationAnalyticManager metroTicketValidationAnalyticManager, String str, Product product, String str2, Map map, int i) {
        if ((i & 16) != 0) {
            map = null;
        }
        metroTicketValidationAnalyticManager.getClass();
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair(PaymentConstants.ORDER_ID_CAMEL, product.f10666a), new Pair("productType", product.b), new Pair("productSubType", product.c));
        if (map != null) {
            linkedHashMapK.putAll(map);
        }
        AnalyticsContract.DefaultImpls.a(metroTicketValidationAnalyticManager, str, str2, linkedHashMapK, AnalyticsFrequency.Always.b, false, 16);
    }

    public static void L(MetroTicketValidationAnalyticManager metroTicketValidationAnalyticManager, String str, ProductReceiptData productReceiptData, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
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
        AnalyticsContract.DefaultImpls.a(metroTicketValidationAnalyticManager, str, str2, linkedHashMap, AnalyticsFrequency.Always.b, false, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation) {
        MetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        if (continuation instanceof MetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) {
            metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = (MetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) continuation;
            int i = metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = new MetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1 = new MetroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()), new Pair("validationAckDataType", ProductValidationAnalyticManager.DefaultImpls.b(bleValidationAckData)));
            metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$0 = linkedHashMapK;
            metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$1 = this;
            str = "ble validation ack data consumed";
            metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$2 = "ble validation ack data consumed";
            metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$3 = source;
            metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$3;
            str = (String) metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$1;
            Map map2 = (Map) metroTicketValidationAnalyticManager$raiseBleValidationAckConsumedEvent$1.L$0;
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
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl) {
        MetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1;
        String str;
        AnalyticsContract analyticsContract;
        Map map;
        Source source2;
        if (continuationImpl instanceof MetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1) {
            metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = (MetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1) continuationImpl;
            int i = metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = new MetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 = new MetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
        }
        MetroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1 metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2 = metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$1;
        Object obj = metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label;
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
                metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label = 1;
                if (M(tITOTapInNotificationEventA, productValidationData, sourceName, validationNotificationDeliveryMedium, metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
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
                metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$0 = linkedHashMapK;
                metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$1 = this;
                str = "invalid ble validation ack data received";
                metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$2 = "invalid ble validation ack data received";
                metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$3 = source;
                metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.label = 2;
                if (J(linkedHashMapK, productValidationData, metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2) != obj2) {
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
        Source source3 = (Source) metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$3;
        str = (String) metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$2;
        AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$1;
        Map map2 = (Map) metroTicketValidationAnalyticManager$raiseBleValidationAckDataReceivedEvent$2.L$0;
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
        this.f5562a.F(name, source, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object G(ProductValidationData productValidationData, Continuation continuation) {
        MetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof MetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) {
            metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = (MetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) continuation;
            int i = metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = new MetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1 = new MetroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("type", "activationScreenTicketingProblemsV2"), new Pair("problemSource", "validationScreen"));
            metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$0 = linkedHashMapK;
            metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$1 = this;
            metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$2 = "report problem clicked v2";
            metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$3 = "validationScreen";
            metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1) == obj2) {
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
            String str3 = (String) metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$3;
            String str4 = (String) metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$1;
            Map map2 = (Map) metroTicketValidationAnalyticManager$raiseReportHookClickedEvent$1.L$0;
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
        MetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof MetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) {
            metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = (MetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) continuation;
            int i = metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = new MetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1 = new MetroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$0 = linkedHashMapK;
            metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$1 = this;
            metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$2 = "view receipt post validation clicked";
            metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$3 = source;
            metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$3;
            String str2 = (String) metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$1;
            Map map2 = (Map) metroTicketValidationAnalyticManager$raiseExitPostValidationButtonClickedEvent$1.L$0;
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
        MetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuation instanceof MetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) {
            metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = (MetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) continuation;
            int i = metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = new MetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1 = new MetroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("isBlePermissionGranted", Boolean.valueOf(z)));
            metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$0 = linkedHashMapK;
            metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$1 = this;
            metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$2 = "BLE permission check on validation initialization";
            metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$3 = str;
            metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str2 = "BLE permission check on validation initialization";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$3;
            String str3 = (String) metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$1;
            Map map2 = (Map) metroTicketValidationAnalyticManager$raiseBlePermissionCheckOnInitializationEvent$1.L$0;
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
        MetroTicketValidationAnalyticManager$addProperties$1 metroTicketValidationAnalyticManager$addProperties$1;
        String str;
        Object objX;
        Map map;
        if (continuationImpl instanceof MetroTicketValidationAnalyticManager$addProperties$1) {
            metroTicketValidationAnalyticManager$addProperties$1 = (MetroTicketValidationAnalyticManager$addProperties$1) continuationImpl;
            int i = metroTicketValidationAnalyticManager$addProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$addProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$addProperties$1 = new MetroTicketValidationAnalyticManager$addProperties$1(this, continuationImpl);
            }
        } else {
            metroTicketValidationAnalyticManager$addProperties$1 = new MetroTicketValidationAnalyticManager$addProperties$1(this, continuationImpl);
        }
        Object obj = metroTicketValidationAnalyticManager$addProperties$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$addProperties$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            linkedHashMap.put("fullName", productValidationData.y().getC());
            BasicInfoContract basicInfoContract = this.b;
            long j = basicInfoContract.j();
            TimeUtilsContract timeUtilsContract = this.c;
            linkedHashMap.put("time", timeUtilsContract.e(j));
            linkedHashMap.put(CLConstants.SHARED_PREFERENCE_ITEM_DATE, timeUtilsContract.Q(basicInfoContract.j()));
            linkedHashMap.put("productType", "mobileTicket");
            linkedHashMap.put("productSubType", "metroTicket");
            linkedHashMap.put(PaymentConstants.ORDER_ID_CAMEL, productValidationData.getId());
            metroTicketValidationAnalyticManager$addProperties$1.L$0 = linkedHashMap;
            str = "activationTime";
            metroTicketValidationAnalyticManager$addProperties$1.L$1 = "activationTime";
            metroTicketValidationAnalyticManager$addProperties$1.label = 1;
            objX = productValidationData.x(metroTicketValidationAnalyticManager$addProperties$1);
            if (objX == obj2) {
                map = linkedHashMap;
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) metroTicketValidationAnalyticManager$addProperties$1.L$1;
            Map map2 = (Map) metroTicketValidationAnalyticManager$addProperties$1.L$0;
            ResultKt.b(obj);
            str = str2;
            map = map2;
            objX = obj;
        }
        map = linkedHashMap;
        map.put(str, objX);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(TITOTapInNotificationEvent tITOTapInNotificationEvent, ProductValidationData productValidationData, String str, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Continuation continuation) {
        MetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        Map map2;
        String str2;
        Map map3;
        if (continuation instanceof MetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) {
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = (MetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) continuation;
            int i = metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new MetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1 = new MetroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapB = tITOTapInNotificationEvent.b(MapsKt.d(), this.b.j());
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("notificationDeliveryMedium", validationNotificationDeliveryMedium.name()));
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0 = linkedHashMapB;
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1 = linkedHashMapK;
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2 = linkedHashMapK;
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3 = this;
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4 = "tito tapIn notif recv on conductor flow";
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5 = str;
            metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1) == obj2) {
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
            str = (String) metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$5;
            String str3 = (String) metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$4;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$3;
            Map map4 = (Map) metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$2;
            Map map5 = (Map) metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$1;
            map = (Map) metroTicketValidationAnalyticManager$raiseTITOTapInNotificationReceivedOnConductorFlowEvent$1.L$0;
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
        this.f5562a.a(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        this.f5562a.b();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void c(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE validation open qr btn clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f5562a.d(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        this.f5562a.e(name, source, map, frequency, z);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void f(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "simple qr validation zoom qr clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        this.f5562a.g(d, d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object h(ProductValidationData productValidationData, Continuation continuation) {
        MetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        if (continuation instanceof MetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) {
            metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = (MetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) continuation;
            int i = metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = new MetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1 = new MetroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(obj);
            metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$0 = linkedHashMapO;
            metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$1 = this;
            metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$2 = "view trip receipt from menu clicked";
            metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$3 = "validationScreen";
            metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.label = 1;
            if (J(linkedHashMapO, productValidationData, metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1) == obj2) {
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
            String str3 = (String) metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$3;
            String str4 = (String) metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$1;
            Map map2 = (Map) metroTicketValidationAnalyticManager$raiseViewTripReceiptMenuClickedEvent$1.L$0;
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
        MetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1;
        String str3;
        Map map2;
        if (continuation instanceof MetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) {
            metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = (MetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) continuation;
            int i = metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = new MetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1(this, continuation);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1 = new MetroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1(this, continuation);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$0 = str;
            metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$1 = str2;
            metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$2 = analyticsFrequency;
            metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$3 = linkedHashMap;
            metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.label = 1;
            if (J(linkedHashMap, productValidationData, metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1) == obj2) {
                return obj2;
            }
            str3 = str;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map3 = (Map) metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$3;
            analyticsFrequency = (AnalyticsFrequency) metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$2;
            str2 = (String) metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$1;
            String str4 = (String) metroTicketValidationAnalyticManager$raiseAnalyticsEventWithProductData$1.L$0;
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
        MetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        if (continuation instanceof MetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) {
            metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = (MetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) continuation;
            int i = metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = new MetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2 = new MetroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("wasTitoValidation", Boolean.valueOf(z)));
            metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$0 = linkedHashMapK;
            metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$1 = this;
            metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$2 = "view receipt post validation clicked";
            metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$3 = source;
            metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.label = 1;
            if (J(linkedHashMapK, productValidationData, metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str = "view receipt post validation clicked";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$3;
            String str2 = (String) metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$1;
            Map map2 = (Map) metroTicketValidationAnalyticManager$raiseViewReceiptClickedEvent$2.L$0;
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
        MetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str2;
        if (continuationImpl instanceof MetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) {
            metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = (MetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) continuationImpl;
            int i = metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = new MetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
            }
        } else {
            metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1 = new MetroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
        }
        Object obj = metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("reason", str));
            metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$0 = linkedHashMapK;
            metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$1 = this;
            metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$2 = "syncing post ble validation failed";
            metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$3 = source;
            metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.label = 1;
            if (J(linkedHashMapK, productValidationData, metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1) == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map = linkedHashMapK;
            str2 = "syncing post ble validation failed";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$3;
            String str3 = (String) metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$1;
            Map map2 = (Map) metroTicketValidationAnalyticManager$raiseSyncingPostBleValidationFailedEvent$1.L$0;
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
        this.f5562a.o(str);
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
        this.f5562a.q();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void r(ProductReceiptData productReceiptData, String source) {
        Intrinsics.i(source, "source");
        L(this, "metro ticket trip punched", productReceiptData, source);
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
        L(this, "metro ticket view receipt clicked", productReceiptData, str);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void v(String username) {
        Intrinsics.i(username, "username");
        this.f5562a.v(username);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object w(ProductValidationData productValidationData, String str, Continuation continuation) {
        Object objA = ProductValidationAnalyticManager.DefaultImpls.a(this, "metro ticket fetched", productValidationData, str, null, continuation, 24);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void x(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "ble bottom sheet clicked", product, source, null, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        this.f5562a.y();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void z(Product product, String source) {
        Intrinsics.i(source, "source");
        K(this, "BLE denial qr option shown", product, source, null, 24);
    }
}
