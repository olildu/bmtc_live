package app.chalo.compose.theme;

import androidx.compose.ui.unit.Dp;
import defpackage.cb0;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/theme/ChaloElevation;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloElevation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1917a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ChaloElevation(float f, float f2, int i) {
        f = (i & 1) != 0 ? Dp.m7278constructorimpl(0) : f;
        float fM7278constructorimpl = Dp.m7278constructorimpl(2);
        f2 = (i & 4) != 0 ? Dp.m7278constructorimpl(4) : f2;
        float fM7278constructorimpl2 = Dp.m7278constructorimpl(8);
        float fM7278constructorimpl3 = Dp.m7278constructorimpl(12);
        float fM7278constructorimpl4 = Dp.m7278constructorimpl(16);
        this.f1917a = f;
        this.b = fM7278constructorimpl;
        this.c = f2;
        this.d = fM7278constructorimpl2;
        this.e = fM7278constructorimpl3;
        this.f = fM7278constructorimpl4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloElevation)) {
            return false;
        }
        ChaloElevation chaloElevation = (ChaloElevation) obj;
        return Dp.m7283equalsimpl0(this.f1917a, chaloElevation.f1917a) && Dp.m7283equalsimpl0(this.b, chaloElevation.b) && Dp.m7283equalsimpl0(this.c, chaloElevation.c) && Dp.m7283equalsimpl0(this.d, chaloElevation.d) && Dp.m7283equalsimpl0(this.e, chaloElevation.e) && Dp.m7283equalsimpl0(this.f, chaloElevation.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f1917a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f1917a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl6 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbE = dd.e("ChaloElevation(none=", strM7289toStringimpl, ", small=", strM7289toStringimpl2, ", medium=");
        cb0.t(sbE, strM7289toStringimpl3, ", medium1=", strM7289toStringimpl4, ", medium2=");
        return r30.i(sbE, strM7289toStringimpl5, ", medium3=", strM7289toStringimpl6, ")");
    }
}
