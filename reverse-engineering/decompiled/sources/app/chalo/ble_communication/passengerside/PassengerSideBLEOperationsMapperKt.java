package app.chalo.ble_communication.passengerside;

import app.chalo.ble_communication.BLECommunicationRange;
import app.chalo.ble_communication.BLEDuplexConnectionStatus;
import com.silencelaboratories.silentride.states.SilentRideState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ble-communication_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PassengerSideBLEOperationsMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1138a;

        static {
            int[] iArr = new int[BLECommunicationRange.values().length];
            try {
                iArr[BLECommunicationRange.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BLECommunicationRange.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BLECommunicationRange.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1138a = iArr;
        }
    }

    public static final BLEDuplexConnectionStatus a(SilentRideState.Passenger.PassiveModeDriverDevice passiveModeDriverDevice) {
        Intrinsics.i(passiveModeDriverDevice, "<this>");
        if (passiveModeDriverDevice.equals(SilentRideState.Passenger.PassiveModeDriverDevice.Busy.c)) {
            return BLEDuplexConnectionStatus.CONNECTION_BUSY;
        }
        if (passiveModeDriverDevice.equals(SilentRideState.Passenger.PassiveModeDriverDevice.Connected.c)) {
            return BLEDuplexConnectionStatus.CONNECTED;
        }
        if (passiveModeDriverDevice.equals(SilentRideState.Passenger.PassiveModeDriverDevice.Disconnected.c)) {
            return BLEDuplexConnectionStatus.NOT_CONNECTED;
        }
        if (passiveModeDriverDevice.equals(SilentRideState.Passenger.PassiveModeDriverDevice.Ideal.c)) {
            return BLEDuplexConnectionStatus.CONNECTED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
