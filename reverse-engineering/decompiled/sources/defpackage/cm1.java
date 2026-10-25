package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.WideNavigationRailStateKt;
import androidx.compose.material3.WideNavigationRailValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import app.chalo.compose.webview.KWebView;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.login.ui.userconsent.UserConsentComponent;
import app.chalo.login.ui.userconsent.UserConsentIntent;
import app.chalo.network.config.ChaloJson;
import app.chalo.productsummary.ui.ticket.TicketSummaryIntent;
import app.chalo.productsummary.ui.ticket.TicketSummaryScreenType;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.superpass.data.models.entities.SuperPassUIProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.uistate.userprofile.GenderCardUIState;
import app.chalo.usecase.FeedbackTags;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceDialogType;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountIntent;
import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.wallet.ui.moneyaddedbottomsheet.model.WalletMoneyAddedNavigationModel;
import io.ktor.http.Url;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cm1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11345a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cm1(int i, Object obj, Object obj2) {
        this.f11345a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SuperPassUserDetails superPassUserDetails;
        String str;
        switch (this.f11345a) {
            case 0:
                ((Function1) this.b).invoke(((SuperPassUserDetails) this.c).g);
                return Unit.f17538a;
            case 1:
                SuperPassUIProperties superPassUIProperties = (SuperPassUIProperties) this.c;
                Function1 function1 = (Function1) this.b;
                if (superPassUIProperties != null && (superPassUserDetails = superPassUIProperties.c) != null && (str = superPassUserDetails.g) != null) {
                    function1.invoke(new TicketSummaryIntent.OnImageClickIntent(str));
                }
                return Unit.f17538a;
            case 2:
                ((Function1) this.b).invoke(new TicketSummaryIntent.OnBackPressedIntent((TicketSummaryScreenType) this.c));
                return Unit.f17538a;
            case 3:
                UniversalPickerComponent universalPickerComponent = (UniversalPickerComponent) this.b;
                RecentTripAppModel recentTripAppModel = (RecentTripAppModel) this.c;
                ChaloNavigationManager chaloNavigationManager = universalPickerComponent.z;
                Json json = ChaloJson.b;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = recentTripAppModel.g;
                json.getClass();
                UniversalSearchDescriptiveLocationAppModel.Companion companion = UniversalSearchDescriptiveLocationAppModel.INSTANCE;
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(json.a(companion.serializer(), universalSearchDescriptiveLocationAppModel), json.a(companion.serializer(), recentTripAppModel.h)), null, null, 6));
                return Unit.f17538a;
            case 4:
                ((UniversalPickerComponent) this.b).z.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs((String) this.c), null, "RouteDetailsTag", 2));
                return Unit.f17538a;
            case 5:
                return Url.b((ArrayList) this.b, (Url) this.c);
            case 6:
                UserConsentComponent userConsentComponent = (UserConsentComponent) this.b;
                MutableState mutableState = (MutableState) this.c;
                KWebView kWebView = (KWebView) mutableState.getValue();
                if (kWebView == null || !kWebView.f1934a.canGoBack()) {
                    userConsentComponent.L0(UserConsentIntent.BackClickedIntent.f5351a);
                } else {
                    KWebView kWebView2 = (KWebView) mutableState.getValue();
                    if (kWebView2 != null) {
                        kWebView2.f1934a.goBack();
                    }
                }
                return Unit.f17538a;
            case 7:
                FocusManager focusManager = (FocusManager) this.b;
                GenderCardUIState genderCardUIState = (GenderCardUIState) this.c;
                focusManager.clearFocus(true);
                genderCardUIState.e.a();
                return Unit.f17538a;
            case 8:
                ((Function1) this.b).invoke((FeedbackTags) this.c);
                return Unit.f17538a;
            case 9:
                WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent = (WalletLoadBalanceEnterAmountComponent) this.b;
                WalletMoneyAddedNavigationModel walletMoneyAddedNavigationModel = (WalletMoneyAddedNavigationModel) this.c;
                ChaloNavigationManager chaloNavigationManager2 = walletLoadBalanceEnterAmountComponent.D;
                long j = walletMoneyAddedNavigationModel.f10888a;
                WalletLoadMoneyArgs walletLoadMoneyArgs = walletLoadBalanceEnterAmountComponent.p;
                chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new WalletLoadBalanceSuccessArgs(j, walletLoadMoneyArgs.e, walletLoadMoneyArgs.d), null, null, 6));
                return Unit.f17538a;
            case 10:
                ((WalletLoadBalanceEnterAmountComponent) this.b).L0(new WalletLoadBalanceEnterAmountIntent.TnCAcceptClickIntent(((WalletLoadBalanceDialogType.TncDialog) ((WalletLoadBalanceDialogType) this.c)).f10827a));
                return Unit.f17538a;
            case 11:
                ((Function1) this.b).invoke((WalletTransactionUiModel) this.c);
                return Unit.f17538a;
            default:
                return WideNavigationRailStateKt.rememberWideNavigationRailState$lambda$1$lambda$0((WideNavigationRailValue) this.b, (FiniteAnimationSpec) this.c);
        }
    }

    public /* synthetic */ cm1(SuperPassUIProperties superPassUIProperties, Function1 function1) {
        this.f11345a = 1;
        this.c = superPassUIProperties;
        this.b = function1;
    }
}
