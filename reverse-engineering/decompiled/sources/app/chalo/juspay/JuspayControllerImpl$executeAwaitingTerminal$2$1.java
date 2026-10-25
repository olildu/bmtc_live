package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/juspay/JuspayControllerImpl$TerminalOutcome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1", f = "JuspayControllerImpl.kt", l = {794, 1045}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$executeAwaitingTerminal$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JuspayControllerImpl.TerminalOutcome>, Object> {
    final /* synthetic */ JuspaySdkAdapter $adapter;
    final /* synthetic */ JusPaySDKRequestAppModel $request;
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$executeAwaitingTerminal$2$1(JuspaySdkAdapter juspaySdkAdapter, JusPaySDKRequestAppModel jusPaySDKRequestAppModel, String str, JuspayControllerImpl juspayControllerImpl, Continuation continuation) {
        super(2, continuation);
        this.$adapter = juspaySdkAdapter;
        this.$request = jusPaySDKRequestAppModel;
        this.$requestId = str;
        this.this$0 = juspayControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JuspayControllerImpl$executeAwaitingTerminal$2$1 juspayControllerImpl$executeAwaitingTerminal$2$1 = new JuspayControllerImpl$executeAwaitingTerminal$2$1(this.$adapter, this.$request, this.$requestId, this.this$0, continuation);
        juspayControllerImpl$executeAwaitingTerminal$2$1.L$0 = obj;
        return juspayControllerImpl$executeAwaitingTerminal$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$executeAwaitingTerminal$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L21
            if (r1 == r2) goto L19
            if (r1 != r3) goto L11
            kotlin.ResultKt.b(r10)
            goto L7a
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
            kotlin.ResultKt.b(r10)
            goto L4a
        L21:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1 r5 = new app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$terminal$1
            app.chalo.juspay.JuspaySdkAdapter r6 = r9.$adapter
            app.chalo.juspay.JuspayControllerImpl r7 = r9.this$0
            java.lang.String r8 = r9.$requestId
            r5.<init>(r6, r7, r8, r4)
            kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.b(r10, r4, r1, r5, r2)
            app.chalo.juspay.JuspaySdkAdapter r10 = r9.$adapter
            app.chalo.juspay.JusPaySDKRequestAppModel r5 = r9.$request
            java.lang.String r6 = r9.$requestId
            r9.L$0 = r1
            r9.label = r2
            java.lang.Object r10 = r10.c(r5, r6, r9)
            if (r10 != r0) goto L4a
            goto L79
        L4a:
            app.chalo.juspay.JuspayControllerImpl r10 = r9.this$0
            kotlinx.coroutines.selects.SelectImplementation r2 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r5 = r9.getContext()
            r2.<init>(r5)
            kotlinx.coroutines.selects.SelectClause1 r5 = r1.T0()
            app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$1 r6 = new app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$1
            r6.<init>(r3, r4)
            r2.j(r5, r6)
            kotlinx.coroutines.CompletableDeferred r10 = r10.m
            kotlinx.coroutines.selects.SelectClause1 r10 = r10.T0()
            app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$2 r5 = new app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1$outcome$1$2
            r5.<init>(r1, r4)
            r2.j(r10, r5)
            r9.L$0 = r4
            r9.label = r3
            java.lang.Object r10 = r2.g(r9)
            if (r10 != r0) goto L7a
        L79:
            return r0
        L7a:
            app.chalo.juspay.JuspayControllerImpl$TerminalOutcome r10 = (app.chalo.juspay.JuspayControllerImpl.TerminalOutcome) r10
            if (r10 != 0) goto Lb0
            app.chalo.juspay.JuspayControllerImpl r0 = r9.this$0
            boolean r0 = r0.n
            if (r0 != 0) goto Lb0
            java.lang.String r0 = r9.$requestId
            app.chalo.juspay.JusPaySDKRequestAppModel r1 = r9.$request
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "timed out requestId="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", request="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "message"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            app.chalo.juspay.JuspayControllerImpl r0 = r9.this$0
            app.chalo.juspay.JuspaySdkAdapterImpl r1 = r0.d
            r1.b()
            app.chalo.juspay.JuspaySdkStatus$NotInitialised r1 = app.chalo.juspay.JuspaySdkStatus.NotInitialised.f4072a
            r0.v(r1)
        Lb0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.juspay.JuspayControllerImpl$executeAwaitingTerminal$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
