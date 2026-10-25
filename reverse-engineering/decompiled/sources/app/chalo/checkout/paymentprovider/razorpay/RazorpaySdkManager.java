package app.chalo.checkout.paymentprovider.razorpay;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/paymentprovider/razorpay/RazorpaySdkManager;", "Lapp/chalo/checkout/paymentprovider/razorpay/RazorPaySdkProvider;", "Lapp/chalo/checkout/paymentprovider/razorpay/RazorpaySdkSetter;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RazorpaySdkManager implements RazorPaySdkProvider, RazorpaySdkSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lazy f1430a;

    @Override // app.chalo.checkout.paymentprovider.razorpay.RazorpaySdkSetter
    public final void a(Lazy sdk) {
        Intrinsics.i(sdk, "sdk");
        this.f1430a = sdk;
    }

    @Override // app.chalo.checkout.paymentprovider.razorpay.RazorpaySdkSetter
    public final void b() {
        this.f1430a = null;
    }

    @Override // app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider
    public final RazorpaySdk c() {
        Lazy lazy = this.f1430a;
        if (lazy != null) {
            return (RazorpaySdk) lazy.getValue();
        }
        return null;
    }
}
