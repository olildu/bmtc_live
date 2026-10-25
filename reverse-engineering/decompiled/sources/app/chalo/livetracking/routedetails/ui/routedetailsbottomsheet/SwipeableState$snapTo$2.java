package app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet;

import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SwipeableState$snapTo$2<T> implements FlowCollector {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Map map, Continuation continuation) {
        SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
        if (continuation instanceof SwipeableState$snapTo$2$emit$1) {
            swipeableState$snapTo$2$emit$1 = (SwipeableState$snapTo$2$emit$1) continuation;
            int i = swipeableState$snapTo$2$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableState$snapTo$2$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, continuation);
            }
        } else {
            swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, continuation);
        }
        Object obj = swipeableState$snapTo$2$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = swipeableState$snapTo$2$emit$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            throw null;
        }
        ResultKt.b(obj);
        if (SwipeableKt.b(map, null) == null) {
            throw new IllegalArgumentException("The target value must have an associated anchor.");
        }
        swipeableState$snapTo$2$emit$1.label = 1;
        throw null;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        a((Map) obj, continuation);
        throw null;
    }
}
