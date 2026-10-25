package app.chalo.livetracking.search;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.error.RemoteDataErrorType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.citydata.domain.FetchNearbyStopsUseCase;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchViewState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultScreenData;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.database.repository.recent.RecentLocationPairRepository;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentsAppModelKt;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ab1;
import defpackage.g41;
import defpackage.g61;
import defpackage.ib1;
import defpackage.jb1;
import defpackage.li0;
import defpackage.mb1;
import defpackage.vo1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchDataState;", "Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchViewState;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchSideEffect;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopBasedTripPlannerSearchComponent extends ChaloBaseStateMviComponent<StopBasedTripPlannerSearchViewIntent, StopBasedTripPlannerSearchDataState, StopBasedTripPlannerSearchViewState, StopBasedTripPlannerSearchSideEffect> {
    public final CityProvider k;
    public final StringProvider l;
    public final RecentRepositoryProvider m;
    public final StopBasedTripPlannerSearchUiStateFactory n;
    public final AnalyticsContract o;
    public final BasicInfoContract p;
    public final FetchNearbyStopsUseCase q;
    public final StopTripPlannerResultStateManager r;
    public final UniversalSearchResultStateManager s;
    public final ChaloNavigationManager t;
    public final String u;
    public Job v;
    public Job w;
    public final Lazy x;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchComponent$Companion;", "", "", "RECENT_TRIP_COUNT", "I", "", "STOP_TRIP_PLANNER_RESULT_MANAGER_REQUEST_ID", "Ljava/lang/String;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4488a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[StopTripResultAction.values().length];
            try {
                iArr[StopTripResultAction.EditFrom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopTripResultAction.EditTo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StopTripResultAction.Back.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4488a = iArr;
            int[] iArr2 = new int[Source.values().length];
            try {
                iArr2[Source.STOP_BASED_TRIP_PLANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
            int[] iArr3 = new int[SearchTarget.values().length];
            try {
                iArr3[SearchTarget.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[SearchTarget.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SearchTarget.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            c = iArr3;
        }
    }

    public StopBasedTripPlannerSearchComponent(ComponentContext componentContext, TripPlannerArgs.StopFocusedSearchScreen stopFocusedSearchScreen, CityProvider cityProvider, StringProvider stringProvider, RecentRepositoryProvider recentRepositoryProvider, StopBasedTripPlannerSearchUiStateFactory stopBasedTripPlannerSearchUiStateFactory, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, FetchNearbyStopsUseCase fetchNearbyStopsUseCase, StopTripPlannerResultStateManager stopTripPlannerResultStateManager, UniversalSearchResultStateManager universalSearchResultStateManager, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = cityProvider;
        this.l = stringProvider;
        this.m = recentRepositoryProvider;
        this.n = stopBasedTripPlannerSearchUiStateFactory;
        this.o = analyticsContract;
        this.p = basicInfoContract;
        this.q = fetchNearbyStopsUseCase;
        this.r = stopTripPlannerResultStateManager;
        this.s = universalSearchResultStateManager;
        this.t = chaloNavigationManager;
        this.u = KUUID.a();
        this.x = LazyKt.b(new g61(this, 17));
        String str = stopFocusedSearchScreen.c;
        StopBasedSearchScreenData stopBasedSearchScreenData = null;
        Object objB = null;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, StopBasedSearchScreenData.INSTANCE.serializer());
            } catch (Exception unused) {
            }
            stopBasedSearchScreenData = (StopBasedSearchScreenData) objB;
        }
        M0(new StopBasedTripPlannerSearchViewIntent.InitialisationIntent(stopBasedSearchScreenData));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1 stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1;
        StopTripPlannerLocationType stop;
        StopTripPlannerResultScreenData stopTripPlannerResultScreenData;
        StopTripPlannerResultScreenData stopTripPlannerResultScreenData2;
        StopTripPlannerLocationType stop2;
        StopTripPlannerLocationType nearestStopToPlaceSelected;
        stopBasedTripPlannerSearchComponent.getClass();
        if (continuationImpl instanceof StopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1) {
            stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1 = (StopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1) continuationImpl;
            int i = stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1 = new StopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1(stopBasedTripPlannerSearchComponent, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1 = new StopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1(stopBasedTripPlannerSearchComponent, continuationImpl);
        }
        Object obj = stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState = (StopBasedTripPlannerSearchDataState) stopBasedTripPlannerSearchComponent.f.getValue();
            Intrinsics.i(stopBasedTripPlannerSearchDataState, "<this>");
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation = stopBasedTripPlannerSearchDataState.b;
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2 = stopBasedTripPlannerSearchDataState.f4490a;
            if (stopBasedSearchSelectedLocation2 instanceof StopBasedSearchSelectedLocation.AllNearbyStopSelected) {
                stop = new StopTripPlannerLocationType.AllNearbyStopSelected(((StopBasedSearchSelectedLocation.AllNearbyStopSelected) stopBasedSearchSelectedLocation2).c);
            } else if (stopBasedSearchSelectedLocation2 instanceof StopBasedSearchSelectedLocation.NearestStopToPlaceSelected) {
                StopBasedSearchSelectedLocation.NearestStopToPlaceSelected nearestStopToPlaceSelected2 = (StopBasedSearchSelectedLocation.NearestStopToPlaceSelected) stopBasedSearchSelectedLocation2;
                stop = new StopTripPlannerLocationType.NearestStopToPlaceSelected(nearestStopToPlaceSelected2.c, nearestStopToPlaceSelected2.d, stopBasedTripPlannerSearchDataState.d);
            } else if (stopBasedSearchSelectedLocation2 instanceof StopBasedSearchSelectedLocation.PlaceSelected) {
                stop = new StopTripPlannerLocationType.AllNearbyStopSelected(((StopBasedSearchSelectedLocation.PlaceSelected) stopBasedSearchSelectedLocation2).c);
            } else {
                if (stopBasedSearchSelectedLocation2 instanceof StopBasedSearchSelectedLocation.StopSelected) {
                    stop = new StopTripPlannerLocationType.Stop(((StopBasedSearchSelectedLocation.StopSelected) stopBasedSearchSelectedLocation2).c);
                } else if (stopBasedSearchSelectedLocation2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                stopTripPlannerResultScreenData = null;
                if (stopTripPlannerResultScreenData == null) {
                    return unit;
                }
                stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.L$0 = stopTripPlannerResultScreenData;
                stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.label = 1;
                if (stopBasedTripPlannerSearchComponent.N0(stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1) == obj2) {
                    return obj2;
                }
                stopTripPlannerResultScreenData2 = stopTripPlannerResultScreenData;
            }
            if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.AllNearbyStopSelected) {
                nearestStopToPlaceSelected = new StopTripPlannerLocationType.AllNearbyStopSelected(((StopBasedSearchSelectedLocation.AllNearbyStopSelected) stopBasedSearchSelectedLocation).c);
            } else if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.NearestStopToPlaceSelected) {
                StopBasedSearchSelectedLocation.NearestStopToPlaceSelected nearestStopToPlaceSelected3 = (StopBasedSearchSelectedLocation.NearestStopToPlaceSelected) stopBasedSearchSelectedLocation;
                nearestStopToPlaceSelected = new StopTripPlannerLocationType.NearestStopToPlaceSelected(nearestStopToPlaceSelected3.c, nearestStopToPlaceSelected3.d, stopBasedTripPlannerSearchDataState.e);
            } else {
                if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.PlaceSelected) {
                    stop2 = new StopTripPlannerLocationType.AllNearbyStopSelected(((StopBasedSearchSelectedLocation.PlaceSelected) stopBasedSearchSelectedLocation).c);
                } else if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.StopSelected) {
                    stop2 = new StopTripPlannerLocationType.Stop(((StopBasedSearchSelectedLocation.StopSelected) stopBasedSearchSelectedLocation).c);
                } else {
                    if (stopBasedSearchSelectedLocation != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stopTripPlannerResultScreenData = null;
                    if (stopTripPlannerResultScreenData == null) {
                        return unit;
                    }
                    stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.L$0 = stopTripPlannerResultScreenData;
                    stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.label = 1;
                    if (stopBasedTripPlannerSearchComponent.N0(stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1) == obj2) {
                        return obj2;
                    }
                    stopTripPlannerResultScreenData2 = stopTripPlannerResultScreenData;
                }
                nearestStopToPlaceSelected = stop2;
            }
            stopTripPlannerResultScreenData = new StopTripPlannerResultScreenData(stop, nearestStopToPlaceSelected, Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN);
            if (stopTripPlannerResultScreenData == null) {
                return unit;
            }
            stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.L$0 = stopTripPlannerResultScreenData;
            stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.label = 1;
            if (stopBasedTripPlannerSearchComponent.N0(stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1) == obj2) {
                return obj2;
            }
            stopTripPlannerResultScreenData2 = stopTripPlannerResultScreenData;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stopTripPlannerResultScreenData2 = (StopTripPlannerResultScreenData) stopBasedTripPlannerSearchComponent$checkAndNavigateToTripPlanner$1.L$0;
            ResultKt.b(obj);
        }
        Job job = stopBasedTripPlannerSearchComponent.v;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            stopBasedTripPlannerSearchComponent.v = BuildersKt.d(stopBasedTripPlannerSearchComponent.j, null, null, new StopBasedTripPlannerSearchComponent$listenToTripPlannerResultStateManager$1(stopBasedTripPlannerSearchComponent, null), 3);
        }
        ChaloNavigationManager chaloNavigationManager = stopBasedTripPlannerSearchComponent.t;
        Json json = ChaloJson.b;
        json.getClass();
        ChaloNavigationManagerKt.e(chaloNavigationManager, new TripPlannerArgs.StopFocusedResultsScreen(json.a(StopTripPlannerResultScreenData.INSTANCE.serializer(), stopTripPlannerResultScreenData2)), null, 6);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, String str, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1 stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1;
        Object objB;
        Object objB2;
        stopBasedTripPlannerSearchComponent.getClass();
        if (continuationImpl instanceof StopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1) {
            stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1 = (StopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1) continuationImpl;
            int i = stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1 = new StopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1(stopBasedTripPlannerSearchComponent, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1 = new StopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1(stopBasedTripPlannerSearchComponent, continuationImpl);
        }
        Object objV = stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowB = stopBasedTripPlannerSearchComponent.s.b(str);
            stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1.label = 1;
            objV = stopBasedTripPlannerSearchComponent.b.v(flowB, stopBasedTripPlannerSearchComponent$collectUniversalSearchResult$1);
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
                stopBasedTripPlannerSearchComponent.M0(new StopBasedTripPlannerSearchViewIntent.OnStopSearchResult(stopAppModel));
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
                stopBasedTripPlannerSearchComponent.M0(new StopBasedTripPlannerSearchViewIntent.OnPlaceSearchResult(recentPlaceAppModel));
            }
        }
        Job job = stopBasedTripPlannerSearchComponent.w;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        stopBasedTripPlannerSearchComponent.w = null;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public static final Object H0(StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, RecentPlaceAppModel recentPlaceAppModel, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1 stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1;
        final RecentPlaceAppModel recentPlaceAppModel2 = recentPlaceAppModel;
        StateFlow stateFlow = stopBasedTripPlannerSearchComponent.f;
        if (continuationImpl instanceof StopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1) {
            stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1 = (StopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1) continuationImpl;
            int i = stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1 = new StopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1(stopBasedTripPlannerSearchComponent, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1 = new StopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1(stopBasedTripPlannerSearchComponent, continuationImpl);
        }
        StopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1 stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$2 = stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$1;
        Object objA = stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            stopBasedTripPlannerSearchComponent.E0(new ab1(25));
            FetchNearbyStopsUseCase fetchNearbyStopsUseCase = stopBasedTripPlannerSearchComponent.q;
            LatLng latLng = recentPlaceAppModel2.j;
            double d = latLng.f5134a;
            double d2 = latLng.b;
            ChaloTransitMode chaloTransitMode = ChaloTransitMode.BUS;
            stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$2.L$0 = recentPlaceAppModel2;
            stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$2.label = 1;
            objA = fetchNearbyStopsUseCase.a(d, d2, chaloTransitMode, stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$2);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recentPlaceAppModel2 = (RecentPlaceAppModel) stopBasedTripPlannerSearchComponent$fetchNearestStopsForPlace$2.L$0;
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            final List list = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            AnalyticsContract analyticsContract = stopBasedTripPlannerSearchComponent.o;
            Source source = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN;
            String sourceName = source.getSourceName();
            String str = recentPlaceAppModel2.e;
            String str2 = recentPlaceAppModel2.g;
            AnalyticsContract.DefaultImpls.a(analyticsContract, "nearest stop fetch success", sourceName, MapsKt.k(new Pair("place id", str), new Pair("locationName", str2), new Pair("searchTarget", ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.name()), new Pair("count", Integer.valueOf(list.size()))), null, false, 24);
            if (list.isEmpty()) {
                AnalyticsContract.DefaultImpls.a(stopBasedTripPlannerSearchComponent.o, "no nearby stops found for place", source.getSourceName(), MapsKt.i(new Pair("place id", recentPlaceAppModel2.e), new Pair("locationName", str2), new Pair("searchTarget", ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.name())), null, false, 24);
                int i3 = WhenMappings.c[((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        RecentPlaceAppModel recentPlaceAppModel3 = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).i;
                        if (recentPlaceAppModel3 != null) {
                            stopBasedTripPlannerSearchComponent.E0(new ib1(3, recentPlaceAppModel3));
                        }
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stopBasedTripPlannerSearchComponent.E0(new mb1(0));
                    }
                    BuildersKt.d(stopBasedTripPlannerSearchComponent.j, null, null, new StopBasedTripPlannerSearchComponent$handleNoNearestStopsAvailableToPlace$4(stopBasedTripPlannerSearchComponent, null), 3);
                } else {
                    RecentPlaceAppModel recentPlaceAppModel4 = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).h;
                    if (recentPlaceAppModel4 != null) {
                        stopBasedTripPlannerSearchComponent.E0(new ib1(2, recentPlaceAppModel4));
                        BuildersKt.d(stopBasedTripPlannerSearchComponent.j, null, null, new StopBasedTripPlannerSearchComponent$handleNoNearestStopsAvailableToPlace$4(stopBasedTripPlannerSearchComponent, null), 3);
                    }
                }
            } else {
                int i4 = WhenMappings.c[((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.ordinal()];
                final int i5 = 1;
                if (i4 == 1) {
                    final int i6 = 0;
                    stopBasedTripPlannerSearchComponent.E0(new Function1() { // from class: lb1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i6) {
                                case 0:
                                    StopBasedTripPlannerSearchDataState it = (StopBasedTripPlannerSearchDataState) obj;
                                    Intrinsics.i(it, "it");
                                    return StopBasedTripPlannerSearchDataState.a(it, null, null, null, list, null, false, new StopBasedTripPlannerSearchBottomSheetType.NearestStops(recentPlaceAppModel2), null, null, null, 1839);
                                default:
                                    StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj;
                                    Intrinsics.i(it2, "it");
                                    return StopBasedTripPlannerSearchDataState.a(it2, null, null, null, null, list, false, new StopBasedTripPlannerSearchBottomSheetType.NearestStops(recentPlaceAppModel2), null, null, null, 1823);
                            }
                        }
                    });
                } else if (i4 == 2) {
                    stopBasedTripPlannerSearchComponent.E0(new Function1() { // from class: lb1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i5) {
                                case 0:
                                    StopBasedTripPlannerSearchDataState it = (StopBasedTripPlannerSearchDataState) obj;
                                    Intrinsics.i(it, "it");
                                    return StopBasedTripPlannerSearchDataState.a(it, null, null, null, list, null, false, new StopBasedTripPlannerSearchBottomSheetType.NearestStops(recentPlaceAppModel2), null, null, null, 1839);
                                default:
                                    StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj;
                                    Intrinsics.i(it2, "it");
                                    return StopBasedTripPlannerSearchDataState.a(it2, null, null, null, null, list, false, new StopBasedTripPlannerSearchBottomSheetType.NearestStops(recentPlaceAppModel2), null, null, null, 1823);
                            }
                        }
                    });
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloUseCaseResult.Failure failure = (ChaloUseCaseResult.Failure) chaloUseCaseResult;
            AnalyticsContract.DefaultImpls.a(stopBasedTripPlannerSearchComponent.o, "nearest stop fetch failure", Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName(), MapsKt.k(new Pair("place id", recentPlaceAppModel2.e), new Pair("locationName", recentPlaceAppModel2.g), new Pair("searchTarget", ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.name()), new Pair("errorType", ((RemoteDataErrorType) failure.f10418a).f1633a)), null, false, 24);
            stopBasedTripPlannerSearchComponent.E0(new g41(16, failure, recentPlaceAppModel2));
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.j((kotlinx.coroutines.flow.Flow) r6, r2, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I0(app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$showRecentLocationPairs$1
            if (r0 == 0) goto L16
            r0 = r6
            app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$showRecentLocationPairs$1 r0 = (app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$showRecentLocationPairs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$showRecentLocationPairs$1 r0 = new app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$showRecentLocationPairs$1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r6)
            goto L69
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            goto L58
        L39:
            kotlin.ResultKt.b(r6)
            kotlin.Lazy r6 = r5.x
            java.lang.Object r6 = r6.getValue()
            app.chalo.recent.database.repository.recent.RecentLocationPairRepository r6 = (app.chalo.recent.database.repository.recent.RecentLocationPairRepository) r6
            app.chalo.providers.cityprovider.CityProvider r2 = r5.k
            java.lang.String r2 = r2.h()
            if (r2 != 0) goto L4e
            java.lang.String r2 = ""
        L4e:
            r0.label = r4
            r4 = 6
            java.lang.Object r6 = app.chalo.recent.database.repository.recent.RecentLocationPairRepository.DefaultImpls.a(r6, r2, r0, r4)
            if (r6 != r1) goto L58
            goto L68
        L58:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2 r2 = new app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$showRecentLocationPairs$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.j(r6, r2, r0)
            if (r5 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent.I0(app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static StopBasedSearchSelectedLocation J0(RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel) {
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Place) {
            return new StopBasedSearchSelectedLocation.AllNearbyStopSelected(((RecentLocationPairEndpointAppModel.Place) recentLocationPairEndpointAppModel).b);
        }
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Stop) {
            return new StopBasedSearchSelectedLocation.StopSelected(((RecentLocationPairEndpointAppModel.Stop) recentLocationPairEndpointAppModel).b);
        }
        if (!(recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.NearbyStopToPlace)) {
            throw new NoWhenBranchMatchedException();
        }
        RecentLocationPairEndpointAppModel.NearbyStopToPlace nearbyStopToPlace = (RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel;
        return new StopBasedSearchSelectedLocation.NearestStopToPlaceSelected(RecentsAppModelKt.c(nearbyStopToPlace), nearbyStopToPlace.c);
    }

    public static RecentLocationPairEndpointAppModel K0(StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation) {
        if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.AllNearbyStopSelected) {
            RecentPlaceAppModel recentPlaceAppModel = ((StopBasedSearchSelectedLocation.AllNearbyStopSelected) stopBasedSearchSelectedLocation).c;
            if (Intrinsics.d(recentPlaceAppModel.f, "userLocation")) {
                return null;
            }
            return new RecentLocationPairEndpointAppModel.Place(recentPlaceAppModel);
        }
        if (!(stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.NearestStopToPlaceSelected)) {
            if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.PlaceSelected) {
                return null;
            }
            if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.StopSelected) {
                return new RecentLocationPairEndpointAppModel.Stop(((StopBasedSearchSelectedLocation.StopSelected) stopBasedSearchSelectedLocation).c);
            }
            throw new NoWhenBranchMatchedException();
        }
        StopBasedSearchSelectedLocation.NearestStopToPlaceSelected nearestStopToPlaceSelected = (StopBasedSearchSelectedLocation.NearestStopToPlaceSelected) stopBasedSearchSelectedLocation;
        RecentPlaceAppModel recentPlaceAppModel2 = nearestStopToPlaceSelected.d;
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel = nearestStopToPlaceSelected.c;
        if (Intrinsics.d(recentPlaceAppModel2.f, "userLocation")) {
            return new RecentLocationPairEndpointAppModel.Stop(new StopAppModel(nearbyStopToLocationAppModel.b, nearbyStopToLocationAppModel.f, new LatLng(nearbyStopToLocationAppModel.c, nearbyStopToLocationAppModel.f1740a), nearbyStopToLocationAppModel.e, nearbyStopToLocationAppModel.d, null));
        }
        return new RecentLocationPairEndpointAppModel.NearbyStopToPlace(new StopAppModel(nearbyStopToLocationAppModel.b, nearbyStopToLocationAppModel.f, new LatLng(nearbyStopToLocationAppModel.c, nearbyStopToLocationAppModel.f1740a), nearbyStopToLocationAppModel.e, nearbyStopToLocationAppModel.d, null), recentPlaceAppModel2, nearbyStopToLocationAppModel.g);
    }

    public static Map O0(StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation, String str) {
        if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.StopSelected) {
            Pair pair = new Pair(str.concat("type"), stopBasedSearchSelectedLocation.f4480a);
            String strConcat = str.concat("stop name");
            StopAppModel stopAppModel = ((StopBasedSearchSelectedLocation.StopSelected) stopBasedSearchSelectedLocation).c;
            return MapsKt.i(pair, new Pair(strConcat, stopAppModel.b), new Pair(str.concat("stop id"), stopAppModel.f1727a));
        }
        if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.PlaceSelected) {
            Pair pair2 = new Pair(str.concat("type"), stopBasedSearchSelectedLocation.f4480a);
            String strConcat2 = str.concat("locationName");
            RecentPlaceAppModel recentPlaceAppModel = ((StopBasedSearchSelectedLocation.PlaceSelected) stopBasedSearchSelectedLocation).c;
            return MapsKt.i(pair2, new Pair(strConcat2, recentPlaceAppModel.g), new Pair(str.concat("place id"), recentPlaceAppModel.e));
        }
        if (stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.AllNearbyStopSelected) {
            Pair pair3 = new Pair(str.concat("type"), stopBasedSearchSelectedLocation.f4480a);
            String strConcat3 = str.concat("locationName");
            RecentPlaceAppModel recentPlaceAppModel2 = ((StopBasedSearchSelectedLocation.AllNearbyStopSelected) stopBasedSearchSelectedLocation).c;
            return MapsKt.i(pair3, new Pair(strConcat3, recentPlaceAppModel2.g), new Pair(str.concat("place id"), recentPlaceAppModel2.e));
        }
        if (!(stopBasedSearchSelectedLocation instanceof StopBasedSearchSelectedLocation.NearestStopToPlaceSelected)) {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair4 = new Pair(str.concat("type"), stopBasedSearchSelectedLocation.f4480a);
        String strConcat4 = str.concat("stop name");
        StopBasedSearchSelectedLocation.NearestStopToPlaceSelected nearestStopToPlaceSelected = (StopBasedSearchSelectedLocation.NearestStopToPlaceSelected) stopBasedSearchSelectedLocation;
        RecentPlaceAppModel recentPlaceAppModel3 = nearestStopToPlaceSelected.d;
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel = nearestStopToPlaceSelected.c;
        return MapsKt.i(pair4, new Pair(strConcat4, nearbyStopToLocationAppModel.f), new Pair(str.concat("stop id"), nearbyStopToLocationAppModel.b), new Pair(str.concat("locationName"), recentPlaceAppModel3.g), new Pair(str.concat("place id"), recentPlaceAppModel3.e), new Pair(str.concat("distance"), String.valueOf(nearbyStopToLocationAppModel.g)));
    }

    public final void L0(boolean z) {
        UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(ArraysKt.j0(new UniversalSearchOption[]{new UniversalSearchOption.STOPS(true, true), new UniversalSearchOption.PLACES(true, false)}));
        Job job = this.w;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.w = BuildersKt.d(this.j, null, null, new StopBasedTripPlannerSearchComponent$navigateAndCollectUniversalSearchResult$1(this, universalSearchOptions, null, z), 3);
    }

    public final void M0(StopBasedTripPlannerSearchViewIntent intent) {
        Source source;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof StopBasedTripPlannerSearchViewIntent.InitialisationIntent;
        final int i = 1;
        ContextScope contextScope = this.j;
        if (z) {
            StopBasedSearchScreenData stopBasedSearchScreenData = ((StopBasedTripPlannerSearchViewIntent.InitialisationIntent) intent).f4492a;
            if (this.d) {
                return;
            }
            this.d = true;
            String sourceName = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (stopBasedSearchScreenData != null && (source = stopBasedSearchScreenData.f4478a) != null) {
                source.getSourceName();
            }
            AnalyticsContract.DefaultImpls.a(this.o, "stop trip planner search screen opened", sourceName, linkedHashMap, null, false, 24);
            BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handleInitialisationIntent$2(stopBasedSearchScreenData, this, null), 3);
            BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handleInitialisationIntent$3(this, null), 3);
            return;
        }
        if (intent.equals(StopBasedTripPlannerSearchViewIntent.OnFromLocationClick.f4493a)) {
            AnalyticsContract.DefaultImpls.a(this.o, "stop trip planner search from clicked", Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName(), null, null, false, 28);
            E0(new ab1(29));
            L0(true);
            return;
        }
        final int i2 = 0;
        if (intent.equals(StopBasedTripPlannerSearchViewIntent.OnToLocationClick.f4500a)) {
            AnalyticsContract.DefaultImpls.a(this.o, "stop trip planner search to clicked", Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName(), null, null, false, 28);
            E0(new ab1(24));
            L0(false);
            return;
        }
        boolean zEquals = intent.equals(StopBasedTripPlannerSearchViewIntent.OnSwapButtonClick.f4499a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).f4490a;
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2 = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).b;
            String sourceName2 = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (stopBasedSearchSelectedLocation != null) {
                linkedHashMap2.putAll(O0(stopBasedSearchSelectedLocation, "from_"));
            }
            if (stopBasedSearchSelectedLocation2 != null) {
                linkedHashMap2.putAll(O0(stopBasedSearchSelectedLocation2, "to_"));
            }
            AnalyticsContract.DefaultImpls.a(this.o, "swap button clicked", sourceName2, linkedHashMap2, null, false, 24);
            E0(new jb1(stopBasedSearchSelectedLocation2, stopBasedSearchSelectedLocation, 1));
            BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handleOnSwapButtonClick$3(this, null), 3);
            return;
        }
        if (intent instanceof StopBasedTripPlannerSearchViewIntent.OnRecentTripClicked) {
            RecentLocationPairAppModel recentLocationPairAppModel = ((StopBasedTripPlannerSearchViewIntent.OnRecentTripClicked) intent).f4496a;
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocationJ0 = J0(recentLocationPairAppModel.g);
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocationJ1 = J0(recentLocationPairAppModel.h);
            String sourceName3 = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.putAll(O0(stopBasedSearchSelectedLocationJ0, "from_"));
            linkedHashMap3.putAll(O0(stopBasedSearchSelectedLocationJ1, "to_"));
            AnalyticsContract.DefaultImpls.a(this.o, "stop trip planner search recent clicked", sourceName3, linkedHashMap3, null, false, 24);
            E0(new jb1(stopBasedSearchSelectedLocationJ0, stopBasedSearchSelectedLocationJ1, 0));
            BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handleOnRecentTripClicked$3(this, null), 3);
            return;
        }
        int i3 = 4;
        if (intent.equals(StopBasedTripPlannerSearchViewIntent.BottomSheetCloseClickedIntent.f4491a)) {
            AnalyticsContract.DefaultImpls.a(this.o, "bottom sheet closed button clicked", Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName(), vo1.s("searchTarget", ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.name()), null, false, 24);
            int i4 = WhenMappings.c[((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.ordinal()];
            if (i4 == 1) {
                E0(new mb1(2));
                return;
            } else if (i4 == 2) {
                E0(new mb1(3));
                return;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new mb1(4));
                return;
            }
        }
        if (intent instanceof StopBasedTripPlannerSearchViewIntent.OnNearestStopSelected) {
            final NearbyStopToLocationAppModel nearbyStopToLocationAppModel = ((StopBasedTripPlannerSearchViewIntent.OnNearestStopSelected) intent).f4494a;
            String sourceName4 = Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName();
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("searchTarget", ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.name()));
            linkedHashMapK.putAll(MapsKt.i(new Pair("stop name", nearbyStopToLocationAppModel.f), new Pair("stop id", nearbyStopToLocationAppModel.b), new Pair("distance", String.valueOf(nearbyStopToLocationAppModel.g))));
            AnalyticsContract.DefaultImpls.a(this.o, "nearest stop selected", sourceName4, linkedHashMapK, null, false, 24);
            int i5 = WhenMappings.c[((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.ordinal()];
            if (i5 == 1) {
                final RecentPlaceAppModel recentPlaceAppModel = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).h;
                if (recentPlaceAppModel == null) {
                    return;
                } else {
                    E0(new Function1() { // from class: nb1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i2) {
                                case 0:
                                    StopBasedTripPlannerSearchDataState it = (StopBasedTripPlannerSearchDataState) obj;
                                    Intrinsics.i(it, "it");
                                    return StopBasedTripPlannerSearchDataState.a(it, new StopBasedSearchSelectedLocation.NearestStopToPlaceSelected(nearbyStopToLocationAppModel, recentPlaceAppModel), null, null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1918);
                                default:
                                    StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj;
                                    Intrinsics.i(it2, "it");
                                    return StopBasedTripPlannerSearchDataState.a(it2, null, new StopBasedSearchSelectedLocation.NearestStopToPlaceSelected(nearbyStopToLocationAppModel, recentPlaceAppModel), null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1917);
                            }
                        }
                    });
                }
            } else if (i5 == 2) {
                final RecentPlaceAppModel recentPlaceAppModel2 = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).i;
                if (recentPlaceAppModel2 == null) {
                    return;
                } else {
                    E0(new Function1() { // from class: nb1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i) {
                                case 0:
                                    StopBasedTripPlannerSearchDataState it = (StopBasedTripPlannerSearchDataState) obj;
                                    Intrinsics.i(it, "it");
                                    return StopBasedTripPlannerSearchDataState.a(it, new StopBasedSearchSelectedLocation.NearestStopToPlaceSelected(nearbyStopToLocationAppModel, recentPlaceAppModel2), null, null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1918);
                                default:
                                    StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj;
                                    Intrinsics.i(it2, "it");
                                    return StopBasedTripPlannerSearchDataState.a(it2, null, new StopBasedSearchSelectedLocation.NearestStopToPlaceSelected(nearbyStopToLocationAppModel, recentPlaceAppModel2), null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1917);
                            }
                        }
                    });
                }
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new mb1(1));
            }
            BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handleOnNearestStopSelected$5(this, null), 3);
            return;
        }
        if (intent.equals(StopBasedTripPlannerSearchViewIntent.OnShowAllNearbyStopsClick.f4497a)) {
            AnalyticsContract.DefaultImpls.a(this.o, "show all nearby stops clicked", Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName(), vo1.s("searchTarget", ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.name()), null, false, 24);
            int i6 = WhenMappings.c[((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.ordinal()];
            if (i6 == 1) {
                RecentPlaceAppModel recentPlaceAppModel3 = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).h;
                if (recentPlaceAppModel3 == null) {
                    return;
                } else {
                    E0(new ib1(i2, recentPlaceAppModel3));
                }
            } else if (i6 == 2) {
                RecentPlaceAppModel recentPlaceAppModel4 = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).i;
                if (recentPlaceAppModel4 == null) {
                    return;
                } else {
                    E0(new ib1(i, recentPlaceAppModel4));
                }
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new ab1(27));
            }
            BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handleOnShowAllNearbyStopsClick$4(this, null), 3);
            return;
        }
        if (intent instanceof StopBasedTripPlannerSearchViewIntent.OnStopSearchResult) {
            StopAppModel stopAppModel = ((StopBasedTripPlannerSearchViewIntent.OnStopSearchResult) intent).f4498a;
            SearchTarget searchTarget = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j;
            AnalyticsContract.DefaultImpls.a(this.o, "stop search result selected", Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName(), MapsKt.i(new Pair("searchTarget", searchTarget.name()), new Pair("stop name", stopAppModel.b), new Pair("stop id", stopAppModel.f1727a)), null, false, 24);
            int i7 = WhenMappings.c[searchTarget.ordinal()];
            if (i7 == 1) {
                E0(new li0(6, stopAppModel));
            } else if (i7 == 2) {
                E0(new li0(7, stopAppModel));
            } else if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handleStopSearchResult$3(this, null), 3);
            return;
        }
        if (!(intent instanceof StopBasedTripPlannerSearchViewIntent.OnPlaceSearchResult)) {
            if (!(intent instanceof StopBasedTripPlannerSearchViewIntent.RetryNearestStopFetchIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            RecentPlaceAppModel recentPlaceAppModel5 = ((StopBasedTripPlannerSearchViewIntent.RetryNearestStopFetchIntent) intent).f4501a;
            AnalyticsContract.DefaultImpls.a(this.o, "retry nearest stop fetch clicked", Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName(), MapsKt.i(new Pair("place id", recentPlaceAppModel5.e), new Pair("locationName", recentPlaceAppModel5.g), new Pair("searchTarget", ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j.name())), null, false, 24);
            E0(new ab1(26));
            BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handleRetryNearestStopFetchIntent$2(this, recentPlaceAppModel5, null), 3);
            return;
        }
        RecentPlaceAppModel recentPlaceAppModel6 = ((StopBasedTripPlannerSearchViewIntent.OnPlaceSearchResult) intent).f4495a;
        SearchTarget searchTarget2 = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).j;
        AnalyticsContract.DefaultImpls.a(this.o, "place search result selected", Source.STOP_BASED_TRIP_PLANNER_SEARCH_SCREEN.getSourceName(), MapsKt.i(new Pair("searchTarget", searchTarget2.name()), new Pair("locationName", recentPlaceAppModel6.g), new Pair("place id", recentPlaceAppModel6.e)), null, false, 24);
        int i8 = WhenMappings.c[searchTarget2.ordinal()];
        if (i8 == 1) {
            E0(new ib1(i3, recentPlaceAppModel6));
        } else if (i8 == 2) {
            E0(new ib1(5, recentPlaceAppModel6));
        } else if (i8 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        BuildersKt.d(contextScope, null, null, new StopBasedTripPlannerSearchComponent$handlePlaceSearchResult$3(this, recentPlaceAppModel6, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N0(ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchComponent$saveToRecentTrips$1 stopBasedTripPlannerSearchComponent$saveToRecentTrips$1;
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation;
        RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModelK0;
        RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModelK1;
        String strA;
        String strH;
        if (continuationImpl instanceof StopBasedTripPlannerSearchComponent$saveToRecentTrips$1) {
            stopBasedTripPlannerSearchComponent$saveToRecentTrips$1 = (StopBasedTripPlannerSearchComponent$saveToRecentTrips$1) continuationImpl;
            int i = stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchComponent$saveToRecentTrips$1 = new StopBasedTripPlannerSearchComponent$saveToRecentTrips$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchComponent$saveToRecentTrips$1 = new StopBasedTripPlannerSearchComponent$saveToRecentTrips$1(this, continuationImpl);
        }
        Object objC = stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.label;
        Unit unit = Unit.f17538a;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                StateFlow stateFlow = this.f;
                StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2 = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).f4490a;
                if (stopBasedSearchSelectedLocation2 != null && (stopBasedSearchSelectedLocation = ((StopBasedTripPlannerSearchDataState) stateFlow.getValue()).b) != null && (recentLocationPairEndpointAppModelK0 = K0(stopBasedSearchSelectedLocation2)) != null && (recentLocationPairEndpointAppModelK1 = K0(stopBasedSearchSelectedLocation)) != null) {
                    RecentLocationPairEndpointAppModel.INSTANCE.getClass();
                    strA = RecentLocationPairEndpointAppModel.Companion.a(recentLocationPairEndpointAppModelK0, recentLocationPairEndpointAppModelK1);
                    strH = this.k.h();
                    if (strH != null) {
                        BasicInfoContract basicInfoContract = this.p;
                        stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$0 = strA;
                        stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$1 = strH;
                        stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$2 = recentLocationPairEndpointAppModelK0;
                        stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$3 = recentLocationPairEndpointAppModelK1;
                        stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.label = 1;
                        objC = basicInfoContract.c(stopBasedTripPlannerSearchComponent$saveToRecentTrips$1);
                        if (objC == coroutineSingletons) {
                        }
                    }
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
                return unit;
            }
            recentLocationPairEndpointAppModelK1 = (RecentLocationPairEndpointAppModel) stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$3;
            recentLocationPairEndpointAppModelK0 = (RecentLocationPairEndpointAppModel) stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$2;
            strH = (String) stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$1;
            strA = (String) stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$0;
            ResultKt.b(objC);
            RecentLocationPairAppModel recentLocationPairAppModel = new RecentLocationPairAppModel(strA, strH, recentLocationPairEndpointAppModelK0, recentLocationPairEndpointAppModelK1, ((Number) objC).longValue(), 1);
            RecentLocationPairRepository recentLocationPairRepository = (RecentLocationPairRepository) this.x.getValue();
            stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$0 = null;
            stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$1 = null;
            stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$2 = null;
            stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.L$3 = null;
            stopBasedTripPlannerSearchComponent$saveToRecentTrips$1.label = 2;
            return recentLocationPairRepository.b(recentLocationPairAppModel, true, stopBasedTripPlannerSearchComponent$saveToRecentTrips$1) == coroutineSingletons ? coroutineSingletons : unit;
        } catch (Exception unused) {
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchComponent$convertToUiState$2 stopBasedTripPlannerSearchComponent$convertToUiState$2 = new StopBasedTripPlannerSearchComponent$convertToUiState$2(1, this, StopBasedTripPlannerSearchComponent.class, "processIntent", "processIntent(Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchViewIntent;)V", 0);
        return this.n.l((StopBasedTripPlannerSearchDataState) obj, stopBasedTripPlannerSearchComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new StopBasedTripPlannerSearchDataState(null, null, emptyList, emptyList, emptyList, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, SearchTarget.NONE);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        Job job = this.v;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.v = null;
    }
}
