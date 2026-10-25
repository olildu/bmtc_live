package app.chalo.login.data.remote;

import app.chalo.login.data.models.request.LoginApiRequestModel;
import app.chalo.login.data.models.request.LogoutUserRequestApiModel;
import app.chalo.login.data.models.request.RefreshTokensRequestApiModel;
import app.chalo.login.data.models.request.SendOtpRequestModel;
import app.chalo.login.data.models.response.UpdateUserConsentStatusRequestApiModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/remote/LoginRemoteDataSource;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LoginRemoteDataSource {
    Object b(String str, UpdateUserConsentStatusRequestApiModel updateUserConsentStatusRequestApiModel, ContinuationImpl continuationImpl);

    Object e(String str, ContinuationImpl continuationImpl);

    Object f(LogoutUserRequestApiModel logoutUserRequestApiModel, ContinuationImpl continuationImpl);

    Object g(LoginApiRequestModel loginApiRequestModel, ContinuationImpl continuationImpl);

    Object h(RefreshTokensRequestApiModel refreshTokensRequestApiModel, ContinuationImpl continuationImpl);

    Object i(SendOtpRequestModel sendOtpRequestModel, boolean z, ContinuationImpl continuationImpl);

    Object j(ContinuationImpl continuationImpl);
}
