package app.chalo.metro.remote;

import app.chalo.metro.data.api.MetroFinalFareResponseApiModel;
import app.chalo.metro.data.api.MetroLiveBookingStatusRequestApiModel;
import app.chalo.metro.data.api.MetroLiveBookingStatusResponseApiModel;
import app.chalo.metro.data.api.MetroTicketApiModel;
import app.chalo.metro.data.api.MetroTicketOrderRequestApiModel;
import app.chalo.metro.data.api.MetroTicketUpdateRequestApiModel;
import app.chalo.metro.data.api.MetroUpdateBookingApiModel;
import app.chalo.metro.data.api.TicketFinalFareRequestApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.productbooking.common.data.models.api.request.TicketBookingFareRequestApiModel;
import app.chalo.productbooking.common.data.models.api.response.TicketBookingFareResponseApiModel;
import defpackage.qi0;
import defpackage.t8;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/metro/remote/MetroRemoteDataSourceImpl;", "Lapp/chalo/metro/remote/MetroRemoteDataSource;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroRemoteDataSourceImpl implements MetroRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f5452a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lapp/chalo/metro/remote/MetroRemoteDataSourceImpl$Companion;", "", "", "PARAM_PRODUCT_TYPE", "Ljava/lang/String;", "PARAM_PRODUCT_SUB_TYPE", "PARAM_BOOKING_IDS", "SUB_URL_FETCH_TICKET_BOOKING_FARE_DETAILS", "SUB_URL_FINAL_FARE", "SUB_URL_CREATE_ORDER", "SUB_URL_FETCH_TICKET", "CHECK_METRO_STATUS_URL", "SUB_URL_UPDATE_BOOKING", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MetroRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f5452a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.metro.remote.MetroRemoteDataSource
    public final Object b(MetroLiveBookingStatusRequestApiModel metroLiveBookingStatusRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        MetroRemoteDataSourceImpl$getMetroLiveBookingStatus$1 metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1;
        if (continuationImpl instanceof MetroRemoteDataSourceImpl$getMetroLiveBookingStatus$1) {
            metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1 = (MetroRemoteDataSourceImpl$getMetroLiveBookingStatus$1) continuationImpl;
            int i = metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1 = new MetroRemoteDataSourceImpl$getMetroLiveBookingStatus$1(this, continuationImpl);
            }
        } else {
            metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1 = new MetroRemoteDataSourceImpl$getMetroLiveBookingStatus$1(this, continuationImpl);
        }
        Object objC = metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5452a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/ticket/status-check");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(MetroLiveBookingStatusRequestApiModel.INSTANCE.serializer(), metroLiveBookingStatusRequestApiModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1.label = 1;
            objC = chaloRequestE.c(metroRemoteDataSourceImpl$getMetroLiveBookingStatus$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qi0(6));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(MetroLiveBookingStatusResponseApiModel.INSTANCE.serializer())));
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
    @Override // app.chalo.metro.remote.MetroRemoteDataSource
    public final Object c(MetroTicketUpdateRequestApiModel metroTicketUpdateRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        MetroRemoteDataSourceImpl$updateBooking$1 metroRemoteDataSourceImpl$updateBooking$1;
        if (continuationImpl instanceof MetroRemoteDataSourceImpl$updateBooking$1) {
            metroRemoteDataSourceImpl$updateBooking$1 = (MetroRemoteDataSourceImpl$updateBooking$1) continuationImpl;
            int i = metroRemoteDataSourceImpl$updateBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRemoteDataSourceImpl$updateBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRemoteDataSourceImpl$updateBooking$1 = new MetroRemoteDataSourceImpl$updateBooking$1(this, continuationImpl);
            }
        } else {
            metroRemoteDataSourceImpl$updateBooking$1 = new MetroRemoteDataSourceImpl$updateBooking$1(this, continuationImpl);
        }
        Object objC = metroRemoteDataSourceImpl$updateBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRemoteDataSourceImpl$updateBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5452a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/update-booking");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(MetroTicketUpdateRequestApiModel.INSTANCE.serializer(), metroTicketUpdateRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            metroRemoteDataSourceImpl$updateBooking$1.label = 1;
            objC = chaloRequestE.c(metroRemoteDataSourceImpl$updateBooking$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qi0(3));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(MetroUpdateBookingApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(MetroUpdateBookingApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (MetroUpdateBookingApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.metro.remote.MetroRemoteDataSource
    public final Object d(TicketFinalFareRequestApiModel ticketFinalFareRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        MetroRemoteDataSourceImpl$getMetroFinalFare$1 metroRemoteDataSourceImpl$getMetroFinalFare$1;
        if (continuationImpl instanceof MetroRemoteDataSourceImpl$getMetroFinalFare$1) {
            metroRemoteDataSourceImpl$getMetroFinalFare$1 = (MetroRemoteDataSourceImpl$getMetroFinalFare$1) continuationImpl;
            int i = metroRemoteDataSourceImpl$getMetroFinalFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRemoteDataSourceImpl$getMetroFinalFare$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRemoteDataSourceImpl$getMetroFinalFare$1 = new MetroRemoteDataSourceImpl$getMetroFinalFare$1(this, continuationImpl);
            }
        } else {
            metroRemoteDataSourceImpl$getMetroFinalFare$1 = new MetroRemoteDataSourceImpl$getMetroFinalFare$1(this, continuationImpl);
        }
        Object objC = metroRemoteDataSourceImpl$getMetroFinalFare$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRemoteDataSourceImpl$getMetroFinalFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5452a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/fareBreakup");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(TicketFinalFareRequestApiModel.INSTANCE.serializer(), ticketFinalFareRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            metroRemoteDataSourceImpl$getMetroFinalFare$1.label = 1;
            objC = chaloRequestE.c(metroRemoteDataSourceImpl$getMetroFinalFare$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qi0(5));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(MetroFinalFareResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(MetroFinalFareResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (MetroFinalFareResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.metro.remote.MetroRemoteDataSource
    public final Object e(String str, ContinuationImpl continuationImpl) throws Exception {
        MetroRemoteDataSourceImpl$fetchMetroTicketProductById$1 metroRemoteDataSourceImpl$fetchMetroTicketProductById$1;
        if (continuationImpl instanceof MetroRemoteDataSourceImpl$fetchMetroTicketProductById$1) {
            metroRemoteDataSourceImpl$fetchMetroTicketProductById$1 = (MetroRemoteDataSourceImpl$fetchMetroTicketProductById$1) continuationImpl;
            int i = metroRemoteDataSourceImpl$fetchMetroTicketProductById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRemoteDataSourceImpl$fetchMetroTicketProductById$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRemoteDataSourceImpl$fetchMetroTicketProductById$1 = new MetroRemoteDataSourceImpl$fetchMetroTicketProductById$1(this, continuationImpl);
            }
        } else {
            metroRemoteDataSourceImpl$fetchMetroTicketProductById$1 = new MetroRemoteDataSourceImpl$fetchMetroTicketProductById$1(this, continuationImpl);
        }
        Object objC = metroRemoteDataSourceImpl$fetchMetroTicketProductById$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRemoteDataSourceImpl$fetchMetroTicketProductById$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5452a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/ticket");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("bookingId", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            metroRemoteDataSourceImpl$fetchMetroTicketProductById$1.label = 1;
            objC = chaloRequestE.c(metroRemoteDataSourceImpl$fetchMetroTicketProductById$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qi0(1));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(MetroTicketApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(MetroTicketApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (MetroTicketApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.metro.remote.MetroRemoteDataSource
    public final Object f(TicketBookingFareRequestApiModel ticketBookingFareRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        MetroRemoteDataSourceImpl$getTicketBookingFareDetails$1 metroRemoteDataSourceImpl$getTicketBookingFareDetails$1;
        if (continuationImpl instanceof MetroRemoteDataSourceImpl$getTicketBookingFareDetails$1) {
            metroRemoteDataSourceImpl$getTicketBookingFareDetails$1 = (MetroRemoteDataSourceImpl$getTicketBookingFareDetails$1) continuationImpl;
            int i = metroRemoteDataSourceImpl$getTicketBookingFareDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRemoteDataSourceImpl$getTicketBookingFareDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRemoteDataSourceImpl$getTicketBookingFareDetails$1 = new MetroRemoteDataSourceImpl$getTicketBookingFareDetails$1(this, continuationImpl);
            }
        } else {
            metroRemoteDataSourceImpl$getTicketBookingFareDetails$1 = new MetroRemoteDataSourceImpl$getTicketBookingFareDetails$1(this, continuationImpl);
        }
        Object objC = metroRemoteDataSourceImpl$getTicketBookingFareDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRemoteDataSourceImpl$getTicketBookingFareDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5452a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/fare");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(TicketBookingFareRequestApiModel.INSTANCE.serializer(), ticketBookingFareRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            metroRemoteDataSourceImpl$getTicketBookingFareDetails$1.label = 1;
            objC = chaloRequestE.c(metroRemoteDataSourceImpl$getTicketBookingFareDetails$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qi0(2));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(TicketBookingFareResponseApiModel.INSTANCE.serializer())));
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
    @Override // app.chalo.metro.remote.MetroRemoteDataSource
    public final Object g(MetroTicketOrderRequestApiModel metroTicketOrderRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        MetroRemoteDataSourceImpl$createMetroTicketOrder$1 metroRemoteDataSourceImpl$createMetroTicketOrder$1;
        if (continuationImpl instanceof MetroRemoteDataSourceImpl$createMetroTicketOrder$1) {
            metroRemoteDataSourceImpl$createMetroTicketOrder$1 = (MetroRemoteDataSourceImpl$createMetroTicketOrder$1) continuationImpl;
            int i = metroRemoteDataSourceImpl$createMetroTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroRemoteDataSourceImpl$createMetroTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                metroRemoteDataSourceImpl$createMetroTicketOrder$1 = new MetroRemoteDataSourceImpl$createMetroTicketOrder$1(this, continuationImpl);
            }
        } else {
            metroRemoteDataSourceImpl$createMetroTicketOrder$1 = new MetroRemoteDataSourceImpl$createMetroTicketOrder$1(this, continuationImpl);
        }
        Object objC = metroRemoteDataSourceImpl$createMetroTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroRemoteDataSourceImpl$createMetroTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5452a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/order");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(MetroTicketOrderRequestApiModel.INSTANCE.serializer(), metroTicketOrderRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            metroRemoteDataSourceImpl$createMetroTicketOrder$1.label = 1;
            objC = chaloRequestE.c(metroRemoteDataSourceImpl$createMetroTicketOrder$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new qi0(4));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(CreateOrderResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CreateOrderResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CreateOrderResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
