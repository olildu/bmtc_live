package app.chalo.productbooking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate;
import app.chalo.premiumbus.managers.PremiumBusBookingNavigationHelper;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productbooking.common.domain.GetCompleteProductConfigFromLocalCacheUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$18 implements Function2<Scope, ParametersHolder, PremiumBusProductSelectionComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", PremiumBusArgs.PremiumProductSelectionArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(FetchProductConfigsForUiUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(GetCompleteProductConfigFromLocalCacheUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(PremiumBusPurchaseInfoManager.class), null, null);
        Object objD8 = scope.d(Reflection.a(PremiumBusBookingNavigationHelper.class), null, null);
        Object objD9 = scope.d(Reflection.a(GetOneTimeOfferConfigUseCase.class), null, null);
        Object objD10 = scope.d(Reflection.a(IUserPreferencesDataStore.class), null, null);
        Object objD11 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD12 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD13 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD14 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD15 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD16 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD17 = scope.d(Reflection.a(IReportProblemFeature.class), null, null);
        Object objD18 = scope.d(Reflection.a(ProductBookingNavigationManager.class), null, null);
        return new PremiumBusProductSelectionComponent((PremiumBusArgs.PremiumProductSelectionArgs) objD, (ComponentContext) objD2, (FetchProductConfigsForUiUseCase) objD3, (FetchCompleteProductConfigByIdUseCase) objD4, (GetCompleteProductConfigFromLocalCacheUseCase) objD5, (StoreCompleteProductConfigLocallyUseCase) objD6, (PremiumBusPurchaseInfoManager) objD7, (PremiumBusBookingNavigationHelper) objD8, (GetOneTimeOfferConfigUseCase) objD9, (IUserPreferencesDataStore) objD10, (AnalyticsContract) objD11, (CityProvider) objD12, (UserProfileDetailsProvider) objD13, (StringProvider) objD14, (ChaloNavigationManager) objD15, (KotlinToastManager) objD16, (IReportProblemFeature) objD17, (ProductBookingNavigationManager) objD18, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (PricingEngineRuleExpiryTickerDelegate) scope.d(Reflection.a(PricingEngineRuleExpiryTickerDelegate.class), null, null));
    }
}
