package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/juspay/JuspaySdkStatus;", "", "NotInitialised", "Terminating", "Initialising", "Ready", "InitiationFailed", "Abandoned", "TerminationFailed", "Lapp/chalo/juspay/JuspaySdkStatus$Abandoned;", "Lapp/chalo/juspay/JuspaySdkStatus$Initialising;", "Lapp/chalo/juspay/JuspaySdkStatus$InitiationFailed;", "Lapp/chalo/juspay/JuspaySdkStatus$NotInitialised;", "Lapp/chalo/juspay/JuspaySdkStatus$Ready;", "Lapp/chalo/juspay/JuspaySdkStatus$Terminating;", "Lapp/chalo/juspay/JuspaySdkStatus$TerminationFailed;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JuspaySdkStatus {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkStatus$Abandoned;", "Lapp/chalo/juspay/JuspaySdkStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Abandoned implements JuspaySdkStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Abandoned f4069a = new Abandoned();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Abandoned);
        }

        public final int hashCode() {
            return -1093531712;
        }

        public final String toString() {
            return "Abandoned";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkStatus$Initialising;", "Lapp/chalo/juspay/JuspaySdkStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initialising implements JuspaySdkStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f4070a;

        public Initialising(Integer num) {
            this.f4070a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initialising) && Intrinsics.d(this.f4070a, ((Initialising) obj).f4070a);
        }

        public final int hashCode() {
            Integer num = this.f4070a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "Initialising(attempt=" + this.f4070a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkStatus$InitiationFailed;", "Lapp/chalo/juspay/JuspaySdkStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitiationFailed implements JuspaySdkStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JusPaySDKInitiateStatus f4071a;
        public final String b;

        public InitiationFailed(JusPaySDKInitiateStatus jusPaySDKInitiateStatus, String str) {
            this.f4071a = jusPaySDKInitiateStatus;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitiationFailed)) {
                return false;
            }
            InitiationFailed initiationFailed = (InitiationFailed) obj;
            return this.f4071a == initiationFailed.f4071a && Intrinsics.d(this.b, initiationFailed.b);
        }

        public final int hashCode() {
            JusPaySDKInitiateStatus jusPaySDKInitiateStatus = this.f4071a;
            int iHashCode = (jusPaySDKInitiateStatus == null ? 0 : jusPaySDKInitiateStatus.hashCode()) * 31;
            String str = this.b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "InitiationFailed(initiateStatus=" + this.f4071a + ", reason=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkStatus$NotInitialised;", "Lapp/chalo/juspay/JuspaySdkStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotInitialised implements JuspaySdkStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotInitialised f4072a = new NotInitialised();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotInitialised);
        }

        public final int hashCode() {
            return -449743538;
        }

        public final String toString() {
            return "NotInitialised";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkStatus$Ready;", "Lapp/chalo/juspay/JuspaySdkStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ready implements JuspaySdkStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ready f4073a = new Ready();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ready);
        }

        public final int hashCode() {
            return 1767875983;
        }

        public final String toString() {
            return "Ready";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkStatus$Terminating;", "Lapp/chalo/juspay/JuspaySdkStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Terminating implements JuspaySdkStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Terminating f4074a = new Terminating();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Terminating);
        }

        public final int hashCode() {
            return -1291259446;
        }

        public final String toString() {
            return "Terminating";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkStatus$TerminationFailed;", "Lapp/chalo/juspay/JuspaySdkStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TerminationFailed implements JuspaySdkStatus {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TerminationFailed);
        }

        public final int hashCode() {
            return 1276198457;
        }

        public final String toString() {
            return "TerminationFailed(reason=Juspay SDK termination state unknown)";
        }
    }
}
