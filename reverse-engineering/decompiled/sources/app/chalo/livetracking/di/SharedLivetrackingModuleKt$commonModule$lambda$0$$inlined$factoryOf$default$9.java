package app.chalo.livetracking.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.livetracking.frameworklivetracking.domain.GetDelayedEtaThresholdForLiveTrackingUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.GetSeatAvailabilityUseCase;
import app.chalo.livetracking.routedetails.domain.CheckIsTripNotStaleUseCase;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
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
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9 implements Function2<Scope, ParametersHolder, TripPlannerItineraryLiveInfoManager> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CoroutineContextProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(LiveTrackingDataManager.class), null, null);
        Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(GetSeatAvailabilityUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(LiveTrackingConfigDataStore.class), null, null);
        Object objD6 = scope.d(Reflection.a(CityProvider.class), null, null);
        return new TripPlannerItineraryLiveInfoManager((CoroutineContextProvider) objD, (LiveTrackingDataManager) objD2, (BasicInfoContract) objD3, (GetSeatAvailabilityUseCase) objD4, (LiveTrackingConfigDataStore) objD5, (CityProvider) objD6, (CheckIsTripNotStaleUseCase) scope.d(Reflection.a(CheckIsTripNotStaleUseCase.class), null, null), (GetDelayedEtaThresholdForLiveTrackingUseCase) scope.d(Reflection.a(GetDelayedEtaThresholdForLiveTrackingUseCase.class), null, null));
    }
}
