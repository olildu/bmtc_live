package defpackage;

import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.PermissionsRationaleDialogKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.core.compose.NetworkInspectorScreenKt;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayoutKt;
import app.chalo.home.ui.compose.PBStopImageKt;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import app.chalo.home.ui.profile.ProfileScreenViewState;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PBPreBookingSuccessProceedScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbPassInfoBanner;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusInAppCommunicationBottomSheetScreenKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTicketActivationMoreOptionsListKt;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationDialogType;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PBStopImagesDetails;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.ui.changestop.ChangeStopResultScreenUIState;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenContent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComposablesKt;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerDetailsUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerRowUiState;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenType;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingScreenKt;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionScreenKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionViewState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsViewState;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusLandingScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.productbooking.pickstop.PickStopUiSpecs;
import app.chalo.productbooking.pickstop.ui.PickStopScreenKt;
import app.chalo.uistate.text.TextUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.TicketGridItemUIState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wm0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19943a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wm0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f19943a = i2;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19943a) {
            case 0:
                ((Integer) obj2).getClass();
                NetworkInspectorScreenKt.b((String) this.d, (Modifier) this.b, (Function3) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                NewPremiumBusActivationBottomSheetContentKt.b((Modifier) this.b, (PremiumBusBookingTripTimeInfoState) this.d, (PremiumBusPostBookingStopSchedule) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                NewPremiumBusActivationBottomSheetContentKt.o((Modifier) this.b, (PremiumBusBookingVehicleInfoState) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                NewPremiumBusReserveTicketActivationScreenKt.a((NewPremiumBusReserveTicketActivationState) this.d, (BottomSheetScaffoldState) this.b, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                PBPreBookingSuccessProceedScreenKt.a((PbBulkBookingRideDetailsViewState) this.d, (Function0) this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                PBStopDetailsMainScreenKt.a((PremiumBusStopDetailsViewState) this.d, (Function1) this.b, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                PBStopDetailsMainScreenKt.d((PremiumBusStopDetailsViewState) this.d, (BottomSheetScaffoldState) this.b, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PBStopImageKt.a((Modifier) this.b, (PBStopImagesDetails) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                PbBulkBookingRideDetailsScreenKt.d((PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog) this.d, (Function1) this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                PbBulkBookingRideDetailsScreenKt.q((List) this.d, (PbBulkBookingRideDetailsTabType) this.b, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                PbBulkBookingRideDetailsScreenKt.f((Modifier) this.b, (PbPassInfoBanner) this.d, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                PbPassPurchaseLandingScreenKt.d((PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState) this.d, (SheetState) this.b, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                PermissionsRationaleDialogKt.a((String) this.d, (Function0) this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                PickStopScreenKt.g((ArrayList) this.d, (TextUIState.ChaloTextUIState) this.b, (PickStopUiSpecs) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                PremiumBusChangeStopComposablesKt.c((Modifier) this.b, (ChangeStopResultScreenUIState) this.d, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                PremiumBusChangeStopScreenKt.c((ChangeStopScreenContent.StopList) this.d, (BottomSheetScaffoldState) this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.j((PremiumBusPassengerRowUiState) this.d, (PremiumBusPassengerDetailsUISpecs) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                PremiumBusInAppCommunicationBottomSheetScreenKt.a((PremiumBusInAppCommunicationBottomSheetData) this.d, (Function0) this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 18:
                Modifier modifier = (Modifier) this.b;
                Function1 function1 = (Function1) this.d;
                ((Integer) obj2).getClass();
                PremiumBusLandingScreenKt.f((Function0) this.e, function1, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                PremiumBusLandingScreenKt.a((PremiumBusStopSelectionViewState) this.d, (Function1) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                PremiumBusProductModificationReasonsScreenKt.d((PremiumBusProductModificationReasonAppModel) this.d, (Function0) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                PremiumBusProductModificationReasonsScreenKt.c((String) this.d, (PremiumBusProductModificationDialogType) this.b, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                PremiumBusProductSelectionScreenKt.c((Modifier) this.b, (PremiumBusProductSelectionViewState) this.d, (PremiumBusProductSelectionComponent) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                PremiumBusSlotSelectionScreenKt.i((PremiumBusBottomSheetTypeUIState) this.d, (Function1) this.b, (SheetState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                PremiumBusStopSelectionScreenKt.c((PremiumBusStopSelectionViewState) this.d, (TimeUtilsContract) this.b, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                PremiumBusTicketActivationMoreOptionsListKt.c((PremiumBusProductOptionsAppModel) this.d, (Modifier) this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                PremiumBusUpcomingBottomSheetLayoutKt.b((PremiumBusBookingTripTimeInfoState.LiveEta) this.d, (NewPremiumReserveTicketDetailsScreenType) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.h((ProfileScreenViewState) this.d, (Function1) this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                QRValidationScreenKt.m((String) this.d, (ChaloPadding) this.e, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                QRValidationScreenKt.h((TicketGridItemUIState) this.d, (Modifier) this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ wm0(Modifier modifier, Object obj, Object obj2, int i, int i2) {
        this.f19943a = i2;
        this.b = modifier;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ wm0(Object obj, Object obj2, Modifier modifier, int i, int i2) {
        this.f19943a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = modifier;
        this.c = i;
    }
}
