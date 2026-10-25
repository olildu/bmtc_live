package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Premium_reserve_ticket_receipt_table;
import app.chalo.core.Premium_reserve_ticket_receipt_tableQueries;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketReceiptEntity;
import defpackage.lu0;
import defpackage.zv0;
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
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusDaoImpl$insertPremiumReserveTicketReceipt$2", f = "PremiumBusDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusDaoImpl$insertPremiumReserveTicketReceipt$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ PremiumReserveTicketReceiptEntity $receipt;
    int label;
    final /* synthetic */ PremiumBusDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusDaoImpl$insertPremiumReserveTicketReceipt$2(PremiumBusDaoImpl premiumBusDaoImpl, PremiumReserveTicketReceiptEntity premiumReserveTicketReceiptEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusDaoImpl;
        this.$receipt = premiumReserveTicketReceiptEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusDaoImpl$insertPremiumReserveTicketReceipt$2(this.this$0, this.$receipt, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PremiumBusDaoImpl$insertPremiumReserveTicketReceipt$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Premium_reserve_ticket_receipt_tableQueries premium_reserve_ticket_receipt_tableQueries = this.this$0.b;
        PremiumReserveTicketReceiptEntity premiumReserveTicketReceiptEntity = this.$receipt;
        Intrinsics.i(premiumReserveTicketReceiptEntity, "<this>");
        Premium_reserve_ticket_receipt_table premium_reserve_ticket_receipt_table = new Premium_reserve_ticket_receipt_table(premiumReserveTicketReceiptEntity.f7138a, premiumReserveTicketReceiptEntity.b, premiumReserveTicketReceiptEntity.c, premiumReserveTicketReceiptEntity.d, premiumReserveTicketReceiptEntity.e, premiumReserveTicketReceiptEntity.f, premiumReserveTicketReceiptEntity.g, premiumReserveTicketReceiptEntity.h, premiumReserveTicketReceiptEntity.i, premiumReserveTicketReceiptEntity.j, premiumReserveTicketReceiptEntity.k, premiumReserveTicketReceiptEntity.l, premiumReserveTicketReceiptEntity.m);
        premium_reserve_ticket_receipt_tableQueries.getClass();
        QueryResult queryResultA0 = premium_reserve_ticket_receipt_tableQueries.f697a.A0(683366850, "INSERT OR REPLACE INTO premium_reserve_ticket_receipt_table (bookingId, punchTime, amount, vehicleNo, conductorId, startStopName, endStopName, routeName, productType, productSubType, userId, productReceiptPassengerDetails, refundInfo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new lu0(14, premium_reserve_ticket_receipt_table, premium_reserve_ticket_receipt_tableQueries));
        premium_reserve_ticket_receipt_tableQueries.T(683366850, new zv0(28));
        return queryResultA0;
    }
}
