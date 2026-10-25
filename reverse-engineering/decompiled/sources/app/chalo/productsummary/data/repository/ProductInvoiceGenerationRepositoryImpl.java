package app.chalo.productsummary.data.repository;

import app.chalo.productsummary.data.models.api.ProductInvoiceGenerationRequestApiModel;
import app.chalo.productsummary.data.models.app.ProductInvoiceGenerationRequestAppModel;
import app.chalo.productsummary.data.remote.ProductInvoiceGenerationRemoteDataSource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/data/repository/ProductInvoiceGenerationRepositoryImpl;", "Lapp/chalo/productsummary/data/repository/ProductInvoiceGenerationRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductInvoiceGenerationRepositoryImpl implements ProductInvoiceGenerationRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductInvoiceGenerationRemoteDataSource f8713a;

    public ProductInvoiceGenerationRepositoryImpl(ProductInvoiceGenerationRemoteDataSource productInvoiceGenerationRemoteDataSource) {
        this.f8713a = productInvoiceGenerationRemoteDataSource;
    }

    @Override // app.chalo.productsummary.data.repository.ProductInvoiceGenerationRepository
    public final Object a(ProductInvoiceGenerationRequestAppModel productInvoiceGenerationRequestAppModel, Continuation continuation) {
        return this.f8713a.a(new ProductInvoiceGenerationRequestApiModel(productInvoiceGenerationRequestAppModel.f8711a, productInvoiceGenerationRequestAppModel.b), (ContinuationImpl) continuation);
    }
}
