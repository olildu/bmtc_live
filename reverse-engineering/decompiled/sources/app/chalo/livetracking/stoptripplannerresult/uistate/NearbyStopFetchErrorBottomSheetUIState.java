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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/NearbyStopFetchErrorBottomSheetUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopFetchErrorBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f4597a;
    public final NearbyStopFetchErrorBottomSheetUISpec b;
    public final ImageUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final ImageUIState f;
    public final TextUIState.ChaloTextUIState g;
    public final NonEditableSearchFieldUiState h;

    public NearbyStopFetchErrorBottomSheetUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState subTitle, ImageUIState imageUIState2, TextUIState.ChaloTextUIState retryCta, NonEditableSearchFieldUiState nonEditableSearchFieldUiState) {
        BottomSheetUiState bottomSheetUiState = new BottomSheetUiState((BottomSheetEventHandler) null, 3);
        NearbyStopFetchErrorBottomSheetUISpec nearbyStopFetchErrorBottomSheetUISpec = new NearbyStopFetchErrorBottomSheetUISpec();
        Intrinsics.i(imageUIState, "imageUIState");
        Intrinsics.i(title, "title");
        Intrinsics.i(subTitle, "subTitle");
        Intrinsics.i(retryCta, "retryCta");
        this.f4597a = bottomSheetUiState;
        this.b = nearbyStopFetchErrorBottomSheetUISpec;
        this.c = imageUIState;
        this.d = title;
        this.e = subTitle;
        this.f = imageUIState2;
        this.g = retryCta;
        this.h = nonEditableSearchFieldUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopFetchErrorBottomSheetUIState)) {
            return false;
        }
        NearbyStopFetchErrorBottomSheetUIState nearbyStopFetchErrorBottomSheetUIState = (NearbyStopFetchErrorBottomSheetUIState) obj;
        return Intrinsics.d(this.f4597a, nearbyStopFetchErrorBottomSheetUIState.f4597a) && Intrinsics.d(this.b, nearbyStopFetchErrorBottomSheetUIState.b) && Intrinsics.d(this.c, nearbyStopFetchErrorBottomSheetUIState.c) && Intrinsics.d(this.d, nearbyStopFetchErrorBottomSheetUIState.d) && Intrinsics.d(this.e, nearbyStopFetchErrorBottomSheetUIState.e) && Intrinsics.d(this.f, nearbyStopFetchErrorBottomSheetUIState.f) && Intrinsics.d(this.g, nearbyStopFetchErrorBottomSheetUIState.g) && Intrinsics.d(this.h, nearbyStopFetchErrorBottomSheetUIState.h);
    }

    public final int hashCode() {
        int iF = r30.f(this.e, r30.f(this.d, r30.e(this.c, (this.b.hashCode() + (this.f4597a.hashCode() * 31)) * 31, 31), 31), 31);
        ImageUIState imageUIState = this.f;
        return this.h.hashCode() + r30.f(this.g, (iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "NearbyStopFetchErrorBottomSheetUIState(bottomSheetUiState=" + this.f4597a + ", specs=" + this.b + ", imageUIState=" + this.c + ", title=" + this.d + ", subTitle=" + this.e + ", closeIcon=" + this.f + ", retryCta=" + this.g + ", searchFieldUiState=" + this.h + ")";
    }
}
