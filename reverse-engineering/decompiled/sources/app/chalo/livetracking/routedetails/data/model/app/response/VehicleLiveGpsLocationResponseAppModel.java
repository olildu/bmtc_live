package app.chalo.livetracking.routedetails.data.model.app.response;

import app.chalo.location.LatLng;
import defpackage.i71;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/app/response/VehicleLiveGpsLocationResponseAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleLiveGpsLocationResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4396a;
    public final LatLng b;
    public final long c;

    public VehicleLiveGpsLocationResponseAppModel(String vehicleNumber, LatLng latLng, long j) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        this.f4396a = vehicleNumber;
        this.b = latLng;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleLiveGpsLocationResponseAppModel)) {
            return false;
        }
        VehicleLiveGpsLocationResponseAppModel vehicleLiveGpsLocationResponseAppModel = (VehicleLiveGpsLocationResponseAppModel) obj;
        return Intrinsics.d(this.f4396a, vehicleLiveGpsLocationResponseAppModel.f4396a) && Intrinsics.d(this.b, vehicleLiveGpsLocationResponseAppModel.b) && this.c == vehicleLiveGpsLocationResponseAppModel.c;
    }

    public final int hashCode() {
        int iD = i71.d(this.b, this.f4396a.hashCode() * 31, 31);
        long j = this.c;
        return iD + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VehicleLiveGpsLocationResponseAppModel(vehicleNumber=");
        sb.append(this.f4396a);
        sb.append(", currentLocation=");
        sb.append(this.b);
        sb.append(", timeStamp=");
        return uf0.m(this.c, ")", sb);
    }
}
