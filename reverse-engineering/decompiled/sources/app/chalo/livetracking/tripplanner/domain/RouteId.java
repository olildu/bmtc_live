package app.chalo.livetracking.tripplanner.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/RouteId;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class RouteId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4711a;

    public RouteId(String routeId) {
        Intrinsics.i(routeId, "routeId");
        this.f4711a = routeId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RouteId) && Intrinsics.d(this.f4711a, ((RouteId) obj).f4711a);
    }

    public final int hashCode() {
        return this.f4711a.hashCode();
    }

    public final String toString() {
        return vo1.B("RouteId(routeId=", this.f4711a, ")");
    }
}
