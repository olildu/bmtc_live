package app.chalo.extensions;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/extensions/FlowCollectWithStatus$TimerStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.extensions.FlowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1", f = "FlowExtentions.kt", l = {117, 124, 127, TsExtractor.TS_STREAM_TYPE_AC3}, m = "invokeSuspend", v = 1)
final class FlowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super FlowCollectWithStatus.TimerStatus>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $hasReceivedValidData;
    final /* synthetic */ long $timeout;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1(Ref.BooleanRef booleanRef, long j, Continuation continuation) {
        super(2, continuation);
        this.$hasReceivedValidData = booleanRef;
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1 flowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1 = new FlowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1(this.$hasReceivedValidData, this.$timeout, continuation);
        flowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1.L$0 = obj;
        return flowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r2.emit(r9, r17) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r2.emit(r8, r17) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r8 = r9;
        r10 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r2.emit(r8, r17) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(500, r17) == r1) goto L35;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:9:0x0021). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L43
            if (r2 == r8) goto L3b
            if (r2 == r7) goto L2e
            if (r2 == r6) goto L2e
            if (r2 != r5) goto L26
            int r2 = r0.I$0
            long r8 = r0.J$0
            java.lang.Object r10 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            kotlin.ResultKt.b(r18)
        L21:
            r15 = r10
            r10 = r2
            r2 = r15
            goto Lab
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            int r2 = r0.I$0
            long r8 = r0.J$0
            java.lang.Object r10 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            kotlin.ResultKt.b(r18)
            goto L9c
        L3b:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.b(r18)
            goto L57
        L43:
            kotlin.ResultKt.b(r18)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            app.chalo.extensions.FlowCollectWithStatus$TimerStatus r9 = app.chalo.extensions.FlowCollectWithStatus.TimerStatus.STARTED
            r0.L$0 = r2
            r0.label = r8
            java.lang.Object r9 = r2.emit(r9, r0)
            if (r9 != r1) goto L57
            goto Laa
        L57:
            r9 = 0
        L59:
            kotlin.coroutines.CoroutineContext r11 = r0.getContext()
            boolean r11 = kotlinx.coroutines.JobKt.h(r11)
            if (r11 == 0) goto Lb0
            if (r8 == 0) goto Lb0
            kotlin.jvm.internal.Ref$BooleanRef r11 = r0.$hasReceivedValidData
            boolean r11 = r11.element
            r12 = 0
            if (r11 == 0) goto L81
            app.chalo.extensions.FlowCollectWithStatus$TimerStatus r8 = app.chalo.extensions.FlowCollectWithStatus.TimerStatus.CANCELLED
            r0.L$0 = r2
            r0.J$0 = r9
            r0.I$0 = r12
            r0.label = r7
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L7d
            goto Laa
        L7d:
            r8 = r9
            r10 = r2
            r2 = r12
            goto L9c
        L81:
            long r13 = r0.$timeout
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 < 0) goto L98
            app.chalo.extensions.FlowCollectWithStatus$TimerStatus r8 = app.chalo.extensions.FlowCollectWithStatus.TimerStatus.TIME_UP
            r0.L$0 = r2
            r0.J$0 = r9
            r0.I$0 = r12
            r0.label = r6
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L7d
            goto Laa
        L98:
            r15 = r9
            r10 = r2
            r2 = r8
            r8 = r15
        L9c:
            r0.L$0 = r10
            r0.J$0 = r8
            r0.I$0 = r2
            r0.label = r5
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r3, r0)
            if (r11 != r1) goto L21
        Laa:
            return r1
        Lab:
            long r8 = r8 + r3
            r15 = r8
            r8 = r10
            r9 = r15
            goto L59
        Lb0:
            kotlin.Unit r1 = kotlin.Unit.f17538a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.extensions.FlowCollectWithStatus$collectWithFirstValidResultTimeout$timerFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
