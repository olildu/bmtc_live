package app.chalo.ncmc.domain;

import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.ncmc.data.apiresponsemodel.CardApiResponseStatus;
import app.chalo.ncmc.data.appmodel.BlockNCMCCardResponseAppModel;
import app.chalo.ncmc.data.error.BlockNCMCCardFailedException;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/BlockNCMCCardUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlockNCMCCardUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRepository f6210a;
    public final StringProvider b;

    public BlockNCMCCardUseCase(INcmcCardRepository iNcmcCardRepository, StringProvider stringProvider) {
        this.f6210a = iNcmcCardRepository;
        this.b = stringProvider;
    }

    public static ChaloUseCaseResult.Failure a(BlockNCMCCardFailureReason blockNCMCCardFailureReason, String str) {
        return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(blockNCMCCardFailureReason), blockNCMCCardFailureReason.getErrorCode(), str));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c1 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:19:0x0050, B:53:0x00de, B:22:0x0059, B:45:0x00b1, B:47:0x00c1, B:49:0x00c9, B:25:0x0065, B:40:0x0095, B:28:0x006c, B:36:0x0080, B:31:0x0073, B:34:0x007a, B:42:0x009f), top: B:84:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:19:0x0050, B:53:0x00de, B:22:0x0059, B:45:0x00b1, B:47:0x00c1, B:49:0x00c9, B:25:0x0065, B:40:0x0095, B:28:0x006c, B:36:0x0080, B:31:0x0073, B:34:0x007a, B:42:0x009f), top: B:84:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        BlockNCMCCardUseCase$invoke$1 blockNCMCCardUseCase$invoke$1;
        BlockNCMCCardFailureReason blockNCMCCardFailureReason;
        BlockNCMCCardUseCase blockNCMCCardUseCase;
        BlockNCMCCardFailureReason blockNCMCCardFailureReason2;
        BlockNCMCCardFailureReason blockNCMCCardFailureReason3;
        BlockNCMCCardUseCase blockNCMCCardUseCase2;
        BlockNCMCCardFailureReason blockNCMCCardFailureReason4;
        BlockNCMCCardUseCase blockNCMCCardUseCase3;
        if (continuationImpl instanceof BlockNCMCCardUseCase$invoke$1) {
            blockNCMCCardUseCase$invoke$1 = (BlockNCMCCardUseCase$invoke$1) continuationImpl;
            int i = blockNCMCCardUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                blockNCMCCardUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                blockNCMCCardUseCase$invoke$1 = new BlockNCMCCardUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            blockNCMCCardUseCase$invoke$1 = new BlockNCMCCardUseCase$invoke$1(this, continuationImpl);
        }
        BlockNCMCCardUseCase$invoke$1 blockNCMCCardUseCase$invoke$2 = blockNCMCCardUseCase$invoke$1;
        Object objB = blockNCMCCardUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = blockNCMCCardUseCase$invoke$2.label;
        StringProvider stringProvider = this.b;
        int i3 = 0;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                if (str.length() == 0 || str2.length() == 0 || str3.length() == 0) {
                    blockNCMCCardFailureReason3 = BlockNCMCCardFailureReason.INVALID_API_REQUEST_DATA;
                    blockNCMCCardUseCase$invoke$2.L$0 = this;
                    blockNCMCCardUseCase$invoke$2.L$1 = blockNCMCCardFailureReason3;
                    blockNCMCCardUseCase$invoke$2.label = 1;
                    objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], blockNCMCCardUseCase$invoke$2);
                    if (objB != coroutineSingletons) {
                        blockNCMCCardUseCase2 = this;
                        blockNCMCCardUseCase2.getClass();
                        return a(blockNCMCCardFailureReason3, (String) objB);
                    }
                } else {
                    INcmcCardRepository iNcmcCardRepository = this.f6210a;
                    blockNCMCCardUseCase$invoke$2.label = 2;
                    objB = iNcmcCardRepository.g(str, str2, str3, str4, blockNCMCCardUseCase$invoke$2);
                    if (objB != coroutineSingletons) {
                        if (StringsKt.x(((BlockNCMCCardResponseAppModel) objB).f6117a, CardApiResponseStatus.SUCCESS.getStatue(), true)) {
                            return new ChaloUseCaseResult.Success(Unit.f17538a);
                        }
                        blockNCMCCardFailureReason4 = BlockNCMCCardFailureReason.INTERNAL_SERVER_ERROR;
                        blockNCMCCardUseCase$invoke$2.L$0 = this;
                        blockNCMCCardUseCase$invoke$2.L$1 = blockNCMCCardFailureReason4;
                        blockNCMCCardUseCase$invoke$2.label = 3;
                        objB = stringProvider.b(StringEnum.FACING_SOME_TECHNICAL_ERROR, new Object[0], blockNCMCCardUseCase$invoke$2);
                        if (objB != coroutineSingletons) {
                            blockNCMCCardUseCase3 = this;
                            blockNCMCCardUseCase3.getClass();
                            return a(blockNCMCCardFailureReason4, (String) objB);
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                blockNCMCCardFailureReason3 = (BlockNCMCCardFailureReason) blockNCMCCardUseCase$invoke$2.L$1;
                blockNCMCCardUseCase2 = (BlockNCMCCardUseCase) blockNCMCCardUseCase$invoke$2.L$0;
                ResultKt.b(objB);
                blockNCMCCardUseCase2.getClass();
                return a(blockNCMCCardFailureReason3, (String) objB);
            }
            if (i2 == 2) {
                ResultKt.b(objB);
                if (StringsKt.x(((BlockNCMCCardResponseAppModel) objB).f6117a, CardApiResponseStatus.SUCCESS.getStatue(), true)) {
                    return new ChaloUseCaseResult.Success(Unit.f17538a);
                }
                blockNCMCCardFailureReason4 = BlockNCMCCardFailureReason.INTERNAL_SERVER_ERROR;
                blockNCMCCardUseCase$invoke$2.L$0 = this;
                blockNCMCCardUseCase$invoke$2.L$1 = blockNCMCCardFailureReason4;
                blockNCMCCardUseCase$invoke$2.label = 3;
                objB = stringProvider.b(StringEnum.FACING_SOME_TECHNICAL_ERROR, new Object[0], blockNCMCCardUseCase$invoke$2);
                if (objB != coroutineSingletons) {
                    return coroutineSingletons;
                }
                blockNCMCCardUseCase3 = this;
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    blockNCMCCardFailureReason = (BlockNCMCCardFailureReason) blockNCMCCardUseCase$invoke$2.L$1;
                    blockNCMCCardUseCase = (BlockNCMCCardUseCase) blockNCMCCardUseCase$invoke$2.L$0;
                    ResultKt.b(objB);
                    blockNCMCCardUseCase.getClass();
                    return a(blockNCMCCardFailureReason, (String) objB);
                }
                blockNCMCCardFailureReason4 = (BlockNCMCCardFailureReason) blockNCMCCardUseCase$invoke$2.L$1;
                blockNCMCCardUseCase3 = (BlockNCMCCardUseCase) blockNCMCCardUseCase$invoke$2.L$0;
                ResultKt.b(objB);
            }
            blockNCMCCardUseCase3.getClass();
            return a(blockNCMCCardFailureReason4, (String) objB);
        } catch (Exception e) {
            if (!(e instanceof BlockNCMCCardFailedException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                blockNCMCCardFailureReason = BlockNCMCCardFailureReason.UNKNOWN_ERROR;
                blockNCMCCardUseCase$invoke$2.L$0 = this;
                blockNCMCCardUseCase$invoke$2.L$1 = blockNCMCCardFailureReason;
                blockNCMCCardUseCase$invoke$2.label = 4;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], blockNCMCCardUseCase$invoke$2);
                if (objB != coroutineSingletons) {
                    blockNCMCCardUseCase = this;
                }
                return coroutineSingletons;
            }
            BlockNCMCCardFailedException blockNCMCCardFailedException = (BlockNCMCCardFailedException) e;
            GenericChaloErrorResponse genericChaloErrorResponse = blockNCMCCardFailedException.getGenericChaloErrorResponse();
            int errorCode = genericChaloErrorResponse != null ? genericChaloErrorResponse.f6497a : BlockNCMCCardFailureReason.UNKNOWN_ERROR.getErrorCode();
            BlockNCMCCardFailureReason[] blockNCMCCardFailureReasonArrValues = BlockNCMCCardFailureReason.values();
            int length = blockNCMCCardFailureReasonArrValues.length;
            while (true) {
                if (i3 >= length) {
                    blockNCMCCardFailureReason2 = null;
                    break;
                }
                blockNCMCCardFailureReason2 = blockNCMCCardFailureReasonArrValues[i3];
                if (blockNCMCCardFailureReason2.getErrorCode() == errorCode) {
                    break;
                }
                i3++;
            }
            if (blockNCMCCardFailureReason2 == null) {
                blockNCMCCardFailureReason2 = BlockNCMCCardFailureReason.UNKNOWN_ERROR;
            }
            GenericChaloErrorResponse genericChaloErrorResponse2 = blockNCMCCardFailedException.getGenericChaloErrorResponse();
            return a(blockNCMCCardFailureReason2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
        }
    }
}
