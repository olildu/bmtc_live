package app.chalo.checkout.paymentprovider.razorpay;

import android.webkit.WebView;
import com.razorpay.Razorpay;
import com.razorpay.RazorpayWebViewClient;
import defpackage.ch;
import defpackage.on;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/razorpay/CommonRazorpayWebviewClient;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonRazorpayWebviewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonRazorpayWebviewClient$webViewClient$1 f1425a;

    /* JADX WARN: Type inference failed for: r0v0, types: [app.chalo.checkout.paymentprovider.razorpay.CommonRazorpayWebviewClient$webViewClient$1] */
    public CommonRazorpayWebviewClient(RazorpaySdk razorpaySdk, final on onVar, final ch chVar) {
        final Razorpay razorpayA = razorpaySdk.a();
        this.f1425a = new RazorpayWebViewClient(onVar, chVar, razorpayA) { // from class: app.chalo.checkout.paymentprovider.razorpay.CommonRazorpayWebviewClient$webViewClient$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ch f1426a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(razorpayA);
                this.f1426a = chVar;
            }

            @Override // com.razorpay.RazorpayWebViewClient, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                this.f1426a.invoke(str);
            }
        };
    }
}
