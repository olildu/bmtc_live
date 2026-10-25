package app.chalo.recent.database.entities;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.n21;
import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/entities/RecentRouteEntity;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentRouteEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8942a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final ChaloTransitMode j;
    public final RecentsSpecialEntityStatus k;
    public final long l;
    public final int m;
    public final String n;
    public final RouteNamingSchemeType o;

    public RecentRouteEntity(String routeId, String cityId, String routeName, String startStopName, String endStopName, String str, boolean z, List list, boolean z2, ChaloTransitMode transitMode, RecentsSpecialEntityStatus recentsSpecialEntityStatus, long j, int i, String str2, RouteNamingSchemeType routeSchemeType) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(recentsSpecialEntityStatus, "recentsSpecialEntityStatus");
        Intrinsics.i(routeSchemeType, "routeSchemeType");
        this.f8942a = routeId;
        this.b = cityId;
        this.c = routeName;
        this.d = startStopName;
        this.e = endStopName;
        this.f = str;
        this.g = z;
        this.h = list;
        this.i = z2;
        this.j = transitMode;
        this.k = recentsSpecialEntityStatus;
        this.l = j;
        this.m = i;
        this.n = str2;
        this.o = routeSchemeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentRouteEntity)) {
            return false;
        }
        RecentRouteEntity recentRouteEntity = (RecentRouteEntity) obj;
        return Intrinsics.d(this.f8942a, recentRouteEntity.f8942a) && Intrinsics.d(this.b, recentRouteEntity.b) && Intrinsics.d(this.c, recentRouteEntity.c) && Intrinsics.d(this.d, recentRouteEntity.d) && Intrinsics.d(this.e, recentRouteEntity.e) && Intrinsics.d(this.f, recentRouteEntity.f) && this.g == recentRouteEntity.g && Intrinsics.d(this.h, recentRouteEntity.h) && this.i == recentRouteEntity.i && this.j == recentRouteEntity.j && this.k == recentRouteEntity.k && this.l == recentRouteEntity.l && this.m == recentRouteEntity.m && Intrinsics.d(this.n, recentRouteEntity.n) && this.o == recentRouteEntity.o;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f8942a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31;
        List list = this.h;
        int iHashCode2 = (this.k.hashCode() + n21.c(this.j, (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + (this.i ? 1231 : 1237)) * 31, 31)) * 31;
        long j = this.l;
        int i = (((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.m) * 31;
        String str2 = this.n;
        return this.o.hashCode() + ((i + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentRouteEntity(routeId=", this.f8942a, ", cityId=", this.b, ", routeName=");
        cb0.t(sbE, this.c, ", startStopName=", this.d, ", endStopName=");
        cb0.t(sbE, this.e, ", agency=", this.f, ", isAcBus=");
        hq0.w(sbE, this.g, ", spfList=", this.h, ", isFreeRideAvailable=");
        sbE.append(this.i);
        sbE.append(", transitMode=");
        sbE.append(this.j);
        sbE.append(", recentsSpecialEntityStatus=");
        sbE.append(this.k);
        sbE.append(", accessTime=");
        sbE.append(this.l);
        sbE.append(", accessCount=");
        sbE.append(this.m);
        sbE.append(", via=");
        sbE.append(this.n);
        sbE.append(", routeSchemeType=");
        sbE.append(this.o);
        sbE.append(")");
        return sbE.toString();
    }
}
