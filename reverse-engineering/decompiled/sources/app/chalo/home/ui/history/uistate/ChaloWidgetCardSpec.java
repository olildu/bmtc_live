package app.chalo.home.ui.history.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/ChaloWidgetCardSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloWidgetCardSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3465a;
    public final float b;
    public final float c;
    public final float d;
    public final UIShape e;
    public final ChaloColorToken f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloWidgetCardSpec(ChaloColorToken chaloColorToken) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().g;
        float f4 = ChaloThemeHelper.a().g;
        UIShape.Rectangle shape = UIShape.d;
        Intrinsics.i(shape, "shape");
        this.f3465a = chaloPadding;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = shape;
        this.f = chaloColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloWidgetCardSpec)) {
            return false;
        }
        ChaloWidgetCardSpec chaloWidgetCardSpec = (ChaloWidgetCardSpec) obj;
        return Intrinsics.d(this.f3465a, chaloWidgetCardSpec.f3465a) && Dp.m7283equalsimpl0(this.b, chaloWidgetCardSpec.b) && Dp.m7283equalsimpl0(this.c, chaloWidgetCardSpec.c) && Dp.m7283equalsimpl0(this.d, chaloWidgetCardSpec.d) && Intrinsics.d(this.e, chaloWidgetCardSpec.e) && Intrinsics.d(this.f, chaloWidgetCardSpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + pk0.b(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f3465a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbN = t10.n("ChaloWidgetCardSpec(contentPadding=", this.f3465a, ", titleAndDescriptionSpacing=", strM7289toStringimpl, ", descriptionAndTagSpacing=");
        cb0.t(sbN, strM7289toStringimpl2, ", imageSpacing=", strM7289toStringimpl3, ", shape=");
        sbN.append(this.e);
        sbN.append(", backgroundColor=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
