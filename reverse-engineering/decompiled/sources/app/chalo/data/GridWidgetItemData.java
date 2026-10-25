package app.chalo.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/GridWidgetItemData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GridWidgetItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2349a;
    public final List b;
    public final ChaloTextWithBackgroundData c;

    public GridWidgetItemData(ArrayList arrayList, ArrayList arrayList2, ChaloTextWithBackgroundData chaloTextWithBackgroundData) {
        this.f2349a = arrayList;
        this.b = arrayList2;
        this.c = chaloTextWithBackgroundData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridWidgetItemData)) {
            return false;
        }
        GridWidgetItemData gridWidgetItemData = (GridWidgetItemData) obj;
        return Intrinsics.d(this.f2349a, gridWidgetItemData.f2349a) && Intrinsics.d(this.b, gridWidgetItemData.b) && Intrinsics.d(this.c, gridWidgetItemData.c);
    }

    public final int hashCode() {
        List list = this.f2349a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        ChaloTextWithBackgroundData chaloTextWithBackgroundData = this.c;
        return iHashCode2 + (chaloTextWithBackgroundData != null ? chaloTextWithBackgroundData.hashCode() : 0);
    }

    public final String toString() {
        return "GridWidgetItemData(desc=" + this.f2349a + ", tags=" + this.b + ", title=" + this.c + ")";
    }
}
