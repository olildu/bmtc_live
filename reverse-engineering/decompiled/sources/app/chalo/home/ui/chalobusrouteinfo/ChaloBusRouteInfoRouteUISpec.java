package app.chalo.home.ui.chalobusrouteinfo;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.gf;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoRouteUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoRouteUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3329a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final ChaloPadding e;
    public final float f;
    public final float g;
    public final ChaloColorToken h;
    public final UIShape i;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloBusRouteInfoRouteUISpec() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f3, f3, f3, f3);
        float f4 = ChaloThemeHelper.a().d;
        float f5 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, 1);
        float f6 = ChaloThemeHelper.a().d;
        float f7 = ChaloThemeHelper.a().d;
        UIShape.Rectangle cardShape = UIShape.e;
        Intrinsics.i(cardShape, "cardShape");
        this.f3329a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f4;
        this.d = f5;
        this.e = chaloPadding3;
        this.f = f6;
        this.g = f7;
        this.h = ChaloColorToken.White.f9870a;
        this.i = cardShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoRouteUISpec)) {
            return false;
        }
        ChaloBusRouteInfoRouteUISpec chaloBusRouteInfoRouteUISpec = (ChaloBusRouteInfoRouteUISpec) obj;
        return Intrinsics.d(this.f3329a, chaloBusRouteInfoRouteUISpec.f3329a) && Intrinsics.d(this.b, chaloBusRouteInfoRouteUISpec.b) && Dp.m7283equalsimpl0(this.c, chaloBusRouteInfoRouteUISpec.c) && Dp.m7283equalsimpl0(this.d, chaloBusRouteInfoRouteUISpec.d) && Intrinsics.d(this.e, chaloBusRouteInfoRouteUISpec.e) && Dp.m7283equalsimpl0(this.f, chaloBusRouteInfoRouteUISpec.f) && Dp.m7283equalsimpl0(this.g, chaloBusRouteInfoRouteUISpec.g) && Intrinsics.d(this.h, chaloBusRouteInfoRouteUISpec.h) && Intrinsics.d(this.i, chaloBusRouteInfoRouteUISpec.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + z40.b(this.h, uf0.a(this.g, uf0.a(this.f, r30.c(this.e, uf0.a(this.d, uf0.a(this.c, r30.c(this.b, this.f3329a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbM = pk0.m("ChaloBusRouteInfoRouteUISpec(outerPadding=", this.f3329a, ", contentPadding=", this.b, ", routeEndpointSpacing=");
        cb0.t(sbM, strM7289toStringimpl, ", endPointViaSpacing=", strM7289toStringimpl2, ", horizontalSpacingAroundDivider=");
        py.u(sbM, this.e, ", timeIconSpacing=", strM7289toStringimpl3, ", ctaIconSpacing=");
        sbM.append(strM7289toStringimpl4);
        sbM.append(", cardBackgroundColor=");
        sbM.append(this.h);
        sbM.append(", cardShape=");
        return gf.j(sbM, this.i, ")");
    }
}
