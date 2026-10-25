package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopInfoUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopInfoUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f4616a;
    public final TextUIState.StyledTextUIState b;

    public StopInfoUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.StyledTextUIState styledTextUIState) {
        this.f4616a = chaloTextUIState;
        this.b = styledTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopInfoUiState)) {
            return false;
        }
        StopInfoUiState stopInfoUiState = (StopInfoUiState) obj;
        return Intrinsics.d(this.f4616a, stopInfoUiState.f4616a) && Intrinsics.d(this.b, stopInfoUiState.b);
    }

    public final int hashCode() {
        int iHashCode = this.f4616a.hashCode() * 31;
        TextUIState.StyledTextUIState styledTextUIState = this.b;
        return iHashCode + (styledTextUIState == null ? 0 : styledTextUIState.hashCode());
    }

    public final String toString() {
        return "StopInfoUiState(stopName=" + this.f4616a + ", nearbyPlace=" + this.b + ")";
    }
}
