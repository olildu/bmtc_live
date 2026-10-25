package app.chalo.home.ui.base;

import app.chalo.home.BottomSheetState;
import app.chalo.home.PendingRideFeedbackStickyBannerUIState;
import app.chalo.home.SnackBarState;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerUIState;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeScreenFragmentViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavigationTabAppModel f3225a;
    public final NavigationTabAppModel b;
    public final HomeScreenConfigStatus c;
    public final HomeScreenConfigAppModel d;
    public final String e;
    public final BottomSheetState f;
    public final SnackBarState g;
    public final boolean h;
    public final String i;
    public final HomeScreenConfigLayoutType j;
    public final RideHailingUserFeedbackData k;
    public final UserProfilingHomeStickyBannerUIState l;
    public final UserProfilingChaloBusStickyBannerUIState m;
    public final PendingRideFeedbackStickyBannerUIState n;
    public final boolean o;

    public HomeScreenFragmentViewState(NavigationTabAppModel navigationTabAppModel, NavigationTabAppModel navigationTabAppModel2, HomeScreenConfigStatus homeScreenConfigStatus, HomeScreenConfigAppModel homeScreenConfigAppModel, String str, BottomSheetState bottomSheetState, SnackBarState snackBarState, boolean z, String str2, HomeScreenConfigLayoutType layoutType, RideHailingUserFeedbackData rideHailingUserFeedbackData, UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState, UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState, PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState, boolean z2) {
        Intrinsics.i(homeScreenConfigStatus, "homeScreenConfigStatus");
        Intrinsics.i(layoutType, "layoutType");
        this.f3225a = navigationTabAppModel;
        this.b = navigationTabAppModel2;
        this.c = homeScreenConfigStatus;
        this.d = homeScreenConfigAppModel;
        this.e = str;
        this.f = bottomSheetState;
        this.g = snackBarState;
        this.h = z;
        this.i = str2;
        this.j = layoutType;
        this.k = rideHailingUserFeedbackData;
        this.l = userProfilingHomeStickyBannerUIState;
        this.m = userProfilingChaloBusStickyBannerUIState;
        this.n = pendingRideFeedbackStickyBannerUIState;
        this.o = z2;
    }

    public static HomeScreenFragmentViewState a(HomeScreenFragmentViewState homeScreenFragmentViewState, NavigationTabAppModel navigationTabAppModel, NavigationTabAppModel navigationTabAppModel2, HomeScreenConfigAppModel homeScreenConfigAppModel, String str, BottomSheetState bottomSheetState, SnackBarState snackBarState, String str2, HomeScreenConfigLayoutType homeScreenConfigLayoutType, RideHailingUserFeedbackData rideHailingUserFeedbackData, UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState, UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState, PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState, boolean z, int i) {
        NavigationTabAppModel navigationTabAppModel3 = (i & 1) != 0 ? homeScreenFragmentViewState.f3225a : navigationTabAppModel;
        NavigationTabAppModel navigationTabAppModel4 = (i & 2) != 0 ? homeScreenFragmentViewState.b : navigationTabAppModel2;
        HomeScreenConfigStatus homeScreenConfigStatus = homeScreenFragmentViewState.c;
        HomeScreenConfigAppModel homeScreenConfigAppModel2 = (i & 8) != 0 ? homeScreenFragmentViewState.d : homeScreenConfigAppModel;
        String str3 = (i & 16) != 0 ? homeScreenFragmentViewState.e : str;
        BottomSheetState bottomSheetState2 = (i & 32) != 0 ? homeScreenFragmentViewState.f : bottomSheetState;
        SnackBarState snackBarState2 = (i & 64) != 0 ? homeScreenFragmentViewState.g : snackBarState;
        boolean z2 = (i & 128) != 0 ? homeScreenFragmentViewState.h : true;
        String str4 = (i & 256) != 0 ? homeScreenFragmentViewState.i : str2;
        HomeScreenConfigLayoutType layoutType = (i & 512) != 0 ? homeScreenFragmentViewState.j : homeScreenConfigLayoutType;
        RideHailingUserFeedbackData rideHailingUserFeedbackData2 = (i & 1024) != 0 ? homeScreenFragmentViewState.k : rideHailingUserFeedbackData;
        UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState2 = (i & 2048) != 0 ? homeScreenFragmentViewState.l : userProfilingHomeStickyBannerUIState;
        UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState2 = (i & 4096) != 0 ? homeScreenFragmentViewState.m : userProfilingChaloBusStickyBannerUIState;
        PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState2 = (i & 8192) != 0 ? homeScreenFragmentViewState.n : pendingRideFeedbackStickyBannerUIState;
        boolean z3 = (i & 16384) != 0 ? homeScreenFragmentViewState.o : z;
        homeScreenFragmentViewState.getClass();
        Intrinsics.i(homeScreenConfigStatus, "homeScreenConfigStatus");
        Intrinsics.i(snackBarState2, "snackBarState");
        Intrinsics.i(layoutType, "layoutType");
        return new HomeScreenFragmentViewState(navigationTabAppModel3, navigationTabAppModel4, homeScreenConfigStatus, homeScreenConfigAppModel2, str3, bottomSheetState2, snackBarState2, z2, str4, layoutType, rideHailingUserFeedbackData2, userProfilingHomeStickyBannerUIState2, userProfilingChaloBusStickyBannerUIState2, pendingRideFeedbackStickyBannerUIState2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeScreenFragmentViewState)) {
            return false;
        }
        HomeScreenFragmentViewState homeScreenFragmentViewState = (HomeScreenFragmentViewState) obj;
        return Intrinsics.d(this.f3225a, homeScreenFragmentViewState.f3225a) && Intrinsics.d(this.b, homeScreenFragmentViewState.b) && this.c == homeScreenFragmentViewState.c && Intrinsics.d(this.d, homeScreenFragmentViewState.d) && Intrinsics.d(this.e, homeScreenFragmentViewState.e) && Intrinsics.d(this.f, homeScreenFragmentViewState.f) && Intrinsics.d(this.g, homeScreenFragmentViewState.g) && this.h == homeScreenFragmentViewState.h && Intrinsics.d(this.i, homeScreenFragmentViewState.i) && this.j == homeScreenFragmentViewState.j && Intrinsics.d(this.k, homeScreenFragmentViewState.k) && Intrinsics.d(this.l, homeScreenFragmentViewState.l) && Intrinsics.d(this.m, homeScreenFragmentViewState.m) && Intrinsics.d(this.n, homeScreenFragmentViewState.n) && this.o == homeScreenFragmentViewState.o;
    }

    public final int hashCode() {
        NavigationTabAppModel navigationTabAppModel = this.f3225a;
        int iHashCode = (navigationTabAppModel == null ? 0 : navigationTabAppModel.hashCode()) * 31;
        NavigationTabAppModel navigationTabAppModel2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (navigationTabAppModel2 == null ? 0 : navigationTabAppModel2.hashCode())) * 31)) * 31;
        HomeScreenConfigAppModel homeScreenConfigAppModel = this.d;
        int iHashCode3 = (iHashCode2 + (homeScreenConfigAppModel == null ? 0 : homeScreenConfigAppModel.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31) + (this.h ? 1231 : 1237)) * 31;
        String str2 = this.i;
        int iHashCode5 = (this.j.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        RideHailingUserFeedbackData rideHailingUserFeedbackData = this.k;
        int iHashCode6 = (iHashCode5 + (rideHailingUserFeedbackData == null ? 0 : rideHailingUserFeedbackData.hashCode())) * 31;
        UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState = this.l;
        int iHashCode7 = (iHashCode6 + (userProfilingHomeStickyBannerUIState == null ? 0 : userProfilingHomeStickyBannerUIState.hashCode())) * 31;
        UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState = this.m;
        int iHashCode8 = (iHashCode7 + (userProfilingChaloBusStickyBannerUIState == null ? 0 : userProfilingChaloBusStickyBannerUIState.hashCode())) * 31;
        PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState = this.n;
        return ((iHashCode8 + (pendingRideFeedbackStickyBannerUIState != null ? pendingRideFeedbackStickyBannerUIState.hashCode() : 0)) * 31) + (this.o ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeScreenFragmentViewState(selectedBottomNavTab=");
        sb.append(this.f3225a);
        sb.append(", startDestination=");
        sb.append(this.b);
        sb.append(", homeScreenConfigStatus=");
        sb.append(this.c);
        sb.append(", homeScreenConfig=");
        sb.append(this.d);
        sb.append(", configCityId=");
        sb.append(this.e);
        sb.append(", bottomSheetState=");
        sb.append(this.f);
        sb.append(", snackBarState=");
        sb.append(this.g);
        sb.append(", showLoadingDialog=");
        sb.append(this.h);
        sb.append(", currentCityName=");
        sb.append(this.i);
        sb.append(", layoutType=");
        sb.append(this.j);
        sb.append(", rideHailingUserFeedbackData=");
        sb.append(this.k);
        sb.append(", userProfilingHomeStickyBannerUIState=");
        sb.append(this.l);
        sb.append(", userProfilingChaloBusStickyBannerUIState=");
        sb.append(this.m);
        sb.append(", pendingRideFeedbackStickyBannerUIState=");
        sb.append(this.n);
        sb.append(", hideCitySwitchItem=");
        return b3.g(")", sb, this.o);
    }
}
