package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.appmodel.ChaloCardsInfoAppModel;
import app.chalo.ncmc.data.error.FetchLinkedChaloCardsInfoException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/FetchLinkedChaloCardInfoUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchLinkedChaloCardInfoUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6232a;
    public final CityProvider b;

    public FetchLinkedChaloCardInfoUseCase(INcmcCardRepository iNcmcCardRepository, CityProvider cityProvider) {
        this.f6232a = iNcmcCardRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        FetchLinkedChaloCardInfoUseCase$invoke$1 fetchLinkedChaloCardInfoUseCase$invoke$1;
        String lowerCase;
        if (continuationImpl instanceof FetchLinkedChaloCardInfoUseCase$invoke$1) {
            fetchLinkedChaloCardInfoUseCase$invoke$1 = (FetchLinkedChaloCardInfoUseCase$invoke$1) continuationImpl;
            int i = fetchLinkedChaloCardInfoUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchLinkedChaloCardInfoUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchLinkedChaloCardInfoUseCase$invoke$1 = new FetchLinkedChaloCardInfoUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchLinkedChaloCardInfoUseCase$invoke$1 = new FetchLinkedChaloCardInfoUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchLinkedChaloCardInfoUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchLinkedChaloCardInfoUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                INcmcCardRepository iNcmcCardRepository = this.f6232a;
                String strB = CityProviderKt.b(this.b);
                if (strB != null) {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "";
                }
                fetchLinkedChaloCardInfoUseCase$invoke$1.label = 1;
                objA = iNcmcCardRepository.a(lowerCase, fetchLinkedChaloCardInfoUseCase$invoke$1, z);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            return new ChaloUseCaseResult.Success((ChaloCardsInfoAppModel) objA);
        } catch (FetchLinkedChaloCardsInfoException e) {
            GenericChaloErrorResponse genericChaloErrorResponse = e.getGenericChaloErrorResponse();
            Integer num = genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null;
            if (num != null && num.intValue() == 7004) {
                return new ChaloUseCaseResult.Failure(FetchLinkedChaloCardFailureReason.NO_CARD_LINKED);
            }
            if (num != null && num.intValue() == 7007) {
                return new ChaloUseCaseResult.Failure(FetchLinkedChaloCardFailureReason.FETCH_NCMC_CARD_ERROR);
            }
            return (num != null && num.intValue() == 7008) ? new ChaloUseCaseResult.Failure(FetchLinkedChaloCardFailureReason.FETCH_NCMC_CARD_TIMEOUT_ERROR) : new ChaloUseCaseResult.Failure(FetchLinkedChaloCardFailureReason.API_CALL_FAILED);
        } catch (ChaloLocalException e2) {
            if ((e2 instanceof ChaloLocalException.NoInternetException) || (e2 instanceof ChaloLocalException.RequestCancelledException) || (e2 instanceof ChaloLocalException.ServerErrorException) || (e2 instanceof ChaloLocalException.SecureCallUnauthorizedAndRefreshTokenServerUnreachableException) || (e2 instanceof ChaloLocalException.NoUpdateInFetchedDataBasedOnEtagVersion) || (e2 instanceof ChaloLocalException.UnexpectedException)) {
                return new ChaloUseCaseResult.Failure(FetchLinkedChaloCardFailureReason.API_CALL_FAILED);
            }
            throw new NoWhenBranchMatchedException();
        } catch (NetworkSuccessResponseParseException unused) {
            return new ChaloUseCaseResult.Failure(FetchLinkedChaloCardFailureReason.API_CALL_FAILED);
        } catch (Exception unused2) {
            return new ChaloUseCaseResult.Failure(FetchLinkedChaloCardFailureReason.API_CALL_FAILED);
        }
    }
}
