package app.chalo.vault;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.QueryKt;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.a01;
import defpackage.b01;
import defpackage.c01;
import defpackage.eu0;
import defpackage.i40;
import defpackage.kz0;
import defpackage.l;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/vault/Quick_pay_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetQuickPayForOrderIdAndTransactionIdQuery", "GetQuickPayForTransactionIdQuery", "GetQuickPaysForOrderIdQuery", "GetQuickPaysForOrderIdsQuery", "GetActiveQuickPaysQuery", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Quick_pay_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Quick_pay_tableQueries$GetActiveQuickPaysQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetActiveQuickPaysQuery<T> extends Query<T> {
        public final long b;

        public GetActiveQuickPaysQuery(long j, b01 b01Var) {
            super(b01Var);
            this.b = j;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Quick_pay_tableQueries.this.f697a.P(798153387, "SELECT quick_pay_table.status, quick_pay_table.transactionId, quick_pay_table.paymentMode, quick_pay_table.qrCode, quick_pay_table.soundTone, quick_pay_table.expiryTime, quick_pay_table.activationDuration, quick_pay_table.amount, quick_pay_table.orderId, quick_pay_table.punchTime, quick_pay_table.walletId FROM quick_pay_table\nWHERE expiryTime > ? AND punchTime IS NULL", function1, 1, new a(this, 6));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Quick_pay_tableQueries.this.f697a.h1(new String[]{"quick_pay_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Quick_pay_tableQueries.this.f697a.P0(new String[]{"quick_pay_table"}, listener);
        }

        public final String toString() {
            return "quick_pay_table.sq:getActiveQuickPays";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Quick_pay_tableQueries$GetQuickPayForOrderIdAndTransactionIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetQuickPayForOrderIdAndTransactionIdQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Quick_pay_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetQuickPayForOrderIdAndTransactionIdQuery(Quick_pay_tableQueries quick_pay_tableQueries, String orderId, String transactionId, a01 a01Var) {
            super(a01Var);
            Intrinsics.i(orderId, "orderId");
            Intrinsics.i(transactionId, "transactionId");
            this.d = quick_pay_tableQueries;
            this.b = orderId;
            this.c = transactionId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1808865444, "SELECT quick_pay_table.status, quick_pay_table.transactionId, quick_pay_table.paymentMode, quick_pay_table.qrCode, quick_pay_table.soundTone, quick_pay_table.expiryTime, quick_pay_table.activationDuration, quick_pay_table.amount, quick_pay_table.orderId, quick_pay_table.punchTime, quick_pay_table.walletId FROM quick_pay_table WHERE orderId = ? AND transactionId = ?", function1, 2, new a(this, 7));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"quick_pay_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"quick_pay_table"}, listener);
        }

        public final String toString() {
            return "quick_pay_table.sq:getQuickPayForOrderIdAndTransactionId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Quick_pay_tableQueries$GetQuickPayForTransactionIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetQuickPayForTransactionIdQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Quick_pay_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetQuickPayForTransactionIdQuery(Quick_pay_tableQueries quick_pay_tableQueries, String transactionId, b01 b01Var) {
            super(b01Var);
            Intrinsics.i(transactionId, "transactionId");
            this.c = quick_pay_tableQueries;
            this.b = transactionId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-812631726, "SELECT quick_pay_table.status, quick_pay_table.transactionId, quick_pay_table.paymentMode, quick_pay_table.qrCode, quick_pay_table.soundTone, quick_pay_table.expiryTime, quick_pay_table.activationDuration, quick_pay_table.amount, quick_pay_table.orderId, quick_pay_table.punchTime, quick_pay_table.walletId FROM quick_pay_table WHERE transactionId = ?", function1, 1, new a(this, 8));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"quick_pay_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"quick_pay_table"}, listener);
        }

        public final String toString() {
            return "quick_pay_table.sq:getQuickPayForTransactionId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Quick_pay_tableQueries$GetQuickPaysForOrderIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetQuickPaysForOrderIdQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Quick_pay_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetQuickPaysForOrderIdQuery(Quick_pay_tableQueries quick_pay_tableQueries, String orderId, a01 a01Var) {
            super(a01Var);
            Intrinsics.i(orderId, "orderId");
            this.c = quick_pay_tableQueries;
            this.b = orderId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(744011953, "SELECT quick_pay_table.status, quick_pay_table.transactionId, quick_pay_table.paymentMode, quick_pay_table.qrCode, quick_pay_table.soundTone, quick_pay_table.expiryTime, quick_pay_table.activationDuration, quick_pay_table.amount, quick_pay_table.orderId, quick_pay_table.punchTime, quick_pay_table.walletId FROM quick_pay_table WHERE orderId = ?", function1, 1, new a(this, 9));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"quick_pay_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"quick_pay_table"}, listener);
        }

        public final String toString() {
            return "quick_pay_table.sq:getQuickPaysForOrderId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Quick_pay_tableQueries$GetQuickPaysForOrderIdsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetQuickPaysForOrderIdsQuery<T> extends Query<T> {
        public final Collection b;
        public final /* synthetic */ Quick_pay_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetQuickPaysForOrderIdsQuery(Quick_pay_tableQueries quick_pay_tableQueries, Collection orderId, b01 b01Var) {
            super(b01Var);
            Intrinsics.i(orderId, "orderId");
            this.c = quick_pay_tableQueries;
            this.b = orderId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.c.f697a.P(null, "SELECT quick_pay_table.status, quick_pay_table.transactionId, quick_pay_table.paymentMode, quick_pay_table.qrCode, quick_pay_table.soundTone, quick_pay_table.expiryTime, quick_pay_table.activationDuration, quick_pay_table.amount, quick_pay_table.orderId, quick_pay_table.punchTime, quick_pay_table.walletId FROM quick_pay_table WHERE orderId IN ".concat(BaseTransacterImpl.S(collection.size())), function1, collection.size(), new a(this, 10));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"quick_pay_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"quick_pay_table"}, listener);
        }

        public final String toString() {
            return "quick_pay_table.sq:getQuickPaysForOrderIds";
        }
    }

    public final QueryResult W(String orderId) {
        Intrinsics.i(orderId, "orderId");
        QueryResult queryResultA0 = this.f697a.A0(2136878773, "DELETE FROM quick_pay_table WHERE orderId = ?", new eu0(orderId, 17));
        T(2136878773, new kz0(19));
        return queryResultA0;
    }

    public final QueryResult X(Collection orderId) {
        Intrinsics.i(orderId, "orderId");
        String strY0 = StringsKt.y0("\n        |DELETE FROM quick_pay_table\n        |WHERE orderId IN " + BaseTransacterImpl.S(orderId.size()) + "\n        ");
        orderId.size();
        QueryResult queryResultA0 = this.f697a.A0(null, strY0, new l(orderId, 6));
        T(701162810, new kz0(20));
        return queryResultA0;
    }

    public final Query Y(long j, Function11 function11) {
        return new GetActiveQuickPaysQuery(j, new b01(function11, 2));
    }

    public final Query Z(Function11 function11) {
        return QueryKt.a(-537699426, new String[]{"quick_pay_table"}, this.f697a, "quick_pay_table.sq", "getAllQuickPays", "SELECT quick_pay_table.status, quick_pay_table.transactionId, quick_pay_table.paymentMode, quick_pay_table.qrCode, quick_pay_table.soundTone, quick_pay_table.expiryTime, quick_pay_table.activationDuration, quick_pay_table.amount, quick_pay_table.orderId, quick_pay_table.punchTime, quick_pay_table.walletId FROM quick_pay_table", new a01(function11, 0));
    }

    public final Query a0(String orderId, String transactionId, Function11 function11) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        return new GetQuickPayForOrderIdAndTransactionIdQuery(this, orderId, transactionId, new a01(function11, 2));
    }

    public final Query b0(String transactionId, Function11 function11) {
        Intrinsics.i(transactionId, "transactionId");
        return new GetQuickPayForTransactionIdQuery(this, transactionId, new b01(function11, 0));
    }

    public final Query c0(String orderId, Function11 function11) {
        Intrinsics.i(orderId, "orderId");
        return new GetQuickPaysForOrderIdQuery(this, orderId, new a01(function11, 1));
    }

    public final Query d0(Collection orderId, Function11 function11) {
        Intrinsics.i(orderId, "orderId");
        return new GetQuickPaysForOrderIdsQuery(this, orderId, new b01(function11, 1));
    }

    public final QueryResult e0(Quick_pay_table quick_pay_table) {
        QueryResult queryResultA0 = this.f697a.A0(1218018755, "INSERT OR REPLACE INTO quick_pay_table (status, transactionId, paymentMode, qrCode, soundTone, expiryTime, activationDuration, amount, orderId, punchTime, walletId) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new c01(quick_pay_table, 1));
        T(1218018755, new kz0(26));
        return queryResultA0;
    }

    public final void f0(Quick_pay_table quick_pay_table) {
        this.f697a.A0(182572315, "INSERT OR REPLACE INTO quick_pay_table (status, transactionId, paymentMode, qrCode, soundTone, expiryTime, activationDuration, amount, orderId, punchTime, walletId) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new c01(quick_pay_table, 0));
        T(182572315, new kz0(23));
    }
}
