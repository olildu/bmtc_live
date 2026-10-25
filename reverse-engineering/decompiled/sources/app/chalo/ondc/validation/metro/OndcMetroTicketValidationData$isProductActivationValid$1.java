package app.chalo.ondc.validation.metro;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ondc.validation.metro.OndcMetroTicketValidationData", f = "OndcMetroTicketValidationData.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS_HD}, m = "isProductActivationValid", v = 1)
final class OndcMetroTicketValidationData$isProductActivationValid$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OndcMetroTicketValidationData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OndcMetroTicketValidationData$isProductActivationValid$1(OndcMetroTicketValidationData ondcMetroTicketValidationData, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ondcMetroTicketValidationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(this);
    }
}
