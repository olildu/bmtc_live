package app.chalo.validationsdk.blevalidation.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductPunchDataFromPolling;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductPunchDataFromPolling {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10501a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public ProductPunchDataFromPolling(String productType, String productSubtype, String bookingId, String endStopId, long j) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubtype, "productSubtype");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(endStopId, "endStopId");
        this.f10501a = productType;
        this.b = productSubtype;
        this.c = bookingId;
        this.d = endStopId;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPunchDataFromPolling)) {
            return false;
        }
        ProductPunchDataFromPolling productPunchDataFromPolling = (ProductPunchDataFromPolling) obj;
        return Intrinsics.d(this.f10501a, productPunchDataFromPolling.f10501a) && Intrinsics.d(this.b, productPunchDataFromPolling.b) && Intrinsics.d(this.c, productPunchDataFromPolling.c) && Intrinsics.d(this.d, productPunchDataFromPolling.d) && this.e == productPunchDataFromPolling.e;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f10501a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductPunchDataFromPolling(productType=", this.f10501a, ", productSubtype=", this.b, ", bookingId=");
        cb0.t(sbE, this.c, ", endStopId=", this.d, ", punchTsInMillis=");
        return uf0.m(this.e, ")", sbE);
    }
}
