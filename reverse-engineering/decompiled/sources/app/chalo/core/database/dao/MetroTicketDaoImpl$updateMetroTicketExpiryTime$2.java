package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Metro_ticket_tableQueries;
import defpackage.kb0;
import defpackage.qi0;
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
@DebugMetadata(c = "app.chalo.core.database.dao.MetroTicketDaoImpl$updateMetroTicketExpiryTime$2", f = "MetroTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class MetroTicketDaoImpl$updateMetroTicketExpiryTime$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ long $updatedExpiryTime;
    int label;
    final /* synthetic */ MetroTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroTicketDaoImpl$updateMetroTicketExpiryTime$2(MetroTicketDaoImpl metroTicketDaoImpl, long j, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = metroTicketDaoImpl;
        this.$updatedExpiryTime = j;
        this.$bookingId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetroTicketDaoImpl$updateMetroTicketExpiryTime$2(this.this$0, this.$updatedExpiryTime, this.$bookingId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MetroTicketDaoImpl$updateMetroTicketExpiryTime$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Metro_ticket_tableQueries metro_ticket_tableQueries = this.this$0.f2054a;
        Long l = new Long(this.$updatedExpiryTime);
        String bookingId = this.$bookingId;
        metro_ticket_tableQueries.getClass();
        Intrinsics.i(bookingId, "bookingId");
        QueryResult queryResultA0 = metro_ticket_tableQueries.f697a.A0(-1791508434, "UPDATE metro_ticket_table SET activationExpiryTime = ? WHERE bookingId = ?", new kb0(1, bookingId, l));
        metro_ticket_tableQueries.T(-1791508434, new qi0(9));
        return queryResultA0;
    }
}
