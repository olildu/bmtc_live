package app.chalo.premiumbus.ui.faredetails;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate$onRecoveredCheckoutResult$4", f = "TicketPurchaseWithPassUpsellNudgeDelegate.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 1)
final class TicketPurchaseWithPassUpsellNudgeDelegate$onRecoveredCheckoutResult$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passId;
    int label;
    final /* synthetic */ TicketPurchaseWithPassUpsellNudgeDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketPurchaseWithPassUpsellNudgeDelegate$onRecoveredCheckoutResult$4(TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketPurchaseWithPassUpsellNudgeDelegate;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketPurchaseWithPassUpsellNudgeDelegate$onRecoveredCheckoutResult$4(this.this$0, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketPurchaseWithPassUpsellNudgeDelegate$onRecoveredCheckoutResult$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate = this.this$0;
            String str = this.$passId;
            this.label = 1;
            if (TicketPurchaseWithPassUpsellNudgeDelegate.i(ticketPurchaseWithPassUpsellNudgeDelegate, str, this) == coroutineSingletons) {
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
