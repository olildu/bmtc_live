package app.chalo.quickpay.validation.manager;

import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.validation.manager.QuickPayValidationData", f = "QuickPayValidationData.kt", l = {160}, m = "getToneString", v = 1)
final class QuickPayValidationData$getToneString$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuickPayValidationData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayValidationData$getToneString$1(QuickPayValidationData quickPayValidationData, Continuation continuation) {
        super(continuation);
        this.this$0 = quickPayValidationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuickPayValidationData$getToneString$1 quickPayValidationData$getToneString$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        QuickPayValidationData quickPayValidationData = this.this$0;
        quickPayValidationData.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            quickPayValidationData$getToneString$1 = this;
        } else {
            quickPayValidationData$getToneString$1 = new QuickPayValidationData$getToneString$1(quickPayValidationData, this);
        }
        Object objH = quickPayValidationData$getToneString$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayValidationData$getToneString$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            quickPayValidationData$getToneString$1.label = 1;
            objH = quickPayValidationData.H(quickPayValidationData$getToneString$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objH;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return (String) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        }
        if ((chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) || chaloUseCaseResult == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
