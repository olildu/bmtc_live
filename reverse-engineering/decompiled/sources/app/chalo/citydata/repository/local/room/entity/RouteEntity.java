package app.chalo.citydata.repository.local.room.entity;

import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntity;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1783a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final long i;
    public final long j;
    public final RouteEntityLiveDataDetails k;
    public final RouteEntityDetailedData l;
    public final String m;
    public final RouteNamingSchemeType n;

    public RouteEntity(int i, String cityId, String routeId, String routeName, String startStopName, String endStopName, String agencyName, List specialFeature, long j, long j2, RouteEntityLiveDataDetails routeLiveData, RouteEntityDetailedData detailedData, String str, RouteNamingSchemeType routeNamingScheme) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(specialFeature, "specialFeature");
        Intrinsics.i(routeLiveData, "routeLiveData");
        Intrinsics.i(detailedData, "detailedData");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f1783a = i;
        this.b = cityId;
        this.c = routeId;
        this.d = routeName;
        this.e = startStopName;
        this.f = endStopName;
        this.g = agencyName;
        this.h = specialFeature;
        this.i = j;
        this.j = j2;
        this.k = routeLiveData;
        this.l = detailedData;
        this.m = str;
        this.n = routeNamingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteEntity)) {
            return false;
        }
        RouteEntity routeEntity = (RouteEntity) obj;
        return this.f1783a == routeEntity.f1783a && Intrinsics.d(this.b, routeEntity.b) && Intrinsics.d(this.c, routeEntity.c) && Intrinsics.d(this.d, routeEntity.d) && Intrinsics.d(this.e, routeEntity.e) && Intrinsics.d(this.f, routeEntity.f) && Intrinsics.d(this.g, routeEntity.g) && Intrinsics.d(this.h, routeEntity.h) && this.i == routeEntity.i && this.j == routeEntity.j && Intrinsics.d(this.k, routeEntity.k) && Intrinsics.d(this.l, routeEntity.l) && Intrinsics.d(this.m, routeEntity.m) && this.n == routeEntity.n;
    }

    public final int hashCode() {
        int iB = r30.b(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f1783a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        long j = this.i;
        int i = (iB + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.j;
        int iHashCode = (this.l.hashCode() + ((this.k.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31;
        String str = this.m;
        return this.n.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f1783a, "RouteEntity(version=", ", cityId=", this.b, ", routeId=");
        cb0.t(sbP, this.c, ", routeName=", this.d, ", startStopName=");
        cb0.t(sbP, this.e, ", endStopName=", this.f, ", agencyName=");
        pk0.w(this.g, ", specialFeature=", ", lastAccessedTs=", sbP, this.h);
        sbP.append(this.i);
        xs.r(this.j, ", createdAtTs=", ", routeLiveData=", sbP);
        sbP.append(this.k);
        sbP.append(", detailedData=");
        sbP.append(this.l);
        sbP.append(", via=");
        sbP.append(this.m);
        sbP.append(", routeNamingScheme=");
        sbP.append(this.n);
        sbP.append(")");
        return sbP.toString();
    }
}
