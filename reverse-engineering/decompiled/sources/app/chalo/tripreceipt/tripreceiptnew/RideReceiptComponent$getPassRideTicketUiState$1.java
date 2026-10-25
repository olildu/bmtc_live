package app.chalo.tripreceipt.tripreceiptnew;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent", f = "RideReceiptComponent.kt", l = {495, TypedValues.PositionType.TYPE_PERCENT_X, TypedValues.PositionType.TYPE_POSITION_TYPE, InputDeviceCompat.SOURCE_DPAD, 523, 545, 572, 669, 680}, m = "getPassRideTicketUiState", v = 1)
final class RideReceiptComponent$getPassRideTicketUiState$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RideReceiptComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideReceiptComponent$getPassRideTicketUiState$1(RideReceiptComponent rideReceiptComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rideReceiptComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.G0(null, null, null, null, this);
    }
}
