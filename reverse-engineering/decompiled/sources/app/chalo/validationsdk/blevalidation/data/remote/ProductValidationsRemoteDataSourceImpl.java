package app.chalo.validationsdk.blevalidation.data.remote;

import app.chalo.contract.BasicInfoContract;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.validationsdk.blevalidation.data.models.api.FetchProductPunchDataForActivationApiReqModel;
import app.chalo.validationsdk.blevalidation.data.models.api.FetchProductPunchDataForActivationApiResponseModel;
import defpackage.t8;
import defpackage.yw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/remote/ProductValidationsRemoteDataSourceImpl;", "Lapp/chalo/validationsdk/blevalidation/data/remote/ProductValidationsRemoteDataSource;", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductValidationsRemoteDataSourceImpl implements ProductValidationsRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f10507a;
    public final BasicInfoContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/remote/ProductValidationsRemoteDataSourceImpl$Companion;", "", "", "PRODUCT_PUNCH_FETCH_SUB_URL", "Ljava/lang/String;", "TITO_TAPIN_DATA_FETCH_SUB_URL", "PARAM_PRODUCT_TYPE", "PARAM_PRODUCT_SUB_TYPE", "PARAM_BOOKING_ID", "PARAM_ACTIVATION_TS_IN_SEC", "PARAM_WALLET_ID", "PARAM_EXPIRY_TIMES_IN_MILLIS", "PARAM_APP_VER", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductValidationsRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, BasicInfoContract basicInfoContract) {
        this.f10507a = networkManager;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.remote.ProductValidationsRemoteDataSource
    public final Object a(FetchProductPunchDataForActivationApiReqModel fetchProductPunchDataForActivationApiReqModel, ContinuationImpl continuationImpl) throws Exception {
        ProductValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1 productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1;
        if (continuationImpl instanceof ProductValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1) {
            productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1 = (ProductValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1) continuationImpl;
            int i = productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1.label = i - Integer.MIN_VALUE;
            } else {
                productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1 = new ProductValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1(this, continuationImpl);
            }
        } else {
            productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1 = new ProductValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1(this, continuationImpl);
        }
        Object objC = productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f10507a.d();
            networkRequestBuilderD.j("pub/poll/product-punch ");
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(FetchProductPunchDataForActivationApiReqModel.INSTANCE.serializer(), fetchProductPunchDataForActivationApiReqModel));
            networkRequestBuilderD.a("appVer", String.valueOf(this.b.h()), networkRequestBuilderD.f6519a.f);
            networkRequestBuilderD.f(HttpRequestType.POST);
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1.label = 1;
            objC = chaloRequestE.c(productValidationsRemoteDataSourceImpl$fetchProductValidationDataForActivation$1);
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
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(29));
        }
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str != null) {
            try {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(FetchProductPunchDataForActivationApiResponseModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(FetchProductPunchDataForActivationApiResponseModel.class, e.getMessage(), str));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (FetchProductPunchDataForActivationApiResponseModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r15 == r1) goto L29;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.remote.ProductValidationsRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11, java.lang.String r13, java.lang.Long r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.data.remote.ProductValidationsRemoteDataSourceImpl.b(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
