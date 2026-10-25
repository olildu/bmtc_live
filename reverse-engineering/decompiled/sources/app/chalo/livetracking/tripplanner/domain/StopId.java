package app.chalo.livetracking.tripplanner.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/StopId;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class StopId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4712a;

    public StopId(String stopId) {
        Intrinsics.i(stopId, "stopId");
        this.f4712a = stopId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StopId) && Intrinsics.d(this.f4712a, ((StopId) obj).f4712a);
    }

    public final int hashCode() {
        return this.f4712a.hashCode();
    }

    public final String toString() {
        return vo1.B("StopId(stopId=", this.f4712a, ")");
    }
}
