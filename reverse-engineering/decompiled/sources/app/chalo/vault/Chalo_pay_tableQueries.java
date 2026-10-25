package app.chalo.vault;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.bj;
import defpackage.ch;
import defpackage.i40;
import defpackage.l;
import defpackage.nn;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/vault/Chalo_pay_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetChaloPayDataQuery", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Chalo_pay_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Chalo_pay_tableQueries$GetChaloPayDataQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetChaloPayDataQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Chalo_pay_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetChaloPayDataQuery(Chalo_pay_tableQueries chalo_pay_tableQueries, String orderId, String transactionId, nn nnVar) {
            super(nnVar);
            Intrinsics.i(orderId, "orderId");
            Intrinsics.i(transactionId, "transactionId");
            this.d = chalo_pay_tableQueries;
            this.b = orderId;
            this.c = transactionId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-451578808, "SELECT chalo_pay_table.orderId, chalo_pay_table.amount, chalo_pay_table.transactionId, chalo_pay_table.transactionTime, chalo_pay_table.status, chalo_pay_table.productType, chalo_pay_table.productName, chalo_pay_table.walletId FROM chalo_pay_table\nWHERE orderId = ? AND transactionId = ?", function1, 2, new a(this, 0));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"chalo_pay_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"chalo_pay_table"}, listener);
        }

        public final String toString() {
            return "chalo_pay_table.sq:getChaloPayData";
        }
    }

    public final QueryResult W(Collection orderId) {
        Intrinsics.i(orderId, "orderId");
        String strConcat = "DELETE FROM chalo_pay_table WHERE orderId IN ".concat(BaseTransacterImpl.S(orderId.size()));
        orderId.size();
        QueryResult queryResultA0 = this.f697a.A0(null, strConcat, new l(orderId, 2));
        T(-1872240390, new bj(27));
        return queryResultA0;
    }

    public final Query X(String orderId, String transactionId, Function8 function8) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        return new GetChaloPayDataQuery(this, orderId, transactionId, new nn(function8, 0));
    }

    public final void Y(Chalo_pay_table chalo_pay_table) {
        this.f697a.A0(1712767323, "INSERT OR REPLACE INTO chalo_pay_table (orderId, amount, transactionId, transactionTime, status, productType, productName, walletId) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", new ch(chalo_pay_table, 17));
        T(1712767323, new bj(29));
    }
}
