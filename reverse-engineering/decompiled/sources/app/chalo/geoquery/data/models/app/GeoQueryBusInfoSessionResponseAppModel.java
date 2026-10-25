package app.chalo.geoquery.data.models.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/geoquery/data/models/app/GeoQueryBusInfoSessionResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GeoQueryBusInfoSessionResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2815a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ChaloTransitMode i;

    public GeoQueryBusInfoSessionResponseAppModel(String routeId, String agencyName, String vehicleId, String fromName, String toName, String routeName, String streamId, String operatorId, ChaloTransitMode chaloTransitMode) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(vehicleId, "vehicleId");
        Intrinsics.i(fromName, "fromName");
        Intrinsics.i(toName, "toName");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(streamId, "streamId");
        Intrinsics.i(operatorId, "operatorId");
        this.f2815a = routeId;
        this.b = agencyName;
        this.c = vehicleId;
        this.d = fromName;
        this.e = toName;
        this.f = routeName;
        this.g = streamId;
        this.h = operatorId;
        this.i = chaloTransitMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryBusInfoSessionResponseAppModel)) {
            return false;
        }
        GeoQueryBusInfoSessionResponseAppModel geoQueryBusInfoSessionResponseAppModel = (GeoQueryBusInfoSessionResponseAppModel) obj;
        return Intrinsics.d(this.f2815a, geoQueryBusInfoSessionResponseAppModel.f2815a) && Intrinsics.d(this.b, geoQueryBusInfoSessionResponseAppModel.b) && Intrinsics.d(this.c, geoQueryBusInfoSessionResponseAppModel.c) && Intrinsics.d(this.d, geoQueryBusInfoSessionResponseAppModel.d) && Intrinsics.d(this.e, geoQueryBusInfoSessionResponseAppModel.e) && Intrinsics.d(this.f, geoQueryBusInfoSessionResponseAppModel.f) && Intrinsics.d(this.g, geoQueryBusInfoSessionResponseAppModel.g) && Intrinsics.d(this.h, geoQueryBusInfoSessionResponseAppModel.h) && this.i == geoQueryBusInfoSessionResponseAppModel.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f2815a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GeoQueryBusInfoSessionResponseAppModel(routeId=", this.f2815a, ", agencyName=", this.b, ", vehicleId=");
        cb0.t(sbE, this.c, ", fromName=", this.d, ", toName=");
        cb0.t(sbE, this.e, ", routeName=", this.f, ", streamId=");
        cb0.t(sbE, this.g, ", operatorId=", this.h, ", mode=");
        sbE.append(this.i);
        sbE.append(")");
        return sbE.toString();
    }
}
