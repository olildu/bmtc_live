package app.chalo.premiumbus.ui.faredetails;

import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/resultstatemanager/ResultStateData;", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3", f = "TicketPurchaseWithPassUpsellNudgeDelegate.kt", l = {520}, m = "invokeSuspend", v = 1)
final class TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3 extends SuspendLambda implements Function1<Continuation<? super ResultStateData<MinProfileUpdateResult>>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ TicketPurchaseWithPassUpsellNudgeDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3(TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ticketPurchaseWithPassUpsellNudgeDelegate;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate = this.this$0;
        Flow flowB = ticketPurchaseWithPassUpsellNudgeDelegate.i.b(this.$requestId);
        this.label = 1;
        Object objV = ticketPurchaseWithPassUpsellNudgeDelegate.f7558a.v(flowB, this);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
