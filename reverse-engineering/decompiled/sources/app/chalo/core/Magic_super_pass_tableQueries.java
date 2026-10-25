package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.i40;
import defpackage.t60;
import defpackage.vo1;
import defpackage.xg0;
import defpackage.zg0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllMagicSuperPassesQuery", "GetMagicSuperPassQuery", "GetMagicSuperPassCountQuery", "DoesMagicSuperPassExistQuery", "GetMagicSuperPassLastActivationTimeStampQuery", "GetAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery", "GetAllMagicSuperPassesBookedWithUserNameForCityListQuery", "FindMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery", "GetRecentActiveMagicSuperPassesQuery", "GetAllMagicSuperPassesAsFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Magic_super_pass_tableQueries extends TransacterImpl {
    public final Magic_super_pass_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$DoesMagicSuperPassExistQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DoesMagicSuperPassExistQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Magic_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DoesMagicSuperPassExistQuery(Magic_super_pass_tableQueries magic_super_pass_tableQueries, String super_pass_properties_pass_id, xg0 xg0Var) {
            super(xg0Var);
            Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
            this.c = magic_super_pass_tableQueries;
            this.b = super_pass_properties_pass_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(5246812, "SELECT EXISTS(SELECT magic_super_pass_table.super_pass_properties_qr_code, magic_super_pass_table.super_pass_properties_tone, magic_super_pass_table.super_pass_properties_pass_id, magic_super_pass_table.super_pass_properties_product_type, magic_super_pass_table.super_pass_properties_product_sub_type, magic_super_pass_table.super_pass_properties_city_name, magic_super_pass_table.super_pass_properties_agency_name, magic_super_pass_table.super_pass_validation_properties_super_pass_status, magic_super_pass_table.super_pass_validation_properties_start_time, magic_super_pass_table.super_pass_validation_properties_expiry_time, magic_super_pass_table.super_pass_validation_properties_active_duration, magic_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, magic_super_pass_table.super_pass_validation_properties_is_hailing_supported, magic_super_pass_table.super_pass_validation_properties_service_type, magic_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, magic_super_pass_table.super_pass_ui_properties_num_of_days, magic_super_pass_table.super_pass_ui_properties_special_features, magic_super_pass_table.super_pass_ui_properties_proofs, magic_super_pass_table.super_pass_ui_properties_booking_time, magic_super_pass_table.super_pass_ui_properties_pass_name, magic_super_pass_table.super_pass_ui_properties_category_name, magic_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, magic_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, magic_super_pass_table.super_pass_ui_properties_fare_infoactualFare, magic_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, magic_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, magic_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, magic_super_pass_table.super_pass_ui_properties_product_brandingis_visible, magic_super_pass_table.super_pass_repurchase_properties_config_id, magic_super_pass_table.super_pass_repurchase_properties_category_id, magic_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, magic_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, magic_super_pass_table.super_pass_repurchase_properties_verification_flag, magic_super_pass_table.super_pass_repurchase_properties_is_renewable, magic_super_pass_table.super_pass_transaction_details_transaction_id, magic_super_pass_table.super_pass_transaction_details_payment_mode, magic_super_pass_table.super_pass_trip_preferences_route_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_name, magic_super_pass_table.super_pass_trip_preferences_end_stop_id, magic_super_pass_table.super_pass_trip_preferences_end_stop_name, magic_super_pass_table.super_pass_transaction_details_refund_info, magic_super_pass_table.super_pass_validation_properties_tier_type, magic_super_pass_table.super_pass_validation_properties_advance_booking_window, magic_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, magic_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, magic_super_pass_table.super_pass_properties_premium_bus_meta, magic_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM magic_super_pass_table WHERE super_pass_properties_pass_id = ?)", function1, 1, new a(this, 7));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:doesMagicSuperPassExist";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$FindMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class FindMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final long f;
        public final Collection g;
        public final /* synthetic */ Magic_super_pass_tableQueries h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FindMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery(Magic_super_pass_tableQueries magic_super_pass_tableQueries, String userName, String dateOfBirth, String configId, String categoryId, long j, Collection super_pass_properties_city_name, zg0 zg0Var) {
            super(zg0Var);
            Intrinsics.i(userName, "userName");
            Intrinsics.i(dateOfBirth, "dateOfBirth");
            Intrinsics.i(configId, "configId");
            Intrinsics.i(categoryId, "categoryId");
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.h = magic_super_pass_tableQueries;
            this.b = userName;
            this.c = dateOfBirth;
            this.d = configId;
            this.e = categoryId;
            this.f = j;
            this.g = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.g;
            return this.h.f697a.P(null, "SELECT magic_super_pass_table.super_pass_properties_qr_code, magic_super_pass_table.super_pass_properties_tone, magic_super_pass_table.super_pass_properties_pass_id, magic_super_pass_table.super_pass_properties_product_type, magic_super_pass_table.super_pass_properties_product_sub_type, magic_super_pass_table.super_pass_properties_city_name, magic_super_pass_table.super_pass_properties_agency_name, magic_super_pass_table.super_pass_validation_properties_super_pass_status, magic_super_pass_table.super_pass_validation_properties_start_time, magic_super_pass_table.super_pass_validation_properties_expiry_time, magic_super_pass_table.super_pass_validation_properties_active_duration, magic_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, magic_super_pass_table.super_pass_validation_properties_is_hailing_supported, magic_super_pass_table.super_pass_validation_properties_service_type, magic_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, magic_super_pass_table.super_pass_ui_properties_num_of_days, magic_super_pass_table.super_pass_ui_properties_special_features, magic_super_pass_table.super_pass_ui_properties_proofs, magic_super_pass_table.super_pass_ui_properties_booking_time, magic_super_pass_table.super_pass_ui_properties_pass_name, magic_super_pass_table.super_pass_ui_properties_category_name, magic_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, magic_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, magic_super_pass_table.super_pass_ui_properties_fare_infoactualFare, magic_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, magic_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, magic_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, magic_super_pass_table.super_pass_ui_properties_product_brandingis_visible, magic_super_pass_table.super_pass_repurchase_properties_config_id, magic_super_pass_table.super_pass_repurchase_properties_category_id, magic_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, magic_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, magic_super_pass_table.super_pass_repurchase_properties_verification_flag, magic_super_pass_table.super_pass_repurchase_properties_is_renewable, magic_super_pass_table.super_pass_transaction_details_transaction_id, magic_super_pass_table.super_pass_transaction_details_payment_mode, magic_super_pass_table.super_pass_trip_preferences_route_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_name, magic_super_pass_table.super_pass_trip_preferences_end_stop_id, magic_super_pass_table.super_pass_trip_preferences_end_stop_name, magic_super_pass_table.super_pass_transaction_details_refund_info, magic_super_pass_table.super_pass_validation_properties_tier_type, magic_super_pass_table.super_pass_validation_properties_advance_booking_window, magic_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, magic_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, magic_super_pass_table.super_pass_properties_premium_bus_meta, magic_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM magic_super_pass_table WHERE super_pass_ui_properties_super_pass_user_details_full_name = ? AND super_pass_ui_properties_super_pass_user_details_date_of_birth = ? AND super_pass_repurchase_properties_config_id = ? AND super_pass_repurchase_properties_category_id = ? AND super_pass_repurchase_properties_fare_mapping_id = ? AND super_pass_properties_city_name IN ".concat(BaseTransacterImpl.S(collection.size())), function1, collection.size() + 5, new a(this, 8));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.h.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.h.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:findMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityList";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$GetAllMagicSuperPassesAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllMagicSuperPassesAsFlowQuery<T> extends Query<T> {
        public final Collection b;
        public final /* synthetic */ Magic_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllMagicSuperPassesAsFlowQuery(Magic_super_pass_tableQueries magic_super_pass_tableQueries, Collection super_pass_properties_city_name, zg0 zg0Var) {
            super(zg0Var);
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.c = magic_super_pass_tableQueries;
            this.b = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.c.f697a.P(null, vo1.B("SELECT magic_super_pass_table.super_pass_properties_qr_code, magic_super_pass_table.super_pass_properties_tone, magic_super_pass_table.super_pass_properties_pass_id, magic_super_pass_table.super_pass_properties_product_type, magic_super_pass_table.super_pass_properties_product_sub_type, magic_super_pass_table.super_pass_properties_city_name, magic_super_pass_table.super_pass_properties_agency_name, magic_super_pass_table.super_pass_validation_properties_super_pass_status, magic_super_pass_table.super_pass_validation_properties_start_time, magic_super_pass_table.super_pass_validation_properties_expiry_time, magic_super_pass_table.super_pass_validation_properties_active_duration, magic_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, magic_super_pass_table.super_pass_validation_properties_is_hailing_supported, magic_super_pass_table.super_pass_validation_properties_service_type, magic_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, magic_super_pass_table.super_pass_ui_properties_num_of_days, magic_super_pass_table.super_pass_ui_properties_special_features, magic_super_pass_table.super_pass_ui_properties_proofs, magic_super_pass_table.super_pass_ui_properties_booking_time, magic_super_pass_table.super_pass_ui_properties_pass_name, magic_super_pass_table.super_pass_ui_properties_category_name, magic_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, magic_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, magic_super_pass_table.super_pass_ui_properties_fare_infoactualFare, magic_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, magic_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, magic_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, magic_super_pass_table.super_pass_ui_properties_product_brandingis_visible, magic_super_pass_table.super_pass_repurchase_properties_config_id, magic_super_pass_table.super_pass_repurchase_properties_category_id, magic_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, magic_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, magic_super_pass_table.super_pass_repurchase_properties_verification_flag, magic_super_pass_table.super_pass_repurchase_properties_is_renewable, magic_super_pass_table.super_pass_transaction_details_transaction_id, magic_super_pass_table.super_pass_transaction_details_payment_mode, magic_super_pass_table.super_pass_trip_preferences_route_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_name, magic_super_pass_table.super_pass_trip_preferences_end_stop_id, magic_super_pass_table.super_pass_trip_preferences_end_stop_name, magic_super_pass_table.super_pass_transaction_details_refund_info, magic_super_pass_table.super_pass_validation_properties_tier_type, magic_super_pass_table.super_pass_validation_properties_advance_booking_window, magic_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, magic_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, magic_super_pass_table.super_pass_properties_premium_bus_meta, magic_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM magic_super_pass_table WHERE super_pass_properties_city_name IN ", BaseTransacterImpl.S(collection.size()), " ORDER BY super_pass_ui_properties_booking_time DESC"), function1, collection.size(), new a(this, 9));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:getAllMagicSuperPassesAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$GetAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery<T> extends Query<T> {
        public final Collection b;
        public final /* synthetic */ Magic_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery(Magic_super_pass_tableQueries magic_super_pass_tableQueries, Collection super_pass_properties_city_name, zg0 zg0Var) {
            super(zg0Var);
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.c = magic_super_pass_tableQueries;
            this.b = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.c.f697a.P(null, "SELECT magic_super_pass_table.super_pass_properties_qr_code, magic_super_pass_table.super_pass_properties_tone, magic_super_pass_table.super_pass_properties_pass_id, magic_super_pass_table.super_pass_properties_product_type, magic_super_pass_table.super_pass_properties_product_sub_type, magic_super_pass_table.super_pass_properties_city_name, magic_super_pass_table.super_pass_properties_agency_name, magic_super_pass_table.super_pass_validation_properties_super_pass_status, magic_super_pass_table.super_pass_validation_properties_start_time, magic_super_pass_table.super_pass_validation_properties_expiry_time, magic_super_pass_table.super_pass_validation_properties_active_duration, magic_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, magic_super_pass_table.super_pass_validation_properties_is_hailing_supported, magic_super_pass_table.super_pass_validation_properties_service_type, magic_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, magic_super_pass_table.super_pass_ui_properties_num_of_days, magic_super_pass_table.super_pass_ui_properties_special_features, magic_super_pass_table.super_pass_ui_properties_proofs, magic_super_pass_table.super_pass_ui_properties_booking_time, magic_super_pass_table.super_pass_ui_properties_pass_name, magic_super_pass_table.super_pass_ui_properties_category_name, magic_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, magic_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, magic_super_pass_table.super_pass_ui_properties_fare_infoactualFare, magic_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, magic_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, magic_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, magic_super_pass_table.super_pass_ui_properties_product_brandingis_visible, magic_super_pass_table.super_pass_repurchase_properties_config_id, magic_super_pass_table.super_pass_repurchase_properties_category_id, magic_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, magic_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, magic_super_pass_table.super_pass_repurchase_properties_verification_flag, magic_super_pass_table.super_pass_repurchase_properties_is_renewable, magic_super_pass_table.super_pass_transaction_details_transaction_id, magic_super_pass_table.super_pass_transaction_details_payment_mode, magic_super_pass_table.super_pass_trip_preferences_route_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_name, magic_super_pass_table.super_pass_trip_preferences_end_stop_id, magic_super_pass_table.super_pass_trip_preferences_end_stop_name, magic_super_pass_table.super_pass_transaction_details_refund_info, magic_super_pass_table.super_pass_validation_properties_tier_type, magic_super_pass_table.super_pass_validation_properties_advance_booking_window, magic_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, magic_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, magic_super_pass_table.super_pass_properties_premium_bus_meta, magic_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM magic_super_pass_table WHERE super_pass_ui_properties_super_pass_user_details_full_name IN (SELECT DISTINCT super_pass_ui_properties_super_pass_user_details_full_name FROM magic_super_pass_table) AND super_pass_properties_city_name IN ".concat(BaseTransacterImpl.S(collection.size())), function1, collection.size(), new a(this, 10));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:getAllMagicSuperPassesBookedWithDistinctUserNamesForCityList";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$GetAllMagicSuperPassesBookedWithUserNameForCityListQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllMagicSuperPassesBookedWithUserNameForCityListQuery<T> extends Query<T> {
        public final String b;
        public final Collection c;
        public final /* synthetic */ Magic_super_pass_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllMagicSuperPassesBookedWithUserNameForCityListQuery(Magic_super_pass_tableQueries magic_super_pass_tableQueries, String userName, Collection super_pass_properties_city_name, zg0 zg0Var) {
            super(zg0Var);
            Intrinsics.i(userName, "userName");
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.d = magic_super_pass_tableQueries;
            this.b = userName;
            this.c = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.c;
            return this.d.f697a.P(null, vo1.B("SELECT magic_super_pass_table.super_pass_properties_qr_code, magic_super_pass_table.super_pass_properties_tone, magic_super_pass_table.super_pass_properties_pass_id, magic_super_pass_table.super_pass_properties_product_type, magic_super_pass_table.super_pass_properties_product_sub_type, magic_super_pass_table.super_pass_properties_city_name, magic_super_pass_table.super_pass_properties_agency_name, magic_super_pass_table.super_pass_validation_properties_super_pass_status, magic_super_pass_table.super_pass_validation_properties_start_time, magic_super_pass_table.super_pass_validation_properties_expiry_time, magic_super_pass_table.super_pass_validation_properties_active_duration, magic_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, magic_super_pass_table.super_pass_validation_properties_is_hailing_supported, magic_super_pass_table.super_pass_validation_properties_service_type, magic_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, magic_super_pass_table.super_pass_ui_properties_num_of_days, magic_super_pass_table.super_pass_ui_properties_special_features, magic_super_pass_table.super_pass_ui_properties_proofs, magic_super_pass_table.super_pass_ui_properties_booking_time, magic_super_pass_table.super_pass_ui_properties_pass_name, magic_super_pass_table.super_pass_ui_properties_category_name, magic_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, magic_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, magic_super_pass_table.super_pass_ui_properties_fare_infoactualFare, magic_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, magic_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, magic_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, magic_super_pass_table.super_pass_ui_properties_product_brandingis_visible, magic_super_pass_table.super_pass_repurchase_properties_config_id, magic_super_pass_table.super_pass_repurchase_properties_category_id, magic_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, magic_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, magic_super_pass_table.super_pass_repurchase_properties_verification_flag, magic_super_pass_table.super_pass_repurchase_properties_is_renewable, magic_super_pass_table.super_pass_transaction_details_transaction_id, magic_super_pass_table.super_pass_transaction_details_payment_mode, magic_super_pass_table.super_pass_trip_preferences_route_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_name, magic_super_pass_table.super_pass_trip_preferences_end_stop_id, magic_super_pass_table.super_pass_trip_preferences_end_stop_name, magic_super_pass_table.super_pass_transaction_details_refund_info, magic_super_pass_table.super_pass_validation_properties_tier_type, magic_super_pass_table.super_pass_validation_properties_advance_booking_window, magic_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, magic_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, magic_super_pass_table.super_pass_properties_premium_bus_meta, magic_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM magic_super_pass_table WHERE super_pass_ui_properties_super_pass_user_details_full_name = ? AND super_pass_properties_city_name IN ", BaseTransacterImpl.S(collection.size()), " ORDER BY super_pass_ui_properties_booking_time ASC"), function1, collection.size() + 1, new a(this, 11));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:getAllMagicSuperPassesBookedWithUserNameForCityList";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$GetAllMagicSuperPassesQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllMagicSuperPassesQuery<T> extends Query<T> {
        public final String b;

        public GetAllMagicSuperPassesQuery(String str, zg0 zg0Var) {
            super(zg0Var);
            this.b = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return Magic_super_pass_tableQueries.this.f697a.P(-2145923717, "SELECT magic_super_pass_table.super_pass_properties_qr_code, magic_super_pass_table.super_pass_properties_tone, magic_super_pass_table.super_pass_properties_pass_id, magic_super_pass_table.super_pass_properties_product_type, magic_super_pass_table.super_pass_properties_product_sub_type, magic_super_pass_table.super_pass_properties_city_name, magic_super_pass_table.super_pass_properties_agency_name, magic_super_pass_table.super_pass_validation_properties_super_pass_status, magic_super_pass_table.super_pass_validation_properties_start_time, magic_super_pass_table.super_pass_validation_properties_expiry_time, magic_super_pass_table.super_pass_validation_properties_active_duration, magic_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, magic_super_pass_table.super_pass_validation_properties_is_hailing_supported, magic_super_pass_table.super_pass_validation_properties_service_type, magic_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, magic_super_pass_table.super_pass_ui_properties_num_of_days, magic_super_pass_table.super_pass_ui_properties_special_features, magic_super_pass_table.super_pass_ui_properties_proofs, magic_super_pass_table.super_pass_ui_properties_booking_time, magic_super_pass_table.super_pass_ui_properties_pass_name, magic_super_pass_table.super_pass_ui_properties_category_name, magic_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, magic_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, magic_super_pass_table.super_pass_ui_properties_fare_infoactualFare, magic_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, magic_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, magic_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, magic_super_pass_table.super_pass_ui_properties_product_brandingis_visible, magic_super_pass_table.super_pass_repurchase_properties_config_id, magic_super_pass_table.super_pass_repurchase_properties_category_id, magic_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, magic_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, magic_super_pass_table.super_pass_repurchase_properties_verification_flag, magic_super_pass_table.super_pass_repurchase_properties_is_renewable, magic_super_pass_table.super_pass_transaction_details_transaction_id, magic_super_pass_table.super_pass_transaction_details_payment_mode, magic_super_pass_table.super_pass_trip_preferences_route_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_name, magic_super_pass_table.super_pass_trip_preferences_end_stop_id, magic_super_pass_table.super_pass_trip_preferences_end_stop_name, magic_super_pass_table.super_pass_transaction_details_refund_info, magic_super_pass_table.super_pass_validation_properties_tier_type, magic_super_pass_table.super_pass_validation_properties_advance_booking_window, magic_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, magic_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, magic_super_pass_table.super_pass_properties_premium_bus_meta, magic_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM magic_super_pass_table WHERE super_pass_properties_city_name = ? ORDER BY super_pass_ui_properties_booking_time DESC", function1, 1, new a(this, 12));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            Magic_super_pass_tableQueries.this.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            Magic_super_pass_tableQueries.this.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:getAllMagicSuperPasses";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$GetMagicSuperPassCountQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMagicSuperPassCountQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Magic_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMagicSuperPassCountQuery(Magic_super_pass_tableQueries magic_super_pass_tableQueries, String super_pass_properties_city_name, xg0 xg0Var) {
            super(xg0Var);
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.c = magic_super_pass_tableQueries;
            this.b = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(1293703965, "SELECT COUNT (DISTINCT super_pass_properties_pass_id) FROM magic_super_pass_table WHERE super_pass_properties_city_name = ?", function1, 1, new a(this, 13));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:getMagicSuperPassCount";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$GetMagicSuperPassLastActivationTimeStampQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMagicSuperPassLastActivationTimeStampQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Magic_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMagicSuperPassLastActivationTimeStampQuery(Magic_super_pass_tableQueries magic_super_pass_tableQueries, String super_pass_properties_pass_id, xg0 xg0Var) {
            super(xg0Var);
            Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
            this.c = magic_super_pass_tableQueries;
            this.b = super_pass_properties_pass_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-2003950440, "SELECT super_pass_validation_properties_ride_details_last_activation_time_stamp FROM magic_super_pass_table WHERE super_pass_properties_pass_id = ?", function1, 1, new a(this, 14));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:getMagicSuperPassLastActivationTimeStamp";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$GetMagicSuperPassQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetMagicSuperPassQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Magic_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetMagicSuperPassQuery(Magic_super_pass_tableQueries magic_super_pass_tableQueries, String super_pass_properties_pass_id, zg0 zg0Var) {
            super(zg0Var);
            Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
            this.c = magic_super_pass_tableQueries;
            this.b = super_pass_properties_pass_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(1774444818, "SELECT magic_super_pass_table.super_pass_properties_qr_code, magic_super_pass_table.super_pass_properties_tone, magic_super_pass_table.super_pass_properties_pass_id, magic_super_pass_table.super_pass_properties_product_type, magic_super_pass_table.super_pass_properties_product_sub_type, magic_super_pass_table.super_pass_properties_city_name, magic_super_pass_table.super_pass_properties_agency_name, magic_super_pass_table.super_pass_validation_properties_super_pass_status, magic_super_pass_table.super_pass_validation_properties_start_time, magic_super_pass_table.super_pass_validation_properties_expiry_time, magic_super_pass_table.super_pass_validation_properties_active_duration, magic_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, magic_super_pass_table.super_pass_validation_properties_is_hailing_supported, magic_super_pass_table.super_pass_validation_properties_service_type, magic_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, magic_super_pass_table.super_pass_ui_properties_num_of_days, magic_super_pass_table.super_pass_ui_properties_special_features, magic_super_pass_table.super_pass_ui_properties_proofs, magic_super_pass_table.super_pass_ui_properties_booking_time, magic_super_pass_table.super_pass_ui_properties_pass_name, magic_super_pass_table.super_pass_ui_properties_category_name, magic_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, magic_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, magic_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, magic_super_pass_table.super_pass_ui_properties_fare_infoactualFare, magic_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, magic_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, magic_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, magic_super_pass_table.super_pass_ui_properties_product_brandingis_visible, magic_super_pass_table.super_pass_repurchase_properties_config_id, magic_super_pass_table.super_pass_repurchase_properties_category_id, magic_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, magic_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, magic_super_pass_table.super_pass_repurchase_properties_verification_flag, magic_super_pass_table.super_pass_repurchase_properties_is_renewable, magic_super_pass_table.super_pass_transaction_details_transaction_id, magic_super_pass_table.super_pass_transaction_details_payment_mode, magic_super_pass_table.super_pass_trip_preferences_route_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_id, magic_super_pass_table.super_pass_trip_preferences_start_stop_name, magic_super_pass_table.super_pass_trip_preferences_end_stop_id, magic_super_pass_table.super_pass_trip_preferences_end_stop_name, magic_super_pass_table.super_pass_transaction_details_refund_info, magic_super_pass_table.super_pass_validation_properties_tier_type, magic_super_pass_table.super_pass_validation_properties_advance_booking_window, magic_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, magic_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, magic_super_pass_table.super_pass_properties_premium_bus_meta, magic_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM magic_super_pass_table WHERE super_pass_properties_pass_id = ?", function1, 1, new a(this, 15));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"magic_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"magic_super_pass_table"}, listener);
        }

        public final String toString() {
            return "magic_super_pass_table.sq:getMagicSuperPass";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Magic_super_pass_tableQueries$GetRecentActiveMagicSuperPassesQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentActiveMagicSuperPassesQuery<T> extends Query<T> {
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
            return "magic_super_pass_table.sq:getRecentActiveMagicSuperPasses";
        }
    }

    public Magic_super_pass_tableQueries(SqlDriver sqlDriver, Magic_super_pass_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String super_pass_properties_pass_id) {
        Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
        return new DoesMagicSuperPassExistQuery(this, super_pass_properties_pass_id, new xg0(12));
    }

    public final Query X(String userName, String dateOfBirth, String configId, String categoryId, long j, Collection super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(userName, "userName");
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(categoryId, "categoryId");
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new FindMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery(this, userName, dateOfBirth, configId, categoryId, j, super_pass_properties_city_name, new zg0(functionN, this, 1));
    }

    public final Query Y(String str, FunctionN functionN) {
        return new GetAllMagicSuperPassesQuery(str, new zg0(functionN, this, 2));
    }

    public final Query Z(List super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new GetAllMagicSuperPassesAsFlowQuery(this, super_pass_properties_city_name, new zg0(functionN, this, 5));
    }

    public final Query a0(Collection super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new GetAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery(this, super_pass_properties_city_name, new zg0(functionN, this, 3));
    }

    public final Query b0(String userName, Collection super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(userName, "userName");
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new GetAllMagicSuperPassesBookedWithUserNameForCityListQuery(this, userName, super_pass_properties_city_name, new zg0(functionN, this, 4));
    }

    public final Query c0(String super_pass_properties_pass_id, FunctionN functionN) {
        Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
        return new GetMagicSuperPassQuery(this, super_pass_properties_pass_id, new zg0(functionN, this, 0));
    }

    public final Query d0(String super_pass_properties_city_name) {
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new GetMagicSuperPassCountQuery(this, super_pass_properties_city_name, new xg0(15));
    }

    public final Query e0(String super_pass_properties_pass_id) {
        Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
        return new GetMagicSuperPassLastActivationTimeStampQuery(this, super_pass_properties_pass_id, new xg0(16));
    }

    public final QueryResult f0(Magic_super_pass_table magic_super_pass_table) {
        QueryResult queryResultA0 = this.f697a.A0(1989445595, "INSERT OR REPLACE INTO magic_super_pass_table (super_pass_properties_qr_code, super_pass_properties_tone, super_pass_properties_pass_id, super_pass_properties_product_type, super_pass_properties_product_sub_type, super_pass_properties_city_name, super_pass_properties_agency_name, super_pass_validation_properties_super_pass_status, super_pass_validation_properties_start_time, super_pass_validation_properties_expiry_time, super_pass_validation_properties_active_duration, super_pass_validation_properties_ride_details_last_activation_time_stamp, super_pass_validation_properties_is_hailing_supported, super_pass_validation_properties_service_type, super_pass_validation_properties_ride_details_last_punch_time_stamp, super_pass_ui_properties_num_of_days, super_pass_ui_properties_special_features, super_pass_ui_properties_proofs, super_pass_ui_properties_booking_time, super_pass_ui_properties_pass_name, super_pass_ui_properties_category_name, super_pass_ui_properties_fare_mapping_display_name, super_pass_ui_properties_super_pass_user_details_user_id, super_pass_ui_properties_super_pass_user_details_mobile_number, super_pass_ui_properties_super_pass_user_details_full_name, super_pass_ui_properties_super_pass_user_details_gender, super_pass_ui_properties_super_pass_user_details_date_of_birth, super_pass_ui_properties_super_pass_user_details_email_id, super_pass_ui_properties_super_pass_user_details_profile_photo, super_pass_ui_properties_super_pass_user_details_dob_in_millis, super_pass_ui_properties_fare_infopayableAmount, super_pass_ui_properties_fare_infoactualFare, super_pass_ui_properties_fare_infoisDiscountApplicable, super_pass_ui_properties_fare_infodiscountedFare, super_pass_ui_properties_fare_infofareBreakupComponentList, super_pass_ui_properties_product_brandingis_visible, super_pass_repurchase_properties_config_id, super_pass_repurchase_properties_category_id, super_pass_repurchase_properties_fare_mapping_id, super_pass_repurchase_properties_verification_expiry_time, super_pass_repurchase_properties_verification_flag, super_pass_repurchase_properties_is_renewable, super_pass_transaction_details_transaction_id, super_pass_transaction_details_payment_mode, super_pass_trip_preferences_route_id, super_pass_trip_preferences_start_stop_id, super_pass_trip_preferences_start_stop_name, super_pass_trip_preferences_end_stop_id, super_pass_trip_preferences_end_stop_name, super_pass_transaction_details_refund_info, super_pass_validation_properties_tier_type, super_pass_validation_properties_advance_booking_window, super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, super_pass_validation_properties_bulk_booking_allowed, super_pass_properties_premium_bus_meta, super_pass_ui_properties_mark_as_unlimited) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new t60(21, magic_super_pass_table, this));
        T(1989445595, new xg0(14));
        return queryResultA0;
    }
}
