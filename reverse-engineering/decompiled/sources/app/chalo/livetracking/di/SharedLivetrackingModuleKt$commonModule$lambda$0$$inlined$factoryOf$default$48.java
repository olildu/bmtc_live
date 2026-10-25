package app.chalo.livetracking.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.livetracking.routedetails.domain.IsAgencyTagVisibleUseCase;
import app.chalo.livetracking.universalsearch.UniversalSearchHelper;
import app.chalo.livetracking.universalsearch.UniversalSearchManager;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper;
import app.chalo.livetracking.universalsearch.domain.CheckIfUserCameFromPremiumBusCampaign;
import app.chalo.livetracking.universalsearch.domain.ConvertSearchedResultItemsAppModelToUiModelUseCase;
import app.chalo.livetracking.universalsearch.domain.UniversalSearchResultFilteringHelper;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.location.ChaloLocationManager;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.usecase.FetchCurrentLocationUseCase;
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
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$48 implements Function2<Scope, ParametersHolder, UniversalPickerComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(UniversalPickerArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(IsAgencyTagVisibleUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(UniversalSearchHelper.class), null, null);
        Object objD6 = scope.d(Reflection.a(UniversalSearchManager.class), null, null);
        Object objD7 = scope.d(Reflection.a(ConvertSearchedResultItemsAppModelToUiModelUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(UniversalSearchAnalyticsEventHelper.class), null, null);
        Object objD9 = scope.d(Reflection.a(UniversalSearchResultFilteringHelper.class), null, null);
        Object objD10 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD11 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD12 = scope.d(Reflection.a(CheckIfUserCameFromPremiumBusCampaign.class), null, null);
        Object objD13 = scope.d(Reflection.a(FetchCurrentLocationUseCase.class), null, null);
        Object objD14 = scope.d(Reflection.a(ChaloLocationManager.class), null, null);
        Object objD15 = scope.d(Reflection.a(CityMetaDataManager.class), null, null);
        Object objD16 = scope.d(Reflection.a(SystemHelper.class), null, null);
        Object objD17 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD18 = scope.d(Reflection.a(PermissionHandlerProvider.class), null, null);
        Object objD19 = scope.d(Reflection.a(UniversalSearchResultStateManager.class), null, null);
        Object objD20 = scope.d(Reflection.a(LocationPermissionCallbackHandler.class), null, null);
        return new UniversalPickerComponent((ComponentContext) objD, (UniversalPickerArgs) objD2, (CityProvider) objD3, (IsAgencyTagVisibleUseCase) objD4, (UniversalSearchHelper) objD5, (UniversalSearchManager) objD6, (ConvertSearchedResultItemsAppModelToUiModelUseCase) objD7, (UniversalSearchAnalyticsEventHelper) objD8, (UniversalSearchResultFilteringHelper) objD9, (BasicInfoContract) objD10, (StringProvider) objD11, (CheckIfUserCameFromPremiumBusCampaign) objD12, (FetchCurrentLocationUseCase) objD13, (ChaloLocationManager) objD14, (CityMetaDataManager) objD15, (SystemHelper) objD16, (ChaloNavigationManager) objD17, (PermissionHandlerProvider) objD18, (UniversalSearchResultStateManager) objD19, (LocationPermissionCallbackHandler) objD20, (GpsRequestHandlerProvider) scope.d(Reflection.a(GpsRequestHandlerProvider.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
    }
}
