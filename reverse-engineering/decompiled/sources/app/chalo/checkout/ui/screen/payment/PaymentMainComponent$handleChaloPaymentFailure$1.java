package app.chalo.checkout.ui.screen.payment;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent", f = "PaymentMainComponent.kt", l = {3444, 3445, 3443, 3450, 3451, 3449, 3457, 3458, 3456, 3464, 3465, 3463, 3472, 3473, 3471, 3480, 3481, 3479, 3500, 3501, 3499}, m = "handleChaloPaymentFailure", v = 1)
final class PaymentMainComponent$handleChaloPaymentFailure$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handleChaloPaymentFailure$1(PaymentMainComponent paymentMainComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j1(null, this);
    }
}
