package app.chalo.checkout.ui.screen.postpayment;

import app.chalo.checkout.ui.screen.payment.PaymentStatusAlertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentDataState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostPaymentDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1582a;
    public final PostPaymentSuccessScreenDetail b;
    public final PaymentStatusAlertDetails c;

    public PostPaymentDataState(boolean z, PostPaymentSuccessScreenDetail postPaymentSuccessScreenDetail, PaymentStatusAlertDetails paymentStatusAlertDetails) {
        this.f1582a = z;
        this.b = postPaymentSuccessScreenDetail;
        this.c = paymentStatusAlertDetails;
    }

    public static PostPaymentDataState a(PostPaymentDataState postPaymentDataState, boolean z, PostPaymentSuccessScreenDetail postPaymentSuccessScreenDetail, PaymentStatusAlertDetails paymentStatusAlertDetails, int i) {
        if ((i & 1) != 0) {
            z = postPaymentDataState.f1582a;
        }
        if ((i & 2) != 0) {
            postPaymentSuccessScreenDetail = postPaymentDataState.b;
        }
        if ((i & 4) != 0) {
            paymentStatusAlertDetails = postPaymentDataState.c;
        }
        postPaymentDataState.getClass();
        return new PostPaymentDataState(z, postPaymentSuccessScreenDetail, paymentStatusAlertDetails);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPaymentDataState)) {
            return false;
        }
        PostPaymentDataState postPaymentDataState = (PostPaymentDataState) obj;
        return this.f1582a == postPaymentDataState.f1582a && Intrinsics.d(this.b, postPaymentDataState.b) && Intrinsics.d(this.c, postPaymentDataState.c);
    }

    public final int hashCode() {
        int i = (this.f1582a ? 1231 : 1237) * 31;
        PostPaymentSuccessScreenDetail postPaymentSuccessScreenDetail = this.b;
        int iHashCode = (i + (postPaymentSuccessScreenDetail == null ? 0 : postPaymentSuccessScreenDetail.hashCode())) * 31;
        PaymentStatusAlertDetails paymentStatusAlertDetails = this.c;
        return iHashCode + (paymentStatusAlertDetails != null ? paymentStatusAlertDetails.hashCode() : 0);
    }

    public final String toString() {
        return "PostPaymentDataState(showLoadingDialogue=" + this.f1582a + ", paymentSuccessScreenDetail=" + this.b + ", paymentStatusErrorDetails=" + this.c + ")";
    }
}
