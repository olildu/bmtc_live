package app.chalo.home.ui;

import app.chalo.homescreen.data.model.app.BottomNavTabType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensRetainedState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeTabScreensRetainedState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomNavTabType f3175a;
    public final BottomNavTabType b;
    public final HomeTabScreensRetainedData.HomeScreen c;
    public final HomeTabScreensRetainedData.RegularScreen d;
    public final HomeTabScreensRetainedData.ChaloBusScreen e;
    public final HomeTabScreensRetainedData.MyTicketsScreen f;
    public final Map g;

    public HomeTabScreensRetainedState(BottomNavTabType bottomNavTabType, BottomNavTabType bottomNavTabType2, HomeTabScreensRetainedData.HomeScreen homeScreen, HomeTabScreensRetainedData.RegularScreen regularScreen, HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen, HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen, Map map) {
        this.f3175a = bottomNavTabType;
        this.b = bottomNavTabType2;
        this.c = homeScreen;
        this.d = regularScreen;
        this.e = chaloBusScreen;
        this.f = myTicketsScreen;
        this.g = map;
    }

    public static HomeTabScreensRetainedState a(HomeTabScreensRetainedState homeTabScreensRetainedState, BottomNavTabType bottomNavTabType, BottomNavTabType bottomNavTabType2, HomeTabScreensRetainedData.HomeScreen homeScreen, HomeTabScreensRetainedData.RegularScreen regularScreen, HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen, HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            bottomNavTabType = homeTabScreensRetainedState.f3175a;
        }
        BottomNavTabType bottomNavTabType3 = bottomNavTabType;
        if ((i & 2) != 0) {
            bottomNavTabType2 = homeTabScreensRetainedState.b;
        }
        BottomNavTabType bottomNavTabType4 = bottomNavTabType2;
        if ((i & 4) != 0) {
            homeScreen = homeTabScreensRetainedState.c;
        }
        HomeTabScreensRetainedData.HomeScreen homeScreen2 = homeScreen;
        if ((i & 8) != 0) {
            regularScreen = homeTabScreensRetainedState.d;
        }
        HomeTabScreensRetainedData.RegularScreen regularScreen2 = regularScreen;
        if ((i & 16) != 0) {
            chaloBusScreen = homeTabScreensRetainedState.e;
        }
        HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen2 = chaloBusScreen;
        if ((i & 32) != 0) {
            myTicketsScreen = homeTabScreensRetainedState.f;
        }
        HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen2 = myTicketsScreen;
        Map map = linkedHashMap;
        if ((i & 64) != 0) {
            map = homeTabScreensRetainedState.g;
        }
        homeTabScreensRetainedState.getClass();
        return new HomeTabScreensRetainedState(bottomNavTabType3, bottomNavTabType4, homeScreen2, regularScreen2, chaloBusScreen2, myTicketsScreen2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTabScreensRetainedState)) {
            return false;
        }
        HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) obj;
        return this.f3175a == homeTabScreensRetainedState.f3175a && this.b == homeTabScreensRetainedState.b && Intrinsics.d(this.c, homeTabScreensRetainedState.c) && Intrinsics.d(this.d, homeTabScreensRetainedState.d) && Intrinsics.d(this.e, homeTabScreensRetainedState.e) && Intrinsics.d(this.f, homeTabScreensRetainedState.f) && Intrinsics.d(this.g, homeTabScreensRetainedState.g);
    }

    public final int hashCode() {
        BottomNavTabType bottomNavTabType = this.f3175a;
        int iHashCode = (bottomNavTabType == null ? 0 : bottomNavTabType.hashCode()) * 31;
        BottomNavTabType bottomNavTabType2 = this.b;
        int iHashCode2 = (iHashCode + (bottomNavTabType2 == null ? 0 : bottomNavTabType2.hashCode())) * 31;
        HomeTabScreensRetainedData.HomeScreen homeScreen = this.c;
        int i = (iHashCode2 + (homeScreen == null ? 0 : homeScreen.f3172a)) * 31;
        HomeTabScreensRetainedData.RegularScreen regularScreen = this.d;
        int i2 = (i + (regularScreen == null ? 0 : regularScreen.f3174a)) * 31;
        HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen = this.e;
        int i3 = (i2 + (chaloBusScreen == null ? 0 : chaloBusScreen.f3171a)) * 31;
        HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen = this.f;
        return this.g.hashCode() + ((i3 + (myTicketsScreen != null ? myTicketsScreen.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HomeTabScreensRetainedState(selectedTab=" + this.f3175a + ", startDestination=" + this.b + ", home=" + this.c + ", regular=" + this.d + ", chaloBus=" + this.e + ", myTickets=" + this.f + ", freshNavigationSignals=" + this.g + ")";
    }
}
