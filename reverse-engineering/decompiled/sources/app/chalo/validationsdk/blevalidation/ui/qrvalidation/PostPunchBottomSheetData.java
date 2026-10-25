package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.receipt.ProductReceiptData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/PostPunchBottomSheetData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostPunchBottomSheetData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductReceiptData f10629a;
    public final ProductValidationData b;

    public PostPunchBottomSheetData(ProductReceiptData receipt, ProductValidationData productData) {
        Intrinsics.i(receipt, "receipt");
        Intrinsics.i(productData, "productData");
        this.f10629a = receipt;
        this.b = productData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPunchBottomSheetData)) {
            return false;
        }
        PostPunchBottomSheetData postPunchBottomSheetData = (PostPunchBottomSheetData) obj;
        return Intrinsics.d(this.f10629a, postPunchBottomSheetData.f10629a) && Intrinsics.d(this.b, postPunchBottomSheetData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10629a.hashCode() * 31);
    }

    public final String toString() {
        return "PostPunchBottomSheetData(receipt=" + this.f10629a + ", productData=" + this.b + ")";
    }
}
