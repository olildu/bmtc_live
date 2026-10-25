package defpackage;

import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenIntent;
import app.chalo.premiumbus.ui.passpurchaselanding.PremiumBusStopSearchSource;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.WebViewArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class er0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15582a;
    public final /* synthetic */ PbPassPurchaseLandingScreenComponent b;

    public /* synthetic */ er0(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, int i) {
        this.f15582a = i;
        this.b = pbPassPurchaseLandingScreenComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15582a) {
            case 0:
                ChaloNavigationManagerKt.c(this.b.v);
                break;
            case 1:
                this.b.O0(PbPassPurchaseLandingScreenIntent.NewRouteSuggestionClickIntent.f7657a);
                break;
            case 2:
                this.b.O0(PbPassPurchaseLandingScreenIntent.PBExploreAvailableRoutesClicked.f7663a);
                break;
            case 3:
                this.b.O0(new PbPassPurchaseLandingScreenIntent.StopSelectionFieldClickedIntent(PremiumBusStopSearchSource.FROM_STOP_SUGGESTION));
                break;
            case 4:
                this.b.O0(new PbPassPurchaseLandingScreenIntent.StopSelectionFieldClickedIntent(PremiumBusStopSearchSource.TO_STOP_SUGGESTION));
                break;
            case 5:
                this.b.O0(PbPassPurchaseLandingScreenIntent.NewRouteSuggestionCancelBtnClickIntent.f7656a);
                break;
            case 6:
                this.b.O0(PbPassPurchaseLandingScreenIntent.CloseBottomSheetClickIntent.f7654a);
                break;
            case 7:
                this.b.O0(PbPassPurchaseLandingScreenIntent.NewRouteSuggestionSuccessOkayBtnClickIntent.f7659a);
                break;
            case 8:
                this.b.O0(PbPassPurchaseLandingScreenIntent.CloseBottomSheetClickIntent.f7654a);
                break;
            case 9:
                this.b.O0(PbPassPurchaseLandingScreenIntent.PBExploreAvailableRoutesClicked.f7663a);
                break;
            case 10:
                this.b.O0(PbPassPurchaseLandingScreenIntent.CloseBottomSheetClickIntent.f7654a);
                break;
            case 11:
                this.b.O0(new PbPassPurchaseLandingScreenIntent.StopSelectionFieldClickedIntent(PremiumBusStopSearchSource.FROM_STOP_SEARCH));
                break;
            case 12:
                this.b.O0(new PbPassPurchaseLandingScreenIntent.StopSelectionFieldClickedIntent(PremiumBusStopSearchSource.TO_STOP_SEARCH));
                break;
            case 13:
                this.b.O0(PbPassPurchaseLandingScreenIntent.SwapSearchFieldsClickedIntent.f7669a);
                break;
            case 14:
                this.b.O0(PbPassPurchaseLandingScreenIntent.ReportProblemClickedIntent.f7665a);
                break;
            case 15:
                this.b.O0(PbPassPurchaseLandingScreenIntent.BuyPassBtnClickIntent.f7653a);
                break;
            default:
                ChaloNavigationManagerKt.e(this.b.v, new WebViewArgs("https://chalo.com/mumbai/chalo-bus/routes", "", false, false), null, 6);
                break;
        }
        return Unit.f17538a;
    }
}
