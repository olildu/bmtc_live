package app.chalo.onboarding.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.location.ChaloLocationManager;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent;
import app.chalo.onboarding.cityprovider.ProcessCityChangeUseCase;
import app.chalo.onboarding.cityprovider.UpdateCurrentCityUseCase;
import app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
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
public final class SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5 implements Function2<Scope, ParametersHolder, CityLocationSelectionComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CitySelectionArgs.CityLocationSelectionArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(ChaloLocationManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(CityMetaDataManager.class), null, null);
        Object objD5 = scope.d(Reflection.a(UpdateCurrentCityUseCase.class), null, null);
        Object objD6 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD7 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD8 = scope.d(Reflection.a(HomeScreenConfigManager.class), null, null);
        Object objD9 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD10 = scope.d(Reflection.a(CityMetaPropsLocalDataSource.class), null, null);
        Object objD11 = scope.d(Reflection.a(GetClusterConfigForCityUseCase.class), null, null);
        Object objD12 = scope.d(Reflection.a(KotlinToastManager.class), null, null);
        Object objD13 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD14 = scope.d(Reflection.a(PermissionHandlerProvider.class), null, null);
        Object objD15 = scope.d(Reflection.a(LocationPermissionCallbackHandler.class), null, null);
        Object objD16 = scope.d(Reflection.a(SystemHelper.class), null, null);
        Object objD17 = scope.d(Reflection.a(GpsRequestHandlerProvider.class), null, null);
        Object objD18 = scope.d(Reflection.a(UniversalSearchResultStateManager.class), null, null);
        Object objD19 = scope.d(Reflection.a(ProcessCityChangeUseCase.class), null, null);
        Object objD20 = scope.d(Reflection.a(CityProvider.class), null, null);
        return new CityLocationSelectionComponent((CitySelectionArgs.CityLocationSelectionArgs) objD, (ComponentContext) objD2, (ChaloLocationManager) objD3, (CityMetaDataManager) objD4, (UpdateCurrentCityUseCase) objD5, (StringProvider) objD6, (AnalyticsContract) objD7, (HomeScreenConfigManager) objD8, (BasicInfoContract) objD9, (CityMetaPropsLocalDataSource) objD10, (GetClusterConfigForCityUseCase) objD11, (KotlinToastManager) objD12, (ChaloNavigationManager) objD13, (PermissionHandlerProvider) objD14, (LocationPermissionCallbackHandler) objD15, (SystemHelper) objD16, (GpsRequestHandlerProvider) objD17, (UniversalSearchResultStateManager) objD18, (ProcessCityChangeUseCase) objD19, (CityProvider) objD20, (OnboardingBackgroundOperationManager) scope.d(Reflection.a(OnboardingBackgroundOperationManager.class), null, null), (ChaloAppFeatureHelper) scope.d(Reflection.a(ChaloAppFeatureHelper.class), null, null));
    }
}
