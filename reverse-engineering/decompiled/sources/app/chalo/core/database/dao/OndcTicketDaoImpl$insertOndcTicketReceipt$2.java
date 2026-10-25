package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Ondc_ticket_receipt_table;
import app.chalo.core.Ondc_ticket_receipt_tableQueries;
import app.chalo.models.ondc.OndcTicketReceiptEntity;
import defpackage.ej0;
import defpackage.ln0;
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
@DebugMetadata(c = "app.chalo.core.database.dao.OndcTicketDaoImpl$insertOndcTicketReceipt$2", f = "OndcTicketDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class OndcTicketDaoImpl$insertOndcTicketReceipt$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ OndcTicketReceiptEntity $ondcTicketReceiptEntity;
    int label;
    final /* synthetic */ OndcTicketDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OndcTicketDaoImpl$insertOndcTicketReceipt$2(OndcTicketDaoImpl ondcTicketDaoImpl, OndcTicketReceiptEntity ondcTicketReceiptEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = ondcTicketDaoImpl;
        this.$ondcTicketReceiptEntity = ondcTicketReceiptEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OndcTicketDaoImpl$insertOndcTicketReceipt$2(this.this$0, this.$ondcTicketReceiptEntity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((OndcTicketDaoImpl$insertOndcTicketReceipt$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Ondc_ticket_receipt_tableQueries ondc_ticket_receipt_tableQueries = this.this$0.b;
        OndcTicketReceiptEntity ondcTicketReceiptEntity = this.$ondcTicketReceiptEntity;
        Intrinsics.i(ondcTicketReceiptEntity, "<this>");
        Ondc_ticket_receipt_table ondc_ticket_receipt_table = new Ondc_ticket_receipt_table(ondcTicketReceiptEntity.f5631a, ondcTicketReceiptEntity.b, ondcTicketReceiptEntity.c, ondcTicketReceiptEntity.d, ondcTicketReceiptEntity.e, ondcTicketReceiptEntity.f, ondcTicketReceiptEntity.g, ondcTicketReceiptEntity.h, ondcTicketReceiptEntity.i, ondcTicketReceiptEntity.j, ondcTicketReceiptEntity.k, ondcTicketReceiptEntity.l, ondcTicketReceiptEntity.m);
        ondc_ticket_receipt_tableQueries.getClass();
        QueryResult queryResultA0 = ondc_ticket_receipt_tableQueries.f697a.A0(2014749521, "INSERT OR REPLACE INTO ondc_ticket_receipt_table (bookingId, punchTime, amount, vehicleNo, conductorId, startStopName, endStopName, endStopId, routeName, productType, productSubType, userId, passengerDetails) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ej0(15, ondc_ticket_receipt_table, ondc_ticket_receipt_tableQueries));
        ondc_ticket_receipt_tableQueries.T(2014749521, new ln0(27));
        return queryResultA0;
    }
}
