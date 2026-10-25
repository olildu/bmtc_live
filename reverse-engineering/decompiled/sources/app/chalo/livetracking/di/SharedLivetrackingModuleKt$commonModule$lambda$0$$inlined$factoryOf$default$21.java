package app.chalo.livetracking.di;

import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.livetracking.frameworklivetracking.domain.ProcessLiveStopEtaDataUseCase;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedLivetrackingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$21 implements Function2<Scope, ParametersHolder, ProcessLiveStopEtaDataUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        return new ProcessLiveStopEtaDataUseCase((CheckLiveBusDelayedUseCase) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CheckLiveBusDelayedUseCase.class), null, null));
    }
}
