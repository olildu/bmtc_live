package app.chalo.resultstatemanager;

import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/resultstatemanager/ResultDataInternalState;", "", "DataFlowState", "LifecycleTransition", "Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState;", "Lapp/chalo/resultstatemanager/ResultDataInternalState$LifecycleTransition;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class ResultDataInternalState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState;", "T", "Lapp/chalo/resultstatemanager/ResultDataInternalState;", "WaitingForResult", "ResultReceived", "Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState$ResultReceived;", "Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState$WaitingForResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DataFlowState<T> extends ResultDataInternalState {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState$ResultReceived;", "T", "Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ResultReceived<T> extends DataFlowState<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f9037a;

            public ResultReceived(Object obj) {
                this.f9037a = obj;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResultReceived) && Intrinsics.d(this.f9037a, ((ResultReceived) obj).f9037a);
            }

            public final int hashCode() {
                Object obj = this.f9037a;
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            }

            public final String toString() {
                return n21.f(this.f9037a, "ResultReceived(data=", ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState$WaitingForResult;", "T", "Lapp/chalo/resultstatemanager/ResultDataInternalState$DataFlowState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WaitingForResult<T> extends DataFlowState<T> {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/ResultDataInternalState$LifecycleTransition;", "Lapp/chalo/resultstatemanager/ResultDataInternalState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LifecycleTransition extends ResultDataInternalState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f9038a;
        public final Boolean b;

        public LifecycleTransition(Boolean bool, Boolean bool2) {
            this.f9038a = bool;
            this.b = bool2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LifecycleTransition)) {
                return false;
            }
            LifecycleTransition lifecycleTransition = (LifecycleTransition) obj;
            return Intrinsics.d(this.f9038a, lifecycleTransition.f9038a) && Intrinsics.d(this.b, lifecycleTransition.b);
        }

        public final int hashCode() {
            Boolean bool = this.f9038a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.b;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            return "LifecycleTransition(previousStateActive=" + this.f9038a + ", currentStateActive=" + this.b + ")";
        }
    }
}
