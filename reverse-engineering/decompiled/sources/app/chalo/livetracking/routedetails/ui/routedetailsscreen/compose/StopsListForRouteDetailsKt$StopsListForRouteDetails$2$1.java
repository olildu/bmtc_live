package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopsListForRouteDetailsKt$StopsListForRouteDetails$2$1", f = "StopsListForRouteDetails.kt", l = {64, 65}, m = "invokeSuspend", v = 1)
final class StopsListForRouteDetailsKt$StopsListForRouteDetails$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Integer $scrollPos;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopsListForRouteDetailsKt$StopsListForRouteDetails$2$1(Integer num, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.$scrollPos = num;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopsListForRouteDetailsKt$StopsListForRouteDetails$2$1(this.$scrollPos, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopsListForRouteDetailsKt$StopsListForRouteDetails$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, r5, 0, r10, 2, null) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r11)
            goto L52
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            int r1 = r10.I$0
            java.lang.Object r3 = r10.L$0
            androidx.compose.foundation.lazy.LazyListState r3 = (androidx.compose.foundation.lazy.LazyListState) r3
            kotlin.ResultKt.b(r11)
            r5 = r1
            r4 = r3
            goto L42
        L24:
            kotlin.ResultKt.b(r11)
            java.lang.Integer r11 = r10.$scrollPos
            if (r11 == 0) goto L52
            androidx.compose.foundation.lazy.LazyListState r1 = r10.$listState
            int r11 = r11.intValue()
            r10.L$0 = r1
            r10.I$0 = r11
            r10.label = r3
            r3 = 100
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.b(r3, r10)
            if (r3 != r0) goto L40
            goto L51
        L40:
            r5 = r11
            r4 = r1
        L42:
            r11 = 0
            r10.L$0 = r11
            r10.label = r2
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r10
            java.lang.Object r11 = androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L52
        L51:
            return r0
        L52:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopsListForRouteDetailsKt$StopsListForRouteDetails$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
