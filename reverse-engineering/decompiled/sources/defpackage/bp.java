package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutViewIntent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenViewIntent;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsIntent;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionIntent;
import app.chalo.onboarding.cityselection.ui.CitySelectionIntent;
import app.chalo.ridehailing.feedback.RideFeedbackViewIntents;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11219a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ bp(Function1 function1, int i) {
        this.f11219a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11219a) {
            case 0:
                this.b.invoke(CityLocationSelectionIntent.OnExploreChaloCitiesClicked.f6588a);
                return Unit.f17538a;
            case 1:
                this.b.invoke(CityLocationSelectionIntent.OnEnableDeviceLocationClicked.f6586a);
                return Unit.f17538a;
            case 2:
                this.b.invoke(CityLocationSelectionIntent.OnEnterManuallyClicked.f6587a);
                return Unit.f17538a;
            case 3:
                this.b.invoke(CityLocationSelectionIntent.LocationSettingsDialogSettingClicked.f6584a);
                return Unit.f17538a;
            case 4:
                this.b.invoke(CityLocationSelectionIntent.LocationSettingsDialogCancelClicked.f6583a);
                return Unit.f17538a;
            case 5:
                this.b.invoke(CityLocationSelectionIntent.RetryCityFetch.f6592a);
                return Unit.f17538a;
            case 6:
                this.b.invoke(CityLocationSelectionIntent.ConfigFetchError.f6581a);
                return Unit.f17538a;
            case 7:
                this.b.invoke(CityLocationSelectionIntent.OnChangeLocationClicked.f6585a);
                return Unit.f17538a;
            case 8:
                this.b.invoke(CitySelectionIntent.RetryFetchIntent.f6620a);
                return Unit.f17538a;
            case 9:
                this.b.invoke(CitySelectionIntent.BackClickedIntent.f6617a);
                return Unit.f17538a;
            case 10:
                this.b.invoke(CitySelectionIntent.VoteForCityClickedIntent.f6623a);
                return Unit.f17538a;
            case 11:
                this.b.invoke(CitySelectionIntent.SearchPanelClickedIntent.f6621a);
                return Unit.f17538a;
            case 12:
                this.b.invoke(UniversalPickerIntent.ClearSearchTextFieldIntent.f5053a);
                return Unit.f17538a;
            case 13:
                this.b.invoke(UniversalPickerIntent.UseCurrentLocationClickedIntent.f5081a);
                return Unit.f17538a;
            case 14:
                this.b.invoke(UniversalPickerIntent.OnViewChaloCitiesClickIntent.f5062a);
                return Unit.f17538a;
            case 15:
                this.b.invoke(ConfirmBookingScreenViewIntent.OnProceedButtonClicked.f5466a);
                return Unit.f17538a;
            case 16:
                this.b.invoke(ConfirmBookingScreenViewIntent.OnRetryFareFetchClicked.f5467a);
                return Unit.f17538a;
            case 17:
                this.b.invoke(ConfirmBookingScreenViewIntent.TnCAcceptClickIntent.f5469a);
                return Unit.f17538a;
            case 18:
                this.b.invoke(CustomUrlCheckoutViewIntent.CheckoutBackPressed.f1457a);
                return Unit.f17538a;
            case 19:
                this.b.invoke(RideFeedbackViewIntents.OnSeeTripDetailsCardClick.f9165a);
                return Unit.f17538a;
            case 20:
                this.b.invoke(RideFeedbackViewIntents.OnNeedHelpClick.f9164a);
                return Unit.f17538a;
            case 21:
                this.b.invoke(EnterCardDetailsIntent.OnBottomsheetDismissed.f6328a);
                return Unit.f17538a;
            case 22:
                this.b.invoke(EnterCardDetailsIntent.ProceedBtnClickedIntentEnter.f6330a);
                return Unit.f17538a;
            case 23:
                this.b.invoke(EnterCardDetailsIntent.CardLinkBottomSheetLinkEnterCardClicked.f6324a);
                return Unit.f17538a;
            case 24:
                this.b.invoke(EnterCardDetailsIntent.EnterCardLinkBottomContinueWithRechargeClicked.f6325a);
                return Unit.f17538a;
            case 25:
                this.b.invoke(EnterCardDetailsIntent.OnRetryClicked.f6329a);
                return Unit.f17538a;
            case 26:
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$22$lambda$21(this.b);
            case 27:
                this.b.invoke(FareDetailsIntent.OrderCreationErrorDialogOkClickedIntent.f3942a);
                return Unit.f17538a;
            case 28:
                this.b.invoke(FareDetailsIntent.TermsAndConditionsTextClickedIntent.f3944a);
                return Unit.f17538a;
            default:
                this.b.invoke(FareDetailsIntent.TermsAndConditionsTextClickedIntent.f3944a);
                return Unit.f17538a;
        }
    }
}
