package app.chalo.tito.data.local;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tito.data.local.TITOValidationDataSourceImpl", f = "TITOValidationDataSourceImpl.kt", l = {51, 51}, m = "checkIfTitoTripPresentInDb", v = 1)
final class TITOValidationDataSourceImpl$checkIfTitoTripPresentInDb$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TITOValidationDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TITOValidationDataSourceImpl$checkIfTitoTripPresentInDb$1(TITOValidationDataSourceImpl tITOValidationDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = tITOValidationDataSourceImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r1 == r2) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r6.result = r7
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.label = r7
            app.chalo.tito.data.local.TITOValidationDataSourceImpl r7 = r6.this$0
            r7.getClass()
            int r1 = r6.label
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r6.label = r1
            r0 = r6
            goto L1e
        L19:
            app.chalo.tito.data.local.TITOValidationDataSourceImpl$checkIfTitoTripPresentInDb$1 r0 = new app.chalo.tito.data.local.TITOValidationDataSourceImpl$checkIfTitoTripPresentInDb$1
            r0.<init>(r7, r6)
        L1e:
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            kotlin.ResultKt.b(r1)
            goto L56
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.ResultKt.b(r1)
            goto L4b
        L3c:
            kotlin.ResultKt.b(r1)
            app.chalo.tito.data.repository.dao.TITOValidationDao r7 = r7.f9636a
            r0.label = r5
            r1 = 0
            app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1 r1 = r7.b(r1)
            if (r1 != r2) goto L4b
            goto L55
        L4b:
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            r0.label = r4
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.t(r1, r0)
            if (r1 != r2) goto L56
        L55:
            return r2
        L56:
            if (r1 == 0) goto L59
            goto L5a
        L59:
            r5 = 0
        L5a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tito.data.local.TITOValidationDataSourceImpl$checkIfTitoTripPresentInDb$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
