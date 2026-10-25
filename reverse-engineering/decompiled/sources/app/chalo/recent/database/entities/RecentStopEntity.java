package app.chalo.recent.database.entities;

import defpackage.dd;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/entities/RecentStopEntity;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentStopEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8946a;
    public final String b;
    public final RecentStopInfoEntity c;
    public final RecentsSpecialEntityStatus d;
    public final long e;
    public final int f;
    public final String g;

    public RecentStopEntity(String stopId, String cityId, RecentStopInfoEntity stop, RecentsSpecialEntityStatus recentsSpecialEntityStatus, long j, int i, String str) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(stop, "stop");
        Intrinsics.i(recentsSpecialEntityStatus, "recentsSpecialEntityStatus");
        this.f8946a = stopId;
        this.b = cityId;
        this.c = stop;
        this.d = recentsSpecialEntityStatus;
        this.e = j;
        this.f = i;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentStopEntity)) {
            return false;
        }
        RecentStopEntity recentStopEntity = (RecentStopEntity) obj;
        return Intrinsics.d(this.f8946a, recentStopEntity.f8946a) && Intrinsics.d(this.b, recentStopEntity.b) && Intrinsics.d(this.c, recentStopEntity.c) && this.d == recentStopEntity.d && this.e == recentStopEntity.e && this.f == recentStopEntity.f && Intrinsics.d(this.g, recentStopEntity.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f8946a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        long j = this.e;
        int i = (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f) * 31;
        String str = this.g;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentStopEntity(stopId=", this.f8946a, ", cityId=", this.b, ", stop=");
        sbE.append(this.c);
        sbE.append(", recentsSpecialEntityStatus=");
        sbE.append(this.d);
        sbE.append(", accessTime=");
        sbE.append(this.e);
        sbE.append(", accessCount=");
        sbE.append(this.f);
        return z40.h(sbE, ", label=", this.g, ")");
    }
}
