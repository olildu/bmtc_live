package app.chalo.premiumbus.bulkbookingridedetails.ui;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/RouteInfo;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6940a;
    public final String b;
    public final String c;

    public RouteInfo(String str, String startStopName, String dropStopName) {
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(dropStopName, "dropStopName");
        this.f6940a = str;
        this.b = startStopName;
        this.c = dropStopName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteInfo)) {
            return false;
        }
        RouteInfo routeInfo = (RouteInfo) obj;
        return Intrinsics.d(this.f6940a, routeInfo.f6940a) && Intrinsics.d(this.b, routeInfo.b) && Intrinsics.d(this.c, routeInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f6940a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("RouteInfo(routeName=", this.f6940a, ", startStopName=", this.b, ", dropStopName="), this.c, ")");
    }
}
