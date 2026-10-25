package defpackage;

import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoViewIntent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoRefreshRequestSource;
import app.chalo.validationsdk.blevalidation.ui.BleValidationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ya implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20091a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ya(Function1 function1, int i) {
        this.f20091a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20091a) {
            case 0:
                this.b.invoke(BleValidationIntent.DismissBottomSheetIntent.f10587a);
                break;
            case 1:
                this.b.invoke(BleValidationIntent.DismissBottomSheetIntent.f10587a);
                break;
            case 2:
                this.b.invoke(BleValidationIntent.ShowNearbyDevicesPermRationaleBottomsheetOkClickedIntent.f10595a);
                break;
            case 3:
                this.b.invoke(BleValidationIntent.TapToValidateBottomsheetTutorialOkClickedIntent.f10599a);
                break;
            case 4:
                this.b.invoke(BleValidationIntent.ConductorValidationExitBtnClickedPostValidationIntent.f10586a);
                break;
            case 5:
                this.b.invoke(BleValidationIntent.ViewTripReceiptPostConductorValidationCompleteIntent.f10604a);
                break;
            case 6:
                this.b.invoke(BleValidationIntent.TITOValidationExitBtnClickedPostTapOutIntent.f10598a);
                break;
            case 7:
                this.b.invoke(BleValidationIntent.ViewTripReceiptPostTapOutIntent.f10605a);
                break;
            case 8:
                this.b.invoke(BleValidationIntent.ReportProblemIntent.f10591a);
                break;
            case 9:
                this.b.invoke(BleValidationIntent.ProductDetailsBottomSheetCardOkClickedIntent.f10589a);
                break;
            case 10:
                this.b.invoke(BleValidationIntent.ActivationExpiredDialogOkClickedIntent.f10579a);
                break;
            case 11:
                this.b.invoke(BleValidationIntent.UnableToVerifyTapHereClickedIntent.f10601a);
                break;
            case 12:
                this.b.invoke(BleValidationIntent.TurnOnBluetoothManuallyIntent.f10600a);
                break;
            case 13:
                this.b.invoke(BleValidationIntent.SwitchToQRAfterDenyingBlePermissionsClickedIntent.f10597a);
                break;
            case 14:
                this.b.invoke(BleValidationIntent.ActivationExpiredDialogSeeDetailsClickedIntent.f10580a);
                break;
            case 15:
                this.b.invoke(BleValidationIntent.AskBlePermissionsAgainOrOpenSettingsPageIfNeededIntent.f10581a);
                break;
            case 16:
                this.b.invoke(BleValidationIntent.SwitchToQRAfterDenyingBlePermissionsClickedIntent.f10597a);
                break;
            case 17:
                this.b.invoke(BleValidationIntent.ShowProductDetailsBottomSheetIntent.f10596a);
                break;
            case 18:
                this.b.invoke(BleValidationIntent.BackClickedIntent.f10582a);
                break;
            case 19:
                this.b.invoke(BleValidationIntent.UseQRCodeClicked.f10602a);
                break;
            case 20:
                this.b.invoke(FareDetailsIntent.UserBillingInfoBottomSheetProceedClickedIntent.f3945a);
                break;
            case 21:
                this.b.invoke(ChaloCardInfoIntent.KnowMoreClicked.f6352a);
                break;
            case 22:
                this.b.invoke(new ChaloCardInfoIntent.RefreshDataClickedIntent(ChaloCardInfoRefreshRequestSource.EMPTY_ERROR_STATE_RETRY));
                break;
            case 23:
                this.b.invoke(ChaloCardInfoIntent.UseLinkCodeClickedIntent.f6357a);
                break;
            case 24:
                this.b.invoke(ChaloCardInfoIntent.UseLinkCodeClickedIntent.f6357a);
                break;
            case 25:
                this.b.invoke(ChaloBusRouteInfoViewIntent.DismissRouteSuggestionSheetIntent.f3337a);
                break;
            case 26:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionSuccessOkayIntent.f3353a);
                break;
            case 27:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionTimePickerDismissedIntent.f3354a);
                break;
            case 28:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionTimePickerDismissedIntent.f3354a);
                break;
            default:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RetryIntent.f3344a);
                break;
        }
        return Unit.f17538a;
    }
}
