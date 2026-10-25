package app.chalo.premiumbus.data;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellPurchaseOffer;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassUpsellPurchaseOffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6957a;
    public final String b;
    public final int c;
    public final double d;
    public final String e;
    public final String f;
    public final boolean g;

    public PassUpsellPurchaseOffer(String passProductConfigId, String categoryId, int i, double d, String productType, String passSubType, boolean z) {
        Intrinsics.i(passProductConfigId, "passProductConfigId");
        Intrinsics.i(categoryId, "categoryId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(passSubType, "passSubType");
        this.f6957a = passProductConfigId;
        this.b = categoryId;
        this.c = i;
        this.d = d;
        this.e = productType;
        this.f = passSubType;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassUpsellPurchaseOffer)) {
            return false;
        }
        PassUpsellPurchaseOffer passUpsellPurchaseOffer = (PassUpsellPurchaseOffer) obj;
        return Intrinsics.d(this.f6957a, passUpsellPurchaseOffer.f6957a) && Intrinsics.d(this.b, passUpsellPurchaseOffer.b) && this.c == passUpsellPurchaseOffer.c && Double.compare(this.d, passUpsellPurchaseOffer.d) == 0 && Intrinsics.d(this.e, passUpsellPurchaseOffer.e) && Intrinsics.d(this.f, passUpsellPurchaseOffer.f) && this.g == passUpsellPurchaseOffer.g;
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f6957a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        return nf1.e(nf1.e((iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.e), 31, this.f) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassUpsellPurchaseOffer(passProductConfigId=", this.f6957a, ", categoryId=", this.b, ", fareMappingId=");
        sbE.append(this.c);
        sbE.append(", payableAmount=");
        sbE.append(this.d);
        cb0.t(sbE, ", productType=", this.e, ", passSubType=", this.f);
        sbE.append(", isVerificationRequired=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }
}
