package app.chalo.core.core;

import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import app.chalo.core.Instant_ticket_receipt_table;
import app.chalo.core.Instant_ticket_receipt_tableQueries;
import app.chalo.core.Instant_ticket_table;
import app.chalo.core.Instant_ticket_tableQueries;
import app.chalo.core.Last_ride_info_table;
import app.chalo.core.Last_ride_info_tableQueries;
import app.chalo.core.Magic_super_pass_table;
import app.chalo.core.Magic_super_pass_tableQueries;
import app.chalo.core.Metro_ticket_table;
import app.chalo.core.Metro_ticket_tableQueries;
import app.chalo.core.Mticket_activation_store_tableQueries;
import app.chalo.core.Multi_modal_group_ticket_child_tableQueries;
import app.chalo.core.Multi_modal_group_ticket_table;
import app.chalo.core.Multi_modal_group_ticket_tableQueries;
import app.chalo.core.Ondc_metro_ticket_table;
import app.chalo.core.Ondc_metro_ticket_tableQueries;
import app.chalo.core.Ondc_ticket_receipt_table;
import app.chalo.core.Ondc_ticket_receipt_tableQueries;
import app.chalo.core.Ondc_ticket_table;
import app.chalo.core.Ondc_ticket_tableQueries;
import app.chalo.core.Pending_super_pass_table;
import app.chalo.core.Pending_super_pass_tableQueries;
import app.chalo.core.Post_ride_feedback_tableQueries;
import app.chalo.core.Premium_reserve_ticket_ack_table;
import app.chalo.core.Premium_reserve_ticket_ack_tableQueries;
import app.chalo.core.Premium_reserve_ticket_receipt_table;
import app.chalo.core.Premium_reserve_ticket_receipt_tableQueries;
import app.chalo.core.Premium_reserve_ticket_table;
import app.chalo.core.Premium_reserve_ticket_tableQueries;
import app.chalo.core.Premium_reserve_trip_table;
import app.chalo.core.Premium_reserve_trip_tableQueries;
import app.chalo.core.Product_activation_details_tableQueries;
import app.chalo.core.Recent_location_pair_table;
import app.chalo.core.Recent_location_pair_tableQueries;
import app.chalo.core.Recent_place_table;
import app.chalo.core.Recent_place_tableQueries;
import app.chalo.core.Recent_route_table;
import app.chalo.core.Recent_route_tableQueries;
import app.chalo.core.Recent_stop_and_route_based_trip_table;
import app.chalo.core.Recent_stop_and_route_based_trip_tableQueries;
import app.chalo.core.Recent_stop_based_trip_table;
import app.chalo.core.Recent_stop_based_trip_tableQueries;
import app.chalo.core.Recent_stop_table;
import app.chalo.core.Recent_stop_tableQueries;
import app.chalo.core.Recent_trip_table;
import app.chalo.core.Recent_trip_tableQueries;
import app.chalo.core.Ride_based_super_pass_ride_details_table;
import app.chalo.core.Ride_based_super_pass_ride_details_tableQueries;
import app.chalo.core.Ride_based_super_pass_table;
import app.chalo.core.Ride_based_super_pass_tableQueries;
import app.chalo.core.Ride_booking_user_feedback_table;
import app.chalo.core.Ride_booking_user_feedback_tableQueries;
import app.chalo.core.Ride_feedback_offline_queue_tableQueries;
import app.chalo.core.Routes_table;
import app.chalo.core.Routes_tableQueries;
import app.chalo.core.Super_pass_application_table;
import app.chalo.core.Super_pass_application_tableQueries;
import app.chalo.core.Super_pass_bookings_table;
import app.chalo.core.Super_pass_bookings_tableQueries;
import app.chalo.core.Super_pass_trip_receipt_table;
import app.chalo.core.Ticket;
import app.chalo.core.TicketQueries;
import app.chalo.core.Tito_validation_table;
import app.chalo.core.Tito_validation_tableQueries;
import app.chalo.core.User_commute_preference_place_tableQueries;
import app.chalo.core.User_commute_preference_saved_ride_tableQueries;
import app.chalo.core.app_db;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/core/app_dbImpl;", "Lapp/cash/sqldelight/TransacterImpl;", "Lapp/chalo/core/app_db;", "Schema", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class app_dbImpl extends TransacterImpl implements app_db {
    public final Recent_trip_tableQueries A;
    public final Ride_based_super_pass_ride_details_tableQueries B;
    public final Ride_based_super_pass_tableQueries C;
    public final Ride_booking_user_feedback_tableQueries D;
    public final Ride_feedback_offline_queue_tableQueries E;
    public final Routes_tableQueries F;
    public final Super_pass_application_tableQueries G;
    public final Super_pass_bookings_tableQueries H;
    public final Tito_validation_tableQueries I;
    public final User_commute_preference_place_tableQueries J;
    public final User_commute_preference_saved_ride_tableQueries K;
    public final TicketQueries b;
    public final Instant_ticket_receipt_tableQueries c;
    public final Instant_ticket_tableQueries d;
    public final Last_ride_info_tableQueries e;
    public final Magic_super_pass_tableQueries f;
    public final Metro_ticket_tableQueries g;
    public final Mticket_activation_store_tableQueries h;
    public final Multi_modal_group_ticket_child_tableQueries i;
    public final Multi_modal_group_ticket_tableQueries j;
    public final Ondc_metro_ticket_tableQueries k;
    public final Ondc_ticket_receipt_tableQueries l;
    public final Ondc_ticket_tableQueries m;
    public final Pending_super_pass_tableQueries n;
    public final Post_ride_feedback_tableQueries o;
    public final Premium_reserve_ticket_ack_tableQueries p;
    public final Premium_reserve_ticket_receipt_tableQueries q;
    public final Premium_reserve_ticket_tableQueries r;
    public final Premium_reserve_trip_tableQueries s;
    public final Product_activation_details_tableQueries t;
    public final Recent_location_pair_tableQueries u;
    public final Recent_place_tableQueries v;
    public final Recent_route_tableQueries w;
    public final Recent_stop_and_route_based_trip_tableQueries x;
    public final Recent_stop_based_trip_tableQueries y;
    public final Recent_stop_tableQueries z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/core/app_dbImpl$Schema;", "Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Schema implements SqlSchema<QueryResult.Value<Unit>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Schema f2045a = new Schema();

        public static void c(SqlDriver sqlDriver, long j, long j2) {
            if (j <= 1 && j2 > 1) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS CityData (\n    type TEXT NOT NULL,\n    cityName TEXT NOT NULL,\n    data TEXT,\n    etag TEXT,\n    version INTEGER NOT NULL,\n    PRIMARY KEY (type, cityName)\n)", null);
            }
            if (j <= 2 && j2 > 2) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS CityData (\n    type TEXT NOT NULL,\n    cityName TEXT NOT NULL,\n    data TEXT,\n    etag TEXT,\n    version INTEGER NOT NULL,\n    PRIMARY KEY (type, cityName)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS RideDetails (\n    _passId TEXT NOT NULL,\n    _rideInfoList TEXT,\n    _dailyRidesCount TEXT,\n    _totalRideCount TEXT,\n    PRIMARY KEY (_passId)\n)", null);
            }
            if (j <= 3 && j2 > 3) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS CityData (\n    type TEXT NOT NULL,\n    cityName TEXT NOT NULL,\n    data TEXT,\n    etag TEXT,\n    version INTEGER NOT NULL,\n    PRIMARY KEY (type, cityName)\n)", null);
            }
            if (j <= 4 && j2 > 4) {
                sqlDriver.A0(null, "DROP TABLE IF EXISTS CityData", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS CityData (\n    type TEXT NOT NULL,\n    cityName TEXT NOT NULL,\n    mode TEXT NOT NULL,\n    dataId TEXT NOT NULL,\n    data TEXT,\n    etag TEXT,\n    version INTEGER NOT NULL,\n    PRIMARY KEY (type, cityName, mode, dataId)\n)", null);
            }
            if (j <= 6 && j2 > 6) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS super_pass_application_table (\n    city_name TEXT NOT NULL,\n    agency_name TEXT NOT NULL,\n    config_id TEXT NOT NULL,\n    category_id TEXT NOT NULL,\n    fare_mapping_id INTEGER NOT NULL,\n    fare_mapping_display_name TEXT NOT NULL,\n    pass_name TEXT NOT NULL,\n    pass_start_date INTEGER NOT NULL,\n    verification_expiry_time INTEGER NOT NULL,\n    super_pass_application_status TEXT NOT NULL,\n    proofs TEXT NOT NULL,\n    pass_application_action_required TEXT,\n    super_pass_user_details_user_id TEXT NOT NULL,\n    super_pass_user_details_mobile_number TEXT NOT NULL,\n    super_pass_user_details_full_name TEXT NOT NULL,\n    super_pass_user_details_gender TEXT NOT NULL,\n    super_pass_user_details_date_of_birth TEXT NOT NULL,\n    super_pass_user_details_email_id TEXT NOT NULL,\n    super_pass_user_details_profile_photo TEXT NOT NULL,\n    cash_payment_pending_transaction_details_pending_fare REAL,\n    cash_payment_pending_transaction_details_reference_id TEXT,\n    pass_application_rejection_reasons_proofRejectionReasonsList TEXT,\n    pass_application_rejection_reasons_profileRejectionReasonsList TEXT,\n    pass_application_rejection_reasons_generalRejectionReasonsList TEXT,\n    PRIMARY KEY (city_name, agency_name, config_id, category_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS magic_super_pass_table (\n    super_pass_properties_qr_code TEXT NOT NULL,\n    super_pass_properties_tone TEXT,\n    super_pass_properties_pass_id TEXT NOT NULL,\n    super_pass_properties_product_type TEXT NOT NULL,\n    super_pass_properties_product_sub_type TEXT NOT NULL,\n    super_pass_properties_city_name TEXT NOT NULL,\n    super_pass_properties_agency_name TEXT NOT NULL,\n    super_pass_validation_properties_super_pass_status TEXT NOT NULL,\n    super_pass_validation_properties_start_time INTEGER NOT NULL,\n    super_pass_validation_properties_expiry_time INTEGER NOT NULL,\n    super_pass_validation_properties_active_duration INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_last_activation_time_stamp INTEGER NOT NULL,\n    super_pass_ui_properties_num_of_days INTEGER NOT NULL,\n    super_pass_ui_properties_special_features TEXT NOT NULL,\n    super_pass_ui_properties_proofs TEXT NOT NULL,\n    super_pass_ui_properties_booking_time INTEGER NOT NULL,\n    super_pass_ui_properties_pass_name TEXT NOT NULL,\n    super_pass_ui_properties_category_name TEXT NOT NULL,\n    super_pass_ui_properties_fare_mapping_display_name TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_user_id TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_mobile_number TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_full_name TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_gender TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_date_of_birth TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_email_id TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_profile_photo TEXT NOT NULL,\n    super_pass_ui_properties_fare_infopayableAmount REAL NOT NULL,\n    super_pass_ui_properties_fare_infoactualFare REAL NOT NULL,\n    super_pass_ui_properties_fare_infoisDiscountApplicable INTEGER NOT NULL,\n    super_pass_ui_properties_fare_infodiscountedFare REAL NOT NULL,\n    super_pass_ui_properties_fare_infofareBreakupComponentList TEXT NOT NULL,\n    super_pass_ui_properties_product_brandingis_visible INTEGER NOT NULL,\n    super_pass_repurchase_properties_config_id TEXT NOT NULL,\n    super_pass_repurchase_properties_category_id TEXT NOT NULL,\n    super_pass_repurchase_properties_fare_mapping_id INTEGER NOT NULL,\n    super_pass_repurchase_properties_verification_expiry_time INTEGER NOT NULL,\n    super_pass_repurchase_properties_verification_flag INTEGER NOT NULL,\n    super_pass_repurchase_properties_is_renewable INTEGER NOT NULL,\n    super_pass_transaction_details_transaction_id TEXT NOT NULL,\n    super_pass_transaction_details_payment_mode TEXT NOT NULL,\n    PRIMARY KEY(super_pass_properties_pass_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS ride_based_super_pass_table (\n    super_pass_validation_properties_max_trips_per_day INTEGER NOT NULL,\n    super_pass_validation_properties_num_of_trips INTEGER NOT NULL,\n    super_pass_validation_properties_super_pass_status TEXT NOT NULL,\n    super_pass_validation_properties_start_time INTEGER NOT NULL,\n    super_pass_validation_properties_expiry_time INTEGER NOT NULL,\n    super_pass_validation_properties_active_duration INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_previous_ride_time_stamps TEXT NOT NULL,\n    super_pass_validation_properties_ride_details_is_activation_allowed_in_current_session INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_oldest_history_call_time_stamp INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_last_activation_time_stamp INTEGER NOT NULL,\n    super_pass_ui_properties_max_price_per_trip REAL NOT NULL,\n    super_pass_ui_properties_fare_mapping_description TEXT NOT NULL,\n    super_pass_ui_properties_num_of_days INTEGER NOT NULL,\n    super_pass_ui_properties_special_features TEXT NOT NULL,\n    super_pass_ui_properties_proofs TEXT NOT NULL,\n    super_pass_ui_properties_booking_time INTEGER NOT NULL,\n    super_pass_ui_properties_pass_name TEXT NOT NULL,\n    super_pass_ui_properties_category_name TEXT NOT NULL,\n    super_pass_ui_properties_fare_mapping_display_name TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_user_id TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_mobile_number TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_full_name TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_gender TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_date_of_birth TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_email_id TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_profile_photo TEXT NOT NULL,\n    super_pass_ui_properties_fare_infopayableAmount REAL NOT NULL,\n    super_pass_ui_properties_fare_infoactualFare REAL NOT NULL,\n    super_pass_ui_properties_fare_infoisDiscountApplicable INTEGER NOT NULL,\n    super_pass_ui_properties_fare_infodiscountedFare REAL NOT NULL,\n    super_pass_ui_properties_fare_infofareBreakupComponentList TEXT NOT NULL,\n    super_pass_ui_properties_product_brandingis_visible INTEGER NOT NULL,\n    super_pass_properties_qr_code TEXT NOT NULL,\n    super_pass_properties_tone TEXT,\n    super_pass_properties_pass_id TEXT NOT NULL,\n    super_pass_properties_product_type TEXT NOT NULL,\n    super_pass_properties_product_sub_type TEXT NOT NULL,\n    super_pass_properties_city_name TEXT NOT NULL,\n    super_pass_properties_agency_name TEXT NOT NULL,\n    super_pass_repurchase_properties_config_id TEXT NOT NULL,\n    super_pass_repurchase_properties_category_id TEXT NOT NULL,\n    super_pass_repurchase_properties_fare_mapping_id INTEGER NOT NULL,\n    super_pass_repurchase_properties_verification_expiry_time INTEGER NOT NULL,\n    super_pass_repurchase_properties_verification_flag INTEGER NOT NULL,\n    super_pass_repurchase_properties_is_renewable INTEGER NOT NULL,\n    super_pass_transaction_details_transaction_id TEXT NOT NULL,\n    super_pass_transaction_details_payment_mode TEXT NOT NULL,\n    PRIMARY KEY(super_pass_properties_pass_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS ride_based_super_pass_ride_details_table (\n   pass_id TEXT NOT NULL,\n    previous_ride_time_stamps TEXT NOT NULL,\n    is_activation_allowed_in_current_session INTEGER NOT NULL,\n    oldest_history_call_time_stamp INTEGER NOT NULL,\n    PRIMARY KEY(pass_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS pending_super_pass_table (\n    pending_super_pass_properties_super_pass_status TEXT NOT NULL,\n    pending_super_pass_properties_pass_id TEXT NOT NULL,\n    pending_super_pass_properties_product_type TEXT NOT NULL,\n    pending_super_pass_properties_product_sub_type TEXT NOT NULL,\n    pending_super_pass_properties_city_name TEXT NOT NULL,\n    pending_super_pass_properties_agency_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_max_price_per_trip REAL NOT NULL,\n    pending_super_pass_ui_properties_fare_mapping_description TEXT,\n    pending_super_pass_ui_properties_num_of_days INTEGER NOT NULL,\n    pending_super_pass_ui_properties_special_features TEXT NOT NULL,\n    pending_super_pass_ui_properties_proofs TEXT NOT NULL,\n    pending_super_pass_ui_properties_booking_time INTEGER NOT NULL,\n    pending_super_pass_ui_properties_pass_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_category_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_fare_mapping_display_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_user_id TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_mobile_number TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_full_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_gender TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_date_of_birth TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_email_id TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_profile_photo TEXT NOT NULL,\n    pending_super_pass_ui_properties_fare_infopayableAmount REAL NOT NULL,\n    pending_super_pass_ui_properties_fare_infoactualFare REAL NOT NULL,\n    pending_super_pass_ui_properties_fare_infoisDiscountApplicable INTEGER NOT NULL,\n    pending_super_pass_ui_properties_fare_infodiscountedFare REAL NOT NULL,\n    pending_super_pass_ui_properties_fare_infofareBreakupComponentList TEXT NOT NULL,\n    pending_super_pass_ui_properties_product_brandingis_visible INTEGER NOT NULL,\n    pending_super_pass_repurchase_properties_config_id TEXT NOT NULL,\n    pending_super_pass_repurchase_properties_category_id TEXT NOT NULL,\n    pending_super_pass_repurchase_properties_fare_mapping_id INTEGER NOT NULL,\n    pending_super_pass_repurchase_properties_start_time INTEGER NOT NULL,\n    pending_super_pass_repurchase_properties_verification_expiry_time INTEGER NOT NULL,\n    pending_super_pass_repurchase_properties_verification_flag INTEGER NOT NULL,\n    pending_super_pass_transaction_details_payment_mode TEXT NOT NULL,\n    pending_super_pass_transaction_details_transaction_id TEXT NOT NULL,\n    pending_super_pass_transaction_details_order_id TEXT,\n    PRIMARY KEY(pending_super_pass_properties_pass_id)\n)", null);
            }
            if (j <= 7 && j2 > 7) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS visual_validation_table (\n    activation_time_stamp INTEGER NOT NULL,\n    booking_id TEXT NOT NULL,\n    expiry_time INTEGER NOT NULL,\n    product_type TEXT NOT NULL,\n    city_name TEXT NOT NULL,\n    agency_name TEXT NOT NULL,\n    PRIMARY KEY(activation_time_stamp)\n)", null);
            }
            if (j <= 8 && j2 > 8) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS online_card_recharge_table (\n    payment_properties_card_recharge_transaction_id TEXT NOT NULL,\n    payment_properties_card_recharge_payment_mode TEXT NOT NULL,\n    payment_properties_card_recharge_payment_time INTEGER NOT NULL,\n    payment_properties_card_recharge_card_recharge_info_payment_status TEXT NOT NULL,\n    payment_properties_card_recharge_card_recharge_info_recharge_status TEXT NOT NULL,\n    payment_properties_card_recharge_card_recharge_info_recharge_amount INTEGER NOT NULL,\n    ui_properties_card_recharge_product_name TEXT NOT NULL,\n    ui_properties_card_recharge_branding_is_visible INTEGER NOT NULL,\n    ui_properties_card_recharge_recharge_delay_copy TEXT NOT NULL,\n    card_properties_card_recharge_card_no TEXT NOT NULL,\n    card_properties_card_recharge_city TEXT NOT NULL,\n    card_properties_card_recharge_agency TEXT NOT NULL,\n    PRIMARY KEY(payment_properties_card_recharge_transaction_id)\n)", null);
            }
            if (j <= 9 && j2 > 9) {
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_ride_details_table ADD COLUMN last_activation_time_stamp INTEGER NOT NULL DEFAULT -1", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_ride_details_table ADD COLUMN last_punch_time_stamp INTEGER NOT NULL DEFAULT -1", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_validation_properties_ride_details_last_punch_time_stamp INTEGER NOT NULL DEFAULT -1", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_ride_details_last_punch_time_stamp INTEGER  NOT NULL DEFAULT -1", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS product_activation_details_table (\n    activation_time_stamp INTEGER NOT NULL,\n    booking_id TEXT NOT NULL,\n    expiry_time INTEGER NOT NULL,\n    product_type TEXT NOT NULL,\n    product_sub_type TEXT NOT NULL,\n    city_name TEXT NOT NULL,\n    agency_name TEXT NOT NULL,\n    PRIMARY KEY(activation_time_stamp, booking_id, product_type)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS super_pass_trip_receipt_table (\n    pass_id TEXT NOT NULL,\n    product_type TEXT NOT NULL,\n    product_sub_type TEXT NOT NULL,\n    activation_time_stamp INTEGER NOT NULL,\n    punch_time_stamp INTEGER NOT NULL,\n    vehicle_no TEXT NOT NULL,\n    conductor_id TEXT NOT NULL,\n    start_stop_name TEXT NOT NULL,\n    end_stop_name TEXT NOT NULL,\n    route_name TEXT NOT NULL,\n    PRIMARY KEY(pass_id, activation_time_stamp, punch_time_stamp)\n)", null);
            }
            if (j <= 11 && j2 > 11) {
                sqlDriver.A0(null, "ALTER TABLE super_pass_trip_receipt_table ADD COLUMN special_features_list TEXT NOT NULL DEFAULT '[]'", null);
            }
            if (j <= 12 && j2 > 12) {
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_ui_properties_super_pass_user_details_dob_in_millis INTEGER NOT NULL DEFAULT -1", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_ui_properties_super_pass_user_details_dob_in_millis INTEGER  NOT NULL DEFAULT -1", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_application_table ADD COLUMN super_pass_user_details_dob_in_millis INTEGER  NOT NULL DEFAULT -1", null);
            }
            if (j <= 13 && j2 > 13) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_table (\n    userId TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    walletStatus TEXT NOT NULL,\n    balance INTEGER NOT NULL, \n    PRIMARY KEY(userId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_transaction_table (\n    transactionId TEXT NOT NULL,\n    transactionType TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    orderId TEXT NOT NULL, \n    amount INTEGER NOT NULL, \n    transactionStatus TEXT NOT NULL, \n    activationTimestamp INTEGER, \n    PRIMARY KEY(transactionId, orderId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS unsynced_quick_pay_order_table (\n    orderId TEXT NOT NULL,\n    activationTimestamp INTEGER NOT NULL,\n    activationDuration INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    walletId TEXT NOT NULL,\n    userId TEXT NOT NULL, \n    PRIMARY KEY(orderId)\n)", null);
            }
            if (j <= 14 && j2 > 14) {
                sqlDriver.A0(null, "DROP TABLE IF EXISTS wallet_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS wallet_transaction_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS unsynced_quick_pay_order_table", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_table (\n    userId TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    walletStatus TEXT NOT NULL,\n    balance INTEGER NOT NULL,\n    remainingLoadLimit INTEGER NOT NULL,\n    PRIMARY KEY(userId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_transaction_table (\n    transactionId TEXT NOT NULL,\n    transactionType TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionStatus TEXT NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS load_money_table (\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    transactionId TEXT NOT NULL,\n    status TEXT NOT NULL,\n    paymentMode TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS quick_pay_table (\n    status TEXT NOT NULL,\n    transactionId TEXT NOT NULL,\n    paymentMode TEXT NOT NULL,\n    qrCode TEXT,\n    soundTone TEXT,\n    activationTimeStamp INTEGER NOT NULL,\n    activationDuration INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    orderId TEXT NOT NULL,\n    punchTime INTEGER,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
            }
            if (j <= 15 && j2 > 15) {
                sqlDriver.A0(null, "DROP TABLE IF EXISTS wallet_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS wallet_transaction_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS load_money_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS quick_pay_table", null);
            }
            if (j <= 16 && j2 > 16) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS tito_table (\n    tapId TEXT NOT NULL,\n    tapInQRCode TEXT NOT NULL,\n    tapInGroupNo INTEGER NOT NULL,\n    firstTimeValidTapInScanTimeStamp INTEGER NOT NULL,\n    lastTapInScanTimeStamp INTEGER NOT NULL,\n    tapInRouteId TEXT NOT NULL,\n    tapInStopId TEXT NOT NULL,\n    tapInTripNo TEXT NOT NULL,\n    tapInWaybillNo INTEGER NOT NULL,\n    titoStatus TEXT NOT NULL,\n    bookingId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    productExpiryTime INTEGER NOT NULL,\n    tone TEXT NOT NULL,\n    tapOutQRCode TEXT,\n    tapOutGroupNo INTEGER,\n    lastTapOutScanTimeStamp INTEGER,\n    tapOutRouteId TEXT,\n    tapOutStopId TEXT,\n    tapOutTripNo TEXT,\n    tapOutWaybillNo INTEGER,\n    isSyncedWithServer INTEGER NOT NULL DEFAULT 0,\n    isActive INTEGER NOT NULL DEFAULT 0,\n    userId TEXT NOT NULL,\n    PRIMARY KEY(tapId)\n)", null);
            }
            if (j <= 17 && j2 > 17) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS instant_ticket_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    productName TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    punchTime INTEGER,\n    city TEXT NOT NULL,\n    qrCode TEXT,\n    tone TEXT,\n    activationExpiryTime INTEGER,\n    PRIMARY KEY(bookingId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS instant_ticket_receipt_table (\n    bookingId TEXT NOT NULL,\n    punchTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    conductorId TEXT NOT NULL,\n    startStopName TEXT NOT NULL,\n    endStopName TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    productReceiptPassengerDetails TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            }
            if (j <= 18 && j2 > 18) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS premium_reserve_ticket_table (\n    bookingId TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    ticketStatus TEXT NOT NULL,\n    paymentMode TEXT NOT NULL,\n    passIdUsedToPurchaseTicket TEXT,\n    city TEXT NOT NULL,\n    tone TEXT NOT NULL,\n    qrCode TEXT NOT NULL,\n    configurationId TEXT NOT NULL,\n    tripId TEXT NOT NULL,\n    tripStaticSlotTime INTEGER NOT NULL,\n    expectedTripStartTime INTEGER NOT NULL,\n    routeId TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    fromStopDetails TEXT NOT NULL,\n    toStopDetails TEXT NOT NULL,\n    passengerCategoryDetails TEXT NOT NULL,\n    punchTime INTEGER,\n    expiryTime INTEGER NOT NULL,\n    validationStartTime INTEGER NOT NULL,\n    PRIMARY KEY(bookingId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS premium_reserve_ticket_receipt_table (\n    bookingId TEXT NOT NULL,\n    punchTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    conductorId TEXT NOT NULL,\n    startStopName TEXT NOT NULL,\n    endStopName TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    productReceiptPassengerDetails TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS premium_reserve_ticket_cancellation_ack_table (\n    bookingId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    hasAcknowledgedCancellation INTEGER NOT NULL DEFAULT 0,\n    PRIMARY KEY(bookingId, productType, productSubType, userId)\n)", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_premium_rides_consumed INTEGER  NOT NULL DEFAULT 0", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_validation_properties_service_type TEXT NOT NULL DEFAULT '[\\\"REGULAR\\\"]'", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_service_type TEXT NOT NULL DEFAULT '[\\\"REGULAR\\\"]'", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_validation_properties_is_hailing_supported INTEGER NOT NULL DEFAULT 1", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_is_hailing_supported INTEGER NOT NULL DEFAULT 1", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_ride_details_should_check_app_reclaim INTEGER NOT NULL DEFAULT 1", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_ride_details_table ADD COLUMN should_check_app_reclaim INTEGER NOT NULL DEFAULT 1", null);
            }
            if (j <= 19 && j2 > 19) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS `premium_reserve_ticket_ack_table` (\n    `bookingId` TEXT NOT NULL,\n    `productType` TEXT NOT NULL,\n    `productSubType` TEXT NOT NULL,\n    `userId` TEXT NOT NULL,\n    `ackNeededFor` TEXT NOT NULL DEFAULT 'SYSTEM_CANCELLED',\n    `hasAcknowledged` INTEGER NOT NULL DEFAULT 0,\n    PRIMARY KEY(`bookingId`, `productType`, `productSubType`, `userId`)\n)", null);
                sqlDriver.A0(null, "INSERT INTO premium_reserve_ticket_ack_table (bookingId, productType, productSubType, userId, hasAcknowledged)\nSELECT bookingId, productType, productSubType, userId, hasAcknowledgedCancellation\nFROM premium_reserve_ticket_cancellation_ack_table", null);
                sqlDriver.A0(null, "DROP TABLE premium_reserve_ticket_cancellation_ack_table", null);
                sqlDriver.A0(null, "UPDATE premium_reserve_ticket_table SET ticketStatus = 'ACTIVE' WHERE ticketStatus = 'ACTIVATED'", null);
            }
            if (j <= 20 && j2 > 20) {
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_table ADD COLUMN isTripFeedbackCollected INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 21 && j2 > 21) {
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_table ADD COLUMN firstBookingId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_ack_table ADD COLUMN firstBookingId TEXT", null);
            }
            if (j <= 22 && j2 > 22) {
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN endStopId TEXT NOT NULL DEFAULT ''", null);
            }
            if (j <= 23 && j2 > 23) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_route_table (\n    route_id TEXT NOT NULL, \n    city_id TEXT NOT NULL, \n    route_name TEXT NOT NULL, \n    start_stop_name TEXT NOT NULL, \n    end_stop_name TEXT NOT NULL, \n    agency TEXT, \n    isAcBus INTEGER NOT NULL, \n    special_feature_list TEXT, \n    is_free_ride_available INTEGER NOT NULL, \n    transit_mode TEXT NOT NULL, \n    recents_special_entity_status TEXT NOT NULL, \n    access_time INTEGER NOT NULL, \n    access_count INTEGER NOT NULL, \n    PRIMARY KEY(route_id, city_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_stop_based_trip_table (\n    stop_based_trip_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    origin_stop TEXT NOT NULL,\n    destination_stop TEXT NOT NULL,\n    transit_mode TEXT NOT NULL,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY(stop_based_trip_id, city_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_place_table (\n    place_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    description TEXT,\n    location TEXT NOT NULL,\n    lat_lng TEXT NOT NULL,\n    recents_special_entity_status TEXT NOT NULL,\n    label TEXT,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY(place_id, city_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_stop_table (\n    stop_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    stop TEXT NOT NULL,\n    recents_special_entity_status TEXT NOT NULL,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY(stop_id, city_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_trip_table (\n    trip_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    from_location TEXT NOT NULL,\n    to_location TEXT NOT NULL,\n    transit_mode TEXT,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY(trip_id, city_id)\n)", null);
            }
            if (j <= 24 && j2 > 24) {
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_table ADD COLUMN fareNote TEXT", null);
            }
            if (j <= 25 && j2 > 25) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS routes_table (\n    version INTEGER NOT NULL DEFAULT -1,\n    cityId TEXT NOT NULL,\n    routeId TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    startStopName TEXT NOT NULL,\n    endStopName TEXT NOT NULL,\n    agencyName TEXT NOT NULL,\n    specialFeature TEXT NOT NULL DEFAULT '',\n    lastAccessedTs INTEGER NOT NULL,\n    createdAtTs INTEGER NOT NULL,\n    detailedData TEXT NOT NULL,\n    routeLiveData TEXT NOT NULL,\n    PRIMARY KEY(routeId, cityId)\n)", null);
            }
            if (j <= 26 && j2 > 26) {
                sqlDriver.A0(null, "ALTER TABLE tito_table ADD COLUMN isTITOOnConductorValidationFlow INTEGER NOT NULL DEFAULT 0", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN via TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN routeNamingScheme TEXT NOT NULL DEFAULT ''", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_trip_receipt_table ADD COLUMN via TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_trip_receipt_table ADD COLUMN routeNamingScheme TEXT NOT NULL DEFAULT ''", null);
                sqlDriver.A0(null, "ALTER TABLE recent_route_table ADD COLUMN via TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE recent_route_table ADD COLUMN routeNamingScheme TEXT NOT NULL DEFAULT ''", null);
                sqlDriver.A0(null, "ALTER TABLE routes_table ADD COLUMN via TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE routes_table ADD COLUMN routeNamingScheme TEXT NOT NULL DEFAULT ''", null);
            }
            if (j <= 27 && j2 > 27) {
                sqlDriver.A0(null, "UPDATE instant_ticket_receipt_table SET routeNamingScheme = 'DEFAULT' WHERE routeNamingScheme = ''", null);
                sqlDriver.A0(null, "UPDATE super_pass_trip_receipt_table SET routeNamingScheme = 'DEFAULT' WHERE routeNamingScheme = ''", null);
                sqlDriver.A0(null, "UPDATE recent_route_table SET routeNamingScheme = 'DEFAULT' WHERE routeNamingScheme = ''", null);
                sqlDriver.A0(null, "UPDATE routes_table SET routeNamingScheme = 'DEFAULT' WHERE routeNamingScheme = ''", null);
            }
            if (j <= 28 && j2 > 28) {
                sqlDriver.A0(null, "ALTER TABLE recent_stop_table ADD COLUMN label TEXT", null);
            }
            if (j <= 29 && j2 > 29) {
                sqlDriver.A0(null, "UPDATE recent_place_table SET recents_special_entity_status = 'FAVOURITE' WHERE recents_special_entity_status = 'HOME' OR recents_special_entity_status = 'WORK'", null);
                sqlDriver.A0(null, "UPDATE recent_stop_table SET recents_special_entity_status = 'FAVOURITE' WHERE recents_special_entity_status = 'HOME' OR recents_special_entity_status = 'WORK'", null);
                sqlDriver.A0(null, "UPDATE recent_route_table SET recents_special_entity_status = 'FAVOURITE' WHERE recents_special_entity_status = 'HOME' OR recents_special_entity_status = 'WORK'", null);
            }
            if (j <= 30 && j2 > 30) {
                sqlDriver.A0(null, "DROP TABLE IF EXISTS recent_place_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS recent_trip_table", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_place_table (\n    place_id TEXT NOT NULL,\n    search_partner TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    location_description TEXT,\n    location_title TEXT NOT NULL,\n    lat_lng TEXT NOT NULL,\n    recents_special_entity_status TEXT NOT NULL,\n    label TEXT,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY(place_id, city_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_trip_table (\n    trip_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    from_location TEXT NOT NULL,\n    to_location TEXT NOT NULL,\n    transit_mode TEXT,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY(trip_id, city_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS premium_reserve_trip_table (\n    cityId TEXT NOT NULL,\n    bookingId TEXT NOT NULL,\n    tripId TEXT NOT NULL,\n    tripStatus TEXT NOT NULL,\n    userTripEnded INTEGER NOT NULL DEFAULT 0,\n    PRIMARY KEY(bookingId)\n)", null);
            }
            if (j <= 31 && j2 > 31) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS tito_validation_table (\n    tapId TEXT NOT NULL,\n    tapInGroupNo INTEGER NOT NULL,\n    activationTSInSec INTEGER NOT NULL,\n    tapInTimestampInMillis INTEGER NOT NULL,\n    conductorValidationStaticPayload TEXT NOT NULL,\n    tapInRouteId TEXT NOT NULL,\n    tapInStopId TEXT NOT NULL,\n    tapInTripNo TEXT NOT NULL,\n    tapInWaybillNo INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    dropOffStopId TEXT,\n    titoStatus TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    bookingId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    titoRideExpiryTimeInMillis INTEGER NOT NULL,\n    tapOutGroupNo INTEGER,\n    tapOutTimestampInMillis INTEGER,\n    tapOutRouteId TEXT,\n    tapOutStopId TEXT,\n    tapOutTripNo TEXT,\n    tapOutWaybillNo INTEGER,\n    PRIMARY KEY (tapId)\n)", null);
            }
            if (j <= 32 && j2 > 32) {
                sqlDriver.A0(null, "ALTER TABLE `ride_based_super_pass_table` ADD COLUMN super_pass_trip_preferences_route_id TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `ride_based_super_pass_table` ADD COLUMN super_pass_trip_preferences_start_stop_id TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `ride_based_super_pass_table` ADD COLUMN super_pass_trip_preferences_start_stop_name TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `ride_based_super_pass_table` ADD COLUMN super_pass_trip_preferences_end_stop_id TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `ride_based_super_pass_table` ADD COLUMN super_pass_trip_preferences_end_stop_name TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `magic_super_pass_table` ADD COLUMN super_pass_trip_preferences_route_id TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `magic_super_pass_table` ADD COLUMN super_pass_trip_preferences_start_stop_id TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `magic_super_pass_table` ADD COLUMN super_pass_trip_preferences_start_stop_name TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `magic_super_pass_table` ADD COLUMN super_pass_trip_preferences_end_stop_id TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE `magic_super_pass_table` ADD COLUMN super_pass_trip_preferences_end_stop_name TEXT", null);
            }
            if (j <= 33 && j2 > 33) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS ondc_ticket_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    punchTime INTEGER,\n    city TEXT NOT NULL,\n    qrCode TEXT,\n    tone TEXT,\n    activationExpiryTime INTEGER,\n    passengerDetails TEXT,\n    routeName TEXT,\n    startStopName TEXT,\n    endStopName TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS ondc_ticket_receipt_table (\n    bookingId TEXT NOT NULL,\n    punchTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    conductorId TEXT NOT NULL,\n    startStopName TEXT NOT NULL,\n    endStopName TEXT NOT NULL,\n    endStopId TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    passengerDetails TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            }
            if (j <= 34 && j2 > 34) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS super_pass_bookings_table (\n    passId TEXT NOT NULL,\n    rideType TEXT NOT NULL,\n    activationTimeInSec INTEGER NOT NULL,\n    punchTimeInMillis INTEGER NOT NULL,\n    startStopName TEXT,\n    endStopName TEXT,\n    routeName TEXT,\n    vehicleNo TEXT,\n    conductorId TEXT,\n    via TEXT,\n    routeNamingScheme TEXT NOT NULL,\n    specialFeatures TEXT,\n    PRIMARY KEY(passId, activationTimeInSec, punchTimeInMillis)\n)", null);
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_table ADD COLUMN firstBooking TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_table ADD COLUMN prevBookingStatus TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_table ADD COLUMN refundInfo TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_table ADD COLUMN refundInfo TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE ondc_ticket_table ADD COLUMN refundInfo TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_application_table ADD COLUMN refundInfo TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE pending_super_pass_table ADD COLUMN pending_super_pass_transaction_details_refund_info TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_transaction_details_refund_info TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_transaction_details_refund_info TEXT", null);
            }
            if (j <= 35 && j2 > 35) {
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_table ADD COLUMN seats TEXT", null);
            }
            if (j <= 36 && j2 > 36) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_stop_and_route_based_trip_table (\n    id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    route_id TEXT NOT NULL,\n    route_name TEXT NOT NULL,\n    additional_route_info TEXT NOT NULL,\n    origin_stop TEXT NOT NULL,\n    destination_stop TEXT NOT NULL,\n    transit_mode TEXT NOT NULL,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY(id, city_id)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS ondc_metro_ticket_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    punchTime INTEGER,\n    city TEXT NOT NULL,\n    qrCode TEXT,\n    validationInfoEntityList TEXT,\n    tone TEXT,\n    activationExpiryTime INTEGER,\n    passengerDetails TEXT,\n    routeName TEXT,\n    startStopName TEXT,\n    endStopName TEXT,\n    refundInfo TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            }
            if (j <= 37 && j2 > 37) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS metro_ticket_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    punchTime INTEGER,\n    city TEXT NOT NULL,\n    qrCode TEXT,\n    validationInfoEntityList TEXT,\n    tone TEXT,\n    activationExpiryTime INTEGER,\n    passengerDetails TEXT,\n    routeName TEXT,\n    startStopDetails TEXT,\n    endStopDetails TEXT,\n    refundInfo TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            }
            if (j <= 38 && j2 > 38) {
                sqlDriver.A0(null, "ALTER TABLE ondc_ticket_table ADD COLUMN fareBreakup TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE ondc_ticket_table ADD COLUMN validationInfoEntityList TEXT", null);
            }
            if (j <= 39 && j2 > 39) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS recent_location_pair_table (\n    pair_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    from_endpoint TEXT NOT NULL,\n    to_endpoint TEXT NOT NULL,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY(pair_id, city_id)\n)", null);
                sqlDriver.A0(null, "ALTER TABLE ondc_ticket_table ADD COLUMN ticketColorHex TEXT", null);
            }
            if (j <= 40 && j2 > 40) {
                sqlDriver.A0(null, "UPDATE premium_reserve_ticket_table\nSET firstBooking = NULL, refundInfo = NULL, seats = NULL", null);
                sqlDriver.A0(null, "UPDATE instant_ticket_table\nSET refundInfo = NULL", null);
                sqlDriver.A0(null, "UPDATE magic_super_pass_table\nSET super_pass_transaction_details_refund_info = NULL", null);
                sqlDriver.A0(null, "UPDATE ride_based_super_pass_table\nSET super_pass_transaction_details_refund_info = NULL", null);
                sqlDriver.A0(null, "UPDATE pending_super_pass_table\nSET pending_super_pass_transaction_details_refund_info = NULL", null);
                sqlDriver.A0(null, "UPDATE super_pass_application_table\nSET refundInfo = NULL", null);
                sqlDriver.A0(null, "DELETE FROM metro_ticket_table", null);
                sqlDriver.A0(null, "DELETE FROM ondc_metro_ticket_table", null);
                sqlDriver.A0(null, "DELETE FROM ondc_ticket_table", null);
                sqlDriver.A0(null, "DELETE FROM recent_stop_and_route_based_trip_table", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS last_ride_info_table (\n    city TEXT NOT NULL,\n    lastRideInfo TEXT NOT NULL,\n    PRIMARY KEY(city)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS mticket_activation_store_table (\n    city TEXT NOT NULL,\n    mticketId TEXT NOT NULL,\n    activatedAt INTEGER NOT NULL,\n    isActivated INTEGER NOT NULL,\n    PRIMARY KEY(city, mticketId)\n)", null);
            }
            if (j <= 41 && j2 > 41) {
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_tier_type TEXT NOT NULL DEFAULT 'UNKNOWN'", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_validation_properties_tier_type TEXT NOT NULL DEFAULT 'UNKNOWN'", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_advance_booking_window INTEGER", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_validation_properties_advance_booking_window INTEGER", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_allowed_number_of_days_for_bulk_booking INTEGER", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_validation_properties_allowed_number_of_days_for_bulk_booking INTEGER", null);
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_validation_properties_bulk_booking_allowed INTEGER", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_validation_properties_bulk_booking_allowed INTEGER", null);
            }
            if (j <= 42 && j2 > 42) {
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_receipt_table ADD COLUMN refundInfo TEXT", null);
            }
            if (j <= 43 && j2 > 43) {
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_properties_premium_bus_meta TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_properties_premium_bus_meta TEXT", null);
            }
            if (j <= 44 && j2 > 44) {
                sqlDriver.A0(null, "ALTER TABLE ride_based_super_pass_table ADD COLUMN super_pass_ui_properties_mark_as_unlimited  INTEGER  NOT NULL DEFAULT 0", null);
                sqlDriver.A0(null, "ALTER TABLE magic_super_pass_table ADD COLUMN super_pass_ui_properties_mark_as_unlimited  INTEGER  NOT NULL DEFAULT 0", null);
            }
            if (j <= 45 && j2 > 45) {
                sqlDriver.A0(null, "ALTER TABLE premium_reserve_ticket_table ADD COLUMN expectedTripEndTime INTEGER NOT NULL DEFAULT -1", null);
            }
            if (j <= 46 && j2 > 46) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS user_commute_preference_place_table (\n    id TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    cityId TEXT NOT NULL,\n    tag TEXT NOT NULL,\n    label TEXT NOT NULL,\n    stopPlaceType TEXT NOT NULL,\n    stopPlaceId TEXT NOT NULL,\n    stopPlaceName TEXT NOT NULL,\n    stopAddress TEXT,\n    latitude REAL NOT NULL,\n    longitude REAL NOT NULL,\n    searchPartner TEXT NOT NULL,\n    PRIMARY KEY(id, userId, cityId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS user_commute_preference_saved_ride_table (\n    id TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    cityId TEXT NOT NULL,\n    time INTEGER NOT NULL,\n    origin TEXT NOT NULL,\n    destination TEXT NOT NULL,\n    PRIMARY KEY(id, userId, cityId)\n)", null);
            }
            if (j <= 47 && j2 > 47) {
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_table ADD COLUMN routeId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_table ADD COLUMN routeName TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_table ADD COLUMN startStopId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_table ADD COLUMN startStopName TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_table ADD COLUMN endStopId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_table ADD COLUMN endStopName TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_table ADD COLUMN passengerDetails TEXT", null);
            }
            if (j <= 48 && j2 > 48) {
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN depotName TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN etimGeneratedTicketId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN scheduleNumber TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN routeServiceType TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN driverId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN waybillNo TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN etimVersion TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE instant_ticket_receipt_table ADD COLUMN receiptFareBreakup TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN depotName TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN printedTicketId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN scheduleNumber TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN routeServiceType TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN driverId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN waybillNo TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN etimVersion TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN amount INTEGER", null);
                sqlDriver.A0(null, "ALTER TABLE super_pass_bookings_table ADD COLUMN fareData TEXT", null);
            }
            if (j <= 49 && j2 > 49) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS ride_booking_user_feedback_table (\n    bookingId TEXT NOT NULL,\n    city TEXT NOT NULL,\n    rating INTEGER NOT NULL,\n    selectedReason TEXT,\n    comments TEXT,\n    PRIMARY KEY (bookingId, city)\n)", null);
                sqlDriver.A0(null, "ALTER TABLE ride_booking_user_feedback_table ADD COLUMN subtags TEXT NOT NULL DEFAULT '[]'", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS post_ride_feedback_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    cityId TEXT NOT NULL,\n    tripId TEXT NOT NULL,\n    routeId TEXT NOT NULL,\n    fromStopName TEXT NOT NULL,\n    toStopName TEXT NOT NULL,\n    tripStartTimestamp INTEGER NOT NULL,\n    tripEndTimestamp INTEGER NOT NULL,\n    triggerType TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    fillStatus TEXT NOT NULL DEFAULT 'NOT_FILLED',\n    prfSubmittedAt INTEGER,\n    PRIMARY KEY (bookingId, userId, cityId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS ride_feedback_offline_queue_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    cityId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    rating INTEGER,\n    feedbackTag TEXT,\n    feedbackSubtag TEXT NOT NULL DEFAULT '[]',\n    comment TEXT,\n    skipped INTEGER NOT NULL DEFAULT 0,\n    submissionTimestamp INTEGER NOT NULL,\n    PRIMARY KEY (bookingId, userId, cityId)\n)", null);
            }
            if (j <= 50 && j2 > 50) {
                sqlDriver.A0(null, "ALTER TABLE ondc_metro_ticket_table ADD COLUMN journeyOverview TEXT", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS multi_modal_group_ticket_table (\n    groupId TEXT NOT NULL,\n    productName TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    city TEXT NOT NULL,\n    configurationId TEXT NOT NULL,\n    expiryTime INTEGER NOT NULL,\n    fromStopDetails TEXT NOT NULL,\n    toStopDetails TEXT NOT NULL,\n    passengerDetails TEXT NOT NULL,\n    refundInfo TEXT,\n    sequenceInfo TEXT NOT NULL,\n    expectedChildCount INTEGER NOT NULL,\n    PRIMARY KEY(groupId, userId, city)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS multi_modal_group_ticket_child_table (\n    groupId TEXT NOT NULL,\n    sequence INTEGER NOT NULL,\n    subTicketId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    PRIMARY KEY(groupId, subTicketId, productSubType)\n)", null);
            }
            if (j <= 51 && j2 > 51) {
                sqlDriver.A0(null, "ALTER TABLE multi_modal_group_ticket_table\nADD COLUMN fareDetails TEXT NOT NULL DEFAULT '[]'", null);
            }
            if (j <= 52 && j2 > 52) {
                sqlDriver.A0(null, "ALTER TABLE ondc_metro_ticket_table\nADD COLUMN paymentInfo TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE ondc_metro_ticket_table\nADD COLUMN paymentMode TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE ondc_metro_ticket_table\nADD COLUMN sellerBookingId TEXT", null);
            }
            QueryResult.f706a.getClass();
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value a(SqlDriver driver, long j, long j2, AfterVersion[] callbacks) {
            Intrinsics.i(driver, "driver");
            Intrinsics.i(callbacks, "callbacks");
            ArrayList arrayList = new ArrayList();
            for (AfterVersion afterVersion : callbacks) {
                afterVersion.getClass();
                if (j <= 0 && 0 < j2) {
                    arrayList.add(afterVersion);
                }
            }
            Iterator it = CollectionsKt.v0(new app_dbImpl$Schema$migratezeHU3Mk$$inlined$sortedBy$1(), arrayList).iterator();
            if (it.hasNext()) {
                ((AfterVersion) it.next()).getClass();
                c(driver, j, 1L);
                throw null;
            }
            if (j < j2) {
                c(driver, j, j2);
            }
            QueryResult.f706a.getClass();
            return new QueryResult.Value(Unit.f17538a);
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value b(SqlDriver driver) {
            Intrinsics.i(driver, "driver");
            driver.A0(null, "CREATE TABLE IF NOT EXISTS Ticket (\n    ticketId TEXT NOT NULL,\n    mticket__mTicketId TEXT NOT NULL,\n    mticket__userId TEXT,\n    mticket__deviceId TEXT,\n    mticket__cityName TEXT NOT NULL,\n    mticket__agency TEXT NOT NULL,\n    mticket__upTripRouteStopsInfo TEXT NOT NULL,\n    mticket__upTripRouteStopsStageInfo TEXT,\n    mticket__passengerDetails TEXT NOT NULL,\n    mticket__bookingTime INTEGER NOT NULL,\n    mticket__expirationTime INTEGER NOT NULL,\n    mticket__isExpired INTEGER NOT NULL,\n    mticket__upTripActivationTime INTEGER NOT NULL,\n    mticket__isUpTripActivated INTEGER NOT NULL,\n    mticket__upTripPunchingTime INTEGER,\n    mticket__userProfile TEXT,\n    mticket__qrCode TEXT,\n    mticket__tone TEXT,\n    mticket__mTicketConfiguration TEXT NOT NULL,\n    mticket__isFreeRide INTEGER,\n    mticket__isPaymentRequired INTEGER NOT NULL,\n    mticket__recentPaymentMethod TEXT,\n    mticket__cardDetails TEXT,\n    mticket__customerId TEXT,\n    mticket__orderId TEXT,\n    mticket__status TEXT,\n    mticket__paymentMode TEXT,\n    mticket__mticketTripReceipt TEXT,\n    PRIMARY KEY(ticketId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS instant_ticket_receipt_table (\n    bookingId TEXT NOT NULL,\n    punchTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    conductorId TEXT NOT NULL,\n    startStopName TEXT NOT NULL,\n    endStopName TEXT NOT NULL,\n    endStopId TEXT NOT NULL DEFAULT '',\n    routeName TEXT NOT NULL,\n    productReceiptPassengerDetails TEXT,\n    via TEXT,\n    routeNamingScheme TEXT NOT NULL DEFAULT 'DEFAULT',\n    depotName TEXT,\n    etimGeneratedTicketId TEXT,\n    scheduleNumber TEXT,\n    routeServiceType TEXT,\n    driverId TEXT,\n    waybillNo TEXT,\n    etimVersion TEXT,\n    receiptFareBreakup TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS instant_ticket_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    productName TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    punchTime INTEGER,\n    city TEXT NOT NULL,\n    qrCode TEXT,\n    tone TEXT,\n    activationExpiryTime INTEGER,\n    routeId TEXT,\n    routeName TEXT,\n    startStopId TEXT,\n    startStopName TEXT,\n    endStopId TEXT,\n    endStopName TEXT,\n    passengerDetails TEXT,\n    refundInfo TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS last_ride_info_table (\n    city TEXT NOT NULL,\n    lastRideInfo TEXT NOT NULL,\n    PRIMARY KEY(city)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS magic_super_pass_table (\n    super_pass_properties_qr_code TEXT NOT NULL,\n    super_pass_properties_tone TEXT,\n    super_pass_properties_pass_id TEXT NOT NULL,\n    super_pass_properties_product_type TEXT NOT NULL,\n    super_pass_properties_product_sub_type TEXT NOT NULL,\n    super_pass_properties_city_name TEXT NOT NULL,\n    super_pass_properties_agency_name TEXT NOT NULL,\n    super_pass_validation_properties_super_pass_status TEXT NOT NULL,\n    super_pass_validation_properties_start_time INTEGER NOT NULL,\n    super_pass_validation_properties_expiry_time INTEGER NOT NULL,\n    super_pass_validation_properties_active_duration INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_last_activation_time_stamp INTEGER NOT NULL,\n    super_pass_validation_properties_is_hailing_supported INTEGER NOT NULL,\n    super_pass_validation_properties_service_type TEXT NOT NULL,\n    super_pass_validation_properties_ride_details_last_punch_time_stamp INTEGER NOT NULL,\n    super_pass_ui_properties_num_of_days INTEGER NOT NULL,\n    super_pass_ui_properties_special_features TEXT NOT NULL,\n    super_pass_ui_properties_proofs TEXT NOT NULL,\n    super_pass_ui_properties_booking_time INTEGER NOT NULL,\n    super_pass_ui_properties_pass_name TEXT NOT NULL,\n    super_pass_ui_properties_category_name TEXT NOT NULL,\n    super_pass_ui_properties_fare_mapping_display_name TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_user_id TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_mobile_number TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_full_name TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_gender TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_date_of_birth TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_email_id TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_profile_photo TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_dob_in_millis INTEGER NOT NULL,\n    super_pass_ui_properties_fare_infopayableAmount REAL NOT NULL,\n    super_pass_ui_properties_fare_infoactualFare REAL NOT NULL,\n    super_pass_ui_properties_fare_infoisDiscountApplicable INTEGER NOT NULL,\n    super_pass_ui_properties_fare_infodiscountedFare REAL NOT NULL,\n    super_pass_ui_properties_fare_infofareBreakupComponentList TEXT NOT NULL,\n    super_pass_ui_properties_product_brandingis_visible INTEGER NOT NULL,\n    super_pass_repurchase_properties_config_id TEXT NOT NULL,\n    super_pass_repurchase_properties_category_id TEXT NOT NULL,\n    super_pass_repurchase_properties_fare_mapping_id INTEGER NOT NULL,\n    super_pass_repurchase_properties_verification_expiry_time INTEGER NOT NULL,\n    super_pass_repurchase_properties_verification_flag INTEGER NOT NULL,\n    super_pass_repurchase_properties_is_renewable INTEGER NOT NULL,\n    super_pass_transaction_details_transaction_id TEXT NOT NULL,\n    super_pass_transaction_details_payment_mode TEXT NOT NULL,\n    super_pass_trip_preferences_route_id TEXT,\n    super_pass_trip_preferences_start_stop_id TEXT,\n    super_pass_trip_preferences_start_stop_name TEXT,\n    super_pass_trip_preferences_end_stop_id TEXT,\n    super_pass_trip_preferences_end_stop_name TEXT,\n    super_pass_transaction_details_refund_info TEXT,\n    super_pass_validation_properties_tier_type TEXT NOT NULL,\n    super_pass_validation_properties_advance_booking_window INTEGER,\n    super_pass_validation_properties_allowed_number_of_days_for_bulk_booking INTEGER,\n    super_pass_validation_properties_bulk_booking_allowed INTEGER,\n    super_pass_properties_premium_bus_meta TEXT,\n    super_pass_ui_properties_mark_as_unlimited INTEGER,\n    PRIMARY KEY(super_pass_properties_pass_id)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS metro_ticket_table(\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    punchTime INTEGER,\n    city TEXT NOT NULL,\n    qrCode TEXT,\n    validationInfoEntityList TEXT,\n    tone TEXT,\n    activationExpiryTime INTEGER,\n    passengerDetails TEXT,\n    routeName TEXT,\n    startStopDetails TEXT,\n    endStopDetails TEXT,\n    refundInfo TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS mticket_activation_store_table (\n    city TEXT NOT NULL,\n    mticketId TEXT NOT NULL,\n    activatedAt INTEGER NOT NULL,\n    isActivated INTEGER NOT NULL,\n    PRIMARY KEY(city, mticketId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS multi_modal_group_ticket_child_table (\n    groupId TEXT NOT NULL,\n    sequence INTEGER NOT NULL,\n    subTicketId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    PRIMARY KEY(groupId, subTicketId, productSubType)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS multi_modal_group_ticket_table (\n    groupId TEXT NOT NULL,\n    productName TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    city TEXT NOT NULL,\n    configurationId TEXT NOT NULL,\n    expiryTime INTEGER NOT NULL,\n    fromStopDetails TEXT NOT NULL,\n    toStopDetails TEXT NOT NULL,\n    passengerDetails TEXT NOT NULL,\n    refundInfo TEXT,\n    sequenceInfo TEXT NOT NULL,\n    fareDetails TEXT NOT NULL,\n    expectedChildCount INTEGER NOT NULL,\n    PRIMARY KEY(groupId, userId, city)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS ondc_metro_ticket_table(\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    punchTime INTEGER,\n    city TEXT NOT NULL,\n    qrCode TEXT,\n    validationInfoEntityList TEXT,\n    tone TEXT,\n    activationExpiryTime INTEGER,\n    passengerDetails TEXT,\n    routeName TEXT,\n    startStopName TEXT,\n    endStopName TEXT,\n    refundInfo TEXT,\n    journeyOverview TEXT,\n    paymentInfo TEXT,\n    paymentMode TEXT,\n    sellerBookingId TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS ondc_ticket_receipt_table (\n    bookingId TEXT NOT NULL,\n    punchTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    conductorId TEXT NOT NULL,\n    startStopName TEXT NOT NULL,\n    endStopName TEXT NOT NULL,\n    endStopId TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    passengerDetails TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS ondc_ticket_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    punchTime INTEGER,\n    city TEXT NOT NULL,\n    qrCode TEXT,\n    tone TEXT,\n    activationExpiryTime INTEGER,\n    passengerDetails TEXT,\n    routeName TEXT,\n    startStopName TEXT,\n    endStopName TEXT,\n    refundInfo TEXT,\n    fareBreakup TEXT,\n    validationInfoEntityList TEXT,\n    ticketColorHex TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS pending_super_pass_table (\n    pending_super_pass_properties_super_pass_status TEXT NOT NULL,\n    pending_super_pass_properties_pass_id TEXT NOT NULL,\n    pending_super_pass_properties_product_type TEXT NOT NULL,\n    pending_super_pass_properties_product_sub_type TEXT NOT NULL,\n    pending_super_pass_properties_city_name TEXT NOT NULL,\n    pending_super_pass_properties_agency_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_max_price_per_trip REAL NOT NULL,\n    pending_super_pass_ui_properties_fare_mapping_description TEXT,\n    pending_super_pass_ui_properties_num_of_days INTEGER NOT NULL,\n    pending_super_pass_ui_properties_special_features TEXT NOT NULL,\n    pending_super_pass_ui_properties_proofs TEXT NOT NULL,\n    pending_super_pass_ui_properties_booking_time INTEGER NOT NULL,\n    pending_super_pass_ui_properties_pass_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_category_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_fare_mapping_display_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_user_id TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_mobile_number TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_full_name TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_gender TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_date_of_birth TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_email_id TEXT NOT NULL,\n    pending_super_pass_ui_properties_super_pass_user_details_profile_photo TEXT NOT NULL,\n    pending_super_pass_ui_properties_fare_infopayableAmount REAL NOT NULL,\n    pending_super_pass_ui_properties_fare_infoactualFare REAL NOT NULL,\n    pending_super_pass_ui_properties_fare_infoisDiscountApplicable INTEGER NOT NULL,\n    pending_super_pass_ui_properties_fare_infodiscountedFare REAL NOT NULL,\n    pending_super_pass_ui_properties_fare_infofareBreakupComponentList TEXT NOT NULL,\n    pending_super_pass_ui_properties_product_brandingis_visible INTEGER NOT NULL,\n    pending_super_pass_repurchase_properties_config_id TEXT NOT NULL,\n    pending_super_pass_repurchase_properties_category_id TEXT NOT NULL,\n    pending_super_pass_repurchase_properties_fare_mapping_id INTEGER NOT NULL,\n    pending_super_pass_repurchase_properties_start_time INTEGER NOT NULL,\n    pending_super_pass_repurchase_properties_verification_expiry_time INTEGER NOT NULL,\n    pending_super_pass_repurchase_properties_verification_flag INTEGER NOT NULL,\n    pending_super_pass_transaction_details_payment_mode TEXT NOT NULL,\n    pending_super_pass_transaction_details_transaction_id TEXT NOT NULL,\n    pending_super_pass_transaction_details_order_id TEXT,\n    pending_super_pass_transaction_details_refund_info TEXT,\n    PRIMARY KEY(pending_super_pass_properties_pass_id)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS post_ride_feedback_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    cityId TEXT NOT NULL,\n    tripId TEXT NOT NULL,\n    routeId TEXT NOT NULL,\n    fromStopName TEXT NOT NULL,\n    toStopName TEXT NOT NULL,\n    tripStartTimestamp INTEGER NOT NULL,\n    tripEndTimestamp INTEGER NOT NULL,\n    triggerType TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    fillStatus TEXT NOT NULL DEFAULT 'NOT_FILLED',\n    prfSubmittedAt INTEGER,\n    PRIMARY KEY (bookingId, userId, cityId)\n)", null);
            driver.A0(null, "CREATE TABLE premium_reserve_ticket_ack_table (\n    bookingId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    ackNeededFor TEXT NOT NULL,\n    hasAcknowledged INTEGER NOT NULL,\n    firstBookingId TEXT,\n    PRIMARY KEY (bookingId, productType, productSubType, userId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS premium_reserve_ticket_receipt_table (\n    bookingId TEXT NOT NULL,\n    punchTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    conductorId TEXT NOT NULL,\n    startStopName TEXT NOT NULL,\n    endStopName TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    productReceiptPassengerDetails TEXT,\n    refundInfo TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS premium_reserve_ticket_table (\n    bookingId TEXT NOT NULL,\n    bookingTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    ticketStatus TEXT NOT NULL,\n    paymentMode TEXT NOT NULL,\n    passIdUsedToPurchaseTicket TEXT,\n    firstBookingId TEXT,\n    city TEXT NOT NULL,\n    tone TEXT NOT NULL,\n    qrCode TEXT NOT NULL,\n    configurationId TEXT NOT NULL,\n    tripId TEXT NOT NULL,\n    tripStaticSlotTime INTEGER NOT NULL,\n    expectedTripStartTime INTEGER NOT NULL,\n    expectedTripEndTime INTEGER NOT NULL,\n    routeId TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    fromStopDetails TEXT NOT NULL,\n    toStopDetails TEXT NOT NULL,\n    isTripFeedbackCollected INTEGER NOT NULL,\n    passengerCategoryDetails TEXT NOT NULL,\n    fareNote TEXT,\n    punchTime INTEGER,\n    expiryTime INTEGER NOT NULL,\n    validationStartTime INTEGER NOT NULL,\n    firstBooking TEXT,\n    prevBookingStatus TEXT,\n    refundInfo TEXT,\n    seats TEXT,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS premium_reserve_trip_table (\n    cityId TEXT NOT NULL,\n    bookingId TEXT NOT NULL,\n    tripId TEXT NOT NULL,\n    tripStatus TEXT NOT NULL,\n    userTripEnded INTEGER NOT NULL,\n    PRIMARY KEY(bookingId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS product_activation_details_table (\n    activation_time_stamp INTEGER NOT NULL,\n    booking_id TEXT NOT NULL,\n    expiry_time INTEGER NOT NULL,\n    product_type TEXT NOT NULL,\n    product_sub_type TEXT NOT NULL,\n    city_name TEXT NOT NULL,\n    agency_name TEXT NOT NULL,\n    PRIMARY KEY(activation_time_stamp, booking_id, product_type)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS recent_location_pair_table (\n    pair_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    from_endpoint TEXT NOT NULL,\n    to_endpoint TEXT NOT NULL,\n    access_time INTEGER NOT NULL,\n    access_count INTEGER NOT NULL,\n    PRIMARY KEY (pair_id, city_id)\n)", null);
            driver.A0(null, "CREATE TABLE recent_place_table (\n    place_id TEXT NOT NULL,\n    search_partner TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    location_description TEXT,\n    location_title TEXT NOT NULL,\n    lat_lng TEXT NOT NULL,\n    recents_special_entity_status TEXT NOT NULL,\n    access_time INTEGER NOT NULL DEFAULT -1,\n    access_count INTEGER NOT NULL DEFAULT 0,\n    label TEXT,\n    PRIMARY KEY (place_id, city_id)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS recent_route_table (\n    route_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    route_name TEXT NOT NULL,\n    start_stop_name TEXT NOT NULL,\n    end_stop_name TEXT NOT NULL,\n    agency TEXT,\n    isAcBus INTEGER NOT NULL,\n    special_feature_list TEXT,\n    is_free_ride_available INTEGER NOT NULL DEFAULT 0,\n    transit_mode TEXT NOT NULL DEFAULT 'BUS',\n    recents_special_entity_status TEXT NOT NULL,\n    access_time INTEGER NOT NULL DEFAULT -1,\n    access_count INTEGER NOT NULL DEFAULT 0,\n    via TEXT,\n    routeNamingScheme TEXT NOT NULL DEFAULT 'DEFAULT',\n    PRIMARY KEY (route_id, city_id)\n)", null);
            driver.A0(null, "CREATE TABLE recent_stop_and_route_based_trip_table (\n    id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    route_id TEXT NOT NULL,\n    route_name TEXT NOT NULL,\n    additional_route_info TEXT NOT NULL,\n    origin_stop TEXT NOT NULL,\n    destination_stop TEXT NOT NULL,\n    transit_mode TEXT NOT NULL,\n    access_time INTEGER NOT NULL DEFAULT -1,\n    access_count INTEGER NOT NULL DEFAULT 0,\n    PRIMARY KEY (id, city_id)\n)", null);
            driver.A0(null, "CREATE TABLE recent_stop_based_trip_table (\n    stop_based_trip_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    origin_stop TEXT NOT NULL,\n    destination_stop TEXT NOT NULL,\n    transit_mode TEXT NOT NULL DEFAULT 'BUS',\n    access_time INTEGER NOT NULL DEFAULT -1,\n    access_count INTEGER NOT NULL DEFAULT 0,\n    PRIMARY KEY (stop_based_trip_id, city_id)\n)", null);
            driver.A0(null, "CREATE TABLE recent_stop_table (\n    stop_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    stop TEXT NOT NULL,\n    recents_special_entity_status TEXT NOT NULL,\n    access_time INTEGER NOT NULL DEFAULT -1,\n    access_count INTEGER NOT NULL DEFAULT 0,\n    label TEXT,\n    PRIMARY KEY (stop_id, city_id)\n)", null);
            driver.A0(null, "CREATE TABLE recent_trip_table (\n    trip_id TEXT NOT NULL,\n    city_id TEXT NOT NULL,\n    from_location TEXT NOT NULL,\n    to_location TEXT NOT NULL,\n    transit_mode TEXT,\n    access_time INTEGER NOT NULL DEFAULT -1,\n    access_count INTEGER NOT NULL DEFAULT 0,\n    PRIMARY KEY (trip_id, city_id)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS ride_based_super_pass_ride_details_table (\n    pass_id TEXT NOT NULL,\n    previous_ride_time_stamps TEXT NOT NULL,\n    is_activation_allowed_in_current_session INTEGER NOT NULL,\n    oldest_history_call_time_stamp INTEGER NOT NULL,\n    should_check_app_reclaim INTEGER NOT NULL,\n    last_activation_time_stamp INTEGER NOT NULL,\n    last_punch_time_stamp INTEGER NOT NULL,\n    PRIMARY KEY(pass_id)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS ride_based_super_pass_table (\n    super_pass_validation_properties_max_trips_per_day INTEGER NOT NULL,\n    super_pass_validation_properties_num_of_trips INTEGER NOT NULL,\n    super_pass_validation_properties_super_pass_status TEXT NOT NULL,\n    super_pass_validation_properties_start_time INTEGER NOT NULL,\n    super_pass_validation_properties_expiry_time INTEGER NOT NULL,\n    super_pass_validation_properties_active_duration INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_previous_ride_time_stamps TEXT NOT NULL,\n    super_pass_validation_properties_ride_details_is_activation_allowed_in_current_session INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_oldest_history_call_time_stamp INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_last_activation_time_stamp INTEGER NOT NULL,\n    super_pass_validation_properties_ride_details_last_punch_time_stamp INTEGER  NOT NULL,\n    super_pass_validation_properties_ride_details_should_check_app_reclaim INTEGER NOT NULL,\n    super_pass_validation_properties_is_hailing_supported INTEGER NOT NULL,\n    super_pass_validation_properties_service_type TEXT NOT NULL,\n    super_pass_validation_properties_premium_rides_consumed INTEGER  NOT NULL,\n    super_pass_ui_properties_max_price_per_trip REAL NOT NULL,\n    super_pass_ui_properties_fare_mapping_description TEXT NOT NULL,\n    super_pass_ui_properties_num_of_days INTEGER NOT NULL,\n    super_pass_ui_properties_special_features TEXT NOT NULL,\n    super_pass_ui_properties_proofs TEXT NOT NULL,\n    super_pass_ui_properties_booking_time INTEGER NOT NULL,\n    super_pass_ui_properties_pass_name TEXT NOT NULL,\n    super_pass_ui_properties_category_name TEXT NOT NULL,\n    super_pass_ui_properties_fare_mapping_display_name TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_user_id TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_mobile_number TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_full_name TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_gender TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_date_of_birth TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_email_id TEXT NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_profile_photo TEXT NOT NULL,\n    super_pass_ui_properties_fare_infopayableAmount REAL NOT NULL,\n    super_pass_ui_properties_fare_infoactualFare REAL NOT NULL,\n    super_pass_ui_properties_fare_infoisDiscountApplicable INTEGER NOT NULL,\n    super_pass_ui_properties_fare_infodiscountedFare REAL NOT NULL,\n    super_pass_ui_properties_fare_infofareBreakupComponentList TEXT NOT NULL,\n    super_pass_ui_properties_product_brandingis_visible INTEGER NOT NULL,\n    super_pass_ui_properties_super_pass_user_details_dob_in_millis INTEGER  NOT NULL,\n    super_pass_properties_qr_code TEXT NOT NULL,\n    super_pass_properties_tone TEXT,\n    super_pass_properties_pass_id TEXT NOT NULL,\n    super_pass_properties_product_type TEXT NOT NULL,\n    super_pass_properties_product_sub_type TEXT NOT NULL,\n    super_pass_properties_city_name TEXT NOT NULL,\n    super_pass_properties_agency_name TEXT NOT NULL,\n    super_pass_repurchase_properties_config_id TEXT NOT NULL,\n    super_pass_repurchase_properties_category_id TEXT NOT NULL,\n    super_pass_repurchase_properties_fare_mapping_id INTEGER NOT NULL,\n    super_pass_repurchase_properties_verification_expiry_time INTEGER NOT NULL,\n    super_pass_repurchase_properties_verification_flag INTEGER NOT NULL,\n    super_pass_repurchase_properties_is_renewable INTEGER NOT NULL,\n    super_pass_transaction_details_transaction_id TEXT NOT NULL,\n    super_pass_transaction_details_payment_mode TEXT NOT NULL,\n    super_pass_trip_preferences_route_id TEXT,\n    super_pass_trip_preferences_start_stop_id TEXT,\n    super_pass_trip_preferences_start_stop_name TEXT,\n    super_pass_trip_preferences_end_stop_id TEXT,\n    super_pass_trip_preferences_end_stop_name TEXT,\n    super_pass_transaction_details_refund_info TEXT,\n    super_pass_validation_properties_tier_type TEXT NOT NULL,\n    super_pass_validation_properties_advance_booking_window INTEGER,\n    super_pass_validation_properties_allowed_number_of_days_for_bulk_booking INTEGER,\n    super_pass_validation_properties_bulk_booking_allowed INTEGER,\n    super_pass_properties_premium_bus_meta TEXT,\n    super_pass_ui_properties_mark_as_unlimited INTEGER,\n    PRIMARY KEY(super_pass_properties_pass_id)\n)", null);
            driver.A0(null, "CREATE TABLE ride_booking_user_feedback_table (\n    bookingId TEXT NOT NULL,\n    city TEXT NOT NULL,\n    rating INTEGER NOT NULL,\n    selectedReason TEXT,\n    comments TEXT,\n    subtags TEXT NOT NULL DEFAULT '[]',\n    PRIMARY KEY (bookingId, city)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS ride_feedback_offline_queue_table (\n    bookingId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    cityId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    rating INTEGER,\n    feedbackTag TEXT,\n    feedbackSubtag TEXT NOT NULL DEFAULT '[]',\n    comment TEXT,\n    skipped INTEGER NOT NULL DEFAULT 0,\n    submissionTimestamp INTEGER NOT NULL,\n    PRIMARY KEY (bookingId, userId, cityId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS routes_table (\n    version INTEGER NOT NULL,\n    cityId TEXT NOT NULL,\n    routeId TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    startStopName TEXT NOT NULL,\n    endStopName TEXT NOT NULL,\n    agencyName TEXT NOT NULL,\n    specialFeature TEXT NOT NULL,\n    lastAccessedTs INTEGER NOT NULL,\n    createdAtTs INTEGER NOT NULL,\n    routeLiveData TEXT NOT NULL,\n    detailedData TEXT NOT NULL,\n    via TEXT,\n    routeNamingScheme TEXT NOT NULL DEFAULT 'DEFAULT',\n    PRIMARY KEY (routeId, cityId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS super_pass_application_table (\n    city_name TEXT NOT NULL,\n    agency_name TEXT NOT NULL,\n    config_id TEXT NOT NULL,\n    category_id TEXT NOT NULL,\n    fare_mapping_id INTEGER NOT NULL,\n    fare_mapping_display_name TEXT NOT NULL,\n    pass_name TEXT NOT NULL,\n    pass_start_date INTEGER NOT NULL,\n    verification_expiry_time INTEGER NOT NULL,\n    super_pass_application_status TEXT NOT NULL,\n    proofs TEXT NOT NULL,\n    pass_application_action_required TEXT,\n    super_pass_user_details_user_id TEXT NOT NULL,\n    super_pass_user_details_mobile_number TEXT NOT NULL,\n    super_pass_user_details_full_name TEXT NOT NULL,\n    super_pass_user_details_gender TEXT NOT NULL,\n    super_pass_user_details_date_of_birth TEXT NOT NULL,\n    super_pass_user_details_email_id TEXT NOT NULL,\n    super_pass_user_details_profile_photo TEXT NOT NULL,\n    super_pass_user_details_dob_in_millis INTEGER  NOT NULL,\n    cash_payment_pending_transaction_details_pending_fare REAL,\n    cash_payment_pending_transaction_details_reference_id TEXT,\n    pass_application_rejection_reasons_proofRejectionReasonsList TEXT,\n    pass_application_rejection_reasons_profileRejectionReasonsList TEXT,\n    pass_application_rejection_reasons_generalRejectionReasonsList TEXT,\n    refundInfo TEXT,\n    PRIMARY KEY (city_name, agency_name, config_id, category_id)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS super_pass_bookings_table (\n    passId TEXT NOT NULL,\n    rideType TEXT NOT NULL,\n    activationTimeInSec INTEGER NOT NULL,\n    punchTimeInMillis INTEGER NOT NULL,\n    startStopName TEXT,\n    endStopName TEXT,\n    routeName TEXT,\n    vehicleNo TEXT,\n    conductorId TEXT,\n    via TEXT,\n    routeNamingScheme TEXT NOT NULL DEFAULT 'DEFAULT',\n    specialFeatures TEXT,\n    depotName TEXT,\n    printedTicketId TEXT,\n    scheduleNumber TEXT,\n    routeServiceType TEXT,\n    driverId TEXT,\n    waybillNo TEXT,\n    etimVersion TEXT,\n    amount INTEGER,\n    fareData TEXT,\n    PRIMARY KEY(passId, activationTimeInSec, punchTimeInMillis)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS super_pass_trip_receipt_table (\n    pass_id TEXT NOT NULL,\n    product_type TEXT NOT NULL,\n    product_sub_type TEXT NOT NULL,\n    activation_time_stamp INTEGER NOT NULL,\n    punch_time_stamp INTEGER NOT NULL,\n    vehicle_no TEXT NOT NULL,\n    conductor_id TEXT NOT NULL,\n    start_stop_name TEXT NOT NULL,\n    end_stop_name TEXT NOT NULL,\n    route_name TEXT NOT NULL,\n    special_features_list TEXT NOT NULL DEFAULT '[]',\n    via TEXT,\n    routeNamingScheme TEXT NOT NULL DEFAULT 'DEFAULT',\n    PRIMARY KEY(pass_id, activation_time_stamp, punch_time_stamp)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS tito_validation_table (\n    tapId TEXT NOT NULL,\n    tapInGroupNo INTEGER NOT NULL,\n    activationTSInSec INTEGER NOT NULL,\n    tapInTimestampInMillis INTEGER NOT NULL,\n    conductorValidationStaticPayload TEXT NOT NULL,\n    tapInRouteId TEXT NOT NULL,\n    tapInStopId TEXT NOT NULL,\n    tapInTripNo TEXT NOT NULL,\n    tapInWaybillNo INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    dropOffStopId TEXT,\n    titoStatus TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    bookingId TEXT NOT NULL,\n    productType TEXT NOT NULL,\n    productSubType TEXT NOT NULL,\n    titoRideExpiryTimeInMillis INTEGER NOT NULL,\n    tapOutGroupNo INTEGER,\n    tapOutTimestampInMillis INTEGER,\n    tapOutRouteId TEXT,\n    tapOutStopId TEXT,\n    tapOutTripNo TEXT,\n    tapOutWaybillNo INTEGER,\n    PRIMARY KEY(tapId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS user_commute_preference_place_table (\n    id TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    cityId TEXT NOT NULL,\n    tag TEXT NOT NULL,\n    label TEXT NOT NULL,\n    stopPlaceType TEXT NOT NULL,\n    stopPlaceId TEXT NOT NULL,\n    stopPlaceName TEXT NOT NULL,\n    stopAddress TEXT,\n    latitude REAL NOT NULL,\n    longitude REAL NOT NULL,\n    searchPartner TEXT NOT NULL,\n    PRIMARY KEY(id, userId, cityId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS user_commute_preference_saved_ride_table (\n    id TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    cityId TEXT NOT NULL,\n    time INTEGER NOT NULL,\n    origin TEXT NOT NULL,\n    destination TEXT NOT NULL,\n    PRIMARY KEY(id, userId, cityId)\n)", null);
            QueryResult.f706a.getClass();
            return new QueryResult.Value(Unit.f17538a);
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final long getVersion() {
            return 53L;
        }
    }

    public app_dbImpl(SqlDriver sqlDriver, Ticket.Adapter adapter, Instant_ticket_receipt_table.Adapter adapter2, Instant_ticket_table.Adapter adapter3, Last_ride_info_table.Adapter adapter4, Magic_super_pass_table.Adapter adapter5, Metro_ticket_table.Adapter adapter6, Multi_modal_group_ticket_table.Adapter adapter7, Ondc_metro_ticket_table.Adapter adapter8, Ondc_ticket_receipt_table.Adapter adapter9, Ondc_ticket_table.Adapter adapter10, Pending_super_pass_table.Adapter adapter11, Premium_reserve_ticket_ack_table.Adapter adapter12, Premium_reserve_ticket_receipt_table.Adapter adapter13, Premium_reserve_ticket_table.Adapter adapter14, Premium_reserve_trip_table.Adapter adapter15, Recent_location_pair_table.Adapter adapter16, Recent_place_table.Adapter adapter17, Recent_route_table.Adapter adapter18, Recent_stop_and_route_based_trip_table.Adapter adapter19, Recent_stop_based_trip_table.Adapter adapter20, Recent_stop_table.Adapter adapter21, Recent_trip_table.Adapter adapter22, Ride_based_super_pass_ride_details_table.Adapter adapter23, Ride_based_super_pass_table.Adapter adapter24, Ride_booking_user_feedback_table.Adapter adapter25, Routes_table.Adapter adapter26, Super_pass_application_table.Adapter adapter27, Super_pass_bookings_table.Adapter adapter28, Super_pass_trip_receipt_table.Adapter adapter29, Tito_validation_table.Adapter adapter30) {
        super(sqlDriver);
        this.b = new TicketQueries(sqlDriver, adapter);
        this.c = new Instant_ticket_receipt_tableQueries(sqlDriver, adapter2);
        this.d = new Instant_ticket_tableQueries(sqlDriver, adapter3);
        this.e = new Last_ride_info_tableQueries(sqlDriver, adapter4);
        this.f = new Magic_super_pass_tableQueries(sqlDriver, adapter5);
        this.g = new Metro_ticket_tableQueries(sqlDriver, adapter6);
        this.h = new Mticket_activation_store_tableQueries(sqlDriver);
        this.i = new Multi_modal_group_ticket_child_tableQueries(sqlDriver);
        this.j = new Multi_modal_group_ticket_tableQueries(sqlDriver, adapter7);
        this.k = new Ondc_metro_ticket_tableQueries(sqlDriver, adapter8);
        this.l = new Ondc_ticket_receipt_tableQueries(sqlDriver, adapter9);
        this.m = new Ondc_ticket_tableQueries(sqlDriver, adapter10);
        this.n = new Pending_super_pass_tableQueries(sqlDriver, adapter11);
        this.o = new Post_ride_feedback_tableQueries(sqlDriver);
        this.p = new Premium_reserve_ticket_ack_tableQueries(sqlDriver, adapter12);
        this.q = new Premium_reserve_ticket_receipt_tableQueries(sqlDriver, adapter13);
        this.r = new Premium_reserve_ticket_tableQueries(sqlDriver, adapter14, adapter12);
        this.s = new Premium_reserve_trip_tableQueries(sqlDriver, adapter15);
        this.t = new Product_activation_details_tableQueries(sqlDriver, adapter29);
        this.u = new Recent_location_pair_tableQueries(sqlDriver, adapter16);
        this.v = new Recent_place_tableQueries(sqlDriver, adapter17);
        this.w = new Recent_route_tableQueries(sqlDriver, adapter18);
        this.x = new Recent_stop_and_route_based_trip_tableQueries(sqlDriver, adapter19);
        this.y = new Recent_stop_based_trip_tableQueries(sqlDriver, adapter20);
        this.z = new Recent_stop_tableQueries(sqlDriver, adapter21);
        this.A = new Recent_trip_tableQueries(sqlDriver, adapter22);
        this.B = new Ride_based_super_pass_ride_details_tableQueries(sqlDriver, adapter23);
        this.C = new Ride_based_super_pass_tableQueries(sqlDriver, adapter24);
        this.D = new Ride_booking_user_feedback_tableQueries(sqlDriver, adapter25);
        this.E = new Ride_feedback_offline_queue_tableQueries(sqlDriver);
        this.F = new Routes_tableQueries(sqlDriver, adapter26);
        this.G = new Super_pass_application_tableQueries(sqlDriver, adapter27);
        this.H = new Super_pass_bookings_tableQueries(sqlDriver, adapter28);
        this.I = new Tito_validation_tableQueries(sqlDriver, adapter30);
        this.J = new User_commute_preference_place_tableQueries(sqlDriver);
        this.K = new User_commute_preference_saved_ride_tableQueries(sqlDriver);
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: A, reason: from getter */
    public final Product_activation_details_tableQueries getT() {
        return this.t;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: B, reason: from getter */
    public final Metro_ticket_tableQueries getG() {
        return this.g;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: C, reason: from getter */
    public final User_commute_preference_place_tableQueries getJ() {
        return this.J;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: D, reason: from getter */
    public final Instant_ticket_tableQueries getD() {
        return this.d;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: E, reason: from getter */
    public final Recent_place_tableQueries getV() {
        return this.v;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: F, reason: from getter */
    public final Premium_reserve_ticket_tableQueries getR() {
        return this.r;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: G, reason: from getter */
    public final Ride_based_super_pass_tableQueries getC() {
        return this.C;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: H, reason: from getter */
    public final Ride_booking_user_feedback_tableQueries getD() {
        return this.D;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: I, reason: from getter */
    public final Premium_reserve_trip_tableQueries getS() {
        return this.s;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: K, reason: from getter */
    public final Multi_modal_group_ticket_child_tableQueries getI() {
        return this.i;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: M, reason: from getter */
    public final Super_pass_application_tableQueries getG() {
        return this.G;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: N, reason: from getter */
    public final Instant_ticket_receipt_tableQueries getC() {
        return this.c;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: O, reason: from getter */
    public final Super_pass_bookings_tableQueries getH() {
        return this.H;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: P, reason: from getter */
    public final User_commute_preference_saved_ride_tableQueries getK() {
        return this.K;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Ride_feedback_offline_queue_tableQueries getE() {
        return this.E;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Recent_stop_tableQueries getZ() {
        return this.z;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Recent_location_pair_tableQueries getU() {
        return this.u;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Premium_reserve_ticket_ack_tableQueries getP() {
        return this.p;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Recent_stop_and_route_based_trip_tableQueries getX() {
        return this.x;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Mticket_activation_store_tableQueries getH() {
        return this.h;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Premium_reserve_ticket_receipt_tableQueries getQ() {
        return this.q;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Last_ride_info_tableQueries getE() {
        return this.e;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Magic_super_pass_tableQueries getF() {
        return this.f;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Ondc_ticket_tableQueries getM() {
        return this.m;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Multi_modal_group_ticket_tableQueries getJ() {
        return this.j;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Recent_trip_tableQueries getA() {
        return this.A;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Ondc_metro_ticket_tableQueries getK() {
        return this.k;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Tito_validation_tableQueries getI() {
        return this.I;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Recent_stop_based_trip_tableQueries getY() {
        return this.y;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: s, reason: from getter */
    public final Pending_super_pass_tableQueries getN() {
        return this.n;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: t, reason: from getter */
    public final Ondc_ticket_receipt_tableQueries getL() {
        return this.l;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: v, reason: from getter */
    public final Recent_route_tableQueries getW() {
        return this.w;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: w, reason: from getter */
    public final Routes_tableQueries getF() {
        return this.F;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: x, reason: from getter */
    public final Ride_based_super_pass_ride_details_tableQueries getB() {
        return this.B;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: y, reason: from getter */
    public final TicketQueries getB() {
        return this.b;
    }

    @Override // app.chalo.core.app_db
    /* JADX INFO: renamed from: z, reason: from getter */
    public final Post_ride_feedback_tableQueries getO() {
        return this.o;
    }
}
