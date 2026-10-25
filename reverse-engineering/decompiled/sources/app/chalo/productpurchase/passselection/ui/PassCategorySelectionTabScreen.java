package app.chalo.productpurchase.passselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassCategorySelectionTabScreen;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassCategorySelectionTabScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductDisabledBannerUIState f8528a;
    public final List b;
    public final float c;
    public final ChaloPadding d;
    public final ChaloPadding e;

    public PassCategorySelectionTabScreen(ProductDisabledBannerUIState productDisabledBannerUIState, List sectionsList, float f) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        Intrinsics.i(sectionsList, "sectionsList");
        this.f8528a = productDisabledBannerUIState;
        this.b = sectionsList;
        this.c = f;
        this.d = chaloPadding;
        this.e = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassCategorySelectionTabScreen)) {
            return false;
        }
        PassCategorySelectionTabScreen passCategorySelectionTabScreen = (PassCategorySelectionTabScreen) obj;
        return Intrinsics.d(this.f8528a, passCategorySelectionTabScreen.f8528a) && Intrinsics.d(this.b, passCategorySelectionTabScreen.b) && Float.compare(this.c, passCategorySelectionTabScreen.c) == 0 && Intrinsics.d(this.d, passCategorySelectionTabScreen.d) && Intrinsics.d(this.e, passCategorySelectionTabScreen.e);
    }

    public final int hashCode() {
        ProductDisabledBannerUIState productDisabledBannerUIState = this.f8528a;
        return this.e.hashCode() + r30.c(this.d, r30.a(this.c, r30.b((productDisabledBannerUIState == null ? 0 : productDisabledBannerUIState.hashCode()) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassCategorySelectionTabScreen(disabledBanner=");
        sb.append(this.f8528a);
        sb.append(", sectionsList=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", internalPadding=");
        sb.append(this.d);
        sb.append(", paddingAroundContent=");
        return py.e(sb, this.e, ")");
    }
}
