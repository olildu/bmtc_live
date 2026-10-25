package app.chalo.productpurchase.passselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenTypeUIState;", "", "SubCategorySelection", "CategorySelection", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenTypeUIState$CategorySelection;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenTypeUIState$SubCategorySelection;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassSelectionScreenTypeUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenTypeUIState$CategorySelection;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenTypeUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CategorySelection extends PassSelectionScreenTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f8548a;
        public final List b;
        public final ChaloPadding c;
        public final PassSelectionComponent$categorySelection$4 d;

        public CategorySelection(List tabs, List tabScreens, PassSelectionComponent$categorySelection$4 passSelectionComponent$categorySelection$4) {
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
            Intrinsics.i(tabs, "tabs");
            Intrinsics.i(tabScreens, "tabScreens");
            this.f8548a = tabs;
            this.b = tabScreens;
            this.c = chaloPadding;
            this.d = passSelectionComponent$categorySelection$4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategorySelection)) {
                return false;
            }
            CategorySelection categorySelection = (CategorySelection) obj;
            return Intrinsics.d(this.f8548a, categorySelection.f8548a) && Intrinsics.d(this.b, categorySelection.b) && Intrinsics.d(this.c, categorySelection.c) && Intrinsics.d(this.d, categorySelection.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + r30.c(this.c, r30.b(this.f8548a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            return "CategorySelection(tabs=" + this.f8548a + ", tabScreens=" + this.b + ", paddingAroundTab=" + this.c + ", eventHandler=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenTypeUIState$SubCategorySelection;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionScreenTypeUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubCategorySelection extends PassSelectionScreenTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState f8549a;
        public final TextUIState b;
        public final SubCategoryGridListUIState c;
        public final SubCategorySelectionUISpec d;

        public SubCategorySelection(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, SubCategoryGridListUIState subCategoryGridListUIState) {
            SubCategorySelectionUISpec subCategorySelectionUISpec = new SubCategorySelectionUISpec();
            this.f8549a = chaloTextUIState;
            this.b = chaloTextUIState2;
            this.c = subCategoryGridListUIState;
            this.d = subCategorySelectionUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubCategorySelection)) {
                return false;
            }
            SubCategorySelection subCategorySelection = (SubCategorySelection) obj;
            return Intrinsics.d(this.f8549a, subCategorySelection.f8549a) && Intrinsics.d(this.b, subCategorySelection.b) && Intrinsics.d(this.c, subCategorySelection.c) && Intrinsics.d(this.d, subCategorySelection.d);
        }

        public final int hashCode() {
            TextUIState textUIState = this.f8549a;
            int iHashCode = (textUIState == null ? 0 : textUIState.hashCode()) * 31;
            TextUIState textUIState2 = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (textUIState2 != null ? textUIState2.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "SubCategorySelection(header=" + this.f8549a + ", desc=" + this.b + ", grid=" + this.c + ", spec=" + this.d + ")";
        }
    }
}
