package app.chalo.vault;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.a01;
import defpackage.hp1;
import defpackage.i40;
import defpackage.mn1;
import defpackage.un1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/vault/Wallet_transaction_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllWalletTransactionsQuery", "GetAllWalletTransactionsForWalletIdQuery", "GetWalletTransactionQuery", "GetAllOrderIdsForUserQuery", "GetOrderIdsForUserAndTypeForWalletQuery", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Wallet_transaction_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Wallet_transaction_tableQueries$GetAllOrderIdsForUserQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllOrderIdsForUserQuery<T> extends Query<T> {
        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            throw null;
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            throw null;
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            throw null;
        }

        public final String toString() {
            return "wallet_transaction_table.sq:getAllOrderIdsForUser";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Wallet_transaction_tableQueries$GetAllWalletTransactionsForWalletIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllWalletTransactionsForWalletIdQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Wallet_transaction_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllWalletTransactionsForWalletIdQuery(Wallet_transaction_tableQueries wallet_transaction_tableQueries, String userId, String walletId, a01 a01Var) {
            super(a01Var);
            Intrinsics.i(userId, "userId");
            Intrinsics.i(walletId, "walletId");
            this.d = wallet_transaction_tableQueries;
            this.b = userId;
            this.c = walletId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-1511249269, "SELECT wallet_transaction_table.transactionId, wallet_transaction_table.transactionType, wallet_transaction_table.walletId, wallet_transaction_table.userId, wallet_transaction_table.orderId, wallet_transaction_table.amount, wallet_transaction_table.transactionStatus, wallet_transaction_table.transactionTime FROM wallet_transaction_table\nWHERE userId = ?\nAND walletId = ?", function1, 2, new a(this, 14));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"wallet_transaction_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"wallet_transaction_table"}, listener);
        }

        public final String toString() {
            return "wallet_transaction_table.sq:getAllWalletTransactionsForWalletId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Wallet_transaction_tableQueries$GetAllWalletTransactionsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllWalletTransactionsQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Wallet_transaction_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllWalletTransactionsQuery(Wallet_transaction_tableQueries wallet_transaction_tableQueries, String userId, a01 a01Var) {
            super(a01Var);
            Intrinsics.i(userId, "userId");
            this.c = wallet_transaction_tableQueries;
            this.b = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(1378397426, "SELECT wallet_transaction_table.transactionId, wallet_transaction_table.transactionType, wallet_transaction_table.walletId, wallet_transaction_table.userId, wallet_transaction_table.orderId, wallet_transaction_table.amount, wallet_transaction_table.transactionStatus, wallet_transaction_table.transactionTime FROM wallet_transaction_table\nWHERE userId = ?", function1, 1, new a(this, 15));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"wallet_transaction_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"wallet_transaction_table"}, listener);
        }

        public final String toString() {
            return "wallet_transaction_table.sq:getAllWalletTransactions";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Wallet_transaction_tableQueries$GetOrderIdsForUserAndTypeForWalletQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetOrderIdsForUserAndTypeForWalletQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final /* synthetic */ Wallet_transaction_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOrderIdsForUserAndTypeForWalletQuery(Wallet_transaction_tableQueries wallet_transaction_tableQueries, String userId, String str, String walletId, hp1 hp1Var) {
            super(hp1Var);
            Intrinsics.i(userId, "userId");
            Intrinsics.i(walletId, "walletId");
            this.e = wallet_transaction_tableQueries;
            this.b = userId;
            this.c = str;
            this.d = walletId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.e.f697a.P(415624606, "SELECT DISTINCT orderId FROM wallet_transaction_table\nWHERE userId = ?\nAND transactionType = ?\nAND walletId = ?", function1, 3, new a(this, 16));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"wallet_transaction_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"wallet_transaction_table"}, listener);
        }

        public final String toString() {
            return "wallet_transaction_table.sq:getOrderIdsForUserAndTypeForWallet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Wallet_transaction_tableQueries$GetWalletTransactionQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetWalletTransactionQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Wallet_transaction_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetWalletTransactionQuery(Wallet_transaction_tableQueries wallet_transaction_tableQueries, String userId, String transactionId, a01 a01Var) {
            super(a01Var);
            Intrinsics.i(userId, "userId");
            Intrinsics.i(transactionId, "transactionId");
            this.d = wallet_transaction_tableQueries;
            this.b = userId;
            this.c = transactionId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1228641320, "SELECT wallet_transaction_table.transactionId, wallet_transaction_table.transactionType, wallet_transaction_table.walletId, wallet_transaction_table.userId, wallet_transaction_table.orderId, wallet_transaction_table.amount, wallet_transaction_table.transactionStatus, wallet_transaction_table.transactionTime FROM wallet_transaction_table WHERE userId = ? AND transactionId = ?", function1, 2, new a(this, 17));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"wallet_transaction_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"wallet_transaction_table"}, listener);
        }

        public final String toString() {
            return "wallet_transaction_table.sq:getWalletTransaction";
        }
    }

    public final QueryResult W(String orderId) {
        Intrinsics.i(orderId, "orderId");
        QueryResult queryResultA0 = this.f697a.A0(1184617569, "DELETE FROM wallet_transaction_table WHERE orderId = ?", new mn1(orderId, 8));
        T(1184617569, new hp1(18));
        return queryResultA0;
    }

    public final Query X(String userId, Function8 function8) {
        Intrinsics.i(userId, "userId");
        return new GetAllWalletTransactionsQuery(this, userId, new a01(function8, 6));
    }

    public final Query Y(String userId, String walletId, Function8 function8) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        return new GetAllWalletTransactionsForWalletIdQuery(this, userId, walletId, new a01(function8, 5));
    }

    public final Query Z(String userId, String str, String walletId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        return new GetOrderIdsForUserAndTypeForWalletQuery(this, userId, str, walletId, new hp1(14));
    }

    public final Query a0(String userId, String transactionId, Function8 function8) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(transactionId, "transactionId");
        return new GetWalletTransactionQuery(this, userId, transactionId, new a01(function8, 4));
    }

    public final QueryResult b0(Wallet_transaction_table wallet_transaction_table) {
        QueryResult queryResultA0 = this.f697a.A0(-1246915309, "INSERT OR REPLACE INTO wallet_transaction_table (transactionId, transactionType, walletId, userId, orderId, amount, transactionStatus, transactionTime) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", new un1(wallet_transaction_table, 7));
        T(-1246915309, new hp1(19));
        return queryResultA0;
    }
}
