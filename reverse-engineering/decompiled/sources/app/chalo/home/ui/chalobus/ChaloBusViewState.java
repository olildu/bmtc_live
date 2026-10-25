package app.chalo.home.ui.chalobus;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import app.chalo.home.data.model.PremiumPassSavingsInfo;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import defpackage.dd;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3286a;
    public final boolean b;
    public final int c;
    public final PBStopSelectionScreenBottomSheetType d;
    public final List e;
    public final TabMetaDataAppModel f;
    public final boolean g;
    public final PBStopPlaceSelectedAppModel h;
    public final PBStopPlaceSelectedAppModel i;
    public final boolean j;
    public final String k;
    public final SelectedDateAndTime l;
    public final Long m;
    public final HomeTabScreensRetainedData.ChaloBusScreen n;
    public final PremiumPassSavingsInfo o;
    public final List p;
    public final List q;
    public final List r;
    public final PBOriginDestinationAppModel s;
    public final boolean t;
    public final List u;
    public final boolean v;
    public final RidePreferenceBannerState w;
    public final Long x;
    public final String y;
    public final String z;

    public ChaloBusViewState(List list, boolean z, int i, PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType, List list2, TabMetaDataAppModel tabMetaDataAppModel, boolean z2, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, boolean z3, String str, SelectedDateAndTime selectedDateAndTime, Long l, HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen, PremiumPassSavingsInfo premiumPassSavingsInfo, List list3, List list4, List list5, PBOriginDestinationAppModel pBOriginDestinationAppModel, boolean z4, List sectionPriorityList, boolean z5, RidePreferenceBannerState ridePreferenceBannerState, Long l2, String str2, String str3) {
        Intrinsics.i(sectionPriorityList, "sectionPriorityList");
        Intrinsics.i(ridePreferenceBannerState, "ridePreferenceBannerState");
        this.f3286a = list;
        this.b = z;
        this.c = i;
        this.d = pBStopSelectionScreenBottomSheetType;
        this.e = list2;
        this.f = tabMetaDataAppModel;
        this.g = z2;
        this.h = pBStopPlaceSelectedAppModel;
        this.i = pBStopPlaceSelectedAppModel2;
        this.j = z3;
        this.k = str;
        this.l = selectedDateAndTime;
        this.m = l;
        this.n = chaloBusScreen;
        this.o = premiumPassSavingsInfo;
        this.p = list3;
        this.q = list4;
        this.r = list5;
        this.s = pBOriginDestinationAppModel;
        this.t = z4;
        this.u = sectionPriorityList;
        this.v = z5;
        this.w = ridePreferenceBannerState;
        this.x = l2;
        this.y = str2;
        this.z = str3;
    }

    public static ChaloBusViewState a(ChaloBusViewState chaloBusViewState, ArrayList arrayList, boolean z, int i, PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType, List list, TabMetaDataAppModel tabMetaDataAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, boolean z2, String str, SelectedDateAndTime selectedDateAndTime, Long l, HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen, PremiumPassSavingsInfo premiumPassSavingsInfo, List list2, List list3, ArrayList arrayList2, PBOriginDestinationAppModel pBOriginDestinationAppModel, boolean z3, List list4, boolean z4, RidePreferenceBannerState ridePreferenceBannerState, Long l2, String str2, String str3, int i2) {
        List list5 = (i2 & 1) != 0 ? chaloBusViewState.f3286a : arrayList;
        boolean z5 = (i2 & 2) != 0 ? chaloBusViewState.b : z;
        int i3 = (i2 & 4) != 0 ? chaloBusViewState.c : i;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType2 = (i2 & 8) != 0 ? chaloBusViewState.d : pBStopSelectionScreenBottomSheetType;
        List list6 = (i2 & 16) != 0 ? chaloBusViewState.e : list;
        chaloBusViewState.getClass();
        TabMetaDataAppModel tabMetaData = (i2 & 64) != 0 ? chaloBusViewState.f : tabMetaDataAppModel;
        boolean z6 = (i2 & 128) != 0 ? chaloBusViewState.g : false;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = (i2 & 256) != 0 ? chaloBusViewState.h : pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = (i2 & 512) != 0 ? chaloBusViewState.i : pBStopPlaceSelectedAppModel2;
        chaloBusViewState.getClass();
        boolean z7 = (i2 & 2048) != 0 ? chaloBusViewState.j : z2;
        String str4 = (i2 & 4096) != 0 ? chaloBusViewState.k : str;
        SelectedDateAndTime selectedDateAndTime2 = (i2 & 8192) != 0 ? chaloBusViewState.l : selectedDateAndTime;
        Long l3 = (i2 & 16384) != 0 ? chaloBusViewState.m : l;
        HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen2 = (32768 & i2) != 0 ? chaloBusViewState.n : chaloBusScreen;
        PremiumPassSavingsInfo premiumPassSavingsInfo2 = (i2 & 65536) != 0 ? chaloBusViewState.o : premiumPassSavingsInfo;
        List list7 = (i2 & 131072) != 0 ? chaloBusViewState.p : list2;
        List list8 = (i2 & 262144) != 0 ? chaloBusViewState.q : list3;
        List list9 = (i2 & 524288) != 0 ? chaloBusViewState.r : arrayList2;
        PBOriginDestinationAppModel pBOriginDestinationAppModel2 = (i2 & 1048576) != 0 ? chaloBusViewState.s : pBOriginDestinationAppModel;
        boolean z8 = (i2 & 2097152) != 0 ? chaloBusViewState.t : z3;
        List sectionPriorityList = (i2 & 4194304) != 0 ? chaloBusViewState.u : list4;
        boolean z9 = (i2 & 8388608) != 0 ? chaloBusViewState.v : z4;
        RidePreferenceBannerState ridePreferenceBannerState2 = (i2 & 16777216) != 0 ? chaloBusViewState.w : ridePreferenceBannerState;
        Long l4 = (i2 & 33554432) != 0 ? chaloBusViewState.x : l2;
        String str5 = (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? chaloBusViewState.y : str2;
        String str6 = (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? chaloBusViewState.z : str3;
        chaloBusViewState.getClass();
        Intrinsics.i(tabMetaData, "tabMetaData");
        Intrinsics.i(sectionPriorityList, "sectionPriorityList");
        Intrinsics.i(ridePreferenceBannerState2, "ridePreferenceBannerState");
        return new ChaloBusViewState(list5, z5, i3, pBStopSelectionScreenBottomSheetType2, list6, tabMetaData, z6, pBStopPlaceSelectedAppModel3, pBStopPlaceSelectedAppModel4, z7, str4, selectedDateAndTime2, l3, chaloBusScreen2, premiumPassSavingsInfo2, list7, list8, list9, pBOriginDestinationAppModel2, z8, sectionPriorityList, z9, ridePreferenceBannerState2, l4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusViewState)) {
            return false;
        }
        ChaloBusViewState chaloBusViewState = (ChaloBusViewState) obj;
        return Intrinsics.d(this.f3286a, chaloBusViewState.f3286a) && this.b == chaloBusViewState.b && this.c == chaloBusViewState.c && Intrinsics.d(this.d, chaloBusViewState.d) && Intrinsics.d(this.e, chaloBusViewState.e) && this.f.equals(chaloBusViewState.f) && this.g == chaloBusViewState.g && Intrinsics.d(this.h, chaloBusViewState.h) && Intrinsics.d(this.i, chaloBusViewState.i) && this.j == chaloBusViewState.j && Intrinsics.d(this.k, chaloBusViewState.k) && Intrinsics.d(this.l, chaloBusViewState.l) && Intrinsics.d(this.m, chaloBusViewState.m) && Intrinsics.d(this.n, chaloBusViewState.n) && Intrinsics.d(this.o, chaloBusViewState.o) && Intrinsics.d(this.p, chaloBusViewState.p) && Intrinsics.d(this.q, chaloBusViewState.q) && Intrinsics.d(this.r, chaloBusViewState.r) && Intrinsics.d(this.s, chaloBusViewState.s) && this.t == chaloBusViewState.t && Intrinsics.d(this.u, chaloBusViewState.u) && this.v == chaloBusViewState.v && Intrinsics.d(this.w, chaloBusViewState.w) && Intrinsics.d(this.x, chaloBusViewState.x) && Intrinsics.d(this.y, chaloBusViewState.y) && Intrinsics.d(this.z, chaloBusViewState.z);
    }

    public final int hashCode() {
        List list = this.f3286a;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType = this.d;
        int iHashCode2 = (iHashCode + (pBStopSelectionScreenBottomSheetType == null ? 0 : pBStopSelectionScreenBottomSheetType.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode3 = (((this.f.hashCode() + ((((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + 1231) * 31)) * 31) + (this.g ? 1231 : 1237)) * 31;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.h;
        int iHashCode4 = (iHashCode3 + (pBStopPlaceSelectedAppModel == null ? 0 : pBStopPlaceSelectedAppModel.hashCode())) * 31;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.i;
        int iHashCode5 = (((((iHashCode4 + (pBStopPlaceSelectedAppModel2 == null ? 0 : pBStopPlaceSelectedAppModel2.hashCode())) * 31) + 1237) * 31) + (this.j ? 1231 : 1237)) * 31;
        String str = this.k;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        SelectedDateAndTime selectedDateAndTime = this.l;
        int iHashCode7 = (iHashCode6 + (selectedDateAndTime == null ? 0 : selectedDateAndTime.hashCode())) * 31;
        Long l = this.m;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen = this.n;
        int i = (iHashCode8 + (chaloBusScreen == null ? 0 : chaloBusScreen.f3171a)) * 31;
        PremiumPassSavingsInfo premiumPassSavingsInfo = this.o;
        int iHashCode9 = (i + (premiumPassSavingsInfo == null ? 0 : premiumPassSavingsInfo.hashCode())) * 31;
        List list3 = this.p;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.q;
        int iHashCode11 = (iHashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.r;
        int iHashCode12 = (iHashCode11 + (list5 == null ? 0 : list5.hashCode())) * 31;
        PBOriginDestinationAppModel pBOriginDestinationAppModel = this.s;
        int iHashCode13 = (this.w.hashCode() + ((r30.b((((iHashCode12 + (pBOriginDestinationAppModel == null ? 0 : pBOriginDestinationAppModel.hashCode())) * 31) + (this.t ? 1231 : 1237)) * 31, 31, this.u) + (this.v ? 1231 : 1237)) * 31)) * 31;
        Long l2 = this.x;
        int iHashCode14 = (iHashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.y;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.z;
        return iHashCode15 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloBusViewState(chaloBusPageSections=");
        sb.append(this.f3286a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", tabLandingSignal=");
        sb.append(this.c);
        sb.append(", bottomSheetType=");
        sb.append(this.d);
        sb.append(", originDestinationPairsFromPastPurchases=");
        sb.append(this.e);
        sb.append(", renderBottomNavBar=true, tabMetaData=");
        sb.append(this.f);
        sb.append(", odPairFetching=");
        sb.append(this.g);
        sb.append(", fromStopOrPlaceSelected=");
        sb.append(this.h);
        sb.append(", toStopOrPlaceSelected=");
        sb.append(this.i);
        sb.append(", isRecentTripCardClicked=false, isCurrentLocationAvailable=");
        sb.append(this.j);
        sb.append(", cityName=");
        sb.append(this.k);
        sb.append(", selectedDateAndTime=");
        sb.append(this.l);
        sb.append(", defaultTime=");
        sb.append(this.m);
        sb.append(", retainedScreenState=");
        sb.append(this.n);
        sb.append(", passSavingsInfo=");
        sb.append(this.o);
        sb.append(", passSavingsFaqs=");
        sb.append(this.p);
        sb.append(", chaloBusPasses=");
        dd.o(sb, this.q, ", rollOverBanners=", this.r, ", prefilledODPairInfo=");
        sb.append(this.s);
        sb.append(", isUserLoggedIn=");
        sb.append(this.t);
        sb.append(", sectionPriorityList=");
        sb.append(this.u);
        sb.append(", isNewUser=");
        sb.append(this.v);
        sb.append(", ridePreferenceBannerState=");
        sb.append(this.w);
        sb.append(", autoSelectedRideTime=");
        sb.append(this.x);
        sb.append(", autoSelectedRideId=");
        return r30.i(sb, this.y, ", savedPreferredRideId=", this.z, ")");
    }
}
