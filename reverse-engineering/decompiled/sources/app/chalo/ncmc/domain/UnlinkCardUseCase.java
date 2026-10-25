package app.chalo.ncmc.domain;

import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.ncmc.data.apiresponsemodel.CardApiResponseStatus;
import app.chalo.ncmc.data.appmodel.UnlinkCardResponseAppModel;
import app.chalo.ncmc.data.error.UnlinkCardFailedException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/UnlinkCardUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnlinkCardUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6250a;
    public final StringProvider b;

    public UnlinkCardUseCase(INcmcCardRepository iNcmcCardRepository, StringProvider stringProvider) {
        this.f6250a = iNcmcCardRepository;
        this.b = stringProvider;
    }

    public static ChaloUseCaseResult.Failure a(UnlinkCardFailureReason unlinkCardFailureReason, String str) {
        return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(unlinkCardFailureReason), unlinkCardFailureReason.getErrorCode(), str));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:18:0x004c, B:46:0x00d0, B:21:0x0054, B:38:0x0098, B:40:0x00a8, B:42:0x00b0, B:24:0x0060, B:33:0x0082, B:27:0x0067, B:29:0x006d, B:35:0x008c), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:18:0x004c, B:46:0x00d0, B:21:0x0054, B:38:0x0098, B:40:0x00a8, B:42:0x00b0, B:24:0x0060, B:33:0x0082, B:27:0x0067, B:29:0x006d, B:35:0x008c), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        UnlinkCardUseCase$invoke$1 unlinkCardUseCase$invoke$1;
        UnlinkCardFailureReason unlinkCardFailureReason;
        UnlinkCardUseCase unlinkCardUseCase;
        UnlinkCardFailureReason unlinkCardFailureReason2;
        UnlinkCardFailureReason unlinkCardFailureReason3;
        UnlinkCardUseCase unlinkCardUseCase2;
        UnlinkCardFailureReason unlinkCardFailureReason4;
        UnlinkCardUseCase unlinkCardUseCase3;
        if (continuationImpl instanceof UnlinkCardUseCase$invoke$1) {
            unlinkCardUseCase$invoke$1 = (UnlinkCardUseCase$invoke$1) continuationImpl;
            int i = unlinkCardUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unlinkCardUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                unlinkCardUseCase$invoke$1 = new UnlinkCardUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            unlinkCardUseCase$invoke$1 = new UnlinkCardUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = unlinkCardUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = unlinkCardUseCase$invoke$1.label;
        int i3 = 0;
        StringProvider stringProvider = this.b;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                if (str.length() == 0) {
                    unlinkCardFailureReason3 = UnlinkCardFailureReason.INVALID_CARD_NUMBER;
                    unlinkCardUseCase$invoke$1.L$0 = this;
                    unlinkCardUseCase$invoke$1.L$1 = unlinkCardFailureReason3;
                    unlinkCardUseCase$invoke$1.label = 1;
                    objB = stringProvider.b(StringEnum.INVALID_CARD_NUMBER, new Object[0], unlinkCardUseCase$invoke$1);
                    if (objB != coroutineSingletons) {
                        unlinkCardUseCase2 = this;
                        unlinkCardUseCase2.getClass();
                        return a(unlinkCardFailureReason3, (String) objB);
                    }
                } else {
                    INcmcCardRepository iNcmcCardRepository = this.f6250a;
                    unlinkCardUseCase$invoke$1.label = 2;
                    objB = iNcmcCardRepository.c(str, unlinkCardUseCase$invoke$1);
                    if (objB != coroutineSingletons) {
                        if (StringsKt.x(((UnlinkCardResponseAppModel) objB).f6165a, CardApiResponseStatus.SUCCESS.getStatue(), true)) {
                            return new ChaloUseCaseResult.Success(Unit.f17538a);
                        }
                        unlinkCardFailureReason4 = UnlinkCardFailureReason.SERVER_ERROR;
                        StringEnum stringEnum = StringEnum.SERVER_RESPONSE_ERROR_WITH_CODE;
                        Object[] objArr = {new Integer(unlinkCardFailureReason4.getErrorCode())};
                        unlinkCardUseCase$invoke$1.L$0 = this;
                        unlinkCardUseCase$invoke$1.L$1 = unlinkCardFailureReason4;
                        unlinkCardUseCase$invoke$1.label = 3;
                        objB = stringProvider.b(stringEnum, objArr, unlinkCardUseCase$invoke$1);
                        if (objB != coroutineSingletons) {
                            unlinkCardUseCase3 = this;
                            unlinkCardUseCase3.getClass();
                            return a(unlinkCardFailureReason4, (String) objB);
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                unlinkCardFailureReason3 = (UnlinkCardFailureReason) unlinkCardUseCase$invoke$1.L$1;
                unlinkCardUseCase2 = (UnlinkCardUseCase) unlinkCardUseCase$invoke$1.L$0;
                ResultKt.b(objB);
                unlinkCardUseCase2.getClass();
                return a(unlinkCardFailureReason3, (String) objB);
            }
            if (i2 == 2) {
                ResultKt.b(objB);
                if (StringsKt.x(((UnlinkCardResponseAppModel) objB).f6165a, CardApiResponseStatus.SUCCESS.getStatue(), true)) {
                    return new ChaloUseCaseResult.Success(Unit.f17538a);
                }
                unlinkCardFailureReason4 = UnlinkCardFailureReason.SERVER_ERROR;
                StringEnum stringEnum2 = StringEnum.SERVER_RESPONSE_ERROR_WITH_CODE;
                Object[] objArr2 = {new Integer(unlinkCardFailureReason4.getErrorCode())};
                unlinkCardUseCase$invoke$1.L$0 = this;
                unlinkCardUseCase$invoke$1.L$1 = unlinkCardFailureReason4;
                unlinkCardUseCase$invoke$1.label = 3;
                objB = stringProvider.b(stringEnum2, objArr2, unlinkCardUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    return coroutineSingletons;
                }
                unlinkCardUseCase3 = this;
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    unlinkCardFailureReason = (UnlinkCardFailureReason) unlinkCardUseCase$invoke$1.L$1;
                    unlinkCardUseCase = (UnlinkCardUseCase) unlinkCardUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    unlinkCardUseCase.getClass();
                    return a(unlinkCardFailureReason, (String) objB);
                }
                unlinkCardFailureReason4 = (UnlinkCardFailureReason) unlinkCardUseCase$invoke$1.L$1;
                unlinkCardUseCase3 = (UnlinkCardUseCase) unlinkCardUseCase$invoke$1.L$0;
                ResultKt.b(objB);
            }
            unlinkCardUseCase3.getClass();
            return a(unlinkCardFailureReason4, (String) objB);
        } catch (Exception e) {
            if (!(e instanceof UnlinkCardFailedException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                unlinkCardFailureReason = UnlinkCardFailureReason.UNKNOWN_ERROR;
                unlinkCardUseCase$invoke$1.L$0 = this;
                unlinkCardUseCase$invoke$1.L$1 = unlinkCardFailureReason;
                unlinkCardUseCase$invoke$1.label = 4;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], unlinkCardUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    unlinkCardUseCase = this;
                }
                return coroutineSingletons;
            }
            UnlinkCardFailedException unlinkCardFailedException = (UnlinkCardFailedException) e;
            GenericChaloErrorResponse genericChaloErrorResponse = unlinkCardFailedException.getGenericChaloErrorResponse();
            int errorCode = genericChaloErrorResponse != null ? genericChaloErrorResponse.f6497a : UnlinkCardFailureReason.UNKNOWN_ERROR.getErrorCode();
            UnlinkCardFailureReason[] unlinkCardFailureReasonArrValues = UnlinkCardFailureReason.values();
            int length = unlinkCardFailureReasonArrValues.length;
            while (true) {
                if (i3 >= length) {
                    unlinkCardFailureReason2 = null;
                    break;
                }
                unlinkCardFailureReason2 = unlinkCardFailureReasonArrValues[i3];
                if (unlinkCardFailureReason2.getErrorCode() == errorCode) {
                    break;
                }
                i3++;
            }
            if (unlinkCardFailureReason2 == null) {
                unlinkCardFailureReason2 = UnlinkCardFailureReason.UNKNOWN_ERROR;
            }
            GenericChaloErrorResponse genericChaloErrorResponse2 = unlinkCardFailedException.getGenericChaloErrorResponse();
            return a(unlinkCardFailureReason2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
        }
    }
}
