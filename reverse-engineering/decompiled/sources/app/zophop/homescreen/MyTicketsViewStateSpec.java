package app.zophop.homescreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.gf;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/zophop/homescreen/MyTicketsViewStateSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MyTicketsViewStateSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f11134a;
    public final ChaloColorToken b;
    public final BgHighlightType c;
    public final ChaloColorToken d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final float g;
    public final float h;
    public final float i;
    public final ChaloPadding j;

    public MyTicketsViewStateSpec(ChaloColorToken chaloColorToken, BgHighlightType bgHighlightType, int i) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        int i2 = i & 2;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        ChaloColorToken chaloColorToken2 = i2 != 0 ? white : chaloColorToken;
        BgHighlightType backgroundHighlightType = (i & 4) != 0 ? BgHighlightType.QUADRANT : bgHighlightType;
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 3);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().k, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().W;
        float f3 = ChaloThemeHelper.a().W;
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().W, ChaloThemeHelper.a().n, ChaloThemeHelper.a().n, 0.0f, 8);
        Intrinsics.i(backgroundHighlightType, "backgroundHighlightType");
        this.f11134a = chaloPadding;
        this.b = chaloColorToken2;
        this.c = backgroundHighlightType;
        this.d = white;
        this.e = chaloPadding2;
        this.f = chaloPadding3;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = chaloPadding4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTicketsViewStateSpec)) {
            return false;
        }
        MyTicketsViewStateSpec myTicketsViewStateSpec = (MyTicketsViewStateSpec) obj;
        return Intrinsics.d(this.f11134a, myTicketsViewStateSpec.f11134a) && Intrinsics.d(this.b, myTicketsViewStateSpec.b) && this.c == myTicketsViewStateSpec.c && Intrinsics.d(this.d, myTicketsViewStateSpec.d) && Intrinsics.d(this.e, myTicketsViewStateSpec.e) && Intrinsics.d(this.f, myTicketsViewStateSpec.f) && Dp.m7283equalsimpl0(this.g, myTicketsViewStateSpec.g) && Dp.m7283equalsimpl0(this.h, myTicketsViewStateSpec.h) && Dp.m7283equalsimpl0(this.i, myTicketsViewStateSpec.i) && Intrinsics.d(this.j, myTicketsViewStateSpec.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + uf0.a(this.i, uf0.a(this.h, uf0.a(this.g, r30.c(this.f, r30.c(this.e, z40.b(this.d, (this.c.hashCode() + z40.b(this.b, this.f11134a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.i);
        StringBuilder sbL = gf.l(this.f11134a, this.b, "MyTicketsViewStateSpec(contentPadding=", ", screenBackgroundColor=", ", backgroundHighlightType=");
        sbL.append(this.c);
        sbL.append(", gradientBackgroundColor=");
        sbL.append(this.d);
        sbL.append(", ticketsSectionOuterPadding=");
        r30.o(sbL, this.e, ", reclaimCardOuterPadding=", this.f, ", productsTabAndProductReclaimCardSpacing=");
        cb0.t(sbL, strM7289toStringimpl, ", productDividerAndHeadingSpacing=", strM7289toStringimpl2, ", postProductListSpacing=");
        sbL.append(strM7289toStringimpl3);
        sbL.append(", customerSupportPadding=");
        sbL.append(this.j);
        sbL.append(")");
        return sbL.toString();
    }
}
