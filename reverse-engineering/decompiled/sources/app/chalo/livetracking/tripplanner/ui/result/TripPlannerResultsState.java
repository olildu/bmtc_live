package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.compose.SearchFieldSectionType;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultsState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripPlannerResultsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4792a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final SearchFieldSectionType f;
    public final boolean g;
    public final TripPlannerResultSectionType h;
    public final String i;
    public final List j;
    public final List k;
    public final TripPlannerResultDialogType l;
    public final List m;
    public final TripPlannerTabType n;
    public final boolean o;
    public final Long p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    public TripPlannerResultsState(String str, String str2, String str3, String str4, boolean z, SearchFieldSectionType searchFieldSectionType, boolean z2, TripPlannerResultSectionType resultSectionType, String str5, List list, List list2, TripPlannerResultDialogType tripPlannerResultDialogType, List tabsList, TripPlannerTabType currentlySelectedTab, boolean z3, Long l, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.i(resultSectionType, "resultSectionType");
        Intrinsics.i(tabsList, "tabsList");
        Intrinsics.i(currentlySelectedTab, "currentlySelectedTab");
        this.f4792a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = searchFieldSectionType;
        this.g = z2;
        this.h = resultSectionType;
        this.i = str5;
        this.j = list;
        this.k = list2;
        this.l = tripPlannerResultDialogType;
        this.m = tabsList;
        this.n = currentlySelectedTab;
        this.o = z3;
        this.p = l;
        this.q = z4;
        this.r = z5;
        this.s = z6;
        this.t = z7;
    }

    public static TripPlannerResultsState a(TripPlannerResultsState tripPlannerResultsState, String str, String str2, String str3, String str4, boolean z, SearchFieldSectionType searchFieldSectionType, boolean z2, TripPlannerResultSectionType tripPlannerResultSectionType, String str5, List list, List list2, TripPlannerResultDialogType tripPlannerResultDialogType, List list3, TripPlannerTabType tripPlannerTabType, boolean z3, Long l, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        String str6 = (i & 1) != 0 ? tripPlannerResultsState.f4792a : str;
        String str7 = (i & 2) != 0 ? tripPlannerResultsState.b : str2;
        String str8 = (i & 4) != 0 ? tripPlannerResultsState.c : str3;
        String str9 = (i & 8) != 0 ? tripPlannerResultsState.d : str4;
        boolean z8 = (i & 16) != 0 ? tripPlannerResultsState.e : z;
        SearchFieldSectionType searchFieldSectionType2 = (i & 32) != 0 ? tripPlannerResultsState.f : searchFieldSectionType;
        boolean z9 = (i & 64) != 0 ? tripPlannerResultsState.g : z2;
        TripPlannerResultSectionType resultSectionType = (i & 128) != 0 ? tripPlannerResultsState.h : tripPlannerResultSectionType;
        String str10 = (i & 256) != 0 ? tripPlannerResultsState.i : str5;
        List list4 = (i & 512) != 0 ? tripPlannerResultsState.j : list;
        List list5 = (i & 1024) != 0 ? tripPlannerResultsState.k : list2;
        TripPlannerResultDialogType tripPlannerResultDialogType2 = (i & 2048) != 0 ? tripPlannerResultsState.l : tripPlannerResultDialogType;
        List tabsList = (i & 4096) != 0 ? tripPlannerResultsState.m : list3;
        TripPlannerTabType currentlySelectedTab = (i & 8192) != 0 ? tripPlannerResultsState.n : tripPlannerTabType;
        String str11 = str6;
        boolean z10 = (i & 16384) != 0 ? tripPlannerResultsState.o : z3;
        Long l2 = (i & 32768) != 0 ? tripPlannerResultsState.p : l;
        boolean z11 = (i & 65536) != 0 ? tripPlannerResultsState.q : z4;
        boolean z12 = (i & 131072) != 0 ? tripPlannerResultsState.r : z5;
        boolean z13 = (i & 262144) != 0 ? tripPlannerResultsState.s : z6;
        boolean z14 = (i & 524288) != 0 ? tripPlannerResultsState.t : z7;
        tripPlannerResultsState.getClass();
        Intrinsics.i(resultSectionType, "resultSectionType");
        Intrinsics.i(tabsList, "tabsList");
        Intrinsics.i(currentlySelectedTab, "currentlySelectedTab");
        return new TripPlannerResultsState(str11, str7, str8, str9, z8, searchFieldSectionType2, z9, resultSectionType, str10, list4, list5, tripPlannerResultDialogType2, tabsList, currentlySelectedTab, z10, l2, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerResultsState)) {
            return false;
        }
        TripPlannerResultsState tripPlannerResultsState = (TripPlannerResultsState) obj;
        return Intrinsics.d(this.f4792a, tripPlannerResultsState.f4792a) && Intrinsics.d(this.b, tripPlannerResultsState.b) && Intrinsics.d(this.c, tripPlannerResultsState.c) && Intrinsics.d(this.d, tripPlannerResultsState.d) && this.e == tripPlannerResultsState.e && this.f == tripPlannerResultsState.f && this.g == tripPlannerResultsState.g && this.h == tripPlannerResultsState.h && Intrinsics.d(this.i, tripPlannerResultsState.i) && Intrinsics.d(this.j, tripPlannerResultsState.j) && Intrinsics.d(this.k, tripPlannerResultsState.k) && Intrinsics.d(this.l, tripPlannerResultsState.l) && Intrinsics.d(this.m, tripPlannerResultsState.m) && Intrinsics.d(this.n, tripPlannerResultsState.n) && this.o == tripPlannerResultsState.o && Intrinsics.d(this.p, tripPlannerResultsState.p) && this.q == tripPlannerResultsState.q && this.r == tripPlannerResultsState.r && this.s == tripPlannerResultsState.s && this.t == tripPlannerResultsState.t;
    }

    public final int hashCode() {
        String str = this.f4792a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        SearchFieldSectionType searchFieldSectionType = this.f;
        int iHashCode5 = (this.h.hashCode() + ((((iHashCode4 + (searchFieldSectionType == null ? 0 : searchFieldSectionType.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31)) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.j;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TripPlannerResultDialogType tripPlannerResultDialogType = this.l;
        int iHashCode9 = (((this.n.hashCode() + r30.b((iHashCode8 + (tripPlannerResultDialogType == null ? 0 : tripPlannerResultDialogType.hashCode())) * 31, 31, this.m)) * 31) + (this.o ? 1231 : 1237)) * 31;
        Long l = this.p;
        return ((((((((iHashCode9 + (l != null ? l.hashCode() : 0)) * 31) + (this.q ? 1231 : 1237)) * 31) + (this.r ? 1231 : 1237)) * 31) + (this.s ? 1231 : 1237)) * 31) + (this.t ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TripPlannerResultsState(fromName=", this.f4792a, ", toName=", this.b, ", timeSelectedString=");
        cb0.t(sbE, this.c, ", dateSelectedString=", this.d, ", showDateTimeSelection=");
        sbE.append(this.e);
        sbE.append(", searchSectionType=");
        sbE.append(this.f);
        sbE.append(", isProceedBtnEnabled=");
        sbE.append(this.g);
        sbE.append(", resultSectionType=");
        sbE.append(this.h);
        sbE.append(", errorMsg=");
        pk0.w(this.i, ", itinerariesResult=", ", recentTripsList=", sbE, this.j);
        sbE.append(this.k);
        sbE.append(", dialogType=");
        sbE.append(this.l);
        sbE.append(", tabsList=");
        sbE.append(this.m);
        sbE.append(", currentlySelectedTab=");
        sbE.append(this.n);
        sbE.append(", showChaloBusTabToolTip=");
        sbE.append(this.o);
        sbE.append(", selectedDateTimeInMillis=");
        sbE.append(this.p);
        sbE.append(", hopResultCallInProgress=");
        z40.r(sbE, this.q, ", shouldShowHopLoader=", this.r, ", hasHopItineraryCallMadeOnce=");
        return n21.h(sbE, this.s, ", showHopApiFetchFailedSnackbar=", this.t, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TripPlannerResultsState() {
        TripPlannerResultSectionType tripPlannerResultSectionType = TripPlannerResultSectionType.RECENT;
        EmptyList emptyList = EmptyList.f17557a;
        TripPlannerTabType.INSTANCE.getClass();
        this(null, null, null, null, true, null, false, tripPlannerResultSectionType, null, null, null, null, emptyList, TripPlannerTabType.g, false, null, false, false, false, false);
    }
}
