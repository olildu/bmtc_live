package app.chalo.validation.superpass;

import app.chalo.contract.BasicInfoContract;
import app.chalo.superpass.data.models.entities.SuperPass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validation.superpass.SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2", f = "SuperPassProductValidationModel.kt", l = {EACTags.APPLICATION_IMAGE, EACTags.APPLICATION_IMAGE, EACTags.APPLICATION_IMAGE, EACTags.APPLICATION_IMAGE}, m = "invokeSuspend", v = 1)
final class SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ BasicInfoContract $basicInfoContract;
    final /* synthetic */ SuperPass $this_toSuperPassProductValidationModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2(SuperPass superPass, BasicInfoContract basicInfoContract, Continuation continuation) {
        super(1, continuation);
        this.$this_toSuperPassProductValidationModel = superPass;
        this.$basicInfoContract = basicInfoContract;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2(this.$this_toSuperPassProductValidationModel, this.$basicInfoContract, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d A[PHI: r1 r10
      0x006d: PHI (r1v4 app.chalo.superpass.data.models.entities.SuperPass) = (r1v3 app.chalo.superpass.data.models.entities.SuperPass), (r1v8 app.chalo.superpass.data.models.entities.SuperPass) binds: [B:23:0x006a, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v0 java.lang.Object) binds: [B:23:0x006a, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r10 == r0) goto L27;
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
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.ResultKt.b(r10)
            goto L7e
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.L$0
            app.chalo.superpass.data.models.entities.SuperPass r1 = (app.chalo.superpass.data.models.entities.SuperPass) r1
            kotlin.ResultKt.b(r10)
            goto L6d
        L27:
            kotlin.ResultKt.b(r10)
            goto L56
        L2b:
            java.lang.Object r1 = r9.L$0
            app.chalo.superpass.data.models.entities.SuperPass r1 = (app.chalo.superpass.data.models.entities.SuperPass) r1
            kotlin.ResultKt.b(r10)
            goto L45
        L33:
            kotlin.ResultKt.b(r10)
            app.chalo.superpass.data.models.entities.SuperPass r1 = r9.$this_toSuperPassProductValidationModel
            app.chalo.contract.BasicInfoContract r10 = r9.$basicInfoContract
            r9.L$0 = r1
            r9.label = r6
            java.lang.Object r10 = r10.c(r9)
            if (r10 != r0) goto L45
            goto L7d
        L45:
            java.lang.Number r10 = (java.lang.Number) r10
            long r7 = r10.longValue()
            r9.L$0 = r2
            r9.label = r5
            java.lang.Boolean r10 = r1.k(r7)
            if (r10 != r0) goto L56
            goto L7d
        L56:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L87
            app.chalo.superpass.data.models.entities.SuperPass r1 = r9.$this_toSuperPassProductValidationModel
            app.chalo.contract.BasicInfoContract r10 = r9.$basicInfoContract
            r9.L$0 = r1
            r9.label = r4
            java.lang.Object r10 = r10.c(r9)
            if (r10 != r0) goto L6d
            goto L7d
        L6d:
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            r9.L$0 = r2
            r9.label = r3
            java.lang.Object r10 = r1.m(r4, r9)
            if (r10 != r0) goto L7e
        L7d:
            return r0
        L7e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L87
            goto L88
        L87:
            r6 = 0
        L88:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validation.superpass.SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
