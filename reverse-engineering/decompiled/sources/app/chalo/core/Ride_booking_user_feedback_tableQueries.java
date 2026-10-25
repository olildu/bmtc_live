package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.t01;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Ride_booking_user_feedback_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllFeedbackEntriesQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ride_booking_user_feedback_tableQueries extends TransacterImpl {
    public final Ride_booking_user_feedback_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_booking_user_feedback_tableQueries$GetAllFeedbackEntriesQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllFeedbackEntriesQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Ride_booking_user_feedback_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllFeedbackEntriesQuery(Ride_booking_user_feedback_tableQueries ride_booking_user_feedback_tableQueries, String city, t01 t01Var) {
            super(t01Var);
            Intrinsics.i(city, "city");
            this.c = ride_booking_user_feedback_tableQueries;
            this.b = city;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(87237688, "SELECT ride_booking_user_feedback_table.bookingId, ride_booking_user_feedback_table.city, ride_booking_user_feedback_table.rating, ride_booking_user_feedback_table.selectedReason, ride_booking_user_feedback_table.comments, ride_booking_user_feedback_table.subtags FROM ride_booking_user_feedback_table WHERE city = ?", function1, 1, new e(this, 6));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"ride_booking_user_feedback_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"ride_booking_user_feedback_table"}, listener);
        }

        public final String toString() {
            return "ride_booking_user_feedback_table.sq:getAllFeedbackEntries";
        }
    }

    public Ride_booking_user_feedback_tableQueries(SqlDriver sqlDriver, Ride_booking_user_feedback_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String city, Function6 function6) {
        Intrinsics.i(city, "city");
        return new GetAllFeedbackEntriesQuery(this, city, new t01(19, function6, this));
    }
}
