package app.chalo.mticket.ui.passengerselection;

import app.chalo.constants.Source;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
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
@DebugMetadata(c = "app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent$handleInitialisationIntent$2", f = "MTicketPassengerSelectionComponent.kt", l = {133}, m = "invokeSuspend", v = 1)
final class MTicketPassengerSelectionComponent$handleInitialisationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MTicketPassengerSelectionIntent.InitialisationIntent $intent;
    int label;
    final /* synthetic */ MTicketPassengerSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketPassengerSelectionComponent$handleInitialisationIntent$2(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, MTicketPassengerSelectionIntent.InitialisationIntent initialisationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketPassengerSelectionComponent;
        this.$intent = initialisationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketPassengerSelectionComponent$handleInitialisationIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketPassengerSelectionComponent$handleInitialisationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = this.this$0;
            MTicketPassengerSelectionIntent.InitialisationIntent initialisationIntent = this.$intent;
            String str = initialisationIntent.d;
            ProductBookingRouteDetails productBookingRouteDetails = initialisationIntent.f5747a;
            ProductBookingStopDetails productBookingStopDetails = initialisationIntent.b;
            ProductBookingStopDetails productBookingStopDetails2 = initialisationIntent.c;
            Source source = initialisationIntent.e;
            this.label = 1;
            if (MTicketPassengerSelectionComponent.G0(mTicketPassengerSelectionComponent, str, productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2, source, null, this) == coroutineSingletons) {
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
