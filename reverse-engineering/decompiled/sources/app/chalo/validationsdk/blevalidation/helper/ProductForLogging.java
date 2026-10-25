package app.chalo.validationsdk.blevalidation.helper;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/ProductForLogging;", "", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductForLogging {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10559a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/ProductForLogging$Companion;", "", "", "DEFAULT_PRODUCT_TYPE", "Ljava/lang/String;", "DEFAULT_PRODUCT_SUB_TYPE", "DEFAULT_BOOKING_ID", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductForLogging(String productType, String productSubtype, String bookingId) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubtype, "productSubtype");
        Intrinsics.i(bookingId, "bookingId");
        this.f10559a = productType;
        this.b = productSubtype;
        this.c = bookingId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductForLogging)) {
            return false;
        }
        ProductForLogging productForLogging = (ProductForLogging) obj;
        return Intrinsics.d(this.f10559a, productForLogging.f10559a) && Intrinsics.d(this.b, productForLogging.b) && Intrinsics.d(this.c, productForLogging.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f10559a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("ProductForLogging(productType=", this.f10559a, ", productSubtype=", this.b, ", bookingId="), this.c, ")");
    }
}
