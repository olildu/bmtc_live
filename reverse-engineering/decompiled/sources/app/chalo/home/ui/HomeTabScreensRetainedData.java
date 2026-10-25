package app.chalo.home.ui;

import app.chalo.homescreen.data.model.app.BottomNavTabType;
import defpackage.b3;
import defpackage.pk0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensRetainedData;", "", "HomeScreen", "RegularScreen", "ChaloBusScreen", "MyTicketsScreen", "Lapp/chalo/home/ui/HomeTabScreensRetainedData$ChaloBusScreen;", "Lapp/chalo/home/ui/HomeTabScreensRetainedData$HomeScreen;", "Lapp/chalo/home/ui/HomeTabScreensRetainedData$MyTicketsScreen;", "Lapp/chalo/home/ui/HomeTabScreensRetainedData$RegularScreen;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HomeTabScreensRetainedData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensRetainedData$ChaloBusScreen;", "Lapp/chalo/home/ui/HomeTabScreensRetainedData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloBusScreen implements HomeTabScreensRetainedData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3171a;

        public ChaloBusScreen(int i) {
            this.f3171a = i;
        }

        @Override // app.chalo.home.ui.HomeTabScreensRetainedData
        public final BottomNavTabType a() {
            return BottomNavTabType.CHALO_BUS;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChaloBusScreen) && this.f3171a == ((ChaloBusScreen) obj).f3171a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF3171a() {
            return this.f3171a;
        }

        public final String toString() {
            return b3.d(this.f3171a, "ChaloBusScreen(scrollPosition=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensRetainedData$HomeScreen;", "Lapp/chalo/home/ui/HomeTabScreensRetainedData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomeScreen implements HomeTabScreensRetainedData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3172a;

        public HomeScreen(int i) {
            this.f3172a = i;
        }

        @Override // app.chalo.home.ui.HomeTabScreensRetainedData
        public final BottomNavTabType a() {
            return BottomNavTabType.HOME;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeScreen) && this.f3172a == ((HomeScreen) obj).f3172a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF3172a() {
            return this.f3172a;
        }

        public final String toString() {
            return b3.d(this.f3172a, "HomeScreen(scrollPosition=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensRetainedData$MyTicketsScreen;", "Lapp/chalo/home/ui/HomeTabScreensRetainedData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MyTicketsScreen implements HomeTabScreensRetainedData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3173a;
        public final int b;

        public MyTicketsScreen(int i, int i2) {
            this.f3173a = i;
            this.b = i2;
        }

        @Override // app.chalo.home.ui.HomeTabScreensRetainedData
        public final BottomNavTabType a() {
            return BottomNavTabType.MY_TICKETS;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MyTicketsScreen)) {
                return false;
            }
            MyTicketsScreen myTicketsScreen = (MyTicketsScreen) obj;
            return this.f3173a == myTicketsScreen.f3173a && this.b == myTicketsScreen.b;
        }

        public final int hashCode() {
            return (this.f3173a * 31) + this.b;
        }

        public final String toString() {
            return pk0.f(this.f3173a, this.b, "MyTicketsScreen(firstVisibleItemIndex=", ", firstVisibleItemScrollOffset=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensRetainedData$RegularScreen;", "Lapp/chalo/home/ui/HomeTabScreensRetainedData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegularScreen implements HomeTabScreensRetainedData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3174a;

        public RegularScreen(int i) {
            this.f3174a = i;
        }

        @Override // app.chalo.home.ui.HomeTabScreensRetainedData
        public final BottomNavTabType a() {
            return BottomNavTabType.REGULAR_BUS;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegularScreen) && this.f3174a == ((RegularScreen) obj).f3174a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF3174a() {
            return this.f3174a;
        }

        public final String toString() {
            return b3.d(this.f3174a, "RegularScreen(scrollPosition=", ")");
        }
    }

    BottomNavTabType a();
}
