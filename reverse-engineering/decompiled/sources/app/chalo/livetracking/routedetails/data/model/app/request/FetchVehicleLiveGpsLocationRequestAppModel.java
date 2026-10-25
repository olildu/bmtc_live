package app.chalo.livetracking.routedetails.data.model.app.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/app/request/FetchVehicleLiveGpsLocationRequestAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FetchVehicleLiveGpsLocationRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4393a;
    public final String b;
    public final String c;

    public FetchVehicleLiveGpsLocationRequestAppModel(String str, String vehicleNumber, String str2) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        this.f4393a = str;
        this.b = vehicleNumber;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchVehicleLiveGpsLocationRequestAppModel)) {
            return false;
        }
        FetchVehicleLiveGpsLocationRequestAppModel fetchVehicleLiveGpsLocationRequestAppModel = (FetchVehicleLiveGpsLocationRequestAppModel) obj;
        return Intrinsics.d(this.f4393a, fetchVehicleLiveGpsLocationRequestAppModel.f4393a) && Intrinsics.d(this.b, fetchVehicleLiveGpsLocationRequestAppModel.b) && Intrinsics.d(this.c, fetchVehicleLiveGpsLocationRequestAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f4393a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("FetchVehicleLiveGpsLocationRequestAppModel(cityName=", this.f4393a, ", vehicleNumber=", this.b, ", agency="), this.c, ")");
    }
}
