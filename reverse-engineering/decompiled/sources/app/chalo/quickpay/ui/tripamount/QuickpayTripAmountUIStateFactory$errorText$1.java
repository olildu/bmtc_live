package app.chalo.quickpay.ui.tripamount;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory", f = "QuickpayTripAmountUIStateFactory.kt", l = {336, 338}, m = CLConstants.FIELD_ERROR_TEXT, v = 1)
final class QuickpayTripAmountUIStateFactory$errorText$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuickpayTripAmountUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickpayTripAmountUIStateFactory$errorText$1(QuickpayTripAmountUIStateFactory quickpayTripAmountUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = quickpayTripAmountUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, 0L, this);
    }
}
