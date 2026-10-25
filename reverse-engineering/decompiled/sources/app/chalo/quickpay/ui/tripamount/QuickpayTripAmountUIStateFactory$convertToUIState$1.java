package app.chalo.quickpay.ui.tripamount;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory", f = "QuickpayTripAmountUIStateFactory.kt", l = {61, 67, 83, 88, 100, 105, 119, WebSocketProtocol.PAYLOAD_SHORT, TsExtractor.TS_STREAM_TYPE_AC3}, m = "convertToUIState", v = 1)
final class QuickpayTripAmountUIStateFactory$convertToUIState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuickpayTripAmountUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickpayTripAmountUIStateFactory$convertToUIState$1(QuickpayTripAmountUIStateFactory quickpayTripAmountUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = quickpayTripAmountUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
