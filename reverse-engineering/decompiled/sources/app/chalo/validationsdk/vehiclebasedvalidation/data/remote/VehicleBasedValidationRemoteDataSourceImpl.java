package app.chalo.validationsdk.vehiclebasedvalidation.data.remote;

import app.chalo.models.ondc.OndcTicketReceiptApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.validationsdk.vehiclebasedvalidation.data.models.api.VehicleValidationRequestApiModel;
import defpackage.do1;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/data/remote/VehicleBasedValidationRemoteDataSourceImpl;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/data/remote/VehicleBasedValidationRemoteDataSource;", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VehicleBasedValidationRemoteDataSourceImpl implements VehicleBasedValidationRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f10711a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/data/remote/VehicleBasedValidationRemoteDataSourceImpl$Companion;", "", "", "VALIDATE_ONDC_TICKETS_RECEIPT_SUB_URL", "Ljava/lang/String;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public VehicleBasedValidationRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f10711a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.vehiclebasedvalidation.data.remote.VehicleBasedValidationRemoteDataSource
    public final Object a(VehicleValidationRequestApiModel vehicleValidationRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        VehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1 vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1;
        if (continuationImpl instanceof VehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1) {
            vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1 = (VehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1) continuationImpl;
            int i = vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1 = new VehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1(this, continuationImpl);
            }
        } else {
            vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1 = new VehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1(this, continuationImpl);
        }
        Object objC = vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10711a.d();
            networkRequestBuilderD.j("ondc/buyer/v1/ticket/validate");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(VehicleValidationRequestApiModel.INSTANCE.serializer(), vehicleValidationRequestApiModel));
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1.label = 1;
            objC = chaloRequestE.c(vehicleBasedValidationRemoteDataSourceImpl$validateOndcTicketAndFetchReceipt$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new do1(9));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(OndcTicketReceiptApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(OndcTicketReceiptApiModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (OndcTicketReceiptApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
