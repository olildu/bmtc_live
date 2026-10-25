package app.chalo.citydata.repository.remote;

import app.chalo.citydata.data.model.api.response.NearbyRoutesApiResponseModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.ko;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.citydata.repository.remote.CityDataRemoteDataSourceImpl", f = "CityDataRemoteDataSourceImpl.kt", l = {151}, m = "fetchNearbyRoutes", v = 1)
final class CityDataRemoteDataSourceImpl$fetchNearbyRoutes$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CityDataRemoteDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityDataRemoteDataSourceImpl$fetchNearbyRoutes$1(CityDataRemoteDataSourceImpl cityDataRemoteDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = cityDataRemoteDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CityDataRemoteDataSourceImpl$fetchNearbyRoutes$1 cityDataRemoteDataSourceImpl$fetchNearbyRoutes$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        CityDataRemoteDataSourceImpl cityDataRemoteDataSourceImpl = this.this$0;
        cityDataRemoteDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            cityDataRemoteDataSourceImpl$fetchNearbyRoutes$1 = this;
        } else {
            cityDataRemoteDataSourceImpl$fetchNearbyRoutes$1 = new CityDataRemoteDataSourceImpl$fetchNearbyRoutes$1(cityDataRemoteDataSourceImpl, this);
        }
        Object obj2 = cityDataRemoteDataSourceImpl$fetchNearbyRoutes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRemoteDataSourceImpl$fetchNearbyRoutes$1.label;
        Object objB = null;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        NetworkResponse networkResponse = (NetworkResponse) obj2;
        boolean z = networkResponse.f6522a;
        String str = networkResponse.c;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ko(8));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(NearbyRoutesApiResponseModel.INSTANCE.serializer())));
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
}
