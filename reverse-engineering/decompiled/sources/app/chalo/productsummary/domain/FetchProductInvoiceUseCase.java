package app.chalo.productsummary.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.productsummary.data.exceptions.ProductInvoiceGenerationFailedException;
import app.chalo.productsummary.data.models.app.ProductInvoiceGenerationRequestAppModel;
import app.chalo.productsummary.data.repository.ProductInvoiceGenerationRepository;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/domain/FetchProductInvoiceUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchProductInvoiceUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductInvoiceGenerationRepository f8716a;

    public FetchProductInvoiceUseCase(ProductInvoiceGenerationRepository productInvoiceGenerationRepository) {
        this.f8716a = productInvoiceGenerationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        FetchProductInvoiceUseCase$invoke$1 fetchProductInvoiceUseCase$invoke$1;
        if (continuationImpl instanceof FetchProductInvoiceUseCase$invoke$1) {
            fetchProductInvoiceUseCase$invoke$1 = (FetchProductInvoiceUseCase$invoke$1) continuationImpl;
            int i = fetchProductInvoiceUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchProductInvoiceUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchProductInvoiceUseCase$invoke$1 = new FetchProductInvoiceUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchProductInvoiceUseCase$invoke$1 = new FetchProductInvoiceUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchProductInvoiceUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchProductInvoiceUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
                    ProductInvoiceGenerationRepository productInvoiceGenerationRepository = this.f8716a;
                    ProductInvoiceGenerationRequestAppModel productInvoiceGenerationRequestAppModel = new ProductInvoiceGenerationRequestAppModel(str, str2);
                    fetchProductInvoiceUseCase$invoke$1.label = 1;
                    objA = productInvoiceGenerationRepository.a(productInvoiceGenerationRequestAppModel, fetchProductInvoiceUseCase$invoke$1);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new ChaloUseCaseResult.Failure(new ProductInvoiceFetchFailedError(ProductInvoiceFetchFailedReason.INVALID_REQUEST_PARAMS, null));
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return new ChaloUseCaseResult.Success((byte[]) objA);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(new ProductInvoiceFetchFailedError(ProductInvoiceFetchFailedReason.LOCAL_ERROR, null));
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(new ProductInvoiceFetchFailedError(ProductInvoiceFetchFailedReason.PARSE_ERROR, null));
        } catch (ProductInvoiceGenerationFailedException e) {
            return new ChaloUseCaseResult.Failure(new ProductInvoiceFetchFailedError(ProductInvoiceFetchFailedReason.SERVER_ERROR, e.getMessage()));
        } catch (Exception e2) {
            return new ChaloUseCaseResult.Failure(new ProductInvoiceFetchFailedError(ProductInvoiceFetchFailedReason.UNKNOWN_ERROR, e2.getMessage()));
        }
    }
}
