package app.chalo.home.ui.history.factory.mapper.expired;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.factory.mapper.expired.HistoryExpiredTicketsUiStateMapperHelper", f = "HistoryExpiredTicketsUiStateMapperHelper.kt", l = {1892, 1905, 1923, 1941, 1957, 1975}, m = "getChaloBusTicketStatusUiState", v = 1)
final class HistoryExpiredTicketsUiStateMapperHelper$getChaloBusTicketStatusUiState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoryExpiredTicketsUiStateMapperHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryExpiredTicketsUiStateMapperHelper$getChaloBusTicketStatusUiState$1(HistoryExpiredTicketsUiStateMapperHelper historyExpiredTicketsUiStateMapperHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = historyExpiredTicketsUiStateMapperHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
