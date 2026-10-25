package app.chalo.livetracking.di;

import app.chalo.Device;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.livetracking.frameworklivetracking.ChaloSocketFeature;
import app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl;
import app.chalo.livetracking.frameworklivetracking.domain.GetChaloSocketConfigUseCase;
import app.chalo.network.config.KPlatformSocketConfig;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
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
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$singleOf$3 implements Function2<Scope, ParametersHolder, RealTimeSocketManagerImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", GetChaloSocketConfigUseCase.class), null, null);
        Object objD2 = scope.d(Reflection.a(ChaloSocketFeature.class), null, null);
        Object objD3 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(Device.class), null, null);
        Object objD7 = scope.d(Reflection.a(ApplicationForegroundManager.class), null, null);
        Object objD8 = scope.d(Reflection.a(NetworkStateManager.class), null, null);
        Object objD9 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        return new RealTimeSocketManagerImpl((GetChaloSocketConfigUseCase) objD, (ChaloSocketFeature) objD2, (CityProvider) objD3, (UserProfileDetailsProvider) objD4, (CoroutineContextProvider) objD5, (Device) objD6, (ApplicationForegroundManager) objD7, (NetworkStateManager) objD8, (AnalyticsContract) objD9, (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (KPlatformSocketConfig) scope.d(Reflection.a(KPlatformSocketConfig.class), null, null));
    }
}
