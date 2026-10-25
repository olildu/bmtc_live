package app.chalo.compose.components;

import androidx.compose.material3.ProgressIndicatorDefaults;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/CircularProgressIndicatorUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CircularProgressIndicatorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken.OrangePrimary f1827a;
    public final float b;
    public final float c;

    public CircularProgressIndicatorUIState(float f, float f2) {
        this.f1827a = ChaloColorToken.OrangePrimary.f9835a;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircularProgressIndicatorUIState)) {
            return false;
        }
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = (CircularProgressIndicatorUIState) obj;
        return Intrinsics.d(this.f1827a, circularProgressIndicatorUIState.f1827a) && Dp.m7283equalsimpl0(this.b, circularProgressIndicatorUIState.b) && Dp.m7283equalsimpl0(this.c, circularProgressIndicatorUIState.c);
    }

    public final int hashCode() {
        this.f1827a.getClass();
        return Dp.m7284hashCodeimpl(this.c) + uf0.a(this.b, 1891422709, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("CircularProgressIndicatorUIState(color=");
        sb.append(this.f1827a);
        sb.append(", strokeWidth=");
        sb.append(strM7289toStringimpl);
        sb.append(", size=");
        return vo1.p(sb, strM7289toStringimpl2, ")");
    }

    public CircularProgressIndicatorUIState(float f, int i) {
        this((i & 2) != 0 ? ProgressIndicatorDefaults.INSTANCE.m2274getCircularStrokeWidthD9Ej5fM() : f, ChaloThemeHelper.a().Z);
    }
}
