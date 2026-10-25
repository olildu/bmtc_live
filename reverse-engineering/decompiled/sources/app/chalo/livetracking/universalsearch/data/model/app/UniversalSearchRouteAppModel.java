package app.chalo.livetracking.universalsearch.data.model.app;

import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRouteAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchRouteAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4999a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;
    public final boolean i;
    public final UniversalSearchResultType j;
    public final String k;
    public final RouteNamingSchemeType l;

    public UniversalSearchRouteAppModel(String routeId, String routeName, String str, String firstStopName, String lastStopName, String agencyName, List trackingSpecialFeature, List updateSpecialFeaturesList, boolean z, UniversalSearchResultType resultType, String str2, RouteNamingSchemeType routeNamingScheme) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(firstStopName, "firstStopName");
        Intrinsics.i(lastStopName, "lastStopName");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(trackingSpecialFeature, "trackingSpecialFeature");
        Intrinsics.i(updateSpecialFeaturesList, "updateSpecialFeaturesList");
        Intrinsics.i(resultType, "resultType");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f4999a = routeId;
        this.b = routeName;
        this.c = str;
        this.d = firstStopName;
        this.e = lastStopName;
        this.f = agencyName;
        this.g = trackingSpecialFeature;
        this.h = updateSpecialFeaturesList;
        this.i = z;
        this.j = resultType;
        this.k = str2;
        this.l = routeNamingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchRouteAppModel)) {
            return false;
        }
        UniversalSearchRouteAppModel universalSearchRouteAppModel = (UniversalSearchRouteAppModel) obj;
        return Intrinsics.d(this.f4999a, universalSearchRouteAppModel.f4999a) && Intrinsics.d(this.b, universalSearchRouteAppModel.b) && Intrinsics.d(this.c, universalSearchRouteAppModel.c) && Intrinsics.d(this.d, universalSearchRouteAppModel.d) && Intrinsics.d(this.e, universalSearchRouteAppModel.e) && Intrinsics.d(this.f, universalSearchRouteAppModel.f) && Intrinsics.d(this.g, universalSearchRouteAppModel.g) && Intrinsics.d(this.h, universalSearchRouteAppModel.h) && this.i == universalSearchRouteAppModel.i && this.j == universalSearchRouteAppModel.j && Intrinsics.d(this.k, universalSearchRouteAppModel.k) && this.l == universalSearchRouteAppModel.l;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f4999a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.j.hashCode() + ((r30.b(r30.b(nf1.e(nf1.e(nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h) + (this.i ? 1231 : 1237)) * 31)) * 31;
        String str2 = this.k;
        return this.l.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UniversalSearchRouteAppModel(routeId=", this.f4999a, ", routeName=", this.b, ", transportType=");
        cb0.t(sbE, this.c, ", firstStopName=", this.d, ", lastStopName=");
        cb0.t(sbE, this.e, ", agencyName=", this.f, ", trackingSpecialFeature=");
        dd.o(sbE, this.g, ", updateSpecialFeaturesList=", this.h, ", isFreeRide=");
        sbE.append(this.i);
        sbE.append(", resultType=");
        sbE.append(this.j);
        sbE.append(", via=");
        sbE.append(this.k);
        sbE.append(", routeNamingScheme=");
        sbE.append(this.l);
        sbE.append(")");
        return sbE.toString();
    }
}
