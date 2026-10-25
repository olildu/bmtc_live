package app.chalo.livetracking.frameworklivetracking;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.Device;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.foreground.ForegroundListener;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponseErrorType;
import app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloSocketConfigResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ProcessRTSDataResult;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealTimeSocketResponseErrorType;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResult;
import app.chalo.livetracking.frameworklivetracking.domain.ChaloConfigFetchErrorType;
import app.chalo.livetracking.frameworklivetracking.domain.GetChaloSocketConfigUseCase;
import app.chalo.livetracking.frameworklivetracking.utils.SocketResponseToAppModelConverterKt;
import app.chalo.network.config.KPlatformSocketConfig;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/RealTimeSocketManagerImpl;", "Lapp/chalo/livetracking/frameworklivetracking/RealTimeSocketManager;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RealTimeSocketManagerImpl implements RealTimeSocketManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetChaloSocketConfigUseCase f4208a;
    public final ChaloSocketFeature b;
    public final CityProvider c;
    public final UserProfileDetailsProvider d;
    public final Device e;
    public final ApplicationForegroundManager f;
    public final NetworkStateManager g;
    public final AnalyticsContract h;
    public final CrashlyticsLogger i;
    public final KPlatformSocketConfig j;
    public final KAtomicInteger k = new KAtomicInteger();
    public final MutexImpl l = MutexKt.a();
    public final MutableStateFlow m = StateFlowKt.a(new ChaloConfigState(ChaloConfigStateFetchState.NOT_FETCHED, null));
    public final ContextScope n;
    public final RealTimeSocketManagerImpl$getForeGroundListener$1 o;

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$1", f = "RealTimeSocketManagerImpl.kt", l = {91, 92}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RealTimeSocketManagerImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 == r2) goto L14
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L14:
                kotlin.ResultKt.b(r5)
                goto L42
            L18:
                kotlin.ResultKt.b(r5)
                goto L2a
            L1c:
                kotlin.ResultKt.b(r5)
                app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl r5 = app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl.this
                r4.label = r3
                java.lang.Object r5 = r5.f(r4)
                if (r5 != r0) goto L2a
                goto L41
            L2a:
                app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl r5 = app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl.this
                app.chalo.features.network.NetworkStateManager r5 = r5.g
                kotlinx.coroutines.flow.StateFlow r5 = r5.b()
                app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$1$1 r1 = new app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$1$1
                app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl r3 = app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl.this
                r1.<init>()
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$2", f = "RealTimeSocketManagerImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RealTimeSocketManagerImpl.this.new AnonymousClass2(continuation);
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
                RealTimeSocketManagerImpl realTimeSocketManagerImpl = RealTimeSocketManagerImpl.this;
                this.label = 1;
                if (realTimeSocketManagerImpl.f(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RealTimeSocketManagerImpl realTimeSocketManagerImpl2 = RealTimeSocketManagerImpl.this;
            realTimeSocketManagerImpl2.f.a(realTimeSocketManagerImpl2.o);
            return Unit.f17538a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$getForeGroundListener$1] */
    public RealTimeSocketManagerImpl(GetChaloSocketConfigUseCase getChaloSocketConfigUseCase, ChaloSocketFeature chaloSocketFeature, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, CoroutineContextProvider coroutineContextProvider, Device device, ApplicationForegroundManager applicationForegroundManager, NetworkStateManager networkStateManager, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger, KPlatformSocketConfig kPlatformSocketConfig) {
        this.f4208a = getChaloSocketConfigUseCase;
        this.b = chaloSocketFeature;
        this.c = cityProvider;
        this.d = userProfileDetailsProvider;
        this.e = device;
        this.f = applicationForegroundManager;
        this.g = networkStateManager;
        this.h = analyticsContract;
        this.i = crashlyticsLogger;
        this.j = kPlatformSocketConfig;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.n = contextScopeA;
        this.o = new ForegroundListener() { // from class: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$getForeGroundListener$1
            {
                KUUID.a();
            }

            @Override // app.chalo.features.foreground.ForegroundListener
            public final void a() {
                RealTimeSocketManagerImpl realTimeSocketManagerImpl = this.f4211a;
                BuildersKt.d(realTimeSocketManagerImpl.n, null, null, new RealTimeSocketManagerImpl$getForeGroundListener$1$onBecameBackground$1(realTimeSocketManagerImpl, null), 3);
            }

            @Override // app.chalo.features.foreground.ForegroundListener
            public final void b() {
                RealTimeSocketManagerImpl realTimeSocketManagerImpl = this.f4211a;
                BuildersKt.d(realTimeSocketManagerImpl.n, null, null, new RealTimeSocketManagerImpl$getForeGroundListener$1$onBecameForeground$1(realTimeSocketManagerImpl, null), 3);
            }
        };
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass2(null), 3);
    }

    public static final RealtimeSocketResult c(RealTimeSocketManagerImpl realTimeSocketManagerImpl, RealTimeSocketRequest realTimeSocketRequest, ChaloSocketResponse chaloSocketResponse, ProcessRTSDataResult processRTSDataResult) {
        RealTimeSocketResponseErrorType generic;
        RealTimeSocketResponseErrorType realTimeSocketResponseErrorType;
        realTimeSocketManagerImpl.getClass();
        if (chaloSocketResponse instanceof ChaloSocketResponse.Error) {
            ChaloSocketResponseErrorType chaloSocketResponseErrorType = ((ChaloSocketResponse.Error) chaloSocketResponse).b;
            if (Intrinsics.d(chaloSocketResponseErrorType, ChaloSocketResponseErrorType.AckNotReceived.INSTANCE)) {
                realTimeSocketResponseErrorType = RealTimeSocketResponseErrorType.AckNotReceivedForRequest.f4303a;
            } else {
                if (chaloSocketResponseErrorType instanceof ChaloSocketResponseErrorType.ConnectionError) {
                    generic = new RealTimeSocketResponseErrorType.SocketConnectionError(((ChaloSocketResponseErrorType.ConnectionError) chaloSocketResponseErrorType).b);
                } else {
                    if (!(chaloSocketResponseErrorType instanceof ChaloSocketResponseErrorType.GenericError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    generic = new RealTimeSocketResponseErrorType.Generic(((ChaloSocketResponseErrorType.GenericError) chaloSocketResponseErrorType).b);
                }
                realTimeSocketResponseErrorType = generic;
            }
            return new RealtimeSocketResult.Error(realTimeSocketResponseErrorType);
        }
        if (!(chaloSocketResponse instanceof ChaloSocketResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            if (realTimeSocketRequest instanceof RealTimeSocketRequest.Route) {
                return new RealtimeSocketResult.Success.Route(SocketResponseToAppModelConverterKt.c(((ChaloSocketResponse.Success) chaloSocketResponse).d), processRTSDataResult);
            }
            if (realTimeSocketRequest instanceof RealTimeSocketRequest.Etas) {
                return new RealtimeSocketResult.Success.Etas(SocketResponseToAppModelConverterKt.b(((ChaloSocketResponse.Success) chaloSocketResponse).d), processRTSDataResult);
            }
            if (realTimeSocketRequest instanceof RealTimeSocketRequest.EtasList) {
                return new RealtimeSocketResult.Success.EtasList(SocketResponseToAppModelConverterKt.a(((ChaloSocketResponse.Success) chaloSocketResponse).d), processRTSDataResult);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            String message = "EXCEPTION: " + e;
            Intrinsics.i(message, "message");
            realTimeSocketManagerImpl.i.i(e);
            return new RealtimeSocketResult.Error(RealTimeSocketResponseErrorType.InvalidSocketResponse.f4308a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r9.f(r1) == r2) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            app.chalo.livetracking.frameworklivetracking.ChaloSocketFeature r0 = r9.b
            boolean r1 = r10 instanceof app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$updateRtsManagerOnCityUpdate$1
            if (r1 == 0) goto L15
            r1 = r10
            app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$updateRtsManagerOnCityUpdate$1 r1 = (app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$updateRtsManagerOnCityUpdate$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$updateRtsManagerOnCityUpdate$1 r1 = new app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$updateRtsManagerOnCityUpdate$1
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L5c
            if (r3 == r7) goto L53
            if (r3 == r6) goto L47
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L34
            kotlin.ResultKt.b(r10)
            goto Laf
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r0 = r1.L$0
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L44
            goto L83
        L44:
            r9 = move-exception
            goto Lb4
        L47:
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L50
            r10 = r3
            goto L77
        L50:
            r9 = move-exception
            r0 = r3
            goto Lb4
        L53:
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            kotlin.ResultKt.b(r10)
            r10 = r3
            goto L6c
        L5c:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.sync.MutexImpl r10 = r9.l
            r1.L$0 = r10
            r1.label = r7
            java.lang.Object r3 = r10.a(r1)
            if (r3 != r2) goto L6c
            goto Lae
        L6c:
            r1.L$0 = r10     // Catch: java.lang.Throwable -> Lb2
            r1.label = r6     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r3 = r0.c(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r3 != r2) goto L77
            goto Lae
        L77:
            r1.L$0 = r10     // Catch: java.lang.Throwable -> Lb2
            r1.label = r5     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r0.a(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != r2) goto L82
            goto Lae
        L82:
            r0 = r10
        L83:
            kotlinx.coroutines.flow.MutableStateFlow r10 = r9.m     // Catch: java.lang.Throwable -> L44
        L85:
            java.lang.Object r3 = r10.getValue()     // Catch: java.lang.Throwable -> L44
            r5 = r3
            app.chalo.livetracking.frameworklivetracking.ChaloConfigState r5 = (app.chalo.livetracking.frameworklivetracking.ChaloConfigState) r5     // Catch: java.lang.Throwable -> L44
            app.chalo.livetracking.frameworklivetracking.ChaloConfigStateFetchState r6 = app.chalo.livetracking.frameworklivetracking.ChaloConfigStateFetchState.NOT_FETCHED     // Catch: java.lang.Throwable -> L44
            r5.getClass()     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "configFetchState"
            kotlin.jvm.internal.Intrinsics.i(r6, r5)     // Catch: java.lang.Throwable -> L44
            app.chalo.livetracking.frameworklivetracking.ChaloConfigState r5 = new app.chalo.livetracking.frameworklivetracking.ChaloConfigState     // Catch: java.lang.Throwable -> L44
            r5.<init>(r6, r8)     // Catch: java.lang.Throwable -> L44
            boolean r3 = r10.c(r3, r5)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L85
            r0.e(r8)
            r1.L$0 = r8
            r1.label = r4
            java.lang.Object r9 = r9.f(r1)
            if (r9 != r2) goto Laf
        Lae:
            return r2
        Laf:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        Lb2:
            r9 = move-exception
            r0 = r10
        Lb4:
            r0.e(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl.d(app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static long e(long j, double d) {
        int i = ((int) j) / 1000;
        int i2 = (int) (((double) i) * d);
        return RangesKt.j(Random.f17624a, new IntRange(i - i2, i + i2, 1)) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (((app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest.Route) r4).b.length() > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (((app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest.EtasList) r4).b.isEmpty() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (((app.chalo.livetracking.frameworklivetracking.ChaloConfigState) r3.m.getValue()).f4175a != app.chalo.livetracking.frameworklivetracking.ChaloConfigStateFetchState.FETCH_ERROR) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResult.Error(app.chalo.livetracking.frameworklivetracking.data.model.app.RealTimeSocketResponseErrorType.ConfigNotAvailable.f4304a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return kotlinx.coroutines.flow.FlowKt.x(kotlinx.coroutines.flow.FlowKt.y(new app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$1(r3, null)), new app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2(r4, r3, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r0.b.length() > 0) goto L18;
     */
    @Override // app.chalo.livetracking.frameworklivetracking.RealTimeSocketManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow a(app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "subscribed with new socket: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "message"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            boolean r0 = r4 instanceof app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest.Etas
            if (r0 == 0) goto L2c
            r0 = r4
            app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest$Etas r0 = (app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest.Etas) r0
            java.lang.String r1 = r0.c
            int r1 = r1.length()
            if (r1 <= 0) goto L7c
            java.lang.String r0 = r0.b
            int r0 = r0.length()
            if (r0 <= 0) goto L7c
            goto L4d
        L2c:
            boolean r0 = r4 instanceof app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest.Route
            if (r0 == 0) goto L3c
            r0 = r4
            app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest$Route r0 = (app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest.Route) r0
            java.lang.String r0 = r0.b
            int r0 = r0.length()
            if (r0 <= 0) goto L7c
            goto L4d
        L3c:
            boolean r0 = r4 instanceof app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest.EtasList
            if (r0 == 0) goto L89
            r0 = r4
            app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest$EtasList r0 = (app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest.EtasList) r0
            java.util.List r0 = r0.b
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7c
        L4d:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r3.m
            java.lang.Object r0 = r0.getValue()
            app.chalo.livetracking.frameworklivetracking.ChaloConfigState r0 = (app.chalo.livetracking.frameworklivetracking.ChaloConfigState) r0
            app.chalo.livetracking.frameworklivetracking.ChaloConfigStateFetchState r0 = r0.f4175a
            app.chalo.livetracking.frameworklivetracking.ChaloConfigStateFetchState r1 = app.chalo.livetracking.frameworklivetracking.ChaloConfigStateFetchState.FETCH_ERROR
            if (r0 != r1) goto L68
            app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResult$Error r4 = new app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResult$Error
            app.chalo.livetracking.frameworklivetracking.data.model.app.RealTimeSocketResponseErrorType$ConfigNotAvailable r0 = app.chalo.livetracking.frameworklivetracking.data.model.app.RealTimeSocketResponseErrorType.ConfigNotAvailable.f4304a
            r4.<init>(r0)
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            r0.<init>(r4)
            return r0
        L68:
            app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$1 r0 = new app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.y(r0)
            app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2 r2 = new app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$subscribe$2
            r2.<init>(r4, r3, r1)
            kotlinx.coroutines.flow.Flow r4 = kotlinx.coroutines.flow.FlowKt.x(r0, r2)
            return r4
        L7c:
            app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResult$Error r4 = new app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResult$Error
            app.chalo.livetracking.frameworklivetracking.data.model.app.RealTimeSocketResponseErrorType$InvalidRealTimeSocketRequest r0 = app.chalo.livetracking.frameworklivetracking.data.model.app.RealTimeSocketResponseErrorType.InvalidRealTimeSocketRequest.f4306a
            r4.<init>(r0)
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            r0.<init>(r4)
            return r0
        L89:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl.a(app.chalo.livetracking.frameworklivetracking.data.model.RealTimeSocketRequest):kotlinx.coroutines.flow.Flow");
    }

    @Override // app.chalo.livetracking.frameworklivetracking.RealTimeSocketManager
    public final void b(CityAppModel newCity) {
        Intrinsics.i(newCity, "newCity");
        String message = "handleCityUpdate called for new socket " + newCity;
        Intrinsics.i(message, "message");
        BuildersKt.d(this.n, null, null, new RealTimeSocketManagerImpl$handleCityUpdate$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:22:0x004f, B:51:0x00cd, B:55:0x00f0, B:56:0x010f, B:58:0x0130, B:63:0x013e, B:65:0x0143, B:66:0x0179, B:70:0x0196, B:71:0x019b, B:34:0x007a, B:38:0x008a, B:40:0x0096, B:46:0x00a7, B:48:0x00c0), top: B:75:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0143 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:22:0x004f, B:51:0x00cd, B:55:0x00f0, B:56:0x010f, B:58:0x0130, B:63:0x013e, B:65:0x0143, B:66:0x0179, B:70:0x0196, B:71:0x019b, B:34:0x007a, B:38:0x008a, B:40:0x0096, B:46:0x00a7, B:48:0x00c0), top: B:75:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0196 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #1 {all -> 0x0054, blocks: (B:22:0x004f, B:51:0x00cd, B:55:0x00f0, B:56:0x010f, B:58:0x0130, B:63:0x013e, B:65:0x0143, B:66:0x0179, B:70:0x0196, B:71:0x019b, B:34:0x007a, B:38:0x008a, B:40:0x0096, B:46:0x00a7, B:48:0x00c0), top: B:75:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [app.chalo.livetracking.frameworklivetracking.domain.GetChaloSocketConfigUseCase] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlinx.coroutines.sync.MutexImpl] */
    /* JADX WARN: Type inference failed for: r20v0, types: [app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
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
    public final Object f(Continuation continuation) throws Throwable {
        ?? realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1;
        ?? r4;
        ?? r5;
        ?? r2;
        ChaloUseCaseResult chaloUseCaseResult;
        boolean z;
        AnalyticsContract analyticsContract;
        NetworkStateManager networkStateManager;
        Object value;
        ChaloConfigStateFetchState configFetchState;
        ChaloSocketConfigResponseAppModel chaloSocketConfigResponseAppModel;
        Object value2;
        ChaloConfigStateFetchState configFetchState2;
        ChaloSocketConfigResponseAppModel chaloSocketConfigResponseAppModel2;
        ?? r3;
        Object value3;
        ChaloConfigStateFetchState configFetchState3;
        ChaloSocketConfigResponseAppModel chaloSocketConfigResponseAppModel3;
        if (continuation instanceof RealTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1) {
            RealTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1 realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$2 = (RealTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1) continuation;
            int i = realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$2.label = i - Integer.MIN_VALUE;
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1 = realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$2;
            } else {
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1 = new RealTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1(this, continuation);
            }
        } else {
            realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1 = new RealTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1(this, continuation);
        }
        Object objA = realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r6 = realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.label;
        Unit unit = Unit.f17538a;
        MutableStateFlow mutableStateFlow = this.m;
        try {
            if (r6 == 0) {
                ResultKt.b(objA);
                ?? r0 = this.l;
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0 = r0;
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.label = 1;
                if (r0.a(realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1) != coroutineSingletons) {
                    r4 = r0;
                }
                return coroutineSingletons;
            }
            if (r6 != 1) {
                try {
                    if (r6 == 2) {
                        Mutex mutex = (Mutex) realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0;
                        ResultKt.b(objA);
                        r3 = mutex;
                        r3.e(null);
                        return unit;
                    }
                    if (r6 == 3) {
                        Mutex mutex2 = (Mutex) realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0;
                        ResultKt.b(objA);
                        r5 = mutex2;
                        chaloUseCaseResult = (ChaloUseCaseResult) objA;
                        String message = "config response: " + chaloUseCaseResult;
                        Intrinsics.i(message, "message");
                        z = chaloUseCaseResult instanceof ChaloUseCaseResult.Success;
                        analyticsContract = this.h;
                        networkStateManager = this.g;
                        if (z) {
                            AnalyticsContract.DefaultImpls.a(analyticsContract, "crts config success", LiveTrackingDataManagerImpl.h, MapsKt.h(new Pair("network type", networkStateManager.a().name())), null, false, 24);
                            do {
                                value2 = mutableStateFlow.getValue();
                                configFetchState2 = ChaloConfigStateFetchState.FETCH_SUCCESS;
                                chaloSocketConfigResponseAppModel2 = (ChaloSocketConfigResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                ((ChaloConfigState) value2).getClass();
                                Intrinsics.i(configFetchState2, "configFetchState");
                            } while (!mutableStateFlow.c(value2, new ChaloConfigState(configFetchState2, chaloSocketConfigResponseAppModel2)));
                            realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0 = r5;
                            realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.label = 4;
                            if (g(realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1) != coroutineSingletons) {
                                r2 = r5;
                            }
                            return coroutineSingletons;
                        }
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AnalyticsContract.DefaultImpls.a(analyticsContract, "crts config failed", LiveTrackingDataManagerImpl.h, MapsKt.i(new Pair("reason", ((ChaloConfigFetchErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f4320a), new Pair("network type", networkStateManager.a().name())), null, false, 24);
                        do {
                            value = mutableStateFlow.getValue();
                            configFetchState = ChaloConfigStateFetchState.FETCH_ERROR;
                            chaloSocketConfigResponseAppModel = ((ChaloConfigState) value).b;
                            Intrinsics.i(configFetchState, "configFetchState");
                        } while (!mutableStateFlow.c(value, new ChaloConfigState(configFetchState, chaloSocketConfigResponseAppModel)));
                        r5.e(null);
                        return unit;
                    }
                    if (r6 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex3 = (Mutex) realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0;
                    ResultKt.b(objA);
                    r2 = mutex3;
                    r5 = r2;
                    r5.e(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.e(null);
                    throw th;
                }
            }
            Mutex mutex4 = (Mutex) realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0;
            ResultKt.b(objA);
            r4 = mutex4;
            if (((ChaloConfigState) mutableStateFlow.getValue()).f4175a == ChaloConfigStateFetchState.FETCH_IN_PROGRESS) {
                r4.e(null);
                return unit;
            }
            if (((ChaloConfigState) mutableStateFlow.getValue()).f4175a == ChaloConfigStateFetchState.FETCH_SUCCESS) {
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0 = r4;
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.label = 2;
                if (g(realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1) != coroutineSingletons) {
                    r3 = r4;
                    r3.e(null);
                    return unit;
                }
            } else {
                do {
                    value3 = mutableStateFlow.getValue();
                    configFetchState3 = ChaloConfigStateFetchState.FETCH_IN_PROGRESS;
                    chaloSocketConfigResponseAppModel3 = ((ChaloConfigState) value3).b;
                    Intrinsics.i(configFetchState3, "configFetchState");
                } while (!mutableStateFlow.c(value3, new ChaloConfigState(configFetchState3, chaloSocketConfigResponseAppModel3)));
                ?? r1 = this.f4208a;
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0 = r4;
                realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.label = 3;
                objA = r1.a(realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1);
                r5 = r4;
                if (objA != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    String message2 = "config response: " + chaloUseCaseResult;
                    Intrinsics.i(message2, "message");
                    z = chaloUseCaseResult instanceof ChaloUseCaseResult.Success;
                    analyticsContract = this.h;
                    networkStateManager = this.g;
                    if (z) {
                        AnalyticsContract.DefaultImpls.a(analyticsContract, "crts config success", LiveTrackingDataManagerImpl.h, MapsKt.h(new Pair("network type", networkStateManager.a().name())), null, false, 24);
                        do {
                            value2 = mutableStateFlow.getValue();
                            configFetchState2 = ChaloConfigStateFetchState.FETCH_SUCCESS;
                            chaloSocketConfigResponseAppModel2 = (ChaloSocketConfigResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                            ((ChaloConfigState) value2).getClass();
                            Intrinsics.i(configFetchState2, "configFetchState");
                        } while (!mutableStateFlow.c(value2, new ChaloConfigState(configFetchState2, chaloSocketConfigResponseAppModel2)));
                        realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.L$0 = r5;
                        realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1.label = 4;
                        if (g(realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1) != coroutineSingletons) {
                            r2 = r5;
                            r5 = r2;
                        }
                    } else {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AnalyticsContract.DefaultImpls.a(analyticsContract, "crts config failed", LiveTrackingDataManagerImpl.h, MapsKt.i(new Pair("reason", ((ChaloConfigFetchErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f4320a), new Pair("network type", networkStateManager.a().name())), null, false, 24);
                        do {
                            value = mutableStateFlow.getValue();
                            configFetchState = ChaloConfigStateFetchState.FETCH_ERROR;
                            chaloSocketConfigResponseAppModel = ((ChaloConfigState) value).b;
                            Intrinsics.i(configFetchState, "configFetchState");
                        } while (!mutableStateFlow.c(value, new ChaloConfigState(configFetchState, chaloSocketConfigResponseAppModel)));
                    }
                    r5.e(null);
                    return unit;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            realTimeSocketManagerImpl$fetchRtsConfigAndInitSocket$1 = r6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        if (r5.b(r2) == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl.g(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
