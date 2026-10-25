package app.chalo.productsummary.data.models.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/data/models/app/ProductInvoiceGenerationRequestAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductInvoiceGenerationRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8711a;
    public final String b;

    public ProductInvoiceGenerationRequestAppModel(String str, String str2) {
        this.f8711a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInvoiceGenerationRequestAppModel)) {
            return false;
        }
        ProductInvoiceGenerationRequestAppModel productInvoiceGenerationRequestAppModel = (ProductInvoiceGenerationRequestAppModel) obj;
        return Intrinsics.d(this.f8711a, productInvoiceGenerationRequestAppModel.f8711a) && Intrinsics.d(this.b, productInvoiceGenerationRequestAppModel.b);
    }

    public final int hashCode() {
        String str = this.f8711a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return vo1.o("ProductInvoiceGenerationRequestAppModel(passId=", this.f8711a, ", bookingId=", this.b, ")");
    }
}
