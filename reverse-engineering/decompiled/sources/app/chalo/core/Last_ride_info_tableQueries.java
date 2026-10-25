package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.dd0;
import defpackage.i40;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Last_ride_info_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetLastRideInfoQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Last_ride_info_tableQueries extends TransacterImpl {
    public final Last_ride_info_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Last_ride_info_tableQueries$GetLastRideInfoQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetLastRideInfoQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Last_ride_info_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLastRideInfoQuery(Last_ride_info_tableQueries last_ride_info_tableQueries, String city, dd0 dd0Var) {
            super(dd0Var);
            Intrinsics.i(city, "city");
            this.c = last_ride_info_tableQueries;
            this.b = city;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(780937258, "SELECT lastRideInfo FROM last_ride_info_table WHERE city = ?", function1, 1, new a(this, 6));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"last_ride_info_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"last_ride_info_table"}, listener);
        }

        public final String toString() {
            return "last_ride_info_table.sq:getLastRideInfo";
        }
    }

    public Last_ride_info_tableQueries(SqlDriver sqlDriver, Last_ride_info_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city) {
        Intrinsics.i(city, "city");
        return new GetLastRideInfoQuery(this, city, new dd0(this, 3));
    }
}
