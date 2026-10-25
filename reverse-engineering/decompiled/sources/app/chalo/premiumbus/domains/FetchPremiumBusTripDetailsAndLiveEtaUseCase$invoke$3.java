package app.chalo.premiumbus.domains;

import app.chalo.contract.ProductsSyncContract;
import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/premiumbus/data/models/app/PremiumBusTripPollingResponseAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3", f = "FetchPremiumBusTripDetailsAndLiveEtaUseCase.kt", l = {76}, m = "invokeSuspend", v = 1)
final class FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3 extends SuspendLambda implements Function2<PremiumBusTripPollingResponseAppModel, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FetchPremiumBusTripDetailsAndLiveEtaUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3(FetchPremiumBusTripDetailsAndLiveEtaUseCase fetchPremiumBusTripDetailsAndLiveEtaUseCase, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fetchPremiumBusTripDetailsAndLiveEtaUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3 fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3 = new FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3(this.this$0, continuation);
        fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3.L$0 = obj;
        return fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$3) create((PremiumBusTripPollingResponseAppModel) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumReserveTicketStatus premiumReserveTicketStatus = ((PremiumBusTripPollingResponseAppModel) this.L$0).b;
            if (premiumReserveTicketStatus == PremiumReserveTicketStatus.SYSTEM_CANCELLED || premiumReserveTicketStatus == PremiumReserveTicketStatus.SYSTEM_RESCHEDULED) {
                ProductsSyncContract productsSyncContract = this.this$0.c;
                this.label = 1;
                if (productsSyncContract.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
