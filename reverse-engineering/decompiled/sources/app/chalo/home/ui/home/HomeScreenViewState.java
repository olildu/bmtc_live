package app.chalo.home.ui.home;

import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.location.SettingsResolutionException;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import defpackage.n21;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeScreenViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileDrawerCardData f3577a;
    public final List b;
    public final List c;
    public final TabMetaDataAppModel d;
    public final HomeScreenBottomSheetType e;
    public final String f;
    public final PremiumBusBookingCardData g;
    public final PremiumBusInAppCommunicationBottomSheetData h;
    public final boolean i;
    public final String j;
    public final LocationTooltipData k;
    public final SettingsResolutionException l;
    public final TitoRideDataAppModel m;
    public final HomeTabScreensRetainedData.HomeScreen n;
    public final HomeScreenDialogType o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public HomeScreenViewState(ProfileDrawerCardData profileDrawerCardData, List aboveSearchImages, List list, TabMetaDataAppModel tabMetaDataAppModel, HomeScreenBottomSheetType homeScreenBottomSheetType, String str, PremiumBusBookingCardData premiumBusBookingCardData, PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData, boolean z, String str2, LocationTooltipData locationTooltipData, SettingsResolutionException settingsResolutionException, TitoRideDataAppModel titoRideDataAppModel, HomeTabScreensRetainedData.HomeScreen homeScreen, HomeScreenDialogType homeScreenDialogType, boolean z2, boolean z3, boolean z4) {
        Intrinsics.i(aboveSearchImages, "aboveSearchImages");
        this.f3577a = profileDrawerCardData;
        this.b = aboveSearchImages;
        this.c = list;
        this.d = tabMetaDataAppModel;
        this.e = homeScreenBottomSheetType;
        this.f = str;
        this.g = premiumBusBookingCardData;
        this.h = premiumBusInAppCommunicationBottomSheetData;
        this.i = z;
        this.j = str2;
        this.k = locationTooltipData;
        this.l = settingsResolutionException;
        this.m = titoRideDataAppModel;
        this.n = homeScreen;
        this.o = homeScreenDialogType;
        this.p = z2;
        this.q = z3;
        this.r = z4;
    }

    public static HomeScreenViewState a(HomeScreenViewState homeScreenViewState, ProfileDrawerCardData profileDrawerCardData, ArrayList arrayList, ArrayList arrayList2, TabMetaDataAppModel tabMetaDataAppModel, HomeScreenBottomSheetType.PremiumBusInAppCommunicationBottomSheet premiumBusInAppCommunicationBottomSheet, String str, PremiumBusBookingCardData premiumBusBookingCardData, PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData, boolean z, String str2, LocationTooltipData locationTooltipData, SettingsResolutionException settingsResolutionException, TitoRideDataAppModel titoRideDataAppModel, HomeTabScreensRetainedData.HomeScreen homeScreen, HomeScreenDialogType homeScreenDialogType, boolean z2, boolean z3, boolean z4, int i) {
        ProfileDrawerCardData profileDrawerCardData2 = (i & 1) != 0 ? homeScreenViewState.f3577a : profileDrawerCardData;
        homeScreenViewState.getClass();
        List aboveSearchImages = (i & 4) != 0 ? homeScreenViewState.b : arrayList;
        List list = (i & 8) != 0 ? homeScreenViewState.c : arrayList2;
        TabMetaDataAppModel tabMetaData = (i & 16) != 0 ? homeScreenViewState.d : tabMetaDataAppModel;
        HomeScreenBottomSheetType homeScreenBottomSheetType = (i & 32) != 0 ? homeScreenViewState.e : premiumBusInAppCommunicationBottomSheet;
        String str3 = (i & 64) != 0 ? homeScreenViewState.f : str;
        PremiumBusBookingCardData premiumBusBookingCardData2 = (i & 128) != 0 ? homeScreenViewState.g : premiumBusBookingCardData;
        PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData2 = (i & 256) != 0 ? homeScreenViewState.h : premiumBusInAppCommunicationBottomSheetData;
        boolean z5 = (i & 512) != 0 ? homeScreenViewState.i : z;
        String str4 = (i & 1024) != 0 ? homeScreenViewState.j : str2;
        LocationTooltipData locationTooltipData2 = (i & 2048) != 0 ? homeScreenViewState.k : locationTooltipData;
        SettingsResolutionException settingsResolutionException2 = (i & 4096) != 0 ? homeScreenViewState.l : settingsResolutionException;
        TitoRideDataAppModel titoRideDataAppModel2 = (i & 8192) != 0 ? homeScreenViewState.m : titoRideDataAppModel;
        HomeTabScreensRetainedData.HomeScreen homeScreen2 = (i & 16384) != 0 ? homeScreenViewState.n : homeScreen;
        HomeScreenDialogType homeScreenDialogType2 = (i & 32768) != 0 ? homeScreenViewState.o : homeScreenDialogType;
        boolean z6 = (i & 65536) != 0 ? homeScreenViewState.p : z2;
        boolean z7 = (i & 131072) != 0 ? homeScreenViewState.q : z3;
        boolean z8 = (i & 262144) != 0 ? homeScreenViewState.r : z4;
        homeScreenViewState.getClass();
        Intrinsics.i(aboveSearchImages, "aboveSearchImages");
        Intrinsics.i(tabMetaData, "tabMetaData");
        return new HomeScreenViewState(profileDrawerCardData2, aboveSearchImages, list, tabMetaData, homeScreenBottomSheetType, str3, premiumBusBookingCardData2, premiumBusInAppCommunicationBottomSheetData2, z5, str4, locationTooltipData2, settingsResolutionException2, titoRideDataAppModel2, homeScreen2, homeScreenDialogType2, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeScreenViewState)) {
            return false;
        }
        HomeScreenViewState homeScreenViewState = (HomeScreenViewState) obj;
        return Intrinsics.d(this.f3577a, homeScreenViewState.f3577a) && Intrinsics.d(this.b, homeScreenViewState.b) && Intrinsics.d(this.c, homeScreenViewState.c) && this.d.equals(homeScreenViewState.d) && Intrinsics.d(this.e, homeScreenViewState.e) && Intrinsics.d(this.f, homeScreenViewState.f) && Intrinsics.d(this.g, homeScreenViewState.g) && Intrinsics.d(this.h, homeScreenViewState.h) && this.i == homeScreenViewState.i && Intrinsics.d(this.j, homeScreenViewState.j) && Intrinsics.d(this.k, homeScreenViewState.k) && Intrinsics.d(this.l, homeScreenViewState.l) && Intrinsics.d(this.m, homeScreenViewState.m) && Intrinsics.d(this.n, homeScreenViewState.n) && Intrinsics.d(this.o, homeScreenViewState.o) && this.p == homeScreenViewState.p && this.q == homeScreenViewState.q && this.r == homeScreenViewState.r;
    }

    public final int hashCode() {
        ProfileDrawerCardData profileDrawerCardData = this.f3577a;
        int iB = r30.b(t10.a(profileDrawerCardData == null ? 0 : profileDrawerCardData.hashCode(), 31, 1237, 31), 31, this.b);
        List list = this.c;
        int iHashCode = (this.d.hashCode() + ((iB + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        HomeScreenBottomSheetType homeScreenBottomSheetType = this.e;
        int iHashCode2 = (iHashCode + (homeScreenBottomSheetType == null ? 0 : homeScreenBottomSheetType.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PremiumBusBookingCardData premiumBusBookingCardData = this.g;
        int iHashCode4 = (iHashCode3 + (premiumBusBookingCardData == null ? 0 : premiumBusBookingCardData.hashCode())) * 31;
        PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData = this.h;
        int iHashCode5 = (((iHashCode4 + (premiumBusInAppCommunicationBottomSheetData == null ? 0 : premiumBusInAppCommunicationBottomSheetData.hashCode())) * 31) + (this.i ? 1231 : 1237)) * 31;
        String str2 = this.j;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocationTooltipData locationTooltipData = this.k;
        int iHashCode7 = (iHashCode6 + (locationTooltipData == null ? 0 : locationTooltipData.hashCode())) * 31;
        SettingsResolutionException settingsResolutionException = this.l;
        int iHashCode8 = (iHashCode7 + (settingsResolutionException == null ? 0 : settingsResolutionException.hashCode())) * 31;
        TitoRideDataAppModel titoRideDataAppModel = this.m;
        int iHashCode9 = (iHashCode8 + (titoRideDataAppModel == null ? 0 : titoRideDataAppModel.hashCode())) * 31;
        HomeTabScreensRetainedData.HomeScreen homeScreen = this.n;
        int i = (iHashCode9 + (homeScreen == null ? 0 : homeScreen.f3172a)) * 31;
        HomeScreenDialogType homeScreenDialogType = this.o;
        return ((((((i + (homeScreenDialogType != null ? homeScreenDialogType.hashCode() : 0)) * 31) + (this.p ? 1231 : 1237)) * 31) + (this.q ? 1231 : 1237)) * 31) + (this.r ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeScreenViewState(profileInfo=");
        sb.append(this.f3577a);
        sb.append(", renderProfileDetailsPage=false, aboveSearchImages=");
        sb.append(this.b);
        sb.append(", homePageSections=");
        sb.append(this.c);
        sb.append(", tabMetaData=");
        sb.append(this.d);
        sb.append(", bottomSheetType=");
        sb.append(this.e);
        sb.append(", currentCity=");
        sb.append(this.f);
        sb.append(", premiumBusBookingData=");
        sb.append(this.g);
        sb.append(", premiumBusInAppCommunicationBottomSheetData=");
        sb.append(this.h);
        sb.append(", isLocationMandatory=");
        pk0.x(", bookingId=", this.j, ", locationTooltipData=", sb, this.i);
        sb.append(this.k);
        sb.append(", resolvableException=");
        sb.append(this.l);
        sb.append(", titoRideDataAppModel=");
        sb.append(this.m);
        sb.append(", retainedState=");
        sb.append(this.n);
        sb.append(", dialogType=");
        sb.append(this.o);
        sb.append(", hideCurrentCityLocationItem=");
        sb.append(this.p);
        sb.append(", showScanAndPayLoader=");
        return n21.h(sb, this.q, ", isScanAndPayInProgress=", this.r, ")");
    }
}
