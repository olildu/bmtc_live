package app.chalo.livetracking.search;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopTripResultState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopTripResultState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4502a;
    public final StopTripResultAction b;

    public StopTripResultState(long j, StopTripResultAction action) {
        Intrinsics.i(action, "action");
        this.f4502a = j;
        this.b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripResultState)) {
            return false;
        }
        StopTripResultState stopTripResultState = (StopTripResultState) obj;
        return this.f4502a == stopTripResultState.f4502a && this.b == stopTripResultState.b;
    }

    public final int hashCode() {
        long j = this.f4502a;
        return this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "StopTripResultState(timeStamp=" + this.f4502a + ", action=" + this.b + ")";
    }
}
