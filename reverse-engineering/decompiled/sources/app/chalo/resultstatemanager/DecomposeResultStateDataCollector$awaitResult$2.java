package app.chalo.resultstatemanager;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class DecomposeResultStateDataCollector$awaitResult$2 extends AdaptedFunctionReference implements Function3<ResultDataInternalState.DataFlowState<Object>, ResultDataInternalState.LifecycleTransition, Continuation<? super ResultStateData<Object>>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        ResultDataInternalState.DataFlowState dataFlowState = (ResultDataInternalState.DataFlowState) obj;
        ResultDataInternalState.LifecycleTransition lifecycleTransition = (ResultDataInternalState.LifecycleTransition) obj2;
        ((DecomposeResultStateDataCollector) this.receiver).getClass();
        if (Intrinsics.d(lifecycleTransition.b, Boolean.TRUE)) {
            if (dataFlowState instanceof ResultDataInternalState.DataFlowState.ResultReceived) {
                obj4 = ((ResultDataInternalState.DataFlowState.ResultReceived) dataFlowState).f9037a;
            } else {
                if (!(dataFlowState instanceof ResultDataInternalState.DataFlowState.WaitingForResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj4 = null;
            }
            if (obj4 != null) {
                return new ResultStateData.Success(obj4);
            }
            Boolean bool = lifecycleTransition.f9038a;
            Boolean bool2 = lifecycleTransition.b;
            if (bool != null && bool2 != null && !bool.booleanValue() && bool2.booleanValue()) {
                return new ResultStateData.Cancelled();
            }
        }
        return null;
    }
}
