package app.chalo.ble_communication.mapper;

import app.chalo.ble_communication.BLEDataTransmissionFailureReason;
import app.chalo.ble_communication.feature.BluetoothTurnOnFailureReason;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ble-communication_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BluetoothHardwareOperationsMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1129a;

        static {
            int[] iArr = new int[BluetoothTurnOnFailureReason.values().length];
            try {
                iArr[BluetoothTurnOnFailureReason.BLUETOOTH_PERMISSION_NOT_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BluetoothTurnOnFailureReason.BLE_NOT_AVAILABLE_ON_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BluetoothTurnOnFailureReason.TURN_ON_OPERATION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BluetoothTurnOnFailureReason.BLUETOOTH_NEEDS_TO_BE_TURNED_ON_MANUALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1129a = iArr;
        }
    }

    public static final BLEDataTransmissionFailureReason a(BluetoothTurnOnFailureReason bluetoothTurnOnFailureReason) {
        Intrinsics.i(bluetoothTurnOnFailureReason, "<this>");
        int i = WhenMappings.f1129a[bluetoothTurnOnFailureReason.ordinal()];
        if (i == 1) {
            return BLEDataTransmissionFailureReason.REQUIRED_PERMISSIONS_NOT_GRANTED;
        }
        if (i == 2) {
            return BLEDataTransmissionFailureReason.BLE_HARDWARE_NOT_AVAILABLE_ON_DEVICE;
        }
        if (i == 3) {
            return BLEDataTransmissionFailureReason.BLE_TURN_ON_OPERATION_FAILED;
        }
        if (i == 4) {
            return BLEDataTransmissionFailureReason.BLE_NEEDS_TO_BE_TURNED_ON_MANUALLY;
        }
        throw new NoWhenBranchMatchedException();
    }
}
