package app.chalo.checkout.data.resolver;

import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/resolver/CheckoutPaymentDataResolver;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CheckoutPaymentDataResolver {
    PaymentMethodsAppModel H();

    void I(List list);

    void K(CheckoutOrderData checkoutOrderData);

    void M(String str);

    void N(PaymentInfoState paymentInfoState);

    StateFlow P();

    void R(CheckoutPaymentData checkoutPaymentData);

    boolean T();

    void U(String str);

    void Z(boolean z);

    boolean b0();

    boolean c0();

    void d0(String str);

    void j0(PaymentMethodsAppModel paymentMethodsAppModel);

    void l0(boolean z);

    void m0(String str);

    void n(CheckoutPaymentData checkoutPaymentData);

    boolean q();

    void t(SelectedPaymentInstrumentData selectedPaymentInstrumentData);

    CheckoutPaymentData u();

    InaiCheckoutInstanceResult w();

    void y(CustomUrlPaymentStatus customUrlPaymentStatus);

    void z();
}
