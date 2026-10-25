package app.chalo.checkout.shared;

import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolverImpl;
import app.chalo.checkout.data.resolver.CustomUrlPaymentStatus;
import app.chalo.checkout.data.resolver.InaiCheckoutInstanceResult;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.data.resolver.product.CheckoutProductDataResolver;
import app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver;
import app.chalo.checkout.domain.GetInaiCheckoutUseCase;
import app.chalo.features.checkout.CheckoutAnalyticsData;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import com.arkivanov.decompose.ComponentContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/checkout/shared/CheckoutSharedComponentViewModel;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/shared/CheckoutSharedIntent;", "Lapp/chalo/checkout/shared/CheckoutSharedState;", "Lapp/chalo/checkout/shared/CheckoutSharedEffect;", "Lapp/chalo/checkout/data/resolver/product/ICheckoutProductDataResolver;", "Lapp/chalo/checkout/data/resolver/CheckoutPaymentDataResolver;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutSharedComponentViewModel extends ChaloBaseStateMviComponent<CheckoutSharedIntent, CheckoutSharedState, CheckoutSharedState, CheckoutSharedEffect> implements ICheckoutProductDataResolver, CheckoutPaymentDataResolver {
    public final ICheckoutProductDataResolver k;
    public final CheckoutPaymentDataResolver l;

    public CheckoutSharedComponentViewModel(ComponentContext componentContext, GetInaiCheckoutUseCase getInaiCheckoutUseCase) {
        CheckoutProductDataResolver checkoutProductDataResolver = new CheckoutProductDataResolver();
        CheckoutPaymentDataResolverImpl checkoutPaymentDataResolverImpl = new CheckoutPaymentDataResolverImpl(getInaiCheckoutUseCase, checkoutProductDataResolver);
        Intrinsics.i(componentContext, "componentContext");
        super(componentContext);
        this.k = checkoutProductDataResolver;
        this.l = checkoutPaymentDataResolverImpl;
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    public final void B(CheckoutProductData productData) {
        Intrinsics.i(productData, "productData");
        this.k.B(productData);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final PaymentMethodsAppModel H() {
        return this.l.H();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void I(List installedUpiAppList) {
        Intrinsics.i(installedUpiAppList, "installedUpiAppList");
        this.l.I(installedUpiAppList);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void K(CheckoutOrderData orderData) {
        Intrinsics.i(orderData, "orderData");
        this.l.K(orderData);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void M(String newUrl) {
        Intrinsics.i(newUrl, "newUrl");
        this.l.M(newUrl);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void N(PaymentInfoState savedPaymentInfo) {
        Intrinsics.i(savedPaymentInfo, "savedPaymentInfo");
        this.l.N(savedPaymentInfo);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    /* JADX INFO: renamed from: P */
    public final StateFlow getF() {
        return this.l.getF();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void R(CheckoutPaymentData savedPaymentData) {
        Intrinsics.i(savedPaymentData, "savedPaymentData");
        this.l.R(savedPaymentData);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final boolean T() {
        return this.l.T();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void U(String str) {
        this.l.U(str);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void Z(boolean z) {
        this.l.Z(z);
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    public final CheckoutProductType a() {
        return this.k.a();
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    public final boolean a0() {
        return this.k.a0();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final boolean b0() {
        return this.l.b0();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final boolean c0() {
        return this.l.c0();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void d0(String str) {
        this.l.d0(str);
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    /* JADX INFO: renamed from: e0 */
    public final CheckoutProductData getF1363a() {
        return this.k.getF1363a();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void j0(PaymentMethodsAppModel paymentMethodData) {
        Intrinsics.i(paymentMethodData, "paymentMethodData");
        this.l.j0(paymentMethodData);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void l0(boolean z) {
        this.l.l0(z);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void m0(String methodCode) {
        Intrinsics.i(methodCode, "methodCode");
        this.l.m0(methodCode);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void n(CheckoutPaymentData paymentData) {
        Intrinsics.i(paymentData, "paymentData");
        this.l.n(paymentData);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (CheckoutSharedState) obj;
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final boolean q() {
        return this.l.q();
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    public final CheckoutAnalyticsData s() {
        return this.k.s();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void t(SelectedPaymentInstrumentData selectedPaymentInstrumentData) {
        this.l.t(selectedPaymentInstrumentData);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    /* JADX INFO: renamed from: u */
    public final CheckoutPaymentData getC() {
        return this.l.getC();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new CheckoutSharedState();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    /* JADX INFO: renamed from: w */
    public final InaiCheckoutInstanceResult getE() {
        return this.l.getE();
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void y(CustomUrlPaymentStatus status) {
        Intrinsics.i(status, "status");
        this.l.y(status);
    }

    @Override // app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver
    public final void z() {
        this.l.z();
    }
}
