package app.chalo.ble_communication;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ble_communication/BLETerminalOperationStatus;", "", InitializationStatus.SUCCESS, "Failure", "Lapp/chalo/ble_communication/BLETerminalOperationStatus$Failure;", "Lapp/chalo/ble_communication/BLETerminalOperationStatus$Success;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BLETerminalOperationStatus {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLETerminalOperationStatus$Failure;", "Lapp/chalo/ble_communication/BLETerminalOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends BLETerminalOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SilentRideOperationFailureReason f1103a;

        public Failure(SilentRideOperationFailureReason silentRideOperationFailureReason) {
            this.f1103a = silentRideOperationFailureReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.d(this.f1103a, ((Failure) obj).f1103a);
        }

        public final int hashCode() {
            return this.f1103a.hashCode();
        }

        public final String toString() {
            return "Failure(failureReason=" + this.f1103a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLETerminalOperationStatus$Success;", "Lapp/chalo/ble_communication/BLETerminalOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends BLETerminalOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f1104a = new Success();
    }
}
