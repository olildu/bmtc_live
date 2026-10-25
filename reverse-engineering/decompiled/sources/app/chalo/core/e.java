package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2154a;
    public final /* synthetic */ Query b;

    public /* synthetic */ e(Query query, int i) {
        this.f2154a = i;
        this.b = query;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2154a) {
            case 0:
                Ride_based_super_pass_tableQueries.FindRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery findRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery = (Ride_based_super_pass_tableQueries.FindRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery) this.b;
                SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery, "$this$executeQuery");
                int i = 0;
                executeQuery.bindString(0, findRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.b);
                executeQuery.bindString(1, findRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.c);
                executeQuery.bindString(2, findRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.d);
                executeQuery.bindString(3, findRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.e);
                executeQuery.d(4, Long.valueOf(findRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.f));
                for (Object obj2 : findRideBasedSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.g) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery.bindString(i + 5, (String) obj2);
                    i = i2;
                }
                return Unit.f17538a;
            case 1:
                Ride_based_super_pass_tableQueries.GetAllRideBasedSuperPassesAsFlowQuery getAllRideBasedSuperPassesAsFlowQuery = (Ride_based_super_pass_tableQueries.GetAllRideBasedSuperPassesAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery2 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery2, "$this$executeQuery");
                int i3 = 0;
                for (Object obj3 : getAllRideBasedSuperPassesAsFlowQuery.b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery2.bindString(i3, (String) obj3);
                    i3 = i4;
                }
                return Unit.f17538a;
            case 2:
                Ride_based_super_pass_tableQueries.GetAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery getAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery = (Ride_based_super_pass_tableQueries.GetAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery) this.b;
                SqlPreparedStatement executeQuery3 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery3, "$this$executeQuery");
                int i5 = 0;
                for (Object obj4 : getAllRideBasedSuperPassesBookedWithDistinctUserNamesForCityListQuery.b) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery3.bindString(i5, (String) obj4);
                    i5 = i6;
                }
                return Unit.f17538a;
            case 3:
                Ride_based_super_pass_tableQueries.GetAllRideBasedSuperPassesBookedWithUserNameForCityListQuery getAllRideBasedSuperPassesBookedWithUserNameForCityListQuery = (Ride_based_super_pass_tableQueries.GetAllRideBasedSuperPassesBookedWithUserNameForCityListQuery) this.b;
                SqlPreparedStatement executeQuery4 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery4, "$this$executeQuery");
                int i7 = 0;
                executeQuery4.bindString(0, getAllRideBasedSuperPassesBookedWithUserNameForCityListQuery.b);
                for (Object obj5 : getAllRideBasedSuperPassesBookedWithUserNameForCityListQuery.c) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery4.bindString(i8, (String) obj5);
                    i7 = i8;
                }
                return Unit.f17538a;
            case 4:
                Ride_based_super_pass_tableQueries.GetRideBasedSuperPassCountQuery getRideBasedSuperPassCountQuery = (Ride_based_super_pass_tableQueries.GetRideBasedSuperPassCountQuery) this.b;
                SqlPreparedStatement executeQuery5 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery5, "$this$executeQuery");
                executeQuery5.bindString(0, getRideBasedSuperPassCountQuery.b);
                break;
            case 5:
                Ride_based_super_pass_tableQueries.GetRideBasedSuperPassQuery getRideBasedSuperPassQuery = (Ride_based_super_pass_tableQueries.GetRideBasedSuperPassQuery) this.b;
                SqlPreparedStatement executeQuery6 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery6, "$this$executeQuery");
                executeQuery6.bindString(0, getRideBasedSuperPassQuery.b);
                break;
            case 6:
                Ride_booking_user_feedback_tableQueries.GetAllFeedbackEntriesQuery getAllFeedbackEntriesQuery = (Ride_booking_user_feedback_tableQueries.GetAllFeedbackEntriesQuery) this.b;
                SqlPreparedStatement executeQuery7 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery7, "$this$executeQuery");
                executeQuery7.bindString(0, getAllFeedbackEntriesQuery.b);
                break;
            case 7:
                Ride_feedback_offline_queue_tableQueries.GetAllOfflineFeedbackQuery getAllOfflineFeedbackQuery = (Ride_feedback_offline_queue_tableQueries.GetAllOfflineFeedbackQuery) this.b;
                SqlPreparedStatement executeQuery8 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery8, "$this$executeQuery");
                executeQuery8.bindString(0, getAllOfflineFeedbackQuery.b);
                executeQuery8.bindString(1, getAllOfflineFeedbackQuery.c);
                executeQuery8.bindString(2, getAllOfflineFeedbackQuery.d);
                break;
            case 8:
                Routes_tableQueries.GetAllRoutesForCityQuery getAllRoutesForCityQuery = (Routes_tableQueries.GetAllRoutesForCityQuery) this.b;
                SqlPreparedStatement executeQuery9 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery9, "$this$executeQuery");
                executeQuery9.bindString(0, getAllRoutesForCityQuery.b);
                break;
            case 9:
                Routes_tableQueries.GetMostRecentRoutesWithIdAndVersionQuery getMostRecentRoutesWithIdAndVersionQuery = (Routes_tableQueries.GetMostRecentRoutesWithIdAndVersionQuery) this.b;
                SqlPreparedStatement executeQuery10 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery10, "$this$executeQuery");
                executeQuery10.bindString(0, getMostRecentRoutesWithIdAndVersionQuery.b);
                break;
            case 10:
                Routes_tableQueries.GetRouteQuery getRouteQuery = (Routes_tableQueries.GetRouteQuery) this.b;
                SqlPreparedStatement executeQuery11 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery11, "$this$executeQuery");
                executeQuery11.bindString(0, getRouteQuery.b);
                executeQuery11.bindString(1, getRouteQuery.c);
                break;
            case 11:
                Routes_tableQueries.GetRoutesWithIdAndVersionQuery getRoutesWithIdAndVersionQuery = (Routes_tableQueries.GetRoutesWithIdAndVersionQuery) this.b;
                SqlPreparedStatement executeQuery12 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery12, "$this$executeQuery");
                executeQuery12.bindString(0, getRoutesWithIdAndVersionQuery.b);
                break;
            case 12:
                Routes_tableQueries.GetSelectRoutesForCityQuery getSelectRoutesForCityQuery = (Routes_tableQueries.GetSelectRoutesForCityQuery) this.b;
                SqlPreparedStatement executeQuery13 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery13, "$this$executeQuery");
                int i9 = 0;
                executeQuery13.bindString(0, getSelectRoutesForCityQuery.b);
                for (Object obj6 : getSelectRoutesForCityQuery.c) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery13.bindString(i10, (String) obj6);
                    i9 = i10;
                }
                return Unit.f17538a;
            case 13:
                Routes_tableQueries.GetSimpleRouteDetailsQuery getSimpleRouteDetailsQuery = (Routes_tableQueries.GetSimpleRouteDetailsQuery) this.b;
                SqlPreparedStatement executeQuery14 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery14, "$this$executeQuery");
                executeQuery14.bindString(0, getSimpleRouteDetailsQuery.b);
                executeQuery14.bindString(1, getSimpleRouteDetailsQuery.c);
                break;
            case 14:
                Routes_tableQueries.GetVersionForRouteIdQuery getVersionForRouteIdQuery = (Routes_tableQueries.GetVersionForRouteIdQuery) this.b;
                SqlPreparedStatement executeQuery15 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery15, "$this$executeQuery");
                executeQuery15.bindString(0, getVersionForRouteIdQuery.b);
                executeQuery15.bindString(1, getVersionForRouteIdQuery.c);
                break;
            case 15:
                Super_pass_application_tableQueries.GetAllSuperPassApplicationsAsFlowQuery getAllSuperPassApplicationsAsFlowQuery = (Super_pass_application_tableQueries.GetAllSuperPassApplicationsAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery16 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery16, "$this$executeQuery");
                int i11 = 0;
                for (Object obj7 : getAllSuperPassApplicationsAsFlowQuery.b) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery16.bindString(i11, (String) obj7);
                    i11 = i12;
                }
                return Unit.f17538a;
            case 16:
                TicketQueries.GetAllTicketsQuery getAllTicketsQuery = (TicketQueries.GetAllTicketsQuery) this.b;
                SqlPreparedStatement executeQuery17 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery17, "$this$executeQuery");
                executeQuery17.bindString(0, getAllTicketsQuery.b);
                break;
            case 17:
                TicketQueries.GetCitySpecificTicketCountQuery getCitySpecificTicketCountQuery = (TicketQueries.GetCitySpecificTicketCountQuery) this.b;
                SqlPreparedStatement executeQuery18 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery18, "$this$executeQuery");
                executeQuery18.bindString(0, getCitySpecificTicketCountQuery.b);
                break;
            case 18:
                TicketQueries.GetCurrentTicketQuery getCurrentTicketQuery = (TicketQueries.GetCurrentTicketQuery) this.b;
                SqlPreparedStatement executeQuery19 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery19, "$this$executeQuery");
                executeQuery19.bindString(0, getCurrentTicketQuery.b);
                executeQuery19.bindString(1, getCurrentTicketQuery.c);
                break;
            case 19:
                TicketQueries.GetTicketFromBookingIdQuery getTicketFromBookingIdQuery = (TicketQueries.GetTicketFromBookingIdQuery) this.b;
                SqlPreparedStatement executeQuery20 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery20, "$this$executeQuery");
                executeQuery20.bindString(0, getTicketFromBookingIdQuery.b);
                break;
            case 20:
                Tito_validation_tableQueries.GetAllTitoEntriesQuery getAllTitoEntriesQuery = (Tito_validation_tableQueries.GetAllTitoEntriesQuery) this.b;
                SqlPreparedStatement executeQuery21 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery21, "$this$executeQuery");
                executeQuery21.bindString(0, getAllTitoEntriesQuery.b);
                break;
            case 21:
                Tito_validation_tableQueries.GetTitoEntriesForBookingIdQuery getTitoEntriesForBookingIdQuery = (Tito_validation_tableQueries.GetTitoEntriesForBookingIdQuery) this.b;
                SqlPreparedStatement executeQuery22 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery22, "$this$executeQuery");
                executeQuery22.bindString(0, getTitoEntriesForBookingIdQuery.b);
                break;
            case 22:
                Tito_validation_tableQueries.GetTitoEntryForTapIdQuery getTitoEntryForTapIdQuery = (Tito_validation_tableQueries.GetTitoEntryForTapIdQuery) this.b;
                SqlPreparedStatement executeQuery23 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery23, "$this$executeQuery");
                executeQuery23.bindString(0, getTitoEntryForTapIdQuery.b);
                break;
            case 23:
                User_commute_preference_place_tableQueries.SelectAllQuery selectAllQuery = (User_commute_preference_place_tableQueries.SelectAllQuery) this.b;
                SqlPreparedStatement executeQuery24 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery24, "$this$executeQuery");
                executeQuery24.bindString(0, selectAllQuery.b);
                executeQuery24.bindString(1, selectAllQuery.c);
                break;
            default:
                User_commute_preference_saved_ride_tableQueries.SelectAllQuery selectAllQuery2 = (User_commute_preference_saved_ride_tableQueries.SelectAllQuery) this.b;
                SqlPreparedStatement executeQuery25 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery25, "$this$executeQuery");
                executeQuery25.bindString(0, selectAllQuery2.b);
                executeQuery25.bindString(1, selectAllQuery2.c);
                break;
        }
        return Unit.f17538a;
    }
}
