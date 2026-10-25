package app.chalo.livetracking.di;

import app.chalo.datastore.RouteAvailabilityBannerStore;
import app.chalo.livetracking.routedetails.data.repository.RouteAvailabilityBannerRepositoryImpl;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$singleOf$4 implements Function2<Scope, ParametersHolder, RouteAvailabilityBannerRepositoryImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        return new RouteAvailabilityBannerRepositoryImpl((RouteAvailabilityBannerStore) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", RouteAvailabilityBannerStore.class), null, null));
    }
}
