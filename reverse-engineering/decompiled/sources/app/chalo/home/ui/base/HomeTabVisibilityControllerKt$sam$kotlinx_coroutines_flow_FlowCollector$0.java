package app.chalo.home.ui.base;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class HomeTabVisibilityControllerKt$sam$kotlinx_coroutines_flow_FlowCollector$0 implements FlowCollector, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f3230a;

    public HomeTabVisibilityControllerKt$sam$kotlinx_coroutines_flow_FlowCollector$0(Function2 function) {
        Intrinsics.i(function, "function");
        this.f3230a = function;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return this.f3230a.invoke(obj, continuation);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FlowCollector) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(this.f3230a, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.f3230a;
    }

    public final int hashCode() {
        return this.f3230a.hashCode();
    }
}
