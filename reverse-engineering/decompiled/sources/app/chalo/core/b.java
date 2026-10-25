package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.SqlPreparedStatement;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2026a;
    public final /* synthetic */ Query b;

    public /* synthetic */ b(Query query, int i) {
        this.f2026a = i;
        this.b = query;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2026a) {
            case 0:
                Ondc_metro_ticket_tableQueries.GetMetroTicketQuery getMetroTicketQuery = (Ondc_metro_ticket_tableQueries.GetMetroTicketQuery) this.b;
                SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery, "$this$executeQuery");
                executeQuery.bindString(0, getMetroTicketQuery.b);
                executeQuery.bindString(1, getMetroTicketQuery.c);
                break;
            case 1:
                Ondc_ticket_receipt_tableQueries.GetOndcTicketReceiptFlowQuery getOndcTicketReceiptFlowQuery = (Ondc_ticket_receipt_tableQueries.GetOndcTicketReceiptFlowQuery) this.b;
                SqlPreparedStatement executeQuery2 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery2, "$this$executeQuery");
                executeQuery2.bindString(0, getOndcTicketReceiptFlowQuery.b);
                break;
            case 2:
                Ondc_ticket_tableQueries.GetAllOndcTicketsAsFlowQuery getAllOndcTicketsAsFlowQuery = (Ondc_ticket_tableQueries.GetAllOndcTicketsAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery3 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery3, "$this$executeQuery");
                executeQuery3.bindString(0, getAllOndcTicketsAsFlowQuery.b);
                executeQuery3.bindString(1, getAllOndcTicketsAsFlowQuery.c);
                break;
            case 3:
                Ondc_ticket_tableQueries.GetAllOndcTicketsQuery getAllOndcTicketsQuery = (Ondc_ticket_tableQueries.GetAllOndcTicketsQuery) this.b;
                SqlPreparedStatement executeQuery4 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery4, "$this$executeQuery");
                executeQuery4.bindString(0, getAllOndcTicketsQuery.b);
                executeQuery4.bindString(1, getAllOndcTicketsQuery.c);
                break;
            case 4:
                Ondc_ticket_tableQueries.GetOndcTicketAsFlowQuery getOndcTicketAsFlowQuery = (Ondc_ticket_tableQueries.GetOndcTicketAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery5 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery5, "$this$executeQuery");
                executeQuery5.bindString(0, getOndcTicketAsFlowQuery.b);
                executeQuery5.bindString(1, getOndcTicketAsFlowQuery.c);
                break;
            case 5:
                Ondc_ticket_tableQueries.GetOndcTicketQuery getOndcTicketQuery = (Ondc_ticket_tableQueries.GetOndcTicketQuery) this.b;
                SqlPreparedStatement executeQuery6 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery6, "$this$executeQuery");
                executeQuery6.bindString(0, getOndcTicketQuery.b);
                executeQuery6.bindString(1, getOndcTicketQuery.c);
                break;
            case 6:
                Pending_super_pass_tableQueries.GetAllPendingSuperPassAsFlowQuery getAllPendingSuperPassAsFlowQuery = (Pending_super_pass_tableQueries.GetAllPendingSuperPassAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery7 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery7, "$this$executeQuery");
                int i = 0;
                for (Object obj2 : getAllPendingSuperPassAsFlowQuery.b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery7.bindString(i, (String) obj2);
                    i = i2;
                }
                return Unit.f17538a;
            case 7:
                Pending_super_pass_tableQueries.GetPendingSuperPassQuery getPendingSuperPassQuery = (Pending_super_pass_tableQueries.GetPendingSuperPassQuery) this.b;
                SqlPreparedStatement executeQuery8 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery8, "$this$executeQuery");
                executeQuery8.bindString(0, getPendingSuperPassQuery.b);
                break;
            case 8:
                Post_ride_feedback_tableQueries.GetEntryByBookingIdQuery getEntryByBookingIdQuery = (Post_ride_feedback_tableQueries.GetEntryByBookingIdQuery) this.b;
                SqlPreparedStatement executeQuery9 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery9, "$this$executeQuery");
                executeQuery9.bindString(0, getEntryByBookingIdQuery.b);
                executeQuery9.bindString(1, getEntryByBookingIdQuery.c);
                executeQuery9.bindString(2, getEntryByBookingIdQuery.d);
                break;
            case 9:
                Post_ride_feedback_tableQueries.GetPrfEntriesForProductAndAccountQuery getPrfEntriesForProductAndAccountQuery = (Post_ride_feedback_tableQueries.GetPrfEntriesForProductAndAccountQuery) this.b;
                SqlPreparedStatement executeQuery10 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery10, "$this$executeQuery");
                executeQuery10.bindString(0, getPrfEntriesForProductAndAccountQuery.b);
                executeQuery10.bindString(1, getPrfEntriesForProductAndAccountQuery.c);
                executeQuery10.bindString(2, getPrfEntriesForProductAndAccountQuery.d);
                executeQuery10.bindString(3, getPrfEntriesForProductAndAccountQuery.e);
                break;
            case 10:
                Premium_reserve_ticket_receipt_tableQueries.GetPremiumReserveTicketReceiptByIdQuery getPremiumReserveTicketReceiptByIdQuery = (Premium_reserve_ticket_receipt_tableQueries.GetPremiumReserveTicketReceiptByIdQuery) this.b;
                SqlPreparedStatement executeQuery11 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery11, "$this$executeQuery");
                executeQuery11.bindString(0, getPremiumReserveTicketReceiptByIdQuery.b);
                break;
            case 11:
                Premium_reserve_ticket_tableQueries.GetAckInfoForBookingQuery getAckInfoForBookingQuery = (Premium_reserve_ticket_tableQueries.GetAckInfoForBookingQuery) this.b;
                SqlPreparedStatement executeQuery12 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery12, "$this$executeQuery");
                executeQuery12.bindString(0, getAckInfoForBookingQuery.b);
                executeQuery12.bindString(1, getAckInfoForBookingQuery.c);
                break;
            case 12:
                Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsBookedThroughPassQuery getAllPremiumReserveTicketsBookedThroughPassQuery = (Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsBookedThroughPassQuery) this.b;
                SqlPreparedStatement executeQuery13 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery13, "$this$executeQuery");
                executeQuery13.bindString(0, getAllPremiumReserveTicketsBookedThroughPassQuery.b);
                executeQuery13.bindString(1, getAllPremiumReserveTicketsBookedThroughPassQuery.c);
                executeQuery13.bindString(2, getAllPremiumReserveTicketsBookedThroughPassQuery.d);
                break;
            case 13:
                Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsForCityBetweenGivenTimeQuery getAllPremiumReserveTicketsForCityBetweenGivenTimeQuery = (Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsForCityBetweenGivenTimeQuery) this.b;
                SqlPreparedStatement executeQuery14 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery14, "$this$executeQuery");
                executeQuery14.bindString(0, getAllPremiumReserveTicketsForCityBetweenGivenTimeQuery.b);
                executeQuery14.bindString(1, getAllPremiumReserveTicketsForCityBetweenGivenTimeQuery.c);
                executeQuery14.d(2, Long.valueOf(getAllPremiumReserveTicketsForCityBetweenGivenTimeQuery.d));
                executeQuery14.d(3, Long.valueOf(getAllPremiumReserveTicketsForCityBetweenGivenTimeQuery.e));
                break;
            case 14:
                Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsForCityQuery getAllPremiumReserveTicketsForCityQuery = (Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsForCityQuery) this.b;
                SqlPreparedStatement executeQuery15 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery15, "$this$executeQuery");
                executeQuery15.bindString(0, getAllPremiumReserveTicketsForCityQuery.b);
                break;
            case 15:
                Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery = (Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery) this.b;
                SqlPreparedStatement executeQuery16 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery16, "$this$executeQuery");
                executeQuery16.d(0, Long.valueOf(getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery.b));
                executeQuery16.bindString(1, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery.c);
                executeQuery16.bindString(2, getAllPremiumReserveTicketsFromStartTimeOnwardsThatRequireAcknowledgementQuery.d);
                break;
            case 16:
                Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsWithPendingTripFeedbackQuery getAllPremiumReserveTicketsWithPendingTripFeedbackQuery = (Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsWithPendingTripFeedbackQuery) this.b;
                SqlPreparedStatement executeQuery17 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery17, "$this$executeQuery");
                executeQuery17.bindString(0, getAllPremiumReserveTicketsWithPendingTripFeedbackQuery.b);
                executeQuery17.bindString(1, getAllPremiumReserveTicketsWithPendingTripFeedbackQuery.c);
                executeQuery17.d(2, Long.valueOf(getAllPremiumReserveTicketsWithPendingTripFeedbackQuery.d));
                executeQuery17.d(3, Long.valueOf(getAllPremiumReserveTicketsWithPendingTripFeedbackQuery.e));
                break;
            case 17:
                Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsWithSameFirstBookingIdQuery getAllPremiumReserveTicketsWithSameFirstBookingIdQuery = (Premium_reserve_ticket_tableQueries.GetAllPremiumReserveTicketsWithSameFirstBookingIdQuery) this.b;
                SqlPreparedStatement executeQuery18 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery18, "$this$executeQuery");
                executeQuery18.bindString(0, getAllPremiumReserveTicketsWithSameFirstBookingIdQuery.b);
                break;
            case 18:
                Premium_reserve_ticket_tableQueries.GetPremiumReserveTicketByIdQuery getPremiumReserveTicketByIdQuery = (Premium_reserve_ticket_tableQueries.GetPremiumReserveTicketByIdQuery) this.b;
                SqlPreparedStatement executeQuery19 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery19, "$this$executeQuery");
                executeQuery19.bindString(0, getPremiumReserveTicketByIdQuery.b);
                break;
            case 19:
                Premium_reserve_ticket_tableQueries.GetPremiumReserveTicketsBookedThroughPassQuery getPremiumReserveTicketsBookedThroughPassQuery = (Premium_reserve_ticket_tableQueries.GetPremiumReserveTicketsBookedThroughPassQuery) this.b;
                SqlPreparedStatement executeQuery20 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery20, "$this$executeQuery");
                executeQuery20.bindString(0, getPremiumReserveTicketsBookedThroughPassQuery.b);
                executeQuery20.bindString(1, getPremiumReserveTicketsBookedThroughPassQuery.c);
                executeQuery20.d(2, Long.valueOf(getPremiumReserveTicketsBookedThroughPassQuery.d));
                executeQuery20.bindString(3, getPremiumReserveTicketsBookedThroughPassQuery.e);
                break;
            case 20:
                Premium_reserve_ticket_tableQueries.GetUniqueOriginDestinationPairsQuery getUniqueOriginDestinationPairsQuery = (Premium_reserve_ticket_tableQueries.GetUniqueOriginDestinationPairsQuery) this.b;
                SqlPreparedStatement executeQuery21 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery21, "$this$executeQuery");
                executeQuery21.bindString(0, getUniqueOriginDestinationPairsQuery.b);
                break;
            case 21:
                Premium_reserve_trip_tableQueries.GetAllPremiumReserveTripDetailsForBookingIdsForCityQuery getAllPremiumReserveTripDetailsForBookingIdsForCityQuery = (Premium_reserve_trip_tableQueries.GetAllPremiumReserveTripDetailsForBookingIdsForCityQuery) this.b;
                SqlPreparedStatement executeQuery22 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery22, "$this$executeQuery");
                int i3 = 0;
                executeQuery22.bindString(0, getAllPremiumReserveTripDetailsForBookingIdsForCityQuery.b);
                ArrayList arrayList = getAllPremiumReserveTripDetailsForBookingIdsForCityQuery.c;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery22.bindString(i5, (String) obj3);
                    i3 = i5;
                }
                return Unit.f17538a;
            case 22:
                Premium_reserve_trip_tableQueries.GetAllPremiumReserveTripDetailsForCityQuery getAllPremiumReserveTripDetailsForCityQuery = (Premium_reserve_trip_tableQueries.GetAllPremiumReserveTripDetailsForCityQuery) this.b;
                SqlPreparedStatement executeQuery23 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery23, "$this$executeQuery");
                executeQuery23.bindString(0, getAllPremiumReserveTripDetailsForCityQuery.b);
                break;
            case 23:
                Premium_reserve_trip_tableQueries.GetPremiumReserveTripDetailsForBookingIdQuery getPremiumReserveTripDetailsForBookingIdQuery = (Premium_reserve_trip_tableQueries.GetPremiumReserveTripDetailsForBookingIdQuery) this.b;
                SqlPreparedStatement executeQuery24 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery24, "$this$executeQuery");
                executeQuery24.bindString(0, getPremiumReserveTripDetailsForBookingIdQuery.b);
                break;
            case 24:
                Product_activation_details_tableQueries.GetAllSuperPassTripReceiptsListQuery getAllSuperPassTripReceiptsListQuery = (Product_activation_details_tableQueries.GetAllSuperPassTripReceiptsListQuery) this.b;
                SqlPreparedStatement executeQuery25 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery25, "$this$executeQuery");
                executeQuery25.bindString(0, getAllSuperPassTripReceiptsListQuery.b);
                break;
            case 25:
                Recent_location_pair_tableQueries.GetCountForCityQuery getCountForCityQuery = (Recent_location_pair_tableQueries.GetCountForCityQuery) this.b;
                SqlPreparedStatement executeQuery26 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery26, "$this$executeQuery");
                executeQuery26.bindString(0, getCountForCityQuery.b);
                break;
            case 26:
                Recent_location_pair_tableQueries.GetLocationPairQuery getLocationPairQuery = (Recent_location_pair_tableQueries.GetLocationPairQuery) this.b;
                SqlPreparedStatement executeQuery27 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery27, "$this$executeQuery");
                executeQuery27.bindString(0, getLocationPairQuery.b);
                executeQuery27.bindString(1, getLocationPairQuery.c);
                break;
            case 27:
                Recent_location_pair_tableQueries.GetLocationPairsForCityNewestToOldestQuery getLocationPairsForCityNewestToOldestQuery = (Recent_location_pair_tableQueries.GetLocationPairsForCityNewestToOldestQuery) this.b;
                SqlPreparedStatement executeQuery28 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery28, "$this$executeQuery");
                executeQuery28.bindString(0, getLocationPairsForCityNewestToOldestQuery.b);
                executeQuery28.d(1, Long.valueOf(getLocationPairsForCityNewestToOldestQuery.c));
                break;
            case 28:
                Recent_location_pair_tableQueries.GetLocationPairsForCityOldestToNewestQuery getLocationPairsForCityOldestToNewestQuery = (Recent_location_pair_tableQueries.GetLocationPairsForCityOldestToNewestQuery) this.b;
                SqlPreparedStatement executeQuery29 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery29, "$this$executeQuery");
                executeQuery29.bindString(0, getLocationPairsForCityOldestToNewestQuery.b);
                executeQuery29.d(1, Long.valueOf(getLocationPairsForCityOldestToNewestQuery.c));
                break;
            default:
                SqlPreparedStatement executeQuery30 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery30, "$this$executeQuery");
                executeQuery30.bindString(0, null);
                executeQuery30.d(1, 0L);
                break;
        }
        return Unit.f17538a;
    }
}
