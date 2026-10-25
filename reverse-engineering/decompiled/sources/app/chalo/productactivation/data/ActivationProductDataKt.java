package app.chalo.productactivation.data;

import app.chalo.home.domain.ChaloUserBookingType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivationProductDataKt {
    public static final ChaloUserBookingType a(ActivationProductData activationProductData) {
        Intrinsics.i(activationProductData, "<this>");
        if (activationProductData instanceof ActivationProductData.InstantTicketActivation) {
            return new ChaloUserBookingType.TicketBooking.InstantTicketBooking(((ActivationProductData.InstantTicketActivation) activationProductData).f7993a, null);
        }
        if (activationProductData instanceof ActivationProductData.PassActivation.Magic) {
            return new ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking(((ActivationProductData.PassActivation.Magic) activationProductData).b);
        }
        if (activationProductData instanceof ActivationProductData.PassActivation.RideBased) {
            return new ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking(((ActivationProductData.PassActivation.RideBased) activationProductData).b);
        }
        if (activationProductData instanceof ActivationProductData.QuickPayActivation) {
            return new ChaloUserBookingType.TicketBooking.QuickPayBooking(((ActivationProductData.QuickPayActivation) activationProductData).f8001a);
        }
        if (activationProductData instanceof ActivationProductData.MobileTicketActivation) {
            return new ChaloUserBookingType.TicketBooking.MobileTicketBooking(((ActivationProductData.MobileTicketActivation) activationProductData).f7995a);
        }
        if (activationProductData instanceof ActivationProductData.MetroTicketActivation) {
            return new ChaloUserBookingType.TicketBooking.MetroTicketBooking(((ActivationProductData.MetroTicketActivation) activationProductData).f7994a);
        }
        if (activationProductData instanceof ActivationProductData.ONDCMetroTicketActivation) {
            return new ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking(((ActivationProductData.ONDCMetroTicketActivation) activationProductData).f7997a, null);
        }
        if (activationProductData instanceof ActivationProductData.ONDCTicketActivation) {
            return new ChaloUserBookingType.TicketBooking.OndcTicketBooking(((ActivationProductData.ONDCTicketActivation) activationProductData).f7998a);
        }
        if (activationProductData instanceof ActivationProductData.PremiumTicketActivation) {
            return new ChaloUserBookingType.TicketBooking.PremiumBusBooking(((ActivationProductData.PremiumTicketActivation) activationProductData).f8000a);
        }
        if (activationProductData instanceof ActivationProductData.MultiModalGroupTicketActivation) {
            return new ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking(((ActivationProductData.MultiModalGroupTicketActivation) activationProductData).f7996a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
