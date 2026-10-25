package app.chalo.multimodalticket.groupticketsummary.ui;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryComponent", f = "GroupTicketSummaryComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "fetchPriceDetails", v = 1)
final class GroupTicketSummaryComponent$fetchPriceDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupTicketSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupTicketSummaryComponent$fetchPriceDetails$1(GroupTicketSummaryComponent groupTicketSummaryComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = groupTicketSummaryComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GroupTicketSummaryComponent.G0(this.this$0, this);
    }
}
