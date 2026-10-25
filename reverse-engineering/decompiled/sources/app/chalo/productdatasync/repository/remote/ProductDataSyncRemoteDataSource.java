package app.chalo.productdatasync.repository.remote;

import app.chalo.features.productsync.model.api.HistoryResponseApiModel;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.providers.stringprovider.StringProvider;
import defpackage.t8;
import defpackage.yw0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productdatasync/repository/remote/ProductDataSyncRemoteDataSource;", "Lapp/chalo/productdatasync/repository/remote/IProductDataSyncRemoteDataSource;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductDataSyncRemoteDataSource implements IProductDataSyncRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f8315a;
    public final StringProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/productdatasync/repository/remote/ProductDataSyncRemoteDataSource$Companion;", "", "", "CITY_KEY", "Ljava/lang/String;", "IS_PREMIUM_BUS_FEATURE_ENABLED", "USER_ID", "HISTORY_CALL_ENDPOINT", "AUTO_LINK_DEVICE_ID_URL", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductDataSyncRemoteDataSource(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, StringProvider stringProvider) {
        this.f8315a = networkManager;
        this.b = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productdatasync.repository.remote.IProductDataSyncRemoteDataSource
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) throws Exception {
        ProductDataSyncRemoteDataSource$initiateProductDataSyncCall$1 productDataSyncRemoteDataSource$initiateProductDataSyncCall$1;
        if (continuationImpl instanceof ProductDataSyncRemoteDataSource$initiateProductDataSyncCall$1) {
            productDataSyncRemoteDataSource$initiateProductDataSyncCall$1 = (ProductDataSyncRemoteDataSource$initiateProductDataSyncCall$1) continuationImpl;
            int i = productDataSyncRemoteDataSource$initiateProductDataSyncCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDataSyncRemoteDataSource$initiateProductDataSyncCall$1.label = i - Integer.MIN_VALUE;
            } else {
                productDataSyncRemoteDataSource$initiateProductDataSyncCall$1 = new ProductDataSyncRemoteDataSource$initiateProductDataSyncCall$1(this, continuationImpl);
            }
        } else {
            productDataSyncRemoteDataSource$initiateProductDataSyncCall$1 = new ProductDataSyncRemoteDataSource$initiateProductDataSyncCall$1(this, continuationImpl);
        }
        Object objC = productDataSyncRemoteDataSource$initiateProductDataSyncCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productDataSyncRemoteDataSource$initiateProductDataSyncCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.f8315a.d();
            GenericRequestData genericRequestData = networkRequestBuilderD.f6519a;
            networkRequestBuilderD.j("mticketing/v2/user-purchase-history");
            networkRequestBuilderD.f(HttpRequestType.GET);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            networkRequestBuilderD.a("city", lowerCase, genericRequestData.e);
            networkRequestBuilderD.a("isPremiumBusFeatureEnabled", String.valueOf(z), genericRequestData.e);
            networkRequestBuilderD.b();
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            productDataSyncRemoteDataSource$initiateProductDataSyncCall$1.label = 1;
            objC = chaloRequestE.c(productDataSyncRemoteDataSource$initiateProductDataSyncCall$1);
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
        boolean z2 = networkResponse.f6522a;
        String str2 = networkResponse.c;
        Object objB = null;
        if (!z2) {
            throw GenericNetworkExceptionMapper.a(networkResponse, null, new yw0(15));
        }
        Json json = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        if (str2 != null) {
            try {
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(HistoryResponseApiModel.INSTANCE.serializer()));
            } catch (Exception e) {
                networkSuccessResponseParseException = new NetworkSuccessResponseParseException(t8.g(HistoryResponseApiModel.class, e.getMessage(), str2));
                networkResponse.g.b(networkSuccessResponseParseException);
            }
        }
        if (objB != null) {
            return (HistoryResponseApiModel) objB;
        }
        throw networkSuccessResponseParseException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // app.chalo.productdatasync.repository.remote.IProductDataSyncRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.home.data.model.api.request.AutoLinkDeviceIdRequestApiModel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productdatasync.repository.remote.ProductDataSyncRemoteDataSource.b(app.chalo.home.data.model.api.request.AutoLinkDeviceIdRequestApiModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
