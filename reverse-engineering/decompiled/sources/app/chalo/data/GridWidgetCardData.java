package app.chalo.data;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/GridWidgetCardData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GridWidgetCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GridWidgetItemData f2348a;
    public final String b;
    public final IconType c;
    public final String d;

    public GridWidgetCardData(GridWidgetItemData gridWidgetItemData, String str, IconType iconType, String gridItemBackgroundColor) {
        Intrinsics.i(gridItemBackgroundColor, "gridItemBackgroundColor");
        this.f2348a = gridWidgetItemData;
        this.b = str;
        this.c = iconType;
        this.d = gridItemBackgroundColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridWidgetCardData)) {
            return false;
        }
        GridWidgetCardData gridWidgetCardData = (GridWidgetCardData) obj;
        return Intrinsics.d(this.f2348a, gridWidgetCardData.f2348a) && Intrinsics.d(this.b, gridWidgetCardData.b) && this.c == gridWidgetCardData.c && Intrinsics.d(this.d, gridWidgetCardData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f2348a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconType iconType = this.c;
        return this.d.hashCode() + ((iHashCode2 + (iconType != null ? iconType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GridWidgetCardData(gridItemData=" + this.f2348a + ", gridItemImageUrl=" + this.b + ", gridItemFallbackImage=" + this.c + ", gridItemBackgroundColor=" + this.d + ")";
    }
}
