package app.chalo.home.ui.history.factory.mapper.active;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.factory.mapper.active.HistoryActiveTicketsUiStateMapperHelper", f = "HistoryActiveTicketsUiStateMapperHelper.kt", l = {1572, 1573, 1577, 1597, 1599, 1634, 1636, 1651}, m = "getScheduledUiState", v = 1)
final class HistoryActiveTicketsUiStateMapperHelper$getScheduledUiState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoryActiveTicketsUiStateMapperHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryActiveTicketsUiStateMapperHelper$getScheduledUiState$1(HistoryActiveTicketsUiStateMapperHelper historyActiveTicketsUiStateMapperHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = historyActiveTicketsUiStateMapperHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(null, null, null, null, null, this);
    }
}
