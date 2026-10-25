package app.chalo.vault;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.a01;
import defpackage.hp1;
import defpackage.i40;
import defpackage.nn;
import defpackage.un1;
import defpackage.v01;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/vault/Wallet_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllWalletsForUserQuery", "GetWalletForUserAndWalletIdQuery", "GetWalletForUserAndTypeAndAgencyQuery", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Wallet_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Wallet_tableQueries$GetAllWalletsForUserQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllWalletsForUserQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Wallet_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllWalletsForUserQuery(Wallet_tableQueries wallet_tableQueries, String userId, nn nnVar) {
            super(nnVar);
            Intrinsics.i(userId, "userId");
            this.c = wallet_tableQueries;
            this.b = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(1512237279, "SELECT wallet_table.userId, wallet_table.walletId, wallet_table.agency, wallet_table.type, wallet_table.walletStatus, wallet_table.balance, wallet_table.remainingLoadLimit, wallet_table.walletReclaimTime FROM wallet_table WHERE userId = ?", function1, 1, new a(this, 11));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"wallet_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"wallet_table"}, listener);
        }

        public final String toString() {
            return "wallet_table.sq:getAllWalletsForUser";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Wallet_tableQueries$GetWalletForUserAndTypeAndAgencyQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetWalletForUserAndTypeAndAgencyQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final /* synthetic */ Wallet_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetWalletForUserAndTypeAndAgencyQuery(Wallet_tableQueries wallet_tableQueries, String userId, String type, String str, a01 a01Var) {
            super(a01Var);
            Intrinsics.i(userId, "userId");
            Intrinsics.i(type, "type");
            this.e = wallet_tableQueries;
            this.b = userId;
            this.c = type;
            this.d = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.e.f697a.P(-695211574, "SELECT wallet_table.userId, wallet_table.walletId, wallet_table.agency, wallet_table.type, wallet_table.walletStatus, wallet_table.balance, wallet_table.remainingLoadLimit, wallet_table.walletReclaimTime FROM wallet_table WHERE userId = ? AND type = ? AND agency = ?", function1, 3, new a(this, 12));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"wallet_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"wallet_table"}, listener);
        }

        public final String toString() {
            return "wallet_table.sq:getWalletForUserAndTypeAndAgency";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/Wallet_tableQueries$GetWalletForUserAndWalletIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetWalletForUserAndWalletIdQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Wallet_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetWalletForUserAndWalletIdQuery(Wallet_tableQueries wallet_tableQueries, String userId, String walletId, nn nnVar) {
            super(nnVar);
            Intrinsics.i(userId, "userId");
            Intrinsics.i(walletId, "walletId");
            this.d = wallet_tableQueries;
            this.b = userId;
            this.c = walletId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1613534924, "SELECT wallet_table.userId, wallet_table.walletId, wallet_table.agency, wallet_table.type, wallet_table.walletStatus, wallet_table.balance, wallet_table.remainingLoadLimit, wallet_table.walletReclaimTime FROM wallet_table WHERE userId = ? AND walletId = ?", function1, 2, new a(this, 13));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"wallet_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"wallet_table"}, listener);
        }

        public final String toString() {
            return "wallet_table.sq:getWalletForUserAndWalletId";
        }
    }

    public final Query W(String userId, Function8 function8) {
        Intrinsics.i(userId, "userId");
        return new GetAllWalletsForUserQuery(this, userId, new nn(function8, 3));
    }

    public final Query X(String userId, String type, String str, Function8 function8) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(type, "type");
        return new GetWalletForUserAndTypeAndAgencyQuery(this, userId, type, str, new a01(function8, 3));
    }

    public final Query Y(String userId, String walletId, Function8 function8) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        return new GetWalletForUserAndWalletIdQuery(this, userId, walletId, new nn(function8, 4));
    }

    public final QueryResult Z(Wallet_table wallet_table) {
        QueryResult queryResultA0 = this.f697a.A0(1297491603, "INSERT OR REPLACE INTO wallet_table (userId, walletId, agency, type, walletStatus, balance, remainingLoadLimit, walletReclaimTime) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", new un1(wallet_table, 6));
        T(1297491603, new hp1(11));
        return queryResultA0;
    }

    public final QueryResult a0(long j, String userId, String walletId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        QueryResult queryResultA0 = this.f697a.A0(-911991299, "UPDATE wallet_table\nSET balance = ?\nWHERE userId = ?\nAND walletId = ?", new v01(j, userId, walletId, 13));
        T(-911991299, new hp1(12));
        return queryResultA0;
    }
}
