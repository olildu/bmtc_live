package app.chalo.checkout.data.repository;

import app.chalo.checkout.data.model.app.request.ChaloPayOrderRequestAppModel;
import app.chalo.checkout.data.model.app.request.ChaloPayPaymentRequestAppModel;
import app.chalo.checkout.data.model.app.request.ClosedLoopWalletPaymentRequestAppModel;
import app.chalo.checkout.data.model.app.request.GetLazyPayUrlRequestAppModel;
import app.chalo.checkout.data.model.app.request.PaymentStatusRequestAppModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/repository/ICheckoutRepository;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ICheckoutRepository {
    Enum a(Map map, ContinuationImpl continuationImpl);

    Object b(Map map, Continuation continuation);

    Object c(GetLazyPayUrlRequestAppModel getLazyPayUrlRequestAppModel, Continuation continuation);

    Enum d(PaymentStatusRequestAppModel paymentStatusRequestAppModel, ContinuationImpl continuationImpl);

    Object e(ClosedLoopWalletPaymentRequestAppModel closedLoopWalletPaymentRequestAppModel, ContinuationImpl continuationImpl);

    Object f(ChaloPayOrderRequestAppModel chaloPayOrderRequestAppModel, ContinuationImpl continuationImpl);

    Object g(ChaloPayPaymentRequestAppModel chaloPayPaymentRequestAppModel, ContinuationImpl continuationImpl);
}
