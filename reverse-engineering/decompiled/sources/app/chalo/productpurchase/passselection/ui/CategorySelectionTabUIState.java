package app.chalo.productpurchase.passselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/CategorySelectionTabUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CategorySelectionTabUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8523a;
    public final ChaloColorToken b;
    public final ChaloColorToken c;
    public final ChaloPadding d;

    public CategorySelectionTabUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().e;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        this.f8523a = chaloTextUIState;
        this.b = ChaloColorToken.White.f9870a;
        this.c = ChaloColorToken.Black.f9759a;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategorySelectionTabUIState)) {
            return false;
        }
        CategorySelectionTabUIState categorySelectionTabUIState = (CategorySelectionTabUIState) obj;
        return Intrinsics.d(this.f8523a, categorySelectionTabUIState.f8523a) && Intrinsics.d(this.b, categorySelectionTabUIState.b) && Intrinsics.d(this.c, categorySelectionTabUIState.c) && Intrinsics.d(this.d, categorySelectionTabUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, z40.b(this.b, this.f8523a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CategorySelectionTabUIState(text=" + this.f8523a + ", selectedTextColor=" + this.b + ", unselectedTextColor=" + this.c + ", padding=" + this.d + ")";
    }
}
