package app.chalo.core.di;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.network.logging.ChaloInternalNetworkInspector;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.NetworkInspectorArgs;
import com.arkivanov.decompose.ComponentContext;
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
public final class SharedCoreModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2 implements Function2<Scope, ParametersHolder, NetworkInspectorComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(NetworkInspectorArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(ChaloInternalNetworkInspector.class), null, null);
        return new NetworkInspectorComponent((ComponentContext) objD, (NetworkInspectorArgs) objD2, (ChaloNavigationManager) objD3, (ChaloInternalNetworkInspector) objD4, (ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
    }
}
