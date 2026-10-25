package app.chalo.stoptripdetails.remote;

import app.chalo.geoquery.data.models.api.GeoQueryApiRequestModel;
import app.chalo.geoquery.data.models.api.GeoQueryApiResponseModel;
import app.chalo.network.ChaloUrlProvider;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryAndRouteStatusApiResponseModel;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryApiResponseModel;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryRequestDataHolder;
import app.chalo.stoptripdetails.data.model.api.TripSummaryRequestApiModel;
import defpackage.mb1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/stoptripdetails/remote/StopTripDetailsRemoteDataSourceImpl;", "Lapp/chalo/stoptripdetails/remote/StopTripDetailsRemoteDataSource;", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopTripDetailsRemoteDataSourceImpl implements StopTripDetailsRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f9508a;
    public final StringProvider b;
    public final ChaloUrlProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lapp/chalo/stoptripdetails/remote/StopTripDetailsRemoteDataSourceImpl$Companion;", "", "", "VERSION_PATH_PARAM", "Ljava/lang/String;", "CITY_NAME_PATH_PARAM", "V4", "V5", "LOCATION_SUMMARY_ENDPOINT", "GEO_QUERY_ENDPOINT", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public StopTripDetailsRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, StringProvider stringProvider, ChaloUrlProvider chaloUrlProvider) {
        this.f9508a = networkManager;
        this.b = stringProvider;
        this.c = chaloUrlProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSource
    public final Object a(GeoQueryApiRequestModel geoQueryApiRequestModel, String str, ContinuationImpl continuationImpl) throws Exception {
        StopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1 stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1;
        if (continuationImpl instanceof StopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1) {
            stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1 = (StopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1) continuationImpl;
            int i = stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1 = new StopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1(this, continuationImpl);
            }
        } else {
            stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1 = new StopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1(this, continuationImpl);
        }
        Object objC = stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("nearbybus/v2/city/{CITY_NAME}", "{CITY_NAME}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f9508a.d();
            networkRequestBuilderD.d(this.c.i());
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(GeoQueryApiRequestModel.INSTANCE.serializer(), geoQueryApiRequestModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1.label = 1;
            objC = chaloRequestE.c(stopTripDetailsRemoteDataSourceImpl$fetchGeoSpatialData$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new mb1(8));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(GeoQueryApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(GeoQueryApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (GeoQueryApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSource
    public final Object b(LocationSummaryRequestDataHolder locationSummaryRequestDataHolder, String str, ContinuationImpl continuationImpl) throws Exception {
        StopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1 stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1;
        if (continuationImpl instanceof StopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1) {
            stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1 = (StopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1) continuationImpl;
            int i = stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1 = new StopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1(this, continuationImpl);
            }
        } else {
            stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1 = new StopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1(this, continuationImpl);
        }
        Object objC = stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R(StringsKt.R("scheduler_v4/{VERSION}/{CITY_NAME}/summary", "{VERSION}", "v4"), "{CITY_NAME}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f9508a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.h(locationSummaryRequestDataHolder.a());
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1.label = 1;
            objC = chaloRequestE.c(stopTripDetailsRemoteDataSourceImpl$fetchLocationSummary$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new mb1(9));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(LocationSummaryApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(LocationSummaryApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (LocationSummaryApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSource
    public final Object c(LocationSummaryRequestDataHolder locationSummaryRequestDataHolder, TripSummaryRequestApiModel tripSummaryRequestApiModel, String str, ContinuationImpl continuationImpl) throws Exception {
        StopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1 stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1;
        if (continuationImpl instanceof StopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1) {
            stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1 = (StopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1) continuationImpl;
            int i = stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1 = new StopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1(this, continuationImpl);
            }
        } else {
            stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1 = new StopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1(this, continuationImpl);
        }
        Object objC = stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R(StringsKt.R("scheduler_v4/{VERSION}/{CITY_NAME}/summary", "{VERSION}", "v5"), "{CITY_NAME}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f9508a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(TripSummaryRequestApiModel.INSTANCE.serializer(), tripSummaryRequestApiModel));
            networkRequestBuilderD.h(locationSummaryRequestDataHolder.a());
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1.label = 1;
            objC = chaloRequestE.c(stopTripDetailsRemoteDataSourceImpl$fetchLocationSummaryAndRouteStatus$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new mb1(10));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(LocationSummaryAndRouteStatusApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(LocationSummaryAndRouteStatusApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (LocationSummaryAndRouteStatusApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r10 == r1) goto L32;
     */
    @Override // app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.LinkedHashMap r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSourceImpl.d(java.util.LinkedHashMap, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
