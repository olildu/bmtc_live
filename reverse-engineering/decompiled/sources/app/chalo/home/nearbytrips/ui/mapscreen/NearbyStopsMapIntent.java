package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.constants.Source;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "", "InitializationIntent", "MapLoadedIntent", "MapCameraPositionStateChangedIntent", "StopMarkerClicked", "FragmentStartIntent", "FragmentStopIntent", "GoToMyLocationClickedIntent", "LocationPermissionDeniedIntent", "GpsEnableDeniedIntent", "RouteClickedIntent", "SeeAllBusesClickedIntent", "SearchStopClickedIntent", "SearchStopResultReceivedIntent", "OnMapCameraUpdateLoadedIntent", "StopNameClicked", "UpdateBottomSheetStateIntent", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$FragmentStartIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$FragmentStopIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$GoToMyLocationClickedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$GpsEnableDeniedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$InitializationIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$LocationPermissionDeniedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$MapCameraPositionStateChangedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$MapLoadedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$OnMapCameraUpdateLoadedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$RouteClickedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$SearchStopClickedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$SearchStopResultReceivedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$SeeAllBusesClickedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$StopMarkerClicked;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$StopNameClicked;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$UpdateBottomSheetStateIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NearbyStopsMapIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$FragmentStartIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStartIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStartIntent f3147a = new FragmentStartIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$FragmentStopIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStopIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStopIntent f3148a = new FragmentStopIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$GoToMyLocationClickedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToMyLocationClickedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GoToMyLocationClickedIntent f3149a = new GoToMyLocationClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$GpsEnableDeniedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GpsEnableDeniedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GpsEnableDeniedIntent f3150a = new GpsEnableDeniedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$InitializationIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloTransitMode f3151a;
        public final Source b;

        public InitializationIntent(Source previousScreenSource, ChaloTransitMode mode) {
            Intrinsics.i(mode, "mode");
            Intrinsics.i(previousScreenSource, "previousScreenSource");
            this.f3151a = mode;
            this.b = previousScreenSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return this.f3151a == initializationIntent.f3151a && this.b == initializationIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3151a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(mode=" + this.f3151a + ", previousScreenSource=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$LocationPermissionDeniedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationPermissionDeniedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationPermissionDeniedIntent f3152a = new LocationPermissionDeniedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$MapCameraPositionStateChangedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapCameraPositionStateChangedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloMapCameraPositionStateData f3153a;

        public MapCameraPositionStateChangedIntent(ChaloMapCameraPositionStateData cameraPositionState) {
            Intrinsics.i(cameraPositionState, "cameraPositionState");
            this.f3153a = cameraPositionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MapCameraPositionStateChangedIntent) && Intrinsics.d(this.f3153a, ((MapCameraPositionStateChangedIntent) obj).f3153a);
        }

        public final int hashCode() {
            return this.f3153a.hashCode();
        }

        public final String toString() {
            return "MapCameraPositionStateChangedIntent(cameraPositionState=" + this.f3153a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$MapLoadedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MapLoadedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MapLoadedIntent f3154a = new MapLoadedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$OnMapCameraUpdateLoadedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnMapCameraUpdateLoadedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MapCameraUpdate f3155a;

        public OnMapCameraUpdateLoadedIntent(MapCameraUpdate cameraUpdate) {
            Intrinsics.i(cameraUpdate, "cameraUpdate");
            this.f3155a = cameraUpdate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMapCameraUpdateLoadedIntent) && Intrinsics.d(this.f3155a, ((OnMapCameraUpdateLoadedIntent) obj).f3155a);
        }

        public final int hashCode() {
            return this.f3155a.hashCode();
        }

        public final String toString() {
            return "OnMapCameraUpdateLoadedIntent(cameraUpdate=" + this.f3155a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$RouteClickedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteClickedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopTripDetailsUiModel f3156a;

        public RouteClickedIntent(StopTripDetailsUiModel data) {
            Intrinsics.i(data, "data");
            this.f3156a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteClickedIntent) && Intrinsics.d(this.f3156a, ((RouteClickedIntent) obj).f3156a);
        }

        public final int hashCode() {
            return this.f3156a.hashCode();
        }

        public final String toString() {
            return "RouteClickedIntent(data=" + this.f3156a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$SearchStopClickedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SearchStopClickedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SearchStopClickedIntent f3157a = new SearchStopClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$SearchStopResultReceivedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchStopResultReceivedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopAppModel f3158a;

        public SearchStopResultReceivedIntent(StopAppModel stopAppModel) {
            this.f3158a = stopAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchStopResultReceivedIntent) && Intrinsics.d(this.f3158a, ((SearchStopResultReceivedIntent) obj).f3158a);
        }

        public final int hashCode() {
            StopAppModel stopAppModel = this.f3158a;
            if (stopAppModel == null) {
                return 0;
            }
            return stopAppModel.hashCode();
        }

        public final String toString() {
            return "SearchStopResultReceivedIntent(stop=" + this.f3158a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$SeeAllBusesClickedIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeAllBusesClickedIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NearbyStopAndTripsUiModel f3159a;

        public SeeAllBusesClickedIntent(NearbyStopAndTripsUiModel data) {
            Intrinsics.i(data, "data");
            this.f3159a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeeAllBusesClickedIntent) && Intrinsics.d(this.f3159a, ((SeeAllBusesClickedIntent) obj).f3159a);
        }

        public final int hashCode() {
            return this.f3159a.hashCode();
        }

        public final String toString() {
            return "SeeAllBusesClickedIntent(data=" + this.f3159a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$StopMarkerClicked;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopMarkerClicked extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopAppModel f3160a;

        public StopMarkerClicked(StopAppModel stopAppModel) {
            this.f3160a = stopAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopMarkerClicked) && Intrinsics.d(this.f3160a, ((StopMarkerClicked) obj).f3160a);
        }

        public final int hashCode() {
            return this.f3160a.hashCode();
        }

        public final String toString() {
            return "StopMarkerClicked(stop=" + this.f3160a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$StopNameClicked;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopNameClicked extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NearbyStopAndTripsUiModel f3161a;

        public StopNameClicked(NearbyStopAndTripsUiModel data) {
            Intrinsics.i(data, "data");
            this.f3161a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopNameClicked) && Intrinsics.d(this.f3161a, ((StopNameClicked) obj).f3161a);
        }

        public final int hashCode() {
            return this.f3161a.hashCode();
        }

        public final String toString() {
            return "StopNameClicked(data=" + this.f3161a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent$UpdateBottomSheetStateIntent;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateBottomSheetStateIntent extends NearbyStopsMapIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3162a;

        public UpdateBottomSheetStateIntent(boolean z) {
            this.f3162a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateBottomSheetStateIntent) && this.f3162a == ((UpdateBottomSheetStateIntent) obj).f3162a;
        }

        public final int hashCode() {
            return this.f3162a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("UpdateBottomSheetStateIntent(isFullyExpanded=", ")", this.f3162a);
        }
    }
}
