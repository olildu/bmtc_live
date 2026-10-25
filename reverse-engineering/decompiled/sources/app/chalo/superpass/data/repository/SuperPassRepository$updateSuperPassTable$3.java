package app.chalo.superpass.data.repository;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArray;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$updateSuperPassTable$3", f = "SuperPassRepository.kt", l = {178, 179, 180, 181, 182}, m = "invokeSuspend", v = 1)
final class SuperPassRepository$updateSuperPassTable$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonArray $lPassesArray;
    Object L$0;
    int label;
    final /* synthetic */ SuperPassRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassRepository$updateSuperPassTable$3(JsonArray jsonArray, SuperPassRepository superPassRepository, Continuation continuation) {
        super(2, continuation);
        this.$lPassesArray = jsonArray;
        this.this$0 = superPassRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassRepository$updateSuperPassTable$3(this.$lPassesArray, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassRepository$updateSuperPassTable$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[PHI: r1
      0x0077: PHI (r1v5 kotlin.Pair) = (r1v4 kotlin.Pair), (r1v12 kotlin.Pair) binds: [B:23:0x0074, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008c A[PHI: r1
      0x008c: PHI (r1v6 kotlin.Pair) = (r1v5 kotlin.Pair), (r1v14 kotlin.Pair) binds: [B:26:0x0089, B:12:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r8.B(r1, r7) == r0) goto L30;
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
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3e
            if (r1 == r6) goto L3a
            if (r1 == r5) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.ResultKt.b(r8)
            goto La2
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            java.lang.Object r1 = r7.L$0
            kotlin.Pair r1 = (kotlin.Pair) r1
            kotlin.ResultKt.b(r8)
            goto L8c
        L2a:
            java.lang.Object r1 = r7.L$0
            kotlin.Pair r1 = (kotlin.Pair) r1
            kotlin.ResultKt.b(r8)
            goto L77
        L32:
            java.lang.Object r1 = r7.L$0
            kotlin.Pair r1 = (kotlin.Pair) r1
            kotlin.ResultKt.b(r8)
            goto L64
        L3a:
            kotlin.ResultKt.b(r8)
            goto L4e
        L3e:
            kotlin.ResultKt.b(r8)
            app.chalo.superpass.data.parser.SuperPassJsonParser r8 = app.chalo.superpass.data.parser.SuperPassJsonParser.f9587a
            kotlinx.serialization.json.JsonArray r1 = r7.$lPassesArray
            r7.label = r6
            java.io.Serializable r8 = r8.f(r1, r7)
            if (r8 != r0) goto L4e
            goto La1
        L4e:
            r1 = r8
            kotlin.Pair r1 = (kotlin.Pair) r1
            app.chalo.superpass.data.repository.SuperPassRepository r8 = r7.this$0
            app.chalo.superpass.data.dao.SuperPassDao r6 = r8.b
            java.lang.String r8 = r8.k()
            r7.L$0 = r1
            r7.label = r5
            java.lang.Object r8 = r6.c(r8, r7)
            if (r8 != r0) goto L64
            goto La1
        L64:
            app.chalo.superpass.data.repository.SuperPassRepository r8 = r7.this$0
            app.chalo.superpass.data.dao.SuperPassDao r5 = r8.b
            java.lang.String r8 = r8.k()
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r5.f(r8, r7)
            if (r8 != r0) goto L77
            goto La1
        L77:
            app.chalo.superpass.data.repository.SuperPassRepository r8 = r7.this$0
            app.chalo.superpass.data.dao.SuperPassDao r8 = r8.b
            java.lang.Object r4 = r1.d()
            java.util.List r4 = (java.util.List) r4
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r8.m(r4, r7)
            if (r8 != r0) goto L8c
            goto La1
        L8c:
            app.chalo.superpass.data.repository.SuperPassRepository r8 = r7.this$0
            app.chalo.superpass.data.dao.SuperPassDao r8 = r8.b
            java.lang.Object r1 = r1.e()
            java.util.List r1 = (java.util.List) r1
            r3 = 0
            r7.L$0 = r3
            r7.label = r2
            java.lang.Object r8 = r8.B(r1, r7)
            if (r8 != r0) goto La2
        La1:
            return r0
        La2:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.repository.SuperPassRepository$updateSuperPassTable$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
