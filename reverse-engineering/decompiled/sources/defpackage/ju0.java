package defpackage;

import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionIntent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSearchSource;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ju0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17440a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ju0(Function1 function1, int i) {
        this.f17440a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17440a) {
            case 0:
                this.b.invoke(PremiumBusProductModificationReasonsIntent.DismissConfirmationDialogIntent.f7343a);
                break;
            case 1:
                this.b.invoke(PremiumBusSeatSelectionIntent.SeatChangeConfirmationDialogPositiveBtnClickIntent.f7748a);
                break;
            case 2:
                this.b.invoke(PremiumBusSeatSelectionIntent.SeatChangeSuccessScreenOkayBtnClickIntent.f7749a);
                break;
            case 3:
                this.b.invoke(PremiumBusSeatSelectionIntent.PassengerCountDecrementIntent.f7745a);
                break;
            case 4:
                this.b.invoke(PremiumBusSeatSelectionIntent.PassengerCountIncrementIntent.f7746a);
                break;
            case 5:
                this.b.invoke(PremiumBusSeatSelectionIntent.PassengerCountConfirmIntent.f7744a);
                break;
            case 6:
                this.b.invoke(PremiumBusSeatSelectionIntent.AutoAssignMySeatsCtaClickIntent.f7731a);
                break;
            case 7:
                this.b.invoke(PremiumBusSeatSelectionIntent.IWillPickMySeatCtaClickIntent.f7740a);
                break;
            case 8:
                this.b.invoke(PremiumBusSeatSelectionIntent.EditPassengerCountClickIntent.f7732a);
                break;
            case 9:
                this.b.invoke(PremiumBusSeatSelectionIntent.GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent.f7737a);
                break;
            case 10:
                this.b.invoke(PremiumBusSeatSelectionIntent.GenderConfirmationErrorBottomSheetSkipBtnClickIntent.f7736a);
                break;
            case 11:
                this.b.invoke(PremiumBusSeatSelectionIntent.SelectSeatsClickIntent.f7750a);
                break;
            case 12:
                this.b.invoke(PremiumBusSeatSelectionIntent.SeatChangeConfirmationDialogDismissIntent.f7747a);
                break;
            case 13:
                this.b.invoke(PremiumBusSeatSelectionIntent.GenderConfirmationBottomSheetDismissIntent.f7734a);
                break;
            case 14:
                this.b.invoke(PremiumBusSeatSelectionIntent.SeatChangeConfirmationDialogDismissIntent.f7747a);
                break;
            case 15:
                this.b.invoke(PremiumBusSeatSelectionIntent.GenderConfirmationBottomSheetSkipBtnClickIntent.f7735a);
                break;
            case 16:
                this.b.invoke(PremiumBusSeatSelectionIntent.GenderPreferenceNudgeCardUpdateGenderClickIntent.f7738a);
                break;
            case 17:
                this.b.invoke(PremiumBusSlotSelectionIntent.DismissSnackBar.f7869a);
                break;
            case 18:
                this.b.invoke(PremiumBusSlotSelectionIntent.CloseBottomSheetBtnClickIntent.f7865a);
                break;
            case 19:
                this.b.invoke(PremiumBusStopSelectionIntent.NewRouteSuggestionCancelBtnClickIntent.f7967a);
                break;
            case 20:
                this.b.invoke(PremiumBusStopSelectionIntent.CloseBottomSheetClickIntent.f7965a);
                break;
            case 21:
                this.b.invoke(PremiumBusStopSelectionIntent.NewRouteSuggestionSuccessOkayBtnClickIntent.f7970a);
                break;
            case 22:
                this.b.invoke(PremiumBusStopSelectionIntent.CloseBottomSheetClickIntent.f7965a);
                break;
            case 23:
                this.b.invoke(new PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent(PremiumBusStopSearchSource.FROM_STOP_SEARCH));
                break;
            case 24:
                this.b.invoke(new PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent(PremiumBusStopSearchSource.TO_STOP_SEARCH));
                break;
            case 25:
                this.b.invoke(PremiumBusStopSelectionIntent.ProceedBtnClickIntent.f7979a);
                break;
            case 26:
                this.b.invoke(Boolean.TRUE);
                break;
            case 27:
                this.b.invoke(Boolean.FALSE);
                break;
            case 28:
                this.b.invoke(PremiumBusStopSelectionIntent.CloseBottomSheetClickIntent.f7965a);
                break;
            default:
                this.b.invoke(PremiumBusStopSelectionIntent.NewRouteSuggestionClickIntent.f7968a);
                break;
        }
        return Unit.f17538a;
    }
}
