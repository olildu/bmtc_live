package app.chalo.metro.ui.landing.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/LineTypeIndicatorUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LineTypeIndicatorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f5520a;
    public final float b;
    public final UIShape c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public LineTypeIndicatorUIState(ChaloColorToken color) {
        float f = ChaloThemeHelper.a().f;
        UIShape.Circle circle = UIShape.Circle.p;
        Intrinsics.i(color, "color");
        this.f5520a = color;
        this.b = f;
        this.c = circle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineTypeIndicatorUIState)) {
            return false;
        }
        LineTypeIndicatorUIState lineTypeIndicatorUIState = (LineTypeIndicatorUIState) obj;
        return Intrinsics.d(this.f5520a, lineTypeIndicatorUIState.f5520a) && Dp.m7283equalsimpl0(this.b, lineTypeIndicatorUIState.b) && Intrinsics.d(this.c, lineTypeIndicatorUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.a(this.b, this.f5520a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        StringBuilder sb = new StringBuilder("LineTypeIndicatorUIState(color=");
        sb.append(this.f5520a);
        sb.append(", size=");
        sb.append(strM7289toStringimpl);
        sb.append(", shape=");
        return gf.j(sb, this.c, ")");
    }
}
