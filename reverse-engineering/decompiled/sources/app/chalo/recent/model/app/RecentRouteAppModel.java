package app.chalo.recent.model.app;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentRouteEntity;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/model/app/RecentRouteAppModel;", "Lapp/chalo/recent/model/app/RecentsType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentRouteAppModel extends RecentsType {
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final List l;
    public final boolean m;
    public final ChaloTransitMode n;
    public final RecentsSpecialStatus o;
    public final long p;
    public final int q;
    public final String r;
    public final RouteNamingSchemeType s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentRouteAppModel(String routeId, String cityId, String routeName, String startStopName, String endStopName, String str, boolean z, List list, boolean z2, ChaloTransitMode transitMode, RecentsSpecialStatus recentsSpecialStatus, long j, int i, String str2, RouteNamingSchemeType routeSchemeType) {
        super(j, routeId, cityId, 0);
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(recentsSpecialStatus, "recentsSpecialStatus");
        Intrinsics.i(routeSchemeType, "routeSchemeType");
        this.e = routeId;
        this.f = cityId;
        this.g = routeName;
        this.h = startStopName;
        this.i = endStopName;
        this.j = str;
        this.k = z;
        this.l = list;
        this.m = z2;
        this.n = transitMode;
        this.o = recentsSpecialStatus;
        this.p = j;
        this.q = i;
        this.r = str2;
        this.s = routeSchemeType;
    }

    public final RecentRouteEntity b() {
        return new RecentRouteEntity(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, RecentsAppModelKt.d(this.o), this.p, this.q, this.r, this.s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentRouteAppModel)) {
            return false;
        }
        RecentRouteAppModel recentRouteAppModel = (RecentRouteAppModel) obj;
        return Intrinsics.d(this.e, recentRouteAppModel.e) && Intrinsics.d(this.f, recentRouteAppModel.f) && Intrinsics.d(this.g, recentRouteAppModel.g) && Intrinsics.d(this.h, recentRouteAppModel.h) && Intrinsics.d(this.i, recentRouteAppModel.i) && Intrinsics.d(this.j, recentRouteAppModel.j) && this.k == recentRouteAppModel.k && Intrinsics.d(this.l, recentRouteAppModel.l) && this.m == recentRouteAppModel.m && this.n == recentRouteAppModel.n && this.o == recentRouteAppModel.o && this.p == recentRouteAppModel.p && this.q == recentRouteAppModel.q && Intrinsics.d(this.r, recentRouteAppModel.r) && this.s == recentRouteAppModel.s;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.e.hashCode() * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int iHashCode = (((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.k ? 1231 : 1237)) * 31;
        List list = this.l;
        int iHashCode2 = (this.o.hashCode() + n21.c(this.n, (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + (this.m ? 1231 : 1237)) * 31, 31)) * 31;
        long j = this.p;
        int i = (((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.q) * 31;
        String str2 = this.r;
        return this.s.hashCode() + ((i + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentRouteAppModel(routeId=", this.e, ", cityId=", this.f, ", routeName=");
        cb0.t(sbE, this.g, ", startStopName=", this.h, ", endStopName=");
        cb0.t(sbE, this.i, ", agency=", this.j, ", isAcBus=");
        hq0.w(sbE, this.k, ", spfList=", this.l, ", isFreeRideAvailable=");
        sbE.append(this.m);
        sbE.append(", transitMode=");
        sbE.append(this.n);
        sbE.append(", recentsSpecialStatus=");
        sbE.append(this.o);
        sbE.append(", accessTime=");
        sbE.append(this.p);
        sbE.append(", accessCount=");
        sbE.append(this.q);
        sbE.append(", via=");
        sbE.append(this.r);
        sbE.append(", routeSchemeType=");
        sbE.append(this.s);
        sbE.append(")");
        return sbE.toString();
    }

    public /* synthetic */ RecentRouteAppModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z, List list, boolean z2, RecentsSpecialStatus recentsSpecialStatus, long j, String str7, RouteNamingSchemeType routeNamingSchemeType, int i) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? false : z, list, (i & 256) != 0 ? false : z2, ChaloTransitMode.BUS, recentsSpecialStatus, (i & 2048) != 0 ? -1L : j, (i & 4096) == 0 ? 1 : 0, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? RouteNamingSchemeType.DEFAULT : routeNamingSchemeType);
    }
}
