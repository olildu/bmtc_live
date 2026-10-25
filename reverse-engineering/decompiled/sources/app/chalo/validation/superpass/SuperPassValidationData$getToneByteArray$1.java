package app.chalo.validation.superpass;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validation.superpass.SuperPassValidationData", f = "SuperPassValidationData.kt", l = {73, 73}, m = "getToneByteArray", v = 1)
final class SuperPassValidationData$getToneByteArray$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuperPassValidationData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassValidationData$getToneByteArray$1(SuperPassValidationData superPassValidationData, Continuation continuation) {
        super(continuation);
        this.this$0 = superPassValidationData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r1 == r2) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.result = r10
            int r10 = r9.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.label = r10
            app.chalo.validation.superpass.SuperPassValidationData r10 = r9.this$0
            r10.getClass()
            int r1 = r9.label
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r9.label = r1
            r0 = r9
            goto L1e
        L19:
            app.chalo.validation.superpass.SuperPassValidationData$getToneByteArray$1 r0 = new app.chalo.validation.superpass.SuperPassValidationData$getToneByteArray$1
            r0.<init>(r10, r9)
        L1e:
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L45
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            kotlin.ResultKt.b(r1)
            goto L72
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            java.lang.Object r10 = r0.L$1
            app.chalo.validation.superpass.SuperPassValidationData r10 = (app.chalo.validation.superpass.SuperPassValidationData) r10
            java.lang.Object r3 = r0.L$0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.b(r1)
            goto L5f
        L45:
            kotlin.ResultKt.b(r1)
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel r1 = r10.e
            if (r1 == 0) goto L75
            java.lang.String r3 = r1.getD()
            if (r3 == 0) goto L75
            r0.L$0 = r3
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r1 = r10.x(r0)
            if (r1 != r2) goto L5f
            goto L71
        L5f:
            java.lang.Number r1 = (java.lang.Number) r1
            long r7 = r1.longValue()
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.io.Serializable r1 = r10.I(r7, r3, r0)
            if (r1 != r2) goto L72
        L71:
            return r2
        L72:
            byte[] r1 = (byte[]) r1
            return r1
        L75:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validation.superpass.SuperPassValidationData$getToneByteArray$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
