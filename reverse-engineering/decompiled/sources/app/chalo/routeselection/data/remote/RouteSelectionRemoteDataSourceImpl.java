package app.chalo.routeselection.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationApiModel;
import defpackage.r31;
import defpackage.t8;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/routeselection/data/remote/RouteSelectionRemoteDataSourceImpl;", "Lapp/chalo/routeselection/data/remote/RouteSelectionRemoteDataSource;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteSelectionRemoteDataSourceImpl implements RouteSelectionRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f9176a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/routeselection/data/remote/RouteSelectionRemoteDataSourceImpl$Companion;", "", "", "ROUTE_BETWEEN_STOPS_ENDPOINT", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RouteSelectionRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f9176a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.routeselection.data.remote.RouteSelectionRemoteDataSource
    public final Object a(LinkedHashMap linkedHashMap, String str, ContinuationImpl continuationImpl) throws Exception {
        RouteSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1 routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1;
        if (continuationImpl instanceof RouteSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1) {
            routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1 = (RouteSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1) continuationImpl;
            int i = routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.label = i - Integer.MIN_VALUE;
            } else {
                routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1 = new RouteSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1(this, continuationImpl);
            }
        } else {
            routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1 = new RouteSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1(this, continuationImpl);
        }
        Object objC = routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("scheduler_v4/v5/{CITY}/routesbetweenstops", "{CITY}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f9176a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.h(linkedHashMap);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.label = 1;
            objC = chaloRequestE.c(routeSelectionRemoteDataSourceImpl$fetchRoutesForSelectedStops$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new r31(14));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(new ArrayListSerializer(OriginDestinationApiModel.INSTANCE.serializer())));
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
}
