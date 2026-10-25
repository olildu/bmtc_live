package app.chalo.fileupload.domain;

import app.chalo.fileupload.data.exceptions.UploadFileFailedException;
import app.chalo.fileupload.data.models.response.UploadFileResponseApiModel;
import app.chalo.fileupload.data.repository.UploadFileRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/domain/UploadFileToServerUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadFileToServerUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UploadFileRepository f2776a;

    public UploadFileToServerUseCase(UploadFileRepository uploadFileRepository) {
        this.f2776a = uploadFileRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, UploadFileType uploadFileType, byte[] bArr, ContinuationImpl continuationImpl) {
        UploadFileToServerUseCase$invoke$1 uploadFileToServerUseCase$invoke$1;
        if (continuationImpl instanceof UploadFileToServerUseCase$invoke$1) {
            uploadFileToServerUseCase$invoke$1 = (UploadFileToServerUseCase$invoke$1) continuationImpl;
            int i = uploadFileToServerUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uploadFileToServerUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                uploadFileToServerUseCase$invoke$1 = new UploadFileToServerUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            uploadFileToServerUseCase$invoke$1 = new UploadFileToServerUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = uploadFileToServerUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = uploadFileToServerUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                UploadFileRepository uploadFileRepository = this.f2776a;
                uploadFileToServerUseCase$invoke$1.label = 1;
                objA = uploadFileRepository.a(str, uploadFileType, bArr, uploadFileToServerUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            String str2 = ((UploadFileResponseApiModel) objA).f2772a;
            return (str2 == null || str2.length() == 0) ? new ChaloUseCaseResult.Failure(UploadFileFailureReason.INVALID_URL_RECEIVED) : new ChaloUseCaseResult.Success(str2);
        } catch (UploadFileFailedException unused) {
            return new ChaloUseCaseResult.Failure(UploadFileFailureReason.SERVER_ERROR);
        } catch (ChaloLocalException unused2) {
            return new ChaloUseCaseResult.Failure(UploadFileFailureReason.UNKNOWN_LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused3) {
            return new ChaloUseCaseResult.Failure(UploadFileFailureReason.RESPONSE_PARSE_EXCEPTION);
        }
    }
}
