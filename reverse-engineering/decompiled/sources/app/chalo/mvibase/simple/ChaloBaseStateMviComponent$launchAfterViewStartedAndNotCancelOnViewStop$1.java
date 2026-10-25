package app.chalo.mvibase.simple;

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
@DebugMetadata(c = "app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1", f = "ChaloBaseStateMviComponent.kt", l = {271, 224}, m = "invokeSuspend", v = 1)
final class ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChaloBaseStateMviComponent<Object, Object, Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1(ChaloBaseStateMviComponent chaloBaseStateMviComponent, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBaseStateMviComponent;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1 chaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1 = new ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1(this.this$0, this.$block, continuation);
        chaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1.L$0 = obj;
        return chaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (r9.invoke(r1, r8) == r0) goto L21;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1$1$1] */
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
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r9)
            goto L95
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            java.lang.Object r1 = r8.L$1
            app.chalo.mvibase.simple.ChaloBaseStateMviComponent r1 = (app.chalo.mvibase.simple.ChaloBaseStateMviComponent) r1
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)
            goto L86
        L26:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            app.chalo.mvibase.simple.ChaloBaseStateMviComponent<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> r9 = r8.this$0
            com.arkivanov.decompose.ComponentContext r9 = r9.f5983a
            com.arkivanov.essenty.lifecycle.Lifecycle r9 = r9.getF12286a()
            com.arkivanov.essenty.lifecycle.Lifecycle$State r9 = r9.getB()
            com.arkivanov.essenty.lifecycle.Lifecycle$State r5 = com.arkivanov.essenty.lifecycle.Lifecycle.State.STARTED
            int r9 = r9.compareTo(r5)
            if (r9 >= 0) goto L86
            app.chalo.mvibase.simple.ChaloBaseStateMviComponent<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> r9 = r8.this$0
            r8.L$0 = r1
            r8.L$1 = r9
            r8.label = r4
            kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r8)
            r5.<init>(r4, r6)
            r5.u()
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1$1$1 r6 = new app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1$1$1
            r6.<init>()
            r4.element = r6
            com.arkivanov.decompose.ComponentContext r6 = r9.f5983a
            com.arkivanov.essenty.lifecycle.Lifecycle r6 = r6.getF12286a()
            T r7 = r4.element
            if (r7 == 0) goto L80
            com.arkivanov.essenty.lifecycle.Lifecycle$Callbacks r7 = (com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks) r7
            r6.b(r7)
            app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1$1$2 r6 = new app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1$1$2
            r6.<init>()
            r5.m(r6)
            java.lang.Object r9 = r5.t()
            if (r9 != r0) goto L86
            goto L94
        L80:
            java.lang.String r9 = "callbacks"
            kotlin.jvm.internal.Intrinsics.q(r9)
            throw r3
        L86:
            kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r9 = r8.$block
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r2
            java.lang.Object r9 = r9.invoke(r1, r8)
            if (r9 != r0) goto L95
        L94:
            return r0
        L95:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mvibase.simple.ChaloBaseStateMviComponent$launchAfterViewStartedAndNotCancelOnViewStop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
