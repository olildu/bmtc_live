package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.qr0;
import defpackage.vo1;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/core/Pending_super_pass_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetPendingSuperPassQuery", "GetAllPendingSuperPassQuery", "GetAllPendingSuperPassAsFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Pending_super_pass_tableQueries extends TransacterImpl {
    public final Pending_super_pass_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Pending_super_pass_tableQueries$GetAllPendingSuperPassAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPendingSuperPassAsFlowQuery<T> extends Query<T> {
        public final Collection b;
        public final /* synthetic */ Pending_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllPendingSuperPassAsFlowQuery(Pending_super_pass_tableQueries pending_super_pass_tableQueries, Collection pending_super_pass_properties_city_name, qr0 qr0Var) {
            super(qr0Var);
            Intrinsics.i(pending_super_pass_properties_city_name, "pending_super_pass_properties_city_name");
            this.c = pending_super_pass_tableQueries;
            this.b = pending_super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.c.f697a.P(null, vo1.B("SELECT pending_super_pass_table.pending_super_pass_properties_super_pass_status, pending_super_pass_table.pending_super_pass_properties_pass_id, pending_super_pass_table.pending_super_pass_properties_product_type, pending_super_pass_table.pending_super_pass_properties_product_sub_type, pending_super_pass_table.pending_super_pass_properties_city_name, pending_super_pass_table.pending_super_pass_properties_agency_name, pending_super_pass_table.pending_super_pass_ui_properties_max_price_per_trip, pending_super_pass_table.pending_super_pass_ui_properties_fare_mapping_description, pending_super_pass_table.pending_super_pass_ui_properties_num_of_days, pending_super_pass_table.pending_super_pass_ui_properties_special_features, pending_super_pass_table.pending_super_pass_ui_properties_proofs, pending_super_pass_table.pending_super_pass_ui_properties_booking_time, pending_super_pass_table.pending_super_pass_ui_properties_pass_name, pending_super_pass_table.pending_super_pass_ui_properties_category_name, pending_super_pass_table.pending_super_pass_ui_properties_fare_mapping_display_name, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_user_id, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_mobile_number, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_full_name, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_gender, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_date_of_birth, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_email_id, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_profile_photo, pending_super_pass_table.pending_super_pass_ui_properties_fare_infopayableAmount, pending_super_pass_table.pending_super_pass_ui_properties_fare_infoactualFare, pending_super_pass_table.pending_super_pass_ui_properties_fare_infoisDiscountApplicable, pending_super_pass_table.pending_super_pass_ui_properties_fare_infodiscountedFare, pending_super_pass_table.pending_super_pass_ui_properties_fare_infofareBreakupComponentList, pending_super_pass_table.pending_super_pass_ui_properties_product_brandingis_visible, pending_super_pass_table.pending_super_pass_repurchase_properties_config_id, pending_super_pass_table.pending_super_pass_repurchase_properties_category_id, pending_super_pass_table.pending_super_pass_repurchase_properties_fare_mapping_id, pending_super_pass_table.pending_super_pass_repurchase_properties_start_time, pending_super_pass_table.pending_super_pass_repurchase_properties_verification_expiry_time, pending_super_pass_table.pending_super_pass_repurchase_properties_verification_flag, pending_super_pass_table.pending_super_pass_transaction_details_payment_mode, pending_super_pass_table.pending_super_pass_transaction_details_transaction_id, pending_super_pass_table.pending_super_pass_transaction_details_order_id, pending_super_pass_table.pending_super_pass_transaction_details_refund_info FROM pending_super_pass_table WHERE pending_super_pass_properties_city_name IN ", BaseTransacterImpl.S(collection.size()), " ORDER BY pending_super_pass_ui_properties_booking_time DESC"), function1, collection.size(), new b(this, 6));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"pending_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"pending_super_pass_table"}, listener);
        }

        public final String toString() {
            return "pending_super_pass_table.sq:getAllPendingSuperPassAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Pending_super_pass_tableQueries$GetAllPendingSuperPassQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllPendingSuperPassQuery<T> extends Query<T> {
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
            return "pending_super_pass_table.sq:getAllPendingSuperPass";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Pending_super_pass_tableQueries$GetPendingSuperPassQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetPendingSuperPassQuery<T> extends Query<T> {
        public final String b;

        public GetPendingSuperPassQuery(String str, qr0 qr0Var) {
            super(qr0Var);
            this.b = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Pending_super_pass_tableQueries.this.f697a.P(1354486098, "SELECT pending_super_pass_table.pending_super_pass_properties_super_pass_status, pending_super_pass_table.pending_super_pass_properties_pass_id, pending_super_pass_table.pending_super_pass_properties_product_type, pending_super_pass_table.pending_super_pass_properties_product_sub_type, pending_super_pass_table.pending_super_pass_properties_city_name, pending_super_pass_table.pending_super_pass_properties_agency_name, pending_super_pass_table.pending_super_pass_ui_properties_max_price_per_trip, pending_super_pass_table.pending_super_pass_ui_properties_fare_mapping_description, pending_super_pass_table.pending_super_pass_ui_properties_num_of_days, pending_super_pass_table.pending_super_pass_ui_properties_special_features, pending_super_pass_table.pending_super_pass_ui_properties_proofs, pending_super_pass_table.pending_super_pass_ui_properties_booking_time, pending_super_pass_table.pending_super_pass_ui_properties_pass_name, pending_super_pass_table.pending_super_pass_ui_properties_category_name, pending_super_pass_table.pending_super_pass_ui_properties_fare_mapping_display_name, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_user_id, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_mobile_number, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_full_name, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_gender, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_date_of_birth, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_email_id, pending_super_pass_table.pending_super_pass_ui_properties_super_pass_user_details_profile_photo, pending_super_pass_table.pending_super_pass_ui_properties_fare_infopayableAmount, pending_super_pass_table.pending_super_pass_ui_properties_fare_infoactualFare, pending_super_pass_table.pending_super_pass_ui_properties_fare_infoisDiscountApplicable, pending_super_pass_table.pending_super_pass_ui_properties_fare_infodiscountedFare, pending_super_pass_table.pending_super_pass_ui_properties_fare_infofareBreakupComponentList, pending_super_pass_table.pending_super_pass_ui_properties_product_brandingis_visible, pending_super_pass_table.pending_super_pass_repurchase_properties_config_id, pending_super_pass_table.pending_super_pass_repurchase_properties_category_id, pending_super_pass_table.pending_super_pass_repurchase_properties_fare_mapping_id, pending_super_pass_table.pending_super_pass_repurchase_properties_start_time, pending_super_pass_table.pending_super_pass_repurchase_properties_verification_expiry_time, pending_super_pass_table.pending_super_pass_repurchase_properties_verification_flag, pending_super_pass_table.pending_super_pass_transaction_details_payment_mode, pending_super_pass_table.pending_super_pass_transaction_details_transaction_id, pending_super_pass_table.pending_super_pass_transaction_details_order_id, pending_super_pass_table.pending_super_pass_transaction_details_refund_info FROM pending_super_pass_table WHERE pending_super_pass_properties_pass_id = ?", function1, 1, new b(this, 7));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Pending_super_pass_tableQueries.this.f697a.h1(new String[]{"pending_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Pending_super_pass_tableQueries.this.f697a.P0(new String[]{"pending_super_pass_table"}, listener);
        }

        public final String toString() {
            return "pending_super_pass_table.sq:getPendingSuperPass";
        }
    }

    public Pending_super_pass_tableQueries(SqlDriver sqlDriver, Pending_super_pass_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(List pending_super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(pending_super_pass_properties_city_name, "pending_super_pass_properties_city_name");
        return new GetAllPendingSuperPassAsFlowQuery(this, pending_super_pass_properties_city_name, new qr0(functionN, this, 0));
    }

    public final Query X(String str, FunctionN functionN) {
        return new GetPendingSuperPassQuery(str, new qr0(functionN, this, 1));
    }
}
