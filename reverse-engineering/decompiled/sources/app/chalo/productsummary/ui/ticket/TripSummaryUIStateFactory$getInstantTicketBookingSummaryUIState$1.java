package app.chalo.productsummary.ui.ticket;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TripSummaryUIStateFactory", f = "TripSummaryUIStateFactory.kt", l = {1639, 1647, 1654, 1661, 1666, 1677, 1686, 1705, 1710, 1725, 1745}, m = "getInstantTicketBookingSummaryUIState", v = 1)
final class TripSummaryUIStateFactory$getInstantTicketBookingSummaryUIState$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
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
    final /* synthetic */ TripSummaryUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripSummaryUIStateFactory$getInstantTicketBookingSummaryUIState$1(TripSummaryUIStateFactory tripSummaryUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tripSummaryUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(null, null, null, null, 0L, null, null, this);
    }
}
