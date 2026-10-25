package app.chalo.checkout.analytics;

import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/analytics/ICheckoutAnalyticsHelper;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ICheckoutAnalyticsHelper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void a(ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, String str, Map map, int i) {
            if ((i & 2) != 0) {
                map = null;
            }
            iCheckoutAnalyticsHelper.a(str, map, true);
        }
    }

    void a(String str, Map map, boolean z);

    void b(String str, Map map);

    void c(Map map, int i, int i2);

    void d(PostPaymentSuccessProductType.MTicket mTicket, int i);

    void e(String str, String str2);

    void f(int i);

    void g(String str, String str2);

    void h(String str, Map map, boolean z);

    void i(Map map);

    void j(String str);

    void k(String str, String str2, boolean z, boolean z2, String str3, Map map);

    void l(Map map);
}
