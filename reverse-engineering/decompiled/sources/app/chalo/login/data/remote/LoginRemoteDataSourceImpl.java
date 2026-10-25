package app.chalo.login.data.remote;

import app.chalo.login.data.LoginApiCallsType;
import app.chalo.login.data.LoginRemoteExceptionAndErrorHandler;
import app.chalo.login.data.models.request.LoginApiRequestModel;
import app.chalo.login.data.models.request.LogoutUserRequestApiModel;
import app.chalo.login.data.models.request.RefreshTokensRequestApiModel;
import app.chalo.login.data.models.request.SendOtpRequestModel;
import app.chalo.login.data.models.response.DpdpaUserConsentsInfoResponseApiModel;
import app.chalo.login.data.models.response.PostLoginAuthTokensResponseModel;
import app.chalo.login.data.models.response.RefreshTokensResponseApiModel;
import app.chalo.login.data.models.response.SendOtpResponseModel;
import app.chalo.login.data.models.response.TruecallerUidResponseModel;
import app.chalo.login.data.models.response.UpdateUserConsentStatusRequestApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.ag0;
import defpackage.cg0;
import defpackage.t8;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/data/remote/LoginRemoteDataSourceImpl;", "Lapp/chalo/login/data/remote/LoginRemoteDataSource;", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginRemoteDataSourceImpl implements LoginRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f5227a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lapp/chalo/login/data/remote/LoginRemoteDataSourceImpl$Companion;", "", "", "USER_ID_PATH", "Ljava/lang/String;", "GENERATE_UID_SUB_URL", "SEND_OTP_SUB_URL", "RESEND_OTP_SUB_URL", "VERIFY_LOGIN_SUB_URL", "REFRESH_TOKEN_SUB_URL", "LOGOUT_USER_SUB_URL", "GET_USER_CONSENT_SUB_URL", "UPDATE_USER_CONSENT_SUB_URL", "USER_ID", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LoginRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, LoginRemoteExceptionAndErrorHandler loginRemoteExceptionAndErrorHandler) {
        this.f5227a = networkManager;
    }

    public static String a(String str, String str2) {
        return z40.g("+", str2, "-", str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.remote.LoginRemoteDataSource
    public final Object b(String str, UpdateUserConsentStatusRequestApiModel updateUserConsentStatusRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        LoginRemoteDataSourceImpl$updateUserConsentStatus$1 loginRemoteDataSourceImpl$updateUserConsentStatus$1;
        if (continuationImpl instanceof LoginRemoteDataSourceImpl$updateUserConsentStatus$1) {
            loginRemoteDataSourceImpl$updateUserConsentStatus$1 = (LoginRemoteDataSourceImpl$updateUserConsentStatus$1) continuationImpl;
            int i = loginRemoteDataSourceImpl$updateUserConsentStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRemoteDataSourceImpl$updateUserConsentStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRemoteDataSourceImpl$updateUserConsentStatus$1 = new LoginRemoteDataSourceImpl$updateUserConsentStatus$1(this, continuationImpl);
            }
        } else {
            loginRemoteDataSourceImpl$updateUserConsentStatus$1 = new LoginRemoteDataSourceImpl$updateUserConsentStatus$1(this, continuationImpl);
        }
        Object objC = loginRemoteDataSourceImpl$updateUserConsentStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRemoteDataSourceImpl$updateUserConsentStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5227a.d();
            networkRequestBuilderD.j(StringsKt.R("chaukidar/v1/app/users/{userId}/digitalPrivacy/agreements", "{userId}", str));
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(UpdateUserConsentStatusRequestApiModel.INSTANCE.serializer(), updateUserConsentStatusRequestApiModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            loginRemoteDataSourceImpl$updateUserConsentStatus$1.label = 1;
            objC = chaloRequestE.c(loginRemoteDataSourceImpl$updateUserConsentStatus$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str2 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ag0(10));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(DpdpaUserConsentsInfoResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(DpdpaUserConsentsInfoResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (DpdpaUserConsentsInfoResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.remote.LoginRemoteDataSource
    public final Object e(String str, ContinuationImpl continuationImpl) throws Exception {
        LoginRemoteDataSourceImpl$fetchUserConsentStatus$1 loginRemoteDataSourceImpl$fetchUserConsentStatus$1;
        if (continuationImpl instanceof LoginRemoteDataSourceImpl$fetchUserConsentStatus$1) {
            loginRemoteDataSourceImpl$fetchUserConsentStatus$1 = (LoginRemoteDataSourceImpl$fetchUserConsentStatus$1) continuationImpl;
            int i = loginRemoteDataSourceImpl$fetchUserConsentStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRemoteDataSourceImpl$fetchUserConsentStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRemoteDataSourceImpl$fetchUserConsentStatus$1 = new LoginRemoteDataSourceImpl$fetchUserConsentStatus$1(this, continuationImpl);
            }
        } else {
            loginRemoteDataSourceImpl$fetchUserConsentStatus$1 = new LoginRemoteDataSourceImpl$fetchUserConsentStatus$1(this, continuationImpl);
        }
        Object objC = loginRemoteDataSourceImpl$fetchUserConsentStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRemoteDataSourceImpl$fetchUserConsentStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5227a.d();
            networkRequestBuilderD.j(StringsKt.R("chaukidar/v1/app/users/{userId}/digitalPrivacy/agreements", "{userId}", str));
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            loginRemoteDataSourceImpl$fetchUserConsentStatus$1.label = 1;
            objC = chaloRequestE.c(loginRemoteDataSourceImpl$fetchUserConsentStatus$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str2 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ag0(9));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(DpdpaUserConsentsInfoResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(DpdpaUserConsentsInfoResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (DpdpaUserConsentsInfoResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.remote.LoginRemoteDataSource
    public final Object f(LogoutUserRequestApiModel logoutUserRequestApiModel, ContinuationImpl continuationImpl) {
        LoginRemoteDataSourceImpl$makeLogoutUserCall$1 loginRemoteDataSourceImpl$makeLogoutUserCall$1;
        if (continuationImpl instanceof LoginRemoteDataSourceImpl$makeLogoutUserCall$1) {
            loginRemoteDataSourceImpl$makeLogoutUserCall$1 = (LoginRemoteDataSourceImpl$makeLogoutUserCall$1) continuationImpl;
            int i = loginRemoteDataSourceImpl$makeLogoutUserCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRemoteDataSourceImpl$makeLogoutUserCall$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRemoteDataSourceImpl$makeLogoutUserCall$1 = new LoginRemoteDataSourceImpl$makeLogoutUserCall$1(this, continuationImpl);
            }
        } else {
            loginRemoteDataSourceImpl$makeLogoutUserCall$1 = new LoginRemoteDataSourceImpl$makeLogoutUserCall$1(this, continuationImpl);
        }
        Object objC = loginRemoteDataSourceImpl$makeLogoutUserCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRemoteDataSourceImpl$makeLogoutUserCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5227a.d();
            networkRequestBuilderD.j("chaukidar/v1/logout");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(LogoutUserRequestApiModel.INSTANCE.serializer(), logoutUserRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            loginRemoteDataSourceImpl$makeLogoutUserCall$1.label = 1;
            objC = chaloRequestE.c(loginRemoteDataSourceImpl$makeLogoutUserCall$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return Boolean.valueOf(((NetworkResponse) objC).f6522a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.remote.LoginRemoteDataSource
    public final Object g(LoginApiRequestModel loginApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        LoginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1 loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1;
        String strA;
        if (continuationImpl instanceof LoginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1) {
            loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1 = (LoginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1) continuationImpl;
            int i = loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1 = new LoginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1(this, continuationImpl);
            }
        } else {
            loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1 = new LoginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1(this, continuationImpl);
        }
        Object objC = loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if (loginApiRequestModel instanceof LoginApiRequestModel.PhoneAuthLoginApiRequestModel) {
                LoginApiRequestModel.PhoneAuthLoginApiRequestModel phoneAuthLoginApiRequestModel = (LoginApiRequestModel.PhoneAuthLoginApiRequestModel) loginApiRequestModel;
                strA = a(phoneAuthLoginApiRequestModel.c, phoneAuthLoginApiRequestModel.d);
            } else {
                if (!(loginApiRequestModel instanceof LoginApiRequestModel.TruecallerLoginApiRequestModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                LoginApiRequestModel.TruecallerLoginApiRequestModel truecallerLoginApiRequestModel = (LoginApiRequestModel.TruecallerLoginApiRequestModel) loginApiRequestModel;
                strA = a(truecallerLoginApiRequestModel.g, truecallerLoginApiRequestModel.h);
            }
            NetworkRequestBuilder networkRequestBuilderD = this.f5227a.d();
            networkRequestBuilderD.j("chaukidar/v1/app/login");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.a("userId", strA, networkRequestBuilderD.f6519a.e);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(LoginApiRequestModel.INSTANCE.serializer(), loginApiRequestModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1.label = 1;
            objC = chaloRequestE.c(loginRemoteDataSourceImpl$verifyLoginSuccessOnServerAndGetTokens$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ag0(11));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(PostLoginAuthTokensResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PostLoginAuthTokensResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PostLoginAuthTokensResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.remote.LoginRemoteDataSource
    public final Object h(RefreshTokensRequestApiModel refreshTokensRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        LoginRemoteDataSourceImpl$refreshAuthTokens$1 loginRemoteDataSourceImpl$refreshAuthTokens$1;
        if (continuationImpl instanceof LoginRemoteDataSourceImpl$refreshAuthTokens$1) {
            loginRemoteDataSourceImpl$refreshAuthTokens$1 = (LoginRemoteDataSourceImpl$refreshAuthTokens$1) continuationImpl;
            int i = loginRemoteDataSourceImpl$refreshAuthTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRemoteDataSourceImpl$refreshAuthTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRemoteDataSourceImpl$refreshAuthTokens$1 = new LoginRemoteDataSourceImpl$refreshAuthTokens$1(this, continuationImpl);
            }
        } else {
            loginRemoteDataSourceImpl$refreshAuthTokens$1 = new LoginRemoteDataSourceImpl$refreshAuthTokens$1(this, continuationImpl);
        }
        Object objC = loginRemoteDataSourceImpl$refreshAuthTokens$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRemoteDataSourceImpl$refreshAuthTokens$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5227a.d();
            networkRequestBuilderD.j("chaukidar/v1/refreshTokens");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(RefreshTokensRequestApiModel.INSTANCE.serializer(), refreshTokensRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            loginRemoteDataSourceImpl$refreshAuthTokens$1.label = 1;
            objC = chaloRequestE.c(loginRemoteDataSourceImpl$refreshAuthTokens$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str = networkResponse.c;
        if (!z) {
            LoginApiCallsType loginApiCallsType = LoginApiCallsType.REFRESH_TOKENS;
            throw GenericNetworkExceptionMapper.a(networkResponse, new cg0(this, loginApiCallsType, 0), new cg0(this, loginApiCallsType, 1));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        Object objB = null;
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(RefreshTokensResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(RefreshTokensResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (RefreshTokensResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.remote.LoginRemoteDataSource
    public final Object i(SendOtpRequestModel sendOtpRequestModel, boolean z, ContinuationImpl continuationImpl) throws Exception {
        LoginRemoteDataSourceImpl$sendOtpForPhoneAuth$1 loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1;
        if (continuationImpl instanceof LoginRemoteDataSourceImpl$sendOtpForPhoneAuth$1) {
            loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1 = (LoginRemoteDataSourceImpl$sendOtpForPhoneAuth$1) continuationImpl;
            int i = loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1 = new LoginRemoteDataSourceImpl$sendOtpForPhoneAuth$1(this, continuationImpl);
            }
        } else {
            loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1 = new LoginRemoteDataSourceImpl$sendOtpForPhoneAuth$1(this, continuationImpl);
        }
        Object objC = loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String str = z ? "chaukidar/v1/resend-otp" : "chaukidar/v1/otp";
            NetworkRequestBuilder networkRequestBuilderD = this.f5227a.d();
            networkRequestBuilderD.j(str);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(SendOtpRequestModel.INSTANCE.serializer(), sendOtpRequestModel));
            networkRequestBuilderD.a("userId", a(sendOtpRequestModel.f5209a, sendOtpRequestModel.b), networkRequestBuilderD.f6519a.e);
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1.label = 1;
            objC = chaloRequestE.c(loginRemoteDataSourceImpl$sendOtpForPhoneAuth$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z2 = networkResponse.f6522a;
        String str2 = networkResponse.c;
        if (!z2) {
            LoginApiCallsType loginApiCallsType = LoginApiCallsType.SEND_OTP;
            throw GenericNetworkExceptionMapper.a(networkResponse, new cg0(this, loginApiCallsType, 0), new cg0(this, loginApiCallsType, 1));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        Object objB = null;
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(SendOtpResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(SendOtpResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (SendOtpResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.remote.LoginRemoteDataSource
    public final Object j(ContinuationImpl continuationImpl) throws Exception {
        LoginRemoteDataSourceImpl$generateUidForTruecaller$1 loginRemoteDataSourceImpl$generateUidForTruecaller$1;
        if (continuationImpl instanceof LoginRemoteDataSourceImpl$generateUidForTruecaller$1) {
            loginRemoteDataSourceImpl$generateUidForTruecaller$1 = (LoginRemoteDataSourceImpl$generateUidForTruecaller$1) continuationImpl;
            int i = loginRemoteDataSourceImpl$generateUidForTruecaller$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRemoteDataSourceImpl$generateUidForTruecaller$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRemoteDataSourceImpl$generateUidForTruecaller$1 = new LoginRemoteDataSourceImpl$generateUidForTruecaller$1(this, continuationImpl);
            }
        } else {
            loginRemoteDataSourceImpl$generateUidForTruecaller$1 = new LoginRemoteDataSourceImpl$generateUidForTruecaller$1(this, continuationImpl);
        }
        Object objC = loginRemoteDataSourceImpl$generateUidForTruecaller$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRemoteDataSourceImpl$generateUidForTruecaller$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5227a.d();
            networkRequestBuilderD.j("chaukidar/v1/generate/uid");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            loginRemoteDataSourceImpl$generateUidForTruecaller$1.label = 1;
            objC = chaloRequestE.c(loginRemoteDataSourceImpl$generateUidForTruecaller$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z = networkResponse.f6522a;
        String str = networkResponse.c;
        if (!z) {
            LoginApiCallsType loginApiCallsType = LoginApiCallsType.GENERATE_UID;
            throw GenericNetworkExceptionMapper.a(networkResponse, new cg0(this, loginApiCallsType, 0), new cg0(this, loginApiCallsType, 1));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        Object objB = null;
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(TruecallerUidResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(TruecallerUidResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (TruecallerUidResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
