package app.chalo.premiumbus;

import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusTripLiveInfoUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusTripLiveInfoUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusBookingVehicleInfoState f6867a;
    public final PremiumBusBookingTripTimeInfoState b;

    public PremiumBusTripLiveInfoUiModel(PremiumBusBookingVehicleInfoState vehicleInfoState, PremiumBusBookingTripTimeInfoState tripTimeInfoState) {
        Intrinsics.i(vehicleInfoState, "vehicleInfoState");
        Intrinsics.i(tripTimeInfoState, "tripTimeInfoState");
        this.f6867a = vehicleInfoState;
        this.b = tripTimeInfoState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusTripLiveInfoUiModel)) {
            return false;
        }
        PremiumBusTripLiveInfoUiModel premiumBusTripLiveInfoUiModel = (PremiumBusTripLiveInfoUiModel) obj;
        return Intrinsics.d(this.f6867a, premiumBusTripLiveInfoUiModel.f6867a) && Intrinsics.d(this.b, premiumBusTripLiveInfoUiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6867a.hashCode() * 31);
    }

    public final String toString() {
        return "PremiumBusTripLiveInfoUiModel(vehicleInfoState=" + this.f6867a + ", tripTimeInfoState=" + this.b + ")";
    }
}
