package app.chalo.usecase;

import app.chalo.datastore.LocalDataStore;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetProductConfigFromProductIdUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProductConfigFromProductIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f10189a;
    public final FetchCompleteProductConfigByIdUseCase b;

    public GetProductConfigFromProductIdUseCase(LocalDataStore localDataStore, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase) {
        this.f10189a = localDataStore;
        this.b = fetchCompleteProductConfigByIdUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetProductConfigFromProductIdUseCase$invoke$1 getProductConfigFromProductIdUseCase$invoke$1;
        Object objB;
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel;
        String str2;
        ChaloUseCaseResult chaloUseCaseResult;
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel2;
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel3;
        if (continuationImpl instanceof GetProductConfigFromProductIdUseCase$invoke$1) {
            getProductConfigFromProductIdUseCase$invoke$1 = (GetProductConfigFromProductIdUseCase$invoke$1) continuationImpl;
            int i = getProductConfigFromProductIdUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProductConfigFromProductIdUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getProductConfigFromProductIdUseCase$invoke$1 = new GetProductConfigFromProductIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getProductConfigFromProductIdUseCase$invoke$1 = new GetProductConfigFromProductIdUseCase$invoke$1(this, continuationImpl);
        }
        GetProductConfigFromProductIdUseCase$invoke$1 getProductConfigFromProductIdUseCase$invoke$2 = getProductConfigFromProductIdUseCase$invoke$1;
        Object objF = getProductConfigFromProductIdUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProductConfigFromProductIdUseCase$invoke$2.label;
        LocalDataStore localDataStore = this.f10189a;
        String strA = null;
        if (i2 == 0) {
            ResultKt.b(objF);
            getProductConfigFromProductIdUseCase$invoke$2.L$0 = str;
            getProductConfigFromProductIdUseCase$invoke$2.label = 1;
            objF = localDataStore.f(str, getProductConfigFromProductIdUseCase$invoke$2);
            if (objF != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) getProductConfigFromProductIdUseCase$invoke$2.L$0;
            ResultKt.b(objF);
        } else {
            if (i2 == 2) {
                str2 = (String) getProductConfigFromProductIdUseCase$invoke$2.L$0;
                ResultKt.b(objF);
                chaloUseCaseResult = (ChaloUseCaseResult) objF;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    return null;
                }
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                productConfigCompleteDetailsListAppModel2 = (ProductConfigCompleteDetailsListAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    strA = json.a(ProductConfigCompleteDetailsListAppModel.INSTANCE.serializer(), productConfigCompleteDetailsListAppModel2);
                } catch (Exception unused) {
                }
                if (strA != null) {
                    return productConfigCompleteDetailsListAppModel2;
                }
                getProductConfigFromProductIdUseCase$invoke$2.L$0 = productConfigCompleteDetailsListAppModel2;
                getProductConfigFromProductIdUseCase$invoke$2.label = 3;
                if (localDataStore.h(str2, strA, getProductConfigFromProductIdUseCase$invoke$2) != coroutineSingletons) {
                    productConfigCompleteDetailsListAppModel3 = productConfigCompleteDetailsListAppModel2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productConfigCompleteDetailsListAppModel3 = (ProductConfigCompleteDetailsListAppModel) getProductConfigFromProductIdUseCase$invoke$2.L$0;
            ResultKt.b(objF);
        }
        return productConfigCompleteDetailsListAppModel3;
        String str3 = (String) objF;
        if (str3 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str3, ProductConfigCompleteDetailsListAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB = null;
            }
            productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) objB;
        } else {
            productConfigCompleteDetailsListAppModel = null;
        }
        if (productConfigCompleteDetailsListAppModel != null) {
            return productConfigCompleteDetailsListAppModel;
        }
        getProductConfigFromProductIdUseCase$invoke$2.L$0 = str;
        getProductConfigFromProductIdUseCase$invoke$2.label = 2;
        String str4 = str;
        objF = FetchCompleteProductConfigByIdUseCase.b(this.b, str4, null, null, getProductConfigFromProductIdUseCase$invoke$2, 14);
        if (objF != coroutineSingletons) {
            str2 = str4;
            chaloUseCaseResult = (ChaloUseCaseResult) objF;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                return null;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            productConfigCompleteDetailsListAppModel2 = (ProductConfigCompleteDetailsListAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            Json json3 = ChaloJson.b;
            json3.getClass();
            strA = json3.a(ProductConfigCompleteDetailsListAppModel.INSTANCE.serializer(), productConfigCompleteDetailsListAppModel2);
            if (strA != null) {
                return productConfigCompleteDetailsListAppModel2;
            }
            getProductConfigFromProductIdUseCase$invoke$2.L$0 = productConfigCompleteDetailsListAppModel2;
            getProductConfigFromProductIdUseCase$invoke$2.label = 3;
            if (localDataStore.h(str2, strA, getProductConfigFromProductIdUseCase$invoke$2) != coroutineSingletons) {
                productConfigCompleteDetailsListAppModel3 = productConfigCompleteDetailsListAppModel2;
                return productConfigCompleteDetailsListAppModel3;
            }
        }
        return coroutineSingletons;
    }
}
