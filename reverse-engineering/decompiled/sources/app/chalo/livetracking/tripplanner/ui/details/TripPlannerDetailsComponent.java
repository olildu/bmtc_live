package app.chalo.livetracking.tripplanner.ui.details;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.manager.CityDataManagerKotlin;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.contract.ProductBookingHelperKt;
import app.chalo.contract.ProductInfoContract;
import app.chalo.data.InstantTicketFeatureConfigForCity;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.domain.GetTrimmedPolylineUseCase;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.livetracking.routedetails.data.model.app.ExtensionsKt;
import app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase;
import app.chalo.livetracking.routedetails.domain.PayForTicketFlowType;
import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModelKt;
import app.chalo.livetracking.tripplanner.domain.BuildEligibleGroupTicketJourneyModelUseCase;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest;
import app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType;
import app.chalo.location.AppPermissionRequest;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.models.AppPermission;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.n8;
import defpackage.py;
import defpackage.sh1;
import defpackage.xj1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsState;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsEffect;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerDetailsComponent extends ChaloBaseStateMviComponent<TripPlannerDetailsIntent, TripPlannerDetailsState, TripPlannerDetailsState, TripPlannerDetailsEffect> {
    public final ChaloNavigationManager A;
    public final KotlinToastManager B;
    public final LiveTrackingNavigationContract C;
    public final TimeUtilsContract D;
    public final PolylineUtils E;
    public final LatLngBoundsUtils F;
    public Job G;
    public Job H;
    public LinkedHashMap I;
    public LinkedHashMap J;
    public TripPlannerItineraryAppResponseModel K;
    public LinkedHashMap L;
    public GroupTicketJourneyModel M;
    public long N;
    public final Lazy O;
    public Long P;
    public boolean Q;
    public final Lazy R;
    public final LinkedHashMap S;
    public final UserProfileDetailsProvider k;
    public final AnalyticsContract l;
    public final ChaloMapMarkerIconProvider m;
    public final CityDataManagerKotlin n;
    public final GetTrimmedPolylineUseCase o;
    public final ProcessTripPlannerItineraryForUiUseCase p;
    public final BasicInfoContract q;
    public final StringProvider r;
    public final TripPlannerItineraryLiveInfoManager s;
    public final ProductInfoContract t;
    public final CityProvider u;
    public final ArePermissionsGrantedUseCase v;
    public final GetRouteDetailsPayForTicketFlowTypeUseCase w;
    public final GetInstantTicketFeatureConfigUseCase x;
    public final BuildEligibleGroupTicketJourneyModelUseCase y;
    public final ProductBookingHelper z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4721a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RouteServiceType.values().length];
            try {
                iArr[RouteServiceType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteServiceType.PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteServiceType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4721a = iArr;
            int[] iArr2 = new int[PayForTicketFlowType.values().length];
            try {
                iArr2[PayForTicketFlowType.INSTANT_TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PayForTicketFlowType.QUICK_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PayForTicketFlowType.PAY_FOR_TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PayForTicketFlowType.PRODUCT_SELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PayForTicketFlowType.M_TICKET_TRIP_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PayForTicketFlowType.ONDC_TICKET.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
        }
    }

    public TripPlannerDetailsComponent(ComponentContext componentContext, TripPlannerArgs.DetailsScreen detailsScreen, UserProfileDetailsProvider userProfileDetailsProvider, AnalyticsContract analyticsContract, ChaloMapMarkerIconProvider chaloMapMarkerIconProvider, CityDataManagerKotlin cityDataManagerKotlin, GetTrimmedPolylineUseCase getTrimmedPolylineUseCase, ProcessTripPlannerItineraryForUiUseCase processTripPlannerItineraryForUiUseCase, BasicInfoContract basicInfoContract, StringProvider stringProvider, TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, ProductInfoContract productInfoContract, CityProvider cityProvider, ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, GetRouteDetailsPayForTicketFlowTypeUseCase getRouteDetailsPayForTicketFlowTypeUseCase, GetInstantTicketFeatureConfigUseCase getInstantTicketFeatureConfigUseCase, BuildEligibleGroupTicketJourneyModelUseCase buildEligibleGroupTicketJourneyModelUseCase, ProductBookingHelper productBookingHelper, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, LiveTrackingNavigationContract liveTrackingNavigationContract, TimeUtilsContract timeUtilsContract, PolylineUtils polylineUtils, LatLngBoundsUtils latLngBoundsUtils) {
        super(componentContext);
        this.k = userProfileDetailsProvider;
        this.l = analyticsContract;
        this.m = chaloMapMarkerIconProvider;
        this.n = cityDataManagerKotlin;
        this.o = getTrimmedPolylineUseCase;
        this.p = processTripPlannerItineraryForUiUseCase;
        this.q = basicInfoContract;
        this.r = stringProvider;
        this.s = tripPlannerItineraryLiveInfoManager;
        this.t = productInfoContract;
        this.u = cityProvider;
        this.v = arePermissionsGrantedUseCase;
        this.w = getRouteDetailsPayForTicketFlowTypeUseCase;
        this.x = getInstantTicketFeatureConfigUseCase;
        this.y = buildEligibleGroupTicketJourneyModelUseCase;
        this.z = productBookingHelper;
        this.A = chaloNavigationManager;
        this.B = kotlinToastManager;
        this.C = liveTrackingNavigationContract;
        this.D = timeUtilsContract;
        this.E = polylineUtils;
        this.F = latLngBoundsUtils;
        final int i = 0;
        this.O = LazyKt.b(new Function0(this) { // from class: el1
            public final /* synthetic */ TripPlannerDetailsComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Boolean bool = (Boolean) this.b.k.getG().getValue();
                        bool.getClass();
                        return bool;
                    default:
                        TripPlannerDetailsComponent tripPlannerDetailsComponent = this.b;
                        ProductInfoContract productInfoContract2 = tripPlannerDetailsComponent.t;
                        ChaloTransitMode chaloTransitMode = ChaloTransitMode.BUS;
                        CityAppModel cityAppModel = (CityAppModel) tripPlannerDetailsComponent.u.getE().getValue();
                        return Boolean.valueOf(cityAppModel == null ? false : productInfoContract2.a(chaloTransitMode, cityAppModel));
                }
            }
        });
        final int i2 = 1;
        this.R = LazyKt.b(new Function0(this) { // from class: el1
            public final /* synthetic */ TripPlannerDetailsComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Boolean bool = (Boolean) this.b.k.getG().getValue();
                        bool.getClass();
                        return bool;
                    default:
                        TripPlannerDetailsComponent tripPlannerDetailsComponent = this.b;
                        ProductInfoContract productInfoContract2 = tripPlannerDetailsComponent.t;
                        ChaloTransitMode chaloTransitMode = ChaloTransitMode.BUS;
                        CityAppModel cityAppModel = (CityAppModel) tripPlannerDetailsComponent.u.getE().getValue();
                        return Boolean.valueOf(cityAppModel == null ? false : productInfoContract2.a(chaloTransitMode, cityAppModel));
                }
            }
        });
        this.S = new LinkedHashMap();
        Json json = ChaloJson.b;
        String str = detailsScreen.c;
        json.getClass();
        S0(new TripPlannerDetailsIntent.InitializationIntent((TripPlannerItineraryAppResponseModel) json.b(str, TripPlannerItineraryAppResponseModel.INSTANCE.serializer()), detailsScreen.d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object F0(TripPlannerDetailsComponent tripPlannerDetailsComponent, RouteAppModel routeAppModel, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1 tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1;
        String strA;
        String strA2;
        List listR;
        LiveTrackingNavigationContract liveTrackingNavigationContract;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        Source source;
        StopAppModel stopAppModel3;
        long jLongValue;
        StopAppModel stopAppModel4;
        Source source2;
        LiveTrackingNavigationContract liveTrackingNavigationContract2;
        String strA3;
        ChaloNavigationManager chaloNavigationManager = tripPlannerDetailsComponent.A;
        if (continuationImpl instanceof TripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1) {
            tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1 = (TripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1) continuationImpl;
            int i = tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1 = new TripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1(tripPlannerDetailsComponent, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1 = new TripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1(tripPlannerDetailsComponent, continuationImpl);
        }
        Object obj = tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            TripPlannerLegAppModel.Bus busO0 = tripPlannerDetailsComponent.O0(routeAppModel.b);
            if (busO0 == null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    strA = json.a(RouteAppModel.INSTANCE.serializer(), routeAppModel);
                } catch (Exception unused) {
                    strA = null;
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(strA, null, Source.ROUTE_DETAILS, null, false, null, 238), null, null, 6));
            } else {
                int i3 = WhenMappings.f4721a[busO0.G.ordinal()];
                if (i3 == 1) {
                    try {
                        Json json2 = ChaloJson.b;
                        json2.getClass();
                        strA2 = json2.a(RouteAppModel.INSTANCE.serializer(), routeAppModel);
                    } catch (Exception unused2) {
                        strA2 = null;
                    }
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(strA2, null, Source.ROUTE_DETAILS, null, false, null, 238), null, null, 6));
                } else if (i3 == 2) {
                    LiveTrackingNavigationContract liveTrackingNavigationContract3 = tripPlannerDetailsComponent.C;
                    StopAppModel stopAppModel5 = busO0.s;
                    StopAppModel stopAppModel6 = busO0.t;
                    listR = CollectionsKt.R(routeAppModel.b);
                    Source source3 = Source.TRIP_PLANNER_DETAILS;
                    Long l = tripPlannerDetailsComponent.P;
                    if (l != null) {
                        stopAppModel3 = stopAppModel6;
                        jLongValue = l.longValue();
                        stopAppModel4 = stopAppModel5;
                        source2 = source3;
                        liveTrackingNavigationContract2 = liveTrackingNavigationContract3;
                    } else {
                        BasicInfoContract basicInfoContract = tripPlannerDetailsComponent.q;
                        tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$0 = liveTrackingNavigationContract3;
                        tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$1 = stopAppModel5;
                        tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$2 = stopAppModel6;
                        tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$3 = listR;
                        tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$4 = source3;
                        tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.label = 1;
                        Object objC = basicInfoContract.c(tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1);
                        if (objC == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        liveTrackingNavigationContract = liveTrackingNavigationContract3;
                        stopAppModel = stopAppModel5;
                        stopAppModel2 = stopAppModel6;
                        obj = objC;
                        source = source3;
                    }
                    liveTrackingNavigationContract2.d(stopAppModel4, stopAppModel3, listR, source2, jLongValue);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        Json json3 = ChaloJson.b;
                        json3.getClass();
                        strA3 = json3.a(RouteAppModel.INSTANCE.serializer(), routeAppModel);
                    } catch (Exception unused3) {
                        strA3 = null;
                    }
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(strA3, null, Source.ROUTE_DETAILS, null, false, null, 238), null, null, 6));
                }
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        source = (Source) tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$4;
        listR = (List) tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$3;
        stopAppModel2 = (StopAppModel) tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$2;
        stopAppModel = (StopAppModel) tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$1;
        liveTrackingNavigationContract = (LiveTrackingNavigationContract) tripPlannerDetailsComponent$getDefaultBuyTicketNavigationEffect$1.L$0;
        ResultKt.b(obj);
        source2 = source;
        stopAppModel3 = stopAppModel2;
        liveTrackingNavigationContract2 = liveTrackingNavigationContract;
        stopAppModel4 = stopAppModel;
        jLongValue = ((Number) obj).longValue();
        liveTrackingNavigationContract2.d(stopAppModel4, stopAppModel3, listR, source2, jLongValue);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x012d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0144  */
    /* JADX WARN: Code duplicated, block: B:52:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object G0(TripPlannerDetailsComponent tripPlannerDetailsComponent, RouteAppModel routeAppModel, StopAppModel stopAppModel, StopAppModel stopAppModel2, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$getEffectForTicketNavigation$1 tripPlannerDetailsComponent$getEffectForTicketNavigation$1;
        StopAppModel stopAppModel3;
        StopAppModel stopAppModel4;
        RouteAppModel routeAppModel2;
        String strA;
        String strA2;
        String strA3;
        StopAppModel stopAppModel5;
        RouteAppModel routeAppModel3;
        StopAppModel stopAppModel6;
        String strA4;
        String strA5;
        SceneArgs instantTicket;
        ChaloNavigationManager chaloNavigationManager = tripPlannerDetailsComponent.A;
        ChaloNavigationManager chaloNavigationManager2 = tripPlannerDetailsComponent.A;
        if (continuationImpl instanceof TripPlannerDetailsComponent$getEffectForTicketNavigation$1) {
            tripPlannerDetailsComponent$getEffectForTicketNavigation$1 = (TripPlannerDetailsComponent$getEffectForTicketNavigation$1) continuationImpl;
            int i = tripPlannerDetailsComponent$getEffectForTicketNavigation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$getEffectForTicketNavigation$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$getEffectForTicketNavigation$1 = new TripPlannerDetailsComponent$getEffectForTicketNavigation$1(tripPlannerDetailsComponent, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$getEffectForTicketNavigation$1 = new TripPlannerDetailsComponent$getEffectForTicketNavigation$1(tripPlannerDetailsComponent, continuationImpl);
        }
        Object objA = tripPlannerDetailsComponent$getEffectForTicketNavigation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerDetailsComponent$getEffectForTicketNavigation$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            GetRouteDetailsPayForTicketFlowTypeUseCase getRouteDetailsPayForTicketFlowTypeUseCase = tripPlannerDetailsComponent.w;
            boolean z = routeAppModel.p.f1713a;
            tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$0 = routeAppModel;
            tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$1 = stopAppModel;
            stopAppModel3 = stopAppModel2;
            tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$2 = stopAppModel3;
            tripPlannerDetailsComponent$getEffectForTicketNavigation$1.label = 1;
            objA = getRouteDetailsPayForTicketFlowTypeUseCase.a(z, tripPlannerDetailsComponent$getEffectForTicketNavigation$1);
            if (objA != coroutineSingletons) {
                stopAppModel4 = stopAppModel;
                routeAppModel2 = routeAppModel;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            StopAppModel stopAppModel7 = (StopAppModel) tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$2;
            stopAppModel4 = (StopAppModel) tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$1;
            routeAppModel2 = (RouteAppModel) tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$0;
            ResultKt.b(objA);
            stopAppModel3 = stopAppModel7;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stopAppModel6 = (StopAppModel) tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$2;
            stopAppModel5 = (StopAppModel) tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$1;
            routeAppModel3 = (RouteAppModel) tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$0;
            ResultKt.b(objA);
        }
        if (!((InstantTicketFeatureConfigForCity) objA).h) {
            instantTicket = TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.INSTANCE;
        } else {
            if (stopAppModel5 != null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    strA4 = json.a(StopAppModel.INSTANCE.serializer(), stopAppModel5);
                } catch (Exception unused) {
                    strA4 = null;
                }
            } else {
                strA4 = null;
            }
            if (stopAppModel6 != null) {
                try {
                    Json json2 = ChaloJson.b;
                    json2.getClass();
                    strA5 = json2.a(StopAppModel.INSTANCE.serializer(), stopAppModel6);
                } catch (Exception unused2) {
                    strA5 = null;
                }
            } else {
                strA5 = null;
            }
            instantTicket = new TicketPurchaseArgs.StopSelectionArgs.InstantTicket(strA4, strA5, routeAppModel3.b);
        }
        ChaloNavigationManagerKt.e(chaloNavigationManager2, instantTicket, null, 6);
        return Unit.f17538a;
        switch (WhenMappings.b[((PayForTicketFlowType) objA).ordinal()]) {
            case 1:
                GetInstantTicketFeatureConfigUseCase getInstantTicketFeatureConfigUseCase = tripPlannerDetailsComponent.x;
                tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$0 = routeAppModel2;
                tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$1 = stopAppModel4;
                tripPlannerDetailsComponent$getEffectForTicketNavigation$1.L$2 = stopAppModel3;
                tripPlannerDetailsComponent$getEffectForTicketNavigation$1.label = 2;
                objA = getInstantTicketFeatureConfigUseCase.a(tripPlannerDetailsComponent$getEffectForTicketNavigation$1);
                if (objA != coroutineSingletons) {
                    stopAppModel5 = stopAppModel4;
                    routeAppModel3 = routeAppModel2;
                    stopAppModel6 = stopAppModel3;
                    if (!((InstantTicketFeatureConfigForCity) objA).h) {
                        if (stopAppModel5 != null) {
                            Json json3 = ChaloJson.b;
                            json3.getClass();
                            strA4 = json3.a(StopAppModel.INSTANCE.serializer(), stopAppModel5);
                        } else {
                            strA4 = null;
                        }
                        if (stopAppModel6 != null) {
                            Json json4 = ChaloJson.b;
                            json4.getClass();
                            strA5 = json4.a(StopAppModel.INSTANCE.serializer(), stopAppModel6);
                        } else {
                            strA5 = null;
                        }
                        instantTicket = new TicketPurchaseArgs.StopSelectionArgs.InstantTicket(strA4, strA5, routeAppModel3.b);
                        break;
                    } else {
                        instantTicket = TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.INSTANCE;
                    }
                    ChaloNavigationManagerKt.e(chaloNavigationManager2, instantTicket, null, 6);
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 2:
                ChaloNavigationManagerKt.e(chaloNavigationManager2, new TicketPurchaseArgs.QuickPayArgs(Source.TRIP_PLANNER_DETAILS), null, 6);
                return Unit.f17538a;
            case 3:
                try {
                    Json json5 = ChaloJson.b;
                    json5.getClass();
                    strA2 = json5.a(RouteAppModel.INSTANCE.serializer(), routeAppModel2);
                    break;
                } catch (Exception unused3) {
                    strA2 = null;
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.PayForTicketArgs((Source) null, strA2, 1), null, null, 6));
                return Unit.f17538a;
            case 4:
                try {
                    Json json6 = ChaloJson.b;
                    json6.getClass();
                    strA3 = json6.a(RouteAppModel.INSTANCE.serializer(), routeAppModel2);
                } catch (Exception unused4) {
                    strA3 = null;
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(strA3, null, Source.ROUTE_DETAILS, null, false, null, 238), null, null, 6));
                return Unit.f17538a;
            case 5:
                try {
                    Json json7 = ChaloJson.b;
                    json7.getClass();
                    strA = json7.a(RouteAppModel.INSTANCE.serializer(), routeAppModel2);
                    break;
                } catch (Exception unused5) {
                    strA = null;
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.MTicketTripInfoArgs(Source.TRIP_PLANNER_DETAILS, strA, null), null, null, 6));
                return Unit.f17538a;
            case 6:
                tripPlannerDetailsComponent.C.a();
                return Unit.f17538a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x013c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0164  */
    /* JADX WARN: Code duplicated, block: B:29:0x0166  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object H0(TripPlannerDetailsComponent tripPlannerDetailsComponent, TripPlannerLegAppModel.Bus bus, RouteAppModel routeAppModel, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1 tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1;
        Pair[] pairArr;
        String str;
        RouteAppModel routeAppModel2;
        TripPlannerLegAppModel.Bus bus2;
        int i;
        TimeUtilsContract timeUtilsContract;
        Pair[] pairArr2;
        String str2;
        int i2;
        Pair[] pairArr3;
        Pair[] pairArr4;
        RouteAppModel routeAppModel3;
        TripPlannerLegAppModel.Bus bus3;
        LinkedHashMap linkedHashMapK;
        boolean z;
        BasicInfoContract basicInfoContract = tripPlannerDetailsComponent.q;
        TimeUtilsContract timeUtilsContract2 = tripPlannerDetailsComponent.D;
        if (continuationImpl instanceof TripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1) {
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1 = (TripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1) continuationImpl;
            int i3 = tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1 = new TripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1(tripPlannerDetailsComponent, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1 = new TripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1(tripPlannerDetailsComponent, continuationImpl);
        }
        Object obj = tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            pairArr = new Pair[7];
            Boolean bool = (Boolean) tripPlannerDetailsComponent.O.getValue();
            bool.getClass();
            pairArr[0] = new Pair("isUserLoggedIn", bool);
            pairArr[1] = new Pair("city", String.valueOf(CityProviderKt.b(tripPlannerDetailsComponent.u)));
            pairArr[2] = new Pair("agency", routeAppModel.j);
            pairArr[3] = new Pair("upTripRouteId", routeAppModel.b);
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$0 = bus;
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$1 = routeAppModel;
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$2 = pairArr;
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$3 = pairArr;
            str = "time";
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$4 = "time";
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$5 = timeUtilsContract2;
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.I$0 = 4;
            tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.label = 1;
            Object objC = basicInfoContract.c(tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1);
            if (objC != coroutineSingletons) {
                routeAppModel2 = routeAppModel;
                bus2 = bus;
                i = 4;
                obj = objC;
                timeUtilsContract = timeUtilsContract2;
                pairArr2 = pairArr;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            i = tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.I$0;
            timeUtilsContract = (TimeUtilsContract) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$5;
            str = (String) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$4;
            Pair[] pairArr5 = (Pair[]) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$3;
            Pair[] pairArr6 = (Pair[]) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$2;
            routeAppModel2 = (RouteAppModel) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$1;
            bus2 = (TripPlannerLegAppModel.Bus) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$0;
            ResultKt.b(obj);
            pairArr2 = pairArr5;
            pairArr = pairArr6;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.I$0;
            timeUtilsContract2 = (TimeUtilsContract) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$5;
            str2 = (String) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$4;
            pairArr3 = (Pair[]) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$3;
            pairArr4 = (Pair[]) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$2;
            routeAppModel3 = (RouteAppModel) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$1;
            bus3 = (TripPlannerLegAppModel.Bus) tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$0;
            ResultKt.b(obj);
        }
        pairArr3[i2] = new Pair(str2, timeUtilsContract2.Q(((Number) obj).longValue()));
        pairArr4[6] = new Pair("routeName", routeAppModel3.c);
        linkedHashMapK = MapsKt.k(pairArr4);
        if (bus3 != null) {
            StopAppModel stopAppModel = bus3.t;
            StopAppModel stopAppModel2 = bus3.s;
            linkedHashMapK.put("fromStopName", stopAppModel2.f1727a);
            linkedHashMapK.put("toStopName", stopAppModel.f1727a);
            linkedHashMapK.put("fromStopId", stopAppModel2.f1727a);
            linkedHashMapK.put("toStopId", stopAppModel.f1727a);
            if (bus3.G == RouteServiceType.PREMIUM) {
                z = true;
            } else {
                z = false;
            }
            linkedHashMapK.put("isChaloBusRoute", String.valueOf(z));
        }
        AnalyticsContract.DefaultImpls.a(tripPlannerDetailsComponent.l, "trip details buy product button clicked", Source.TRIP_PLANNER_DETAILS.getSourceName(), linkedHashMapK, null, false, 24);
        return Unit.f17538a;
        pairArr2[i] = new Pair(str, timeUtilsContract.e(((Number) obj).longValue()));
        tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$0 = bus2;
        tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$1 = routeAppModel2;
        tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$2 = pairArr;
        tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$3 = pairArr;
        tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$4 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.L$5 = timeUtilsContract2;
        tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.I$0 = 5;
        tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1.label = 2;
        Object objC2 = basicInfoContract.c(tripPlannerDetailsComponent$raiseBuyProductButtonClickedEvent$1);
        if (objC2 != coroutineSingletons) {
            str2 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
            i2 = 5;
            obj = objC2;
            pairArr3 = pairArr;
            pairArr4 = pairArr3;
            routeAppModel3 = routeAppModel2;
            bus3 = bus2;
            pairArr3[i2] = new Pair(str2, timeUtilsContract2.Q(((Number) obj).longValue()));
            pairArr4[6] = new Pair("routeName", routeAppModel3.c);
            linkedHashMapK = MapsKt.k(pairArr4);
            if (bus3 != null) {
                StopAppModel stopAppModel3 = bus3.t;
                StopAppModel stopAppModel4 = bus3.s;
                linkedHashMapK.put("fromStopName", stopAppModel4.f1727a);
                linkedHashMapK.put("toStopName", stopAppModel3.f1727a);
                linkedHashMapK.put("fromStopId", stopAppModel4.f1727a);
                linkedHashMapK.put("toStopId", stopAppModel3.f1727a);
                if (bus3.G == RouteServiceType.PREMIUM) {
                    z = true;
                } else {
                    z = false;
                }
                linkedHashMapK.put("isChaloBusRoute", String.valueOf(z));
            }
            AnalyticsContract.DefaultImpls.a(tripPlannerDetailsComponent.l, "trip details buy product button clicked", Source.TRIP_PLANNER_DETAILS.getSourceName(), linkedHashMapK, null, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object I0(TripPlannerDetailsComponent tripPlannerDetailsComponent, RouteAppModel routeAppModel, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1 tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1;
        String sourceName;
        Pair[] pairArr;
        String str;
        int i;
        AnalyticsContract analyticsContract;
        Pair[] pairArr2;
        String str2;
        TimeUtilsContract timeUtilsContract;
        String str3;
        int i2;
        String str4;
        String str5;
        AnalyticsContract analyticsContract2;
        Pair[] pairArr3;
        Pair[] pairArr4;
        BasicInfoContract basicInfoContract = tripPlannerDetailsComponent.q;
        TimeUtilsContract timeUtilsContract2 = tripPlannerDetailsComponent.D;
        if (continuationImpl instanceof TripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1) {
            tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1 = (TripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1) continuationImpl;
            int i3 = tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1 = new TripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1(tripPlannerDetailsComponent, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1 = new TripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1(tripPlannerDetailsComponent, continuationImpl);
        }
        Object objC = tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.label;
        if (i4 != 0) {
            if (i4 == 1) {
                i = tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.I$0;
                timeUtilsContract = (TimeUtilsContract) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$6;
                String str6 = (String) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$5;
                Pair[] pairArr5 = (Pair[]) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$4;
                String str7 = (String) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$3;
                str = (String) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$2;
                analyticsContract = (AnalyticsContract) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$1;
                pairArr2 = (Pair[]) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$0;
                ResultKt.b(objC);
                str2 = str6;
                sourceName = str7;
                pairArr = pairArr5;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.I$0;
                timeUtilsContract2 = (TimeUtilsContract) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$6;
                str3 = (String) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$5;
                pairArr3 = (Pair[]) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$4;
                String str8 = (String) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$3;
                str5 = (String) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$2;
                AnalyticsContract analyticsContract3 = (AnalyticsContract) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$1;
                pairArr4 = (Pair[]) tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$0;
                ResultKt.b(objC);
                str4 = str8;
                analyticsContract2 = analyticsContract3;
            }
            pairArr3[i2] = new Pair(str3, timeUtilsContract2.Q(((Number) objC).longValue()));
            AnalyticsContract.DefaultImpls.a(analyticsContract2, str5, str4, MapsKt.i(pairArr4), null, false, 24);
            return Unit.f17538a;
        }
        ResultKt.b(objC);
        AnalyticsContract analyticsContract4 = tripPlannerDetailsComponent.l;
        sourceName = Source.TRIP_PLANNER_DETAILS.getSourceName();
        pairArr = new Pair[6];
        Boolean bool = (Boolean) tripPlannerDetailsComponent.O.getValue();
        bool.getClass();
        pairArr[0] = new Pair("isUserLoggedIn", bool);
        pairArr[1] = new Pair("city", String.valueOf(CityProviderKt.b(tripPlannerDetailsComponent.u)));
        pairArr[2] = new Pair("agency", routeAppModel.j);
        pairArr[3] = new Pair("upTripRouteId", routeAppModel.b);
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$0 = pairArr;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$1 = analyticsContract4;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$2 = "trip details track bus button clicked";
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$3 = sourceName;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$4 = pairArr;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$5 = "time";
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$6 = timeUtilsContract2;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.I$0 = 4;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.label = 1;
        Object objC2 = basicInfoContract.c(tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1);
        if (objC2 != coroutineSingletons) {
            str = "trip details track bus button clicked";
            i = 4;
            analyticsContract = analyticsContract4;
            objC = objC2;
            pairArr2 = pairArr;
            str2 = "time";
            timeUtilsContract = timeUtilsContract2;
        }
        return coroutineSingletons;
        pairArr[i] = new Pair(str2, timeUtilsContract.e(((Number) objC).longValue()));
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$0 = pairArr2;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$1 = analyticsContract;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$2 = str;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$3 = sourceName;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$4 = pairArr2;
        str3 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$5 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.L$6 = timeUtilsContract2;
        i2 = 5;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.I$0 = 5;
        tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1.label = 2;
        objC = basicInfoContract.c(tripPlannerDetailsComponent$raiseTrackBusButtonClickedEvent$1);
        if (objC != coroutineSingletons) {
            str4 = sourceName;
            str5 = str;
            analyticsContract2 = analyticsContract;
            pairArr3 = pairArr2;
            pairArr4 = pairArr3;
            pairArr3[i2] = new Pair(str3, timeUtilsContract2.Q(((Number) objC).longValue()));
            AnalyticsContract.DefaultImpls.a(analyticsContract2, str5, str4, MapsKt.i(pairArr4), null, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc A[Catch: all -> 0x0111, CancellationException -> 0x012c, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:19:0x0048, B:55:0x00f3, B:58:0x00fc, B:52:0x00e2, B:29:0x0076, B:35:0x0093, B:38:0x00a4, B:39:0x00ad, B:41:0x00b3, B:42:0x00c2, B:45:0x00c9, B:47:0x00cf, B:32:0x007d), top: B:70:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v4, types: [app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [app.chalo.livetracking.tripplanner.domain.BuildEligibleGroupTicketJourneyModelUseCase] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object J0(TripPlannerDetailsComponent tripPlannerDetailsComponent, TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel, long j, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1 tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1;
        ?? r12;
        Map map;
        GroupTicketJourneyModel groupTicketJourneyModel;
        TripPlannerPurchaseHooksUiState tripPlannerPurchaseHooksUiStateU0;
        ?? r13;
        Map map2;
        Map map3;
        ?? r2;
        ?? r14;
        LinkedHashMap linkedHashMap;
        tripPlannerDetailsComponent.getClass();
        if (continuationImpl instanceof TripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1) {
            tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1 = (TripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1) continuationImpl;
            int i = tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1 = new TripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1(tripPlannerDetailsComponent, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1 = new TripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1(tripPlannerDetailsComponent, continuationImpl);
        }
        Object objD = tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label;
        Unit unit = Unit.f17538a;
        try {
            try {
                if (r3 != 0) {
                    if (r3 != 1) {
                        try {
                            if (r3 == 2) {
                                j = tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0;
                                Map map4 = (Map) tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1;
                                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel2 = (TripPlannerItineraryAppResponseModel) tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0;
                                ResultKt.b(objD);
                                r2 = tripPlannerItineraryAppResponseModel2;
                                map3 = map4;
                                map2 = map3;
                                r13 = r2;
                                map2 = linkedHashMap;
                                r13 = r14;
                                ?? r15 = tripPlannerDetailsComponent.y;
                                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0 = r13;
                                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1 = map2;
                                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0 = j;
                                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = 3;
                                objD = r15.a(r13, map2, tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1);
                                map = map2;
                                r12 = r13;
                                if (objD == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                groupTicketJourneyModel = (GroupTicketJourneyModel) objD;
                                if (tripPlannerDetailsComponent.R0(r12, j)) {
                                    tripPlannerDetailsComponent.M = groupTicketJourneyModel;
                                    tripPlannerPurchaseHooksUiStateU0 = tripPlannerDetailsComponent.U0(r12, map, groupTicketJourneyModel);
                                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0 = r12;
                                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1 = null;
                                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0 = j;
                                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = 4;
                                    if (tripPlannerDetailsComponent.X0(tripPlannerPurchaseHooksUiStateU0, tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return unit;
                            }
                            if (r3 == 3) {
                                j = tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0;
                                Map map5 = (Map) tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1;
                                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel3 = (TripPlannerItineraryAppResponseModel) tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0;
                                ResultKt.b(objD);
                                map = map5;
                                r12 = tripPlannerItineraryAppResponseModel3;
                                groupTicketJourneyModel = (GroupTicketJourneyModel) objD;
                                if (tripPlannerDetailsComponent.R0(r12, j)) {
                                    tripPlannerDetailsComponent.M = groupTicketJourneyModel;
                                    tripPlannerPurchaseHooksUiStateU0 = tripPlannerDetailsComponent.U0(r12, map, groupTicketJourneyModel);
                                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0 = r12;
                                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1 = null;
                                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0 = j;
                                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = 4;
                                    if (tripPlannerDetailsComponent.X0(tripPlannerPurchaseHooksUiStateU0, tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return unit;
                            }
                            if (r3 == 4) {
                                long j2 = tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0;
                                ResultKt.b(objD);
                            } else {
                                if (r3 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(objD);
                            }
                        } catch (Throwable unused) {
                            tripPlannerItineraryAppResponseModel = r3;
                            if (tripPlannerDetailsComponent.R0(tripPlannerItineraryAppResponseModel, j)) {
                                tripPlannerDetailsComponent.L = null;
                                tripPlannerDetailsComponent.M = null;
                                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0 = null;
                                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1 = null;
                                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = 5;
                                if (tripPlannerDetailsComponent.X0(TripPlannerPurchaseHooksUiState.ResolvedNone.f4743a, tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    } else {
                        j = tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0;
                        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel4 = (TripPlannerItineraryAppResponseModel) tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0;
                        ResultKt.b(objD);
                        r14 = tripPlannerItineraryAppResponseModel4;
                    }
                    return unit;
                }
                ResultKt.b(objD);
                CityDataManagerKotlin cityDataManagerKotlin = tripPlannerDetailsComponent.n;
                List listQ0 = Q0(tripPlannerItineraryAppResponseModel.f);
                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0 = tripPlannerItineraryAppResponseModel;
                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0 = j;
                tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = 1;
                objD = cityDataManagerKotlin.d(listQ0, tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1);
                r14 = tripPlannerItineraryAppResponseModel;
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Iterable iterable = (Iterable) objD;
                int iG = MapsKt.g(CollectionsKt.v(iterable, 10));
                if (iG < 16) {
                    iG = 16;
                }
                linkedHashMap = new LinkedHashMap(iG);
                for (Object obj : iterable) {
                    linkedHashMap.put(((RouteAppModel) obj).b, (RouteAppModel) obj);
                }
                if (tripPlannerDetailsComponent.R0(r14, j)) {
                    tripPlannerDetailsComponent.L = linkedHashMap;
                    if (tripPlannerDetailsComponent.Q) {
                        tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0 = r14;
                        tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1 = linkedHashMap;
                        tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0 = j;
                        tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = 2;
                        if (tripPlannerDetailsComponent.W0(tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1) == coroutineSingletons) {
                            map2 = linkedHashMap;
                            r13 = r14;
                            return coroutineSingletons;
                        }
                        map2 = linkedHashMap;
                        r13 = r14;
                        r2 = r14;
                        map3 = linkedHashMap;
                        map2 = map3;
                        r13 = r2;
                    }
                    map2 = linkedHashMap;
                    r13 = r14;
                    ?? r16 = tripPlannerDetailsComponent.y;
                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0 = r13;
                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1 = map2;
                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0 = j;
                    tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = 3;
                    objD = r16.a(r13, map2, tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1);
                    map = map2;
                    r12 = r13;
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    groupTicketJourneyModel = (GroupTicketJourneyModel) objD;
                    if (tripPlannerDetailsComponent.R0(r12, j)) {
                        tripPlannerDetailsComponent.M = groupTicketJourneyModel;
                        tripPlannerPurchaseHooksUiStateU0 = tripPlannerDetailsComponent.U0(r12, map, groupTicketJourneyModel);
                        tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$0 = r12;
                        tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.L$1 = null;
                        tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.J$0 = j;
                        tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1.label = 4;
                        if (tripPlannerDetailsComponent.X0(tripPlannerPurchaseHooksUiStateU0, tripPlannerDetailsComponent$resolveRouteInfoAndPurchaseHooks$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return unit;
                    }
                }
                return unit;
            } catch (Throwable unused2) {
            }
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object K0(TripPlannerDetailsComponent tripPlannerDetailsComponent, List list, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$startLiveInfoFetchJob$1 tripPlannerDetailsComponent$startLiveInfoFetchJob$1;
        tripPlannerDetailsComponent.getClass();
        if (continuationImpl instanceof TripPlannerDetailsComponent$startLiveInfoFetchJob$1) {
            tripPlannerDetailsComponent$startLiveInfoFetchJob$1 = (TripPlannerDetailsComponent$startLiveInfoFetchJob$1) continuationImpl;
            int i = tripPlannerDetailsComponent$startLiveInfoFetchJob$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$startLiveInfoFetchJob$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$startLiveInfoFetchJob$1 = new TripPlannerDetailsComponent$startLiveInfoFetchJob$1(tripPlannerDetailsComponent, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$startLiveInfoFetchJob$1 = new TripPlannerDetailsComponent$startLiveInfoFetchJob$1(tripPlannerDetailsComponent, continuationImpl);
        }
        Object objP0 = tripPlannerDetailsComponent$startLiveInfoFetchJob$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerDetailsComponent$startLiveInfoFetchJob$1.label;
        if (i2 == 0) {
            ResultKt.b(objP0);
            tripPlannerDetailsComponent$startLiveInfoFetchJob$1.label = 1;
            objP0 = tripPlannerDetailsComponent.P0(list, tripPlannerDetailsComponent$startLiveInfoFetchJob$1);
            if (objP0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP0);
        }
        List list2 = (List) objP0;
        Job job = tripPlannerDetailsComponent.G;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        tripPlannerDetailsComponent.s.c(list2, 10800);
        tripPlannerDetailsComponent.G = BuildersKt.d(tripPlannerDetailsComponent.j, null, null, new TripPlannerDetailsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1(tripPlannerDetailsComponent, null), 3);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object L0(TripPlannerDetailsComponent tripPlannerDetailsComponent, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1 tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1;
        LatLng latLng;
        tripPlannerDetailsComponent.getClass();
        if (continuationImpl instanceof TripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1) {
            tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1 = (TripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1) continuationImpl;
            int i = tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1 = new TripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1(tripPlannerDetailsComponent, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1 = new TripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1(tripPlannerDetailsComponent, continuationImpl);
        }
        Object obj = tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            CityAppModel cityAppModel = (CityAppModel) tripPlannerDetailsComponent.u.getE().getValue();
            LatLng latLng2 = cityAppModel != null ? cityAppModel.d : null;
            ArePermissionsGrantedUseCase arePermissionsGrantedUseCase = tripPlannerDetailsComponent.v;
            List listR = CollectionsKt.R(AppPermission.FINE_LOCATION);
            tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1.L$0 = latLng2;
            tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1.label = 1;
            Object objA = arePermissionsGrantedUseCase.a(listR, tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            latLng = latLng2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            latLng = (LatLng) tripPlannerDetailsComponent$updateMapCameraViewStateToCityCenter$1.L$0;
            ResultKt.b(obj);
        }
        tripPlannerDetailsComponent.E0(new n8(((AppPermissionRequest) obj).b.isEmpty(), latLng, 13));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r11 == r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent r9, app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$updateTripPlannerLegUiModelMap$1
            if (r0 == 0) goto L17
            r0 = r11
            app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$updateTripPlannerLegUiModelMap$1 r0 = (app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$updateTripPlannerLegUiModelMap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.label = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$updateTripPlannerLegUiModelMap$1 r0 = new app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$updateTripPlannerLegUiModelMap$1
            r0.<init>(r9, r11)
            goto L15
        L1d:
            java.lang.Object r11 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r7 = 0
            r2 = 2
            r8 = 0
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.ResultKt.b(r11)
            goto L72
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r10 = r6.L$1
            app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel r10 = (app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel) r10
            java.lang.Object r1 = r6.L$0
            app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase r1 = (app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase) r1
            kotlin.ResultKt.b(r11)
            goto L5d
        L45:
            kotlin.ResultKt.b(r11)
            app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase r1 = r9.p
            app.chalo.providers.stringprovider.StringProvider r11 = r9.r
            app.chalo.providers.stringprovider.StringEnum r4 = app.chalo.providers.stringprovider.StringEnum.VIEW_ROUTE
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r6.L$0 = r1
            r6.L$1 = r10
            r6.label = r3
            java.lang.Object r11 = r11.b(r4, r5, r6)
            if (r11 != r0) goto L5d
            goto L71
        L5d:
            r3 = r11
            java.lang.String r3 = (java.lang.String) r3
            app.chalo.providers.stringprovider.StringEnum r4 = app.chalo.providers.stringprovider.StringEnum.SCHEDULED_EVERY_X
            app.chalo.providers.stringprovider.StringEnum r5 = app.chalo.providers.stringprovider.StringEnum.SCHEDULED_FOR_X
            r6.L$0 = r8
            r6.L$1 = r8
            r6.label = r2
            r2 = r10
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L72
        L71:
            return r0
        L72:
            app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel r11 = (app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel) r11
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.List r0 = r11.g
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L81:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r0.next()
            int r2 = r7 + 1
            if (r7 < 0) goto L9a
            app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel r1 = (app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel) r1
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r10.put(r3, r1)
            r7 = r2
            goto L81
        L9a:
            kotlin.collections.CollectionsKt.z0()
            throw r8
        L9e:
            r9.I = r10
            oz0 r10 = new oz0
            r0 = 1
            r10.<init>(r11, r0)
            r9.E0(r10)
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent.M0(app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent, app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static List Q0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (TripPlannerResultAppResponseModelKt.h((TripPlannerLegAppModel) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            TripPlannerLegAppModel tripPlannerLegAppModel = (TripPlannerLegAppModel) obj2;
            String str = tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus ? ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel).p : tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro ? ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel).p : null;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return CollectionsKt.z(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        if (r13 == r1) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(app.chalo.citydata.data.model.app.RouteAppModel r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent.N0(app.chalo.citydata.data.model.app.RouteAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final TripPlannerLegAppModel.Bus O0(String str) {
        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = this.K;
        Object obj = null;
        if (tripPlannerItineraryAppResponseModel == null) {
            return null;
        }
        List list = tripPlannerItineraryAppResponseModel.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof TripPlannerLegAppModel.Bus) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (Intrinsics.d(((TripPlannerLegAppModel.Bus) obj3).p, str)) {
                obj = obj3;
                break;
            }
        }
        return (TripPlannerLegAppModel.Bus) obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object P0(List list, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1 tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1;
        List listL;
        Ref.DoubleRef doubleRef;
        Ref.DoubleRef doubleRef2;
        List list2;
        long jLongValue;
        int i;
        int i2;
        TripPlannerLegAppModel tripPlannerLegAppModel;
        Double d;
        double dDoubleValue;
        if (continuationImpl instanceof TripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1) {
            tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1 = (TripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1) continuationImpl;
            int i3 = tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.label = i3 - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1 = new TripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1(this, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1 = new TripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1(this, continuationImpl);
        }
        Object obj = tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.label;
        if (i4 == 0) {
            listL = py.l(obj);
            doubleRef = new Ref.DoubleRef();
            Long l = this.P;
            if (l != null) {
                jLongValue = l.longValue();
                list2 = list;
            } else {
                tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.L$0 = list;
                tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.L$1 = listL;
                tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.L$2 = doubleRef;
                tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.label = 1;
                Object objC = this.q.c(tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                doubleRef2 = doubleRef;
                obj = objC;
                list2 = list;
            }
            i = 0;
            for (Object obj2 : list2) {
                i2 = i + 1;
                if (i >= 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                tripPlannerLegAppModel = (TripPlannerLegAppModel) obj2;
                if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                    long j = (((long) doubleRef.element) * ((long) 1000)) + jLongValue;
                    String strValueOf = String.valueOf(i);
                    TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
                    listL.add(new ItineraryLiveInfoRequest.FirstValidVehicle(j, strValueOf, bus.p, bus.s.f1727a));
                }
                double d2 = doubleRef.element;
                d = tripPlannerLegAppModel.getD();
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                doubleRef.element = d2 + dDoubleValue;
                i = i2;
            }
            return listL;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        doubleRef2 = (Ref.DoubleRef) tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.L$2;
        listL = (List) tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.L$1;
        list2 = (List) tripPlannerDetailsComponent$getLiveInfoFetchRequestForRelevantLegs$1.L$0;
        ResultKt.b(obj);
        jLongValue = ((Number) obj).longValue();
        doubleRef = doubleRef2;
        i = 0;
        while (r2.hasNext()) {
            i2 = i + 1;
            if (i >= 0) {
                CollectionsKt.z0();
                throw null;
            }
            tripPlannerLegAppModel = (TripPlannerLegAppModel) obj2;
            if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                long j2 = (((long) doubleRef.element) * ((long) 1000)) + jLongValue;
                String strValueOf2 = String.valueOf(i);
                TripPlannerLegAppModel.Bus bus2 = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
                listL.add(new ItineraryLiveInfoRequest.FirstValidVehicle(j2, strValueOf2, bus2.p, bus2.s.f1727a));
            }
            double d3 = doubleRef.element;
            d = tripPlannerLegAppModel.getD();
            if (d != null) {
                dDoubleValue = d.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            doubleRef.element = d3 + dDoubleValue;
            i = i2;
        }
        return listL;
    }

    public final boolean R0(TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel, long j) {
        if (this.N != j) {
            return false;
        }
        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel2 = this.K;
        return Intrinsics.d(tripPlannerItineraryAppResponseModel2 != null ? tripPlannerItineraryAppResponseModel2.f4663a : null, tripPlannerItineraryAppResponseModel.f4663a);
    }

    public final void S0(TripPlannerDetailsIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        if (intent.equals(TripPlannerDetailsIntent.BackButtonClickedIntent.f4725a)) {
            ChaloNavigationManagerKt.c(this.A);
            return;
        }
        boolean z = intent instanceof TripPlannerDetailsIntent.BuyTicketClickedIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new TripPlannerDetailsComponent$handleBuyTicketClickedIntent$1(this, (TripPlannerDetailsIntent.BuyTicketClickedIntent) intent, null), 3);
            return;
        }
        if (intent.equals(TripPlannerDetailsIntent.CombinedBuyTicketClickedIntent.f4729a)) {
            BuildersKt.d(contextScope, null, null, new TripPlannerDetailsComponent$handleCombinedBuyTicketClickedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof TripPlannerDetailsIntent.InitializationIntent) {
            AnalyticsContract.DefaultImpls.a(this.l, "trip details activity opened", Source.TRIP_PLANNER_DETAILS.getSourceName(), null, null, false, 28);
            BuildersKt.d(contextScope, null, null, new TripPlannerDetailsComponent$handleInitializationIntent$1(this, (TripPlannerDetailsIntent.InitializationIntent) intent, null), 3);
            return;
        }
        if (intent instanceof TripPlannerDetailsIntent.TrackBusClickedIntent) {
            BuildersKt.d(contextScope, null, null, new TripPlannerDetailsComponent$handleTrackBusClickedIntent$1(this, (TripPlannerDetailsIntent.TrackBusClickedIntent) intent, null), 3);
            return;
        }
        if (intent.equals(TripPlannerDetailsIntent.FragmentStartedIntent.f4730a)) {
            BuildersKt.d(contextScope, null, null, new TripPlannerDetailsComponent$handleFragmentStartedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(TripPlannerDetailsIntent.FragmentStoppedIntent.f4731a)) {
            Job job = this.G;
            if (job != null) {
                ((JobSupport) job).cancel(null);
                return;
            }
            return;
        }
        if (intent.equals(TripPlannerDetailsIntent.OnMapLoaded.f4736a)) {
            BuildersKt.d(contextScope, null, null, new TripPlannerDetailsComponent$handleOnMapLoadedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof TripPlannerDetailsIntent.MapMarkerClickedIntent) {
            AnalyticsContract.DefaultImpls.a(this.l, "trip planner map marker clicked", Source.TRIP_PLANNER_DETAILS.getSourceName(), MapsKt.d(), null, false, 24);
            return;
        }
        if (intent instanceof TripPlannerDetailsIntent.BuyMetroTicketClickedIntent) {
            MetroGroupLegAppModel metroGroupLegAppModel = (MetroGroupLegAppModel) this.S.get(((TripPlannerDetailsIntent.BuyMetroTicketClickedIntent) intent).f4727a);
            if (metroGroupLegAppModel == null) {
                V0();
                return;
            } else if (metroGroupLegAppModel.c == 0) {
                S0(new TripPlannerDetailsIntent.BuyMetroTicketBottomSheetClickedIntent(metroGroupLegAppModel.f4719a, metroGroupLegAppModel.b));
                return;
            } else {
                E0(new sh1(metroGroupLegAppModel, 9));
                return;
            }
        }
        if (intent instanceof TripPlannerDetailsIntent.BuyMetroTicketBottomSheetClickedIntent) {
            BuildersKt.d(contextScope, null, null, new TripPlannerDetailsComponent$handleBuyMetroTicketBottomSheetClickedIntent$1(this, (TripPlannerDetailsIntent.BuyMetroTicketBottomSheetClickedIntent) intent, null), 3);
        } else if (intent.equals(TripPlannerDetailsIntent.MetroTicketPurchaseBottomSheetCancelClickedIntent.f4734a)) {
            E0(new xj1(7));
        } else {
            if (!intent.equals(TripPlannerDetailsIntent.MetroTicketPurchaseBottomSheetDismissIntent.f4735a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new xj1(7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object T0(RouteAppModel routeAppModel, ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1 tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1;
        Pair[] pairArr;
        Pair[] pairArr2;
        String str;
        String str2;
        AnalyticsContract analyticsContract;
        int i;
        String str3;
        TimeUtilsContract timeUtilsContract;
        String str4;
        int i2;
        String str5;
        AnalyticsContract analyticsContract2;
        Pair[] pairArr3;
        Pair[] pairArr4;
        if (continuationImpl instanceof TripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1) {
            tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1 = (TripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1) continuationImpl;
            int i3 = tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1 = new TripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1(this, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1 = new TripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1(this, continuationImpl);
        }
        Object obj = tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.label;
        BasicInfoContract basicInfoContract = this.q;
        TimeUtilsContract timeUtilsContract2 = this.D;
        if (i4 != 0) {
            if (i4 == 1) {
                i = tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.I$0;
                timeUtilsContract = (TimeUtilsContract) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$6;
                String str6 = (String) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$5;
                Pair[] pairArr5 = (Pair[]) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$4;
                str2 = (String) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$3;
                str3 = (String) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$2;
                AnalyticsContract analyticsContract3 = (AnalyticsContract) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$1;
                pairArr2 = (Pair[]) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$0;
                ResultKt.b(obj);
                str = str6;
                analyticsContract = analyticsContract3;
                pairArr = pairArr5;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.I$0;
                timeUtilsContract2 = (TimeUtilsContract) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$6;
                str4 = (String) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$5;
                pairArr4 = (Pair[]) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$4;
                String str7 = (String) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$3;
                String str8 = (String) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$2;
                AnalyticsContract analyticsContract4 = (AnalyticsContract) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$1;
                pairArr3 = (Pair[]) tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$0;
                ResultKt.b(obj);
                str3 = str8;
                str5 = str7;
                analyticsContract2 = analyticsContract4;
            }
            pairArr4[i2] = new Pair(str4, timeUtilsContract2.Q(((Number) obj).longValue()));
            AnalyticsContract.DefaultImpls.a(analyticsContract2, str3, str5, MapsKt.i(pairArr3), null, false, 24);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        String sourceName = Source.TRIP_PLANNER_DETAILS.getSourceName();
        Pair[] pairArr6 = new Pair[6];
        Boolean bool = (Boolean) this.O.getValue();
        bool.getClass();
        pairArr6[0] = new Pair("isUserLoggedIn", bool);
        pairArr6[1] = new Pair("city", String.valueOf(CityProviderKt.b(this.u)));
        pairArr6[2] = new Pair("agency", routeAppModel.j);
        pairArr6[3] = new Pair("upTripRouteId", routeAppModel.b);
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$0 = pairArr6;
        AnalyticsContract analyticsContract5 = this.l;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$1 = analyticsContract5;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$2 = "mticket hook trip details rendered";
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$3 = sourceName;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$4 = pairArr6;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$5 = "time";
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$6 = timeUtilsContract2;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.I$0 = 4;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.label = 1;
        Object objC = basicInfoContract.c(tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1);
        if (objC != coroutineSingletons) {
            pairArr = pairArr6;
            pairArr2 = pairArr;
            str = "time";
            str2 = sourceName;
            obj = objC;
            analyticsContract = analyticsContract5;
            i = 4;
            str3 = "mticket hook trip details rendered";
            timeUtilsContract = timeUtilsContract2;
        }
        return coroutineSingletons;
        AnalyticsContract analyticsContract6 = analyticsContract;
        pairArr[i] = new Pair(str, timeUtilsContract.e(((Number) obj).longValue()));
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$0 = pairArr2;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$1 = analyticsContract6;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$2 = str3;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$3 = str2;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$4 = pairArr2;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$5 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.L$6 = timeUtilsContract2;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.I$0 = 5;
        tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1.label = 2;
        Object objC2 = basicInfoContract.c(tripPlannerDetailsComponent$raiseMTicketHookTripDetailsRenderedEvent$1);
        if (objC2 != coroutineSingletons) {
            str4 = CLConstants.SHARED_PREFERENCE_ITEM_DATE;
            i2 = 5;
            obj = objC2;
            str5 = str2;
            analyticsContract2 = analyticsContract6;
            pairArr3 = pairArr2;
            pairArr4 = pairArr3;
            pairArr4[i2] = new Pair(str4, timeUtilsContract2.Q(((Number) obj).longValue()));
            AnalyticsContract.DefaultImpls.a(analyticsContract2, str3, str5, MapsKt.i(pairArr3), null, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    public final TripPlannerPurchaseHooksUiState U0(TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel, Map map, GroupTicketJourneyModel groupTicketJourneyModel) {
        if (groupTicketJourneyModel != null) {
            return TripPlannerPurchaseHooksUiState.ResolvedCombined.f4742a;
        }
        List<TripPlannerLegAppModel> list = tripPlannerItineraryAppResponseModel.f;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (TripPlannerLegAppModel tripPlannerLegAppModel : list) {
                if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                    RouteAppModel routeAppModel = (RouteAppModel) map.get(((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel).p);
                    if (routeAppModel != null) {
                        RouteLiveDetailsAppModel routeLiveDetailsAppModel = routeAppModel.p;
                        RouteBookingType routeBookingTypeA = ExtensionsKt.a(routeLiveDetailsAppModel);
                        if ((routeLiveDetailsAppModel.f1713a && ((Boolean) this.R.getValue()).booleanValue()) || routeBookingTypeA != null) {
                            return TripPlannerPurchaseHooksUiState.ResolvedPerLeg.f4744a;
                        }
                    } else {
                        continue;
                    }
                } else if ((tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro) && ProductBookingHelperKt.a(this.z.d()) != null) {
                    return TripPlannerPurchaseHooksUiState.ResolvedPerLeg.f4744a;
                }
            }
        }
        return TripPlannerPurchaseHooksUiState.ResolvedNone.f4743a;
    }

    public final void V0() {
        List list;
        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = this.K;
        if (tripPlannerItineraryAppResponseModel == null || (list = tripPlannerItineraryAppResponseModel.f) == null) {
            return;
        }
        ArrayList arrayListE = TripPlannerResultAppResponseModelKt.e(list);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            List list2 = (List) obj;
            MetroGroupLegAppModel metroGroupLegAppModel = new MetroGroupLegAppModel(list2.size() - 1, ((TripPlannerLegAppModel.Metro) CollectionsKt.F(list2)).s, ((TripPlannerLegAppModel.Metro) CollectionsKt.P(list2)).t);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.S.put(((TripPlannerLegAppModel.Metro) it.next()).p, metroGroupLegAppModel);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W0(ContinuationImpl continuationImpl) {
        TripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1 tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1;
        if (continuationImpl instanceof TripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1) {
            tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1 = (TripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1) continuationImpl;
            int i = tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1 = new TripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1(this, continuationImpl);
            }
        } else {
            tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1 = new TripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1(this, continuationImpl);
        }
        Object objA = tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            List listR = CollectionsKt.R(AppPermission.FINE_LOCATION);
            tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1.label = 1;
            objA = this.v.a(listR, tripPlannerDetailsComponent$updateMapCameraViewStateAfterMapLoadAndRouteFetch$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        E0(new n8(this, ((AppPermissionRequest) objA).b.isEmpty(), 12));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:92:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:94:0x04bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0413 -> B:89:0x0418). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x041b -> B:91:0x0423). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x04b1 -> B:93:0x04bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object X0(app.chalo.livetracking.tripplanner.ui.details.TripPlannerPurchaseHooksUiState r51, kotlin.coroutines.Continuation r52) {
        /*
            Method dump skipped, instruction units count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent.X0(app.chalo.livetracking.tripplanner.ui.details.TripPlannerPurchaseHooksUiState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (TripPlannerDetailsState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new TripPlannerDetailsState(null, FrameMetricsAggregator.EVERY_DURATION);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new TripPlannerDetailsState(null, TypedValues.PositionType.TYPE_PERCENT_WIDTH);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        this.s.e();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        S0(TripPlannerDetailsIntent.FragmentStartedIntent.f4730a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        S0(TripPlannerDetailsIntent.FragmentStoppedIntent.f4731a);
    }
}
