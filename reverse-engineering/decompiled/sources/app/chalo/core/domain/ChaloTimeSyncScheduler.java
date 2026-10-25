package app.chalo.core.domain;

import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/domain/ChaloTimeSyncScheduler;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeSyncScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f2148a;
    public final ApplicationBackgroundWorkersManager b;

    /* JADX INFO: renamed from: app.chalo.core.domain.ChaloTimeSyncScheduler$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.core.domain.ChaloTimeSyncScheduler$1", f = "ChaloTimeSyncScheduler.kt", l = {18}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChaloTimeSyncScheduler.this.new AnonymousClass1(continuation);
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
                StateFlow d = ChaloTimeSyncScheduler.this.f2148a.getD();
                final ChaloTimeSyncScheduler chaloTimeSyncScheduler = ChaloTimeSyncScheduler.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.core.domain.ChaloTimeSyncScheduler.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object objA;
                        return (((Boolean) obj2).booleanValue() && (objA = chaloTimeSyncScheduler.b.a(continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objA : Unit.f17538a;
                    }
                };
                this.label = 1;
                if (d.collect(flowCollector, this) == coroutineSingletons) {
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

    public ChaloTimeSyncScheduler(CityProvider cityProvider, ApplicationBackgroundWorkersManager applicationBackgroundWorkersManager, CoroutineContextProvider coroutineContextProvider) {
        this.f2148a = cityProvider;
        this.b = applicationBackgroundWorkersManager;
        BuildersKt.d(CoroutineScopeKt.a(coroutineContextProvider.b()), null, null, new AnonymousClass1(null), 3);
    }
}
