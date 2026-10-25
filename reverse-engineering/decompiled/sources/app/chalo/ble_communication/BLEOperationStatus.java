package app.chalo.ble_communication;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus;", "", InitializationStatus.SUCCESS, "FailedFromSL", "InProgress", "NotStarted", "Rejected", "FailureAwaited", "SuccessAwaited", "Validate", "Lapp/chalo/ble_communication/BLEOperationStatus$FailedFromSL;", "Lapp/chalo/ble_communication/BLEOperationStatus$FailureAwaited;", "Lapp/chalo/ble_communication/BLEOperationStatus$InProgress;", "Lapp/chalo/ble_communication/BLEOperationStatus$NotStarted;", "Lapp/chalo/ble_communication/BLEOperationStatus$Rejected;", "Lapp/chalo/ble_communication/BLEOperationStatus$Success;", "Lapp/chalo/ble_communication/BLEOperationStatus$SuccessAwaited;", "Lapp/chalo/ble_communication/BLEOperationStatus$Validate;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BLEOperationStatus {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus$FailedFromSL;", "Lapp/chalo/ble_communication/BLEOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FailedFromSL extends BLEOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1095a;
        public final int b;

        public FailedFromSL(String str, int i) {
            this.f1095a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedFromSL)) {
                return false;
            }
            FailedFromSL failedFromSL = (FailedFromSL) obj;
            return Intrinsics.d(this.f1095a, failedFromSL.f1095a) && this.b == failedFromSL.b;
        }

        public final int hashCode() {
            String str = this.f1095a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "FailedFromSL(message=", this.f1095a, ", statusCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus$FailureAwaited;", "Lapp/chalo/ble_communication/BLEOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FailureAwaited extends BLEOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1096a;
        public final int b;

        public FailureAwaited(String str, int i) {
            this.f1096a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailureAwaited)) {
                return false;
            }
            FailureAwaited failureAwaited = (FailureAwaited) obj;
            return Intrinsics.d(this.f1096a, failureAwaited.f1096a) && this.b == failureAwaited.b;
        }

        public final int hashCode() {
            String str = this.f1096a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "FailureAwaited(message=", this.f1096a, ", statusCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus$InProgress;", "Lapp/chalo/ble_communication/BLEOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InProgress extends BLEOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1097a;
        public final int b;

        public InProgress(String str, int i) {
            this.f1097a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) obj;
            return Intrinsics.d(this.f1097a, inProgress.f1097a) && this.b == inProgress.b;
        }

        public final int hashCode() {
            String str = this.f1097a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "InProgress(message=", this.f1097a, ", statusCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus$NotStarted;", "Lapp/chalo/ble_communication/BLEOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotStarted extends BLEOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1098a;
        public final int b;

        public NotStarted(String str, int i) {
            this.f1098a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotStarted)) {
                return false;
            }
            NotStarted notStarted = (NotStarted) obj;
            return Intrinsics.d(this.f1098a, notStarted.f1098a) && this.b == notStarted.b;
        }

        public final int hashCode() {
            String str = this.f1098a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "NotStarted(message=", this.f1098a, ", statusCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus$Rejected;", "Lapp/chalo/ble_communication/BLEOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rejected extends BLEOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1099a;
        public final int b;

        public Rejected(String str, int i) {
            this.f1099a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rejected)) {
                return false;
            }
            Rejected rejected = (Rejected) obj;
            return Intrinsics.d(this.f1099a, rejected.f1099a) && this.b == rejected.b;
        }

        public final int hashCode() {
            String str = this.f1099a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "Rejected(message=", this.f1099a, ", statusCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus$Success;", "Lapp/chalo/ble_communication/BLEOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends BLEOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f1100a = new Success();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus$SuccessAwaited;", "Lapp/chalo/ble_communication/BLEOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessAwaited extends BLEOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1101a;
        public final int b;

        public SuccessAwaited(String str, int i) {
            this.f1101a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessAwaited)) {
                return false;
            }
            SuccessAwaited successAwaited = (SuccessAwaited) obj;
            return Intrinsics.d(this.f1101a, successAwaited.f1101a) && this.b == successAwaited.b;
        }

        public final int hashCode() {
            String str = this.f1101a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "SuccessAwaited(message=", this.f1101a, ", statusCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/BLEOperationStatus$Validate;", "Lapp/chalo/ble_communication/BLEOperationStatus;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Validate extends BLEOperationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1102a;
        public final int b;

        public Validate(String str, int i) {
            this.f1102a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Validate)) {
                return false;
            }
            Validate validate = (Validate) obj;
            return Intrinsics.d(this.f1102a, validate.f1102a) && this.b == validate.b;
        }

        public final int hashCode() {
            String str = this.f1102a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "Validate(message=", this.f1102a, ", statusCode=", ")");
        }
    }
}
