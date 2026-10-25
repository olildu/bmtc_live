package app.chalo.livetracking.search;

import app.chalo.recent.model.app.RecentPlaceAppModel;
import defpackage.dd;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchDataState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedTripPlannerSearchDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopBasedSearchSelectedLocation f4490a;
    public final StopBasedSearchSelectedLocation b;
    public final List c;
    public final List d;
    public final List e;
    public final boolean f;
    public final StopBasedTripPlannerSearchBottomSheetType g;
    public final RecentPlaceAppModel h;
    public final RecentPlaceAppModel i;
    public final SearchTarget j;

    public StopBasedTripPlannerSearchDataState(StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation, StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2, List recentList, List nearestStopsForFromPlace, List nearestStopsForToPlace, boolean z, StopBasedTripPlannerSearchBottomSheetType bottomSheetState, RecentPlaceAppModel recentPlaceAppModel, RecentPlaceAppModel recentPlaceAppModel2, SearchTarget searchTarget) {
        Intrinsics.i(recentList, "recentList");
        Intrinsics.i(nearestStopsForFromPlace, "nearestStopsForFromPlace");
        Intrinsics.i(nearestStopsForToPlace, "nearestStopsForToPlace");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Intrinsics.i(searchTarget, "searchTarget");
        this.f4490a = stopBasedSearchSelectedLocation;
        this.b = stopBasedSearchSelectedLocation2;
        this.c = recentList;
        this.d = nearestStopsForFromPlace;
        this.e = nearestStopsForToPlace;
        this.f = z;
        this.g = bottomSheetState;
        this.h = recentPlaceAppModel;
        this.i = recentPlaceAppModel2;
        this.j = searchTarget;
    }

    public static StopBasedTripPlannerSearchDataState a(StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState, StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation, StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2, List list, List list2, List list3, boolean z, StopBasedTripPlannerSearchBottomSheetType stopBasedTripPlannerSearchBottomSheetType, RecentPlaceAppModel recentPlaceAppModel, RecentPlaceAppModel recentPlaceAppModel2, SearchTarget searchTarget, int i) {
        if ((i & 1) != 0) {
            stopBasedSearchSelectedLocation = stopBasedTripPlannerSearchDataState.f4490a;
        }
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation3 = stopBasedSearchSelectedLocation;
        if ((i & 2) != 0) {
            stopBasedSearchSelectedLocation2 = stopBasedTripPlannerSearchDataState.b;
        }
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation4 = stopBasedSearchSelectedLocation2;
        stopBasedTripPlannerSearchDataState.getClass();
        if ((i & 8) != 0) {
            list = stopBasedTripPlannerSearchDataState.c;
        }
        List recentList = list;
        if ((i & 16) != 0) {
            list2 = stopBasedTripPlannerSearchDataState.d;
        }
        List nearestStopsForFromPlace = list2;
        List nearestStopsForToPlace = (i & 32) != 0 ? stopBasedTripPlannerSearchDataState.e : list3;
        boolean z2 = (i & 64) != 0 ? stopBasedTripPlannerSearchDataState.f : z;
        StopBasedTripPlannerSearchBottomSheetType bottomSheetState = (i & 128) != 0 ? stopBasedTripPlannerSearchDataState.g : stopBasedTripPlannerSearchBottomSheetType;
        RecentPlaceAppModel recentPlaceAppModel3 = (i & 256) != 0 ? stopBasedTripPlannerSearchDataState.h : recentPlaceAppModel;
        RecentPlaceAppModel recentPlaceAppModel4 = (i & 512) != 0 ? stopBasedTripPlannerSearchDataState.i : recentPlaceAppModel2;
        SearchTarget searchTarget2 = (i & 1024) != 0 ? stopBasedTripPlannerSearchDataState.j : searchTarget;
        stopBasedTripPlannerSearchDataState.getClass();
        Intrinsics.i(recentList, "recentList");
        Intrinsics.i(nearestStopsForFromPlace, "nearestStopsForFromPlace");
        Intrinsics.i(nearestStopsForToPlace, "nearestStopsForToPlace");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Intrinsics.i(searchTarget2, "searchTarget");
        return new StopBasedTripPlannerSearchDataState(stopBasedSearchSelectedLocation3, stopBasedSearchSelectedLocation4, recentList, nearestStopsForFromPlace, nearestStopsForToPlace, z2, bottomSheetState, recentPlaceAppModel3, recentPlaceAppModel4, searchTarget2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedTripPlannerSearchDataState)) {
            return false;
        }
        StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState = (StopBasedTripPlannerSearchDataState) obj;
        return Intrinsics.d(this.f4490a, stopBasedTripPlannerSearchDataState.f4490a) && Intrinsics.d(this.b, stopBasedTripPlannerSearchDataState.b) && Intrinsics.d(this.c, stopBasedTripPlannerSearchDataState.c) && Intrinsics.d(this.d, stopBasedTripPlannerSearchDataState.d) && Intrinsics.d(this.e, stopBasedTripPlannerSearchDataState.e) && this.f == stopBasedTripPlannerSearchDataState.f && Intrinsics.d(this.g, stopBasedTripPlannerSearchDataState.g) && Intrinsics.d(this.h, stopBasedTripPlannerSearchDataState.h) && Intrinsics.d(this.i, stopBasedTripPlannerSearchDataState.i) && this.j == stopBasedTripPlannerSearchDataState.j;
    }

    public final int hashCode() {
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation = this.f4490a;
        int iHashCode = (stopBasedSearchSelectedLocation == null ? 0 : stopBasedSearchSelectedLocation.hashCode()) * 31;
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2 = this.b;
        int iHashCode2 = (this.g.hashCode() + ((r30.b(r30.b(r30.b((iHashCode + (stopBasedSearchSelectedLocation2 == null ? 0 : stopBasedSearchSelectedLocation2.hashCode())) * 961, 31, this.c), 31, this.d), 31, this.e) + (this.f ? 1231 : 1237)) * 31)) * 31;
        RecentPlaceAppModel recentPlaceAppModel = this.h;
        int iHashCode3 = (iHashCode2 + (recentPlaceAppModel == null ? 0 : recentPlaceAppModel.hashCode())) * 31;
        RecentPlaceAppModel recentPlaceAppModel2 = this.i;
        return this.j.hashCode() + ((iHashCode3 + (recentPlaceAppModel2 != null ? recentPlaceAppModel2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopBasedTripPlannerSearchDataState(fromLocation=");
        sb.append(this.f4490a);
        sb.append(", toLocation=");
        sb.append(this.b);
        sb.append(", currentLocation=null, recentList=");
        dd.o(sb, this.c, ", nearestStopsForFromPlace=", this.d, ", nearestStopsForToPlace=");
        sb.append(this.e);
        sb.append(", showLoadingDialog=");
        sb.append(this.f);
        sb.append(", bottomSheetState=");
        sb.append(this.g);
        sb.append(", selectedFromPlaceForNearestStops=");
        sb.append(this.h);
        sb.append(", selectedToPlaceForNearestStops=");
        sb.append(this.i);
        sb.append(", searchTarget=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
