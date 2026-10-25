package app.chalo.onboarding.languageconfig;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2", f = "OnboardingBackgroundOperationManagerImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class OnboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2 extends SuspendLambda implements Function2<RemoteConfigRunState, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2 onboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2 = new OnboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2(2, continuation);
        onboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2.L$0 = obj;
        return onboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingBackgroundOperationManagerImpl$awaitRemoteConfigTerminalState$2) create((RemoteConfigRunState) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return Boolean.valueOf(!(((RemoteConfigRunState) this.L$0) instanceof RemoteConfigRunState.InProgress));
    }
}
