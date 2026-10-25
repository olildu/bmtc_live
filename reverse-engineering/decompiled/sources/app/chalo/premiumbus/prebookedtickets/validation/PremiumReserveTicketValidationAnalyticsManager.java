package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.notification.models.AppNotification;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationAnalyticsManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationAnalyticManager;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketValidationAnalyticsManager implements ProductValidationAnalyticManager, AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalyticsContract f7482a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;

    public PremiumReserveTicketValidationAnalyticsManager(AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f7482a = analyticsContract;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
    }

    public static LinkedHashMap K(Product product) {
        return MapsKt.k(new Pair("productType", product.b), new Pair("isPremiumReserveTicket", Boolean.TRUE), new Pair("productSubType", product.c), new Pair("passId", product.f10666a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object A(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, Continuation continuation) {
        PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1 premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1;
        if (continuation instanceof PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1) {
            premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1 = (PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1) continuation;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object objJ = premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.L$0 = bleValidationAckData;
            premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.L$1 = validationNotificationDeliveryMedium;
            premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.L$2 = source;
            premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.label = 1;
            objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.L$2;
            validationNotificationDeliveryMedium = (ValidationNotificationDeliveryMedium) premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.L$1;
            bleValidationAckData = (BleValidationAckData) premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckConsumedEvent$1.L$0;
            ResultKt.b(objJ);
        }
        Source source2 = source;
        LinkedHashMap linkedHashMapU = MapsKt.u((Map) objJ);
        linkedHashMapU.put("validationAckDataType", ProductValidationAnalyticManager.DefaultImpls.b(bleValidationAckData));
        linkedHashMapU.put("notificationDeliveryMedium", validationNotificationDeliveryMedium.name());
        AnalyticsContractImplKt.b(this, "ble validation ack data consumed", source2, linkedHashMapU, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void B(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE permission rationale accepted", source, K(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void C(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation help btn clicked", source, K(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void D(AppNotification.PunchNotification punch, String source) {
        Intrinsics.i(punch, "punch");
        Intrinsics.i(source, "source");
        AppNotification.PunchNotification.PremiumReserveTicketPunchEvent premiumReserveTicketPunchEvent = punch instanceof AppNotification.PunchNotification.PremiumReserveTicketPunchEvent ? (AppNotification.PunchNotification.PremiumReserveTicketPunchEvent) punch : null;
        if (premiumReserveTicketPunchEvent == null) {
            return;
        }
        String str = premiumReserveTicketPunchEvent.e;
        if (str.equals("premiumReserveTicket")) {
            AnalyticsContract.DefaultImpls.a(this, "premium reserve ticket non receipt punch received", source, MapsKt.i(new Pair("productId", premiumReserveTicketPunchEvent.c), new Pair("productType", premiumReserveTicketPunchEvent.d), new Pair("productSubType", str), new Pair("punchTime", Long.valueOf(premiumReserveTicketPunchEvent.f)), new Pair("isTripReceiptAvailable", Boolean.FALSE)), null, false, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object E(BleValidationAckData bleValidationAckData, ProductValidationData productValidationData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, Source source, ContinuationImpl continuationImpl) {
        PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1 premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1;
        Object objJ;
        BleValidationAckData bleValidationAckData2;
        ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium2;
        Source source2;
        if (continuationImpl instanceof PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1) {
            premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1 = (PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1) continuationImpl;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.label;
        Object obj3 = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (bleValidationAckData instanceof BleValidationAckData.ConductorValidationReceiptData) {
                r(((BleValidationAckData.ConductorValidationReceiptData) bleValidationAckData).d, source.getSourceName());
                return obj3;
            }
            if (bleValidationAckData instanceof BleValidationAckData.TITOTapInData) {
                BleValidationAckDataKt.a((BleValidationAckData.TITOTapInData) bleValidationAckData);
                source.getSourceName();
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.label = 1;
                if (obj3 != obj2) {
                    return obj3;
                }
            } else {
                if (bleValidationAckData instanceof BleValidationAckData.TITOTapOutData) {
                    return obj3;
                }
                if (!(bleValidationAckData instanceof BleValidationAckData.InvalidData)) {
                    throw new NoWhenBranchMatchedException();
                }
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.L$0 = bleValidationAckData;
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.L$1 = validationNotificationDeliveryMedium;
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.L$2 = source;
                premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.label = 2;
                objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1);
                if (objJ != obj2) {
                    bleValidationAckData2 = bleValidationAckData;
                    validationNotificationDeliveryMedium2 = validationNotificationDeliveryMedium;
                    source2 = source;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
            return obj3;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Source source3 = (Source) premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.L$2;
        ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium3 = (ValidationNotificationDeliveryMedium) premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.L$1;
        BleValidationAckData bleValidationAckData3 = (BleValidationAckData) premiumReserveTicketValidationAnalyticsManager$raiseBleValidationAckDataReceivedEvent$1.L$0;
        ResultKt.b(obj);
        source2 = source3;
        bleValidationAckData2 = bleValidationAckData3;
        objJ = obj;
        validationNotificationDeliveryMedium2 = validationNotificationDeliveryMedium3;
        LinkedHashMap linkedHashMapU = MapsKt.u((Map) objJ);
        BleValidationAckData.InvalidData invalidData = (BleValidationAckData.InvalidData) bleValidationAckData2;
        linkedHashMapU.put("reason", invalidData.b);
        linkedHashMapU.put(Constants.MessagePayloadKeys.RAW_DATA, invalidData.f10498a);
        linkedHashMapU.put("notificationDeliveryMedium", validationNotificationDeliveryMedium2.name());
        AnalyticsContract.DefaultImpls.a(this, "invalid ble validation ack data received", source2.getSourceName(), linkedHashMapU, null, false, 24);
        return obj3;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void F(String name, String source, Map map) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        this.f7482a.F(name, source, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object G(ProductValidationData productValidationData, Continuation continuation) {
        PremiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1 premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1;
        Map map;
        Map map2;
        if (continuation instanceof PremiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1) {
            premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1 = (PremiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1) continuation;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("type", "activationScreenTicketingProblemsV2"), new Pair("problemSource", "validationScreen"));
            premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.L$0 = linkedHashMapK;
            premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.L$1 = linkedHashMapK;
            premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.label = 1;
            Object objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1);
            if (objJ == obj2) {
                return obj2;
            }
            map = linkedHashMapK;
            obj = objJ;
            map2 = map;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = (Map) premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.L$1;
            Map map3 = (Map) premiumReserveTicketValidationAnalyticsManager$raiseReportHookClickedEvent$1.L$0;
            ResultKt.b(obj);
            map = map3;
        }
        map2.putAll((Map) obj);
        AnalyticsContract.DefaultImpls.a(this, "report problem clicked v2", "validationScreen", map, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object H(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        PremiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1 premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1;
        if (continuation instanceof PremiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1) {
            premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1 = (PremiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1) continuation;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object objJ = premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.L$0 = source;
            premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.Z$0 = z;
            premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.label = 1;
            objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.Z$0;
            source = (Source) premiumReserveTicketValidationAnalyticsManager$raiseExitPostValidationButtonClickedEvent$1.L$0;
            ResultKt.b(objJ);
        }
        Source source2 = source;
        LinkedHashMap linkedHashMapU = MapsKt.u((Map) objJ);
        linkedHashMapU.put("wasTitoValidation", String.valueOf(z));
        AnalyticsContractImplKt.b(this, "view receipt post validation clicked", source2, linkedHashMapU, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object I(boolean z, ProductValidationData productValidationData, String str, Continuation continuation) {
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("productType", "premiumReserveTicket"), new Pair("isPremiumReserveTicket", Boolean.TRUE), new Pair("productSubType", productValidationData.b()), new Pair("bookingId", productValidationData.getId()));
        linkedHashMapK.put("isBlePermissionGranted", Boolean.valueOf(z));
        AnalyticsContract.DefaultImpls.a(this, "BLE permission check on validation initialization", str, linkedHashMapK, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        PremiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1 premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1;
        String str;
        ProductValidationData productValidationData2;
        Map map;
        TimeUtilsContract timeUtilsContract;
        Map map2;
        String str2;
        Map map3;
        Map map4;
        ProductValidationData productValidationData3;
        if (continuationImpl instanceof PremiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1) {
            premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1 = (PremiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1) continuationImpl;
            int i = premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1 = new PremiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1 = new PremiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1(this, continuationImpl);
        }
        Object objC = premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.label;
        BasicInfoContract basicInfoContract = this.b;
        TimeUtilsContract timeUtilsContract2 = this.c;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(objC);
            linkedHashMapO.put("fullName", productValidationData.y().getC());
            premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$0 = productValidationData;
            premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$1 = linkedHashMapO;
            premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$2 = linkedHashMapO;
            str = "time";
            premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$3 = "time";
            premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$4 = timeUtilsContract2;
            premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.label = 1;
            Object objC2 = basicInfoContract.c(premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1);
            if (objC2 != coroutineSingletons) {
                productValidationData2 = productValidationData;
                map = linkedHashMapO;
                timeUtilsContract = timeUtilsContract2;
                objC = objC2;
                map2 = map;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            timeUtilsContract = (TimeUtilsContract) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$4;
            str = (String) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$3;
            map2 = (Map) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$2;
            map = (Map) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$1;
            productValidationData2 = (ProductValidationData) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            timeUtilsContract2 = (TimeUtilsContract) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$4;
            str2 = (String) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$3;
            map3 = (Map) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$2;
            map4 = (Map) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$1;
            productValidationData3 = (ProductValidationData) premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$0;
            ResultKt.b(objC);
        }
        map3.put(str2, timeUtilsContract2.Q(((Number) objC).longValue()));
        map4.put("productType", "premiumReserveTicket");
        map4.put("bookingId", productValidationData3.getId());
        if (productValidationData3 instanceof PremiumReserveTicketValidationData) {
            map4.putAll(((PremiumReserveTicketValidationData) productValidationData3).f);
        }
        return map4;
        map2.put(str, timeUtilsContract.i(((Number) objC).longValue()));
        premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$0 = productValidationData2;
        premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$1 = map;
        premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$2 = map;
        str2 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$3 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.L$4 = timeUtilsContract2;
        premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1.label = 2;
        objC = basicInfoContract.c(premiumReserveTicketValidationAnalyticsManager$getAnalyticsProperties$1);
        if (objC != coroutineSingletons) {
            map3 = map;
            map4 = map3;
            productValidationData3 = productValidationData2;
            map3.put(str2, timeUtilsContract2.Q(((Number) objC).longValue()));
            map4.put("productType", "premiumReserveTicket");
            map4.put("bookingId", productValidationData3.getId());
            if (productValidationData3 instanceof PremiumReserveTicketValidationData) {
                map4.putAll(((PremiumReserveTicketValidationData) productValidationData3).f);
            }
            return map4;
        }
        return coroutineSingletons;
    }

    public final LinkedHashMap L(ProductReceiptData productReceiptData) {
        return MapsKt.k(new Pair("isTripReceiptAvailable", Boolean.valueOf(productReceiptData.getC() != -1)), new Pair("bookingId", productReceiptData.getF5392a()), new Pair("productSubType", productReceiptData.getB()), new Pair("route name", productReceiptData.getI()), new Pair("startStop", productReceiptData.getG()), new Pair("endStop", productReceiptData.getH()), new Pair("conductorId", productReceiptData.getF()), new Pair("punchTime", this.c.x(productReceiptData.getC())), new Pair("vehicleNo", productReceiptData.getE()), new Pair("endStopId", productReceiptData.getM()));
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void a(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f7482a.a(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        this.f7482a.b();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void c(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation open qr btn clicked", source, K(product), null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        this.f7482a.d(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        this.f7482a.e(name, source, map, frequency, z);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void f(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "simple qr validation zoom qr clicked", source, K(product), null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        this.f7482a.g(d, d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object h(ProductValidationData productValidationData, Continuation continuation) {
        PremiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1 premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1;
        AnalyticsContract analyticsContract;
        String str;
        String str2;
        if (continuation instanceof PremiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1) {
            premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1 = (PremiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1) continuation;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.L$0 = this;
            premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.L$1 = "view trip receipt from menu clicked";
            premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.L$2 = "validationScreen";
            premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.label = 1;
            Object objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1);
            if (objJ == obj2) {
                return obj2;
            }
            analyticsContract = this;
            str = "view trip receipt from menu clicked";
            str2 = "validationScreen";
            obj = objJ;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.L$2;
            String str4 = (String) premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.L$1;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) premiumReserveTicketValidationAnalyticsManager$raiseViewTripReceiptMenuClickedEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
            analyticsContract = analyticsContract2;
            str = str4;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, (Map) obj, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void i(boolean z, Product product, String source) {
        Intrinsics.i(source, "source");
        if (z) {
            AnalyticsContract.DefaultImpls.a(this, "BLE permission granted", source, K(product), null, false, 24);
        } else {
            AnalyticsContract.DefaultImpls.a(this, "BLE permission denied", source, K(product), null, false, 24);
        }
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void j(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "qr screen open", source, K(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void k(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation permission rationale screen opened", source, K(product), null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object l(String str, ProductValidationData productValidationData, String str2, Map map, AnalyticsFrequency analyticsFrequency, Continuation continuation) {
        PremiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1 premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1;
        AnalyticsContract analyticsContract;
        Map map2;
        Map map3;
        if (continuation instanceof PremiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1) {
            premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1 = (PremiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1) continuation;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1(this, continuation);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1(this, continuation);
        }
        Object obj = premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$0 = linkedHashMap;
            premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$1 = linkedHashMap;
            premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$2 = this;
            premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$3 = str;
            premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$4 = str2;
            premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.label = 1;
            Object objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1);
            if (objJ == obj2) {
                return obj2;
            }
            analyticsContract = this;
            map2 = linkedHashMap;
            map3 = map2;
            obj = objJ;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$4;
            str = (String) premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$3;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$2;
            map2 = (Map) premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$1;
            Map map4 = (Map) premiumReserveTicketValidationAnalyticsManager$raiseAnalyticsEventWithProductData$1.L$0;
            ResultKt.b(obj);
            analyticsContract = analyticsContract2;
            map3 = map4;
        }
        String str3 = str;
        String str4 = str2;
        map2.putAll((Map) obj);
        AnalyticsContract.DefaultImpls.a(analyticsContract, str3, str4, map3, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object m(ProductValidationData productValidationData, boolean z, Source source, Continuation continuation) {
        PremiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2 premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2;
        if (continuation instanceof PremiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2) {
            premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2 = (PremiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2) continuation;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2 = new PremiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2 = new PremiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2(this, (ContinuationImpl) continuation);
        }
        Object objJ = premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.L$0 = source;
            premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.Z$0 = z;
            premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.label = 1;
            objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.Z$0;
            source = (Source) premiumReserveTicketValidationAnalyticsManager$raiseViewReceiptClickedEvent$2.L$0;
            ResultKt.b(objJ);
        }
        Source source2 = source;
        LinkedHashMap linkedHashMapU = MapsKt.u((Map) objJ);
        linkedHashMapU.put("wasTitoValidation", String.valueOf(z));
        AnalyticsContractImplKt.b(this, "view receipt post validation clicked", source2, linkedHashMapU, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object n(ProductValidationData productValidationData, String str, Source source, ContinuationImpl continuationImpl) {
        PremiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1 premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1;
        if (continuationImpl instanceof PremiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1) {
            premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1 = (PremiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1) continuationImpl;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1(this, continuationImpl);
        }
        Object objJ = premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.L$0 = str;
            premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.L$1 = source;
            premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.label = 1;
            objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.L$1;
            str = (String) premiumReserveTicketValidationAnalyticsManager$raiseSyncingPostBleValidationFailedEvent$1.L$0;
            ResultKt.b(objJ);
        }
        Source source2 = source;
        LinkedHashMap linkedHashMapU = MapsKt.u((Map) objJ);
        linkedHashMapU.put("failureReason", str);
        AnalyticsContractImplKt.b(this, "syncing post ble validation failed", source2, linkedHashMapU, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void o(String str) {
        this.f7482a.o(str);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void p(Source source, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct) {
        Intrinsics.i(validationProduct, "validationProduct");
        Intrinsics.i(validationProcessFlowDetails, "validationProcessFlowDetails");
        Intrinsics.i(source, "source");
        LinkedHashMap linkedHashMapK = K(ProductKt.a(validationProduct));
        linkedHashMapK.put("validationFlowType", ProductValidationAnalyticManager.DefaultImpls.c(validationProcessFlowDetails));
        AnalyticsContractImplKt.b(this, "ble screen open", source, linkedHashMapK, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void q() {
        this.f7482a.q();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void r(ProductReceiptData productReceiptData, String source) {
        Intrinsics.i(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(L(productReceiptData));
        if (productReceiptData.getC() != -1) {
            linkedHashMap.put("punch notification delay", Long.valueOf(this.b.j() - productReceiptData.getC()));
        }
        AnalyticsContract.DefaultImpls.a(this, "premium reserve ticket trip punched", source, linkedHashMap, null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void s(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation switch to qr got it clicked", source, K(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void t(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE validation permission settings screen opened", source, K(product), null, false, 24);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object u(ProductReceiptData productReceiptData, String str, Continuation continuation) {
        AnalyticsContract.DefaultImpls.a(this, "premium reserve ticket view receipt clicked", str, L(productReceiptData), null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void v(String username) {
        Intrinsics.i(username, "username");
        this.f7482a.v(username);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final Object w(ProductValidationData productValidationData, String str, Continuation continuation) {
        PremiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1 premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1;
        AnalyticsContract analyticsContract;
        String str2;
        if (continuation instanceof PremiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1) {
            premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1 = (PremiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1) continuation;
            int i = premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1 = new PremiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.L$0 = this;
            premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.L$1 = "premium reserve ticket fetched";
            premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.L$2 = str;
            premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.label = 1;
            Object objJ = J(productValidationData, premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1);
            if (objJ == obj2) {
                return obj2;
            }
            analyticsContract = this;
            str2 = "premium reserve ticket fetched";
            obj = objJ;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.L$2;
            String str3 = (String) premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.L$1;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) premiumReserveTicketValidationAnalyticsManager$raiseProductDataFetchedEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
            analyticsContract = analyticsContract2;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str, (Map) obj, null, false, 24);
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void x(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "ble bottom sheet clicked", source, K(product), null, false, 24);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        this.f7482a.y();
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager
    public final void z(Product product, String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this, "BLE denial qr option shown", source, K(product), null, false, 24);
    }
}
