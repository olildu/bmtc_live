package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.ads.BindNativeAdResult;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.livetracking.routedetails.ReportProblemTagDetails;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.StopCtaActionType;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.routedetails.domain.RouteDetailsOptionsMenu;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteDetailsMapMarker;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\"\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#\u0082\u0001\"$%&'()*+,-./0123456789:;<=>?@ABCDE¨\u0006F"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "", "InitialIntent", "OnStartIntent", "OnStopIntent", "OnRetryClicked", "UserDestinationStopSelectedIntent", "StopSelectedToViewEtasIntent", "SearchStopSelectedToViewEtasIntent", "MapMarkerInteraction", "OnRouteBookingCtaClicked", "OnOptionsMenuItemClickedIntent", "OnDropDownIconClick", "StopCtaClicked", "ChangeUserDestinationClickedIntent", "OnBackPressed", "LiveSeatAvailabilityIndicatorInfoIconClicked", "LiveSeatAvailabilityBottomSheetCtaClicked", "RouteBannerClickedIntent", "RouteBannerDialogueCtaClickedIntent", "ReportProblemButtonClicked", "ReportIssueHookClicked", "ReportProblemModalSubmitClicked", "ReportProblemModalCancelClicked", "ReportProblemModalAckClicked", "OnMyLocationClicked", "UpdateLocationPermission", "OnMapCameraUpdateLoaded", "OnMapLoaded", "OnViaStringClickedIntent", "OnViaStringDialogCloseClickIntent", "StopSearchQueryUpdate", "ReportProblemTagClicked", "ReportProblemFeedbackEntered", "NativeAdLoaded", "NativeAdFailedToLoad", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ChangeUserDestinationClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$InitialIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$LiveSeatAvailabilityBottomSheetCtaClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$LiveSeatAvailabilityIndicatorInfoIconClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$NativeAdFailedToLoad;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$NativeAdLoaded;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnBackPressed;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnDropDownIconClick;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnMapCameraUpdateLoaded;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnMapLoaded;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnMyLocationClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnOptionsMenuItemClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnRetryClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnRouteBookingCtaClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnStartIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnStopIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnViaStringClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnViaStringDialogCloseClickIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportIssueHookClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemButtonClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemFeedbackEntered;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemModalAckClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemModalCancelClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemModalSubmitClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemTagClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$RouteBannerClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$RouteBannerDialogueCtaClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$SearchStopSelectedToViewEtasIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$StopCtaClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$StopSearchQueryUpdate;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$StopSelectedToViewEtasIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$UpdateLocationPermission;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$UserDestinationStopSelectedIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ChangeUserDestinationClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChangeUserDestinationClickedIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeUserDestinationClickedIntent f4836a = new ChangeUserDestinationClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$InitialIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteDetailsIntentModel f4837a;

        public InitialIntent(RouteDetailsIntentModel routeDetailsIntentModel) {
            this.f4837a = routeDetailsIntentModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialIntent) && Intrinsics.d(this.f4837a, ((InitialIntent) obj).f4837a);
        }

        public final int hashCode() {
            return this.f4837a.hashCode();
        }

        public final String toString() {
            return "InitialIntent(routeDetailsIntentModel=" + this.f4837a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$LiveSeatAvailabilityBottomSheetCtaClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveSeatAvailabilityBottomSheetCtaClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LiveSeatAvailabilityBottomSheetCtaType f4838a;

        public LiveSeatAvailabilityBottomSheetCtaClicked(LiveSeatAvailabilityBottomSheetCtaType liveSeatAvailabilityBottomSheetCtaType) {
            this.f4838a = liveSeatAvailabilityBottomSheetCtaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LiveSeatAvailabilityBottomSheetCtaClicked) && Intrinsics.d(this.f4838a, ((LiveSeatAvailabilityBottomSheetCtaClicked) obj).f4838a);
        }

        public final int hashCode() {
            return this.f4838a.hashCode();
        }

        public final String toString() {
            return "LiveSeatAvailabilityBottomSheetCtaClicked(ctaType=" + this.f4838a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$LiveSeatAvailabilityIndicatorInfoIconClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LiveSeatAvailabilityIndicatorInfoIconClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LiveSeatAvailabilityIndicatorInfoIconClicked f4839a = new LiveSeatAvailabilityIndicatorInfoIconClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "MapMarkerClicked", "MapInfoWindowClosed", "OnMapInfoWindowClicked", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction$MapInfoWindowClosed;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction$MapMarkerClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction$OnMapInfoWindowClicked;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MapMarkerInteraction extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteDetailsMapMarker f4840a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction$MapInfoWindowClosed;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MapInfoWindowClosed extends MapMarkerInteraction {
            public final RouteDetailsMapMarker b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MapInfoWindowClosed(RouteDetailsMapMarker marker) {
                super(marker);
                Intrinsics.i(marker, "marker");
                this.b = marker;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MapInfoWindowClosed) && Intrinsics.d(this.b, ((MapInfoWindowClosed) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "MapInfoWindowClosed(marker=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction$MapMarkerClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MapMarkerClicked extends MapMarkerInteraction {
            public final RouteDetailsMapMarker b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MapMarkerClicked(RouteDetailsMapMarker marker) {
                super(marker);
                Intrinsics.i(marker, "marker");
                this.b = marker;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MapMarkerClicked) && Intrinsics.d(this.b, ((MapMarkerClicked) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "MapMarkerClicked(marker=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction$OnMapInfoWindowClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$MapMarkerInteraction;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnMapInfoWindowClicked extends MapMarkerInteraction {
            public final RouteDetailsMapMarker b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMapInfoWindowClicked(RouteDetailsMapMarker marker) {
                super(marker);
                Intrinsics.i(marker, "marker");
                this.b = marker;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnMapInfoWindowClicked) && Intrinsics.d(this.b, ((OnMapInfoWindowClicked) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnMapInfoWindowClicked(marker=" + this.b + ")";
            }
        }

        public MapMarkerInteraction(RouteDetailsMapMarker routeDetailsMapMarker) {
            this.f4840a = routeDetailsMapMarker;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$NativeAdFailedToLoad;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NativeAdFailedToLoad extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4841a;
        public final int b;
        public final BindNativeAdResult.Failed c;

        public NativeAdFailedToLoad(String stopId, int i, BindNativeAdResult.Failed failed) {
            Intrinsics.i(stopId, "stopId");
            this.f4841a = stopId;
            this.b = i;
            this.c = failed;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NativeAdFailedToLoad)) {
                return false;
            }
            NativeAdFailedToLoad nativeAdFailedToLoad = (NativeAdFailedToLoad) obj;
            return Intrinsics.d(this.f4841a, nativeAdFailedToLoad.f4841a) && this.b == nativeAdFailedToLoad.b && Intrinsics.d(this.c, nativeAdFailedToLoad.c);
        }

        public final int hashCode() {
            int iHashCode = ((this.f4841a.hashCode() * 31) + this.b) * 31;
            BindNativeAdResult.Failed failed = this.c;
            return iHashCode + (failed == null ? 0 : failed.hashCode());
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.b, "NativeAdFailedToLoad(stopId=", this.f4841a, ", errorCode=", ", failedResult=");
            sbM.append(this.c);
            sbM.append(")");
            return sbM.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$NativeAdLoaded;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NativeAdLoaded extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4842a;
        public final String b;
        public final BindNativeAdResult.Success c;
        public final Long d;

        public NativeAdLoaded(String stopId, String adUnitId, BindNativeAdResult.Success successResult, Long l) {
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(adUnitId, "adUnitId");
            Intrinsics.i(successResult, "successResult");
            this.f4842a = stopId;
            this.b = adUnitId;
            this.c = successResult;
            this.d = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NativeAdLoaded)) {
                return false;
            }
            NativeAdLoaded nativeAdLoaded = (NativeAdLoaded) obj;
            return Intrinsics.d(this.f4842a, nativeAdLoaded.f4842a) && Intrinsics.d(this.b, nativeAdLoaded.b) && Intrinsics.d(this.c, nativeAdLoaded.c) && Intrinsics.d(this.d, nativeAdLoaded.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + nf1.e(this.f4842a.hashCode() * 31, 31, this.b)) * 31;
            Long l = this.d;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sbE = dd.e("NativeAdLoaded(stopId=", this.f4842a, ", adUnitId=", this.b, ", successResult=");
            sbE.append(this.c);
            sbE.append(", requestToLoadDeltaInMillis=");
            sbE.append(this.d);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnBackPressed;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackPressed extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressed f4843a = new OnBackPressed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnDropDownIconClick;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDropDownIconClick extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnDropDownIconClick f4844a = new OnDropDownIconClick();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnMapCameraUpdateLoaded;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnMapCameraUpdateLoaded extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MapCameraUpdate f4845a;

        public OnMapCameraUpdateLoaded(MapCameraUpdate cameraUpdate) {
            Intrinsics.i(cameraUpdate, "cameraUpdate");
            this.f4845a = cameraUpdate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMapCameraUpdateLoaded) && Intrinsics.d(this.f4845a, ((OnMapCameraUpdateLoaded) obj).f4845a);
        }

        public final int hashCode() {
            return this.f4845a.hashCode();
        }

        public final String toString() {
            return "OnMapCameraUpdateLoaded(cameraUpdate=" + this.f4845a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnMapLoaded;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMapLoaded extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnMapLoaded f4846a = new OnMapLoaded();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnMyLocationClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMyLocationClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnMyLocationClicked f4847a = new OnMyLocationClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnOptionsMenuItemClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnOptionsMenuItemClickedIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteDetailsOptionsMenu f4848a;

        public OnOptionsMenuItemClickedIntent(RouteDetailsOptionsMenu menuOption) {
            Intrinsics.i(menuOption, "menuOption");
            this.f4848a = menuOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOptionsMenuItemClickedIntent) && this.f4848a == ((OnOptionsMenuItemClickedIntent) obj).f4848a;
        }

        public final int hashCode() {
            return this.f4848a.hashCode();
        }

        public final String toString() {
            return "OnOptionsMenuItemClickedIntent(menuOption=" + this.f4848a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnRetryClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRetryClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnRetryClicked f4849a = new OnRetryClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnRouteBookingCtaClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRouteBookingCtaClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteBookingType f4850a;

        public OnRouteBookingCtaClicked(RouteBookingType bookingType) {
            Intrinsics.i(bookingType, "bookingType");
            this.f4850a = bookingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRouteBookingCtaClicked) && this.f4850a == ((OnRouteBookingCtaClicked) obj).f4850a;
        }

        public final int hashCode() {
            return this.f4850a.hashCode();
        }

        public final String toString() {
            return "OnRouteBookingCtaClicked(bookingType=" + this.f4850a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnStartIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStartIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnStartIntent f4851a = new OnStartIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnStopIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStopIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnStopIntent f4852a = new OnStopIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnViaStringClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnViaStringClickedIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnViaStringClickedIntent f4853a = new OnViaStringClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$OnViaStringDialogCloseClickIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnViaStringDialogCloseClickIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnViaStringDialogCloseClickIntent f4854a = new OnViaStringDialogCloseClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportIssueHookClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportIssueHookClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4855a;
        public final String b;
        public final StopEtaStatus c;
        public final StopEtaUiModel d;

        public ReportIssueHookClicked(String stopId, String stopName, StopEtaStatus stopEtaStatus, StopEtaUiModel stopEtaUiModel) {
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(stopName, "stopName");
            Intrinsics.i(stopEtaStatus, "stopEtaStatus");
            this.f4855a = stopId;
            this.b = stopName;
            this.c = stopEtaStatus;
            this.d = stopEtaUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportIssueHookClicked)) {
                return false;
            }
            ReportIssueHookClicked reportIssueHookClicked = (ReportIssueHookClicked) obj;
            return Intrinsics.d(this.f4855a, reportIssueHookClicked.f4855a) && Intrinsics.d(this.b, reportIssueHookClicked.b) && this.c == reportIssueHookClicked.c && Intrinsics.d(this.d, reportIssueHookClicked.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f4855a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("ReportIssueHookClicked(stopId=", this.f4855a, ", stopName=", this.b, ", stopEtaStatus=");
            sbE.append(this.c);
            sbE.append(", stopEtaUiModel=");
            sbE.append(this.d);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemButtonClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportProblemButtonClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemButtonClicked f4856a = new ReportProblemButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemFeedbackEntered;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemFeedbackEntered extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4857a;

        public ReportProblemFeedbackEntered(String feedback) {
            Intrinsics.i(feedback, "feedback");
            this.f4857a = feedback;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportProblemFeedbackEntered) && Intrinsics.d(this.f4857a, ((ReportProblemFeedbackEntered) obj).f4857a);
        }

        public final int hashCode() {
            return this.f4857a.hashCode();
        }

        public final String toString() {
            return vo1.B("ReportProblemFeedbackEntered(feedback=", this.f4857a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemModalAckClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportProblemModalAckClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemModalAckClicked f4858a = new ReportProblemModalAckClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemModalCancelClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportProblemModalCancelClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemModalCancelClicked f4859a = new ReportProblemModalCancelClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemModalSubmitClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemModalSubmitClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemModalSubmitClicked f4860a = new ReportProblemModalSubmitClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReportProblemModalSubmitClicked);
        }

        public final int hashCode() {
            return -1081907086;
        }

        public final String toString() {
            return "ReportProblemModalSubmitClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$ReportProblemTagClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemTagClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReportProblemTagDetails f4861a;

        public ReportProblemTagClicked(ReportProblemTagDetails reportProblemTagDetails) {
            this.f4861a = reportProblemTagDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportProblemTagClicked) && Intrinsics.d(this.f4861a, ((ReportProblemTagClicked) obj).f4861a);
        }

        public final int hashCode() {
            return this.f4861a.hashCode();
        }

        public final String toString() {
            return "ReportProblemTagClicked(tag=" + this.f4861a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$RouteBannerClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RouteBannerClickedIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteBannerClickedIntent f4862a = new RouteBannerClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$RouteBannerDialogueCtaClickedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RouteBannerDialogueCtaClickedIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteBannerDialogueCtaClickedIntent f4863a = new RouteBannerDialogueCtaClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$SearchStopSelectedToViewEtasIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchStopSelectedToViewEtasIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4864a;
        public final String b;

        public SearchStopSelectedToViewEtasIntent(String stopId, String stopSearchQuery) {
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(stopSearchQuery, "stopSearchQuery");
            this.f4864a = stopId;
            this.b = stopSearchQuery;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchStopSelectedToViewEtasIntent)) {
                return false;
            }
            SearchStopSelectedToViewEtasIntent searchStopSelectedToViewEtasIntent = (SearchStopSelectedToViewEtasIntent) obj;
            return Intrinsics.d(this.f4864a, searchStopSelectedToViewEtasIntent.f4864a) && Intrinsics.d(this.b, searchStopSelectedToViewEtasIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4864a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("SearchStopSelectedToViewEtasIntent(stopId=", this.f4864a, ", stopSearchQuery=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$StopCtaClicked;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopCtaClicked extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopCtaActionType f4865a;

        public StopCtaClicked(StopCtaActionType actionType) {
            Intrinsics.i(actionType, "actionType");
            this.f4865a = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopCtaClicked) && this.f4865a == ((StopCtaClicked) obj).f4865a;
        }

        public final int hashCode() {
            return (this.f4865a.hashCode() * 31) + 1237;
        }

        public final String toString() {
            return "StopCtaClicked(actionType=" + this.f4865a + ", isSourceStopFromMap=false)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$StopSearchQueryUpdate;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSearchQueryUpdate extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4866a;

        public StopSearchQueryUpdate(String searchQuery) {
            Intrinsics.i(searchQuery, "searchQuery");
            this.f4866a = searchQuery;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopSearchQueryUpdate) && Intrinsics.d(this.f4866a, ((StopSearchQueryUpdate) obj).f4866a);
        }

        public final int hashCode() {
            return this.f4866a.hashCode();
        }

        public final String toString() {
            return vo1.B("StopSearchQueryUpdate(searchQuery=", this.f4866a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$StopSelectedToViewEtasIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelectedToViewEtasIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4867a;
        public final boolean b;

        public StopSelectedToViewEtasIntent(int i, boolean z) {
            this.f4867a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopSelectedToViewEtasIntent)) {
                return false;
            }
            StopSelectedToViewEtasIntent stopSelectedToViewEtasIntent = (StopSelectedToViewEtasIntent) obj;
            return this.f4867a == stopSelectedToViewEtasIntent.f4867a && this.b == stopSelectedToViewEtasIntent.b;
        }

        public final int hashCode() {
            return (this.f4867a * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "StopSelectedToViewEtasIntent(stopIndex=" + this.f4867a + ", isStopAfterUserDestination=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$UpdateLocationPermission;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateLocationPermission extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateLocationPermission f4868a = new UpdateLocationPermission();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent$UserDestinationStopSelectedIntent;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserDestinationStopSelectedIntent extends RouteDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4869a;
        public final String b;

        public UserDestinationStopSelectedIntent(String stopId, String stopSearchQuery) {
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(stopSearchQuery, "stopSearchQuery");
            this.f4869a = stopId;
            this.b = stopSearchQuery;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserDestinationStopSelectedIntent)) {
                return false;
            }
            UserDestinationStopSelectedIntent userDestinationStopSelectedIntent = (UserDestinationStopSelectedIntent) obj;
            return Intrinsics.d(this.f4869a, userDestinationStopSelectedIntent.f4869a) && Intrinsics.d(this.b, userDestinationStopSelectedIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4869a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("UserDestinationStopSelectedIntent(stopId=", this.f4869a, ", stopSearchQuery=", this.b, ")");
        }
    }
}
