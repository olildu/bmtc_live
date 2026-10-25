package app.chalo.login.domain;

import app.chalo.login.data.exceptions.TruecallerUidFetchFailedException;
import app.chalo.login.data.models.response.TruecallerUidResponseModel;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/GenerateUidForTruecallerLoginUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenerateUidForTruecallerLoginUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5234a;

    public GenerateUidForTruecallerLoginUseCase(LoginRepository loginRepository) {
        this.f5234a = loginRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GenerateUidForTruecallerLoginUseCase$invoke$1 generateUidForTruecallerLoginUseCase$invoke$1;
        if (continuationImpl instanceof GenerateUidForTruecallerLoginUseCase$invoke$1) {
            generateUidForTruecallerLoginUseCase$invoke$1 = (GenerateUidForTruecallerLoginUseCase$invoke$1) continuationImpl;
            int i = generateUidForTruecallerLoginUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateUidForTruecallerLoginUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateUidForTruecallerLoginUseCase$invoke$1 = new GenerateUidForTruecallerLoginUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            generateUidForTruecallerLoginUseCase$invoke$1 = new GenerateUidForTruecallerLoginUseCase$invoke$1(this, continuationImpl);
        }
        Object objM = generateUidForTruecallerLoginUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = generateUidForTruecallerLoginUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objM);
                LoginRepository loginRepository = this.f5234a;
                generateUidForTruecallerLoginUseCase$invoke$1.label = 1;
                objM = loginRepository.m(generateUidForTruecallerLoginUseCase$invoke$1);
                if (objM == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objM);
            }
            TruecallerUidResponseModel truecallerUidResponseModel = (TruecallerUidResponseModel) objM;
            String str = truecallerUidResponseModel.f5221a;
            if (str != null && str.length() != 0) {
                return new ChaloUseCaseResult.Success(truecallerUidResponseModel.f5221a);
            }
            return new ChaloUseCaseResult.Failure(TruecallerUidFailedErrorReasons.INVALID_UID);
        } catch (TruecallerUidFetchFailedException unused) {
            return new ChaloUseCaseResult.Failure(TruecallerUidFailedErrorReasons.SERVER_ERROR);
        } catch (ChaloLocalException unused2) {
            return new ChaloUseCaseResult.Failure(TruecallerUidFailedErrorReasons.UNKNOWN_ERROR);
        } catch (NetworkSuccessResponseParseException unused3) {
            return new ChaloUseCaseResult.Failure(TruecallerUidFailedErrorReasons.INVALID_UID);
        }
    }
}
