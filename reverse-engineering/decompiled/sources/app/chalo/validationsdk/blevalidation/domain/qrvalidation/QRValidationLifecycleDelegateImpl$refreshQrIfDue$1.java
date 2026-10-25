package app.chalo.validationsdk.blevalidation.domain.qrvalidation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl", f = "QRValidationLifecycleDelegate.kt", l = {285, 297, 305}, m = "refreshQrIfDue", v = 1)
final class QRValidationLifecycleDelegateImpl$refreshQrIfDue$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QRValidationLifecycleDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationLifecycleDelegateImpl$refreshQrIfDue$1(QRValidationLifecycleDelegateImpl qRValidationLifecycleDelegateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qRValidationLifecycleDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return QRValidationLifecycleDelegateImpl.c(this.this$0, null, null, null, 0L, this);
    }
}
