package app.chalo.core;

import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2046a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f2046a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2046a) {
            case 0:
                Recent_place_tableQueries.GetOldestRecentPlacesWithSpecialStatusForCityQuery getOldestRecentPlacesWithSpecialStatusForCityQuery = (Recent_place_tableQueries.GetOldestRecentPlacesWithSpecialStatusForCityQuery) this.c;
                Recent_place_tableQueries recent_place_tableQueries = (Recent_place_tableQueries) this.b;
                SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery, "$this$executeQuery");
                executeQuery.bindString(0, getOldestRecentPlacesWithSpecialStatusForCityQuery.b);
                executeQuery.bindString(1, (String) recent_place_tableQueries.b.b.encode(getOldestRecentPlacesWithSpecialStatusForCityQuery.c));
                executeQuery.d(2, Long.valueOf(getOldestRecentPlacesWithSpecialStatusForCityQuery.d));
                break;
            case 1:
                Recent_place_tableQueries recent_place_tableQueries2 = (Recent_place_tableQueries) this.b;
                Recent_place_tableQueries.GetRecentPlaceCityItineraryWithSpecialStatusForCityQuery getRecentPlaceCityItineraryWithSpecialStatusForCityQuery = (Recent_place_tableQueries.GetRecentPlaceCityItineraryWithSpecialStatusForCityQuery) this.c;
                SqlPreparedStatement executeQuery2 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery2, "$this$executeQuery");
                executeQuery2.bindString(0, (String) recent_place_tableQueries2.b.b.encode(getRecentPlaceCityItineraryWithSpecialStatusForCityQuery.b));
                executeQuery2.bindString(1, getRecentPlaceCityItineraryWithSpecialStatusForCityQuery.c);
                break;
            case 2:
                Recent_place_tableQueries.GetRecentPlacesForSpecialStatusCountQuery getRecentPlacesForSpecialStatusCountQuery = (Recent_place_tableQueries.GetRecentPlacesForSpecialStatusCountQuery) this.c;
                Recent_place_tableQueries recent_place_tableQueries3 = (Recent_place_tableQueries) this.b;
                SqlPreparedStatement executeQuery3 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery3, "$this$executeQuery");
                executeQuery3.bindString(0, getRecentPlacesForSpecialStatusCountQuery.b);
                executeQuery3.bindString(1, (String) recent_place_tableQueries3.b.b.encode(getRecentPlacesForSpecialStatusCountQuery.c));
                break;
            case 3:
                Recent_route_tableQueries recent_route_tableQueries = (Recent_route_tableQueries) this.b;
                SqlPreparedStatement executeQuery4 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery4, "$this$executeQuery");
                executeQuery4.bindString(0, null);
                executeQuery4.bindString(1, (String) recent_route_tableQueries.b.c.encode(null));
                executeQuery4.d(2, 0L);
                break;
            case 4:
                Recent_route_tableQueries.GetAllRouteCityItineraryForCityWithSpecialStatusQuery getAllRouteCityItineraryForCityWithSpecialStatusQuery = (Recent_route_tableQueries.GetAllRouteCityItineraryForCityWithSpecialStatusQuery) this.c;
                Recent_route_tableQueries recent_route_tableQueries2 = (Recent_route_tableQueries) this.b;
                SqlPreparedStatement executeQuery5 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery5, "$this$executeQuery");
                executeQuery5.bindString(0, getAllRouteCityItineraryForCityWithSpecialStatusQuery.b);
                executeQuery5.bindString(1, (String) recent_route_tableQueries2.b.c.encode(getAllRouteCityItineraryForCityWithSpecialStatusQuery.c));
                break;
            case 5:
                Recent_route_tableQueries.GetNewestRecentRoutesWithSpecialStatusForCityQuery getNewestRecentRoutesWithSpecialStatusForCityQuery = (Recent_route_tableQueries.GetNewestRecentRoutesWithSpecialStatusForCityQuery) this.c;
                Recent_route_tableQueries recent_route_tableQueries3 = (Recent_route_tableQueries) this.b;
                SqlPreparedStatement executeQuery6 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery6, "$this$executeQuery");
                executeQuery6.bindString(0, getNewestRecentRoutesWithSpecialStatusForCityQuery.b);
                executeQuery6.bindString(1, (String) recent_route_tableQueries3.b.c.encode(getNewestRecentRoutesWithSpecialStatusForCityQuery.c));
                executeQuery6.d(2, Long.valueOf(getNewestRecentRoutesWithSpecialStatusForCityQuery.d));
                break;
            case 6:
                Recent_route_tableQueries.GetOldestRecentRoutesWithSpecialStatusForCityQuery getOldestRecentRoutesWithSpecialStatusForCityQuery = (Recent_route_tableQueries.GetOldestRecentRoutesWithSpecialStatusForCityQuery) this.c;
                Recent_route_tableQueries recent_route_tableQueries4 = (Recent_route_tableQueries) this.b;
                SqlPreparedStatement executeQuery7 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery7, "$this$executeQuery");
                executeQuery7.bindString(0, getOldestRecentRoutesWithSpecialStatusForCityQuery.b);
                executeQuery7.bindString(1, (String) recent_route_tableQueries4.b.c.encode(getOldestRecentRoutesWithSpecialStatusForCityQuery.c));
                executeQuery7.d(2, Long.valueOf(getOldestRecentRoutesWithSpecialStatusForCityQuery.d));
                break;
            case 7:
                Recent_route_tableQueries.GetRecentRouteCountForCityWithSpecialStatusQuery getRecentRouteCountForCityWithSpecialStatusQuery = (Recent_route_tableQueries.GetRecentRouteCountForCityWithSpecialStatusQuery) this.c;
                Recent_route_tableQueries recent_route_tableQueries5 = (Recent_route_tableQueries) this.b;
                SqlPreparedStatement executeQuery8 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery8, "$this$executeQuery");
                executeQuery8.bindString(0, getRecentRouteCountForCityWithSpecialStatusQuery.b);
                executeQuery8.bindString(1, getRecentRouteCountForCityWithSpecialStatusQuery.c);
                executeQuery8.bindString(2, (String) recent_route_tableQueries5.b.c.encode(getRecentRouteCountForCityWithSpecialStatusQuery.d));
                break;
            case 8:
                SqlPreparedStatement executeQuery9 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery9, "$this$executeQuery");
                executeQuery9.bindString(0, null);
                throw null;
            case 9:
                Recent_route_tableQueries.GetRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery getRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery = (Recent_route_tableQueries.GetRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery) this.c;
                Recent_route_tableQueries recent_route_tableQueries6 = (Recent_route_tableQueries) this.b;
                SqlPreparedStatement executeQuery10 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery10, "$this$executeQuery");
                int i = 0;
                executeQuery10.bindString(0, getRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery.b);
                Collection collection = getRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery.c;
                for (Object obj2 : collection) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery10.bindString(i2, (String) recent_route_tableQueries6.b.b.encode((ChaloTransitMode) obj2));
                    i = i2;
                }
                executeQuery10.d(collection.size() + 1, Long.valueOf(getRecentRoutesFilteredByTransitModesSortedDescByAccessTimeForCityQuery.d));
                break;
            case 10:
                Recent_route_tableQueries.GetRecentRoutesForSpecialStatusCountQuery getRecentRoutesForSpecialStatusCountQuery = (Recent_route_tableQueries.GetRecentRoutesForSpecialStatusCountQuery) this.c;
                Recent_route_tableQueries recent_route_tableQueries7 = (Recent_route_tableQueries) this.b;
                SqlPreparedStatement executeQuery11 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery11, "$this$executeQuery");
                executeQuery11.bindString(0, getRecentRoutesForSpecialStatusCountQuery.b);
                executeQuery11.bindString(1, (String) recent_route_tableQueries7.b.c.encode(getRecentRoutesForSpecialStatusCountQuery.c));
                break;
            case 11:
                SqlPreparedStatement executeQuery12 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery12, "$this$executeQuery");
                executeQuery12.bindString(0, null);
                throw null;
            case 12:
                Recent_stop_and_route_based_trip_tableQueries.GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery getRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery = (Recent_stop_and_route_based_trip_tableQueries.GetRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery) this.c;
                Recent_stop_and_route_based_trip_tableQueries recent_stop_and_route_based_trip_tableQueries = (Recent_stop_and_route_based_trip_tableQueries) this.b;
                SqlPreparedStatement executeQuery13 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery13, "$this$executeQuery");
                int i3 = 0;
                executeQuery13.bindString(0, getRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.b);
                Collection collection2 = getRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.c;
                for (Object obj3 : collection2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery13.bindString(i4, (String) recent_stop_and_route_based_trip_tableQueries.b.d.encode((ChaloTransitMode) obj3));
                    i3 = i4;
                }
                executeQuery13.d(collection2.size() + 1, Long.valueOf(getRecentStopAndRouteBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.d));
                break;
            case 13:
                SqlPreparedStatement executeQuery14 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery14, "$this$executeQuery");
                executeQuery14.bindString(0, null);
                throw null;
            case 14:
                Recent_stop_based_trip_tableQueries.GetRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery getRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery = (Recent_stop_based_trip_tableQueries.GetRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery) this.c;
                Recent_stop_based_trip_tableQueries recent_stop_based_trip_tableQueries = (Recent_stop_based_trip_tableQueries) this.b;
                SqlPreparedStatement executeQuery15 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery15, "$this$executeQuery");
                int i5 = 0;
                executeQuery15.bindString(0, getRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.b);
                Collection collection3 = getRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.c;
                for (Object obj4 : collection3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery15.bindString(i6, (String) recent_stop_based_trip_tableQueries.b.c.encode((ChaloTransitMode) obj4));
                    i5 = i6;
                }
                executeQuery15.d(collection3.size() + 1, Long.valueOf(getRecentStopBasedTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.d));
                break;
            case 15:
                Recent_stop_tableQueries.GetOldestStopCityItineraryWithSpecialStatusQuery getOldestStopCityItineraryWithSpecialStatusQuery = (Recent_stop_tableQueries.GetOldestStopCityItineraryWithSpecialStatusQuery) this.c;
                Recent_stop_tableQueries recent_stop_tableQueries = (Recent_stop_tableQueries) this.b;
                SqlPreparedStatement executeQuery16 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery16, "$this$executeQuery");
                executeQuery16.bindString(0, getOldestStopCityItineraryWithSpecialStatusQuery.b);
                executeQuery16.bindString(1, (String) recent_stop_tableQueries.b.b.encode(getOldestStopCityItineraryWithSpecialStatusQuery.c));
                executeQuery16.d(2, Long.valueOf(getOldestStopCityItineraryWithSpecialStatusQuery.d));
                break;
            case 16:
                Recent_stop_tableQueries recent_stop_tableQueries2 = (Recent_stop_tableQueries) this.c;
                Recent_stop_tableQueries.GetRecentStopCityItineraryForCityQuery getRecentStopCityItineraryForCityQuery = (Recent_stop_tableQueries.GetRecentStopCityItineraryForCityQuery) this.b;
                SqlPreparedStatement executeQuery17 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery17, "$this$executeQuery");
                executeQuery17.bindString(0, (String) recent_stop_tableQueries2.b.b.encode(getRecentStopCityItineraryForCityQuery.b));
                executeQuery17.bindString(1, getRecentStopCityItineraryForCityQuery.c);
                break;
            case 17:
                Recent_stop_tableQueries recent_stop_tableQueries3 = (Recent_stop_tableQueries) this.c;
                Recent_stop_tableQueries.GetRecentStopEntryCountWithSpecialStatusForCityQuery getRecentStopEntryCountWithSpecialStatusForCityQuery = (Recent_stop_tableQueries.GetRecentStopEntryCountWithSpecialStatusForCityQuery) this.b;
                SqlPreparedStatement executeQuery18 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery18, "$this$executeQuery");
                executeQuery18.bindString(0, (String) recent_stop_tableQueries3.b.b.encode(getRecentStopEntryCountWithSpecialStatusForCityQuery.b));
                executeQuery18.bindString(1, getRecentStopEntryCountWithSpecialStatusForCityQuery.c);
                break;
            case 18:
                SqlPreparedStatement executeQuery19 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery19, "$this$executeQuery");
                executeQuery19.bindString(0, null);
                throw null;
            default:
                Recent_trip_tableQueries.GetRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery getRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery = (Recent_trip_tableQueries.GetRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery) this.c;
                Recent_trip_tableQueries recent_trip_tableQueries = (Recent_trip_tableQueries) this.b;
                SqlPreparedStatement executeQuery20 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery20, "$this$executeQuery");
                int i7 = 0;
                executeQuery20.bindString(0, getRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.b);
                Collection collection4 = getRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.c;
                for (Object obj5 : collection4) {
                    int i8 = i7 + 1;
                    String str = null;
                    if (i7 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ChaloTransitMode chaloTransitMode = (ChaloTransitMode) obj5;
                    if (chaloTransitMode != null) {
                        str = (String) recent_trip_tableQueries.b.c.encode(chaloTransitMode);
                    }
                    executeQuery20.bindString(i8, str);
                    i7 = i8;
                }
                executeQuery20.d(collection4.size() + 1, Long.valueOf(getRecentTripsFilteredByTransitModesSortedDescByAccessTimeForCityQuery.d));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ d(Recent_place_tableQueries recent_place_tableQueries, Recent_place_tableQueries.GetRecentPlaceCityItineraryWithSpecialStatusForCityQuery getRecentPlaceCityItineraryWithSpecialStatusForCityQuery) {
        this.f2046a = 1;
        this.b = recent_place_tableQueries;
        this.c = getRecentPlaceCityItineraryWithSpecialStatusForCityQuery;
    }
}
