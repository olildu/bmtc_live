package app.chalo.city_data_di;

import app.chalo.recent.database.repository.recent.PlacesRecentRepository;
import app.chalo.recent.database.repository.recent.RecentLocationPairRepository;
import app.chalo.recent.database.repository.recent.RecentRepositoryProviderImpl;
import app.chalo.recent.database.repository.recent.RouteRecentRepository;
import app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepository;
import app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository;
import app.chalo.recent.database.repository.recent.StopRecentRepository;
import app.chalo.recent.database.repository.recent.TripRecentRepository;
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
public final class SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$5 implements Function2<Scope, ParametersHolder, RecentRepositoryProviderImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", RouteRecentRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(StopRecentRepository.class), null, null);
        Object objD3 = scope.d(Reflection.a(StopBasedTripRecentRepository.class), null, null);
        Object objD4 = scope.d(Reflection.a(PlacesRecentRepository.class), null, null);
        Object objD5 = scope.d(Reflection.a(TripRecentRepository.class), null, null);
        return new RecentRepositoryProviderImpl((RouteRecentRepository) objD, (StopRecentRepository) objD2, (StopBasedTripRecentRepository) objD3, (PlacesRecentRepository) objD4, (TripRecentRepository) objD5, (StopAndRouteBasedRecentRepository) scope.d(Reflection.a(StopAndRouteBasedRecentRepository.class), null, null), (RecentLocationPairRepository) scope.d(Reflection.a(RecentLocationPairRepository.class), null, null));
    }
}
