package app.chalo.onboarding.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.network.ChaloUrlProvider;
import app.chalo.onboarding.cityprovider.CityChangeOperationTracker;
import app.chalo.onboarding.cityprovider.PostCityChangeOperationExecutor;
import app.chalo.usecase.ClearProductStoresUseCase;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
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
public final class SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4 implements Function2<Scope, ParametersHolder, PostCityChangeOperationExecutor> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ChaloUrlProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(ClearProductStoresUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        return new PostCityChangeOperationExecutor((ChaloUrlProvider) objD, (ClearProductStoresUseCase) objD2, (AnalyticsContract) objD3, (CrashlyticsLogger) objD4, (CityChangeOperationTracker) scope.d(Reflection.a(CityChangeOperationTracker.class), null, null), (ApplicationBackgroundWorkersManager) scope.d(Reflection.a(ApplicationBackgroundWorkersManager.class), null, null));
    }
}
