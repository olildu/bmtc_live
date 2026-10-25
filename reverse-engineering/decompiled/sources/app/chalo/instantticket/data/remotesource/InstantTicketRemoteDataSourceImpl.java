package app.chalo.instantticket.data.remotesource;

import app.chalo.instantticket.data.model.InstantTicketReceipt;
import app.chalo.instantticket.data.model.api.request.FetchMobileTicketFareRequestApiModel;
import app.chalo.instantticket.data.model.api.request.InstantTicketOrderRequestApiModel;
import app.chalo.instantticket.data.model.api.request.ValidateInstantTicketFareRequestApiModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModel;
import app.chalo.instantticket.data.model.api.response.InstantMobileTicketResponseApiModel;
import app.chalo.instantticket.data.model.api.response.ValidateInstantTicketFareResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.stringprovider.StringProvider;
import defpackage.t8;
import defpackage.y80;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/instantticket/data/remotesource/InstantTicketRemoteDataSourceImpl;", "Lapp/chalo/instantticket/data/remotesource/InstantTicketRemoteDataSource;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketRemoteDataSourceImpl implements InstantTicketRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f3896a;
    public final StringProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lapp/chalo/instantticket/data/remotesource/InstantTicketRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_CREATE_ORDER", "Ljava/lang/String;", "SUB_URL_INSTANT_TICKET", "SUB_URL_INSTANT_TICKET_RECEIPT", "BOOKING_ID_KEY", "PRODUCT_TYPE_KEY", "PRODUCT_SUB_TYPE_KEY", "FIND_FARE_SUB_URL", "VALIDATE_FARE_SUB_URL", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public InstantTicketRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, StringProvider stringProvider) {
        this.f3896a = networkManager;
        this.b = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource
    public final Object a(FetchMobileTicketFareRequestApiModel fetchMobileTicketFareRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        InstantTicketRemoteDataSourceImpl$getMobileTicketFare$1 instantTicketRemoteDataSourceImpl$getMobileTicketFare$1;
        if (continuationImpl instanceof InstantTicketRemoteDataSourceImpl$getMobileTicketFare$1) {
            instantTicketRemoteDataSourceImpl$getMobileTicketFare$1 = (InstantTicketRemoteDataSourceImpl$getMobileTicketFare$1) continuationImpl;
            int i = instantTicketRemoteDataSourceImpl$getMobileTicketFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRemoteDataSourceImpl$getMobileTicketFare$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRemoteDataSourceImpl$getMobileTicketFare$1 = new InstantTicketRemoteDataSourceImpl$getMobileTicketFare$1(this, continuationImpl);
            }
        } else {
            instantTicketRemoteDataSourceImpl$getMobileTicketFare$1 = new InstantTicketRemoteDataSourceImpl$getMobileTicketFare$1(this, continuationImpl);
        }
        Object objC = instantTicketRemoteDataSourceImpl$getMobileTicketFare$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRemoteDataSourceImpl$getMobileTicketFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f3896a.d();
            networkRequestBuilderD.j("mticketing/v2/mobile-ticket/fare");
            networkRequestBuilderD.b();
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(FetchMobileTicketFareRequestApiModel.INSTANCE.serializer(), fetchMobileTicketFareRequestApiModel));
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            instantTicketRemoteDataSourceImpl$getMobileTicketFare$1.label = 1;
            objC = chaloRequestE.c(instantTicketRemoteDataSourceImpl$getMobileTicketFare$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new y80(21));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(FetchMobileTicketFareResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(FetchMobileTicketFareResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (FetchMobileTicketFareResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource
    public final Object b(InstantTicketOrderRequestApiModel instantTicketOrderRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        InstantTicketRemoteDataSourceImpl$createInstantTicketOrder$1 instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1;
        if (continuationImpl instanceof InstantTicketRemoteDataSourceImpl$createInstantTicketOrder$1) {
            instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1 = (InstantTicketRemoteDataSourceImpl$createInstantTicketOrder$1) continuationImpl;
            int i = instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1 = new InstantTicketRemoteDataSourceImpl$createInstantTicketOrder$1(this, continuationImpl);
            }
        } else {
            instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1 = new InstantTicketRemoteDataSourceImpl$createInstantTicketOrder$1(this, continuationImpl);
        }
        Object objC = instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f3896a.d();
            networkRequestBuilderD.j("mticketing/v2/mobile-ticket/order");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(InstantTicketOrderRequestApiModel.INSTANCE.serializer(), instantTicketOrderRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1.label = 1;
            objC = chaloRequestE.c(instantTicketRemoteDataSourceImpl$createInstantTicketOrder$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new y80(20));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource
    public final Object c(String str, ContinuationImpl continuationImpl) throws Exception {
        InstantTicketRemoteDataSourceImpl$getInstantTicket$1 instantTicketRemoteDataSourceImpl$getInstantTicket$1;
        if (continuationImpl instanceof InstantTicketRemoteDataSourceImpl$getInstantTicket$1) {
            instantTicketRemoteDataSourceImpl$getInstantTicket$1 = (InstantTicketRemoteDataSourceImpl$getInstantTicket$1) continuationImpl;
            int i = instantTicketRemoteDataSourceImpl$getInstantTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRemoteDataSourceImpl$getInstantTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRemoteDataSourceImpl$getInstantTicket$1 = new InstantTicketRemoteDataSourceImpl$getInstantTicket$1(this, continuationImpl);
            }
        } else {
            instantTicketRemoteDataSourceImpl$getInstantTicket$1 = new InstantTicketRemoteDataSourceImpl$getInstantTicket$1(this, continuationImpl);
        }
        Object objC = instantTicketRemoteDataSourceImpl$getInstantTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRemoteDataSourceImpl$getInstantTicket$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f3896a.d();
            networkRequestBuilderD.j("mticketing/v2/mobile-ticket/bookings");
            networkRequestBuilderD.b();
            networkRequestBuilderD.h(MapsKt.i(new Pair("bookingId", str), new Pair("productType", "mobileTicket"), new Pair("productSubType", "instantTicket")));
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            instantTicketRemoteDataSourceImpl$getInstantTicket$1.label = 1;
            objC = chaloRequestE.c(instantTicketRemoteDataSourceImpl$getInstantTicket$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new y80(24));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(InstantMobileTicketResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(InstantMobileTicketResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (InstantMobileTicketResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource
    public final Object d(String str, ContinuationImpl continuationImpl) throws Exception {
        InstantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1 instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1;
        if (continuationImpl instanceof InstantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1) {
            instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1 = (InstantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1) continuationImpl;
            int i = instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1 = new InstantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1(this, continuationImpl);
            }
        } else {
            instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1 = new InstantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1(this, continuationImpl);
        }
        Object objC = instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f3896a.d();
            networkRequestBuilderD.j("mticketing/v2/mobile-ticket/receipt");
            networkRequestBuilderD.b();
            networkRequestBuilderD.h(MapsKt.i(new Pair("bookingId", str), new Pair("productType", "mobileTicket"), new Pair("productSubType", "instantTicket")));
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1.label = 1;
            objC = chaloRequestE.c(instantTicketRemoteDataSourceImpl$fetchInstantTicketReceipt$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new y80(23));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(new ArrayListSerializer(InstantTicketReceipt.INSTANCE.serializer())));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r10 == r1) goto L33;
     */
    @Override // app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, java.util.Map r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSourceImpl.e(java.lang.String, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource
    public final Object f(ValidateInstantTicketFareRequestApiModel validateInstantTicketFareRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        InstantTicketRemoteDataSourceImpl$validateInstantTicketFare$1 instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1;
        if (continuationImpl instanceof InstantTicketRemoteDataSourceImpl$validateInstantTicketFare$1) {
            instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1 = (InstantTicketRemoteDataSourceImpl$validateInstantTicketFare$1) continuationImpl;
            int i = instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1 = new InstantTicketRemoteDataSourceImpl$validateInstantTicketFare$1(this, continuationImpl);
            }
        } else {
            instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1 = new InstantTicketRemoteDataSourceImpl$validateInstantTicketFare$1(this, continuationImpl);
        }
        Object objC = instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f3896a.d();
            networkRequestBuilderD.j("mticketing/v2/mobile-ticket/validate-fare");
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(ValidateInstantTicketFareRequestApiModel.INSTANCE.serializer(), validateInstantTicketFareRequestApiModel));
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1.label = 1;
            objC = chaloRequestE.c(instantTicketRemoteDataSourceImpl$validateInstantTicketFare$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new y80(22));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(ValidateInstantTicketFareResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ValidateInstantTicketFareResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (ValidateInstantTicketFareResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
