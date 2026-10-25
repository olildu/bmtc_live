package app.chalo.appsupport.data.remote;

import app.chalo.appsupport.data.models.api.CancelBookingRequestApiModel;
import app.chalo.appsupport.data.models.api.CancelBookingResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.t8;
import defpackage.wa;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/appsupport/data/remote/BookingHelpRemoteDataSourceImpl;", "Lapp/chalo/appsupport/data/remote/BookingHelpRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BookingHelpRemoteDataSourceImpl implements BookingHelpRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f981a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/appsupport/data/remote/BookingHelpRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_CANCEL_BOOKING", "Ljava/lang/String;", "SUB_URL_ONDC_CANCEL_BOOKING", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public BookingHelpRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f981a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.appsupport.data.remote.BookingHelpRemoteDataSource
    public final Object a(CancelBookingRequestApiModel cancelBookingRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        BookingHelpRemoteDataSourceImpl$cancelOndcBooking$1 bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1;
        if (continuationImpl instanceof BookingHelpRemoteDataSourceImpl$cancelOndcBooking$1) {
            bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1 = (BookingHelpRemoteDataSourceImpl$cancelOndcBooking$1) continuationImpl;
            int i = bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1 = new BookingHelpRemoteDataSourceImpl$cancelOndcBooking$1(this, continuationImpl);
            }
        } else {
            bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1 = new BookingHelpRemoteDataSourceImpl$cancelOndcBooking$1(this, continuationImpl);
        }
        Object objC = bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("ondc/buyer/v1/user-cancel/{bookingId}", "{bookingId}", cancelBookingRequestApiModel.f976a);
            NetworkRequestBuilder networkRequestBuilderD = this.f981a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1.label = 1;
            objC = chaloRequestE.c(bookingHelpRemoteDataSourceImpl$cancelOndcBooking$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new wa(7));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(CancelBookingResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CancelBookingResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CancelBookingResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.appsupport.data.remote.BookingHelpRemoteDataSource
    public final Object b(CancelBookingRequestApiModel cancelBookingRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        BookingHelpRemoteDataSourceImpl$cancelBooking$1 bookingHelpRemoteDataSourceImpl$cancelBooking$1;
        if (continuationImpl instanceof BookingHelpRemoteDataSourceImpl$cancelBooking$1) {
            bookingHelpRemoteDataSourceImpl$cancelBooking$1 = (BookingHelpRemoteDataSourceImpl$cancelBooking$1) continuationImpl;
            int i = bookingHelpRemoteDataSourceImpl$cancelBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bookingHelpRemoteDataSourceImpl$cancelBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                bookingHelpRemoteDataSourceImpl$cancelBooking$1 = new BookingHelpRemoteDataSourceImpl$cancelBooking$1(this, continuationImpl);
            }
        } else {
            bookingHelpRemoteDataSourceImpl$cancelBooking$1 = new BookingHelpRemoteDataSourceImpl$cancelBooking$1(this, continuationImpl);
        }
        Object objC = bookingHelpRemoteDataSourceImpl$cancelBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bookingHelpRemoteDataSourceImpl$cancelBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f981a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/booking-cancel");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(CancelBookingRequestApiModel.INSTANCE.serializer(), cancelBookingRequestApiModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            bookingHelpRemoteDataSourceImpl$cancelBooking$1.label = 1;
            objC = chaloRequestE.c(bookingHelpRemoteDataSourceImpl$cancelBooking$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new wa(8));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(CancelBookingResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CancelBookingResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CancelBookingResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
