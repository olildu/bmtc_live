package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent", f = "QRScannerValidationComponent.kt", l = {151, 154, 160, 163, 173, 174, 175, 178, 182, 186}, m = "setupInitialData", v = 1)
final class QRScannerValidationComponent$setupInitialData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QRScannerValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRScannerValidationComponent$setupInitialData$1(QRScannerValidationComponent qRScannerValidationComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qRScannerValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return QRScannerValidationComponent.F0(this.this$0, null, this);
    }
}
