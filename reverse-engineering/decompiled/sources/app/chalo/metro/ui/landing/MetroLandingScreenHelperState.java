package app.chalo.metro.ui.landing;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroLandingScreenHelperState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5492a;
    public final List b;

    public MetroLandingScreenHelperState(List recentStopAndRouteBasedSearchedItems, List recentStopBasedSearchedItems) {
        Intrinsics.i(recentStopAndRouteBasedSearchedItems, "recentStopAndRouteBasedSearchedItems");
        Intrinsics.i(recentStopBasedSearchedItems, "recentStopBasedSearchedItems");
        this.f5492a = recentStopAndRouteBasedSearchedItems;
        this.b = recentStopBasedSearchedItems;
    }

    public static MetroLandingScreenHelperState a(MetroLandingScreenHelperState metroLandingScreenHelperState, List recentStopAndRouteBasedSearchedItems, List recentStopBasedSearchedItems, int i) {
        if ((i & 1) != 0) {
            recentStopAndRouteBasedSearchedItems = metroLandingScreenHelperState.f5492a;
        }
        if ((i & 2) != 0) {
            recentStopBasedSearchedItems = metroLandingScreenHelperState.b;
        }
        metroLandingScreenHelperState.getClass();
        Intrinsics.i(recentStopAndRouteBasedSearchedItems, "recentStopAndRouteBasedSearchedItems");
        Intrinsics.i(recentStopBasedSearchedItems, "recentStopBasedSearchedItems");
        return new MetroLandingScreenHelperState(recentStopAndRouteBasedSearchedItems, recentStopBasedSearchedItems);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLandingScreenHelperState)) {
            return false;
        }
        MetroLandingScreenHelperState metroLandingScreenHelperState = (MetroLandingScreenHelperState) obj;
        return Intrinsics.d(this.f5492a, metroLandingScreenHelperState.f5492a) && Intrinsics.d(this.b, metroLandingScreenHelperState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5492a.hashCode() * 31);
    }

    public final String toString() {
        return "MetroLandingScreenHelperState(recentStopAndRouteBasedSearchedItems=" + this.f5492a + ", recentStopBasedSearchedItems=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MetroLandingScreenHelperState() {
        EmptyList emptyList = EmptyList.f17557a;
        this(emptyList, emptyList);
    }
}
