package app.chalo.ridefeedback.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.ridefeedback.data.api.RideFeedbackRequestApiModel;
import app.chalo.ridefeedback.data.api.RideFeedbackResponseApiModel;
import defpackage.g11;
import defpackage.t8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridefeedback/data/remote/RideFeedbackRemoteDataSourceImpl;", "Lapp/chalo/ridefeedback/data/remote/RideFeedbackRemoteDataSource;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackRemoteDataSourceImpl implements RideFeedbackRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f9073a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ridefeedback/data/remote/RideFeedbackRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_FEEDBACK", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RideFeedbackRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f9073a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ridefeedback.data.remote.RideFeedbackRemoteDataSource
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) throws Exception {
        RideFeedbackRemoteDataSourceImpl$submitFeedback$1 rideFeedbackRemoteDataSourceImpl$submitFeedback$1;
        if (continuationImpl instanceof RideFeedbackRemoteDataSourceImpl$submitFeedback$1) {
            rideFeedbackRemoteDataSourceImpl$submitFeedback$1 = (RideFeedbackRemoteDataSourceImpl$submitFeedback$1) continuationImpl;
            int i = rideFeedbackRemoteDataSourceImpl$submitFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackRemoteDataSourceImpl$submitFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackRemoteDataSourceImpl$submitFeedback$1 = new RideFeedbackRemoteDataSourceImpl$submitFeedback$1(this, continuationImpl);
            }
        } else {
            rideFeedbackRemoteDataSourceImpl$submitFeedback$1 = new RideFeedbackRemoteDataSourceImpl$submitFeedback$1(this, continuationImpl);
        }
        Object objC = rideFeedbackRemoteDataSourceImpl$submitFeedback$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackRemoteDataSourceImpl$submitFeedback$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f9073a.d();
            networkRequestBuilderD.j("mticketing/v1/feedback");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(new ArrayListSerializer(RideFeedbackRequestApiModel.INSTANCE.serializer()), arrayList));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            rideFeedbackRemoteDataSourceImpl$submitFeedback$1.label = 1;
            objC = chaloRequestE.c(rideFeedbackRemoteDataSourceImpl$submitFeedback$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new g11(24));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(RideFeedbackResponseApiModel.INSTANCE.serializer())));
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
