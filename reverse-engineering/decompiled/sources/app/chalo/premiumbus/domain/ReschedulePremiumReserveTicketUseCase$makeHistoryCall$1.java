package app.chalo.premiumbus.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase", f = "ReschedulePremiumReserveTicketUseCase.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 65}, m = "makeHistoryCall", v = 1)
final class ReschedulePremiumReserveTicketUseCase$makeHistoryCall$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReschedulePremiumReserveTicketUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReschedulePremiumReserveTicketUseCase$makeHistoryCall$1(ReschedulePremiumReserveTicketUseCase reschedulePremiumReserveTicketUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = reschedulePremiumReserveTicketUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
