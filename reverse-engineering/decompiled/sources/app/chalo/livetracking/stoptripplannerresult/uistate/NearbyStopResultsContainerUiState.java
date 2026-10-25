package app.chalo.livetracking.stoptripplannerresult.uistate;

import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/NearbyStopResultsContainerUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopResultsContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearbyStopResultsContainerUiSpec f4601a;
    public final NearbyStopResultsContainerHeaderUIState b;
    public final List c;
    public final boolean d;

    public NearbyStopResultsContainerUiState(NearbyStopResultsContainerHeaderUIState nearbyStopResultsContainerHeaderUIState, List itineraryList, boolean z) {
        NearbyStopResultsContainerUiSpec nearbyStopResultsContainerUiSpec = new NearbyStopResultsContainerUiSpec();
        Intrinsics.i(itineraryList, "itineraryList");
        this.f4601a = nearbyStopResultsContainerUiSpec;
        this.b = nearbyStopResultsContainerHeaderUIState;
        this.c = itineraryList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopResultsContainerUiState)) {
            return false;
        }
        NearbyStopResultsContainerUiState nearbyStopResultsContainerUiState = (NearbyStopResultsContainerUiState) obj;
        return Intrinsics.d(this.f4601a, nearbyStopResultsContainerUiState.f4601a) && Intrinsics.d(this.b, nearbyStopResultsContainerUiState.b) && Intrinsics.d(this.c, nearbyStopResultsContainerUiState.c) && this.d == nearbyStopResultsContainerUiState.d;
    }

    public final int hashCode() {
        return r30.b((this.b.hashCode() + (this.f4601a.hashCode() * 31)) * 31, 31, this.c) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "NearbyStopResultsContainerUiState(specs=" + this.f4601a + ", headerUIState=" + this.b + ", itineraryList=" + this.c + ", isCollapsed=" + this.d + ")";
    }
}
