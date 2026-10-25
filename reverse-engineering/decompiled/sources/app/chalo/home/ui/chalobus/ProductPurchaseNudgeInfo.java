package app.chalo.home.ui.chalobus;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ProductPurchaseNudgeInfo;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductPurchaseNudgeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3299a;
    public final ProductPurchaseNudgeUiStatus b;
    public final List c;
    public final ProductPurchaseNudgeInfoCtaType d;

    public ProductPurchaseNudgeInfo(List headers, ProductPurchaseNudgeUiStatus uiStatus, List list, ProductPurchaseNudgeInfoCtaType productPurchaseNudgeInfoCtaType) {
        Intrinsics.i(headers, "headers");
        Intrinsics.i(uiStatus, "uiStatus");
        this.f3299a = headers;
        this.b = uiStatus;
        this.c = list;
        this.d = productPurchaseNudgeInfoCtaType;
    }

    public static ProductPurchaseNudgeInfo a(ProductPurchaseNudgeInfo productPurchaseNudgeInfo, List headers, ProductPurchaseNudgeUiStatus uiStatus, List list, ProductPurchaseNudgeInfoCtaType productPurchaseNudgeInfoCtaType, int i) {
        if ((i & 1) != 0) {
            headers = productPurchaseNudgeInfo.f3299a;
        }
        if ((i & 4) != 0) {
            list = productPurchaseNudgeInfo.c;
        }
        if ((i & 8) != 0) {
            productPurchaseNudgeInfoCtaType = productPurchaseNudgeInfo.d;
        }
        Intrinsics.i(headers, "headers");
        Intrinsics.i(uiStatus, "uiStatus");
        return new ProductPurchaseNudgeInfo(headers, uiStatus, list, productPurchaseNudgeInfoCtaType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchaseNudgeInfo)) {
            return false;
        }
        ProductPurchaseNudgeInfo productPurchaseNudgeInfo = (ProductPurchaseNudgeInfo) obj;
        return Intrinsics.d(this.f3299a, productPurchaseNudgeInfo.f3299a) && this.b == productPurchaseNudgeInfo.b && Intrinsics.d(this.c, productPurchaseNudgeInfo.c) && this.d == productPurchaseNudgeInfo.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3299a.hashCode() * 31)) * 31;
        List list = this.c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ProductPurchaseNudgeInfoCtaType productPurchaseNudgeInfoCtaType = this.d;
        return iHashCode2 + (productPurchaseNudgeInfoCtaType != null ? productPurchaseNudgeInfoCtaType.hashCode() : 0);
    }

    public final String toString() {
        return "ProductPurchaseNudgeInfo(headers=" + this.f3299a + ", uiStatus=" + this.b + ", displayInfo=" + this.c + ", sectionCtaType=" + this.d + ")";
    }
}
