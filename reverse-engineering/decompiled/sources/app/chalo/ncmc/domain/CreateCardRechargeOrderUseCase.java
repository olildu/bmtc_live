package app.chalo.ncmc.domain;

import app.chalo.models.CardRechargeConfiguration;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardsInfoAppModelKt;
import app.chalo.ncmc.data.error.CardRechargeOrderCreationFailed;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/CreateCardRechargeOrderUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateCardRechargeOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6225a;

    public CreateCardRechargeOrderUseCase(INcmcCardRepository iNcmcCardRepository) {
        this.f6225a = iNcmcCardRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, long j, CardRechargeConfiguration cardRechargeConfiguration, ChaloCardDetails chaloCardDetails, ContinuationImpl continuationImpl) {
        CreateCardRechargeOrderUseCase$invoke$1 createCardRechargeOrderUseCase$invoke$1;
        if (continuationImpl instanceof CreateCardRechargeOrderUseCase$invoke$1) {
            createCardRechargeOrderUseCase$invoke$1 = (CreateCardRechargeOrderUseCase$invoke$1) continuationImpl;
            int i = createCardRechargeOrderUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createCardRechargeOrderUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createCardRechargeOrderUseCase$invoke$1 = new CreateCardRechargeOrderUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createCardRechargeOrderUseCase$invoke$1 = new CreateCardRechargeOrderUseCase$invoke$1(this, continuationImpl);
        }
        CreateCardRechargeOrderUseCase$invoke$1 createCardRechargeOrderUseCase$invoke$2 = createCardRechargeOrderUseCase$invoke$1;
        Object objL = createCardRechargeOrderUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createCardRechargeOrderUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objL);
                INcmcCardRepository iNcmcCardRepository = this.f6225a;
                String strB = chaloCardDetails != null ? ChaloCardsInfoAppModelKt.b(chaloCardDetails) : null;
                createCardRechargeOrderUseCase$invoke$2.label = 1;
                objL = iNcmcCardRepository.l(str, j, cardRechargeConfiguration, strB, createCardRechargeOrderUseCase$invoke$2);
                if (objL == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objL);
            }
            return new ChaloUseCaseResult.Success((CreateOrderResponseAppModel) objL);
        } catch (CardRechargeOrderCreationFailed e) {
            return new ChaloUseCaseResult.Failure(new CardRechargeOrderCreationError.OrderCreationFailed(String.valueOf(e.getMessage())));
        } catch (ChaloLocalException e2) {
            return new ChaloUseCaseResult.Failure(new CardRechargeOrderCreationError.LocalError(String.valueOf(e2.getMessage())));
        } catch (Exception e3) {
            return new ChaloUseCaseResult.Failure(new CardRechargeOrderCreationError.GenericError(String.valueOf(e3.getMessage())));
        }
    }
}
