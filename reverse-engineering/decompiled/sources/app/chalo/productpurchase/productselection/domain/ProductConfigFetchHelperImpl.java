package app.chalo.productpurchase.productselection.domain;

import app.chalo.contract.ProductConfigFetchHelperContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/ProductConfigFetchHelperImpl;", "Lapp/chalo/contract/ProductConfigFetchHelperContract;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductConfigFetchHelperImpl implements ProductConfigFetchHelperContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchProductConfigsUseCase f8659a;

    public ProductConfigFetchHelperImpl(FetchProductConfigsUseCase fetchProductConfigsUseCase) {
        this.f8659a = fetchProductConfigsUseCase;
    }

    @Override // app.chalo.contract.ProductConfigFetchHelperContract
    public final Object a(Continuation continuation) {
        Object objA = this.f8659a.a((ContinuationImpl) continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
