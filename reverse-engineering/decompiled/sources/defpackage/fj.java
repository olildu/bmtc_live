package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.checkout.ui.screen.card.CheckoutCardViewState;
import app.chalo.checkout.ui.screen.card.compose.CheckoutCardScreenKt;
import app.chalo.checkout.ui.screen.chalopaywallet.ChaloWalletBlockedBottomsheetComposableKt;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreenKt;
import app.chalo.checkout.ui.screen.netbanking.NetBankingAppsViewState;
import app.chalo.checkout.ui.screen.netbanking.compose.CheckoutNetBankingScreenKt;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType;
import app.chalo.compose.ChaloErrorBannerKt;
import app.chalo.compose.ChaloSearchBoxComposableKt;
import app.chalo.compose.ChaloTncBottomSheetKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloCheckBoxKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRecentlySearchedCardKt;
import app.chalo.compose.components.ChaloSearchBarComposableUIKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.CircularShapeKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.components.dialogs.ChaloMultiSelectDatePickerKt;
import app.chalo.compose.components.textfields.ChaloExpandingTextKt;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.home.ui.history.compose.components.ChaloPassViewKt;
import app.chalo.home.ui.history.compose.components.ChaloTextAndImageViewKt;
import app.chalo.home.ui.history.uistate.ImageWithTextUiState;
import app.chalo.home.ui.history.uistate.pass.BusPassDetailsContainerUiState;
import app.chalo.home.ui.history.uistate.pass.BusPassUiState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionUiModel;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.premiumbus.ui.changestop.ChangeStopMapMarkerUIState;
import app.chalo.premiumbus.ui.changestop.compose.ChangeStopMapMarkerInfoWindowKt;
import app.chalo.uistate.cardwithtextleftandrighticon.CardWithTextLeftAndRightIconUiState;
import app.chalo.uistate.cardwithtextleftandrighticon.ChaloCardWithTextLeftAndRightIconViewKt;
import app.chalo.uistate.checkbox.ChaloCheckBoxUIState;
import app.chalo.uistate.components.ChaloRecentlySearchedCardUiState;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.dialog.MultiSelectDatePickerUIState;
import app.chalo.uistate.error.ErrorBannerUiState;
import app.chalo.uistate.searchbar.SearchBarUiState;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.stack.ChildrenKt;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15646a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fj(Object obj, Object obj2, int i, int i2) {
        this.f15646a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15646a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloCardTransactionsScreenKt.b((Modifier) this.d, (CardTransactionUiModel) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ChaloCardTransactionsScreenKt.l((CardTransactionUiModel) this.b, (g0) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ChaloCardWithTextLeftAndRightIconViewKt.a((Modifier) this.d, (CardWithTextLeftAndRightIconUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ChaloCheckBoxKt.a((ChaloCheckBoxUIState) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ChaloErrorBannerKt.a((Modifier) this.d, (ErrorBannerUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ChaloExpandingTextKt.c((TextUIState.ExpandingTextUIState) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                ChaloLoadingDialogKt.c((DialogUIEventHandler) this.d, (Function2) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ChaloMap_androidKt.c((ChaloMapUIState) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ChaloMultiSelectDatePickerKt.a((MultiSelectDatePickerUIState) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ChaloPassViewKt.b((Modifier) this.d, (BusPassUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                ChaloPassViewKt.a((Modifier) this.d, (BusPassDetailsContainerUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ChaloRecentlySearchedCardKt.a((Modifier) this.d, (ChaloRecentlySearchedCardUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ChaloSearchBarComposableUIKt.a((Modifier) this.d, (SearchBarWithActionUIState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                ChaloSearchBoxComposableKt.a((Modifier) this.d, (SearchBarUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ChaloTabTitleKt.c((Modifier) this.d, (Shape) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ChaloTextAndImageViewKt.a((Modifier) this.d, (ImageWithTextUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                ChaloTncBottomSheetKt.a((List) this.d, (SheetState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.j((ToolbarBaseActionUIState.DropDownAction) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.h((ToolbarBaseActionUIState) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.d((ToolbarUIState) this.d, (Function3) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.k((ToolbarBaseActionUIState.IconAndTextUIState) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ChaloWalletBlockedBottomsheetComposableKt.a((Modifier) this.d, (PaymentBottomSheetUiType.ChaloWalletBlockedBottomsheetUiState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ChaloWidgetCardKt.a((Modifier) this.d, (ChaloTextWithBackgroundData) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ChangeStopMapMarkerInfoWindowKt.a((ChangeStopMapMarkerUIState.ChangeStopStopMarkerInfoWindowUIState) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                CheckoutCardScreenKt.b((CheckoutCardViewState) this.d, (FocusRequester) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                CheckoutNetBankingScreenKt.b((NetBankingAppsViewState) this.d, (FocusRequester) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                CheckoutScreenKt.a((CheckoutComponent) this.d, (RazorPaySdkProvider) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ChildrenKt.b((SaveableStateHolder) this.d, (HashSet) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                CircularShapeKt.b((ShapedContentUIState) this.b, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                CityLocationSelectionScreenKt.d((CityLocationSelectionState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ fj(Object obj, Object obj2, boolean z, int i, int i2) {
        this.f15646a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
