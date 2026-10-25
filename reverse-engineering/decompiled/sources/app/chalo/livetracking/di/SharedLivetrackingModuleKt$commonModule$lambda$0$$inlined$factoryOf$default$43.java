package app.chalo.livetracking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.livetracking.universalsearch.data.repository.TrackingRepository;
import app.chalo.livetracking.universalsearch.domain.FetchRemoteSearchResultUseCase;
import app.chalo.livetracking.universalsearch.domain.GetAutoCompleteCurrentCityTimeoutConfigUseCase;
import app.chalo.location.ChaloLocationManager;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.usecase.GetDistinctIdUseCase;
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
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$43 implements Function2<Scope, ParametersHolder, FetchRemoteSearchResultUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", TrackingRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(ChaloLocationManager.class), null, null);
        Object objD3 = scope.d(Reflection.a(LanguageFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(GetDistinctIdUseCase.class), null, null);
        return new FetchRemoteSearchResultUseCase((TrackingRepository) objD, (ChaloLocationManager) objD2, (LanguageFeature) objD3, (CityProvider) objD4, (StringProvider) objD5, (GetDistinctIdUseCase) objD6, (GetAutoCompleteCurrentCityTimeoutConfigUseCase) scope.d(Reflection.a(GetAutoCompleteCurrentCityTimeoutConfigUseCase.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null));
    }
}
