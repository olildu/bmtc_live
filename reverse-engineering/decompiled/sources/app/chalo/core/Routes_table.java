package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.citydata.repository.local.room.entity.RouteEntityDetailedData;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Routes_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Routes_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2011a;
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Routes_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f2012a;
        public final ColumnAdapter b;
        public final ColumnAdapter c;
        public final EnumColumnAdapter d;

        public Adapter(ColumnAdapter specialFeatureAdapter, ColumnAdapter routeLiveDataAdapter, ColumnAdapter detailedDataAdapter, EnumColumnAdapter enumColumnAdapter) {
            Intrinsics.i(specialFeatureAdapter, "specialFeatureAdapter");
            Intrinsics.i(routeLiveDataAdapter, "routeLiveDataAdapter");
            Intrinsics.i(detailedDataAdapter, "detailedDataAdapter");
            this.f2012a = specialFeatureAdapter;
            this.b = routeLiveDataAdapter;
            this.c = detailedDataAdapter;
            this.d = enumColumnAdapter;
        }
    }

    public Routes_table(long j, String cityId, String routeId, String routeName, String startStopName, String endStopName, String agencyName, List specialFeature, long j2, long j3, RouteEntityLiveDataDetails routeLiveData, RouteEntityDetailedData detailedData, String str, RouteNamingSchemeType routeNamingScheme) {
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
        this.f2011a = j;
        this.b = cityId;
        this.c = routeId;
        this.d = routeName;
        this.e = startStopName;
        this.f = endStopName;
        this.g = agencyName;
        this.h = specialFeature;
        this.i = j2;
        this.j = j3;
        this.k = routeLiveData;
        this.l = detailedData;
        this.m = str;
        this.n = routeNamingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Routes_table)) {
            return false;
        }
        Routes_table routes_table = (Routes_table) obj;
        return this.f2011a == routes_table.f2011a && Intrinsics.d(this.b, routes_table.b) && Intrinsics.d(this.c, routes_table.c) && Intrinsics.d(this.d, routes_table.d) && Intrinsics.d(this.e, routes_table.e) && Intrinsics.d(this.f, routes_table.f) && Intrinsics.d(this.g, routes_table.g) && Intrinsics.d(this.h, routes_table.h) && this.i == routes_table.i && this.j == routes_table.j && Intrinsics.d(this.k, routes_table.k) && Intrinsics.d(this.l, routes_table.l) && Intrinsics.d(this.m, routes_table.m) && this.n == routes_table.n;
    }

    public final int hashCode() {
        long j = this.f2011a;
        int iB = r30.b(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        long j2 = this.i;
        int i = (iB + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.j;
        int iHashCode = (this.l.hashCode() + ((this.k.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31;
        String str = this.m;
        return this.n.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Routes_table(version=");
        sb.append(this.f2011a);
        sb.append(", cityId=");
        sb.append(this.b);
        cb0.t(sb, ", routeId=", this.c, ", routeName=", this.d);
        cb0.t(sb, ", startStopName=", this.e, ", endStopName=", this.f);
        sb.append(", agencyName=");
        sb.append(this.g);
        sb.append(", specialFeature=");
        sb.append(this.h);
        xs.r(this.i, ", lastAccessedTs=", ", createdAtTs=", sb);
        sb.append(this.j);
        sb.append(", routeLiveData=");
        sb.append(this.k);
        sb.append(", detailedData=");
        sb.append(this.l);
        sb.append(", via=");
        sb.append(this.m);
        sb.append(", routeNamingScheme=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
