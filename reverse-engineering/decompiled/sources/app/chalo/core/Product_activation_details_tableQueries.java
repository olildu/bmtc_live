package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.lu0;
import defpackage.ux0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/core/Product_activation_details_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllSuperPassTripReceiptsListQuery", "GetAllSuperPassTripReceiptsListFlowQuery", "GetSuperPassTripReceiptQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Product_activation_details_tableQueries extends TransacterImpl {
    public final Super_pass_trip_receipt_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Product_activation_details_tableQueries$GetAllSuperPassTripReceiptsListFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllSuperPassTripReceiptsListFlowQuery<T> extends Query<T> {
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
            return "product_activation_details_table.sq:getAllSuperPassTripReceiptsListFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Product_activation_details_tableQueries$GetAllSuperPassTripReceiptsListQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllSuperPassTripReceiptsListQuery<T> extends Query<T> {
        public final String b;

        public GetAllSuperPassTripReceiptsListQuery(String str, lu0 lu0Var) {
            super(lu0Var);
            this.b = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Product_activation_details_tableQueries.this.f697a.P(-1992755846, "SELECT super_pass_trip_receipt_table.pass_id, super_pass_trip_receipt_table.product_type, super_pass_trip_receipt_table.product_sub_type, super_pass_trip_receipt_table.activation_time_stamp, super_pass_trip_receipt_table.punch_time_stamp, super_pass_trip_receipt_table.vehicle_no, super_pass_trip_receipt_table.conductor_id, super_pass_trip_receipt_table.start_stop_name, super_pass_trip_receipt_table.end_stop_name, super_pass_trip_receipt_table.route_name, super_pass_trip_receipt_table.special_features_list, super_pass_trip_receipt_table.via, super_pass_trip_receipt_table.routeNamingScheme FROM super_pass_trip_receipt_table WHERE pass_id = ? ORDER BY activation_time_stamp DESC", function1, 1, new b(this, 24));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Product_activation_details_tableQueries.this.f697a.h1(new String[]{"super_pass_trip_receipt_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Product_activation_details_tableQueries.this.f697a.P0(new String[]{"super_pass_trip_receipt_table"}, listener);
        }

        public final String toString() {
            return "product_activation_details_table.sq:getAllSuperPassTripReceiptsList";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Product_activation_details_tableQueries$GetSuperPassTripReceiptQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetSuperPassTripReceiptQuery<T> extends Query<T> {
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
            return "product_activation_details_table.sq:getSuperPassTripReceipt";
        }
    }

    public Product_activation_details_tableQueries(SqlDriver sqlDriver, Super_pass_trip_receipt_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String str, Function13 function13) {
        return new GetAllSuperPassTripReceiptsListQuery(str, new lu0(18, function13, this));
    }

    public final QueryResult X(Super_pass_trip_receipt_table super_pass_trip_receipt_table) {
        QueryResult queryResultA0 = this.f697a.A0(-1286247963, "INSERT OR REPLACE INTO super_pass_trip_receipt_table (pass_id, product_type, product_sub_type, activation_time_stamp, punch_time_stamp, vehicle_no, conductor_id, start_stop_name, end_stop_name, route_name, special_features_list, via, routeNamingScheme) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new lu0(17, super_pass_trip_receipt_table, this));
        T(-1286247963, new ux0(4));
        return queryResultA0;
    }
}
