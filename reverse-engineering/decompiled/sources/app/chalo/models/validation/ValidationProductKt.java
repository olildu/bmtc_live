package app.chalo.models.validation;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ValidationProductKt {
    public static final Pair a(ValidationProduct validationProduct) {
        Intrinsics.i(validationProduct, "<this>");
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
            return new Pair("mobileTicket", "instantTicket");
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) {
            return new Pair("mobileTicket", "premiumReserveTicket");
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) {
            return new Pair("singleJourneyTicket", "singleJourneyTicket");
        }
        if (validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) {
            return new Pair("quickpay", "quickpay");
        }
        if (validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) {
            return new Pair("superPass", "magicPass");
        }
        if (validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation) {
            return new Pair("superPass", "rideBasedPass");
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) {
            return new Pair("mobileTicket", "ondcTicket");
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) {
            return new Pair("mobileTicket", "ondcMetroTicket");
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) {
            return new Pair("mobileTicket", "metroTicket");
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation) {
            return new Pair("mobileTicket", "multiModalTicket");
        }
        throw new NoWhenBranchMatchedException();
    }
}
