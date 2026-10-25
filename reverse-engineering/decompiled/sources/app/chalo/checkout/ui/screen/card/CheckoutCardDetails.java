package app.chalo.checkout.ui.screen.card;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardDetails;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckoutCardDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1440a;
    public final String b;
    public final String c;
    public final String d;

    public CheckoutCardDetails(String str, String str2, String str3, String str4) {
        this.f1440a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static CheckoutCardDetails a(CheckoutCardDetails checkoutCardDetails, String cvv, String cardNumber, String expiryDate, String str, int i) {
        if ((i & 1) != 0) {
            cvv = checkoutCardDetails.f1440a;
        }
        if ((i & 2) != 0) {
            cardNumber = checkoutCardDetails.b;
        }
        if ((i & 4) != 0) {
            expiryDate = checkoutCardDetails.c;
        }
        if ((i & 8) != 0) {
            str = checkoutCardDetails.d;
        }
        Intrinsics.i(cvv, "cvv");
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(expiryDate, "expiryDate");
        return new CheckoutCardDetails(cvv, cardNumber, expiryDate, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutCardDetails)) {
            return false;
        }
        CheckoutCardDetails checkoutCardDetails = (CheckoutCardDetails) obj;
        return Intrinsics.d(this.f1440a, checkoutCardDetails.f1440a) && Intrinsics.d(this.b, checkoutCardDetails.b) && Intrinsics.d(this.c, checkoutCardDetails.c) && Intrinsics.d(this.d, checkoutCardDetails.d);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f1440a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return r30.i(dd.e("CheckoutCardDetails(cvv=", this.f1440a, ", cardNumber=", this.b, ", expiryDate="), this.c, ", name=", this.d, ")");
    }
}
