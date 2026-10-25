package app.chalo.checkout.ui.screen.payment;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentStatusAlertDetails;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentStatusAlertDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1548a;
    public final String b;
    public final LottieType c;
    public final IconType d;
    public final String e;
    public final PaymentStatusCTAActionType f;
    public final String g;
    public final PaymentStatusCTAActionType h;

    public PaymentStatusAlertDetails(String title, String description, LottieType lottieType, IconType iconType, String positiveBtnText, PaymentStatusCTAActionType positiveBtnActionType, String str, PaymentStatusCTAActionType paymentStatusCTAActionType, int i) {
        lottieType = (i & 4) != 0 ? null : lottieType;
        iconType = (i & 8) != 0 ? null : iconType;
        str = (i & 64) != 0 ? null : str;
        paymentStatusCTAActionType = (i & 128) != 0 ? null : paymentStatusCTAActionType;
        Intrinsics.i(title, "title");
        Intrinsics.i(description, "description");
        Intrinsics.i(positiveBtnText, "positiveBtnText");
        Intrinsics.i(positiveBtnActionType, "positiveBtnActionType");
        this.f1548a = title;
        this.b = description;
        this.c = lottieType;
        this.d = iconType;
        this.e = positiveBtnText;
        this.f = positiveBtnActionType;
        this.g = str;
        this.h = paymentStatusCTAActionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentStatusAlertDetails)) {
            return false;
        }
        PaymentStatusAlertDetails paymentStatusAlertDetails = (PaymentStatusAlertDetails) obj;
        return Intrinsics.d(this.f1548a, paymentStatusAlertDetails.f1548a) && Intrinsics.d(this.b, paymentStatusAlertDetails.b) && this.c == paymentStatusAlertDetails.c && this.d == paymentStatusAlertDetails.d && Intrinsics.d(this.e, paymentStatusAlertDetails.e) && this.f == paymentStatusAlertDetails.f && Intrinsics.d(this.g, paymentStatusAlertDetails.g) && this.h == paymentStatusAlertDetails.h;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1548a.hashCode() * 31, 31, this.b);
        LottieType lottieType = this.c;
        int iHashCode = (iE + (lottieType == null ? 0 : lottieType.hashCode())) * 31;
        IconType iconType = this.d;
        int iHashCode2 = (this.f.hashCode() + nf1.e((iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31, 31, this.e)) * 31;
        String str = this.g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PaymentStatusCTAActionType paymentStatusCTAActionType = this.h;
        return iHashCode3 + (paymentStatusCTAActionType != null ? paymentStatusCTAActionType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PaymentStatusAlertDetails(title=", this.f1548a, ", description=", this.b, ", gif=");
        sbE.append(this.c);
        sbE.append(", icon=");
        sbE.append(this.d);
        sbE.append(", positiveBtnText=");
        sbE.append(this.e);
        sbE.append(", positiveBtnActionType=");
        sbE.append(this.f);
        sbE.append(", negativeBtnText=");
        sbE.append(this.g);
        sbE.append(", negativeBtnActionType=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
