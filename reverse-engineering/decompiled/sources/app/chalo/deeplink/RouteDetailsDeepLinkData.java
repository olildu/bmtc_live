package app.chalo.deeplink;

import defpackage.q7;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/RouteDetailsDeepLinkData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsDeepLinkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2476a;
    public final List b;
    public final String c;

    public RouteDetailsDeepLinkData(String str, String str2, ArrayList arrayList) {
        this.f2476a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsDeepLinkData)) {
            return false;
        }
        RouteDetailsDeepLinkData routeDetailsDeepLinkData = (RouteDetailsDeepLinkData) obj;
        return Intrinsics.d(this.f2476a, routeDetailsDeepLinkData.f2476a) && Intrinsics.d(this.b, routeDetailsDeepLinkData.b) && Intrinsics.d(this.c, routeDetailsDeepLinkData.c);
    }

    public final int hashCode() {
        int iHashCode = this.f2476a.hashCode() * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return vo1.p(q7.h("RouteDetailsDeepLinkData(routeId=", this.f2476a, ", vehicleNumbers=", ", triggerStopId=", this.b), this.c, ")");
    }
}
