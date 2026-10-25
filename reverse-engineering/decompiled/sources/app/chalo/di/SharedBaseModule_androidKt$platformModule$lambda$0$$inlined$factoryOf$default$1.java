package app.chalo.di;

import android.content.Context;
import app.chalo.features.freshchat.FreshchatRestoreIdDataMigration;
import app.chalo.features.freshchat.FreshchatUserDataHandler;
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
public final class SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1 implements Function2<Scope, ParametersHolder, FreshchatRestoreIdDataMigration> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        return new FreshchatRestoreIdDataMigration((Context) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", Context.class), null, null), (FreshchatUserDataHandler) scope.d(Reflection.a(FreshchatUserDataHandler.class), null, null));
    }
}
