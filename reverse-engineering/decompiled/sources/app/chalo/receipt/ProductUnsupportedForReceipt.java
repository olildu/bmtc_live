package app.chalo.receipt;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/receipt/ProductUnsupportedForReceipt;", "Lapp/chalo/receipt/ReceiptFetchError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductUnsupportedForReceipt implements ReceiptFetchError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductUnsupportedForReceipt f8916a = new ProductUnsupportedForReceipt();

    @Override // app.chalo.receipt.ReceiptFetchError
    public final /* bridge */ String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ProductUnsupportedForReceipt);
    }

    public final int hashCode() {
        return 187610887;
    }

    public final String toString() {
        return "ProductUnsupportedForReceipt";
    }
}
