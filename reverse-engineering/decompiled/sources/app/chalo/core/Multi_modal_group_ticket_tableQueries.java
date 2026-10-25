package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.ej0;
import defpackage.i40;
import defpackage.ik0;
import defpackage.lj0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetGroupQuery", "GetGroupIdsForUserAndCityQuery", "GetGroupInfoByIDQuery", "GetAllGroupsForUserAndCitiesQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Multi_modal_group_ticket_tableQueries extends TransacterImpl {
    public final Multi_modal_group_ticket_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_tableQueries$GetAllGroupsForUserAndCitiesQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllGroupsForUserAndCitiesQuery<T> extends Query<T> {
        public final String b;
        public final ArrayList c;
        public final /* synthetic */ Multi_modal_group_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllGroupsForUserAndCitiesQuery(Multi_modal_group_ticket_tableQueries multi_modal_group_ticket_tableQueries, String userId, ArrayList arrayList, ej0 ej0Var) {
            super(ej0Var);
            Intrinsics.i(userId, "userId");
            this.d = multi_modal_group_ticket_tableQueries;
            this.b = userId;
            this.c = arrayList;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            ArrayList arrayList = this.c;
            String strS = BaseTransacterImpl.S(arrayList.size());
            return this.d.f697a.P(null, StringsKt.y0("\n          |SELECT\n          |    g.groupId,\n          |    g.productName,\n          |    g.productType,\n          |    g.productSubType,\n          |    g.bookingTime,\n          |    g.amount,\n          |    g.status,\n          |    g.userId,\n          |    g.city,\n          |    g.configurationId,\n          |    g.expiryTime,\n          |    g.fromStopDetails,\n          |    g.toStopDetails,\n          |    g.passengerDetails,\n          |    g.refundInfo,\n          |    g.sequenceInfo,\n          |    g.fareDetails,\n          |    g.expectedChildCount,\n          |    c.sequence AS childSequence,\n          |    c.subTicketId AS childSubTicketId,\n          |    c.productType AS childProductType,\n          |    c.productSubType AS childProductSubType\n          |FROM multi_modal_group_ticket_table AS g\n          |LEFT JOIN multi_modal_group_ticket_child_table AS c\n          |    ON c.groupId = g.groupId\n          |WHERE userId = ? AND city IN " + strS + "\n          |ORDER BY g.groupId ASC, c.sequence ASC\n          "), function1, arrayList.size() + 1, new a(this, 24));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"multi_modal_group_ticket_table", "multi_modal_group_ticket_child_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"multi_modal_group_ticket_table", "multi_modal_group_ticket_child_table"}, listener);
        }

        public final String toString() {
            return "multi_modal_group_ticket_table.sq:getAllGroupsForUserAndCities";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_tableQueries$GetGroupIdsForUserAndCityQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetGroupIdsForUserAndCityQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final /* synthetic */ Multi_modal_group_ticket_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetGroupIdsForUserAndCityQuery(Multi_modal_group_ticket_tableQueries multi_modal_group_ticket_tableQueries, String userId, String str, lj0 lj0Var) {
            super(lj0Var);
            Intrinsics.i(userId, "userId");
            this.d = multi_modal_group_ticket_tableQueries;
            this.b = userId;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.d.f697a.P(1454702685, "SELECT groupId\nFROM multi_modal_group_ticket_table\nWHERE userId = ? AND city = ?", function1, 2, new a(this, 25));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"multi_modal_group_ticket_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"multi_modal_group_ticket_table"}, listener);
        }

        public final String toString() {
            return "multi_modal_group_ticket_table.sq:getGroupIdsForUserAndCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_tableQueries$GetGroupInfoByIDQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetGroupInfoByIDQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Multi_modal_group_ticket_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetGroupInfoByIDQuery(Multi_modal_group_ticket_tableQueries multi_modal_group_ticket_tableQueries, String groupId, ej0 ej0Var) {
            super(ej0Var);
            Intrinsics.i(groupId, "groupId");
            this.c = multi_modal_group_ticket_tableQueries;
            this.b = groupId;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(439620905, "SELECT\n    g.groupId,\n    g.productName,\n    g.productType,\n    g.productSubType,\n    g.bookingTime,\n    g.amount,\n    g.status,\n    g.userId,\n    g.city,\n    g.configurationId,\n    g.expiryTime,\n    g.fromStopDetails,\n    g.toStopDetails,\n    g.passengerDetails,\n    g.refundInfo,\n    g.sequenceInfo,\n    g.fareDetails,\n    g.expectedChildCount,\n    c.sequence AS childSequence,\n    c.subTicketId AS childSubTicketId,\n    c.productType AS childProductType,\n    c.productSubType AS childProductSubType\nFROM multi_modal_group_ticket_table AS g\nLEFT JOIN multi_modal_group_ticket_child_table AS c\n    ON c.groupId = g.groupId\nWHERE g.groupId = ?\nORDER BY c.sequence ASC", function1, 1, new a(this, 26));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"multi_modal_group_ticket_table", "multi_modal_group_ticket_child_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"multi_modal_group_ticket_table", "multi_modal_group_ticket_child_table"}, listener);
        }

        public final String toString() {
            return "multi_modal_group_ticket_table.sq:getGroupInfoByID";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Multi_modal_group_ticket_tableQueries$GetGroupQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetGroupQuery<T> extends Query<T> {
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
            return "multi_modal_group_ticket_table.sq:getGroup";
        }
    }

    public Multi_modal_group_ticket_tableQueries(SqlDriver sqlDriver, Multi_modal_group_ticket_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String userId, ArrayList arrayList) {
        Intrinsics.i(userId, "userId");
        return new GetAllGroupsForUserAndCitiesQuery(this, userId, arrayList, new ej0(5, new ik0(1), this));
    }

    public final Query X(String userId, String str) {
        Intrinsics.i(userId, "userId");
        return new GetGroupIdsForUserAndCityQuery(this, userId, str, new lj0(18));
    }

    public final Query Y(String groupId) {
        Intrinsics.i(groupId, "groupId");
        return new GetGroupInfoByIDQuery(this, groupId, new ej0(4, new ik0(0), this));
    }

    public final void Z(Multi_modal_group_ticket_table multi_modal_group_ticket_table) {
        this.f697a.A0(-1634371706, "INSERT OR REPLACE INTO multi_modal_group_ticket_table (groupId, productName, productType, productSubType, bookingTime, amount, status, userId, city, configurationId, expiryTime, fromStopDetails, toStopDetails, passengerDetails, refundInfo, sequenceInfo, fareDetails, expectedChildCount) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ej0(3, multi_modal_group_ticket_table, this));
        T(-1634371706, new lj0(17));
    }
}
