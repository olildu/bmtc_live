package app.chalo.login.domain;

import app.chalo.login.data.exceptions.UserConsentStatusFetchFailedException;
import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/FetchDpdpaUserConsentUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchDpdpaUserConsentUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5230a;

    public FetchDpdpaUserConsentUseCase(LoginRepository loginRepository) {
        this.f5230a = loginRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FetchDpdpaUserConsentUseCase$invoke$1 fetchDpdpaUserConsentUseCase$invoke$1;
        if (continuationImpl instanceof FetchDpdpaUserConsentUseCase$invoke$1) {
            fetchDpdpaUserConsentUseCase$invoke$1 = (FetchDpdpaUserConsentUseCase$invoke$1) continuationImpl;
            int i = fetchDpdpaUserConsentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchDpdpaUserConsentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchDpdpaUserConsentUseCase$invoke$1 = new FetchDpdpaUserConsentUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchDpdpaUserConsentUseCase$invoke$1 = new FetchDpdpaUserConsentUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = fetchDpdpaUserConsentUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchDpdpaUserConsentUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objE);
                LoginRepository loginRepository = this.f5230a;
                fetchDpdpaUserConsentUseCase$invoke$1.label = 1;
                objE = loginRepository.e(str, fetchDpdpaUserConsentUseCase$invoke$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objE);
            }
            return new ChaloUseCaseResult.Success((DpdpaUserConsentsInfoAppModel) objE);
        } catch (UserConsentStatusFetchFailedException unused) {
            return new ChaloUseCaseResult.Failure(FetchConsentStatusFailureReason.SERVER_ERROR);
        } catch (ChaloLocalException unused2) {
            return new ChaloUseCaseResult.Failure(FetchConsentStatusFailureReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused3) {
            return new ChaloUseCaseResult.Failure(FetchConsentStatusFailureReason.INVALID_RESPONSE);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(FetchConsentStatusFailureReason.UNKNOWN_ERROR);
        }
    }
}
