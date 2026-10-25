package app.chalo.productsummary.ui.pass;

import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/ProductDownloadInvoiceOptionUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductDownloadInvoiceOptionUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8784a;
    public final boolean b;
    public final ChaloColorToken c;

    public ProductDownloadInvoiceOptionUISpec(float f, boolean z, ChaloColorToken backgroundColor) {
        Intrinsics.i(backgroundColor, "backgroundColor");
        this.f8784a = f;
        this.b = z;
        this.c = backgroundColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDownloadInvoiceOptionUISpec)) {
            return false;
        }
        ProductDownloadInvoiceOptionUISpec productDownloadInvoiceOptionUISpec = (ProductDownloadInvoiceOptionUISpec) obj;
        return Float.compare(this.f8784a, productDownloadInvoiceOptionUISpec.f8784a) == 0 && this.b == productDownloadInvoiceOptionUISpec.b && Intrinsics.d(this.c, productDownloadInvoiceOptionUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((Float.floatToIntBits(this.f8784a) * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductDownloadInvoiceOptionUISpec(alpha=");
        sb.append(this.f8784a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return pk0.j(sb, this.c, ")");
    }
}
