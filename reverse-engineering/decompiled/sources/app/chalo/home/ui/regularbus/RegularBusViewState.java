package app.chalo.home.ui.regularbus;

import app.chalo.home.data.model.app.LocationTooltipData;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.location.SettingsResolutionException;
import defpackage.b3;
import defpackage.r30;
import defpackage.z40;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3663a;
    public final List b;
    public final List c;
    public final NearbyStopAndTripsUiModel d;
    public final boolean e;
    public final NearbyBusesMapData f;
    public final List g;
    public final TabMetaDataAppModel h;
    public final String i;
    public final ProfileDrawerCardData j;
    public final RegularBusScreenBottomSheetType k;
    public final SeatOccupancyBottomSheetData l;
    public final LocationTooltipData m;
    public final SettingsResolutionException n;
    public final HomeTabScreensRetainedData.RegularScreen o;
    public final RegularBusDialogType p;
    public final RegularBusPageDisplayItemData q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public RegularBusViewState(boolean z, List list, List aboveSearchImages, NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, boolean z2, NearbyBusesMapData nearbyBusesMapData, List recentSearchedItemList, TabMetaDataAppModel tabMetaDataAppModel, String str, ProfileDrawerCardData profileDrawerCardData, RegularBusScreenBottomSheetType regularBusScreenBottomSheetType, SeatOccupancyBottomSheetData seatOccupancyBottomSheetData, LocationTooltipData locationTooltipData, SettingsResolutionException settingsResolutionException, HomeTabScreensRetainedData.RegularScreen regularScreen, RegularBusDialogType regularBusDialogType, RegularBusPageDisplayItemData regularBusPageDisplayItemData, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.i(aboveSearchImages, "aboveSearchImages");
        Intrinsics.i(recentSearchedItemList, "recentSearchedItemList");
        this.f3663a = z;
        this.b = list;
        this.c = aboveSearchImages;
        this.d = nearbyStopAndTripsUiModel;
        this.e = z2;
        this.f = nearbyBusesMapData;
        this.g = recentSearchedItemList;
        this.h = tabMetaDataAppModel;
        this.i = str;
        this.j = profileDrawerCardData;
        this.k = regularBusScreenBottomSheetType;
        this.l = seatOccupancyBottomSheetData;
        this.m = locationTooltipData;
        this.n = settingsResolutionException;
        this.o = regularScreen;
        this.p = regularBusDialogType;
        this.q = regularBusPageDisplayItemData;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = z6;
    }

    public static RegularBusViewState a(RegularBusViewState regularBusViewState, boolean z, List list, ArrayList arrayList, NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, boolean z2, NearbyBusesMapData nearbyBusesMapData, List list2, TabMetaDataAppModel tabMetaDataAppModel, String str, ProfileDrawerCardData profileDrawerCardData, RegularBusScreenBottomSheetType.SeatOccupancyInfoBottomSheet seatOccupancyInfoBottomSheet, SeatOccupancyBottomSheetData seatOccupancyBottomSheetData, LocationTooltipData locationTooltipData, SettingsResolutionException settingsResolutionException, HomeTabScreensRetainedData.RegularScreen regularScreen, RegularBusDialogType regularBusDialogType, RegularBusPageDisplayItemData regularBusPageDisplayItemData, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        boolean z7 = (i & 1) != 0 ? regularBusViewState.f3663a : z;
        List list3 = (i & 2) != 0 ? regularBusViewState.b : list;
        List aboveSearchImages = (i & 4) != 0 ? regularBusViewState.c : arrayList;
        regularBusViewState.getClass();
        NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel2 = (i & 16) != 0 ? regularBusViewState.d : nearbyStopAndTripsUiModel;
        boolean z8 = (i & 32) != 0 ? regularBusViewState.e : z2;
        NearbyBusesMapData nearbyBusesMapData2 = (i & 64) != 0 ? regularBusViewState.f : nearbyBusesMapData;
        List recentSearchedItemList = (i & 128) != 0 ? regularBusViewState.g : list2;
        TabMetaDataAppModel tabMetaData = (i & 256) != 0 ? regularBusViewState.h : tabMetaDataAppModel;
        String str2 = (i & 512) != 0 ? regularBusViewState.i : str;
        ProfileDrawerCardData profileDrawerCardData2 = (i & 1024) != 0 ? regularBusViewState.j : profileDrawerCardData;
        RegularBusScreenBottomSheetType regularBusScreenBottomSheetType = (i & 2048) != 0 ? regularBusViewState.k : seatOccupancyInfoBottomSheet;
        SeatOccupancyBottomSheetData seatOccupancyBottomSheetData2 = (i & 4096) != 0 ? regularBusViewState.l : seatOccupancyBottomSheetData;
        LocationTooltipData locationTooltipData2 = (i & 8192) != 0 ? regularBusViewState.m : locationTooltipData;
        SettingsResolutionException settingsResolutionException2 = (i & 16384) != 0 ? regularBusViewState.n : settingsResolutionException;
        HomeTabScreensRetainedData.RegularScreen regularScreen2 = (i & 32768) != 0 ? regularBusViewState.o : regularScreen;
        RegularBusDialogType regularBusDialogType2 = (i & 65536) != 0 ? regularBusViewState.p : regularBusDialogType;
        RegularBusPageDisplayItemData regularBusPageDisplayItemData2 = (i & 131072) != 0 ? regularBusViewState.q : regularBusPageDisplayItemData;
        boolean z9 = (i & 262144) != 0 ? regularBusViewState.r : z3;
        boolean z10 = (i & 524288) != 0 ? regularBusViewState.s : z4;
        boolean z11 = (i & 1048576) != 0 ? regularBusViewState.t : z5;
        boolean z12 = (i & 2097152) != 0 ? regularBusViewState.u : z6;
        regularBusViewState.getClass();
        Intrinsics.i(aboveSearchImages, "aboveSearchImages");
        Intrinsics.i(recentSearchedItemList, "recentSearchedItemList");
        Intrinsics.i(tabMetaData, "tabMetaData");
        return new RegularBusViewState(z7, list3, aboveSearchImages, nearbyStopAndTripsUiModel2, z8, nearbyBusesMapData2, recentSearchedItemList, tabMetaData, str2, profileDrawerCardData2, regularBusScreenBottomSheetType, seatOccupancyBottomSheetData2, locationTooltipData2, settingsResolutionException2, regularScreen2, regularBusDialogType2, regularBusPageDisplayItemData2, z9, z10, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusViewState)) {
            return false;
        }
        RegularBusViewState regularBusViewState = (RegularBusViewState) obj;
        return this.f3663a == regularBusViewState.f3663a && Intrinsics.d(this.b, regularBusViewState.b) && Intrinsics.d(this.c, regularBusViewState.c) && Intrinsics.d(this.d, regularBusViewState.d) && this.e == regularBusViewState.e && this.f.equals(regularBusViewState.f) && Intrinsics.d(this.g, regularBusViewState.g) && this.h.equals(regularBusViewState.h) && Intrinsics.d(this.i, regularBusViewState.i) && Intrinsics.d(this.j, regularBusViewState.j) && Intrinsics.d(this.k, regularBusViewState.k) && Intrinsics.d(this.l, regularBusViewState.l) && Intrinsics.d(this.m, regularBusViewState.m) && Intrinsics.d(this.n, regularBusViewState.n) && Intrinsics.d(this.o, regularBusViewState.o) && Intrinsics.d(this.p, regularBusViewState.p) && Intrinsics.d(this.q, regularBusViewState.q) && this.r == regularBusViewState.r && this.s == regularBusViewState.s && this.t == regularBusViewState.t && this.u == regularBusViewState.u;
    }

    public final int hashCode() {
        int i = (this.f3663a ? 1231 : 1237) * 31;
        List list = this.b;
        int iHashCode = (((this.c.hashCode() + ((i + (list == null ? 0 : list.hashCode())) * 31)) * 31) + 1237) * 31;
        NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = this.d;
        int iHashCode2 = (this.h.hashCode() + r30.b((this.f.hashCode() + ((((iHashCode + (nearbyStopAndTripsUiModel == null ? 0 : nearbyStopAndTripsUiModel.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31)) * 31, 31, this.g)) * 31;
        String str = this.i;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ProfileDrawerCardData profileDrawerCardData = this.j;
        int iHashCode4 = (iHashCode3 + (profileDrawerCardData == null ? 0 : profileDrawerCardData.hashCode())) * 31;
        RegularBusScreenBottomSheetType regularBusScreenBottomSheetType = this.k;
        int iHashCode5 = (iHashCode4 + (regularBusScreenBottomSheetType == null ? 0 : regularBusScreenBottomSheetType.hashCode())) * 31;
        SeatOccupancyBottomSheetData seatOccupancyBottomSheetData = this.l;
        int iHashCode6 = (iHashCode5 + (seatOccupancyBottomSheetData == null ? 0 : seatOccupancyBottomSheetData.hashCode())) * 31;
        LocationTooltipData locationTooltipData = this.m;
        int iHashCode7 = (iHashCode6 + (locationTooltipData == null ? 0 : locationTooltipData.hashCode())) * 31;
        SettingsResolutionException settingsResolutionException = this.n;
        int iHashCode8 = (iHashCode7 + (settingsResolutionException == null ? 0 : settingsResolutionException.hashCode())) * 31;
        HomeTabScreensRetainedData.RegularScreen regularScreen = this.o;
        int i2 = (iHashCode8 + (regularScreen == null ? 0 : regularScreen.f3174a)) * 31;
        RegularBusDialogType regularBusDialogType = this.p;
        int iHashCode9 = (i2 + (regularBusDialogType == null ? 0 : regularBusDialogType.hashCode())) * 31;
        RegularBusPageDisplayItemData regularBusPageDisplayItemData = this.q;
        return ((((((((iHashCode9 + (regularBusPageDisplayItemData != null ? regularBusPageDisplayItemData.hashCode() : 0)) * 31) + (this.r ? 1231 : 1237)) * 31) + (this.s ? 1231 : 1237)) * 31) + (this.t ? 1231 : 1237)) * 31) + (this.u ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegularBusViewState(isLocationMandatory=");
        sb.append(this.f3663a);
        sb.append(", regularBusPageSections=");
        sb.append(this.b);
        sb.append(", aboveSearchImages=");
        sb.append(this.c);
        sb.append(", isLoading=false, nearbyStopTrips=");
        sb.append(this.d);
        sb.append(", shouldShowNearbyTripsLoading=");
        sb.append(this.e);
        sb.append(", nearbyBusesMapData=");
        sb.append(this.f);
        sb.append(", recentSearchedItemList=");
        sb.append(this.g);
        sb.append(", tabMetaData=");
        sb.append(this.h);
        sb.append(", currentCity=");
        sb.append(this.i);
        sb.append(", profileInfo=");
        sb.append(this.j);
        sb.append(", bottomSheetType=");
        sb.append(this.k);
        sb.append(", seatOccupancyBottomSheetData=");
        sb.append(this.l);
        sb.append(", locationTooltipData=");
        sb.append(this.m);
        sb.append(", resolvableException=");
        sb.append(this.n);
        sb.append(", retainedState=");
        sb.append(this.o);
        sb.append(", dialogType=");
        sb.append(this.p);
        sb.append(", payForTicketItem=");
        sb.append(this.q);
        sb.append(", hideCurrentCityLocationItem=");
        sb.append(this.r);
        sb.append(", showUpdatedProductSection=");
        z40.r(sb, this.s, ", showScanAndPayLoader=", this.t, ", isScanAndPayInProgress=");
        return b3.g(")", sb, this.u);
    }
}
