package defpackage;

import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsIntent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20142a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ yt0(Function1 function1, int i) {
        this.f20142a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f20142a;
        PremiumBusFareDetailsIntent.TermsAndConditionsTextClickedIntent termsAndConditionsTextClickedIntent = PremiumBusFareDetailsIntent.TermsAndConditionsTextClickedIntent.f7605a;
        PremiumBusProductModificationReasonsIntent.CloseBottomSheetBtnClickIntent closeBottomSheetBtnClickIntent = PremiumBusProductModificationReasonsIntent.CloseBottomSheetBtnClickIntent.f7340a;
        PremiumBusProductModificationReasonsIntent.ConfirmActionIntent confirmActionIntent = PremiumBusProductModificationReasonsIntent.ConfirmActionIntent.f7341a;
        PremiumBusProductModificationReasonsIntent.DismissConfirmationDialogIntent dismissConfirmationDialogIntent = PremiumBusProductModificationReasonsIntent.DismissConfirmationDialogIntent.f7343a;
        Unit unit = Unit.f17538a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                float f = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.RetryFareFetchClicked.f7601a);
                break;
            case 1:
                float f2 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.NavigateToHomeScreenIntent.f7593a);
                break;
            case 2:
                float f3 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.BottomSheetDismissedIntent.f7586a);
                break;
            case 3:
                float f4 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(termsAndConditionsTextClickedIntent);
                break;
            case 4:
                float f5 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.SeeUpsellDetailsClickedIntent.f7602a);
                break;
            case 5:
                float f6 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.RemoveUpsellPassIntent.f7600a);
                break;
            case 6:
                float f7 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.OrderCreationErrorDialogOkClickedIntent.f7599a);
                break;
            case 7:
                float f8 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(termsAndConditionsTextClickedIntent);
                break;
            case 8:
                float f9 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(PremiumBusFareDetailsIntent.OnChangeSeatClickedIntent.f7594a);
                break;
            case 9:
                float f10 = PremiumBusFareDetailsUiStateFactory.c;
                function1.invoke(new PremiumBusFareDetailsIntent.OnPayButtonClicked());
                break;
            case 10:
                function1.invoke(PremiumBusStopSelectionIntent.ReportProblemClickedIntent.f7980a);
                break;
            case 11:
                function1.invoke(PremiumBusStopSelectionIntent.StopSwapButtonClickedIntent.f7983a);
                break;
            case 12:
                function1.invoke(PremiumBusStopSelectionIntent.ProceedBtnClickIntent.f7979a);
                break;
            case 13:
                function1.invoke(PremiumBusStopSelectionIntent.PBExploreAvailableRoutesClicked.f7977a);
                break;
            case 14:
                function1.invoke(PremiumBusStopSelectionIntent.ViewAllOffersClickedIntent.f7985a);
                break;
            case 15:
                function1.invoke(PremiumBusStopSelectionIntent.PhoneClicked.f7978a);
                break;
            case 16:
                function1.invoke(PremiumBusStopSelectionIntent.OnNotificationIconClicked.f7972a);
                break;
            case 17:
                function1.invoke(dismissConfirmationDialogIntent);
                break;
            case 18:
                function1.invoke(dismissConfirmationDialogIntent);
                break;
            case 19:
                function1.invoke(closeBottomSheetBtnClickIntent);
                break;
            case 20:
                function1.invoke(PremiumBusProductModificationReasonsIntent.CancellationScreenOkCtaClickIntent.f7339a);
                break;
            case 21:
                function1.invoke(PremiumBusProductModificationReasonsIntent.BookAnotherRideCtaClickIntent.f7338a);
                break;
            case 22:
                function1.invoke(PremiumBusProductModificationReasonsIntent.RetryReasonsFetchIntent.f7348a);
                break;
            case 23:
                function1.invoke(PremiumBusProductModificationReasonsIntent.ExploreAvailableRoutesClickIntent.f7344a);
                break;
            case 24:
                function1.invoke(closeBottomSheetBtnClickIntent);
                break;
            case 25:
                function1.invoke(confirmActionIntent);
                break;
            case 26:
                function1.invoke(dismissConfirmationDialogIntent);
                break;
            case 27:
                function1.invoke(dismissConfirmationDialogIntent);
                break;
            case 28:
                function1.invoke(confirmActionIntent);
                break;
            default:
                function1.invoke(dismissConfirmationDialogIntent);
                break;
        }
        return unit;
    }
}
