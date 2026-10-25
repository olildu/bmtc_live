package app.chalo.premiumbus.ui.bulkbookingsuccess;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent", f = "PremiumBusBulkBookingConfirmationComponent.kt", l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, 615, 638, 643}, m = "buildPassInfoUIState", v = 1)
final class PremiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumBusBulkBookingConfirmationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusBulkBookingConfirmationComponent$buildPassInfoUIState$1(PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = premiumBusBulkBookingConfirmationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.H0(null, this);
    }
}
