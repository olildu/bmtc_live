package app.chalo.livetracking.search.uistate;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.noneditablesearch.NonEditableSearchFieldUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/NearestStopsBottomSheetContainerUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearestStopsBottomSheetContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearestStopsBottomSheetUISpec f4508a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final List d;
    public final NearestStopItemUIState e;
    public final NonEditableSearchFieldUiState f;

    public NearestStopsBottomSheetContainerUiState(TextUIState.ChaloTextUIState title, ImageUIState imageUIState, List nearestStopsList, NearestStopItemUIState nearestStopItemUIState, NonEditableSearchFieldUiState nonEditableSearchFieldUiState, int i) {
        NearestStopsBottomSheetUISpec nearestStopsBottomSheetUISpec = new NearestStopsBottomSheetUISpec();
        nonEditableSearchFieldUiState = (i & 32) != 0 ? null : nonEditableSearchFieldUiState;
        Intrinsics.i(title, "title");
        Intrinsics.i(nearestStopsList, "nearestStopsList");
        this.f4508a = nearestStopsBottomSheetUISpec;
        this.b = title;
        this.c = imageUIState;
        this.d = nearestStopsList;
        this.e = nearestStopItemUIState;
        this.f = nonEditableSearchFieldUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearestStopsBottomSheetContainerUiState)) {
            return false;
        }
        NearestStopsBottomSheetContainerUiState nearestStopsBottomSheetContainerUiState = (NearestStopsBottomSheetContainerUiState) obj;
        return Intrinsics.d(this.f4508a, nearestStopsBottomSheetContainerUiState.f4508a) && Intrinsics.d(this.b, nearestStopsBottomSheetContainerUiState.b) && Intrinsics.d(this.c, nearestStopsBottomSheetContainerUiState.c) && Intrinsics.d(this.d, nearestStopsBottomSheetContainerUiState.d) && Intrinsics.d(this.e, nearestStopsBottomSheetContainerUiState.e) && Intrinsics.d(this.f, nearestStopsBottomSheetContainerUiState.f);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f4508a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        int iB = r30.b((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31, this.d);
        NearestStopItemUIState nearestStopItemUIState = this.e;
        int iHashCode = (iB + (nearestStopItemUIState == null ? 0 : nearestStopItemUIState.hashCode())) * 31;
        NonEditableSearchFieldUiState nonEditableSearchFieldUiState = this.f;
        return iHashCode + (nonEditableSearchFieldUiState != null ? nonEditableSearchFieldUiState.hashCode() : 0);
    }

    public final String toString() {
        return "NearestStopsBottomSheetContainerUiState(spec=" + this.f4508a + ", title=" + this.b + ", closeIcon=" + this.c + ", nearestStopsList=" + this.d + ", showAllNearbyStopsItem=" + this.e + ", searchFieldUiState=" + this.f + ")";
    }
}
