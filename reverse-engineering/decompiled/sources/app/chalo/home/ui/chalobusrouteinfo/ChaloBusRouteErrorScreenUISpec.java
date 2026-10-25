package app.chalo.home.ui.chalobusrouteinfo;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteErrorScreenUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteErrorScreenUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3309a;
    public final float b;
    public final float c;
    public final float d;

    public ChaloBusRouteErrorScreenUISpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().k;
        this.f3309a = chaloPadding;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteErrorScreenUISpec)) {
            return false;
        }
        ChaloBusRouteErrorScreenUISpec chaloBusRouteErrorScreenUISpec = (ChaloBusRouteErrorScreenUISpec) obj;
        return Intrinsics.d(this.f3309a, chaloBusRouteErrorScreenUISpec.f3309a) && Dp.m7283equalsimpl0(this.b, chaloBusRouteErrorScreenUISpec.b) && Dp.m7283equalsimpl0(this.c, chaloBusRouteErrorScreenUISpec.c) && Dp.m7283equalsimpl0(this.d, chaloBusRouteErrorScreenUISpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, this.f3309a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return r30.i(t10.n("ChaloBusRouteErrorScreenUISpec(contentPadding=", this.f3309a, ", titleSubtitleSpacing=", strM7289toStringimpl, ", subtitleCtaSpacing="), Dp.m7289toStringimpl(this.c), ", imageTitleSpacing=", Dp.m7289toStringimpl(this.d), ")");
    }
}
