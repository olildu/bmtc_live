package app.chalo.home.ui.chalobusrouteinfo;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoFilterUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoFilterUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3320a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloColorToken d;
    public final BorderUISpec e;

    public ChaloBusRouteInfoFilterUISpec(int i, BorderUISpec borderUISpec, ChaloColorToken chaloColorToken) {
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().f);
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f2, f2, f2);
        chaloColorToken = (i & 8) != 0 ? ChaloColorToken.White.f9870a : chaloColorToken;
        borderUISpec = (i & 16) != 0 ? new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGrey.f9815a, UIShape.c) : borderUISpec;
        this.f3320a = f;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = chaloColorToken;
        this.e = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoFilterUISpec)) {
            return false;
        }
        ChaloBusRouteInfoFilterUISpec chaloBusRouteInfoFilterUISpec = (ChaloBusRouteInfoFilterUISpec) obj;
        return Dp.m7283equalsimpl0(this.f3320a, chaloBusRouteInfoFilterUISpec.f3320a) && Intrinsics.d(this.b, chaloBusRouteInfoFilterUISpec.b) && Intrinsics.d(this.c, chaloBusRouteInfoFilterUISpec.c) && Intrinsics.d(this.d, chaloBusRouteInfoFilterUISpec.d) && Intrinsics.d(this.e, chaloBusRouteInfoFilterUISpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z40.b(this.d, r30.c(this.c, r30.c(this.b, Dp.m7284hashCodeimpl(this.f3320a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ChaloBusRouteInfoFilterUISpec(spaceBtwFilters=" + Dp.m7289toStringimpl(this.f3320a) + ", contentOuterPadding=" + this.b + ", contentInnerPadding=" + this.c + ", backgroundColor=" + this.d + ", borderUISpec=" + this.e + ")";
    }
}
