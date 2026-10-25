package app.chalo.livetracking.tripplanner.ui.details;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsBottomSheetType;", "", "MetroTicketPurchaseBottomSheet", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsBottomSheetType$MetroTicketPurchaseBottomSheet;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TripPlannerDetailsBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsBottomSheetType$MetroTicketPurchaseBottomSheet;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsBottomSheetType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MetroTicketPurchaseBottomSheet extends TripPlannerDetailsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MetroGroupLegAppModel f4720a;

        public MetroTicketPurchaseBottomSheet(MetroGroupLegAppModel metroGroupLegAppModel) {
            this.f4720a = metroGroupLegAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetroTicketPurchaseBottomSheet) && Intrinsics.d(this.f4720a, ((MetroTicketPurchaseBottomSheet) obj).f4720a);
        }

        public final int hashCode() {
            return this.f4720a.hashCode();
        }

        public final String toString() {
            return "MetroTicketPurchaseBottomSheet(data=" + this.f4720a + ")";
        }
    }
}
