package app.chalo.compose.theme;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/ChaloShape;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloShape {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shape f1919a;
    public final Shape b;
    public final Shape c;
    public final Shape d;
    public final Shape e;
    public final Shape f;
    public final Shape g;
    public final Shape h;
    public final Shape i;
    public final Shape j;

    public ChaloShape(RoundedCornerShape roundedCornerShape, RoundedCornerShape roundedCornerShape2, int i) {
        RoundedCornerShape noRoundedCorner = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(0));
        RoundedCornerShape smallRoundedCorner = (i & 2) != 0 ? RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(4)) : roundedCornerShape;
        RoundedCornerShape mediumRoundedCorner = (i & 4) != 0 ? RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(6)) : roundedCornerShape2;
        RoundedCornerShape largeRoundedCorner = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(10));
        float f = 10;
        RoundedCornerShape topRoundedCorner = RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), 0.0f, 0.0f, 12, null);
        RoundedCornerShape roundedSides = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(24));
        RoundedCornerShape medium1RoundedCorner = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(8));
        RoundedCornerShape medium2RoundedCorner = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(12));
        RoundedCornerShape medium3RoundedCorner = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloThemeHelper.a().h);
        float f2 = 8;
        RoundedCornerShape medium1topRoundedCorner = RoundedCornerShapeKt.m1076RoundedCornerShapea9UjIt4$default(Dp.m7278constructorimpl(f2), Dp.m7278constructorimpl(f2), 0.0f, 0.0f, 12, null);
        Intrinsics.i(noRoundedCorner, "noRoundedCorner");
        Intrinsics.i(smallRoundedCorner, "smallRoundedCorner");
        Intrinsics.i(mediumRoundedCorner, "mediumRoundedCorner");
        Intrinsics.i(largeRoundedCorner, "largeRoundedCorner");
        Intrinsics.i(topRoundedCorner, "topRoundedCorner");
        Intrinsics.i(roundedSides, "roundedSides");
        Intrinsics.i(medium1RoundedCorner, "medium1RoundedCorner");
        Intrinsics.i(medium2RoundedCorner, "medium2RoundedCorner");
        Intrinsics.i(medium3RoundedCorner, "medium3RoundedCorner");
        Intrinsics.i(medium1topRoundedCorner, "medium1topRoundedCorner");
        this.f1919a = noRoundedCorner;
        this.b = smallRoundedCorner;
        this.c = mediumRoundedCorner;
        this.d = largeRoundedCorner;
        this.e = topRoundedCorner;
        this.f = roundedSides;
        this.g = medium1RoundedCorner;
        this.h = medium2RoundedCorner;
        this.i = medium3RoundedCorner;
        this.j = medium1topRoundedCorner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloShape)) {
            return false;
        }
        ChaloShape chaloShape = (ChaloShape) obj;
        return Intrinsics.d(this.f1919a, chaloShape.f1919a) && Intrinsics.d(this.b, chaloShape.b) && Intrinsics.d(this.c, chaloShape.c) && Intrinsics.d(this.d, chaloShape.d) && Intrinsics.d(this.e, chaloShape.e) && Intrinsics.d(this.f, chaloShape.f) && Intrinsics.d(this.g, chaloShape.g) && Intrinsics.d(this.h, chaloShape.h) && Intrinsics.d(this.i, chaloShape.i) && Intrinsics.d(this.j, chaloShape.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f1919a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChaloShape(noRoundedCorner=" + this.f1919a + ", smallRoundedCorner=" + this.b + ", mediumRoundedCorner=" + this.c + ", largeRoundedCorner=" + this.d + ", topRoundedCorner=" + this.e + ", roundedSides=" + this.f + ", medium1RoundedCorner=" + this.g + ", medium2RoundedCorner=" + this.h + ", medium3RoundedCorner=" + this.i + ", medium1topRoundedCorner=" + this.j + ")";
    }
}
