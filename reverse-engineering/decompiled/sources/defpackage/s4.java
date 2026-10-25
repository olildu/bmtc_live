package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.paging.compose.LazyPagingItems;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.checkout.ui.payment.CheckoutItemListKt;
import app.chalo.checkout.ui.screen.chalopaywallet.ChaloWalletInsufficientBalanceBottomSheetKt;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutViewState;
import app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreenKt;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType;
import app.chalo.compose.components.ChaloSearchBarComposableUIKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.domain.UpdateDebugBuildEnvironmentUseCase;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusPassHistory;
import app.chalo.home.ui.chalobus.ChaloBusScreenKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.PremiumBusTutorialConfigUiModel;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfo;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoViewState;
import app.chalo.home.ui.common.ChangeEnvironmentDialogKt;
import app.chalo.homescreen.data.model.app.ChaloBusAppModel;
import app.chalo.instantticket.ui.faredetails.compose.BottomSheetViewsKt;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingInfoBottomSheetState;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.ncmc.ui.cardlinking.linking.compose.ChaloCardLinkCardScreenKt;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeDataFetchErrorReason;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanelUIState;
import app.chalo.onboarding.cityselection.ui.CitySelectionUIState;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.webview.WebViewUIState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.NearbyDevicesAndPermissionRationaleBottomsheetInfo;
import app.chalo.validationsdk.blevalidation.ui.ProductAndUserDetailsBottomsheetInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19268a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s4(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f19268a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19268a;
        Unit unit = Unit.f17538a;
        int i2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidSelectionHandles_androidKt.HandlePopup$lambda$1((OffsetProvider) obj5, (Alignment) obj4, (Function2) obj3, this.c, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$0((ProvidableCompositionLocal) obj5, (Function5) obj4, (Function2) obj3, this.c, (Composer) obj, iIntValue2);
            case 2:
                ((Integer) obj2).getClass();
                BleValidationScreen_androidKt.k((BleValidationState) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 3:
                ((Integer) obj2).intValue();
                BleValidationScreen_androidKt.v((NearbyDevicesAndPermissionRationaleBottomsheetInfo) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 4:
                ((Integer) obj2).intValue();
                BleValidationScreen_androidKt.C((ProductAndUserDetailsBottomsheetInfo) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 5:
                ((Integer) obj2).intValue();
                BleValidationScreen_androidKt.A((BleValidationLayoutInfo) obj5, (Function1) obj4, (String) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 6:
                ((Integer) obj2).getClass();
                BottomSheetViewsKt.a((Modifier) obj5, (UserBillingInfoBottomSheetState) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                ChaloBusActiveTicketKt.i((PremiumBusBookingTripTimeInfoState) obj5, (NewPremiumReserveTicketDetailsScreenType) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 8:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.q((ChaloBusRouteInfoViewState) obj5, (SheetState) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 9:
                ((Integer) obj2).intValue();
                ChaloBusScreenKt.a((ChaloBusComponent) obj5, (ChaloBusAppModel) obj4, (HomeScreenInfoHelper) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 10:
                ((Integer) obj2).intValue();
                ChaloBusScreenUIKt.c((ChaloBusComponent) obj5, (ProductPurchaseNudgeInfo) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 11:
                ((Integer) obj2).getClass();
                ChaloBusScreenUIKt.a((ChaloBusPassHistory) obj5, (Modifier) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 12:
                ((Integer) obj2).getClass();
                ChaloBusScreenUIKt.m((PremiumBusTutorialConfigUiModel) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 13:
                ((Integer) obj2).intValue();
                ChaloBusScreenUIKt.l((ChaloBusPassHistory) obj5, (String) obj4, (String) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 14:
                ((Integer) obj2).intValue();
                ChaloCardInfoScreenKt.a((ChaloCardInfoViewState) obj5, (Function1) obj4, (SheetState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 15:
                ((Integer) obj2).intValue();
                ChaloCardLinkCardScreenKt.a((ChaloCardLinkViewState) obj5, (Function1) obj4, (SoftwareKeyboardController) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 16:
                ((Integer) obj2).intValue();
                ChaloCardRechargeAmountScreenKt.d((ColumnScope) obj5, (CardRechargeDataFetchErrorReason) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 17:
                ((Integer) obj2).intValue();
                ChaloCardRechargeAmountScreenKt.c((String) obj5, (Function1) obj4, (CardRechargeDataFetchErrorReason) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 18:
                ((Integer) obj2).intValue();
                ChaloCardTransactionsScreenKt.h((CardTransactionHistoryViewState) obj5, (LazyPagingItems) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 19:
                ((Integer) obj2).intValue();
                ChaloSearchBarComposableUIKt.b((IconButtonUIState) obj5, (CircularProgressIndicatorUIState) obj4, (ImageUISize) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 20:
                ((Integer) obj2).getClass();
                ChaloSearchBarComposableUIKt.c((Modifier) obj5, (BaseTextFieldUIState.TextFieldUIState) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 21:
                ((Integer) obj2).intValue();
                float f = ChaloSnackbarKt.f1826a;
                ChaloSnackbarKt.c((Modifier) obj5, (Function3) obj4, (Function3) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 22:
                ((Integer) obj2).getClass();
                ChaloWalletInsufficientBalanceBottomSheetKt.a((Modifier) obj5, (PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState) obj4, (TextUIState.StyledTextUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 23:
                ((Integer) obj2).getClass();
                ChangeEnvironmentDialogKt.a((Function0) obj5, (ChaloBuildConfig) obj4, (UpdateDebugBuildEnvironmentUseCase) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 24:
                ((Integer) obj2).getClass();
                CheckoutItemListKt.c((Modifier) obj5, (ChaloColorToken) obj4, (ChaloColorToken) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 25:
                ((Integer) obj2).intValue();
                CheckoutScreenKt.b((CheckoutViewState) obj5, (WebViewUIState) obj4, (RazorPaySdkProvider) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 26:
                ((Integer) obj2).getClass();
                CityLocationSelectionScreenKt.e((Modifier) obj5, (CityLocationSelectionState) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 27:
                ((Integer) obj2).getClass();
                CitySelectionScreenKt.g((CitySelectionSearchPanelUIState) obj5, (SafeFocusRequester) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 28:
                ((Integer) obj2).getClass();
                CitySelectionScreenKt.a((CitySelectionUIState) obj5, (Modifier) obj4, (SafeFocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            default:
                ((Integer) obj2).intValue();
                CitySelectionUniversalPickerScreenKt.c((UniversalSearchItem.PlacesAndStopsItem) obj5, (Function1) obj4, (TextFieldValue) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
        }
    }
}
