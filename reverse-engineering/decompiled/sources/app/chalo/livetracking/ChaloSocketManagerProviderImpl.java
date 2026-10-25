package app.chalo.livetracking;

import app.chalo.livetracking.frameworklivetracking.ChaloSocketManagerProvider;
import app.chalo.livetracking.frameworklivetracking.RealTimeSocketManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ChaloSocketManagerProviderImpl;", "Lapp/chalo/livetracking/frameworklivetracking/ChaloSocketManagerProvider;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloSocketManagerProviderImpl implements ChaloSocketManagerProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4173a;
    public final RealTimeSocketManager b;

    /* JADX INFO: renamed from: app.chalo.livetracking.ChaloSocketManagerProviderImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.ChaloSocketManagerProviderImpl$1", f = "ChaloSocketManagerProviderImpl.kt", l = {24}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChaloSocketManagerProviderImpl.this.new AnonymousClass1(continuation);
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
                Flow flowM = FlowKt.m(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ChaloSocketManagerProviderImpl.this.f4173a.getE()));
                final ChaloSocketManagerProviderImpl chaloSocketManagerProviderImpl = ChaloSocketManagerProviderImpl.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.ChaloSocketManagerProviderImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        chaloSocketManagerProviderImpl.b.b((CityAppModel) obj2);
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowM.collect(flowCollector, this) == coroutineSingletons) {
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

    public ChaloSocketManagerProviderImpl(CoroutineContextProvider coroutineContextProvider, RealTimeSocketManager realTimeSocketManager, CityProvider cityProvider) {
        this.f4173a = cityProvider;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.b = realTimeSocketManager;
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
    }

    @Override // app.chalo.livetracking.frameworklivetracking.ChaloSocketManagerProvider
    /* JADX INFO: renamed from: a, reason: from getter */
    public final RealTimeSocketManager getB() {
        return this.b;
    }
}
