package app.chalo.ncmc.domain;

import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.ncmc.data.appmodel.ChangeNcmcCardPinResponseAppModel;
import app.chalo.ncmc.data.error.ChangeNCMCCardPinFailedException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/ChangeNCMCPinUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeNCMCPinUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6223a;
    public final StringProvider b;

    public ChangeNCMCPinUseCase(INcmcCardRepository iNcmcCardRepository, StringProvider stringProvider) {
        this.f6223a = iNcmcCardRepository;
        this.b = stringProvider;
    }

    public static ChaloUseCaseResult.Failure a(ChangeNcmcCardPinFailureReason changeNcmcCardPinFailureReason, String str) {
        return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(changeNcmcCardPinFailureReason), changeNcmcCardPinFailureReason.getErrorCode(), str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ChangeNCMCPinUseCase$invoke$1 changeNCMCPinUseCase$invoke$1;
        ChangeNcmcCardPinFailureReason changeNcmcCardPinFailureReason;
        ChangeNCMCPinUseCase changeNCMCPinUseCase;
        ChangeNcmcCardPinFailureReason changeNcmcCardPinFailureReason2;
        ChangeNcmcCardPinFailureReason changeNcmcCardPinFailureReason3;
        ChangeNCMCPinUseCase changeNCMCPinUseCase2;
        if (continuationImpl instanceof ChangeNCMCPinUseCase$invoke$1) {
            changeNCMCPinUseCase$invoke$1 = (ChangeNCMCPinUseCase$invoke$1) continuationImpl;
            int i = changeNCMCPinUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                changeNCMCPinUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                changeNCMCPinUseCase$invoke$1 = new ChangeNCMCPinUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            changeNCMCPinUseCase$invoke$1 = new ChangeNCMCPinUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = changeNCMCPinUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = changeNCMCPinUseCase$invoke$1.label;
        StringProvider stringProvider = this.b;
        int i3 = 0;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                if (str != null && str.length() != 0) {
                    INcmcCardRepository iNcmcCardRepository = this.f6223a;
                    changeNCMCPinUseCase$invoke$1.label = 1;
                    objB = iNcmcCardRepository.h(str, changeNCMCPinUseCase$invoke$1);
                    if (objB == coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return a(ChangeNcmcCardPinFailureReason.INVALID_KIT_NUMBER, null);
            }
            if (i2 == 1) {
                ResultKt.b(objB);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    changeNcmcCardPinFailureReason = (ChangeNcmcCardPinFailureReason) changeNCMCPinUseCase$invoke$1.L$1;
                    changeNCMCPinUseCase = (ChangeNCMCPinUseCase) changeNCMCPinUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    changeNCMCPinUseCase.getClass();
                    return a(changeNcmcCardPinFailureReason, (String) objB);
                }
                changeNcmcCardPinFailureReason3 = (ChangeNcmcCardPinFailureReason) changeNCMCPinUseCase$invoke$1.L$1;
                changeNCMCPinUseCase2 = (ChangeNCMCPinUseCase) changeNCMCPinUseCase$invoke$1.L$0;
                ResultKt.b(objB);
            }
            changeNCMCPinUseCase2.getClass();
            return a(changeNcmcCardPinFailureReason3, (String) objB);
            ChangeNcmcCardPinResponseAppModel changeNcmcCardPinResponseAppModel = (ChangeNcmcCardPinResponseAppModel) objB;
            String str2 = changeNcmcCardPinResponseAppModel.f6139a;
            if (str2 != null && str2.length() != 0) {
                return new ChaloUseCaseResult.Success(changeNcmcCardPinResponseAppModel.f6139a);
            }
            changeNcmcCardPinFailureReason3 = ChangeNcmcCardPinFailureReason.SERVER_ERROR;
            changeNCMCPinUseCase$invoke$1.L$0 = this;
            changeNCMCPinUseCase$invoke$1.L$1 = changeNcmcCardPinFailureReason3;
            changeNCMCPinUseCase$invoke$1.label = 2;
            objB = stringProvider.b(StringEnum.FACING_SOME_TECHNICAL_ERROR, new Object[0], changeNCMCPinUseCase$invoke$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            changeNCMCPinUseCase2 = this;
            changeNCMCPinUseCase2.getClass();
            return a(changeNcmcCardPinFailureReason3, (String) objB);
        } catch (Exception e) {
            if (!(e instanceof ChangeNCMCCardPinFailedException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                changeNcmcCardPinFailureReason = ChangeNcmcCardPinFailureReason.UNKNOWN_ERROR;
                changeNCMCPinUseCase$invoke$1.L$0 = this;
                changeNCMCPinUseCase$invoke$1.L$1 = changeNcmcCardPinFailureReason;
                changeNCMCPinUseCase$invoke$1.label = 3;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], changeNCMCPinUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    changeNCMCPinUseCase = this;
                }
                return coroutineSingletons;
            }
            ChangeNCMCCardPinFailedException changeNCMCCardPinFailedException = (ChangeNCMCCardPinFailedException) e;
            GenericChaloErrorResponse genericChaloErrorResponse = changeNCMCCardPinFailedException.getGenericChaloErrorResponse();
            int errorCode = genericChaloErrorResponse != null ? genericChaloErrorResponse.f6497a : ChangeNcmcCardPinFailureReason.UNKNOWN_ERROR.getErrorCode();
            ChangeNcmcCardPinFailureReason[] changeNcmcCardPinFailureReasonArrValues = ChangeNcmcCardPinFailureReason.values();
            int length = changeNcmcCardPinFailureReasonArrValues.length;
            while (true) {
                if (i3 >= length) {
                    changeNcmcCardPinFailureReason2 = null;
                    break;
                }
                changeNcmcCardPinFailureReason2 = changeNcmcCardPinFailureReasonArrValues[i3];
                if (changeNcmcCardPinFailureReason2.getErrorCode() == errorCode) {
                    break;
                }
                i3++;
            }
            if (changeNcmcCardPinFailureReason2 == null) {
                changeNcmcCardPinFailureReason2 = ChangeNcmcCardPinFailureReason.UNKNOWN_ERROR;
            }
            GenericChaloErrorResponse genericChaloErrorResponse2 = changeNCMCCardPinFailedException.getGenericChaloErrorResponse();
            return a(changeNcmcCardPinFailureReason2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
        }
    }
}
