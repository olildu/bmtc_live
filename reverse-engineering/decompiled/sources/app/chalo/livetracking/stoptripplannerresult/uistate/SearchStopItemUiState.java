package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/SearchStopItemUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchStopItemUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchStopItemSpecs f4610a;
    public final StopInfoUiState b;
    public final ImageUIState c;
    public final UiEventHandler d;

    public SearchStopItemUiState(SearchStopItemSpecs searchStopItemSpecs, StopInfoUiState stopInfoUiState, ImageUIState imageUIState, UiEventHandler uiEventHandler) {
        this.f4610a = searchStopItemSpecs;
        this.b = stopInfoUiState;
        this.c = imageUIState;
        this.d = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchStopItemUiState)) {
            return false;
        }
        SearchStopItemUiState searchStopItemUiState = (SearchStopItemUiState) obj;
        return Intrinsics.d(this.f4610a, searchStopItemUiState.f4610a) && Intrinsics.d(this.b, searchStopItemUiState.b) && Intrinsics.d(this.c, searchStopItemUiState.c) && Intrinsics.d(this.d, searchStopItemUiState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f4610a.hashCode() * 31)) * 31;
        ImageUIState imageUIState = this.c;
        return this.d.hashCode() + ((iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "SearchStopItemUiState(specs=" + this.f4610a + ", stop=" + this.b + ", editStopImage=" + this.c + ", clickHandler=" + this.d + ")";
    }

    public /* synthetic */ SearchStopItemUiState(StopInfoUiState stopInfoUiState, ImageUIState imageUIState) {
        this(new SearchStopItemSpecs(null, 127), stopInfoUiState, imageUIState, UiEventHandler.Companion.f9897a);
    }
}
