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
@DebugMetadata(c = "app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent$handleRestoreFromProcessDeathIntent$2", f = "MTicketPassengerSelectionComponent.kt", l = {150}, m = "invokeSuspend", v = 1)
final class MTicketPassengerSelectionComponent$handleRestoreFromProcessDeathIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MTicketPassengerSelectionIntent.RestoreFromProcessDeathIntent $intent;
    int label;
    final /* synthetic */ MTicketPassengerSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketPassengerSelectionComponent$handleRestoreFromProcessDeathIntent$2(MTicketPassengerSelectionIntent.RestoreFromProcessDeathIntent restoreFromProcessDeathIntent, MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = restoreFromProcessDeathIntent;
        this.this$0 = mTicketPassengerSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketPassengerSelectionComponent$handleRestoreFromProcessDeathIntent$2(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketPassengerSelectionComponent$handleRestoreFromProcessDeathIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketPassengerSelectionRestoredState mTicketPassengerSelectionRestoredState = this.$intent.f5749a;
            MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = this.this$0;
            String str = mTicketPassengerSelectionRestoredState.f5755a;
            ProductBookingRouteDetails productBookingRouteDetails = mTicketPassengerSelectionRestoredState.b;
            ProductBookingStopDetails productBookingStopDetails = mTicketPassengerSelectionRestoredState.c;
            ProductBookingStopDetails productBookingStopDetails2 = mTicketPassengerSelectionRestoredState.d;
            Source source = mTicketPassengerSelectionRestoredState.e;
            MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer = mTicketPassengerSelectionRestoredState.f;
            this.label = 1;
            if (MTicketPassengerSelectionComponent.G0(mTicketPassengerSelectionComponent, str, productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2, source, mTicketPassengerSelectionContainer, this) == coroutineSingletons) {
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
