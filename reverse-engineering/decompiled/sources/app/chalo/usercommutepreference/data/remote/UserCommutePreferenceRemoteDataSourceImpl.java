package app.chalo.usercommutepreference.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.usercommutepreference.data.api.CreateRideResponseApiModel;
import app.chalo.usercommutepreference.data.api.CreateStopPlaceResponseApiModel;
import app.chalo.usercommutepreference.data.api.DeleteRideResponseApiModel;
import app.chalo.usercommutepreference.data.api.DeleteStopPlaceResponseApiModel;
import app.chalo.usercommutepreference.data.api.UpdateCommutePreferenceApiResponseModel;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceApiResponseModel;
import app.chalo.usercommutepreference.data.remote.request.SaveCommutePreferenceRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.SaveRideRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.SaveStopPlaceRequestApiModel;
import defpackage.t8;
import defpackage.vm1;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/UserCommutePreferenceRemoteDataSourceImpl;", "Lapp/chalo/usercommutepreference/data/remote/UserCommutePreferenceRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserCommutePreferenceRemoteDataSourceImpl implements UserCommutePreferenceRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f10255a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/UserCommutePreferenceRemoteDataSourceImpl$Companion;", "", "", "GET_PROFILE_SUMMARY_ENDPOINT", "Ljava/lang/String;", "CREATE_PLACE_ENDPOINT", "DELETE_PLACE_ENDPOINT", "UPDATE_COMMUTE_PREFERENCES_ENDPOINT", "CREATE_SAVED_RIDE_ENDPOINT", "DELETE_SAVED_RIDE_ENDPOINT", "QUERY_PARAM_ID", "QUERY_PARAM_CITY", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public UserCommutePreferenceRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f10255a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) throws Exception {
        UserCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1 userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1;
        if (continuationImpl instanceof UserCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1) {
            userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1 = (UserCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1) continuationImpl;
            int i = userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1 = new UserCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1 = new UserCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1(this, continuationImpl);
        }
        Object objC = userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10255a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j("chaukidar/v1/app/user/profile/place");
            networkRequestBuilderD.a("id", str, genericRequestData.f);
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, genericRequestData.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.DELETE);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1.label = 1;
            objC = chaloRequestE.c(userCommutePreferenceRemoteDataSourceImpl$deletePlaceFromServer$1);
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
        String str3 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new vm1(13));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str3 != null) {
            try {
                json.getClass();
                objB = json.b(str3, BuiltinSerializersKt.c(DeleteStopPlaceResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(DeleteStopPlaceResponseApiModel.class, e.getMessage(), str3));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (DeleteStopPlaceResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource
    public final Object d(String str, ContinuationImpl continuationImpl) throws Exception {
        UserCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1 userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1;
        if (continuationImpl instanceof UserCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1) {
            userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1 = (UserCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1) continuationImpl;
            int i = userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1 = new UserCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1 = new UserCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1(this, continuationImpl);
        }
        Object objC = userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10255a.d();
            networkRequestBuilderD.j("chaukidar/v1/app/user/profile/summary");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1.label = 1;
            objC = chaloRequestE.c(userCommutePreferenceRemoteDataSourceImpl$fetchProfileSummary$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new vm1(12));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(UserCommutePreferenceApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(UserCommutePreferenceApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (UserCommutePreferenceApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource
    public final Object e(SaveRideRequestApiModel saveRideRequestApiModel, String str, ContinuationImpl continuationImpl) throws Exception {
        UserCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1 userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1;
        if (continuationImpl instanceof UserCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1) {
            userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1 = (UserCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1) continuationImpl;
            int i = userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1 = new UserCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1 = new UserCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1(this, continuationImpl);
        }
        Object objC = userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10255a.d();
            networkRequestBuilderD.j("chaukidar/v1/app/user/profile/saved-ride");
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(SaveRideRequestApiModel.INSTANCE.serializer(), saveRideRequestApiModel));
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1.label = 1;
            objC = chaloRequestE.c(userCommutePreferenceRemoteDataSourceImpl$saveRideToServer$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new vm1(16));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(CreateRideResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CreateRideResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CreateRideResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource
    public final Object g(String str, String str2, ContinuationImpl continuationImpl) throws Exception {
        UserCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1 userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1;
        if (continuationImpl instanceof UserCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1) {
            userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1 = (UserCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1) continuationImpl;
            int i = userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1 = new UserCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1 = new UserCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1(this, continuationImpl);
        }
        Object objC = userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10255a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j("chaukidar/v1/app/user/profile/saved-ride");
            networkRequestBuilderD.a("id", str, genericRequestData.f);
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, genericRequestData.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.DELETE);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1.label = 1;
            objC = chaloRequestE.c(userCommutePreferenceRemoteDataSourceImpl$deleteSavedRideFromServer$1);
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
        String str3 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new vm1(11));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str3 != null) {
            try {
                json.getClass();
                objB = json.b(str3, BuiltinSerializersKt.c(DeleteRideResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(DeleteRideResponseApiModel.class, e.getMessage(), str3));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (DeleteRideResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource
    public final Object j(SaveCommutePreferenceRequestApiModel saveCommutePreferenceRequestApiModel, String str, ContinuationImpl continuationImpl) throws Exception {
        UserCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1 userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1;
        if (continuationImpl instanceof UserCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1) {
            userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1 = (UserCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1) continuationImpl;
            int i = userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1 = new UserCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1 = new UserCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1(this, continuationImpl);
        }
        Object objC = userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10255a.d();
            networkRequestBuilderD.j("chaukidar/v1/app/user/profile/commute-preferences");
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(SaveCommutePreferenceRequestApiModel.INSTANCE.serializer(), saveCommutePreferenceRequestApiModel));
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1.label = 1;
            objC = chaloRequestE.c(userCommutePreferenceRemoteDataSourceImpl$updateCommutePreferences$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new vm1(14));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(UpdateCommutePreferenceApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(UpdateCommutePreferenceApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (UpdateCommutePreferenceApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource
    public final Object k(SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel, String str, ContinuationImpl continuationImpl) throws Exception {
        UserCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1 userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1;
        if (continuationImpl instanceof UserCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1) {
            userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1 = (UserCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1) continuationImpl;
            int i = userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1 = new UserCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1 = new UserCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1(this, continuationImpl);
        }
        Object objC = userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10255a.d();
            networkRequestBuilderD.j("chaukidar/v1/app/user/profile/place");
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(SaveStopPlaceRequestApiModel.INSTANCE.serializer(), saveStopPlaceRequestApiModel));
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1.label = 1;
            objC = chaloRequestE.c(userCommutePreferenceRemoteDataSourceImpl$savePlaceToServer$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new vm1(15));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(CreateStopPlaceResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CreateStopPlaceResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CreateStopPlaceResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
