package app.chalo.livetracking.universalsearch;

import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper;
import app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchedDataItem;
import app.chalo.livetracking.universalsearch.domain.FetchCityIndependentPlacesUseCase;
import app.chalo.livetracking.universalsearch.domain.FetchOfflineSearchResultUseCase;
import app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase;
import app.chalo.livetracking.universalsearch.domain.FetchRemoteSearchResultUseCase;
import app.chalo.livetracking.universalsearch.domain.TransitModeSearchFilter;
import app.chalo.location.LatLng;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.SystemHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/UniversalSearchManagerImpl;", "Lapp/chalo/livetracking/universalsearch/UniversalSearchManager;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UniversalSearchManagerImpl implements UniversalSearchManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchRecentSearchItemsFromDatabaseUseCase f4961a;
    public final FetchCityIndependentPlacesUseCase b;
    public final FetchRemoteSearchResultUseCase c;
    public final FetchOfflineSearchResultUseCase d;
    public final UniversalSearchAnalyticsEventHelper e;
    public final NetworkStateManager f;
    public final UserProfileDetailsProvider g;
    public final SystemHelper h;
    public final ContextScope j;
    public Job l;
    public final MutableStateFlow i = StateFlowKt.a(new UniversalSearchResult(null, EmptyList.f17557a, null));
    public final MutexImpl k = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4962a;

        static {
            int[] iArr = new int[UniversalSearchFlowSource.values().length];
            try {
                iArr[UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalSearchFlowSource.ONDC_STOP_BASED_SEARCH_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalSearchFlowSource.CITY_SELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_MAIN_FRAGMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_TAB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UniversalSearchFlowSource.NEAR_BY_STOPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UniversalSearchFlowSource.REGULAR_BUS_SCREEN_TAB.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UniversalSearchFlowSource.TRIP_PLANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_FOCUSED_TRIP_PLANNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_WORK_SELECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_PREFERENCE_SELECTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[UniversalSearchFlowSource.WORK_PREFERECNCE_SELECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[UniversalSearchFlowSource.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f4962a = iArr;
        }
    }

    public UniversalSearchManagerImpl(FetchRecentSearchItemsFromDatabaseUseCase fetchRecentSearchItemsFromDatabaseUseCase, FetchCityIndependentPlacesUseCase fetchCityIndependentPlacesUseCase, FetchRemoteSearchResultUseCase fetchRemoteSearchResultUseCase, FetchOfflineSearchResultUseCase fetchOfflineSearchResultUseCase, CoroutineContextProvider coroutineContextProvider, UniversalSearchAnalyticsEventHelper universalSearchAnalyticsEventHelper, NetworkStateManager networkStateManager, UserProfileDetailsProvider userProfileDetailsProvider, SystemHelper systemHelper) {
        this.f4961a = fetchRecentSearchItemsFromDatabaseUseCase;
        this.b = fetchCityIndependentPlacesUseCase;
        this.c = fetchRemoteSearchResultUseCase;
        this.d = fetchOfflineSearchResultUseCase;
        this.e = universalSearchAnalyticsEventHelper;
        this.f = networkStateManager;
        this.g = userProfileDetailsProvider;
        this.h = systemHelper;
        this.j = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(UniversalSearchManagerImpl universalSearchManagerImpl, SearchedResultItemsAppModel searchedResultItemsAppModel, ContinuationImpl continuationImpl) throws Throwable {
        UniversalSearchManagerImpl$emitLocalValue$1 universalSearchManagerImpl$emitLocalValue$1;
        SearchedResultItemsAppModel searchedResultItemsAppModel2;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        universalSearchManagerImpl.getClass();
        if (continuationImpl instanceof UniversalSearchManagerImpl$emitLocalValue$1) {
            universalSearchManagerImpl$emitLocalValue$1 = (UniversalSearchManagerImpl$emitLocalValue$1) continuationImpl;
            int i = universalSearchManagerImpl$emitLocalValue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalSearchManagerImpl$emitLocalValue$1.label = i - Integer.MIN_VALUE;
            } else {
                universalSearchManagerImpl$emitLocalValue$1 = new UniversalSearchManagerImpl$emitLocalValue$1(universalSearchManagerImpl, continuationImpl);
            }
        } else {
            universalSearchManagerImpl$emitLocalValue$1 = new UniversalSearchManagerImpl$emitLocalValue$1(universalSearchManagerImpl, continuationImpl);
        }
        Object obj = universalSearchManagerImpl$emitLocalValue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = universalSearchManagerImpl$emitLocalValue$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                MutexImpl mutexImpl = universalSearchManagerImpl.k;
                universalSearchManagerImpl$emitLocalValue$1.L$0 = searchedResultItemsAppModel;
                universalSearchManagerImpl$emitLocalValue$1.L$1 = mutexImpl;
                universalSearchManagerImpl$emitLocalValue$1.label = 1;
                if (mutexImpl.a(universalSearchManagerImpl$emitLocalValue$1) != coroutineSingletons) {
                    searchedResultItemsAppModel2 = searchedResultItemsAppModel;
                    mutex = mutexImpl;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) universalSearchManagerImpl$emitLocalValue$1.L$0;
                try {
                    ResultKt.b(obj);
                    mutex2.e(null);
                    return Unit.f17538a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.e(null);
                    throw th;
                }
            }
            mutex = (Mutex) universalSearchManagerImpl$emitLocalValue$1.L$1;
            searchedResultItemsAppModel2 = (SearchedResultItemsAppModel) universalSearchManagerImpl$emitLocalValue$1.L$0;
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = universalSearchManagerImpl.i;
            UniversalSearchResult universalSearchResultA = UniversalSearchResult.a((UniversalSearchResult) mutableStateFlow.getValue(), null, null, searchedResultItemsAppModel2, 3);
            universalSearchManagerImpl$emitLocalValue$1.L$0 = mutex;
            universalSearchManagerImpl$emitLocalValue$1.L$1 = null;
            universalSearchManagerImpl$emitLocalValue$1.label = 2;
            if (mutableStateFlow.emit(universalSearchResultA, universalSearchManagerImpl$emitLocalValue$1) != coroutineSingletons) {
                mutex2 = mutex;
                mutex2.e(null);
                return Unit.f17538a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            Mutex mutex3 = mutex;
            th = th3;
            mutex2 = mutex3;
            mutex2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(UniversalSearchManagerImpl universalSearchManagerImpl, UniversalSearchRecentSearchedDataItem universalSearchRecentSearchedDataItem, ContinuationImpl continuationImpl) throws Throwable {
        UniversalSearchManagerImpl$emitRecentValue$1 universalSearchManagerImpl$emitRecentValue$1;
        UniversalSearchRecentSearchedDataItem universalSearchRecentSearchedDataItem2;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        universalSearchManagerImpl.getClass();
        if (continuationImpl instanceof UniversalSearchManagerImpl$emitRecentValue$1) {
            universalSearchManagerImpl$emitRecentValue$1 = (UniversalSearchManagerImpl$emitRecentValue$1) continuationImpl;
            int i = universalSearchManagerImpl$emitRecentValue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalSearchManagerImpl$emitRecentValue$1.label = i - Integer.MIN_VALUE;
            } else {
                universalSearchManagerImpl$emitRecentValue$1 = new UniversalSearchManagerImpl$emitRecentValue$1(universalSearchManagerImpl, continuationImpl);
            }
        } else {
            universalSearchManagerImpl$emitRecentValue$1 = new UniversalSearchManagerImpl$emitRecentValue$1(universalSearchManagerImpl, continuationImpl);
        }
        Object obj = universalSearchManagerImpl$emitRecentValue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = universalSearchManagerImpl$emitRecentValue$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                MutexImpl mutexImpl = universalSearchManagerImpl.k;
                universalSearchManagerImpl$emitRecentValue$1.L$0 = universalSearchRecentSearchedDataItem;
                universalSearchManagerImpl$emitRecentValue$1.L$1 = mutexImpl;
                universalSearchManagerImpl$emitRecentValue$1.label = 1;
                if (mutexImpl.a(universalSearchManagerImpl$emitRecentValue$1) != coroutineSingletons) {
                    universalSearchRecentSearchedDataItem2 = universalSearchRecentSearchedDataItem;
                    mutex = mutexImpl;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) universalSearchManagerImpl$emitRecentValue$1.L$0;
                try {
                    ResultKt.b(obj);
                    mutex2.e(null);
                    return Unit.f17538a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.e(null);
                    throw th;
                }
            }
            mutex = (Mutex) universalSearchManagerImpl$emitRecentValue$1.L$1;
            universalSearchRecentSearchedDataItem2 = (UniversalSearchRecentSearchedDataItem) universalSearchManagerImpl$emitRecentValue$1.L$0;
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = universalSearchManagerImpl.i;
            UniversalSearchResult universalSearchResultA = UniversalSearchResult.a((UniversalSearchResult) mutableStateFlow.getValue(), null, universalSearchRecentSearchedDataItem2.f4998a, null, 5);
            universalSearchManagerImpl$emitRecentValue$1.L$0 = mutex;
            universalSearchManagerImpl$emitRecentValue$1.L$1 = null;
            universalSearchManagerImpl$emitRecentValue$1.label = 2;
            if (mutableStateFlow.emit(universalSearchResultA, universalSearchManagerImpl$emitRecentValue$1) != coroutineSingletons) {
                mutex2 = mutex;
                mutex2.e(null);
                return Unit.f17538a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            Mutex mutex3 = mutex;
            th = th3;
            mutex2 = mutex3;
            mutex2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(UniversalSearchManagerImpl universalSearchManagerImpl, ChaloUseCaseResult chaloUseCaseResult, ContinuationImpl continuationImpl) throws Throwable {
        UniversalSearchManagerImpl$emitRemoteValue$1 universalSearchManagerImpl$emitRemoteValue$1;
        ChaloUseCaseResult chaloUseCaseResult2;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        universalSearchManagerImpl.getClass();
        if (continuationImpl instanceof UniversalSearchManagerImpl$emitRemoteValue$1) {
            universalSearchManagerImpl$emitRemoteValue$1 = (UniversalSearchManagerImpl$emitRemoteValue$1) continuationImpl;
            int i = universalSearchManagerImpl$emitRemoteValue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalSearchManagerImpl$emitRemoteValue$1.label = i - Integer.MIN_VALUE;
            } else {
                universalSearchManagerImpl$emitRemoteValue$1 = new UniversalSearchManagerImpl$emitRemoteValue$1(universalSearchManagerImpl, continuationImpl);
            }
        } else {
            universalSearchManagerImpl$emitRemoteValue$1 = new UniversalSearchManagerImpl$emitRemoteValue$1(universalSearchManagerImpl, continuationImpl);
        }
        Object obj = universalSearchManagerImpl$emitRemoteValue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = universalSearchManagerImpl$emitRemoteValue$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                MutexImpl mutexImpl = universalSearchManagerImpl.k;
                universalSearchManagerImpl$emitRemoteValue$1.L$0 = chaloUseCaseResult;
                universalSearchManagerImpl$emitRemoteValue$1.L$1 = mutexImpl;
                universalSearchManagerImpl$emitRemoteValue$1.label = 1;
                if (mutexImpl.a(universalSearchManagerImpl$emitRemoteValue$1) != coroutineSingletons) {
                    chaloUseCaseResult2 = chaloUseCaseResult;
                    mutex = mutexImpl;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) universalSearchManagerImpl$emitRemoteValue$1.L$0;
                try {
                    ResultKt.b(obj);
                    mutex2.e(null);
                    return Unit.f17538a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.e(null);
                    throw th;
                }
            }
            mutex = (Mutex) universalSearchManagerImpl$emitRemoteValue$1.L$1;
            chaloUseCaseResult2 = (ChaloUseCaseResult) universalSearchManagerImpl$emitRemoteValue$1.L$0;
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = universalSearchManagerImpl.i;
            UniversalSearchResult universalSearchResultA = UniversalSearchResult.a((UniversalSearchResult) mutableStateFlow.getValue(), chaloUseCaseResult2, null, null, 6);
            universalSearchManagerImpl$emitRemoteValue$1.L$0 = mutex;
            universalSearchManagerImpl$emitRemoteValue$1.L$1 = null;
            universalSearchManagerImpl$emitRemoteValue$1.label = 2;
            if (mutableStateFlow.emit(universalSearchResultA, universalSearchManagerImpl$emitRemoteValue$1) != coroutineSingletons) {
                mutex2 = mutex;
                mutex2.e(null);
                return Unit.f17538a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            Mutex mutex3 = mutex;
            th = th3;
            mutex2 = mutex3;
            mutex2.e(null);
            throw th;
        }
    }

    @Override // app.chalo.livetracking.universalsearch.UniversalSearchManager
    public final StateFlow a() {
        return FlowKt.c(this.i);
    }

    @Override // app.chalo.livetracking.universalsearch.UniversalSearchManager
    public final void b(String str, String query, UniversalSearchFlowSource source, UniversalSearchOptions universalSearchOptions, UniversalSearchResultAnalyticProperties universalSearchResultAnalyticProperties, LatLng latLng, ChaloTransitMode transitMode) {
        Intrinsics.i(query, "query");
        Intrinsics.i(source, "source");
        Intrinsics.i(universalSearchOptions, "universalSearchOptions");
        Intrinsics.i(transitMode, "transitMode");
        if (query.equals(str) && (((UniversalSearchResult) this.i.getValue()).f4964a instanceof ChaloUseCaseResult.Success)) {
            return;
        }
        ChaloTransitMode chaloTransitMode = ChaloTransitMode.ALL;
        TransitModeSearchFilter oneOf = TransitModeSearchFilter.NoFilter.f5038a;
        if (transitMode != chaloTransitMode && transitMode != ChaloTransitMode.UNKNOWN) {
            switch (WhenMappings.f4962a[source.ordinal()]) {
                case 1:
                case 2:
                    SetBuilder setBuilder = new SetBuilder();
                    setBuilder.add(transitMode);
                    CollectionsKt.k(setBuilder, new ChaloTransitMode[0]);
                    oneOf = new TransitModeSearchFilter.OneOf(setBuilder.a());
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        TransitModeSearchFilter transitModeSearchFilter = oneOf;
        Object value = this.f.b().getValue();
        NetworkConnectionType networkConnectionType = NetworkConnectionType.CONNECTED;
        ContextScope contextScope = this.j;
        if (value == networkConnectionType) {
            Job job = this.l;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.l = BuildersKt.d(contextScope, null, null, new UniversalSearchManagerImpl$handleRemoteFetchQuery$1(str, source, this, query, universalSearchOptions, transitMode, universalSearchResultAnalyticProperties, transitModeSearchFilter, latLng, null), 3);
        } else {
            BuildersKt.d(contextScope, null, null, new UniversalSearchManagerImpl$getSearchResults$1(this, query, transitModeSearchFilter, null), 3);
        }
        BuildersKt.d(contextScope, null, null, new UniversalSearchManagerImpl$getSearchResults$2(this, transitModeSearchFilter, null), 3);
    }

    @Override // app.chalo.livetracking.universalsearch.UniversalSearchManager
    public final void clear() {
        Job job = this.l;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        CoroutineScopeKt.b(this.j, null);
    }
}
