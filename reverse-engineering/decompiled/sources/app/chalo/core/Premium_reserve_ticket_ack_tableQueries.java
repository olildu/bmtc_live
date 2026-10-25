package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import defpackage.i40;
import defpackage.lu0;
import defpackage.mf;
import defpackage.zv0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_ack_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllAckInfoForGivenAckStatusQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Premium_reserve_ticket_ack_tableQueries extends TransacterImpl {
    public final Premium_reserve_ticket_ack_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Premium_reserve_ticket_ack_tableQueries$GetAllAckInfoForGivenAckStatusQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllAckInfoForGivenAckStatusQuery<T> extends Query<T> {
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
            return "premium_reserve_ticket_ack_table.sq:getAllAckInfoForGivenAckStatus";
        }
    }

    public Premium_reserve_ticket_ack_tableQueries(SqlDriver sqlDriver, Premium_reserve_ticket_ack_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final QueryResult W(Premium_reserve_ticket_ack_table premium_reserve_ticket_ack_table) {
        QueryResult queryResultA0 = this.f697a.A0(2115137457, "INSERT OR IGNORE INTO premium_reserve_ticket_ack_table (bookingId, productType, productSubType, userId, ackNeededFor, hasAcknowledged, firstBookingId) VALUES (?, ?, ?, ?, ?, ?, ?)", new lu0(12, premium_reserve_ticket_ack_table, this));
        T(2115137457, new zv0(26));
        return queryResultA0;
    }

    public final QueryResult X(boolean z, PremiumReserveTicketAckType ackNeededFor, String bookingId, String userId) {
        Intrinsics.i(ackNeededFor, "ackNeededFor");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        QueryResult queryResultA0 = this.f697a.A0(-721878661, "UPDATE premium_reserve_ticket_ack_table\nSET hasAcknowledged = ?, ackNeededFor = ?\nWHERE bookingId = ?\nAND userId = ?", new mf(z, this, ackNeededFor, bookingId, userId));
        T(-721878661, new zv0(27));
        return queryResultA0;
    }
}
