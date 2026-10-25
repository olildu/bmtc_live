package app.chalo.recent.database.repository.recent;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/repository/recent/RecentRepositoryProvider;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RecentRepositoryProvider {
    RouteRecentRepository a();

    RecentLocationPairRepository b();

    StopBasedTripRecentRepository c();

    TripRecentRepository d();

    StopRecentRepository e();

    PlacesRecentRepository f();

    StopAndRouteBasedRecentRepository g();
}
