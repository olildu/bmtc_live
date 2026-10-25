package app.chalo.scenes;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.login.LoginAuthNavigationGuard;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/scenes/ChaloNavigationManagerImpl;", "Lapp/chalo/scenes/ChaloNavigationManager;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloNavigationManagerImpl implements ChaloNavigationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloBuildConfig f9212a;
    public final LoginAuthNavigationGuard b;
    public final SharedFlowImpl c;
    public final SharedFlow d;
    public final ContextScope e;

    /* JADX INFO: renamed from: app.chalo.scenes.ChaloNavigationManagerImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.scenes.ChaloNavigationManagerImpl$1", f = "ChaloNavigationManager.kt", l = {86}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.scenes.ChaloNavigationManagerImpl$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final /* synthetic */ class C01431 implements FlowCollector, FunctionAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MutableSharedFlow f9213a;

            public C01431(SharedFlowImpl sharedFlowImpl) {
                this.f9213a = sharedFlowImpl;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit = this.f9213a.emit((ChaloNavigationRequest) obj, continuation);
                return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : Unit.f17538a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return getFunctionDelegate().equals(((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.f9213a, MutableSharedFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChaloNavigationManagerImpl.this.new AnonymousClass1(continuation);
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
                Flow flowB = ChaloNavigationManagerImpl.this.b.b();
                C01431 c01431 = new C01431(ChaloNavigationManagerImpl.this.c);
                this.label = 1;
                if (flowB.collect(c01431, this) == coroutineSingletons) {
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/ChaloNavigationManagerImpl$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ChaloNavigationManagerImpl(CoroutineContextProvider coroutineContextProvider, ChaloBuildConfig chaloBuildConfig, LoginAuthNavigationGuard loginAuthNavigationGuard) {
        this.f9212a = chaloBuildConfig;
        this.b = loginAuthNavigationGuard;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 7);
        this.c = sharedFlowImplB;
        this.d = FlowKt.b(sharedFlowImplB);
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.a());
        this.e = contextScopeA;
        BuildersKt.d(contextScopeA, null, null, new AnonymousClass1(null), 3);
    }

    @Override // app.chalo.scenes.ChaloNavigationManager
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SharedFlow getD() {
        return this.d;
    }

    @Override // app.chalo.scenes.ChaloNavigationManager
    public final void b(ChaloNavigationRequest chaloNavigationRequest) {
        BuildersKt.d(this.e, null, null, new ChaloNavigationManagerImpl$postNavigationRequest$1(this, chaloNavigationRequest, null), 3);
    }
}
