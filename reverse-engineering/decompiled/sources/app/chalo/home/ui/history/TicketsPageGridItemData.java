package app.chalo.home.ui.history;

import app.chalo.data.GridWidgetCardData;
import app.chalo.homescreen.data.model.app.TicketsPageFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/TicketsPageGridItemData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketsPageGridItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GridWidgetCardData f3444a;
    public final TicketsPageFeature b;

    public TicketsPageGridItemData(GridWidgetCardData gridWidgetCardData, TicketsPageFeature gridWidgetFeatureType) {
        Intrinsics.i(gridWidgetFeatureType, "gridWidgetFeatureType");
        this.f3444a = gridWidgetCardData;
        this.b = gridWidgetFeatureType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketsPageGridItemData)) {
            return false;
        }
        TicketsPageGridItemData ticketsPageGridItemData = (TicketsPageGridItemData) obj;
        return Intrinsics.d(this.f3444a, ticketsPageGridItemData.f3444a) && this.b == ticketsPageGridItemData.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3444a.hashCode() * 31);
    }

    public final String toString() {
        return "TicketsPageGridItemData(gridWidgetCardData=" + this.f3444a + ", gridWidgetFeatureType=" + this.b + ")";
    }
}
