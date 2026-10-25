package app.chalo.login.ui.options;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/CountryFlagTabSpec;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CountryFlagTabSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5297a;
    public final BorderUISpec b;
    public final ChaloPadding c;

    public CountryFlagTabSpec() {
        float f = ChaloThemeHelper.a().e;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.StrikeOffFontColor.f9857a, UIShape.d);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        this.f5297a = chaloPadding;
        this.b = borderUISpec;
        this.c = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryFlagTabSpec)) {
            return false;
        }
        CountryFlagTabSpec countryFlagTabSpec = (CountryFlagTabSpec) obj;
        return Intrinsics.d(this.f5297a, countryFlagTabSpec.f5297a) && Intrinsics.d(this.b, countryFlagTabSpec.b) && Intrinsics.d(this.c, countryFlagTabSpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5297a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CountryFlagTabSpec(flagAndInteractionIconSpacing=");
        sb.append(this.f5297a);
        sb.append(", borderSpec=");
        sb.append(this.b);
        sb.append(", internalPadding=");
        return py.e(sb, this.c, ")");
    }
}
