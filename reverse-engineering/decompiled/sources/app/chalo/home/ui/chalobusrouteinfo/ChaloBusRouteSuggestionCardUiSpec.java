package app.chalo.home.ui.chalobusrouteinfo;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionCardUiSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteSuggestionCardUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3360a;
    public final ChaloPadding b;
    public final float c;
    public final ChaloColorToken d;
    public final UIShape e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloBusRouteSuggestionCardUiSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().i);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().f;
        UIShape.Rectangle shape = UIShape.e;
        Intrinsics.i(shape, "shape");
        this.f3360a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f3;
        this.d = ChaloColorToken.GreyColor.f9806a;
        this.e = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteSuggestionCardUiSpec)) {
            return false;
        }
        ChaloBusRouteSuggestionCardUiSpec chaloBusRouteSuggestionCardUiSpec = (ChaloBusRouteSuggestionCardUiSpec) obj;
        return Intrinsics.d(this.f3360a, chaloBusRouteSuggestionCardUiSpec.f3360a) && Intrinsics.d(this.b, chaloBusRouteSuggestionCardUiSpec.b) && Dp.m7283equalsimpl0(this.c, chaloBusRouteSuggestionCardUiSpec.c) && Intrinsics.d(this.d, chaloBusRouteSuggestionCardUiSpec.d) && Intrinsics.d(this.e, chaloBusRouteSuggestionCardUiSpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z40.b(this.d, uf0.a(this.c, r30.c(this.b, this.f3360a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbM = pk0.m("ChaloBusRouteSuggestionCardUiSpec(outerPadding=", this.f3360a, ", innerPadding=", this.b, ", titleCtaSpacing=");
        sbM.append(strM7289toStringimpl);
        sbM.append(", backgroundColor=");
        sbM.append(this.d);
        sbM.append(", shape=");
        return gf.j(sbM, this.e, ")");
    }
}
