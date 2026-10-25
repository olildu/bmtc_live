package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.CustomAppBarItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.checkout.ui.payment.CheckoutItemListKt;
import app.chalo.checkout.ui.screen.card.CheckoutCardComponent;
import app.chalo.checkout.ui.screen.card.compose.CheckoutCardScreenKt;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutScreenKt;
import app.chalo.checkout.ui.screen.netbanking.CheckoutNetBankingComponent;
import app.chalo.checkout.ui.screen.netbanking.compose.CheckoutNetBankingScreenKt;
import app.chalo.checkout.ui.screen.payment.PaymentModeCardHeaderUiState;
import app.chalo.compose.ChaloHeaderTextComposableKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.dialogs.ChaloMultiSelectDatePickerKt;
import app.chalo.core.compose.CheckoutParentScreenKt;
import app.chalo.core.compose.CitySelectionParentScreenKt;
import app.chalo.core.compose.DecomposeAppKt;
import app.chalo.core.compose.DecomposeScreensKt;
import app.chalo.core.navigation.checkout.CheckoutParentComponent;
import app.chalo.core.navigation.city.CitySelectionParentComponent;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.electricitybill.ui.ebillamount.EBillAmountViewState;
import app.chalo.electricitybill.ui.ebillamount.EbillAmountComponent;
import app.chalo.electricitybill.ui.ebillamount.ui.EBillAmountScreenKt;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent;
import app.chalo.metro.ui.confirmbooking.compose.ConfirmBookingScreenKt;
import app.chalo.metro.ui.confirmbooking.compose.ConfirmBookingScreenUIKt;
import app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingScreenViewState;
import app.chalo.metro.ui.confirmbooking.uistate.JourneyDetailsUiState;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedComponent;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedUIState;
import app.chalo.onboarding.citydiscontinued.ui.CityDiscontinuedScreenKt;
import app.chalo.onboarding.citydiscontinued.ui.CityDiscontinuedScreenUIKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.uistate.dialog.CalendarDateUIState;
import app.chalo.uistate.dialog.CalendarMonthUIState;
import app.chalo.uistate.dialog.LegendUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.WeekDayHeaderUIState;
import app.chalo.uistate.text.HeaderTextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.DirectValidationMainScreenKt;
import com.arkivanov.decompose.Child;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18405a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mk(Object obj, int i, int i2) {
        this.f18405a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18405a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloHeaderTextComposableKt.b((HeaderTextUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                ChaloLoadingDialogKt.a((LoadingDialogUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                ChaloMultiSelectDatePickerKt.b((CalendarDateUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                ChaloMultiSelectDatePickerKt.c((LegendUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).intValue();
                ChaloMultiSelectDatePickerKt.e((WeekDayHeaderUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                ChaloMultiSelectDatePickerKt.d((CalendarMonthUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                ChaloToolBarKt.e((ToolbarUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).intValue();
                CheckoutCardScreenKt.a((CheckoutCardComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).intValue();
                CheckoutItemListKt.d((PaymentModeCardHeaderUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).intValue();
                CheckoutNetBankingScreenKt.a((CheckoutNetBankingComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                CheckoutParentScreenKt.a((CheckoutParentComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).intValue();
                CityDiscontinuedScreenKt.a((CityDiscontinuedComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                CityDiscontinuedScreenUIKt.a((CityDiscontinuedUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).intValue();
                CityLocationSelectionScreenKt.c((CityLocationSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).getClass();
                CitySelectionParentScreenKt.a((CitySelectionParentComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).intValue();
                CitySelectionScreenKt.e((CitySelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 16:
                int iIntValue = ((Integer) obj2).intValue();
                return ClickableAppBarItem.AppbarContent$lambda$0((ClickableAppBarItem) this.c, this.b, (Composer) obj, iIntValue);
            case 17:
                ((Integer) obj2).intValue();
                ConfirmBookingScreenKt.a((ConfirmBookingScreenComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).intValue();
                ConfirmBookingScreenUIKt.a((ConfirmBookingScreenViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                ConfirmBookingScreenUIKt.d((JourneyDetailsUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).intValue();
                ConfirmSuperPassScreenKt.h((ConfirmSuperPassPurchaseViewModel) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).intValue();
                ConfirmSuperPassScreenKt.j((ConfirmSuperPassPurchaseUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 22:
                int iIntValue2 = ((Integer) obj2).intValue();
                return CoreTextFieldKt.TextFieldCursorHandle$lambda$4((TextFieldSelectionManager) this.c, this.b, (Composer) obj, iIntValue2);
            case 23:
                int iIntValue3 = ((Integer) obj2).intValue();
                return CustomAppBarItem.AppbarContent$lambda$0((CustomAppBarItem) this.c, this.b, (Composer) obj, iIntValue3);
            case 24:
                ((Integer) obj2).intValue();
                CustomUrlCheckoutScreenKt.a((CustomUrlCheckoutComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                DecomposeAppKt.a((RootComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).intValue();
                DecomposeScreensKt.a((Child.Created) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).intValue();
                DirectValidationMainScreenKt.a((QRScannerValidationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).intValue();
                EBillAmountScreenKt.b((EbillAmountComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                EBillAmountScreenKt.c((EBillAmountViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }
}
