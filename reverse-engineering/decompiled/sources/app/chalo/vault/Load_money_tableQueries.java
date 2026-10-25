package app.chalo.vault;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.dd0;
import defpackage.i40;
import defpackage.nn;
import defpackage.qd0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Load_money_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetLoadMoneyDataQuery", "GetListOfLastXNumberOfDistinctLoadMoneyAmountsQuery", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Load_money_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Load_money_tableQueries$GetListOfLastXNumberOfDistinctLoadMoneyAmountsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetListOfLastXNumberOfDistinctLoadMoneyAmountsQuery<T> extends Query<T> {
        public final long b;

        public GetListOfLastXNumberOfDistinctLoadMoneyAmountsQuery(long j, qd0 qd0Var) {
            super(qd0Var);
            this.b = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Load_money_tableQueries.this.f697a.P(-1155491876, "SELECT DISTINCT amount FROM load_money_table ORDER BY transactionTime DESC LIMIT ?", function1, 1, new a(this, 3));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Load_money_tableQueries.this.f697a.h1(new String[]{"load_money_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Load_money_tableQueries.this.f697a.P0(new String[]{"load_money_table"}, listener);
        }

        public final String toString() {
            return "load_money_table.sq:getListOfLastXNumberOfDistinctLoadMoneyAmounts";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Load_money_tableQueries$GetLoadMoneyDataQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetLoadMoneyDataQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Load_money_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLoadMoneyDataQuery(Load_money_tableQueries load_money_tableQueries, String orderId, String transactionId, nn nnVar) {
            super(nnVar);
            Intrinsics.i(orderId, "orderId");
            Intrinsics.i(transactionId, "transactionId");
            this.d = load_money_tableQueries;
            this.b = orderId;
            this.c = transactionId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(482769558, "SELECT load_money_table.orderId, load_money_table.amount, load_money_table.transactionTime, load_money_table.transactionId, load_money_table.status, load_money_table.paymentMode, load_money_table.userId, load_money_table.walletId FROM load_money_table WHERE orderId = ? AND transactionId = ?", function1, 2, new a(this, 4));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"load_money_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"load_money_table"}, listener);
        }

        public final String toString() {
            return "load_money_table.sq:getLoadMoneyData";
        }
    }

    public final Query W(long j) {
        return new GetListOfLastXNumberOfDistinctLoadMoneyAmountsQuery(j, new qd0(21));
    }

    public final Query X(String orderId, String transactionId, Function8 function8) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        return new GetLoadMoneyDataQuery(this, orderId, transactionId, new nn(function8, 2));
    }

    public final QueryResult Y(Load_money_table load_money_table) {
        QueryResult queryResultA0 = this.f697a.A0(-1205422530, "INSERT OR REPLACE INTO load_money_table (orderId, amount, transactionTime, transactionId, status, paymentMode, userId, walletId) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", new dd0(load_money_table, 11));
        T(-1205422530, new qd0(19));
        return queryResultA0;
    }
}
