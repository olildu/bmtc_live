package app.chalo.premiumbus.domains;

import app.chalo.premiumbus.PremiumBusTripLiveInfo;
import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingTripTimeInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.data.model.appmodel.PremiumBusBookingVehicleInfoAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FetchPremiumBusTripDetailsAndLiveEtaUseCaseKt {
    public static final PremiumBusTripLiveInfo a(PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel) {
        Intrinsics.i(premiumBusTripPollingResponseAppModel, "<this>");
        List list = premiumBusTripPollingResponseAppModel.l;
        String str = premiumBusTripPollingResponseAppModel.c;
        return new PremiumBusTripLiveInfo(str != null ? new PremiumBusBookingVehicleInfoAppModel.VehicleAssigned(str, premiumBusTripPollingResponseAppModel.e, premiumBusTripPollingResponseAppModel.k, list) : new PremiumBusBookingVehicleInfoAppModel.VehicleNotAssigned(list), new PremiumBusBookingTripTimeInfoAppModel.ExpectedTime(premiumBusTripPollingResponseAppModel.i, premiumBusTripPollingResponseAppModel.h, premiumBusTripPollingResponseAppModel.m), premiumBusTripPollingResponseAppModel.j, premiumBusTripPollingResponseAppModel.l, premiumBusTripPollingResponseAppModel.n, premiumBusTripPollingResponseAppModel.o);
    }
}
