package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.features.productsync.error.AutoLinkDeviceFailedException;
import app.chalo.home.data.exceptions.PremiumPassSavingException;
import app.chalo.home.ui.profile.ProfileScreenDialogType;
import app.chalo.home.ui.profile.ProfileScreenViewState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketTrackingState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState;
import app.chalo.resultstatemanager.ResultStateDataHolder;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRValidationBottomSheetType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15590a;
    public final /* synthetic */ String b;

    public /* synthetic */ eu0(String str, int i) {
        this.f15590a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        switch (this.f15590a) {
            case 0:
                PremiumBusProductModificationReasonsViewState it = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusProductModificationReasonsViewState.a(it, null, null, null, null, null, false, null, this.b, false, null, null, null, null, null, null, 65215);
            case 1:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, true, this.b, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -98307);
            case 2:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, true, this.b, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -98307);
            case 3:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = this.b;
                }
                return new PremiumPassSavingException(genericChaloErrorResponse, str);
            case 4:
                PremiumReserveTicketPostBookingActionState it2 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it2, "it");
                return PremiumReserveTicketPostBookingActionState.a(it2, null, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumReserveTicketTrackingState.GpsTrackingStarted(this.b), null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -65537, 31);
            case 5:
                PremiumReserveTicketPostBookingActionState it3 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it3, "it");
                return PremiumReserveTicketPostBookingActionState.a(it3, null, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumReserveTicketTrackingState.TrackingNotStarted(this.b), null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -65537, 31);
            case 6:
                PremiumReserveTicketPostBookingActionState it4 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it4, "it");
                return PremiumReserveTicketPostBookingActionState.a(it4, null, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumReserveTicketTrackingState.GpsTrackingStarted(this.b), null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -65537, 31);
            case 7:
                return PremiumReserveTicketPostBookingActionState.a((PremiumReserveTicketPostBookingActionState) obj, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumBusPostBookingBottomSheetType.Error(this.b), null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 8:
                return PremiumReserveTicketPostBookingActionState.a((PremiumReserveTicketPostBookingActionState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, new PremiumReserveTicketTrackingState.GpsTrackingNotAvailable(this.b), null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -65537, 31);
            case 9:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, this.b);
                return Unit.f17538a;
            case 10:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, this.b);
                return Unit.f17538a;
            case 11:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str2 = genericChaloErrorResponse2.b) == null) {
                    str2 = this.b;
                }
                return new AutoLinkDeviceFailedException(genericChaloErrorResponse2, str2);
            case 12:
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, this.b);
                return Unit.f17538a;
            case 13:
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, null, null, new ProfileScreenDialogType.LogoutFailed(this.b), false, null, false, false, null, false, false, 1011);
            case 14:
                return ProfileScreenViewState.a((ProfileScreenViewState) obj, null, null, new ProfileScreenDialogType.LogoutFailed(this.b), false, null, false, false, null, false, false, 1011);
            case 15:
                QRScannerDataState it5 = (QRScannerDataState) obj;
                Intrinsics.i(it5, "it");
                return QRScannerDataState.a(it5, null, null, null, null, null, null, null, null, true, false, new QRValidationBottomSheetType.ValidationFailed(this.b), null, null, 12799);
            case 16:
                return QRScannerDataState.a((QRScannerDataState) obj, null, null, null, null, null, null, null, null, true, false, new QRValidationBottomSheetType.ValidationFailed(this.b), null, null, 12799);
            case 17:
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                execute4.bindString(0, this.b);
                return Unit.f17538a;
            case 18:
                SqlPreparedStatement execute5 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute5, "$this$execute");
                execute5.bindString(0, this.b);
                return Unit.f17538a;
            case 19:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, TripAmountState.WALLET_ERROR, this.b, null, 0L, false, false, null, 0L, false, null, 1004);
            case 20:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, TripAmountState.INCORRECT_AMOUNT, this.b, null, 0L, false, false, null, 0L, false, null, 1004);
            case 21:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, this.b, null, 0L, false, false, null, 0L, false, null, 1021);
            case 22:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, TripAmountState.CORRECT_AMOUNT, this.b, null, 0L, true, false, null, 0L, false, null, 1004);
            case 23:
                SqlPreparedStatement execute6 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute6, "$this$execute");
                execute6.bindString(0, this.b);
                return Unit.f17538a;
            case 24:
                SqlPreparedStatement execute7 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute7, "$this$execute");
                execute7.bindString(0, this.b);
                return Unit.f17538a;
            case 25:
                SqlPreparedStatement execute8 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute8, "$this$execute");
                execute8.bindString(0, this.b);
                return Unit.f17538a;
            case 26:
                SqlPreparedStatement execute9 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute9, "$this$execute");
                execute9.bindString(0, this.b);
                return Unit.f17538a;
            case 27:
                SqlPreparedStatement execute10 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute10, "$this$execute");
                execute10.bindString(0, this.b);
                return Unit.f17538a;
            case 28:
                SqlPreparedStatement execute11 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute11, "$this$execute");
                execute11.bindString(0, this.b);
                return Unit.f17538a;
            default:
                ResultStateDataHolder it6 = (ResultStateDataHolder) obj;
                Intrinsics.i(it6, "it");
                return Boolean.valueOf(Intrinsics.d(it6.f9040a, this.b));
        }
    }
}
