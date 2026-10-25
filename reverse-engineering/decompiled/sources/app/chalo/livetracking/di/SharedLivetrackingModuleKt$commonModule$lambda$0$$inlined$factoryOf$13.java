package app.chalo.livetracking.di;

import app.chalo.features.network.NetworkStateManager;
import app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl;
import app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper;
import app.chalo.livetracking.universalsearch.domain.FetchCityIndependentPlacesUseCase;
import app.chalo.livetracking.universalsearch.domain.FetchOfflineSearchResultUseCase;
import app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase;
import app.chalo.livetracking.universalsearch.domain.FetchRemoteSearchResultUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.SystemHelper;
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
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$factoryOf$13 implements Function2<Scope, ParametersHolder, UniversalSearchManagerImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchRecentSearchItemsFromDatabaseUseCase.class), null, null);
        Object objD2 = scope.d(Reflection.a(FetchCityIndependentPlacesUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(FetchRemoteSearchResultUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchOfflineSearchResultUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(UniversalSearchAnalyticsEventHelper.class), null, null);
        Object objD7 = scope.d(Reflection.a(NetworkStateManager.class), null, null);
        return new UniversalSearchManagerImpl((FetchRecentSearchItemsFromDatabaseUseCase) objD, (FetchCityIndependentPlacesUseCase) objD2, (FetchRemoteSearchResultUseCase) objD3, (FetchOfflineSearchResultUseCase) objD4, (CoroutineContextProvider) objD5, (UniversalSearchAnalyticsEventHelper) objD6, (NetworkStateManager) objD7, (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (SystemHelper) scope.d(Reflection.a(SystemHelper.class), null, null));
    }
}
