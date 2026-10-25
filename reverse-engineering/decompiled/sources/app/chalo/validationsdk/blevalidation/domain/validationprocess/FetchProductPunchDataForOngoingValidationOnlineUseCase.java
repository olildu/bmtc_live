package app.chalo.validationsdk.blevalidation.domain.validationprocess;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.data.exception.FetchProductValidationDataForActivationException;
import app.chalo.validationsdk.blevalidation.data.models.ProductPunchFetchFailureReason;
import app.chalo.validationsdk.blevalidation.data.models.api.FetchProductPunchDataForActivationApiReqModel;
import app.chalo.validationsdk.blevalidation.data.models.api.FetchProductPunchDataForActivationApiResponseModel;
import app.chalo.validationsdk.blevalidation.data.models.api.PunchInfo;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductPunchDataFromPolling;
import app.chalo.validationsdk.blevalidation.data.remote.ProductValidationsRemoteDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/validationprocess/FetchProductPunchDataForOngoingValidationOnlineUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchProductPunchDataForOngoingValidationOnlineUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductValidationsRemoteDataSource f10522a;
    public final CrashlyticsLogger b;

    public FetchProductPunchDataForOngoingValidationOnlineUseCase(ProductValidationsRemoteDataSource productValidationsRemoteDataSource, CrashlyticsLogger crashlyticsLogger) {
        this.f10522a = productValidationsRemoteDataSource;
        this.b = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1 fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1;
        Object unknown;
        Object obj;
        if (continuationImpl instanceof FetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1) {
            fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1 = (FetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1) continuationImpl;
            int i = fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1 = new FetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1 = new FetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                FetchProductPunchDataForActivationApiReqModel fetchProductPunchDataForActivationApiReqModel = new FetchProductPunchDataForActivationApiReqModel(str, str2, str3);
                ProductValidationsRemoteDataSource productValidationsRemoteDataSource = this.f10522a;
                fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1.label = 1;
                objA = productValidationsRemoteDataSource.a(fetchProductPunchDataForActivationApiReqModel, fetchProductPunchDataForOngoingValidationOnlineUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            ProductPunchDataFromPolling productPunchDataFromPollingB = b((FetchProductPunchDataForActivationApiResponseModel) objA);
            return productPunchDataFromPollingB != null ? new ChaloUseCaseResult.Success(productPunchDataFromPollingB) : new ChaloUseCaseResult.Failure(ProductPunchFetchFailureReason.ProductPunchDataInvalidResponse.f10476a);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(ProductPunchFetchFailureReason.InternetNotAvailable.f10475a);
        } catch (NetworkSuccessResponseParseException e) {
            return new ChaloUseCaseResult.Failure(new ProductPunchFetchFailureReason.ResponseParsingError(e.getMessage()));
        } catch (FetchProductValidationDataForActivationException e2) {
            GenericChaloErrorResponse genericChaloErrorResponse = e2.getGenericChaloErrorResponse();
            Integer num = genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null;
            if (num != null && num.intValue() == 2002) {
                obj = ProductPunchFetchFailureReason.PunchNotAvailable.f10477a;
            } else {
                if (num != null && num.intValue() == 1004) {
                    unknown = new ProductPunchFetchFailureReason.InternalServerError(e2.getGenericChaloErrorResponse().b, e2.getGenericChaloErrorResponse().f6497a);
                } else {
                    GenericChaloErrorResponse genericChaloErrorResponse2 = e2.getGenericChaloErrorResponse();
                    String str4 = genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null;
                    GenericChaloErrorResponse genericChaloErrorResponse3 = e2.getGenericChaloErrorResponse();
                    unknown = new ProductPunchFetchFailureReason.Unknown(str4, genericChaloErrorResponse3 != null ? new Integer(genericChaloErrorResponse3.f6497a) : null);
                }
                obj = unknown;
            }
            return new ChaloUseCaseResult.Failure(obj);
        } catch (Exception e3) {
            return new ChaloUseCaseResult.Failure(new ProductPunchFetchFailureReason.Unknown(e3.getMessage(), null));
        }
    }

    public final ProductPunchDataFromPolling b(FetchProductPunchDataForActivationApiResponseModel fetchProductPunchDataForActivationApiResponseModel) {
        String str;
        String str2 = fetchProductPunchDataForActivationApiResponseModel.b;
        PunchInfo punchInfo = fetchProductPunchDataForActivationApiResponseModel.d;
        if (Intrinsics.d(str2, "mobileTicket") && Intrinsics.d(fetchProductPunchDataForActivationApiResponseModel.c, "premiumReserveTicket") && punchInfo != null) {
            try {
                String str3 = punchInfo.c;
                if (str3 != null) {
                    long j = Long.parseLong(str3);
                    String str4 = fetchProductPunchDataForActivationApiResponseModel.b;
                    String str5 = fetchProductPunchDataForActivationApiResponseModel.c;
                    String str6 = punchInfo.f10490a;
                    if (str6 != null && (str = punchInfo.b) != null) {
                        return new ProductPunchDataFromPolling(str4, str5, str6, str, j);
                    }
                }
            } catch (Exception e) {
                this.b.i(e);
            }
        }
        return null;
    }
}
