package app.chalo.ble_communication.mapper;

import app.chalo.ble_communication.BLEDataTransmissionFailureReason;
import app.chalo.ble_communication.BLETerminalOperationStatus;
import app.chalo.ble_communication.SilentRideOperationFailureReason;
import app.chalo.ble_communication.StopBLEPassiveModeFailureReason;
import app.chalo.ble_communication.base.BLEOperationResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ble-communication_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BLETerminalOpStatusToOpResultsMapperKt {
    public static final BLEOperationResult a(BLETerminalOperationStatus bLETerminalOperationStatus) {
        BLEDataTransmissionFailureReason bLEDataTransmissionFailureReason;
        Intrinsics.i(bLETerminalOperationStatus, "<this>");
        if (!(bLETerminalOperationStatus instanceof BLETerminalOperationStatus.Failure)) {
            if (bLETerminalOperationStatus.equals(BLETerminalOperationStatus.Success.f1104a)) {
                return new BLEOperationResult.Success();
            }
            throw new NoWhenBranchMatchedException();
        }
        SilentRideOperationFailureReason silentRideOperationFailureReason = ((BLETerminalOperationStatus.Failure) bLETerminalOperationStatus).f1103a;
        if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Failed.f1105a)) {
            bLEDataTransmissionFailureReason = BLEDataTransmissionFailureReason.FAILED;
        } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Rejected.f1106a)) {
            bLEDataTransmissionFailureReason = BLEDataTransmissionFailureReason.REJECTED;
        } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.TimedOut.f1107a)) {
            bLEDataTransmissionFailureReason = BLEDataTransmissionFailureReason.TIMED_OUT;
        } else {
            if (!(silentRideOperationFailureReason instanceof SilentRideOperationFailureReason.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            bLEDataTransmissionFailureReason = BLEDataTransmissionFailureReason.UNKNOWN;
        }
        return new BLEOperationResult.Failure(bLEDataTransmissionFailureReason);
    }

    public static final BLEOperationResult b(BLETerminalOperationStatus bLETerminalOperationStatus) {
        StopBLEPassiveModeFailureReason stopBLEPassiveModeFailureReason;
        Intrinsics.i(bLETerminalOperationStatus, "<this>");
        if (!(bLETerminalOperationStatus instanceof BLETerminalOperationStatus.Failure)) {
            if (bLETerminalOperationStatus.equals(BLETerminalOperationStatus.Success.f1104a)) {
                return new BLEOperationResult.Success();
            }
            throw new NoWhenBranchMatchedException();
        }
        SilentRideOperationFailureReason silentRideOperationFailureReason = ((BLETerminalOperationStatus.Failure) bLETerminalOperationStatus).f1103a;
        if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Failed.f1105a)) {
            stopBLEPassiveModeFailureReason = StopBLEPassiveModeFailureReason.FAILED;
        } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.Rejected.f1106a)) {
            stopBLEPassiveModeFailureReason = StopBLEPassiveModeFailureReason.REJECTED;
        } else if (silentRideOperationFailureReason.equals(SilentRideOperationFailureReason.TimedOut.f1107a)) {
            stopBLEPassiveModeFailureReason = StopBLEPassiveModeFailureReason.TIMED_OUT;
        } else {
            if (!(silentRideOperationFailureReason instanceof SilentRideOperationFailureReason.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            stopBLEPassiveModeFailureReason = StopBLEPassiveModeFailureReason.UNKNOWN;
        }
        return new BLEOperationResult.Failure(stopBLEPassiveModeFailureReason);
    }
}
