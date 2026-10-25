package app.chalo.superpass.data.models.entities;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/ProductActivationDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductActivationDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9551a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public ProductActivationDetails(long j, String bookingId, long j2, String productType, String productSubType, String city, String agencyName) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(city, "city");
        Intrinsics.i(agencyName, "agencyName");
        this.f9551a = j;
        this.b = bookingId;
        this.c = j2;
        this.d = productType;
        this.e = productSubType;
        this.f = city;
        this.g = agencyName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductActivationDetails)) {
            return false;
        }
        ProductActivationDetails productActivationDetails = (ProductActivationDetails) obj;
        return this.f9551a == productActivationDetails.f9551a && Intrinsics.d(this.b, productActivationDetails.b) && this.c == productActivationDetails.c && Intrinsics.d(this.d, productActivationDetails.d) && Intrinsics.d(this.e, productActivationDetails.e) && Intrinsics.d(this.f, productActivationDetails.f) && Intrinsics.d(this.g, productActivationDetails.g);
    }

    public final int hashCode() {
        long j = this.f9551a;
        int iE = nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b);
        long j2 = this.c;
        return this.g.hashCode() + nf1.e(nf1.e(nf1.e((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductActivationDetails(activationTimeStamp=");
        sb.append(this.f9551a);
        sb.append(", bookingId=");
        sb.append(this.b);
        xs.r(this.c, ", expiryTime=", ", productType=", sb);
        cb0.t(sb, this.d, ", productSubType=", this.e, ", city=");
        return r30.i(sb, this.f, ", agencyName=", this.g, ")");
    }
}
