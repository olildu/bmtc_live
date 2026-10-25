package app.chalo.recent.database.repository.recent;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/database/repository/recent/RecentRepositoryProviderImpl;", "Lapp/chalo/recent/database/repository/recent/RecentRepositoryProvider;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentRepositoryProviderImpl implements RecentRepositoryProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteRecentRepository f8954a;
    public final StopRecentRepository b;
    public final StopBasedTripRecentRepository c;
    public final PlacesRecentRepository d;
    public final TripRecentRepository e;
    public final StopAndRouteBasedRecentRepository f;
    public final RecentLocationPairRepository g;

    public RecentRepositoryProviderImpl(RouteRecentRepository routeRecentRepository, StopRecentRepository stopRecentRepository, StopBasedTripRecentRepository stopBasedTripRecentRepository, PlacesRecentRepository placesRecentRepository, TripRecentRepository tripRecentRepository, StopAndRouteBasedRecentRepository stopAndRouteBasedRecentRepository, RecentLocationPairRepository recentLocationPairRepository) {
        this.f8954a = routeRecentRepository;
        this.b = stopRecentRepository;
        this.c = stopBasedTripRecentRepository;
        this.d = placesRecentRepository;
        this.e = tripRecentRepository;
        this.f = stopAndRouteBasedRecentRepository;
        this.g = recentLocationPairRepository;
    }

    @Override // app.chalo.recent.database.repository.recent.RecentRepositoryProvider
    /* JADX INFO: renamed from: a, reason: from getter */
    public final RouteRecentRepository getF8954a() {
        return this.f8954a;
    }

    @Override // app.chalo.recent.database.repository.recent.RecentRepositoryProvider
    /* JADX INFO: renamed from: b, reason: from getter */
    public final RecentLocationPairRepository getG() {
        return this.g;
    }

    @Override // app.chalo.recent.database.repository.recent.RecentRepositoryProvider
    /* JADX INFO: renamed from: c, reason: from getter */
    public final StopBasedTripRecentRepository getC() {
        return this.c;
    }

    @Override // app.chalo.recent.database.repository.recent.RecentRepositoryProvider
    /* JADX INFO: renamed from: d, reason: from getter */
    public final TripRecentRepository getE() {
        return this.e;
    }

    @Override // app.chalo.recent.database.repository.recent.RecentRepositoryProvider
    /* JADX INFO: renamed from: e, reason: from getter */
    public final StopRecentRepository getB() {
        return this.b;
    }

    @Override // app.chalo.recent.database.repository.recent.RecentRepositoryProvider
    /* JADX INFO: renamed from: f, reason: from getter */
    public final PlacesRecentRepository getD() {
        return this.d;
    }

    @Override // app.chalo.recent.database.repository.recent.RecentRepositoryProvider
    /* JADX INFO: renamed from: g, reason: from getter */
    public final StopAndRouteBasedRecentRepository getF() {
        return this.f;
    }
}
