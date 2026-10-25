package app.chalo.checkout.data.model.ui;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/PaymentUiItem;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentUiItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLogo f1348a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;

    public PaymentUiItem(PaymentLogo paymentLogo, String displayName, boolean z, String str, String str2, String str3, Boolean bool) {
        Intrinsics.i(displayName, "displayName");
        this.f1348a = paymentLogo;
        this.b = displayName;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentUiItem)) {
            return false;
        }
        PaymentUiItem paymentUiItem = (PaymentUiItem) obj;
        return Intrinsics.d(this.f1348a, paymentUiItem.f1348a) && Intrinsics.d(this.b, paymentUiItem.b) && this.c == paymentUiItem.c && Intrinsics.d(this.d, paymentUiItem.d) && Intrinsics.d(this.e, paymentUiItem.e) && Intrinsics.d(this.f, paymentUiItem.f) && Intrinsics.d(this.g, paymentUiItem.g);
    }

    public final int hashCode() {
        PaymentLogo paymentLogo = this.f1348a;
        int iE = (nf1.e((paymentLogo == null ? 0 : paymentLogo.hashCode()) * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentUiItem(logoIcon=");
        sb.append(this.f1348a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", isItemEnabled=");
        pk0.x(", label=", this.d, ", description=", sb, this.c);
        cb0.t(sb, this.e, ", warningMsg=", this.f, ", isItemLoading=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
