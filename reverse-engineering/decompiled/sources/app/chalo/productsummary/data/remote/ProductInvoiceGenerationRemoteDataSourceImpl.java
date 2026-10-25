package app.chalo.productsummary.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.productsummary.data.exceptions.ProductInvoiceGenerationFailedException;
import app.chalo.productsummary.data.models.api.ProductInvoiceGenerationRequestApiModel;
import defpackage.yw0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productsummary/data/remote/ProductInvoiceGenerationRemoteDataSourceImpl;", "Lapp/chalo/productsummary/data/remote/ProductInvoiceGenerationRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductInvoiceGenerationRemoteDataSourceImpl implements ProductInvoiceGenerationRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f8712a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productsummary/data/remote/ProductInvoiceGenerationRemoteDataSourceImpl$Companion;", "", "", "PRODUCT_INVOICE_GENERATION_SUB_URL", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductInvoiceGenerationRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper) {
        this.f8712a = networkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v7, types: [byte[], java.io.Serializable] */
    @Override // app.chalo.productsummary.data.remote.ProductInvoiceGenerationRemoteDataSource
    public final Serializable a(ProductInvoiceGenerationRequestApiModel productInvoiceGenerationRequestApiModel, ContinuationImpl continuationImpl) throws Exception {
        ProductInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1 productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1;
        if (continuationImpl instanceof ProductInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1) {
            productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1 = (ProductInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1) continuationImpl;
            int i = productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1.label = i - Integer.MIN_VALUE;
            } else {
                productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1 = new ProductInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1(this, continuationImpl);
            }
        } else {
            productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1 = new ProductInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1(this, continuationImpl);
        }
        Object objC = productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f8712a.d();
            networkRequestBuilderD.j("mticketing/v1/reserve-ticket/download-invoice");
            networkRequestBuilderD.f(HttpRequestType.POST);
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(ProductInvoiceGenerationRequestApiModel.INSTANCE.serializer(), productInvoiceGenerationRequestApiModel));
            networkRequestBuilderD.f6519a.l = "application/json";
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1.label = 1;
            objC = chaloRequestE.c(productInvoiceGenerationRemoteDataSourceImpl$fetchProductInvoiceAsBytes$1);
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
        if (!networkResponse.f6522a) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(16));
        }
        ?? r6 = networkResponse.d;
        if (r6 != 0) {
            return r6;
        }
        throw new ProductInvoiceGenerationFailedException(null, "Response body is null");
    }
}
