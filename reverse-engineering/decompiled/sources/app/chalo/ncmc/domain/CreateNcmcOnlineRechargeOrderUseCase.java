package app.chalo.ncmc.domain;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.ncmc.data.error.NcmcOnlineRechargePaymentOrderCreationException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/CreateNcmcOnlineRechargeOrderUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateNcmcOnlineRechargeOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6226a;

    public CreateNcmcOnlineRechargeOrderUseCase(INcmcCardRepository iNcmcCardRepository) {
        this.f6226a = iNcmcCardRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        CreateNcmcOnlineRechargeOrderUseCase$invoke$1 createNcmcOnlineRechargeOrderUseCase$invoke$1;
        if (continuationImpl instanceof CreateNcmcOnlineRechargeOrderUseCase$invoke$1) {
            createNcmcOnlineRechargeOrderUseCase$invoke$1 = (CreateNcmcOnlineRechargeOrderUseCase$invoke$1) continuationImpl;
            int i = createNcmcOnlineRechargeOrderUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createNcmcOnlineRechargeOrderUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createNcmcOnlineRechargeOrderUseCase$invoke$1 = new CreateNcmcOnlineRechargeOrderUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createNcmcOnlineRechargeOrderUseCase$invoke$1 = new CreateNcmcOnlineRechargeOrderUseCase$invoke$1(this, continuationImpl);
        }
        CreateNcmcOnlineRechargeOrderUseCase$invoke$1 createNcmcOnlineRechargeOrderUseCase$invoke$2 = createNcmcOnlineRechargeOrderUseCase$invoke$1;
        Object objK = createNcmcOnlineRechargeOrderUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createNcmcOnlineRechargeOrderUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objK);
                INcmcCardRepository iNcmcCardRepository = this.f6226a;
                createNcmcOnlineRechargeOrderUseCase$invoke$2.label = 1;
                objK = iNcmcCardRepository.k(j, str, str2, str3, createNcmcOnlineRechargeOrderUseCase$invoke$2);
                if (objK == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objK);
            }
            return new ChaloUseCaseResult.Success((CreateOrderResponseAppModel) objK);
        } catch (NcmcOnlineRechargePaymentOrderCreationException e) {
            GenericChaloErrorResponse errorResponse = e.getErrorResponse();
            return new ChaloUseCaseResult.Failure(new NcmcCreateOnlineOrderFailureDetails(errorResponse != null ? errorResponse.b : null, NcmcCreateOnlineOrderFailure.SERVER_ERROR));
        } catch (Exception e2) {
            return new ChaloUseCaseResult.Failure(new NcmcCreateOnlineOrderFailureDetails(String.valueOf(e2.getMessage()), NcmcCreateOnlineOrderFailure.UNKNOWN_ERROR));
        }
    }
}
