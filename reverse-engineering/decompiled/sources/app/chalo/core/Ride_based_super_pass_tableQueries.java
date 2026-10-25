package app.chalo.core;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import defpackage.g31;
import defpackage.i40;
import defpackage.t01;
import defpackage.vo1;
import defpackage.x21;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllRideBasedSuperPassesQuery", "GetRideBasedSuperPassCountQuery", "GetRideBasedSuperPassQuery", "GetAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery", "GetAllRideBasedSuperPassesBookedWithUserNameForCityListQuery", "FindRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery", "GetRecentActiveRideBasedSuperPassesQuery", "GetAllRideBasedSuperPassesAsFlowQuery", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ride_based_super_pass_tableQueries extends TransacterImpl {
    public final Ride_based_super_pass_table.Adapter b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries$FindRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class FindRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery<T> extends Query<T> {
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final long f;
        public final Collection g;
        public final /* synthetic */ Ride_based_super_pass_tableQueries h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FindRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery(Ride_based_super_pass_tableQueries ride_based_super_pass_tableQueries, String userName, String dateOfBirth, String configId, String categoryId, long j, Collection super_pass_properties_city_name, g31 g31Var) {
            super(g31Var);
            Intrinsics.i(userName, "userName");
            Intrinsics.i(dateOfBirth, "dateOfBirth");
            Intrinsics.i(configId, "configId");
            Intrinsics.i(categoryId, "categoryId");
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.h = ride_based_super_pass_tableQueries;
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
            return this.h.f697a.P(null, "SELECT ride_based_super_pass_table.super_pass_validation_properties_max_trips_per_day, ride_based_super_pass_table.super_pass_validation_properties_num_of_trips, ride_based_super_pass_table.super_pass_validation_properties_super_pass_status, ride_based_super_pass_table.super_pass_validation_properties_start_time, ride_based_super_pass_table.super_pass_validation_properties_expiry_time, ride_based_super_pass_table.super_pass_validation_properties_active_duration, ride_based_super_pass_table.super_pass_validation_properties_ride_details_previous_ride_time_stamps, ride_based_super_pass_table.super_pass_validation_properties_ride_details_is_activation_allowed_in_current_session, ride_based_super_pass_table.super_pass_validation_properties_ride_details_oldest_history_call_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_should_check_app_reclaim, ride_based_super_pass_table.super_pass_validation_properties_is_hailing_supported, ride_based_super_pass_table.super_pass_validation_properties_service_type, ride_based_super_pass_table.super_pass_validation_properties_premium_rides_consumed, ride_based_super_pass_table.super_pass_ui_properties_max_price_per_trip, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_description, ride_based_super_pass_table.super_pass_ui_properties_num_of_days, ride_based_super_pass_table.super_pass_ui_properties_special_features, ride_based_super_pass_table.super_pass_ui_properties_proofs, ride_based_super_pass_table.super_pass_ui_properties_booking_time, ride_based_super_pass_table.super_pass_ui_properties_pass_name, ride_based_super_pass_table.super_pass_ui_properties_category_name, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, ride_based_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, ride_based_super_pass_table.super_pass_ui_properties_fare_infoactualFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, ride_based_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, ride_based_super_pass_table.super_pass_ui_properties_product_brandingis_visible, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, ride_based_super_pass_table.super_pass_properties_qr_code, ride_based_super_pass_table.super_pass_properties_tone, ride_based_super_pass_table.super_pass_properties_pass_id, ride_based_super_pass_table.super_pass_properties_product_type, ride_based_super_pass_table.super_pass_properties_product_sub_type, ride_based_super_pass_table.super_pass_properties_city_name, ride_based_super_pass_table.super_pass_properties_agency_name, ride_based_super_pass_table.super_pass_repurchase_properties_config_id, ride_based_super_pass_table.super_pass_repurchase_properties_category_id, ride_based_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, ride_based_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, ride_based_super_pass_table.super_pass_repurchase_properties_verification_flag, ride_based_super_pass_table.super_pass_repurchase_properties_is_renewable, ride_based_super_pass_table.super_pass_transaction_details_transaction_id, ride_based_super_pass_table.super_pass_transaction_details_payment_mode, ride_based_super_pass_table.super_pass_trip_preferences_route_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_name, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_name, ride_based_super_pass_table.super_pass_transaction_details_refund_info, ride_based_super_pass_table.super_pass_validation_properties_tier_type, ride_based_super_pass_table.super_pass_validation_properties_advance_booking_window, ride_based_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, ride_based_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, ride_based_super_pass_table.super_pass_properties_premium_bus_meta, ride_based_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM ride_based_super_pass_table WHERE super_pass_ui_properties_super_pass_user_details_full_name = ? AND super_pass_ui_properties_super_pass_user_details_date_of_birth = ? AND super_pass_repurchase_properties_config_id = ? AND super_pass_repurchase_properties_category_id = ? AND super_pass_repurchase_properties_fare_mapping_id = ? AND super_pass_properties_city_name IN ".concat(BaseTransacterImpl.S(collection.size())), function1, collection.size() + 5, new e(this, 0));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.h.f697a.h1(new String[]{"ride_based_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.h.f697a.P0(new String[]{"ride_based_super_pass_table"}, listener);
        }

        public final String toString() {
            return "ride_based_super_pass_table.sq:findRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityList";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries$GetAllRideBasedSuperPassesAsFlowQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllRideBasedSuperPassesAsFlowQuery<T> extends Query<T> {
        public final Collection b;
        public final /* synthetic */ Ride_based_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllRideBasedSuperPassesAsFlowQuery(Ride_based_super_pass_tableQueries ride_based_super_pass_tableQueries, Collection super_pass_properties_city_name, g31 g31Var) {
            super(g31Var);
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.c = ride_based_super_pass_tableQueries;
            this.b = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.c.f697a.P(null, vo1.B("SELECT ride_based_super_pass_table.super_pass_validation_properties_max_trips_per_day, ride_based_super_pass_table.super_pass_validation_properties_num_of_trips, ride_based_super_pass_table.super_pass_validation_properties_super_pass_status, ride_based_super_pass_table.super_pass_validation_properties_start_time, ride_based_super_pass_table.super_pass_validation_properties_expiry_time, ride_based_super_pass_table.super_pass_validation_properties_active_duration, ride_based_super_pass_table.super_pass_validation_properties_ride_details_previous_ride_time_stamps, ride_based_super_pass_table.super_pass_validation_properties_ride_details_is_activation_allowed_in_current_session, ride_based_super_pass_table.super_pass_validation_properties_ride_details_oldest_history_call_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_should_check_app_reclaim, ride_based_super_pass_table.super_pass_validation_properties_is_hailing_supported, ride_based_super_pass_table.super_pass_validation_properties_service_type, ride_based_super_pass_table.super_pass_validation_properties_premium_rides_consumed, ride_based_super_pass_table.super_pass_ui_properties_max_price_per_trip, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_description, ride_based_super_pass_table.super_pass_ui_properties_num_of_days, ride_based_super_pass_table.super_pass_ui_properties_special_features, ride_based_super_pass_table.super_pass_ui_properties_proofs, ride_based_super_pass_table.super_pass_ui_properties_booking_time, ride_based_super_pass_table.super_pass_ui_properties_pass_name, ride_based_super_pass_table.super_pass_ui_properties_category_name, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, ride_based_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, ride_based_super_pass_table.super_pass_ui_properties_fare_infoactualFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, ride_based_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, ride_based_super_pass_table.super_pass_ui_properties_product_brandingis_visible, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, ride_based_super_pass_table.super_pass_properties_qr_code, ride_based_super_pass_table.super_pass_properties_tone, ride_based_super_pass_table.super_pass_properties_pass_id, ride_based_super_pass_table.super_pass_properties_product_type, ride_based_super_pass_table.super_pass_properties_product_sub_type, ride_based_super_pass_table.super_pass_properties_city_name, ride_based_super_pass_table.super_pass_properties_agency_name, ride_based_super_pass_table.super_pass_repurchase_properties_config_id, ride_based_super_pass_table.super_pass_repurchase_properties_category_id, ride_based_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, ride_based_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, ride_based_super_pass_table.super_pass_repurchase_properties_verification_flag, ride_based_super_pass_table.super_pass_repurchase_properties_is_renewable, ride_based_super_pass_table.super_pass_transaction_details_transaction_id, ride_based_super_pass_table.super_pass_transaction_details_payment_mode, ride_based_super_pass_table.super_pass_trip_preferences_route_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_name, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_name, ride_based_super_pass_table.super_pass_transaction_details_refund_info, ride_based_super_pass_table.super_pass_validation_properties_tier_type, ride_based_super_pass_table.super_pass_validation_properties_advance_booking_window, ride_based_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, ride_based_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, ride_based_super_pass_table.super_pass_properties_premium_bus_meta, ride_based_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM ride_based_super_pass_table WHERE super_pass_properties_city_name IN ", BaseTransacterImpl.S(collection.size()), " ORDER BY super_pass_ui_properties_booking_time DESC"), function1, collection.size(), new e(this, 1));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"ride_based_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"ride_based_super_pass_table"}, listener);
        }

        public final String toString() {
            return "ride_based_super_pass_table.sq:getAllRideBasedSuperPassesAsFlow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries$GetAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery<T> extends Query<T> {
        public final Collection b;
        public final /* synthetic */ Ride_based_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery(Ride_based_super_pass_tableQueries ride_based_super_pass_tableQueries, Collection super_pass_properties_city_name, g31 g31Var) {
            super(g31Var);
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.c = ride_based_super_pass_tableQueries;
            this.b = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.b;
            return this.c.f697a.P(null, "SELECT ride_based_super_pass_table.super_pass_validation_properties_max_trips_per_day, ride_based_super_pass_table.super_pass_validation_properties_num_of_trips, ride_based_super_pass_table.super_pass_validation_properties_super_pass_status, ride_based_super_pass_table.super_pass_validation_properties_start_time, ride_based_super_pass_table.super_pass_validation_properties_expiry_time, ride_based_super_pass_table.super_pass_validation_properties_active_duration, ride_based_super_pass_table.super_pass_validation_properties_ride_details_previous_ride_time_stamps, ride_based_super_pass_table.super_pass_validation_properties_ride_details_is_activation_allowed_in_current_session, ride_based_super_pass_table.super_pass_validation_properties_ride_details_oldest_history_call_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_should_check_app_reclaim, ride_based_super_pass_table.super_pass_validation_properties_is_hailing_supported, ride_based_super_pass_table.super_pass_validation_properties_service_type, ride_based_super_pass_table.super_pass_validation_properties_premium_rides_consumed, ride_based_super_pass_table.super_pass_ui_properties_max_price_per_trip, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_description, ride_based_super_pass_table.super_pass_ui_properties_num_of_days, ride_based_super_pass_table.super_pass_ui_properties_special_features, ride_based_super_pass_table.super_pass_ui_properties_proofs, ride_based_super_pass_table.super_pass_ui_properties_booking_time, ride_based_super_pass_table.super_pass_ui_properties_pass_name, ride_based_super_pass_table.super_pass_ui_properties_category_name, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, ride_based_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, ride_based_super_pass_table.super_pass_ui_properties_fare_infoactualFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, ride_based_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, ride_based_super_pass_table.super_pass_ui_properties_product_brandingis_visible, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, ride_based_super_pass_table.super_pass_properties_qr_code, ride_based_super_pass_table.super_pass_properties_tone, ride_based_super_pass_table.super_pass_properties_pass_id, ride_based_super_pass_table.super_pass_properties_product_type, ride_based_super_pass_table.super_pass_properties_product_sub_type, ride_based_super_pass_table.super_pass_properties_city_name, ride_based_super_pass_table.super_pass_properties_agency_name, ride_based_super_pass_table.super_pass_repurchase_properties_config_id, ride_based_super_pass_table.super_pass_repurchase_properties_category_id, ride_based_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, ride_based_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, ride_based_super_pass_table.super_pass_repurchase_properties_verification_flag, ride_based_super_pass_table.super_pass_repurchase_properties_is_renewable, ride_based_super_pass_table.super_pass_transaction_details_transaction_id, ride_based_super_pass_table.super_pass_transaction_details_payment_mode, ride_based_super_pass_table.super_pass_trip_preferences_route_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_name, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_name, ride_based_super_pass_table.super_pass_transaction_details_refund_info, ride_based_super_pass_table.super_pass_validation_properties_tier_type, ride_based_super_pass_table.super_pass_validation_properties_advance_booking_window, ride_based_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, ride_based_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, ride_based_super_pass_table.super_pass_properties_premium_bus_meta, ride_based_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM ride_based_super_pass_table WHERE super_pass_ui_properties_super_pass_user_details_full_name IN (SELECT DISTINCT super_pass_ui_properties_super_pass_user_details_full_name FROM ride_based_super_pass_table) AND super_pass_properties_city_name IN ".concat(BaseTransacterImpl.S(collection.size())), function1, collection.size(), new e(this, 2));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"ride_based_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"ride_based_super_pass_table"}, listener);
        }

        public final String toString() {
            return "ride_based_super_pass_table.sq:getAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityList";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries$GetAllRideBasedSuperPassesBookedWithUserNameForCityListQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllRideBasedSuperPassesBookedWithUserNameForCityListQuery<T> extends Query<T> {
        public final String b;
        public final Collection c;
        public final /* synthetic */ Ride_based_super_pass_tableQueries d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllRideBasedSuperPassesBookedWithUserNameForCityListQuery(Ride_based_super_pass_tableQueries ride_based_super_pass_tableQueries, String userName, Collection super_pass_properties_city_name, g31 g31Var) {
            super(g31Var);
            Intrinsics.i(userName, "userName");
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.d = ride_based_super_pass_tableQueries;
            this.b = userName;
            this.c = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            Collection collection = this.c;
            return this.d.f697a.P(null, vo1.B("SELECT ride_based_super_pass_table.super_pass_validation_properties_max_trips_per_day, ride_based_super_pass_table.super_pass_validation_properties_num_of_trips, ride_based_super_pass_table.super_pass_validation_properties_super_pass_status, ride_based_super_pass_table.super_pass_validation_properties_start_time, ride_based_super_pass_table.super_pass_validation_properties_expiry_time, ride_based_super_pass_table.super_pass_validation_properties_active_duration, ride_based_super_pass_table.super_pass_validation_properties_ride_details_previous_ride_time_stamps, ride_based_super_pass_table.super_pass_validation_properties_ride_details_is_activation_allowed_in_current_session, ride_based_super_pass_table.super_pass_validation_properties_ride_details_oldest_history_call_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_should_check_app_reclaim, ride_based_super_pass_table.super_pass_validation_properties_is_hailing_supported, ride_based_super_pass_table.super_pass_validation_properties_service_type, ride_based_super_pass_table.super_pass_validation_properties_premium_rides_consumed, ride_based_super_pass_table.super_pass_ui_properties_max_price_per_trip, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_description, ride_based_super_pass_table.super_pass_ui_properties_num_of_days, ride_based_super_pass_table.super_pass_ui_properties_special_features, ride_based_super_pass_table.super_pass_ui_properties_proofs, ride_based_super_pass_table.super_pass_ui_properties_booking_time, ride_based_super_pass_table.super_pass_ui_properties_pass_name, ride_based_super_pass_table.super_pass_ui_properties_category_name, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, ride_based_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, ride_based_super_pass_table.super_pass_ui_properties_fare_infoactualFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, ride_based_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, ride_based_super_pass_table.super_pass_ui_properties_product_brandingis_visible, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, ride_based_super_pass_table.super_pass_properties_qr_code, ride_based_super_pass_table.super_pass_properties_tone, ride_based_super_pass_table.super_pass_properties_pass_id, ride_based_super_pass_table.super_pass_properties_product_type, ride_based_super_pass_table.super_pass_properties_product_sub_type, ride_based_super_pass_table.super_pass_properties_city_name, ride_based_super_pass_table.super_pass_properties_agency_name, ride_based_super_pass_table.super_pass_repurchase_properties_config_id, ride_based_super_pass_table.super_pass_repurchase_properties_category_id, ride_based_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, ride_based_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, ride_based_super_pass_table.super_pass_repurchase_properties_verification_flag, ride_based_super_pass_table.super_pass_repurchase_properties_is_renewable, ride_based_super_pass_table.super_pass_transaction_details_transaction_id, ride_based_super_pass_table.super_pass_transaction_details_payment_mode, ride_based_super_pass_table.super_pass_trip_preferences_route_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_name, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_name, ride_based_super_pass_table.super_pass_transaction_details_refund_info, ride_based_super_pass_table.super_pass_validation_properties_tier_type, ride_based_super_pass_table.super_pass_validation_properties_advance_booking_window, ride_based_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, ride_based_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, ride_based_super_pass_table.super_pass_properties_premium_bus_meta, ride_based_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM ride_based_super_pass_table WHERE super_pass_ui_properties_super_pass_user_details_full_name = ? AND super_pass_properties_city_name IN ", BaseTransacterImpl.S(collection.size()), " ORDER BY super_pass_ui_properties_booking_time ASC"), function1, collection.size() + 1, new e(this, 3));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.d.f697a.h1(new String[]{"ride_based_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.d.f697a.P0(new String[]{"ride_based_super_pass_table"}, listener);
        }

        public final String toString() {
            return "ride_based_super_pass_table.sq:getAllRideBasedSuperPassesBookedWithUserNameForCityList";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries$GetAllRideBasedSuperPassesQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllRideBasedSuperPassesQuery<T> extends Query<T> {
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
            return "ride_based_super_pass_table.sq:getAllRideBasedSuperPasses";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries$GetRecentActiveRideBasedSuperPassesQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRecentActiveRideBasedSuperPassesQuery<T> extends Query<T> {
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
            return "ride_based_super_pass_table.sq:getRecentActiveRideBasedSuperPasses";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries$GetRideBasedSuperPassCountQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRideBasedSuperPassCountQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Ride_based_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRideBasedSuperPassCountQuery(Ride_based_super_pass_tableQueries ride_based_super_pass_tableQueries, String super_pass_properties_city_name, x21 x21Var) {
            super(x21Var);
            Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
            this.c = ride_based_super_pass_tableQueries;
            this.b = super_pass_properties_city_name;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-794687666, "SELECT COUNT (DISTINCT super_pass_properties_pass_id) FROM ride_based_super_pass_table WHERE super_pass_properties_city_name = ?", function1, 1, new e(this, 4));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"ride_based_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"ride_based_super_pass_table"}, listener);
        }

        public final String toString() {
            return "ride_based_super_pass_table.sq:getRideBasedSuperPassCount";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/Ride_based_super_pass_tableQueries$GetRideBasedSuperPassQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetRideBasedSuperPassQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ Ride_based_super_pass_tableQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRideBasedSuperPassQuery(Ride_based_super_pass_tableQueries ride_based_super_pass_tableQueries, String super_pass_properties_pass_id, g31 g31Var) {
            super(g31Var);
            Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
            this.c = ride_based_super_pass_tableQueries;
            this.b = super_pass_properties_pass_id;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(110991937, "SELECT ride_based_super_pass_table.super_pass_validation_properties_max_trips_per_day, ride_based_super_pass_table.super_pass_validation_properties_num_of_trips, ride_based_super_pass_table.super_pass_validation_properties_super_pass_status, ride_based_super_pass_table.super_pass_validation_properties_start_time, ride_based_super_pass_table.super_pass_validation_properties_expiry_time, ride_based_super_pass_table.super_pass_validation_properties_active_duration, ride_based_super_pass_table.super_pass_validation_properties_ride_details_previous_ride_time_stamps, ride_based_super_pass_table.super_pass_validation_properties_ride_details_is_activation_allowed_in_current_session, ride_based_super_pass_table.super_pass_validation_properties_ride_details_oldest_history_call_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_activation_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_last_punch_time_stamp, ride_based_super_pass_table.super_pass_validation_properties_ride_details_should_check_app_reclaim, ride_based_super_pass_table.super_pass_validation_properties_is_hailing_supported, ride_based_super_pass_table.super_pass_validation_properties_service_type, ride_based_super_pass_table.super_pass_validation_properties_premium_rides_consumed, ride_based_super_pass_table.super_pass_ui_properties_max_price_per_trip, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_description, ride_based_super_pass_table.super_pass_ui_properties_num_of_days, ride_based_super_pass_table.super_pass_ui_properties_special_features, ride_based_super_pass_table.super_pass_ui_properties_proofs, ride_based_super_pass_table.super_pass_ui_properties_booking_time, ride_based_super_pass_table.super_pass_ui_properties_pass_name, ride_based_super_pass_table.super_pass_ui_properties_category_name, ride_based_super_pass_table.super_pass_ui_properties_fare_mapping_display_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_user_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_mobile_number, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_full_name, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_gender, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_date_of_birth, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_email_id, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_profile_photo, ride_based_super_pass_table.super_pass_ui_properties_fare_infopayableAmount, ride_based_super_pass_table.super_pass_ui_properties_fare_infoactualFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infoisDiscountApplicable, ride_based_super_pass_table.super_pass_ui_properties_fare_infodiscountedFare, ride_based_super_pass_table.super_pass_ui_properties_fare_infofareBreakupComponentList, ride_based_super_pass_table.super_pass_ui_properties_product_brandingis_visible, ride_based_super_pass_table.super_pass_ui_properties_super_pass_user_details_dob_in_millis, ride_based_super_pass_table.super_pass_properties_qr_code, ride_based_super_pass_table.super_pass_properties_tone, ride_based_super_pass_table.super_pass_properties_pass_id, ride_based_super_pass_table.super_pass_properties_product_type, ride_based_super_pass_table.super_pass_properties_product_sub_type, ride_based_super_pass_table.super_pass_properties_city_name, ride_based_super_pass_table.super_pass_properties_agency_name, ride_based_super_pass_table.super_pass_repurchase_properties_config_id, ride_based_super_pass_table.super_pass_repurchase_properties_category_id, ride_based_super_pass_table.super_pass_repurchase_properties_fare_mapping_id, ride_based_super_pass_table.super_pass_repurchase_properties_verification_expiry_time, ride_based_super_pass_table.super_pass_repurchase_properties_verification_flag, ride_based_super_pass_table.super_pass_repurchase_properties_is_renewable, ride_based_super_pass_table.super_pass_transaction_details_transaction_id, ride_based_super_pass_table.super_pass_transaction_details_payment_mode, ride_based_super_pass_table.super_pass_trip_preferences_route_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_start_stop_name, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_id, ride_based_super_pass_table.super_pass_trip_preferences_end_stop_name, ride_based_super_pass_table.super_pass_transaction_details_refund_info, ride_based_super_pass_table.super_pass_validation_properties_tier_type, ride_based_super_pass_table.super_pass_validation_properties_advance_booking_window, ride_based_super_pass_table.super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, ride_based_super_pass_table.super_pass_validation_properties_bulk_booking_allowed, ride_based_super_pass_table.super_pass_properties_premium_bus_meta, ride_based_super_pass_table.super_pass_ui_properties_mark_as_unlimited FROM ride_based_super_pass_table WHERE super_pass_properties_pass_id = ?", function1, 1, new e(this, 5));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"ride_based_super_pass_table"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"ride_based_super_pass_table"}, listener);
        }

        public final String toString() {
            return "ride_based_super_pass_table.sq:getRideBasedSuperPass";
        }
    }

    public Ride_based_super_pass_tableQueries(SqlDriver sqlDriver, Ride_based_super_pass_table.Adapter adapter) {
        super(sqlDriver);
        this.b = adapter;
    }

    public final Query W(String userName, String dateOfBirth, String configId, String categoryId, long j, Collection super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(userName, "userName");
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(categoryId, "categoryId");
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new FindRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery(this, userName, dateOfBirth, configId, categoryId, j, super_pass_properties_city_name, new g31(functionN, this, 1));
    }

    public final Query X(List super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new GetAllRideBasedSuperPassesAsFlowQuery(this, super_pass_properties_city_name, new g31(functionN, this, 0));
    }

    public final Query Y(Collection super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new GetAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery(this, super_pass_properties_city_name, new g31(functionN, this, 2));
    }

    public final Query Z(String userName, Collection super_pass_properties_city_name, FunctionN functionN) {
        Intrinsics.i(userName, "userName");
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new GetAllRideBasedSuperPassesBookedWithUserNameForCityListQuery(this, userName, super_pass_properties_city_name, new g31(functionN, this, 3));
    }

    public final Query a0(String super_pass_properties_pass_id, FunctionN functionN) {
        Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
        return new GetRideBasedSuperPassQuery(this, super_pass_properties_pass_id, new g31(functionN, this, 4));
    }

    public final Query b0(String super_pass_properties_city_name) {
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        return new GetRideBasedSuperPassCountQuery(this, super_pass_properties_city_name, new x21(6));
    }

    public final QueryResult c0(Ride_based_super_pass_table ride_based_super_pass_table) {
        QueryResult queryResultA0 = this.f697a.A0(1040168368, "INSERT OR REPLACE INTO ride_based_super_pass_table (super_pass_validation_properties_max_trips_per_day, super_pass_validation_properties_num_of_trips, super_pass_validation_properties_super_pass_status, super_pass_validation_properties_start_time, super_pass_validation_properties_expiry_time, super_pass_validation_properties_active_duration, super_pass_validation_properties_ride_details_previous_ride_time_stamps, super_pass_validation_properties_ride_details_is_activation_allowed_in_current_session, super_pass_validation_properties_ride_details_oldest_history_call_time_stamp, super_pass_validation_properties_ride_details_last_activation_time_stamp, super_pass_validation_properties_ride_details_last_punch_time_stamp, super_pass_validation_properties_ride_details_should_check_app_reclaim, super_pass_validation_properties_is_hailing_supported, super_pass_validation_properties_service_type, super_pass_validation_properties_premium_rides_consumed, super_pass_ui_properties_max_price_per_trip, super_pass_ui_properties_fare_mapping_description, super_pass_ui_properties_num_of_days, super_pass_ui_properties_special_features, super_pass_ui_properties_proofs, super_pass_ui_properties_booking_time, super_pass_ui_properties_pass_name, super_pass_ui_properties_category_name, super_pass_ui_properties_fare_mapping_display_name, super_pass_ui_properties_super_pass_user_details_user_id, super_pass_ui_properties_super_pass_user_details_mobile_number, super_pass_ui_properties_super_pass_user_details_full_name, super_pass_ui_properties_super_pass_user_details_gender, super_pass_ui_properties_super_pass_user_details_date_of_birth, super_pass_ui_properties_super_pass_user_details_email_id, super_pass_ui_properties_super_pass_user_details_profile_photo, super_pass_ui_properties_fare_infopayableAmount, super_pass_ui_properties_fare_infoactualFare, super_pass_ui_properties_fare_infoisDiscountApplicable, super_pass_ui_properties_fare_infodiscountedFare, super_pass_ui_properties_fare_infofareBreakupComponentList, super_pass_ui_properties_product_brandingis_visible, super_pass_ui_properties_super_pass_user_details_dob_in_millis, super_pass_properties_qr_code, super_pass_properties_tone, super_pass_properties_pass_id, super_pass_properties_product_type, super_pass_properties_product_sub_type, super_pass_properties_city_name, super_pass_properties_agency_name, super_pass_repurchase_properties_config_id, super_pass_repurchase_properties_category_id, super_pass_repurchase_properties_fare_mapping_id, super_pass_repurchase_properties_verification_expiry_time, super_pass_repurchase_properties_verification_flag, super_pass_repurchase_properties_is_renewable, super_pass_transaction_details_transaction_id, super_pass_transaction_details_payment_mode, super_pass_trip_preferences_route_id, super_pass_trip_preferences_start_stop_id, super_pass_trip_preferences_start_stop_name, super_pass_trip_preferences_end_stop_id, super_pass_trip_preferences_end_stop_name, super_pass_transaction_details_refund_info, super_pass_validation_properties_tier_type, super_pass_validation_properties_advance_booking_window, super_pass_validation_properties_allowed_number_of_days_for_bulk_booking, super_pass_validation_properties_bulk_booking_allowed, super_pass_properties_premium_bus_meta, super_pass_ui_properties_mark_as_unlimited) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new t01(18, ride_based_super_pass_table, this));
        T(1040168368, new x21(7));
        return queryResultA0;
    }
}
