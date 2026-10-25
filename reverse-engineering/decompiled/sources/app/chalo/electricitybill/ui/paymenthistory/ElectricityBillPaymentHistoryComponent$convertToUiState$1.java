package app.chalo.electricitybill.ui.paymenthistory;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent", f = "ElectricityBillPaymentHistoryComponent.kt", l = {132, 140, 163, 164, TsExtractor.TS_STREAM_TYPE_AC4}, m = "convertToUiState", v = 1)
final class ElectricityBillPaymentHistoryComponent$convertToUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ElectricityBillPaymentHistoryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectricityBillPaymentHistoryComponent$convertToUiState$1(ElectricityBillPaymentHistoryComponent electricityBillPaymentHistoryComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = electricityBillPaymentHistoryComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.p0(null, this);
    }
}
