package app.chalo.compose.theme;

import androidx.compose.ui.unit.Dp;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/compose/theme/UIShape;", "", "Rectangle", "Circle", "Companion", "Lapp/chalo/compose/theme/UIShape$Circle;", "Lapp/chalo/compose/theme/UIShape$Rectangle;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UIShape {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rectangle f1926a;
    public static final Rectangle b;
    public static final Rectangle c;
    public static final Rectangle d;
    public static final Rectangle e;
    public static final Rectangle f;
    public static final Rectangle g;
    public static final Rectangle h;
    public static final Rectangle i;
    public static final Rectangle j;
    public static final Rectangle k;
    public static final Rectangle l;
    public static final Rectangle m;
    public static final Circle n;
    public static final Rectangle o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/UIShape$Circle;", "Lapp/chalo/compose/theme/UIShape;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Circle extends UIShape {
        public static final Circle p = new Circle();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Circle);
        }

        public final int hashCode() {
            return 755485070;
        }

        public final String toString() {
            return "Circle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/UIShape$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static Rectangle a() {
            return UIShape.d;
        }
    }

    static {
        float f2 = ChaloThemeHelper.a().f1916a;
        f1926a = new Rectangle(f2, f2, f2, f2);
        float f3 = ChaloThemeHelper.a().c;
        b = new Rectangle(f3, f3, f3, f3);
        float f4 = ChaloThemeHelper.a().d;
        c = new Rectangle(f4, f4, f4, f4);
        float f5 = ChaloThemeHelper.a().e;
        d = new Rectangle(f5, f5, f5, f5);
        float f6 = ChaloThemeHelper.a().f;
        e = new Rectangle(f6, f6, f6, f6);
        float f7 = ChaloThemeHelper.a().g;
        f = new Rectangle(f7, f7, f7, f7);
        float f8 = ChaloThemeHelper.a().h;
        g = new Rectangle(f8, f8, f8, f8);
        float f9 = ChaloThemeHelper.a().g;
        h = new Rectangle(f9, f9, f9, f9);
        float f10 = ChaloThemeHelper.a().j;
        i = new Rectangle(f10, f10, f10, f10);
        new Rectangle(ChaloThemeHelper.a().j, ChaloThemeHelper.a().j, 0.0f, 0.0f, 12);
        j = new Rectangle(ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, 0.0f, 0.0f, 12);
        k = new Rectangle(0.0f, 0.0f, ChaloThemeHelper.a().d, ChaloThemeHelper.a().d, 3);
        float f11 = ChaloThemeHelper.a().h;
        l = new Rectangle(f11, f11, f11, f11);
        float f12 = ChaloThemeHelper.a().l;
        m = new Rectangle(f12, f12, f12, f12);
        n = Circle.p;
        float f13 = 8;
        o = new Rectangle(Dp.m7278constructorimpl(f13), 0.0f, Dp.m7278constructorimpl(f13), 0.0f, 10);
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/UIShape$Rectangle;", "Lapp/chalo/compose/theme/UIShape;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rectangle extends UIShape {
        public final float p;
        public final float q;
        public final float r;
        public final float s;

        public Rectangle(float f, float f2, float f3, float f4) {
            this.p = f;
            this.q = f2;
            this.r = f3;
            this.s = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rectangle)) {
                return false;
            }
            Rectangle rectangle = (Rectangle) obj;
            return Dp.m7283equalsimpl0(this.p, rectangle.p) && Dp.m7283equalsimpl0(this.q, rectangle.q) && Dp.m7283equalsimpl0(this.r, rectangle.r) && Dp.m7283equalsimpl0(this.s, rectangle.s);
        }

        public final int hashCode() {
            return Dp.m7284hashCodeimpl(this.s) + uf0.a(this.r, uf0.a(this.q, Dp.m7284hashCodeimpl(this.p) * 31, 31), 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.p);
            String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.q);
            return r30.i(dd.e("Rectangle(topLeft=", strM7289toStringimpl, ", topRight=", strM7289toStringimpl2, ", bottomLeft="), Dp.m7289toStringimpl(this.r), ", bottomRight=", Dp.m7289toStringimpl(this.s), ")");
        }

        public Rectangle(float f, float f2, float f3, float f4, int i) {
            this((i & 1) != 0 ? ChaloThemeHelper.a().f1916a : f, (i & 2) != 0 ? ChaloThemeHelper.a().f1916a : f2, (i & 4) != 0 ? ChaloThemeHelper.a().f1916a : f3, (i & 8) != 0 ? ChaloThemeHelper.a().f1916a : f4);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Rectangle(float f, int i) {
            f = (i & 1) != 0 ? ChaloThemeHelper.a().f1916a : f;
            float f2 = ChaloThemeHelper.a().f1916a;
            this(f, f, f2, f2);
        }
    }
}
