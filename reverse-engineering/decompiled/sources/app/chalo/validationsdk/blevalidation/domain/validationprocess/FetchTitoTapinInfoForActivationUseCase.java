package app.chalo.validationsdk.blevalidation.domain.validationprocess;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.data.exception.FetchTitoTapinDataException;
import app.chalo.validationsdk.blevalidation.data.models.TITOTapInInfoFetchFailureReason;
import app.chalo.validationsdk.blevalidation.data.models.api.TITOTapInDataApiResponseModel;
import app.chalo.validationsdk.blevalidation.data.models.api.TITOTapInDataApiResponseModelKt;
import app.chalo.validationsdk.blevalidation.data.models.app.TITOTapInDataFromPolling;
import app.chalo.validationsdk.blevalidation.data.remote.ProductValidationsRemoteDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/validationprocess/FetchTitoTapinInfoForActivationUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchTitoTapinInfoForActivationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductValidationsRemoteDataSource f10523a;

    public FetchTitoTapinInfoForActivationUseCase(ProductValidationsRemoteDataSource productValidationsRemoteDataSource) {
        this.f10523a = productValidationsRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(String str, String str2, String str3, long j, String str4, Long l, ContinuationImpl continuationImpl) {
        FetchTitoTapinInfoForActivationUseCase$invoke$1 fetchTitoTapinInfoForActivationUseCase$invoke$1;
        TITOTapInInfoFetchFailureReason tITOTapInInfoFetchFailureReason;
        if (continuationImpl instanceof FetchTitoTapinInfoForActivationUseCase$invoke$1) {
            fetchTitoTapinInfoForActivationUseCase$invoke$1 = (FetchTitoTapinInfoForActivationUseCase$invoke$1) continuationImpl;
            int i = fetchTitoTapinInfoForActivationUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchTitoTapinInfoForActivationUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchTitoTapinInfoForActivationUseCase$invoke$1 = new FetchTitoTapinInfoForActivationUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchTitoTapinInfoForActivationUseCase$invoke$1 = new FetchTitoTapinInfoForActivationUseCase$invoke$1(this, continuationImpl);
        }
        FetchTitoTapinInfoForActivationUseCase$invoke$1 fetchTitoTapinInfoForActivationUseCase$invoke$2 = fetchTitoTapinInfoForActivationUseCase$invoke$1;
        Object objB = fetchTitoTapinInfoForActivationUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchTitoTapinInfoForActivationUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                ProductValidationsRemoteDataSource productValidationsRemoteDataSource = this.f10523a;
                fetchTitoTapinInfoForActivationUseCase$invoke$2.label = 1;
                objB = productValidationsRemoteDataSource.b(str, str2, str3, j, str4, l, fetchTitoTapinInfoForActivationUseCase$invoke$2);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            TITOTapInDataFromPolling tITOTapInDataFromPollingA = TITOTapInDataApiResponseModelKt.a((TITOTapInDataApiResponseModel) objB);
            return tITOTapInDataFromPollingA != null ? new ChaloUseCaseResult.Success(tITOTapInDataFromPollingA) : new ChaloUseCaseResult.Failure(TITOTapInInfoFetchFailureReason.TITO_TAP_IN_DATA_INVALID_RESPONSE);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(TITOTapInInfoFetchFailureReason.INTERNET_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(TITOTapInInfoFetchFailureReason.RESPONSE_PARSING_ERROR);
        } catch (FetchTitoTapinDataException e) {
            GenericChaloErrorResponse genericChaloErrorResponse = e.getGenericChaloErrorResponse();
            Integer num = genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null;
            if (num != null && num.intValue() == 2001) {
                tITOTapInInfoFetchFailureReason = TITOTapInInfoFetchFailureReason.TAP_IN_NOT_AVAILABLE;
            } else {
                tITOTapInInfoFetchFailureReason = (num != null && num.intValue() == 1004) ? TITOTapInInfoFetchFailureReason.INTERNAL_SERVER_ERROR : TITOTapInInfoFetchFailureReason.UNKNOWN;
            }
            return new ChaloUseCaseResult.Failure(tITOTapInInfoFetchFailureReason);
        } catch (Exception unused3) {
            return new ChaloUseCaseResult.Failure(TITOTapInInfoFetchFailureReason.UNKNOWN);
        }
    }
}
