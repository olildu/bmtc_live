package app.chalo.ondc.domain;

import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ondc.domain.GetOndcTicketUseCase", f = "GetOndcTicketUseCase.kt", l = {12}, m = "invoke", v = 1)
final class GetOndcTicketUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOndcTicketUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOndcTicketUseCase$invoke$1(GetOndcTicketUseCase getOndcTicketUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = getOndcTicketUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetOndcTicketUseCase$invoke$1 getOndcTicketUseCase$invoke$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        GetOndcTicketUseCase getOndcTicketUseCase = this.this$0;
        getOndcTicketUseCase.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            getOndcTicketUseCase$invoke$1 = this;
        } else {
            getOndcTicketUseCase$invoke$1 = new GetOndcTicketUseCase$invoke$1(getOndcTicketUseCase, this);
        }
        Object objK = getOndcTicketUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOndcTicketUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            OndcRepository ondcRepository = getOndcTicketUseCase.f6720a;
            getOndcTicketUseCase$invoke$1.label = 1;
            objK = ondcRepository.k(null, getOndcTicketUseCase$invoke$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        OndcTicketAppModel ondcTicketAppModel = (OndcTicketAppModel) objK;
        return ondcTicketAppModel != null ? new ChaloUseCaseResult.Success(ondcTicketAppModel) : new ChaloUseCaseResult.Failure(OndcTicketStatus.NOT_FOUND);
    }
}
