package app.chalo.home.ui.chalobusrouteinfo;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.t10;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionFieldUiSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteSuggestionFieldUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3362a;
    public final float b;
    public final ChaloColorToken c;
    public final BorderUISpec d;

    public ChaloBusRouteSuggestionFieldUiSpec() {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().g;
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.ShadyGray.f9851a, UIShape.e);
        this.f3362a = chaloPadding;
        this.b = f3;
        this.c = ChaloColorToken.White.f9870a;
        this.d = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteSuggestionFieldUiSpec)) {
            return false;
        }
        ChaloBusRouteSuggestionFieldUiSpec chaloBusRouteSuggestionFieldUiSpec = (ChaloBusRouteSuggestionFieldUiSpec) obj;
        return Intrinsics.d(this.f3362a, chaloBusRouteSuggestionFieldUiSpec.f3362a) && Dp.m7283equalsimpl0(this.b, chaloBusRouteSuggestionFieldUiSpec.b) && Intrinsics.d(this.c, chaloBusRouteSuggestionFieldUiSpec.c) && Intrinsics.d(this.d, chaloBusRouteSuggestionFieldUiSpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, uf0.a(this.b, this.f3362a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("ChaloBusRouteSuggestionFieldUiSpec(contentPadding=", this.f3362a, ", iconSpacing=", Dp.m7289toStringimpl(this.b), ", backgroundColor=");
        sbN.append(this.c);
        sbN.append(", borderUISpec=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
