package app.chalo.home.ui.history.factory.mapper;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.factory.mapper.HistoryPassUiStateMapperHelper", f = "HistoryPassUiStateMapperHelper.kt", l = {TypedValues.PositionType.TYPE_CURVE_FIT, 515, 520, 529, 541, 541, 545, 557, 595, 601, 619, 624, 633, 644, 644, 648, 660, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 726, 728, 764, 766, 780, 795}, m = "getExpiredPassesUiStateList", v = 1)
final class HistoryPassUiStateMapperHelper$getExpiredPassesUiStateList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HistoryPassUiStateMapperHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryPassUiStateMapperHelper$getExpiredPassesUiStateList$1(HistoryPassUiStateMapperHelper historyPassUiStateMapperHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = historyPassUiStateMapperHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, this);
    }
}
