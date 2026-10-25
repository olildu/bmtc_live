package app.chalo.superpass.data.features;

import app.chalo.models.mticketing.MTicket;
import app.chalo.superpass.data.models.entities.ProductActivationDetails;
import app.chalo.superpass.data.repository.DigitalTripReceiptRepository;
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
@DebugMetadata(c = "app.chalo.superpass.data.features.DigitalTripReceiptFeature$sendMTicketActivationTimeStampToBackend$1", f = "DigitalTripReceiptFeature.kt", l = {105}, m = "invokeSuspend", v = 1)
final class DigitalTripReceiptFeature$sendMTicketActivationTimeStampToBackend$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MTicket $lMTicket;
    final /* synthetic */ long $lTimeStamp;
    int label;
    final /* synthetic */ DigitalTripReceiptFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalTripReceiptFeature$sendMTicketActivationTimeStampToBackend$1(DigitalTripReceiptFeature digitalTripReceiptFeature, MTicket mTicket, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = digitalTripReceiptFeature;
        this.$lMTicket = mTicket;
        this.$lTimeStamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigitalTripReceiptFeature$sendMTicketActivationTimeStampToBackend$1(this.this$0, this.$lMTicket, this.$lTimeStamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DigitalTripReceiptFeature$sendMTicketActivationTimeStampToBackend$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            DigitalTripReceiptFeature digitalTripReceiptFeature = this.this$0;
            MTicket mTicket = this.$lMTicket;
            long j = this.$lTimeStamp;
            digitalTripReceiptFeature.getClass();
            ProductActivationDetails productActivationDetails = new ProductActivationDetails(j, mTicket.f5615a, mTicket.j, "singleJourneyTicket", "singleJourneyTicket", mTicket.d, mTicket.e);
            DigitalTripReceiptRepository digitalTripReceiptRepository = this.this$0.b;
            this.label = 1;
            if (digitalTripReceiptRepository.d(productActivationDetails, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.this$0.a();
        return Unit.f17538a;
    }
}
