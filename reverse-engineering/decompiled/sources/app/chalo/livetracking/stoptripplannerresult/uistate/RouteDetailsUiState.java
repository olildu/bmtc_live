package app.chalo.livetracking.stoptripplannerresult.uistate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/RouteDetailsUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteDetailUiSpec f4608a;
    public final StopInfoUiState b;
    public final StopInfoUiState c;

    public RouteDetailsUiState(StopInfoUiState fromStop, StopInfoUiState stopInfoUiState) {
        RouteDetailUiSpec routeDetailUiSpec = new RouteDetailUiSpec();
        Intrinsics.i(fromStop, "fromStop");
        this.f4608a = routeDetailUiSpec;
        this.b = fromStop;
        this.c = stopInfoUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsUiState)) {
            return false;
        }
        RouteDetailsUiState routeDetailsUiState = (RouteDetailsUiState) obj;
        return Intrinsics.d(this.f4608a, routeDetailsUiState.f4608a) && Intrinsics.d(this.b, routeDetailsUiState.b) && Intrinsics.d(this.c, routeDetailsUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4608a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RouteDetailsUiState(specs=" + this.f4608a + ", fromStop=" + this.b + ", toStop=" + this.c + ")";
    }
}
