package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2027a;
    public final /* synthetic */ Query b;

    public /* synthetic */ c(Query query, int i) {
        this.f2027a = i;
        this.b = query;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2027a) {
            case 0:
                Recent_place_tableQueries.GetAllPlacesCityItineraryForCitySortedDescQuery getAllPlacesCityItineraryForCitySortedDescQuery = (Recent_place_tableQueries.GetAllPlacesCityItineraryForCitySortedDescQuery) this.b;
                SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery, "$this$executeQuery");
                executeQuery.bindString(0, getAllPlacesCityItineraryForCitySortedDescQuery.b);
                executeQuery.d(1, Long.valueOf(getAllPlacesCityItineraryForCitySortedDescQuery.c));
                break;
            case 1:
                Recent_place_tableQueries.GetRecentPlaceCityItineraryForCityQuery getRecentPlaceCityItineraryForCityQuery = (Recent_place_tableQueries.GetRecentPlaceCityItineraryForCityQuery) this.b;
                SqlPreparedStatement executeQuery2 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery2, "$this$executeQuery");
                executeQuery2.bindString(0, getRecentPlaceCityItineraryForCityQuery.b);
                executeQuery2.bindString(1, getRecentPlaceCityItineraryForCityQuery.c);
                break;
            case 2:
                Recent_route_tableQueries.GetAllRouteCityItineraryForCityQuery getAllRouteCityItineraryForCityQuery = (Recent_route_tableQueries.GetAllRouteCityItineraryForCityQuery) this.b;
                SqlPreparedStatement executeQuery3 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery3, "$this$executeQuery");
                executeQuery3.bindString(0, getAllRouteCityItineraryForCityQuery.b);
                break;
            case 3:
                Recent_route_tableQueries.GetRecentRouteCountForCityQuery getRecentRouteCountForCityQuery = (Recent_route_tableQueries.GetRecentRouteCountForCityQuery) this.b;
                SqlPreparedStatement executeQuery4 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery4, "$this$executeQuery");
                executeQuery4.bindString(0, getRecentRouteCountForCityQuery.b);
                executeQuery4.bindString(1, getRecentRouteCountForCityQuery.c);
                break;
            case 4:
                SqlPreparedStatement executeQuery5 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery5, "$this$executeQuery");
                executeQuery5.bindString(0, null);
                executeQuery5.d(1, 0L);
                break;
            case 5:
                Recent_route_tableQueries.GetRecentRoutesSortedDescByAccessTimeForCityQuery getRecentRoutesSortedDescByAccessTimeForCityQuery = (Recent_route_tableQueries.GetRecentRoutesSortedDescByAccessTimeForCityQuery) this.b;
                SqlPreparedStatement executeQuery6 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery6, "$this$executeQuery");
                executeQuery6.bindString(0, getRecentRoutesSortedDescByAccessTimeForCityQuery.b);
                executeQuery6.d(1, Long.valueOf(getRecentRoutesSortedDescByAccessTimeForCityQuery.c));
                break;
            case 6:
                Recent_route_tableQueries.GetRouteCityItineraryItemCountForCityQuery getRouteCityItineraryItemCountForCityQuery = (Recent_route_tableQueries.GetRouteCityItineraryItemCountForCityQuery) this.b;
                SqlPreparedStatement executeQuery7 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery7, "$this$executeQuery");
                executeQuery7.bindString(0, getRouteCityItineraryItemCountForCityQuery.b);
                break;
            case 7:
                Recent_route_tableQueries.GetRouteCityItineraryQuery getRouteCityItineraryQuery = (Recent_route_tableQueries.GetRouteCityItineraryQuery) this.b;
                SqlPreparedStatement executeQuery8 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery8, "$this$executeQuery");
                executeQuery8.bindString(0, getRouteCityItineraryQuery.b);
                executeQuery8.bindString(1, getRouteCityItineraryQuery.c);
                break;
            case 8:
                Recent_route_tableQueries.GetSortedByMostRecentAccessForCityQuery getSortedByMostRecentAccessForCityQuery = (Recent_route_tableQueries.GetSortedByMostRecentAccessForCityQuery) this.b;
                SqlPreparedStatement executeQuery9 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery9, "$this$executeQuery");
                executeQuery9.bindString(0, getSortedByMostRecentAccessForCityQuery.b);
                break;
            case 9:
                Recent_stop_and_route_based_trip_tableQueries.GetAllStopAndRouteBasedTripCityItineraryForCityQuery getAllStopAndRouteBasedTripCityItineraryForCityQuery = (Recent_stop_and_route_based_trip_tableQueries.GetAllStopAndRouteBasedTripCityItineraryForCityQuery) this.b;
                SqlPreparedStatement executeQuery10 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery10, "$this$executeQuery");
                executeQuery10.bindString(0, getAllStopAndRouteBasedTripCityItineraryForCityQuery.b);
                break;
            case 10:
                Recent_stop_and_route_based_trip_tableQueries.GetRecentStopAndRouteBasedTripCountForCityQuery getRecentStopAndRouteBasedTripCountForCityQuery = (Recent_stop_and_route_based_trip_tableQueries.GetRecentStopAndRouteBasedTripCountForCityQuery) this.b;
                SqlPreparedStatement executeQuery11 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery11, "$this$executeQuery");
                executeQuery11.bindString(0, getRecentStopAndRouteBasedTripCountForCityQuery.b);
                break;
            case 11:
                Recent_stop_and_route_based_trip_tableQueries.GetStopAndRouteBasedTripCityItineraryForCityQuery getStopAndRouteBasedTripCityItineraryForCityQuery = (Recent_stop_and_route_based_trip_tableQueries.GetStopAndRouteBasedTripCityItineraryForCityQuery) this.b;
                SqlPreparedStatement executeQuery12 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery12, "$this$executeQuery");
                executeQuery12.bindString(0, getStopAndRouteBasedTripCityItineraryForCityQuery.b);
                executeQuery12.bindString(1, getStopAndRouteBasedTripCityItineraryForCityQuery.c);
                break;
            case 12:
                Recent_stop_based_trip_tableQueries.GetAllStopBasedTripCityItineraryForCityNewestToOldestQuery getAllStopBasedTripCityItineraryForCityNewestToOldestQuery = (Recent_stop_based_trip_tableQueries.GetAllStopBasedTripCityItineraryForCityNewestToOldestQuery) this.b;
                SqlPreparedStatement executeQuery13 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery13, "$this$executeQuery");
                executeQuery13.bindString(0, getAllStopBasedTripCityItineraryForCityNewestToOldestQuery.b);
                executeQuery13.d(1, Long.valueOf(getAllStopBasedTripCityItineraryForCityNewestToOldestQuery.c));
                break;
            case 13:
                Recent_stop_based_trip_tableQueries.GetAllStopBasedTripCityItineraryForCityOldestToNewestQuery getAllStopBasedTripCityItineraryForCityOldestToNewestQuery = (Recent_stop_based_trip_tableQueries.GetAllStopBasedTripCityItineraryForCityOldestToNewestQuery) this.b;
                SqlPreparedStatement executeQuery14 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery14, "$this$executeQuery");
                executeQuery14.bindString(0, getAllStopBasedTripCityItineraryForCityOldestToNewestQuery.b);
                executeQuery14.d(1, Long.valueOf(getAllStopBasedTripCityItineraryForCityOldestToNewestQuery.c));
                break;
            case 14:
                Recent_stop_based_trip_tableQueries.GetAllStopBasedTripCityItineraryForCityQuery getAllStopBasedTripCityItineraryForCityQuery = (Recent_stop_based_trip_tableQueries.GetAllStopBasedTripCityItineraryForCityQuery) this.b;
                SqlPreparedStatement executeQuery15 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery15, "$this$executeQuery");
                executeQuery15.bindString(0, getAllStopBasedTripCityItineraryForCityQuery.b);
                break;
            case 15:
                Recent_stop_based_trip_tableQueries.GetRecentStopBasedTripCountForCityQuery getRecentStopBasedTripCountForCityQuery = (Recent_stop_based_trip_tableQueries.GetRecentStopBasedTripCountForCityQuery) this.b;
                SqlPreparedStatement executeQuery16 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery16, "$this$executeQuery");
                executeQuery16.bindString(0, getRecentStopBasedTripCountForCityQuery.b);
                break;
            case 16:
                Recent_stop_based_trip_tableQueries.GetStopBasedTripCityItineraryForCityQuery getStopBasedTripCityItineraryForCityQuery = (Recent_stop_based_trip_tableQueries.GetStopBasedTripCityItineraryForCityQuery) this.b;
                SqlPreparedStatement executeQuery17 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery17, "$this$executeQuery");
                executeQuery17.bindString(0, getStopBasedTripCityItineraryForCityQuery.b);
                executeQuery17.bindString(1, getStopBasedTripCityItineraryForCityQuery.c);
                break;
            case 17:
                Recent_stop_tableQueries.GetRecentStopCityItineraryQuery getRecentStopCityItineraryQuery = (Recent_stop_tableQueries.GetRecentStopCityItineraryQuery) this.b;
                SqlPreparedStatement executeQuery18 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery18, "$this$executeQuery");
                executeQuery18.bindString(0, getRecentStopCityItineraryQuery.b);
                executeQuery18.bindString(1, getRecentStopCityItineraryQuery.c);
                break;
            case 18:
                Recent_stop_tableQueries.GetRecentStopCountForCityQuery getRecentStopCountForCityQuery = (Recent_stop_tableQueries.GetRecentStopCountForCityQuery) this.b;
                SqlPreparedStatement executeQuery19 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery19, "$this$executeQuery");
                executeQuery19.bindString(0, getRecentStopCountForCityQuery.b);
                break;
            case 19:
                SqlPreparedStatement executeQuery20 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery20, "$this$executeQuery");
                executeQuery20.bindString(0, null);
                executeQuery20.d(1, 0L);
                break;
            case 20:
                SqlPreparedStatement executeQuery21 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery21, "$this$executeQuery");
                executeQuery21.bindString(0, null);
                break;
            case 21:
                Recent_stop_tableQueries.GetStopCityItinerarySortedDescQuery getStopCityItinerarySortedDescQuery = (Recent_stop_tableQueries.GetStopCityItinerarySortedDescQuery) this.b;
                SqlPreparedStatement executeQuery22 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery22, "$this$executeQuery");
                executeQuery22.bindString(0, getStopCityItinerarySortedDescQuery.b);
                executeQuery22.d(1, Long.valueOf(getStopCityItinerarySortedDescQuery.c));
                break;
            case 22:
                Recent_stop_tableQueries.GetStopCityItinerarySortedDescWithoutLimitQuery getStopCityItinerarySortedDescWithoutLimitQuery = (Recent_stop_tableQueries.GetStopCityItinerarySortedDescWithoutLimitQuery) this.b;
                SqlPreparedStatement executeQuery23 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery23, "$this$executeQuery");
                executeQuery23.bindString(0, getStopCityItinerarySortedDescWithoutLimitQuery.b);
                break;
            case 23:
                Recent_trip_tableQueries.GetAllTripRecentForCityQuery getAllTripRecentForCityQuery = (Recent_trip_tableQueries.GetAllTripRecentForCityQuery) this.b;
                SqlPreparedStatement executeQuery24 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery24, "$this$executeQuery");
                executeQuery24.bindString(0, getAllTripRecentForCityQuery.b);
                break;
            case 24:
                Recent_trip_tableQueries.GetLimitedTripRecentForCityNewestToOldestQuery getLimitedTripRecentForCityNewestToOldestQuery = (Recent_trip_tableQueries.GetLimitedTripRecentForCityNewestToOldestQuery) this.b;
                SqlPreparedStatement executeQuery25 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery25, "$this$executeQuery");
                executeQuery25.bindString(0, getLimitedTripRecentForCityNewestToOldestQuery.b);
                executeQuery25.d(1, Long.valueOf(getLimitedTripRecentForCityNewestToOldestQuery.c));
                break;
            case 25:
                Recent_trip_tableQueries.GetLimitedTripRecentForCityOldestToNewestQuery getLimitedTripRecentForCityOldestToNewestQuery = (Recent_trip_tableQueries.GetLimitedTripRecentForCityOldestToNewestQuery) this.b;
                SqlPreparedStatement executeQuery26 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery26, "$this$executeQuery");
                executeQuery26.bindString(0, getLimitedTripRecentForCityOldestToNewestQuery.b);
                executeQuery26.d(1, Long.valueOf(getLimitedTripRecentForCityOldestToNewestQuery.c));
                break;
            case 26:
                Recent_trip_tableQueries.GetRecentTripCountForCityQuery getRecentTripCountForCityQuery = (Recent_trip_tableQueries.GetRecentTripCountForCityQuery) this.b;
                SqlPreparedStatement executeQuery27 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery27, "$this$executeQuery");
                executeQuery27.bindString(0, getRecentTripCountForCityQuery.b);
                break;
            case 27:
                Recent_trip_tableQueries.GetTripRecentForCityQuery getTripRecentForCityQuery = (Recent_trip_tableQueries.GetTripRecentForCityQuery) this.b;
                SqlPreparedStatement executeQuery28 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery28, "$this$executeQuery");
                executeQuery28.bindString(0, getTripRecentForCityQuery.b);
                executeQuery28.bindString(1, getTripRecentForCityQuery.c);
                break;
            case 28:
                Ride_based_super_pass_ride_details_tableQueries.DoesRideBasedSuperPassRideDetailsExistQuery doesRideBasedSuperPassRideDetailsExistQuery = (Ride_based_super_pass_ride_details_tableQueries.DoesRideBasedSuperPassRideDetailsExistQuery) this.b;
                SqlPreparedStatement executeQuery29 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery29, "$this$executeQuery");
                executeQuery29.bindString(0, doesRideBasedSuperPassRideDetailsExistQuery.b);
                break;
            default:
                Ride_based_super_pass_ride_details_tableQueries.GetRideBasedSuperPassRideDetailsQuery getRideBasedSuperPassRideDetailsQuery = (Ride_based_super_pass_ride_details_tableQueries.GetRideBasedSuperPassRideDetailsQuery) this.b;
                SqlPreparedStatement executeQuery30 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery30, "$this$executeQuery");
                executeQuery30.bindString(0, getRideBasedSuperPassRideDetailsQuery.b);
                break;
        }
        return Unit.f17538a;
    }
}
