package app.chalo.metro.ui.landing.uistate;

import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenBottomSheetUiStateType;", "", "LineSelectionBottomSheet", "None", "Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenBottomSheetUiStateType$LineSelectionBottomSheet;", "Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenBottomSheetUiStateType$None;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MetroLandingScreenBottomSheetUiStateType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f5522a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenBottomSheetUiStateType$LineSelectionBottomSheet;", "Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenBottomSheetUiStateType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LineSelectionBottomSheet extends MetroLandingScreenBottomSheetUiStateType {
        public final BottomSheetUiState b;
        public final LineSelectionBottomSheetUIState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineSelectionBottomSheet(BottomSheetUiState bottomSheetUiState, LineSelectionBottomSheetUIState uiState) {
            super(bottomSheetUiState);
            Intrinsics.i(uiState, "uiState");
            this.b = bottomSheetUiState;
            this.c = uiState;
        }

        @Override // app.chalo.metro.ui.landing.uistate.MetroLandingScreenBottomSheetUiStateType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetUiState getF5522a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineSelectionBottomSheet)) {
                return false;
            }
            LineSelectionBottomSheet lineSelectionBottomSheet = (LineSelectionBottomSheet) obj;
            return Intrinsics.d(this.b, lineSelectionBottomSheet.b) && Intrinsics.d(this.c, lineSelectionBottomSheet.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "LineSelectionBottomSheet(sheetUiState=" + this.b + ", uiState=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenBottomSheetUiStateType$None;", "Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenBottomSheetUiStateType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends MetroLandingScreenBottomSheetUiStateType {
        public static final None b = new None(new BottomSheetUiState((BottomSheetEventHandler) null, 3));
    }

    public MetroLandingScreenBottomSheetUiStateType(BottomSheetUiState bottomSheetUiState) {
        this.f5522a = bottomSheetUiState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public BottomSheetUiState getF5522a() {
        return this.f5522a;
    }
}
