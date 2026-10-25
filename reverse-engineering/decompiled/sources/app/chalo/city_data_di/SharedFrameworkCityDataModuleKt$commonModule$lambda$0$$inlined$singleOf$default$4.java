package app.chalo.city_data_di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.domain.GetCityDataRemoteConfigUseCase;
import app.chalo.citydata.domain.ManageRoutesDataUseCase;
import app.chalo.citydata.domain.SyncRoutesDataUseCase;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.citydata.repository.local.store.CityDataLocalStore;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.localsource.recent.RecentRouteLocalDataSource;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$4 implements Function2<Scope, ParametersHolder, SyncRoutesDataUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD3 = scope.d(Reflection.a(LanguageFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD5 = scope.d(Reflection.a(CityDataRepository.class), null, null);
        Object objD6 = scope.d(Reflection.a(RecentRouteLocalDataSource.class), null, null);
        Object objD7 = scope.d(Reflection.a(ManageRoutesDataUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD9 = scope.d(Reflection.a(CityDataLocalStore.class), null, null);
        return new SyncRoutesDataUseCase((CityProvider) objD, (UserProfileDetailsProvider) objD2, (LanguageFeature) objD3, (BasicInfoContract) objD4, (CityDataRepository) objD5, (RecentRouteLocalDataSource) objD6, (ManageRoutesDataUseCase) objD7, (AnalyticsContract) objD8, (CityDataLocalStore) objD9, (GetCityDataRemoteConfigUseCase) scope.d(Reflection.a(GetCityDataRemoteConfigUseCase.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null));
    }
}
