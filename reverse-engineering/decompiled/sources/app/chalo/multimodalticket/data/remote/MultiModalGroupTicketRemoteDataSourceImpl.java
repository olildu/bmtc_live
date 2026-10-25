package app.chalo.multimodalticket.data.remote;

import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketBookingFareRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketBookingFareResponseApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.lj0;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/multimodalticket/data/remote/MultiModalGroupTicketRemoteDataSourceImpl;", "Lapp/chalo/multimodalticket/data/remote/MultiModalGroupTicketRemoteDataSource;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketRemoteDataSourceImpl implements MultiModalGroupTicketRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f5879a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/multimodalticket/data/remote/MultiModalGroupTicketRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_FETCH_TICKET_BOOKING_FARE_DETAILS", "Ljava/lang/String;", "SUB_URL_FETCH_GROUP_TICKET_SUMMARY", "SUB_URL_CREATE_GROUP_TICKET_ORDER", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MultiModalGroupTicketRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f5879a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.multimodalticket.data.remote.MultiModalGroupTicketRemoteDataSource
    public final Object a(GroupTicketBookingFareRequestApiModel groupTicketBookingFareRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        MultiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1 multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1;
        if (continuationImpl instanceof MultiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1) {
            multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1 = (MultiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1) continuationImpl;
            int i = multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1 = new MultiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1 = new MultiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1(this, continuationImpl);
        }
        Object objC = multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5879a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/journey/fare");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(GroupTicketBookingFareRequestApiModel.INSTANCE.serializer(), groupTicketBookingFareRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1.label = 1;
            objC = chaloRequestE.c(multiModalGroupTicketRemoteDataSourceImpl$getTicketBookingFareDetails$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new lj0(3));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(GroupTicketBookingFareResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(GroupTicketBookingFareResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (GroupTicketBookingFareResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.multimodalticket.data.remote.MultiModalGroupTicketRemoteDataSource
    public final Object b(GroupTicketSummaryRequestApiModel groupTicketSummaryRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        MultiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1 multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1;
        if (continuationImpl instanceof MultiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1) {
            multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1 = (MultiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1) continuationImpl;
            int i = multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1 = new MultiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1 = new MultiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1(this, continuationImpl);
        }
        Object objC = multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5879a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/journey/fare-summary");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(GroupTicketSummaryRequestApiModel.INSTANCE.serializer(), groupTicketSummaryRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1.label = 1;
            objC = chaloRequestE.c(multiModalGroupTicketRemoteDataSourceImpl$getGroupTicketSummary$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new lj0(5));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(GroupTicketSummaryResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(GroupTicketSummaryResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (GroupTicketSummaryResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.multimodalticket.data.remote.MultiModalGroupTicketRemoteDataSource
    public final Object c(GroupTicketCreateOrderRequestApiModel groupTicketCreateOrderRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        MultiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1 multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1;
        if (continuationImpl instanceof MultiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1) {
            multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1 = (MultiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1) continuationImpl;
            int i = multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1 = new MultiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1 = new MultiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1(this, continuationImpl);
        }
        Object objC = multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f5879a.d();
            networkRequestBuilderD.j("mticketing/v2/multimodal/journey/order");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(GroupTicketCreateOrderRequestApiModel.INSTANCE.serializer(), groupTicketCreateOrderRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1.label = 1;
            objC = chaloRequestE.c(multiModalGroupTicketRemoteDataSourceImpl$createGroupTicketOrder$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new lj0(4));
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
