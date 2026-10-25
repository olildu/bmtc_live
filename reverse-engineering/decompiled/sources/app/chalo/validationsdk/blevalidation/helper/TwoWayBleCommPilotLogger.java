package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.ble_communication.BLEDataReceivingDistance;
import app.chalo.ble_communication.model.BLETransferData;
import app.chalo.ble_communication.passengerside.model.BLEPassengerSideDuplexConnection;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.models.validation.TwoWayBLECommPilotConfig;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.network.config.ChaloJson;
import defpackage.vo1;
import in.juspay.hypersdk.analytics.LogConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/TwoWayBleCommPilotLogger;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TwoWayBleCommPilotLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f10560a;
    public final BasicInfoContract b;
    public final GetTwoWayBleCommPilotConfigUseCase c;
    public Set d;
    public final MutexImpl e = MutexKt.a();
    public final LinkedHashMap f = new LinkedHashMap();
    public ProductForLogging g;

    public TwoWayBleCommPilotLogger(AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, GetTwoWayBleCommPilotConfigUseCase getTwoWayBleCommPilotConfigUseCase) {
        this.f10560a = analyticsContract;
        this.b = basicInfoContract;
        this.c = getTwoWayBleCommPilotConfigUseCase;
    }

    public static void a(LinkedHashMap linkedHashMap, List list) {
        String str;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            BLEPassengerSideDuplexConnection bLEPassengerSideDuplexConnection = (BLEPassengerSideDuplexConnection) it.next();
            String strJ = vo1.j(i, "connectionId");
            if (bLEPassengerSideDuplexConnection == null || (str = bLEPassengerSideDuplexConnection.f1144a) == null) {
                str = "";
            }
            linkedHashMap.put(strJ, str);
            i++;
        }
    }

    public static void c(LinkedHashMap linkedHashMap, BLETransferData.DuplexConnectionBLETransferData duplexConnectionBLETransferData) {
        Object objB;
        linkedHashMap.put("data", StringsKt.p(duplexConnectionBLETransferData.f1132a));
        linkedHashMap.put("connectionId", duplexConnectionBLETransferData.b);
        linkedHashMap.put("setupTimeout", Long.valueOf(duplexConnectionBLETransferData.c));
        linkedHashMap.put("dataTimestamp", Long.valueOf(duplexConnectionBLETransferData.d));
        ChaloJson chaloJson = ChaloJson.f6455a;
        String strP = StringsKt.p(duplexConnectionBLETransferData.f1132a);
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(strP, ETIMInfo.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        ETIMInfo eTIMInfo = (ETIMInfo) objB;
        if (eTIMInfo != null) {
            linkedHashMap.put("waybillNo", eTIMInfo.f10555a);
            linkedHashMap.put("etimTimestamp", eTIMInfo.b);
            linkedHashMap.put("padding", eTIMInfo.c);
        }
    }

    public static void d(LinkedHashMap linkedHashMap, BLETransferData.OneWayBroadcastBLETransferData oneWayBroadcastBLETransferData) {
        String strName;
        linkedHashMap.put("data", oneWayBroadcastBLETransferData.f1133a.toString());
        linkedHashMap.put("communicationRange", oneWayBroadcastBLETransferData.b.name());
        linkedHashMap.put("setupTimeout", Long.valueOf(oneWayBroadcastBLETransferData.c));
        BLEDataReceivingDistance bLEDataReceivingDistance = oneWayBroadcastBLETransferData.d;
        if (bLEDataReceivingDistance != null && (strName = bLEDataReceivingDistance.name()) != null) {
            linkedHashMap.put("receivingDistance", strName);
        }
        linkedHashMap.put("dataTimestamp", Long.valueOf(oneWayBroadcastBLETransferData.e));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c8 -> B:41:0x00cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.Map r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.b(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object e(BLEEventType bLEEventType, ProductForLogging productForLogging, Source source, LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        TwoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1 twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1;
        ProductForLogging productForLogging2;
        Source source2;
        Map map;
        Object objT;
        BLEEventType bLEEventType2;
        Map map2;
        String str;
        BLEEventType bLEEventType3 = bLEEventType;
        if (continuationImpl instanceof TwoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1) {
            twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1 = (TwoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1) continuationImpl;
            int i = twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1 = new TwoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1(this, continuationImpl);
            }
        } else {
            twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1 = new TwoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1(this, continuationImpl);
        }
        Object obj = twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (productForLogging == null) {
                productForLogging2 = this.g;
                if (productForLogging2 == null) {
                    productForLogging2 = new ProductForLogging(LogConstants.DEFAULT_CHANNEL, LogConstants.DEFAULT_CHANNEL, "");
                }
            } else {
                productForLogging2 = productForLogging;
            }
            twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$0 = bLEEventType3;
            source2 = source;
            twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$1 = source2;
            map = linkedHashMap;
            twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$2 = map;
            twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$3 = productForLogging2;
            twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.label = 1;
            objT = t(bLEEventType3, productForLogging2, twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1);
            if (objT != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            ProductForLogging productForLogging3 = (ProductForLogging) twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$3;
            Map map3 = (Map) twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$2;
            Source source3 = (Source) twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$1;
            BLEEventType bLEEventType4 = (BLEEventType) twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$0;
            ResultKt.b(obj);
            productForLogging2 = productForLogging3;
            bLEEventType3 = bLEEventType4;
            map = map3;
            source2 = source3;
            objT = obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map4 = (Map) twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$1;
            bLEEventType2 = (BLEEventType) twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$0;
            ResultKt.b(obj);
            map2 = map4;
        }
        switch (TwoWayBleCommPilotLoggerKt.WhenMappings.f10561a[bLEEventType2.ordinal()]) {
            case 1:
                str = "start active mode broadcast called";
                break;
            case 2:
                str = "BLE advertisement sending failed";
                break;
            case 3:
                str = "BLE advertisement sent";
                break;
            case 4:
                str = "start duplex connection op called";
                break;
            case 5:
                str = "start duplex connection op success";
                break;
            case 6:
                str = "start duplex connection op failed";
                break;
            case 7:
                str = "send data on connection called";
                break;
            case 8:
                str = "send data on connection success";
                break;
            case 9:
                str = "send data on connection failed";
                break;
            case 10:
                str = "ble connection list updated";
                break;
            case 11:
                str = "ble connection history list updated";
                break;
            case 12:
                str = "ble data received on connection";
                break;
            case 13:
                str = "stop ble validation with delay called";
                break;
            case 14:
                str = "stop ble validation success";
                break;
            case 15:
                str = "stop ble validation failed";
                break;
            case 16:
                str = "stop active mode broadcast called";
                break;
            case 17:
                str = "stop all ble op and switch off bluetooth called";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        AnalyticsContract.DefaultImpls.a(this.f10560a, str, "validationScreen", map2, null, false, 8);
        return unit;
        if (!((Boolean) objT).booleanValue()) {
            return unit;
        }
        map.put("productType", productForLogging2.f10559a);
        map.put("productSubtype", productForLogging2.b);
        map.put("bookingId", productForLogging2.c);
        map.put("source", source2.getSourceName());
        twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$0 = bLEEventType3;
        twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$1 = map;
        twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$2 = null;
        twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.L$3 = null;
        twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1.label = 2;
        if (b(map, twoWayBleCommPilotLogger$addCommonPropertiesAndRaiseAnalyticsEventIfRequired$1) != obj2) {
            bLEEventType2 = bLEEventType3;
            map2 = map;
            switch (TwoWayBleCommPilotLoggerKt.WhenMappings.f10561a[bLEEventType2.ordinal()]) {
                case 1:
                    str = "start active mode broadcast called";
                    break;
                case 2:
                    str = "BLE advertisement sending failed";
                    break;
                case 3:
                    str = "BLE advertisement sent";
                    break;
                case 4:
                    str = "start duplex connection op called";
                    break;
                case 5:
                    str = "start duplex connection op success";
                    break;
                case 6:
                    str = "start duplex connection op failed";
                    break;
                case 7:
                    str = "send data on connection called";
                    break;
                case 8:
                    str = "send data on connection success";
                    break;
                case 9:
                    str = "send data on connection failed";
                    break;
                case 10:
                    str = "ble connection list updated";
                    break;
                case 11:
                    str = "ble connection history list updated";
                    break;
                case 12:
                    str = "ble data received on connection";
                    break;
                case 13:
                    str = "stop ble validation with delay called";
                    break;
                case 14:
                    str = "stop ble validation success";
                    break;
                case 15:
                    str = "stop ble validation failed";
                    break;
                case 16:
                    str = "stop active mode broadcast called";
                    break;
                case 17:
                    str = "stop all ble op and switch off bluetooth called";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            AnalyticsContract.DefaultImpls.a(this.f10560a, str, "validationScreen", map2, null, false, 8);
            return unit;
        }
        return obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    public final Object f(ProductForLogging productForLogging, ContinuationImpl continuationImpl) {
        TwoWayBleCommPilotLogger$getLoggableEventSet$1 twoWayBleCommPilotLogger$getLoggableEventSet$1;
        Set set;
        BLEEventType bLEEventType;
        if (continuationImpl instanceof TwoWayBleCommPilotLogger$getLoggableEventSet$1) {
            twoWayBleCommPilotLogger$getLoggableEventSet$1 = (TwoWayBleCommPilotLogger$getLoggableEventSet$1) continuationImpl;
            int i = twoWayBleCommPilotLogger$getLoggableEventSet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                twoWayBleCommPilotLogger$getLoggableEventSet$1.label = i - Integer.MIN_VALUE;
            } else {
                twoWayBleCommPilotLogger$getLoggableEventSet$1 = new TwoWayBleCommPilotLogger$getLoggableEventSet$1(this, continuationImpl);
            }
        } else {
            twoWayBleCommPilotLogger$getLoggableEventSet$1 = new TwoWayBleCommPilotLogger$getLoggableEventSet$1(this, continuationImpl);
        }
        Object obj = twoWayBleCommPilotLogger$getLoggableEventSet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = twoWayBleCommPilotLogger$getLoggableEventSet$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ValidationProduct validationProductB = ValidationProduct.Companion.b(ValidationProduct.INSTANCE, productForLogging.f10559a, productForLogging.b, productForLogging.c);
            if (validationProductB == null) {
                return linkedHashSet;
            }
            twoWayBleCommPilotLogger$getLoggableEventSet$1.L$0 = linkedHashSet;
            twoWayBleCommPilotLogger$getLoggableEventSet$1.label = 1;
            Object objA = this.c.a(validationProductB, twoWayBleCommPilotLogger$getLoggableEventSet$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objA;
            set = linkedHashSet;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) twoWayBleCommPilotLogger$getLoggableEventSet$1.L$0;
            ResultKt.b(obj);
        }
        Iterator it = ((TwoWayBLECommPilotConfig) obj).h.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case "dataRecOnConn":
                    bLEEventType = BLEEventType.DATA_RECEIVED_ON_CONNECTION;
                    break;
                case "startActModeBrCalled":
                    bLEEventType = BLEEventType.START_ACTIVE_MODE_BROADCAST_CALLED;
                    break;
                case "startActModeBrFailed":
                    bLEEventType = BLEEventType.START_ACTIVE_MODE_BROADCAST_FAILED;
                    break;
                case "stopBleValSuccess":
                    bLEEventType = BLEEventType.STOP_BLE_VALIDATION_SUCCESS;
                    break;
                case "connListUpdated":
                    bLEEventType = BLEEventType.CONNECTION_LIST_UPDATED;
                    break;
                case "startDuplexConnOpCalled":
                    bLEEventType = BLEEventType.START_DUPLEX_CONNECTION_OPERATION_CALLED;
                    break;
                case "startDuplexConnOpFailed":
                    bLEEventType = BLEEventType.START_DUPLEX_CONNECTION_OPERATION_FAILED;
                    break;
                case "startActModeBrSuccess":
                    bLEEventType = BLEEventType.START_ACTIVE_MODE_BROADCAST_SUCCESS;
                    break;
                case "stopBleOpAndSOBluetooth":
                    bLEEventType = BLEEventType.STOP_ALL_BLE_OP_AND_SWITCH_OFF_BLUETOOTH_CALLED;
                    break;
                case "sendDataOnConnCalled":
                    bLEEventType = BLEEventType.SEND_DATA_ON_CONNECTION_CALLED;
                    break;
                case "sendDataOnConnFailed":
                    bLEEventType = BLEEventType.SEND_DATA_ON_CONNECTION_FAILED;
                    break;
                case "connHistListUpdated":
                    bLEEventType = BLEEventType.CONNECTION_HISTORY_LIST_UPDATED;
                    break;
                case "stopBleValWithDelay":
                    bLEEventType = BLEEventType.STOP_BLE_VALIDATION_WITH_DELAY_CALLED;
                    break;
                case "startDuplexConnOpSuccess":
                    bLEEventType = BLEEventType.START_DUPLEX_CONNECTION_OPERATION_SUCCESS;
                    break;
                case "stopBleValFailed":
                    bLEEventType = BLEEventType.STOP_BLE_VALIDATION_FAILED;
                    break;
                case "sendDataOnConnSuccess":
                    bLEEventType = BLEEventType.SEND_DATA_ON_CONNECTION_SUCCESS;
                    break;
                default:
                    bLEEventType = null;
                    break;
            }
            if (bLEEventType != null) {
                set.add(bLEEventType);
            }
        }
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(BLEEventType bLEEventType, long j, ContinuationImpl continuationImpl) {
        TwoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1 twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1;
        Mutex mutex;
        if (continuationImpl instanceof TwoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1) {
            twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1 = (TwoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1) continuationImpl;
            int i = twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1 = new TwoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1(this, continuationImpl);
            }
        } else {
            twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1 = new TwoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1(this, continuationImpl);
        }
        Object obj = twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.L$0 = bLEEventType;
            mutex = this.e;
            twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.L$1 = mutex;
            twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.J$0 = j;
            twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.label = 1;
            if (mutex.a(twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.J$0;
            Mutex mutex2 = (Mutex) twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.L$1;
            BLEEventType bLEEventType2 = (BLEEventType) twoWayBleCommPilotLogger$getTimeElapsedSinceEvent$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            bLEEventType = bLEEventType2;
        }
        try {
            Long l = (Long) this.f.get(bLEEventType);
            return new Long(j - (l != null ? l.longValue() : j));
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (e(r2, null, r4, r5, r6) == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r8, app.chalo.constants.Source r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionHistoryListUpdated$1
            if (r0 == 0) goto L14
            r0 = r10
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionHistoryListUpdated$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionHistoryListUpdated$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionHistoryListUpdated$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionHistoryListUpdated$1
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4e
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            kotlin.ResultKt.b(r10)
            goto L8c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r6.L$3
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r8 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r8
            java.lang.Object r9 = r6.L$2
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r1 = r6.L$1
            app.chalo.constants.Source r1 = (app.chalo.constants.Source) r1
            java.lang.Object r4 = r6.L$0
            java.util.List r4 = (java.util.List) r4
            kotlin.ResultKt.b(r10)
            r10 = r2
            r2 = r8
            r8 = r4
            r4 = r1
            goto L68
        L4e:
            kotlin.ResultKt.b(r10)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r10 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.CONNECTION_HISTORY_LIST_UPDATED
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r2
            r6.L$3 = r10
            r6.label = r4
            java.lang.Object r1 = r7.s(r10, r6)
            if (r1 != r0) goto L64
            goto L8b
        L64:
            r4 = r9
            r9 = r2
            r2 = r10
            r10 = r9
        L68:
            if (r9 == 0) goto L70
            java.util.LinkedHashMap r9 = kotlin.collections.MapsKt.u(r9)
        L6e:
            r5 = r9
            goto L76
        L70:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            goto L6e
        L76:
            a(r5, r8)
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.L$3 = r10
            r6.label = r3
            r3 = 0
            r1 = r7
            java.lang.Object r8 = r1.e(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.h(java.util.List, app.chalo.constants.Source, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (e(r2, null, r4, r5, r6) == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r8, app.chalo.constants.Source r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionListUpdated$1
            if (r0 == 0) goto L14
            r0 = r10
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionListUpdated$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionListUpdated$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionListUpdated$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onConnectionListUpdated$1
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4e
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            kotlin.ResultKt.b(r10)
            goto L8c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r6.L$3
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r8 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r8
            java.lang.Object r9 = r6.L$2
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r1 = r6.L$1
            app.chalo.constants.Source r1 = (app.chalo.constants.Source) r1
            java.lang.Object r4 = r6.L$0
            java.util.List r4 = (java.util.List) r4
            kotlin.ResultKt.b(r10)
            r10 = r2
            r2 = r8
            r8 = r4
            r4 = r1
            goto L68
        L4e:
            kotlin.ResultKt.b(r10)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r10 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.CONNECTION_LIST_UPDATED
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r2
            r6.L$3 = r10
            r6.label = r4
            java.lang.Object r1 = r7.s(r10, r6)
            if (r1 != r0) goto L64
            goto L8b
        L64:
            r4 = r9
            r9 = r2
            r2 = r10
            r10 = r9
        L68:
            if (r9 == 0) goto L70
            java.util.LinkedHashMap r9 = kotlin.collections.MapsKt.u(r9)
        L6e:
            r5 = r9
            goto L76
        L70:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            goto L6e
        L76:
            a(r5, r8)
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.L$3 = r10
            r6.label = r3
            r3 = 0
            r1 = r7
            java.lang.Object r8 = r1.e(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.i(java.util.List, app.chalo.constants.Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (e(r2, null, r4, r5, r6) == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(app.chalo.ble_communication.model.BLETransferData.DuplexConnectionBLETransferData r8, app.chalo.constants.Source r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onDataReceivedFromConnection$1
            if (r0 == 0) goto L14
            r0 = r10
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onDataReceivedFromConnection$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onDataReceivedFromConnection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onDataReceivedFromConnection$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onDataReceivedFromConnection$1
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4e
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            kotlin.ResultKt.b(r10)
            goto L8c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r6.L$3
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r8 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r8
            java.lang.Object r9 = r6.L$2
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r1 = r6.L$1
            app.chalo.constants.Source r1 = (app.chalo.constants.Source) r1
            java.lang.Object r4 = r6.L$0
            app.chalo.ble_communication.model.BLETransferData$DuplexConnectionBLETransferData r4 = (app.chalo.ble_communication.model.BLETransferData.DuplexConnectionBLETransferData) r4
            kotlin.ResultKt.b(r10)
            r10 = r2
            r2 = r8
            r8 = r4
            r4 = r1
            goto L68
        L4e:
            kotlin.ResultKt.b(r10)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r10 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.DATA_RECEIVED_ON_CONNECTION
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r2
            r6.L$3 = r10
            r6.label = r4
            java.lang.Object r1 = r7.s(r10, r6)
            if (r1 != r0) goto L64
            goto L8b
        L64:
            r4 = r9
            r9 = r2
            r2 = r10
            r10 = r9
        L68:
            if (r9 == 0) goto L70
            java.util.LinkedHashMap r9 = kotlin.collections.MapsKt.u(r9)
        L6e:
            r5 = r9
            goto L76
        L70:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            goto L6e
        L76:
            c(r5, r8)
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.L$3 = r10
            r6.label = r3
            r3 = 0
            r1 = r7
            java.lang.Object r8 = r1.e(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.j(app.chalo.ble_communication.model.BLETransferData$DuplexConnectionBLETransferData, app.chalo.constants.Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (e(r8, r10, r11, r0, r12) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.ble_communication.model.BLETransferData.OneWayBroadcastBLETransferData r7, int r8, app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9, app.chalo.constants.Source r10, java.util.Map r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastCalled$1
            if (r0 == 0) goto L14
            r0 = r12
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastCalled$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastCalled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastCalled$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastCalled$1
            r0.<init>(r6, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r12.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r0)
            goto Laa
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r8 = r12.I$0
            java.lang.Object r7 = r12.L$4
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r7 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r7
            java.lang.Object r9 = r12.L$3
            r11 = r9
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r9 = r12.L$2
            r10 = r9
            app.chalo.constants.Source r10 = (app.chalo.constants.Source) r10
            java.lang.Object r9 = r12.L$1
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r9
            java.lang.Object r2 = r12.L$0
            app.chalo.ble_communication.model.BLETransferData$OneWayBroadcastBLETransferData r2 = (app.chalo.ble_communication.model.BLETransferData.OneWayBroadcastBLETransferData) r2
            kotlin.ResultKt.b(r0)
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            goto L77
        L57:
            kotlin.ResultKt.b(r0)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r0 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.START_ACTIVE_MODE_BROADCAST_CALLED
            r12.L$0 = r7
            r12.L$1 = r9
            r12.L$2 = r10
            r12.L$3 = r11
            r12.L$4 = r0
            r12.I$0 = r8
            r12.label = r4
            java.lang.Object r2 = r6.s(r0, r12)
            if (r2 != r1) goto L71
            goto La9
        L71:
            r5 = r9
            r9 = r8
            r8 = r0
            r0 = r11
            r11 = r10
            r10 = r5
        L77:
            r6.g = r10
            if (r0 == 0) goto L80
            java.util.LinkedHashMap r0 = kotlin.collections.MapsKt.u(r0)
            goto L85
        L80:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L85:
            d(r0, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r9)
            java.lang.String r9 = "failureCount"
            r0.put(r9, r7)
            r7 = 0
            r12.L$0 = r7
            r12.L$1 = r7
            r12.L$2 = r7
            r12.L$3 = r7
            r12.L$4 = r7
            r12.label = r3
            r7 = r6
            r9 = r10
            r10 = r11
            r11 = r0
            java.lang.Object r8 = r7.e(r8, r9, r10, r11, r12)
            if (r8 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.k(app.chalo.ble_communication.model.BLETransferData$OneWayBroadcastBLETransferData, int, app.chalo.validationsdk.blevalidation.helper.ProductForLogging, app.chalo.constants.Source, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (e(r8, r11, r12, r13, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(app.chalo.ble_communication.model.BLETransferData.OneWayBroadcastBLETransferData r7, app.chalo.ble_communication.BLEDataTransmissionFailureReason r8, int r9, app.chalo.validationsdk.blevalidation.helper.ProductForLogging r10, app.chalo.constants.Source r11, java.util.Map r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastFailed$1
            if (r0 == 0) goto L13
            r0 = r13
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastFailed$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastFailed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastFailed$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastFailed$1
            r0.<init>(r6, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r13)
            goto Lbd
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            int r9 = r0.I$0
            java.lang.Object r7 = r0.L$5
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r7 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r7
            java.lang.Object r8 = r0.L$4
            r12 = r8
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r8 = r0.L$3
            r11 = r8
            app.chalo.constants.Source r11 = (app.chalo.constants.Source) r11
            java.lang.Object r8 = r0.L$2
            r10 = r8
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r10 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r10
            java.lang.Object r8 = r0.L$1
            app.chalo.ble_communication.BLEDataTransmissionFailureReason r8 = (app.chalo.ble_communication.BLEDataTransmissionFailureReason) r8
            java.lang.Object r2 = r0.L$0
            app.chalo.ble_communication.model.BLETransferData$OneWayBroadcastBLETransferData r2 = (app.chalo.ble_communication.model.BLETransferData.OneWayBroadcastBLETransferData) r2
            kotlin.ResultKt.b(r13)
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            goto L7e
        L5b:
            kotlin.ResultKt.b(r13)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r13 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.START_ACTIVE_MODE_BROADCAST_FAILED
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r12
            r0.L$5 = r13
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r2 = r6.s(r13, r0)
            if (r2 != r1) goto L77
            goto Lbc
        L77:
            r5 = r9
            r9 = r8
            r8 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r5
        L7e:
            r6.g = r11
            if (r13 == 0) goto L87
            java.util.LinkedHashMap r13 = kotlin.collections.MapsKt.u(r13)
            goto L8c
        L87:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
        L8c:
            d(r13, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r10)
            java.lang.String r10 = "failureCount"
            r13.put(r10, r7)
            java.lang.String r7 = "failureReason"
            java.lang.String r9 = r9.name()
            r13.put(r7, r9)
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.L$4 = r7
            r0.L$5 = r7
            r0.label = r3
            r7 = r6
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r0
            java.lang.Object r8 = r7.e(r8, r9, r10, r11, r12)
            if (r8 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.l(app.chalo.ble_communication.model.BLETransferData$OneWayBroadcastBLETransferData, app.chalo.ble_communication.BLEDataTransmissionFailureReason, int, app.chalo.validationsdk.blevalidation.helper.ProductForLogging, app.chalo.constants.Source, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (e(r8, r10, r11, r0, r12) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(app.chalo.ble_communication.model.BLETransferData.OneWayBroadcastBLETransferData r7, int r8, app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9, app.chalo.constants.Source r10, java.util.Map r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastSuccess$1
            if (r0 == 0) goto L14
            r0 = r12
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastSuccess$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastSuccess$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartActiveModeBroadcastSuccess$1
            r0.<init>(r6, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r12.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r0)
            goto Laa
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r8 = r12.I$0
            java.lang.Object r7 = r12.L$4
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r7 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r7
            java.lang.Object r9 = r12.L$3
            r11 = r9
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r9 = r12.L$2
            r10 = r9
            app.chalo.constants.Source r10 = (app.chalo.constants.Source) r10
            java.lang.Object r9 = r12.L$1
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r9
            java.lang.Object r2 = r12.L$0
            app.chalo.ble_communication.model.BLETransferData$OneWayBroadcastBLETransferData r2 = (app.chalo.ble_communication.model.BLETransferData.OneWayBroadcastBLETransferData) r2
            kotlin.ResultKt.b(r0)
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            goto L77
        L57:
            kotlin.ResultKt.b(r0)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r0 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.START_ACTIVE_MODE_BROADCAST_SUCCESS
            r12.L$0 = r7
            r12.L$1 = r9
            r12.L$2 = r10
            r12.L$3 = r11
            r12.L$4 = r0
            r12.I$0 = r8
            r12.label = r4
            java.lang.Object r2 = r6.s(r0, r12)
            if (r2 != r1) goto L71
            goto La9
        L71:
            r5 = r9
            r9 = r8
            r8 = r0
            r0 = r11
            r11 = r10
            r10 = r5
        L77:
            r6.g = r10
            if (r0 == 0) goto L80
            java.util.LinkedHashMap r0 = kotlin.collections.MapsKt.u(r0)
            goto L85
        L80:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L85:
            d(r0, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r9)
            java.lang.String r9 = "failureCount"
            r0.put(r9, r7)
            r7 = 0
            r12.L$0 = r7
            r12.L$1 = r7
            r12.L$2 = r7
            r12.L$3 = r7
            r12.L$4 = r7
            r12.label = r3
            r7 = r6
            r9 = r10
            r10 = r11
            r11 = r0
            java.lang.Object r8 = r7.e(r8, r9, r10, r11, r12)
            if (r8 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.m(app.chalo.ble_communication.model.BLETransferData$OneWayBroadcastBLETransferData, int, app.chalo.validationsdk.blevalidation.helper.ProductForLogging, app.chalo.constants.Source, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        if (e(r8, r11, r12, r13, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(byte[] r7, app.chalo.ble_communication.BLECommunicationServiceInitializationFailureReason r8, int r9, app.chalo.validationsdk.blevalidation.helper.ProductForLogging r10, app.chalo.constants.Source r11, java.util.Map r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpFailed$1
            if (r0 == 0) goto L13
            r0 = r13
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpFailed$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpFailed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpFailed$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpFailed$1
            r0.<init>(r6, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r13)
            goto Lc3
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            int r9 = r0.I$0
            java.lang.Object r7 = r0.L$5
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r7 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r7
            java.lang.Object r8 = r0.L$4
            r12 = r8
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r8 = r0.L$3
            r11 = r8
            app.chalo.constants.Source r11 = (app.chalo.constants.Source) r11
            java.lang.Object r8 = r0.L$2
            r10 = r8
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r10 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r10
            java.lang.Object r8 = r0.L$1
            app.chalo.ble_communication.BLECommunicationServiceInitializationFailureReason r8 = (app.chalo.ble_communication.BLECommunicationServiceInitializationFailureReason) r8
            java.lang.Object r2 = r0.L$0
            byte[] r2 = (byte[]) r2
            kotlin.ResultKt.b(r13)
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            goto L7e
        L5b:
            kotlin.ResultKt.b(r13)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r13 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.START_DUPLEX_CONNECTION_OPERATION_FAILED
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r12
            r0.L$5 = r13
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r2 = r6.s(r13, r0)
            if (r2 != r1) goto L77
            goto Lc2
        L77:
            r5 = r9
            r9 = r8
            r8 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r5
        L7e:
            r6.g = r11
            if (r13 == 0) goto L87
            java.util.LinkedHashMap r13 = kotlin.collections.MapsKt.u(r13)
            goto L8c
        L87:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
        L8c:
            java.lang.String r2 = "data"
            java.lang.String r7 = r7.toString()
            r13.put(r2, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r10)
            java.lang.String r10 = "failureCount"
            r13.put(r10, r7)
            java.lang.String r7 = "failureReason"
            java.lang.String r9 = r9.name()
            r13.put(r7, r9)
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.L$4 = r7
            r0.L$5 = r7
            r0.label = r3
            r7 = r6
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r0
            java.lang.Object r8 = r7.e(r8, r9, r10, r11, r12)
            if (r8 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.n(byte[], app.chalo.ble_communication.BLECommunicationServiceInitializationFailureReason, int, app.chalo.validationsdk.blevalidation.helper.ProductForLogging, app.chalo.constants.Source, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (e(r8, r10, r11, r0, r12) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(byte[] r7, int r8, app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9, app.chalo.constants.Source r10, java.util.Map r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpSuccess$1
            if (r0 == 0) goto L14
            r0 = r12
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpSuccess$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpSuccess$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOpSuccess$1
            r0.<init>(r6, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r12.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r0)
            goto Lb0
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r8 = r12.I$0
            java.lang.Object r7 = r12.L$4
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r7 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r7
            java.lang.Object r9 = r12.L$3
            r11 = r9
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r9 = r12.L$2
            r10 = r9
            app.chalo.constants.Source r10 = (app.chalo.constants.Source) r10
            java.lang.Object r9 = r12.L$1
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r9
            java.lang.Object r2 = r12.L$0
            byte[] r2 = (byte[]) r2
            kotlin.ResultKt.b(r0)
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            goto L77
        L57:
            kotlin.ResultKt.b(r0)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r0 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.START_DUPLEX_CONNECTION_OPERATION_SUCCESS
            r12.L$0 = r7
            r12.L$1 = r9
            r12.L$2 = r10
            r12.L$3 = r11
            r12.L$4 = r0
            r12.I$0 = r8
            r12.label = r4
            java.lang.Object r2 = r6.s(r0, r12)
            if (r2 != r1) goto L71
            goto Laf
        L71:
            r5 = r9
            r9 = r8
            r8 = r0
            r0 = r11
            r11 = r10
            r10 = r5
        L77:
            r6.g = r10
            if (r0 == 0) goto L80
            java.util.LinkedHashMap r0 = kotlin.collections.MapsKt.u(r0)
            goto L85
        L80:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L85:
            java.lang.String r2 = "data"
            java.lang.String r7 = r7.toString()
            r0.put(r2, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r9)
            java.lang.String r9 = "failureCount"
            r0.put(r9, r7)
            r7 = 0
            r12.L$0 = r7
            r12.L$1 = r7
            r12.L$2 = r7
            r12.L$3 = r7
            r12.L$4 = r7
            r12.label = r3
            r7 = r6
            r9 = r10
            r10 = r11
            r11 = r0
            java.lang.Object r8 = r7.e(r8, r9, r10, r11, r12)
            if (r8 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.o(byte[], int, app.chalo.validationsdk.blevalidation.helper.ProductForLogging, app.chalo.constants.Source, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (e(r8, r10, r11, r0, r12) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(byte[] r7, int r8, app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9, app.chalo.constants.Source r10, java.util.Map r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOperationCalled$1
            if (r0 == 0) goto L14
            r0 = r12
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOperationCalled$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOperationCalled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOperationCalled$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStartDuplexConnectionOperationCalled$1
            r0.<init>(r6, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r12.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r0)
            goto Lb0
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r8 = r12.I$0
            java.lang.Object r7 = r12.L$4
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r7 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r7
            java.lang.Object r9 = r12.L$3
            r11 = r9
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r9 = r12.L$2
            r10 = r9
            app.chalo.constants.Source r10 = (app.chalo.constants.Source) r10
            java.lang.Object r9 = r12.L$1
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r9
            java.lang.Object r2 = r12.L$0
            byte[] r2 = (byte[]) r2
            kotlin.ResultKt.b(r0)
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            goto L77
        L57:
            kotlin.ResultKt.b(r0)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r0 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.START_DUPLEX_CONNECTION_OPERATION_CALLED
            r12.L$0 = r7
            r12.L$1 = r9
            r12.L$2 = r10
            r12.L$3 = r11
            r12.L$4 = r0
            r12.I$0 = r8
            r12.label = r4
            java.lang.Object r2 = r6.s(r0, r12)
            if (r2 != r1) goto L71
            goto Laf
        L71:
            r5 = r9
            r9 = r8
            r8 = r0
            r0 = r11
            r11 = r10
            r10 = r5
        L77:
            r6.g = r10
            if (r0 == 0) goto L80
            java.util.LinkedHashMap r0 = kotlin.collections.MapsKt.u(r0)
            goto L85
        L80:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L85:
            java.lang.String r2 = "data"
            java.lang.String r7 = r7.toString()
            r0.put(r2, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r9)
            java.lang.String r9 = "failureCount"
            r0.put(r9, r7)
            r7 = 0
            r12.L$0 = r7
            r12.L$1 = r7
            r12.L$2 = r7
            r12.L$3 = r7
            r12.L$4 = r7
            r12.label = r3
            r7 = r6
            r9 = r10
            r10 = r11
            r11 = r0
            java.lang.Object r8 = r7.e(r8, r9, r10, r11, r12)
            if (r8 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.p(byte[], int, app.chalo.validationsdk.blevalidation.helper.ProductForLogging, app.chalo.constants.Source, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (e(r8, null, r4, r5, r6) == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(app.chalo.constants.Source r8, java.util.Map r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopAllBLEOperationsAndSwitchOffBluetoothIfNeededCalled$1
            if (r0 == 0) goto L14
            r0 = r10
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopAllBLEOperationsAndSwitchOffBluetoothIfNeededCalled$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopAllBLEOperationsAndSwitchOffBluetoothIfNeededCalled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopAllBLEOperationsAndSwitchOffBluetoothIfNeededCalled$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopAllBLEOperationsAndSwitchOffBluetoothIfNeededCalled$1
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r10)
            goto L7c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r6.L$2
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r8 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r8
            java.lang.Object r9 = r6.L$1
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r1 = r6.L$0
            app.chalo.constants.Source r1 = (app.chalo.constants.Source) r1
            kotlin.ResultKt.b(r10)
            r4 = r1
            goto L5b
        L45:
            kotlin.ResultKt.b(r10)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r10 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.STOP_ALL_BLE_OP_AND_SWITCH_OFF_BLUETOOTH_CALLED
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r10
            r6.label = r3
            java.lang.Object r1 = r7.s(r10, r6)
            if (r1 != r0) goto L59
            goto L7b
        L59:
            r4 = r8
            r8 = r10
        L5b:
            if (r9 == 0) goto L63
            java.util.LinkedHashMap r9 = kotlin.collections.MapsKt.u(r9)
        L61:
            r5 = r9
            goto L69
        L63:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            goto L61
        L69:
            r9 = 0
            r6.L$0 = r9
            r6.L$1 = r9
            r6.L$2 = r9
            r6.label = r2
            r3 = 0
            r1 = r7
            r2 = r8
            java.lang.Object r8 = r1.e(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L7c
        L7b:
            return r0
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.q(app.chalo.constants.Source, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (e(r8, null, r4, r5, r6) == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(app.chalo.constants.Source r8, java.util.Map r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBLEActiveModeBroadcastCalled$1
            if (r0 == 0) goto L14
            r0 = r10
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBLEActiveModeBroadcastCalled$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBLEActiveModeBroadcastCalled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBLEActiveModeBroadcastCalled$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBLEActiveModeBroadcastCalled$1
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r10)
            goto L7c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r6.L$2
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r8 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r8
            java.lang.Object r9 = r6.L$1
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r1 = r6.L$0
            app.chalo.constants.Source r1 = (app.chalo.constants.Source) r1
            kotlin.ResultKt.b(r10)
            r4 = r1
            goto L5b
        L45:
            kotlin.ResultKt.b(r10)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r10 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.STOP_BLE_ACTIVE_MODE_BROADCAST
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r10
            r6.label = r3
            java.lang.Object r1 = r7.s(r10, r6)
            if (r1 != r0) goto L59
            goto L7b
        L59:
            r4 = r8
            r8 = r10
        L5b:
            if (r9 == 0) goto L63
            java.util.LinkedHashMap r9 = kotlin.collections.MapsKt.u(r9)
        L61:
            r5 = r9
            goto L69
        L63:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            goto L61
        L69:
            r9 = 0
            r6.L$0 = r9
            r6.L$1 = r9
            r6.L$2 = r9
            r6.label = r2
            r3 = 0
            r1 = r7
            r2 = r8
            java.lang.Object r8 = r1.e(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L7c
        L7b:
            return r0
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.r(app.chalo.constants.Source, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(BLEEventType bLEEventType, ContinuationImpl continuationImpl) {
        TwoWayBleCommPilotLogger$recordEventTime$1 twoWayBleCommPilotLogger$recordEventTime$1;
        Mutex mutex;
        long j;
        if (continuationImpl instanceof TwoWayBleCommPilotLogger$recordEventTime$1) {
            twoWayBleCommPilotLogger$recordEventTime$1 = (TwoWayBleCommPilotLogger$recordEventTime$1) continuationImpl;
            int i = twoWayBleCommPilotLogger$recordEventTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                twoWayBleCommPilotLogger$recordEventTime$1.label = i - Integer.MIN_VALUE;
            } else {
                twoWayBleCommPilotLogger$recordEventTime$1 = new TwoWayBleCommPilotLogger$recordEventTime$1(this, continuationImpl);
            }
        } else {
            twoWayBleCommPilotLogger$recordEventTime$1 = new TwoWayBleCommPilotLogger$recordEventTime$1(this, continuationImpl);
        }
        Object obj = twoWayBleCommPilotLogger$recordEventTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = twoWayBleCommPilotLogger$recordEventTime$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            long jE = this.b.e();
            twoWayBleCommPilotLogger$recordEventTime$1.L$0 = bLEEventType;
            mutex = this.e;
            twoWayBleCommPilotLogger$recordEventTime$1.L$1 = mutex;
            twoWayBleCommPilotLogger$recordEventTime$1.J$0 = jE;
            twoWayBleCommPilotLogger$recordEventTime$1.label = 1;
            if (mutex.a(twoWayBleCommPilotLogger$recordEventTime$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = jE;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = twoWayBleCommPilotLogger$recordEventTime$1.J$0;
            Mutex mutex2 = (Mutex) twoWayBleCommPilotLogger$recordEventTime$1.L$1;
            BLEEventType bLEEventType2 = (BLEEventType) twoWayBleCommPilotLogger$recordEventTime$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            bLEEventType = bLEEventType2;
        }
        try {
            this.f.put(bLEEventType, new Long(j));
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r8 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(app.chalo.validationsdk.blevalidation.helper.BLEEventType r6, app.chalo.validationsdk.blevalidation.helper.ProductForLogging r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$shouldLogEvent$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$shouldLogEvent$1 r0 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$shouldLogEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$shouldLogEvent$1 r0 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$shouldLogEvent$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$1
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger r6 = (app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger) r6
            java.lang.Object r7 = r0.L$0
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r7 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r7
            kotlin.ResultKt.b(r8)
            goto L78
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.L$0
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r6 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r6
            kotlin.ResultKt.b(r8)
            goto L5e
        L42:
            kotlin.ResultKt.b(r8)
            java.util.Set r8 = r5.d
            if (r8 != 0) goto L7d
            java.lang.String r8 = r7.f10559a
            java.lang.String r2 = "default"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r2)
            if (r8 == 0) goto L69
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r5.f(r7, r0)
            if (r8 != r1) goto L5e
            goto L75
        L5e:
            java.util.Set r8 = (java.util.Set) r8
            boolean r6 = r8.contains(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L69:
            r0.L$0 = r6
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r5.f(r7, r0)
            if (r8 != r1) goto L76
        L75:
            return r1
        L76:
            r7 = r6
            r6 = r5
        L78:
            java.util.Set r8 = (java.util.Set) r8
            r6.d = r8
            r6 = r7
        L7d:
            java.util.Set r7 = r5.d
            if (r7 == 0) goto L86
            boolean r6 = r7.contains(r6)
            goto L87
        L86:
            r6 = 0
        L87:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.t(app.chalo.validationsdk.blevalidation.helper.BLEEventType, app.chalo.validationsdk.blevalidation.helper.ProductForLogging, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
