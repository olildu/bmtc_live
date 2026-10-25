package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "", "InitialisationIntent", "RestoreScreenStateFromProcessDeathIntent", "OnSelectLineClicked", "OnFromStationClick", "OnToStationClick", "OnSwapButtonClick", "OnSearchButtonClick", "OnLineSelectedClick", "OnCloseButtonClicked", "OnRecentStationPairClicked", "OnRecentStopBasedPairClicked", "BottomSheetDismissIntent", "OnStationPickedIntent", "OnUniversalSearchResultReceived", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$InitialisationIntent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnCloseButtonClicked;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnFromStationClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnLineSelectedClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnRecentStationPairClicked;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnRecentStopBasedPairClicked;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnSearchButtonClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnSelectLineClicked;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnStationPickedIntent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnSwapButtonClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnToStationClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnUniversalSearchResultReceived;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$RestoreScreenStateFromProcessDeathIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MetroLandingScreenViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomSheetDismissIntent extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissIntent f5495a = new BottomSheetDismissIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$InitialisationIntent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MetroLandingScreenRestoredState f5496a;
        public final StopAppModel b;
        public final StopAppModel c;

        public InitialisationIntent(MetroLandingScreenRestoredState metroLandingScreenRestoredState, StopAppModel stopAppModel, StopAppModel stopAppModel2) {
            this.f5496a = metroLandingScreenRestoredState;
            this.b = stopAppModel;
            this.c = stopAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialisationIntent)) {
                return false;
            }
            InitialisationIntent initialisationIntent = (InitialisationIntent) obj;
            return Intrinsics.d(this.f5496a, initialisationIntent.f5496a) && Intrinsics.d(this.b, initialisationIntent.b) && Intrinsics.d(this.c, initialisationIntent.c);
        }

        public final int hashCode() {
            MetroLandingScreenRestoredState metroLandingScreenRestoredState = this.f5496a;
            int iHashCode = (metroLandingScreenRestoredState == null ? 0 : metroLandingScreenRestoredState.hashCode()) * 31;
            StopAppModel stopAppModel = this.b;
            int iHashCode2 = (iHashCode + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
            StopAppModel stopAppModel2 = this.c;
            return iHashCode2 + (stopAppModel2 != null ? stopAppModel2.hashCode() : 0);
        }

        public final String toString() {
            return "InitialisationIntent(restoredState=" + this.f5496a + ", startStop=" + this.b + ", endStop=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnCloseButtonClicked;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCloseButtonClicked extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnCloseButtonClicked f5497a = new OnCloseButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnFromStationClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFromStationClick extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnFromStationClick f5498a = new OnFromStationClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnLineSelectedClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnLineSelectedClick extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5499a;

        public OnLineSelectedClick(int i) {
            this.f5499a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLineSelectedClick) && this.f5499a == ((OnLineSelectedClick) obj).f5499a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF5499a() {
            return this.f5499a;
        }

        public final String toString() {
            return b3.d(this.f5499a, "OnLineSelectedClick(itemIndex=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnRecentStationPairClicked;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRecentStationPairClicked extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentStopAndRouteBasedAppModel f5500a;

        public OnRecentStationPairClicked(RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel) {
            this.f5500a = recentStopAndRouteBasedAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecentStationPairClicked) && Intrinsics.d(this.f5500a, ((OnRecentStationPairClicked) obj).f5500a);
        }

        public final int hashCode() {
            return this.f5500a.hashCode();
        }

        public final String toString() {
            return "OnRecentStationPairClicked(tripAppModel=" + this.f5500a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnRecentStopBasedPairClicked;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRecentStopBasedPairClicked extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentStopBasedTripAppModel f5501a;

        public OnRecentStopBasedPairClicked(RecentStopBasedTripAppModel recentStopBasedTripAppModel) {
            this.f5501a = recentStopBasedTripAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecentStopBasedPairClicked) && Intrinsics.d(this.f5501a, ((OnRecentStopBasedPairClicked) obj).f5501a);
        }

        public final int hashCode() {
            return this.f5501a.hashCode();
        }

        public final String toString() {
            return "OnRecentStopBasedPairClicked(tripAppModel=" + this.f5501a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnSearchButtonClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSearchButtonClick extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSearchButtonClick f5502a = new OnSearchButtonClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnSelectLineClicked;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSelectLineClicked extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSelectLineClicked f5503a = new OnSelectLineClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnStationPickedIntent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStationPickedIntent extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductBookingStopDetails f5504a;

        public OnStationPickedIntent(ProductBookingStopDetails station) {
            Intrinsics.i(station, "station");
            this.f5504a = station;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStationPickedIntent) && Intrinsics.d(this.f5504a, ((OnStationPickedIntent) obj).f5504a);
        }

        public final int hashCode() {
            return this.f5504a.hashCode();
        }

        public final String toString() {
            return "OnStationPickedIntent(station=" + this.f5504a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnSwapButtonClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSwapButtonClick extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSwapButtonClick f5505a = new OnSwapButtonClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnToStationClick;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnToStationClick extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnToStationClick f5506a = new OnToStationClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$OnUniversalSearchResultReceived;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnUniversalSearchResultReceived extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopAppModel f5507a;

        public OnUniversalSearchResultReceived(StopAppModel stop) {
            Intrinsics.i(stop, "stop");
            this.f5507a = stop;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnUniversalSearchResultReceived) && Intrinsics.d(this.f5507a, ((OnUniversalSearchResultReceived) obj).f5507a);
        }

        public final int hashCode() {
            return this.f5507a.hashCode();
        }

        public final String toString() {
            return "OnUniversalSearchResultReceived(stop=" + this.f5507a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent$RestoreScreenStateFromProcessDeathIntent;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RestoreScreenStateFromProcessDeathIntent extends MetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MetroLandingScreenRestoredState f5508a;

        public RestoreScreenStateFromProcessDeathIntent(MetroLandingScreenRestoredState metroLandingScreenRestoredState) {
            this.f5508a = metroLandingScreenRestoredState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestoreScreenStateFromProcessDeathIntent) && Intrinsics.d(this.f5508a, ((RestoreScreenStateFromProcessDeathIntent) obj).f5508a);
        }

        public final int hashCode() {
            MetroLandingScreenRestoredState metroLandingScreenRestoredState = this.f5508a;
            if (metroLandingScreenRestoredState == null) {
                return 0;
            }
            return metroLandingScreenRestoredState.hashCode();
        }

        public final String toString() {
            return "RestoreScreenStateFromProcessDeathIntent(restoredState=" + this.f5508a + ")";
        }
    }
}
