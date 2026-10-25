package app.chalo.helper;

import app.chalo.behaviour.policy.ResolveWalletPolicyUseCase;
import app.chalo.behaviour.policy.WalletPolicy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.helper.ChaloAppFeatureHelperImpl", f = "ChaloAppFeatureHelperImpl.kt", l = {65}, m = "shouldShowYesBankBranding", v = 1)
final class ChaloAppFeatureHelperImpl$shouldShowYesBankBranding$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloAppFeatureHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloAppFeatureHelperImpl$shouldShowYesBankBranding$1(ChaloAppFeatureHelperImpl chaloAppFeatureHelperImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = chaloAppFeatureHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloAppFeatureHelperImpl$shouldShowYesBankBranding$1 chaloAppFeatureHelperImpl$shouldShowYesBankBranding$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ChaloAppFeatureHelperImpl chaloAppFeatureHelperImpl = this.this$0;
        chaloAppFeatureHelperImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            chaloAppFeatureHelperImpl$shouldShowYesBankBranding$1 = this;
        } else {
            chaloAppFeatureHelperImpl$shouldShowYesBankBranding$1 = new ChaloAppFeatureHelperImpl$shouldShowYesBankBranding$1(chaloAppFeatureHelperImpl, this);
        }
        Object objA = chaloAppFeatureHelperImpl$shouldShowYesBankBranding$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloAppFeatureHelperImpl$shouldShowYesBankBranding$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ResolveWalletPolicyUseCase resolveWalletPolicyUseCase = chaloAppFeatureHelperImpl.d;
            chaloAppFeatureHelperImpl$shouldShowYesBankBranding$1.label = 1;
            objA = resolveWalletPolicyUseCase.a(chaloAppFeatureHelperImpl$shouldShowYesBankBranding$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((WalletPolicy) objA).f1089a);
    }
}
