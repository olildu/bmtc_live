package app.chalo.productpurchase.passpurchase.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.productpurchase.productselection.data.exceptions.PassCashPaymentInfoFetchFailedException;
import app.chalo.productpurchase.productselection.data.models.app.PassCashPaymentInfoResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/FetchSuperPassCashPaymentInfoUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchSuperPassCashPaymentInfoUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f8330a;

    public FetchSuperPassCashPaymentInfoUseCase(ProductPurchaseRepository productPurchaseRepository) {
        this.f8330a = productPurchaseRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        FetchSuperPassCashPaymentInfoUseCase$invoke$1 fetchSuperPassCashPaymentInfoUseCase$invoke$1;
        if (continuationImpl instanceof FetchSuperPassCashPaymentInfoUseCase$invoke$1) {
            fetchSuperPassCashPaymentInfoUseCase$invoke$1 = (FetchSuperPassCashPaymentInfoUseCase$invoke$1) continuationImpl;
            int i = fetchSuperPassCashPaymentInfoUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchSuperPassCashPaymentInfoUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchSuperPassCashPaymentInfoUseCase$invoke$1 = new FetchSuperPassCashPaymentInfoUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchSuperPassCashPaymentInfoUseCase$invoke$1 = new FetchSuperPassCashPaymentInfoUseCase$invoke$1(this, continuationImpl);
        }
        Object objJ = fetchSuperPassCashPaymentInfoUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchSuperPassCashPaymentInfoUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objJ);
                ProductPurchaseRepository productPurchaseRepository = this.f8330a;
                fetchSuperPassCashPaymentInfoUseCase$invoke$1.label = 1;
                objJ = productPurchaseRepository.j(str, str2, fetchSuperPassCashPaymentInfoUseCase$invoke$1);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objJ);
            }
            return new ChaloUseCaseResult.Success((PassCashPaymentInfoResponseAppModel) objJ);
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(null);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(null);
        } catch (PassCashPaymentInfoFetchFailedException e) {
            return new ChaloUseCaseResult.Failure(e.getMessage());
        } catch (Exception unused3) {
            return new ChaloUseCaseResult.Failure(null);
        }
    }
}
