package app.chalo.livetracking.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.frameworklivetracking.ChaloSocketManagerProvider;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl;
import app.chalo.livetracking.frameworklivetracking.domain.FetchVehicleLiveGpsLocationUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.GetSeatAvailabilityUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.PollEtaForStopIdUseCase;
import app.chalo.livetracking.routedetails.domain.CheckIsTripNotStaleUseCase;
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
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$factoryOf$4 implements Function2<Scope, ParametersHolder, LiveTrackingDataManagerImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FetchVehicleLiveGpsLocationUseCase.class), null, null);
        Object objD2 = scope.d(Reflection.a(GetSeatAvailabilityUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(CheckIsTripNotStaleUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(ChaloSocketManagerProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        return new LiveTrackingDataManagerImpl((FetchVehicleLiveGpsLocationUseCase) objD, (GetSeatAvailabilityUseCase) objD2, (CheckIsTripNotStaleUseCase) objD3, (ChaloSocketManagerProvider) objD4, (AnalyticsContract) objD5, (BasicInfoContract) scope.d(Reflection.a(BasicInfoContract.class), null, null), (PollEtaForStopIdUseCase) scope.d(Reflection.a(PollEtaForStopIdUseCase.class), null, null));
    }
}
