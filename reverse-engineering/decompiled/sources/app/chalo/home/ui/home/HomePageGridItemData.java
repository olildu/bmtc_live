package app.chalo.home.ui.home;

import app.chalo.data.GridWidgetCardData;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomePageGridItemData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomePageGridItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GridWidgetCardData f3533a;
    public final HomePageFeature b;

    public HomePageGridItemData(GridWidgetCardData gridWidgetCardData, HomePageFeature gridWidgetFeatureType) {
        Intrinsics.i(gridWidgetFeatureType, "gridWidgetFeatureType");
        this.f3533a = gridWidgetCardData;
        this.b = gridWidgetFeatureType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomePageGridItemData)) {
            return false;
        }
        HomePageGridItemData homePageGridItemData = (HomePageGridItemData) obj;
        return Intrinsics.d(this.f3533a, homePageGridItemData.f3533a) && this.b == homePageGridItemData.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3533a.hashCode() * 31);
    }

    public final String toString() {
        return "HomePageGridItemData(gridWidgetCardData=" + this.f3533a + ", gridWidgetFeatureType=" + this.b + ")";
    }
}
