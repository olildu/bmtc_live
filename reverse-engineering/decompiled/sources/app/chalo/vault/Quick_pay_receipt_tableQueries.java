package app.chalo.vault;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.i40;
import defpackage.kz0;
import defpackage.vw0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/vault/Quick_pay_receipt_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetQuickPayReceiptQuery", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Quick_pay_receipt_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Quick_pay_receipt_tableQueries$GetQuickPayReceiptQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetQuickPayReceiptQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Quick_pay_receipt_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetQuickPayReceiptQuery(Quick_pay_receipt_tableQueries quick_pay_receipt_tableQueries, String transactionId, vw0 vw0Var) {
            super(vw0Var);
            Intrinsics.i(transactionId, "transactionId");
            this.c = quick_pay_receipt_tableQueries;
            this.b = transactionId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1427340177, "SELECT quick_pay_receipt_table.transactionId, quick_pay_receipt_table.orderId, quick_pay_receipt_table.punchTime, quick_pay_receipt_table.amount, quick_pay_receipt_table.vehicleNo, quick_pay_receipt_table.conductorId, quick_pay_receipt_table.startStop, quick_pay_receipt_table.endStop, quick_pay_receipt_table.routeName, quick_pay_receipt_table.endStopId, quick_pay_receipt_table.productReceiptPassengerDetails, quick_pay_receipt_table.via, quick_pay_receipt_table.routeNamingScheme, quick_pay_receipt_table.depotName, quick_pay_receipt_table.etimGeneratedTicketId, quick_pay_receipt_table.scheduleNumber, quick_pay_receipt_table.routeServiceType, quick_pay_receipt_table.driverId, quick_pay_receipt_table.waybillNo, quick_pay_receipt_table.etimVersion, quick_pay_receipt_table.receiptFareBreakup FROM quick_pay_receipt_table WHERE transactionId = ?", function1, 1, new a(this, 5));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"quick_pay_receipt_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"quick_pay_receipt_table"}, listener);
        }

        public final String toString() {
            return "quick_pay_receipt_table.sq:getQuickPayReceipt";
        }
    }

    public final Query W(String transactionId, Function21 function21) {
        Intrinsics.i(transactionId, "transactionId");
        return new GetQuickPayReceiptQuery(this, transactionId, new vw0(function21, 12));
    }

    public final QueryResult X(Quick_pay_receipt_table quick_pay_receipt_table) {
        QueryResult queryResultA0 = this.f697a.A0(1350081432, "INSERT OR REPLACE INTO quick_pay_receipt_table (transactionId, orderId, punchTime, amount, vehicleNo, conductorId, startStop, endStop, routeName, endStopId, productReceiptPassengerDetails, via, routeNamingScheme, depotName, etimGeneratedTicketId, scheduleNumber, routeServiceType, driverId, waybillNo, etimVersion, receiptFareBreakup) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new vw0(quick_pay_receipt_table, 13));
        T(1350081432, new kz0(16));
        return queryResultA0;
    }
}
