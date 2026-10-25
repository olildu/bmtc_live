package app.chalo.utils;

import kotlin.Metadata;
import kotlin.ranges.LongProgression;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CountdownTimerFlowKt {
    public static FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 a() {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(new LongProgression(29000L, new LongProgression(29000L, 0, -1L).b, -1 > 0 ? 1000L : -1000L)), new CountdownTimerFlowKt$getCountdownTimerFlow$1(1000L, null)), new CountdownTimerFlowKt$getCountdownTimerFlow$2(30000L, null));
    }
}
