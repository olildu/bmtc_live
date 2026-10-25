package app.chalo.sos;

import androidx.compose.runtime.ComposerKt;
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
@DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleSendSOSMessage$1", f = "SosScreenComponent.kt", l = {ComposerKt.reuseKey, 214, 217}, m = "invokeSuspend", v = 1)
final class SosScreenComponent$handleSendSOSMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ SosScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SosScreenComponent$handleSendSOSMessage$1(SosScreenComponent sosScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sosScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SosScreenComponent$handleSendSOSMessage$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SosScreenComponent$handleSendSOSMessage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r8.G0("sos confirm send alert clicked", r1, r7) == r0) goto L23;
     */
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
            r2 = 3
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.b(r8)
            goto L8a
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            boolean r1 = r7.Z$0
            java.lang.Object r3 = r7.L$0
            app.chalo.providers.toast.KotlinToastManager r3 = (app.chalo.providers.toast.KotlinToastManager) r3
            kotlin.ResultKt.b(r8)
            goto L70
        L26:
            kotlin.ResultKt.b(r8)
            goto L44
        L2a:
            kotlin.ResultKt.b(r8)
            app.chalo.sos.SosScreenComponent r8 = r7.this$0
            app.chalo.sos.feature.SosContactsFeature r1 = r8.k
            kotlinx.coroutines.flow.StateFlow r8 = r8.f
            java.lang.Object r8 = r8.getValue()
            app.chalo.sos.SosScreenDataState r8 = (app.chalo.sos.SosScreenDataState) r8
            java.util.List r8 = r8.c
            r7.label = r3
            java.lang.Object r8 = r1.d(r8, r7)
            if (r8 != r0) goto L44
            goto L89
        L44:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r1 = r8.booleanValue()
            app.chalo.sos.SosScreenComponent r8 = r7.this$0
            h81 r3 = new h81
            r5 = 28
            r3.<init>(r5)
            r8.E0(r3)
            if (r1 != 0) goto L75
            app.chalo.sos.SosScreenComponent r8 = r7.this$0
            app.chalo.providers.toast.KotlinToastManager r3 = r8.m
            app.chalo.providers.stringprovider.StringProvider r8 = r8.n
            app.chalo.providers.stringprovider.StringEnum r5 = app.chalo.providers.stringprovider.StringEnum.SOS_MSG_FAILED
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7.L$0 = r3
            r7.Z$0 = r1
            r7.label = r4
            java.lang.Object r8 = r8.b(r5, r6, r7)
            if (r8 != r0) goto L70
            goto L89
        L70:
            java.lang.String r8 = (java.lang.String) r8
            app.chalo.providers.toast.KotlinToastManagerKt.b(r3, r8)
        L75:
            app.chalo.sos.SosScreenComponent r8 = r7.this$0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3 = 0
            r7.L$0 = r3
            r7.label = r2
            java.lang.String r2 = "sos confirm send alert clicked"
            java.lang.Object r8 = r8.G0(r2, r1, r7)
            if (r8 != r0) goto L8a
        L89:
            return r0
        L8a:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.sos.SosScreenComponent$handleSendSOSMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
