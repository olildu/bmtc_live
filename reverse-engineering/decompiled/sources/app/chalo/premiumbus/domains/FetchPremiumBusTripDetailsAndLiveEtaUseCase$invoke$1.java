package app.chalo.premiumbus.domains;

import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/premiumbus/data/models/app/PremiumBusTripPollingResponseAppModel;", "Lapp/chalo/premiumbus/domains/PremiumBusTripDetailsError;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.domains.FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1", f = "FetchPremiumBusTripDetailsAndLiveEtaUseCase.kt", l = {61}, m = "invokeSuspend", v = 1)
final class FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1 extends SuspendLambda implements Function3<FlowCollector<? super ChaloUseCaseResult<PremiumBusTripPollingResponseAppModel, PremiumBusTripDetailsError>>, ChaloUseCaseResult<PremiumBusTripPollingResponseAppModel, PremiumBusTripDetailsError>, Continuation<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1 fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1 = new FetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1(3, (Continuation) obj3);
        fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1.L$0 = (FlowCollector) obj;
        fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1.L$1 = (ChaloUseCaseResult) obj2;
        return fetchPremiumBusTripDetailsAndLiveEtaUseCase$invoke$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloUseCaseResult chaloUseCaseResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) this.L$1;
            this.L$0 = chaloUseCaseResult2;
            this.label = 1;
            if (flowCollector.emit(chaloUseCaseResult2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloUseCaseResult = chaloUseCaseResult2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUseCaseResult = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel = (PremiumBusTripPollingResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            PremiumReserveTicketStatus premiumReserveTicketStatus = premiumBusTripPollingResponseAppModel.b;
            if (premiumReserveTicketStatus == PremiumReserveTicketStatus.SYSTEM_CANCELLED || premiumReserveTicketStatus == PremiumReserveTicketStatus.SYSTEM_RESCHEDULED || premiumBusTripPollingResponseAppModel.e == PremiumBusTripStatus.COMPLETED) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
