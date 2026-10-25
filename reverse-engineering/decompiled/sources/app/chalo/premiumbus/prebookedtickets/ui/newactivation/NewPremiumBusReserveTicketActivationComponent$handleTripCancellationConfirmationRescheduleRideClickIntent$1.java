package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationRescheduleRideClickIntent$1", f = "NewPremiumBusReserveTicketActivationComponent.kt", l = {694}, m = "invokeSuspend", v = 1)
final class NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationRescheduleRideClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationRescheduleRideClickIntent $intent;
    int label;
    final /* synthetic */ NewPremiumBusReserveTicketActivationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationRescheduleRideClickIntent$1(NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent, NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationRescheduleRideClickIntent tripCancellationConfirmationRescheduleRideClickIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = newPremiumBusReserveTicketActivationComponent;
        this.$intent = tripCancellationConfirmationRescheduleRideClickIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationRescheduleRideClickIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationRescheduleRideClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModelS = this.this$0.m.s();
            if (premiumBusProductOptionsAppModelS != null) {
                PremiumReserveTicketPostBookingActionHandler premiumReserveTicketPostBookingActionHandler = this.this$0.m;
                boolean z = premiumBusProductOptionsAppModelS.e;
                List list = this.$intent.b;
                this.label = 1;
                if (premiumReserveTicketPostBookingActionHandler.q(premiumBusProductOptionsAppModelS, z, list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                PremiumReserveTicketPostBookingActionHandler premiumReserveTicketPostBookingActionHandler2 = this.this$0.m;
                NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationRescheduleRideClickIntent tripCancellationConfirmationRescheduleRideClickIntent = this.$intent;
                premiumReserveTicketPostBookingActionHandler2.d(tripCancellationConfirmationRescheduleRideClickIntent.f7394a, tripCancellationConfirmationRescheduleRideClickIntent.b.size());
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
