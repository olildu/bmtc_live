package app.chalo.home.ui.chalobus;

import app.chalo.data.GridWidgetCardData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusProductItemData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusProductItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GridWidgetCardData f3250a;
    public final String b;

    public ChaloBusProductItemData(GridWidgetCardData gridWidgetCardData, String productConfigId) {
        Intrinsics.i(productConfigId, "productConfigId");
        this.f3250a = gridWidgetCardData;
        this.b = productConfigId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusProductItemData)) {
            return false;
        }
        ChaloBusProductItemData chaloBusProductItemData = (ChaloBusProductItemData) obj;
        return Intrinsics.d(this.f3250a, chaloBusProductItemData.f3250a) && Intrinsics.d(this.b, chaloBusProductItemData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3250a.hashCode() * 31);
    }

    public final String toString() {
        return "ChaloBusProductItemData(productCardData=" + this.f3250a + ", productConfigId=" + this.b + ")";
    }
}
