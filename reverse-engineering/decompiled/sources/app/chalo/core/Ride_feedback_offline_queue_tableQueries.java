package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.b01;
import defpackage.i40;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Ride_feedback_offline_queue_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllOfflineFeedbackQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ride_feedback_offline_queue_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_feedback_offline_queue_tableQueries$GetAllOfflineFeedbackQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllOfflineFeedbackQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final /* synthetic */ Ride_feedback_offline_queue_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllOfflineFeedbackQuery(Ride_feedback_offline_queue_tableQueries ride_feedback_offline_queue_tableQueries, String productType, String productSubType, String userId, b01 b01Var) {
            super(b01Var);
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(userId, "userId");
            this.e = ride_feedback_offline_queue_tableQueries;
            this.b = productType;
            this.c = productSubType;
            this.d = userId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.e.f697a.P(-15438147, "SELECT ride_feedback_offline_queue_table.bookingId, ride_feedback_offline_queue_table.userId, ride_feedback_offline_queue_table.cityId, ride_feedback_offline_queue_table.productType, ride_feedback_offline_queue_table.productSubType, ride_feedback_offline_queue_table.rating, ride_feedback_offline_queue_table.feedbackTag, ride_feedback_offline_queue_table.feedbackSubtag, ride_feedback_offline_queue_table.comment, ride_feedback_offline_queue_table.skipped, ride_feedback_offline_queue_table.submissionTimestamp FROM ride_feedback_offline_queue_table WHERE productType = ? AND productSubType = ? AND userId = ?", function1, 3, new e(this, 7));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"ride_feedback_offline_queue_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"ride_feedback_offline_queue_table"}, listener);
        }

        public final String toString() {
            return "ride_feedback_offline_queue_table.sq:getAllOfflineFeedback";
        }
    }

    public final Query W(String productType, String productSubType, String userId, Function11 function11) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        return new GetAllOfflineFeedbackQuery(this, productType, productSubType, userId, new b01(function11, 3));
    }
}
