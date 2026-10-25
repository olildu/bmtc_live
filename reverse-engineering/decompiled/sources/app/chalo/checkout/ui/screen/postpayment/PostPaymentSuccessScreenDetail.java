package app.chalo.checkout.ui.screen.postpayment;

import app.chalo.providers.lottieassetprovider.LottieType;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessScreenDetail;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostPaymentSuccessScreenDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostPaymentSuccessProductType f1591a;
    public final String b;
    public final String c;
    public final LottieType d;
    public final boolean e;
    public final boolean f;

    public PostPaymentSuccessScreenDetail(PostPaymentSuccessProductType screenType, String successMsg, String str, LottieType lottieType, int i) {
        str = (i & 4) != 0 ? null : str;
        boolean z = (i & 128) == 0;
        boolean z2 = (i & 256) != 0;
        Intrinsics.i(screenType, "screenType");
        Intrinsics.i(successMsg, "successMsg");
        this.f1591a = screenType;
        this.b = successMsg;
        this.c = str;
        this.d = lottieType;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPaymentSuccessScreenDetail)) {
            return false;
        }
        PostPaymentSuccessScreenDetail postPaymentSuccessScreenDetail = (PostPaymentSuccessScreenDetail) obj;
        return Intrinsics.d(this.f1591a, postPaymentSuccessScreenDetail.f1591a) && Intrinsics.d(this.b, postPaymentSuccessScreenDetail.b) && Intrinsics.d(this.c, postPaymentSuccessScreenDetail.c) && this.d == postPaymentSuccessScreenDetail.d && this.e == postPaymentSuccessScreenDetail.e && this.f == postPaymentSuccessScreenDetail.f;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1591a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        LottieType lottieType = this.d;
        return ((((iHashCode + (lottieType != null ? lottieType.hashCode() : 0)) * 923521) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostPaymentSuccessScreenDetail(screenType=");
        sb.append(this.f1591a);
        sb.append(", successMsg=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", gif=");
        sb.append(this.d);
        sb.append(", icon=null, positiveBtnText=null, negativeBtnText=null, showConfetti=");
        return n21.h(sb, this.e, ", isTicketOrPass=", this.f, ")");
    }
}
