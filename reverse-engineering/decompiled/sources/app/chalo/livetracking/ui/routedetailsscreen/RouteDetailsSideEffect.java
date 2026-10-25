package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect;", "", "StartCheckin", "HandleLocationPermission", "ShowLiveSeatAvailabilityBottomSheet", "DismissLiveSeatAvailabilityBottomSheet", "HideStopListBottomSheet", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$DismissLiveSeatAvailabilityBottomSheet;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$HandleLocationPermission;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$HideStopListBottomSheet;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$ShowLiveSeatAvailabilityBottomSheet;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$StartCheckin;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteDetailsSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$DismissLiveSeatAvailabilityBottomSheet;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissLiveSeatAvailabilityBottomSheet extends RouteDetailsSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissLiveSeatAvailabilityBottomSheet f4871a = new DismissLiveSeatAvailabilityBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$HandleLocationPermission;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HandleLocationPermission extends RouteDetailsSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HandleLocationPermission f4872a = new HandleLocationPermission();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$HideStopListBottomSheet;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HideStopListBottomSheet extends RouteDetailsSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HideStopListBottomSheet f4873a = new HideStopListBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$ShowLiveSeatAvailabilityBottomSheet;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowLiveSeatAvailabilityBottomSheet extends RouteDetailsSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowLiveSeatAvailabilityBottomSheet f4874a = new ShowLiveSeatAvailabilityBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect$StartCheckin;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsSideEffect;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartCheckin extends RouteDetailsSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteAppModel f4875a;
        public final StopAppModel b;
        public final StopAppModel c;

        public StartCheckin(RouteAppModel routeAppModel, StopAppModel stopAppModel, StopAppModel stopAppModel2) {
            Intrinsics.i(routeAppModel, "routeAppModel");
            this.f4875a = routeAppModel;
            this.b = stopAppModel;
            this.c = stopAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartCheckin)) {
                return false;
            }
            StartCheckin startCheckin = (StartCheckin) obj;
            return Intrinsics.d(this.f4875a, startCheckin.f4875a) && Intrinsics.d(this.b, startCheckin.b) && Intrinsics.d(this.c, startCheckin.c);
        }

        public final int hashCode() {
            int iHashCode = this.f4875a.hashCode() * 31;
            StopAppModel stopAppModel = this.b;
            int iHashCode2 = (iHashCode + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
            StopAppModel stopAppModel2 = this.c;
            return iHashCode2 + (stopAppModel2 != null ? stopAppModel2.hashCode() : 0);
        }

        public final String toString() {
            return "StartCheckin(routeAppModel=" + this.f4875a + ", fromStop=" + this.b + ", toStop=" + this.c + ")";
        }
    }
}
