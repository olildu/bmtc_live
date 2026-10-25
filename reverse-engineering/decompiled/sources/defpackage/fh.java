package defpackage;

import app.chalo.home.ui.chalobus.ChaloBusViewIntent;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoCtaType;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15640a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ fh(Function1 function1, int i) {
        this.f15640a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15640a) {
            case 0:
                this.b.invoke(ChaloBusRouteInfoViewIntent.OpenRouteSuggestionSheetIntent.f3342a);
                break;
            case 1:
                this.b.invoke(ChaloBusRouteInfoViewIntent.OpenRouteSuggestionSheetIntent.f3342a);
                break;
            case 2:
                this.b.invoke(ChaloBusRouteInfoViewIntent.OpenRouteSuggestionSheetIntent.f3342a);
                break;
            case 3:
                this.b.invoke(ChaloBusRouteInfoViewIntent.ResetFilterIntent.f3343a);
                break;
            case 4:
                this.b.invoke(ChaloBusRouteInfoViewIntent.OpenRouteSuggestionSheetIntent.f3342a);
                break;
            case 5:
                this.b.invoke(ChaloBusRouteInfoViewIntent.DismissRouteSuggestionSheetIntent.f3337a);
                break;
            case 6:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionPickupClickIntent.f3348a);
                break;
            case 7:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionDropClickIntent.f3346a);
                break;
            case 8:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionReachByClickIntent.f3350a);
                break;
            case 9:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionSubmitIntent.f3352a);
                break;
            case 10:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionCancelIntent.f3345a);
                break;
            case 11:
                this.b.invoke(ChaloBusRouteInfoViewIntent.RouteSuggestionSuccessOkayIntent.f3353a);
                break;
            case 12:
                this.b.invoke(ChaloBusViewIntent.PassSavingsBannerInfoBtnClickedIntent.f3270a);
                break;
            case 13:
                this.b.invoke(ChaloBusViewIntent.OnNotificationIconClicked.f3265a);
                break;
            case 14:
                this.b.invoke(ChaloBusViewIntent.BackPressedOnDateAndTimePickerBottomSheet.f3259a);
                break;
            case 15:
                this.b.invoke(ChaloBusViewIntent.BottomSheetDismissIntent.f3260a);
                break;
            case 16:
                this.b.invoke(ChaloBusViewIntent.StopSwapButtonClickedIntent.f3281a);
                break;
            case 17:
                this.b.invoke(ChaloBusViewIntent.ProceedBtnClickIntent.f3273a);
                break;
            case 18:
                this.b.invoke(ChaloBusViewIntent.ProceedButtonShimmerShownIntent.f3274a);
                break;
            case 19:
                this.b.invoke(ChaloBusViewIntent.PBExploreAvailableRoutesClicked.f3268a);
                break;
            case 20:
                this.b.invoke(ChaloBusViewIntent.SeeAllPassesClickedIntent.f3278a);
                break;
            case 21:
                this.b.invoke(ChaloBusViewIntent.SeeAllPassesClickedIntent.f3278a);
                break;
            case 22:
                this.b.invoke(ChaloBusViewIntent.PremiumBusTutorialViewAllClickedIntent.f3272a);
                break;
            case 23:
                this.b.invoke(ChaloBusViewIntent.BottomSheetDismissIntent.f3260a);
                break;
            case 24:
                this.b.invoke(ProductPurchaseNudgeInfoCtaType.VIEW_ALL_PASSES);
                break;
            case 25:
                this.b.invoke(ProductPurchaseNudgeInfoCtaType.VIEW_ALL_PASSES);
                break;
            case 26:
                this.b.invoke(ChaloBusViewIntent.PBExploreAvailableRoutesClicked.f3268a);
                break;
            case 27:
                this.b.invoke(ChaloBusViewIntent.BottomSheetDismissIntent.f3260a);
                break;
            case 28:
                this.b.invoke(Boolean.TRUE);
                break;
            default:
                this.b.invoke(Boolean.FALSE);
                break;
        }
        return Unit.f17538a;
    }
}
