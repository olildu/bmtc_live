package app.chalo.routeselection.ui;

import app.chalo.data.ProductBookingBranding;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedRouteSearchViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9204a;
    public final String b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final RouteSelectionBottomSheetType f;
    public final boolean g;
    public final String h;
    public final StopBasedRouteSelectionFlowType i;
    public final ProductBookingBranding j;
    public final String k;
    public final String l;
    public final UniversalSearchFlowSource m;
    public final SearchBarWithActionUIState n;

    public StopBasedRouteSearchViewState(String str, String str2, List recentTrips, boolean z, boolean z2, RouteSelectionBottomSheetType routeSelectionBottomSheetType, boolean z3, String str3, StopBasedRouteSelectionFlowType flowType, ProductBookingBranding brandingType, String str4, String str5, UniversalSearchFlowSource source, SearchBarWithActionUIState searchBarWithActionUIState) {
        Intrinsics.i(recentTrips, "recentTrips");
        Intrinsics.i(flowType, "flowType");
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(source, "source");
        this.f9204a = str;
        this.b = str2;
        this.c = recentTrips;
        this.d = z;
        this.e = z2;
        this.f = routeSelectionBottomSheetType;
        this.g = z3;
        this.h = str3;
        this.i = flowType;
        this.j = brandingType;
        this.k = str4;
        this.l = str5;
        this.m = source;
        this.n = searchBarWithActionUIState;
    }

    public static StopBasedRouteSearchViewState a(StopBasedRouteSearchViewState stopBasedRouteSearchViewState, String str, String str2, List list, boolean z, boolean z2, RouteSelectionBottomSheetType routeSelectionBottomSheetType, boolean z3, String str3, StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType, ProductBookingBranding productBookingBranding, String str4, String str5, UniversalSearchFlowSource universalSearchFlowSource, SearchBarWithActionUIState searchBarWithActionUIState, int i) {
        String str6 = (i & 1) != 0 ? stopBasedRouteSearchViewState.f9204a : str;
        String str7 = (i & 2) != 0 ? stopBasedRouteSearchViewState.b : str2;
        List recentTrips = (i & 4) != 0 ? stopBasedRouteSearchViewState.c : list;
        boolean z4 = (i & 8) != 0 ? stopBasedRouteSearchViewState.d : z;
        boolean z5 = (i & 16) != 0 ? stopBasedRouteSearchViewState.e : z2;
        RouteSelectionBottomSheetType routeSelectionBottomSheetType2 = (i & 32) != 0 ? stopBasedRouteSearchViewState.f : routeSelectionBottomSheetType;
        boolean z6 = (i & 64) != 0 ? stopBasedRouteSearchViewState.g : z3;
        String snackBarMessage = (i & 128) != 0 ? stopBasedRouteSearchViewState.h : str3;
        StopBasedRouteSelectionFlowType flowType = (i & 256) != 0 ? stopBasedRouteSearchViewState.i : stopBasedRouteSelectionFlowType;
        ProductBookingBranding brandingType = (i & 512) != 0 ? stopBasedRouteSearchViewState.j : productBookingBranding;
        String str8 = (i & 1024) != 0 ? stopBasedRouteSearchViewState.k : str4;
        String str9 = (i & 2048) != 0 ? stopBasedRouteSearchViewState.l : str5;
        UniversalSearchFlowSource source = (i & 4096) != 0 ? stopBasedRouteSearchViewState.m : universalSearchFlowSource;
        SearchBarWithActionUIState searchBarWithActionUIState2 = (i & 8192) != 0 ? stopBasedRouteSearchViewState.n : searchBarWithActionUIState;
        stopBasedRouteSearchViewState.getClass();
        Intrinsics.i(recentTrips, "recentTrips");
        Intrinsics.i(snackBarMessage, "snackBarMessage");
        Intrinsics.i(flowType, "flowType");
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(source, "source");
        return new StopBasedRouteSearchViewState(str6, str7, recentTrips, z4, z5, routeSelectionBottomSheetType2, z6, snackBarMessage, flowType, brandingType, str8, str9, source, searchBarWithActionUIState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedRouteSearchViewState)) {
            return false;
        }
        StopBasedRouteSearchViewState stopBasedRouteSearchViewState = (StopBasedRouteSearchViewState) obj;
        return Intrinsics.d(this.f9204a, stopBasedRouteSearchViewState.f9204a) && Intrinsics.d(this.b, stopBasedRouteSearchViewState.b) && Intrinsics.d(this.c, stopBasedRouteSearchViewState.c) && this.d == stopBasedRouteSearchViewState.d && this.e == stopBasedRouteSearchViewState.e && Intrinsics.d(this.f, stopBasedRouteSearchViewState.f) && this.g == stopBasedRouteSearchViewState.g && Intrinsics.d(this.h, stopBasedRouteSearchViewState.h) && Intrinsics.d(this.i, stopBasedRouteSearchViewState.i) && Intrinsics.d(this.j, stopBasedRouteSearchViewState.j) && Intrinsics.d(this.k, stopBasedRouteSearchViewState.k) && Intrinsics.d(this.l, stopBasedRouteSearchViewState.l) && this.m == stopBasedRouteSearchViewState.m && Intrinsics.d(this.n, stopBasedRouteSearchViewState.n);
    }

    public final int hashCode() {
        String str = this.f9204a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iB = (((r30.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31;
        RouteSelectionBottomSheetType routeSelectionBottomSheetType = this.f;
        int iHashCode2 = (this.j.hashCode() + ((this.i.hashCode() + nf1.e((((iB + (routeSelectionBottomSheetType == null ? 0 : routeSelectionBottomSheetType.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31, 31, this.h)) * 31)) * 31;
        String str3 = this.k;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode4 = (this.m.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        SearchBarWithActionUIState searchBarWithActionUIState = this.n;
        return iHashCode4 + (searchBarWithActionUIState != null ? searchBarWithActionUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("StopBasedRouteSearchViewState(fromStopName=", this.f9204a, ", toStopName=", this.b, ", recentTrips=");
        sbE.append(this.c);
        sbE.append(", shouldEnableProceedButton=");
        sbE.append(this.d);
        sbE.append(", isLoading=");
        sbE.append(this.e);
        sbE.append(", bottomSheetType=");
        sbE.append(this.f);
        sbE.append(", shouldShowSnackBar=");
        pk0.x(", snackBarMessage=", this.h, ", flowType=", sbE, this.g);
        sbE.append(this.i);
        sbE.append(", brandingType=");
        sbE.append(this.j);
        sbE.append(", ondcConifgId=");
        cb0.t(sbE, this.k, ", ondcAgencyName=", this.l, ", source=");
        sbE.append(this.m);
        sbE.append(", routeSearchBarUiState=");
        sbE.append(this.n);
        sbE.append(")");
        return sbE.toString();
    }
}
