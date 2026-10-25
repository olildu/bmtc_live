package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.g41;
import defpackage.i40;
import defpackage.og1;
import defpackage.vo1;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Super_pass_application_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllSuperPassApplicationsQuery", "GetAllSuperPassApplicationsAsFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Super_pass_application_tableQueries extends TransacterImpl {
    public final Super_pass_application_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Super_pass_application_tableQueries$GetAllSuperPassApplicationsAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllSuperPassApplicationsAsFlowQuery<T> extends Query<T> {
        public final Collection b;
        public final /* synthetic */ Super_pass_application_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllSuperPassApplicationsAsFlowQuery(Super_pass_application_tableQueries super_pass_application_tableQueries, Collection city_name, g41 g41Var) {
            super(g41Var);
            Intrinsics.i(city_name, "city_name");
            this.c = super_pass_application_tableQueries;
            this.b = city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.c.f697a.P(null, vo1.B("SELECT super_pass_application_table.city_name, super_pass_application_table.agency_name, super_pass_application_table.config_id, super_pass_application_table.category_id, super_pass_application_table.fare_mapping_id, super_pass_application_table.fare_mapping_display_name, super_pass_application_table.pass_name, super_pass_application_table.pass_start_date, super_pass_application_table.verification_expiry_time, super_pass_application_table.super_pass_application_status, super_pass_application_table.proofs, super_pass_application_table.pass_application_action_required, super_pass_application_table.super_pass_user_details_user_id, super_pass_application_table.super_pass_user_details_mobile_number, super_pass_application_table.super_pass_user_details_full_name, super_pass_application_table.super_pass_user_details_gender, super_pass_application_table.super_pass_user_details_date_of_birth, super_pass_application_table.super_pass_user_details_email_id, super_pass_application_table.super_pass_user_details_profile_photo, super_pass_application_table.super_pass_user_details_dob_in_millis, super_pass_application_table.cash_payment_pending_transaction_details_pending_fare, super_pass_application_table.cash_payment_pending_transaction_details_reference_id, super_pass_application_table.pass_application_rejection_reasons_proofRejectionReasonsList, super_pass_application_table.pass_application_rejection_reasons_profileRejectionReasonsList, super_pass_application_table.pass_application_rejection_reasons_generalRejectionReasonsList, super_pass_application_table.refundInfo FROM super_pass_application_table WHERE city_name IN ", BaseTransacterImpl.S(collection.size()), " ORDER BY pass_start_date DESC"), function1, collection.size(), new e(this, 15));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"super_pass_application_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"super_pass_application_table"}, listener);
        }

        public final String toString() {
            return "super_pass_application_table.sq:getAllSuperPassApplicationsAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Super_pass_application_tableQueries$GetAllSuperPassApplicationsQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllSuperPassApplicationsQuery<T> extends Query<T> {
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
            return "super_pass_application_table.sq:getAllSuperPassApplications";
        }
    }

    public Super_pass_application_tableQueries(SqlDriver sqlDriver, Super_pass_application_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(List city_name, FunctionN functionN) {
        Intrinsics.i(city_name, "city_name");
        return new GetAllSuperPassApplicationsAsFlowQuery(this, city_name, new g41(28, functionN, this));
    }

    public final QueryResult X(Super_pass_application_table super_pass_application_table) {
        QueryResult queryResultA0 = this.f697a.A0(-470362401, "INSERT OR REPLACE INTO super_pass_application_table (city_name, agency_name, config_id, category_id, fare_mapping_id, fare_mapping_display_name, pass_name, pass_start_date, verification_expiry_time, super_pass_application_status, proofs, pass_application_action_required, super_pass_user_details_user_id, super_pass_user_details_mobile_number, super_pass_user_details_full_name, super_pass_user_details_gender, super_pass_user_details_date_of_birth, super_pass_user_details_email_id, super_pass_user_details_profile_photo, super_pass_user_details_dob_in_millis, cash_payment_pending_transaction_details_pending_fare, cash_payment_pending_transaction_details_reference_id, pass_application_rejection_reasons_proofRejectionReasonsList, pass_application_rejection_reasons_profileRejectionReasonsList, pass_application_rejection_reasons_generalRejectionReasonsList, refundInfo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new g41(29, super_pass_application_table, this));
        T(-470362401, new og1(2));
        return queryResultA0;
    }
}
