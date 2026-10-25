package app.chalo.sos.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.sos.data.model.RaiseSOSRemoteApiResponseModel;
import defpackage.e01;
import defpackage.t8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/sos/data/remote/RaiseSOSRemoteDataSourceImpl;", "Lapp/chalo/sos/data/remote/RaiseSOSRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RaiseSOSRemoteDataSourceImpl implements RaiseSOSRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f9427a;
    public final CityProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/sos/data/remote/RaiseSOSRemoteDataSourceImpl$Companion;", "", "", "RAISE_SOS_ENDPOINT", "Ljava/lang/String;", "PARAM_CITY", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RaiseSOSRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, CityProvider cityProvider) {
        this.f9427a = networkManager;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.sos.data.remote.RaiseSOSRemoteDataSource
    public final Object a(Map map, ContinuationImpl continuationImpl) throws Exception {
        RaiseSOSRemoteDataSourceImpl$raiseSOS$1 raiseSOSRemoteDataSourceImpl$raiseSOS$1;
        if (continuationImpl instanceof RaiseSOSRemoteDataSourceImpl$raiseSOS$1) {
            raiseSOSRemoteDataSourceImpl$raiseSOS$1 = (RaiseSOSRemoteDataSourceImpl$raiseSOS$1) continuationImpl;
            int i = raiseSOSRemoteDataSourceImpl$raiseSOS$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                raiseSOSRemoteDataSourceImpl$raiseSOS$1.label = i - Integer.MIN_VALUE;
            } else {
                raiseSOSRemoteDataSourceImpl$raiseSOS$1 = new RaiseSOSRemoteDataSourceImpl$raiseSOS$1(this, continuationImpl);
            }
        } else {
            raiseSOSRemoteDataSourceImpl$raiseSOS$1 = new RaiseSOSRemoteDataSourceImpl$raiseSOS$1(this, continuationImpl);
        }
        Object objC = raiseSOSRemoteDataSourceImpl$raiseSOS$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = raiseSOSRemoteDataSourceImpl$raiseSOS$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f9427a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j("tub/v1/trips/raise-SOS");
            CityProvider cityProvider = this.b;
            String strB = CityProviderKt.b(cityProvider);
            if (strB == null) {
                strB = "";
            }
            networkRequestBuilderD.a("city", strB, genericRequestData.f);
            Json json = ChaloJson.b;
            json.getClass();
            StringSerializer stringSerializer = StringSerializer.f18170a;
            networkRequestBuilderD.i(json.a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), map));
            String strB2 = CityProviderKt.b(cityProvider);
            networkRequestBuilderD.a("city", strB2 != null ? strB2 : "", genericRequestData.e);
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            raiseSOSRemoteDataSourceImpl$raiseSOS$1.label = 1;
            objC = chaloRequestE.c(raiseSOSRemoteDataSourceImpl$raiseSOS$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new e01(5));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(RaiseSOSRemoteApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(RaiseSOSRemoteApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (RaiseSOSRemoteApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
