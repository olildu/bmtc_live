package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.i40;
import defpackage.l;
import defpackage.lj0;
import defpackage.or;
import defpackage.wi0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_child_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetChildrenQuery", "GetChildrenForGroupIdsQuery", "GetChildTicketReferenceQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Multi_modal_group_ticket_child_tableQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_child_tableQueries$GetChildTicketReferenceQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetChildTicketReferenceQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final /* synthetic */ Multi_modal_group_ticket_child_tableQueries e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetChildTicketReferenceQuery(Multi_modal_group_ticket_child_tableQueries multi_modal_group_ticket_child_tableQueries, String subTicketId, String str, wi0 wi0Var) {
            super(wi0Var);
            Intrinsics.i(subTicketId, "subTicketId");
            this.e = multi_modal_group_ticket_child_tableQueries;
            this.b = subTicketId;
            this.c = "mobileTicket";
            this.d = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.e.f697a.P(1766478684, "SELECT multi_modal_group_ticket_child_table.groupId, multi_modal_group_ticket_child_table.sequence, multi_modal_group_ticket_child_table.subTicketId, multi_modal_group_ticket_child_table.productType, multi_modal_group_ticket_child_table.productSubType\nFROM multi_modal_group_ticket_child_table\nWHERE subTicketId = ?\n    AND productType = ?\n    AND productSubType = ?", function1, 3, new a(this, 21));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.e.f697a.h1(new String[]{"multi_modal_group_ticket_child_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.e.f697a.P0(new String[]{"multi_modal_group_ticket_child_table"}, listener);
        }

        public final String toString() {
            return "multi_modal_group_ticket_child_table.sq:getChildTicketReference";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_child_tableQueries$GetChildrenForGroupIdsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetChildrenForGroupIdsQuery<T> extends Query<T> {
        public final Collection b;
        public final /* synthetic */ Multi_modal_group_ticket_child_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetChildrenForGroupIdsQuery(Multi_modal_group_ticket_child_tableQueries multi_modal_group_ticket_child_tableQueries, Collection groupId, wi0 wi0Var) {
            super(wi0Var);
            Intrinsics.i(groupId, "groupId");
            this.c = multi_modal_group_ticket_child_tableQueries;
            this.b = groupId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            String strS = BaseTransacterImpl.S(collection.size());
            return this.c.f697a.P(null, StringsKt.y0("\n          |SELECT multi_modal_group_ticket_child_table.groupId, multi_modal_group_ticket_child_table.sequence, multi_modal_group_ticket_child_table.subTicketId, multi_modal_group_ticket_child_table.productType, multi_modal_group_ticket_child_table.productSubType\n          |FROM multi_modal_group_ticket_child_table\n          |WHERE groupId IN " + strS + "\n          |ORDER BY sequence ASC\n          "), function1, collection.size(), new a(this, 22));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"multi_modal_group_ticket_child_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"multi_modal_group_ticket_child_table"}, listener);
        }

        public final String toString() {
            return "multi_modal_group_ticket_child_table.sq:getChildrenForGroupIds";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_child_tableQueries$GetChildrenQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetChildrenQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Multi_modal_group_ticket_child_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetChildrenQuery(Multi_modal_group_ticket_child_tableQueries multi_modal_group_ticket_child_tableQueries, String groupId, wi0 wi0Var) {
            super(wi0Var);
            Intrinsics.i(groupId, "groupId");
            this.c = multi_modal_group_ticket_child_tableQueries;
            this.b = groupId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-1262168584, "SELECT multi_modal_group_ticket_child_table.groupId, multi_modal_group_ticket_child_table.sequence, multi_modal_group_ticket_child_table.subTicketId, multi_modal_group_ticket_child_table.productType, multi_modal_group_ticket_child_table.productSubType\nFROM multi_modal_group_ticket_child_table\nWHERE groupId = ?\nORDER BY sequence ASC", function1, 1, new a(this, 23));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"multi_modal_group_ticket_child_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"multi_modal_group_ticket_child_table"}, listener);
        }

        public final String toString() {
            return "multi_modal_group_ticket_child_table.sq:getChildren";
        }
    }

    public final void W(Collection collection) {
        String strY0 = StringsKt.y0("\n        |DELETE FROM multi_modal_group_ticket_child_table\n        |WHERE groupId IN " + BaseTransacterImpl.S(collection.size()) + "\n        ");
        collection.size();
        this.f697a.A0(null, strY0, new l(collection, 3));
        T(-391652266, new lj0(14));
    }

    public final Query X(String subTicketId, String str) {
        Intrinsics.i(subTicketId, "subTicketId");
        return new GetChildTicketReferenceQuery(this, subTicketId, str, new wi0(new or(5), 15));
    }

    public final Query Y(String groupId) {
        Intrinsics.i(groupId, "groupId");
        return new GetChildrenQuery(this, groupId, new wi0(new or(8), 13));
    }

    public final Query Z(List groupId) {
        Intrinsics.i(groupId, "groupId");
        return new GetChildrenForGroupIdsQuery(this, groupId, new wi0(new or(7), 12));
    }

    public final void a0(Multi_modal_group_ticket_child_table multi_modal_group_ticket_child_table) {
        this.f697a.A0(-833992602, "INSERT OR REPLACE INTO multi_modal_group_ticket_child_table (groupId, sequence, subTicketId, productType, productSubType) VALUES (?, ?, ?, ?, ?)", new wi0(multi_modal_group_ticket_child_table, 14));
        T(-833992602, new lj0(16));
    }
}
