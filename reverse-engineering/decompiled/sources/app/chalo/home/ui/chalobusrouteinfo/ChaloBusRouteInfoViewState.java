package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.uistate.text.TextUIState;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f3356a;
    public final ChaloBusRouteInfoScreenUISpec b;
    public final ChaloBusRouteInfoContentState c;
    public final ChaloBusRouteSuggestionBottomSheetUiState d;

    public ChaloBusRouteInfoViewState(TextUIState.ChaloTextUIState toolbarTitle, ChaloBusRouteInfoContentState contentState, ChaloBusRouteSuggestionBottomSheetUiState chaloBusRouteSuggestionBottomSheetUiState) {
        ChaloBusRouteInfoScreenUISpec chaloBusRouteInfoScreenUISpec = new ChaloBusRouteInfoScreenUISpec();
        Intrinsics.i(toolbarTitle, "toolbarTitle");
        Intrinsics.i(contentState, "contentState");
        this.f3356a = toolbarTitle;
        this.b = chaloBusRouteInfoScreenUISpec;
        this.c = contentState;
        this.d = chaloBusRouteSuggestionBottomSheetUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoViewState)) {
            return false;
        }
        ChaloBusRouteInfoViewState chaloBusRouteInfoViewState = (ChaloBusRouteInfoViewState) obj;
        return Intrinsics.d(this.f3356a, chaloBusRouteInfoViewState.f3356a) && Intrinsics.d(this.b, chaloBusRouteInfoViewState.b) && Intrinsics.d(this.c, chaloBusRouteInfoViewState.c) && Intrinsics.d(this.d, chaloBusRouteInfoViewState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + z40.b(this.b.f3331a, this.f3356a.hashCode() * 31, 31)) * 31;
        ChaloBusRouteSuggestionBottomSheetUiState chaloBusRouteSuggestionBottomSheetUiState = this.d;
        return iHashCode + (chaloBusRouteSuggestionBottomSheetUiState == null ? 0 : chaloBusRouteSuggestionBottomSheetUiState.hashCode());
    }

    public final String toString() {
        return "ChaloBusRouteInfoViewState(toolbarTitle=" + this.f3356a + ", specs=" + this.b + ", contentState=" + this.c + ", routeSuggestionBottomSheetUiState=" + this.d + ")";
    }
}
