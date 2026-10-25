package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/domain/CheckLiveBusDelayedUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckLiveBusDelayedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetDelayedEtaThresholdForLiveTrackingUseCase f4321a;
    public final CoroutineContextProvider b;
    public final CityProvider c;
    public final BasicInfoContract d;
    public final MutexImpl e;
    public Long f;

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase$1", f = "GetLiveBusDelayedStateUseCase.kt", l = {28}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final class C01181<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CheckLiveBusDelayedUseCase f4322a;

            public C01181(CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase) {
                this.f4322a = checkLiveBusDelayedUseCase;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(Continuation continuation) {
                CheckLiveBusDelayedUseCase$1$1$emit$1 checkLiveBusDelayedUseCase$1$1$emit$1;
                CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase;
                if (continuation instanceof CheckLiveBusDelayedUseCase$1$1$emit$1) {
                    checkLiveBusDelayedUseCase$1$1$emit$1 = (CheckLiveBusDelayedUseCase$1$1$emit$1) continuation;
                    int i = checkLiveBusDelayedUseCase$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        checkLiveBusDelayedUseCase$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        checkLiveBusDelayedUseCase$1$1$emit$1 = new CheckLiveBusDelayedUseCase$1$1$emit$1(this, continuation);
                    }
                } else {
                    checkLiveBusDelayedUseCase$1$1$emit$1 = new CheckLiveBusDelayedUseCase$1$1$emit$1(this, continuation);
                }
                Object obj = checkLiveBusDelayedUseCase$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = checkLiveBusDelayedUseCase$1$1$emit$1.label;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase2 = this.f4322a;
                    GetDelayedEtaThresholdForLiveTrackingUseCase getDelayedEtaThresholdForLiveTrackingUseCase = checkLiveBusDelayedUseCase2.f4321a;
                    checkLiveBusDelayedUseCase$1$1$emit$1.L$0 = checkLiveBusDelayedUseCase2;
                    checkLiveBusDelayedUseCase$1$1$emit$1.label = 1;
                    Object objA = getDelayedEtaThresholdForLiveTrackingUseCase.a(checkLiveBusDelayedUseCase$1$1$emit$1);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    checkLiveBusDelayedUseCase = checkLiveBusDelayedUseCase2;
                    obj = objA;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    checkLiveBusDelayedUseCase = (CheckLiveBusDelayedUseCase) checkLiveBusDelayedUseCase$1$1$emit$1.L$0;
                    ResultKt.b(obj);
                }
                checkLiveBusDelayedUseCase.f = (Long) obj;
                return Unit.f17538a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(continuation);
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CheckLiveBusDelayedUseCase.this.new AnonymousClass1(continuation);
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
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(CheckLiveBusDelayedUseCase.this.c.b());
                C01181 c01181 = new C01181(CheckLiveBusDelayedUseCase.this);
                this.label = 1;
                if (flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(c01181, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase$2", f = "GetLiveBusDelayedStateUseCase.kt", l = {92, 35}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CheckLiveBusDelayedUseCase.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase;
            MutexImpl mutexImpl;
            Mutex mutex;
            CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.b(obj);
                    checkLiveBusDelayedUseCase = CheckLiveBusDelayedUseCase.this;
                    mutexImpl = checkLiveBusDelayedUseCase.e;
                    this.L$0 = mutexImpl;
                    this.L$1 = checkLiveBusDelayedUseCase;
                    this.label = 1;
                    if (mutexImpl.a(this) != coroutineSingletons) {
                    }
                    mutex = mutexImpl;
                    return coroutineSingletons;
                }
                if (r1 == 1) {
                    CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase3 = (CheckLiveBusDelayedUseCase) this.L$1;
                    Mutex mutex2 = (Mutex) this.L$0;
                    ResultKt.b(obj);
                    checkLiveBusDelayedUseCase = checkLiveBusDelayedUseCase3;
                    mutex = mutex2;
                } else {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    checkLiveBusDelayedUseCase2 = (CheckLiveBusDelayedUseCase) this.L$1;
                    Mutex mutex3 = (Mutex) this.L$0;
                    ResultKt.b(obj);
                    r1 = mutex3;
                }
                checkLiveBusDelayedUseCase2.f = (Long) obj;
                r1.e(null);
                return Unit.f17538a;
                mutex = mutexImpl;
                GetDelayedEtaThresholdForLiveTrackingUseCase getDelayedEtaThresholdForLiveTrackingUseCase = checkLiveBusDelayedUseCase.f4321a;
                this.L$0 = mutex;
                this.L$1 = checkLiveBusDelayedUseCase;
                this.label = 2;
                Object objA = getDelayedEtaThresholdForLiveTrackingUseCase.a(this);
                if (objA != coroutineSingletons) {
                    checkLiveBusDelayedUseCase2 = checkLiveBusDelayedUseCase;
                    obj = objA;
                    r1 = mutex;
                    checkLiveBusDelayedUseCase2.f = (Long) obj;
                    r1.e(null);
                    return Unit.f17538a;
                }
                mutex = mutexImpl;
                return coroutineSingletons;
            } catch (Throwable th) {
                r1.e(null);
                throw th;
            }
        }
    }

    public CheckLiveBusDelayedUseCase(GetDelayedEtaThresholdForLiveTrackingUseCase getDelayedEtaThresholdForLiveTrackingUseCase, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider, BasicInfoContract basicInfoContract) {
        this.f4321a = getDelayedEtaThresholdForLiveTrackingUseCase;
        this.b = coroutineContextProvider;
        this.c = cityProvider;
        this.d = basicInfoContract;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.e = MutexKt.a();
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        CheckLiveBusDelayedUseCase$invoke$1 checkLiveBusDelayedUseCase$invoke$1;
        long j2;
        long j3;
        long jA;
        if (continuationImpl instanceof CheckLiveBusDelayedUseCase$invoke$1) {
            checkLiveBusDelayedUseCase$invoke$1 = (CheckLiveBusDelayedUseCase$invoke$1) continuationImpl;
            int i = checkLiveBusDelayedUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkLiveBusDelayedUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkLiveBusDelayedUseCase$invoke$1 = new CheckLiveBusDelayedUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            checkLiveBusDelayedUseCase$invoke$1 = new CheckLiveBusDelayedUseCase$invoke$1(this, continuationImpl);
        }
        Object objC = checkLiveBusDelayedUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkLiveBusDelayedUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if (this.f == null) {
                checkLiveBusDelayedUseCase$invoke$1.J$0 = j;
                checkLiveBusDelayedUseCase$invoke$1.label = 1;
                if (b(checkLiveBusDelayedUseCase$invoke$1) != obj) {
                }
                return obj;
            }
            return LiveBusDelayedState.NotDelayed.f1878a;
        }
        if (i2 == 1) {
            j = checkLiveBusDelayedUseCase$invoke$1.J$0;
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = checkLiveBusDelayedUseCase$invoke$1.J$1;
            j2 = checkLiveBusDelayedUseCase$invoke$1.J$0;
            ResultKt.b(objC);
        }
        jA = GetLiveBusDelayedStateUseCaseKt.a(((Number) objC).longValue(), j2);
        if (jA >= j3) {
            return new LiveBusDelayedState.Delayed(jA);
        }
        return LiveBusDelayedState.NotDelayed.f1878a;
        Long l = this.f;
        if (l != null) {
            long jLongValue = l.longValue();
            checkLiveBusDelayedUseCase$invoke$1.J$0 = j;
            checkLiveBusDelayedUseCase$invoke$1.J$1 = jLongValue;
            checkLiveBusDelayedUseCase$invoke$1.label = 2;
            objC = this.d.c(checkLiveBusDelayedUseCase$invoke$1);
            if (objC != obj) {
                j2 = j;
                j3 = jLongValue;
                jA = GetLiveBusDelayedStateUseCaseKt.a(((Number) objC).longValue(), j2);
                if (jA >= j3) {
                    return new LiveBusDelayedState.Delayed(jA);
                }
            }
            return obj;
        }
        return LiveBusDelayedState.NotDelayed.f1878a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        CheckLiveBusDelayedUseCase$setDelayedEtaThreshold$1 checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase;
        if (continuationImpl instanceof CheckLiveBusDelayedUseCase$setDelayedEtaThreshold$1) {
            checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1 = (CheckLiveBusDelayedUseCase$setDelayedEtaThreshold$1) continuationImpl;
            int i = checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.label = i - Integer.MIN_VALUE;
            } else {
                checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1 = new CheckLiveBusDelayedUseCase$setDelayedEtaThreshold$1(this, continuationImpl);
            }
        } else {
            checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1 = new CheckLiveBusDelayedUseCase$setDelayedEtaThreshold$1(this, continuationImpl);
        }
        Object obj = checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                if (this.f == null) {
                    mutex = this.e;
                    checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.L$0 = mutex;
                    checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.label = 1;
                    if (mutex.a(checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return Unit.f17538a;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                checkLiveBusDelayedUseCase = (CheckLiveBusDelayedUseCase) checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.L$1;
                mutex2 = (Mutex) checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.L$0;
                try {
                    ResultKt.b(obj);
                    checkLiveBusDelayedUseCase.f = (Long) obj;
                    mutex = mutex2;
                    mutex.e(null);
                    return Unit.f17538a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.e(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.L$0;
            ResultKt.b(obj);
            mutex = mutex3;
            if (this.f == null) {
                GetDelayedEtaThresholdForLiveTrackingUseCase getDelayedEtaThresholdForLiveTrackingUseCase = this.f4321a;
                checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.L$0 = mutex;
                checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.L$1 = this;
                checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1.label = 2;
                Object objA = getDelayedEtaThresholdForLiveTrackingUseCase.a(checkLiveBusDelayedUseCase$setDelayedEtaThreshold$1);
                if (objA != coroutineSingletons) {
                    mutex2 = mutex;
                    obj = objA;
                    checkLiveBusDelayedUseCase = this;
                    checkLiveBusDelayedUseCase.f = (Long) obj;
                    mutex = mutex2;
                }
                return coroutineSingletons;
            }
            mutex.e(null);
            return Unit.f17538a;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.e(null);
            throw th;
        }
    }
}
