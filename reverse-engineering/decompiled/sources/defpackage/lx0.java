package defpackage;

import app.chalo.home.ui.profile.ProfileScreenViewIntent;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.homescreen.data.model.app.ProfilePageFeature;
import app.chalo.productactivation.ui.ProductActivationIntent;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lx0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18354a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ lx0(Function1 function1, int i) {
        this.f18354a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18354a) {
            case 0:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activateMetroTicketScreen"));
                break;
            case 1:
                this.b.invoke(new ProfileScreenViewIntent.ProfilePageItemClickedIntent(ProfilePageFeature.CHANGE_ENVIRONMENT, null, null));
                break;
            case 2:
                this.b.invoke(ProfileScreenViewIntent.DeleteAccountDialogAgreeClicked.f3607a);
                break;
            case 3:
                this.b.invoke(new ProfileScreenViewIntent.ProfilePageItemClickedIntent(ProfilePageFeature.TERMS_CONDITIONS, null, null));
                break;
            case 4:
                this.b.invoke(ProfileScreenViewIntent.DeleteAccountDialogCancelClicked.f3608a);
                break;
            case 5:
                this.b.invoke(ProfileScreenViewIntent.DeleteAccountDialogCancelClicked.f3608a);
                break;
            case 6:
                this.b.invoke(ProfileScreenViewIntent.DismissLogoutFailedDialog.f3610a);
                break;
            case 7:
                this.b.invoke(ProfileScreenViewIntent.JuspayBackPressedIntent.f3611a);
                break;
            case 8:
                this.b.invoke(ProfileScreenViewIntent.ChaloPayIntroBottomSheetCtaClickedIntent.f3605a);
                break;
            case 9:
                this.b.invoke(ProfileScreenViewIntent.DismissAccountSettingsBottomSheet.f3609a);
                break;
            case 10:
                this.b.invoke(QRScannerViewIntent.OnValidateFailedErrorButtonClickedIntent.f10729a);
                break;
            case 11:
                this.b.invoke(QRScannerViewIntent.OnValidateDetailsButtonClickedIntent.f10728a);
                break;
            case 12:
                this.b.invoke(QuickpayTripAmountIntent.QuickPayHistoryClickedIntent.f8880a);
                break;
            case 13:
                this.b.invoke(QuickpayTripAmountIntent.NextIntent.f8874a);
                break;
            case 14:
                this.b.invoke(QuickpayTripAmountIntent.OpenTncLinkIntent.f8877a);
                break;
            case 15:
                this.b.invoke(QuickpayTripAmountIntent.OnBottomSheetDismissIntent.f8875a);
                break;
            case 16:
                this.b.invoke(QuickpayTripAmountIntent.QuickPayBottomSheetPayClickedIntent.f8879a);
                break;
            case 17:
                this.b.invoke(QuickpayTripAmountIntent.PrerequisitesIntent.f8878a);
                break;
            case 18:
                this.b.invoke(QuickpayTripAmountIntent.OnBottomSheetDismissIntent.f8875a);
                break;
            case 19:
                this.b.invoke(QuickpayTripAmountIntent.NavigateToWalletBalanceIntent.f8873a);
                break;
            case 20:
                this.b.invoke(new RegularBusViewIntent.PermissionRationaleDialogInteraction(false));
                break;
            case 21:
                this.b.invoke(new RegularBusViewIntent.JuspayPermissionRationaleDialogInteraction(true));
                break;
            case 22:
                this.b.invoke(new RegularBusViewIntent.JuspayPermissionRationaleDialogInteraction(false));
                break;
            case 23:
                this.b.invoke(RegularBusViewIntent.ProfileIconClickedIntent.f3647a);
                break;
            case 24:
                this.b.invoke(RegularBusViewIntent.LocationItemClickedIntent.f3641a);
                break;
            case 25:
                this.b.invoke(RegularBusViewIntent.SosClickedIntent.f3660a);
                break;
            case 26:
                this.b.invoke(RegularBusViewIntent.LocationTooltipCancelButtonClickedIntent.f3642a);
                break;
            case 27:
                this.b.invoke(RegularBusViewIntent.BottomSheetDismissIntent.f3638a);
                break;
            case 28:
                this.b.invoke(RegularBusViewIntent.ScanAndPayBackPressedIntent.f3654a);
                break;
            default:
                this.b.invoke(RegularBusViewIntent.ScanAndPayBackPressedIntent.f3654a);
                break;
        }
        return Unit.f17538a;
    }
}
