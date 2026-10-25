package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handlePunchEventReceivedIntent$1", f = "QRValidationComponent.kt", l = {1421, 708, 724, 726, 733}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handlePunchEventReceivedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QRValidationIntent.PunchEventReceivedIntent $intent;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handlePunchEventReceivedIntent$1(QRValidationComponent qRValidationComponent, QRValidationIntent.PunchEventReceivedIntent punchEventReceivedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
        this.$intent = punchEventReceivedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QRValidationComponent$handlePunchEventReceivedIntent$1 qRValidationComponent$handlePunchEventReceivedIntent$1 = new QRValidationComponent$handlePunchEventReceivedIntent$1(this.this$0, this.$intent, continuation);
        qRValidationComponent$handlePunchEventReceivedIntent$1.L$0 = obj;
        return qRValidationComponent$handlePunchEventReceivedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handlePunchEventReceivedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2 A[Catch: all -> 0x012a, TryCatch #2 {all -> 0x012a, blocks: (B:40:0x00e9, B:43:0x00f2, B:45:0x00f8, B:32:0x00aa, B:36:0x00c6), top: B:70:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8 A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #2 {all -> 0x012a, blocks: (B:40:0x00e9, B:43:0x00f2, B:45:0x00f8, B:32:0x00aa, B:36:0x00c6), top: B:70:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114 A[Catch: all -> 0x004a, TryCatch #3 {all -> 0x004a, blocks: (B:18:0x0045, B:49:0x010f, B:51:0x0114, B:59:0x012f), top: B:72:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f A[Catch: all -> 0x004a, PHI: r1 r5 r6 r7 r10
      0x012f: PHI (r1v5 app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig) = 
      (r1v4 app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig)
      (r1v6 app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig)
     binds: [B:58:0x012d, B:50:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r5v3 app.chalo.notification.models.AppNotification$PunchNotification) = 
      (r5v1 app.chalo.notification.models.AppNotification$PunchNotification)
      (r5v4 app.chalo.notification.models.AppNotification$PunchNotification)
     binds: [B:58:0x012d, B:50:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r6v4 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent) = 
      (r6v3 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent)
      (r6v5 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent)
     binds: [B:58:0x012d, B:50:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r7v10 kotlinx.coroutines.sync.Mutex) = (r7v8 kotlinx.coroutines.sync.Mutex), (r7v12 kotlinx.coroutines.sync.Mutex) binds: [B:58:0x012d, B:50:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r10v7 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r10v6 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r10v9 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:58:0x012d, B:50:0x0112] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x004a, blocks: (B:18:0x0045, B:49:0x010f, B:51:0x0114, B:59:0x012f), top: B:72:0x0045 }] */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        if (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent.L0(r6, r5, r10, r1, r14) == r0) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handlePunchEventReceivedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
