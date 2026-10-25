package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.livetracking.provider.tracking.model.LiveVehicleDataAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.BusPassedDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PremiumBusPostActivationStopDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketPostBookingActionContractKt {
    public static final boolean a(PremiumBusPostBookingBottomSheetType premiumBusPostBookingBottomSheetType) {
        Intrinsics.i(premiumBusPostBookingBottomSheetType, "<this>");
        if ((premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.Expired) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.BookingAckRequired)) {
            return true;
        }
        if ((premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.ActivationCurrentlyNotAllowed) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.SeeMoreOptions) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.Error) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.TripCancellationConfirmation) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.ActionNotAllowed) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.ShowAllocatedSeats) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.BleFeatureNotAvailable) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.FetchingTicketUpdateOptions) || (premiumBusPostBookingBottomSheetType instanceof PremiumBusPostBookingBottomSheetType.TripRescheduleConfirmation)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList b(List list, Map map) {
        Intrinsics.i(list, "<this>");
        List<PremiumBusPostActivationStopDetails> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (PremiumBusPostActivationStopDetails premiumBusPostActivationStopDetails : list2) {
            Object obj = map.get(premiumBusPostActivationStopDetails.f7403a);
            if (obj == null) {
                obj = EmptyList.f17557a;
            }
            List list3 = (List) obj;
            LiveVehicleDataAppModel liveVehicleDataAppModel = !list3.isEmpty() ? (LiveVehicleDataAppModel) CollectionsKt.P(list3) : null;
            arrayList.add(PremiumBusPostActivationStopDetails.a(premiumBusPostActivationStopDetails, false, null, new BusPassedDetails(liveVehicleDataAppModel != null, liveVehicleDataAppModel != null ? liveVehicleDataAppModel.h instanceof LiveBusDelayedState.Delayed : false), 15));
        }
        return arrayList;
    }
}
