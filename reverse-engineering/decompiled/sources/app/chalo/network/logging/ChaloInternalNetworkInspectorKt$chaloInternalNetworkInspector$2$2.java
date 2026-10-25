package app.chalo.network.logging;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.logging.ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2", f = "ChaloInternalNetworkInspector.kt", l = {60, 66}, m = "invokeSuspend", v = 1)
final class ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloInternalNetworkInspector $config;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2(ChaloInternalNetworkInspector chaloInternalNetworkInspector, Continuation continuation) {
        super(3, continuation);
        this.$config = chaloInternalNetworkInspector;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2 chaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2 = new ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2(this.$config, (Continuation) obj3);
        chaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2.L$0 = (PipelineContext) obj;
        chaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2.L$1 = (HttpResponseContainer) obj2;
        return chaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r1.f(r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.PipelineContext] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L54
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            java.lang.Object r1 = r5.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L20
            goto L54
        L20:
            r6 = move-exception
            goto L3d
        L22:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            java.lang.Object r6 = r5.L$1
            io.ktor.client.statement.HttpResponseContainer r6 = (io.ktor.client.statement.HttpResponseContainer) r6
            java.lang.Object r6 = r6.b     // Catch: java.lang.Exception -> L20
            app.chalo.network.logging.ChaloInternalNetworkInspector r4 = r5.$config     // Catch: java.lang.Exception -> L20
            r5.L$0 = r1     // Catch: java.lang.Exception -> L20
            r5.label = r3     // Catch: java.lang.Exception -> L20
            java.lang.Object r6 = app.chalo.network.logging.ChaloInternalNetworkInspectorKt.a(r1, r6, r4, r5)     // Catch: java.lang.Exception -> L20
            if (r6 != r0) goto L54
            goto L53
        L3d:
            java.lang.String r3 = "BaseInternalNetworkInspectorImpl: pipeline catch: "
            java.lang.String r6 = defpackage.gf.g(r6, r3)
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r6)
            r6 = 0
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r6 = r1.f(r5)
            if (r6 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.network.logging.ChaloInternalNetworkInspectorKt$chaloInternalNetworkInspector$2$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
