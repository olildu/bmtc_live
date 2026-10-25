package app.chalo.citydata.data.model.app.response;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/NearbyRouteAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyRouteAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1738a;
    public final String b;
    public final String c;
    public final StopAppModel d;
    public final StopAppModel e;
    public final List f;
    public final RouteNamingSchemeType g;

    public NearbyRouteAppModel(String routeName, String routeId, String str, StopAppModel stopAppModel, StopAppModel stopAppModel2, List specialFeature, RouteNamingSchemeType routeNamingSchemeType) {
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(specialFeature, "specialFeature");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f1738a = routeName;
        this.b = routeId;
        this.c = str;
        this.d = stopAppModel;
        this.e = stopAppModel2;
        this.f = specialFeature;
        this.g = routeNamingSchemeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRouteAppModel)) {
            return false;
        }
        NearbyRouteAppModel nearbyRouteAppModel = (NearbyRouteAppModel) obj;
        return Intrinsics.d(this.f1738a, nearbyRouteAppModel.f1738a) && Intrinsics.d(this.b, nearbyRouteAppModel.b) && Intrinsics.d(this.c, nearbyRouteAppModel.c) && Intrinsics.d(this.d, nearbyRouteAppModel.d) && Intrinsics.d(this.e, nearbyRouteAppModel.e) && Intrinsics.d(this.f, nearbyRouteAppModel.f) && this.g == nearbyRouteAppModel.g;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1738a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        StopAppModel stopAppModel = this.d;
        int iHashCode2 = (iHashCode + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
        StopAppModel stopAppModel2 = this.e;
        return this.g.hashCode() + r30.b((iHashCode2 + (stopAppModel2 != null ? stopAppModel2.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NearbyRouteAppModel(routeName=", this.f1738a, ", routeId=", this.b, ", via=");
        sbE.append(this.c);
        sbE.append(", startStop=");
        sbE.append(this.d);
        sbE.append(", endStop=");
        sbE.append(this.e);
        sbE.append(", specialFeature=");
        sbE.append(this.f);
        sbE.append(", routeNamingSchemeType=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }
}
