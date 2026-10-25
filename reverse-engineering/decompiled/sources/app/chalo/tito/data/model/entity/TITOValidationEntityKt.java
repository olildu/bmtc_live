package app.chalo.tito.data.model.entity;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.titoridedetail.data.app.TITOProductSubType;
import app.chalo.titoridedetail.data.app.TITOProductType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TITOValidationEntityKt {
    public static final TITOProductSubType a(ValidationProduct validationProduct) {
        Intrinsics.i(validationProduct, "<this>");
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
            return TITOProductSubType.INSTANT_TICKET;
        }
        if ((validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
            return null;
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) {
            return TITOProductSubType.SINGLE_JOURNEY_TICKET;
        }
        if (validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) {
            return TITOProductSubType.QUICK_PAY;
        }
        if (validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) {
            return TITOProductSubType.MAGIC_PASS;
        }
        if (validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation) {
            return TITOProductSubType.RIDE_BASED_PASS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TITOProductType b(ValidationProduct validationProduct) {
        Intrinsics.i(validationProduct, "<this>");
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
            return TITOProductType.INSTANT_TICKET;
        }
        if ((validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
            return null;
        }
        if (validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) {
            return TITOProductType.SINGLE_JOURNEY_TICKET;
        }
        if (validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) {
            return TITOProductType.QUICK_PAY;
        }
        if (validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) {
            return TITOProductType.SUPER_PASS;
        }
        if (validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation) {
            return TITOProductType.SUPER_PASS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
