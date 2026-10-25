package app.chalo.userprofile.data.remote;

import app.chalo.login.data.models.response.UserProfileResponseModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.userprofile.data.models.request.UpdateUserProfileRequestApiModel;
import defpackage.qn1;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/userprofile/data/remote/UserProfileRemoteDataSourceImpl;", "Lapp/chalo/userprofile/data/remote/UserProfileRemoteDataSource;", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileRemoteDataSourceImpl implements UserProfileRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f10313a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/userprofile/data/remote/UserProfileRemoteDataSourceImpl$Companion;", "", "", "USER_ID", "Ljava/lang/String;", "UPDATE_USER_PROFILE_SUB_URL", "FETCH_USER_PROFILE_SUB_URL", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public UserProfileRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f10313a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.userprofile.data.remote.UserProfileRemoteDataSource
    public final Object a(String str, ContinuationImpl continuationImpl) throws Exception {
        UserProfileRemoteDataSourceImpl$fetchUserProfile$1 userProfileRemoteDataSourceImpl$fetchUserProfile$1;
        if (continuationImpl instanceof UserProfileRemoteDataSourceImpl$fetchUserProfile$1) {
            userProfileRemoteDataSourceImpl$fetchUserProfile$1 = (UserProfileRemoteDataSourceImpl$fetchUserProfile$1) continuationImpl;
            int i = userProfileRemoteDataSourceImpl$fetchUserProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileRemoteDataSourceImpl$fetchUserProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileRemoteDataSourceImpl$fetchUserProfile$1 = new UserProfileRemoteDataSourceImpl$fetchUserProfile$1(this, continuationImpl);
            }
        } else {
            userProfileRemoteDataSourceImpl$fetchUserProfile$1 = new UserProfileRemoteDataSourceImpl$fetchUserProfile$1(this, continuationImpl);
        }
        Object objC = userProfileRemoteDataSourceImpl$fetchUserProfile$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileRemoteDataSourceImpl$fetchUserProfile$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("chaukidar/v1/app/user/userId", "userId", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f10313a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            userProfileRemoteDataSourceImpl$fetchUserProfile$1.label = 1;
            objC = chaloRequestE.c(userProfileRemoteDataSourceImpl$fetchUserProfile$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qn1(1));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(UserProfileResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(UserProfileResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (UserProfileResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.userprofile.data.remote.UserProfileRemoteDataSource
    public final Object b(UpdateUserProfileRequestApiModel updateUserProfileRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        UserProfileRemoteDataSourceImpl$updateUserProfileOnServer$1 userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1;
        if (continuationImpl instanceof UserProfileRemoteDataSourceImpl$updateUserProfileOnServer$1) {
            userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1 = (UserProfileRemoteDataSourceImpl$updateUserProfileOnServer$1) continuationImpl;
            int i = userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1 = new UserProfileRemoteDataSourceImpl$updateUserProfileOnServer$1(this, continuationImpl);
            }
        } else {
            userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1 = new UserProfileRemoteDataSourceImpl$updateUserProfileOnServer$1(this, continuationImpl);
        }
        Object objC = userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10313a.d();
            networkRequestBuilderD.j("chaukidar/v1/app/user/update-profile");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(UpdateUserProfileRequestApiModel.INSTANCE.serializer(), updateUserProfileRequestApiModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1.label = 1;
            objC = chaloRequestE.c(userProfileRemoteDataSourceImpl$updateUserProfileOnServer$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qn1(0));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(UserProfileResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(UserProfileResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (UserProfileResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
