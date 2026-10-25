package app.chalo.livetracking.universalsearch.data.model.app;

import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem;", "", "Place", "Route", "Stop", "Trip", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem$Place;", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem$Route;", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem$Stop;", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem$Trip;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UniversalSearchRecentSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4997a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem$Place;", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Place extends UniversalSearchRecentSearchItem {
        public final RecentPlaceAppModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Place(RecentPlaceAppModel placesRecentModel) {
            super(placesRecentModel.l, placesRecentModel.k == RecentsSpecialStatus.FAVOURITE);
            Intrinsics.i(placesRecentModel, "placesRecentModel");
            this.c = placesRecentModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Place) && Intrinsics.d(this.c, ((Place) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "Place(placesRecentModel=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem$Route;", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Route extends UniversalSearchRecentSearchItem {
        public final RecentRouteAppModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Route(RecentRouteAppModel routeRecentModel) {
            super(routeRecentModel.p, false);
            Intrinsics.i(routeRecentModel, "routeRecentModel");
            this.c = routeRecentModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Route) && Intrinsics.d(this.c, ((Route) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "Route(routeRecentModel=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem$Stop;", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Stop extends UniversalSearchRecentSearchItem {
        public final RecentStopAppModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stop(RecentStopAppModel stopRecentModel) {
            super(stopRecentModel.i, stopRecentModel.h == RecentsSpecialStatus.FAVOURITE);
            Intrinsics.i(stopRecentModel, "stopRecentModel");
            this.c = stopRecentModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stop) && Intrinsics.d(this.c, ((Stop) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "Stop(stopRecentModel=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem$Trip;", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Trip extends UniversalSearchRecentSearchItem {
        public final RecentTripAppModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Trip(RecentTripAppModel tripRecentModel) {
            super(tripRecentModel.j, false);
            Intrinsics.i(tripRecentModel, "tripRecentModel");
            this.c = tripRecentModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Trip) && Intrinsics.d(this.c, ((Trip) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "Trip(tripRecentModel=" + this.c + ")";
        }
    }

    public UniversalSearchRecentSearchItem(long j, boolean z) {
        this.f4997a = j;
        this.b = z;
    }
}
