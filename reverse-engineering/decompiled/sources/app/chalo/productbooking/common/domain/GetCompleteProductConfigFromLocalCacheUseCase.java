package app.chalo.productbooking.common.domain;

import app.chalo.datastore.LocalDataStore;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.mappers.ProductBookingCommonApiToAppModelsMappersKt;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsApiResponseModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/GetCompleteProductConfigFromLocalCacheUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetCompleteProductConfigFromLocalCacheUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f8265a;

    public GetCompleteProductConfigFromLocalCacheUseCase(LocalDataStore localDataStore) {
        this.f8265a = localDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetCompleteProductConfigFromLocalCacheUseCase$invoke$1 getCompleteProductConfigFromLocalCacheUseCase$invoke$1;
        Object objB;
        if (continuationImpl instanceof GetCompleteProductConfigFromLocalCacheUseCase$invoke$1) {
            getCompleteProductConfigFromLocalCacheUseCase$invoke$1 = (GetCompleteProductConfigFromLocalCacheUseCase$invoke$1) continuationImpl;
            int i = getCompleteProductConfigFromLocalCacheUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCompleteProductConfigFromLocalCacheUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCompleteProductConfigFromLocalCacheUseCase$invoke$1 = new GetCompleteProductConfigFromLocalCacheUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getCompleteProductConfigFromLocalCacheUseCase$invoke$1 = new GetCompleteProductConfigFromLocalCacheUseCase$invoke$1(this, continuationImpl);
        }
        Object objF = getCompleteProductConfigFromLocalCacheUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getCompleteProductConfigFromLocalCacheUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            getCompleteProductConfigFromLocalCacheUseCase$invoke$1.label = 1;
            objF = this.f8265a.f(str, getCompleteProductConfigFromLocalCacheUseCase$invoke$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        String str2 = (String) objF;
        if (str2 != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str2, ProductConfigCompleteDetailsApiResponseModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel = (ProductConfigCompleteDetailsApiResponseModel) objB;
            if (productConfigCompleteDetailsApiResponseModel != null) {
                return ProductBookingCommonApiToAppModelsMappersKt.a(productConfigCompleteDetailsApiResponseModel);
            }
        }
        return null;
    }
}
