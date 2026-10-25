package app.chalo.validationsdk.blevalidation.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/ProductAndUserDetailsBottomsheetInfo;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductAndUserDetailsBottomsheetInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductDetailsDisplayData f10615a;

    public ProductAndUserDetailsBottomsheetInfo(ProductDetailsDisplayData productDetailsDisplayData) {
        Intrinsics.i(productDetailsDisplayData, "productDetailsDisplayData");
        this.f10615a = productDetailsDisplayData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductAndUserDetailsBottomsheetInfo) && Intrinsics.d(this.f10615a, ((ProductAndUserDetailsBottomsheetInfo) obj).f10615a);
    }

    public final int hashCode() {
        return this.f10615a.hashCode();
    }

    public final String toString() {
        return "ProductAndUserDetailsBottomsheetInfo(productDetailsDisplayData=" + this.f10615a + ")";
    }
}
