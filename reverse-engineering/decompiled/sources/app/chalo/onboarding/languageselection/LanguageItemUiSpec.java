package app.chalo.onboarding.languageselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.data.BackgroundShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageItemUiSpec;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LanguageItemUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f6646a;
    public final ChaloColorToken b;
    public final ChaloColorToken c;
    public final float d;
    public final BackgroundShape e;

    static {
        BackgroundShape.Companion companion = BackgroundShape.INSTANCE;
    }

    public LanguageItemUiSpec(ChaloPadding chaloPadding, ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2) {
        float f = ChaloThemeHelper.a().b;
        BackgroundShape.Rectangle rectangle = new BackgroundShape.Rectangle(10);
        this.f6646a = chaloPadding;
        this.b = chaloColorToken;
        this.c = chaloColorToken2;
        this.d = f;
        this.e = rectangle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageItemUiSpec)) {
            return false;
        }
        LanguageItemUiSpec languageItemUiSpec = (LanguageItemUiSpec) obj;
        return Intrinsics.d(this.f6646a, languageItemUiSpec.f6646a) && Intrinsics.d(this.b, languageItemUiSpec.b) && Intrinsics.d(this.c, languageItemUiSpec.c) && Dp.m7283equalsimpl0(this.d, languageItemUiSpec.d) && Intrinsics.d(this.e, languageItemUiSpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + uf0.a(this.d, z40.b(this.c, z40.b(this.b, this.f6646a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbL = gf.l(this.f6646a, this.b, "LanguageItemUiSpec(internalPadding=", ", backGroundColorToken=", ", borderColor=");
        sbL.append(this.c);
        sbL.append(", borderWidth=");
        sbL.append(strM7289toStringimpl);
        sbL.append(", itemShape=");
        sbL.append(this.e);
        sbL.append(")");
        return sbL.toString();
    }
}
