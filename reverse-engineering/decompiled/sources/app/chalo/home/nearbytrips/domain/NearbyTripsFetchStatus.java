package app.chalo.home.nearbytrips.domain;

import app.chalo.location.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus;", "", "UnInitialised", "InProgress", "Fetched", "Error", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Error;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Fetched;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$InProgress;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$UnInitialised;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NearbyTripsFetchStatus {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Error;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus;", "Failure", "Interrupted", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Error$Failure;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Error$Interrupted;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends NearbyTripsFetchStatus {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Error$Failure;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Error;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Failure extends Error {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LatLng f3133a;
            public final NearbyTripsFetchFailedReasons b;

            public Failure(LatLng requestedLatLng, NearbyTripsFetchFailedReasons failureReason) {
                Intrinsics.i(requestedLatLng, "requestedLatLng");
                Intrinsics.i(failureReason, "failureReason");
                this.f3133a = requestedLatLng;
                this.b = failureReason;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) obj;
                return Intrinsics.d(this.f3133a, failure.f3133a) && this.b == failure.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f3133a.hashCode() * 31);
            }

            public final String toString() {
                return "Failure(requestedLatLng=" + this.f3133a + ", failureReason=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Error$Interrupted;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Error;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Interrupted extends Error {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LatLng f3134a;

            public Interrupted(LatLng requestedLatLng) {
                Intrinsics.i(requestedLatLng, "requestedLatLng");
                this.f3134a = requestedLatLng;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Interrupted) && Intrinsics.d(this.f3134a, ((Interrupted) obj).f3134a);
            }

            public final int hashCode() {
                return this.f3134a.hashCode();
            }

            public final String toString() {
                return "Interrupted(requestedLatLng=" + this.f3134a + ")";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$Fetched;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fetched extends NearbyTripsFetchStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fetched f3135a = new Fetched();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$InProgress;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InProgress extends NearbyTripsFetchStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LatLng f3136a;

        public InProgress(LatLng requestedLatLng) {
            Intrinsics.i(requestedLatLng, "requestedLatLng");
            this.f3136a = requestedLatLng;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InProgress) && Intrinsics.d(this.f3136a, ((InProgress) obj).f3136a);
        }

        public final int hashCode() {
            return this.f3136a.hashCode();
        }

        public final String toString() {
            return "InProgress(requestedLatLng=" + this.f3136a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus$UnInitialised;", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsFetchStatus;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnInitialised extends NearbyTripsFetchStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnInitialised f3137a = new UnInitialised();
    }
}
