package app.chalo.security.di;

import app.chalo.network.NetworkManager;
import app.chalo.security.sync.ClientSecretManager;
import app.chalo.security.sync.config.dao.ConfigDao;
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
public final class SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1 implements Function2<Scope, ParametersHolder, ClientSecretManager> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        return new ClientSecretManager((ConfigDao) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ConfigDao.class), null, null), (NetworkManager) scope.d(Reflection.a(NetworkManager.class), null, null));
    }
}
