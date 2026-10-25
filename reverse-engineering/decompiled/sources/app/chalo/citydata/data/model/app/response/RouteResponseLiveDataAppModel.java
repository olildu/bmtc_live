package app.chalo.citydata.data.model.app.response;

import defpackage.nf1;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/RouteResponseLiveDataAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteResponseLiveDataAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1743a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public RouteResponseLiveDataAppModel(String busAvailabilityId, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.i(busAvailabilityId, "busAvailabilityId");
        this.f1743a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = busAvailabilityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteResponseLiveDataAppModel)) {
            return false;
        }
        RouteResponseLiveDataAppModel routeResponseLiveDataAppModel = (RouteResponseLiveDataAppModel) obj;
        return this.f1743a == routeResponseLiveDataAppModel.f1743a && this.b == routeResponseLiveDataAppModel.b && this.c == routeResponseLiveDataAppModel.c && this.d == routeResponseLiveDataAppModel.d && Intrinsics.d(this.e, routeResponseLiveDataAppModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((((((this.f1743a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("RouteResponseLiveDataAppModel(mTicketEnabled=", ", routePassEnabled=", ", isAirportRoute=", this.f1743a, this.b);
        z40.r(sbR, this.c, ", isPremiumBusRoute=", this.d, ", busAvailabilityId=");
        return vo1.p(sbR, this.e, ")");
    }
}
