package app.chalo.validationsdk.blevalidation.helper;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BLEEventType;", "", "eventId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "START_ACTIVE_MODE_BROADCAST_CALLED", "START_ACTIVE_MODE_BROADCAST_SUCCESS", "START_ACTIVE_MODE_BROADCAST_FAILED", "START_DUPLEX_CONNECTION_OPERATION_CALLED", "START_DUPLEX_CONNECTION_OPERATION_SUCCESS", "START_DUPLEX_CONNECTION_OPERATION_FAILED", "SEND_DATA_ON_CONNECTION_CALLED", "SEND_DATA_ON_CONNECTION_SUCCESS", "SEND_DATA_ON_CONNECTION_FAILED", "CONNECTION_LIST_UPDATED", "CONNECTION_HISTORY_LIST_UPDATED", "DATA_RECEIVED_ON_CONNECTION", "STOP_BLE_VALIDATION_WITH_DELAY_CALLED", "STOP_BLE_VALIDATION_SUCCESS", "STOP_BLE_VALIDATION_FAILED", "STOP_BLE_ACTIVE_MODE_BROADCAST", "STOP_ALL_BLE_OP_AND_SWITCH_OFF_BLUETOOTH_CALLED", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum BLEEventType {
    START_ACTIVE_MODE_BROADCAST_CALLED("startActModeBrCalled"),
    START_ACTIVE_MODE_BROADCAST_SUCCESS("startActModeBrSuccess"),
    START_ACTIVE_MODE_BROADCAST_FAILED("startActModeBrFailed"),
    START_DUPLEX_CONNECTION_OPERATION_CALLED("startDuplexConnOpCalled"),
    START_DUPLEX_CONNECTION_OPERATION_SUCCESS("startDuplexConnOpSuccess"),
    START_DUPLEX_CONNECTION_OPERATION_FAILED("startDuplexConnOpFailed"),
    SEND_DATA_ON_CONNECTION_CALLED("sendDataOnConnCalled"),
    SEND_DATA_ON_CONNECTION_SUCCESS("sendDataOnConnSuccess"),
    SEND_DATA_ON_CONNECTION_FAILED("sendDataOnConnFailed"),
    CONNECTION_LIST_UPDATED("connListUpdated"),
    CONNECTION_HISTORY_LIST_UPDATED("connHistListUpdated"),
    DATA_RECEIVED_ON_CONNECTION("dataRecOnConn"),
    STOP_BLE_VALIDATION_WITH_DELAY_CALLED("stopBleValWithDelay"),
    STOP_BLE_VALIDATION_SUCCESS("stopBleValSuccess"),
    STOP_BLE_VALIDATION_FAILED("stopBleValFailed"),
    STOP_BLE_ACTIVE_MODE_BROADCAST("stopActModeBr"),
    STOP_ALL_BLE_OP_AND_SWITCH_OFF_BLUETOOTH_CALLED("stopBleOpAndSOBluetooth");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final String eventId;

    BLEEventType(String str) {
        this.eventId = str;
    }

    public static EnumEntries<BLEEventType> getEntries() {
        return $ENTRIES;
    }

    public final String getEventId() {
        return this.eventId;
    }
}
