package app.chalo.quickpay.validation.manager;

import app.chalo.analytics.contract.AnalyticsContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.validation.manager.QuickPayTicketAnalyticsManagerValidation", f = "QuickPayTicketAnalyticsManagerValidation.kt", l = {287}, m = "raiseTITOTapinPollingStoppedDueToNotification", v = 1)
final class QuickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuickPayTicketAnalyticsManagerValidation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1(QuickPayTicketAnalyticsManagerValidation quickPayTicketAnalyticsManagerValidation, Continuation continuation) {
        super(continuation);
        this.this$0 = quickPayTicketAnalyticsManagerValidation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1 quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        QuickPayTicketAnalyticsManagerValidation quickPayTicketAnalyticsManagerValidation = this.this$0;
        quickPayTicketAnalyticsManagerValidation.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1 = this;
        } else {
            quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1 = new QuickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1(quickPayTicketAnalyticsManagerValidation, this);
        }
        Object obj2 = quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1.L$3;
        String str2 = (String) quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1.L$2;
        AnalyticsContract analyticsContract = (AnalyticsContract) quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1.L$1;
        Map map = (Map) quickPayTicketAnalyticsManagerValidation$raiseTITOTapinPollingStoppedDueToNotification$1.L$0;
        ResultKt.b(obj2);
        AnalyticsContract.DefaultImpls.a(analyticsContract, str2, str, map, null, false, 24);
        return Unit.f17538a;
    }
}
