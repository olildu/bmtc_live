package app.chalo.checkout.ui.screen.checkout.razorpay;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.hq0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent;", "", "InitiateCheckoutViewIntent", "LazyPayLoadingCompleted", "WebViewPageLoaded", "PaymentCompletedIntent", "CheckoutBackPressed", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$CheckoutBackPressed;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$InitiateCheckoutViewIntent;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$LazyPayLoadingCompleted;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$WebViewPageLoaded;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$CheckoutBackPressed;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckoutBackPressed extends CheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CheckoutBackPressed f1487a = new CheckoutBackPressed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$InitiateCheckoutViewIntent;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitiateCheckoutViewIntent extends CheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitiateCheckoutViewIntent f1488a = new InitiateCheckoutViewIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$LazyPayLoadingCompleted;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LazyPayLoadingCompleted extends CheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LazyPayLoadingCompleted f1489a = new LazyPayLoadingCompleted();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent;", InitializationStatus.SUCCESS, "Failed", "Unknown", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent$Failed;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent$Success;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent$Unknown;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PaymentCompletedIntent extends CheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1490a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent$Failed;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Failed extends PaymentCompletedIntent {
            public final int b;
            public final String c;

            public Failed(int i, String str) {
                super("");
                this.b = i;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failed)) {
                    return false;
                }
                Failed failed = (Failed) obj;
                return this.b == failed.b && this.c.equals(failed.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b * 31);
            }

            public final String toString() {
                return hq0.d(this.b, "Failed(paymentId=, errorCode=", ", errorDescription=", this.c, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent$Success;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends PaymentCompletedIntent {
            public final String b;

            public Success(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.d(this.b, ((Success) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return vo1.B("Success(paymentId=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent$Unknown;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown extends PaymentCompletedIntent {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unknown);
            }

            public final int hashCode() {
                return 0;
            }

            public final String toString() {
                return "Unknown(paymentId=)";
            }
        }

        public PaymentCompletedIntent(String str) {
            this.f1490a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent$WebViewPageLoaded;", "Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WebViewPageLoaded extends CheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WebViewPageLoaded f1491a = new WebViewPageLoaded();
    }
}
