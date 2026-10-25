package app.chalo.login.di;

import app.chalo.login.smsautoread.SmsBroadcastReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$default$2 implements Function2<Scope, ParametersHolder, SmsBroadcastReceiver> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope factory = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(factory, "$this$factory");
        Intrinsics.i(it, "it");
        return new SmsBroadcastReceiver();
    }
}
