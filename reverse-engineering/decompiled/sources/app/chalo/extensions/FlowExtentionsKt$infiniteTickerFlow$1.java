package app.chalo.extensions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.extensions.FlowExtentionsKt$infiniteTickerFlow$1", f = "FlowExtentions.kt", l = {151, 153, 154}, m = "invokeSuspend", v = 1)
final class FlowExtentionsKt$infiniteTickerFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $initialDelayInMillis;
    final /* synthetic */ long $tickerTimeInMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtentionsKt$infiniteTickerFlow$1(long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.$initialDelayInMillis = j;
        this.$tickerTimeInMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtentionsKt$infiniteTickerFlow$1 flowExtentionsKt$infiniteTickerFlow$1 = new FlowExtentionsKt$infiniteTickerFlow$1(this.$initialDelayInMillis, this.$tickerTimeInMillis, continuation);
        flowExtentionsKt$infiniteTickerFlow$1.L$0 = obj;
        return flowExtentionsKt$infiniteTickerFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtentionsKt$infiniteTickerFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[PHI: r1
      0x003d: PHI (r1v3 kotlinx.coroutines.flow.FlowCollector) = 
      (r1v2 kotlinx.coroutines.flow.FlowCollector)
      (r1v4 kotlinx.coroutines.flow.FlowCollector)
      (r1v6 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:13:0x003a, B:19:0x0054, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[PHI: r1
      0x004a: PHI (r1v4 kotlinx.coroutines.flow.FlowCollector) = (r1v3 kotlinx.coroutines.flow.FlowCollector), (r1v8 kotlinx.coroutines.flow.FlowCollector) binds: [B:16:0x0047, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L20
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r8)
            goto L4a
        L20:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r8)
            goto L3d
        L28:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            long r5 = r7.$initialDelayInMillis
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r5, r7)
            if (r8 != r0) goto L3d
            goto L56
        L3d:
            r7.L$0 = r1
            r7.label = r3
            kotlin.Unit r8 = kotlin.Unit.f17538a
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L4a
            goto L56
        L4a:
            long r4 = r7.$tickerTimeInMillis
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r4, r7)
            if (r8 != r0) goto L3d
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.extensions.FlowExtentionsKt$infiniteTickerFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
