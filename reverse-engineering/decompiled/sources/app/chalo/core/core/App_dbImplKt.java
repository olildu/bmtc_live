package app.chalo.core.core;

import app.cash.sqldelight.db.SqlDriver;
import app.chalo.core.Instant_ticket_receipt_table;
import app.chalo.core.Instant_ticket_table;
import app.chalo.core.Last_ride_info_table;
import app.chalo.core.Magic_super_pass_table;
import app.chalo.core.Metro_ticket_table;
import app.chalo.core.Multi_modal_group_ticket_table;
import app.chalo.core.Ondc_metro_ticket_table;
import app.chalo.core.Ondc_ticket_receipt_table;
import app.chalo.core.Ondc_ticket_table;
import app.chalo.core.Pending_super_pass_table;
import app.chalo.core.Premium_reserve_ticket_ack_table;
import app.chalo.core.Premium_reserve_ticket_receipt_table;
import app.chalo.core.Premium_reserve_ticket_table;
import app.chalo.core.Premium_reserve_trip_table;
import app.chalo.core.Recent_location_pair_table;
import app.chalo.core.Recent_place_table;
import app.chalo.core.Recent_route_table;
import app.chalo.core.Recent_stop_and_route_based_trip_table;
import app.chalo.core.Recent_stop_based_trip_table;
import app.chalo.core.Recent_stop_table;
import app.chalo.core.Recent_trip_table;
import app.chalo.core.Ride_based_super_pass_ride_details_table;
import app.chalo.core.Ride_based_super_pass_table;
import app.chalo.core.Ride_booking_user_feedback_table;
import app.chalo.core.Routes_table;
import app.chalo.core.Super_pass_application_table;
import app.chalo.core.Super_pass_bookings_table;
import app.chalo.core.Super_pass_trip_receipt_table;
import app.chalo.core.Ticket;
import app.chalo.core.Tito_validation_table;
import app.chalo.core.app_db;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassReference;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class App_dbImplKt {
    public static final app_db a(ClassReference classReference, SqlDriver sqlDriver, Ticket.Adapter adapter, Instant_ticket_receipt_table.Adapter adapter2, Instant_ticket_table.Adapter adapter3, Last_ride_info_table.Adapter adapter4, Magic_super_pass_table.Adapter adapter5, Metro_ticket_table.Adapter adapter6, Multi_modal_group_ticket_table.Adapter adapter7, Ondc_metro_ticket_table.Adapter adapter8, Ondc_ticket_receipt_table.Adapter adapter9, Ondc_ticket_table.Adapter adapter10, Pending_super_pass_table.Adapter adapter11, Premium_reserve_ticket_ack_table.Adapter adapter12, Premium_reserve_ticket_receipt_table.Adapter adapter13, Premium_reserve_ticket_table.Adapter adapter14, Premium_reserve_trip_table.Adapter adapter15, Recent_location_pair_table.Adapter adapter16, Recent_place_table.Adapter adapter17, Recent_route_table.Adapter adapter18, Recent_stop_and_route_based_trip_table.Adapter adapter19, Recent_stop_based_trip_table.Adapter adapter20, Recent_stop_table.Adapter adapter21, Recent_trip_table.Adapter adapter22, Ride_based_super_pass_ride_details_table.Adapter adapter23, Ride_based_super_pass_table.Adapter adapter24, Ride_booking_user_feedback_table.Adapter adapter25, Routes_table.Adapter adapter26, Super_pass_application_table.Adapter adapter27, Super_pass_bookings_table.Adapter adapter28, Super_pass_trip_receipt_table.Adapter adapter29, Tito_validation_table.Adapter adapter30) {
        return new app_dbImpl(sqlDriver, adapter, adapter2, adapter3, adapter4, adapter5, adapter6, adapter7, adapter8, adapter9, adapter10, adapter11, adapter12, adapter13, adapter14, adapter15, adapter16, adapter17, adapter18, adapter19, adapter20, adapter21, adapter22, adapter23, adapter24, adapter25, adapter26, adapter27, adapter28, adapter29, adapter30);
    }
}
