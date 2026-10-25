package app.chalo.kyc.min.data.remote;

import app.chalo.kyc.min.data.exceptions.NetworkResponseToApiExceptionMapperKt;
import app.chalo.kyc.min.data.exceptions.NetworkResponseToRegisterUserApiExceptionMapper;
import app.chalo.kyc.min.data.exceptions.NetworkResponseToSubmitKycApiExceptionMapper;
import app.chalo.kyc.min.data.exceptions.RegisterUserApiException;
import app.chalo.kyc.min.data.exceptions.SubmitKycApiException;
import app.chalo.kyc.min.data.models.apimodels.MinKycRegisterApiModel;
import app.chalo.kyc.min.data.models.apimodels.MinKycSubmitDataResponseApiModel;
import app.chalo.kyc.min.data.models.requestapimodels.MinKycSubmitDataRequestApiModelWithOTP;
import app.chalo.kyc.min.data.models.requestapimodels.UserIdRequestApiModel;
import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkErrorResponseParseException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.ChaloError;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/kyc/min/data/remote/MinKycRemoteDataSourceImpl;", "Lapp/chalo/kyc/min/data/remote/MinKycRemoteDataSource;", "Companion", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MinKycRemoteDataSourceImpl implements MinKycRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f4108a;
    public final UserProfileDetailsProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/data/remote/MinKycRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_MIN_KYC_REGISTER", "Ljava/lang/String;", "SUB_URL_SUBMIT_KYC", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MinKycRemoteDataSourceImpl(NetworkManager networkManager, NetworkResponseToRegisterUserApiExceptionMapper networkResponseToRegisterUserApiExceptionMapper, NetworkResponseToSubmitKycApiExceptionMapper networkResponseToSubmitKycApiExceptionMapper, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f4108a = networkManager;
        this.b = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.kyc.min.data.remote.MinKycRemoteDataSource
    public final Object a(boolean z, ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException, RegisterUserApiException {
        MinKycRemoteDataSourceImpl$registerUser$1 minKycRemoteDataSourceImpl$registerUser$1;
        GenericChaloErrorResponse genericChaloErrorResponseA;
        if (continuationImpl instanceof MinKycRemoteDataSourceImpl$registerUser$1) {
            minKycRemoteDataSourceImpl$registerUser$1 = (MinKycRemoteDataSourceImpl$registerUser$1) continuationImpl;
            int i = minKycRemoteDataSourceImpl$registerUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycRemoteDataSourceImpl$registerUser$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycRemoteDataSourceImpl$registerUser$1 = new MinKycRemoteDataSourceImpl$registerUser$1(this, continuationImpl);
            }
        } else {
            minKycRemoteDataSourceImpl$registerUser$1 = new MinKycRemoteDataSourceImpl$registerUser$1(this, continuationImpl);
        }
        Object objC = minKycRemoteDataSourceImpl$registerUser$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycRemoteDataSourceImpl$registerUser$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f4108a.d();
            networkRequestBuilderD.j("payments/public/wallet/v2/register");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            String strM = this.b.m();
            if (strM == null) {
                strM = "";
            }
            UserIdRequestApiModel userIdRequestApiModel = new UserIdRequestApiModel(strM, z);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(UserIdRequestApiModel.INSTANCE.serializer(), userIdRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            minKycRemoteDataSourceImpl$registerUser$1.label = 1;
            objC = chaloRequestE.c(minKycRemoteDataSourceImpl$registerUser$1);
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
        NetworkCrashlyticsLogger networkCrashlyticsLogger = networkResponse.g;
        String str = networkResponse.c;
        Object objB = null;
        if (z2) {
            Json json2 = ChaloJson.b;
            NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
            if (str != null) {
                try {
                    json2.getClass();
                    objB = json2.b(str, BuiltinSerializersKt.c(MinKycRegisterApiModel.INSTANCE.serializer()));
                } catch (Exception e) {
                    networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(MinKycRegisterApiModel.class, e.getMessage(), str));
                    networkCrashlyticsLogger.b(networkSuccessResponseParseException);
                }
            }
            if (objB != null) {
                return (MinKycRegisterApiModel) objB;
            }
            throw networkSuccessResponseParseException;
        }
        if (str != null) {
            try {
                Json json3 = ChaloJson.b;
                json3.getClass();
                objB = json3.b(str, BuiltinSerializersKt.c(ChaloError.INSTANCE.serializer()));
            } catch (Exception e2) {
                networkCrashlyticsLogger.b(new NetworkErrorResponseParseException(t8.g(ChaloError.class, e2.getMessage(), str)));
            }
        }
        ChaloError chaloError = (ChaloError) objB;
        if (chaloError == null || (genericChaloErrorResponseA = chaloError.f6493a) == null) {
            genericChaloErrorResponseA = NetworkResponseToApiExceptionMapperKt.a(str);
        }
        throw new RegisterUserApiException(genericChaloErrorResponseA, genericChaloErrorResponseA.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.kyc.min.data.remote.MinKycRemoteDataSource
    public final Object b(MinKycSubmitDataRequestApiModelWithOTP minKycSubmitDataRequestApiModelWithOTP, ContinuationImpl continuationImpl) throws SubmitKycApiException, NetworkSuccessResponseParseException {
        MinKycRemoteDataSourceImpl$submitKyc$1 minKycRemoteDataSourceImpl$submitKyc$1;
        GenericChaloErrorResponse genericChaloErrorResponseA;
        if (continuationImpl instanceof MinKycRemoteDataSourceImpl$submitKyc$1) {
            minKycRemoteDataSourceImpl$submitKyc$1 = (MinKycRemoteDataSourceImpl$submitKyc$1) continuationImpl;
            int i = minKycRemoteDataSourceImpl$submitKyc$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycRemoteDataSourceImpl$submitKyc$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycRemoteDataSourceImpl$submitKyc$1 = new MinKycRemoteDataSourceImpl$submitKyc$1(this, continuationImpl);
            }
        } else {
            minKycRemoteDataSourceImpl$submitKyc$1 = new MinKycRemoteDataSourceImpl$submitKyc$1(this, continuationImpl);
        }
        Object objC = minKycRemoteDataSourceImpl$submitKyc$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycRemoteDataSourceImpl$submitKyc$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f4108a.d();
            networkRequestBuilderD.j("payments/public/wallet/v2/verify/otp");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(MinKycSubmitDataRequestApiModelWithOTP.INSTANCE.serializer(), minKycSubmitDataRequestApiModelWithOTP));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            minKycRemoteDataSourceImpl$submitKyc$1.label = 1;
            objC = chaloRequestE.c(minKycRemoteDataSourceImpl$submitKyc$1);
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
        NetworkCrashlyticsLogger networkCrashlyticsLogger = networkResponse.g;
        String str = networkResponse.c;
        Object objB = null;
        if (z) {
            Json json2 = ChaloJson.b;
            NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
            if (str != null) {
                try {
                    json2.getClass();
                    objB = json2.b(str, BuiltinSerializersKt.c(MinKycSubmitDataResponseApiModel.INSTANCE.serializer()));
                } catch (Exception e) {
                    networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(MinKycSubmitDataResponseApiModel.class, e.getMessage(), str));
                    networkCrashlyticsLogger.b(networkSuccessResponseParseException);
                }
            }
            if (objB != null) {
                return (MinKycSubmitDataResponseApiModel) objB;
            }
            throw networkSuccessResponseParseException;
        }
        if (str != null) {
            try {
                Json json3 = ChaloJson.b;
                json3.getClass();
                objB = json3.b(str, BuiltinSerializersKt.c(ChaloError.INSTANCE.serializer()));
            } catch (Exception e2) {
                networkCrashlyticsLogger.b(new NetworkErrorResponseParseException(t8.g(ChaloError.class, e2.getMessage(), str)));
            }
        }
        ChaloError chaloError = (ChaloError) objB;
        if (chaloError == null || (genericChaloErrorResponseA = chaloError.f6493a) == null) {
            genericChaloErrorResponseA = NetworkResponseToApiExceptionMapperKt.a(str);
        }
        throw new SubmitKycApiException(genericChaloErrorResponseA, genericChaloErrorResponseA.b);
    }
}
