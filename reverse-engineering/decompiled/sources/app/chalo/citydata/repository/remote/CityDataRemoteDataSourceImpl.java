package app.chalo.citydata.repository.remote;

import app.chalo.citydata.data.model.api.request.NearbyStopsToLocationRequestApiModel;
import app.chalo.citydata.data.model.api.request.RouteDetailsRequestOldApiModel;
import app.chalo.citydata.data.model.api.request.RoutesDataRequestApiModel;
import app.chalo.citydata.data.model.api.request.RoutesDataRequestDataApiModel;
import app.chalo.citydata.data.model.api.request.StopDetailsApiRequestBody;
import app.chalo.citydata.data.model.api.request.StopDetailsApiRequestModel;
import app.chalo.citydata.data.model.api.request.StopImagesRequestApiModel;
import app.chalo.citydata.data.model.api.request.StopImagesRequestBody;
import app.chalo.citydata.data.model.api.response.CityIdAndNameFromLatLngResponseApiModel;
import app.chalo.citydata.data.model.api.response.NearbyStopsToLocationResponseApiModel;
import app.chalo.citydata.data.model.api.response.RouteDetailsResponseOldApiModel;
import app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModel;
import app.chalo.citydata.data.model.api.response.StopApiModel;
import app.chalo.citydata.data.model.api.response.StopDetailsResponseApiModel;
import app.chalo.citydata.data.model.api.response.StopImagesResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import com.adjust.sdk.Constants;
import defpackage.d;
import defpackage.ko;
import defpackage.t8;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/citydata/repository/remote/CityDataRemoteDataSourceImpl;", "Lapp/chalo/citydata/repository/remote/CityDataRemoteDataSource;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityDataRemoteDataSourceImpl implements CityDataRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f1799a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, d2 = {"Lapp/chalo/citydata/repository/remote/CityDataRemoteDataSourceImpl$Companion;", "", "", "TRANSIT_MODE_QUERY_PARAM_KEY", "Ljava/lang/String;", "PARAM_MODE", "PARAM_STOP_IDS", "CITY_PATH_PARAM_KEY", "ROUTE_DETAILS_SUB_URL", "BACKGROUND_SYNC_HEADER_KEY", "ROUTE_DETAILS_SUB_URL_v4", "STOP_IMAGES_SUB_URL", "STOP_DETAILS_SUB_URL", "NEARBY_ROUTES_SUB_URL", "CITY_ID_FROM_LOCATION_SUB_URL", "STOP_LIST_SUB_URL", "NEARBY_STOPS_SUB_URL", "ROUTE_DETAILS_ROUTE_ID_QUERY_PARAM_KEY", "ROUTE_DETAILS_DAY_QUERY_PARAM_KEY", "ROUTE_DETAILS_META_QUERY_PARAM_KEY", "LAT_QUERY_PARAM_KEY", "LON_QUERY_PARAM_KEY", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CityDataRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f1799a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.remote.CityDataRemoteDataSource
    public final Object a(String str, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl) throws Exception {
        CityDataRemoteDataSourceImpl$fetchStopListForCity$1 cityDataRemoteDataSourceImpl$fetchStopListForCity$1;
        if (continuationImpl instanceof CityDataRemoteDataSourceImpl$fetchStopListForCity$1) {
            cityDataRemoteDataSourceImpl$fetchStopListForCity$1 = (CityDataRemoteDataSourceImpl$fetchStopListForCity$1) continuationImpl;
            int i = cityDataRemoteDataSourceImpl$fetchStopListForCity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRemoteDataSourceImpl$fetchStopListForCity$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRemoteDataSourceImpl$fetchStopListForCity$1 = new CityDataRemoteDataSourceImpl$fetchStopListForCity$1(this, continuationImpl);
            }
        } else {
            cityDataRemoteDataSourceImpl$fetchStopListForCity$1 = new CityDataRemoteDataSourceImpl$fetchStopListForCity$1(this, continuationImpl);
        }
        Object objC = cityDataRemoteDataSourceImpl$fetchStopListForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRemoteDataSourceImpl$fetchStopListForCity$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = d.o(objC);
            linkedHashMapO.put("mode", chaloTransitMode.getMode());
            String strR = StringsKt.R("scheduler_v4/v4/cityName/stops/id", "cityName", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f1799a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.h(linkedHashMapO);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            cityDataRemoteDataSourceImpl$fetchStopListForCity$1.label = 1;
            objC = chaloRequestE.c(cityDataRemoteDataSourceImpl$fetchStopListForCity$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ko(10));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(new ArrayListSerializer(StopApiModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.remote.CityDataRemoteDataSource
    public final Object b(RouteDetailsRequestOldApiModel routeDetailsRequestOldApiModel, ContinuationImpl continuationImpl) throws Exception {
        CityDataRemoteDataSourceImpl$getRouteDetails$3 cityDataRemoteDataSourceImpl$getRouteDetails$3;
        if (continuationImpl instanceof CityDataRemoteDataSourceImpl$getRouteDetails$3) {
            cityDataRemoteDataSourceImpl$getRouteDetails$3 = (CityDataRemoteDataSourceImpl$getRouteDetails$3) continuationImpl;
            int i = cityDataRemoteDataSourceImpl$getRouteDetails$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRemoteDataSourceImpl$getRouteDetails$3.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRemoteDataSourceImpl$getRouteDetails$3 = new CityDataRemoteDataSourceImpl$getRouteDetails$3(this, continuationImpl);
            }
        } else {
            cityDataRemoteDataSourceImpl$getRouteDetails$3 = new CityDataRemoteDataSourceImpl$getRouteDetails$3(this, continuationImpl);
        }
        Object objC = cityDataRemoteDataSourceImpl$getRouteDetails$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRemoteDataSourceImpl$getRouteDetails$3.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("scheduler_v4/v4/cityName/routedetails", "cityName", routeDetailsRequestOldApiModel.b);
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("route_id", routeDetailsRequestOldApiModel.f1640a), new Pair("day", routeDetailsRequestOldApiModel.c));
            String str = routeDetailsRequestOldApiModel.d;
            if (str != null) {
                linkedHashMapK.put(Constants.REFERRER_API_META, str);
            }
            NetworkRequestBuilder networkRequestBuilderD = this.f1799a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.h(linkedHashMapK);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            cityDataRemoteDataSourceImpl$getRouteDetails$3.label = 1;
            objC = chaloRequestE.c(cityDataRemoteDataSourceImpl$getRouteDetails$3);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ko(5));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(RouteDetailsResponseOldApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(RouteDetailsResponseOldApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (RouteDetailsResponseOldApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.remote.CityDataRemoteDataSource
    public final Object c(StopImagesRequestApiModel stopImagesRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        CityDataRemoteDataSourceImpl$fetchStopImages$1 cityDataRemoteDataSourceImpl$fetchStopImages$1;
        if (continuationImpl instanceof CityDataRemoteDataSourceImpl$fetchStopImages$1) {
            cityDataRemoteDataSourceImpl$fetchStopImages$1 = (CityDataRemoteDataSourceImpl$fetchStopImages$1) continuationImpl;
            int i = cityDataRemoteDataSourceImpl$fetchStopImages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRemoteDataSourceImpl$fetchStopImages$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRemoteDataSourceImpl$fetchStopImages$1 = new CityDataRemoteDataSourceImpl$fetchStopImages$1(this, continuationImpl);
            }
        } else {
            cityDataRemoteDataSourceImpl$fetchStopImages$1 = new CityDataRemoteDataSourceImpl$fetchStopImages$1(this, continuationImpl);
        }
        Object objC = cityDataRemoteDataSourceImpl$fetchStopImages$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRemoteDataSourceImpl$fetchStopImages$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("scheduler_v4/v4/cityName/stopImages", "cityName", stopImagesRequestApiModel.f1654a);
            NetworkRequestBuilder networkRequestBuilderD = this.f1799a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.POST);
            StopImagesRequestBody stopImagesRequestBody = stopImagesRequestApiModel.b;
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(StopImagesRequestBody.INSTANCE.serializer(), stopImagesRequestBody));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            cityDataRemoteDataSourceImpl$fetchStopImages$1.label = 1;
            objC = chaloRequestE.c(cityDataRemoteDataSourceImpl$fetchStopImages$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ko(6));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(StopImagesResponseApiModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.remote.CityDataRemoteDataSource
    public final Object d(double d, double d2, String str, ContinuationImpl continuationImpl) throws Exception {
        CityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1 cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1;
        if (continuationImpl instanceof CityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1) {
            cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1 = (CityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1) continuationImpl;
            int i = cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1 = new CityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1(this, continuationImpl);
            }
        } else {
            cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1 = new CityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1(this, continuationImpl);
        }
        Object objC = cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f1799a.d();
            networkRequestBuilderD.j("scheduler_v4/geocode/reverse");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.h(MapsKt.i(new Pair("lat", String.valueOf(d)), new Pair("lon", String.valueOf(d2)), new Pair(Constants.REFERRER_API_META, str)));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1.label = 1;
            objC = chaloRequestE.c(cityDataRemoteDataSourceImpl$fetchCityIdsFromLocation$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ko(9));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(CityIdAndNameFromLatLngResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CityIdAndNameFromLatLngResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CityIdAndNameFromLatLngResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.remote.CityDataRemoteDataSource
    public final Object e(NearbyStopsToLocationRequestApiModel nearbyStopsToLocationRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        CityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1 cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1;
        if (continuationImpl instanceof CityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1) {
            cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1 = (CityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1) continuationImpl;
            int i = cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1 = new CityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1(this, continuationImpl);
            }
        } else {
            cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1 = new CityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1(this, continuationImpl);
        }
        Object objC = cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("scheduler_v4/v4/cityName/nearby/stops", "cityName", nearbyStopsToLocationRequestApiModel.f1638a);
            Map mapI = MapsKt.i(new Pair("lat", String.valueOf(nearbyStopsToLocationRequestApiModel.b)), new Pair("lon", String.valueOf(nearbyStopsToLocationRequestApiModel.c)), new Pair("transitMode", nearbyStopsToLocationRequestApiModel.d));
            NetworkRequestBuilder networkRequestBuilderD = this.f1799a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.h(mapI);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1.label = 1;
            objC = chaloRequestE.c(cityDataRemoteDataSourceImpl$fetchNearbyStopsToALocation$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ko(4));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(NearbyStopsToLocationResponseApiModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.remote.CityDataRemoteDataSource
    public final Object f(StopDetailsApiRequestModel stopDetailsApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        CityDataRemoteDataSourceImpl$fetchStopDetails$1 cityDataRemoteDataSourceImpl$fetchStopDetails$1;
        if (continuationImpl instanceof CityDataRemoteDataSourceImpl$fetchStopDetails$1) {
            cityDataRemoteDataSourceImpl$fetchStopDetails$1 = (CityDataRemoteDataSourceImpl$fetchStopDetails$1) continuationImpl;
            int i = cityDataRemoteDataSourceImpl$fetchStopDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRemoteDataSourceImpl$fetchStopDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRemoteDataSourceImpl$fetchStopDetails$1 = new CityDataRemoteDataSourceImpl$fetchStopDetails$1(this, continuationImpl);
            }
        } else {
            cityDataRemoteDataSourceImpl$fetchStopDetails$1 = new CityDataRemoteDataSourceImpl$fetchStopDetails$1(this, continuationImpl);
        }
        Object objC = cityDataRemoteDataSourceImpl$fetchStopDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRemoteDataSourceImpl$fetchStopDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("scheduler_v4/v4/cityName/stopDetails", "cityName", stopDetailsApiRequestModel.f1652a);
            NetworkRequestBuilder networkRequestBuilderD = this.f1799a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.POST);
            StopDetailsApiRequestBody stopDetailsApiRequestBody = stopDetailsApiRequestModel.b;
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(StopDetailsApiRequestBody.INSTANCE.serializer(), stopDetailsApiRequestBody));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            cityDataRemoteDataSourceImpl$fetchStopDetails$1.label = 1;
            objC = chaloRequestE.c(cityDataRemoteDataSourceImpl$fetchStopDetails$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ko(7));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(StopDetailsResponseApiModel.INSTANCE.serializer())));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(List.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (List) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.citydata.repository.remote.CityDataRemoteDataSource
    public final Object g(RoutesDataRequestApiModel routesDataRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        CityDataRemoteDataSourceImpl$getRouteDetails$1 cityDataRemoteDataSourceImpl$getRouteDetails$1;
        if (continuationImpl instanceof CityDataRemoteDataSourceImpl$getRouteDetails$1) {
            cityDataRemoteDataSourceImpl$getRouteDetails$1 = (CityDataRemoteDataSourceImpl$getRouteDetails$1) continuationImpl;
            int i = cityDataRemoteDataSourceImpl$getRouteDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDataRemoteDataSourceImpl$getRouteDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDataRemoteDataSourceImpl$getRouteDetails$1 = new CityDataRemoteDataSourceImpl$getRouteDetails$1(this, continuationImpl);
            }
        } else {
            cityDataRemoteDataSourceImpl$getRouteDetails$1 = new CityDataRemoteDataSourceImpl$getRouteDetails$1(this, continuationImpl);
        }
        Object objC = cityDataRemoteDataSourceImpl$getRouteDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRemoteDataSourceImpl$getRouteDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("scheduler_v4/v5/cityName/routedetails", "cityName", routesDataRequestApiModel.f1642a);
            NetworkRequestBuilder networkRequestBuilderD = this.f1799a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.a("isBackgroundSync", String.valueOf(routesDataRequestApiModel.b), networkRequestBuilderD.f6519a.e);
            RoutesDataRequestDataApiModel routesDataRequestDataApiModel = routesDataRequestApiModel.d;
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(BuiltinSerializersKt.c(RoutesDataRequestDataApiModel.INSTANCE.serializer()), routesDataRequestDataApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            cityDataRemoteDataSourceImpl$getRouteDetails$1.label = 1;
            objC = chaloRequestE.c(cityDataRemoteDataSourceImpl$getRouteDetails$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ko(11));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(RoutesDataResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(RoutesDataResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (RoutesDataResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
