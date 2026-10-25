package app.chalo.productbooking.pickstop;

import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PickStopViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickStopUiSpecs f8310a;
    public final SearchBarWithActionUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final PickStopScreenLayoutUiType d;

    public PickStopViewState(SearchBarWithActionUIState searchBarUiState, TextUIState.ChaloTextUIState chaloTextUIState, PickStopScreenLayoutUiType layoutUiType) {
        PickStopUiSpecs pickStopUiSpecs = new PickStopUiSpecs();
        Intrinsics.i(searchBarUiState, "searchBarUiState");
        Intrinsics.i(layoutUiType, "layoutUiType");
        this.f8310a = pickStopUiSpecs;
        this.b = searchBarUiState;
        this.c = chaloTextUIState;
        this.d = layoutUiType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickStopViewState)) {
            return false;
        }
        PickStopViewState pickStopViewState = (PickStopViewState) obj;
        return Intrinsics.d(this.f8310a, pickStopViewState.f8310a) && Intrinsics.d(this.b, pickStopViewState.b) && Intrinsics.d(this.c, pickStopViewState.c) && Intrinsics.d(this.d, pickStopViewState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8310a.hashCode() * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return (this.d.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31)) * 31;
    }

    public final String toString() {
        return "PickStopViewState(specs=" + this.f8310a + ", searchBarUiState=" + this.b + ", listTitle=" + this.c + ", layoutUiType=" + this.d + ", snackbarUIState=null)";
    }
}
