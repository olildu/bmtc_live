package app.chalo.home.ui.savedplacesandrides;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/WorkAndHomeUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WorkAndHomeUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f3696a;
    public final SavedPlaceUIState b;
    public final SavedPlaceUIState c;
    public final LoadingShimmerUIState d;

    public WorkAndHomeUIState(TextUIState.ChaloTextUIState title, SavedPlaceUIState homePlace, SavedPlaceUIState savedPlaceUIState, LoadingShimmerUIState loadingShimmerUIState) {
        Intrinsics.i(title, "title");
        Intrinsics.i(homePlace, "homePlace");
        this.f3696a = title;
        this.b = homePlace;
        this.c = savedPlaceUIState;
        this.d = loadingShimmerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkAndHomeUIState)) {
            return false;
        }
        WorkAndHomeUIState workAndHomeUIState = (WorkAndHomeUIState) obj;
        return Intrinsics.d(this.f3696a, workAndHomeUIState.f3696a) && Intrinsics.d(this.b, workAndHomeUIState.b) && Intrinsics.d(this.c, workAndHomeUIState.c) && Intrinsics.d(this.d, workAndHomeUIState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f3696a.hashCode() * 31)) * 31)) * 31;
        LoadingShimmerUIState loadingShimmerUIState = this.d;
        return iHashCode + (loadingShimmerUIState == null ? 0 : loadingShimmerUIState.hashCode());
    }

    public final String toString() {
        return "WorkAndHomeUIState(title=" + this.f3696a + ", homePlace=" + this.b + ", workPlace=" + this.c + ", stopPlaceShimmerUIState=" + this.d + ")";
    }
}
