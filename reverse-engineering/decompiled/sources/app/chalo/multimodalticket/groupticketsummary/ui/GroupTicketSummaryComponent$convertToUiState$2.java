package app.chalo.multimodalticket.groupticketsummary.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class GroupTicketSummaryComponent$convertToUiState$2 extends FunctionReferenceImpl implements Function1<GroupTicketSummaryViewIntent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GroupTicketSummaryViewIntent p0 = (GroupTicketSummaryViewIntent) obj;
        Intrinsics.i(p0, "p0");
        ((GroupTicketSummaryComponent) this.receiver).H0(p0);
        return Unit.f17538a;
    }
}
