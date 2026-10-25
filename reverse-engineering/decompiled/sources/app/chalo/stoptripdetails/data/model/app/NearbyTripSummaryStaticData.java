package app.chalo.stoptripdetails.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/NearbyTripSummaryStaticData;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyTripSummaryStaticData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9497a;
    public final String b;
    public final EstimatedTimeType c;
    public final int d;

    public NearbyTripSummaryStaticData(String summaryId, String routeId, EstimatedTimeType staticEstimatedTimeType, int i) {
        Intrinsics.i(summaryId, "summaryId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(staticEstimatedTimeType, "staticEstimatedTimeType");
        this.f9497a = summaryId;
        this.b = routeId;
        this.c = staticEstimatedTimeType;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyTripSummaryStaticData)) {
            return false;
        }
        NearbyTripSummaryStaticData nearbyTripSummaryStaticData = (NearbyTripSummaryStaticData) obj;
        return Intrinsics.d(this.f9497a, nearbyTripSummaryStaticData.f9497a) && Intrinsics.d(this.b, nearbyTripSummaryStaticData.b) && this.c == nearbyTripSummaryStaticData.c && this.d == nearbyTripSummaryStaticData.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + nf1.e(this.f9497a.hashCode() * 31, 31, this.b)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NearbyTripSummaryStaticData(summaryId=", this.f9497a, ", routeId=", this.b, ", staticEstimatedTimeType=");
        sbE.append(this.c);
        sbE.append(", staticTimeToConsiderForSorting=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
