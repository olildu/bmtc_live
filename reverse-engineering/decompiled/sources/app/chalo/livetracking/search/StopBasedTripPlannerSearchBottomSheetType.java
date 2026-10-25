package app.chalo.livetracking.search;

import app.chalo.recent.model.app.RecentPlaceAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType;", "", "NearestStops", "NearestStopFetchError", "None", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType$NearestStopFetchError;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType$NearestStops;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType$None;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopBasedTripPlannerSearchBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType$NearestStopFetchError;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearestStopFetchError extends StopBasedTripPlannerSearchBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4485a;
        public final RecentPlaceAppModel b;

        public NearestStopFetchError(boolean z, RecentPlaceAppModel recentPlaceAppModel) {
            this.f4485a = z;
            this.b = recentPlaceAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearestStopFetchError)) {
                return false;
            }
            NearestStopFetchError nearestStopFetchError = (NearestStopFetchError) obj;
            return this.f4485a == nearestStopFetchError.f4485a && Intrinsics.d(this.b, nearestStopFetchError.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + ((this.f4485a ? 1231 : 1237) * 31);
        }

        public final String toString() {
            return "NearestStopFetchError(isConnectivityError=" + this.f4485a + ", place=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType$NearestStops;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearestStops extends StopBasedTripPlannerSearchBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f4486a;

        public NearestStops(RecentPlaceAppModel recentPlaceAppModel) {
            this.f4486a = recentPlaceAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearestStops) && Intrinsics.d(this.f4486a, ((NearestStops) obj).f4486a);
        }

        public final int hashCode() {
            return this.f4486a.hashCode();
        }

        public final String toString() {
            return "NearestStops(place=" + this.f4486a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType$None;", "Lapp/chalo/livetracking/search/StopBasedTripPlannerSearchBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends StopBasedTripPlannerSearchBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f4487a = new None();
    }
}
