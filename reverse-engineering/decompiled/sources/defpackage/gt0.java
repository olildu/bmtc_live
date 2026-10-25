package defpackage;

import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.home.data.exceptions.FetchRouteSchedulesException;
import app.chalo.home.ui.PremiumBusNotificationViewState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.data.models.app.EligibleStopAppModel;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationDialogType;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationDataState;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenState;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsComponentDataState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15765a;

    public /* synthetic */ gt0(int i) {
        this.f15765a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15765a) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("post_ride_feedback_table");
                return Unit.f17538a;
            case 1:
                PremiumBusBulkBookingConfirmationDataState it = (PremiumBusBulkBookingConfirmationDataState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusBulkBookingConfirmationDataState.a(it, true, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 32766);
            case 2:
                PremiumBusBulkBookingConfirmationDataState it2 = (PremiumBusBulkBookingConfirmationDataState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusBulkBookingConfirmationDataState.a(it2, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 32766);
            case 3:
                PremiumBusBulkBookingConfirmationDataState it3 = (PremiumBusBulkBookingConfirmationDataState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusBulkBookingConfirmationDataState.a(it3, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 24575);
            case 4:
                SeatInfoAppModel it4 = (SeatInfoAppModel) obj;
                Intrinsics.i(it4, "it");
                return it4.c;
            case 5:
                PremiumBusBulkBookingConfirmationDataState it5 = (PremiumBusBulkBookingConfirmationDataState) obj;
                Intrinsics.i(it5, "it");
                return PremiumBusBulkBookingConfirmationDataState.a(it5, false, null, null, null, null, null, null, null, null, null, null, null, null, true, false, 24575);
            case 6:
                PremiumBusBulkBookingConfirmationDataState it6 = (PremiumBusBulkBookingConfirmationDataState) obj;
                Intrinsics.i(it6, "it");
                return PremiumBusBulkBookingConfirmationDataState.a(it6, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 24575);
            case 7:
                return PremiumBusBulkBookingConfirmationDataState.a((PremiumBusBulkBookingConfirmationDataState) obj, true, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 32766);
            case 8:
                return PremiumBusBulkBookingConfirmationDataState.a((PremiumBusBulkBookingConfirmationDataState) obj, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 32766);
            case 9:
                return PremiumBusBulkBookingConfirmationDataState.a((PremiumBusBulkBookingConfirmationDataState) obj, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 32766);
            case 10:
                return PremiumBusBulkBookingConfirmationDataState.a((PremiumBusBulkBookingConfirmationDataState) obj, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 32766);
            case 11:
                PremiumBusChangeStopDataState it7 = (PremiumBusChangeStopDataState) obj;
                Intrinsics.i(it7, "it");
                return PremiumBusChangeStopDataState.a(it7, null, null, null, null, null, EmptyList.f17557a, null, MapsKt.d(), null, null, null, null, null, MapCameraViewState.InitialState.NoState.f1881a, ChangeStopScreenState.Loading.f7520a, 1823);
            case 12:
                EligibleStopAppModel it8 = (EligibleStopAppModel) obj;
                Intrinsics.i(it8, "it");
                return it8.f7080a;
            case 13:
                PremiumBusChangeStopDataState it9 = (PremiumBusChangeStopDataState) obj;
                Intrinsics.i(it9, "it");
                return PremiumBusChangeStopDataState.a(it9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ChangeStopScreenState.StopSelection.f7521a, 16383);
            case 14:
                return PremiumBusChangeStopDataState.a((PremiumBusChangeStopDataState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ChangeStopScreenState.Confirming.f7518a, 16383);
            case 15:
                return PremiumBusChangeStopDataState.a((PremiumBusChangeStopDataState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ChangeStopScreenState.Success.f7522a, 16383);
            case 16:
                PremiumBusFareDetailsComponentDataState it10 = (PremiumBusFareDetailsComponentDataState) obj;
                PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = PremiumBusFareDetailsComponent.z;
                Intrinsics.i(it10, "it");
                return PremiumBusFareDetailsComponentDataState.a(it10, null, null, false, null, null, null, false, 119);
            case 17:
                return PremiumBusFareDetailsComponentDataState.a((PremiumBusFareDetailsComponentDataState) obj, null, null, true, null, null, null, false, 115);
            case 18:
                SeatInfoAppModel it11 = (SeatInfoAppModel) obj;
                float f = PremiumBusFareDetailsUiStateFactory.c;
                Intrinsics.i(it11, "it");
                return it11.c;
            case 19:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new FetchRouteSchedulesException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 20:
                return new PremiumBusNotificationViewState(((PremiumBusNotificationViewState) obj).f3177a, false);
            case 21:
                PremiumBusProductModificationReasonsViewState it12 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it12, "it");
                return PremiumBusProductModificationReasonsViewState.a(it12, null, PremiumBusProductModificationDialogType.RESCHEDULE_CONFIRMATION, null, null, null, false, null, null, false, null, null, null, null, null, null, 65517);
            case 22:
                PremiumBusProductModificationReasonsViewState it13 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it13, "it");
                return PremiumBusProductModificationReasonsViewState.a(it13, null, null, null, PremiumBusBottomSheetTypeUIState.NoSlotAvailableBottomSheet.f7840a, null, false, null, null, false, null, null, null, null, null, null, 65007);
            case 23:
                PremiumBusProductModificationReasonsViewState it14 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it14, "it");
                return PremiumBusProductModificationReasonsViewState.a(it14, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65519);
            case 24:
                PremiumBusProductModificationReasonsViewState it15 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it15, "it");
                return PremiumBusProductModificationReasonsViewState.a(it15, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65533);
            case 25:
                PremiumBusProductModificationReasonsViewState it16 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it16, "it");
                return PremiumBusProductModificationReasonsViewState.a(it16, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65519);
            case 26:
                PremiumBusProductModificationReasonsViewState it17 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it17, "it");
                return PremiumBusProductModificationReasonsViewState.a(it17, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65519);
            case 27:
                PremiumBusProductModificationReasonsViewState it18 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it18, "it");
                return PremiumBusProductModificationReasonsViewState.a(it18, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65533);
            case 28:
                PremiumBusProductModificationReasonsViewState it19 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it19, "it");
                return PremiumBusProductModificationReasonsViewState.a(it19, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65533);
            default:
                PremiumBusProductModificationReasonsViewState it20 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it20, "it");
                return PremiumBusProductModificationReasonsViewState.a(it20, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, 65533);
        }
    }
}
