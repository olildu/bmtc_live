package app.chalo.core;

import app.cash.sqldelight.Transacter;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/app_db;", "Lapp/cash/sqldelight/Transacter;", "Companion", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface app_db extends Transacter {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/app_db$Companion;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: A */
    Product_activation_details_tableQueries getT();

    /* JADX INFO: renamed from: B */
    Metro_ticket_tableQueries getG();

    /* JADX INFO: renamed from: C */
    User_commute_preference_place_tableQueries getJ();

    /* JADX INFO: renamed from: D */
    Instant_ticket_tableQueries getD();

    /* JADX INFO: renamed from: E */
    Recent_place_tableQueries getV();

    /* JADX INFO: renamed from: F */
    Premium_reserve_ticket_tableQueries getR();

    /* JADX INFO: renamed from: G */
    Ride_based_super_pass_tableQueries getC();

    /* JADX INFO: renamed from: H */
    Ride_booking_user_feedback_tableQueries getD();

    /* JADX INFO: renamed from: I */
    Premium_reserve_trip_tableQueries getS();

    /* JADX INFO: renamed from: K */
    Multi_modal_group_ticket_child_tableQueries getI();

    /* JADX INFO: renamed from: M */
    Super_pass_application_tableQueries getG();

    /* JADX INFO: renamed from: N */
    Instant_ticket_receipt_tableQueries getC();

    /* JADX INFO: renamed from: O */
    Super_pass_bookings_tableQueries getH();

    /* JADX INFO: renamed from: P */
    User_commute_preference_saved_ride_tableQueries getK();

    /* JADX INFO: renamed from: Q */
    Ride_feedback_offline_queue_tableQueries getE();

    /* JADX INFO: renamed from: a */
    Recent_stop_tableQueries getZ();

    /* JADX INFO: renamed from: b */
    Recent_location_pair_tableQueries getU();

    /* JADX INFO: renamed from: c */
    Premium_reserve_ticket_ack_tableQueries getP();

    /* JADX INFO: renamed from: d */
    Recent_stop_and_route_based_trip_tableQueries getX();

    /* JADX INFO: renamed from: e */
    Mticket_activation_store_tableQueries getH();

    /* JADX INFO: renamed from: f */
    Premium_reserve_ticket_receipt_tableQueries getQ();

    /* JADX INFO: renamed from: g */
    Last_ride_info_tableQueries getE();

    /* JADX INFO: renamed from: h */
    Magic_super_pass_tableQueries getF();

    /* JADX INFO: renamed from: i */
    Ondc_ticket_tableQueries getM();

    /* JADX INFO: renamed from: j */
    Multi_modal_group_ticket_tableQueries getJ();

    /* JADX INFO: renamed from: k */
    Recent_trip_tableQueries getA();

    /* JADX INFO: renamed from: l */
    Ondc_metro_ticket_tableQueries getK();

    /* JADX INFO: renamed from: o */
    Tito_validation_tableQueries getI();

    /* JADX INFO: renamed from: p */
    Recent_stop_based_trip_tableQueries getY();

    /* JADX INFO: renamed from: s */
    Pending_super_pass_tableQueries getN();

    /* JADX INFO: renamed from: t */
    Ondc_ticket_receipt_tableQueries getL();

    /* JADX INFO: renamed from: v */
    Recent_route_tableQueries getW();

    /* JADX INFO: renamed from: w */
    Routes_tableQueries getF();

    /* JADX INFO: renamed from: x */
    Ride_based_super_pass_ride_details_tableQueries getB();

    /* JADX INFO: renamed from: y */
    TicketQueries getB();

    /* JADX INFO: renamed from: z */
    Post_ride_feedback_tableQueries getO();
}
