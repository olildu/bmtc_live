package app.chalo.onboarding.languageselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.b3;
import defpackage.dd;
import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageGridSpec;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LanguageGridSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6644a;
    public final float b;
    public final int c;

    public LanguageGridSpec() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        this.f6644a = f;
        this.b = f2;
        this.c = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageGridSpec)) {
            return false;
        }
        LanguageGridSpec languageGridSpec = (LanguageGridSpec) obj;
        return Dp.m7283equalsimpl0(this.f6644a, languageGridSpec.f6644a) && Dp.m7283equalsimpl0(this.b, languageGridSpec.b) && this.c == languageGridSpec.c;
    }

    public final int hashCode() {
        return uf0.a(this.b, Dp.m7284hashCodeimpl(this.f6644a) * 31, 31) + this.c;
    }

    public final String toString() {
        return b3.f(")", this.c, dd.e("LanguageGridSpec(gridItemHorizontalSpacing=", Dp.m7289toStringimpl(this.f6644a), ", gridItemVerticalSpacing=", Dp.m7289toStringimpl(this.b), ", columnCount="));
    }
}
