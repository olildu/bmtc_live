package app.chalo.tripreceipt.tripreceiptnew;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.tripreceipt.domain.FetchSuperPassBookingFromPassIdUseCase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$handleInitializationIntent$3", f = "RideReceiptComponent.kt", l = {227}, m = "invokeSuspend", v = 1)
final class RideReceiptComponent$handleInitializationIntent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RideReceiptIntent.InitializationIntent $intent;
    int label;
    final /* synthetic */ RideReceiptComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideReceiptComponent$handleInitializationIntent$3(RideReceiptComponent rideReceiptComponent, RideReceiptIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rideReceiptComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideReceiptComponent$handleInitializationIntent$3(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RideReceiptComponent$handleInitializationIntent$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchSuperPassBookingFromPassIdUseCase fetchSuperPassBookingFromPassIdUseCase = this.this$0.n;
            String str = this.$intent.f9741a;
            this.label = 1;
            obj = fetchSuperPassBookingFromPassIdUseCase.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUserBookingType.SuperPassBooking superPassBooking = (ChaloUserBookingType.SuperPassBooking) obj;
        if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            this.this$0.u.e(((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) superPassBooking).d);
        } else if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
            this.this$0.u.e(((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) superPassBooking).d);
        } else if (!(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) && superPassBooking != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
    }
}
