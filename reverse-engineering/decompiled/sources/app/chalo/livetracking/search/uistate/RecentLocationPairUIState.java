package app.chalo.livetracking.search.uistate;

import app.chalo.livetracking.stoptripplannerresult.uistate.RouteDetailsUiState;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/RecentLocationPairUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentLocationPairUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentLocationPairSpec f4512a;
    public final RouteDetailsUiState b;
    public final DividerUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public RecentLocationPairUIState(RecentLocationPairSpec spec, RouteDetailsUiState fromToPair, DividerUIState dividerUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        Intrinsics.i(spec, "spec");
        Intrinsics.i(fromToPair, "fromToPair");
        this.f4512a = spec;
        this.b = fromToPair;
        this.c = dividerUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentLocationPairUIState)) {
            return false;
        }
        RecentLocationPairUIState recentLocationPairUIState = (RecentLocationPairUIState) obj;
        return Intrinsics.d(this.f4512a, recentLocationPairUIState.f4512a) && Intrinsics.d(this.b, recentLocationPairUIState.b) && Intrinsics.d(this.c, recentLocationPairUIState.c) && this.d.equals(recentLocationPairUIState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f4512a.hashCode() * 31)) * 31;
        DividerUIState dividerUIState = this.c;
        return this.d.hashCode() + ((iHashCode + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "RecentLocationPairUIState(spec=" + this.f4512a + ", fromToPair=" + this.b + ", dividerUiState=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
