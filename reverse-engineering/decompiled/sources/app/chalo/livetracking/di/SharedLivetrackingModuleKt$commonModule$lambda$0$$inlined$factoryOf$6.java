package app.chalo.livetracking.di;

import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.citydata.domain.GetCachedRouteUseCase;
import app.chalo.citydata.manager.CityDataManagerKotlin;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.ProcessLiveStopEtaDataUseCase;
import app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl;
import app.chalo.providers.CoroutineContextProvider;
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
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$factoryOf$6 implements Function2<Scope, ParametersHolder, RouteTrackingDataProviderImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(GetCachedRouteUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(FetchRouteDataFromRemoteUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(LiveTrackingDataManager.class), null, null);
        Object objD5 = scope.d(Reflection.a(ProcessLiveStopEtaDataUseCase.class), null, null);
        return new RouteTrackingDataProviderImpl((CoroutineContextProvider) objD, (GetCachedRouteUseCase) objD2, (FetchRouteDataFromRemoteUseCase) objD3, (LiveTrackingDataManager) objD4, (ProcessLiveStopEtaDataUseCase) objD5, (CheckLiveBusDelayedUseCase) scope.d(Reflection.a(CheckLiveBusDelayedUseCase.class), null, null), (CityDataManagerKotlin) scope.d(Reflection.a(CityDataManagerKotlin.class), null, null));
    }
}
