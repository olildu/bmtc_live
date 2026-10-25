package app.chalo.premiumbus.ui.changestop;

import defpackage.d;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/RouteInfo;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7541a;
    public final Map b;
    public final String c;

    public RouteInfo(String polyline, Map map, String str) {
        Intrinsics.i(polyline, "polyline");
        this.f7541a = polyline;
        this.b = map;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteInfo)) {
            return false;
        }
        RouteInfo routeInfo = (RouteInfo) obj;
        return Intrinsics.d(this.f7541a, routeInfo.f7541a) && Intrinsics.d(this.b, routeInfo.b) && Intrinsics.d(this.c, routeInfo.c);
    }

    public final int hashCode() {
        int iF = d.f(this.b, this.f7541a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteInfo(polyline=");
        sb.append(this.f7541a);
        sb.append(", stopLocationsById=");
        sb.append(this.b);
        sb.append(", agencyName=");
        return vo1.p(sb, this.c, ")");
    }
}
