package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.gw;
import defpackage.i40;
import defpackage.qn1;
import defpackage.sh1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/User_commute_preference_place_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "SelectByIdQuery", "SelectAllQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class User_commute_preference_place_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/User_commute_preference_place_tableQueries$SelectAllQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SelectAllQuery<T> extends Query<T> {
        public final String b;
        public final String c;

        public SelectAllQuery(String str, String str2, sh1 sh1Var) {
            super(sh1Var);
            this.b = str;
            this.c = str2;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return User_commute_preference_place_tableQueries.this.f697a.P(1798983083, "SELECT user_commute_preference_place_table.id, user_commute_preference_place_table.userId, user_commute_preference_place_table.cityId, user_commute_preference_place_table.tag, user_commute_preference_place_table.label, user_commute_preference_place_table.stopPlaceType, user_commute_preference_place_table.stopPlaceId, user_commute_preference_place_table.stopPlaceName, user_commute_preference_place_table.stopAddress, user_commute_preference_place_table.latitude, user_commute_preference_place_table.longitude, user_commute_preference_place_table.searchPartner FROM user_commute_preference_place_table WHERE userId = ? AND cityId = ?", function1, 2, new e(this, 23));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            User_commute_preference_place_tableQueries.this.f697a.h1(new String[]{"user_commute_preference_place_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            User_commute_preference_place_tableQueries.this.f697a.P0(new String[]{"user_commute_preference_place_table"}, listener);
        }

        public final String toString() {
            return "user_commute_preference_place_table.sq:selectAll";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/User_commute_preference_place_tableQueries$SelectByIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            return "user_commute_preference_place_table.sq:selectById";
        }
    }

    public final QueryResult W(String userId, String cityId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        QueryResult queryResultA0 = this.f697a.A0(1242313624, "DELETE FROM user_commute_preference_place_table WHERE userId = ? AND cityId = ?", new gw(userId, cityId, 15));
        T(1242313624, new qn1(4));
        return queryResultA0;
    }

    public final QueryResult X(User_commute_preference_place_table user_commute_preference_place_table) {
        QueryResult queryResultA0 = this.f697a.A0(660980179, "INSERT OR REPLACE INTO user_commute_preference_place_table (id, userId, cityId, tag, label, stopPlaceType, stopPlaceId, stopPlaceName, stopAddress, latitude, longitude, searchPartner) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new sh1(user_commute_preference_place_table, 28));
        T(660980179, new qn1(3));
        return queryResultA0;
    }

    public final Query Y(String str, String str2, Function12 function12) {
        return new SelectAllQuery(str, str2, new sh1(function12, 29));
    }
}
