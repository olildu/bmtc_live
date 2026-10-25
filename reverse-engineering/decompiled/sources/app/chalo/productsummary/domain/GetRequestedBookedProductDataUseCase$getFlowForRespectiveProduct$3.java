package app.chalo.productsummary.domain;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketEntityKt;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketChildEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "Lapp/chalo/home/domain/ChaloUserBookingType$TicketBooking$InstantTicketBooking;", "instantTicketEntity", "Lapp/chalo/instantticket/data/model/InstantTicketEntity;", "childRef", "Lapp/chalo/multimodalticket/data/model/MultiModalGroupTicketChildEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase$getFlowForRespectiveProduct$3", f = "GetRequestedBookedProductDataUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class GetRequestedBookedProductDataUseCase$getFlowForRespectiveProduct$3 extends SuspendLambda implements Function3<InstantTicketEntity, MultiModalGroupTicketChildEntity, Continuation<? super ChaloUserBookingType.TicketBooking.InstantTicketBooking>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetRequestedBookedProductDataUseCase$getFlowForRespectiveProduct$3 getRequestedBookedProductDataUseCase$getFlowForRespectiveProduct$3 = new GetRequestedBookedProductDataUseCase$getFlowForRespectiveProduct$3(3, (Continuation) obj3);
        getRequestedBookedProductDataUseCase$getFlowForRespectiveProduct$3.L$0 = (InstantTicketEntity) obj;
        getRequestedBookedProductDataUseCase$getFlowForRespectiveProduct$3.L$1 = (MultiModalGroupTicketChildEntity) obj2;
        return getRequestedBookedProductDataUseCase$getFlowForRespectiveProduct$3.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        InstantTicketEntity instantTicketEntity = (InstantTicketEntity) this.L$0;
        MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity = (MultiModalGroupTicketChildEntity) this.L$1;
        if (instantTicketEntity != null) {
            return new ChaloUserBookingType.TicketBooking.InstantTicketBooking(InstantTicketEntityKt.a(instantTicketEntity), multiModalGroupTicketChildEntity != null ? multiModalGroupTicketChildEntity.f5791a : null);
        }
        return null;
    }
}
