package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.citydata.domain.FetchNearbyStopsUseCase;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.routedetails.data.model.ui.MarkerStopType;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsCustomStopMarkerInfo;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsCustomStopTagInfo;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopHelpTag;
import app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures;
import app.chalo.livetracking.search.StopBasedSearchScreenData;
import app.chalo.livetracking.search.StopTripPlannerResultStateManager;
import app.chalo.livetracking.search.StopTripResultAction;
import app.chalo.livetracking.search.StopTripResultState;
import app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopTripPlannerResultUiStateFactory;
import app.chalo.livetracking.tripplanner.data.models.app.LiveEtaAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegFareInfoAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegLiveBusNumberAvailability;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModelKt;
import app.chalo.livetracking.tripplanner.domain.ItineraryEtaInfo;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoRequest;
import app.chalo.livetracking.tripplanner.domain.ItineraryLiveInfoResult;
import app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase;
import app.chalo.livetracking.tripplanner.domain.MakeTripPlannerWithBusArrivalCallUseCase;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.g41;
import defpackage.ib1;
import defpackage.l4;
import defpackage.l91;
import defpackage.mb1;
import defpackage.va;
import defpackage.vo1;
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
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultsDataState;", "Lapp/chalo/livetracking/stoptripplannerresult/uistate/StopBasedTripPlannerUiState;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultsEffect;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopTripPlannerResultsComponent extends ChaloBaseStateMviComponent<StopTripPlannerResultIntent, StopTripPlannerResultsDataState, StopBasedTripPlannerUiState, StopTripPlannerResultsEffect> {
    public final MakeTripPlannerCallUseCase k;
    public final MakeTripPlannerWithBusArrivalCallUseCase l;
    public final TripPlannerItineraryLiveInfoManager m;
    public final BasicInfoContract n;
    public final AnalyticsContract o;
    public final StopTripPlannerResultStateManager p;
    public final StopTripPlannerResultUiStateFactory q;
    public final ChaloNavigationManager r;
    public final TimeUtilsContract s;
    public final FetchNearbyStopsUseCase t;
    public boolean u;
    public Long v;
    public Job w;
    public Job x;
    public Job y;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultsComponent$Companion;", "", "", "REFRESH_NUDGE_DELAY_MS", "J", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4560a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[StopTripPlannerStopEditTarget.values().length];
            try {
                iArr[StopTripPlannerStopEditTarget.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopTripPlannerStopEditTarget.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StopTripPlannerStopEditTarget.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4560a = iArr;
            int[] iArr2 = new int[Source.values().length];
            try {
                iArr2[Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
            int[] iArr3 = new int[StopTripPlannerTabType.values().length];
            try {
                iArr3[StopTripPlannerTabType.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[StopTripPlannerTabType.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            c = iArr3;
        }
    }

    public StopTripPlannerResultsComponent(ComponentContext componentContext, TripPlannerArgs.StopFocusedResultsScreen stopFocusedResultsScreen, MakeTripPlannerCallUseCase makeTripPlannerCallUseCase, MakeTripPlannerWithBusArrivalCallUseCase makeTripPlannerWithBusArrivalCallUseCase, TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, BasicInfoContract basicInfoContract, AnalyticsContract analyticsContract, StopTripPlannerResultStateManager stopTripPlannerResultStateManager, StopTripPlannerResultUiStateFactory stopTripPlannerResultUiStateFactory, ChaloNavigationManager chaloNavigationManager, TimeUtilsContract timeUtilsContract, FetchNearbyStopsUseCase fetchNearbyStopsUseCase) {
        super(componentContext);
        this.k = makeTripPlannerCallUseCase;
        this.l = makeTripPlannerWithBusArrivalCallUseCase;
        this.m = tripPlannerItineraryLiveInfoManager;
        this.n = basicInfoContract;
        this.o = analyticsContract;
        this.p = stopTripPlannerResultStateManager;
        this.q = stopTripPlannerResultUiStateFactory;
        this.r = chaloNavigationManager;
        this.s = timeUtilsContract;
        this.t = fetchNearbyStopsUseCase;
        this.u = true;
        Json json = ChaloJson.b;
        String str = stopFocusedResultsScreen.c;
        json.getClass();
        N0(new StopTripPlannerResultIntent.InitializationIntent((StopTripPlannerResultScreenData) json.b(str, StopTripPlannerResultScreenData.INSTANCE.serializer())));
    }

    public static final Object F0(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget, StopTripPlannerLocationType.NearestStopToPlaceSelected nearestStopToPlaceSelected, Continuation continuation) {
        stopTripPlannerResultsComponent.getClass();
        List list = nearestStopToPlaceSelected.e;
        RecentPlaceAppModel recentPlaceAppModel = nearestStopToPlaceSelected.d;
        Unit unit = Unit.f17538a;
        if (list != null && !list.isEmpty()) {
            stopTripPlannerResultsComponent.E0(new g41(19, new StopBasedTripPlannerResultsBottomSheetType.NearestStops(recentPlaceAppModel, nearestStopToPlaceSelected.e), stopTripPlannerStopEditTarget));
            return unit;
        }
        stopTripPlannerResultsComponent.E0(new l91(stopTripPlannerStopEditTarget, 15));
        Object objJ0 = stopTripPlannerResultsComponent.J0(recentPlaceAppModel, (ContinuationImpl) continuation);
        return objJ0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ0 : unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object G0(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget, ContinuationImpl continuationImpl) {
        StopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1 stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1;
        StopTripResultAction stopTripResultAction;
        StopTripResultAction stopTripResultAction2;
        StopTripPlannerResultStateManager stopTripPlannerResultStateManager;
        String str;
        StateFlow stateFlow = stopTripPlannerResultsComponent.f;
        ChaloNavigationManager chaloNavigationManager = stopTripPlannerResultsComponent.r;
        if (continuationImpl instanceof StopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1) {
            stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1 = (StopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1) continuationImpl;
            int i = stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1 = new StopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1(stopTripPlannerResultsComponent, continuationImpl);
            }
        } else {
            stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1 = new StopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1(stopTripPlannerResultsComponent, continuationImpl);
        }
        Object obj = stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            int i3 = WhenMappings.f4560a[stopTripPlannerStopEditTarget.ordinal()];
            if (i3 == 1) {
                stopTripResultAction = StopTripResultAction.EditFrom;
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                stopTripResultAction = StopTripResultAction.EditTo;
            }
            StopTripPlannerResultStateManager stopTripPlannerResultStateManager2 = stopTripPlannerResultsComponent.p;
            String str2 = ((StopTripPlannerResultsDataState) stateFlow.getValue()).f4565a;
            BasicInfoContract basicInfoContract = stopTripPlannerResultsComponent.n;
            stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.L$0 = stopTripResultAction;
            stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.L$1 = stopTripPlannerResultStateManager2;
            stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.L$2 = str2;
            stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.label = 1;
            Object objC = basicInfoContract.c(stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            stopTripResultAction2 = stopTripResultAction;
            stopTripPlannerResultStateManager = stopTripPlannerResultStateManager2;
            obj = objC;
            str = str2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.L$2;
            stopTripPlannerResultStateManager = (StopTripPlannerResultStateManager) stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.L$1;
            stopTripResultAction2 = (StopTripResultAction) stopTripPlannerResultsComponent$handleStopEditFromSearchScreenNavigation$1.L$0;
            ResultKt.b(obj);
        }
        stopTripPlannerResultStateManager.c(new StopTripResultState(((Number) obj).longValue(), stopTripResultAction2), str);
        if (WhenMappings.b[((StopTripPlannerResultsDataState) stateFlow.getValue()).b.ordinal()] == 1) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
        } else {
            StopBasedSearchScreenData stopBasedSearchScreenData = new StopBasedSearchScreenData(Source.STOP_BASED_TRIP_PLANNER, StopTripPlannerResultsContractKt.a(((StopTripPlannerResultsDataState) stateFlow.getValue()).c), StopTripPlannerResultsContractKt.a(((StopTripPlannerResultsDataState) stateFlow.getValue()).d));
            Json json = ChaloJson.b;
            json.getClass();
            ChaloNavigationManagerKt.e(chaloNavigationManager, new TripPlannerArgs.StopFocusedSearchScreen(json.a(StopBasedSearchScreenData.INSTANCE.serializer(), stopBasedSearchScreenData)), new ChaloNavOptions(PopUpToConfig.Prev.f9221a, 3), 4);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, ChaloUseCaseResult.Success success, ContinuationImpl continuationImpl) {
        StopTripPlannerResultsComponent$processTripPlannerSuccessResult$1 stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1;
        stopTripPlannerResultsComponent.getClass();
        if (continuationImpl instanceof StopTripPlannerResultsComponent$processTripPlannerSuccessResult$1) {
            stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1 = (StopTripPlannerResultsComponent$processTripPlannerSuccessResult$1) continuationImpl;
            int i = stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1 = new StopTripPlannerResultsComponent$processTripPlannerSuccessResult$1(stopTripPlannerResultsComponent, continuationImpl);
            }
        } else {
            stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1 = new StopTripPlannerResultsComponent$processTripPlannerSuccessResult$1(stopTripPlannerResultsComponent, continuationImpl);
        }
        Object obj = stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            TripPlannerResultAppResponseModel tripPlannerResultAppResponseModel = (TripPlannerResultAppResponseModel) success.f10419a;
            List list = tripPlannerResultAppResponseModel.f4682a;
            List list2 = tripPlannerResultAppResponseModel.b;
            stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1.label = 1;
            if (stopTripPlannerResultsComponent.R0(list, list2, stopTripPlannerResultsComponent$processTripPlannerSuccessResult$1) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Job job = stopTripPlannerResultsComponent.y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        stopTripPlannerResultsComponent.y = BuildersKt.d(stopTripPlannerResultsComponent.j, null, null, new StopTripPlannerResultsComponent$startRefreshNudgeTimer$1(stopTripPlannerResultsComponent, null), 3);
        return Unit.f17538a;
    }

    public static LinkedHashMap K0(TripPlannerLegAppModel.Bus bus) {
        Double d;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = bus.z;
        linkedHashMap.put("route id", bus.p);
        linkedHashMap.put("route name", String.valueOf(bus.q));
        LiveEtaAppModel liveEtaAppModel = bus.H;
        if (liveEtaAppModel != null && (str = liveEtaAppModel.b) != null) {
            linkedHashMap.put("vehicle no", str);
        }
        Double d2 = bus.k;
        linkedHashMap.put("legDistanceInMeters", String.valueOf(d2 != null ? d2.doubleValue() : 0.0d));
        Double d3 = bus.l;
        linkedHashMap.put("legTravelTimeInSeconds", String.valueOf(d3 != null ? d3.doubleValue() : 0.0d));
        String str2 = bus.D;
        if (str2 != null) {
            linkedHashMap.put("via", str2);
        }
        TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel = bus.B;
        if (tripPlannerLegFareInfoAppResponseModel != null && (d = tripPlannerLegFareInfoAppResponseModel.b) != null) {
            linkedHashMap.put("fare", String.valueOf(d.doubleValue()));
        }
        if (!list.isEmpty()) {
            linkedHashMap.put("tags", CollectionsKt.O(list, ",", null, null, null, 62));
        }
        return linkedHashMap;
    }

    public final void I0(ArrayList arrayList) {
        Job job = this.x;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.m.c(arrayList, 10800);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        this.x = BuildersKt.d(this.j, null, null, new StopTripPlannerResultsComponent$addItinerariesForLiveInfoAndStartCollectingResult$1(this, booleanRef, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object J0(final RecentPlaceAppModel recentPlaceAppModel, ContinuationImpl continuationImpl) {
        StopTripPlannerResultsComponent$fetchNearestStopsForPlace$1 stopTripPlannerResultsComponent$fetchNearestStopsForPlace$1;
        if (continuationImpl instanceof StopTripPlannerResultsComponent$fetchNearestStopsForPlace$1) {
            stopTripPlannerResultsComponent$fetchNearestStopsForPlace$1 = (StopTripPlannerResultsComponent$fetchNearestStopsForPlace$1) continuationImpl;
            int i = stopTripPlannerResultsComponent$fetchNearestStopsForPlace$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultsComponent$fetchNearestStopsForPlace$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultsComponent$fetchNearestStopsForPlace$1 = new StopTripPlannerResultsComponent$fetchNearestStopsForPlace$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultsComponent$fetchNearestStopsForPlace$1 = new StopTripPlannerResultsComponent$fetchNearestStopsForPlace$1(this, continuationImpl);
        }
        StopTripPlannerResultsComponent$fetchNearestStopsForPlace$1 stopTripPlannerResultsComponent$fetchNearestStopsForPlace$2 = stopTripPlannerResultsComponent$fetchNearestStopsForPlace$1;
        Object objA = stopTripPlannerResultsComponent$fetchNearestStopsForPlace$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultsComponent$fetchNearestStopsForPlace$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            E0(new mb1(20));
            LatLng latLng = recentPlaceAppModel.j;
            double d = latLng.f5134a;
            double d2 = latLng.b;
            ChaloTransitMode chaloTransitMode = ChaloTransitMode.BUS;
            stopTripPlannerResultsComponent$fetchNearestStopsForPlace$2.L$0 = recentPlaceAppModel;
            stopTripPlannerResultsComponent$fetchNearestStopsForPlace$2.label = 1;
            objA = this.t.a(d, d2, chaloTransitMode, stopTripPlannerResultsComponent$fetchNearestStopsForPlace$2);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recentPlaceAppModel = (RecentPlaceAppModel) stopTripPlannerResultsComponent$fetchNearestStopsForPlace$2.L$0;
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            final List list = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            if (list.isEmpty()) {
                E0(new ib1(6, recentPlaceAppModel));
            } else {
                StateFlow stateFlow = this.f;
                int i3 = WhenMappings.f4560a[((StopTripPlannerResultsDataState) stateFlow.getValue()).n.ordinal()];
                if (i3 == 1) {
                    StopTripPlannerLocationType stopTripPlannerLocationType = ((StopTripPlannerResultsDataState) stateFlow.getValue()).c;
                    if (stopTripPlannerLocationType instanceof StopTripPlannerLocationType.NearestStopToPlaceSelected) {
                        final StopTripPlannerLocationType.NearestStopToPlaceSelected nearestStopToPlaceSelectedD = StopTripPlannerLocationType.NearestStopToPlaceSelected.d((StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType, list);
                        final int i4 = 0;
                        E0(new Function1() { // from class: wb1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                StopTripPlannerResultsDataState it = (StopTripPlannerResultsDataState) obj;
                                switch (i4) {
                                    case 0:
                                        Intrinsics.i(it, "it");
                                        return StopTripPlannerResultsDataState.a(it, null, null, nearestStopToPlaceSelectedD, null, null, null, null, null, null, null, new StopBasedTripPlannerResultsBottomSheetType.NearestStops(recentPlaceAppModel, list), false, null, false, null, false, null, 511995);
                                    default:
                                        Intrinsics.i(it, "it");
                                        return StopTripPlannerResultsDataState.a(it, null, null, null, nearestStopToPlaceSelectedD, null, null, null, null, null, null, new StopBasedTripPlannerResultsBottomSheetType.NearestStops(recentPlaceAppModel, list), false, null, false, null, false, null, 511991);
                                }
                            }
                        });
                    }
                } else if (i3 == 2) {
                    StopTripPlannerLocationType stopTripPlannerLocationType2 = ((StopTripPlannerResultsDataState) stateFlow.getValue()).d;
                    if (stopTripPlannerLocationType2 instanceof StopTripPlannerLocationType.NearestStopToPlaceSelected) {
                        final StopTripPlannerLocationType.NearestStopToPlaceSelected nearestStopToPlaceSelectedD2 = StopTripPlannerLocationType.NearestStopToPlaceSelected.d((StopTripPlannerLocationType.NearestStopToPlaceSelected) stopTripPlannerLocationType2, list);
                        final int i5 = 1;
                        E0(new Function1() { // from class: wb1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                StopTripPlannerResultsDataState it = (StopTripPlannerResultsDataState) obj;
                                switch (i5) {
                                    case 0:
                                        Intrinsics.i(it, "it");
                                        return StopTripPlannerResultsDataState.a(it, null, null, nearestStopToPlaceSelectedD2, null, null, null, null, null, null, null, new StopBasedTripPlannerResultsBottomSheetType.NearestStops(recentPlaceAppModel, list), false, null, false, null, false, null, 511995);
                                    default:
                                        Intrinsics.i(it, "it");
                                        return StopTripPlannerResultsDataState.a(it, null, null, null, nearestStopToPlaceSelectedD2, null, null, null, null, null, null, new StopBasedTripPlannerResultsBottomSheetType.NearestStops(recentPlaceAppModel, list), false, null, false, null, false, null, 511991);
                                }
                            }
                        });
                    }
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new ib1(9, recentPlaceAppModel));
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L0(String str, List list, ContinuationImpl continuationImpl) {
        StopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1 stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1;
        Ref.DoubleRef doubleRef;
        TripPlannerLegAppModel tripPlannerLegAppModel;
        String str2;
        Ref.DoubleRef doubleRef2;
        long jLongValue;
        if (continuationImpl instanceof StopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1) {
            stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1 = (StopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1) continuationImpl;
            int i = stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1 = new StopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1(this, continuationImpl);
            }
        } else {
            stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1 = new StopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1(this, continuationImpl);
        }
        Object obj = stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            doubleRef = new Ref.DoubleRef();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tripPlannerLegAppModel = (TripPlannerLegAppModel) it.next();
                if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                    int i3 = WhenMappings.c[((StopTripPlannerResultsDataState) this.f.getValue()).k.ordinal()];
                    if (i3 == 1) {
                        TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
                        if (!bus.i()) {
                            return null;
                        }
                        String str3 = bus.p;
                        String str4 = bus.s.f1727a;
                        LiveEtaAppModel liveEtaAppModel = bus.H;
                        if (liveEtaAppModel == null || (str2 = liveEtaAppModel.b) == null) {
                            str2 = "";
                        }
                        return new ItineraryLiveInfoRequest.SpecificVehicle(str, str3, str4, str2);
                    }
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Long l = this.v;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$0 = str;
                        stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$1 = doubleRef;
                        stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$2 = tripPlannerLegAppModel;
                        stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.label = 1;
                        Object objC = this.n.c(stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1);
                        if (objC == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = objC;
                        doubleRef2 = doubleRef;
                    }
                    TripPlannerLegAppModel.Bus bus2 = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
                    return new ItineraryLiveInfoRequest.FirstValidVehicle((((long) doubleRef.element) * ((long) 1000)) + jLongValue, str, bus2.p, bus2.s.f1727a);
                }
                if (!(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Auto) && !Intrinsics.d(tripPlannerLegAppModel, TripPlannerLegAppModel.Ferry.INSTANCE) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro) && !Intrinsics.d(tripPlannerLegAppModel, TripPlannerLegAppModel.MonoRail.INSTANCE) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Railway) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Taxi) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Walk)) {
                    throw new NoWhenBranchMatchedException();
                }
                double d = doubleRef.element;
                Double d2 = tripPlannerLegAppModel.getD();
                doubleRef.element = d + (d2 != null ? d2.doubleValue() : 0.0d);
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TripPlannerLegAppModel tripPlannerLegAppModel2 = (TripPlannerLegAppModel) stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$2;
        doubleRef2 = (Ref.DoubleRef) stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$1;
        String str5 = (String) stopTripPlannerResultsComponent$getLiveInfoFetchRequestForRelevantLeg$1.L$0;
        ResultKt.b(obj);
        tripPlannerLegAppModel = tripPlannerLegAppModel2;
        str = str5;
        jLongValue = ((Number) obj).longValue();
        doubleRef = doubleRef2;
        TripPlannerLegAppModel.Bus bus3 = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
        return new ItineraryLiveInfoRequest.FirstValidVehicle((((long) doubleRef.element) * ((long) 1000)) + jLongValue, str, bus3.p, bus3.s.f1727a);
    }

    public final void M0(boolean z) {
        if (z) {
            AnalyticsContractImplKt.b(this.o, "stop trip planner result try again click", Source.STOP_BASED_TRIP_PLANNER, vo1.s("selectedTab", ((StopTripPlannerResultsDataState) this.f.getValue()).k.getTabName()), false, 24);
        }
        Job job = this.w;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.w = BuildersKt.d(this.j, null, null, new StopTripPlannerResultsComponent$handleStartTripSearchIntent$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void N0(StopTripPlannerResultIntent intent) {
        boolean z;
        StopTripPlannerItineraryInfoHolder stopTripPlannerItineraryInfoHolder;
        TripPlannerLegAppModel tripPlannerLegAppModel;
        Map mapK;
        Integer num;
        ItineraryLiveInfoRequest itineraryLiveInfoRequest;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z2 = intent instanceof StopTripPlannerResultIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z2) {
            StopTripPlannerResultIntent.InitializationIntent initializationIntent = (StopTripPlannerResultIntent.InitializationIntent) intent;
            if (this.u) {
                StopTripPlannerResultScreenData stopTripPlannerResultScreenData = initializationIntent.f4538a;
                StopTripPlannerLocationType stopTripPlannerLocationType = stopTripPlannerResultScreenData.f4558a;
                StopTripPlannerLocationType stopTripPlannerLocationType2 = stopTripPlannerResultScreenData.b;
                Source source = stopTripPlannerResultScreenData.c;
                Source source2 = Source.STOP_BASED_TRIP_PLANNER;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(stopTripPlannerLocationType.c("from_"));
                linkedHashMap.putAll(stopTripPlannerLocationType2.c("to_"));
                linkedHashMap.put("selectedTab", StopTripPlannerTabType.DIRECT.getTabName());
                linkedHashMap.put("previousScreen", source);
                AnalyticsContractImplKt.b(this.o, "stop trip planner result opened", source2, linkedHashMap, false, 24);
                this.u = false;
                BuildersKt.d(contextScope, null, null, new StopTripPlannerResultsComponent$handleInitializationIntent$1(this, initializationIntent, stopTripPlannerLocationType, stopTripPlannerLocationType2, null), 3);
                return;
            }
            return;
        }
        boolean z3 = intent instanceof StopTripPlannerResultIntent.SearchStopUpdateFieldClickedIntent;
        StateFlow stateFlow = this.f;
        if (z3) {
            boolean z4 = ((StopTripPlannerResultIntent.SearchStopUpdateFieldClickedIntent) intent).f4557a;
            StopTripPlannerStopEditTarget stopTripPlannerStopEditTarget = z4 ? StopTripPlannerStopEditTarget.FROM : StopTripPlannerStopEditTarget.TO;
            Source source3 = Source.STOP_BASED_TRIP_PLANNER;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (z4) {
                linkedHashMap2.putAll(((StopTripPlannerResultsDataState) stateFlow.getValue()).c.c("from_"));
            } else {
                linkedHashMap2.putAll(((StopTripPlannerResultsDataState) stateFlow.getValue()).d.c("to_"));
            }
            AnalyticsContractImplKt.b(this.o, "stop trip planner result edit clicked", source3, linkedHashMap2, false, 24);
            BuildersKt.d(contextScope, null, null, new StopTripPlannerResultsComponent$handleSearchStopFieldClickedIntent$2(stopTripPlannerStopEditTarget, this, null), 3);
            return;
        }
        if (intent.equals(StopTripPlannerResultIntent.FragmentStartedIntent.f4536a)) {
            Q0();
            return;
        }
        if (intent.equals(StopTripPlannerResultIntent.FragmentStoppedIntent.f4537a)) {
            Job job = this.x;
            if (job != null) {
                ((JobSupport) job).cancel(null);
                return;
            }
            return;
        }
        final int i = 1;
        if (intent instanceof StopTripPlannerResultIntent.ItineraryLegClickedIntent) {
            StopTripPlannerResultIntent.ItineraryLegClickedIntent itineraryLegClickedIntent = (StopTripPlannerResultIntent.ItineraryLegClickedIntent) intent;
            TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = itineraryLegClickedIntent.f4539a;
            TripPlannerLegAppModel.Bus bus = itineraryLegClickedIntent.b;
            int i2 = itineraryLegClickedIntent.c;
            Pair pair = itineraryLegClickedIntent.d;
            Pair pair2 = itineraryLegClickedIntent.e;
            String strA = bus.m;
            if (strA == null) {
                strA = ((StopTripPlannerResultsDataState) stateFlow.getValue()).c.a();
            } else {
                if (StringsKt.F(strA)) {
                    strA = null;
                }
                if (strA == null) {
                    strA = ((StopTripPlannerResultsDataState) stateFlow.getValue()).c.a();
                }
            }
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("origin", String.valueOf(strA)), new Pair(FirebaseAnalytics.Param.DESTINATION, String.valueOf(bus.n)), new Pair("selectedTab", ((StopTripPlannerResultsDataState) stateFlow.getValue()).k.getTabName()));
            linkedHashMapK.putAll(K0(bus));
            linkedHashMapK.putAll(TripPlannerResultAppResponseModelKt.d(tripPlannerItineraryAppResponseModel));
            Map map = ((StopTripPlannerResultsDataState) stateFlow.getValue()).f;
            ItineraryLiveInfoResult itineraryLiveInfoResult = map != null ? (ItineraryLiveInfoResult) map.get(tripPlannerItineraryAppResponseModel.f4663a) : null;
            boolean zD = Intrinsics.d(bus.p, (itineraryLiveInfoResult == null || (itineraryLiveInfoRequest = itineraryLiveInfoResult.f4701a) == null) ? null : itineraryLiveInfoRequest.getB());
            ItineraryEtaInfo itineraryEtaInfo = itineraryLiveInfoResult != null ? itineraryLiveInfoResult.b : null;
            if (!zD || itineraryEtaInfo == null) {
                TimeUtilsContract timeUtilsContract = this.s;
                Intrinsics.i(timeUtilsContract, "timeUtilsContract");
                if (!bus.v || (num = bus.w) == null) {
                    Integer num2 = bus.E;
                    mapK = num2 != null ? MapsKt.k(new Pair("scheduledTime", timeUtilsContract.i(num2.intValue()))) : MapsKt.d();
                } else {
                    mapK = MapsKt.k(new Pair("frequency", String.valueOf(num.intValue())));
                }
                if (!mapK.isEmpty()) {
                    linkedHashMapK.put("nextArrivalType", "scheduled");
                    linkedHashMapK.putAll(mapK);
                }
            } else {
                linkedHashMapK.put("etaInSeconds", String.valueOf(itineraryEtaInfo.f4698a));
                linkedHashMapK.put("nextArrivalType", "eta");
                linkedHashMapK.put("vehicle no", itineraryEtaInfo.b);
                linkedHashMapK.put("isHalted", String.valueOf(itineraryEtaInfo.d));
                Long l = itineraryEtaInfo.e;
                if (l != null) {
                    linkedHashMapK.put("isDelayed", String.valueOf(l.longValue()));
                }
            }
            if (pair != null) {
                linkedHashMapK.put("distanceToPreviousLocation", String.valueOf(((Number) pair.d()).doubleValue()));
                linkedHashMapK.put("previousLocationName", pair.e());
            }
            if (pair2 != null) {
                linkedHashMapK.put("distanceToNextLocation", String.valueOf(((Number) pair2.d()).doubleValue()));
                linkedHashMapK.put("nextLocationName", pair2.e());
            }
            AnalyticsContractImplKt.b(this.o, "stop trip planner result leg clicked", Source.STOP_BASED_TRIP_PLANNER, linkedHashMapK, false, 24);
            if (P0(tripPlannerItineraryAppResponseModel, bus, i2)) {
                return;
            }
            O0(bus);
            return;
        }
        if (intent instanceof StopTripPlannerResultIntent.ItineraryMoreDetailsClickedIntent) {
            String str = ((StopTripPlannerResultIntent.ItineraryMoreDetailsClickedIntent) intent).f4540a;
            Map mapB = ((StopTripPlannerResultsDataState) stateFlow.getValue()).b();
            if (mapB == null || (stopTripPlannerItineraryInfoHolder = (StopTripPlannerItineraryInfoHolder) mapB.get(str)) == null) {
                return;
            }
            TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel2 = stopTripPlannerItineraryInfoHolder.f4530a;
            List list = tripPlannerItineraryAppResponseModel2.f;
            TripPlannerLegAppModel tripPlannerLegAppModel2 = (TripPlannerLegAppModel) CollectionsKt.H(list);
            if (tripPlannerLegAppModel2 != null && (tripPlannerLegAppModel = (TripPlannerLegAppModel) CollectionsKt.Q(list)) != null) {
                LinkedHashMap linkedHashMapK2 = MapsKt.k(new Pair("origin", String.valueOf(tripPlannerLegAppModel2.getE())), new Pair(FirebaseAnalytics.Param.DESTINATION, String.valueOf(tripPlannerLegAppModel.getF())));
                linkedHashMapK2.putAll(TripPlannerResultAppResponseModelKt.d(tripPlannerItineraryAppResponseModel2));
                AnalyticsContractImplKt.b(this.o, "stop trip planner more details click", Source.STOP_BASED_TRIP_PLANNER, linkedHashMapK2, false, 24);
            }
            BuildersKt.d(contextScope, null, null, new StopTripPlannerResultsComponent$handleItineraryMoreDetailsClickedIntent$1(this, stopTripPlannerItineraryInfoHolder, null), 3);
            return;
        }
        if (intent instanceof StopTripPlannerResultIntent.ResultTypeTabClickedIntent) {
            StopTripPlannerResultIntent.ResultTypeTabClickedIntent resultTypeTabClickedIntent = (StopTripPlannerResultIntent.ResultTypeTabClickedIntent) intent;
            StopTripPlannerTabType stopTripPlannerTabType = resultTypeTabClickedIntent.f4555a;
            Map map2 = ((StopTripPlannerResultsDataState) stateFlow.getValue()).e;
            Map map3 = map2 != null ? (Map) map2.get(stopTripPlannerTabType) : null;
            Source source4 = Source.STOP_BASED_TRIP_PLANNER;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("selectedTab", stopTripPlannerTabType.getTabName());
            AnalyticsContractImplKt.b(this.o, "stop trip planner result tab clicked", source4, linkedHashMap3, false, 24);
            E0(new g41(20, resultTypeTabClickedIntent, map3));
            Map map4 = ((StopTripPlannerResultsDataState) stateFlow.getValue()).e;
            Map map5 = map4 != null ? (Map) map4.get(stopTripPlannerTabType) : null;
            Job job2 = this.w;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            if (map5 == null) {
                M0(false);
                return;
            } else {
                Q0();
                return;
            }
        }
        if (intent.equals(StopTripPlannerResultIntent.OnTryAgainClick.f4553a)) {
            M0(true);
            return;
        }
        if (intent instanceof StopTripPlannerResultIntent.OnStepCountClicked) {
            StopTripPlannerResultIntent.OnStepCountClicked onStepCountClicked = (StopTripPlannerResultIntent.OnStepCountClicked) intent;
            Source source5 = Source.STOP_BASED_TRIP_PLANNER;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.putAll(TripPlannerResultAppResponseModelKt.d(onStepCountClicked.f4549a));
            linkedHashMap4.putAll(K0(onStepCountClicked.b));
            linkedHashMap4.put("stepCount", Integer.valueOf(onStepCountClicked.c));
            AnalyticsContractImplKt.b(this.o, "stop trip planner result to clicked", source5, linkedHashMap4, false, 24);
            return;
        }
        if (intent.equals(StopTripPlannerResultIntent.OnSwapButtonClick.f4550a)) {
            E0(new g41(21, ((StopTripPlannerResultsDataState) stateFlow.getValue()).d, ((StopTripPlannerResultsDataState) stateFlow.getValue()).c));
            M0(false);
            return;
        }
        if (intent.equals(StopTripPlannerResultIntent.OnBackPressed.f4545a)) {
            AnalyticsContractImplKt.b(this.o, "stop trip planner results back pressed", Source.STOP_BASED_TRIP_PLANNER, null, false, 28);
            BuildersKt.d(contextScope, null, null, new StopTripPlannerResultsComponent$handleOnBackPressedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(StopTripPlannerResultIntent.BottomSheetCloseClickedIntent.f4535a)) {
            E0(new mb1(14));
            return;
        }
        if (intent instanceof StopTripPlannerResultIntent.OnNearestStopSelected) {
            StopTripPlannerResultIntent.OnNearestStopSelected onNearestStopSelected = (StopTripPlannerResultIntent.OnNearestStopSelected) intent;
            final NearbyStopToLocationAppModel nearbyStopToLocationAppModel = onNearestStopSelected.f4546a;
            final RecentPlaceAppModel recentPlaceAppModel = onNearestStopSelected.b;
            final List list2 = onNearestStopSelected.c;
            int i3 = WhenMappings.f4560a[((StopTripPlannerResultsDataState) stateFlow.getValue()).n.ordinal()];
            if (i3 == 1) {
                z = false;
                final Object[] objArr = 0 == true ? 1 : 0;
                E0(new Function1() { // from class: vb1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        StopTripPlannerResultsDataState it = (StopTripPlannerResultsDataState) obj;
                        switch (objArr) {
                            case 0:
                                Intrinsics.i(it, "it");
                                return StopTripPlannerResultsDataState.a(it, null, null, new StopTripPlannerLocationType.NearestStopToPlaceSelected(nearbyStopToLocationAppModel, recentPlaceAppModel, list2), null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 487307);
                            default:
                                Intrinsics.i(it, "it");
                                return StopTripPlannerResultsDataState.a(it, null, null, null, new StopTripPlannerLocationType.NearestStopToPlaceSelected(nearbyStopToLocationAppModel, recentPlaceAppModel, list2), null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 487303);
                        }
                    }
                });
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    E0(new mb1(18));
                    return;
                }
                E0(new Function1() { // from class: vb1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        StopTripPlannerResultsDataState it = (StopTripPlannerResultsDataState) obj;
                        switch (i) {
                            case 0:
                                Intrinsics.i(it, "it");
                                return StopTripPlannerResultsDataState.a(it, null, null, new StopTripPlannerLocationType.NearestStopToPlaceSelected(nearbyStopToLocationAppModel, recentPlaceAppModel, list2), null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 487307);
                            default:
                                Intrinsics.i(it, "it");
                                return StopTripPlannerResultsDataState.a(it, null, null, null, new StopTripPlannerLocationType.NearestStopToPlaceSelected(nearbyStopToLocationAppModel, recentPlaceAppModel, list2), null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 487303);
                        }
                    }
                });
                z = false;
            }
            M0(z);
            return;
        }
        if (intent instanceof StopTripPlannerResultIntent.OnShowAllNearbyStopsClick) {
            RecentPlaceAppModel recentPlaceAppModel2 = ((StopTripPlannerResultIntent.OnShowAllNearbyStopsClick) intent).f4548a;
            int i4 = WhenMappings.f4560a[((StopTripPlannerResultsDataState) stateFlow.getValue()).n.ordinal()];
            if (i4 == 1) {
                E0(new ib1(7, recentPlaceAppModel2));
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    E0(new mb1(19));
                    return;
                }
                E0(new ib1(8, recentPlaceAppModel2));
            }
            M0(false);
            return;
        }
        if (intent.equals(StopTripPlannerResultIntent.NearbyStopBottomSheetSearchClick.f4543a)) {
            BuildersKt.d(contextScope, null, null, new StopTripPlannerResultsComponent$handleNearbyStopBottomSheetSearchClick$1(this, null), 3);
            return;
        }
        if (intent instanceof StopTripPlannerResultIntent.RetryNearbyStopFetchIntent) {
            RecentPlaceAppModel recentPlaceAppModel3 = ((StopTripPlannerResultIntent.RetryNearbyStopFetchIntent) intent).f4556a;
            E0(new mb1(15));
            BuildersKt.d(contextScope, null, null, new StopTripPlannerResultsComponent$handleRetryNearbyStopFetchIntent$2(this, recentPlaceAppModel3, null), 3);
            return;
        }
        int i5 = 17;
        if (intent.equals(StopTripPlannerResultIntent.NearbyStopsResultsHeaderClickedIntent.f4544a)) {
            boolean z5 = !((StopTripPlannerResultsDataState) stateFlow.getValue()).o;
            AnalyticsContractImplKt.b(this.o, "stop trip planner nearby stops toggled", Source.STOP_BASED_TRIP_PLANNER, MapsKt.h(new Pair("isCollapsed", Boolean.valueOf(z5))), false, 24);
            E0(new va(z5, i5));
            return;
        }
        int i6 = 16;
        if (intent.equals(StopTripPlannerResultIntent.RefreshNudgeClickedIntent.f4554a)) {
            Source source6 = Source.STOP_BASED_TRIP_PLANNER;
            Pair pair3 = new Pair("selectedTab", ((StopTripPlannerResultsDataState) stateFlow.getValue()).k.getTabName());
            Long l2 = ((StopTripPlannerResultsDataState) stateFlow.getValue()).r;
            AnalyticsContractImplKt.b(this.o, "stop trip planner refresh nudge clicked", source6, MapsKt.i(pair3, new Pair("lastRefreshNudgeTimeStamp", Long.valueOf(l2 != null ? l2.longValue() : -1L))), false, 24);
            StopTripPlannerTabType stopTripPlannerTabType2 = ((StopTripPlannerResultsDataState) stateFlow.getValue()).k;
            StopTripPlannerTabType stopTripPlannerTabType3 = StopTripPlannerTabType.DIRECT;
            if (stopTripPlannerTabType2 == stopTripPlannerTabType3) {
                stopTripPlannerTabType3 = StopTripPlannerTabType.CONNECTING;
            }
            E0(new l91(stopTripPlannerTabType3, i6));
            M0(false);
            return;
        }
        if (intent.equals(StopTripPlannerResultIntent.LiveTrackingNotAvailableBottomSheetNegativeButtonClick.f4541a)) {
            AnalyticsContractImplKt.b(this.o, "stp bottomsheet negative click", Source.STOP_BASED_TRIP_PLANNER, null, false, 28);
            StopBasedTripPlannerResultsBottomSheetType stopBasedTripPlannerResultsBottomSheetType = ((StopTripPlannerResultsDataState) stateFlow.getValue()).l;
            if (stopBasedTripPlannerResultsBottomSheetType instanceof StopBasedTripPlannerResultsBottomSheetType.TrackingNotAvailableForLeg) {
                E0(new mb1(16));
                O0(((StopBasedTripPlannerResultsBottomSheetType.TrackingNotAvailableForLeg) stopBasedTripPlannerResultsBottomSheetType).b);
                return;
            }
            return;
        }
        if (intent.equals(StopTripPlannerResultIntent.LiveTrackingNotAvailableBottomSheetPositiveButtonClick.f4542a)) {
            AnalyticsContractImplKt.b(this.o, "stp bottomsheet positive click", Source.STOP_BASED_TRIP_PLANNER, null, false, 28);
            E0(new mb1(17));
            return;
        }
        if (intent instanceof StopTripPlannerResultIntent.OnTrackBusClicked) {
            StopTripPlannerResultIntent.OnTrackBusClicked onTrackBusClicked = (StopTripPlannerResultIntent.OnTrackBusClicked) intent;
            TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel3 = onTrackBusClicked.f4551a;
            TripPlannerLegAppModel.Bus bus2 = onTrackBusClicked.b;
            Source source7 = Source.STOP_BASED_TRIP_PLANNER;
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.putAll(TripPlannerResultAppResponseModelKt.d(tripPlannerItineraryAppResponseModel3));
            linkedHashMap5.putAll(K0(bus2));
            AnalyticsContractImplKt.b(this.o, "stop trip planner live track click", source7, linkedHashMap5, false, 24);
            O0(bus2);
            return;
        }
        if (!(intent instanceof StopTripPlannerResultIntent.OnTrackingNotAvailableViewDetailsClicked)) {
            if (!intent.equals(StopTripPlannerResultIntent.OnReportProblemClicked.f4547a)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContractImplKt.b(this.o, "stop trip planner report problem click", Source.STOP_BASED_TRIP_PLANNER, vo1.s("selectedTab", ((StopTripPlannerResultsDataState) stateFlow.getValue()).k.getTabName()), false, 24);
            return;
        }
        StopTripPlannerResultIntent.OnTrackingNotAvailableViewDetailsClicked onTrackingNotAvailableViewDetailsClicked = (StopTripPlannerResultIntent.OnTrackingNotAvailableViewDetailsClicked) intent;
        TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel4 = onTrackingNotAvailableViewDetailsClicked.f4552a;
        TripPlannerLegAppModel.Bus bus3 = onTrackingNotAvailableViewDetailsClicked.b;
        int i7 = onTrackingNotAvailableViewDetailsClicked.c;
        Source source8 = Source.STOP_BASED_TRIP_PLANNER;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.putAll(TripPlannerResultAppResponseModelKt.d(tripPlannerItineraryAppResponseModel4));
        linkedHashMap6.putAll(K0(bus3));
        AnalyticsContractImplKt.b(this.o, "stp tracking unavailable cta click", source8, linkedHashMap6, false, 24);
        if (P0(tripPlannerItineraryAppResponseModel4, bus3, i7)) {
            return;
        }
        O0(bus3);
    }

    public final void O0(TripPlannerLegAppModel.Bus bus) {
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        StopAppModel stopAppModel = bus.t;
        StopAppModel stopAppModel2 = bus.s;
        String str = stopAppModel2.f1727a;
        String str2 = stopAppModel.f1727a;
        List listS = CollectionsKt.S(new RouteDetailsCustomStopMarkerInfo(str, MarkerStopType.BoardingStop), new RouteDetailsCustomStopMarkerInfo(str2, MarkerStopType.DeboardingStop));
        List listS2 = CollectionsKt.S(new RouteDetailsCustomStopTagInfo(str, RouteDetailsStopHelpTag.BOARDING_STOP), new RouteDetailsCustomStopTagInfo(str2, RouteDetailsStopHelpTag.DEBOARDING_STOP));
        String message = "Custom marker list for route details: " + listS;
        Intrinsics.i(message, "message");
        int i = WhenMappings.c[((StopTripPlannerResultsDataState) this.f.getValue()).k.ordinal()];
        if (i == 1) {
            LiveEtaAppModel liveEtaAppModel = bus.H;
            String str3 = liveEtaAppModel != null ? liveEtaAppModel.b : null;
            if (str3 == null || StringsKt.F(str3)) {
                str3 = null;
            }
            trackingAdditionalFeatures = new TrackingAdditionalFeatures(8159, str3 != null ? CollectionsKt.R(str3) : null, listS, listS2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            trackingAdditionalFeatures = new TrackingAdditionalFeatures(8191, null, listS, listS2);
        }
        RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(bus.p, stopAppModel2.f1727a, stopAppModel.f1727a, null, Source.TRIP_PLANNER.getSourceName(), Boolean.FALSE, false, new TrackingAdditionalFeatures(trackingAdditionalFeatures.f4423a, trackingAdditionalFeatures.b, trackingAdditionalFeatures.c, trackingAdditionalFeatures.d, trackingAdditionalFeatures.e, trackingAdditionalFeatures.f, trackingAdditionalFeatures.g, trackingAdditionalFeatures.h, trackingAdditionalFeatures.i, trackingAdditionalFeatures.j, trackingAdditionalFeatures.k, trackingAdditionalFeatures.l, true, trackingAdditionalFeatures.n, trackingAdditionalFeatures.o));
        Json json = ChaloJson.b;
        json.getClass();
        ChaloNavigationManagerKt.e(this.r, new RouteDetailsArgs(json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel)), null, 6);
    }

    public final boolean P0(TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel, TripPlannerLegAppModel.Bus bus, int i) {
        TripPlannerLegLiveBusNumberAvailability tripPlannerLegLiveBusNumberAvailabilityI = TripPlannerResultAppResponseModelKt.i(bus);
        if (tripPlannerLegLiveBusNumberAvailabilityI instanceof TripPlannerLegLiveBusNumberAvailability.Available) {
            return false;
        }
        if (!tripPlannerLegLiveBusNumberAvailabilityI.equals(TripPlannerLegLiveBusNumberAvailability.NotAvailable.f4677a)) {
            throw new NoWhenBranchMatchedException();
        }
        E0(new l4(tripPlannerItineraryAppResponseModel, bus, i, 8));
        return true;
    }

    public final void Q0() {
        StateFlow stateFlow = this.f;
        StopTripPlannerResultsDataState stopTripPlannerResultsDataState = (StopTripPlannerResultsDataState) stateFlow.getValue();
        Map map = stopTripPlannerResultsDataState.g;
        Map map2 = map != null ? (Map) map.get(stopTripPlannerResultsDataState.k) : null;
        LinkedHashMap linkedHashMapU = map2 != null ? MapsKt.u(map2) : new LinkedHashMap();
        Map mapB = ((StopTripPlannerResultsDataState) stateFlow.getValue()).b();
        LinkedHashMap linkedHashMapL = MapsKt.l(mapB != null ? MapsKt.u(mapB) : new LinkedHashMap(), linkedHashMapU);
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMapL.entrySet().iterator();
        while (it.hasNext()) {
            ItineraryLiveInfoRequest itineraryLiveInfoRequest = ((StopTripPlannerItineraryInfoHolder) ((Map.Entry) it.next()).getValue()).b;
            if (itineraryLiveInfoRequest != null) {
                arrayList.add(itineraryLiveInfoRequest);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        I0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0149  */
    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    /* JADX WARN: Code duplicated, block: B:53:0x016f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e5 -> B:31:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016f -> B:54:0x0172). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object R0(java.util.List r18, java.util.List r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent.R0(java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        StopTripPlannerResultsComponent$convertToUiState$2 stopTripPlannerResultsComponent$convertToUiState$2 = new StopTripPlannerResultsComponent$convertToUiState$2(1, this, StopTripPlannerResultsComponent.class, "processIntent", "processIntent(Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerResultIntent;)V", 0);
        return this.q.B((StopTripPlannerResultsDataState) obj, stopTripPlannerResultsComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        Source source = Source.UNKNOWN;
        StopTripPlannerLocationType.None none = StopTripPlannerLocationType.None.INSTANCE;
        StopTripPlannerResultsectionType stopTripPlannerResultsectionType = StopTripPlannerResultsectionType.LOADING;
        StopTripPlannerResultErrorType stopTripPlannerResultErrorType = StopTripPlannerResultErrorType.NONE;
        StopTripPlannerTabType stopTripPlannerTabType = StopTripPlannerTabType.DIRECT;
        return new StopTripPlannerResultsDataState("", source, none, none, null, null, null, stopTripPlannerResultsectionType, stopTripPlannerResultErrorType, CollectionsKt.S(stopTripPlannerTabType, StopTripPlannerTabType.CONNECTING), stopTripPlannerTabType, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, StopTripPlannerStopEditTarget.NONE, false, null, false, null);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        this.m.e();
        Job job = this.y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.y = null;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        N0(StopTripPlannerResultIntent.FragmentStartedIntent.f4536a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        N0(StopTripPlannerResultIntent.FragmentStoppedIntent.f4537a);
    }
}
