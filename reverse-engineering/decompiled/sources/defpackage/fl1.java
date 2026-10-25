package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.AnnotatedString;
import app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent;
import app.chalo.checkout.ui.screen.upi.UpiAppsViewState;
import app.chalo.checkout.ui.screen.upi.compose.UpiAppScreenKt;
import app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent;
import app.chalo.checkout.ui.screen.wallet.WalletAppsViewState;
import app.chalo.checkout.ui.screen.wallet.compose.WalletAppsPaymentScreenKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import app.chalo.core.compose.ValidationParentScreenKt;
import app.chalo.core.compose.WalletParentScreenKt;
import app.chalo.core.navigation.validation.ValidationParentComponent;
import app.chalo.core.navigation.wallet.WalletParentComponent;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchTripStopAndLocationComposableKt;
import app.chalo.login.ui.userconsent.UserConsentComponent;
import app.chalo.login.ui.userconsent.UserConsentRequiredDialogUIState;
import app.chalo.login.ui.userconsent.UserConsentScreenKt;
import app.chalo.productsummary.ui.compose.TripSummaryMainScreenKt;
import app.chalo.productsummary.ui.ticket.TicketSummaryBusMetaInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryComponent;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptCardUISpec;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptHeaderUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptScreenUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptStopsInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryScreenType;
import app.chalo.productsummary.ui.ticket.TicketSummaryViewState;
import app.chalo.userprofile.ui.ToolbarAndProfilePicSectionUIState;
import app.chalo.userprofile.ui.UserProfileFormComponent;
import app.chalo.userprofile.ui.UserProfileFormUIState;
import app.chalo.userprofile.ui.UserProfileTextField;
import app.chalo.userprofile.ui.compose.UserProfileFormScreenKt;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsMainScreenKt;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountMainScreenKt;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessComponent;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessScreenKt;
import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreenKt;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryState;
import app.chalo.wallet.ui.transactionsummary.compose.WalletTransactionSummaryComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fl1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15654a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fl1(Object obj, int i, int i2) {
        this.f15654a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15654a) {
            case 0:
                ((Integer) obj2).intValue();
                TripPlannerDetailsScreenKt.l((TripPlannerDetailsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                TripPlannerResultsScreenKt.t((TripPlannerResultsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.d((TicketSummaryReceiptScreenUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.j((TicketSummaryReceiptCardUISpec) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.h((TicketSummaryReceiptHeaderUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.k((TicketSummaryReceiptStopsInfoUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.f((TicketSummaryBusMetaInfoUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.n((TicketSummaryComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.o((TicketSummaryViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.m((TicketSummaryScreenType.Success.CommonReceipt) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                UniversalPickerComposableKt.g((UniversalPickerComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                UniversalSearchTripStopAndLocationComposableKt.a((AnnotatedString) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                UpiAppScreenKt.c((CheckoutUpiAppsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                UpiAppScreenKt.b((UpiAppsViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                UserConsentScreenKt.b((UserConsentComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                UserConsentScreenKt.a((UserConsentRequiredDialogUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                UserProfileFormScreenKt.c((UserProfileFormComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                UserProfileFormScreenKt.d((UserProfileFormUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                UserProfileFormScreenKt.a((UserProfileTextField) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                UserProfileFormScreenKt.b((ToolbarAndProfilePicSectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                UserProfilePicComposableKt.a((UserProfilePicComposableUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ValidationParentScreenKt.a((ValidationParentComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                WalletAllTransactionsMainScreenKt.a((WalletAllTransactionsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                WalletAppsPaymentScreenKt.a((CheckoutWalletAppsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                WalletAppsPaymentScreenKt.b((WalletAppsViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                WalletBalanceMainScreenKt.a((WalletBalanceComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                WalletLoadBalanceEnterAmountMainScreenKt.a((WalletLoadBalanceEnterAmountComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                WalletLoadBalanceSuccessScreenKt.b((WalletLoadBalanceSuccessComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                WalletParentScreenKt.a((WalletParentComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                WalletTransactionSummaryComposableKt.b((WalletTransactionSummaryState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
