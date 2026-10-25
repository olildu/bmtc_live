package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.SearchFieldSectionType;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductConfigFetchHelperContract;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerConfigModelKt;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase;
import app.chalo.livetracking.tripplanner.domain.ItineraryEtaInfo;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult;
import app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase;
import app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.livetracking.universalsearch.domain.CheckIfUserCameFromPremiumBusCampaign;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.recent.database.repository.recent.TripRecentRepository;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.utils.KUUID;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.a5;
import defpackage.ml1;
import defpackage.xj1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultsState;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultsEffect;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerResultsComponent extends ChaloBaseStateMviComponent<TripPlannerResultIntent, TripPlannerResultsState, TripPlannerResultsState, TripPlannerResultsEffect> {
    public static final List Z = CollectionsKt.S(ChaloTransitMode.BUS, ChaloTransitMode.METRO);
    public final LiveTrackingNavigationContract A;
    public final KotlinToastManager B;
    public final ChaloNavigationManager C;
    public final PermissionHandlerProvider D;
    public final UniversalSearchResultStateManager E;
    public final LocationPermissionCallbackHandler F;
    public final GpsRequestHandlerProvider G;
    public final ChaloLocationManager H;
    public final ProductConfigFetchHelperContract I;
    public final ChaloAppFeatureHelper J;
    public final boolean K;
    public boolean L;
    public UniversalSearchDescriptiveLocationAppModel M;
    public UniversalSearchDescriptiveLocationAppModel N;
    public TripPlannerTimeEditRange O;
    public Boolean P;
    public boolean Q;
    public final LinkedHashMap R;
    public Map S;
    public ArrayList T;
    public Job U;
    public Job V;
    public Job W;
    public Job X;
    public final Job Y;
    public final TripPlannerArgs.ResultsScreen k;
    public final MakeTripPlannerCallUseCase l;
    public final TripPlannerItineraryLiveInfoManager m;
    public final BasicInfoContract n;
    public final StringProvider o;
    public final TimeUtilsContract p;
    public final GetTimeInMillisAfterXTimeUseCase q;
    public final TripRecentRepository r;
    public final CityProvider s;
    public final FormatTimeInMillisToGivenFormatUseCase t;
    public final FetchCurrentLocationUseCase u;
    public final ProcessTripPlannerItineraryForUiUseCase v;
    public final AnalyticsContract w;
    public final CheckIfUserCameFromPremiumBusCampaign x;
    public final GetPremiumBusCurrentCityConfigUseCase y;
    public final GetTripPlannerConfigForCityUseCase z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultsComponent$Companion;", "", "", "RECENT_TRIPS_LIMIT_COUNT", "I", "THRESHOLD_LIST_SIZE_FOR_HOP_API_CALL", "", "Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;", "RELEVANT_MODES", "Ljava/util/List;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4786a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SearchFieldSectionType.values().length];
            try {
                iArr[SearchFieldSectionType.WITH_PROCEED_BTN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchFieldSectionType.WITHOUT_PROCEED_BTN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4786a = iArr;
            int[] iArr2 = new int[ChaloTransitMode.values().length];
            try {
                iArr2[ChaloTransitMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChaloTransitMode.BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloTransitMode.TRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChaloTransitMode.METRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChaloTransitMode.MONORAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ChaloTransitMode.FERRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ChaloTransitMode.CAB.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
            int[] iArr3 = new int[RouteServiceType.values().length];
            try {
                iArr3[RouteServiceType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[RouteServiceType.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[RouteServiceType.PREMIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            c = iArr3;
        }
    }

    public TripPlannerResultsComponent(ComponentContext componentContext, TripPlannerArgs.ResultsScreen resultsScreen, MakeTripPlannerCallUseCase makeTripPlannerCallUseCase, TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, BasicInfoContract basicInfoContract, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, TripRecentRepository tripRecentRepository, CityProvider cityProvider, FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase, FetchCurrentLocationUseCase fetchCurrentLocationUseCase, ProcessTripPlannerItineraryForUiUseCase processTripPlannerItineraryForUiUseCase, AnalyticsContract analyticsContract, CheckIfUserCameFromPremiumBusCampaign checkIfUserCameFromPremiumBusCampaign, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, GetTripPlannerConfigForCityUseCase getTripPlannerConfigForCityUseCase, LiveTrackingNavigationContract liveTrackingNavigationContract, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, UniversalSearchResultStateManager universalSearchResultStateManager, LocationPermissionCallbackHandler locationPermissionCallbackHandler, GpsRequestHandlerProvider gpsRequestHandlerProvider, ChaloLocationManager chaloLocationManager, ProductConfigFetchHelperContract productConfigFetchHelperContract, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        Object objB;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel;
        Object objB2;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2;
        super(componentContext);
        this.k = resultsScreen;
        this.l = makeTripPlannerCallUseCase;
        this.m = tripPlannerItineraryLiveInfoManager;
        this.n = basicInfoContract;
        this.o = stringProvider;
        this.p = timeUtilsContract;
        this.q = getTimeInMillisAfterXTimeUseCase;
        this.r = tripRecentRepository;
        this.s = cityProvider;
        this.t = formatTimeInMillisToGivenFormatUseCase;
        this.u = fetchCurrentLocationUseCase;
        this.v = processTripPlannerItineraryForUiUseCase;
        this.w = analyticsContract;
        this.x = checkIfUserCameFromPremiumBusCampaign;
        this.y = getPremiumBusCurrentCityConfigUseCase;
        this.z = getTripPlannerConfigForCityUseCase;
        this.A = liveTrackingNavigationContract;
        this.B = kotlinToastManager;
        this.C = chaloNavigationManager;
        this.D = permissionHandlerProvider;
        this.E = universalSearchResultStateManager;
        this.F = locationPermissionCallbackHandler;
        this.G = gpsRequestHandlerProvider;
        this.H = chaloLocationManager;
        this.I = productConfigFetchHelperContract;
        this.J = chaloAppFeatureHelper;
        this.L = true;
        this.R = new LinkedHashMap();
        this.T = new ArrayList();
        this.K = chaloAppFeatureHelper.g();
        String str = resultsScreen.c;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            universalSearchDescriptiveLocationAppModel = (UniversalSearchDescriptiveLocationAppModel) objB;
        } else {
            universalSearchDescriptiveLocationAppModel = null;
        }
        String str2 = this.k.d;
        if (str2 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB2 = json2.b(str2, UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB2 = null;
            }
            universalSearchDescriptiveLocationAppModel2 = (UniversalSearchDescriptiveLocationAppModel) objB2;
        } else {
            universalSearchDescriptiveLocationAppModel2 = null;
        }
        T0(new TripPlannerResultIntent.InitializationIntent(universalSearchDescriptiveLocationAppModel, universalSearchDescriptiveLocationAppModel2));
        Job job = this.Y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.Y = BuildersKt.d(this.j, null, null, new TripPlannerResultsComponent$checkLocationPermission$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(TripPlannerResultsComponent tripPlannerResultsComponent, String str, ContinuationImpl continuationImpl) {
        TripPlannerResultsComponent$collectUniversalSearchResult$1 tripPlannerResultsComponent$collectUniversalSearchResult$1;
        Object objB;
        Object objB2;
        tripPlannerResultsComponent.getClass();
        if (continuationImpl instanceof TripPlannerResultsComponent$collectUniversalSearchResult$1) {
            tripPlannerResultsComponent$collectUniversalSearchResult$1 = (TripPlannerResultsComponent$collectUniversalSearchResult$1) continuationImpl;
            int i = tripPlannerResultsComponent$collectUniversalSearchResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerResultsComponent$collectUniversalSearchResult$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerResultsComponent$collectUniversalSearchResult$1 = new TripPlannerResultsComponent$collectUniversalSearchResult$1(tripPlannerResultsComponent, continuationImpl);
            }
        } else {
            tripPlannerResultsComponent$collectUniversalSearchResult$1 = new TripPlannerResultsComponent$collectUniversalSearchResult$1(tripPlannerResultsComponent, continuationImpl);
        }
        Object objV = tripPlannerResultsComponent$collectUniversalSearchResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerResultsComponent$collectUniversalSearchResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowB = tripPlannerResultsComponent.E.b(str);
            tripPlannerResultsComponent$collectUniversalSearchResult$1.label = 1;
            objV = tripPlannerResultsComponent.b.v(flowB, tripPlannerResultsComponent$collectUniversalSearchResult$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        ResultStateData resultStateData = (ResultStateData) objV;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        UniversalSearchResultState universalSearchResultState = (UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a;
        String str2 = universalSearchResultState.f9060a;
        String str3 = universalSearchResultState.b;
        if (str2 != null && str2.length() != 0) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB2 = json.b(str2, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB2 = null;
            }
            StopAppModel stopAppModel = (StopAppModel) objB2;
            if (stopAppModel != null) {
                tripPlannerResultsComponent.T0(new TripPlannerResultIntent.SearchStopFieldUpdatedIntent(new UniversalSearchDescriptiveLocationAppModel(stopAppModel.e, stopAppModel.b, stopAppModel.f1727a, "searchPartnerChaloStop", stopAppModel.c)));
            }
        } else if (str3 != null && str3.length() != 0) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str3, RecentPlaceAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB = null;
            }
            RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) objB;
            if (recentPlaceAppModel != null) {
                tripPlannerResultsComponent.T0(new TripPlannerResultIntent.SearchStopFieldUpdatedIntent(new UniversalSearchDescriptiveLocationAppModel(recentPlaceAppModel.i, recentPlaceAppModel.g, recentPlaceAppModel.e, recentPlaceAppModel.f, recentPlaceAppModel.j)));
            }
        }
        Job job = tripPlannerResultsComponent.W;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        tripPlannerResultsComponent.W = null;
        return unit;
    }

    public static final UniversalSearchDescriptiveLocationAppModel G0(TripPlannerResultsComponent tripPlannerResultsComponent, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2, LatLng latLng) {
        tripPlannerResultsComponent.getClass();
        if (!Intrinsics.d(universalSearchDescriptiveLocationAppModel, universalSearchDescriptiveLocationAppModel2)) {
            return universalSearchDescriptiveLocationAppModel;
        }
        String str = universalSearchDescriptiveLocationAppModel.f9007a;
        String description = universalSearchDescriptiveLocationAppModel.b;
        String placeId = universalSearchDescriptiveLocationAppModel.c;
        String searchPartner = universalSearchDescriptiveLocationAppModel.d;
        Intrinsics.i(description, "description");
        Intrinsics.i(placeId, "placeId");
        Intrinsics.i(searchPartner, "searchPartner");
        Intrinsics.i(latLng, "latLng");
        return new UniversalSearchDescriptiveLocationAppModel(str, description, placeId, searchPartner, latLng);
    }

    public static final TripPlannerTabType H0(TripPlannerResultsComponent tripPlannerResultsComponent) {
        StateFlow stateFlow = tripPlannerResultsComponent.f;
        if (((TripPlannerResultsState) stateFlow.getValue()).n.e) {
            return ((TripPlannerResultsState) stateFlow.getValue()).n;
        }
        TripPlannerTabType.INSTANCE.getClass();
        return TripPlannerTabType.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(TripPlannerResultsComponent tripPlannerResultsComponent, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, Function0 function0, ContinuationImpl continuationImpl) {
        TripPlannerResultsComponent$performActionIfValidLocationElseShowError$1 tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1;
        KotlinToastManager kotlinToastManager;
        CityAppModel cityAppModel;
        tripPlannerResultsComponent.getClass();
        if (continuationImpl instanceof TripPlannerResultsComponent$performActionIfValidLocationElseShowError$1) {
            tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1 = (TripPlannerResultsComponent$performActionIfValidLocationElseShowError$1) continuationImpl;
            int i = tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1 = new TripPlannerResultsComponent$performActionIfValidLocationElseShowError$1(tripPlannerResultsComponent, continuationImpl);
            }
        } else {
            tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1 = new TripPlannerResultsComponent$performActionIfValidLocationElseShowError$1(tripPlannerResultsComponent, continuationImpl);
        }
        Object objB = tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (universalSearchDescriptiveLocationAppModel.b.length() <= 0 || (cityAppModel = (CityAppModel) tripPlannerResultsComponent.s.getE().getValue()) == null || !CityAppModelKt.b(cityAppModel, universalSearchDescriptiveLocationAppModel.e)) {
                KotlinToastManager kotlinToastManager2 = tripPlannerResultsComponent.B;
                tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1.L$0 = kotlinToastManager2;
                tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1.label = 1;
                objB = tripPlannerResultsComponent.o.b(StringEnum.LOCATION_OUTSIDE_CITY_BOUNDS, new Object[0], tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            } else {
                function0.invoke();
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) tripPlannerResultsComponent$performActionIfValidLocationElseShowError$1.L$0;
        ResultKt.b(objB);
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    /* JADX WARN: Failed to calculate best type for var: r1v47 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v47 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v47 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v47 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v48 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v48 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v54 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v54 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v47 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final java.lang.Object J0(app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent r18, boolean r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent.J0(app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Failed to calculate best type for var: r1v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v37 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v37 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v38 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v53 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v53 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v37 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final java.lang.Object K0(app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent r18, app.chalo.utils.ChaloUseCaseResult r19, app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel r20, app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel r21, boolean r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent.K0(app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent, app.chalo.utils.ChaloUseCaseResult, app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel, app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object L0(TripPlannerResultsComponent tripPlannerResultsComponent, ContinuationImpl continuationImpl) {
        TripPlannerResultsComponent$resetStateForNewSearchIfRequired$1 tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1;
        boolean z;
        long jLongValue;
        Long l;
        tripPlannerResultsComponent.getClass();
        if (continuationImpl instanceof TripPlannerResultsComponent$resetStateForNewSearchIfRequired$1) {
            tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1 = (TripPlannerResultsComponent$resetStateForNewSearchIfRequired$1) continuationImpl;
            int i = tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1 = new TripPlannerResultsComponent$resetStateForNewSearchIfRequired$1(tripPlannerResultsComponent, continuationImpl);
            }
        } else {
            tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1 = new TripPlannerResultsComponent$resetStateForNewSearchIfRequired$1(tripPlannerResultsComponent, continuationImpl);
        }
        Object objA = tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            CheckIfUserCameFromPremiumBusCampaign checkIfUserCameFromPremiumBusCampaign = tripPlannerResultsComponent.x;
            tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1.label = 1;
            objA = checkIfUserCameFromPremiumBusCampaign.a(tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1.Z$0;
            ResultKt.b(objA);
        }
        jLongValue = ((Number) objA).longValue();
        l = ((TripPlannerResultsState) tripPlannerResultsComponent.f.getValue()).p;
        if (l != null) {
            jLongValue = Math.max(l.longValue(), jLongValue);
        }
        tripPlannerResultsComponent.E0(new a5(tripPlannerResultsComponent, jLongValue, z));
        BuildersKt.d(tripPlannerResultsComponent.j, null, null, new TripPlannerResultsComponent$addTripToRecentStore$1(tripPlannerResultsComponent, null), 3);
        return Unit.f17538a;
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        Job job = tripPlannerResultsComponent.V;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        tripPlannerResultsComponent.R.clear();
        tripPlannerResultsComponent.S = null;
        tripPlannerResultsComponent.T.clear();
        BasicInfoContract basicInfoContract = tripPlannerResultsComponent.n;
        tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1.Z$0 = zBooleanValue;
        tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1.label = 2;
        Object objC = basicInfoContract.c(tripPlannerResultsComponent$resetStateForNewSearchIfRequired$1);
        if (objC != coroutineSingletons) {
            z = zBooleanValue;
            objA = objC;
            jLongValue = ((Number) objA).longValue();
            l = ((TripPlannerResultsState) tripPlannerResultsComponent.f.getValue()).p;
            if (l != null) {
                jLongValue = Math.max(l.longValue(), jLongValue);
            }
            tripPlannerResultsComponent.E0(new a5(tripPlannerResultsComponent, jLongValue, z));
            BuildersKt.d(tripPlannerResultsComponent.j, null, null, new TripPlannerResultsComponent$addTripToRecentStore$1(tripPlannerResultsComponent, null), 3);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c0 -> B:33:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object M0(app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent.M0(app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static ArrayList O0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Z.contains(U0((TripPlannerLegUiModel) obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static TripPlannerTabType P0(List list, boolean z) {
        TripPlannerTabType tripPlannerTabType;
        if (list.isEmpty()) {
            TripPlannerTabType.INSTANCE.getClass();
            return TripPlannerTabType.g;
        }
        Object obj = null;
        if (z) {
            for (Object obj2 : list) {
                if (TripPlannerConfigModelKt.a((TripPlannerTabType) obj2)) {
                    obj = obj2;
                    break;
                }
            }
            tripPlannerTabType = (TripPlannerTabType) obj;
        } else {
            for (Object obj3 : list) {
                if (((TripPlannerTabType) obj3).b == ChaloTransitMode.ALL) {
                    obj = obj3;
                    break;
                }
            }
            tripPlannerTabType = (TripPlannerTabType) obj;
        }
        return tripPlannerTabType == null ? (TripPlannerTabType) CollectionsKt.F(list) : tripPlannerTabType;
    }

    public static ChaloTransitMode U0(TripPlannerLegUiModel tripPlannerLegUiModel) {
        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Bus) {
            return ChaloTransitMode.BUS;
        }
        if (Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.Ferry.f4756a)) {
            return ChaloTransitMode.FERRY;
        }
        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Metro) {
            return ChaloTransitMode.METRO;
        }
        if (Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.MonoRail.f4758a)) {
            return ChaloTransitMode.MONORAIL;
        }
        if (Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.Railway.f4759a)) {
            return ChaloTransitMode.TRAIN;
        }
        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Taxi) {
            return ChaloTransitMode.CAB;
        }
        if ((tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Auto) || (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Walk)) {
            return ChaloTransitMode.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void N0() {
        Job job = this.V;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.m.c(this.T, 10800);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        this.V = BuildersKt.d(this.j, null, null, new TripPlannerResultsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1(this, booleanRef, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v12, types: [T, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode] */
    public final Object Q0(String str, List list, ContinuationImpl continuationImpl) {
        TripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1 tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1;
        Ref.DoubleRef doubleRef;
        TripPlannerLegAppModel tripPlannerLegAppModel;
        Ref.DoubleRef doubleRef2;
        long jLongValue;
        if (continuationImpl instanceof TripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1) {
            tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1 = (TripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1) continuationImpl;
            int i = tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1 = new TripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1(this, continuationImpl);
            }
        } else {
            tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1 = new TripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1(this, continuationImpl);
        }
        Object obj = tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            doubleRef = new Ref.DoubleRef();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = ChaloTransitMode.UNKNOWN;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tripPlannerLegAppModel = (TripPlannerLegAppModel) it.next();
                if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                    if (objectRef.element == ChaloTransitMode.UNKNOWN) {
                        objectRef.element = ChaloTransitMode.BUS;
                    }
                    if (objectRef.element != ChaloTransitMode.BUS) {
                        return null;
                    }
                    Long l = ((TripPlannerResultsState) this.f.getValue()).p;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$0 = str;
                        tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$1 = doubleRef;
                        tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$2 = tripPlannerLegAppModel;
                        tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.label = 1;
                        Object objC = this.n.c(tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1);
                        if (objC == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = objC;
                        doubleRef2 = doubleRef;
                    }
                    TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
                    return new ItineraryLiveInfoRequest.FirstValidVehicle((((long) doubleRef.element) * ((long) 1000)) + jLongValue, str, bus.p, bus.s.f1727a);
                }
                if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro) {
                    if (objectRef.element == ChaloTransitMode.UNKNOWN) {
                        objectRef.element = ChaloTransitMode.METRO;
                    }
                    double d = doubleRef.element;
                    Double d2 = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel).l;
                    doubleRef.element = d + (d2 != null ? d2.doubleValue() : 0.0d);
                } else {
                    if (!(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Auto) && !Intrinsics.d(tripPlannerLegAppModel, TripPlannerLegAppModel.Ferry.INSTANCE) && !Intrinsics.d(tripPlannerLegAppModel, TripPlannerLegAppModel.MonoRail.INSTANCE) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Railway) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Taxi) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Walk)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    double d3 = doubleRef.element;
                    Double d4 = tripPlannerLegAppModel.getD();
                    doubleRef.element = d3 + (d4 != null ? d4.doubleValue() : 0.0d);
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TripPlannerLegAppModel tripPlannerLegAppModel2 = (TripPlannerLegAppModel) tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$2;
        doubleRef2 = (Ref.DoubleRef) tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$1;
        String str2 = (String) tripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$0;
        ResultKt.b(obj);
        tripPlannerLegAppModel = tripPlannerLegAppModel2;
        str = str2;
        jLongValue = ((Number) obj).longValue();
        doubleRef = doubleRef2;
        TripPlannerLegAppModel.Bus bus2 = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
        return new ItineraryLiveInfoRequest.FirstValidVehicle((((long) doubleRef.element) * ((long) 1000)) + jLongValue, str, bus2.p, bus2.s.f1727a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[LOOP:0: B:38:0x00d4->B:39:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x0134  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x017b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x0194 A[LOOP:2: B:87:0x0192->B:88:0x0194, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ba  */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x017b, please report this as an issue */
    public final Object R0(TripPlannerTabType tripPlannerTabType, TripPlannerItineraryUiModel tripPlannerItineraryUiModel, ItineraryLiveInfoResult itineraryLiveInfoResult, boolean z, ContinuationImpl continuationImpl) {
        TripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1 tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1;
        TripPlannerTabType tripPlannerTabType2;
        TripPlannerItineraryUiModel tripPlannerItineraryUiModel2;
        boolean z2;
        String str;
        Object objB;
        ItineraryEtaInfo itineraryEtaInfo;
        boolean z3;
        List list;
        ChaloTransitMode chaloTransitMode;
        int i;
        int i2;
        ArrayList arrayListO0;
        ArrayList arrayList;
        int size;
        ArrayList arrayListO1;
        ArrayList arrayList2;
        int size2;
        int i3;
        List listZ;
        TripPlannerLegUiModel tripPlannerLegUiModel;
        RouteServiceType routeServiceType;
        ArrayList arrayListO2;
        ArrayList arrayList3;
        int size3;
        int i4;
        List listZ2;
        ItineraryLiveInfoResult itineraryLiveInfoResult2 = itineraryLiveInfoResult;
        if (continuationImpl instanceof TripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1) {
            tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1 = (TripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1) continuationImpl;
            int i5 = tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.label = i5 - Integer.MIN_VALUE;
            } else {
                tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1 = new TripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1(this, continuationImpl);
            }
        } else {
            tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1 = new TripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1(this, continuationImpl);
        }
        Object obj = tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.label;
        int i7 = 0;
        if (i6 == 0) {
            ResultKt.b(obj);
            Long l = (itineraryLiveInfoResult2 == null || (itineraryEtaInfo = itineraryLiveInfoResult2.b) == null) ? null : new Long(Math.max(itineraryEtaInfo.f4698a, 60L));
            if (l != null) {
                StringEnum stringEnum = StringEnum.IN_X;
                Object[] objArr = {this.p.w(l.longValue() * ((long) 1000))};
                tripPlannerTabType2 = tripPlannerTabType;
                tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.L$0 = tripPlannerTabType2;
                tripPlannerItineraryUiModel2 = tripPlannerItineraryUiModel;
                tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.L$1 = tripPlannerItineraryUiModel2;
                tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.L$2 = itineraryLiveInfoResult2;
                z2 = z;
                tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.Z$0 = z2;
                tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.label = 1;
                objB = this.o.b(stringEnum, objArr, tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                tripPlannerTabType2 = tripPlannerTabType;
                tripPlannerItineraryUiModel2 = tripPlannerItineraryUiModel;
                z2 = z;
                str = null;
            }
            if (tripPlannerTabType2.e || !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            list = tripPlannerItineraryUiModel2.g;
            chaloTransitMode = tripPlannerTabType2.b;
            switch (WhenMappings.b[chaloTransitMode.ordinal()]) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (z3) {
                        arrayListO2 = O0(list);
                        arrayList3 = new ArrayList(CollectionsKt.v(arrayListO2, 10));
                        size3 = arrayListO2.size();
                        i4 = 0;
                        while (i4 < size3) {
                            Object obj2 = arrayListO2.get(i4);
                            i4++;
                            arrayList3.add(U0((TripPlannerLegUiModel) obj2));
                        }
                        listZ2 = CollectionsKt.z(arrayList3);
                        if (listZ2.size() == 1 || CollectionsKt.F(listZ2) != chaloTransitMode) {
                            list = null;
                        }
                    }
                    if (list != null) {
                        return null;
                    }
                    SeatAvailabilityLevel seatAvailabilityLevel = itineraryLiveInfoResult2 != null ? itineraryLiveInfoResult2.c : null;
                    String localId = tripPlannerItineraryUiModel2.f4753a;
                    String travelTimeString = tripPlannerItineraryUiModel2.b;
                    int i8 = tripPlannerItineraryUiModel2.c;
                    String str2 = tripPlannerItineraryUiModel2.d;
                    List legs = tripPlannerItineraryUiModel2.g;
                    int i9 = tripPlannerItineraryUiModel2.h;
                    String str3 = tripPlannerItineraryUiModel2.i;
                    StringEnum stringEnum2 = tripPlannerItineraryUiModel2.j;
                    String str4 = tripPlannerItineraryUiModel2.k;
                    Intrinsics.i(localId, "localId");
                    Intrinsics.i(travelTimeString, "travelTimeString");
                    Intrinsics.i(legs, "legs");
                    return new TripPlannerItineraryUiModel(localId, travelTimeString, i8, str2, str, seatAvailabilityLevel, legs, i9, str3, stringEnum2, str4);
                case 1:
                    RouteServiceType routeServiceType2 = tripPlannerTabType2.d;
                    i = WhenMappings.c[routeServiceType2.ordinal()];
                    if (i != 1) {
                        i2 = tripPlannerTabType2.c;
                        if (i2 != -1) {
                            arrayListO0 = O0(list);
                            arrayList = new ArrayList(CollectionsKt.v(arrayListO0, 10));
                            size = arrayListO0.size();
                            while (i7 < size) {
                                Object obj3 = arrayListO0.get(i7);
                                i7++;
                                arrayList.add(U0((TripPlannerLegUiModel) obj3));
                            }
                            if (i2 != (CollectionsKt.z(arrayList).size() == 1 ? arrayList.size() : -1)) {
                                list = null;
                            }
                        }
                    } else {
                        if (i == 2 && i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayListO1 = O0(list);
                        arrayList2 = new ArrayList();
                        size2 = arrayListO1.size();
                        i3 = 0;
                        while (i3 < size2) {
                            Object obj4 = arrayListO1.get(i3);
                            i3++;
                            tripPlannerLegUiModel = (TripPlannerLegUiModel) obj4;
                            if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Bus) {
                                routeServiceType = ((TripPlannerLegUiModel.Bus) tripPlannerLegUiModel).r;
                            } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Metro) {
                                routeServiceType = ((TripPlannerLegUiModel.Metro) tripPlannerLegUiModel).r;
                            } else {
                                if ((tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Auto) && !Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.Ferry.f4756a) && !Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.MonoRail.f4758a) && !Intrinsics.d(tripPlannerLegUiModel, TripPlannerLegUiModel.Railway.f4759a) && !(tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Taxi) && !(tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Walk)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                routeServiceType = null;
                            }
                            if (routeServiceType != null) {
                                arrayList2.add(routeServiceType);
                            }
                        }
                        listZ = CollectionsKt.z(arrayList2);
                        if (listZ.size() == 1 || CollectionsKt.F(listZ) != routeServiceType2) {
                            list = null;
                        } else {
                            i2 = tripPlannerTabType2.c;
                            if (i2 != -1) {
                                arrayListO0 = O0(list);
                                arrayList = new ArrayList(CollectionsKt.v(arrayListO0, 10));
                                size = arrayListO0.size();
                                while (i7 < size) {
                                    Object obj5 = arrayListO0.get(i7);
                                    i7++;
                                    arrayList.add(U0((TripPlannerLegUiModel) obj5));
                                }
                                if (i2 != (CollectionsKt.z(arrayList).size() == 1 ? arrayList.size() : -1)) {
                                    list = null;
                                }
                            }
                        }
                    }
                    if (list != null) {
                        return null;
                    }
                    if (itineraryLiveInfoResult2 != null) {
                    }
                    String localId2 = tripPlannerItineraryUiModel2.f4753a;
                    String travelTimeString2 = tripPlannerItineraryUiModel2.b;
                    int i10 = tripPlannerItineraryUiModel2.c;
                    String str5 = tripPlannerItineraryUiModel2.d;
                    List legs2 = tripPlannerItineraryUiModel2.g;
                    int i11 = tripPlannerItineraryUiModel2.h;
                    String str6 = tripPlannerItineraryUiModel2.i;
                    StringEnum stringEnum3 = tripPlannerItineraryUiModel2.j;
                    String str7 = tripPlannerItineraryUiModel2.k;
                    Intrinsics.i(localId2, "localId");
                    Intrinsics.i(travelTimeString2, "travelTimeString");
                    Intrinsics.i(legs2, "legs");
                    return new TripPlannerItineraryUiModel(localId2, travelTimeString2, i10, str5, str, seatAvailabilityLevel, legs2, i11, str6, stringEnum3, str7);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z4 = tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.Z$0;
        ItineraryLiveInfoResult itineraryLiveInfoResult3 = (ItineraryLiveInfoResult) tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.L$2;
        TripPlannerItineraryUiModel tripPlannerItineraryUiModel3 = (TripPlannerItineraryUiModel) tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.L$1;
        TripPlannerTabType tripPlannerTabType3 = (TripPlannerTabType) tripPlannerResultsComponent$getUpdatedUiModelIfQuickFilterSatisfies$1.L$0;
        ResultKt.b(obj);
        objB = obj;
        tripPlannerTabType2 = tripPlannerTabType3;
        z2 = z4;
        itineraryLiveInfoResult2 = itineraryLiveInfoResult3;
        tripPlannerItineraryUiModel2 = tripPlannerItineraryUiModel3;
        str = (String) objB;
        if (tripPlannerTabType2.e) {
            z3 = false;
        } else {
            z3 = false;
        }
        list = tripPlannerItineraryUiModel2.g;
        chaloTransitMode = tripPlannerTabType2.b;
        switch (WhenMappings.b[chaloTransitMode.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (z3) {
                    arrayListO2 = O0(list);
                    arrayList3 = new ArrayList(CollectionsKt.v(arrayListO2, 10));
                    size3 = arrayListO2.size();
                    i4 = 0;
                    while (i4 < size3) {
                        Object obj6 = arrayListO2.get(i4);
                        i4++;
                        arrayList3.add(U0((TripPlannerLegUiModel) obj6));
                    }
                    listZ2 = CollectionsKt.z(arrayList3);
                    if (listZ2.size() == 1) {
                    }
                    list = null;
                    break;
                }
                if (list != null) {
                    return null;
                }
                if (itineraryLiveInfoResult2 != null) {
                }
                String localId3 = tripPlannerItineraryUiModel2.f4753a;
                String travelTimeString3 = tripPlannerItineraryUiModel2.b;
                int i12 = tripPlannerItineraryUiModel2.c;
                String str8 = tripPlannerItineraryUiModel2.d;
                List legs3 = tripPlannerItineraryUiModel2.g;
                int i13 = tripPlannerItineraryUiModel2.h;
                String str9 = tripPlannerItineraryUiModel2.i;
                StringEnum stringEnum4 = tripPlannerItineraryUiModel2.j;
                String str10 = tripPlannerItineraryUiModel2.k;
                Intrinsics.i(localId3, "localId");
                Intrinsics.i(travelTimeString3, "travelTimeString");
                Intrinsics.i(legs3, "legs");
                return new TripPlannerItineraryUiModel(localId3, travelTimeString3, i12, str8, str, seatAvailabilityLevel, legs3, i13, str9, stringEnum4, str10);
            case 1:
                RouteServiceType routeServiceType3 = tripPlannerTabType2.d;
                i = WhenMappings.c[routeServiceType3.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                    }
                    arrayListO1 = O0(list);
                    arrayList2 = new ArrayList();
                    size2 = arrayListO1.size();
                    i3 = 0;
                    while (i3 < size2) {
                        Object obj7 = arrayListO1.get(i3);
                        i3++;
                        tripPlannerLegUiModel = (TripPlannerLegUiModel) obj7;
                        if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Bus) {
                            routeServiceType = ((TripPlannerLegUiModel.Bus) tripPlannerLegUiModel).r;
                        } else if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Metro) {
                            routeServiceType = ((TripPlannerLegUiModel.Metro) tripPlannerLegUiModel).r;
                        } else {
                            if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Auto) {
                            }
                            routeServiceType = null;
                        }
                        if (routeServiceType != null) {
                            arrayList2.add(routeServiceType);
                        }
                        break;
                    }
                    listZ = CollectionsKt.z(arrayList2);
                    if (listZ.size() == 1) {
                    }
                    list = null;
                    break;
                } else {
                    i2 = tripPlannerTabType2.c;
                    if (i2 != -1) {
                        arrayListO0 = O0(list);
                        arrayList = new ArrayList(CollectionsKt.v(arrayListO0, 10));
                        size = arrayListO0.size();
                        while (i7 < size) {
                            Object obj8 = arrayListO0.get(i7);
                            i7++;
                            arrayList.add(U0((TripPlannerLegUiModel) obj8));
                        }
                        if (i2 != (CollectionsKt.z(arrayList).size() == 1 ? arrayList.size() : -1)) {
                            list = null;
                        }
                    }
                }
                if (list != null) {
                    return null;
                }
                if (itineraryLiveInfoResult2 != null) {
                }
                String localId4 = tripPlannerItineraryUiModel2.f4753a;
                String travelTimeString4 = tripPlannerItineraryUiModel2.b;
                int i14 = tripPlannerItineraryUiModel2.c;
                String str11 = tripPlannerItineraryUiModel2.d;
                List legs4 = tripPlannerItineraryUiModel2.g;
                int i15 = tripPlannerItineraryUiModel2.h;
                String str12 = tripPlannerItineraryUiModel2.i;
                StringEnum stringEnum5 = tripPlannerItineraryUiModel2.j;
                String str13 = tripPlannerItineraryUiModel2.k;
                Intrinsics.i(localId4, "localId");
                Intrinsics.i(travelTimeString4, "travelTimeString");
                Intrinsics.i(legs4, "legs");
                return new TripPlannerItineraryUiModel(localId4, travelTimeString4, i14, str11, str, seatAvailabilityLevel, legs4, i15, str12, stringEnum5, str13);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean S0() {
        return (this.M == null || this.N == null) ? false : true;
    }

    public final void T0(TripPlannerResultIntent intent) {
        char c;
        char c2;
        Object next;
        LatLng latLng;
        LatLng latLng2;
        LatLng latLng3;
        LatLng latLng4;
        Intrinsics.i(intent, "intent");
        C0(intent);
        if (intent instanceof TripPlannerResultIntent.InitializationIntent) {
            final TripPlannerResultIntent.InitializationIntent initializationIntent = (TripPlannerResultIntent.InitializationIntent) intent;
            if (this.L) {
                q0(new Function0() { // from class: app.chalo.livetracking.tripplanner.ui.result.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        TripPlannerResultsComponent tripPlannerResultsComponent = this.f4794a;
                        if (tripPlannerResultsComponent.L) {
                            tripPlannerResultsComponent.L = false;
                            BuildersKt.d(tripPlannerResultsComponent.j, null, null, new TripPlannerResultsComponent$handleInitializationIntent$1$1(tripPlannerResultsComponent, initializationIntent, null), 3);
                        }
                        return Unit.f17538a;
                    }
                });
                return;
            }
            return;
        }
        boolean z = intent instanceof TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent;
        int i = 0;
        int i2 = 1;
        ContextScope contextScope = this.j;
        Double dValueOf = null;
        if (z) {
            TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent searchStopUpdateFieldClickedIntent = (TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent) intent;
            this.P = Boolean.valueOf(searchStopUpdateFieldClickedIntent.f4780a);
            UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(ArraysKt.j0(new UniversalSearchOption[]{new UniversalSearchOption.STOPS(true, true), new UniversalSearchOption.PLACES(true, true)}));
            Job job = this.W;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.W = BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleSearchStopFieldClickedIntent$1(searchStopUpdateFieldClickedIntent, this, universalSearchOptions, KUUID.a(), null), 3);
            return;
        }
        if (intent instanceof TripPlannerResultIntent.SearchStopFieldUpdatedIntent) {
            BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleSearchStopFieldUpdatedIntent$1(this, (TripPlannerResultIntent.SearchStopFieldUpdatedIntent) intent, null), 3);
            return;
        }
        if (intent instanceof TripPlannerResultIntent.ProceedClickedIntent) {
            TripPlannerResultIntent.ProceedClickedIntent proceedClickedIntent = (TripPlannerResultIntent.ProceedClickedIntent) intent;
            Job job2 = this.U;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            this.U = BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleProceedClickedIntent$1(this, proceedClickedIntent, null), 3);
            return;
        }
        char c3 = 4;
        char c4 = 6;
        if (intent.equals(TripPlannerResultIntent.ToggleSearchStopsClickedIntent.f4782a)) {
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = this.M;
            this.M = this.N;
            this.N = universalSearchDescriptiveLocationAppModel;
            E0(new ml1(this, i2));
            String sourceName = Source.TRIP_PLANNER.getSourceName();
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2 = this.M;
            Pair pair = new Pair("origin", String.valueOf(universalSearchDescriptiveLocationAppModel2 != null ? universalSearchDescriptiveLocationAppModel2.b : null));
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel3 = this.N;
            Pair pair2 = new Pair(FirebaseAnalytics.Param.DESTINATION, String.valueOf(universalSearchDescriptiveLocationAppModel3 != null ? universalSearchDescriptiveLocationAppModel3.b : null));
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel4 = this.M;
            Pair pair3 = new Pair("sourceLat", String.valueOf((universalSearchDescriptiveLocationAppModel4 == null || (latLng4 = universalSearchDescriptiveLocationAppModel4.e) == null) ? null : Double.valueOf(latLng4.f5134a)));
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel5 = this.M;
            Pair pair4 = new Pair("sourceLong", String.valueOf((universalSearchDescriptiveLocationAppModel5 == null || (latLng3 = universalSearchDescriptiveLocationAppModel5.e) == null) ? null : Double.valueOf(latLng3.b)));
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel6 = this.N;
            Pair pair5 = new Pair("destinationLat", String.valueOf((universalSearchDescriptiveLocationAppModel6 == null || (latLng2 = universalSearchDescriptiveLocationAppModel6.e) == null) ? null : Double.valueOf(latLng2.f5134a)));
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel7 = this.N;
            if (universalSearchDescriptiveLocationAppModel7 != null && (latLng = universalSearchDescriptiveLocationAppModel7.e) != null) {
                dValueOf = Double.valueOf(latLng.b);
            }
            AnalyticsContract.DefaultImpls.a(this.w, "tripPlanner swap button clicked", sourceName, MapsKt.i(pair, pair2, pair3, pair4, pair5, new Pair("destinationLong", String.valueOf(dValueOf))), null, false, 24);
            W0();
            return;
        }
        if (intent.equals(TripPlannerResultIntent.FragmentStartedIntent.f4767a)) {
            if (this.T.isEmpty()) {
                return;
            }
            N0();
            return;
        }
        if (intent.equals(TripPlannerResultIntent.FragmentStoppedIntent.f4768a)) {
            Job job3 = this.V;
            if (job3 != null) {
                ((JobSupport) job3).cancel(null);
                return;
            }
            return;
        }
        if (intent instanceof TripPlannerResultIntent.ItineraryClickedIntent) {
            BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleItineraryClickedIntent$1(this, (TripPlannerResultIntent.ItineraryClickedIntent) intent, null), 3);
            return;
        }
        boolean z2 = intent instanceof TripPlannerResultIntent.RecentTripClickedIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            TripPlannerResultIntent.RecentTripClickedIntent recentTripClickedIntent = (TripPlannerResultIntent.RecentTripClickedIntent) intent;
            List list = ((TripPlannerResultsState) stateFlow.getValue()).k;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c = c3;
                        c2 = c4;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        c = c3;
                        c2 = c4;
                        if (Intrinsics.d(((RecentTripAppModel) next).e, recentTripClickedIntent.f4777a)) {
                            break;
                        }
                        c3 = c;
                        c4 = c2;
                    }
                }
                RecentTripAppModel recentTripAppModel = (RecentTripAppModel) next;
                if (recentTripAppModel == null) {
                    return;
                }
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel8 = recentTripAppModel.h;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel9 = recentTripAppModel.g;
                List list2 = ((TripPlannerResultsState) stateFlow.getValue()).k;
                int iIndexOf = list2 != null ? list2.indexOf(recentTripAppModel) : -1;
                this.M = universalSearchDescriptiveLocationAppModel9;
                this.N = universalSearchDescriptiveLocationAppModel8;
                E0(new ml1(this, i));
                BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$updateAccessCountAndRecentTime$1(this, recentTripAppModel.e, recentTripAppModel.f, null), 3);
                String sourceName2 = Source.TRIP_PLANNER.getSourceName();
                String str = universalSearchDescriptiveLocationAppModel9.b;
                LatLng latLng5 = universalSearchDescriptiveLocationAppModel9.e;
                Pair pair6 = new Pair("origin", str);
                String str2 = universalSearchDescriptiveLocationAppModel8.b;
                LatLng latLng6 = universalSearchDescriptiveLocationAppModel8.e;
                Pair pair7 = new Pair(FirebaseAnalytics.Param.DESTINATION, str2);
                Pair pair8 = new Pair("sourceLat", String.valueOf(latLng5.f5134a));
                Pair pair9 = new Pair("sourceLong", String.valueOf(latLng5.b));
                Pair pair10 = new Pair("destinationLat", String.valueOf(latLng6.f5134a));
                Pair pair11 = new Pair("destinationLong", String.valueOf(latLng6.b));
                Pair pair12 = new Pair(FirebaseAnalytics.Param.INDEX, String.valueOf(iIndexOf));
                Pair[] pairArr = new Pair[7];
                pairArr[0] = pair6;
                pairArr[1] = pair7;
                pairArr[2] = pair8;
                pairArr[3] = pair9;
                pairArr[c] = pair10;
                pairArr[5] = pair11;
                pairArr[c2] = pair12;
                AnalyticsContract.DefaultImpls.a(this.w, "trip planner recent clicked", sourceName2, MapsKt.i(pairArr), null, false, 24);
                T0(new TripPlannerResultIntent.ProceedClickedIntent(false));
                return;
            }
            return;
        }
        if (intent.equals(TripPlannerResultIntent.TimeEditFieldClickIntent.f4781a)) {
            BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleTimeEditFieldClickIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(TripPlannerResultIntent.DateEditOptionClickedIntent.f4764a)) {
            BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleDateEditOptionClickedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof TripPlannerResultIntent.QuickFilterTabClickedIntent) {
            BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleQuickFilterTabClickedIntent$1(this, (TripPlannerResultIntent.QuickFilterTabClickedIntent) intent, null), 3);
            return;
        }
        if (intent.equals(TripPlannerResultIntent.LocationEnabledIntent.f4772a)) {
            BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleLocationEnabledIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(TripPlannerResultIntent.OnExploreAllRoutesClickedIntent.f4774a)) {
            this.A.c(Source.TRIP_PLANNER);
            return;
        }
        if (intent.equals(TripPlannerResultIntent.ToolTipOkClickedIntent.f4783a)) {
            E0(new xj1(15));
            return;
        }
        if (intent instanceof TripPlannerResultIntent.UpdateSelectedDateIntent) {
            BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleUpdateSelectedDateIntent$1(this, (TripPlannerResultIntent.UpdateSelectedDateIntent) intent, null), 3);
            return;
        }
        if (intent instanceof TripPlannerResultIntent.UpdateSelectedTimeIntent) {
            BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleUpdateSelectedTimeIntent$1(this, (TripPlannerResultIntent.UpdateSelectedTimeIntent) intent, null), 3);
            return;
        }
        if (intent instanceof TripPlannerResultIntent.FetchAndUpdateHopItineraryListIntent) {
            if (V0(((TripPlannerResultIntent.FetchAndUpdateHopItineraryListIntent) intent).f4766a)) {
                Job job4 = this.U;
                if (job4 != null) {
                    ((JobSupport) job4).cancel(null);
                }
                this.U = BuildersKt.d(contextScope, null, null, new TripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1(this, null), 3);
                return;
            }
            return;
        }
        if (intent.equals(TripPlannerResultIntent.HopApiFetchFailedSnackbarRetryIntent.f4769a)) {
            AnalyticsContract.DefaultImpls.a(this.w, "tp hop api fetch failed snackbar retry event", Source.TRIP_PLANNER.getSourceName(), MapsKt.d(), null, false, 24);
            E0(new xj1(14));
            T0(new TripPlannerResultIntent.FetchAndUpdateHopItineraryListIntent(true));
        } else {
            if (intent instanceof TripPlannerResultIntent.ScrollDirectionChangedIntent) {
                TripPlannerResultIntent.ScrollDirectionChangedIntent scrollDirectionChangedIntent = (TripPlannerResultIntent.ScrollDirectionChangedIntent) intent;
                if (((TripPlannerResultsState) stateFlow.getValue()).t && scrollDirectionChangedIntent.f4778a == ScrollDirection.UP) {
                    E0(new xj1(13));
                    return;
                }
                return;
            }
            if (intent.equals(TripPlannerResultIntent.DismissPickerDialogIntent.f4765a)) {
                E0(new xj1(16));
            } else {
                if (!intent.equals(TripPlannerResultIntent.OnBackPressedIntent.f4773a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AnalyticsContract.DefaultImpls.a(this.w, "trip planner back button clicked", Source.TRIP_PLANNER.getSourceName(), MapsKt.d(), null, false, 24);
                ChaloNavigationManagerKt.c(this.C);
            }
        }
    }

    public final boolean V0(boolean z) {
        if (!this.Q) {
            return false;
        }
        if (z) {
            return true;
        }
        StateFlow stateFlow = this.f;
        return (((TripPlannerResultsState) stateFlow.getValue()).q || ((TripPlannerResultsState) stateFlow.getValue()).s) ? false : true;
    }

    public final void W0() {
        SearchFieldSectionType searchFieldSectionType = ((TripPlannerResultsState) this.f.getValue()).f;
        int i = searchFieldSectionType == null ? -1 : WhenMappings.f4786a[searchFieldSectionType.ordinal()];
        boolean z = true;
        if (i != -1) {
            if (i == 1) {
                z = false;
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (S0() && z) {
            T0(new TripPlannerResultIntent.ProceedClickedIntent(false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00f7 -> B:33:0x0101). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object X0(java.util.List r19, app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent.X0(java.util.List, app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (TripPlannerResultsState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new TripPlannerResultsState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new TripPlannerResultsState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        this.m.e();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        T0(TripPlannerResultIntent.FragmentStartedIntent.f4767a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        T0(TripPlannerResultIntent.FragmentStoppedIntent.f4768a);
    }
}
