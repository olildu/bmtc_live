package app.chalo.recent.database.entities;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/entities/RecentTripEntity;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentTripEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8949a;
    public final String b;
    public final ChaloDescriptiveLocationEntityModel c;
    public final ChaloDescriptiveLocationEntityModel d;
    public final ChaloTransitMode e;
    public final long f;
    public final int g;

    public RecentTripEntity(String tripId, String cityId, ChaloDescriptiveLocationEntityModel fromLocation, ChaloDescriptiveLocationEntityModel toLocation, ChaloTransitMode chaloTransitMode, long j, int i) {
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(fromLocation, "fromLocation");
        Intrinsics.i(toLocation, "toLocation");
        this.f8949a = tripId;
        this.b = cityId;
        this.c = fromLocation;
        this.d = toLocation;
        this.e = chaloTransitMode;
        this.f = j;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentTripEntity)) {
            return false;
        }
        RecentTripEntity recentTripEntity = (RecentTripEntity) obj;
        return Intrinsics.d(this.f8949a, recentTripEntity.f8949a) && Intrinsics.d(this.b, recentTripEntity.b) && Intrinsics.d(this.c, recentTripEntity.c) && Intrinsics.d(this.d, recentTripEntity.d) && this.e == recentTripEntity.e && this.f == recentTripEntity.f && this.g == recentTripEntity.g;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f8949a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        ChaloTransitMode chaloTransitMode = this.e;
        int iHashCode2 = chaloTransitMode == null ? 0 : chaloTransitMode.hashCode();
        long j = this.f;
        return ((((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentTripEntity(tripId=", this.f8949a, ", cityId=", this.b, ", fromLocation=");
        sbE.append(this.c);
        sbE.append(", toLocation=");
        sbE.append(this.d);
        sbE.append(", transitMode=");
        sbE.append(this.e);
        sbE.append(", accessTime=");
        sbE.append(this.f);
        return t10.k(sbE, ", accessCount=", this.g, ")");
    }
}
