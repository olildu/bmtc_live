package app.chalo.recent.database.entities;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/entities/RecentStopBasedTripEntity;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentStopBasedTripEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8945a;
    public final String b;
    public final RecentStopInfoEntity c;
    public final RecentStopInfoEntity d;
    public final ChaloTransitMode e;
    public final long f;
    public final int g;

    public RecentStopBasedTripEntity(String stopBasedTripId, String cityId, RecentStopInfoEntity originStop, RecentStopInfoEntity destinationStop, ChaloTransitMode transitMode, long j, int i) {
        Intrinsics.i(stopBasedTripId, "stopBasedTripId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(originStop, "originStop");
        Intrinsics.i(destinationStop, "destinationStop");
        Intrinsics.i(transitMode, "transitMode");
        this.f8945a = stopBasedTripId;
        this.b = cityId;
        this.c = originStop;
        this.d = destinationStop;
        this.e = transitMode;
        this.f = j;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentStopBasedTripEntity)) {
            return false;
        }
        RecentStopBasedTripEntity recentStopBasedTripEntity = (RecentStopBasedTripEntity) obj;
        return Intrinsics.d(this.f8945a, recentStopBasedTripEntity.f8945a) && Intrinsics.d(this.b, recentStopBasedTripEntity.b) && Intrinsics.d(this.c, recentStopBasedTripEntity.c) && Intrinsics.d(this.d, recentStopBasedTripEntity.d) && this.e == recentStopBasedTripEntity.e && this.f == recentStopBasedTripEntity.f && this.g == recentStopBasedTripEntity.g;
    }

    public final int hashCode() {
        int iC = n21.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f8945a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31);
        long j = this.f;
        return ((iC + ((int) (j ^ (j >>> 32)))) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentStopBasedTripEntity(stopBasedTripId=", this.f8945a, ", cityId=", this.b, ", originStop=");
        sbE.append(this.c);
        sbE.append(", destinationStop=");
        sbE.append(this.d);
        sbE.append(", transitMode=");
        sbE.append(this.e);
        sbE.append(", accessTime=");
        sbE.append(this.f);
        return t10.k(sbE, ", accessCount=", this.g, ")");
    }
}
