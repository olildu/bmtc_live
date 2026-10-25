package app.chalo.livetracking.universalsearch.data.remote;

import app.chalo.livetracking.universalsearch.data.model.api.PlaceAddress;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.f31;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl", f = "TrackingRemoteDataSourceImpl.kt", l = {104, 109}, m = "fetchAddressFromLatLng", v = 1)
final class TrackingRemoteDataSourceImpl$fetchAddressFromLatLng$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingRemoteDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingRemoteDataSourceImpl$fetchAddressFromLatLng$1(TrackingRemoteDataSourceImpl trackingRemoteDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = trackingRemoteDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        TrackingRemoteDataSourceImpl$fetchAddressFromLatLng$1 trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1;
        NetworkResponse networkResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        TrackingRemoteDataSourceImpl trackingRemoteDataSourceImpl = this.this$0;
        trackingRemoteDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1 = this;
        } else {
            trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1 = new TrackingRemoteDataSourceImpl$fetchAddressFromLatLng$1(trackingRemoteDataSourceImpl, this);
        }
        Object objC = trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1.label;
        Object objB = null;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.b(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkResponse = (NetworkResponse) trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1.L$0;
                ResultKt.b(objC);
            }
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new f31((String) objC, 23));
        }
        ResultKt.b(objC);
        NetworkRequestBuilder networkRequestBuilderC = trackingRemoteDataSourceImpl.f5007a.c();
        networkRequestBuilderC.j("geocode/json");
        networkRequestBuilderC.h(null);
        networkRequestBuilderC.f(HttpRequestType.GET);
        ChaloRequest chaloRequestE = networkRequestBuilderC.e();
        trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1.label = 1;
        objC = chaloRequestE.c(trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1);
        if (objC != coroutineSingletons) {
        }
        return coroutineSingletons;
        NetworkResponse networkResponse2 = (NetworkResponse) objC;
        boolean z = networkResponse2.f6522a;
        String str = networkResponse2.c;
        if (!z) {
            trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1.L$0 = networkResponse2;
            trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1.label = 2;
            Object objB2 = trackingRemoteDataSourceImpl.b.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], trackingRemoteDataSourceImpl$fetchAddressFromLatLng$1);
            if (objB2 != coroutineSingletons) {
                objC = objB2;
                networkResponse = networkResponse2;
                throw GenericNetworkExceptionMapper.a(networkResponse, null, new f31((String) objC, 23));
            }
            return coroutineSingletons;
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(PlaceAddress.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PlaceAddress.class, e.getMessage(), str));
                networkResponse2.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PlaceAddress) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
