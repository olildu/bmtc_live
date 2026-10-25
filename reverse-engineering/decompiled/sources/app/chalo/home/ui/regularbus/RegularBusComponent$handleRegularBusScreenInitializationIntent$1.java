package app.chalo.home.ui.regularbus;

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
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$handleRegularBusScreenInitializationIntent$1", f = "RegularBusComponent.kt", l = {1255, 1256}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$handleRegularBusScreenInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RegularBusViewIntent.RegularBusScreenInitializationIntent $intent;
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$handleRegularBusScreenInitializationIntent$1(RegularBusComponent regularBusComponent, RegularBusViewIntent.RegularBusScreenInitializationIntent regularBusScreenInitializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
        this.$intent = regularBusScreenInitializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$handleRegularBusScreenInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$handleRegularBusScreenInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (app.chalo.home.ui.regularbus.RegularBusComponent.Q0(r5, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L39
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L2e
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.home.ui.regularbus.RegularBusComponent r5 = r4.this$0
            app.chalo.home.ui.regularbus.RegularBusViewIntent$RegularBusScreenInitializationIntent r1 = r4.$intent
            app.chalo.homescreen.data.model.app.RegularBusScreenConfigAppModel r1 = r1.f3650a
            r4.label = r3
            java.lang.Object r5 = app.chalo.home.ui.regularbus.RegularBusComponent.N0(r5, r1, r4)
            if (r5 != r0) goto L2e
            goto L38
        L2e:
            app.chalo.home.ui.regularbus.RegularBusComponent r5 = r4.this$0
            r4.label = r2
            java.lang.Object r5 = app.chalo.home.ui.regularbus.RegularBusComponent.Q0(r5, r4)
            if (r5 != r0) goto L39
        L38:
            return r0
        L39:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent$handleRegularBusScreenInitializationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
