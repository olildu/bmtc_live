package app.chalo.livetracking.routedetails.analytics;

import defpackage.b3;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/analytics/StopDetailsForAnalytics;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopDetailsForAnalytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4387a;
    public final String b;
    public final int c;

    public StopDetailsForAnalytics(String stopName, String stopId, int i) {
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(stopId, "stopId");
        this.f4387a = stopName;
        this.b = stopId;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopDetailsForAnalytics)) {
            return false;
        }
        StopDetailsForAnalytics stopDetailsForAnalytics = (StopDetailsForAnalytics) obj;
        return Intrinsics.d(this.f4387a, stopDetailsForAnalytics.f4387a) && Intrinsics.d(this.b, stopDetailsForAnalytics.b) && this.c == stopDetailsForAnalytics.c;
    }

    public final int hashCode() {
        return nf1.e(this.f4387a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return b3.f(")", this.c, dd.e("StopDetailsForAnalytics(stopName=", this.f4387a, ", stopId=", this.b, ", position="));
    }
}
