package app.chalo.home.ui.history.factory.mapper.active;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.factory.mapper.active.HistoryActiveTicketsUiStateMapperHelper", f = "HistoryActiveTicketsUiStateMapperHelper.kt", l = {968, 969, 984, 993, 1009, 1019, 1034, 1053, 1065, 1089}, m = "getActiveOndcMetroTicketUiState", v = 1)
final class HistoryActiveTicketsUiStateMapperHelper$getActiveOndcMetroTicketUiState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoryActiveTicketsUiStateMapperHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryActiveTicketsUiStateMapperHelper$getActiveOndcMetroTicketUiState$1(HistoryActiveTicketsUiStateMapperHelper historyActiveTicketsUiStateMapperHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = historyActiveTicketsUiStateMapperHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(null, null, this);
    }
}
