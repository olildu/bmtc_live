package defpackage;

import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyIntent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkIntent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoRefreshRequestSource;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryIntent;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedIntent;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ii implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15915a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ii(Function1 function1, int i) {
        this.f15915a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15915a) {
            case 0:
                this.b.invoke(ChaloBusUserProfileSurveyIntent.CancelBtnClickedIntent.f1208a);
                break;
            case 1:
                this.b.invoke(ChaloBusUserProfileSurveyIntent.TimePickerDoneClicked.f1218a);
                break;
            case 2:
                this.b.invoke(ChaloBusUserProfileSurveyIntent.TimePickerDismissed.f1217a);
                break;
            case 3:
                this.b.invoke(ChaloBusUserProfileSurveyIntent.TimePickerDismissed.f1217a);
                break;
            case 4:
                this.b.invoke(ChaloBusUserProfileSurveyIntent.BackClicked.f1207a);
                break;
            case 5:
                this.b.invoke(ChaloBusUserProfileSurveyIntent.SkipClicked.f1214a);
                break;
            case 6:
                this.b.invoke(ChaloBusUserProfileSurveyIntent.NextClicked.f1212a);
                break;
            case 7:
                this.b.invoke(ChaloCardInfoIntent.TapUnavailableBottomSheetOkClickIntent.f6356a);
                break;
            case 8:
                this.b.invoke(ChaloCardInfoIntent.UseLinkCodeClickedIntent.f6357a);
                break;
            case 9:
                this.b.invoke(ChaloCardInfoIntent.CardInfoBottomsheetDismissButtonClicked.f6346a);
                break;
            case 10:
                this.b.invoke(new ChaloCardInfoIntent.RefreshDataClickedIntent(ChaloCardInfoRefreshRequestSource.FETCH_FAILED_SNACKBAR_RETRY));
                break;
            case 11:
                this.b.invoke(ChaloCardInfoIntent.ConfirmationDialogNegativeButtonClick.f6349a);
                break;
            case 12:
                this.b.invoke(new ChaloCardInfoIntent.RefreshDataClickedIntent(ChaloCardInfoRefreshRequestSource.CARD_LINK_REFRESH));
                break;
            case 13:
                this.b.invoke(ChaloCardInfoIntent.CardLinkBottomSheetNegativeButtonClicked.f6347a);
                break;
            case 14:
                this.b.invoke(ChaloCardLinkIntent.CardAlreadyLinkedErrorDialogOkClickedLinkIntent.f6272a);
                break;
            case 15:
                this.b.invoke(ChaloCardRechargeAmountIntent.BottomSheetDismissedIntent.f6294a);
                break;
            case 16:
                this.b.invoke(ChaloCardRechargeAmountIntent.UseLinkCodeClickedIntent.f6305a);
                break;
            case 17:
                this.b.invoke(ChaloCardRechargeAmountIntent.RechargeSuccessPositiveButtonClicked.f6302a);
                break;
            case 18:
                this.b.invoke(ChaloCardRechargeAmountIntent.RechargeSuccessNegativeButtonClicked.f6301a);
                break;
            case 19:
                this.b.invoke(ChaloCardRechargeAmountIntent.TncDialogueAccepted.f6303a);
                break;
            case 20:
                this.b.invoke(ChaloCardRechargeAmountIntent.TncDialogueCancelled.f6304a);
                break;
            case 21:
                this.b.invoke(ChaloCardRechargeAmountIntent.ProceedBtnClickedIntent.f6300a);
                break;
            case 22:
                this.b.invoke(CardTransactionHistoryIntent.UnsyncedRechargeBannerViewMoreClickedIntent.f6434a);
                break;
            case 23:
                this.b.invoke(CardTransactionHistoryIntent.UnsyncedRechargeBannerViewMoreClickedIntent.f6434a);
                break;
            case 24:
                this.b.invoke(CardTransactionHistoryIntent.RetryIntent.f6432a);
                break;
            case 25:
                this.b.invoke(CardTransactionHistoryIntent.EmailAllTransactionHistoryDialogDismissed.f6430a);
                break;
            case 26:
                this.b.invoke(CardTransactionHistoryIntent.EmailAllTransactionHistoryClickedIntent.f6429a);
                break;
            case 27:
                this.b.invoke(CityDiscontinuedIntent.OnBackPressed.f6555a);
                break;
            case 28:
                this.b.invoke(CityDiscontinuedIntent.OnSupportedCitiesButtonClicked.f6556a);
                break;
            default:
                this.b.invoke(CityLocationSelectionIntent.OnChangeLocationClicked.f6585a);
                break;
        }
        return Unit.f17538a;
    }
}
