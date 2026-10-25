package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose;

import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsscreen/compose/RouteDetailsAnchoredAdLayout;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsAnchoredAdLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4463a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/ui/routedetailsscreen/compose/RouteDetailsAnchoredAdLayout$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RouteDetailsAnchoredAdLayout(int i, int i2, int i3, int i4) {
        this.f4463a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsAnchoredAdLayout)) {
            return false;
        }
        RouteDetailsAnchoredAdLayout routeDetailsAnchoredAdLayout = (RouteDetailsAnchoredAdLayout) obj;
        return this.f4463a == routeDetailsAnchoredAdLayout.f4463a && this.b == routeDetailsAnchoredAdLayout.b && this.c == routeDetailsAnchoredAdLayout.c && this.d == routeDetailsAnchoredAdLayout.d;
    }

    public final int hashCode() {
        return (((((this.f4463a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return xs.h(this.c, this.d, ", snackbarExtraBottomOffsetDp=", ")", uf0.s(this.f4463a, this.b, "RouteDetailsAnchoredAdLayout(peekHeightExtraDp=", ", stopListExtraBottomPaddingDp=", ", ctaExtraBottomPaddingDp="));
    }
}
