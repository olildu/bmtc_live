package app.chalo.productbooking.common.domain;

import app.chalo.datastore.LocalDataStore;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.mappers.ProductBookingCommonApiToAppModelsMappersKt;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/FetchCompleteProductConfigByIdWithLocalCacheUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchCompleteProductConfigByIdWithLocalCacheUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f8261a;
    public final FetchCompleteProductConfigByIdUseCase b;

    public FetchCompleteProductConfigByIdWithLocalCacheUseCase(LocalDataStore localDataStore, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase) {
        this.f8261a = localDataStore;
        this.b = fetchCompleteProductConfigByIdUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        FetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1 fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1;
        Object objB;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModelA;
        if (continuationImpl instanceof FetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1) {
            fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1 = (FetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1) continuationImpl;
            int i = fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1 = new FetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1 = new FetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1(this, continuationImpl);
        }
        FetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1 fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2 = fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$1;
        Object objF = fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$0 = str;
            fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$1 = str2;
            fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$2 = str3;
            fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.label = 1;
            objF = this.f8261a.f(str, fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2);
            if (objF != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
            return objF;
        }
        str3 = (String) fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$2;
        str2 = (String) fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$1;
        str = (String) fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$0;
        ResultKt.b(objF);
        String str4 = str2;
        String str5 = str3;
        String str6 = (String) objF;
        if (str6 != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str6, ProductConfigCompleteDetailsApiResponseModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel = (ProductConfigCompleteDetailsApiResponseModel) objB;
            if (productConfigCompleteDetailsApiResponseModel != null && (productConfigCompleteDetailsAppModelA = ProductBookingCommonApiToAppModelsMappersKt.a(productConfigCompleteDetailsApiResponseModel)) != null) {
                EmptyList emptyList = EmptyList.f17557a;
                return new ChaloUseCaseResult.Success(new ProductConfigCompleteDetailsListAppModel(productConfigCompleteDetailsAppModelA, emptyList, emptyList));
            }
        }
        fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$0 = null;
        fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$1 = null;
        fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.L$2 = null;
        fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2.label = 2;
        Object objB2 = FetchCompleteProductConfigByIdUseCase.b(this.b, str, str4, str5, fetchCompleteProductConfigByIdWithLocalCacheUseCase$invoke$2, 8);
        return objB2 == coroutineSingletons ? coroutineSingletons : objB2;
    }
}
