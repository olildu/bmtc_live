package defpackage;

import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.NewGenericErrorScreenWithMsgAndRetryKt;
import app.chalo.compose.components.BottomSheetContentWithIconTitleSubTitleKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.CommonStopSelectionKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.MultipleFromToStopComposableKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.branding.ProductBookingBrandingKt;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.components.multimodal.ModeTicketStepInfoComposablesKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCardKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.OriginDestinationSearchCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.RouteDetailsUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TripPlannerOriginDestinationSearchbarUiState;
import app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreenKt;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketPriceDetailsUiState;
import app.chalo.premiumbus.compose.ProductOfferBadgeKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsTripSummaryCardKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTripSummaryUiState;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.productactivation.ui.ActivationPassComposablesKt;
import app.chalo.productactivation.ui.uistate.ActivationPassContainerUIState;
import app.chalo.productactivation.ui.uistate.ActivationPassFooterUIState;
import app.chalo.productbooking.common.compose.PriceAndTermsSectionKt;
import app.chalo.productbooking.common.uistate.FareLineUiState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionLoadingItemUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.fromto.MultipleFromToStopUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20154a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z(int i, int i2, int i3, Object obj, Object obj2) {
        this.f20154a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20154a;
        Unit unit = Unit.f17538a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ActivationPassComposablesKt.c((Modifier) obj4, (ActivationPassContainerUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                ActivationPassComposablesKt.d((ActivationPassFooterUIState) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                BottomSheetContentWithIconTitleSubTitleKt.a((Modifier) obj4, (BottomSheetStandardContentUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 3:
                ((Integer) obj2).getClass();
                ChaloBusScreenUIKt.x((Modifier) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 4:
                ((Integer) obj2).getClass();
                ChaloCircularBackButtonKt.b((IconButtonUIState) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 5:
                ((Integer) obj2).getClass();
                ChaloCircularProgressIndicatorKt.a((Modifier) obj4, (CircularProgressIndicatorUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 6:
                ((Integer) obj2).getClass();
                ChaloFilledButtonKt.d((Modifier) obj4, (ClickableTextUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                ChaloRadioButtonKt.a((Modifier) obj4, (RadioButtonUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 8:
                ((Integer) obj2).getClass();
                float f = ChaloSnackbarKt.f1826a;
                ChaloSnackbarKt.b((SnackbarUIState) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 9:
                ((Integer) obj2).getClass();
                ChaloTabTitleKt.b((Modifier) obj4, (TextUIState.ChaloTextUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 10:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.f((ToolbarUIState) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 11:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.i((ToolbarActionsUIState) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 12:
                ((Integer) obj2).getClass();
                CommonStopSelectionKt.a((Modifier) obj4, (StopSelectionUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 13:
                ((Integer) obj2).getClass();
                DividerUIStateKt.a((Modifier) obj4, (DividerUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 14:
                ((Integer) obj2).getClass();
                FromAndToStopDetailViewKt.c((Modifier) obj4, (FromToStopIconUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 15:
                ((Integer) obj2).getClass();
                GifUIKt.a((Modifier) obj4, (GifImageUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 16:
                ((Integer) obj2).getClass();
                GroupTicketSummaryScreenKt.f((Modifier) obj4, (GroupTicketPriceDetailsUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 17:
                ((Integer) obj2).getClass();
                ItinerarySingleLegCardKt.h((Modifier) obj4, (RouteDetailsUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 18:
                ((Integer) obj2).getClass();
                ModeTicketStepInfoComposablesKt.a((StepTicketModeBasedInfoUIState.Bus) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 19:
                ((Integer) obj2).getClass();
                ModeTicketStepInfoComposablesKt.b((StepTicketModeBasedInfoUIState.Metro) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 20:
                ((Integer) obj2).getClass();
                ChaloColorToken.Custom custom = MultipleFromToStopComposableKt.f1846a;
                MultipleFromToStopComposableKt.a((Modifier) obj4, (MultipleFromToStopUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 21:
                ((Integer) obj2).getClass();
                NewGenericErrorScreenWithMsgAndRetryKt.a((Modifier) obj4, (StandardErrorScreenUIState.NewErrorWithMsgAndRetry) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 22:
                ((Integer) obj2).getClass();
                OriginDestinationSearchCardKt.a((Modifier) obj4, (TripPlannerOriginDestinationSearchbarUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 23:
                int iIntValue = ((Integer) obj2).intValue();
                return PagerLazyLayoutItemProvider.Item$lambda$1((PagerLazyLayoutItemProvider) obj4, this.b, this.e, this.c, (Composer) obj, iIntValue);
            case 24:
                ((Integer) obj2).getClass();
                PremiumBusFareDetailsTripSummaryCardKt.a((PremiumBusFareDetailsTripSummaryUiState) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 25:
                ((Integer) obj2).getClass();
                PriceAndTermsSectionKt.a((Modifier) obj4, (FareLineUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 26:
                ((Integer) obj2).getClass();
                ProductBookingBrandingKt.a((Modifier) obj4, (ProductBookingBrandingUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 27:
                ((Integer) obj2).getClass();
                ProductOfferBadgeKt.a((OfferTagUIState) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            case 28:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.k((ProductSelectionLoadingItemUIState) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
            default:
                ((Integer) obj2).getClass();
                SpecialFeatureTagListComposableKt.b((SpecialFeaturesTagListUIState) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return unit;
        }
    }

    public /* synthetic */ z(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, Object obj, int i2) {
        this.f20154a = 23;
        this.d = pagerLazyLayoutItemProvider;
        this.b = i;
        this.e = obj;
        this.c = i2;
    }

    public /* synthetic */ z(Object obj, Modifier modifier, int i, int i2, int i3) {
        this.f20154a = i3;
        this.e = obj;
        this.d = modifier;
        this.b = i;
        this.c = i2;
    }
}
