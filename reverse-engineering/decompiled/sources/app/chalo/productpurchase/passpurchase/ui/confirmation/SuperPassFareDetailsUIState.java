package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/SuperPassFareDetailsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassFareDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8398a;
    public final ImageUIState b;
    public final List c;
    public final UiEventHandler$Companion$fromLambda$1 d;
    public final ChaloPadding e;
    public final ChaloPadding f;

    public SuperPassFareDetailsUIState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState expandBtn, List split, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        Intrinsics.i(expandBtn, "expandBtn");
        Intrinsics.i(split, "split");
        this.f8398a = chaloTextUIState;
        this.b = expandBtn;
        this.c = split;
        this.d = uiEventHandler$Companion$fromLambda$1;
        this.e = chaloPadding;
        this.f = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassFareDetailsUIState)) {
            return false;
        }
        SuperPassFareDetailsUIState superPassFareDetailsUIState = (SuperPassFareDetailsUIState) obj;
        return Intrinsics.d(this.f8398a, superPassFareDetailsUIState.f8398a) && Intrinsics.d(this.b, superPassFareDetailsUIState.b) && Intrinsics.d(this.c, superPassFareDetailsUIState.c) && Intrinsics.d(this.d, superPassFareDetailsUIState.d) && Intrinsics.d(this.e, superPassFareDetailsUIState.e) && Intrinsics.d(this.f, superPassFareDetailsUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.c(this.e, gf.a(this.d, r30.b(r30.e(this.b, this.f8398a.hashCode() * 31, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        return "SuperPassFareDetailsUIState(title=" + this.f8398a + ", expandBtn=" + this.b + ", split=" + this.c + ", eventHandler=" + this.d + ", internalPadding=" + this.e + ", paddingAroundSplit=" + this.f + ")";
    }
}
