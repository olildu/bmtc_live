package app.chalo.ridehailing.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.ridehailing.data.api.request.RideHailingBookingFeedbackRequestApiModel;
import app.chalo.ridehailing.data.api.response.RideHailingBookingFeedbackResponseApiModel;
import defpackage.g11;
import defpackage.t8;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridehailing/data/remote/RideHailingRemoteDataSourceImpl;", "Lapp/chalo/ridehailing/data/remote/RideHailingRemoteDataSource;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideHailingRemoteDataSourceImpl implements RideHailingRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f9127a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ridehailing/data/remote/RideHailingRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_BOOKING_FEEDBACK", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RideHailingRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f9127a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ridehailing.data.remote.RideHailingRemoteDataSource
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) throws Exception {
        RideHailingRemoteDataSourceImpl$submitBookingFeedback$1 rideHailingRemoteDataSourceImpl$submitBookingFeedback$1;
        if (continuationImpl instanceof RideHailingRemoteDataSourceImpl$submitBookingFeedback$1) {
            rideHailingRemoteDataSourceImpl$submitBookingFeedback$1 = (RideHailingRemoteDataSourceImpl$submitBookingFeedback$1) continuationImpl;
            int i = rideHailingRemoteDataSourceImpl$submitBookingFeedback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideHailingRemoteDataSourceImpl$submitBookingFeedback$1.label = i - Integer.MIN_VALUE;
            } else {
                rideHailingRemoteDataSourceImpl$submitBookingFeedback$1 = new RideHailingRemoteDataSourceImpl$submitBookingFeedback$1(this, continuationImpl);
            }
        } else {
            rideHailingRemoteDataSourceImpl$submitBookingFeedback$1 = new RideHailingRemoteDataSourceImpl$submitBookingFeedback$1(this, continuationImpl);
        }
        Object objC = rideHailingRemoteDataSourceImpl$submitBookingFeedback$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideHailingRemoteDataSourceImpl$submitBookingFeedback$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f9127a.d();
            networkRequestBuilderD.j("ondc/buyer/ridehailing/v1/booking/feedback");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(new ArrayListSerializer(RideHailingBookingFeedbackRequestApiModel.INSTANCE.serializer()), arrayList));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            rideHailingRemoteDataSourceImpl$submitBookingFeedback$1.label = 1;
            objC = chaloRequestE.c(rideHailingRemoteDataSourceImpl$submitBookingFeedback$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new g11(28));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(RideHailingBookingFeedbackResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(RideHailingBookingFeedbackResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (RideHailingBookingFeedbackResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
