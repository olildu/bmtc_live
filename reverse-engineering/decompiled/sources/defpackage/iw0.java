package defpackage;

import app.chalo.home.ui.chalobus.PremiumBusTutorialViewIntent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import app.chalo.productactivation.ui.ProductActivationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iw0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17096a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ iw0(Function1 function1, int i) {
        this.f17096a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17096a) {
            case 0:
                this.b.invoke(PremiumBusStopSelectionIntent.PBExploreAvailableRoutesClicked.f7977a);
                break;
            case 1:
                this.b.invoke(PremiumBusTutorialViewIntent.BackClicked.f3295a);
                break;
            case 2:
                this.b.invoke(PremiumBusTutorialViewIntent.BackClicked.f3295a);
                break;
            case 3:
                this.b.invoke(ProductActivationIntent.RouteDetailsToggleClickedIntent.f8038a);
                break;
            case 4:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activateOndcMetroTicketScreen"));
                break;
            case 5:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activateOndcTicketScreen"));
                break;
            case 6:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activateQuickPayScreen"));
                break;
            case 7:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activatePremiumTicketScreen"));
                break;
            case 8:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activateMultiModalGroupTicketScreen"));
                break;
            case 9:
                this.b.invoke(ProductActivationIntent.ActivateClickedIntent.f8031a);
                break;
            case 10:
                this.b.invoke(ProductActivationIntent.BackToHomeScreenIntent.f8032a);
                break;
            case 11:
                this.b.invoke(ProductActivationIntent.DismissDialogIntent.f8035a);
                break;
            case 12:
                this.b.invoke(ProductActivationIntent.BackToHomeScreenIntent.f8032a);
                break;
            case 13:
                this.b.invoke(ProductActivationIntent.ActivateClickedIntent.f8031a);
                break;
            case 14:
                this.b.invoke(ProductActivationIntent.SetUpProfileBtnClickedIntent.f8039a);
                break;
            case 15:
                this.b.invoke(ProductActivationIntent.BackToHomeScreenIntent.f8032a);
                break;
            case 16:
                this.b.invoke(ProductActivationIntent.BackToHomeScreenIntent.f8032a);
                break;
            case 17:
                this.b.invoke(ProductActivationIntent.ActivateClickedIntent.f8031a);
                break;
            case 18:
                this.b.invoke(ProductActivationIntent.BackToHomeScreenIntent.f8032a);
                break;
            case 19:
                this.b.invoke(ProductActivationIntent.BottomSheetNegativeButtonClickedIntent.f8033a);
                break;
            case 20:
                this.b.invoke(ProductActivationIntent.BottomSheetNegativeButtonClickedIntent.f8033a);
                break;
            case 21:
                this.b.invoke(ProductActivationIntent.BottomSheetNegativeButtonClickedIntent.f8033a);
                break;
            case 22:
                this.b.invoke(ProductActivationIntent.BottomSheetNegativeButtonClickedIntent.f8033a);
                break;
            case 23:
                this.b.invoke(ProductActivationIntent.UserProfileBannerShownIntent.f8041a);
                break;
            case 24:
                this.b.invoke(ProductActivationIntent.TrackUpsellRideClickedIntent.f8040a);
                break;
            case 25:
                this.b.invoke(ProductActivationIntent.BackToHomeScreenIntent.f8032a);
                break;
            case 26:
                this.b.invoke(ProductActivationIntent.BackToHomeScreenIntent.f8032a);
                break;
            case 27:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activateSuperPassScreen"));
                break;
            case 28:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activateInstantTicketScreen"));
                break;
            default:
                this.b.invoke(new ProductActivationIntent.ReportProblemClickedIntent("activateMticketScreen"));
                break;
        }
        return Unit.f17538a;
    }
}
