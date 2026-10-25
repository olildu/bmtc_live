package app.chalo.livetracking.routedetails.data.model.app.response;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/app/response/VehicleSeatAvailabilityDetailsAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleSeatAvailabilityDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4397a;
    public final SeatAvailabilityLevel b;

    public VehicleSeatAvailabilityDetailsAppModel(String vehicleNumber, SeatAvailabilityLevel seatAvailabilityLevel) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(seatAvailabilityLevel, "seatAvailabilityLevel");
        this.f4397a = vehicleNumber;
        this.b = seatAvailabilityLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleSeatAvailabilityDetailsAppModel)) {
            return false;
        }
        VehicleSeatAvailabilityDetailsAppModel vehicleSeatAvailabilityDetailsAppModel = (VehicleSeatAvailabilityDetailsAppModel) obj;
        return Intrinsics.d(this.f4397a, vehicleSeatAvailabilityDetailsAppModel.f4397a) && this.b == vehicleSeatAvailabilityDetailsAppModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4397a.hashCode() * 31);
    }

    public final String toString() {
        return "VehicleSeatAvailabilityDetailsAppModel(vehicleNumber=" + this.f4397a + ", seatAvailabilityLevel=" + this.b + ")";
    }
}
