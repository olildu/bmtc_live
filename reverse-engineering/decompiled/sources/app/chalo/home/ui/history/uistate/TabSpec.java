package app.chalo.home.ui.history.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/TabSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TabSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3485a;
    public final ChaloColorToken b;
    public final float c;
    public final UIShape d;
    public final float e;
    public final float f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public TabSpec(float f, ChaloColorToken chaloColorToken) {
        float f2 = ChaloThemeHelper.a().e;
        float f3 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f3, f2, f2, f3);
        UIShape.Circle circle = UIShape.Circle.p;
        float f4 = ChaloThemeHelper.a().l;
        float f5 = ChaloThemeHelper.a().l;
        this.f3485a = chaloPadding;
        this.b = chaloColorToken;
        this.c = f;
        this.d = circle;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabSpec)) {
            return false;
        }
        TabSpec tabSpec = (TabSpec) obj;
        return Intrinsics.d(this.f3485a, tabSpec.f3485a) && Intrinsics.d(this.b, tabSpec.b) && Float.compare(this.c, tabSpec.c) == 0 && Intrinsics.d(this.d, tabSpec.d) && Dp.m7283equalsimpl0(this.e, tabSpec.e) && Dp.m7283equalsimpl0(this.f, tabSpec.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, pk0.b(this.d, r30.a(this.c, z40.b(this.b, this.f3485a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbL = gf.l(this.f3485a, this.b, "TabSpec(contentPadding=", ", backgroundColor=", ", zIndex=");
        sbL.append(this.c);
        sbL.append(", shape=");
        sbL.append(this.d);
        sbL.append(", minHt=");
        return r30.i(sbL, strM7289toStringimpl, ", minWidth=", strM7289toStringimpl2, ")");
    }
}
