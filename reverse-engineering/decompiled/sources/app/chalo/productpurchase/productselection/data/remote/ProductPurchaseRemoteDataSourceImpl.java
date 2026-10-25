package app.chalo.productpurchase.productselection.data.remote;

import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.productpurchase.passpurchase.data.models.api.request.CreateSuperPassOrderRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.AllProductConfigsApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.FreeRideCountResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketFareResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketOrderCreationRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassApplicationSubmissionRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassApplicationSubmissionResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassCashPaymentInfoRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassCashPaymentInfoResponseApiModel;
import defpackage.t8;
import defpackage.yw0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/remote/ProductPurchaseRemoteDataSourceImpl;", "Lapp/chalo/productpurchase/productselection/data/remote/ProductPurchaseRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductPurchaseRemoteDataSourceImpl implements ProductPurchaseRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f8654a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/remote/ProductPurchaseRemoteDataSourceImpl$Companion;", "", "", "PATH_CITY", "Ljava/lang/String;", "PATH_AGENCY", "PATH_USER_ID", "QUERY_APP_VER", "QUERY_IS_PREMIUM_BUS_FEATURE_ENABLED", "PRODUCT_CONFIGURATIONS", "PASS_ORDER", "PASS_CASH_PAYMENT_INFO", "PASS_APPLICATION_SUBMISSION", "FREE_RIDE_COUNT", "MTICKET_ORDER_CREATION", "MTICKET_FARE_FETCH", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductPurchaseRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f8654a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource
    public final Object a(MTicketOrderCreationRequestApiModel mTicketOrderCreationRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        ProductPurchaseRemoteDataSourceImpl$createMTicketOrder$1 productPurchaseRemoteDataSourceImpl$createMTicketOrder$1;
        if (continuationImpl instanceof ProductPurchaseRemoteDataSourceImpl$createMTicketOrder$1) {
            productPurchaseRemoteDataSourceImpl$createMTicketOrder$1 = (ProductPurchaseRemoteDataSourceImpl$createMTicketOrder$1) continuationImpl;
            int i = productPurchaseRemoteDataSourceImpl$createMTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRemoteDataSourceImpl$createMTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRemoteDataSourceImpl$createMTicketOrder$1 = new ProductPurchaseRemoteDataSourceImpl$createMTicketOrder$1(this, continuationImpl);
            }
        } else {
            productPurchaseRemoteDataSourceImpl$createMTicketOrder$1 = new ProductPurchaseRemoteDataSourceImpl$createMTicketOrder$1(this, continuationImpl);
        }
        Object objC = productPurchaseRemoteDataSourceImpl$createMTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRemoteDataSourceImpl$createMTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f8654a.d();
            networkRequestBuilderD.j("mticketing/v2/ticket/order");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(MTicketOrderCreationRequestApiModel.INSTANCE.serializer(), mTicketOrderCreationRequestApiModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productPurchaseRemoteDataSourceImpl$createMTicketOrder$1.label = 1;
            objC = chaloRequestE.c(productPurchaseRemoteDataSourceImpl$createMTicketOrder$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(17));
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
    @Override // app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource
    public final Object b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, ContinuationImpl continuationImpl) throws Exception {
        ProductPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1 productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1;
        if (continuationImpl instanceof ProductPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1) {
            productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1 = (ProductPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1) continuationImpl;
            int i = productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1 = new ProductPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1(this, continuationImpl);
            }
        } else {
            productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1 = new ProductPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1(this, continuationImpl);
        }
        Object objC = productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String strR = StringsKt.R(StringsKt.R("mticketing/v1/cities/{city}/agencies/{agency}/ticket/details", "{city}", str), "{agency}", str2);
            NetworkRequestBuilder networkRequestBuilderD = this.f8654a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.f(HttpRequestType.GET);
            Pair pair = new Pair("routeId", str3);
            Pair pair2 = new Pair("routeName", str4);
            Pair pair3 = new Pair("startStopId", str5);
            Pair pair4 = new Pair("startStopName", str6);
            Pair pair5 = new Pair("endStopId", str7);
            Pair pair6 = new Pair("endStopName", str8);
            Intrinsics.i(list, "<this>");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(JsonElementKt.b((String) it.next()));
            }
            networkRequestBuilderD.h(MapsKt.i(pair, pair2, pair3, pair4, pair5, pair6, new Pair("specialFeatures", new JsonArray(arrayList).toString())));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1.label = 1;
            objC = chaloRequestE.c(productPurchaseRemoteDataSourceImpl$fetchMTicketFareBetweenStops$1);
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
        String str9 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(19));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str9 != null) {
            try {
                json.getClass();
                objB = json.b(str9, BuiltinSerializersKt.c(MTicketFareResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(MTicketFareResponseApiModel.class, e.getMessage(), str9));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (MTicketFareResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource
    public final Object c(CreateSuperPassOrderRequestApiModel createSuperPassOrderRequestApiModel, String str, ContinuationImpl continuationImpl) throws Exception {
        ProductPurchaseRemoteDataSourceImpl$createSuperPassOrder$1 productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1;
        if (continuationImpl instanceof ProductPurchaseRemoteDataSourceImpl$createSuperPassOrder$1) {
            productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1 = (ProductPurchaseRemoteDataSourceImpl$createSuperPassOrder$1) continuationImpl;
            int i = productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1 = new ProductPurchaseRemoteDataSourceImpl$createSuperPassOrder$1(this, continuationImpl);
            }
        } else {
            productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1 = new ProductPurchaseRemoteDataSourceImpl$createSuperPassOrder$1(this, continuationImpl);
        }
        Object objC = productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f8654a.d();
            networkRequestBuilderD.j(StringsKt.R("mticketing/v3/pass/order", "{city}", str));
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(CreateSuperPassOrderRequestApiModel.INSTANCE.serializer(), createSuperPassOrderRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1.label = 1;
            objC = chaloRequestE.c(productPurchaseRemoteDataSourceImpl$createSuperPassOrder$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(21));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(CreateOrderResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(CreateOrderResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (CreateOrderResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource
    public final Object d(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Exception {
        ProductPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1 productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1;
        if (continuationImpl instanceof ProductPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1) {
            productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1 = (ProductPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1) continuationImpl;
            int i = productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1 = new ProductPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1(this, continuationImpl);
            }
        } else {
            productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1 = new ProductPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1(this, continuationImpl);
        }
        Object objC = productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            String strR = StringsKt.R(StringsKt.R(StringsKt.R("mticketing/v1/cities/{city}/agencies/{agency}/user/{userId}/available-freeride", "{city}", lowerCase), "{agency}", str3), "{userId}", str);
            NetworkRequestBuilder networkRequestBuilderD = this.f8654a.d();
            networkRequestBuilderD.j(strR);
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1.label = 1;
            objC = chaloRequestE.c(productPurchaseRemoteDataSourceImpl$fetchFreeRidesCount$1);
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
        String str4 = networkResponse.c;
        Object objB = null;
        if (!z) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(22));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str4 != null) {
            try {
                json.getClass();
                objB = json.b(str4, BuiltinSerializersKt.c(FreeRideCountResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(FreeRideCountResponseApiModel.class, e.getMessage(), str4));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (FreeRideCountResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource
    public final Object e(String str, PassApplicationSubmissionRequestApiModel passApplicationSubmissionRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        ProductPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1 productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1;
        if (continuationImpl instanceof ProductPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1) {
            productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1 = (ProductPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1) continuationImpl;
            int i = productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1 = new ProductPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1(this, continuationImpl);
            }
        } else {
            productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1 = new ProductPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1(this, continuationImpl);
        }
        Object objC = productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f8654a.d();
            networkRequestBuilderD.j(StringsKt.R("mticketing/v2/city/{city}/passApplication", "{city}", str));
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.a("x-type", "pass", networkRequestBuilderD.f6519a.e);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PassApplicationSubmissionRequestApiModel.INSTANCE.serializer(), passApplicationSubmissionRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1.label = 1;
            objC = chaloRequestE.c(productPurchaseRemoteDataSourceImpl$submitSuperPassApplication$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(18));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(PassApplicationSubmissionResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PassApplicationSubmissionResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PassApplicationSubmissionResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource
    public final Object f(int i, String str, ContinuationImpl continuationImpl, boolean z) throws Exception {
        ProductPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1 productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1;
        if (continuationImpl instanceof ProductPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1) {
            productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1 = (ProductPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1) continuationImpl;
            int i2 = productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1.label = i2 - Integer.MIN_VALUE;
            } else {
                productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1 = new ProductPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1(this, continuationImpl);
            }
        } else {
            productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1 = new ProductPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1(this, continuationImpl);
        }
        Object objC = productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1.label;
        if (i3 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f8654a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j(StringsKt.R("configuration/v3/cities/{city}/products", "{city}", str));
            networkRequestBuilderD.a("appVer", String.valueOf(i), genericRequestData.f);
            networkRequestBuilderD.a("isPremiumBusFeatureEnabled", String.valueOf(z), genericRequestData.f);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1.label = 1;
            objC = chaloRequestE.c(productPurchaseRemoteDataSourceImpl$fetchAllProductsConfigs$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        boolean z2 = networkResponse.f6522a;
        String str2 = networkResponse.c;
        Object objB = null;
        if (!z2) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(23));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(AllProductConfigsApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(AllProductConfigsApiResponseModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (AllProductConfigsApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource
    public final Object g(PassCashPaymentInfoRequestApiModel passCashPaymentInfoRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        ProductPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1 productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1;
        if (continuationImpl instanceof ProductPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1) {
            productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1 = (ProductPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1) continuationImpl;
            int i = productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1 = new ProductPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1(this, continuationImpl);
            }
        } else {
            productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1 = new ProductPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1(this, continuationImpl);
        }
        Object objC = productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f8654a.d();
            networkRequestBuilderD.j("mticketing/v2/pass/payment/cash");
            networkRequestBuilderD.b();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(PassCashPaymentInfoRequestApiModel.INSTANCE.serializer(), passCashPaymentInfoRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1.label = 1;
            objC = chaloRequestE.c(productPurchaseRemoteDataSourceImpl$fetchCashPaymentInfo$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(20));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(PassCashPaymentInfoResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(PassCashPaymentInfoResponseApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (PassCashPaymentInfoResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
