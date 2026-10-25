package app.chalo.superpass.data.remote;

import app.chalo.contract.BasicInfoContract;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.superpass.data.models.DigitalTripReceiptRemoteApiRequestModel;
import app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel;
import defpackage.nw;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/superpass/data/remote/DigitalTripReceiptRemoteDataSourceImpl;", "Lapp/chalo/superpass/data/remote/DigitalTripReceiptRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DigitalTripReceiptRemoteDataSourceImpl implements DigitalTripReceiptRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f9591a;
    public final BasicInfoContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/remote/DigitalTripReceiptRemoteDataSourceImpl$Companion;", "", "", "SUB_URL_SYNC_ACTIVATIONS", "Ljava/lang/String;", "APP_VER", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public DigitalTripReceiptRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, BasicInfoContract basicInfoContract) {
        this.f9591a = networkManager;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.superpass.data.remote.DigitalTripReceiptRemoteDataSource
    public final Object a(DigitalTripReceiptRemoteApiRequestModel digitalTripReceiptRemoteApiRequestModel, ContinuationImpl continuationImpl) throws Exception {
        DigitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1 digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1;
        if (continuationImpl instanceof DigitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1) {
            digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1 = (DigitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1) continuationImpl;
            int i = digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1 = new DigitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1(this, continuationImpl);
            }
        } else {
            digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1 = new DigitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1(this, continuationImpl);
        }
        Object objC = digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f9591a.d();
            networkRequestBuilderD.j("mticketing/v2/punch/syncHistory");
            networkRequestBuilderD.a("appVer", String.valueOf(this.b.h()), networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(DigitalTripReceiptRemoteApiRequestModel.INSTANCE.serializer(), digitalTripReceiptRemoteApiRequestModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1.label = 1;
            objC = chaloRequestE.c(digitalTripReceiptRemoteDataSourceImpl$syncActivationsAndFetchSuperPassTripReceiptsIfRequired$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new nw(15));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }
}
