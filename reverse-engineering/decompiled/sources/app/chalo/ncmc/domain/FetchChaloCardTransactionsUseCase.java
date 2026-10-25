package app.chalo.ncmc.domain;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.ncmc.data.CardOptions;
import app.chalo.ncmc.data.error.FetchChaloCardTransactionsFailedException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.w1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/FetchChaloCardTransactionsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchChaloCardTransactionsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6230a;
    public final CityProvider b;
    public final GetChaloCardExpOptionsUseCase c;

    public FetchChaloCardTransactionsUseCase(INcmcCardRepository iNcmcCardRepository, CityProvider cityProvider, GetChaloCardExpOptionsUseCase getChaloCardExpOptionsUseCase) {
        this.f6230a = iNcmcCardRepository;
        this.b = cityProvider;
        this.c = getChaloCardExpOptionsUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FetchChaloCardTransactionsUseCase$invoke$1 fetchChaloCardTransactionsUseCase$invoke$1;
        String str4;
        String str5;
        String str6;
        if (continuationImpl instanceof FetchChaloCardTransactionsUseCase$invoke$1) {
            fetchChaloCardTransactionsUseCase$invoke$1 = (FetchChaloCardTransactionsUseCase$invoke$1) continuationImpl;
            int i = fetchChaloCardTransactionsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchChaloCardTransactionsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchChaloCardTransactionsUseCase$invoke$1 = new FetchChaloCardTransactionsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchChaloCardTransactionsUseCase$invoke$1 = new FetchChaloCardTransactionsUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchChaloCardTransactionsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchChaloCardTransactionsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                GetChaloCardExpOptionsUseCase getChaloCardExpOptionsUseCase = this.c;
                fetchChaloCardTransactionsUseCase$invoke$1.L$0 = str;
                fetchChaloCardTransactionsUseCase$invoke$1.L$1 = str2;
                fetchChaloCardTransactionsUseCase$invoke$1.L$2 = str3;
                fetchChaloCardTransactionsUseCase$invoke$1.label = 1;
                objA = getChaloCardExpOptionsUseCase.a(fetchChaloCardTransactionsUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str4 = str;
                str5 = str2;
                str6 = str3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str7 = (String) fetchChaloCardTransactionsUseCase$invoke$1.L$2;
                str5 = (String) fetchChaloCardTransactionsUseCase$invoke$1.L$1;
                str4 = (String) fetchChaloCardTransactionsUseCase$invoke$1.L$0;
                ResultKt.b(objA);
                str6 = str7;
            }
            CardOptions cardOptions = (CardOptions) objA;
            int i3 = cardOptions != null ? cardOptions.c : 10;
            String strB = CityProviderKt.b(this.b);
            if (strB == null) {
                FetchChaloCardTransactionsFailureReason fetchChaloCardTransactionsFailureReason = FetchChaloCardTransactionsFailureReason.CITY_NOT_FOUND;
                return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardTransactionsFailureReason), fetchChaloCardTransactionsFailureReason.getErrorCode(), null));
            }
            if (str4 != null && str4.length() != 0 && str6 != null && str6.length() != 0) {
                return new ChaloUseCaseResult.Success(new Pager(new PagingConfig(i3, 0, false, 0, 0, 0, 62, null), null, new w1(this, str4, strB, str5, str6, 1), 2, null).getFlow());
            }
            FetchChaloCardTransactionsFailureReason fetchChaloCardTransactionsFailureReason2 = FetchChaloCardTransactionsFailureReason.CARD_NOT_FOUND;
            return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardTransactionsFailureReason2), fetchChaloCardTransactionsFailureReason2.getErrorCode(), null));
        } catch (Exception e) {
            if (!(e instanceof FetchChaloCardTransactionsFailedException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                FetchChaloCardTransactionsFailureReason fetchChaloCardTransactionsFailureReason3 = FetchChaloCardTransactionsFailureReason.UNKNOWN_LOCAL_ERROR;
                return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardTransactionsFailureReason3), fetchChaloCardTransactionsFailureReason3.getErrorCode(), null));
            }
            FetchChaloCardTransactionsFailedException fetchChaloCardTransactionsFailedException = (FetchChaloCardTransactionsFailedException) e;
            GenericChaloErrorResponse genericChaloErrorResponse = fetchChaloCardTransactionsFailedException.getGenericChaloErrorResponse();
            Integer num = genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null;
            FetchChaloCardTransactionsFailureReason fetchChaloCardTransactionsFailureReason4 = FetchChaloCardTransactionsFailureReason.CARD_NOT_FOUND;
            int errorCode = fetchChaloCardTransactionsFailureReason4.getErrorCode();
            if (num != null && num.intValue() == errorCode) {
                return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardTransactionsFailureReason4), fetchChaloCardTransactionsFailureReason4.getErrorCode(), fetchChaloCardTransactionsFailedException.getGenericChaloErrorResponse().b));
            }
            FetchChaloCardTransactionsFailureReason fetchChaloCardTransactionsFailureReason5 = FetchChaloCardTransactionsFailureReason.INTERNAL_SERVER_ERROR;
            int errorCode2 = fetchChaloCardTransactionsFailureReason5.getErrorCode();
            if (num != null && num.intValue() == errorCode2) {
                return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(fetchChaloCardTransactionsFailureReason5), fetchChaloCardTransactionsFailureReason5.getErrorCode(), fetchChaloCardTransactionsFailedException.getGenericChaloErrorResponse().b));
            }
            FetchChaloCardTransactionsFailureReason fetchChaloCardTransactionsFailureReason6 = FetchChaloCardTransactionsFailureReason.UNKNOWN_SERVER_ERROR;
            OperationFailureError.UseCaseSpecificError useCaseSpecificError = new OperationFailureError.UseCaseSpecificError(fetchChaloCardTransactionsFailureReason6);
            GenericChaloErrorResponse genericChaloErrorResponse2 = fetchChaloCardTransactionsFailedException.getGenericChaloErrorResponse();
            return new ChaloUseCaseResult.Failure(new UseCaseOperationError(useCaseSpecificError, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.f6497a : fetchChaloCardTransactionsFailureReason6.getErrorCode(), null));
        }
    }
}
