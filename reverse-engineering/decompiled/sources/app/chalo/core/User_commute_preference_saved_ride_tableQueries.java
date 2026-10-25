package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.gw;
import defpackage.i40;
import defpackage.qn1;
import defpackage.un1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/core/User_commute_preference_saved_ride_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "SelectByIdQuery", "SelectAllQuery", "SelectByODPairQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class User_commute_preference_saved_ride_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/User_commute_preference_saved_ride_tableQueries$SelectAllQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SelectAllQuery<T> extends Query<T> {
        public final String b;
        public final String c;

        public SelectAllQuery(String str, String str2, un1 un1Var) {
            super(un1Var);
            this.b = str;
            this.c = str2;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return User_commute_preference_saved_ride_tableQueries.this.f697a.P(-594534962, "SELECT user_commute_preference_saved_ride_table.id, user_commute_preference_saved_ride_table.userId, user_commute_preference_saved_ride_table.cityId, user_commute_preference_saved_ride_table.time, user_commute_preference_saved_ride_table.origin, user_commute_preference_saved_ride_table.destination FROM user_commute_preference_saved_ride_table WHERE userId = ? AND cityId = ?", function1, 2, new e(this, 24));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            User_commute_preference_saved_ride_tableQueries.this.f697a.h1(new String[]{"user_commute_preference_saved_ride_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            User_commute_preference_saved_ride_tableQueries.this.f697a.P0(new String[]{"user_commute_preference_saved_ride_table"}, listener);
        }

        public final String toString() {
            return "user_commute_preference_saved_ride_table.sq:selectAll";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/User_commute_preference_saved_ride_tableQueries$SelectByIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SelectByIdQuery<T> extends Query<T> {
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
            return "user_commute_preference_saved_ride_table.sq:selectById";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/User_commute_preference_saved_ride_tableQueries$SelectByODPairQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SelectByODPairQuery<T> extends Query<T> {
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
            return "user_commute_preference_saved_ride_table.sq:selectByODPair";
        }
    }

    public final QueryResult W(String userId, String cityId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        QueryResult queryResultA0 = this.f697a.A0(-950696427, "DELETE FROM user_commute_preference_saved_ride_table WHERE userId = ? AND cityId = ?", new gw(userId, cityId, 16));
        T(-950696427, new qn1(6));
        return queryResultA0;
    }

    public final QueryResult X(User_commute_preference_saved_ride_table user_commute_preference_saved_ride_table) {
        QueryResult queryResultA0 = this.f697a.A0(987733136, "INSERT OR REPLACE INTO user_commute_preference_saved_ride_table (id, userId, cityId, time, origin, destination) VALUES (?, ?, ?, ?, ?, ?)", new un1(user_commute_preference_saved_ride_table, 0));
        T(987733136, new qn1(5));
        return queryResultA0;
    }

    public final Query Y(String str, String str2, Function6 function6) {
        return new SelectAllQuery(str, str2, new un1(function6, 1));
    }
}
