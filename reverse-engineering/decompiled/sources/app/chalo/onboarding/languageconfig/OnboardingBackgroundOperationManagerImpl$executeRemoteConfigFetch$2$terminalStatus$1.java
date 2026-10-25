package app.chalo.onboarding.languageconfig;

import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import app.chalo.features.chaloconfig.ChaloConfigStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/features/chaloconfig/ChaloConfigStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1", f = "OnboardingBackgroundOperationManagerImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1 extends SuspendLambda implements Function2<ChaloConfigStatus, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1 onboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1 = new OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1(2, continuation);
        onboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1.L$0 = obj;
        return onboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingBackgroundOperationManagerImpl$executeRemoteConfigFetch$2$terminalStatus$1) create((ChaloConfigStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ChaloConfigStatus chaloConfigStatus = (ChaloConfigStatus) this.L$0;
        Intrinsics.i(chaloConfigStatus, "<this>");
        ChaloConfigFetchStatus chaloConfigFetchStatus = chaloConfigStatus.b;
        int i = ChaloConfigStatus.WhenMappings.f2630a[chaloConfigStatus.f2629a.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (chaloConfigFetchStatus != ChaloConfigFetchStatus.FETCHING_NOT_STARTED && chaloConfigFetchStatus != ChaloConfigFetchStatus.FETCH_SUCCESSFUL) {
                    if (chaloConfigFetchStatus != ChaloConfigFetchStatus.FETCH_SUCCESSFUL || chaloConfigFetchStatus == ChaloConfigFetchStatus.FETCH_FAILED) {
                        z = true;
                    }
                }
            } else if (chaloConfigFetchStatus != ChaloConfigFetchStatus.FETCHING_NOT_STARTED) {
                if (chaloConfigFetchStatus != ChaloConfigFetchStatus.FETCH_SUCCESSFUL) {
                    z = true;
                } else {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
