package app.chalo.sos;

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
@DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleSendSOSMessage$2", f = "SosScreenComponent.kt", l = {226, 227, 236, 234, 243, 244}, m = "invokeSuspend", v = 1)
final class SosScreenComponent$handleSendSOSMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SosScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SosScreenComponent$handleSendSOSMessage$2(SosScreenComponent sosScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sosScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SosScreenComponent$handleSendSOSMessage$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SosScreenComponent$handleSendSOSMessage$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065 A[PHI: r1 r10
      0x0065: PHI (r1v4 java.lang.Long) = (r1v3 java.lang.Long), (r1v7 java.lang.Long) binds: [B:16:0x0061, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v0 java.lang.Object) binds: [B:16:0x0061, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2 A[PHI: r1 r3 r5 r10
      0x00a2: PHI (r1v8 java.util.Map) = (r1v5 java.util.Map), (r1v10 java.util.Map) binds: [B:27:0x009f, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r3v4 long) = (r3v2 long), (r3v5 long) binds: [B:27:0x009f, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r5v3 app.chalo.usecase.RaiseSOSUseCase) = (r5v0 app.chalo.usecase.RaiseSOSUseCase), (r5v5 app.chalo.usecase.RaiseSOSUseCase) binds: [B:27:0x009f, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r10v18 java.lang.Object) = (r10v16 java.lang.Object), (r10v0 java.lang.Object) binds: [B:27:0x009f, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[PHI: r3 r10
      0x00b9: PHI (r3v6 long) = (r3v4 long), (r3v8 long) binds: [B:30:0x00b6, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r10v22 java.lang.Object) = (r10v21 java.lang.Object), (r10v0 java.lang.Object) binds: [B:30:0x00b6, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00df  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3 A[PHI: r3 r10
      0x00f3: PHI (r3v9 long) = (r3v6 long), (r3v12 long) binds: [B:39:0x00f0, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r10v33 java.lang.Object) = (r10v28 java.lang.Object), (r10v0 java.lang.Object) binds: [B:39:0x00f0, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
    
        if (r10.i(r3, r9) == r0) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.sos.SosScreenComponent$handleSendSOSMessage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
