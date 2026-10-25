package app.chalo.features.chalotime.data.remote;

import app.chalo.features.chalotime.data.exception.ChaloTimeFetchFailedException;
import app.chalo.features.chalotime.data.model.api.ChaloTimeResponseApiModel;
import app.chalo.features.chalotime.data.model.config.ChaloTimeRequestConfig;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.bj;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/data/remote/ChaloTimeRemoteDataSourceImpl;", "Lapp/chalo/features/chalotime/data/remote/ChaloTimeRemoteDataSource;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeRemoteDataSourceImpl implements ChaloTimeRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f2678a;

    public ChaloTimeRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f2678a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.chalotime.data.remote.ChaloTimeRemoteDataSource
    public final Object d(ChaloTimeRequestConfig chaloTimeRequestConfig, ContinuationImpl continuationImpl) throws Exception {
        ChaloTimeRemoteDataSourceImpl$fetchChaloTime$1 chaloTimeRemoteDataSourceImpl$fetchChaloTime$1;
        if (continuationImpl instanceof ChaloTimeRemoteDataSourceImpl$fetchChaloTime$1) {
            chaloTimeRemoteDataSourceImpl$fetchChaloTime$1 = (ChaloTimeRemoteDataSourceImpl$fetchChaloTime$1) continuationImpl;
            int i = chaloTimeRemoteDataSourceImpl$fetchChaloTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloTimeRemoteDataSourceImpl$fetchChaloTime$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloTimeRemoteDataSourceImpl$fetchChaloTime$1 = new ChaloTimeRemoteDataSourceImpl$fetchChaloTime$1(this, continuationImpl);
            }
        } else {
            chaloTimeRemoteDataSourceImpl$fetchChaloTime$1 = new ChaloTimeRemoteDataSourceImpl$fetchChaloTime$1(this, continuationImpl);
        }
        Object objC = chaloTimeRemoteDataSourceImpl$fetchChaloTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloTimeRemoteDataSourceImpl$fetchChaloTime$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f2678a.d();
            networkRequestBuilderD.j(chaloTimeRequestConfig.f2677a);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.k(chaloTimeRequestConfig.b);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            chaloTimeRemoteDataSourceImpl$fetchChaloTime$1.label = 1;
            objC = chaloRequestE.c(chaloTimeRemoteDataSourceImpl$fetchChaloTime$1);
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
            int i3 = networkResponse.f;
            if (i3 == 401 || i3 == 403) {
                throw new ChaloTimeFetchFailedException(null, true);
            }
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new bj(25));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(ChaloTimeResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ChaloTimeResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (ChaloTimeResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
