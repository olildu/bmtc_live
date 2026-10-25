package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreenKt;
import app.chalo.compose.components.MultipleFromToStopComposableKt;
import app.chalo.kyc.min.ui.minkycotp.OtpStepProgressUIState;
import app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreenUIKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsStopListHeaderKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopsListForRouteDetailsKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.OriginDestinationSearchCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.SearchStopItemUiState;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteHeaderDetailsUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopsListUIState;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsFooterKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsFooterUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareSplitRowUiState;
import app.chalo.ridehailing.feedback.RideUserFeedbackScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.fromto.MultipleFromToStopConnectorUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hi implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15828a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hi(Object obj, float f, Object obj2, int i, int i2) {
        this.f15828a = i2;
        this.d = obj;
        this.b = f;
        this.e = obj2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15828a;
        Unit unit = Unit.f17538a;
        int i2 = this.c;
        float f = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloBusUserProfileSurveyMainScreenKt.g((TextUIState.ChaloTextUIState) obj4, f, (ImageUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                MinKycOtpScreenUIKt.f((OtpStepProgressUIState) obj4, (Modifier) obj3, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ChaloColorToken.Custom custom = MultipleFromToStopComposableKt.f1846a;
                MultipleFromToStopComposableKt.b((Modifier) obj4, (MultipleFromToStopConnectorUIState) obj3, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                OriginDestinationSearchCardKt.b((Modifier) obj4, (SearchStopItemUiState) obj3, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsFooterKt.a((PremiumBusFareDetailsFooterUiState) obj4, f, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                PremiumBusFreshPurchaseFareDetailsScreenKt.c((PremiumBusFareSplitRowUiState) obj4, f, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                RideUserFeedbackScreenKt.c((Function2) obj4, (Function2) obj3, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                RouteDetailsStopListHeaderKt.b((RouteHeaderDetailsUIState) obj4, f, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                StopsListForRouteDetailsKt.a((RouteStopsListUIState) obj4, (Modifier) obj3, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                TripPlannerResultsScreenKt.s((TripPlannerResultsState) obj4, (Function1) obj3, f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
        }
        return unit;
    }

    public /* synthetic */ hi(Object obj, Object obj2, float f, int i, int i2) {
        this.f15828a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = f;
        this.c = i;
    }
}
