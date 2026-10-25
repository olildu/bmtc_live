package app.chalo.productpurchase.passselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassCategoryTagUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassCategoryTagUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8529a;
    public final ChaloColorToken.Custom b;
    public final ChaloPadding c;
    public final UIShape d;

    public PassCategoryTagUIState(TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken.Custom custom) {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().c;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UIShape.Rectangle shape = UIShape.c;
        Intrinsics.i(shape, "shape");
        this.f8529a = chaloTextUIState;
        this.b = custom;
        this.c = chaloPadding;
        this.d = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassCategoryTagUIState)) {
            return false;
        }
        PassCategoryTagUIState passCategoryTagUIState = (PassCategoryTagUIState) obj;
        return Intrinsics.d(this.f8529a, passCategoryTagUIState.f8529a) && Intrinsics.d(this.b, passCategoryTagUIState.b) && Intrinsics.d(this.c, passCategoryTagUIState.c) && Intrinsics.d(this.d, passCategoryTagUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, nf1.c(this.f8529a.hashCode() * 31, 31, this.b.f9781a), 31);
    }

    public final String toString() {
        return "PassCategoryTagUIState(text=" + this.f8529a + ", background=" + this.b + ", contentPadding=" + this.c + ", shape=" + this.d + ")";
    }
}
