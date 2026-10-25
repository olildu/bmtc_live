package app.chalo.checkout.ui.screen.postpayment;

import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent", f = "CheckoutPostPaymentComponent.kt", l = {1201, 1214, 1218, 1227, 1244, 1251, 1256, 1260, 1261, 1274, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD}, m = "handleMultiModalGroupTicketFlow", v = 1)
final class CheckoutPostPaymentComponent$handleMultiModalGroupTicketFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutPostPaymentComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutPostPaymentComponent$handleMultiModalGroupTicketFlow$1(CheckoutPostPaymentComponent checkoutPostPaymentComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = checkoutPostPaymentComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.N0(this);
    }
}
