package app.chalo.livetracking.ui.routedetailsscreen;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType;", "", "MainScreen", "TimeTable", "StopListForUserDestinationUpdate", "StopSearchForEta", "Error", "AllLiveVehicles", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$AllLiveVehicles;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$Error;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$MainScreen;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$StopListForUserDestinationUpdate;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$StopSearchForEta;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$TimeTable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteDetailsViewType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$AllLiveVehicles;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AllLiveVehicles extends RouteDetailsViewType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4878a;

        public AllLiveVehicles(boolean z) {
            this.f4878a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllLiveVehicles) && this.f4878a == ((AllLiveVehicles) obj).f4878a;
        }

        public final int hashCode() {
            return this.f4878a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("AllLiveVehicles(isSourceStopFromMap=", ")", this.f4878a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$Error;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends RouteDetailsViewType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f4879a = new Error();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$MainScreen;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MainScreen extends RouteDetailsViewType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MainScreen f4880a = new MainScreen();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$StopListForUserDestinationUpdate;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StopListForUserDestinationUpdate extends RouteDetailsViewType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StopListForUserDestinationUpdate f4881a = new StopListForUserDestinationUpdate();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$StopSearchForEta;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StopSearchForEta extends RouteDetailsViewType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StopSearchForEta f4882a = new StopSearchForEta();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType$TimeTable;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimeTable extends RouteDetailsViewType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeTable f4883a = new TimeTable();
    }
}
