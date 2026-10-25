package app.chalo.home.domain;

import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchAndStoreProductConfigByIdUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchAndStoreProductConfigByIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchCompleteProductConfigByIdUseCase f2989a;
    public final StoreCompleteProductConfigLocallyUseCase b;

    public FetchAndStoreProductConfigByIdUseCase(FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase) {
        this.f2989a = fetchCompleteProductConfigByIdUseCase;
        this.b = storeCompleteProductConfigLocallyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        FetchAndStoreProductConfigByIdUseCase$invoke$1 fetchAndStoreProductConfigByIdUseCase$invoke$1;
        if (continuationImpl instanceof FetchAndStoreProductConfigByIdUseCase$invoke$1) {
            fetchAndStoreProductConfigByIdUseCase$invoke$1 = (FetchAndStoreProductConfigByIdUseCase$invoke$1) continuationImpl;
            int i = fetchAndStoreProductConfigByIdUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchAndStoreProductConfigByIdUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchAndStoreProductConfigByIdUseCase$invoke$1 = new FetchAndStoreProductConfigByIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchAndStoreProductConfigByIdUseCase$invoke$1 = new FetchAndStoreProductConfigByIdUseCase$invoke$1(this, continuationImpl);
        }
        FetchAndStoreProductConfigByIdUseCase$invoke$1 fetchAndStoreProductConfigByIdUseCase$invoke$2 = fetchAndStoreProductConfigByIdUseCase$invoke$1;
        Object objB = fetchAndStoreProductConfigByIdUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchAndStoreProductConfigByIdUseCase$invoke$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            fetchAndStoreProductConfigByIdUseCase$invoke$2.label = 1;
            objB = FetchCompleteProductConfigByIdUseCase.b(this.f2989a, str, null, null, fetchAndStoreProductConfigByIdUseCase$invoke$2, 8);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
            return unit;
        }
        ResultKt.b(objB);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            fetchAndStoreProductConfigByIdUseCase$invoke$2.label = 2;
            if (this.b.a(productConfigCompleteDetailsListAppModel, fetchAndStoreProductConfigByIdUseCase$invoke$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
