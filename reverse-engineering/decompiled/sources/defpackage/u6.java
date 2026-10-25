package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsScreenKt;
import app.chalo.busesaroundyou.BusesAroundYouScreenKt;
import app.chalo.checkout.ui.screen.payment.compose.PaymentMethodMainScreenItemsKt;
import app.chalo.checkout.ui.screen.upi.NoUpiAppsErrorUiState;
import app.chalo.compose.components.ChaloSearchBarKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonAndroidKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetItemData;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfo;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionCardUiState;
import app.chalo.home.ui.common.HomeScreenPlotlineTitleKt;
import app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayoutKt;
import app.chalo.home.ui.history.compose.components.ChaloBusTicketViewKt;
import app.chalo.home.ui.home.HomePageGridItemData;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.login.ui.options.LoginOptionsScreenKt;
import app.chalo.login.ui.options.LoginOptionsUIState;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryUiErrorWrapper;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.onboarding.citylocationselection.ui.WelcomeScreenConfig;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusBookingRescheduleConfirmationBottomSheetKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassUpsellNudgeScreenKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTripSummaryUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposableKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardUiState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionSpecs;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionViewState;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.productsummary.ui.compose.components.ProductStatusComponentKt;
import app.chalo.routeselection.ui.compose.FromAndToStopComponentKt;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import coil3.size.Size;
import com.arkivanov.decompose.extensions.compose.stack.ChildrenKt;
import com.arkivanov.decompose.extensions.compose.stack.animation.StackAnimation;
import com.arkivanov.decompose.router.stack.ChildStack;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19718a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u6(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f19718a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19718a) {
            case 0:
                ((Integer) obj2).getClass();
                AppMigrationPreconditionsScreenKt.b((CircularProgressIndicatorUIState) this.d, (TextUIState) this.e, (TextUIState) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$5((Modifier) this.b, (ProvidableCompositionLocal) this.d, (Function5) this.e, (Function2) this.f, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                ((Integer) obj2).intValue();
                BleValidationScreen_androidKt.j((BleValidationState) this.d, (SheetState) this.e, (SheetState) this.f, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                BusesAroundYouScreenKt.b((Modifier) this.b, (Modifier) this.d, (ChaloMapUIState) this.e, (IconButtonUIState) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                ChaloBusActiveTicketKt.f((PremiumBusPostBookingStopSchedule) this.d, (PremiumBusBookingTripTimeInfoState) this.e, (NewPremiumReserveTicketDetailsScreenType) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.b((List) this.d, (List) this.e, (List) this.f, (ChaloBusRouteSuggestionCardUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                ChaloBusScreenUIKt.e((ChaloBusComponent) this.d, (ChaloBusViewState) this.e, (ScrollState) this.f, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                ChaloBusScreenUIKt.v((ChaloBusComponent) this.d, (ProductPurchaseNudgeInfo) this.e, (Function1) this.f, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).getClass();
                ChaloBusTicketViewKt.e((Modifier) this.b, (TextUIState.ChaloTextUIState) this.d, (TextUIState.ChaloTextUIState) this.e, (ImageUIState) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).intValue();
                ChaloCardRechargeAmountScreenKt.b((ChaloCardRechargeAmountViewState) this.d, (Function1) this.e, (SoftwareKeyboardController) this.f, (SheetState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                ChaloCardTransactionsScreenKt.f((Modifier) this.b, (String) this.d, (CardTransactionHistoryUiErrorWrapper) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                ChaloFilledButtonAndroidKt.a((String) this.d, (Modifier) this.b, (TextStyle) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).getClass();
                ChaloSearchBarKt.a((Function0) this.d, (String) this.e, (Painter) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).getClass();
                ChildrenKt.a((ChildStack) this.d, (Modifier) this.b, (StackAnimation) this.e, (Function3) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).getClass();
                CityLocationSelectionScreenKt.f((Modifier) this.b, (String) this.d, (String) this.e, (WelcomeScreenConfig) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 15:
                return ComposableLambdaImpl.invoke$lambda$2((ComposableLambdaImpl) this.d, this.e, this.f, this.b, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.b((List) this.d, (ImageUISize) this.e, (ChaloPadding) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).getClass();
                FromAndToStopComponentKt.a((String) this.d, (String) this.e, (Modifier) this.b, (TextStyle) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).getClass();
                HomeScreenPlotlineTitleKt.a((String) this.d, (String) this.e, (String) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 19:
                final HomePageGridItemData homePageGridItemData = (HomePageGridItemData) this.d;
                List list = (List) this.e;
                Modifier modifier = (Modifier) this.b;
                final Function1 function1 = (Function1) this.f;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1207458552, iIntValue, -1, "app.chalo.home.ui.home.getChaloWidgetCards.<anonymous>.<anonymous> (HomeTabScaffold.kt:773)");
                    }
                    GridWidgetCardData gridWidgetCardData = homePageGridItemData.f3533a;
                    HomePageFeature homePageFeature = homePageGridItemData.b;
                    String str = gridWidgetCardData.d;
                    GridWidgetItemData gridWidgetItemData = gridWidgetCardData.f2348a;
                    ChaloTextWithBackgroundData chaloTextWithBackgroundData = gridWidgetItemData.c;
                    long jD = ComposeUtils_androidKt.d(str);
                    int size = list.size() % 2;
                    final int i = this.c;
                    if (size == 1 && i == CollectionsKt.K(list)) {
                        composer.startReplaceGroup(1046877825);
                        Modifier modifierA = PlotlineComposeWidgetKt.a(modifier, "PL_Home_Page_Hook_" + homePageFeature.getFeatureType());
                        boolean zChanged = composer.changed(function1) | composer.changedInstance(homePageGridItemData) | composer.changed(i);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final int i2 = 0;
                            objRememberedValue = new Function0() { // from class: i80
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i2) {
                                        case 0:
                                            HomePageGridItemData homePageGridItemData2 = homePageGridItemData;
                                            function1.invoke(new HomeScreenViewIntent.HomePageItemClickedIntent(homePageGridItemData2, null, homePageGridItemData2.b, i, null, null, 50));
                                            break;
                                        default:
                                            HomePageGridItemData homePageGridItemData3 = homePageGridItemData;
                                            function1.invoke(new HomeScreenViewIntent.HomePageItemClickedIntent(homePageGridItemData3, null, homePageGridItemData3.b, i, null, null, 50));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        ChaloWidgetCardKt.b(ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) objRememberedValue, 15, null), Color.m4595boximpl(jD), gridWidgetCardData.b, chaloTextWithBackgroundData, gridWidgetItemData.f2349a, gridWidgetItemData.b, gridWidgetCardData.c, composer, 4096);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1047973024);
                        Modifier modifierA2 = PlotlineComposeWidgetKt.a(modifier, "PL_Home_Page_Hook_" + homePageFeature.getFeatureType());
                        boolean zChanged2 = composer.changed(function1) | composer.changedInstance(homePageGridItemData) | composer.changed(i);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final int i3 = 1;
                            objRememberedValue2 = new Function0() { // from class: i80
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            HomePageGridItemData homePageGridItemData2 = homePageGridItemData;
                                            function1.invoke(new HomeScreenViewIntent.HomePageItemClickedIntent(homePageGridItemData2, null, homePageGridItemData2.b, i, null, null, 50));
                                            break;
                                        default:
                                            HomePageGridItemData homePageGridItemData3 = homePageGridItemData;
                                            function1.invoke(new HomeScreenViewIntent.HomePageItemClickedIntent(homePageGridItemData3, null, homePageGridItemData3.b, i, null, null, 50));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        ChaloWidgetCardKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierA2, false, null, null, null, (Function0) objRememberedValue2, 15, null), Color.m4595boximpl(jD), gridWidgetCardData.b, chaloTextWithBackgroundData, gridWidgetItemData.f2349a, gridWidgetItemData.b, gridWidgetCardData.c, false, composer, 12587008, 0);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).getClass();
                LoginOptionsScreenKt.c((Modifier) this.b, (LoginOptionsUIState) this.d, (FocusRequester) this.e, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).intValue();
                PBProductCardComposableKt.b((PBProductCardUiState) this.d, (PremiumBusProductSelectionSpecs) this.e, (Size) this.f, (Function2) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).getClass();
                PaymentMethodMainScreenItemsKt.a((ToolbarUIState) this.d, (List) this.e, (NoUpiAppsErrorUiState) this.f, (Function2) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).intValue();
                PremiumBusBookingRescheduleConfirmationBottomSheetKt.a((PremiumBusProductModificationAdditionalInfoAppModel) this.d, (Function0) this.e, (Function0) this.f, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                PremiumBusPassUpsellNudgeScreenKt.a((PremiumBusFareDetailsUiState) this.d, (PremiumBusFareDetailsContent.PassUpsellNudge) this.e, (PremiumBusFareDetailsTripSummaryUiState) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionScreenKt.f((PremiumBusSlotSelectionViewState) this.d, (Function1) this.e, (Function0) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionScreenKt.e((ArrayList) this.d, (PagerState) this.e, (Modifier) this.b, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).getClass();
                PremiumBusStopSelectionScreenKt.i((PremiumBusStopSelectionViewState) this.d, (TimeUtilsContract) this.e, (Function1) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).getClass();
                PremiumBusUpcomingBottomSheetLayoutKt.a((PremiumBusBookingCardData) this.d, (Modifier) this.b, (NewPremiumReserveTicketDetailsScreenType) this.e, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                ProductStatusComponentKt.b((Modifier) this.b, (TextUIState.ChaloTextUIState) this.d, (ImageUIState) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ u6(Modifier modifier, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f19718a = i2;
        this.b = modifier;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    public /* synthetic */ u6(HomePageGridItemData homePageGridItemData, List list, int i, Modifier modifier, Function1 function1) {
        this.f19718a = 19;
        this.d = homePageGridItemData;
        this.e = list;
        this.c = i;
        this.b = modifier;
        this.f = function1;
    }

    public /* synthetic */ u6(Serializable serializable, Object obj, Modifier modifier, Object obj2, int i, int i2) {
        this.f19718a = i2;
        this.d = serializable;
        this.e = obj;
        this.b = modifier;
        this.f = obj2;
        this.c = i;
    }

    public /* synthetic */ u6(Object obj, Modifier modifier, Object obj2, Function function, int i, int i2) {
        this.f19718a = i2;
        this.d = obj;
        this.b = modifier;
        this.e = obj2;
        this.f = function;
        this.c = i;
    }
}
