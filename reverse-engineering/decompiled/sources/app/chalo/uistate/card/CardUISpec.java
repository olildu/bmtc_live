package app.chalo.uistate.card;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/card/CardUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIShape f9924a;
    public final float b;
    public final float c;

    public CardUISpec(UIShape shape, float f, float f2) {
        Intrinsics.i(shape, "shape");
        this.f9924a = shape;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardUISpec)) {
            return false;
        }
        CardUISpec cardUISpec = (CardUISpec) obj;
        return Intrinsics.d(this.f9924a, cardUISpec.f9924a) && Dp.m7283equalsimpl0(this.b, cardUISpec.b) && Dp.m7283equalsimpl0(this.c, cardUISpec.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + uf0.a(this.b, this.f9924a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("CardUISpec(shape=");
        sb.append(this.f9924a);
        sb.append(", elevation=");
        sb.append(strM7289toStringimpl);
        sb.append(", topElevation=");
        return vo1.p(sb, strM7289toStringimpl2, ")");
    }

    public CardUISpec(UIShape uIShape, float f, float f2, int i) {
        this((i & 1) != 0 ? UIShape.d : uIShape, (i & 2) != 0 ? ChaloThemeHelper.b().c : f, (i & 4) != 0 ? ChaloThemeHelper.b().f1917a : f2);
    }
}
