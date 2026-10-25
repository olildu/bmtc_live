package app.chalo.validationsdk.vehiclebasedvalidation.ui.compose;

import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewIntent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class DirectValidationMainScreenKt$DirectValidationMainScreen$1$1 extends FunctionReferenceImpl implements Function1<QRScannerViewIntent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QRScannerViewIntent p0 = (QRScannerViewIntent) obj;
        Intrinsics.i(p0, "p0");
        ((QRScannerValidationComponent) this.receiver).G0(p0);
        return Unit.f17538a;
    }
}
