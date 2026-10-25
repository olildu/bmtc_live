package app.chalo.onboarding.languageconfig;

import app.chalo.features.chaloconfig.ChaloConfigStatus;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2", f = "OnboardingBackgroundOperationManagerImpl.kt", l = {104, 112}, m = "invokeSuspend", v = 1)
final class OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OnboardingBackgroundOperationManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2(OnboardingBackgroundOperationManagerImpl onboardingBackgroundOperationManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = onboardingBackgroundOperationManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2 onboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2 = new OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2(this.this$0, continuation);
        onboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2.L$0 = obj;
        return onboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                Deferred deferredB = BuildersKt.b(coroutineScope3, null, CoroutineStart.UNDISPATCHED, new OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$fetchStartedJob$1(this.this$0, null), 1);
                this.this$0.b.d();
                this.L$0 = coroutineScope3;
                this.label = 1;
                Object objQ = deferredB.q(this);
                if (objQ != coroutineSingletons) {
                    coroutineScope = coroutineScope3;
                    obj = objQ;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
            }
            ChaloConfigStatus chaloConfigStatus = (ChaloConfigStatus) obj;
            CoroutineScopeKt.d(coroutineScope2);
            String message = "terminal config status: " + chaloConfigStatus;
            Intrinsics.i(message, "message");
            this.this$0.d.setValue(new RemoteConfigRunState.Terminal(chaloConfigStatus.f2629a, chaloConfigStatus.b));
            return unit;
            if (((ChaloConfigStatus) obj) == null) {
                this.this$0.d.setValue(new RemoteConfigRunState.InfraFailure(new IllegalStateException("Remote config fetch did not start within timeout")));
                return unit;
            }
            StateFlow stateFlowB = this.this$0.b.b();
            OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1 onboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1 = new OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1(2, null);
            this.L$0 = coroutineScope;
            this.label = 2;
            obj = FlowKt.u(stateFlowB, onboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1, this);
            if (obj != coroutineSingletons) {
                coroutineScope2 = coroutineScope;
                ChaloConfigStatus chaloConfigStatus2 = (ChaloConfigStatus) obj;
                CoroutineScopeKt.d(coroutineScope2);
                String message2 = "terminal config status: " + chaloConfigStatus2;
                Intrinsics.i(message2, "message");
                this.this$0.d.setValue(new RemoteConfigRunState.Terminal(chaloConfigStatus2.f2629a, chaloConfigStatus2.b));
                return unit;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String message3 = "infra failure: " + th;
            Intrinsics.i(message3, "message");
            this.this$0.d.setValue(new RemoteConfigRunState.InfraFailure(th));
            return unit;
        }
    }
}
