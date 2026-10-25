package app.chalo.electricitybill.data.remote;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.electricitybill.data.exceptions.ElectricityBillConsumerNotFoundException;
import app.chalo.electricitybill.data.exceptions.ElectricityBillGetPaymentHistoryException;
import app.chalo.electricitybill.data.mapper.NetworkResponseToElectricityBillConsumerNotFoundExceptionMapper;
import app.chalo.electricitybill.data.mapper.NetworkResponseToElectricityBillGetPaymentHistoryExceptionMapper;
import app.chalo.electricitybill.data.model.apimodel.request.ElectricityBillPaymentCreateOrderRequestApiModel;
import app.chalo.electricitybill.data.model.apimodel.response.ElectricityBillPaymentHistoryResponseApiModel;
import app.chalo.electricitybill.data.model.apimodel.response.FetchElectricityBillResponseApiModel;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkErrorResponseParseException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.model.ChaloError;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.network.rest.generic.ErrorType;
import app.chalo.network.rest.generic.ErrorTypeKt;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.b00;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/electricitybill/data/remote/ElectricityBillRemoteDataSourceImpl;", "Lapp/chalo/electricitybill/data/remote/ElectricityBillRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectricityBillRemoteDataSourceImpl implements ElectricityBillRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f2541a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/electricitybill/data/remote/ElectricityBillRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_EBILL_GET_BILL_DETAILS", "Ljava/lang/String;", "SUB_URL_EBILL_CREATE_ORDER", "SUB_URL_EBILL_PAYMENT_HISTORY", "PARAM_ACC_NO", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ElectricityBillRemoteDataSourceImpl(NetworkManager networkManager, NetworkResponseToElectricityBillConsumerNotFoundExceptionMapper networkResponseToElectricityBillConsumerNotFoundExceptionMapper, GenericNetworkExceptionMapper genericNetworkExceptionMapper, NetworkResponseToElectricityBillGetPaymentHistoryExceptionMapper networkResponseToElectricityBillGetPaymentHistoryExceptionMapper) {
        this.f2541a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.electricitybill.data.remote.ElectricityBillRemoteDataSource
    public final Object a(ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException, ElectricityBillGetPaymentHistoryException {
        ElectricityBillRemoteDataSourceImpl$getPaymentHistory$1 electricityBillRemoteDataSourceImpl$getPaymentHistory$1;
        Object objB;
        if (continuationImpl instanceof ElectricityBillRemoteDataSourceImpl$getPaymentHistory$1) {
            electricityBillRemoteDataSourceImpl$getPaymentHistory$1 = (ElectricityBillRemoteDataSourceImpl$getPaymentHistory$1) continuationImpl;
            int i = electricityBillRemoteDataSourceImpl$getPaymentHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                electricityBillRemoteDataSourceImpl$getPaymentHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                electricityBillRemoteDataSourceImpl$getPaymentHistory$1 = new ElectricityBillRemoteDataSourceImpl$getPaymentHistory$1(this, continuationImpl);
            }
        } else {
            electricityBillRemoteDataSourceImpl$getPaymentHistory$1 = new ElectricityBillRemoteDataSourceImpl$getPaymentHistory$1(this, continuationImpl);
        }
        Object objC = electricityBillRemoteDataSourceImpl$getPaymentHistory$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = electricityBillRemoteDataSourceImpl$getPaymentHistory$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f2541a.d();
            networkRequestBuilderD.j("mticketing/v2/ebill/payments/history");
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            electricityBillRemoteDataSourceImpl$getPaymentHistory$1.label = 1;
            objC = chaloRequestE.c(electricityBillRemoteDataSourceImpl$getPaymentHistory$1);
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
        NetworkCrashlyticsLogger networkCrashlyticsLogger = networkResponse.g;
        String str = networkResponse.c;
        Object objB2 = null;
        if (z) {
            Json json = ChaloJson.b;
            NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
            if (str != null) {
                try {
                    json.getClass();
                    objB2 = json.b(str, BuiltinSerializersKt.c(ElectricityBillPaymentHistoryResponseApiModel.INSTANCE.serializer()));
                } catch (Exception e) {
                    networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(ElectricityBillPaymentHistoryResponseApiModel.class, e.getMessage(), str));
                    networkCrashlyticsLogger.b(networkSuccessResponseParseException);
                }
            }
            if (objB2 != null) {
                return (ElectricityBillPaymentHistoryResponseApiModel) objB2;
            }
            throw networkSuccessResponseParseException;
        }
        if (str != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(GenericChaloErrorResponse.INSTANCE.serializer()));
            } catch (Exception e2) {
                networkCrashlyticsLogger.b(new NetworkErrorResponseParseException(t8.g(GenericChaloErrorResponse.class, e2.getMessage(), str)));
                objB = null;
            }
        } else {
            objB = null;
        }
        GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) objB;
        if (genericChaloErrorResponse == null) {
            try {
                Json json3 = ChaloJson.b;
                if (str == null) {
                    str = "";
                }
                JsonObject jsonObjectG = JsonElementKt.g(json3.f(str));
                genericChaloErrorResponse = new GenericChaloErrorResponse(Intrinsics.d(JsonElementExtensionsKt.s(jsonObjectG, "errorType", "UNKNOWN"), "AUTHENTICATION_ERROR") ? TypedValues.CycleType.TYPE_CURVE_FIT : ErrorTypeKt.a(ErrorType.TYPE_UNKNOWN), JsonElementExtensionsKt.s(jsonObjectG, "errorMessage", ""), null);
            } catch (Exception unused) {
                genericChaloErrorResponse = new GenericChaloErrorResponse(ErrorTypeKt.a(ErrorType.TYPE_UNKNOWN), "", null);
            }
        }
        String str2 = genericChaloErrorResponse.b;
        throw new ElectricityBillGetPaymentHistoryException(genericChaloErrorResponse, str2 != null ? str2 : "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.electricitybill.data.remote.ElectricityBillRemoteDataSource
    public final Object b(String str, ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException, ElectricityBillConsumerNotFoundException {
        ElectricityBillRemoteDataSourceImpl$fetchElectricityBill$1 electricityBillRemoteDataSourceImpl$fetchElectricityBill$1;
        Object objB;
        GenericChaloErrorResponse genericChaloErrorResponse;
        if (continuationImpl instanceof ElectricityBillRemoteDataSourceImpl$fetchElectricityBill$1) {
            electricityBillRemoteDataSourceImpl$fetchElectricityBill$1 = (ElectricityBillRemoteDataSourceImpl$fetchElectricityBill$1) continuationImpl;
            int i = electricityBillRemoteDataSourceImpl$fetchElectricityBill$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                electricityBillRemoteDataSourceImpl$fetchElectricityBill$1.label = i - Integer.MIN_VALUE;
            } else {
                electricityBillRemoteDataSourceImpl$fetchElectricityBill$1 = new ElectricityBillRemoteDataSourceImpl$fetchElectricityBill$1(this, continuationImpl);
            }
        } else {
            electricityBillRemoteDataSourceImpl$fetchElectricityBill$1 = new ElectricityBillRemoteDataSourceImpl$fetchElectricityBill$1(this, continuationImpl);
        }
        Object objC = electricityBillRemoteDataSourceImpl$fetchElectricityBill$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = electricityBillRemoteDataSourceImpl$fetchElectricityBill$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f2541a.d();
            networkRequestBuilderD.j("mticketing/v2/ebill/getBillDetails");
            networkRequestBuilderD.a("accNo", str, networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            networkRequestBuilderD.f(HttpRequestType.GET);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            electricityBillRemoteDataSourceImpl$fetchElectricityBill$1.label = 1;
            objC = chaloRequestE.c(electricityBillRemoteDataSourceImpl$fetchElectricityBill$1);
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
        NetworkCrashlyticsLogger networkCrashlyticsLogger = networkResponse.g;
        String str2 = networkResponse.c;
        Object objB2 = null;
        if (z) {
            Json json = ChaloJson.b;
            NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
            if (str2 != null) {
                try {
                    json.getClass();
                    objB2 = json.b(str2, BuiltinSerializersKt.c(FetchElectricityBillResponseApiModel.INSTANCE.serializer()));
                } catch (Exception e) {
                    networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(FetchElectricityBillResponseApiModel.class, e.getMessage(), str2));
                    networkCrashlyticsLogger.b(networkSuccessResponseParseException);
                }
            }
            if (objB2 != null) {
                return (FetchElectricityBillResponseApiModel) objB2;
            }
            throw networkSuccessResponseParseException;
        }
        if (str2 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str2, BuiltinSerializersKt.c(ChaloError.INSTANCE.serializer()));
            } catch (Exception e2) {
                networkCrashlyticsLogger.b(new NetworkErrorResponseParseException(t8.g(ChaloError.class, e2.getMessage(), str2)));
                objB = null;
            }
        } else {
            objB = null;
        }
        ChaloError chaloError = (ChaloError) objB;
        if (chaloError == null || (genericChaloErrorResponse = chaloError.f6493a) == null) {
            try {
                Json json3 = ChaloJson.b;
                if (str2 == null) {
                    str2 = "";
                }
                JsonObject jsonObjectG = JsonElementKt.g(json3.f(str2));
                genericChaloErrorResponse = new GenericChaloErrorResponse(Intrinsics.d(JsonElementExtensionsKt.s(jsonObjectG, "errorType", "UNKNOWN"), "AUTHENTICATION_ERROR") ? TypedValues.CycleType.TYPE_CURVE_FIT : ErrorTypeKt.a(ErrorType.TYPE_UNKNOWN), JsonElementExtensionsKt.s(jsonObjectG, "errorMessage", ""), null);
            } catch (Exception unused) {
                genericChaloErrorResponse = new GenericChaloErrorResponse(ErrorTypeKt.a(ErrorType.TYPE_UNKNOWN), "", null);
            }
        }
        throw new ElectricityBillConsumerNotFoundException(genericChaloErrorResponse, genericChaloErrorResponse.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.electricitybill.data.remote.ElectricityBillRemoteDataSource
    public final Object c(ElectricityBillPaymentCreateOrderRequestApiModel electricityBillPaymentCreateOrderRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        ElectricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1 electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1;
        if (continuationImpl instanceof ElectricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1) {
            electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1 = (ElectricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1) continuationImpl;
            int i = electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1 = new ElectricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1(this, continuationImpl);
            }
        } else {
            electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1 = new ElectricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1(this, continuationImpl);
        }
        Object objC = electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f2541a.d();
            networkRequestBuilderD.j("mticketing/v3/ebill/createOrder");
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(ElectricityBillPaymentCreateOrderRequestApiModel.INSTANCE.serializer(), electricityBillPaymentCreateOrderRequestApiModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1.label = 1;
            objC = chaloRequestE.c(electricityBillRemoteDataSourceImpl$createElectricityBillPaymentOrder$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new b00(20));
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
