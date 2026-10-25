package app.chalo.compose.theme;

import androidx.compose.ui.unit.Dp;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/ChaloPadding;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloPadding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1918a;
    public final float b;
    public final float c;
    public final float d;

    public ChaloPadding(float f, float f2, float f3, float f4) {
        this.f1918a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPadding)) {
            return false;
        }
        ChaloPadding chaloPadding = (ChaloPadding) obj;
        return Dp.m7283equalsimpl0(this.f1918a, chaloPadding.f1918a) && Dp.m7283equalsimpl0(this.b, chaloPadding.b) && Dp.m7283equalsimpl0(this.c, chaloPadding.c) && Dp.m7283equalsimpl0(this.d, chaloPadding.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f1918a) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f1918a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        return r30.i(dd.e("ChaloPadding(top=", strM7289toStringimpl, ", start=", strM7289toStringimpl2, ", end="), Dp.m7289toStringimpl(this.c), ", bottom=", Dp.m7289toStringimpl(this.d), ")");
    }

    public ChaloPadding(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? ChaloThemeHelper.a().f1916a : f, (i & 2) != 0 ? ChaloThemeHelper.a().f1916a : f2, (i & 4) != 0 ? ChaloThemeHelper.a().f1916a : f3, (i & 8) != 0 ? ChaloThemeHelper.a().f1916a : f4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChaloPadding(float f, float f2, int i) {
        f = (i & 1) != 0 ? ChaloThemeHelper.a().f1916a : f;
        f2 = (i & 2) != 0 ? ChaloThemeHelper.a().f1916a : f2;
        this(f2, f, f, f2);
    }

    public ChaloPadding(float f, float f2) {
        this(f2, f, f, f2);
    }
}
