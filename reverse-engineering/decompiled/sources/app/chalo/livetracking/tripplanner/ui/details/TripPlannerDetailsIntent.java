package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import defpackage.b3;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "", "InitializationIntent", "TrackBusClickedIntent", "BuyTicketClickedIntent", "CombinedBuyTicketClickedIntent", "BackButtonClickedIntent", "OnMapLoaded", "FragmentStartedIntent", "FragmentStoppedIntent", "MapMarkerClickedIntent", "BuyMetroTicketClickedIntent", "BuyMetroTicketBottomSheetClickedIntent", "MetroTicketPurchaseBottomSheetCancelClickedIntent", "MetroTicketPurchaseBottomSheetDismissIntent", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$BackButtonClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$BuyMetroTicketBottomSheetClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$BuyMetroTicketClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$BuyTicketClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$CombinedBuyTicketClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$FragmentStartedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$FragmentStoppedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$InitializationIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$MapMarkerClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$MetroTicketPurchaseBottomSheetCancelClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$MetroTicketPurchaseBottomSheetDismissIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$OnMapLoaded;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$TrackBusClickedIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TripPlannerDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$BackButtonClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackButtonClickedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackButtonClickedIntent f4725a = new BackButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$BuyMetroTicketBottomSheetClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuyMetroTicketBottomSheetClickedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopAppModel f4726a;
        public final StopAppModel b;

        public BuyMetroTicketBottomSheetClickedIntent(StopAppModel origin, StopAppModel destination) {
            Intrinsics.i(origin, "origin");
            Intrinsics.i(destination, "destination");
            this.f4726a = origin;
            this.b = destination;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyMetroTicketBottomSheetClickedIntent)) {
                return false;
            }
            BuyMetroTicketBottomSheetClickedIntent buyMetroTicketBottomSheetClickedIntent = (BuyMetroTicketBottomSheetClickedIntent) obj;
            return Intrinsics.d(this.f4726a, buyMetroTicketBottomSheetClickedIntent.f4726a) && Intrinsics.d(this.b, buyMetroTicketBottomSheetClickedIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4726a.hashCode() * 31);
        }

        public final String toString() {
            return "BuyMetroTicketBottomSheetClickedIntent(origin=" + this.f4726a + ", destination=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$BuyMetroTicketClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuyMetroTicketClickedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4727a;

        public BuyMetroTicketClickedIntent(String routeId) {
            Intrinsics.i(routeId, "routeId");
            this.f4727a = routeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyMetroTicketClickedIntent) && Intrinsics.d(this.f4727a, ((BuyMetroTicketClickedIntent) obj).f4727a);
        }

        public final int hashCode() {
            return this.f4727a.hashCode();
        }

        public final String toString() {
            return vo1.B("BuyMetroTicketClickedIntent(routeId=", this.f4727a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$BuyTicketClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuyTicketClickedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4728a;

        public BuyTicketClickedIntent(String routeId) {
            Intrinsics.i(routeId, "routeId");
            this.f4728a = routeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyTicketClickedIntent) && Intrinsics.d(this.f4728a, ((BuyTicketClickedIntent) obj).f4728a);
        }

        public final int hashCode() {
            return this.f4728a.hashCode();
        }

        public final String toString() {
            return vo1.B("BuyTicketClickedIntent(routeId=", this.f4728a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$CombinedBuyTicketClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CombinedBuyTicketClickedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CombinedBuyTicketClickedIntent f4729a = new CombinedBuyTicketClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$FragmentStartedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStartedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStartedIntent f4730a = new FragmentStartedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$FragmentStoppedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStoppedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStoppedIntent f4731a = new FragmentStoppedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$InitializationIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TripPlannerItineraryAppResponseModel f4732a;
        public final long b;

        public InitializationIntent(TripPlannerItineraryAppResponseModel itinerary, long j) {
            Intrinsics.i(itinerary, "itinerary");
            this.f4732a = itinerary;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f4732a, initializationIntent.f4732a) && this.b == initializationIntent.b;
        }

        public final int hashCode() {
            int iHashCode = this.f4732a.hashCode() * 31;
            long j = this.b;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "InitializationIntent(itinerary=" + this.f4732a + ", tripPlannerStartTime=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$MapMarkerClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapMarkerClickedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TripPlannerLegAppModel f4733a;

        public MapMarkerClickedIntent(TripPlannerLegAppModel marker) {
            Intrinsics.i(marker, "marker");
            this.f4733a = marker;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MapMarkerClickedIntent) && Intrinsics.d(this.f4733a, ((MapMarkerClickedIntent) obj).f4733a);
        }

        public final int hashCode() {
            return this.f4733a.hashCode();
        }

        public final String toString() {
            return "MapMarkerClickedIntent(marker=" + this.f4733a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$MetroTicketPurchaseBottomSheetCancelClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MetroTicketPurchaseBottomSheetCancelClickedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MetroTicketPurchaseBottomSheetCancelClickedIntent f4734a = new MetroTicketPurchaseBottomSheetCancelClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$MetroTicketPurchaseBottomSheetDismissIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MetroTicketPurchaseBottomSheetDismissIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MetroTicketPurchaseBottomSheetDismissIntent f4735a = new MetroTicketPurchaseBottomSheetDismissIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$OnMapLoaded;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMapLoaded extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnMapLoaded f4736a = new OnMapLoaded();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent$TrackBusClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/details/TripPlannerDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackBusClickedIntent extends TripPlannerDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4737a;

        public TrackBusClickedIntent(int i) {
            this.f4737a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackBusClickedIntent) && this.f4737a == ((TrackBusClickedIntent) obj).f4737a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF4737a() {
            return this.f4737a;
        }

        public final String toString() {
            return b3.d(this.f4737a, "TrackBusClickedIntent(legIndex=", ")");
        }
    }
}
