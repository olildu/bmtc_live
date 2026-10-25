package app.chalo.tripreceipt.tripreceiptnew;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent", f = "RideReceiptComponent.kt", l = {105, 102, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 122, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 137}, m = "convertToUiState", v = 1)
final class RideReceiptComponent$convertToUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RideReceiptComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideReceiptComponent$convertToUiState$1(RideReceiptComponent rideReceiptComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rideReceiptComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.p0(null, this);
    }
}
