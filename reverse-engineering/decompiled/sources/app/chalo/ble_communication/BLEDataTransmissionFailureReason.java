package app.chalo.ble_communication;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/ble_communication/BLEDataTransmissionFailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "BLE_HARDWARE_NOT_AVAILABLE_ON_DEVICE", "REQUIRED_PERMISSIONS_NOT_GRANTED", "BLE_TURN_ON_OPERATION_FAILED", "BLE_NEEDS_TO_BE_TURNED_ON_MANUALLY", "TIMED_OUT", "NO_CONNECTION", "CONNECTION_BUSY", "FAILED", "REJECTED", "UNKNOWN", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum BLEDataTransmissionFailureReason {
    BLE_HARDWARE_NOT_AVAILABLE_ON_DEVICE,
    REQUIRED_PERMISSIONS_NOT_GRANTED,
    BLE_TURN_ON_OPERATION_FAILED,
    BLE_NEEDS_TO_BE_TURNED_ON_MANUALLY,
    TIMED_OUT,
    NO_CONNECTION,
    CONNECTION_BUSY,
    FAILED,
    REJECTED,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    public static EnumEntries<BLEDataTransmissionFailureReason> getEntries() {
        return $ENTRIES;
    }
}
