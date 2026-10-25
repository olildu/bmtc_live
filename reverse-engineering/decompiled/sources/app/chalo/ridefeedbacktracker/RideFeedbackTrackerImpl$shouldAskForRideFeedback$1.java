package app.chalo.ridefeedbacktracker;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridefeedbacktracker.RideFeedbackTrackerImpl", f = "RideFeedbackTrackerImpl.kt", l = {24}, m = "shouldAskForRideFeedback", v = 1)
final class RideFeedbackTrackerImpl$shouldAskForRideFeedback$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RideFeedbackTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideFeedbackTrackerImpl$shouldAskForRideFeedback$1(RideFeedbackTrackerImpl rideFeedbackTrackerImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = rideFeedbackTrackerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RideFeedbackTrackerImpl$shouldAskForRideFeedback$1 rideFeedbackTrackerImpl$shouldAskForRideFeedback$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RideFeedbackTrackerImpl rideFeedbackTrackerImpl = this.this$0;
        rideFeedbackTrackerImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            rideFeedbackTrackerImpl$shouldAskForRideFeedback$1 = this;
        } else {
            rideFeedbackTrackerImpl$shouldAskForRideFeedback$1 = new RideFeedbackTrackerImpl$shouldAskForRideFeedback$1(rideFeedbackTrackerImpl, this);
        }
        Object obj2 = rideFeedbackTrackerImpl$shouldAskForRideFeedback$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackTrackerImpl$shouldAskForRideFeedback$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        return Boolean.valueOf(((String) obj2) == null);
    }
}
