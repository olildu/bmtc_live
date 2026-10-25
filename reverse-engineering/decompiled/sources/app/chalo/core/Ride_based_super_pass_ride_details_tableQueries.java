package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.t01;
import defpackage.x21;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_ride_details_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetRideBasedSuperPassRideDetailsQuery", "DoesRideBasedSuperPassRideDetailsExistQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ride_based_super_pass_ride_details_tableQueries extends TransacterImpl {
    public final Ride_based_super_pass_ride_details_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_ride_details_tableQueries$DoesRideBasedSuperPassRideDetailsExistQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DoesRideBasedSuperPassRideDetailsExistQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Ride_based_super_pass_ride_details_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DoesRideBasedSuperPassRideDetailsExistQuery(Ride_based_super_pass_ride_details_tableQueries ride_based_super_pass_ride_details_tableQueries, String pass_id, x21 x21Var) {
            super(x21Var);
            Intrinsics.i(pass_id, "pass_id");
            this.c = ride_based_super_pass_ride_details_tableQueries;
            this.b = pass_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1563975323, "SELECT EXISTS(SELECT ride_based_super_pass_ride_details_table.pass_id, ride_based_super_pass_ride_details_table.previous_ride_time_stamps, ride_based_super_pass_ride_details_table.is_activation_allowed_in_current_session, ride_based_super_pass_ride_details_table.oldest_history_call_time_stamp, ride_based_super_pass_ride_details_table.should_check_app_reclaim, ride_based_super_pass_ride_details_table.last_activation_time_stamp, ride_based_super_pass_ride_details_table.last_punch_time_stamp FROM ride_based_super_pass_ride_details_table WHERE pass_id = ?)", function1, 1, new c(this, 28));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"ride_based_super_pass_ride_details_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"ride_based_super_pass_ride_details_table"}, listener);
        }

        public final String toString() {
            return "ride_based_super_pass_ride_details_table.sq:doesRideBasedSuperPassRideDetailsExist";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_ride_details_tableQueries$GetRideBasedSuperPassRideDetailsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRideBasedSuperPassRideDetailsQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Ride_based_super_pass_ride_details_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRideBasedSuperPassRideDetailsQuery(Ride_based_super_pass_ride_details_tableQueries ride_based_super_pass_ride_details_tableQueries, String pass_id, t01 t01Var) {
            super(t01Var);
            Intrinsics.i(pass_id, "pass_id");
            this.c = ride_based_super_pass_ride_details_tableQueries;
            this.b = pass_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1467963759, "SELECT ride_based_super_pass_ride_details_table.pass_id, ride_based_super_pass_ride_details_table.previous_ride_time_stamps, ride_based_super_pass_ride_details_table.is_activation_allowed_in_current_session, ride_based_super_pass_ride_details_table.oldest_history_call_time_stamp, ride_based_super_pass_ride_details_table.should_check_app_reclaim, ride_based_super_pass_ride_details_table.last_activation_time_stamp, ride_based_super_pass_ride_details_table.last_punch_time_stamp FROM ride_based_super_pass_ride_details_table WHERE pass_id = ?", function1, 1, new c(this, 29));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"ride_based_super_pass_ride_details_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"ride_based_super_pass_ride_details_table"}, listener);
        }

        public final String toString() {
            return "ride_based_super_pass_ride_details_table.sq:getRideBasedSuperPassRideDetails";
        }
    }

    public Ride_based_super_pass_ride_details_tableQueries(SqlDriver sqlDriver, Ride_based_super_pass_ride_details_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String pass_id) {
        Intrinsics.i(pass_id, "pass_id");
        return new DoesRideBasedSuperPassRideDetailsExistQuery(this, pass_id, new x21(4));
    }

    public final Query X(String pass_id, Function7 function7) {
        Intrinsics.i(pass_id, "pass_id");
        return new GetRideBasedSuperPassRideDetailsQuery(this, pass_id, new t01(17, function7, this));
    }
}
