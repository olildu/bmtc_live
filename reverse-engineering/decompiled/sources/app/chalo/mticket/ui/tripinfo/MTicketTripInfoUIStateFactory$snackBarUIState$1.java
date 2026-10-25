package app.chalo.mticket.ui.tripinfo;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoUIStateFactory", f = "MTicketTripInfoUIStateFactory.kt", l = {114, 121, 128, TsExtractor.TS_STREAM_TYPE_AC3, 137, TsExtractor.TS_STREAM_TYPE_DTS}, m = "snackBarUIState", v = 1)
final class MTicketTripInfoUIStateFactory$snackBarUIState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MTicketTripInfoUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoUIStateFactory$snackBarUIState$1(MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mTicketTripInfoUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, this);
    }
}
