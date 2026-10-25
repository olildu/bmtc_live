package app.chalo.login.data.repository;

import app.chalo.login.data.models.app.LoginModeAppModel;
import app.chalo.login.data.models.response.UpdateUserConsentStatusRequestApiModel;
import app.chalo.userprofile.UserProfileAppModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/repository/LoginRepository;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LoginRepository {
    Object a(boolean z, ContinuationImpl continuationImpl);

    Object b(String str, UpdateUserConsentStatusRequestApiModel updateUserConsentStatusRequestApiModel, ContinuationImpl continuationImpl);

    Object c(Continuation continuation);

    Object d(ContinuationImpl continuationImpl);

    Object e(String str, ContinuationImpl continuationImpl);

    Object f(long j, String str, Continuation continuation);

    Object g(Continuation continuation);

    Object h(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object i(String str, LoginModeAppModel loginModeAppModel, ContinuationImpl continuationImpl);

    Object j(String str, String str2, String str3, String str4, Continuation continuation);

    Object k(String str, ContinuationImpl continuationImpl);

    Object l(String str, String str2, Long l, Long l2, Continuation continuation);

    Object m(Continuation continuation);

    Object n(Continuation continuation);

    Object o(UserProfileAppModel userProfileAppModel, Continuation continuation);
}
