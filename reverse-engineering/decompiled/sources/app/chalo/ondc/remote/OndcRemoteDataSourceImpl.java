package app.chalo.ondc.remote;

import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModel;
import app.chalo.metro.data.api.MetroLineStopListApiModel;
import app.chalo.models.ondc.OndcTicketReceiptApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.ondc.model.api.request.ONDCFetchFareRequestApiModel;
import app.chalo.ondc.model.api.request.OndcBookingRequestApiModel;
import app.chalo.ondc.model.api.request.OndcConfirmBookingApiModel;
import app.chalo.ondc.model.api.request.OndcOrderRequestApiModel;
import app.chalo.ondc.model.api.response.OndcBookingResponseApiModel;
import app.chalo.ondc.model.api.response.OndcMetroRouteSearchResponseApiModel;
import app.chalo.ondc.model.api.response.OndcMetroTicketProductDataApiResponseModel;
import app.chalo.ondc.model.api.response.OndcMobileTicketProductDataApiResponseModel;
import app.chalo.ondc.model.api.response.OndcRouteSearchResultApiModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.ln0;
import defpackage.t8;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ondc/remote/OndcRemoteDataSourceImpl;", "Lapp/chalo/ondc/remote/OndcRemoteDataSource;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcRemoteDataSourceImpl implements OndcRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f6782a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0013"}, d2 = {"Lapp/chalo/ondc/remote/OndcRemoteDataSourceImpl$Companion;", "", "", "PARAM_BOOKING_ID", "Ljava/lang/String;", "PARAM_PRODUCT_TYPE", "PARAM_PRODUCT_SUB_TYPE", "PARAM_CITY_ID", "ROUTE_ID", "TRANSIT_MODE", "ROUTE_BETWEEN_STOPS_ENDPOINT", "FIND_FARE_SUB_URL", "CREATE_BOOKING_SUB_URL", "CREATE_ORDER_SUB_URL", "ONDC_TICKETS_BOOKING_SUB_URL", "ONDC_TICKETS_RECEIPT_SUB_URL", "ONDC_TICKETS_COMPLETE_PURCHASE_SUB_URL", "METRO_LINES_INFO", "METRO_LINE_STOPS", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public OndcRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f6782a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object a(LinkedHashMap linkedHashMap, String str, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1 ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1) {
            ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1 = (OndcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1 = new OndcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1 = new OndcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R("ondc/buyer/v1/search/cityId/routes", "cityId", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.h(linkedHashMap);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$fetchRoutesForSelectedStops$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(20));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(OndcRouteSearchResultApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(OndcRouteSearchResultApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (OndcRouteSearchResultApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object b(String str, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$fetchOndcTicketReceipt$1 ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$fetchOndcTicketReceipt$1) {
            ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1 = (OndcRemoteDataSourceImpl$fetchOndcTicketReceipt$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1 = new OndcRemoteDataSourceImpl$fetchOndcTicketReceipt$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1 = new OndcRemoteDataSourceImpl$fetchOndcTicketReceipt$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j("ondc/buyer/v1/receipt");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("bookingId", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$fetchOndcTicketReceipt$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(18));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(OndcTicketReceiptApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(OndcTicketReceiptApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (OndcTicketReceiptApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object c(OndcOrderRequestApiModel ondcOrderRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$createOndcTicketOrder$1 ondcRemoteDataSourceImpl$createOndcTicketOrder$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$createOndcTicketOrder$1) {
            ondcRemoteDataSourceImpl$createOndcTicketOrder$1 = (OndcRemoteDataSourceImpl$createOndcTicketOrder$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$createOndcTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$createOndcTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$createOndcTicketOrder$1 = new OndcRemoteDataSourceImpl$createOndcTicketOrder$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$createOndcTicketOrder$1 = new OndcRemoteDataSourceImpl$createOndcTicketOrder$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$createOndcTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$createOndcTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j("ondc/buyer/v1/mobile-ticket/order");
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(OndcOrderRequestApiModel.INSTANCE.serializer(), ondcOrderRequestApiModel));
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$createOndcTicketOrder$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$createOndcTicketOrder$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(12));
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
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object d(OndcConfirmBookingApiModel ondcConfirmBookingApiModel, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$completeOndcPurchase$1 ondcRemoteDataSourceImpl$completeOndcPurchase$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$completeOndcPurchase$1) {
            ondcRemoteDataSourceImpl$completeOndcPurchase$1 = (OndcRemoteDataSourceImpl$completeOndcPurchase$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$completeOndcPurchase$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$completeOndcPurchase$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$completeOndcPurchase$1 = new OndcRemoteDataSourceImpl$completeOndcPurchase$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$completeOndcPurchase$1 = new OndcRemoteDataSourceImpl$completeOndcPurchase$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$completeOndcPurchase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$completeOndcPurchase$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j("ondc/buyer/v1/confirm-purchase");
            networkRequestBuilderD.f(HttpRequestType.GET);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(OndcConfirmBookingApiModel.INSTANCE.serializer(), ondcConfirmBookingApiModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$completeOndcPurchase$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$completeOndcPurchase$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(13));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(GenericMobileTicketProductApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(GenericMobileTicketProductApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (GenericMobileTicketProductApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object e(ONDCFetchFareRequestApiModel oNDCFetchFareRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$getMobileTicketFare$1 ondcRemoteDataSourceImpl$getMobileTicketFare$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$getMobileTicketFare$1) {
            ondcRemoteDataSourceImpl$getMobileTicketFare$1 = (OndcRemoteDataSourceImpl$getMobileTicketFare$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$getMobileTicketFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$getMobileTicketFare$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$getMobileTicketFare$1 = new OndcRemoteDataSourceImpl$getMobileTicketFare$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$getMobileTicketFare$1 = new OndcRemoteDataSourceImpl$getMobileTicketFare$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$getMobileTicketFare$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$getMobileTicketFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j("ondc/buyer/v1/fare");
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(ONDCFetchFareRequestApiModel.INSTANCE.serializer(), oNDCFetchFareRequestApiModel));
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$getMobileTicketFare$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$getMobileTicketFare$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(17));
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
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object f(String str, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$fetchOndcTicketProductById$1 ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$fetchOndcTicketProductById$1) {
            ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1 = (OndcRemoteDataSourceImpl$fetchOndcTicketProductById$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1 = new OndcRemoteDataSourceImpl$fetchOndcTicketProductById$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1 = new OndcRemoteDataSourceImpl$fetchOndcTicketProductById$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j("ondc/buyer/v1/ticket");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("bookingId", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$fetchOndcTicketProductById$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(14));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(OndcMobileTicketProductDataApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(OndcMobileTicketProductDataApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (OndcMobileTicketProductDataApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object g(String str, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1 ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1) {
            ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1 = (OndcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1 = new OndcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1 = new OndcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j("ondc/buyer/v1/ticket");
            networkRequestBuilderD.f(HttpRequestType.GET);
            networkRequestBuilderD.a("bookingId", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$fetchOndcMetroTicketProductById$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(16));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(OndcMetroTicketProductDataApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(OndcMetroTicketProductDataApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (OndcMetroTicketProductDataApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object h(String str, String str2, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$fetchMetroLineStopList$1 ondcRemoteDataSourceImpl$fetchMetroLineStopList$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$fetchMetroLineStopList$1) {
            ondcRemoteDataSourceImpl$fetchMetroLineStopList$1 = (OndcRemoteDataSourceImpl$fetchMetroLineStopList$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$fetchMetroLineStopList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$fetchMetroLineStopList$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$fetchMetroLineStopList$1 = new OndcRemoteDataSourceImpl$fetchMetroLineStopList$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$fetchMetroLineStopList$1 = new OndcRemoteDataSourceImpl$fetchMetroLineStopList$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$fetchMetroLineStopList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$fetchMetroLineStopList$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            Pair pair = new Pair("routeId", str2);
            String upperCase = chaloTransitMode.getMode().toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            Map mapI = MapsKt.i(pair, new Pair("transitMode", upperCase));
            String strR = StringsKt.R("ondc/buyer/v1/route/cityId/stops", "cityId", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.h(mapI);
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$fetchMetroLineStopList$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$fetchMetroLineStopList$1);
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
        String str3 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(15));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str3 != null) {
            try {
                json.getClass();
                objB = json.b(str3, BuiltinSerializersKt.c(MetroLineStopListApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(MetroLineStopListApiModel.class, e.getMessage(), str3));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (MetroLineStopListApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object i(String str, String str2, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$fetchMetroLines$1 ondcRemoteDataSourceImpl$fetchMetroLines$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$fetchMetroLines$1) {
            ondcRemoteDataSourceImpl$fetchMetroLines$1 = (OndcRemoteDataSourceImpl$fetchMetroLines$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$fetchMetroLines$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$fetchMetroLines$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$fetchMetroLines$1 = new OndcRemoteDataSourceImpl$fetchMetroLines$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$fetchMetroLines$1 = new OndcRemoteDataSourceImpl$fetchMetroLines$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$fetchMetroLines$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$fetchMetroLines$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            Map mapH = MapsKt.h(new Pair("transitMode", upperCase));
            String strR = StringsKt.R("ondc/buyer/v1/suggest/cityId/routes", "cityId", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.h(mapH);
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$fetchMetroLines$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$fetchMetroLines$1);
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
        String str3 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(19));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str3 != null) {
            try {
                json.getClass();
                objB = json.b(str3, BuiltinSerializersKt.c(OndcMetroRouteSearchResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(OndcMetroRouteSearchResponseApiModel.class, e.getMessage(), str3));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (OndcMetroRouteSearchResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ondc.remote.OndcRemoteDataSource
    public final Object j(OndcBookingRequestApiModel ondcBookingRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        OndcRemoteDataSourceImpl$createOndcBooking$1 ondcRemoteDataSourceImpl$createOndcBooking$1;
        if (continuationImpl instanceof OndcRemoteDataSourceImpl$createOndcBooking$1) {
            ondcRemoteDataSourceImpl$createOndcBooking$1 = (OndcRemoteDataSourceImpl$createOndcBooking$1) continuationImpl;
            int i = ondcRemoteDataSourceImpl$createOndcBooking$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcRemoteDataSourceImpl$createOndcBooking$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcRemoteDataSourceImpl$createOndcBooking$1 = new OndcRemoteDataSourceImpl$createOndcBooking$1(this, continuationImpl);
            }
        } else {
            ondcRemoteDataSourceImpl$createOndcBooking$1 = new OndcRemoteDataSourceImpl$createOndcBooking$1(this, continuationImpl);
        }
        Object objC = ondcRemoteDataSourceImpl$createOndcBooking$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcRemoteDataSourceImpl$createOndcBooking$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f6782a.d();
            networkRequestBuilderD.j("ondc/buyer/v1/booking");
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(OndcBookingRequestApiModel.INSTANCE.serializer(), ondcBookingRequestApiModel));
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            ondcRemoteDataSourceImpl$createOndcBooking$1.label = 1;
            objC = chaloRequestE.c(ondcRemoteDataSourceImpl$createOndcBooking$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new ln0(11));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(OndcBookingResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(OndcBookingResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (OndcBookingResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
