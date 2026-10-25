package app.chalo.usecase;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase", f = "InitiateProductHistorySyncCallUseCase.kt", l = {449, 450, 453, 456, 457, 465, 466}, m = "updateSingleJourneyTicketData", v = 1)
final class InitiateProductHistorySyncCallUseCase$updateSingleJourneyTicketData$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateProductHistorySyncCallUseCase$updateSingleJourneyTicketData$1(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = initiateProductHistorySyncCallUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return InitiateProductHistorySyncCallUseCase.g(this.this$0, null, null, this);
    }
}
