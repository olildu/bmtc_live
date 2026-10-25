package app.chalo.home.ui.chalobusrouteinfo;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionSuccessUiSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteSuggestionSuccessUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3364a;
    public final float b;
    public final float c;
    public final float d;

    public ChaloBusRouteSuggestionSuccessUiSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().i;
        this.f3364a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteSuggestionSuccessUiSpec)) {
            return false;
        }
        ChaloBusRouteSuggestionSuccessUiSpec chaloBusRouteSuggestionSuccessUiSpec = (ChaloBusRouteSuggestionSuccessUiSpec) obj;
        return Intrinsics.d(this.f3364a, chaloBusRouteSuggestionSuccessUiSpec.f3364a) && Dp.m7283equalsimpl0(this.b, chaloBusRouteSuggestionSuccessUiSpec.b) && Dp.m7283equalsimpl0(this.c, chaloBusRouteSuggestionSuccessUiSpec.c) && Dp.m7283equalsimpl0(this.d, chaloBusRouteSuggestionSuccessUiSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, this.f3364a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return r30.i(t10.n("ChaloBusRouteSuggestionSuccessUiSpec(contentPadding=", this.f3364a, ", iconTitleSpacing=", strM7289toStringimpl, ", titleSubtitleSpacing="), Dp.m7289toStringimpl(this.c), ", subtitleButtonSpacing=", Dp.m7289toStringimpl(this.d), ")");
    }
}
