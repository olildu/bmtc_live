package app.chalo.home.ui.regularbus;

import app.chalo.data.GridWidgetCardData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusProductItemData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusProductItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GridWidgetCardData f3633a;
    public final String b;

    public RegularBusProductItemData(GridWidgetCardData gridWidgetCardData, String productConfigId) {
        Intrinsics.i(productConfigId, "productConfigId");
        this.f3633a = gridWidgetCardData;
        this.b = productConfigId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusProductItemData)) {
            return false;
        }
        RegularBusProductItemData regularBusProductItemData = (RegularBusProductItemData) obj;
        return Intrinsics.d(this.f3633a, regularBusProductItemData.f3633a) && Intrinsics.d(this.b, regularBusProductItemData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3633a.hashCode() * 31);
    }

    public final String toString() {
        return "RegularBusProductItemData(productCardData=" + this.f3633a + ", productConfigId=" + this.b + ")";
    }
}
