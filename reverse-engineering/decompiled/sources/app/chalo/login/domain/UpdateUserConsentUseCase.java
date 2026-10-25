package app.chalo.login.domain;

import app.chalo.login.data.exceptions.UserConsentUpdateFailedException;
import app.chalo.login.data.mappers.LoginAppModelsToRequestModelsMapperKt;
import app.chalo.login.data.models.app.DpdpaConsentInfoAppModel;
import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
import app.chalo.login.data.models.response.UpdateUserConsentStatusRequestApiModel;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/UpdateUserConsentUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateUserConsentUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5251a;

    public UpdateUserConsentUseCase(LoginRepository loginRepository) {
        this.f5251a = loginRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(UserProfileAppModel userProfileAppModel, List list, ContinuationImpl continuationImpl) {
        UpdateUserConsentUseCase$invoke$1 updateUserConsentUseCase$invoke$1;
        if (continuationImpl instanceof UpdateUserConsentUseCase$invoke$1) {
            updateUserConsentUseCase$invoke$1 = (UpdateUserConsentUseCase$invoke$1) continuationImpl;
            int i = updateUserConsentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateUserConsentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                updateUserConsentUseCase$invoke$1 = new UpdateUserConsentUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateUserConsentUseCase$invoke$1 = new UpdateUserConsentUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = updateUserConsentUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateUserConsentUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                if (list.isEmpty()) {
                    return new ChaloUseCaseResult.Failure(UserConsentUpdateFailureReason.EMPTY_CONSENT_LIST);
                }
                LoginRepository loginRepository = this.f5251a;
                String str = userProfileAppModel.i;
                String str2 = userProfileAppModel.e;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(LoginAppModelsToRequestModelsMapperKt.a((DpdpaConsentInfoAppModel) it.next()));
                }
                UpdateUserConsentStatusRequestApiModel updateUserConsentStatusRequestApiModel = new UpdateUserConsentStatusRequestApiModel(str2, arrayList);
                updateUserConsentUseCase$invoke$1.label = 1;
                objB = loginRepository.b(str, updateUserConsentStatusRequestApiModel, updateUserConsentUseCase$invoke$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            return new ChaloUseCaseResult.Success((DpdpaUserConsentsInfoAppModel) objB);
        } catch (UserConsentUpdateFailedException unused) {
            return new ChaloUseCaseResult.Failure(UserConsentUpdateFailureReason.UPDATE_FAILED_ON_SERVER);
        } catch (ChaloLocalException unused2) {
            return new ChaloUseCaseResult.Failure(UserConsentUpdateFailureReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused3) {
            return new ChaloUseCaseResult.Failure(UserConsentUpdateFailureReason.INVALID_RESPONSE);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(UserConsentUpdateFailureReason.UNKNOWN_ERROR);
        }
    }
}
