package app.chalo.checkout.data.resolver.product;

import app.chalo.features.checkout.CheckoutAnalyticsData;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductType;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/resolver/product/CheckoutProductDataResolver;", "Lapp/chalo/checkout/data/resolver/product/ICheckoutProductDataResolver;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutProductDataResolver implements ICheckoutProductDataResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CheckoutProductData f1363a;

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    public final void B(CheckoutProductData productData) {
        Intrinsics.i(productData, "productData");
        this.f1363a = productData;
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    public final CheckoutProductType a() {
        CheckoutProductType checkoutProductType;
        CheckoutProductData checkoutProductData = this.f1363a;
        return (checkoutProductData == null || (checkoutProductType = checkoutProductData.f2695a) == null) ? CheckoutProductType.UNKNOWN : checkoutProductType;
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    public final boolean a0() {
        CheckoutProductData checkoutProductData = this.f1363a;
        if (checkoutProductData != null) {
            return checkoutProductData.b;
        }
        return false;
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    /* JADX INFO: renamed from: e0, reason: from getter */
    public final CheckoutProductData getF1363a() {
        return this.f1363a;
    }

    @Override // app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver
    public final CheckoutAnalyticsData s() {
        CheckoutAnalyticsData checkoutAnalyticsData;
        CheckoutProductData checkoutProductData = this.f1363a;
        return (checkoutProductData == null || (checkoutAnalyticsData = checkoutProductData.c) == null) ? new CheckoutAnalyticsData("", MapsKt.d()) : checkoutAnalyticsData;
    }
}
