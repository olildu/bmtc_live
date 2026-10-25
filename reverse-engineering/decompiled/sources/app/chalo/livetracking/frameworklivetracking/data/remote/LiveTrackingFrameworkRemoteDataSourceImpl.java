package app.chalo.livetracking.frameworklivetracking.data.remote;

import app.chalo.livetracking.frameworklivetracking.data.model.api.request.GetSeatAvailabilityRequestApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.ChaloSocketConfigResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.FetchVehicleLiveGpsLocationResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.GetSeatAvailabilityResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloSocketConfigRequestQueryModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.request.RetryStrategyType;
import app.chalo.network.rest.response.NetworkResponse;
import com.adjust.sdk.Constants;
import defpackage.qd0;
import defpackage.t8;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/remote/LiveTrackingFrameworkRemoteDataSourceImpl;", "Lapp/chalo/livetracking/frameworklivetracking/data/remote/LiveTrackingFrameworkRemoteDataSource;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveTrackingFrameworkRemoteDataSourceImpl implements LiveTrackingFrameworkRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f4318a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/remote/LiveTrackingFrameworkRemoteDataSourceImpl$Companion;", "", "", "CONFIG_QUERY_PARAM_META", "Ljava/lang/String;", "CONFIG_PATH_PARAM_CITY", "CONFIG_SUB_URL", "CITY_NAME_KEY", "AGENCY_NAME_KEY", "BUS_NO_KEY", "SEAT_AVAILABILITY_SUB_URL", "SEAT_AVAILABILITY_HEADER_MODE_KEY", "VEHICLE_LIVE_GPS_SUB_URL", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LiveTrackingFrameworkRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f4318a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.frameworklivetracking.data.remote.LiveTrackingFrameworkRemoteDataSource
    public final Object a(ChaloSocketConfigRequestQueryModel chaloSocketConfigRequestQueryModel, ContinuationImpl continuationImpl) throws Exception {
        LiveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1 liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1;
        String strA;
        if (continuationImpl instanceof LiveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1) {
            liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1 = (LiveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1) continuationImpl;
            int i = liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1 = new LiveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1(this, continuationImpl);
            }
        } else {
            liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1 = new LiveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1(this, continuationImpl);
        }
        Object objC = liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1.label;
        Object objB = null;
        if (i2 == 0) {
            ResultKt.b(objC);
            Intrinsics.i(chaloSocketConfigRequestQueryModel, "<this>");
            try {
                Json.Default r8 = Json.d;
                r8.getClass();
                strA = r8.a(ChaloSocketConfigRequestQueryModel.INSTANCE.serializer(), chaloSocketConfigRequestQueryModel);
            } catch (Exception unused) {
                strA = null;
            }
            Map mapS = strA != null ? vo1.s(Constants.REFERRER_API_META, strA) : null;
            String strR = StringsKt.R("configuration/crts/live/v2/cities/cityName", "cityName", chaloSocketConfigRequestQueryModel.b);
            NetworkRequestBuilder networkRequestBuilderD = this.f4318a.d();
            networkRequestBuilderD.j(strR);
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.h(mapS);
            networkRequestBuilderD.f(HttpRequestType.GET);
            genericRequestData.p = Integer.MAX_VALUE;
            RetryStrategyType retryStrategy = RetryStrategyType.CONSTANT_BACKOFF;
            Intrinsics.i(retryStrategy, "retryStrategy");
            genericRequestData.q = retryStrategy.name();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1.label = 1;
            objC = chaloRequestE.c(liveTrackingFrameworkRemoteDataSourceImpl$getSocketConfig$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qd0(16));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(ChaloSocketConfigResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ChaloSocketConfigResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (ChaloSocketConfigResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.frameworklivetracking.data.remote.LiveTrackingFrameworkRemoteDataSource
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Exception {
        LiveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1 liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1;
        if (continuationImpl instanceof LiveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1) {
            liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1 = (LiveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1) continuationImpl;
            int i = liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1 = new LiveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1(this, continuationImpl);
            }
        } else {
            liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1 = new LiveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1(this, continuationImpl);
        }
        Object objC = liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R(StringsKt.R(StringsKt.R("vasudha/location/cityName/agencyName/bus/busNo", "cityName", str), "agencyName", str3), "busNo", str2);
            NetworkRequestBuilder networkRequestBuilderD = this.f4318a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1.label = 1;
            objC = chaloRequestE.c(liveTrackingFrameworkRemoteDataSourceImpl$getVehicleLiveGpsDetails$1);
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
        String str4 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qd0(17));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str4 != null) {
            try {
                json.getClass();
                objB = json.b(str4, BuiltinSerializersKt.c(FetchVehicleLiveGpsLocationResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(FetchVehicleLiveGpsLocationResponseApiModel.class, e.getMessage(), str4));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (FetchVehicleLiveGpsLocationResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.frameworklivetracking.data.remote.LiveTrackingFrameworkRemoteDataSource
    public final Object c(GetSeatAvailabilityRequestApiModel getSeatAvailabilityRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        LiveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1 liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1;
        if (continuationImpl instanceof LiveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1) {
            liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1 = (LiveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1) continuationImpl;
            int i = liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1 = new LiveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1(this, continuationImpl);
            }
        } else {
            liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1 = new LiveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1(this, continuationImpl);
        }
        Object objC = liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f4318a.d();
            networkRequestBuilderD.j("seat/availability");
            networkRequestBuilderD.a("mode", String.valueOf(getSeatAvailabilityRequestApiModel.d), networkRequestBuilderD.f6519a.e);
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(GetSeatAvailabilityRequestApiModel.INSTANCE.serializer(), getSeatAvailabilityRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1.label = 1;
            objC = chaloRequestE.c(liveTrackingFrameworkRemoteDataSourceImpl$getRouteSeatAvailabilityDetails$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qd0(18));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(GetSeatAvailabilityResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(GetSeatAvailabilityResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (GetSeatAvailabilityResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
