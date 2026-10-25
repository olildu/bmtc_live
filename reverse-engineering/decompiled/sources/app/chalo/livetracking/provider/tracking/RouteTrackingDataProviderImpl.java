package app.chalo.livetracking.provider.tracking;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.citydata.domain.GetCachedRouteUseCase;
import app.chalo.citydata.domain.RouteTimeTableType;
import app.chalo.citydata.domain.RoutesDataFetchErrorType;
import app.chalo.citydata.manager.CityDataManagerKotlin;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.ProcessLiveStopEtaDataUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/RouteTrackingDataProviderImpl;", "Lapp/chalo/livetracking/provider/tracking/RouteTrackingDataProvider;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteTrackingDataProviderImpl implements RouteTrackingDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetCachedRouteUseCase f4347a;
    public final FetchRouteDataFromRemoteUseCase b;
    public final LiveTrackingDataManager c;
    public final ProcessLiveStopEtaDataUseCase d;
    public final CheckLiveBusDelayedUseCase e;
    public final CityDataManagerKotlin f;
    public final ContextScope g;
    public String h;
    public RouteAppModel i;
    public final MutableStateFlow j = StateFlowKt.a(new TrackingDataState(null));
    public final MutableStateFlow k = StateFlowKt.a(EmptyList.f17557a);

    public RouteTrackingDataProviderImpl(CoroutineContextProvider coroutineContextProvider, GetCachedRouteUseCase getCachedRouteUseCase, FetchRouteDataFromRemoteUseCase fetchRouteDataFromRemoteUseCase, LiveTrackingDataManager liveTrackingDataManager, ProcessLiveStopEtaDataUseCase processLiveStopEtaDataUseCase, CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase, CityDataManagerKotlin cityDataManagerKotlin) {
        this.f4347a = getCachedRouteUseCase;
        this.b = fetchRouteDataFromRemoteUseCase;
        this.c = liveTrackingDataManager;
        this.d = processLiveStopEtaDataUseCase;
        this.e = checkLiveBusDelayedUseCase;
        this.f = cityDataManagerKotlin;
        this.g = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object g(RouteTrackingDataProviderImpl routeTrackingDataProviderImpl, String str, boolean z, ContinuationImpl continuationImpl) {
        RouteTrackingDataProviderImpl$fetchRouteDetails$2 routeTrackingDataProviderImpl$fetchRouteDetails$2;
        Object value;
        Object value2;
        RouteDetailsResult.Success success;
        MutableStateFlow mutableStateFlow = routeTrackingDataProviderImpl.j;
        if (continuationImpl instanceof RouteTrackingDataProviderImpl$fetchRouteDetails$2) {
            routeTrackingDataProviderImpl$fetchRouteDetails$2 = (RouteTrackingDataProviderImpl$fetchRouteDetails$2) continuationImpl;
            int i = routeTrackingDataProviderImpl$fetchRouteDetails$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeTrackingDataProviderImpl$fetchRouteDetails$2.label = i - Integer.MIN_VALUE;
            } else {
                routeTrackingDataProviderImpl$fetchRouteDetails$2 = new RouteTrackingDataProviderImpl$fetchRouteDetails$2(routeTrackingDataProviderImpl, continuationImpl);
            }
        } else {
            routeTrackingDataProviderImpl$fetchRouteDetails$2 = new RouteTrackingDataProviderImpl$fetchRouteDetails$2(routeTrackingDataProviderImpl, continuationImpl);
        }
        Object objA = routeTrackingDataProviderImpl$fetchRouteDetails$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeTrackingDataProviderImpl$fetchRouteDetails$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            do {
                value = mutableStateFlow.getValue();
                ((TrackingDataState) value).getClass();
            } while (!mutableStateFlow.c(value, new TrackingDataState(RouteDetailsResult.FetchInProgress.f4345a)));
            GetCachedRouteUseCase getCachedRouteUseCase = routeTrackingDataProviderImpl.f4347a;
            RouteTimeTableType routeTimeTableType = RouteTimeTableType.CURRENT_DAY;
            routeTrackingDataProviderImpl$fetchRouteDetails$2.L$0 = str;
            routeTrackingDataProviderImpl$fetchRouteDetails$2.Z$0 = z;
            routeTrackingDataProviderImpl$fetchRouteDetails$2.label = 1;
            objA = getCachedRouteUseCase.a(str, routeTimeTableType, routeTrackingDataProviderImpl$fetchRouteDetails$2);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return unit;
        }
        z = routeTrackingDataProviderImpl$fetchRouteDetails$2.Z$0;
        str = (String) routeTrackingDataProviderImpl$fetchRouteDetails$2.L$0;
        ResultKt.b(objA);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            RouteAppModel routeAppModel = (RouteAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            routeTrackingDataProviderImpl.i = routeAppModel;
            do {
                value2 = mutableStateFlow.getValue();
                success = new RouteDetailsResult.Success(routeAppModel, true);
                ((TrackingDataState) value2).getClass();
            } while (!mutableStateFlow.c(value2, new TrackingDataState(success)));
            if (z) {
                BuildersKt.d(routeTrackingDataProviderImpl.g, null, null, new RouteTrackingDataProviderImpl$fetchRouteDetails$5(routeTrackingDataProviderImpl, str, null), 3);
                return unit;
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            routeTrackingDataProviderImpl$fetchRouteDetails$2.L$0 = null;
            routeTrackingDataProviderImpl$fetchRouteDetails$2.label = 2;
            if (routeTrackingDataProviderImpl.i(str, routeTrackingDataProviderImpl$fetchRouteDetails$2, false) == obj) {
                return obj;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0129  */
    /* JADX WARN: Code duplicated, block: B:40:0x0156  */
    /* JADX WARN: Code duplicated, block: B:43:0x0179  */
    /* JADX WARN: Code duplicated, block: B:46:0x01af  */
    /* JADX WARN: Code duplicated, block: B:53:0x01df  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01af -> B:47:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01df -> B:52:0x01d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl r37, java.lang.String r38, java.util.List r39, java.util.List r40, boolean r41, boolean r42, kotlin.coroutines.jvm.internal.ContinuationImpl r43) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl.h(app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl, java.lang.String, java.util.List, java.util.List, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider
    public final void a(boolean z) {
        MutableStateFlow mutableStateFlow;
        Object value;
        String str = this.h;
        if (str != null) {
            BuildersKt.d(this.g, null, null, new RouteTrackingDataProviderImpl$fetchRouteDetails$1(this, str, z, null), 3);
        } else {
            do {
                mutableStateFlow = this.j;
                value = mutableStateFlow.getValue();
                ((TrackingDataState) value).getClass();
            } while (!mutableStateFlow.c(value, new TrackingDataState(RouteDetailsResult.Error.RouteIdNotAvailable.f4344a)));
        }
    }

    @Override // app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider
    public final RouteTrackingManagerInitState b(String routeId) {
        Intrinsics.i(routeId, "routeId");
        if (this.h != null) {
            return RouteTrackingManagerInitState.ALREADY_INITIALISED;
        }
        if (StringsKt.F(routeId)) {
            return RouteTrackingManagerInitState.NOT_INITIALISED;
        }
        this.h = routeId;
        return RouteTrackingManagerInitState.INITIALISED;
    }

    @Override // app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider
    public final StateFlow c() {
        return FlowKt.c(this.j);
    }

    @Override // app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider
    public final Flow d(List list, boolean z, boolean z2) {
        String str = this.h;
        return str == null ? new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(LiveVehicleDetailsResult.Error.RouteIdNotAvailable.f4340a) : FlowKt.h(new RouteTrackingDataProviderImpl$getLiveVehicleDetailsResultFlow$1(this, str, list, z2, z, null));
    }

    @Override // app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider
    public final Flow e(String stopId, List list) {
        Intrinsics.i(stopId, "stopId");
        String str = this.h;
        if (str == null) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(LiveStopEtaResult.Error.ConfigNotAvailable.f4337a);
        }
        if (this.i == null) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(LiveStopEtaResult.Error.RouteDetailsNotAvailable.f4338a);
        }
        FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        List list2 = list;
        if (list2.isEmpty()) {
            list2 = null;
        }
        final RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$filterIsInstance$1 routeTrackingDataProviderImpl$fetchStopEtas$$inlined$filterIsInstance$1 = new RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$filterIsInstance$1(this.c.f(stopId, str, list2));
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new Flow<LiveStopEtaResult.Success>() { // from class: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4351a;
                public final /* synthetic */ RouteTrackingDataProviderImpl b;

                /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1$2", f = "RouteTrackingDataProviderImpl.kt", l = {51, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, RouteTrackingDataProviderImpl routeTrackingDataProviderImpl) {
                    this.f4351a = flowCollector;
                    this.b = routeTrackingDataProviderImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
                
                    if (r6.emit(r2, r0) == r1) goto L22;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1$2$1 r0 = (app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1$2$1 r0 = new app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3a
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.b(r7)
                        goto L66
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        java.lang.Object r6 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                        kotlin.ResultKt.b(r7)
                        goto L53
                    L3a:
                        kotlin.ResultKt.b(r7)
                        app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult$Success r6 = (app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult.Success) r6
                        app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl r7 = r5.b
                        app.chalo.livetracking.frameworklivetracking.domain.ProcessLiveStopEtaDataUseCase r7 = r7.d
                        java.util.ArrayList r6 = r6.f4207a
                        kotlinx.coroutines.flow.FlowCollector r2 = r5.f4351a
                        r0.L$0 = r2
                        r0.label = r4
                        java.lang.Object r7 = r7.b(r6, r0)
                        if (r7 != r1) goto L52
                        goto L65
                    L52:
                        r6 = r2
                    L53:
                        app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel r7 = (app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel) r7
                        app.chalo.livetracking.provider.tracking.LiveStopEtaResult$Success r2 = new app.chalo.livetracking.provider.tracking.LiveStopEtaResult$Success
                        r2.<init>(r7)
                        r7 = 0
                        r0.L$0 = r7
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r2, r0)
                        if (r6 != r1) goto L66
                    L65:
                        return r1
                    L66:
                        kotlin.Unit r6 = kotlin.Unit.f17538a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$fetchStopEtas$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = routeTrackingDataProviderImpl$fetchStopEtas$$inlined$filterIsInstance$1.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, new RouteTrackingDataProviderImpl$startFetchingStopETAs$1(3, null));
    }

    @Override // app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider
    public final Flow f(long j, final String number) {
        Intrinsics.i(number, "number");
        RouteAppModel routeAppModel = this.i;
        if (routeAppModel == null) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(VehicleGpsDataResult.Error.RouteDetailsNotAvailable.f4363a);
        }
        final Flow flowD = this.c.d(number, routeAppModel.j, Long.valueOf(j), null);
        return new Flow<VehicleGpsDataResult.Success>() { // from class: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f4361a;
                public final /* synthetic */ RouteTrackingDataProviderImpl b;
                public final /* synthetic */ String c;

                /* JADX INFO: renamed from: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1$2", f = "RouteTrackingDataProviderImpl.kt", l = {51, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, RouteTrackingDataProviderImpl routeTrackingDataProviderImpl, String str) {
                    this.f4361a = flowCollector;
                    this.b = routeTrackingDataProviderImpl;
                    this.c = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
                
                    if (r2.emit(r12, r0) == r1) goto L21;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1$2$1 r0 = (app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1$2$1 r0 = new app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1$2$1
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3e
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.b(r12)
                        goto L79
                    L2a:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L32:
                        java.lang.Object r11 = r0.L$1
                        app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel r11 = (app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel) r11
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        kotlin.ResultKt.b(r12)
                        goto L58
                    L3e:
                        kotlin.ResultKt.b(r12)
                        app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel r11 = (app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel) r11
                        app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl r12 = r10.b
                        app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase r12 = r12.e
                        long r5 = r11.c
                        kotlinx.coroutines.flow.FlowCollector r2 = r10.f4361a
                        r0.L$0 = r2
                        r0.L$1 = r11
                        r0.label = r4
                        java.lang.Object r12 = r12.a(r5, r0)
                        if (r12 != r1) goto L58
                        goto L78
                    L58:
                        r9 = r12
                        app.chalo.compose.components.chalomap.LiveBusDelayedState r9 = (app.chalo.compose.components.chalomap.LiveBusDelayedState) r9
                        app.chalo.livetracking.provider.tracking.VehicleGpsDataResult$Success r12 = new app.chalo.livetracking.provider.tracking.VehicleGpsDataResult$Success
                        app.chalo.livetracking.provider.tracking.model.LiveVehicleGpsData r4 = new app.chalo.livetracking.provider.tracking.model.LiveVehicleGpsData
                        app.chalo.location.LatLng r5 = r11.b
                        java.lang.String r6 = r10.c
                        long r7 = r11.c
                        r4.<init>(r5, r6, r7, r9)
                        r12.<init>(r4)
                        r11 = 0
                        r0.L$0 = r11
                        r0.L$1 = r11
                        r0.label = r3
                        java.lang.Object r11 = r2.emit(r12, r0)
                        if (r11 != r1) goto L79
                    L78:
                        return r1
                    L79:
                        kotlin.Unit r11 = kotlin.Unit.f17538a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingBusGpsLocation$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowD.collect(new AnonymousClass2(flowCollector, this, number), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, ContinuationImpl continuationImpl, boolean z) {
        RouteTrackingDataProviderImpl$fetchRouteFromRemote$1 routeTrackingDataProviderImpl$fetchRouteFromRemote$1;
        Object value;
        RouteDetailsResult.Success success;
        Object value2;
        RouteDetailsResult.Error.FetchError fetchError;
        String str2;
        if (continuationImpl instanceof RouteTrackingDataProviderImpl$fetchRouteFromRemote$1) {
            routeTrackingDataProviderImpl$fetchRouteFromRemote$1 = (RouteTrackingDataProviderImpl$fetchRouteFromRemote$1) continuationImpl;
            int i = routeTrackingDataProviderImpl$fetchRouteFromRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeTrackingDataProviderImpl$fetchRouteFromRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                routeTrackingDataProviderImpl$fetchRouteFromRemote$1 = new RouteTrackingDataProviderImpl$fetchRouteFromRemote$1(this, continuationImpl);
            }
        } else {
            routeTrackingDataProviderImpl$fetchRouteFromRemote$1 = new RouteTrackingDataProviderImpl$fetchRouteFromRemote$1(this, continuationImpl);
        }
        Object objB = routeTrackingDataProviderImpl$fetchRouteFromRemote$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeTrackingDataProviderImpl$fetchRouteFromRemote$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            routeTrackingDataProviderImpl$fetchRouteFromRemote$1.Z$0 = z;
            routeTrackingDataProviderImpl$fetchRouteFromRemote$1.label = 1;
            objB = this.b.b(str, routeTrackingDataProviderImpl$fetchRouteFromRemote$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = routeTrackingDataProviderImpl$fetchRouteFromRemote$1.Z$0;
            ResultKt.b(objB);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        boolean z2 = chaloUseCaseResult instanceof ChaloUseCaseResult.Failure;
        MutableStateFlow mutableStateFlow = this.j;
        if (z2) {
            if (!z) {
                do {
                    value2 = mutableStateFlow.getValue();
                    TrackingDataState trackingDataState = (TrackingDataState) value2;
                    RoutesDataFetchErrorType routesDataFetchErrorType = (RoutesDataFetchErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    routesDataFetchErrorType.getClass();
                    if (routesDataFetchErrorType instanceof RoutesDataFetchErrorType.Remote) {
                        str2 = ((RoutesDataFetchErrorType.Remote) routesDataFetchErrorType).f1766a.f1633a;
                    } else if (routesDataFetchErrorType instanceof RoutesDataFetchErrorType.CityUnavailable) {
                        str2 = ((RoutesDataFetchErrorType.CityUnavailable) routesDataFetchErrorType).f1765a;
                    } else {
                        if (!(routesDataFetchErrorType instanceof RoutesDataFetchErrorType.RouteNotAvailable)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = ((RoutesDataFetchErrorType.RouteNotAvailable) routesDataFetchErrorType).f1767a;
                    }
                    fetchError = new RouteDetailsResult.Error.FetchError(str2);
                    trackingDataState.getClass();
                } while (!mutableStateFlow.c(value2, new TrackingDataState(fetchError)));
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z) {
                RouteAppModel routeAppModel = (RouteAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                this.i = routeAppModel;
                do {
                    value = mutableStateFlow.getValue();
                    success = new RouteDetailsResult.Success(routeAppModel, false);
                    ((TrackingDataState) value).getClass();
                } while (!mutableStateFlow.c(value, new TrackingDataState(success)));
            }
        }
        return Unit.f17538a;
    }
}
