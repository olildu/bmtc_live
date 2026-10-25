package app.chalo.livetracking.frameworklivetracking.data.model;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/StopRouteId;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopRouteId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4267a;
    public final String b;

    public StopRouteId(String stopId, String routeId) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(routeId, "routeId");
        this.f4267a = stopId;
        this.b = routeId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopRouteId)) {
            return false;
        }
        StopRouteId stopRouteId = (StopRouteId) obj;
        return Intrinsics.d(this.f4267a, stopRouteId.f4267a) && Intrinsics.d(this.b, stopRouteId.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4267a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("StopRouteId(stopId=", this.f4267a, ", routeId=", this.b, ")");
    }
}
