package app.chalo.home.ui.chalobusrouteinfo;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteNameAndIconUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteNameAndIconUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f3368a;
    public final TextUIState.ChaloTextUIState b;
    public final ChaloColorToken c;
    public final UIShape d;
    public final ChaloPadding e;
    public final float f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public RouteNameAndIconUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        UIShape.Rectangle backgroundShape = UIShape.c;
        float f = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().d);
        float f2 = ChaloThemeHelper.a().e;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f3368a = imageUIState;
        this.b = chaloTextUIState;
        this.c = ChaloColorToken.LightGrey.f9815a;
        this.d = backgroundShape;
        this.e = chaloPadding;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteNameAndIconUIState)) {
            return false;
        }
        RouteNameAndIconUIState routeNameAndIconUIState = (RouteNameAndIconUIState) obj;
        return Intrinsics.d(this.f3368a, routeNameAndIconUIState.f3368a) && Intrinsics.d(this.b, routeNameAndIconUIState.b) && Intrinsics.d(this.c, routeNameAndIconUIState.c) && Intrinsics.d(this.d, routeNameAndIconUIState.d) && Intrinsics.d(this.e, routeNameAndIconUIState.e) && Dp.m7283equalsimpl0(this.f, routeNameAndIconUIState.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + r30.c(this.e, pk0.b(this.d, z40.b(this.c, r30.f(this.b, this.f3368a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f);
        StringBuilder sbN = pk0.n("RouteNameAndIconUIState(image=", this.f3368a, ", routeName=", this.b, ", backgroundColor=");
        sbN.append(this.c);
        sbN.append(", backgroundShape=");
        sbN.append(this.d);
        sbN.append(", contentPadding=");
        sbN.append(this.e);
        sbN.append(", imgTitleSpace=");
        sbN.append(strM7289toStringimpl);
        sbN.append(")");
        return sbN.toString();
    }
}
