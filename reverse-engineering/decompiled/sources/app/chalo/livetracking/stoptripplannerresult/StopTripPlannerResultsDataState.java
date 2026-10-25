package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.constants.Source;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultsDataState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopTripPlannerResultsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4565a;
    public final Source b;
    public final StopTripPlannerLocationType c;
    public final StopTripPlannerLocationType d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final StopTripPlannerResultsectionType h;
    public final StopTripPlannerResultErrorType i;
    public final List j;
    public final StopTripPlannerTabType k;
    public final StopBasedTripPlannerResultsBottomSheetType l;
    public final boolean m;
    public final StopTripPlannerStopEditTarget n;
    public final boolean o;
    public final Long p;
    public final boolean q;
    public final Long r;

    public StopTripPlannerResultsDataState(String str, Source prevSource, StopTripPlannerLocationType fromLocation, StopTripPlannerLocationType toLocation, Map map, Map map2, Map map3, StopTripPlannerResultsectionType resultSectionType, StopTripPlannerResultErrorType error, List tabsList, StopTripPlannerTabType currentlySelectedTab, StopBasedTripPlannerResultsBottomSheetType bottomSheetState, boolean z, StopTripPlannerStopEditTarget stopEditTarget, boolean z2, Long l, boolean z3, Long l2) {
        Intrinsics.i(prevSource, "prevSource");
        Intrinsics.i(fromLocation, "fromLocation");
        Intrinsics.i(toLocation, "toLocation");
        Intrinsics.i(resultSectionType, "resultSectionType");
        Intrinsics.i(error, "error");
        Intrinsics.i(tabsList, "tabsList");
        Intrinsics.i(currentlySelectedTab, "currentlySelectedTab");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Intrinsics.i(stopEditTarget, "stopEditTarget");
        this.f4565a = str;
        this.b = prevSource;
        this.c = fromLocation;
        this.d = toLocation;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = resultSectionType;
        this.i = error;
        this.j = tabsList;
        this.k = currentlySelectedTab;
        this.l = bottomSheetState;
        this.m = z;
        this.n = stopEditTarget;
        this.o = z2;
        this.p = l;
        this.q = z3;
        this.r = l2;
    }

    public static StopTripPlannerResultsDataState a(StopTripPlannerResultsDataState stopTripPlannerResultsDataState, String str, Source source, StopTripPlannerLocationType stopTripPlannerLocationType, StopTripPlannerLocationType stopTripPlannerLocationType2, Map map, Map map2, Map map3, StopTripPlannerResultsectionType stopTripPlannerResultsectionType, StopTripPlannerResultErrorType stopTripPlannerResultErrorType, StopTripPlannerTabType stopTripPlannerTabType, StopBasedTripPlannerResultsBottomSheetType stopBasedTripPlannerResultsBottomSheetType, boolean z, StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget, boolean z2, Long l, boolean z3, Long l2, int i) {
        String resultManagerId = (i & 1) != 0 ? stopTripPlannerResultsDataState.f4565a : str;
        Source prevSource = (i & 2) != 0 ? stopTripPlannerResultsDataState.b : source;
        StopTripPlannerLocationType fromLocation = (i & 4) != 0 ? stopTripPlannerResultsDataState.c : stopTripPlannerLocationType;
        StopTripPlannerLocationType toLocation = (i & 8) != 0 ? stopTripPlannerResultsDataState.d : stopTripPlannerLocationType2;
        Map map4 = (i & 16) != 0 ? stopTripPlannerResultsDataState.e : map;
        Map map5 = (i & 32) != 0 ? stopTripPlannerResultsDataState.f : map2;
        Map map6 = (i & 64) != 0 ? stopTripPlannerResultsDataState.g : map3;
        StopTripPlannerResultsectionType resultSectionType = (i & 128) != 0 ? stopTripPlannerResultsDataState.h : stopTripPlannerResultsectionType;
        StopTripPlannerResultErrorType error = (i & 256) != 0 ? stopTripPlannerResultsDataState.i : stopTripPlannerResultErrorType;
        stopTripPlannerResultsDataState.getClass();
        List tabsList = stopTripPlannerResultsDataState.j;
        StopTripPlannerTabType currentlySelectedTab = (i & 2048) != 0 ? stopTripPlannerResultsDataState.k : stopTripPlannerTabType;
        StopBasedTripPlannerResultsBottomSheetType bottomSheetState = (i & 4096) != 0 ? stopTripPlannerResultsDataState.l : stopBasedTripPlannerResultsBottomSheetType;
        boolean z4 = (i & 8192) != 0 ? stopTripPlannerResultsDataState.m : z;
        StopTripPlannerStopEditTarget stopEditTarget = (i & 16384) != 0 ? stopTripPlannerResultsDataState.n : stopTripPlannerStopEditTarget;
        boolean z5 = (i & 32768) != 0 ? stopTripPlannerResultsDataState.o : z2;
        Long l3 = (i & 65536) != 0 ? stopTripPlannerResultsDataState.p : l;
        boolean z6 = (i & 131072) != 0 ? stopTripPlannerResultsDataState.q : z3;
        Long l4 = (i & 262144) != 0 ? stopTripPlannerResultsDataState.r : l2;
        stopTripPlannerResultsDataState.getClass();
        Intrinsics.i(resultManagerId, "resultManagerId");
        Intrinsics.i(prevSource, "prevSource");
        Intrinsics.i(fromLocation, "fromLocation");
        Intrinsics.i(toLocation, "toLocation");
        Intrinsics.i(resultSectionType, "resultSectionType");
        Intrinsics.i(error, "error");
        Intrinsics.i(tabsList, "tabsList");
        Intrinsics.i(currentlySelectedTab, "currentlySelectedTab");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Intrinsics.i(stopEditTarget, "stopEditTarget");
        return new StopTripPlannerResultsDataState(resultManagerId, prevSource, fromLocation, toLocation, map4, map5, map6, resultSectionType, error, tabsList, currentlySelectedTab, bottomSheetState, z4, stopEditTarget, z5, l3, z6, l4);
    }

    public final Map b() {
        Map map = this.e;
        if (map != null) {
            return (Map) map.get(this.k);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripPlannerResultsDataState)) {
            return false;
        }
        StopTripPlannerResultsDataState stopTripPlannerResultsDataState = (StopTripPlannerResultsDataState) obj;
        return this.f4565a.equals(stopTripPlannerResultsDataState.f4565a) && this.b == stopTripPlannerResultsDataState.b && Intrinsics.d(this.c, stopTripPlannerResultsDataState.c) && Intrinsics.d(this.d, stopTripPlannerResultsDataState.d) && Intrinsics.d(this.e, stopTripPlannerResultsDataState.e) && Intrinsics.d(this.f, stopTripPlannerResultsDataState.f) && Intrinsics.d(this.g, stopTripPlannerResultsDataState.g) && this.h == stopTripPlannerResultsDataState.h && this.i == stopTripPlannerResultsDataState.i && Intrinsics.d(this.j, stopTripPlannerResultsDataState.j) && this.k == stopTripPlannerResultsDataState.k && Intrinsics.d(this.l, stopTripPlannerResultsDataState.l) && this.m == stopTripPlannerResultsDataState.m && this.n == stopTripPlannerResultsDataState.n && this.o == stopTripPlannerResultsDataState.o && Intrinsics.d(this.p, stopTripPlannerResultsDataState.p) && this.q == stopTripPlannerResultsDataState.q && Intrinsics.d(this.r, stopTripPlannerResultsDataState.r);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nf1.f(this.b, this.f4565a.hashCode() * 31, 31)) * 31)) * 31;
        Map map = this.e;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.g;
        int iHashCode4 = (((this.n.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + r30.b((this.i.hashCode() + ((this.h.hashCode() + ((iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31)) * 31)) * 961, 31, this.j)) * 31)) * 31) + (this.m ? 1231 : 1237)) * 31)) * 31) + (this.o ? 1231 : 1237)) * 31;
        Long l = this.p;
        int iHashCode5 = (((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31) + (this.q ? 1231 : 1237)) * 31;
        Long l2 = this.r;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "StopTripPlannerResultsDataState(resultManagerId=" + this.f4565a + ", prevSource=" + this.b + ", fromLocation=" + this.c + ", toLocation=" + this.d + ", tripPlannerResultMap=" + this.e + ", tripPlannerItinerariesLiveInfoMap=" + this.f + ", nearbyStopsResultsMap=" + this.g + ", resultSectionType=" + this.h + ", error=" + this.i + ", recentTripsList=null, tabsList=" + this.j + ", currentlySelectedTab=" + this.k + ", bottomSheetState=" + this.l + ", showLoadingDialog=" + this.m + ", stopEditTarget=" + this.n + ", isNearbyStopsResultContainerCollapsed=" + this.o + ", lastResultFetchTimestamp=" + this.p + ", shouldShowRefreshNudge=" + this.q + ", lastRefreshNudgeShownTimestamp=" + this.r + ")";
    }
}
