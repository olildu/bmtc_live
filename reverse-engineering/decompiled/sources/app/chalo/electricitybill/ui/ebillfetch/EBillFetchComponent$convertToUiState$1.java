package app.chalo.electricitybill.ui.ebillfetch;

import androidx.media3.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent", f = "EBillFetchComponent.kt", l = {230, 234, PsExtractor.VIDEO_STREAM_MASK, 248, 275, 284, 292, 293, 294, 295, 306, 307, 314, 315}, m = "convertToUiState", v = 1)
final class EBillFetchComponent$convertToUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
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
    final /* synthetic */ EBillFetchComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBillFetchComponent$convertToUiState$1(EBillFetchComponent eBillFetchComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eBillFetchComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.p0(null, this);
    }
}
