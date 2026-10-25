package app.chalo.premiumbus.ui.faredetails;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate", f = "TicketPurchaseWithPassUpsellNudgeDelegate.kt", l = {563}, m = "emitError", v = 1)
final class TicketPurchaseWithPassUpsellNudgeDelegate$emitError$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TicketPurchaseWithPassUpsellNudgeDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketPurchaseWithPassUpsellNudgeDelegate$emitError$1(TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ticketPurchaseWithPassUpsellNudgeDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TicketPurchaseWithPassUpsellNudgeDelegate.h(this.this$0, false, this);
    }
}
