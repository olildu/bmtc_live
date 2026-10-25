package app.chalo.home.domain;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/BookedProductKey;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class BookedProductKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2986a;
    public final String b;
    public final String c;

    public BookedProductKey(String bookingId, String productType, String productSubType) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f2986a = bookingId;
        this.b = productType;
        this.c = productSubType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookedProductKey)) {
            return false;
        }
        BookedProductKey bookedProductKey = (BookedProductKey) obj;
        return Intrinsics.d(this.f2986a, bookedProductKey.f2986a) && Intrinsics.d(this.b, bookedProductKey.b) && Intrinsics.d(this.c, bookedProductKey.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f2986a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("BookedProductKey(bookingId=", this.f2986a, ", productType=", this.b, ", productSubType="), this.c, ")");
    }
}
