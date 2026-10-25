package app.chalo.premiumbus;

import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.domains.PremiumBusTripDetailsError;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/premiumbus/data/models/app/PremiumBusTripPollingResponseAppModel;", "Lapp/chalo/premiumbus/domains/PremiumBusTripDetailsError;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$2", f = "PremiumBusTripDetailsPollingHelper.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$2 extends SuspendLambda implements Function3<FlowCollector<? super ChaloUseCaseResult<PremiumBusTripPollingResponseAppModel, PremiumBusTripDetailsError>>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    int label;
    final /* synthetic */ PremiumBusTripDetailsPollingHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$2(PremiumBusTripDetailsPollingHelper premiumBusTripDetailsPollingHelper, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = premiumBusTripDetailsPollingHelper;
        this.$bookingId = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$2 premiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$2 = new PremiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$2(this.this$0, this.$bookingId, (Continuation) obj3);
        Unit unit = Unit.f17538a;
        premiumBusTripDetailsPollingHelper$getPollingDetailsFlowByBookingId$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.f6863a.g(this.$bookingId);
        return Unit.f17538a;
    }
}
