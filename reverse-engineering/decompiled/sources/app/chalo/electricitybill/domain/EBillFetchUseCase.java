package app.chalo.electricitybill.domain;

import app.chalo.electricitybill.data.exceptions.ElectricityBillConsumerNotFoundException;
import app.chalo.electricitybill.data.repository.ElectricityBillRepository;
import app.chalo.electricitybill.exception.EBillFetchErrorType;
import app.chalo.electricitybill.exception.EBillFetchException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/domain/EBillFetchUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EBillFetchUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ElectricityBillRepository f2546a;
    public final UserProfileDetailsProvider b;

    public EBillFetchUseCase(ElectricityBillRepository electricityBillRepository, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f2546a = electricityBillRepository;
        this.b = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        EBillFetchUseCase$fetchEBillOnline$1 eBillFetchUseCase$fetchEBillOnline$1;
        EBillFetchException eBillFetchException;
        if (continuationImpl instanceof EBillFetchUseCase$fetchEBillOnline$1) {
            eBillFetchUseCase$fetchEBillOnline$1 = (EBillFetchUseCase$fetchEBillOnline$1) continuationImpl;
            int i = eBillFetchUseCase$fetchEBillOnline$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eBillFetchUseCase$fetchEBillOnline$1.label = i - Integer.MIN_VALUE;
            } else {
                eBillFetchUseCase$fetchEBillOnline$1 = new EBillFetchUseCase$fetchEBillOnline$1(this, continuationImpl);
            }
        } else {
            eBillFetchUseCase$fetchEBillOnline$1 = new EBillFetchUseCase$fetchEBillOnline$1(this, continuationImpl);
        }
        Object objB = eBillFetchUseCase$fetchEBillOnline$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eBillFetchUseCase$fetchEBillOnline$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                ElectricityBillRepository electricityBillRepository = this.f2546a;
                this.b.m();
                eBillFetchUseCase$fetchEBillOnline$1.label = 1;
                objB = electricityBillRepository.b(str, eBillFetchUseCase$fetchEBillOnline$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            return new ChaloUseCaseResult.Success(objB);
        } catch (ElectricityBillConsumerNotFoundException e) {
            GenericChaloErrorResponse errorResponse = e.getErrorResponse();
            if (errorResponse != null) {
                String str2 = errorResponse.b;
                int i3 = errorResponse.f6497a;
                if (i3 == 401 || i3 == 500) {
                    eBillFetchException = new EBillFetchException(EBillFetchErrorType.API_RESPONSE_FAILED, str2 != null ? str2 : "Something went wrong");
                } else if (i3 == 404) {
                    eBillFetchException = new EBillFetchException(EBillFetchErrorType.CONSUMER_NOT_FOUND, str2 != null ? str2 : "Something went wrong");
                } else {
                    eBillFetchException = new EBillFetchException(EBillFetchErrorType.API_RESPONSE_FAILED, "Something went wrong");
                }
            } else {
                eBillFetchException = new EBillFetchException(EBillFetchErrorType.API_RESPONSE_FAILED, "Something went wrong");
            }
            return new ChaloUseCaseResult.Failure(eBillFetchException);
        }
    }
}
