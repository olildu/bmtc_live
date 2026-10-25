package app.chalo.core.di;

import android.content.Context;
import app.chalo.core.database.AppDatabaseAndroidImpl;
import app.chalo.providers.CoroutineContextProvider;
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
public final class SharedCoreModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1 implements Function2<Scope, ParametersHolder, AppDatabaseAndroidImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        return new AppDatabaseAndroidImpl((Context) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", Context.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
    }
}
