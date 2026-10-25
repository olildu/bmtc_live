package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.noneditablesearch.NonEditableSearchFieldUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/NoNearbyStopsBottomSheetUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoNearbyStopsBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f4603a;
    public final NoNearbyStopsBottomSheetUISpec b;
    public final ImageUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final ImageUIState f;
    public final NonEditableSearchFieldUiState g;

    public NoNearbyStopsBottomSheetUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState subTitle, ImageUIState imageUIState2, NonEditableSearchFieldUiState nonEditableSearchFieldUiState) {
        BottomSheetUiState bottomSheetUiState = new BottomSheetUiState((BottomSheetEventHandler) null, 3);
        NoNearbyStopsBottomSheetUISpec noNearbyStopsBottomSheetUISpec = new NoNearbyStopsBottomSheetUISpec();
        Intrinsics.i(imageUIState, "imageUIState");
        Intrinsics.i(title, "title");
        Intrinsics.i(subTitle, "subTitle");
        this.f4603a = bottomSheetUiState;
        this.b = noNearbyStopsBottomSheetUISpec;
        this.c = imageUIState;
        this.d = title;
        this.e = subTitle;
        this.f = imageUIState2;
        this.g = nonEditableSearchFieldUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoNearbyStopsBottomSheetUIState)) {
            return false;
        }
        NoNearbyStopsBottomSheetUIState noNearbyStopsBottomSheetUIState = (NoNearbyStopsBottomSheetUIState) obj;
        return Intrinsics.d(this.f4603a, noNearbyStopsBottomSheetUIState.f4603a) && Intrinsics.d(this.b, noNearbyStopsBottomSheetUIState.b) && Intrinsics.d(this.c, noNearbyStopsBottomSheetUIState.c) && Intrinsics.d(this.d, noNearbyStopsBottomSheetUIState.d) && Intrinsics.d(this.e, noNearbyStopsBottomSheetUIState.e) && Intrinsics.d(this.f, noNearbyStopsBottomSheetUIState.f) && Intrinsics.d(this.g, noNearbyStopsBottomSheetUIState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.e, r30.f(this.d, r30.e(this.c, (this.b.hashCode() + (this.f4603a.hashCode() * 31)) * 31, 31), 31), 31);
        ImageUIState imageUIState = this.f;
        return this.g.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "NoNearbyStopsBottomSheetUIState(bottomSheetUiState=" + this.f4603a + ", specs=" + this.b + ", imageUIState=" + this.c + ", title=" + this.d + ", subTitle=" + this.e + ", closeIcon=" + this.f + ", searchFieldUiState=" + this.g + ")";
    }
}
