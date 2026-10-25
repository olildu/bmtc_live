package app.chalo.login.di;

import app.chalo.contract.RemoteConfigFetcherContract;
import app.chalo.login.domain.FetchOnboardingMinProfileUpdateConfigUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
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
public final class SharedLoginModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2 implements Function2<Scope, ParametersHolder, FetchOnboardingMinProfileUpdateConfigUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", RemoteConfigFetcherContract.class), null, null);
        return new FetchOnboardingMinProfileUpdateConfigUseCase((RemoteConfigFetcherContract) objD, (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null), (ABTestAnalyticsContract) scope.d(Reflection.a(ABTestAnalyticsContract.class), null, null));
    }
}
