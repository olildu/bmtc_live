package app.chalo.productbooking.pickroutelocation;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.gf;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/RouteItemUiSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteItemUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8288a;
    public final UiAlignment.Vertical b;
    public final ChaloPadding c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final UiAlignment.Vertical h;
    public final float i;
    public final float j;
    public final float k;
    public final ChaloColorToken l;
    public final ChaloPadding m;
    public final float n;
    public final ChaloPadding o;
    public final ChaloColorToken p;
    public final UIShape q;

    public RouteItemUiSpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().c;
        float f5 = ChaloThemeHelper.a().c;
        float f6 = ChaloThemeHelper.a().e;
        float f7 = ChaloThemeHelper.a().e;
        float f8 = ChaloThemeHelper.a().e;
        float f9 = ChaloThemeHelper.a().c;
        float f10 = ChaloThemeHelper.a().e;
        ChaloPadding chaloPadding2 = new ChaloPadding(f9, f10, f10, f9);
        float f11 = ChaloThemeHelper.a().h;
        float f12 = ChaloThemeHelper.a().c;
        float f13 = ChaloThemeHelper.a().e;
        ChaloPadding chaloPadding3 = new ChaloPadding(f12, f13, f13, f12);
        float f14 = ChaloThemeHelper.a().c;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f14, f14, f14, f14);
        this.f8288a = ChaloColorToken.White.f9870a;
        UiAlignment.Vertical.Center center = UiAlignment.Vertical.Center.f9888a;
        this.b = center;
        this.c = chaloPadding;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = center;
        this.i = f6;
        this.j = f7;
        this.k = f8;
        this.l = ChaloColorToken.UnselectedDot.f9866a;
        this.m = chaloPadding2;
        this.n = f11;
        this.o = chaloPadding3;
        this.p = ChaloColorToken.OrangePrimary.f9835a;
        this.q = rectangle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteItemUiSpecs)) {
            return false;
        }
        RouteItemUiSpecs routeItemUiSpecs = (RouteItemUiSpecs) obj;
        return Intrinsics.d(this.f8288a, routeItemUiSpecs.f8288a) && Intrinsics.d(this.b, routeItemUiSpecs.b) && Intrinsics.d(this.c, routeItemUiSpecs.c) && Dp.m7283equalsimpl0(this.d, routeItemUiSpecs.d) && Dp.m7283equalsimpl0(this.e, routeItemUiSpecs.e) && Dp.m7283equalsimpl0(this.f, routeItemUiSpecs.f) && Dp.m7283equalsimpl0(this.g, routeItemUiSpecs.g) && Intrinsics.d(this.h, routeItemUiSpecs.h) && Dp.m7283equalsimpl0(this.i, routeItemUiSpecs.i) && Dp.m7283equalsimpl0(this.j, routeItemUiSpecs.j) && Dp.m7283equalsimpl0(this.k, routeItemUiSpecs.k) && Intrinsics.d(this.l, routeItemUiSpecs.l) && Intrinsics.d(this.m, routeItemUiSpecs.m) && Dp.m7283equalsimpl0(this.n, routeItemUiSpecs.n) && Intrinsics.d(this.o, routeItemUiSpecs.o) && Intrinsics.d(this.p, routeItemUiSpecs.p) && Intrinsics.d(this.q, routeItemUiSpecs.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + z40.b(this.p, r30.c(this.o, uf0.a(this.n, r30.c(this.m, z40.b(this.l, uf0.a(this.k, uf0.a(this.j, uf0.a(this.i, uf0.e(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, r30.c(this.c, uf0.e(this.b, this.f8288a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.i);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.j);
        String strM7289toStringimpl7 = Dp.m7289toStringimpl(this.k);
        String strM7289toStringimpl8 = Dp.m7289toStringimpl(this.n);
        StringBuilder sb = new StringBuilder("RouteItemUiSpecs(backgroundColor=");
        sb.append(this.f8288a);
        sb.append(", headerVerticalAlignment=");
        sb.append(this.b);
        sb.append(", padding=");
        py.u(sb, this.c, ", iconAndContentSpacing=", strM7289toStringimpl, ", titleAndSpfSpacing=");
        cb0.t(sb, strM7289toStringimpl2, ", spfAndSubTextSpacing=", strM7289toStringimpl3, ", titleAndSubTitleSpacing=");
        sb.append(strM7289toStringimpl4);
        sb.append(", titleVerticalAlignment=");
        sb.append(this.h);
        sb.append(", titleAndAcTagSpacing=");
        cb0.t(sb, strM7289toStringimpl5, ", routeNameAndAcTagSpacing=", strM7289toStringimpl6, ", acTagAndAgencyNameSpacing=");
        sb.append(strM7289toStringimpl7);
        sb.append(", agencyNameBackgroundColor=");
        sb.append(this.l);
        sb.append(", agencyNamePadding=");
        py.u(sb, this.m, ", headerAndFreeRideTagSpacing=", strM7289toStringimpl8, ", freeRideTagPadding=");
        sb.append(this.o);
        sb.append(", freeRideTagBackgroundColor=");
        sb.append(this.p);
        sb.append(", freeRideTagShape=");
        return gf.j(sb, this.q, ")");
    }
}
