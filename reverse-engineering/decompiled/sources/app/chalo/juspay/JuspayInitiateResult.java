package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/juspay/JuspayInitiateResult;", "", "Ready", "Failed", "Abandoned", "SdkStateUnknown", "Lapp/chalo/juspay/JuspayInitiateResult$Abandoned;", "Lapp/chalo/juspay/JuspayInitiateResult$Failed;", "Lapp/chalo/juspay/JuspayInitiateResult$Ready;", "Lapp/chalo/juspay/JuspayInitiateResult$SdkStateUnknown;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JuspayInitiateResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayInitiateResult$Abandoned;", "Lapp/chalo/juspay/JuspayInitiateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Abandoned implements JuspayInitiateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Abandoned f4047a = new Abandoned();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Abandoned);
        }

        public final int hashCode() {
            return -1507089938;
        }

        public final String toString() {
            return "Abandoned";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayInitiateResult$Failed;", "Lapp/chalo/juspay/JuspayInitiateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed implements JuspayInitiateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuspaySdkStatus f4048a;

        public Failed(JuspaySdkStatus juspaySdkStatus) {
            this.f4048a = juspaySdkStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.d(this.f4048a, ((Failed) obj).f4048a);
        }

        public final int hashCode() {
            return this.f4048a.hashCode();
        }

        public final String toString() {
            return "Failed(status=" + this.f4048a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayInitiateResult$Ready;", "Lapp/chalo/juspay/JuspayInitiateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ready implements JuspayInitiateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ready f4049a = new Ready();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ready);
        }

        public final int hashCode() {
            return 1745454781;
        }

        public final String toString() {
            return "Ready";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayInitiateResult$SdkStateUnknown;", "Lapp/chalo/juspay/JuspayInitiateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SdkStateUnknown implements JuspayInitiateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SdkStateUnknown f4050a = new SdkStateUnknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SdkStateUnknown);
        }

        public final int hashCode() {
            return -1107982227;
        }

        public final String toString() {
            return "SdkStateUnknown";
        }
    }
}
