package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.appmodel.EligibleCardResponseAppModel;
import app.chalo.ncmc.data.error.FetchEligibleCardsException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/FetchEligibleCardsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchEligibleCardsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6231a;
    public final CityProvider b;

    public FetchEligibleCardsUseCase(INcmcCardRepository iNcmcCardRepository, CityProvider cityProvider) {
        this.f6231a = iNcmcCardRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchEligibleCardsUseCase$invoke$1 fetchEligibleCardsUseCase$invoke$1;
        if (continuationImpl instanceof FetchEligibleCardsUseCase$invoke$1) {
            fetchEligibleCardsUseCase$invoke$1 = (FetchEligibleCardsUseCase$invoke$1) continuationImpl;
            int i = fetchEligibleCardsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchEligibleCardsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchEligibleCardsUseCase$invoke$1 = new FetchEligibleCardsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchEligibleCardsUseCase$invoke$1 = new FetchEligibleCardsUseCase$invoke$1(this, continuationImpl);
        }
        Object objD = fetchEligibleCardsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchEligibleCardsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objD);
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(FetchEligibleCardsFailureReason.CITY_NOT_AVAILABLE);
                }
                INcmcCardRepository iNcmcCardRepository = this.f6231a;
                fetchEligibleCardsUseCase$invoke$1.label = 1;
                objD = iNcmcCardRepository.d(strB, fetchEligibleCardsUseCase$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objD);
            }
            String str = ((EligibleCardResponseAppModel) objD).f6146a;
            if (str != null && str.length() != 0) {
                return new ChaloUseCaseResult.Success(str);
            }
            return new ChaloUseCaseResult.Failure(FetchEligibleCardsFailureReason.CARD_NOT_FOUND);
        } catch (Exception e) {
            if (!(e instanceof FetchEligibleCardsException)) {
                return new ChaloUseCaseResult.Failure(FetchEligibleCardsFailureReason.API_CALL_FAILED);
            }
            GenericChaloErrorResponse genericChaloErrorResponse = ((FetchEligibleCardsException) e).getGenericChaloErrorResponse();
            Integer num = genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null;
            if (num != null && num.intValue() == 7006) {
                return new ChaloUseCaseResult.Failure(FetchEligibleCardsFailureReason.FETCH_RECHARGED_CARDS_ERROR);
            }
            if (num != null && num.intValue() == 3003) {
                return new ChaloUseCaseResult.Failure(FetchEligibleCardsFailureReason.CARD_NOT_FOUND);
            }
            return (num != null && num.intValue() == 7002) ? new ChaloUseCaseResult.Failure(FetchEligibleCardsFailureReason.CARD_ALREADY_MAPPED) : new ChaloUseCaseResult.Failure(FetchEligibleCardsFailureReason.API_CALL_FAILED);
        }
    }
}
