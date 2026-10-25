package app.chalo.checkout.domain.provider;

import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.ui.PaymentUiItem;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/provider/ICheckoutItemsProvider;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ICheckoutItemsProvider {
    Object a(PaymentInstrumentAppModel.NetBankingPaymentInstrumentAppModel netBankingPaymentInstrumentAppModel, ContinuationImpl continuationImpl);

    Object b(PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel uPIPaymentInstrumentAppModel, ContinuationImpl continuationImpl);

    Object c(PaymentInstrumentAppModel.WalletPaymentInstrumentAppModel walletPaymentInstrumentAppModel, ContinuationImpl continuationImpl);

    PaymentUiItem d(PaymentMethodOptionsAppModel paymentMethodOptionsAppModel);
}
