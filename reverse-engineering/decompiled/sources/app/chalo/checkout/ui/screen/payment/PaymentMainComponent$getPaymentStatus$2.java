package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.data.model.api.response.PaymentStatus;
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
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getPaymentStatus$2", f = "PaymentMainComponent.kt", l = {2173, 2202, 2203, 2204, 2224, 2234, 2235, 2236, 2257, 2266, 2268, 2277}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$getPaymentStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $paymentId;
    final /* synthetic */ String $resolvedOrderId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1533a;

        static {
            int[] iArr = new int[PaymentStatus.values().length];
            try {
                iArr[PaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentStatus.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1533a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$getPaymentStatus$2(PaymentMainComponent paymentMainComponent, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
        this.$resolvedOrderId = str;
        this.$paymentId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMainComponent$getPaymentStatus$2 paymentMainComponent$getPaymentStatus$2 = new PaymentMainComponent$getPaymentStatus$2(this.this$0, this.$resolvedOrderId, this.$paymentId, continuation);
        paymentMainComponent$getPaymentStatus$2.L$0 = obj;
        return paymentMainComponent$getPaymentStatus$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$getPaymentStatus$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x031a  */
    /* JADX WARN: Code duplicated, block: B:109:0x034b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0355  */
    /* JADX WARN: Code duplicated, block: B:114:0x035b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f3 A[PHI: r0 r14
      0x00f3: PHI (r0v16 java.lang.Object) = (r0v5 java.lang.Object), (r0v48 java.lang.Object) binds: [B:18:0x00a6, B:23:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r14v2 kotlinx.coroutines.CoroutineScope) = (r14v1 kotlinx.coroutines.CoroutineScope), (r14v3 kotlinx.coroutines.CoroutineScope) binds: [B:18:0x00a6, B:23:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:29:0x0117  */
    /* JADX WARN: Code duplicated, block: B:30:0x0119  */
    /* JADX WARN: Code duplicated, block: B:31:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x011d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0132 A[PHI: r0
      0x0132: PHI (r0v52 java.lang.Object) = (r0v40 java.lang.Object), (r0v54 java.lang.Object) binds: [B:33:0x012e, B:13:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0149 A[PHI: r0 r1
      0x0149: PHI (r0v55 java.lang.String) = (r0v53 java.lang.String), (r0v58 java.lang.String) binds: [B:36:0x0145, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r1v36 java.lang.Object) = (r1v35 java.lang.Object), (r1v39 java.lang.Object) binds: [B:36:0x0145, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0163  */
    /* JADX WARN: Code duplicated, block: B:43:0x0177  */
    /* JADX WARN: Code duplicated, block: B:45:0x017d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0187  */
    /* JADX WARN: Code duplicated, block: B:49:0x0191  */
    /* JADX WARN: Code duplicated, block: B:55:0x01da  */
    /* JADX WARN: Code duplicated, block: B:56:0x01df  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0209 A[PHI: r0
      0x0209: PHI (r0v14 java.lang.Object) = (r0v6 java.lang.Object), (r0v28 java.lang.Object) binds: [B:17:0x009f, B:61:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x021f A[PHI: r0 r1
      0x021f: PHI (r0v12 java.lang.String) = (r0v8 java.lang.String), (r0v15 java.lang.String) binds: [B:16:0x0094, B:64:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r1v4 java.lang.Object) = (r1v0 java.lang.Object), (r1v9 java.lang.Object) binds: [B:16:0x0094, B:64:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0237  */
    /* JADX WARN: Code duplicated, block: B:71:0x024b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0265  */
    /* JADX WARN: Code duplicated, block: B:74:0x0269  */
    /* JADX WARN: Code duplicated, block: B:76:0x0276  */
    /* JADX WARN: Code duplicated, block: B:78:0x027e  */
    /* JADX WARN: Code duplicated, block: B:85:0x02be  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e4  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0332, code lost:
    
        if (r3 == r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019a, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r0, r21) == r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0290, code lost:
    
        if (r1 == r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d8, code lost:
    
        if (r2 == r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f8, code lost:
    
        if (r2 == r6) goto L105;
     */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType] */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x019a -> B:52:0x019e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$getPaymentStatus$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
