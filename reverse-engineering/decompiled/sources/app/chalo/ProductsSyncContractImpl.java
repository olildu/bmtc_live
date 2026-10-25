package app.chalo;

import app.chalo.contract.ProductsSyncContract;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.usecase.ProductHistorySyncErrorType;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ProductsSyncContractImpl;", "Lapp/chalo/contract/ProductsSyncContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductsSyncContractImpl implements ProductsSyncContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitiateProductHistorySyncCallUseCase f717a;
    public final ContextScope b;

    public ProductsSyncContractImpl(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, CoroutineContextProvider coroutineContextProvider) {
        this.f717a = initiateProductHistorySyncCallUseCase;
        this.b = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    @Override // app.chalo.contract.ProductsSyncContract
    public final void a() {
        BuildersKt.d(this.b, null, null, new ProductsSyncContractImpl$syncHistoryCallInBackground$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.contract.ProductsSyncContract
    public final Object b(ContinuationImpl continuationImpl) {
        ProductsSyncContractImpl$syncHistoryCall$1 productsSyncContractImpl$syncHistoryCall$1;
        if (continuationImpl instanceof ProductsSyncContractImpl$syncHistoryCall$1) {
            productsSyncContractImpl$syncHistoryCall$1 = (ProductsSyncContractImpl$syncHistoryCall$1) continuationImpl;
            int i = productsSyncContractImpl$syncHistoryCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productsSyncContractImpl$syncHistoryCall$1.label = i - Integer.MIN_VALUE;
            } else {
                productsSyncContractImpl$syncHistoryCall$1 = new ProductsSyncContractImpl$syncHistoryCall$1(this, continuationImpl);
            }
        } else {
            productsSyncContractImpl$syncHistoryCall$1 = new ProductsSyncContractImpl$syncHistoryCall$1(this, continuationImpl);
        }
        Object objH = productsSyncContractImpl$syncHistoryCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productsSyncContractImpl$syncHistoryCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            productsSyncContractImpl$syncHistoryCall$1.label = 1;
            objH = InitiateProductHistorySyncCallUseCase.h(this.f717a, null, false, productsSyncContractImpl$syncHistoryCall$1, 3);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objH;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ChaloUseCaseResult.Success(Boolean.TRUE);
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return new ChaloUseCaseResult.Failure(((ProductHistorySyncErrorType) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f10215a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
