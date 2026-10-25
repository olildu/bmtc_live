package app.chalo.quickpay.ui.payforticket;

import app.chalo.domain.ProductNavigationSource;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.TicketPurchaseArgs;
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
@DebugMetadata(c = "app.chalo.quickpay.ui.payforticket.PayForTicketComponent$handleNavigateToMTicketBookingIntent$1", f = "PayForTicketComponent.kt", l = {170}, m = "invokeSuspend", v = 1)
final class PayForTicketComponent$handleNavigateToMTicketBookingIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PayForTicketComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayForTicketComponent$handleNavigateToMTicketBookingIntent$1(PayForTicketComponent payForTicketComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = payForTicketComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PayForTicketComponent$handleNavigateToMTicketBookingIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PayForTicketComponent$handleNavigateToMTicketBookingIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PayForTicketComponent$handleNavigateToMTicketBookingIntent$1 payForTicketComponent$handleNavigateToMTicketBookingIntent$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PayForTicketComponent payForTicketComponent = this.this$0;
            TicketPurchaseSceneResolverUseCase ticketPurchaseSceneResolverUseCase = payForTicketComponent.p;
            ProductNavigationSource productNavigationSource = ProductNavigationSource.PAY_FOR_TICKET_SCREEN;
            String str = ((PayForTicketViewState) payForTicketComponent.f.getValue()).d;
            String str2 = str.length() > 0 ? str : null;
            this.label = 1;
            payForTicketComponent$handleNavigateToMTicketBookingIntent$1 = this;
            obj = TicketPurchaseSceneResolverUseCase.a(ticketPurchaseSceneResolverUseCase, productNavigationSource, str2, null, payForTicketComponent$handleNavigateToMTicketBookingIntent$1, 4);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            payForTicketComponent$handleNavigateToMTicketBookingIntent$1 = this;
        }
        TicketPurchaseArgs ticketPurchaseArgs = (TicketPurchaseArgs) obj;
        if (ticketPurchaseArgs != null) {
            payForTicketComponent$handleNavigateToMTicketBookingIntent$1.this$0.o.b(new ChaloNavigationRequest.Navigate(ticketPurchaseArgs, null, null, 6));
        }
        return Unit.f17538a;
    }
}
