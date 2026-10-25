package app.chalo.recent.database.entities;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/entities/RecentLocationPairEntity;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentLocationPairEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8939a;
    public final String b;
    public final RecentLocationPairEndpointEntity c;
    public final RecentLocationPairEndpointEntity d;
    public final long e;
    public final int f;

    public RecentLocationPairEntity(String pairId, String cityId, RecentLocationPairEndpointEntity fromEndpoint, RecentLocationPairEndpointEntity toEndpoint, long j, int i) {
        Intrinsics.i(pairId, "pairId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(fromEndpoint, "fromEndpoint");
        Intrinsics.i(toEndpoint, "toEndpoint");
        this.f8939a = pairId;
        this.b = cityId;
        this.c = fromEndpoint;
        this.d = toEndpoint;
        this.e = j;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentLocationPairEntity)) {
            return false;
        }
        RecentLocationPairEntity recentLocationPairEntity = (RecentLocationPairEntity) obj;
        return Intrinsics.d(this.f8939a, recentLocationPairEntity.f8939a) && Intrinsics.d(this.b, recentLocationPairEntity.b) && Intrinsics.d(this.c, recentLocationPairEntity.c) && Intrinsics.d(this.d, recentLocationPairEntity.d) && this.e == recentLocationPairEntity.e && this.f == recentLocationPairEntity.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f8939a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        long j = this.e;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentLocationPairEntity(pairId=", this.f8939a, ", cityId=", this.b, ", fromEndpoint=");
        sbE.append(this.c);
        sbE.append(", toEndpoint=");
        sbE.append(this.d);
        sbE.append(", accessTime=");
        sbE.append(this.e);
        sbE.append(", accessCount=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
