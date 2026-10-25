package app.chalo.login.data.repository;

import app.chalo.login.data.exceptions.InvalidRefreshAuthTokensException;
import app.chalo.login.data.exceptions.ProfileAndTokensExceptions;
import app.chalo.login.data.exceptions.UserConsentStatusFetchFailedException;
import app.chalo.login.data.exceptions.UserConsentUpdateFailedException;
import app.chalo.login.data.local.LoginLocalDataSource;
import app.chalo.login.data.mappers.LoginResponseModelsToAppModelsKt;
import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
import app.chalo.login.data.models.app.LoginModeAppModel;
import app.chalo.login.data.models.app.PostLoginProfileAndTokensAppModel;
import app.chalo.login.data.models.app.RefreshTokenResponseAppModel;
import app.chalo.login.data.models.request.LoginApiRequestModel;
import app.chalo.login.data.models.request.LogoutUserRequestApiModel;
import app.chalo.login.data.models.request.RefreshTokensRequestApiModel;
import app.chalo.login.data.models.request.SendOtpRequestModel;
import app.chalo.login.data.models.response.DpdpaUserConsentsInfoResponseApiModel;
import app.chalo.login.data.models.response.PostLoginAuthTokensResponseModel;
import app.chalo.login.data.models.response.RefreshTokensResponseApiModel;
import app.chalo.login.data.models.response.UpdateUserConsentStatusRequestApiModel;
import app.chalo.login.data.models.response.UserProfileResponseModel;
import app.chalo.login.data.remote.LoginRemoteDataSource;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.UserProfileAppModelKt;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/repository/LoginRepositoryImpl;", "Lapp/chalo/login/data/repository/LoginRepository;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginRepositoryImpl implements LoginRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRemoteDataSource f5228a;
    public final LoginLocalDataSource b;
    public final TimeUtilsContract c;

    public LoginRepositoryImpl(LoginRemoteDataSource loginRemoteDataSource, LoginLocalDataSource loginLocalDataSource, TimeUtilsContract timeUtilsContract) {
        this.f5228a = loginRemoteDataSource;
        this.b = loginLocalDataSource;
        this.c = timeUtilsContract;
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        Object objA = this.b.a(z, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object b(String str, UpdateUserConsentStatusRequestApiModel updateUserConsentStatusRequestApiModel, ContinuationImpl continuationImpl) throws UserConsentUpdateFailedException {
        LoginRepositoryImpl$updateUserConsentStatus$1 loginRepositoryImpl$updateUserConsentStatus$1;
        if (continuationImpl instanceof LoginRepositoryImpl$updateUserConsentStatus$1) {
            loginRepositoryImpl$updateUserConsentStatus$1 = (LoginRepositoryImpl$updateUserConsentStatus$1) continuationImpl;
            int i = loginRepositoryImpl$updateUserConsentStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepositoryImpl$updateUserConsentStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRepositoryImpl$updateUserConsentStatus$1 = new LoginRepositoryImpl$updateUserConsentStatus$1(this, continuationImpl);
            }
        } else {
            loginRepositoryImpl$updateUserConsentStatus$1 = new LoginRepositoryImpl$updateUserConsentStatus$1(this, continuationImpl);
        }
        Object objB = loginRepositoryImpl$updateUserConsentStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRepositoryImpl$updateUserConsentStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            loginRepositoryImpl$updateUserConsentStatus$1.label = 1;
            objB = this.f5228a.b(str, updateUserConsentStatusRequestApiModel, loginRepositoryImpl$updateUserConsentStatus$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModelA = LoginResponseModelsToAppModelsKt.a((DpdpaUserConsentsInfoResponseApiModel) objB);
        if (dpdpaUserConsentsInfoAppModelA != null) {
            return dpdpaUserConsentsInfoAppModelA;
        }
        throw new UserConsentUpdateFailedException(null, "Invalid response received");
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object c(Continuation continuation) {
        return this.b.c(continuation);
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object d(ContinuationImpl continuationImpl) {
        return this.b.d(continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object e(String str, ContinuationImpl continuationImpl) throws UserConsentStatusFetchFailedException {
        LoginRepositoryImpl$fetchUserConsentStatus$1 loginRepositoryImpl$fetchUserConsentStatus$1;
        if (continuationImpl instanceof LoginRepositoryImpl$fetchUserConsentStatus$1) {
            loginRepositoryImpl$fetchUserConsentStatus$1 = (LoginRepositoryImpl$fetchUserConsentStatus$1) continuationImpl;
            int i = loginRepositoryImpl$fetchUserConsentStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepositoryImpl$fetchUserConsentStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRepositoryImpl$fetchUserConsentStatus$1 = new LoginRepositoryImpl$fetchUserConsentStatus$1(this, continuationImpl);
            }
        } else {
            loginRepositoryImpl$fetchUserConsentStatus$1 = new LoginRepositoryImpl$fetchUserConsentStatus$1(this, continuationImpl);
        }
        Object objE = loginRepositoryImpl$fetchUserConsentStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRepositoryImpl$fetchUserConsentStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            loginRepositoryImpl$fetchUserConsentStatus$1.label = 1;
            objE = this.f5228a.e(str, loginRepositoryImpl$fetchUserConsentStatus$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModelA = LoginResponseModelsToAppModelsKt.a((DpdpaUserConsentsInfoResponseApiModel) objE);
        if (dpdpaUserConsentsInfoAppModelA != null) {
            return dpdpaUserConsentsInfoAppModelA;
        }
        throw new UserConsentStatusFetchFailedException(null, "Invalid response received");
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object f(long j, String str, Continuation continuation) {
        return this.b.f(j, str, continuation);
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object g(Continuation continuation) {
        return this.b.g((ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object h(String str, String str2, String str3, ContinuationImpl continuationImpl) throws InvalidRefreshAuthTokensException {
        LoginRepositoryImpl$refreshAuthTokens$1 loginRepositoryImpl$refreshAuthTokens$1;
        if (continuationImpl instanceof LoginRepositoryImpl$refreshAuthTokens$1) {
            loginRepositoryImpl$refreshAuthTokens$1 = (LoginRepositoryImpl$refreshAuthTokens$1) continuationImpl;
            int i = loginRepositoryImpl$refreshAuthTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepositoryImpl$refreshAuthTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRepositoryImpl$refreshAuthTokens$1 = new LoginRepositoryImpl$refreshAuthTokens$1(this, continuationImpl);
            }
        } else {
            loginRepositoryImpl$refreshAuthTokens$1 = new LoginRepositoryImpl$refreshAuthTokens$1(this, continuationImpl);
        }
        Object objH = loginRepositoryImpl$refreshAuthTokens$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRepositoryImpl$refreshAuthTokens$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            RefreshTokensRequestApiModel refreshTokensRequestApiModel = new RefreshTokensRequestApiModel(str, str2, str3);
            loginRepositoryImpl$refreshAuthTokens$1.label = 1;
            objH = this.f5228a.h(refreshTokensRequestApiModel, loginRepositoryImpl$refreshAuthTokens$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        RefreshTokensResponseApiModel refreshTokensResponseApiModel = (RefreshTokensResponseApiModel) objH;
        Intrinsics.i(refreshTokensResponseApiModel, "<this>");
        String str4 = refreshTokensResponseApiModel.f5217a;
        String str5 = refreshTokensResponseApiModel.b;
        if (str5 == null || str5.length() == 0 || str4 == null || str4.length() == 0) {
            throw new InvalidRefreshAuthTokensException(refreshTokensResponseApiModel);
        }
        return new RefreshTokenResponseAppModel(str4, str5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object i(String deviceId, LoginModeAppModel loginModeAppModel, ContinuationImpl continuationImpl) throws ProfileAndTokensExceptions.InvalidProfileDetails, ProfileAndTokensExceptions.InvalidAccessToken, ProfileAndTokensExceptions.InvalidRefreshToken {
        LoginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1 loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1;
        LoginApiRequestModel truecallerLoginApiRequestModel;
        if (continuationImpl instanceof LoginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1) {
            loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1 = (LoginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1) continuationImpl;
            int i = loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1 = new LoginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1(this, continuationImpl);
            }
        } else {
            loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1 = new LoginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1(this, continuationImpl);
        }
        Object objG = loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            Intrinsics.i(loginModeAppModel, "<this>");
            Intrinsics.i(deviceId, "deviceId");
            if (loginModeAppModel instanceof LoginModeAppModel.PhoneAuthLoginModel) {
                LoginModeAppModel.PhoneAuthLoginModel phoneAuthLoginModel = (LoginModeAppModel.PhoneAuthLoginModel) loginModeAppModel;
                String countryCallingCode = phoneAuthLoginModel.b;
                Intrinsics.i(countryCallingCode, "countryCallingCode");
                truecallerLoginApiRequestModel = new LoginApiRequestModel.PhoneAuthLoginApiRequestModel(deviceId, phoneAuthLoginModel.f5195a, StringsKt.R(countryCallingCode, "+", ""), phoneAuthLoginModel.c, phoneAuthLoginModel.d);
            } else {
                if (!(loginModeAppModel instanceof LoginModeAppModel.TruecallerLoginModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                LoginModeAppModel.TruecallerLoginModel truecallerLoginModel = (LoginModeAppModel.TruecallerLoginModel) loginModeAppModel;
                String countryCallingCode2 = truecallerLoginModel.f;
                Intrinsics.i(countryCallingCode2, "countryCallingCode");
                truecallerLoginApiRequestModel = new LoginApiRequestModel.TruecallerLoginApiRequestModel(deviceId, truecallerLoginModel.f5196a, truecallerLoginModel.b, truecallerLoginModel.c, truecallerLoginModel.d, truecallerLoginModel.e, StringsKt.R(countryCallingCode2, "+", ""), truecallerLoginModel.g, truecallerLoginModel.h, truecallerLoginModel.i);
            }
            loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1.label = 1;
            objG = this.f5228a.g(truecallerLoginApiRequestModel, loginRepositoryImpl$verifyLoginSuccessOnServerAndGetTokens$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        PostLoginAuthTokensResponseModel postLoginAuthTokensResponseModel = (PostLoginAuthTokensResponseModel) objG;
        Intrinsics.i(postLoginAuthTokensResponseModel, "<this>");
        UserProfileResponseModel userProfileResponseModel = postLoginAuthTokensResponseModel.d;
        String str = postLoginAuthTokensResponseModel.b;
        String str2 = postLoginAuthTokensResponseModel.f5215a;
        if (str2 == null || str2.length() == 0) {
            throw new ProfileAndTokensExceptions.InvalidAccessToken(str2);
        }
        if (str == null || str.length() == 0) {
            throw new ProfileAndTokensExceptions.InvalidRefreshToken(str);
        }
        if (userProfileResponseModel != null) {
            return new PostLoginProfileAndTokensAppModel(str2, str, LoginResponseModelsToAppModelsKt.b(userProfileResponseModel));
        }
        throw new ProfileAndTokensExceptions.InvalidProfileDetails(userProfileResponseModel, "null userProfile received");
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object j(String str, String countryCallingCode, String str2, String str3, Continuation continuation) {
        Intrinsics.i(countryCallingCode, "countryCallingCode");
        return this.f5228a.i(new SendOtpRequestModel(str, StringsKt.R(countryCallingCode, "+", ""), str3, str2), str2 != null, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object k(String str, ContinuationImpl continuationImpl) {
        LoginRepositoryImpl$makeLogoutUserCall$1 loginRepositoryImpl$makeLogoutUserCall$1;
        String str2;
        String str3;
        Object objD;
        String str4;
        String str5;
        Object objF;
        if (continuationImpl instanceof LoginRepositoryImpl$makeLogoutUserCall$1) {
            loginRepositoryImpl$makeLogoutUserCall$1 = (LoginRepositoryImpl$makeLogoutUserCall$1) continuationImpl;
            int i = loginRepositoryImpl$makeLogoutUserCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginRepositoryImpl$makeLogoutUserCall$1.label = i - Integer.MIN_VALUE;
            } else {
                loginRepositoryImpl$makeLogoutUserCall$1 = new LoginRepositoryImpl$makeLogoutUserCall$1(this, continuationImpl);
            }
        } else {
            loginRepositoryImpl$makeLogoutUserCall$1 = new LoginRepositoryImpl$makeLogoutUserCall$1(this, continuationImpl);
        }
        Object objB = loginRepositoryImpl$makeLogoutUserCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginRepositoryImpl$makeLogoutUserCall$1.label;
        LoginLocalDataSource loginLocalDataSource = this.b;
        if (i2 == 0) {
            ResultKt.b(objB);
            loginRepositoryImpl$makeLogoutUserCall$1.L$0 = str;
            loginRepositoryImpl$makeLogoutUserCall$1.label = 1;
            objB = loginLocalDataSource.b(loginRepositoryImpl$makeLogoutUserCall$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) loginRepositoryImpl$makeLogoutUserCall$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                String str6 = (String) loginRepositoryImpl$makeLogoutUserCall$1.L$1;
                String str7 = (String) loginRepositoryImpl$makeLogoutUserCall$1.L$0;
                ResultKt.b(objB);
                str2 = str6;
                str = str7;
                str3 = (String) objB;
                if (str3 == null) {
                    str3 = "";
                }
                loginRepositoryImpl$makeLogoutUserCall$1.L$0 = str;
                loginRepositoryImpl$makeLogoutUserCall$1.L$1 = str2;
                loginRepositoryImpl$makeLogoutUserCall$1.L$2 = str3;
                loginRepositoryImpl$makeLogoutUserCall$1.label = 3;
                objD = loginLocalDataSource.d(loginRepositoryImpl$makeLogoutUserCall$1);
                if (objD != coroutineSingletons) {
                    str4 = str;
                    str5 = str3;
                    objB = objD;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
                return objB;
            }
            str5 = (String) loginRepositoryImpl$makeLogoutUserCall$1.L$2;
            str2 = (String) loginRepositoryImpl$makeLogoutUserCall$1.L$1;
            str4 = (String) loginRepositoryImpl$makeLogoutUserCall$1.L$0;
            ResultKt.b(objB);
        }
        String str8 = (String) objB;
        LogoutUserRequestApiModel logoutUserRequestApiModel = new LogoutUserRequestApiModel(str2, str5, str8 != null ? str8 : "", str4);
        loginRepositoryImpl$makeLogoutUserCall$1.L$0 = null;
        loginRepositoryImpl$makeLogoutUserCall$1.L$1 = null;
        loginRepositoryImpl$makeLogoutUserCall$1.L$2 = null;
        loginRepositoryImpl$makeLogoutUserCall$1.label = 4;
        objF = this.f5228a.f(logoutUserRequestApiModel, loginRepositoryImpl$makeLogoutUserCall$1);
        if (objF != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objF;
        String str9 = (String) objB;
        if (str9 == null) {
            str9 = "";
        }
        loginRepositoryImpl$makeLogoutUserCall$1.L$0 = str;
        loginRepositoryImpl$makeLogoutUserCall$1.L$1 = str9;
        loginRepositoryImpl$makeLogoutUserCall$1.label = 2;
        Object objG = loginLocalDataSource.g(loginRepositoryImpl$makeLogoutUserCall$1);
        if (objG != coroutineSingletons) {
            str2 = str9;
            objB = objG;
            str3 = (String) objB;
            if (str3 == null) {
                str3 = "";
            }
            loginRepositoryImpl$makeLogoutUserCall$1.L$0 = str;
            loginRepositoryImpl$makeLogoutUserCall$1.L$1 = str2;
            loginRepositoryImpl$makeLogoutUserCall$1.L$2 = str3;
            loginRepositoryImpl$makeLogoutUserCall$1.label = 3;
            objD = loginLocalDataSource.d(loginRepositoryImpl$makeLogoutUserCall$1);
            if (objD != coroutineSingletons) {
                str4 = str;
                str5 = str3;
                objB = objD;
                String str10 = (String) objB;
                LogoutUserRequestApiModel logoutUserRequestApiModel2 = new LogoutUserRequestApiModel(str2, str5, str10 != null ? str10 : "", str4);
                loginRepositoryImpl$makeLogoutUserCall$1.L$0 = null;
                loginRepositoryImpl$makeLogoutUserCall$1.L$1 = null;
                loginRepositoryImpl$makeLogoutUserCall$1.L$2 = null;
                loginRepositoryImpl$makeLogoutUserCall$1.label = 4;
                objF = this.f5228a.f(logoutUserRequestApiModel2, loginRepositoryImpl$makeLogoutUserCall$1);
                if (objF != coroutineSingletons) {
                    return objF;
                }
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object l(String str, String str2, Long l, Long l2, Continuation continuation) {
        Object objI = this.b.i(str, str2, l, l2, continuation);
        return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : Unit.f17538a;
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object m(Continuation continuation) {
        return this.f5228a.j((ContinuationImpl) continuation);
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object n(Continuation continuation) {
        return this.b.b((ContinuationImpl) continuation);
    }

    @Override // app.chalo.login.data.repository.LoginRepository
    public final Object o(UserProfileAppModel userProfileAppModel, Continuation continuation) {
        Object objH = this.b.h(UserProfileAppModelKt.a(userProfileAppModel, this.c), continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }
}
