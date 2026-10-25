package app.chalo.validationsdk.multiproductvalidation.ui;

import androidx.media3.extractor.ts.TsExtractor;
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
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$scheduleValidityCheck$1", f = "MultiProductValidationComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 173}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$scheduleValidityCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MultiProductValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$scheduleValidityCheck$1(MultiProductValidationComponent multiProductValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProductValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MultiProductValidationComponent$scheduleValidityCheck$1 multiProductValidationComponent$scheduleValidityCheck$1 = new MultiProductValidationComponent$scheduleValidityCheck$1(this.this$0, continuation);
        multiProductValidationComponent$scheduleValidityCheck$1.L$0 = obj;
        return multiProductValidationComponent$scheduleValidityCheck$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$scheduleValidityCheck$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(1000, r6) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r7)
        L13:
            r7 = r1
            goto L2c
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r7)
            goto L40
        L25:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
        L2c:
            boolean r1 = kotlinx.coroutines.CoroutineScopeKt.e(r7)
            if (r1 == 0) goto L4d
            app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent r1 = r6.this$0
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r1 = app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent.F0(r1, r6)
            if (r1 != r0) goto L3f
            goto L4c
        L3f:
            r1 = r7
        L40:
            r6.L$0 = r1
            r6.label = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L13
        L4c:
            return r0
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$scheduleValidityCheck$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
