package app.chalo.city_data_di;

import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.citydata.domain.FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase;
import app.chalo.citydata.domain.IsDynamicCityDataFetchEnabledUseCase;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
public final class SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1 implements Function2<Scope, ParametersHolder, FetchRouteDataFromRemoteUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CityProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD3 = scope.d(Reflection.a(LanguageFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD5 = scope.d(Reflection.a(CityDataRepository.class), null, null);
        Object objD6 = scope.d(Reflection.a(IsDynamicCityDataFetchEnabledUseCase.class), null, null);
        Object objD7 = scope.d(Reflection.a(FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(StringProvider.class), null, null);
        return new FetchRouteDataFromRemoteUseCase((CityProvider) objD, (UserProfileDetailsProvider) objD2, (LanguageFeature) objD3, (BasicInfoContract) objD4, (CityDataRepository) objD5, (IsDynamicCityDataFetchEnabledUseCase) objD6, (FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase) objD7, (StringProvider) objD8, (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null));
    }
}
