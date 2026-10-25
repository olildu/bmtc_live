package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.material3.WideNavigationRailState;
import androidx.compose.material3.WideNavigationRailStateImpl;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.contract.NavigationContract;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.FixedThreshold;
import app.chalo.livetracking.ui.routedetailsscreen.RouteStopSearchItemUIState;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.quickpay.ui.tripamount.QuickPayBottomSheetHelper;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory;
import app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig;
import app.chalo.quickpay.validation.manager.QuickPayTicketAnalyticsManagerValidation;
import app.chalo.quickpay.validation.manager.QuickPayTicketProductValidationReportProblemManager;
import app.chalo.quickpay.validation.manager.QuickPayTicketProductValidationUIManager;
import app.chalo.quickpay.validation.manager.QuickPayTicketValidationNavigationManager;
import app.chalo.quickpay.validation.manager.QuickPayValidationData;
import app.chalo.recent.model.app.RecentsType;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.scenes.args.WalletTransactionSummaryArgs;
import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.wallet.domain.AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase;
import app.chalo.wallet.domain.GetBannerForWalletScreenUseCase;
import app.chalo.wallet.domain.GetLoadMoneyDenominationsUseCase;
import app.chalo.wallet.domain.GetWalletLoadConfigAndPlaceRechargeOrderUseCase;
import app.chalo.wallet.domain.GetWalletTransactionSummaryUseCase;
import app.chalo.wallet.domain.ValidateQuickPayAmountUseCase;
import app.chalo.wallet.domain.ValidateQuickPayUseCase;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryComponent;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.GetValidWalletLoadConfigFromConfigListUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletIdUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.RefreshQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.ResolveQuickPayProductNameUseCase;
import app.chalo.walletframework.wallet.domain.SatisfiesQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ThreadContextElement;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i81 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15890a;

    public /* synthetic */ i81(int i) {
        this.f15890a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15890a) {
            case 0:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new WalletBalanceComponent((ComponentContext) parametersHolder.a(0, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)), (WalletBalanceArgs) parametersHolder.a(1, Reflection.a(WalletBalanceArgs.class)), new p71(scope, 3), (GetWalletAndAllTransactionsUseCase) scope.d(Reflection.a(GetWalletAndAllTransactionsUseCase.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (GetBannerForWalletScreenUseCase) scope.d(Reflection.a(GetBannerForWalletScreenUseCase.class), null, null), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null), (WalletRepository) scope.d(Reflection.a(WalletRepository.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (GetWalletSetupConfigurationUseCase) scope.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (WalletResolver) scope.d(Reflection.a(WalletResolver.class), null, null));
            case 1:
                Scope factory = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it, "it");
                return new WalletTransactionSummaryComponent((ComponentContext) factory.d(Reflection.a(ComponentContext.class), null, null), (WalletTransactionSummaryArgs) factory.d(Reflection.a(WalletTransactionSummaryArgs.class), null, null), (GetWalletTransactionSummaryUseCase) factory.d(Reflection.a(GetWalletTransactionSummaryUseCase.class), null, null), (AnalyticsContract) factory.d(Reflection.a(AnalyticsContract.class), null, null), (StringProvider) factory.d(Reflection.a(StringProvider.class), null, null), (GetWalletSetupConfigurationUseCase) factory.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null), (ChaloNavigationManager) factory.d(Reflection.a(ChaloNavigationManager.class), null, null), (UserProfileDetailsProvider) factory.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (NavigationContract) factory.d(Reflection.a(NavigationContract.class), null, null), (KotlinToastManager) factory.d(Reflection.a(KotlinToastManager.class), null, null), (WalletResolver) factory.d(Reflection.a(WalletResolver.class), null, null));
            case 2:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                return new WalletLoadBalanceEnterAmountComponent((ComponentContext) parametersHolder2.a(0, i71.k(scope2, "$this$factory", parametersHolder2, "<destruct>", ComponentContext.class)), (WalletLoadMoneyArgs) parametersHolder2.a(1, Reflection.a(WalletLoadMoneyArgs.class)), new p71(scope2, 1), (GetWalletStatusWithoutSyncUseCase) scope2.d(Reflection.a(GetWalletStatusWithoutSyncUseCase.class), null, null), (LoadMoneyAmountValidationUseCase) scope2.d(Reflection.a(LoadMoneyAmountValidationUseCase.class), null, null), (GetLoadMoneyDenominationsUseCase) scope2.d(Reflection.a(GetLoadMoneyDenominationsUseCase.class), null, null), (GetWalletLoadConfigAndPlaceRechargeOrderUseCase) scope2.d(Reflection.a(GetWalletLoadConfigAndPlaceRechargeOrderUseCase.class), null, null), (AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase) scope2.d(Reflection.a(AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase.class), null, null), (GetWalletIdUseCase) scope2.d(Reflection.a(GetWalletIdUseCase.class), null, null), (WalletSyncOrchestrator) scope2.d(Reflection.a(WalletSyncOrchestrator.class), null, null), (GetValidWalletLoadConfigFromConfigListUseCase) scope2.d(Reflection.a(GetValidWalletLoadConfigFromConfigListUseCase.class), null, null), (WalletDataStore) scope2.d(Reflection.a(WalletDataStore.class), null, null), (AnalyticsContract) scope2.d(Reflection.a(AnalyticsContract.class), null, null), (StringProvider) scope2.d(Reflection.a(StringProvider.class), null, null), (FetchWalletBalanceUseCase) scope2.d(Reflection.a(FetchWalletBalanceUseCase.class), null, null), (CurrencyFeature) scope2.d(Reflection.a(CurrencyFeature.class), null, null), (GetBannerForWalletScreenUseCase) scope2.d(Reflection.a(GetBannerForWalletScreenUseCase.class), null, null), (ChaloNavigationManager) scope2.d(Reflection.a(ChaloNavigationManager.class), null, null), (UserProfileDetailsProvider) scope2.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (TimeUtilsContract) scope2.d(Reflection.a(TimeUtilsContract.class), null, null), (CheckoutResultStateManager) scope2.d(Reflection.a(CheckoutResultStateManager.class), null, null), (WalletResolver) scope2.d(Reflection.a(WalletResolver.class), null, null));
            case 3:
                Scope factory2 = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(factory2, "$this$factory");
                Intrinsics.i(it2, "it");
                return new QuickpayTripAmountComponent((TicketPurchaseArgs.QuickPayArgs) factory2.d(Reflection.a(TicketPurchaseArgs.QuickPayArgs.class), null, null), (ComponentContext) factory2.d(Reflection.a(ComponentContext.class), null, null), new p71(factory2, 2), (ValidateQuickPayUseCase) factory2.d(Reflection.a(ValidateQuickPayUseCase.class), null, null), (ValidateQuickPayAmountUseCase) factory2.d(Reflection.a(ValidateQuickPayAmountUseCase.class), null, null), (SatisfiesQuickPayPrerequisitesUseCase) factory2.d(Reflection.a(SatisfiesQuickPayPrerequisitesUseCase.class), null, null), (RefreshQuickPayPrerequisitesUseCase) factory2.d(Reflection.a(RefreshQuickPayPrerequisitesUseCase.class), null, null), (AnalyticsContract) factory2.d(Reflection.a(AnalyticsContract.class), null, null), (UserProfileDetailsProvider) factory2.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (GetQuickPayDisclaimerTextUseCase) factory2.d(Reflection.a(GetQuickPayDisclaimerTextUseCase.class), null, null), (FetchWalletBalanceUseCase) factory2.d(Reflection.a(FetchWalletBalanceUseCase.class), null, null), (CurrencyFeature) factory2.d(Reflection.a(CurrencyFeature.class), null, null), (ChaloNavigationManager) factory2.d(Reflection.a(ChaloNavigationManager.class), null, null), (QuickPayBottomSheetHelper) factory2.d(Reflection.a(QuickPayBottomSheetHelper.class), null, null), (UrlOpenHelper) factory2.d(Reflection.a(UrlOpenHelper.class), null, null), (GetWalletSetupConfigurationUseCase) factory2.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null), (QuickpayTripAmountUIStateFactory) factory2.d(Reflection.a(QuickpayTripAmountUIStateFactory.class), null, null), (WalletResolver) factory2.d(Reflection.a(WalletResolver.class), null, null), (KotlinToastManager) factory2.d(Reflection.a(KotlinToastManager.class), null, null), (StringProvider) factory2.d(Reflection.a(StringProvider.class), null, null), (ResolveSupportPolicyUseCase) factory2.d(Reflection.a(ResolveSupportPolicyUseCase.class), null, null));
            case 4:
                Scope factory3 = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(factory3, "$this$factory");
                Intrinsics.i(it3, "it");
                return new QuickPayTicketProductValidationConfig((ProductValidationAnalyticManager) factory3.d(Reflection.a(QuickPayTicketAnalyticsManagerValidation.class), null, null), (ProductValidationNavigationManager) factory3.d(Reflection.a(QuickPayTicketValidationNavigationManager.class), null, null), (ProductValidationUIManager) factory3.d(Reflection.a(QuickPayTicketProductValidationUIManager.class), null, null), (ProductValidationReportProblemManager) factory3.d(Reflection.a(QuickPayTicketProductValidationReportProblemManager.class), null, null), (ProductValidationData) factory3.d(Reflection.a(QuickPayValidationData.class), null, null), (QuickPayRepository) factory3.d(Reflection.a(QuickPayRepository.class), null, null), (ChaloConfigFeature) factory3.d(Reflection.a(ChaloConfigFeature.class), null, null), (CoroutineContextProvider) factory3.d(Reflection.a(CoroutineContextProvider.class), null, null), (ResolveQuickPayProductNameUseCase) factory3.d(Reflection.a(ResolveQuickPayProductNameUseCase.class), null, null));
            case 5:
                return SheetState.Companion.Saver$lambda$0((SaverScope) obj, (SheetState) obj2);
            case 6:
                return SliderState.Companion.Saver$lambda$0((SaverScope) obj, (SliderState) obj2);
            case 7:
                ((Integer) obj).intValue();
                RouteStopSearchItemUIState item = (RouteStopSearchItemUIState) obj2;
                Intrinsics.i(item, "item");
                return item.f4886a;
            case 8:
                return SwipeToDismissBoxState.Companion.Saver$lambda$2((SaverScope) obj, (SwipeToDismissBoxState) obj2);
            case 9:
                return SwipeToDismissBoxState.Companion.Saver$lambda$0((SaverScope) obj, (SwipeToDismissBoxState) obj2);
            case 10:
                return new FixedThreshold(Dp.m7278constructorimpl(56));
            case 11:
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                return Float.valueOf(0.0f);
            case 12:
                ((Integer) obj).intValue();
                Intrinsics.i((RecentsType) obj2, "<unused var>");
                return Unit.f17538a;
            case 13:
                return TextFieldScrollerPosition.Saver$lambda$0((SaverScope) obj, (TextFieldScrollerPosition) obj2);
            case 14:
                return TextFieldValue.Saver$lambda$0((SaverScope) obj, (TextFieldValue) obj2);
            case 15:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof ThreadContextElement)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
            case 16:
                ThreadContextElement threadContextElement = (ThreadContextElement) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (threadContextElement != null) {
                    return threadContextElement;
                }
                if (element2 instanceof ThreadContextElement) {
                    return (ThreadContextElement) element2;
                }
                return null;
            case 17:
                return TopAppBarState.Saver$lambda$0((SaverScope) obj, (TopAppBarState) obj2);
            case 18:
                return Unit.f17538a;
            case 19:
                ((Boolean) obj2).getClass();
                return Unit.f17538a;
            case 20:
                return WideNavigationRailStateImpl.Companion.Saver$lambda$0((SaverScope) obj, (WideNavigationRailState) obj2);
            case 21:
                return Integer.valueOf(((WindowInsets) obj).getTop((Density) obj2));
            default:
                return Integer.valueOf(((WindowInsets) obj).getBottom((Density) obj2));
        }
    }
}
