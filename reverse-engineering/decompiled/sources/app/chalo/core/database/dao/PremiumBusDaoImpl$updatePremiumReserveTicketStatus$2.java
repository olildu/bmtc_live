package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Premium_reserve_ticket_tableQueries;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import defpackage.rw0;
import defpackage.yw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusDaoImpl$updatePremiumReserveTicketStatus$2", f = "PremiumBusDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusDaoImpl$updatePremiumReserveTicketStatus$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ PremiumReserveTicketStatus $status;
    int label;
    final /* synthetic */ PremiumBusDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusDaoImpl$updatePremiumReserveTicketStatus$2(PremiumBusDaoImpl premiumBusDaoImpl, PremiumReserveTicketStatus premiumReserveTicketStatus, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusDaoImpl;
        this.$status = premiumReserveTicketStatus;
        this.$bookingId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusDaoImpl$updatePremiumReserveTicketStatus$2(this.this$0, this.$status, this.$bookingId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PremiumBusDaoImpl$updatePremiumReserveTicketStatus$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries = this.this$0.f2069a;
        PremiumReserveTicketStatus ticketStatus = this.$status;
        String bookingId = this.$bookingId;
        premium_reserve_ticket_tableQueries.getClass();
        Intrinsics.i(ticketStatus, "ticketStatus");
        Intrinsics.i(bookingId, "bookingId");
        QueryResult queryResultA0 = premium_reserve_ticket_tableQueries.f697a.A0(-1026812545, "UPDATE premium_reserve_ticket_table SET ticketStatus = ? WHERE bookingId = ?", new rw0(1, premium_reserve_ticket_tableQueries, ticketStatus, bookingId));
        premium_reserve_ticket_tableQueries.T(-1026812545, new yw0(3));
        return queryResultA0;
    }
}
