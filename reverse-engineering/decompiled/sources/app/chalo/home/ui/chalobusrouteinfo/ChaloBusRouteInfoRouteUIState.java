package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoRouteUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoRouteUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteNameAndIconUIState f3330a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final ClickableTextUiState f;
    public final DividerUIState g;
    public final ChaloBusRouteInfoRouteUISpec h;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloBusRouteInfoRouteUIState(RouteNameAndIconUIState routeNameAndIconUIState, TextUIState.ChaloTextUIState routeDisplayName, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState timeRangeIcon, TextUIState.ChaloTextUIState chaloTextUIState2, ClickableTextUiState clickableTextUiState) {
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().c, ChaloColorToken.LightGrey.f9815a, null, 4);
        ChaloBusRouteInfoRouteUISpec chaloBusRouteInfoRouteUISpec = new ChaloBusRouteInfoRouteUISpec();
        Intrinsics.i(routeNameAndIconUIState, "routeNameAndIconUIState");
        Intrinsics.i(routeDisplayName, "routeDisplayName");
        Intrinsics.i(timeRangeIcon, "timeRangeIcon");
        this.f3330a = routeNameAndIconUIState;
        this.b = routeDisplayName;
        this.c = chaloTextUIState;
        this.d = timeRangeIcon;
        this.e = chaloTextUIState2;
        this.f = clickableTextUiState;
        this.g = dividerUIState;
        this.h = chaloBusRouteInfoRouteUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoRouteUIState)) {
            return false;
        }
        ChaloBusRouteInfoRouteUIState chaloBusRouteInfoRouteUIState = (ChaloBusRouteInfoRouteUIState) obj;
        return Intrinsics.d(this.f3330a, chaloBusRouteInfoRouteUIState.f3330a) && Intrinsics.d(this.b, chaloBusRouteInfoRouteUIState.b) && Intrinsics.d(this.c, chaloBusRouteInfoRouteUIState.c) && Intrinsics.d(this.d, chaloBusRouteInfoRouteUIState.d) && Intrinsics.d(this.e, chaloBusRouteInfoRouteUIState.e) && Intrinsics.d(this.f, chaloBusRouteInfoRouteUIState.f) && Intrinsics.d(this.g, chaloBusRouteInfoRouteUIState.g) && Intrinsics.d(this.h, chaloBusRouteInfoRouteUIState.h);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f3330a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.h.hashCode() + py.c(this.g, (this.f.hashCode() + r30.f(this.e, r30.e(this.d, (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "ChaloBusRouteInfoRouteUIState(routeNameAndIconUIState=" + this.f3330a + ", routeDisplayName=" + this.b + ", via=" + this.c + ", timeRangeIcon=" + this.d + ", timeRange=" + this.e + ", viewRouteCta=" + this.f + ", dividerLineUIState=" + this.g + ", specs=" + this.h + ")";
    }
}
