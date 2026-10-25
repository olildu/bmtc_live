package app.chalo.home.ui.regularbus;

import app.chalo.ads.UnifiedAdSlot;
import app.chalo.citydata.domain.IsDynamicCityDataFetchEnabledUseCase;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.MetroBookingFlowType;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.TextFormatAppModel;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.domain.IsLocationMandatoryForUserUseCase;
import app.chalo.domain.IsStopBasedTripPlannerApplicableUseCase;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel;
import app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager;
import app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManagerKt;
import app.chalo.geoquery.domain.GetGeoQueryCityWiseConfigUseCase;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.domain.GetRecentSearchListUseCase;
import app.chalo.home.domain.GetRegularBusPageItemsUseCase;
import app.chalo.home.helper.NearbyBusMarkerHelper;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.home.ui.HomeTabScreensRetainedState;
import app.chalo.home.ui.base.HomeTabVisibilityController;
import app.chalo.home.ui.common.VisibleJobTracker;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.ImageResourceCtaType;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.juspay.JusPayErrorResultAppModel;
import app.chalo.juspay.JuspayController;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.juspay.JuspayOperationFailure;
import app.chalo.juspay.JuspayOperationResult;
import app.chalo.juspay.JuspayOperationUpdate;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.domain.CheckIsTripNotStaleUseCase;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultScreenData;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsContractKt;
import app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase;
import app.chalo.livetracking.universalsearch.domain.IsCityRouteNamesDisabledUseCase;
import app.chalo.location.AppPermissionRequest;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.recent.database.migration.RecentsStoreMigrationHelper;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.RecentsType;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.BusesAroundYouArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.NearbyStopsMapArgs;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.SosArgs;
import app.chalo.scenes.args.StopTripDetailsArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.IsCityEnabledForLiveTrackingUseCase;
import app.chalo.utils.GeometryUtils;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.a80;
import defpackage.g11;
import defpackage.h11;
import defpackage.i11;
import defpackage.n8;
import defpackage.t01;
import defpackage.va;
import defpackage.vo1;
import defpackage.vw0;
import defpackage.xg;
import defpackage.z01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.MonotonicTimeSource;
import kotlin.time.TimeSource;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewState;", "Lapp/chalo/home/ui/regularbus/RegularBusDataState;", "Lapp/chalo/home/ui/regularbus/RegularBusSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegularBusComponent extends ChaloBaseStateMviComponent<RegularBusViewIntent, RegularBusViewState, RegularBusViewState, RegularBusSideEffect> {
    public final ChaloLocationManager A;
    public final GetTripPlannerConfigForCityUseCase B;
    public final GetGeoQueryCityWiseConfigUseCase C;
    public final UserProfileDetailsProvider D;
    public final CrashlyticsLogger E;
    public final HomeScreenAnalyticsHelper F;
    public final CheckIsTripNotStaleUseCase G;
    public final TimeUtilsContract H;
    public final IsStopBasedTripPlannerApplicableUseCase I;
    public final PermissionHandlerProvider J;
    public final IsCityRouteNamesDisabledUseCase K;
    public final LiveTrackingConfigDataStore L;
    public final ChaloNavigationManager M;
    public final HomeTabScreensNavigationAndStateManager N;
    public final KotlinToastManager O;
    public final TicketPurchaseSceneResolverUseCase P;
    public final GpsRequestHandlerProvider Q;
    public final SystemHelper R;
    public final LocationPermissionCallbackHandler S;
    public final IsCityEnabledForLiveTrackingUseCase T;
    public final GetClusterConfigForCityUseCase U;
    public final UrlOpenHelper V;
    public final BottomNavTabType W;
    public final ChaloAppFeatureHelper X;
    public final ProductBookingHelper Y;
    public final JuspayControllerProvider Z;
    public final ArePermissionsGrantedUseCase a0;
    public boolean b0;
    public boolean c0;
    public LatLng d0;
    public boolean e0;
    public boolean f0;
    public Job g0;
    public Job h0;
    public boolean i0;
    public boolean j0;
    public final CoroutineContextProvider k;
    public TimeSource.Monotonic.ValueTimeMark k0;
    public final NearbyTripsDataManagerBase l;
    public TimeSource.Monotonic.ValueTimeMark l0;
    public final BasicInfoContract m;
    public String m0;
    public final GetEstimatedTimeUseCase n;
    public Job n0;
    public final StringProvider o;
    public boolean o0;
    public final ChaloLocationManager p;
    public final VisibleJobTracker p0;
    public final GetRegularBusPageItemsUseCase q;
    public int q0;
    public final IsDynamicCityDataFetchEnabledUseCase r;
    public boolean r0;
    public final HomeScreenInfoHelper s;
    public boolean s0;
    public final CityProvider t;
    public final Flow t0;
    public final GeoSpatialLiveBusesDataPollingManager u;
    public final MutableStateFlow u0;
    public final NearbyBusMarkerHelper v;
    public final StateFlow v0;
    public final IsLocationMandatoryForUserUseCase w;
    public final Lazy w0;
    public final RecentsStoreMigrationHelper x;
    public final RecentRepositoryProvider y;
    public final GetRecentSearchListUseCase z;

    /* JADX INFO: renamed from: app.chalo.home.ui.regularbus.RegularBusComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/home/ui/regularbus/RegularBusComponent$1", "Lapp/chalo/helper/UrlOpenHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass1 implements UrlOpenHelper {
        @Override // app.chalo.helper.UrlOpenHelper
        public final boolean a(String url, Map map) {
            Intrinsics.i(url, "url");
            return false;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.regularbus.RegularBusComponent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$2", f = "RegularBusComponent.kt", l = {250}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RegularBusComponent.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow state = RegularBusComponent.this.N.getState();
                final RegularBusComponent regularBusComponent = RegularBusComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.regularbus.RegularBusComponent.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) obj2;
                        xg xgVar = new xg(homeTabScreensRetainedState, 3);
                        RegularBusComponent regularBusComponent2 = regularBusComponent;
                        regularBusComponent2.E0(xgVar);
                        Integer num = (Integer) homeTabScreensRetainedState.g.get(regularBusComponent2.W);
                        int iIntValue = num != null ? num.intValue() : 0;
                        if (iIntValue != regularBusComponent2.q0) {
                            regularBusComponent2.q0 = iIntValue;
                            regularBusComponent2.c0 = true;
                            regularBusComponent2.b0 = true;
                            regularBusComponent2.r0 = true;
                            MutableStateFlow mutableStateFlow = regularBusComponent2.u0;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.c(value, Integer.valueOf(((Number) value).intValue() + 1)));
                            if (regularBusComponent2.o0) {
                                regularBusComponent2.r0 = false;
                                regularBusComponent2.Z0(RegularBusViewIntent.RegularBusScreenViewStoppedIntent.f3652a);
                                regularBusComponent2.Z0(RegularBusViewIntent.RegularBusScreenViewStartedIntent.f3651a);
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (state.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusComponent$Companion;", "", "", "REGULAR_BUS_TAB_RECENT_SEARCH_CARD", "Ljava/lang/String;", "", "RECENT_COUNT_LIMIT", "I", "OUTCOME_ACCEPTED", "OUTCOME_IGNORED_OPERATION_IN_PROGRESS", "OUTCOME_IGNORED_LAUNCH_IN_FLIGHT", "OUTCOME_CONTROLLER_UNAVAILABLE", "OUTCOME_PERMISSION_HANDLER_UNAVAILABLE", "OUTCOME_PERMISSION_DENIED", "OUTCOME_BACK_PRESSED", "OUTCOME_REJECTED", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3619a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ImageResourceCtaType.values().length];
            try {
                iArr[ImageResourceCtaType.SCAN_AND_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageResourceCtaType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3619a = iArr;
            int[] iArr2 = new int[MetroBookingFlowType.values().length];
            try {
                iArr2[MetroBookingFlowType.ONDC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MetroBookingFlowType.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent(ComponentContext componentContext, CoroutineContextProvider coroutineContextProvider, NearbyTripsDataManagerBase nearbyTripsDataManagerBase, BasicInfoContract basicInfoContract, GetEstimatedTimeUseCase getEstimatedTimeUseCase, StringProvider stringProvider, ChaloLocationManager chaloLocationManager, GetRegularBusPageItemsUseCase getRegularBusPageItemsUseCase, IsDynamicCityDataFetchEnabledUseCase isDynamicCityDataFetchEnabledUseCase, HomeScreenInfoHelper homeScreenInfoHelper, CityProvider cityProvider, GeoSpatialLiveBusesDataPollingManager geoSpatialLiveBusesDataPollingManager, NearbyBusMarkerHelper nearbyBusMarkerHelper, IsLocationMandatoryForUserUseCase isLocationMandatoryForUserUseCase, RecentsStoreMigrationHelper recentsStoreMigrationHelper, RecentRepositoryProvider recentRepositoryProvider, GetRecentSearchListUseCase getRecentSearchListUseCase, ChaloLocationManager chaloLocationManager2, GetTripPlannerConfigForCityUseCase getTripPlannerConfigForCityUseCase, GetGeoQueryCityWiseConfigUseCase getGeoQueryCityWiseConfigUseCase, UserProfileDetailsProvider userProfileDetailsProvider, CrashlyticsLogger crashlyticsLogger, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, CheckIsTripNotStaleUseCase checkIsTripNotStaleUseCase, TimeUtilsContract timeUtilsContract, IsStopBasedTripPlannerApplicableUseCase isStopBasedTripPlannerApplicableUseCase, PermissionHandlerProvider permissionHandlerProvider, IsCityRouteNamesDisabledUseCase isCityRouteNamesDisabledUseCase, LiveTrackingConfigDataStore liveTrackingConfigDataStore, ChaloNavigationManager chaloNavigationManager, HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager, KotlinToastManager kotlinToastManager, TicketPurchaseSceneResolverUseCase ticketPurchaseSceneResolverUseCase, GpsRequestHandlerProvider gpsRequestHandlerProvider, SystemHelper systemHelper, LocationPermissionCallbackHandler locationPermissionCallbackHandler, IsCityEnabledForLiveTrackingUseCase isCityEnabledForLiveTrackingUseCase, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase, UrlOpenHelper urlOpenHelper, HomeTabVisibilityController homeTabVisibilityController, BottomNavTabType tabType, ChaloAppFeatureHelper chaloAppFeatureHelper, ProductBookingHelper productBookingHelper, JuspayControllerProvider juspayControllerProvider, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(homeTabVisibilityController, "homeTabVisibilityController");
        Intrinsics.i(tabType, "tabType");
        this.k = coroutineContextProvider;
        this.l = nearbyTripsDataManagerBase;
        this.m = basicInfoContract;
        this.n = getEstimatedTimeUseCase;
        this.o = stringProvider;
        this.p = chaloLocationManager;
        this.q = getRegularBusPageItemsUseCase;
        this.r = isDynamicCityDataFetchEnabledUseCase;
        this.s = homeScreenInfoHelper;
        this.t = cityProvider;
        this.u = geoSpatialLiveBusesDataPollingManager;
        this.v = nearbyBusMarkerHelper;
        this.w = isLocationMandatoryForUserUseCase;
        this.x = recentsStoreMigrationHelper;
        this.y = recentRepositoryProvider;
        this.z = getRecentSearchListUseCase;
        this.A = chaloLocationManager2;
        this.B = getTripPlannerConfigForCityUseCase;
        this.C = getGeoQueryCityWiseConfigUseCase;
        this.D = userProfileDetailsProvider;
        this.E = crashlyticsLogger;
        this.F = homeScreenAnalyticsHelper;
        this.G = checkIsTripNotStaleUseCase;
        this.H = timeUtilsContract;
        this.I = isStopBasedTripPlannerApplicableUseCase;
        this.J = permissionHandlerProvider;
        this.K = isCityRouteNamesDisabledUseCase;
        this.L = liveTrackingConfigDataStore;
        this.M = chaloNavigationManager;
        this.N = homeTabScreensNavigationAndStateManager;
        this.O = kotlinToastManager;
        this.P = ticketPurchaseSceneResolverUseCase;
        this.Q = gpsRequestHandlerProvider;
        this.R = systemHelper;
        this.S = locationPermissionCallbackHandler;
        this.T = isCityEnabledForLiveTrackingUseCase;
        this.U = getClusterConfigForCityUseCase;
        this.V = urlOpenHelper;
        this.W = tabType;
        this.X = chaloAppFeatureHelper;
        this.Y = productBookingHelper;
        this.Z = juspayControllerProvider;
        this.a0 = arePermissionsGrantedUseCase;
        this.b0 = true;
        this.c0 = true;
        this.p0 = new VisibleJobTracker();
        this.t0 = homeTabVisibilityController.a(tabType);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(0);
        this.u0 = mutableStateFlowA;
        this.v0 = FlowKt.c(mutableStateFlowA);
        Job job = this.n0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.n0 = BuildersKt.d(this.j, null, null, new RegularBusComponent$observeTabVisibility$1(this, null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass2(null), 3);
        this.w0 = LazyKt.b(new i11(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(RegularBusComponent regularBusComponent, ContinuationImpl continuationImpl) {
        RegularBusComponent$areJuspayPermissionsGranted$1 regularBusComponent$areJuspayPermissionsGranted$1;
        regularBusComponent.getClass();
        if (continuationImpl instanceof RegularBusComponent$areJuspayPermissionsGranted$1) {
            regularBusComponent$areJuspayPermissionsGranted$1 = (RegularBusComponent$areJuspayPermissionsGranted$1) continuationImpl;
            int i = regularBusComponent$areJuspayPermissionsGranted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$areJuspayPermissionsGranted$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$areJuspayPermissionsGranted$1 = new RegularBusComponent$areJuspayPermissionsGranted$1(regularBusComponent, continuationImpl);
            }
        } else {
            regularBusComponent$areJuspayPermissionsGranted$1 = new RegularBusComponent$areJuspayPermissionsGranted$1(regularBusComponent, continuationImpl);
        }
        Object objA = regularBusComponent$areJuspayPermissionsGranted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$areJuspayPermissionsGranted$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = regularBusComponent.a0;
            AppPermission.INSTANCE.getClass();
            List listA = AppPermission.Companion.a();
            regularBusComponent$areJuspayPermissionsGranted$1.label = 1;
            objA = arePermissionsGrantedUseCase.a(listA, regularBusComponent$areJuspayPermissionsGranted$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((AppPermissionRequest) objA).b.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0118 -> B:40:0x011d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.io.Serializable G0(app.chalo.home.ui.regularbus.RegularBusComponent r27, java.util.List r28, java.util.List r29, java.util.Map r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent.G0(app.chalo.home.ui.regularbus.RegularBusComponent, java.util.List, java.util.List, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object H0(RegularBusComponent regularBusComponent, ContinuationImpl continuationImpl) {
        RegularBusComponent$getLatLngToFetchNearbyTrips$1 regularBusComponent$getLatLngToFetchNearbyTrips$1;
        StateFlow stateFlow;
        CityProvider cityProvider = regularBusComponent.t;
        if (continuationImpl instanceof RegularBusComponent$getLatLngToFetchNearbyTrips$1) {
            regularBusComponent$getLatLngToFetchNearbyTrips$1 = (RegularBusComponent$getLatLngToFetchNearbyTrips$1) continuationImpl;
            int i = regularBusComponent$getLatLngToFetchNearbyTrips$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$getLatLngToFetchNearbyTrips$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$getLatLngToFetchNearbyTrips$1 = new RegularBusComponent$getLatLngToFetchNearbyTrips$1(regularBusComponent, continuationImpl);
            }
        } else {
            regularBusComponent$getLatLngToFetchNearbyTrips$1 = new RegularBusComponent$getLatLngToFetchNearbyTrips$1(regularBusComponent, continuationImpl);
        }
        Object obj = regularBusComponent$getLatLngToFetchNearbyTrips$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$getLatLngToFetchNearbyTrips$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowB = cityProvider.getE();
            ChaloLocationManager chaloLocationManager = regularBusComponent.p;
            regularBusComponent$getLatLngToFetchNearbyTrips$1.L$0 = stateFlowB;
            regularBusComponent$getLatLngToFetchNearbyTrips$1.label = 1;
            Object objA = chaloLocationManager.a(regularBusComponent$getLatLngToFetchNearbyTrips$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objA;
            stateFlow = stateFlowB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateFlow = (StateFlow) regularBusComponent$getLatLngToFetchNearbyTrips$1.L$0;
            ResultKt.b(obj);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        if (locationAppModelA == null) {
            CityAppModel cityAppModel = (CityAppModel) stateFlow.getValue();
            if (cityAppModel != null) {
                return cityAppModel.d;
            }
            return null;
        }
        LatLng latLngA = locationAppModelA.a();
        if (CityProviderKt.a(cityProvider, latLngA)) {
            return latLngA;
        }
        CityAppModel cityAppModel2 = (CityAppModel) stateFlow.getValue();
        if (cityAppModel2 != null) {
            return cityAppModel2.d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r13 == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        if (r13 == r3) goto L50;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I0(app.chalo.home.ui.regularbus.RegularBusComponent r9, app.chalo.homescreen.data.model.app.ImageResourceCtaType r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            app.chalo.providers.stringprovider.StringProvider r0 = r9.o
            app.chalo.providers.toast.KotlinToastManager r1 = r9.O
            boolean r2 = r13 instanceof app.chalo.home.ui.regularbus.RegularBusComponent$handleImageResourceClick$1
            if (r2 == 0) goto L17
            r2 = r13
            app.chalo.home.ui.regularbus.RegularBusComponent$handleImageResourceClick$1 r2 = (app.chalo.home.ui.regularbus.RegularBusComponent$handleImageResourceClick$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            app.chalo.home.ui.regularbus.RegularBusComponent$handleImageResourceClick$1 r2 = new app.chalo.home.ui.regularbus.RegularBusComponent$handleImageResourceClick$1
            r2.<init>(r9, r13)
        L1c:
            java.lang.Object r13 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 3
            kotlin.Unit r6 = kotlin.Unit.f17538a
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L4e
            if (r4 == r7) goto L45
            if (r4 == r8) goto L41
            if (r4 != r5) goto L39
            java.lang.Object r9 = r2.L$0
            r1 = r9
            app.chalo.providers.toast.KotlinToastManager r1 = (app.chalo.providers.toast.KotlinToastManager) r1
            kotlin.ResultKt.b(r13)
            goto L9e
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L41:
            kotlin.ResultKt.b(r13)
            return r6
        L45:
            java.lang.Object r9 = r2.L$0
            r1 = r9
            app.chalo.providers.toast.KotlinToastManager r1 = (app.chalo.providers.toast.KotlinToastManager) r1
            kotlin.ResultKt.b(r13)
            goto L76
        L4e:
            kotlin.ResultKt.b(r13)
            r13 = 0
            if (r11 == 0) goto L5b
            boolean r4 = kotlin.text.StringsKt.F(r11)
            if (r4 != 0) goto L5b
            goto L5c
        L5b:
            r11 = r13
        L5c:
            r4 = 0
            if (r11 == 0) goto L7c
            app.chalo.helper.UrlOpenHelper r9 = r9.V
            boolean r9 = r9.a(r11, r13)
            if (r9 != 0) goto Lb3
            app.chalo.providers.stringprovider.StringEnum r9 = app.chalo.providers.stringprovider.StringEnum.GENERIC_ERROR_MESSAGE
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r2.L$0 = r1
            r2.label = r7
            java.lang.Object r13 = r0.b(r9, r10, r2)
            if (r13 != r3) goto L76
            goto Lb2
        L76:
            java.lang.String r13 = (java.lang.String) r13
            app.chalo.providers.toast.KotlinToastManagerKt.b(r1, r13)
            return r6
        L7c:
            r11 = -1
            if (r10 != 0) goto L81
            r10 = r11
            goto L89
        L81:
            int[] r13 = app.chalo.home.ui.regularbus.RegularBusComponent.WhenMappings.f3619a
            int r10 = r10.ordinal()
            r10 = r13[r10]
        L89:
            if (r10 == r11) goto Lb3
            if (r10 == r7) goto Laa
            if (r10 != r8) goto La4
            app.chalo.providers.stringprovider.StringEnum r9 = app.chalo.providers.stringprovider.StringEnum.GENERIC_ERROR_MESSAGE
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r2.L$0 = r1
            r2.label = r5
            java.lang.Object r13 = r0.b(r9, r10, r2)
            if (r13 != r3) goto L9e
            goto Lb2
        L9e:
            java.lang.String r13 = (java.lang.String) r13
            app.chalo.providers.toast.KotlinToastManagerKt.b(r1, r13)
            return r6
        La4:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        Laa:
            r2.label = r8
            java.lang.Object r9 = r9.U0(r12, r2)
            if (r9 != r3) goto Lb3
        Lb2:
            return r3
        Lb3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent.I0(app.chalo.home.ui.regularbus.RegularBusComponent, app.chalo.homescreen.data.model.app.ImageResourceCtaType, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J0(app.chalo.home.ui.regularbus.RegularBusComponent r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            app.chalo.providers.stringprovider.StringProvider r0 = r12.o
            boolean r1 = r13 instanceof app.chalo.home.ui.regularbus.RegularBusComponent$handlePayForTicketClick$1
            if (r1 == 0) goto L16
            r1 = r13
            app.chalo.home.ui.regularbus.RegularBusComponent$handlePayForTicketClick$1 r1 = (app.chalo.home.ui.regularbus.RegularBusComponent$handlePayForTicketClick$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            app.chalo.home.ui.regularbus.RegularBusComponent$handlePayForTicketClick$1 r1 = new app.chalo.home.ui.regularbus.RegularBusComponent$handlePayForTicketClick$1
            r1.<init>(r12, r13)
            goto L14
        L1c:
            java.lang.Object r13 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r8 = 0
            r9 = 3
            r3 = 1
            r10 = 2
            r11 = 0
            if (r2 == 0) goto L54
            if (r2 == r3) goto L50
            if (r2 == r10) goto L40
            if (r2 != r9) goto L38
            java.lang.Object r12 = r6.L$0
            app.chalo.providers.toast.KotlinToastManager r12 = (app.chalo.providers.toast.KotlinToastManager) r12
            kotlin.ResultKt.b(r13)
            goto Lb8
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            java.lang.Object r2 = r6.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.L$1
            app.chalo.constants.Source r3 = (app.chalo.constants.Source) r3
            java.lang.Object r4 = r6.L$0
            app.chalo.home.analytics.HomeScreenAnalyticsHelper r4 = (app.chalo.home.analytics.HomeScreenAnalyticsHelper) r4
            kotlin.ResultKt.b(r13)
            goto L92
        L50:
            kotlin.ResultKt.b(r13)
            goto L68
        L54:
            kotlin.ResultKt.b(r13)
            app.chalo.domain.TicketPurchaseSceneResolverUseCase r2 = r12.P
            r13 = r3
            app.chalo.domain.ProductNavigationSource r3 = app.chalo.domain.ProductNavigationSource.REGULAR_BUS_SCREEN
            r6.label = r13
            r4 = 0
            r5 = 0
            r7 = 6
            java.lang.Object r13 = app.chalo.domain.TicketPurchaseSceneResolverUseCase.a(r2, r3, r4, r5, r6, r7)
            if (r13 != r1) goto L68
            goto Lb7
        L68:
            app.chalo.scenes.args.TicketPurchaseArgs r13 = (app.chalo.scenes.args.TicketPurchaseArgs) r13
            if (r13 == 0) goto L78
            app.chalo.scenes.ChaloNavigationManager r12 = r12.M
            app.chalo.scenes.ChaloNavigationRequest$Navigate r0 = new app.chalo.scenes.ChaloNavigationRequest$Navigate
            r1 = 6
            r0.<init>(r13, r11, r11, r1)
            r12.b(r0)
            goto Lbd
        L78:
            app.chalo.home.analytics.HomeScreenAnalyticsHelper r4 = r12.F
            app.chalo.constants.Source r3 = app.chalo.constants.Source.REGULAR_BUS_SCREEN_TAB
            app.chalo.providers.stringprovider.StringEnum r13 = app.chalo.providers.stringprovider.StringEnum.NO_VALID_PRODUCT
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r6.L$0 = r4
            r6.L$1 = r3
            java.lang.String r5 = "error"
            r6.L$2 = r5
            r6.label = r10
            java.lang.Object r13 = r0.b(r13, r2, r6)
            if (r13 != r1) goto L91
            goto Lb7
        L91:
            r2 = r5
        L92:
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r2, r13)
            java.util.Map r13 = kotlin.collections.MapsKt.h(r5)
            java.lang.String r2 = "regular bus tab, pay for ticket click navigation failed"
            r5 = 12
            app.chalo.home.analytics.HomeScreenAnalyticsHelper.DefaultImpls.a(r4, r2, r13, r3, r5)
            app.chalo.providers.toast.KotlinToastManager r12 = r12.O
            app.chalo.providers.stringprovider.StringEnum r13 = app.chalo.providers.stringprovider.StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r6.L$0 = r12
            r6.L$1 = r11
            r6.L$2 = r11
            r6.label = r9
            java.lang.Object r13 = r0.b(r13, r2, r6)
            if (r13 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            java.lang.String r13 = (java.lang.String) r13
            defpackage.hq0.s(r12, r13)
        Lbd:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent.J0(app.chalo.home.ui.regularbus.RegularBusComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object K0(RegularBusComponent regularBusComponent, String str, ContinuationImpl continuationImpl) {
        RegularBusComponent$handleUnavailableMetroCase$1 regularBusComponent$handleUnavailableMetroCase$1;
        KotlinToastManager kotlinToastManager;
        regularBusComponent.getClass();
        if (continuationImpl instanceof RegularBusComponent$handleUnavailableMetroCase$1) {
            regularBusComponent$handleUnavailableMetroCase$1 = (RegularBusComponent$handleUnavailableMetroCase$1) continuationImpl;
            int i = regularBusComponent$handleUnavailableMetroCase$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$handleUnavailableMetroCase$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$handleUnavailableMetroCase$1 = new RegularBusComponent$handleUnavailableMetroCase$1(regularBusComponent, continuationImpl);
            }
        } else {
            regularBusComponent$handleUnavailableMetroCase$1 = new RegularBusComponent$handleUnavailableMetroCase$1(regularBusComponent, continuationImpl);
        }
        Object objB = regularBusComponent$handleUnavailableMetroCase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$handleUnavailableMetroCase$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            HomeScreenAnalyticsHelper.DefaultImpls.a(regularBusComponent.F, "regular bus tab metro click nav failed", vo1.s("error", str), Source.REGULAR_BUS_SCREEN_TAB, 12);
            KotlinToastManager kotlinToastManager2 = regularBusComponent.O;
            regularBusComponent$handleUnavailableMetroCase$1.L$0 = kotlinToastManager2;
            regularBusComponent$handleUnavailableMetroCase$1.label = 1;
            objB = regularBusComponent.o.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE, new Object[0], regularBusComponent$handleUnavailableMetroCase$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) regularBusComponent$handleUnavailableMetroCase$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object L0(RegularBusComponent regularBusComponent, ContinuationImpl continuationImpl) {
        RegularBusComponent$navigateToUniversalPicker$1 regularBusComponent$navigateToUniversalPicker$1;
        String strA;
        String str;
        regularBusComponent.getClass();
        if (continuationImpl instanceof RegularBusComponent$navigateToUniversalPicker$1) {
            regularBusComponent$navigateToUniversalPicker$1 = (RegularBusComponent$navigateToUniversalPicker$1) continuationImpl;
            int i = regularBusComponent$navigateToUniversalPicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$navigateToUniversalPicker$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$navigateToUniversalPicker$1 = new RegularBusComponent$navigateToUniversalPicker$1(regularBusComponent, continuationImpl);
            }
        } else {
            regularBusComponent$navigateToUniversalPicker$1 = new RegularBusComponent$navigateToUniversalPicker$1(regularBusComponent, continuationImpl);
        }
        Object obj = regularBusComponent$navigateToUniversalPicker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$navigateToUniversalPicker$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ChaloJson chaloJson = ChaloJson.f6455a;
            UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.d(new UniversalSearchOption.PLACES(false, true), new UniversalSearchOption.STOPS(true, false), new UniversalSearchOption.ROUTES(), new UniversalSearchOption.TRIPS()));
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
            } catch (Exception unused) {
                strA = null;
            }
            if (strA == null) {
                strA = "";
            }
            regularBusComponent$navigateToUniversalPicker$1.L$0 = strA;
            regularBusComponent$navigateToUniversalPicker$1.label = 1;
            Object objB = regularBusComponent.o.b(StringEnum.UNIVERSAL_PICKER_HINT, new Object[0], regularBusComponent$navigateToUniversalPicker$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = strA;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) regularBusComponent$navigateToUniversalPicker$1.L$0;
            ResultKt.b(obj);
            str = str2;
        }
        regularBusComponent.M.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str, (String) obj, UniversalSearchFlowSource.REGULAR_BUS_SCREEN_TAB.getSourceName(), Source.HOME_SCREEN, (String) null, "TRIP_PLANNER", (String) null, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 2000), null, null, 6));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc A[EDGE_INSN: B:55:0x00fc->B:56:0x00fd BREAK  A[LOOP:2: B:39:0x00c3->B:92:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x0146  */
    /* JADX WARN: Code duplicated, block: B:79:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[LOOP:2: B:39:0x00c3->B:92:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ea A[SYNTHETIC] */
    public static final Object M0(RegularBusComponent regularBusComponent, JuspayController juspayController, ContinuationImpl continuationImpl) {
        RegularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1 regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1;
        List listA;
        JuspayController juspayController2;
        KotlinToastManager kotlinToastManager;
        List list;
        ArrayList arrayList;
        AppPermission appPermission;
        PermissionState permissionState;
        Iterator it;
        Object next;
        Pair pair;
        List<AppPermission> list2;
        Iterator it2;
        Object next2;
        Pair pair2;
        PermissionState permissionState2;
        regularBusComponent.getClass();
        if (continuationImpl instanceof RegularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1) {
            regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1 = (RegularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1) continuationImpl;
            int i = regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1 = new RegularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1(regularBusComponent, continuationImpl);
            }
        } else {
            regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1 = new RegularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1(regularBusComponent, continuationImpl);
        }
        Object objV = regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label;
        Unit unit = Unit.f17538a;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objV);
            PermissionHandler permissionHandlerC = regularBusComponent.J.c();
            if (permissionHandlerC == null) {
                regularBusComponent.b1("permission_handler_unavailable", new g11(2));
                KotlinToastManager kotlinToastManager2 = regularBusComponent.O;
                regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0 = kotlinToastManager2;
                regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = 1;
                Object objB = regularBusComponent.o.b(StringEnum.GENERIC_ERROR_MESSAGE, new Object[0], regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1);
                if (objB != obj) {
                    objV = objB;
                    kotlinToastManager = kotlinToastManager2;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objV, ToastLength.LONG);
                    return unit;
                }
            } else {
                AppPermission.INSTANCE.getClass();
                listA = AppPermission.Companion.a();
                regularBusComponent.j0 = false;
                Flow flowA = permissionHandlerC.a(listA);
                regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0 = juspayController;
                regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$1 = listA;
                regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = 2;
                objV = FlowKt.v(flowA, regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1);
                if (objV != obj) {
                    juspayController2 = juspayController;
                    list = (List) objV;
                    if (list != null) {
                        z = false;
                        break;
                    }
                    list2 = listA;
                    if (list2 instanceof Collection) {
                        while (r11.hasNext()) {
                            it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (((Pair) next2).d() != appPermission);
                            pair2 = (Pair) next2;
                            if (pair2 != null) {
                                permissionState2 = (PermissionState) pair2.e();
                            } else {
                                permissionState2 = null;
                            }
                            if (permissionState2 != PermissionState.GRANTED) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        for (AppPermission appPermission2 : list2) {
                            it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (((Pair) next2).d() != appPermission2);
                            pair2 = (Pair) next2;
                            if (pair2 != null) {
                                permissionState2 = (PermissionState) pair2.e();
                            } else {
                                permissionState2 = null;
                            }
                            if (permissionState2 != PermissionState.GRANTED) {
                                z = false;
                                break;
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    for (Object obj2 : listA) {
                        appPermission = (AppPermission) obj2;
                        if (list != null) {
                            it = list.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((Pair) next).d() != appPermission);
                            pair = (Pair) next;
                            if (pair != null) {
                                permissionState = (PermissionState) pair.e();
                            } else {
                                permissionState = null;
                            }
                        } else {
                            permissionState = null;
                        }
                        if (permissionState != PermissionState.GRANTED) {
                            arrayList.add(obj2);
                        }
                    }
                    HomeScreenAnalyticsHelper.DefaultImpls.a(regularBusComponent.F, "regular bus scan and pay permission result", regularBusComponent.e1(new n8(z, arrayList, 8)), Source.REGULAR_BUS_SCREEN_TAB, 12);
                    if (z) {
                        regularBusComponent.b1("permission_denied", new g11(2));
                        regularBusComponent.E0(new g11(1));
                        return unit;
                    }
                    regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0 = null;
                    regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$1 = null;
                    regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = 3;
                    if (regularBusComponent.X0(juspayController2, false, regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1) == obj) {
                        return unit;
                    }
                }
            }
        } else {
            if (i2 == 1) {
                kotlinToastManager = (KotlinToastManager) regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0;
                ResultKt.b(objV);
                KotlinToastManagerKt.a(kotlinToastManager, (String) objV, ToastLength.LONG);
                return unit;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objV);
                return unit;
            }
            listA = (List) regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$1;
            juspayController2 = (JuspayController) regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0;
            ResultKt.b(objV);
            list = (List) objV;
            if (list != null) {
                z = false;
                break;
            }
            list2 = listA;
            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                while (r11.hasNext()) {
                    it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (((Pair) next2).d() != appPermission2);
                    pair2 = (Pair) next2;
                    if (pair2 != null) {
                        permissionState2 = (PermissionState) pair2.e();
                    } else {
                        permissionState2 = null;
                    }
                    if (permissionState2 != PermissionState.GRANTED) {
                        z = false;
                        break;
                    }
                }
            }
            arrayList = new ArrayList();
            while (r4.hasNext()) {
                appPermission = (AppPermission) obj2;
                if (list != null) {
                    it = list.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((Pair) next).d() != appPermission);
                    pair = (Pair) next;
                    if (pair != null) {
                        permissionState = (PermissionState) pair.e();
                    } else {
                        permissionState = null;
                    }
                } else {
                    permissionState = null;
                }
                if (permissionState != PermissionState.GRANTED) {
                    arrayList.add(obj2);
                }
            }
            HomeScreenAnalyticsHelper.DefaultImpls.a(regularBusComponent.F, "regular bus scan and pay permission result", regularBusComponent.e1(new n8(z, arrayList, 8)), Source.REGULAR_BUS_SCREEN_TAB, 12);
            if (z) {
                regularBusComponent.b1("permission_denied", new g11(2));
                regularBusComponent.E0(new g11(1));
                return unit;
            }
            regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0 = null;
            regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$1 = null;
            regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = 3;
            if (regularBusComponent.X0(juspayController2, false, regularBusComponent$requestJuspayPermissionsAndLaunchScanAndPay$1) == obj) {
                return unit;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0585  */
    /* JADX WARN: Code duplicated, block: B:103:0x0593  */
    /* JADX WARN: Code duplicated, block: B:104:0x0598  */
    /* JADX WARN: Code duplicated, block: B:107:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:108:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:111:0x05da  */
    /* JADX WARN: Code duplicated, block: B:114:0x05f1 A[LOOP:5: B:112:0x05eb->B:114:0x05f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:117:0x0602  */
    /* JADX WARN: Code duplicated, block: B:120:0x0619 A[LOOP:6: B:118:0x0613->B:120:0x0619, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0627  */
    /* JADX WARN: Code duplicated, block: B:126:0x0637  */
    /* JADX WARN: Code duplicated, block: B:128:0x063a  */
    /* JADX WARN: Code duplicated, block: B:131:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:134:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:136:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:137:0x0748  */
    /* JADX WARN: Code duplicated, block: B:139:0x074c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0816  */
    /* JADX WARN: Code duplicated, block: B:146:0x0825  */
    /* JADX WARN: Code duplicated, block: B:147:0x0884  */
    /* JADX WARN: Code duplicated, block: B:149:0x0888  */
    /* JADX WARN: Code duplicated, block: B:150:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:152:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:153:0x092f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0933  */
    /* JADX WARN: Code duplicated, block: B:156:0x0988  */
    /* JADX WARN: Code duplicated, block: B:158:0x098c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:167:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:169:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:187:0x07b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0a23 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0a0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x063c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0137  */
    /* JADX WARN: Code duplicated, block: B:43:0x0156  */
    /* JADX WARN: Code duplicated, block: B:47:0x0163  */
    /* JADX WARN: Code duplicated, block: B:49:0x016f  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0259  */
    /* JADX WARN: Code duplicated, block: B:57:0x026d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0314  */
    /* JADX WARN: Code duplicated, block: B:61:0x031e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0346  */
    /* JADX WARN: Code duplicated, block: B:71:0x03da  */
    /* JADX WARN: Code duplicated, block: B:73:0x03de  */
    /* JADX WARN: Code duplicated, block: B:74:0x044a  */
    /* JADX WARN: Code duplicated, block: B:76:0x044e  */
    /* JADX WARN: Code duplicated, block: B:79:0x046c  */
    /* JADX WARN: Code duplicated, block: B:81:0x047c  */
    /* JADX WARN: Code duplicated, block: B:82:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0521  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0574  */
    /* JADX WARN: Code duplicated, block: B:98:0x057e  */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0ab7, code lost:
    
        if (r1.d1(r7, r9) == r10) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N0(app.chalo.home.ui.regularbus.RegularBusComponent r70, app.chalo.homescreen.data.model.app.RegularBusScreenConfigAppModel r71, kotlin.coroutines.jvm.internal.ContinuationImpl r72) {
        /*
            Method dump skipped, instruction units count: 2749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent.N0(app.chalo.home.ui.regularbus.RegularBusComponent, app.chalo.homescreen.data.model.app.RegularBusScreenConfigAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object O0(RegularBusComponent regularBusComponent, LatLng latLng, ContinuationImpl continuationImpl) {
        RegularBusComponent$shouldRaiseLocationRelatedEvent$1 regularBusComponent$shouldRaiseLocationRelatedEvent$1;
        LatLng latLng2;
        GeometryUtils geometryUtils;
        regularBusComponent.getClass();
        if (continuationImpl instanceof RegularBusComponent$shouldRaiseLocationRelatedEvent$1) {
            regularBusComponent$shouldRaiseLocationRelatedEvent$1 = (RegularBusComponent$shouldRaiseLocationRelatedEvent$1) continuationImpl;
            int i = regularBusComponent$shouldRaiseLocationRelatedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$shouldRaiseLocationRelatedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$shouldRaiseLocationRelatedEvent$1 = new RegularBusComponent$shouldRaiseLocationRelatedEvent$1(regularBusComponent, continuationImpl);
            }
        } else {
            regularBusComponent$shouldRaiseLocationRelatedEvent$1 = new RegularBusComponent$shouldRaiseLocationRelatedEvent$1(regularBusComponent, continuationImpl);
        }
        Object objA = regularBusComponent$shouldRaiseLocationRelatedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$shouldRaiseLocationRelatedEvent$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloLocationManager chaloLocationManager = regularBusComponent.A;
            regularBusComponent$shouldRaiseLocationRelatedEvent$1.L$0 = latLng;
            GeometryUtils geometryUtils2 = GeometryUtils.f10425a;
            regularBusComponent$shouldRaiseLocationRelatedEvent$1.L$1 = geometryUtils2;
            regularBusComponent$shouldRaiseLocationRelatedEvent$1.label = 1;
            objA = chaloLocationManager.a(regularBusComponent$shouldRaiseLocationRelatedEvent$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            latLng2 = latLng;
            geometryUtils = geometryUtils2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            geometryUtils = (GeometryUtils) regularBusComponent$shouldRaiseLocationRelatedEvent$1.L$1;
            latLng2 = (LatLng) regularBusComponent$shouldRaiseLocationRelatedEvent$1.L$0;
            ResultKt.b(objA);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
        if (locationAppModelA == null) {
            return Boolean.TRUE;
        }
        LatLng latLngA = locationAppModelA.a();
        if (latLng2 == null) {
            return Boolean.TRUE;
        }
        geometryUtils.getClass();
        if (GeometryUtils.b(latLngA, latLng2) <= 1000.0d && regularBusComponent.e0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r1.n(90, app.chalo.home.ui.base.CommonBottomSheetType.CityNotSupportedBottomSheet.b, r3) == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (r1.n(90, app.chalo.home.ui.base.CommonBottomSheetType.CityChangeBottomSheet.b, r3) == r4) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P0(app.chalo.home.ui.regularbus.RegularBusComponent r12, app.chalo.location.LatLng r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            app.chalo.home.analytics.HomeScreenAnalyticsHelper r0 = r12.F
            app.chalo.home.contract.HomeScreenInfoHelper r1 = r12.s
            app.chalo.providers.cityprovider.CityProvider r2 = r12.t
            boolean r3 = r14 instanceof app.chalo.home.ui.regularbus.RegularBusComponent$showCityChangeBottomSheetIfNeeded$1
            if (r3 == 0) goto L19
            r3 = r14
            app.chalo.home.ui.regularbus.RegularBusComponent$showCityChangeBottomSheetIfNeeded$1 r3 = (app.chalo.home.ui.regularbus.RegularBusComponent$showCityChangeBottomSheetIfNeeded$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            app.chalo.home.ui.regularbus.RegularBusComponent$showCityChangeBottomSheetIfNeeded$1 r3 = new app.chalo.home.ui.regularbus.RegularBusComponent$showCityChangeBottomSheetIfNeeded$1
            r3.<init>(r12, r14)
        L1e:
            java.lang.Object r14 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            kotlin.Unit r6 = kotlin.Unit.f17538a
            r7 = 0
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            if (r5 == 0) goto L53
            if (r5 == r11) goto L4a
            if (r5 == r10) goto L46
            if (r5 == r9) goto L42
            if (r5 != r8) goto L3a
            kotlin.ResultKt.b(r14)
            goto Lb5
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L42:
            kotlin.ResultKt.b(r14)
            goto La4
        L46:
            kotlin.ResultKt.b(r14)
            goto L93
        L4a:
            java.lang.Object r12 = r3.L$0
            r13 = r12
            app.chalo.location.LatLng r13 = (app.chalo.location.LatLng) r13
            kotlin.ResultKt.b(r14)
            goto L73
        L53:
            kotlin.ResultKt.b(r14)
            app.chalo.helper.ChaloAppFeatureHelper r12 = r12.X
            kotlinx.coroutines.flow.StateFlow r14 = r2.getE()
            java.lang.Object r14 = r14.getValue()
            app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel r14 = (app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) r14
            if (r14 == 0) goto L67
            java.lang.String r14 = r14.f8854a
            goto L68
        L67:
            r14 = r7
        L68:
            r3.L$0 = r13
            r3.label = r11
            java.lang.Object r14 = r12.o(r14, r3)
            if (r14 != r4) goto L73
            goto Lb4
        L73:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r12 = r14.booleanValue()
            if (r12 == 0) goto L7c
            goto Lc5
        L7c:
            boolean r12 = r2.getC()
            if (r12 != 0) goto Lc5
            boolean r12 = r2.f(r13)
            if (r12 != 0) goto Lc5
            r3.L$0 = r7
            r3.label = r10
            java.lang.Object r14 = r2.a(r13, r3)
            if (r14 != r4) goto L93
            goto Lb4
        L93:
            app.chalo.models.BasicCityInfoAppModel r14 = (app.chalo.models.BasicCityInfoAppModel) r14
            r12 = 90
            if (r14 != 0) goto Laa
            r3.label = r9
            app.chalo.home.ui.base.CommonBottomSheetType$CityNotSupportedBottomSheet r13 = app.chalo.home.ui.base.CommonBottomSheetType.CityNotSupportedBottomSheet.b
            java.lang.Object r12 = r1.n(r12, r13, r3)
            if (r12 != r4) goto La4
            goto Lb4
        La4:
            app.chalo.constants.Source r12 = app.chalo.constants.Source.REGULAR_BUS_SCREEN_TAB
            r0.l(r12)
            goto Lc2
        Laa:
            r3.label = r8
            app.chalo.home.ui.base.CommonBottomSheetType$CityChangeBottomSheet r13 = app.chalo.home.ui.base.CommonBottomSheetType.CityChangeBottomSheet.b
            java.lang.Object r12 = r1.n(r12, r13, r3)
            if (r12 != r4) goto Lb5
        Lb4:
            return r4
        Lb5:
            java.lang.String r12 = app.chalo.providers.cityprovider.CityProviderKt.b(r2)
            if (r12 != 0) goto Lbd
            java.lang.String r12 = ""
        Lbd:
            app.chalo.constants.Source r13 = app.chalo.constants.Source.REGULAR_BUS_SCREEN_TAB
            r0.p(r13, r12)
        Lc2:
            r2.e()
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent.P0(app.chalo.home.ui.regularbus.RegularBusComponent, app.chalo.location.LatLng, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:16:0x008e A[PHI: r1 r2 r6
      0x008e: PHI (r1v44 java.lang.Object) = (r1v40 java.lang.Object), (r1v1 java.lang.Object) binds: [B:70:0x01e5, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r2v25 app.chalo.data.SpannableTextData) = (r2v20 app.chalo.data.SpannableTextData), (r2v29 app.chalo.data.SpannableTextData) binds: [B:70:0x01e5, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r6v30 java.lang.String) = (r6v26 java.lang.String), (r6v33 java.lang.String) binds: [B:70:0x01e5, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0103 A[PHI: r1 r6
      0x0103: PHI (r1v14 java.lang.Object) = (r1v12 java.lang.Object), (r1v1 java.lang.Object) binds: [B:45:0x015d, B:24:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r6v7 java.lang.String) = (r6v4 java.lang.String), (r6v11 java.lang.String) binds: [B:45:0x015d, B:24:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0148 A[PHI: r1 r6
      0x0148: PHI (r1v9 java.lang.Object) = (r1v8 java.lang.Object), (r1v1 java.lang.Object) binds: [B:37:0x0144, B:26:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v6 java.lang.String) binds: [B:37:0x0144, B:26:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0173 A[PHI: r1 r6 r13
      0x0173: PHI (r1v17 java.lang.Object) = (r1v16 java.lang.Object), (r1v1 java.lang.Object) binds: [B:48:0x016f, B:23:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r6v12 java.lang.String) = (r6v9 java.lang.String), (r6v14 java.lang.String) binds: [B:48:0x016f, B:23:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:48:0x016f, B:23:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:60:0x0193 A[PHI: r1 r6
      0x0193: PHI (r1v34 java.lang.Object) = (r1v23 java.lang.Object), (r1v1 java.lang.Object) binds: [B:58:0x018f, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r6v24 java.lang.String) = (r6v12 java.lang.String), (r6v25 java.lang.String) binds: [B:58:0x018f, B:18:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x0202 A[PHI: r1 r2 r6 r8
      0x0202: PHI (r1v47 java.lang.Object) = (r1v46 java.lang.Object), (r1v1 java.lang.Object) binds: [B:73:0x01fe, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r2v30 java.lang.String) = (r2v27 java.lang.String), (r2v33 java.lang.String) binds: [B:73:0x01fe, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r6v34 app.chalo.data.SpannableTextData) = (r6v31 app.chalo.data.SpannableTextData), (r6v37 app.chalo.data.SpannableTextData) binds: [B:73:0x01fe, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r8v15 java.lang.String) = (r8v14 java.lang.String), (r8v17 java.lang.String) binds: [B:73:0x01fe, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x021c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x023d  */
    /* JADX WARN: Code duplicated, block: B:85:0x024b  */
    /* JADX WARN: Code duplicated, block: B:86:0x024e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0257  */
    /* JADX WARN: Code duplicated, block: B:91:0x0269 A[PHI: r1 r6
      0x0269: PHI (r1v24 java.lang.Object) = (r1v21 java.lang.Object), (r1v1 java.lang.Object) binds: [B:89:0x0266, B:22:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r6v15 java.lang.String) = (r6v12 java.lang.String), (r6v16 java.lang.String) binds: [B:89:0x0266, B:22:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x027e A[PHI: r1 r2 r6
      0x027e: PHI (r1v27 java.lang.Object) = (r1v26 java.lang.Object), (r1v1 java.lang.Object) binds: [B:92:0x027b, B:21:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r2v6 java.lang.String) = (r2v3 java.lang.String), (r2v9 java.lang.String) binds: [B:92:0x027b, B:21:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r6v17 java.lang.String) = (r6v15 java.lang.String), (r6v19 java.lang.String) binds: [B:92:0x027b, B:21:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0294  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b0, code lost:
    
        if (r1 == r5) goto L100;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q0(app.chalo.home.ui.regularbus.RegularBusComponent r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent.Q0(app.chalo.home.ui.regularbus.RegularBusComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object R0(RegularBusComponent regularBusComponent, LatLng latLng, ContinuationImpl continuationImpl) {
        RegularBusComponent$startGeoSpatialDataPolling$1 regularBusComponent$startGeoSpatialDataPolling$1;
        regularBusComponent.getClass();
        if (continuationImpl instanceof RegularBusComponent$startGeoSpatialDataPolling$1) {
            regularBusComponent$startGeoSpatialDataPolling$1 = (RegularBusComponent$startGeoSpatialDataPolling$1) continuationImpl;
            int i = regularBusComponent$startGeoSpatialDataPolling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$startGeoSpatialDataPolling$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$startGeoSpatialDataPolling$1 = new RegularBusComponent$startGeoSpatialDataPolling$1(regularBusComponent, continuationImpl);
            }
        } else {
            regularBusComponent$startGeoSpatialDataPolling$1 = new RegularBusComponent$startGeoSpatialDataPolling$1(regularBusComponent, continuationImpl);
        }
        Object objF1 = regularBusComponent$startGeoSpatialDataPolling$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$startGeoSpatialDataPolling$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objF1);
            CityProvider cityProvider = regularBusComponent.t;
            StateFlow stateFlowB = cityProvider.getE();
            if (latLng == null || !CityProviderKt.a(cityProvider, latLng)) {
                CityAppModel cityAppModel = (CityAppModel) stateFlowB.getValue();
                latLng = cityAppModel != null ? cityAppModel.d : null;
            }
            if (latLng != null) {
                regularBusComponent$startGeoSpatialDataPolling$1.L$0 = latLng;
                regularBusComponent$startGeoSpatialDataPolling$1.label = 1;
                objF1 = regularBusComponent.f1(latLng, regularBusComponent$startGeoSpatialDataPolling$1);
                if (objF1 != obj) {
                }
            }
        }
        if (i2 == 1) {
            latLng = (LatLng) regularBusComponent$startGeoSpatialDataPolling$1.L$0;
            ResultKt.b(objF1);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objF1);
                return unit;
            }
            latLng = (LatLng) regularBusComponent$startGeoSpatialDataPolling$1.L$0;
            ResultKt.b(objF1);
        }
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(FlowKt.z(GeoSpatialLiveBusesDataPollingManagerKt.a((Flow) objF1, latLng), regularBusComponent.k.getDefault()), new RegularBusComponent$startGeoSpatialDataPolling$2(regularBusComponent, null));
        RegularBusComponent$startGeoSpatialDataPolling$3 regularBusComponent$startGeoSpatialDataPolling$3 = new RegularBusComponent$startGeoSpatialDataPolling$3(regularBusComponent);
        regularBusComponent$startGeoSpatialDataPolling$1.L$0 = null;
        regularBusComponent$startGeoSpatialDataPolling$1.label = 3;
        return flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(regularBusComponent$startGeoSpatialDataPolling$3, regularBusComponent$startGeoSpatialDataPolling$1) == obj ? obj : unit;
        if (((Boolean) objF1).booleanValue()) {
            regularBusComponent.d0 = latLng;
            GeoSpatialLiveBusesDataPollingManager geoSpatialLiveBusesDataPollingManager = regularBusComponent.u;
            boolean z = regularBusComponent.b0;
            regularBusComponent$startGeoSpatialDataPolling$1.L$0 = latLng;
            regularBusComponent$startGeoSpatialDataPolling$1.label = 2;
            objF1 = geoSpatialLiveBusesDataPollingManager.b(latLng, z, regularBusComponent$startGeoSpatialDataPolling$1);
            if (objF1 != obj) {
                FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$2 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(FlowKt.z(GeoSpatialLiveBusesDataPollingManagerKt.a((Flow) objF1, latLng), regularBusComponent.k.getDefault()), new RegularBusComponent$startGeoSpatialDataPolling$2(regularBusComponent, null));
                RegularBusComponent$startGeoSpatialDataPolling$3 regularBusComponent$startGeoSpatialDataPolling$4 = new RegularBusComponent$startGeoSpatialDataPolling$3(regularBusComponent);
                regularBusComponent$startGeoSpatialDataPolling$1.L$0 = null;
                regularBusComponent$startGeoSpatialDataPolling$1.label = 3;
                if (flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$2.collect(regularBusComponent$startGeoSpatialDataPolling$4, regularBusComponent$startGeoSpatialDataPolling$1) == obj) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c7 -> B:25:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object S0(app.chalo.home.ui.regularbus.RegularBusComponent r22, app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel r23, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r24, app.chalo.location.LatLng r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent.S0(app.chalo.home.ui.regularbus.RegularBusComponent, app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode, app.chalo.location.LatLng, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void T0() {
        this.i0 = false;
        E0(new z01(28));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U0(String str, ContinuationImpl continuationImpl) {
        RegularBusComponent$handleScanAndPayClicked$1 regularBusComponent$handleScanAndPayClicked$1;
        KotlinToastManager kotlinToastManager;
        if (continuationImpl instanceof RegularBusComponent$handleScanAndPayClicked$1) {
            regularBusComponent$handleScanAndPayClicked$1 = (RegularBusComponent$handleScanAndPayClicked$1) continuationImpl;
            int i = regularBusComponent$handleScanAndPayClicked$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$handleScanAndPayClicked$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$handleScanAndPayClicked$1 = new RegularBusComponent$handleScanAndPayClicked$1(this, continuationImpl);
            }
        } else {
            regularBusComponent$handleScanAndPayClicked$1 = new RegularBusComponent$handleScanAndPayClicked$1(this, continuationImpl);
        }
        Object objB = regularBusComponent$handleScanAndPayClicked$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$handleScanAndPayClicked$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!((RegularBusViewState) this.f.getValue()).u) {
                if (this.j0) {
                    a1(str, "ignored_launch_in_flight");
                    return unit;
                }
                this.j0 = true;
                this.i0 = false;
                a1(str, "accepted");
                this.m0 = str;
                this.k0 = new TimeSource.Monotonic.ValueTimeMark(MonotonicTimeSource.b());
                this.l0 = null;
                Job job = this.h0;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                this.h0 = BuildersKt.d(this.j, null, null, new RegularBusComponent$handleScanAndPayClicked$2(this, null), 3);
                return unit;
            }
            a1(str, "ignored_operation_in_progress");
            KotlinToastManager kotlinToastManager2 = this.O;
            regularBusComponent$handleScanAndPayClicked$1.L$0 = kotlinToastManager2;
            regularBusComponent$handleScanAndPayClicked$1.label = 1;
            objB = this.o.b(StringEnum.PLEASE_TRY_AGAIN_AFTER_SOMETIME, new Object[0], regularBusComponent$handleScanAndPayClicked$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) regularBusComponent$handleScanAndPayClicked$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V0(JuspayOperationFailure juspayOperationFailure, Continuation continuation) {
        RegularBusComponent$handleScanAndPayFailure$1 regularBusComponent$handleScanAndPayFailure$1;
        String str;
        if (continuation instanceof RegularBusComponent$handleScanAndPayFailure$1) {
            regularBusComponent$handleScanAndPayFailure$1 = (RegularBusComponent$handleScanAndPayFailure$1) continuation;
            int i = regularBusComponent$handleScanAndPayFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$handleScanAndPayFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$handleScanAndPayFailure$1 = new RegularBusComponent$handleScanAndPayFailure$1(this, continuation);
            }
        } else {
            regularBusComponent$handleScanAndPayFailure$1 = new RegularBusComponent$handleScanAndPayFailure$1(this, continuation);
        }
        Object objB = regularBusComponent$handleScanAndPayFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$handleScanAndPayFailure$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (juspayOperationFailure instanceof JuspayOperationFailure.SdkNotReady) {
                str = "failed_sdk_not_ready";
            } else if (juspayOperationFailure instanceof JuspayOperationFailure.Error) {
                str = "failed_error";
            } else if (Intrinsics.d(juspayOperationFailure, JuspayOperationFailure.SessionExpired.f4055a)) {
                str = "failed_session_expired";
            } else if (Intrinsics.d(juspayOperationFailure, JuspayOperationFailure.ResultUnavailable.f4052a)) {
                str = "failed_result_unavailable";
            } else {
                if (!Intrinsics.d(juspayOperationFailure, JuspayOperationFailure.SdkUnavailable.f4054a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "failed_sdk_unavailable";
            }
            b1(str, new t01(10, juspayOperationFailure, this));
            T0();
            JuspayOperationFailure.Error error = juspayOperationFailure instanceof JuspayOperationFailure.Error ? (JuspayOperationFailure.Error) juspayOperationFailure : null;
            if (error == null || (str = error.f4051a) == null) {
                regularBusComponent$handleScanAndPayFailure$1.label = 1;
                objB = this.o.b(StringEnum.GENERIC_ERROR_MESSAGE, new Object[0], regularBusComponent$handleScanAndPayFailure$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            KotlinToastManagerKt.a(this.O, str, ToastLength.LONG);
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        String str2 = (String) objB;
        KotlinToastManagerKt.a(this.O, str2, ToastLength.LONG);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W0(Continuation continuation) {
        RegularBusComponent$handleScanAndPayRejected$1 regularBusComponent$handleScanAndPayRejected$1;
        KotlinToastManager kotlinToastManager;
        if (continuation instanceof RegularBusComponent$handleScanAndPayRejected$1) {
            regularBusComponent$handleScanAndPayRejected$1 = (RegularBusComponent$handleScanAndPayRejected$1) continuation;
            int i = regularBusComponent$handleScanAndPayRejected$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$handleScanAndPayRejected$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$handleScanAndPayRejected$1 = new RegularBusComponent$handleScanAndPayRejected$1(this, continuation);
            }
        } else {
            regularBusComponent$handleScanAndPayRejected$1 = new RegularBusComponent$handleScanAndPayRejected$1(this, continuation);
        }
        Object objB = regularBusComponent$handleScanAndPayRejected$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$handleScanAndPayRejected$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            b1("rejected", new g11(2));
            KotlinToastManager kotlinToastManager2 = this.O;
            regularBusComponent$handleScanAndPayRejected$1.L$0 = kotlinToastManager2;
            regularBusComponent$handleScanAndPayRejected$1.label = 1;
            objB = this.o.b(StringEnum.PLEASE_TRY_AGAIN_AFTER_SOMETIME, new Object[0], regularBusComponent$handleScanAndPayRejected$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) regularBusComponent$handleScanAndPayRejected$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    public final Object X0(JuspayController juspayController, boolean z, ContinuationImpl continuationImpl) {
        this.l0 = new TimeSource.Monotonic.ValueTimeMark(MonotonicTimeSource.b());
        Source source = Source.REGULAR_BUS_SCREEN_TAB;
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.F, "regular bus scan and pay launched", e1(new va(z, 14)), source, 12);
        Object objCollect = ((ChannelFlow) juspayController.f(source.getSourceName())).collect(new FlowCollector() { // from class: app.chalo.home.ui.regularbus.RegularBusComponent$launchScanAndPay$3
            /* JADX WARN: Code duplicated, block: B:58:0x00f7 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:59:0x00f8 A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                String str;
                Object objV0;
                JuspayOperationUpdate juspayOperationUpdate = (JuspayOperationUpdate) obj;
                boolean zA = juspayOperationUpdate.a();
                RegularBusComponent regularBusComponent = this.f3622a;
                if (!zA) {
                    HomeScreenAnalyticsHelper.DefaultImpls.a(regularBusComponent.F, "regular bus scan and pay sdk update", regularBusComponent.e1(new a80(regularBusComponent, juspayOperationUpdate)), Source.REGULAR_BUS_SCREEN_TAB, 12);
                }
                boolean zEquals = juspayOperationUpdate.equals(JuspayOperationUpdate.Started.f4065a);
                Unit unit = Unit.f17538a;
                if (!zEquals) {
                    if (juspayOperationUpdate.equals(JuspayOperationUpdate.Rejected.f4064a)) {
                        objV0 = regularBusComponent.W0(continuation);
                        if (objV0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Loading) {
                        if (!((JuspayOperationUpdate.Loading) juspayOperationUpdate).f4063a) {
                            regularBusComponent.i0 = true;
                        }
                        regularBusComponent.E0(new a80(juspayOperationUpdate, 4));
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Failed) {
                        objV0 = regularBusComponent.V0(((JuspayOperationUpdate.Failed) juspayOperationUpdate).f4062a, continuation);
                        if (objV0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Completed) {
                        JuspayOperationResult juspayOperationResult = ((JuspayOperationUpdate.Completed) juspayOperationUpdate).f4061a;
                        boolean z2 = juspayOperationResult instanceof JuspayOperationResult.UpiUiScanPay;
                        if (z2) {
                            str = "completed_upi_scan_pay";
                        } else if (juspayOperationResult instanceof JuspayOperationResult.Onboarding) {
                            str = "completed_onboarding";
                        } else if (juspayOperationResult instanceof JuspayOperationResult.Management) {
                            str = "completed_management";
                        } else {
                            if (!(juspayOperationResult instanceof JuspayOperationResult.Error)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "completed_error";
                        }
                        regularBusComponent.b1(str, new vw0(juspayOperationResult, 21));
                        regularBusComponent.T0();
                        if (!z2 && !(juspayOperationResult instanceof JuspayOperationResult.Onboarding) && !(juspayOperationResult instanceof JuspayOperationResult.Management)) {
                            if (!(juspayOperationResult instanceof JuspayOperationResult.Error)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            JusPayErrorResultAppModel jusPayErrorResultAppModel = ((JuspayOperationResult.Error) juspayOperationResult).f4056a;
                            KotlinToastManagerKt.a(regularBusComponent.O, jusPayErrorResultAppModel.e + " (" + jusPayErrorResultAppModel.f.f4044a + ")", ToastLength.LONG);
                        }
                    } else {
                        if (!juspayOperationUpdate.equals(JuspayOperationUpdate.Abandoned.f4060a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        regularBusComponent.T0();
                    }
                    if (objV0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objV0;
                    }
                    return unit;
                }
                regularBusComponent.E0(new g11(4));
                objV0 = unit;
                if (objV0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objV0;
                }
                return unit;
            }
        }, continuationImpl);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }

    public final void Y0(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel) {
        String str = nearbyStopAndTripsUiModel.b;
        String sourceName = Source.NEARBY_STOPS.getSourceName();
        double d = nearbyStopAndTripsUiModel.f;
        Source source = Source.REGULAR_BUS_SCREEN_TAB;
        this.M.b(new ChaloNavigationRequest.Navigate(new StopTripDetailsArgs(str, nearbyStopAndTripsUiModel.c, nearbyStopAndTripsUiModel.d, nearbyStopAndTripsUiModel.e, source, Double.valueOf(d), null, null, sourceName), null, null, 6));
    }

    public final void Z0(RegularBusViewIntent intent) {
        String strA;
        String strA2;
        String strA3;
        String strA4;
        Job job;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof RegularBusViewIntent.RegularBusScreenInitializationIntent;
        int i = 2;
        ContextScope contextScope = this.j;
        if (z) {
            RegularBusViewIntent.RegularBusScreenInitializationIntent regularBusScreenInitializationIntent = (RegularBusViewIntent.RegularBusScreenInitializationIntent) intent;
            if (this.c0) {
                this.c0 = false;
                BuildersKt.d(contextScope, this.k.getDefault(), null, new RegularBusComponent$handleRegularBusScreenInitializationIntent$1(this, regularBusScreenInitializationIntent, null), 2);
                return;
            }
            return;
        }
        boolean zEquals = intent.equals(RegularBusViewIntent.RegularBusScreenViewStartedIntent.f3651a);
        VisibleJobTracker visibleJobTracker = this.p0;
        if (zEquals) {
            visibleJobTracker.a();
            visibleJobTracker.b(w0(new RegularBusComponent$resetNearbyTripCard$1(this, null, false)));
            visibleJobTracker.b(w0(new RegularBusComponent$startRequiredCollections$1(this, null)));
            visibleJobTracker.b(w0(new RegularBusComponent$startRequiredCollections$2(this, null)));
            visibleJobTracker.b(w0(new RegularBusComponent$startRequiredCollections$3(this, null)));
            visibleJobTracker.b(w0(new RegularBusComponent$startRequiredCollections$4(this, null)));
            w0(new RegularBusComponent$handleRegularBusScreenViewStartedIntent$1(this, null));
            return;
        }
        if (intent.equals(RegularBusViewIntent.RegularBusScreenViewStoppedIntent.f3652a)) {
            visibleJobTracker.a();
            Job job2 = this.g0;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            this.g0 = null;
            if (this.i0 || (job = this.h0) == null || !((AbstractCoroutine) job).isActive()) {
                return;
            }
            Job job3 = this.h0;
            if (job3 != null) {
                ((JobSupport) job3).cancel(null);
            }
            this.h0 = null;
            this.j0 = false;
            T0();
            return;
        }
        if (intent instanceof RegularBusViewIntent.ChaloSearchBarClickedIntent) {
            BuildersKt.d(contextScope, null, null, new RegularBusComponent$handelChaloSearchBarClickedIntent$1(this, (RegularBusViewIntent.ChaloSearchBarClickedIntent) intent, null), 3);
            return;
        }
        if (intent instanceof RegularBusViewIntent.RegularBusPageItemClickedIntent) {
            BuildersKt.d(contextScope, null, null, new RegularBusComponent$handleRegularBusPageItemClickedIntent$1((RegularBusViewIntent.RegularBusPageItemClickedIntent) intent, this, null), 3);
            return;
        }
        boolean z2 = intent instanceof RegularBusViewIntent.RouteClickedIntent;
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.F;
        ChaloNavigationManager chaloNavigationManager = this.M;
        if (z2) {
            RegularBusViewIntent.RouteClickedIntent routeClickedIntent = (RegularBusViewIntent.RouteClickedIntent) intent;
            String str = routeClickedIntent.b;
            Source source = Source.REGULAR_BUS_SCREEN_TAB;
            Pair pair = new Pair("stopId", str);
            StopTripDetailsUiModel stopTripDetailsUiModel = routeClickedIntent.f3653a;
            String str2 = stopTripDetailsUiModel.d;
            String str3 = stopTripDetailsUiModel.c;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "nearby stops card route clicked", MapsKt.i(pair, new Pair("routeName", str2), new Pair("routeId", str3), new Pair("toName", stopTripDetailsUiModel.g)), source, 12);
            RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(str3, str, Source.NEARBY_STOP_TRIP_CARD.getSourceName(), 230);
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA4 = json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
            } catch (Exception unused) {
                strA4 = null;
            }
            if (strA4 != null) {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA4), null, "RouteDetailsTag", 2));
                return;
            }
            return;
        }
        if (intent instanceof RegularBusViewIntent.SeeAllStopsClickedIntent) {
            Source source2 = Source.REGULAR_BUS_SCREEN_TAB;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "nearby stops more clicked", null, source2, 10);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new NearbyStopsMapArgs(source2, ChaloTransitMode.BUS), null, null, 6));
            return;
        }
        if (intent instanceof RegularBusViewIntent.StopClickedIntent) {
            NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = ((RegularBusViewIntent.StopClickedIntent) intent).f3661a;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "nearby stops card stop name header clicked", MapsKt.i(new Pair("stopId", nearbyStopAndTripsUiModel.b), new Pair("stopName", nearbyStopAndTripsUiModel.c)), Source.REGULAR_BUS_SCREEN_TAB, 12);
            Y0(nearbyStopAndTripsUiModel);
            return;
        }
        if (intent instanceof RegularBusViewIntent.SeeAllBusesClickedIntent) {
            NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel2 = ((RegularBusViewIntent.SeeAllBusesClickedIntent) intent).f3657a;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "nearby stops card more trips clicked", MapsKt.i(new Pair("stopId", nearbyStopAndTripsUiModel2.b), new Pair("stopName", nearbyStopAndTripsUiModel2.c)), Source.REGULAR_BUS_SCREEN_TAB, 12);
            Y0(nearbyStopAndTripsUiModel2);
            return;
        }
        if (intent.equals(RegularBusViewIntent.MapClickedIntent.f3644a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "regular bus page map thumbnail clicked", null, Source.REGULAR_BUS_SCREEN_TAB, 14);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(BusesAroundYouArgs.INSTANCE, null, null, 6));
            return;
        }
        if (intent instanceof RegularBusViewIntent.GpsRequestCallbackReceivedEventIntent) {
            throw null;
        }
        if (intent instanceof RegularBusViewIntent.RecentSearchItemClicked) {
            RegularBusViewIntent.RecentSearchItemClicked recentSearchItemClicked = (RegularBusViewIntent.RecentSearchItemClicked) intent;
            Source source3 = Source.REGULAR_BUS_SCREEN_TAB;
            homeScreenAnalyticsHelper.i(recentSearchItemClicked.b, source3);
            RecentsType recentsType = recentSearchItemClicked.f3648a;
            if (recentsType instanceof RecentRouteAppModel) {
                RouteDetailsIntentModel routeDetailsIntentModel2 = new RouteDetailsIntentModel(((RecentRouteAppModel) recentsType).e, null, "regularBusTabRecentSearchCard", 174);
                try {
                    Json json2 = ChaloJson.b;
                    json2.getClass();
                    strA3 = json2.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel2);
                } catch (Exception unused2) {
                    strA3 = null;
                }
                if (strA3 != null) {
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA3), null, "RouteDetailsTag", 2));
                    return;
                }
                return;
            }
            if (recentsType instanceof RecentStopBasedTripAppModel) {
                BuildersKt.d(contextScope, null, null, new RegularBusComponent$handleStopBasedTripAppModelRecentItemNavigation$1(this, (RecentStopBasedTripAppModel) recentsType, null), 3);
                return;
            }
            if (!(recentsType instanceof RecentTripAppModel)) {
                if ((recentsType instanceof RecentStopAppModel) || (recentsType instanceof RecentPlaceAppModel)) {
                    return;
                }
                if (!(recentsType instanceof RecentLocationPairAppModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecentLocationPairAppModel recentLocationPairAppModel = (RecentLocationPairAppModel) recentsType;
                StopTripPlannerResultScreenData stopTripPlannerResultScreenData = new StopTripPlannerResultScreenData(StopTripPlannerResultsContractKt.b(recentLocationPairAppModel.g), StopTripPlannerResultsContractKt.b(recentLocationPairAppModel.h), source3);
                Json json3 = ChaloJson.b;
                json3.getClass();
                ChaloNavigationManagerKt.e(chaloNavigationManager, new TripPlannerArgs.StopFocusedResultsScreen(json3.a(StopTripPlannerResultScreenData.INSTANCE.serializer(), stopTripPlannerResultScreenData)), null, 6);
                return;
            }
            ChaloJson chaloJson = ChaloJson.f6455a;
            RecentTripAppModel recentTripAppModel = (RecentTripAppModel) recentsType;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = recentTripAppModel.g;
            try {
                Json json4 = ChaloJson.b;
                json4.getClass();
                strA = json4.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), universalSearchDescriptiveLocationAppModel);
            } catch (Exception unused3) {
                strA = null;
            }
            ChaloJson chaloJson2 = ChaloJson.f6455a;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2 = recentTripAppModel.h;
            try {
                Json json5 = ChaloJson.b;
                json5.getClass();
                strA2 = json5.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), universalSearchDescriptiveLocationAppModel2);
            } catch (Exception unused4) {
                strA2 = null;
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(strA, strA2), null, null, 6));
            return;
        }
        if (intent.equals(RegularBusViewIntent.SeeAllPassesClickedIntent.f3658a)) {
            Source source4 = Source.REGULAR_BUS_SCREEN_TAB;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "see all passes clicked", null, source4, 14);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(null, null, null, source4, false, null, 151), null, null, 6));
            return;
        }
        if (intent.equals(RegularBusViewIntent.LocationItemClickedIntent.f3641a)) {
            Source source5 = Source.REGULAR_BUS_SCREEN_TAB;
            String strB = CityProviderKt.b(this.t);
            if (strB == null) {
                strB = "";
            }
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "city change card clicked", vo1.s("currentCity", strB), source5, 12);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, source5, null, 6), null, null, 6));
            return;
        }
        if (intent.equals(RegularBusViewIntent.SosClickedIntent.f3660a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "sos header clicked", null, Source.REGULAR_BUS_SCREEN_TAB, 14);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SosArgs(), null, null, 6));
            return;
        }
        if (intent instanceof RegularBusViewIntent.LocationTurnOnButtonClickedIntent) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "location tooltip turn on clicked", null, Source.REGULAR_BUS_SCREEN_TAB, 14);
            BuildersKt.d(contextScope, null, null, new RegularBusComponent$handleLocationTurnOnButtonClickedIntent$1((RegularBusViewIntent.LocationTurnOnButtonClickedIntent) intent, this, null), 3);
            return;
        }
        boolean zEquals2 = intent.equals(RegularBusViewIntent.ProfileIconClickedIntent.f3647a);
        HomeScreenInfoHelper homeScreenInfoHelper = this.s;
        if (zEquals2) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "profile icon clicked", null, Source.REGULAR_BUS_SCREEN_TAB, 14);
            homeScreenInfoHelper.d(false);
            homeScreenInfoHelper.r();
            return;
        }
        if (intent.equals(RegularBusViewIntent.SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent.f3655a)) {
            BuildersKt.d(contextScope, null, null, new RegularBusComponent$handleSeatOccupancyInfoBottomSheetNegativeCtaClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(RegularBusViewIntent.SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent.f3656a)) {
            BuildersKt.d(contextScope, null, null, new RegularBusComponent$handleSeatOccupancyInfoBottomSheetPositiveCtaClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(RegularBusViewIntent.BottomSheetDismissIntent.f3638a)) {
            BuildersKt.d(contextScope, null, null, new RegularBusComponent$handleSeatOccupancyInfoBottomSheetDismissIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(RegularBusViewIntent.ScanAndPayBackPressedIntent.f3654a)) {
            JuspayController juspayControllerD = this.Z.d();
            if (juspayControllerD == null || !juspayControllerD.onBackPressed()) {
                b1("back_pressed", new g11(i));
                Job job4 = this.h0;
                if (job4 != null) {
                    ((JobSupport) job4).cancel(null);
                }
                T0();
                return;
            }
            return;
        }
        if (intent.equals(RegularBusViewIntent.LocationTooltipCancelButtonClickedIntent.f3642a)) {
            homeScreenInfoHelper.getClass();
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "location tooltip cancel clicked", null, Source.REGULAR_BUS_SCREEN_TAB, 14);
            E0(new g11(3));
            return;
        }
        if (intent instanceof RegularBusViewIntent.UpdatedRetainedStateIntent) {
            this.N.b(((RegularBusViewIntent.UpdatedRetainedStateIntent) intent).f3662a);
            return;
        }
        boolean z3 = intent instanceof RegularBusViewIntent.PermissionRationaleDialogInteraction;
        SystemHelper systemHelper = this.R;
        if (z3) {
            E0(new z01(29));
            if (!((RegularBusViewIntent.PermissionRationaleDialogInteraction) intent).f3646a) {
                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "access location event", vo1.s("locationAccessAction", "closeDialogToEnableLocationFromSetting"), Source.REGULAR_BUS_SCREEN_TAB, 12);
                return;
            } else {
                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "access location event", vo1.s("locationAccessAction", "clickSettingOptionForLocation"), Source.REGULAR_BUS_SCREEN_TAB, 12);
                systemHelper.b();
                return;
            }
        }
        if (!(intent instanceof RegularBusViewIntent.JuspayPermissionRationaleDialogInteraction)) {
            if (!(intent instanceof RegularBusViewIntent.OnCrashLoggingRequired)) {
                throw new NoWhenBranchMatchedException();
            }
            this.E.g(((RegularBusViewIntent.OnCrashLoggingRequired) intent).f3645a);
        } else {
            RegularBusViewIntent.JuspayPermissionRationaleDialogInteraction juspayPermissionRationaleDialogInteraction = (RegularBusViewIntent.JuspayPermissionRationaleDialogInteraction) intent;
            E0(new g11(0));
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "regular bus scan and pay rationale action", e1(new vw0(juspayPermissionRationaleDialogInteraction, 20)), Source.REGULAR_BUS_SCREEN_TAB, 12);
            if (juspayPermissionRationaleDialogInteraction.f3640a) {
                systemHelper.b();
            }
        }
    }

    public final void a1(String str, String str2) {
        Source source = Source.REGULAR_BUS_SCREEN_TAB;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("scanAndPayOutcome", str2);
        mapBuilder.put("controllerAvailable", Boolean.valueOf(this.Z.e()));
        mapBuilder.put("sdkTookOver", Boolean.valueOf(this.i0));
        if (str != null) {
            mapBuilder.put("sectionId", str);
        }
        TimeSource.Monotonic.ValueTimeMark valueTimeMark = this.k0;
        if (valueTimeMark != null) {
            mapBuilder.put("msSinceClick", Long.valueOf(Duration.e(TimeSource.Monotonic.ValueTimeMark.b(valueTimeMark.f17701a))));
        }
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.F, "regular bus scan and pay clicked", mapBuilder.h(), source, 12);
    }

    public final void b1(String str, Function1 function1) {
        if (this.k0 == null) {
            return;
        }
        Source source = Source.REGULAR_BUS_SCREEN_TAB;
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.F, "regular bus scan and pay ended", e1(new h11(str, function1)), source, 12);
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
    }

    public final void c1(List list) {
        Job job = this.g0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.g0 = BuildersKt.d(this.j, null, null, new RegularBusComponent$requestLocationPermission$1(this, list, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (app.chalo.permissions.models.PermissionStateKt.a(r8) == true) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d1(boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.home.ui.regularbus.RegularBusComponent$requestLocationPermissionProactivelyIfRequired$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.home.ui.regularbus.RegularBusComponent$requestLocationPermissionProactivelyIfRequired$1 r0 = (app.chalo.home.ui.regularbus.RegularBusComponent$requestLocationPermissionProactivelyIfRequired$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.ui.regularbus.RegularBusComponent$requestLocationPermissionProactivelyIfRequired$1 r0 = new app.chalo.home.ui.regularbus.RegularBusComponent$requestLocationPermissionProactivelyIfRequired$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            kotlin.Unit r5 = kotlin.Unit.f17538a
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.b(r8)
            goto L4e
        L38:
            kotlin.ResultKt.b(r8)
            if (r7 != 0) goto L3e
            goto L74
        L3e:
            boolean r7 = r6.f0
            if (r7 == 0) goto L43
            goto L74
        L43:
            r0.label = r4
            app.chalo.helper.ChaloAppFeatureHelper r7 = r6.X
            java.lang.Object r8 = r7.q(r0)
            if (r8 != r1) goto L4e
            goto L69
        L4e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L57
            goto L74
        L57:
            app.chalo.permissions.handler.PermissionHandlerProvider r7 = r6.J
            app.chalo.permissions.handler.PermissionHandler r7 = r7.c()
            if (r7 == 0) goto L75
            app.chalo.permissions.models.AppPermission r8 = app.chalo.permissions.models.AppPermission.COARSE_LOCATION
            r0.label = r3
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            app.chalo.permissions.models.PermissionState r8 = (app.chalo.permissions.models.PermissionState) r8
            if (r8 == 0) goto L75
            boolean r7 = app.chalo.permissions.models.PermissionStateKt.a(r8)
            if (r7 != r4) goto L75
        L74:
            return r5
        L75:
            r6.f0 = r4
            app.chalo.permissions.models.AppPermission[] r7 = new app.chalo.permissions.models.AppPermission[r3]
            app.chalo.permissions.models.AppPermission r8 = app.chalo.permissions.models.AppPermission.COARSE_LOCATION
            r0 = 0
            r7[r0] = r8
            app.chalo.permissions.models.AppPermission r8 = app.chalo.permissions.models.AppPermission.FINE_LOCATION
            r7[r4] = r8
            java.util.List r7 = kotlin.collections.CollectionsKt.S(r7)
            r6.c1(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent.d1(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final MapBuilder e1(Function1 function1) {
        MapBuilder mapBuilder = new MapBuilder();
        String str = this.m0;
        if (str != null) {
            mapBuilder.put("sectionId", str);
        }
        TimeSource.Monotonic.ValueTimeMark valueTimeMark = this.k0;
        if (valueTimeMark != null) {
            mapBuilder.put("msSinceClick", Long.valueOf(Duration.e(TimeSource.Monotonic.ValueTimeMark.b(valueTimeMark.f17701a))));
        }
        TimeSource.Monotonic.ValueTimeMark valueTimeMark2 = this.l0;
        if (valueTimeMark2 != null) {
            mapBuilder.put("msSinceLaunch", Long.valueOf(Duration.e(TimeSource.Monotonic.ValueTimeMark.b(valueTimeMark2.f17701a))));
        }
        mapBuilder.put("sdkTookOver", Boolean.valueOf(this.i0));
        function1.invoke(mapBuilder);
        return mapBuilder.h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f1(LatLng latLng, ContinuationImpl continuationImpl) {
        RegularBusComponent$shouldStartGeoSpatialPolling$1 regularBusComponent$shouldStartGeoSpatialPolling$1;
        if (continuationImpl instanceof RegularBusComponent$shouldStartGeoSpatialPolling$1) {
            regularBusComponent$shouldStartGeoSpatialPolling$1 = (RegularBusComponent$shouldStartGeoSpatialPolling$1) continuationImpl;
            int i = regularBusComponent$shouldStartGeoSpatialPolling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$shouldStartGeoSpatialPolling$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$shouldStartGeoSpatialPolling$1 = new RegularBusComponent$shouldStartGeoSpatialPolling$1(this, continuationImpl);
            }
        } else {
            regularBusComponent$shouldStartGeoSpatialPolling$1 = new RegularBusComponent$shouldStartGeoSpatialPolling$1(this, continuationImpl);
        }
        Object objA = regularBusComponent$shouldStartGeoSpatialPolling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$shouldStartGeoSpatialPolling$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            regularBusComponent$shouldStartGeoSpatialPolling$1.L$0 = latLng;
            regularBusComponent$shouldStartGeoSpatialPolling$1.label = 1;
            objA = this.C.a(regularBusComponent$shouldStartGeoSpatialPolling$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            latLng = (LatLng) regularBusComponent$shouldStartGeoSpatialPolling$1.L$0;
            ResultKt.b(objA);
        }
        GeoQueryCityConfigModel geoQueryCityConfigModel = (GeoQueryCityConfigModel) objA;
        LatLng latLng2 = this.d0;
        if (latLng2 != null && GeometryUtils.b(latLng2, latLng) <= geoQueryCityConfigModel.c) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final List g1(List list) {
        ImageResourceSectionAppModel imageResourceSectionAppModel;
        RegularBusComponent regularBusComponent = this;
        if (regularBusComponent.Z.e()) {
            return list;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) it.next();
            ImageResourceSectionAppModel imageResourceSectionAppModelA = regularBusPageDisplayItemData.q;
            List listG1 = null;
            if (imageResourceSectionAppModelA != null) {
                if (imageResourceSectionAppModelA.f == ImageResourceCtaType.SCAN_AND_PAY) {
                    imageResourceSectionAppModelA = ImageResourceSectionAppModel.a(imageResourceSectionAppModelA);
                }
                imageResourceSectionAppModel = imageResourceSectionAppModelA;
            } else {
                imageResourceSectionAppModel = null;
            }
            List list3 = regularBusPageDisplayItemData.e;
            if (list3 != null) {
                listG1 = regularBusComponent.g1(list3);
            }
            List list4 = listG1;
            boolean z = regularBusPageDisplayItemData.f3632a;
            String str = regularBusPageDisplayItemData.b;
            TextFormatAppModel textFormatAppModel = regularBusPageDisplayItemData.c;
            String str2 = regularBusPageDisplayItemData.d;
            IconType iconType = regularBusPageDisplayItemData.f;
            RegularBusPageFeature regularBusPageFeature = regularBusPageDisplayItemData.g;
            RegularBusPageSectionDisplayType displayType = regularBusPageDisplayItemData.h;
            String str3 = regularBusPageDisplayItemData.i;
            String str4 = regularBusPageDisplayItemData.j;
            ChaloCtaDisplayType sectionCtaDisplayType = regularBusPageDisplayItemData.k;
            List faqList = regularBusPageDisplayItemData.l;
            String str5 = regularBusPageDisplayItemData.m;
            List productList = regularBusPageDisplayItemData.n;
            Iterator it2 = it;
            String str6 = regularBusPageDisplayItemData.o;
            IconType iconType2 = regularBusPageDisplayItemData.p;
            Integer num = regularBusPageDisplayItemData.r;
            String str7 = regularBusPageDisplayItemData.s;
            UnifiedAdSlot unifiedAdSlot = regularBusPageDisplayItemData.t;
            boolean z2 = regularBusPageDisplayItemData.u;
            Intrinsics.i(displayType, "displayType");
            Intrinsics.i(sectionCtaDisplayType, "sectionCtaDisplayType");
            Intrinsics.i(faqList, "faqList");
            Intrinsics.i(productList, "productList");
            Intrinsics.i(unifiedAdSlot, "unifiedAdSlot");
            arrayList.add(new RegularBusPageDisplayItemData(z, str, textFormatAppModel, str2, list4, iconType, regularBusPageFeature, displayType, str3, str4, sectionCtaDisplayType, faqList, str5, productList, str6, iconType2, imageResourceSectionAppModel, num, str7, unifiedAdSlot, z2));
            regularBusComponent = this;
            it = it2;
        }
        return arrayList;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (RegularBusViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new RegularBusViewState(false, null, emptyList, null, true, new NearbyBusesMapData(), emptyList, new TabMetaDataAppModel(), null, null, null, null, null, null, null, null, null, false, false, false, false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        Job job = this.n0;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.p0.a();
    }
}
