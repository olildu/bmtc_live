package app.chalo.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.utils.CoroutineRestartUtilsKt$launchCollectorWithRestart$1", f = "CoroutineRestartUtils.kt", l = {19, 29}, m = "invokeSuspend", v = 1)
final class CoroutineRestartUtilsKt$launchCollectorWithRestart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $collectBlock;
    final /* synthetic */ String $collectorName;
    final /* synthetic */ long $retryDelayMillis;
    final /* synthetic */ String $tag;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineRestartUtilsKt$launchCollectorWithRestart$1(Function1 function1, String str, String str2, long j, Continuation continuation) {
        super(2, continuation);
        this.$collectBlock = function1;
        this.$tag = str;
        this.$collectorName = str2;
        this.$retryDelayMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoroutineRestartUtilsKt$launchCollectorWithRestart$1 coroutineRestartUtilsKt$launchCollectorWithRestart$1 = new CoroutineRestartUtilsKt$launchCollectorWithRestart$1(this.$collectBlock, this.$tag, this.$collectorName, this.$retryDelayMillis, continuation);
        coroutineRestartUtilsKt$launchCollectorWithRestart$1.L$0 = obj;
        return coroutineRestartUtilsKt$launchCollectorWithRestart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutineRestartUtilsKt$launchCollectorWithRestart$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:33|20|(1:27)) */
    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r1 = r12;
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r5, r11) == r0) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0075 -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r12)
        L15:
            r12 = r1
            goto L32
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            return r2
        L27:
            r12 = move-exception
            goto L49
        L29:
            r12 = move-exception
            goto L78
        L2b:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
        L32:
            boolean r1 = kotlinx.coroutines.CoroutineScopeKt.e(r12)
            if (r1 == 0) goto L79
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r11.$collectBlock     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L45
            r11.L$0 = r12     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L45
            r11.label = r4     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L45
            java.lang.Object r12 = r1.invoke(r11)     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L45
            if (r12 != r0) goto L79
            goto L77
        L45:
            r1 = move-exception
            r10 = r1
            r1 = r12
            r12 = r10
        L49:
            java.lang.String r5 = r11.$tag
            java.lang.String r6 = r11.$collectorName
            long r7 = r11.$retryDelayMillis
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r6 = " failed; restarting in "
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = "ms"
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            app.chalo.utils.chalologger.ChaloLog.c(r5, r6, r12)
            long r5 = r11.$retryDelayMillis
            r11.L$0 = r1
            r11.label = r3
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r5, r11)
            if (r12 != r0) goto L15
        L77:
            return r0
        L78:
            throw r12
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.utils.CoroutineRestartUtilsKt$launchCollectorWithRestart$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
