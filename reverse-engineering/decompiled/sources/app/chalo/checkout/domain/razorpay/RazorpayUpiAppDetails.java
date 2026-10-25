package app.chalo.checkout.domain.razorpay;

import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/razorpay/RazorpayUpiAppDetails;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RazorpayUpiAppDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1399a;
    public final String b;
    public final String c;

    public RazorpayUpiAppDetails(String str, String str2, String str3) {
        this.f1399a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RazorpayUpiAppDetails)) {
            return false;
        }
        RazorpayUpiAppDetails razorpayUpiAppDetails = (RazorpayUpiAppDetails) obj;
        return Intrinsics.d(this.f1399a, razorpayUpiAppDetails.f1399a) && Intrinsics.d(this.b, razorpayUpiAppDetails.b) && Intrinsics.d(this.c, razorpayUpiAppDetails.c);
    }

    public final int hashCode() {
        int iHashCode = this.f1399a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return vo1.p(dd.e("RazorpayUpiAppDetails(packageName=", this.f1399a, ", logoUrl=", this.b, ", appName="), this.c, ")");
    }
}
