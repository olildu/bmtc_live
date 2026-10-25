package app.cash.sqldelight.coroutines;

import app.cash.sqldelight.Query;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/cash/sqldelight/Query;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.cash.sqldelight.coroutines.FlowQuery$asFlow$1", f = "FlowExtensions.kt", l = {47, 48}, m = "invokeSuspend")
final class FlowQuery$asFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Query<Object>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Query<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowQuery$asFlow$1(Query query, Continuation continuation) {
        super(2, continuation);
        this.$this_asFlow = query;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowQuery$asFlow$1 flowQuery$asFlow$1 = new FlowQuery$asFlow$1(this.$this_asFlow, continuation);
        flowQuery$asFlow$1.L$0 = obj;
        return flowQuery$asFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowQuery$asFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:18:0x0058, B:22:0x006a, B:24:0x0072, B:14:0x0035, B:17:0x0054), top: B:31:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r6.emit(r9, r8) == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [i40] */
    /* JADX WARN: Type inference failed for: r5v3, types: [app.cash.sqldelight.Query$Listener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [app.cash.sqldelight.Query$Listener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:8:0x001d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 == r4) goto L29
            if (r1 != r3) goto L21
            java.lang.Object r1 = r8.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r8.L$1
            app.cash.sqldelight.Query$Listener r5 = (app.cash.sqldelight.Query.Listener) r5
            java.lang.Object r6 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L1f
        L1d:
            r9 = r6
            goto L58
        L1f:
            r9 = move-exception
            goto L8c
        L21:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L29:
            java.lang.Object r1 = r8.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r8.L$1
            app.cash.sqldelight.Query$Listener r5 = (app.cash.sqldelight.Query.Listener) r5
            java.lang.Object r6 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L1f
            goto L6a
        L39:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            r1 = -1
            r5 = 6
            r6 = 0
            kotlinx.coroutines.channels.BufferedChannel r1 = kotlinx.coroutines.channels.ChannelKt.a(r1, r5, r6)
            r1.mo7576trySendJP2dKIU(r2)
            i40 r5 = new i40
            r5.<init>()
            app.cash.sqldelight.Query<java.lang.Object> r6 = r8.$this_asFlow
            r6.e(r5)
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
        L58:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L1f
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L1f
            r8.L$2 = r1     // Catch: java.lang.Throwable -> L1f
            r8.label = r4     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r6 = r1.a(r8)     // Catch: java.lang.Throwable -> L1f
            if (r6 != r0) goto L67
            goto L85
        L67:
            r7 = r6
            r6 = r9
            r9 = r7
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1f
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1f
            if (r9 == 0) goto L86
            r1.next()     // Catch: java.lang.Throwable -> L1f
            app.cash.sqldelight.Query<java.lang.Object> r9 = r8.$this_asFlow     // Catch: java.lang.Throwable -> L1f
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L1f
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L1f
            r8.L$2 = r1     // Catch: java.lang.Throwable -> L1f
            r8.label = r3     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r9 = r6.emit(r9, r8)     // Catch: java.lang.Throwable -> L1f
            if (r9 != r0) goto L1d
        L85:
            return r0
        L86:
            app.cash.sqldelight.Query<java.lang.Object> r9 = r8.$this_asFlow
            r9.f(r5)
            return r2
        L8c:
            app.cash.sqldelight.Query<java.lang.Object> r0 = r8.$this_asFlow
            r0.f(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.coroutines.FlowQuery$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
