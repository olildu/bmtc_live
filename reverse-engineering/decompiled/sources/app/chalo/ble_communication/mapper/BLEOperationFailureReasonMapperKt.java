package app.chalo.ble_communication.mapper;

import app.chalo.ble_communication.BLEBroadcastAdvertisementScanningInitializationFailureReason;
import app.chalo.ble_communication.BLEDuplexCommunicationInitializationFailureReason;
import app.chalo.ble_communication.StopBLEActiveModeBroadcastFailureReason;
import app.chalo.ble_communication.StopBLEActiveModeScanningFailureReason;
import app.chalo.ble_communication.StopBLEPassiveModeFailureReason;
import app.chalo.ble_communication.feature.BluetoothTurnOffFailureReason;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ble-communication_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BLEOperationFailureReasonMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1128a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;

        static {
            int[] iArr = new int[BLEBroadcastAdvertisementScanningInitializationFailureReason.values().length];
            try {
                iArr[BLEBroadcastAdvertisementScanningInitializationFailureReason.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BLEBroadcastAdvertisementScanningInitializationFailureReason.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BLEBroadcastAdvertisementScanningInitializationFailureReason.TIMED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BLEBroadcastAdvertisementScanningInitializationFailureReason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1128a = iArr;
            int[] iArr2 = new int[BLEDuplexCommunicationInitializationFailureReason.values().length];
            try {
                iArr2[BLEDuplexCommunicationInitializationFailureReason.TIMED_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BLEDuplexCommunicationInitializationFailureReason.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BLEDuplexCommunicationInitializationFailureReason.INITIALIZATION_CONFIG_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BLEDuplexCommunicationInitializationFailureReason.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BLEDuplexCommunicationInitializationFailureReason.REJECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
            int[] iArr3 = new int[StopBLEActiveModeBroadcastFailureReason.values().length];
            try {
                iArr3[StopBLEActiveModeBroadcastFailureReason.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[StopBLEActiveModeBroadcastFailureReason.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[StopBLEActiveModeBroadcastFailureReason.TIMED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[StopBLEActiveModeBroadcastFailureReason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            c = iArr3;
            int[] iArr4 = new int[StopBLEActiveModeScanningFailureReason.values().length];
            try {
                iArr4[StopBLEActiveModeScanningFailureReason.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[StopBLEActiveModeScanningFailureReason.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[StopBLEActiveModeScanningFailureReason.TIMED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[StopBLEActiveModeScanningFailureReason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            d = iArr4;
            int[] iArr5 = new int[StopBLEPassiveModeFailureReason.values().length];
            try {
                iArr5[StopBLEPassiveModeFailureReason.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[StopBLEPassiveModeFailureReason.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[StopBLEPassiveModeFailureReason.TIMED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[StopBLEPassiveModeFailureReason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            e = iArr5;
            int[] iArr6 = new int[BluetoothTurnOffFailureReason.values().length];
            try {
                iArr6[BluetoothTurnOffFailureReason.BLUETOOTH_PERMISSION_NOT_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[BluetoothTurnOffFailureReason.BLE_NOT_AVAILABLE_ON_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[BluetoothTurnOffFailureReason.TURN_OFF_OPERATION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[BluetoothTurnOffFailureReason.BLUETOOTH_NEEDS_TO_BE_TURNED_OFF_MANUALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            f = iArr6;
        }
    }
}
