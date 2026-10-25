package app.chalo.home.ui.home;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.MetroBookingFlowType;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.domain.GetHomePageItemsUseCase;
import app.chalo.home.extensions.UserProfileDetailsProviderExtKt;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.home.ui.HomeTabScreensRetainedState;
import app.chalo.home.ui.base.HomeTabVisibilityController;
import app.chalo.home.ui.common.VisibleJobTracker;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.homescreen.data.model.app.HomeScreenAppModel;
import app.chalo.homescreen.data.model.app.ImageResourceCtaType;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.juspay.JusPayErrorResultAppModel;
import app.chalo.juspay.JuspayController;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.juspay.JuspayOperationFailure;
import app.chalo.juspay.JuspayOperationResult;
import app.chalo.juspay.JuspayOperationUpdate;
import app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase;
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
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.domain.GetLatestPremiumReserveTicketFromFirstBookingIdUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.GetPremiumReserveTicketsWithPendingAckUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.PremiumBusInAppCommunicationBottomSheetDataUseCase;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.tito.domain.CheckIsUnifiedTitoFlowEnabledUseCase;
import app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase;
import app.chalo.titoridedetail.manager.TitoRideDataManager;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.IsLocationMandatoryForUserUseCase;
import app.chalo.usecase.MillisAfterTimeFormatType;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.a80;
import defpackage.b80;
import defpackage.u60;
import defpackage.vo1;
import defpackage.xg;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewState;", "Lapp/chalo/home/ui/home/HomeScreenDataState;", "Lapp/chalo/home/ui/home/HomeScreenSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenComponent extends ChaloBaseStateMviComponent<HomeScreenViewIntent, HomeScreenViewState, HomeScreenViewState, HomeScreenSideEffect> {
    public final HomeScreenInfoHelper A;
    public final ChaloLocationManager B;
    public final HomeScreenAnalyticsHelper C;
    public final TitoRideDataManager D;
    public final CheckIsUnifiedTitoFlowEnabledUseCase E;
    public final GetActiveTitoTripsAndUpdateRestUseCase F;
    public final ChaloNavigationManager G;
    public final PermissionHandlerProvider H;
    public final HomeTabScreensNavigationAndStateManager I;
    public final LocationPermissionCallbackHandler J;
    public final ProductBookingHelper K;
    public final GetClusterConfigForCityUseCase L;
    public final BottomNavTabType M;
    public final SystemHelper N;
    public final GpsRequestHandlerProvider O;
    public final CrashlyticsLogger P;
    public final ChaloAppFeatureHelper Q;
    public final KotlinToastManager R;
    public final ArePermissionsGrantedUseCase S;
    public final JuspayControllerProvider T;
    public boolean U;
    public boolean V;
    public Job W;
    public Job X;
    public Job Y;
    public Job Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public boolean e0;
    public final VisibleJobTracker f0;
    public boolean g0;
    public final Flow h0;
    public final MutableStateFlow i0;
    public final StateFlow j0;
    public final UrlOpenHelper k;
    public final CityProvider l;
    public final StringProvider m;
    public final GetHomePageItemsUseCase n;
    public final GetTripPlannerConfigForCityUseCase o;
    public final BasicInfoContract p;
    public final PremiumReserveTicketPostBookingActionHandler q;
    public final TimeUtilsContract r;
    public final GetLatestPremiumReserveTicketFromFirstBookingIdUseCase s;
    public final PremiumBusInAppCommunicationBottomSheetDataUseCase t;
    public final GetActivePremiumReserveTicketBetweenGivenTimeUseCase u;
    public final GetPremiumReserveTicketsWithPendingAckUseCase v;
    public final GetTimeInMillisAfterXTimeUseCase w;
    public final AcknowledgePremiumReserveTicketCancellationUseCase x;
    public final UserProfileDetailsProvider y;
    public final IsLocationMandatoryForUserUseCase z;

    /* JADX INFO: renamed from: app.chalo.home.ui.home.HomeScreenComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$1", f = "HomeScreenComponent.kt", l = {183}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeScreenComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow state = HomeScreenComponent.this.I.getState();
                final HomeScreenComponent homeScreenComponent = HomeScreenComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.home.HomeScreenComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) obj2;
                        xg xgVar = new xg(homeTabScreensRetainedState, 1);
                        HomeScreenComponent homeScreenComponent2 = homeScreenComponent;
                        homeScreenComponent2.E0(xgVar);
                        Integer num = (Integer) homeTabScreensRetainedState.g.get(homeScreenComponent2.M);
                        int iIntValue = num != null ? num.intValue() : 0;
                        if (iIntValue != homeScreenComponent2.d0) {
                            homeScreenComponent2.d0 = iIntValue;
                            homeScreenComponent2.V = true;
                            homeScreenComponent2.e0 = true;
                            MutableStateFlow mutableStateFlow = homeScreenComponent2.i0;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.c(value, Integer.valueOf(((Number) value).intValue() + 1)));
                            if (homeScreenComponent2.c0) {
                                homeScreenComponent2.e0 = false;
                                homeScreenComponent2.R0(HomeScreenViewIntent.HomeScreenViewStoppedIntent.f3562a);
                                homeScreenComponent2.R0(HomeScreenViewIntent.HomeScreenViewStartedIntent.f3561a);
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenComponent$Companion;", "", "", "PLAY_STORE_BASE_URI", "Ljava/lang/String;", "PLAY_STORE_PACKAGE", "APP_VERSION_CODE", "USER_ID_KEY", "SHOULD_UPDATE_KEY", "", "NEW_LOCATION_EVENT_THRESHOLD_IN_METERS", "I", "HOME_SCREEN_SRC", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3536a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HomePageFeature.values().length];
            try {
                iArr[HomePageFeature.REGULAR_BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomePageFeature.CHALO_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomePageFeature.CARD_RECHARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomePageFeature.METRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomePageFeature.TICKETS_PASSES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomePageFeature.IMAGE_RESOURCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomePageFeature.FOOTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomePageFeature.PLOTLINE_WIDGET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomePageFeature.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f3536a = iArr;
            int[] iArr2 = new int[ImageResourceCtaType.values().length];
            try {
                iArr2[ImageResourceCtaType.SCAN_AND_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ImageResourceCtaType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
            int[] iArr3 = new int[MetroBookingFlowType.values().length];
            try {
                iArr3[MetroBookingFlowType.ONDC.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[MetroBookingFlowType.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            c = iArr3;
            int[] iArr4 = new int[PremiumReserveTicketStatus.values().length];
            try {
                iArr4[PremiumReserveTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.PUNCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.PAYMENT_PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.PAYMENT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.USER_CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.SYSTEM_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.USER_RESCHEDULED.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.SYSTEM_RESCHEDULED.ordinal()] = 9;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.EXPIRED.ordinal()] = 10;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.BOOKING_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[PremiumReserveTicketStatus.FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused26) {
            }
            d = iArr4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent(ComponentContext componentContext, UrlOpenHelper urlOpenHelper, CityProvider cityProvider, StringProvider stringProvider, GetHomePageItemsUseCase getHomePageItemsUseCase, GetTripPlannerConfigForCityUseCase getTripPlannerConfigForCityUseCase, BasicInfoContract basicInfoContract, PremiumReserveTicketPostBookingActionHandler premiumReserveTicketPostBookingActionHandler, TimeUtilsContract timeUtilsContract, GetLatestPremiumReserveTicketFromFirstBookingIdUseCase getLatestPremiumReserveTicketFromFirstBookingIdUseCase, PremiumBusInAppCommunicationBottomSheetDataUseCase premiumBusInAppCommunicationBottomSheetDataUseCase, GetActivePremiumReserveTicketBetweenGivenTimeUseCase getActivePremiumReserveTicketBetweenGivenTimeUseCase, GetPremiumReserveTicketsWithPendingAckUseCase getPremiumReserveTicketsWithPendingAckUseCase, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, AcknowledgePremiumReserveTicketCancellationUseCase acknowledgePremiumReserveTicketCancellationUseCase, UserProfileDetailsProvider userProfileDetailsProvider, IsLocationMandatoryForUserUseCase isLocationMandatoryForUserUseCase, HomeScreenInfoHelper homeScreenInfoHelper, ChaloLocationManager chaloLocationManager, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, TitoRideDataManager titoRideDataManager, CheckIsUnifiedTitoFlowEnabledUseCase checkIsUnifiedTitoFlowEnabledUseCase, GetActiveTitoTripsAndUpdateRestUseCase getActiveTitoTripsAndUpdateRestUseCase, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager, LocationPermissionCallbackHandler locationPermissionCallbackHandler, ProductBookingHelper productBookingHelper, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase, HomeTabVisibilityController homeTabVisibilityController, BottomNavTabType tabType, SystemHelper systemHelper, GpsRequestHandlerProvider gpsRequestHandlerProvider, CrashlyticsLogger crashlyticsLogger, ChaloAppFeatureHelper chaloAppFeatureHelper, KotlinToastManager kotlinToastManager, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, JuspayControllerProvider juspayControllerProvider) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(homeTabVisibilityController, "homeTabVisibilityController");
        Intrinsics.i(tabType, "tabType");
        this.k = urlOpenHelper;
        this.l = cityProvider;
        this.m = stringProvider;
        this.n = getHomePageItemsUseCase;
        this.o = getTripPlannerConfigForCityUseCase;
        this.p = basicInfoContract;
        this.q = premiumReserveTicketPostBookingActionHandler;
        this.r = timeUtilsContract;
        this.s = getLatestPremiumReserveTicketFromFirstBookingIdUseCase;
        this.t = premiumBusInAppCommunicationBottomSheetDataUseCase;
        this.u = getActivePremiumReserveTicketBetweenGivenTimeUseCase;
        this.v = getPremiumReserveTicketsWithPendingAckUseCase;
        this.w = getTimeInMillisAfterXTimeUseCase;
        this.x = acknowledgePremiumReserveTicketCancellationUseCase;
        this.y = userProfileDetailsProvider;
        this.z = isLocationMandatoryForUserUseCase;
        this.A = homeScreenInfoHelper;
        this.B = chaloLocationManager;
        this.C = homeScreenAnalyticsHelper;
        this.D = titoRideDataManager;
        this.E = checkIsUnifiedTitoFlowEnabledUseCase;
        this.F = getActiveTitoTripsAndUpdateRestUseCase;
        this.G = chaloNavigationManager;
        this.H = permissionHandlerProvider;
        this.I = homeTabScreensNavigationAndStateManager;
        this.J = locationPermissionCallbackHandler;
        this.K = productBookingHelper;
        this.L = getClusterConfigForCityUseCase;
        this.M = tabType;
        this.N = systemHelper;
        this.O = gpsRequestHandlerProvider;
        this.P = crashlyticsLogger;
        this.Q = chaloAppFeatureHelper;
        this.R = kotlinToastManager;
        this.S = arePermissionsGrantedUseCase;
        this.T = juspayControllerProvider;
        this.V = true;
        this.f0 = new VisibleJobTracker();
        this.h0 = homeTabVisibilityController.a(tabType);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(0);
        this.i0 = mutableStateFlowA;
        this.j0 = FlowKt.c(mutableStateFlowA);
        Job job = this.Y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.Y = BuildersKt.d(this.j, null, null, new HomeScreenComponent$observeTabVisibility$1(this, null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
        titoRideDataManager.b(this.j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(HomeScreenComponent homeScreenComponent, ContinuationImpl continuationImpl) {
        HomeScreenComponent$areJuspayPermissionsGranted$1 homeScreenComponent$areJuspayPermissionsGranted$1;
        homeScreenComponent.getClass();
        if (continuationImpl instanceof HomeScreenComponent$areJuspayPermissionsGranted$1) {
            homeScreenComponent$areJuspayPermissionsGranted$1 = (HomeScreenComponent$areJuspayPermissionsGranted$1) continuationImpl;
            int i = homeScreenComponent$areJuspayPermissionsGranted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$areJuspayPermissionsGranted$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$areJuspayPermissionsGranted$1 = new HomeScreenComponent$areJuspayPermissionsGranted$1(homeScreenComponent, continuationImpl);
            }
        } else {
            homeScreenComponent$areJuspayPermissionsGranted$1 = new HomeScreenComponent$areJuspayPermissionsGranted$1(homeScreenComponent, continuationImpl);
        }
        Object objA = homeScreenComponent$areJuspayPermissionsGranted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$areJuspayPermissionsGranted$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = homeScreenComponent.S;
            AppPermission.INSTANCE.getClass();
            List listA = AppPermission.Companion.a();
            homeScreenComponent$areJuspayPermissionsGranted$1.label = 1;
            objA = arePermissionsGrantedUseCase.a(listA, homeScreenComponent$areJuspayPermissionsGranted$1);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(HomeScreenComponent homeScreenComponent, String str, ContinuationImpl continuationImpl) {
        HomeScreenComponent$handleUnavailableMetroCase$1 homeScreenComponent$handleUnavailableMetroCase$1;
        KotlinToastManager kotlinToastManager;
        homeScreenComponent.getClass();
        if (continuationImpl instanceof HomeScreenComponent$handleUnavailableMetroCase$1) {
            homeScreenComponent$handleUnavailableMetroCase$1 = (HomeScreenComponent$handleUnavailableMetroCase$1) continuationImpl;
            int i = homeScreenComponent$handleUnavailableMetroCase$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$handleUnavailableMetroCase$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$handleUnavailableMetroCase$1 = new HomeScreenComponent$handleUnavailableMetroCase$1(homeScreenComponent, continuationImpl);
            }
        } else {
            homeScreenComponent$handleUnavailableMetroCase$1 = new HomeScreenComponent$handleUnavailableMetroCase$1(homeScreenComponent, continuationImpl);
        }
        Object objB = homeScreenComponent$handleUnavailableMetroCase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$handleUnavailableMetroCase$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenComponent.C, "home tab metro click nav failed", vo1.s("error", str), Source.HOME_SCREEN_TAB, 12);
            KotlinToastManager kotlinToastManager2 = homeScreenComponent.R;
            homeScreenComponent$handleUnavailableMetroCase$1.L$0 = kotlinToastManager2;
            homeScreenComponent$handleUnavailableMetroCase$1.label = 1;
            objB = homeScreenComponent.m.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE, new Object[0], homeScreenComponent$handleUnavailableMetroCase$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) homeScreenComponent$handleUnavailableMetroCase$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(HomeScreenComponent homeScreenComponent, ContinuationImpl continuationImpl) {
        HomeScreenComponent$navigateToUniversalPicker$1 homeScreenComponent$navigateToUniversalPicker$1;
        ChaloNavigationManager chaloNavigationManager;
        String str;
        homeScreenComponent.getClass();
        if (continuationImpl instanceof HomeScreenComponent$navigateToUniversalPicker$1) {
            homeScreenComponent$navigateToUniversalPicker$1 = (HomeScreenComponent$navigateToUniversalPicker$1) continuationImpl;
            int i = homeScreenComponent$navigateToUniversalPicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$navigateToUniversalPicker$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$navigateToUniversalPicker$1 = new HomeScreenComponent$navigateToUniversalPicker$1(homeScreenComponent, continuationImpl);
            }
        } else {
            homeScreenComponent$navigateToUniversalPicker$1 = new HomeScreenComponent$navigateToUniversalPicker$1(homeScreenComponent, continuationImpl);
        }
        Object obj = homeScreenComponent$navigateToUniversalPicker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$navigateToUniversalPicker$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ChaloNavigationManager chaloNavigationManager2 = homeScreenComponent.G;
            Json json = ChaloJson.b;
            UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.d(new UniversalSearchOption.PLACES(false, true), new UniversalSearchOption.STOPS(true, false), new UniversalSearchOption.ROUTES(), new UniversalSearchOption.TRIPS()));
            json.getClass();
            String strA = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
            homeScreenComponent$navigateToUniversalPicker$1.L$0 = strA;
            homeScreenComponent$navigateToUniversalPicker$1.L$1 = chaloNavigationManager2;
            homeScreenComponent$navigateToUniversalPicker$1.label = 1;
            Object objB = homeScreenComponent.m.b(StringEnum.UNIVERSAL_PICKER_HINT, new Object[0], homeScreenComponent$navigateToUniversalPicker$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objB;
            chaloNavigationManager = chaloNavigationManager2;
            str = strA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloNavigationManager = (ChaloNavigationManager) homeScreenComponent$navigateToUniversalPicker$1.L$1;
            String str2 = (String) homeScreenComponent$navigateToUniversalPicker$1.L$0;
            ResultKt.b(obj);
            str = str2;
        }
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(str, (String) obj, UniversalSearchFlowSource.HOME_SCREEN_TAB.getSourceName(), Source.HOME_SCREEN, (String) null, "TRIP_PLANNER", (String) null, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1936), null, null, 6));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[LOOP:0: B:39:0x00ac->B:63:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(HomeScreenComponent homeScreenComponent, JuspayController juspayController, ContinuationImpl continuationImpl) {
        HomeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1 homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1;
        JuspayController juspayController2;
        List list;
        KotlinToastManager kotlinToastManager;
        List list2;
        List<AppPermission> list3;
        Iterator it;
        Object next;
        Pair pair;
        PermissionState permissionState;
        homeScreenComponent.getClass();
        if (continuationImpl instanceof HomeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1) {
            homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1 = (HomeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1) continuationImpl;
            int i = homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1 = new HomeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1(homeScreenComponent, continuationImpl);
            }
        } else {
            homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1 = new HomeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1(homeScreenComponent, continuationImpl);
        }
        Object objV = homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label;
        Unit unit = Unit.f17538a;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlinToastManager = (KotlinToastManager) homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0;
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
            list = (List) homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$1;
            juspayController2 = (JuspayController) homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0;
            ResultKt.b(objV);
            list2 = (List) objV;
            if (list2 != null) {
                list3 = list;
                if ((list3 instanceof Collection) || !list3.isEmpty()) {
                    for (AppPermission appPermission : list3) {
                        it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
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
                        if (permissionState == PermissionState.GRANTED) {
                        }
                    }
                }
                homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0 = null;
                homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$1 = null;
                homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = 3;
                if (homeScreenComponent.Q0(juspayController2, homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1) == obj) {
                    return unit;
                }
            }
            homeScreenComponent.E0(new u60(17));
            return unit;
        }
        ResultKt.b(objV);
        PermissionHandler permissionHandlerC = homeScreenComponent.H.c();
        if (permissionHandlerC == null) {
            KotlinToastManager kotlinToastManager2 = homeScreenComponent.R;
            homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0 = kotlinToastManager2;
            homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = 1;
            objV = homeScreenComponent.m.b(StringEnum.GENERIC_ERROR_MESSAGE, new Object[0], homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1);
            if (objV != obj) {
                kotlinToastManager = kotlinToastManager2;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objV, ToastLength.LONG);
                return unit;
            }
        } else {
            AppPermission.INSTANCE.getClass();
            List listA = AppPermission.Companion.a();
            homeScreenComponent.b0 = false;
            Flow flowA = permissionHandlerC.a(listA);
            homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0 = juspayController;
            homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$1 = listA;
            homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = 2;
            objV = FlowKt.v(flowA, homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1);
            if (objV != obj) {
                juspayController2 = juspayController;
                list = listA;
                list2 = (List) objV;
                if (list2 != null) {
                    list3 = list;
                    if (list3 instanceof Collection) {
                        while (r11.hasNext()) {
                            it = list2.iterator();
                            do {
                                if (!it.hasNext()) {
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
                            if (permissionState == PermissionState.GRANTED) {
                            }
                        }
                    } else {
                        while (r11.hasNext()) {
                            it = list2.iterator();
                            do {
                                if (!it.hasNext()) {
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
                            if (permissionState == PermissionState.GRANTED) {
                            }
                        }
                    }
                    homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$0 = null;
                    homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.L$1 = null;
                    homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1.label = 3;
                    if (homeScreenComponent.Q0(juspayController2, homeScreenComponent$requestJuspayPermissionsAndLaunchScanAndPay$1) == obj) {
                        return unit;
                    }
                }
                homeScreenComponent.E0(new u60(17));
                return unit;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object J0(HomeScreenComponent homeScreenComponent, HomeScreenAppModel homeScreenAppModel, ContinuationImpl continuationImpl) {
        HomeScreenComponent$setInitialData$1 homeScreenComponent$setInitialData$1;
        HomeScreenAppModel homeScreenAppModel2;
        boolean z;
        ProfileDrawerCardData profileDrawerCardData;
        Object objI;
        ProfileDrawerCardData profileDrawerCardData2;
        HomeScreenAppModel homeScreenAppModel3;
        homeScreenComponent.getClass();
        if (continuationImpl instanceof HomeScreenComponent$setInitialData$1) {
            homeScreenComponent$setInitialData$1 = (HomeScreenComponent$setInitialData$1) continuationImpl;
            int i = homeScreenComponent$setInitialData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$setInitialData$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$setInitialData$1 = new HomeScreenComponent$setInitialData$1(homeScreenComponent, continuationImpl);
            }
        } else {
            homeScreenComponent$setInitialData$1 = new HomeScreenComponent$setInitialData$1(homeScreenComponent, continuationImpl);
        }
        Object objB = homeScreenComponent$setInitialData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$setInitialData$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            IsLocationMandatoryForUserUseCase isLocationMandatoryForUserUseCase = homeScreenComponent.z;
            Source source = Source.HOME_SCREEN_TAB;
            homeScreenComponent$setInitialData$1.L$0 = homeScreenAppModel;
            homeScreenComponent$setInitialData$1.label = 1;
            objB = isLocationMandatoryForUserUseCase.b(source, homeScreenComponent$setInitialData$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            homeScreenAppModel = (HomeScreenAppModel) homeScreenComponent$setInitialData$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                z = homeScreenComponent$setInitialData$1.Z$0;
                homeScreenAppModel2 = (HomeScreenAppModel) homeScreenComponent$setInitialData$1.L$0;
                ResultKt.b(objB);
                profileDrawerCardData = (ProfileDrawerCardData) objB;
                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenComponent.C, "home page rendered", null, Source.HOME_SCREEN_TAB, 14);
                ChaloAppFeatureHelper chaloAppFeatureHelper = homeScreenComponent.Q;
                CityAppModel cityAppModel = (CityAppModel) homeScreenComponent.l.getE().getValue();
                String str = cityAppModel != null ? cityAppModel.f8854a : null;
                homeScreenComponent$setInitialData$1.L$0 = homeScreenAppModel2;
                homeScreenComponent$setInitialData$1.L$1 = profileDrawerCardData;
                homeScreenComponent$setInitialData$1.Z$0 = z;
                homeScreenComponent$setInitialData$1.label = 3;
                objI = chaloAppFeatureHelper.i(str, homeScreenComponent$setInitialData$1);
                if (objI != coroutineSingletons) {
                    profileDrawerCardData2 = profileDrawerCardData;
                    objB = objI;
                    homeScreenAppModel3 = homeScreenAppModel2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = homeScreenComponent$setInitialData$1.Z$0;
            ProfileDrawerCardData profileDrawerCardData3 = (ProfileDrawerCardData) homeScreenComponent$setInitialData$1.L$1;
            HomeScreenAppModel homeScreenAppModel4 = (HomeScreenAppModel) homeScreenComponent$setInitialData$1.L$0;
            ResultKt.b(objB);
            homeScreenAppModel3 = homeScreenAppModel4;
            profileDrawerCardData2 = profileDrawerCardData3;
        }
        homeScreenComponent.E0(new b80(homeScreenComponent, homeScreenAppModel3, profileDrawerCardData2, z, ((Boolean) objB).booleanValue(), 0));
        return Unit.f17538a;
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        UserProfileDetailsProvider userProfileDetailsProvider = homeScreenComponent.y;
        homeScreenComponent$setInitialData$1.L$0 = homeScreenAppModel;
        homeScreenComponent$setInitialData$1.Z$0 = zBooleanValue;
        homeScreenComponent$setInitialData$1.label = 2;
        Object objA = UserProfileDetailsProviderExtKt.a(userProfileDetailsProvider, homeScreenComponent$setInitialData$1);
        if (objA != coroutineSingletons) {
            homeScreenAppModel2 = homeScreenAppModel;
            z = zBooleanValue;
            objB = objA;
            profileDrawerCardData = (ProfileDrawerCardData) objB;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenComponent.C, "home page rendered", null, Source.HOME_SCREEN_TAB, 14);
            ChaloAppFeatureHelper chaloAppFeatureHelper2 = homeScreenComponent.Q;
            CityAppModel cityAppModel2 = (CityAppModel) homeScreenComponent.l.getE().getValue();
            if (cityAppModel2 != null) {
            }
            homeScreenComponent$setInitialData$1.L$0 = homeScreenAppModel2;
            homeScreenComponent$setInitialData$1.L$1 = profileDrawerCardData;
            homeScreenComponent$setInitialData$1.Z$0 = z;
            homeScreenComponent$setInitialData$1.label = 3;
            objI = chaloAppFeatureHelper2.i(str, homeScreenComponent$setInitialData$1);
            if (objI != coroutineSingletons) {
                profileDrawerCardData2 = profileDrawerCardData;
                objB = objI;
                homeScreenAppModel3 = homeScreenAppModel2;
                homeScreenComponent.E0(new b80(homeScreenComponent, homeScreenAppModel3, profileDrawerCardData2, z, ((Boolean) objB).booleanValue(), 0));
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object K0(HomeScreenComponent homeScreenComponent, LatLng latLng, ContinuationImpl continuationImpl) {
        HomeScreenComponent$shouldRaiseLocationRelatedEvent$1 homeScreenComponent$shouldRaiseLocationRelatedEvent$1;
        homeScreenComponent.getClass();
        if (continuationImpl instanceof HomeScreenComponent$shouldRaiseLocationRelatedEvent$1) {
            homeScreenComponent$shouldRaiseLocationRelatedEvent$1 = (HomeScreenComponent$shouldRaiseLocationRelatedEvent$1) continuationImpl;
            int i = homeScreenComponent$shouldRaiseLocationRelatedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$shouldRaiseLocationRelatedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$shouldRaiseLocationRelatedEvent$1 = new HomeScreenComponent$shouldRaiseLocationRelatedEvent$1(homeScreenComponent, continuationImpl);
            }
        } else {
            homeScreenComponent$shouldRaiseLocationRelatedEvent$1 = new HomeScreenComponent$shouldRaiseLocationRelatedEvent$1(homeScreenComponent, continuationImpl);
        }
        Object objA = homeScreenComponent$shouldRaiseLocationRelatedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$shouldRaiseLocationRelatedEvent$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloLocationManager chaloLocationManager = homeScreenComponent.B;
            homeScreenComponent$shouldRaiseLocationRelatedEvent$1.L$0 = latLng;
            homeScreenComponent$shouldRaiseLocationRelatedEvent$1.label = 1;
            objA = chaloLocationManager.a(homeScreenComponent$shouldRaiseLocationRelatedEvent$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            latLng = (LatLng) homeScreenComponent$shouldRaiseLocationRelatedEvent$1.L$0;
            ResultKt.b(objA);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
        if (locationAppModelA == null) {
            return Boolean.TRUE;
        }
        LatLng latLngA = locationAppModelA.a();
        if (latLng == null) {
            return Boolean.TRUE;
        }
        if (latLngA.a(latLng) <= 1000.0d && homeScreenComponent.U) {
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
    public static final java.lang.Object L0(app.chalo.home.ui.home.HomeScreenComponent r12, app.chalo.location.LatLng r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.home.HomeScreenComponent.L0(app.chalo.home.ui.home.HomeScreenComponent, app.chalo.location.LatLng, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object M0(HomeScreenComponent homeScreenComponent, ContinuationImpl continuationImpl) {
        HomeScreenComponent$updatePremiumReserveTicketsList$1 homeScreenComponent$updatePremiumReserveTicketsList$1;
        GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase;
        GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase2;
        long j;
        VisibleJobTracker visibleJobTracker = homeScreenComponent.f0;
        BasicInfoContract basicInfoContract = homeScreenComponent.p;
        GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase3 = homeScreenComponent.w;
        if (continuationImpl instanceof HomeScreenComponent$updatePremiumReserveTicketsList$1) {
            homeScreenComponent$updatePremiumReserveTicketsList$1 = (HomeScreenComponent$updatePremiumReserveTicketsList$1) continuationImpl;
            int i = homeScreenComponent$updatePremiumReserveTicketsList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$updatePremiumReserveTicketsList$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$updatePremiumReserveTicketsList$1 = new HomeScreenComponent$updatePremiumReserveTicketsList$1(homeScreenComponent, continuationImpl);
            }
        } else {
            homeScreenComponent$updatePremiumReserveTicketsList$1 = new HomeScreenComponent$updatePremiumReserveTicketsList$1(homeScreenComponent, continuationImpl);
        }
        Object objC = homeScreenComponent$updatePremiumReserveTicketsList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$updatePremiumReserveTicketsList$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            homeScreenComponent$updatePremiumReserveTicketsList$1.L$0 = getTimeInMillisAfterXTimeUseCase3;
            homeScreenComponent$updatePremiumReserveTicketsList$1.label = 1;
            objC = basicInfoContract.c(homeScreenComponent$updatePremiumReserveTicketsList$1);
            if (objC != coroutineSingletons) {
                getTimeInMillisAfterXTimeUseCase = getTimeInMillisAfterXTimeUseCase3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase4 = (GetTimeInMillisAfterXTimeUseCase) homeScreenComponent$updatePremiumReserveTicketsList$1.L$0;
            ResultKt.b(objC);
            getTimeInMillisAfterXTimeUseCase = getTimeInMillisAfterXTimeUseCase4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = homeScreenComponent$updatePremiumReserveTicketsList$1.J$0;
            GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase5 = (GetTimeInMillisAfterXTimeUseCase) homeScreenComponent$updatePremiumReserveTicketsList$1.L$0;
            ResultKt.b(objC);
            getTimeInMillisAfterXTimeUseCase2 = getTimeInMillisAfterXTimeUseCase5;
            j = j2;
        }
        visibleJobTracker.b(homeScreenComponent.w0(new HomeScreenComponent$updatePremiumReserveTicketsList$2(homeScreenComponent, j, getTimeInMillisAfterXTimeUseCase2.a(((Number) objC).longValue(), CalendarModelKt.MillisecondsIn24Hours, MillisAfterTimeFormatType.END_OF_DAY), null)));
        visibleJobTracker.b(homeScreenComponent.w0(new HomeScreenComponent$updatePremiumReserveTicketsList$3(homeScreenComponent, j, null)));
        return Unit.f17538a;
        long jA = getTimeInMillisAfterXTimeUseCase.a(((Number) objC).longValue(), 0L, MillisAfterTimeFormatType.START_OF_DAY);
        homeScreenComponent$updatePremiumReserveTicketsList$1.L$0 = getTimeInMillisAfterXTimeUseCase3;
        homeScreenComponent$updatePremiumReserveTicketsList$1.J$0 = jA;
        homeScreenComponent$updatePremiumReserveTicketsList$1.label = 2;
        objC = basicInfoContract.c(homeScreenComponent$updatePremiumReserveTicketsList$1);
        if (objC != coroutineSingletons) {
            getTimeInMillisAfterXTimeUseCase2 = getTimeInMillisAfterXTimeUseCase3;
            j = jA;
            visibleJobTracker.b(homeScreenComponent.w0(new HomeScreenComponent$updatePremiumReserveTicketsList$2(homeScreenComponent, j, getTimeInMillisAfterXTimeUseCase2.a(((Number) objC).longValue(), CalendarModelKt.MillisecondsIn24Hours, MillisAfterTimeFormatType.END_OF_DAY), null)));
            visibleJobTracker.b(homeScreenComponent.w0(new HomeScreenComponent$updatePremiumReserveTicketsList$3(homeScreenComponent, j, null)));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    public final void N0() {
        this.a0 = false;
        E0(new u60(22));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O0(JuspayOperationFailure juspayOperationFailure, Continuation continuation) {
        HomeScreenComponent$handleScanAndPayFailure$1 homeScreenComponent$handleScanAndPayFailure$1;
        if (continuation instanceof HomeScreenComponent$handleScanAndPayFailure$1) {
            homeScreenComponent$handleScanAndPayFailure$1 = (HomeScreenComponent$handleScanAndPayFailure$1) continuation;
            int i = homeScreenComponent$handleScanAndPayFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$handleScanAndPayFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$handleScanAndPayFailure$1 = new HomeScreenComponent$handleScanAndPayFailure$1(this, continuation);
            }
        } else {
            homeScreenComponent$handleScanAndPayFailure$1 = new HomeScreenComponent$handleScanAndPayFailure$1(this, continuation);
        }
        Object objB = homeScreenComponent$handleScanAndPayFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$handleScanAndPayFailure$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            N0();
            JuspayOperationFailure.Error error = juspayOperationFailure instanceof JuspayOperationFailure.Error ? (JuspayOperationFailure.Error) juspayOperationFailure : null;
            if (error == null || (str = error.f4051a) == null) {
                homeScreenComponent$handleScanAndPayFailure$1.label = 1;
                objB = this.m.b(StringEnum.GENERIC_ERROR_MESSAGE, new Object[0], homeScreenComponent$handleScanAndPayFailure$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            KotlinToastManagerKt.a(this.R, str, ToastLength.LONG);
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        String str = (String) objB;
        KotlinToastManagerKt.a(this.R, str, ToastLength.LONG);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P0(Continuation continuation) {
        HomeScreenComponent$handleScanAndPayRejected$1 homeScreenComponent$handleScanAndPayRejected$1;
        KotlinToastManager kotlinToastManager;
        if (continuation instanceof HomeScreenComponent$handleScanAndPayRejected$1) {
            homeScreenComponent$handleScanAndPayRejected$1 = (HomeScreenComponent$handleScanAndPayRejected$1) continuation;
            int i = homeScreenComponent$handleScanAndPayRejected$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenComponent$handleScanAndPayRejected$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenComponent$handleScanAndPayRejected$1 = new HomeScreenComponent$handleScanAndPayRejected$1(this, continuation);
            }
        } else {
            homeScreenComponent$handleScanAndPayRejected$1 = new HomeScreenComponent$handleScanAndPayRejected$1(this, continuation);
        }
        Object objB = homeScreenComponent$handleScanAndPayRejected$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenComponent$handleScanAndPayRejected$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            KotlinToastManager kotlinToastManager2 = this.R;
            homeScreenComponent$handleScanAndPayRejected$1.L$0 = kotlinToastManager2;
            homeScreenComponent$handleScanAndPayRejected$1.label = 1;
            objB = this.m.b(StringEnum.PLEASE_TRY_AGAIN_AFTER_SOMETIME, new Object[0], homeScreenComponent$handleScanAndPayRejected$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) homeScreenComponent$handleScanAndPayRejected$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    public final Object Q0(JuspayController juspayController, ContinuationImpl continuationImpl) {
        Object objCollect = ((ChannelFlow) juspayController.f(Source.HOME_SCREEN_TAB.getSourceName())).collect(new FlowCollector() { // from class: app.chalo.home.ui.home.HomeScreenComponent$launchScanAndPay$2
            /* JADX WARN: Code duplicated, block: B:41:0x00b3 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Object objO0;
                JuspayOperationUpdate juspayOperationUpdate = (JuspayOperationUpdate) obj;
                boolean zD = Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Started.f4065a);
                HomeScreenComponent homeScreenComponent = this.f3538a;
                Unit unit = Unit.f17538a;
                if (!zD) {
                    if (Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Rejected.f4064a)) {
                        objO0 = homeScreenComponent.P0(continuation);
                        if (objO0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Loading) {
                        if (!((JuspayOperationUpdate.Loading) juspayOperationUpdate).f4063a) {
                            homeScreenComponent.a0 = true;
                        }
                        homeScreenComponent.E0(new a80(juspayOperationUpdate, 0));
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Failed) {
                        objO0 = homeScreenComponent.O0(((JuspayOperationUpdate.Failed) juspayOperationUpdate).f4062a, continuation);
                        if (objO0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Completed) {
                        JuspayOperationResult juspayOperationResult = ((JuspayOperationUpdate.Completed) juspayOperationUpdate).f4061a;
                        homeScreenComponent.N0();
                        if (!(juspayOperationResult instanceof JuspayOperationResult.UpiUiScanPay) && !(juspayOperationResult instanceof JuspayOperationResult.Onboarding) && !(juspayOperationResult instanceof JuspayOperationResult.Management)) {
                            if (!(juspayOperationResult instanceof JuspayOperationResult.Error)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            JusPayErrorResultAppModel jusPayErrorResultAppModel = ((JuspayOperationResult.Error) juspayOperationResult).f4056a;
                            KotlinToastManagerKt.a(homeScreenComponent.R, jusPayErrorResultAppModel.e + " (" + jusPayErrorResultAppModel.f.f4044a + ")", ToastLength.LONG);
                        }
                    } else {
                        if (!Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Abandoned.f4060a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        homeScreenComponent.N0();
                    }
                    if (objO0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objO0;
                    }
                    return unit;
                }
                homeScreenComponent.E0(new u60(23));
                objO0 = unit;
                if (objO0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objO0;
                }
                return unit;
            }
        }, continuationImpl);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /*  JADX ERROR: StackOverflowError in pass: IfRegionVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:517)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:96)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
        */
    public final void R0(app.chalo.home.ui.home.HomeScreenViewIntent r27) {
        /*
            Method dump skipped, instruction units count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.home.HomeScreenComponent.R0(app.chalo.home.ui.home.HomeScreenViewIntent):void");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (HomeScreenViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new HomeScreenViewState(null, EmptyList.f17557a, null, new TabMetaDataAppModel(), null, null, null, null, false, null, null, null, null, null, null, false, false, false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        Job job = this.Y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.f0.a();
    }
}
