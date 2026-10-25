package defpackage;

import androidx.datastore.core.DataStore;
import app.chalo.BmtcBrandLottieType;
import app.chalo.Device;
import app.chalo.analytics.MixpanelTokenProvider;
import app.chalo.analytics.utils.MixpanelSenderConfig;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.ProjectionUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapLiveBusMarkerHelper;
import app.chalo.core.database.AppDatabase;
import app.chalo.core.database.dao.DigitalTripReceiptDaoImpl;
import app.chalo.core.database.dao.LastRideInfoDaoImpl;
import app.chalo.core.database.dao.MTicketActivationStoreDaoImpl;
import app.chalo.core.database.dao.MetroTicketDaoImpl;
import app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl;
import app.chalo.core.database.dao.OndcMetroTicketDaoImpl;
import app.chalo.core.database.dao.OndcTicketDaoImpl;
import app.chalo.core.database.dao.PostRideFeedbackDaoImpl;
import app.chalo.core.database.dao.RecentLocationPairDaoImpl;
import app.chalo.core.database.dao.RecentStopAndRouteBasedTripDaoImpl;
import app.chalo.core.database.dao.RideBookingUserFeedbackDaoImpl;
import app.chalo.core.database.dao.RideFeedbackOfflineQueueDaoImpl;
import app.chalo.core.database.dao.TITOValidationDaoImpl;
import app.chalo.core.database.dao.TicketDaoImpl;
import app.chalo.core.database.dao.UserCommutePreferenceSavedRideDaoImpl;
import app.chalo.core.database.dao.UserCommutePreferenceStopPlaceDaoImpl;
import app.chalo.core.di.PlatformDependencyFactory;
import app.chalo.core.di.PlatformDependencyRequest;
import app.chalo.core.domain.UpdateBuildConfigUseCase;
import app.chalo.core.navigation.root.DefaultRootComponent;
import app.chalo.di.SharedBrandBmtcModuleKt;
import app.chalo.features.freshchat.FreshChatInitManager;
import app.chalo.helper.HtmlTextUIHelper;
import app.chalo.home.helper.NearbyBusMarkerIconHelper;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapMarkerIconHelper;
import app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteMapLiveVehicleIconHelper;
import com.arkivanov.decompose.ComponentContext;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19278a;

    public /* synthetic */ s71(int i) {
        this.f19278a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope single = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        switch (this.f19278a) {
            case 0:
                Module module = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new BmtcBrandLottieType();
            case 1:
                AppDatabase appDatabase = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new TITOValidationDaoImpl(appDatabase.b().getI(), appDatabase.f2047a);
            case 2:
                AppDatabase appDatabase2 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new OndcTicketDaoImpl(appDatabase2.b().getM(), appDatabase2.b().getL(), appDatabase2.f2047a);
            case 3:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new UpdateBuildConfigUseCase((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("ENV_CHANGE_STORE_KEY.preferences_pb")), (ChaloBuildConfig) ((PlatformDependencyFactory) single.d(Reflection.a(PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.BuildInfo.f2127a)).a();
            case 4:
                AppDatabase appDatabase3 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new OndcMetroTicketDaoImpl(appDatabase3.b().getK(), appDatabase3.f2047a);
            case 5:
                AppDatabase appDatabase4 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new MetroTicketDaoImpl(appDatabase4.b().getG(), appDatabase4.f2047a);
            case 6:
                AppDatabase appDatabase5 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new DigitalTripReceiptDaoImpl(appDatabase5.b().getT(), appDatabase5.f2047a);
            case 7:
                AppDatabase appDatabase6 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new RecentLocationPairDaoImpl(appDatabase6.b().getU(), appDatabase6.f2047a);
            case 8:
                AppDatabase appDatabase7 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new TicketDaoImpl(appDatabase7.b().getB(), appDatabase7.f2047a);
            case 9:
                AppDatabase appDatabase8 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new LastRideInfoDaoImpl(appDatabase8.b().getE(), appDatabase8.f2047a);
            case 10:
                AppDatabase appDatabase9 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new MTicketActivationStoreDaoImpl(appDatabase9.b().getH(), appDatabase9.f2047a);
            case 11:
                AppDatabase appDatabase10 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new RideBookingUserFeedbackDaoImpl(appDatabase10.b().getD(), appDatabase10.f2047a);
            case 12:
                AppDatabase appDatabase11 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new PostRideFeedbackDaoImpl(appDatabase11.b().getO(), appDatabase11.f2047a);
            case 13:
                AppDatabase appDatabase12 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new RideFeedbackOfflineQueueDaoImpl(appDatabase12.b().getE(), appDatabase12.f2047a);
            case 14:
                return new MixpanelSenderConfig(((Device) single.d(Reflection.a(Device.class), null, null)).getDeviceId(), ((MixpanelTokenProvider) single.d(Reflection.a(MixpanelTokenProvider.class), null, null)).a(((ChaloBuildConfig) single.d(i71.k(single, "$this$factory", it, "it", ChaloBuildConfig.class), null, null)).getF2153a()));
            case 15:
                AppDatabase appDatabase13 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new UserCommutePreferenceStopPlaceDaoImpl(appDatabase13.b().getJ(), appDatabase13.f2047a);
            case 16:
                AppDatabase appDatabase14 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new UserCommutePreferenceSavedRideDaoImpl(appDatabase14.b().getK(), appDatabase14.f2047a);
            case 17:
                AppDatabase appDatabase15 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new MultiModalGroupTicketDaoImpl(appDatabase15.b().getJ(), appDatabase15.b().getI(), appDatabase15.b().getD(), appDatabase15.b().getK(), appDatabase15.f2047a);
            case 18:
                return (ChaloMapMarkerInfoWindowProvider) ((PlatformDependencyFactory) single.d(i71.k(single, "$this$factory", it, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.MapInfoWindowProvider.f2141a);
            case 19:
                return (LatLngBoundsUtils) ((PlatformDependencyFactory) single.d(i71.k(single, "$this$factory", it, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.LLBUtils.f2140a);
            case 20:
                return (RouteMapLiveVehicleIconHelper) ((PlatformDependencyFactory) single.d(i71.k(single, "$this$factory", it, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.RouteMapLiveVehicleHelper.f2147a);
            case 21:
                AppDatabase appDatabase16 = (AppDatabase) single.d(i71.k(single, "$this$single", it, "it", AppDatabase.class), null, null);
                return new RecentStopAndRouteBasedTripDaoImpl(appDatabase16.b().getX(), appDatabase16.f2047a);
            case 22:
                return (NearbyBusMarkerIconHelper) ((PlatformDependencyFactory) single.d(i71.k(single, "$this$single", it, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.NearbyBusMarkerIconHelperRequest.f2142a);
            case 23:
                return (ChaloMapLiveBusMarkerHelper) ((PlatformDependencyFactory) single.d(i71.k(single, "$this$factory", it, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.ChaloLiveBusMarkerHelper.f2129a);
            case 24:
                return (HtmlTextUIHelper) ((PlatformDependencyFactory) single.d(i71.k(single, "$this$factory", it, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.HtmlTextHelper.f2136a);
            case 25:
                return (NearbyStopsMapMarkerIconHelper) ((PlatformDependencyFactory) single.d(i71.k(single, "$this$factory", it, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.NearbyStopsMapMarkerHelper.f2143a);
            case 26:
                return (ChaloSocket) ((PlatformDependencyFactory) single.d(i71.k(single, "$this$factory", it, "it", PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.ChaloSocketRequest.f2130a);
            case 27:
                Intrinsics.i(single, "$this$factory");
                Intrinsics.i(it, "it");
                return (ProjectionUtils) ((PlatformDependencyFactory) single.d(Reflection.a(PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.ProjectionUtils.f2145a);
            case 28:
                Intrinsics.i(single, "$this$factory");
                Intrinsics.i(it, "it");
                return new DefaultRootComponent((List) single.d(Reflection.a(List.class), null, null), (ComponentContext) single.d(Reflection.a(ComponentContext.class), null, null), (ChaloBuildConfig) single.d(Reflection.a(ChaloBuildConfig.class), null, null));
            default:
                Intrinsics.i(single, "$this$factory");
                Intrinsics.i(it, "it");
                return (FreshChatInitManager) ((PlatformDependencyFactory) single.d(Reflection.a(PlatformDependencyFactory.class), null, null)).a(PlatformDependencyRequest.FreshChatInitManagerHelper.f2134a);
        }
    }
}
