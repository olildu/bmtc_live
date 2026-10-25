package app.chalo.compose.theme;

import androidx.compose.ui.unit.Dp;
import defpackage.gf;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/ChaloUIShape;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloUIShape {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIShape f1923a;
    public final UIShape b;
    public final UIShape c;
    public final UIShape d;
    public final UIShape e;
    public final UIShape f;
    public final UIShape g;
    public final UIShape h;
    public final UIShape i;
    public final UIShape j;
    public final UIShape k;

    public ChaloUIShape() {
        float fM7278constructorimpl = Dp.m7278constructorimpl(0);
        UIShape.Rectangle rectangle = new UIShape.Rectangle(fM7278constructorimpl, fM7278constructorimpl, fM7278constructorimpl, fM7278constructorimpl);
        float fM7278constructorimpl2 = Dp.m7278constructorimpl(4);
        UIShape.Rectangle rectangle2 = new UIShape.Rectangle(fM7278constructorimpl2, fM7278constructorimpl2, fM7278constructorimpl2, fM7278constructorimpl2);
        float fM7278constructorimpl3 = Dp.m7278constructorimpl(6);
        UIShape.Rectangle rectangle3 = new UIShape.Rectangle(fM7278constructorimpl3, fM7278constructorimpl3, fM7278constructorimpl3, fM7278constructorimpl3);
        float fM7278constructorimpl4 = Dp.m7278constructorimpl(10);
        UIShape.Rectangle rectangle4 = new UIShape.Rectangle(fM7278constructorimpl4, fM7278constructorimpl4, fM7278constructorimpl4, fM7278constructorimpl4);
        float f = 10;
        UIShape.Rectangle rectangle5 = new UIShape.Rectangle(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), 0.0f, 0.0f, 12);
        float fM7278constructorimpl5 = Dp.m7278constructorimpl(24);
        UIShape.Rectangle rectangle6 = new UIShape.Rectangle(fM7278constructorimpl5, fM7278constructorimpl5, fM7278constructorimpl5, fM7278constructorimpl5);
        float fM7278constructorimpl6 = Dp.m7278constructorimpl(8);
        UIShape.Rectangle rectangle7 = new UIShape.Rectangle(fM7278constructorimpl6, fM7278constructorimpl6, fM7278constructorimpl6, fM7278constructorimpl6);
        float fM7278constructorimpl7 = Dp.m7278constructorimpl(12);
        UIShape.Rectangle rectangle8 = new UIShape.Rectangle(fM7278constructorimpl7, fM7278constructorimpl7, fM7278constructorimpl7, fM7278constructorimpl7);
        float fM7278constructorimpl8 = Dp.m7278constructorimpl(16);
        UIShape.Rectangle rectangle9 = new UIShape.Rectangle(fM7278constructorimpl8, fM7278constructorimpl8, fM7278constructorimpl8, fM7278constructorimpl8);
        float f2 = 8;
        UIShape.Rectangle rectangle10 = new UIShape.Rectangle(0.0f, 0.0f, Dp.m7278constructorimpl(f2), Dp.m7278constructorimpl(f2), 3);
        float f3 = 8;
        UIShape.Rectangle rectangle11 = new UIShape.Rectangle(Dp.m7278constructorimpl(f3), 0.0f, Dp.m7278constructorimpl(f3), 0.0f, 10);
        this.f1923a = rectangle;
        this.b = rectangle2;
        this.c = rectangle3;
        this.d = rectangle4;
        this.e = rectangle5;
        this.f = rectangle6;
        this.g = rectangle7;
        this.h = rectangle8;
        this.i = rectangle9;
        this.j = rectangle10;
        this.k = rectangle11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloUIShape)) {
            return false;
        }
        ChaloUIShape chaloUIShape = (ChaloUIShape) obj;
        return Intrinsics.d(this.f1923a, chaloUIShape.f1923a) && Intrinsics.d(this.b, chaloUIShape.b) && Intrinsics.d(this.c, chaloUIShape.c) && Intrinsics.d(this.d, chaloUIShape.d) && Intrinsics.d(this.e, chaloUIShape.e) && Intrinsics.d(this.f, chaloUIShape.f) && Intrinsics.d(this.g, chaloUIShape.g) && Intrinsics.d(this.h, chaloUIShape.h) && Intrinsics.d(this.i, chaloUIShape.i) && Intrinsics.d(this.j, chaloUIShape.j) && Intrinsics.d(this.k, chaloUIShape.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + pk0.b(this.j, pk0.b(this.i, pk0.b(this.h, pk0.b(this.g, pk0.b(this.f, pk0.b(this.e, pk0.b(this.d, pk0.b(this.c, pk0.b(this.b, this.f1923a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloUIShape(noRoundedCorner=");
        sb.append(this.f1923a);
        sb.append(", smallRoundedCorner=");
        sb.append(this.b);
        sb.append(", mediumRoundedCorner=");
        sb.append(this.c);
        sb.append(", largeRoundedCorner=");
        sb.append(this.d);
        sb.append(", topRoundedCorner=");
        sb.append(this.e);
        sb.append(", roundedSides=");
        sb.append(this.f);
        sb.append(", medium1RoundedCorner=");
        sb.append(this.g);
        sb.append(", medium2RoundedCorner=");
        sb.append(this.h);
        sb.append(", medium3RoundedCorner=");
        sb.append(this.i);
        sb.append(", medium1BottomRoundedCorner=");
        sb.append(this.j);
        sb.append(", medium1StartRoundedCorner=");
        return gf.j(sb, this.k, ")");
    }
}
