package app.chalo.premiumbus;

import app.chalo.premiumbus.data.models.app.VehicleBreakdownAppResponseModel;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingTripTimeInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingVehicleInfoAppModel;
import defpackage.dd;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusTripLiveInfo;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusTripLiveInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusBookingVehicleInfoAppModel f6866a;
    public final PremiumBusBookingTripTimeInfoAppModel b;
    public final List c;
    public final List d;
    public final boolean e;
    public final VehicleBreakdownAppResponseModel f;

    public PremiumBusTripLiveInfo(PremiumBusBookingVehicleInfoAppModel premiumBusBookingVehicleInfoAppModel, PremiumBusBookingTripTimeInfoAppModel premiumBusBookingTripTimeInfoAppModel, List tripCommunicationBanners, List selectedSeat, boolean z, VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel) {
        Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
        Intrinsics.i(selectedSeat, "selectedSeat");
        this.f6866a = premiumBusBookingVehicleInfoAppModel;
        this.b = premiumBusBookingTripTimeInfoAppModel;
        this.c = tripCommunicationBanners;
        this.d = selectedSeat;
        this.e = z;
        this.f = vehicleBreakdownAppResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusTripLiveInfo)) {
            return false;
        }
        PremiumBusTripLiveInfo premiumBusTripLiveInfo = (PremiumBusTripLiveInfo) obj;
        return Intrinsics.d(this.f6866a, premiumBusTripLiveInfo.f6866a) && Intrinsics.d(this.b, premiumBusTripLiveInfo.b) && Intrinsics.d(this.c, premiumBusTripLiveInfo.c) && Intrinsics.d(this.d, premiumBusTripLiveInfo.d) && this.e == premiumBusTripLiveInfo.e && Intrinsics.d(this.f, premiumBusTripLiveInfo.f);
    }

    public final int hashCode() {
        int iB = (r30.b(r30.b((this.b.hashCode() + (this.f6866a.hashCode() * 31)) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31;
        VehicleBreakdownAppResponseModel vehicleBreakdownAppResponseModel = this.f;
        return iB + (vehicleBreakdownAppResponseModel == null ? 0 : vehicleBreakdownAppResponseModel.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusTripLiveInfo(vehicleInfoState=");
        sb.append(this.f6866a);
        sb.append(", tripTimeInfoState=");
        sb.append(this.b);
        sb.append(", tripCommunicationBanners=");
        dd.o(sb, this.c, ", selectedSeat=", this.d, ", womenAdjacencyPromisedWhileBooking=");
        sb.append(this.e);
        sb.append(", vehicleBreakdownInfo=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
