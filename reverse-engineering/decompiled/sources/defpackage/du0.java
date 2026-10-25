package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.data.errors.PremiumBusException;
import app.chalo.premiumbus.data.exceptions.PBAvailableSlotsFetchFailedException;
import app.chalo.premiumbus.data.exceptions.PBPreBookingBulkBookFailedException;
import app.chalo.premiumbus.data.exceptions.PBPreBookingSlotsFetchFailedException;
import app.chalo.premiumbus.data.exceptions.PBTicketOrderCreationFailedException;
import app.chalo.premiumbus.data.exceptions.PBTicketReceiptFetchFailedException;
import app.chalo.premiumbus.data.exceptions.PBTicketUpdateOptionsFetchFailedException;
import app.chalo.premiumbus.data.exceptions.PBTicketUpdateReasonsFetchFailedException;
import app.chalo.premiumbus.data.exceptions.PBTicketUserCancellationFailedException;
import app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException;
import app.chalo.premiumbus.data.exceptions.PremiumBusSeatChangeFailureException;
import app.chalo.premiumbus.data.exceptions.PremiumBusSeatSelectionLayoutFetchFailureException;
import app.chalo.premiumbus.data.exceptions.ReserveSeatThroughPassFailedException;
import app.chalo.premiumbus.data.models.api.request.ChangeStopException;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationDialogType;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import app.chalo.productbooking.common.data.exception.MobileTicketProductFetchFailedException;
import app.chalo.productbooking.common.data.exception.ProductConfigsForUiFetchFailedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class du0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15494a;

    public /* synthetic */ du0(int i) {
        this.f15494a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15494a) {
            case 0:
                PremiumBusProductModificationReasonsViewState it = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusProductModificationReasonsViewState.a(it, null, null, null, null, null, false, null, null, true, null, null, null, null, null, null, 65021);
            case 1:
                PremiumBusProductModificationReasonsViewState it2 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusProductModificationReasonsViewState.a(it2, null, null, null, null, null, true, null, null, false, null, null, null, null, null, null, 65215);
            case 2:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, null, null, PremiumBusBottomSheetTypeUIState.NoODPairAvailableBottomSheet.f7839a, null, false, null, null, false, null, null, null, null, null, null, 65007);
            case 3:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65023);
            case 4:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65533);
            case 5:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, PremiumBusProductModificationDialogType.LOADING, null, null, null, false, null, null, false, null, null, null, null, null, null, 65533);
            case 6:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65023);
            case 7:
                PremiumBusProductSelectionDataState it3 = (PremiumBusProductSelectionDataState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusProductSelectionDataState.a(it3, false, true, null, false, null, null, false, null, null, 509);
            case 8:
                PremiumBusProductSelectionDataState it4 = (PremiumBusProductSelectionDataState) obj;
                Intrinsics.i(it4, "it");
                return PremiumBusProductSelectionDataState.a(it4, false, false, null, false, null, null, false, null, null, TypedValues.PositionType.TYPE_DRAWPATH);
            case 9:
                return PremiumBusProductSelectionDataState.a((PremiumBusProductSelectionDataState) obj, false, false, null, false, null, null, false, null, null, 509);
            case 10:
                return PremiumBusProductSelectionDataState.a((PremiumBusProductSelectionDataState) obj, false, false, null, false, null, null, false, null, null, 509);
            case 11:
                return PremiumBusProductSelectionDataState.a((PremiumBusProductSelectionDataState) obj, false, false, null, false, null, null, false, null, null, 509);
            case 12:
                return PremiumBusProductSelectionDataState.a((PremiumBusProductSelectionDataState) obj, false, false, null, false, null, null, false, null, null, 509);
            case 13:
                return PremiumBusProductSelectionDataState.a((PremiumBusProductSelectionDataState) obj, false, false, null, false, null, null, false, null, null, 509);
            case 14:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new PBTicketUpdateReasonsFetchFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 15:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new PremiumBusSeatChangeFailureException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 16:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new PremiumBusException.PremiumBusProductConfigFetchFailedException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 17:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                return new PBUserRescheduleFailedException(genericChaloErrorResponse4, genericChaloErrorResponse4 != null ? genericChaloErrorResponse4.b : null);
            case 18:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                return new MobileTicketProductFetchFailedException(genericChaloErrorResponse5, genericChaloErrorResponse5 != null ? genericChaloErrorResponse5.b : null);
            case 19:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                return new ChangeStopException(genericChaloErrorResponse6, genericChaloErrorResponse6 != null ? genericChaloErrorResponse6.b : null);
            case 20:
                GenericChaloErrorResponse genericChaloErrorResponse7 = (GenericChaloErrorResponse) obj;
                return new PBTicketOrderCreationFailedException(genericChaloErrorResponse7, genericChaloErrorResponse7 != null ? genericChaloErrorResponse7.b : null);
            case 21:
                GenericChaloErrorResponse genericChaloErrorResponse8 = (GenericChaloErrorResponse) obj;
                return new PremiumBusSeatSelectionLayoutFetchFailureException(genericChaloErrorResponse8, genericChaloErrorResponse8 != null ? genericChaloErrorResponse8.b : null);
            case 22:
                GenericChaloErrorResponse genericChaloErrorResponse9 = (GenericChaloErrorResponse) obj;
                return new PBPreBookingBulkBookFailedException(genericChaloErrorResponse9, genericChaloErrorResponse9 != null ? genericChaloErrorResponse9.b : null);
            case 23:
                GenericChaloErrorResponse genericChaloErrorResponse10 = (GenericChaloErrorResponse) obj;
                return new PBTicketUserCancellationFailedException(genericChaloErrorResponse10, genericChaloErrorResponse10 != null ? genericChaloErrorResponse10.b : null);
            case 24:
                GenericChaloErrorResponse genericChaloErrorResponse11 = (GenericChaloErrorResponse) obj;
                return new PBAvailableSlotsFetchFailedException(genericChaloErrorResponse11 != null ? genericChaloErrorResponse11.b : null);
            case 25:
                GenericChaloErrorResponse genericChaloErrorResponse12 = (GenericChaloErrorResponse) obj;
                return new PBTicketUpdateOptionsFetchFailedException(genericChaloErrorResponse12, genericChaloErrorResponse12 != null ? genericChaloErrorResponse12.b : null);
            case 26:
                GenericChaloErrorResponse genericChaloErrorResponse13 = (GenericChaloErrorResponse) obj;
                return new PBPreBookingSlotsFetchFailedException(genericChaloErrorResponse13, genericChaloErrorResponse13 != null ? genericChaloErrorResponse13.b : null);
            case 27:
                GenericChaloErrorResponse genericChaloErrorResponse14 = (GenericChaloErrorResponse) obj;
                return new ReserveSeatThroughPassFailedException(genericChaloErrorResponse14, genericChaloErrorResponse14 != null ? genericChaloErrorResponse14.b : null);
            case 28:
                GenericChaloErrorResponse genericChaloErrorResponse15 = (GenericChaloErrorResponse) obj;
                return new PBTicketReceiptFetchFailedException(genericChaloErrorResponse15, genericChaloErrorResponse15 != null ? genericChaloErrorResponse15.b : null);
            default:
                GenericChaloErrorResponse genericChaloErrorResponse16 = (GenericChaloErrorResponse) obj;
                return new ProductConfigsForUiFetchFailedException(genericChaloErrorResponse16, genericChaloErrorResponse16 != null ? genericChaloErrorResponse16.b : null);
        }
    }
}
