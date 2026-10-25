package app.chalo.network.di;

import app.chalo.network.ChaloUrlProvider;
import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.network.NetworkManagerImpl;
import app.chalo.network.mock.ApiSourceAwareRequestDispatcher;
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
public final class SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$1 implements Function2<Scope, ParametersHolder, NetworkManagerImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloUrlProvider.class), null, null);
        return new NetworkManagerImpl((ChaloUrlProvider) objD, (NetworkCrashlyticsLogger) scope.d(Reflection.a(NetworkCrashlyticsLogger.class), null, null), (ApiSourceAwareRequestDispatcher) scope.d(Reflection.a(ApiSourceAwareRequestDispatcher.class), null, null));
    }
}
