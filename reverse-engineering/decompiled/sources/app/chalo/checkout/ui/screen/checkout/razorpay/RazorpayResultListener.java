package app.chalo.checkout.ui.screen.checkout.razorpay;

import com.razorpay.PaymentData;
import com.razorpay.PaymentResultWithDataListener;
import defpackage.n4;
import defpackage.zn;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/RazorpayResultListener;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RazorpayResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RazorpayResultListener$sdkListener$1 f1493a;

    /* JADX WARN: Type inference failed for: r0v0, types: [app.chalo.checkout.ui.screen.checkout.razorpay.RazorpayResultListener$sdkListener$1] */
    public RazorpayResultListener(final zn znVar, final n4 n4Var) {
        this.f1493a = new PaymentResultWithDataListener() { // from class: app.chalo.checkout.ui.screen.checkout.razorpay.RazorpayResultListener$sdkListener$1
            @Override // com.razorpay.PaymentResultWithDataListener
            public void onPaymentError(int errorCode, String description, PaymentData paymentData) {
                n4Var.invoke(Integer.valueOf(errorCode), description);
            }

            @Override // com.razorpay.PaymentResultWithDataListener
            public void onPaymentSuccess(String razorpayPaymentId, PaymentData paymentData) {
                znVar.invoke(razorpayPaymentId);
            }
        };
    }
}
