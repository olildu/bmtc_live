package app.chalo.checkout.paymentprovider.inai;

import app.chalo.checkout.ui.screen.payment.PaymentMainComponent$inaiSdkExecuteDelegate$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/inai/InaiSdkCheckout;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InaiSdkCheckout {
    void a(LinkedHashMap linkedHashMap, InaiPlatformContext inaiPlatformContext, PaymentMainComponent$inaiSdkExecuteDelegate$1 paymentMainComponent$inaiSdkExecuteDelegate$1);

    void b(String str, Map map, InaiPlatformContext inaiPlatformContext, InaiSdkCheckoutDelegate inaiSdkCheckoutDelegate);
}
