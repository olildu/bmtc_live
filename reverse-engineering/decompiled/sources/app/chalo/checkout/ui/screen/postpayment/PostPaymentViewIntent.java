package app.chalo.checkout.ui.screen.postpayment;

import app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent;", "", "ProcessPostPayment", "SuccessScreenPositiveBtnClickIntent", "SuccessScreenNegativeBtnClickIntent", "ErrorScreenPositiveBtnClickIntent", "ErrorScreenNegativeBtnClickIntent", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$ErrorScreenNegativeBtnClickIntent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$ErrorScreenPositiveBtnClickIntent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$ProcessPostPayment;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$SuccessScreenNegativeBtnClickIntent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$SuccessScreenPositiveBtnClickIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PostPaymentViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$ErrorScreenNegativeBtnClickIntent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorScreenNegativeBtnClickIntent extends PostPaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ErrorScreenNegativeBtnClickIntent f1592a = new ErrorScreenNegativeBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorScreenNegativeBtnClickIntent);
        }

        public final int hashCode() {
            return -1773350162;
        }

        public final String toString() {
            return "ErrorScreenNegativeBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$ErrorScreenPositiveBtnClickIntent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorScreenPositiveBtnClickIntent extends PostPaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentStatusCTAActionType f1593a;

        public ErrorScreenPositiveBtnClickIntent(PaymentStatusCTAActionType paymentStatusCTAActionType) {
            Intrinsics.i(paymentStatusCTAActionType, "paymentStatusCTAActionType");
            this.f1593a = paymentStatusCTAActionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorScreenPositiveBtnClickIntent) && this.f1593a == ((ErrorScreenPositiveBtnClickIntent) obj).f1593a;
        }

        public final int hashCode() {
            return this.f1593a.hashCode();
        }

        public final String toString() {
            return "ErrorScreenPositiveBtnClickIntent(paymentStatusCTAActionType=" + this.f1593a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$ProcessPostPayment;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProcessPostPayment extends PostPaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProcessPostPayment f1594a = new ProcessPostPayment();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProcessPostPayment);
        }

        public final int hashCode() {
            return -758535782;
        }

        public final String toString() {
            return "ProcessPostPayment";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$SuccessScreenNegativeBtnClickIntent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuccessScreenNegativeBtnClickIntent extends PostPaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuccessScreenNegativeBtnClickIntent f1595a = new SuccessScreenNegativeBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent$SuccessScreenPositiveBtnClickIntent;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessScreenPositiveBtnClickIntent extends PostPaymentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PostPaymentSuccessProductType f1596a;

        public SuccessScreenPositiveBtnClickIntent(PostPaymentSuccessProductType postPaymentSuccessProductType) {
            this.f1596a = postPaymentSuccessProductType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuccessScreenPositiveBtnClickIntent) && Intrinsics.d(this.f1596a, ((SuccessScreenPositiveBtnClickIntent) obj).f1596a);
        }

        public final int hashCode() {
            PostPaymentSuccessProductType postPaymentSuccessProductType = this.f1596a;
            if (postPaymentSuccessProductType == null) {
                return 0;
            }
            return postPaymentSuccessProductType.hashCode();
        }

        public final String toString() {
            return "SuccessScreenPositiveBtnClickIntent(screenType=" + this.f1596a + ")";
        }
    }
}
