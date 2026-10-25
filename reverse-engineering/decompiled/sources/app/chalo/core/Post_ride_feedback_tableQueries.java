package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.et0;
import defpackage.ft0;
import defpackage.i40;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Post_ride_feedback_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetPrfEntriesForProductAndAccountQuery", "GetEntryByBookingIdQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Post_ride_feedback_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Post_ride_feedback_tableQueries$GetEntryByBookingIdQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetEntryByBookingIdQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final /* synthetic */ Post_ride_feedback_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetEntryByBookingIdQuery(Post_ride_feedback_tableQueries post_ride_feedback_tableQueries, String bookingId, String userId, String cityId, et0 et0Var) {
            super(et0Var);
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(userId, "userId");
            Intrinsics.i(cityId, "cityId");
            this.e = post_ride_feedback_tableQueries;
            this.b = bookingId;
            this.c = userId;
            this.d = cityId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.e.f697a.P(-936370600, "SELECT post_ride_feedback_table.bookingId, post_ride_feedback_table.userId, post_ride_feedback_table.cityId, post_ride_feedback_table.tripId, post_ride_feedback_table.routeId, post_ride_feedback_table.fromStopName, post_ride_feedback_table.toStopName, post_ride_feedback_table.tripStartTimestamp, post_ride_feedback_table.tripEndTimestamp, post_ride_feedback_table.triggerType, post_ride_feedback_table.productType, post_ride_feedback_table.productSubType, post_ride_feedback_table.fillStatus, post_ride_feedback_table.prfSubmittedAt FROM post_ride_feedback_table WHERE bookingId = ? AND userId = ? AND cityId = ?", function1, 3, new b(this, 8));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"post_ride_feedback_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"post_ride_feedback_table"}, listener);
        }

        public final String toString() {
            return "post_ride_feedback_table.sq:getEntryByBookingId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Post_ride_feedback_tableQueries$GetPrfEntriesForProductAndAccountQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetPrfEntriesForProductAndAccountQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final /* synthetic */ Post_ride_feedback_tableQueries f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPrfEntriesForProductAndAccountQuery(Post_ride_feedback_tableQueries post_ride_feedback_tableQueries, String productType, String productSubType, String userId, String cityId, et0 et0Var) {
            super(et0Var);
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(userId, "userId");
            Intrinsics.i(cityId, "cityId");
            this.f = post_ride_feedback_tableQueries;
            this.b = productType;
            this.c = productSubType;
            this.d = userId;
            this.e = cityId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.f.f697a.P(371454709, "SELECT post_ride_feedback_table.bookingId, post_ride_feedback_table.userId, post_ride_feedback_table.cityId, post_ride_feedback_table.tripId, post_ride_feedback_table.routeId, post_ride_feedback_table.fromStopName, post_ride_feedback_table.toStopName, post_ride_feedback_table.tripStartTimestamp, post_ride_feedback_table.tripEndTimestamp, post_ride_feedback_table.triggerType, post_ride_feedback_table.productType, post_ride_feedback_table.productSubType, post_ride_feedback_table.fillStatus, post_ride_feedback_table.prfSubmittedAt FROM post_ride_feedback_table WHERE productType = ? AND productSubType = ? AND userId = ? AND cityId = ? ORDER BY tripEndTimestamp DESC", function1, 4, new b(this, 9));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.f.f697a.h1(new String[]{"post_ride_feedback_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.f.f697a.P0(new String[]{"post_ride_feedback_table"}, listener);
        }

        public final String toString() {
            return "post_ride_feedback_table.sq:getPrfEntriesForProductAndAccount";
        }
    }

    public final Query W(String bookingId, String userId, String cityId) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        return new GetEntryByBookingIdQuery(this, bookingId, userId, cityId, new et0(new ft0(1), 2));
    }

    public final Query X(String productType, String productSubType, String userId, String cityId) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        return new GetPrfEntriesForProductAndAccountQuery(this, productType, productSubType, userId, cityId, new et0(new ft0(0), 0));
    }
}
