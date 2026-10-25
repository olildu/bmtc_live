package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.ed0;
import defpackage.i40;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Mticket_activation_store_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetMTicketActivationInfoQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Mticket_activation_store_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Mticket_activation_store_tableQueries$GetMTicketActivationInfoQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMTicketActivationInfoQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Mticket_activation_store_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMTicketActivationInfoQuery(Mticket_activation_store_tableQueries mticket_activation_store_tableQueries, String city, String mticketId, ed0 ed0Var) {
            super(ed0Var);
            Intrinsics.i(city, "city");
            Intrinsics.i(mticketId, "mticketId");
            this.d = mticket_activation_store_tableQueries;
            this.b = city;
            this.c = mticketId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(-929181439, "SELECT mticket_activation_store_table.city, mticket_activation_store_table.mticketId, mticket_activation_store_table.activatedAt, mticket_activation_store_table.isActivated FROM mticket_activation_store_table WHERE city = ? AND mticketId = ?", function1, 2, new a(this, 20));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"mticket_activation_store_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"mticket_activation_store_table"}, listener);
        }

        public final String toString() {
            return "mticket_activation_store_table.sq:getMTicketActivationInfo";
        }
    }

    public final Query W(String city, String mticketId, Function4 function4) {
        Intrinsics.i(city, "city");
        Intrinsics.i(mticketId, "mticketId");
        return new GetMTicketActivationInfoQuery(this, city, mticketId, new ed0(function4, 2));
    }
}
