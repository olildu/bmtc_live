package app.chalo.productbooking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedProductBookingModuleKt$premiumBus$$inlined$factoryOf$default$17 implements Function2<Scope, ParametersHolder, PbPassPurchaseLandingScreenComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(PremiumBusArgs.PremiumBusPassLandingScreenArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD7 = scope.d(Reflection.a(FetchPBODPairsForGivenLocationsUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(PremiumBusPurchaseInfoManager.class), null, null);
        Object objD10 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD11 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD12 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD13 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD14 = scope.d(Reflection.a(IReportProblemFeature.class), null, null);
        return new PbPassPurchaseLandingScreenComponent((ComponentContext) objD, (PremiumBusArgs.PremiumBusPassLandingScreenArgs) objD2, (StringProvider) objD3, (FetchCompleteProductConfigByIdUseCase) objD4, (CityProvider) objD5, (UserProfileDetailsProvider) objD6, (FetchPBODPairsForGivenLocationsUseCase) objD7, (StoreCompleteProductConfigLocallyUseCase) objD8, (PremiumBusPurchaseInfoManager) objD9, (AnalyticsContract) objD10, (TimeUtilsContract) objD11, (KotlinToastManager) objD12, (ChaloNavigationManager) objD13, (IReportProblemFeature) objD14, (ProductBookingNavigationManager) scope.d(Reflection.a(ProductBookingNavigationManager.class), null, null), (UniversalSearchResultStateManager) scope.d(Reflection.a(UniversalSearchResultStateManager.class), null, null));
    }
}
