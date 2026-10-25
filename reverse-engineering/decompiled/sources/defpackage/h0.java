package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsScreenKt;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreenKt;
import app.chalo.compose.components.ChaloRecentlySearchedCardKt;
import app.chalo.compose.components.ChaloTncSectionKt;
import app.chalo.compose.components.textfields.ClickableChaloTextFieldKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.base.RideHailingUserFeedbackData;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayoutKt;
import app.chalo.home.ui.common.RideHailingUserFeedbackBottomSheetContentKt;
import app.chalo.instantticket.ui.faredetails.compose.InstantTicketFareDetailsMainScreenKt;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsMainScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewState;
import app.chalo.login.ui.options.LoginOptionsScreenKt;
import app.chalo.login.ui.options.LoginPhoneNumberTextFieldUISpec;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailScreenKt;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt;
import app.chalo.onboarding.languageselection.LanguageGridUiState;
import app.chalo.onboarding.languageselection.LanguageSelectionScreenSpec;
import app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusBulkBookingUpcomingRidesCardData;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusTicketActivationMoreOptionsListKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposableKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardUiState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionSpecs;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusLandingScreenKt;
import app.chalo.productactivation.ui.ActivationTicketComposablesKt;
import app.chalo.productpurchase.productselection.ui.ProductSelectionLoadingItemUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.productpurchase.productselection.ui.ProductSelectionSkeletonLoadingUISpec;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.components.RegularBusTicketDetailsContainerKt;
import app.chalo.uistate.components.RegularBusTicketTripDetailsSpec;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationScreenKt;
import coil3.size.Size;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15779a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h0(Modifier modifier, RegularBusTicketTripDetailsSpec regularBusTicketTripDetailsSpec, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState, int i) {
        this.f15779a = 27;
        this.b = modifier;
        this.d = regularBusTicketTripDetailsSpec;
        this.f = chaloTextUIState;
        this.g = chaloTextUIState2;
        this.e = imageUIState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15779a) {
            case 0:
                ((Integer) obj2).intValue();
                ActivationTicketComposablesKt.d((Modifier) this.b, (ShapedContentUIState) this.d, (ShapedContentUIState) this.e, (TextUIState.ChaloTextUIState) this.f, (TextUIState.ChaloTextUIState) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                AppMigrationPreconditionsScreenKt.a((ImageUIState) this.d, (TextUIState) this.e, (TextUIState) this.f, (ButtonUIState) this.g, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                BleValidationScreen_androidKt.y((StringEnum) this.d, (StringEnum) this.e, (Modifier) this.b, (Function0) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                CardInfoLandingScreenKt.e((Modifier) this.b, (String) this.d, (TextStyle) this.e, (List) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                CardTransactionDetailScreenKt.d((String) this.d, (String) this.e, (String) this.f, (CardTransactionTypeUiModel) this.g, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).getClass();
                ChaloBusScreenUIKt.f((ChaloBusComponent) this.d, (Modifier) this.b, (Function1) this.e, (ChaloBusViewState) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).getClass();
                ChaloBusUserProfileSurveyMainScreenKt.c((Modifier) this.b, (TextUIState.ChaloTextUIState) this.f, (ChaloColorToken) this.d, (ChaloColorToken) this.e, (UiEventHandler$Companion$fromLambda$1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).getClass();
                ChaloCardComposeItemsKt.c((Modifier) this.b, (String) this.d, (String) this.e, (String) this.f, (String) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).getClass();
                ChaloRecentlySearchedCardKt.b((Modifier) this.b, (String) this.d, (String) this.e, (IconType) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).getClass();
                ChaloTncSectionKt.b((String) this.b, (TextStyle) this.d, (String) this.e, (TextStyle) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                CitySelectionScreenKt.c((LazyListState) this.d, (List) this.e, (DividerUIState) this.f, (ChaloPadding) this.g, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                ClickableChaloTextFieldKt.a((BaseTextFieldUIState.ClickableTextFieldUIState) this.d, (Modifier) this.b, (MutableInteractionSource) this.e, (Function2) this.f, (Function3) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 12:
                int iIntValue = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$3((ComposableLambdaImpl) this.b, this.d, this.e, this.f, this.g, this.c, (Composer) obj, iIntValue);
            case 13:
                ((Integer) obj2).intValue();
                HomeScreenMainDecomposeKt.b((HomeComponent) this.b, (HomeScreenFragmentViewState) this.d, (Function1) this.e, (HomeScreenAnalyticsHelper) this.f, (HomeScreenInfoHelper) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).intValue();
                InstantTicketFareDetailsMainScreenKt.a((SheetState) this.b, (FareDetailsViewState) this.d, (InstantTicketWalletAccessState) this.e, (Function1) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).getClass();
                LanguageSelectionScreenKt.d((Modifier) this.b, (LanguageSelectionScreenSpec) this.d, (LanguageGridUiState) this.e, (TextUIState.ChaloTextUIState) this.f, (ImageUIState) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 16:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ListItemKt.ListItemLayout$lambda$8((Function2) this.b, (Function2) this.d, (Function2) this.e, (Function2) this.f, (Function2) this.g, this.c, (Composer) obj, iIntValue2);
            case 17:
                ((Integer) obj2).getClass();
                LoginOptionsScreenKt.b((Modifier) this.b, (BaseTextFieldUIState.TextFieldUIState) this.d, (LoginPhoneNumberTextFieldUISpec) this.e, (FocusRequester) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).getClass();
                MultiProductValidationScreenKt.i((TextWithLeftAndRightIconUIState) this.d, (BorderUISpec) this.e, (UiEventHandler) this.f, (ChaloPadding) this.g, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                NcmcOnlineRechargeScreenKt.c((NCMCOnlineRechargeViewState) this.b, (FocusRequester) this.d, (SheetState) this.e, (SoftwareKeyboardController) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).getClass();
                NearbyStopsMapScreenKt.g((NearbyStopAndTripsUiModel) this.d, (Modifier) this.b, (Function1) this.e, (Function2) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).intValue();
                PBProductCardComposableKt.d((PBProductCardUiState) this.b, (PremiumBusProductSelectionComponent) this.d, (PremiumBusProductSelectionSpecs) this.e, (Size) this.f, (Function2) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).getClass();
                PbBulkBookingRideDetailsScreenKt.o((PremiumBusBulkBookingUpcomingRidesCardData) this.d, (Modifier) this.b, (String) this.e, (String) this.f, (IconType) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).getClass();
                PremiumBusLandingScreenKt.b((Modifier) this.b, (PremiumBusStopSelectionViewState) this.d, (Function1) this.e, (Density) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                PremiumBusTicketActivationMoreOptionsListKt.b((List) this.d, (Modifier) this.b, (String) this.e, (Function1) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).getClass();
                PremiumBusUpcomingBottomSheetLayoutKt.d((PremiumBusPostBookingStopSchedule) this.d, (NewPremiumReserveTicketDetailsScreenType) this.e, (Modifier) this.b, (Function1) this.f, (PremiumBusBookingCardData) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.j((ProductSelectionLoadingItemUIState) this.d, (ProductSelectionLoadingItemUIState) this.e, (ProductSelectionLoadingItemUIState) this.f, (ProductSelectionSkeletonLoadingUISpec) this.g, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).getClass();
                RegularBusTicketDetailsContainerKt.a((Modifier) this.b, (RegularBusTicketTripDetailsSpec) this.d, (TextUIState.ChaloTextUIState) this.f, (TextUIState.ChaloTextUIState) this.g, (ImageUIState) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).intValue();
                RideHailingUserFeedbackBottomSheetContentKt.a((RideHailingUserFeedbackData) this.b, (Function2) this.d, (Function1) this.e, (Function0) this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                RouteDetailsMainScreenKt.b((RouteDetailsViewState) this.b, (BottomSheetScaffoldState) this.d, (SheetState) this.e, (ChaloBuildConfig) this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ h0(Modifier modifier, TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        this.f15779a = 6;
        this.b = modifier;
        this.f = chaloTextUIState;
        this.d = chaloColorToken;
        this.e = chaloColorToken2;
        this.g = uiEventHandler$Companion$fromLambda$1;
        this.c = i;
    }

    public /* synthetic */ h0(Object obj, Modifier modifier, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f15779a = i2;
        this.d = obj;
        this.b = modifier;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
    }

    public /* synthetic */ h0(Object obj, Enum r2, Modifier modifier, Function function, Object obj2, int i, int i2) {
        this.f15779a = i2;
        this.d = obj;
        this.e = r2;
        this.b = modifier;
        this.f = function;
        this.g = obj2;
        this.c = i;
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, Object obj4, Modifier modifier, int i, int i2) {
        this.f15779a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = modifier;
        this.c = i;
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f15779a = i2;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.c = i;
    }
}
