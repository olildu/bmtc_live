package app.chalo.livetracking.tripplanner.data.models.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegLiveBusNumberAvailability;", "", "NotAvailable", "Available", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegLiveBusNumberAvailability$Available;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegLiveBusNumberAvailability$NotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TripPlannerLegLiveBusNumberAvailability {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegLiveBusNumberAvailability$Available;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegLiveBusNumberAvailability;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Available extends TripPlannerLegLiveBusNumberAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4676a;

        public Available(String busNo) {
            Intrinsics.i(busNo, "busNo");
            this.f4676a = busNo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Available) && Intrinsics.d(this.f4676a, ((Available) obj).f4676a);
        }

        public final int hashCode() {
            return this.f4676a.hashCode();
        }

        public final String toString() {
            return vo1.B("Available(busNo=", this.f4676a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegLiveBusNumberAvailability$NotAvailable;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegLiveBusNumberAvailability;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotAvailable extends TripPlannerLegLiveBusNumberAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f4677a = new NotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotAvailable);
        }

        public final int hashCode() {
            return 511977546;
        }

        public final String toString() {
            return "NotAvailable";
        }
    }
}
