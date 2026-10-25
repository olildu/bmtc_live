package app.chalo.home.ui;

import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.scenes.ChaloNavigationManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.gf;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensNavigationAndStateManagerImpl;", "Lapp/chalo/home/ui/HomeTabScreensNavigationAndStateManager;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeTabScreensNavigationAndStateManagerImpl implements HomeTabScreensNavigationAndStateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloNavigationManager f3169a;
    public final MutableStateFlow b = StateFlowKt.a(new HomeTabScreensRetainedState(null, null, null, null, null, null, MapsKt.d()));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensNavigationAndStateManagerImpl$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3170a;

        static {
            int[] iArr = new int[BottomNavTabType.values().length];
            try {
                iArr[BottomNavTabType.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomNavTabType.REGULAR_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomNavTabType.CHALO_BUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BottomNavTabType.MY_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BottomNavTabType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BottomNavTabType.SEARCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3170a = iArr;
        }
    }

    public HomeTabScreensNavigationAndStateManagerImpl(ChaloNavigationManager chaloNavigationManager) {
        this.f3169a = chaloNavigationManager;
    }

    public static final HomeTabScreensRetainedData f(HomeTabScreensRetainedData homeTabScreensRetainedData, Set set) {
        if (homeTabScreensRetainedData == null || !set.contains(homeTabScreensRetainedData.a())) {
            return null;
        }
        return homeTabScreensRetainedData;
    }

    @Override // app.chalo.home.ui.HomeTabScreensNavigationAndStateManager
    public final void a(BottomNavTabType startDestination, BottomNavTabType tabSelected) {
        Intrinsics.i(startDestination, "startDestination");
        Intrinsics.i(tabSelected, "tabSelected");
        while (true) {
            MutableStateFlow mutableStateFlow = this.b;
            Object value = mutableStateFlow.getValue();
            BottomNavTabType bottomNavTabType = startDestination;
            BottomNavTabType bottomNavTabType2 = tabSelected;
            if (mutableStateFlow.c(value, HomeTabScreensRetainedState.a((HomeTabScreensRetainedState) value, bottomNavTabType2, bottomNavTabType, null, null, null, null, null, 124))) {
                return;
            }
            tabSelected = bottomNavTabType2;
            startDestination = bottomNavTabType;
        }
    }

    @Override // app.chalo.home.ui.HomeTabScreensNavigationAndStateManager
    public final void b(HomeTabScreensRetainedData homeTabScreensRetainedData) {
        MutableStateFlow mutableStateFlow;
        Object value;
        HomeTabScreensRetainedState homeTabScreensRetainedStateA;
        do {
            mutableStateFlow = this.b;
            value = mutableStateFlow.getValue();
            HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) value;
            if (homeTabScreensRetainedData instanceof HomeTabScreensRetainedData.ChaloBusScreen) {
                homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedState, null, null, null, null, (HomeTabScreensRetainedData.ChaloBusScreen) homeTabScreensRetainedData, null, null, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION);
            } else if (homeTabScreensRetainedData instanceof HomeTabScreensRetainedData.HomeScreen) {
                homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedState, null, null, (HomeTabScreensRetainedData.HomeScreen) homeTabScreensRetainedData, null, null, null, null, 123);
            } else if (homeTabScreensRetainedData instanceof HomeTabScreensRetainedData.MyTicketsScreen) {
                homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedState, null, null, null, null, null, (HomeTabScreensRetainedData.MyTicketsScreen) homeTabScreensRetainedData, null, 95);
            } else {
                if (!(homeTabScreensRetainedData instanceof HomeTabScreensRetainedData.RegularScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedState, null, null, null, (HomeTabScreensRetainedData.RegularScreen) homeTabScreensRetainedData, null, null, null, 119);
            }
        } while (!mutableStateFlow.c(value, homeTabScreensRetainedStateA));
    }

    @Override // app.chalo.home.ui.HomeTabScreensNavigationAndStateManager
    public final void c(BottomNavTabType tabSelected, boolean z) {
        Intrinsics.i(tabSelected, "tabSelected");
        MutableStateFlow mutableStateFlow = this.b;
        String message = "navigateTo tab=" + tabSelected + " shouldStartFresh=" + z + " previous=" + ((HomeTabScreensRetainedState) mutableStateFlow.getValue()).f3175a;
        Intrinsics.i(message, "message");
        while (true) {
            Object value = mutableStateFlow.getValue();
            HomeTabScreensRetainedState homeTabScreensRetainedStateA = (HomeTabScreensRetainedState) value;
            if (z) {
                switch (WhenMappings.f3170a[tabSelected.ordinal()]) {
                    case 1:
                        homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedStateA, null, null, null, null, null, null, null, 123);
                        break;
                    case 2:
                        homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedStateA, null, null, null, null, null, null, null, 119);
                        break;
                    case 3:
                        homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedStateA, null, null, null, null, null, null, null, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION);
                        break;
                    case 4:
                        homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedStateA, null, null, null, null, null, null, null, 95);
                        break;
                    case 5:
                    case 6:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            HomeTabScreensRetainedState homeTabScreensRetainedStateA2 = homeTabScreensRetainedStateA;
            if (z) {
                LinkedHashMap linkedHashMapU = MapsKt.u(homeTabScreensRetainedStateA2.g);
                Integer num = (Integer) linkedHashMapU.get(tabSelected);
                linkedHashMapU.put(tabSelected, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                homeTabScreensRetainedStateA2 = HomeTabScreensRetainedState.a(homeTabScreensRetainedStateA2, null, null, null, null, null, null, linkedHashMapU, 63);
            }
            BottomNavTabType bottomNavTabType = tabSelected;
            if (mutableStateFlow.c(value, HomeTabScreensRetainedState.a(homeTabScreensRetainedStateA2, bottomNavTabType, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT))) {
                return;
            } else {
                tabSelected = bottomNavTabType;
            }
        }
    }

    @Override // app.chalo.home.ui.HomeTabScreensNavigationAndStateManager
    public final void d(Set set) {
        MutableStateFlow mutableStateFlow;
        Object value;
        HomeTabScreensRetainedState homeTabScreensRetainedStateA;
        do {
            mutableStateFlow = this.b;
            value = mutableStateFlow.getValue();
            HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) value;
            BottomNavTabType bottomNavTabType = homeTabScreensRetainedState.f3175a;
            BottomNavTabType bottomNavTabType2 = null;
            if (bottomNavTabType == null || !set.contains(bottomNavTabType)) {
                bottomNavTabType = null;
            }
            BottomNavTabType bottomNavTabType3 = homeTabScreensRetainedState.b;
            if (bottomNavTabType3 != null && set.contains(bottomNavTabType3)) {
                bottomNavTabType2 = bottomNavTabType3;
            }
            homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedState, bottomNavTabType, bottomNavTabType2, (HomeTabScreensRetainedData.HomeScreen) f(homeTabScreensRetainedState.c, set), (HomeTabScreensRetainedData.RegularScreen) f(homeTabScreensRetainedState.d, set), (HomeTabScreensRetainedData.ChaloBusScreen) f(homeTabScreensRetainedState.e, set), (HomeTabScreensRetainedData.MyTicketsScreen) f(homeTabScreensRetainedState.f, set), null, 64);
            Map map = homeTabScreensRetainedStateA.g;
            if (!map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (set.contains((BottomNavTabType) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.equals(map)) {
                    homeTabScreensRetainedStateA = HomeTabScreensRetainedState.a(homeTabScreensRetainedStateA, null, null, null, null, null, null, linkedHashMap, 63);
                }
            }
        } while (!mutableStateFlow.c(value, homeTabScreensRetainedStateA));
    }

    @Override // app.chalo.home.ui.HomeTabScreensNavigationAndStateManager
    public final void e() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.b;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, new HomeTabScreensRetainedState(null, null, null, null, null, null, MapsKt.d())));
    }

    @Override // app.chalo.home.ui.HomeTabScreensNavigationAndStateManager
    public final StateFlow getState() {
        return FlowKt.c(this.b);
    }

    @Override // app.chalo.home.ui.HomeTabScreensNavigationAndStateManager
    public final void goBack() {
        Object value;
        Object value2;
        MutableStateFlow mutableStateFlow = this.b;
        HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) FlowKt.c(mutableStateFlow).getValue();
        BottomNavTabType bottomNavTabType = homeTabScreensRetainedState.b;
        ChaloNavigationManager chaloNavigationManager = this.f3169a;
        if (bottomNavTabType == null) {
            gf.u(null, chaloNavigationManager);
            return;
        }
        BottomNavTabType bottomNavTabType2 = homeTabScreensRetainedState.f3175a;
        if (bottomNavTabType2 == null) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value2, HomeTabScreensRetainedState.a((HomeTabScreensRetainedState) value2, homeTabScreensRetainedState.b, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
        } else if (bottomNavTabType2 == bottomNavTabType) {
            gf.u(null, chaloNavigationManager);
        } else {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, HomeTabScreensRetainedState.a((HomeTabScreensRetainedState) value, homeTabScreensRetainedState.b, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
        }
    }
}
