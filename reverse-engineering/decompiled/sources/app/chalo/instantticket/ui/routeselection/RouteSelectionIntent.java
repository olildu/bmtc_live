package app.chalo.instantticket.ui.routeselection;

import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent;", "", "SelectRouteClicked", "SelectStopClicked", "RouteDetailsFetched", "StopDetailsFetched", "NextButtonClicked", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$NextButtonClicked;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$RouteDetailsFetched;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$SelectRouteClicked;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$SelectStopClicked;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$StopDetailsFetched;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$NextButtonClicked;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NextButtonClicked extends RouteSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextButtonClicked f3964a = new NextButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$RouteDetailsFetched;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteDetailsFetched extends RouteSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductBookingRouteDetails f3965a;

        public RouteDetailsFetched(ProductBookingRouteDetails routeDetails) {
            Intrinsics.i(routeDetails, "routeDetails");
            this.f3965a = routeDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteDetailsFetched) && Intrinsics.d(this.f3965a, ((RouteDetailsFetched) obj).f3965a);
        }

        public final int hashCode() {
            return this.f3965a.hashCode();
        }

        public final String toString() {
            return "RouteDetailsFetched(routeDetails=" + this.f3965a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$SelectRouteClicked;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SelectRouteClicked extends RouteSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectRouteClicked f3966a = new SelectRouteClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$SelectStopClicked;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectStopClicked extends RouteSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteSelectionStopType f3967a;

        public SelectStopClicked(RouteSelectionStopType stopType) {
            Intrinsics.i(stopType, "stopType");
            this.f3967a = stopType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectStopClicked) && this.f3967a == ((SelectStopClicked) obj).f3967a;
        }

        public final int hashCode() {
            return this.f3967a.hashCode();
        }

        public final String toString() {
            return "SelectStopClicked(stopType=" + this.f3967a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent$StopDetailsFetched;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopDetailsFetched extends RouteSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductBookingStopDetails f3968a;

        public StopDetailsFetched(ProductBookingStopDetails stopDetails) {
            Intrinsics.i(stopDetails, "stopDetails");
            this.f3968a = stopDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopDetailsFetched) && Intrinsics.d(this.f3968a, ((StopDetailsFetched) obj).f3968a);
        }

        public final int hashCode() {
            return this.f3968a.hashCode();
        }

        public final String toString() {
            return "StopDetailsFetched(stopDetails=" + this.f3968a + ")";
        }
    }
}
