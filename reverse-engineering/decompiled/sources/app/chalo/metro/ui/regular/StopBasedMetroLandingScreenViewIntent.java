package app.chalo.metro.ui.regular;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "", "InitialisationIntent", "OnFromStationClick", "OnToStationClick", "OnSwapButtonClick", "OnSearchButtonClick", "OnRecentStopBasedTripPairClicked", "BottomSheetDismissIntent", "OnStationPickedIntent", "OnPassengerIncreaseCountClick", "OnPassengerDecreaseCountClick", "OnCloseButtonClicked", "OnProceedButtonClicked", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$InitialisationIntent;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnCloseButtonClicked;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnFromStationClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnPassengerDecreaseCountClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnPassengerIncreaseCountClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnProceedButtonClicked;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnRecentStopBasedTripPairClicked;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnSearchButtonClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnStationPickedIntent;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnSwapButtonClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnToStationClick;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopBasedMetroLandingScreenViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomSheetDismissIntent extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissIntent f5535a = new BottomSheetDismissIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$InitialisationIntent;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopAppModel f5536a;
        public final StopAppModel b;

        public InitialisationIntent(StopAppModel stopAppModel, StopAppModel stopAppModel2) {
            this.f5536a = stopAppModel;
            this.b = stopAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialisationIntent)) {
                return false;
            }
            InitialisationIntent initialisationIntent = (InitialisationIntent) obj;
            return Intrinsics.d(this.f5536a, initialisationIntent.f5536a) && Intrinsics.d(this.b, initialisationIntent.b);
        }

        public final int hashCode() {
            StopAppModel stopAppModel = this.f5536a;
            int iHashCode = (stopAppModel == null ? 0 : stopAppModel.hashCode()) * 31;
            StopAppModel stopAppModel2 = this.b;
            return iHashCode + (stopAppModel2 != null ? stopAppModel2.hashCode() : 0);
        }

        public final String toString() {
            return "InitialisationIntent(startStop=" + this.f5536a + ", endStop=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnCloseButtonClicked;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCloseButtonClicked extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnCloseButtonClicked f5537a = new OnCloseButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnFromStationClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFromStationClick extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnFromStationClick f5538a = new OnFromStationClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnPassengerDecreaseCountClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPassengerDecreaseCountClick extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5539a;

        public OnPassengerDecreaseCountClick(String id) {
            Intrinsics.i(id, "id");
            this.f5539a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPassengerDecreaseCountClick) && Intrinsics.d(this.f5539a, ((OnPassengerDecreaseCountClick) obj).f5539a);
        }

        public final int hashCode() {
            return this.f5539a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPassengerDecreaseCountClick(id=", this.f5539a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnPassengerIncreaseCountClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPassengerIncreaseCountClick extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5540a;

        public OnPassengerIncreaseCountClick(String id) {
            Intrinsics.i(id, "id");
            this.f5540a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPassengerIncreaseCountClick) && Intrinsics.d(this.f5540a, ((OnPassengerIncreaseCountClick) obj).f5540a);
        }

        public final int hashCode() {
            return this.f5540a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPassengerIncreaseCountClick(id=", this.f5540a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnProceedButtonClicked;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnProceedButtonClicked extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnProceedButtonClicked f5541a = new OnProceedButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnRecentStopBasedTripPairClicked;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRecentStopBasedTripPairClicked extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentStopBasedTripAppModel f5542a;

        public OnRecentStopBasedTripPairClicked(RecentStopBasedTripAppModel recentStopBasedTripAppModel) {
            this.f5542a = recentStopBasedTripAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecentStopBasedTripPairClicked) && Intrinsics.d(this.f5542a, ((OnRecentStopBasedTripPairClicked) obj).f5542a);
        }

        public final int hashCode() {
            return this.f5542a.hashCode();
        }

        public final String toString() {
            return "OnRecentStopBasedTripPairClicked(appModel=" + this.f5542a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnSearchButtonClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSearchButtonClick extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSearchButtonClick f5543a = new OnSearchButtonClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnStationPickedIntent;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStationPickedIntent extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductBookingStopDetails f5544a;

        public OnStationPickedIntent(ProductBookingStopDetails station) {
            Intrinsics.i(station, "station");
            this.f5544a = station;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStationPickedIntent) && Intrinsics.d(this.f5544a, ((OnStationPickedIntent) obj).f5544a);
        }

        public final int hashCode() {
            return this.f5544a.hashCode();
        }

        public final String toString() {
            return "OnStationPickedIntent(station=" + this.f5544a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnSwapButtonClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSwapButtonClick extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSwapButtonClick f5545a = new OnSwapButtonClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent$OnToStationClick;", "Lapp/chalo/metro/ui/regular/StopBasedMetroLandingScreenViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnToStationClick extends StopBasedMetroLandingScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnToStationClick f5546a = new OnToStationClick();
    }
}
