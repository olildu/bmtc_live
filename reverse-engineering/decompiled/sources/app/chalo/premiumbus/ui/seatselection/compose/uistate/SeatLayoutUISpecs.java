package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloUIShape;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatLayoutUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatLayoutUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7785a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloColorToken g;
    public final UIShape h;
    public final UIShape i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final ChaloPadding n;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SeatLayoutUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloUIShape chaloUIShape = ChaloThemeHelper.d;
        UIShape shape = chaloUIShape.f;
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().k, 0.0f, 9);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().c, ChaloThemeHelper.a().h, ChaloThemeHelper.a().g, ChaloThemeHelper.a().c);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().o, 0.0f, 0.0f, 0.0f, 14);
        UIShape columnInfoBarBackgroundShape = chaloUIShape.k;
        UIShape rowInfoBarBackgroundShape = chaloUIShape.j;
        float f2 = ChaloThemeHelper.a().n;
        float f3 = ChaloThemeHelper.a().d;
        float f4 = ChaloThemeHelper.a().i;
        float f5 = ChaloThemeHelper.a().n;
        ChaloPadding chaloPadding5 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, ChaloThemeHelper.a().d, 6);
        Intrinsics.i(shape, "shape");
        Intrinsics.i(columnInfoBarBackgroundShape, "columnInfoBarBackgroundShape");
        Intrinsics.i(rowInfoBarBackgroundShape, "rowInfoBarBackgroundShape");
        this.f7785a = chaloPadding;
        this.b = shape;
        this.c = ChaloColorToken.White.f9870a;
        this.d = chaloPadding2;
        this.e = chaloPadding3;
        this.f = chaloPadding4;
        this.g = ChaloColorToken.VeryLightGrey.f9868a;
        this.h = columnInfoBarBackgroundShape;
        this.i = rowInfoBarBackgroundShape;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        this.n = chaloPadding5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatLayoutUISpecs)) {
            return false;
        }
        SeatLayoutUISpecs seatLayoutUISpecs = (SeatLayoutUISpecs) obj;
        return Intrinsics.d(this.f7785a, seatLayoutUISpecs.f7785a) && Intrinsics.d(this.b, seatLayoutUISpecs.b) && Intrinsics.d(this.c, seatLayoutUISpecs.c) && Intrinsics.d(this.d, seatLayoutUISpecs.d) && Intrinsics.d(this.e, seatLayoutUISpecs.e) && Intrinsics.d(this.f, seatLayoutUISpecs.f) && Intrinsics.d(this.g, seatLayoutUISpecs.g) && Intrinsics.d(this.h, seatLayoutUISpecs.h) && Intrinsics.d(this.i, seatLayoutUISpecs.i) && Dp.m7283equalsimpl0(this.j, seatLayoutUISpecs.j) && Dp.m7283equalsimpl0(this.k, seatLayoutUISpecs.k) && Dp.m7283equalsimpl0(this.l, seatLayoutUISpecs.l) && Dp.m7283equalsimpl0(this.m, seatLayoutUISpecs.m) && Intrinsics.d(this.n, seatLayoutUISpecs.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + uf0.a(this.m, uf0.a(this.l, uf0.a(this.k, uf0.a(this.j, pk0.b(this.i, pk0.b(this.h, z40.b(this.g, r30.c(this.f, r30.c(this.e, r30.c(this.d, z40.b(this.c, pk0.b(this.b, this.f7785a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.j);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.k);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.l);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.m);
        StringBuilder sb = new StringBuilder("SeatLayoutUISpecs(contentPadding=");
        sb.append(this.f7785a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", rowInfoBarPadding=");
        sb.append(this.d);
        sb.append(", rowInfoBarContentPadding=");
        r30.o(sb, this.e, ", columnInfoBarPadding=", this.f, ", rowAndColumnInfoBarBackgroundColor=");
        sb.append(this.g);
        sb.append(", columnInfoBarBackgroundShape=");
        sb.append(this.h);
        sb.append(", rowInfoBarBackgroundShape=");
        sb.append(this.i);
        sb.append(", seatLayoutEmptySpaceSize=");
        sb.append(strM7289toStringimpl);
        sb.append(", spaceBtwSeats=");
        cb0.t(sb, strM7289toStringimpl2, ", rowIndexInfoItemWidth=", strM7289toStringimpl3, ", rowIndexInfoItemHeight=");
        sb.append(strM7289toStringimpl4);
        sb.append(", rowIndexInfoItemPadding=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
