package app.chalo.analytics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.analytics.AnalyticsContractImpl$startEventProcessor$1", f = "AnalyticsContractImpl.kt", l = {263, 50}, m = "invokeSuspend", v = 1)
final class AnalyticsContractImpl$startEventProcessor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AnalyticsContractImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsContractImpl$startEventProcessor$1(AnalyticsContractImpl analyticsContractImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = analyticsContractImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsContractImpl$startEventProcessor$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsContractImpl$startEventProcessor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:18:0x0042, B:22:0x0054, B:24:0x005c, B:14:0x0033, B:17:0x003e), top: B:35:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (app.chalo.analytics.AnalyticsContractImpl.J(r5, r8, r7) == r0) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:8:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            java.lang.Object r5 = r7.L$0
            app.chalo.analytics.AnalyticsContractImpl r5 = (app.chalo.analytics.AnalyticsContractImpl) r5
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L1d
        L1b:
            r8 = r5
            goto L42
        L1d:
            r8 = move-exception
            goto L78
        L1f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L27:
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.L$1
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            java.lang.Object r5 = r7.L$0
            app.chalo.analytics.AnalyticsContractImpl r5 = (app.chalo.analytics.AnalyticsContractImpl) r5
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L1d
            goto L54
        L37:
            kotlin.ResultKt.b(r8)
            app.chalo.analytics.AnalyticsContractImpl r8 = r7.this$0
            kotlinx.coroutines.channels.BufferedChannel r4 = r8.j
            kotlinx.coroutines.channels.ChannelIterator r1 = r4.iterator()     // Catch: java.lang.Throwable -> L1d
        L42:
            r7.L$0 = r8     // Catch: java.lang.Throwable -> L1d
            r7.L$1 = r4     // Catch: java.lang.Throwable -> L1d
            r7.L$2 = r1     // Catch: java.lang.Throwable -> L1d
            r7.label = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r5 = r1.a(r7)     // Catch: java.lang.Throwable -> L1d
            if (r5 != r0) goto L51
            goto L70
        L51:
            r6 = r5
            r5 = r8
            r8 = r6
        L54:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L1d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L1d
            if (r8 == 0) goto L71
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L1d
            app.chalo.analytics.events.AnalyticsEvent r8 = (app.chalo.analytics.events.AnalyticsEvent) r8     // Catch: java.lang.Throwable -> L1d
            r7.L$0 = r5     // Catch: java.lang.Throwable -> L1d
            r7.L$1 = r4     // Catch: java.lang.Throwable -> L1d
            r7.L$2 = r1     // Catch: java.lang.Throwable -> L1d
            r7.label = r2     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r8 = app.chalo.analytics.AnalyticsContractImpl.J(r5, r8, r7)     // Catch: java.lang.Throwable -> L1d
            if (r8 != r0) goto L1b
        L70:
            return r0
        L71:
            r8 = 0
            r4.cancel(r8)
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        L78:
            throw r8     // Catch: java.lang.Throwable -> L79
        L79:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.a(r4, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.analytics.AnalyticsContractImpl$startEventProcessor$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
