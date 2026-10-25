package defpackage;

import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetType;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.bulkbookingridedetails.data.exception.PbBulkBookingRideDetailsException;
import app.chalo.premiumbus.bulkbookingridedetails.data.exception.PbUpdatePassStartDateException;
import app.chalo.premiumbus.bulkbookingridedetails.ui.BulkBookingRideDetailsScreenType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.LinkedBookingLayoutType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBulkBookingUpcomingRidesCardData;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mq0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18420a;

    public /* synthetic */ mq0(int i) {
        this.f18420a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18420a) {
            case 0:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, PaymentBottomSheetType.InAppUpiSmsPermissionBottomSheet.f1521a, null, false, false, false, null, false, null, 2096127);
            case 1:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2096127);
            case 2:
                return PaymentDataState.a((PaymentDataState) obj, null, true, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2097145);
            case 3:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2096125);
            case 4:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2097149);
            case 5:
                PaymentDataState it = (PaymentDataState) obj;
                Intrinsics.i(it, "it");
                return PaymentDataState.a(it, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2096639);
            case 6:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2064383);
            case 7:
                PbBulkBookingRideDetailsViewState it2 = (PbBulkBookingRideDetailsViewState) obj;
                Intrinsics.i(it2, "it");
                return PbBulkBookingRideDetailsViewState.a(it2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, false, null, null, null, null, false, null, false, 67076095);
            case 8:
                PbBulkBookingRideDetailsViewState it3 = (PbBulkBookingRideDetailsViewState) obj;
                Intrinsics.i(it3, "it");
                return PbBulkBookingRideDetailsViewState.a(it3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 66060287);
            case 9:
                PbBulkBookingRideDetailsViewState it4 = (PbBulkBookingRideDetailsViewState) obj;
                Intrinsics.i(it4, "it");
                return PbBulkBookingRideDetailsViewState.a(it4, null, null, null, null, null, null, null, null, null, null, null, BulkBookingRideDetailsScreenType.Failure, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 67106815);
            case 10:
                PbBulkBookingRideDetailsViewState it5 = (PbBulkBookingRideDetailsViewState) obj;
                Intrinsics.i(it5, "it");
                return PbBulkBookingRideDetailsViewState.a(it5, null, null, null, null, null, null, null, null, null, null, LinkedBookingLayoutType.Loading, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 67107839);
            case 11:
                PremiumBusBulkBookingUpcomingRidesCardData it6 = (PremiumBusBulkBookingUpcomingRidesCardData) obj;
                Intrinsics.i(it6, "it");
                return Boolean.valueOf(it6.i == PremiumReserveTicketStatus.ACTIVE);
            case 12:
                PbBulkBookingRideDetailsViewState it7 = (PbBulkBookingRideDetailsViewState) obj;
                Intrinsics.i(it7, "it");
                return PbBulkBookingRideDetailsViewState.a(it7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, false, null, null, null, null, false, null, false, 67076095);
            case 13:
                PbBulkBookingRideDetailsViewState it8 = (PbBulkBookingRideDetailsViewState) obj;
                Intrinsics.i(it8, "it");
                return PbBulkBookingRideDetailsViewState.a(it8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 66060287);
            case 14:
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, LinkedBookingLayoutType.Failure, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 67107839);
            case 15:
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 67076095);
            case 16:
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, PbBulkBookingRideDetailsDialogType.ProductDisabledDialog.f6914a, null, null, false, null, false, 66027519);
            case 17:
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, PbBulkBookingRideDetailsDialogType.ProductDisabledDialog.f6914a, null, null, false, null, false, 66027519);
            case 18:
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 67076095);
            case 19:
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 66027519);
            case 20:
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, 67076095);
            case 21:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new PbUpdatePassStartDateException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 22:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new PbBulkBookingRideDetailsException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 23:
                PbPassPurchaseLandingScreenDataState it9 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it9, "it");
                return PbPassPurchaseLandingScreenDataState.a(it9, null, false, false, false, null, null, null, null, false, false, 4055);
            case 24:
                PbPassPurchaseLandingScreenDataState it10 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it10, "it");
                return PbPassPurchaseLandingScreenDataState.a(it10, null, false, false, false, null, null, null, null, false, false, 4063);
            case 25:
                PbPassPurchaseLandingScreenDataState it11 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it11, "it");
                return PbPassPurchaseLandingScreenDataState.a(it11, null, false, false, false, PBStopSelectionScreenBottomSheetType.NewRouteSuggestionSubmitSuccess.f7958a, null, null, null, false, false, 4055);
            case 26:
                PbPassPurchaseLandingScreenDataState it12 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it12, "it");
                return PbPassPurchaseLandingScreenDataState.a(it12, null, false, false, false, null, null, null, null, false, false, 4055);
            case 27:
                PbPassPurchaseLandingScreenDataState it13 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it13, "it");
                return PbPassPurchaseLandingScreenDataState.a(it13, null, false, false, true, null, null, null, null, false, false, 4055);
            case 28:
                PbPassPurchaseLandingScreenDataState it14 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it14, "it");
                return PbPassPurchaseLandingScreenDataState.a(it14, null, false, false, true, null, null, null, null, false, false, 4087);
            default:
                PbPassPurchaseLandingScreenDataState it15 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it15, "it");
                return PbPassPurchaseLandingScreenDataState.a(it15, null, true, false, false, null, null, null, null, false, false, 3577);
        }
    }
}
