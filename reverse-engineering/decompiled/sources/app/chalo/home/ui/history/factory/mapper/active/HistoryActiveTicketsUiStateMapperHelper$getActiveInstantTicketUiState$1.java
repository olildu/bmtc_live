package app.chalo.home.ui.history.factory.mapper.active;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.factory.mapper.active.HistoryActiveTicketsUiStateMapperHelper", f = "HistoryActiveTicketsUiStateMapperHelper.kt", l = {483, 496, TypedValues.PositionType.TYPE_PERCENT_X, 522, 533, 549, 560, 574, 587, 613, 669}, m = "getActiveInstantTicketUiState", v = 1)
final class HistoryActiveTicketsUiStateMapperHelper$getActiveInstantTicketUiState$1 extends ContinuationImpl {
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
    public HistoryActiveTicketsUiStateMapperHelper$getActiveInstantTicketUiState$1(HistoryActiveTicketsUiStateMapperHelper historyActiveTicketsUiStateMapperHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = historyActiveTicketsUiStateMapperHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, this);
    }
}
