package app.chalo.ble_communication;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/ble_communication/SilentRideOperationFailureReason;", "", "TimedOut", "Unknown", "Failed", "Rejected", "Lapp/chalo/ble_communication/SilentRideOperationFailureReason$Failed;", "Lapp/chalo/ble_communication/SilentRideOperationFailureReason$Rejected;", "Lapp/chalo/ble_communication/SilentRideOperationFailureReason$TimedOut;", "Lapp/chalo/ble_communication/SilentRideOperationFailureReason$Unknown;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SilentRideOperationFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/SilentRideOperationFailureReason$Failed;", "Lapp/chalo/ble_communication/SilentRideOperationFailureReason;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Failed extends SilentRideOperationFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Failed f1105a = new Failed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/SilentRideOperationFailureReason$Rejected;", "Lapp/chalo/ble_communication/SilentRideOperationFailureReason;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Rejected extends SilentRideOperationFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Rejected f1106a = new Rejected();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/SilentRideOperationFailureReason$TimedOut;", "Lapp/chalo/ble_communication/SilentRideOperationFailureReason;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimedOut extends SilentRideOperationFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimedOut f1107a = new TimedOut();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/SilentRideOperationFailureReason$Unknown;", "Lapp/chalo/ble_communication/SilentRideOperationFailureReason;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends SilentRideOperationFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1108a;

        public Unknown(String str) {
            this.f1108a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.f1108a, ((Unknown) obj).f1108a);
        }

        public final int hashCode() {
            String str = this.f1108a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Unknown(message=", this.f1108a, ")");
        }
    }
}
