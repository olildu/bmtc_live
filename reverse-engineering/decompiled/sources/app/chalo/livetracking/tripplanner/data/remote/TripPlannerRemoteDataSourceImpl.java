package app.chalo.livetracking.tripplanner.data.remote;

import app.chalo.livetracking.tripplanner.data.exceptions.TripPlannerCallFailedException;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerResultApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.request.TripPlannerRequestApiModel;
import app.chalo.location.LatLng;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import com.adjust.sdk.Constants;
import defpackage.t8;
import defpackage.xj1;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/remote/TripPlannerRemoteDataSourceImpl;", "Lapp/chalo/livetracking/tripplanner/data/remote/TripPlannerRemoteDataSource;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerRemoteDataSourceImpl implements TripPlannerRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f4689a;
    public final CityProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004¨\u0006\u0014"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/remote/TripPlannerRemoteDataSourceImpl$Companion;", "", "", "TRIP_PLANNER_SUB_URL", "Ljava/lang/String;", "TRIP_PLANNER_ARRIVAL_SUB_URL", "PARAM_FROM_LAT", "PARAM_FROM_LON", "PARAM_TO_LAT", "PARAM_TO_LON", "PARAM_MODE", "PARAM_START_TIME", "PARAM_DAY", "PARAM_META", "PARAM_START_TIME_IN_MILLIS", "PARAM_ITINERARY_TYPE", "PARAM_START_STOP_ID", "PARAM_END_STOP_ID", "PARAM_MAX_WALK_DISTANCE", "PARAM_MAX_TAXI_DISTANCE", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public TripPlannerRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, CityProvider cityProvider) {
        this.f4689a = networkManager;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // app.chalo.livetracking.tripplanner.data.remote.TripPlannerRemoteDataSource
    public final Object a(LatLng latLng, LatLng latLng2, String str, String str2, long j, String str3, long j2, String str4, String str5, String str6, boolean z, ContinuationImpl continuationImpl) throws Exception {
        TripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1 tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1;
        String upperCase;
        Object objB;
        if (continuationImpl instanceof TripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1) {
            tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1 = (TripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1) continuationImpl;
            int i = tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1 = new TripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1(this, continuationImpl);
            }
        } else {
            tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1 = new TripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1(this, continuationImpl);
        }
        Object objC = tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strB = CityProviderKt.b(this.b);
            if (strB != null) {
                upperCase = strB.toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            String strR = StringsKt.R("scheduler_v4/v5/{CITY}/tripplanner", "{CITY}", String.valueOf(upperCase));
            NetworkRequestBuilder networkRequestBuilderD = this.f4689a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("from_lat", String.valueOf(latLng.f5134a)), new Pair("from_lon", String.valueOf(latLng.b)), new Pair("to_lat", String.valueOf(latLng2.f5134a)), new Pair("to_lon", String.valueOf(latLng2.b)), new Pair("mode", str2), new Pair("start_time", String.valueOf(j)), new Pair("day", str), new Pair(Constants.REFERRER_API_META, str3), new Pair("startTimeMillis", String.valueOf(j2)), new Pair("itinerary_type", str4));
            if (str5 != null) {
                linkedHashMapK.put("from_stop_id", str5);
            }
            if (str6 != null) {
                linkedHashMapK.put("to_stop_id", str6);
            }
            if (z) {
                linkedHashMapK.put("max_walk_distance", "0");
                linkedHashMapK.put("max_taxi_distance", "0");
            }
            networkRequestBuilderD.h(linkedHashMapK);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1.label = 1;
            objC = chaloRequestE.c(tripPlannerRemoteDataSourceImpl$makeTripPlannerCall$1);
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
        String str7 = networkResponse.c;
        if (!z2) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new xj1(12));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str7 != null) {
            try {
                json.getClass();
                objB = json.b(str7, BuiltinSerializersKt.c(TripPlannerResultApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(TripPlannerResultApiResponseModel.class, e.getMessage(), str7));
                networkResponse.g.b(networkSuccessResponseParseException);
                objB = null;
            }
        } else {
            objB = null;
        }
        if (objB == null) {
            throw networkSuccessResponseParseException;
        }
        TripPlannerResultApiResponseModel tripPlannerResultApiResponseModel = (TripPlannerResultApiResponseModel) objB;
        if (StringsKt.x(tripPlannerResultApiResponseModel.b, "OK", true)) {
            return tripPlannerResultApiResponseModel;
        }
        throw new TripPlannerCallFailedException(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.tripplanner.data.remote.TripPlannerRemoteDataSource
    public final Object b(TripPlannerRequestApiModel tripPlannerRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        TripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1 tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1;
        String upperCase;
        String str;
        Object objB;
        if (continuationImpl instanceof TripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1) {
            tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1 = (TripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1) continuationImpl;
            int i = tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1.label = i - Integer.MIN_VALUE;
            } else {
                tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1 = new TripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1(this, continuationImpl);
            }
        } else {
            tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1 = new TripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1(this, continuationImpl);
        }
        Object objC = tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            CityAppModel cityAppModel = (CityAppModel) this.b.getE().getValue();
            if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
                upperCase = null;
            } else {
                upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
            }
            String strR = StringsKt.R("scheduler_v4/v6/{CITY}/tripplanner/bus-wise", "{CITY}", String.valueOf(upperCase));
            NetworkRequestBuilder networkRequestBuilderD = this.f4689a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(TripPlannerRequestApiModel.INSTANCE.serializer(), tripPlannerRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1.label = 1;
            objC = chaloRequestE.c(tripPlannerRemoteDataSourceImpl$makeTripPlannerCallWithArrival$1);
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
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new xj1(11));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(TripPlannerResultApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(TripPlannerResultApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
                objB = null;
            }
        } else {
            objB = null;
        }
        if (objB == null) {
            throw networkSuccessResponseParseException;
        }
        TripPlannerResultApiResponseModel tripPlannerResultApiResponseModel = (TripPlannerResultApiResponseModel) objB;
        if (StringsKt.x(tripPlannerResultApiResponseModel.b, "OK", true)) {
            return tripPlannerResultApiResponseModel;
        }
        throw new TripPlannerCallFailedException(null, null);
    }
}
