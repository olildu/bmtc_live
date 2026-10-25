package app.chalo.mvibase.simple;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ChaloBaseStateMviComponent$sam$kotlinx_coroutines_flow_FlowCollector$0 implements FlowCollector, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f5995a;

    /* JADX WARN: Multi-variable type inference failed */
    public ChaloBaseStateMviComponent$sam$kotlinx_coroutines_flow_FlowCollector$0(Function2 function2) {
        this.f5995a = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return this.f5995a.invoke(obj, continuation);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FlowCollector) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return this.f5995a.equals(((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.f5995a;
    }

    public final int hashCode() {
        return this.f5995a.hashCode();
    }
}
