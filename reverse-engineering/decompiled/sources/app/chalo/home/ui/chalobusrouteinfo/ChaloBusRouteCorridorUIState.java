package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteCorridorUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteCorridorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloBusRouteCorridorUISpec f3308a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final ImageUIState f;
    public final List g;
    public final ChaloBusRouteSuggestionCardUiState h;
    public final DividerUIState i;
    public final UiEventHandler j;

    public ChaloBusRouteCorridorUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState startName, ImageUIState arrowImage, TextUIState.ChaloTextUIState endName, ImageUIState trailingIcon, List routes, ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState, UiEventHandler onExpandCollapseClick) {
        ChaloBusRouteCorridorUISpec chaloBusRouteCorridorUISpec = new ChaloBusRouteCorridorUISpec();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.LightGrey.f9815a, null, 4);
        Intrinsics.i(startName, "startName");
        Intrinsics.i(arrowImage, "arrowImage");
        Intrinsics.i(endName, "endName");
        Intrinsics.i(trailingIcon, "trailingIcon");
        Intrinsics.i(routes, "routes");
        Intrinsics.i(onExpandCollapseClick, "onExpandCollapseClick");
        this.f3308a = chaloBusRouteCorridorUISpec;
        this.b = chaloTextUIState;
        this.c = startName;
        this.d = arrowImage;
        this.e = endName;
        this.f = trailingIcon;
        this.g = routes;
        this.h = chaloBusRouteSuggestionCardUiState;
        this.i = dividerUIState;
        this.j = onExpandCollapseClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteCorridorUIState)) {
            return false;
        }
        ChaloBusRouteCorridorUIState chaloBusRouteCorridorUIState = (ChaloBusRouteCorridorUIState) obj;
        return Intrinsics.d(this.f3308a, chaloBusRouteCorridorUIState.f3308a) && Intrinsics.d(this.b, chaloBusRouteCorridorUIState.b) && Intrinsics.d(this.c, chaloBusRouteCorridorUIState.c) && Intrinsics.d(this.d, chaloBusRouteCorridorUIState.d) && Intrinsics.d(this.e, chaloBusRouteCorridorUIState.e) && Intrinsics.d(this.f, chaloBusRouteCorridorUIState.f) && Intrinsics.d(this.g, chaloBusRouteCorridorUIState.g) && Intrinsics.d(this.h, chaloBusRouteCorridorUIState.h) && Intrinsics.d(this.i, chaloBusRouteCorridorUIState.i) && Intrinsics.d(this.j, chaloBusRouteCorridorUIState.j);
    }

    public final int hashCode() {
        int iHashCode = this.f3308a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iB = r30.b(r30.e(this.f, r30.f(this.e, r30.e(this.d, r30.f(this.c, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31), 31), 31), 31), 31, this.g);
        ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState = this.h;
        return this.j.hashCode() + py.c(this.i, (iB + (chaloBusRouteSuggestionCardUiState != null ? chaloBusRouteSuggestionCardUiState.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "ChaloBusRouteCorridorUIState(specs=" + this.f3308a + ", displayName=" + this.b + ", startName=" + this.c + ", arrowImage=" + this.d + ", endName=" + this.e + ", trailingIcon=" + this.f + ", routes=" + this.g + ", routeSuggestionCard=" + this.h + ", corridorDividerUIState=" + this.i + ", onExpandCollapseClick=" + this.j + ")";
    }
}
