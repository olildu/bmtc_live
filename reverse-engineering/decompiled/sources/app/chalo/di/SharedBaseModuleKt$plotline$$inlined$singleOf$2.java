package app.chalo.di;

import app.chalo.compose.utils.CommonContext;
import app.chalo.plotline.PlotlineTrackContextProviderImpl;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedBaseModuleKt$plotline$$inlined$singleOf$2 implements Function2<Scope, ParametersHolder, PlotlineTrackContextProviderImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        return new PlotlineTrackContextProviderImpl((CommonContext) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", CommonContext.class), null, null));
    }
}
