package app.chalo.busesaroundyou;

import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.geoquery.data.LiveTripInfoDataModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "", "InitialIntent", "InternetConnectionIntent", "MapCameraPositionStateChangedIntent", "BusMarkerClicked", "GoToMyLocationClickedIntent", "OnMapLoaded", "GrantLocationPermissionThroughSettingDialogConfirmClicked", "GrantLocationPermissionThroughSettingDialogDismissed", "OnCrashLoggingRequired", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$BusMarkerClicked;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$GoToMyLocationClickedIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$GrantLocationPermissionThroughSettingDialogConfirmClicked;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$GrantLocationPermissionThroughSettingDialogDismissed;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$InitialIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$InternetConnectionIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$MapCameraPositionStateChangedIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$OnCrashLoggingRequired;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent$OnMapLoaded;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BusesAroundYouIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$BusMarkerClicked;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BusMarkerClicked extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LiveTripInfoDataModel f1176a;

        public BusMarkerClicked(LiveTripInfoDataModel cardInfo) {
            Intrinsics.i(cardInfo, "cardInfo");
            this.f1176a = cardInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BusMarkerClicked) && Intrinsics.d(this.f1176a, ((BusMarkerClicked) obj).f1176a);
        }

        public final int hashCode() {
            return this.f1176a.hashCode();
        }

        public final String toString() {
            return "BusMarkerClicked(cardInfo=" + this.f1176a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$GoToMyLocationClickedIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToMyLocationClickedIntent extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GoToMyLocationClickedIntent f1177a = new GoToMyLocationClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$GrantLocationPermissionThroughSettingDialogConfirmClicked;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GrantLocationPermissionThroughSettingDialogConfirmClicked extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GrantLocationPermissionThroughSettingDialogConfirmClicked f1178a = new GrantLocationPermissionThroughSettingDialogConfirmClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GrantLocationPermissionThroughSettingDialogConfirmClicked);
        }

        public final int hashCode() {
            return -759739078;
        }

        public final String toString() {
            return "GrantLocationPermissionThroughSettingDialogConfirmClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$GrantLocationPermissionThroughSettingDialogDismissed;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GrantLocationPermissionThroughSettingDialogDismissed extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GrantLocationPermissionThroughSettingDialogDismissed f1179a = new GrantLocationPermissionThroughSettingDialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GrantLocationPermissionThroughSettingDialogDismissed);
        }

        public final int hashCode() {
            return 634336470;
        }

        public final String toString() {
            return "GrantLocationPermissionThroughSettingDialogDismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$InitialIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialIntent f1180a = new InitialIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialIntent);
        }

        public final int hashCode() {
            return 526030176;
        }

        public final String toString() {
            return "InitialIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$InternetConnectionIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InternetConnectionIntent extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NetworkConnectionType f1181a;

        public InternetConnectionIntent(NetworkConnectionType currentNetworkConnectionType) {
            Intrinsics.i(currentNetworkConnectionType, "currentNetworkConnectionType");
            this.f1181a = currentNetworkConnectionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InternetConnectionIntent) && this.f1181a == ((InternetConnectionIntent) obj).f1181a;
        }

        public final int hashCode() {
            return this.f1181a.hashCode();
        }

        public final String toString() {
            return "InternetConnectionIntent(currentNetworkConnectionType=" + this.f1181a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$MapCameraPositionStateChangedIntent;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapCameraPositionStateChangedIntent extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloMapCameraPositionStateData f1182a;

        public MapCameraPositionStateChangedIntent(ChaloMapCameraPositionStateData cameraPositionState) {
            Intrinsics.i(cameraPositionState, "cameraPositionState");
            this.f1182a = cameraPositionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MapCameraPositionStateChangedIntent) && Intrinsics.d(this.f1182a, ((MapCameraPositionStateChangedIntent) obj).f1182a);
        }

        public final int hashCode() {
            return this.f1182a.hashCode();
        }

        public final String toString() {
            return "MapCameraPositionStateChangedIntent(cameraPositionState=" + this.f1182a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$OnCrashLoggingRequired;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnCrashLoggingRequired extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CrashlyticsLog f1183a;

        public OnCrashLoggingRequired(CrashlyticsLog crashlyticsLog) {
            Intrinsics.i(crashlyticsLog, "crashlyticsLog");
            this.f1183a = crashlyticsLog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCrashLoggingRequired) && Intrinsics.d(this.f1183a, ((OnCrashLoggingRequired) obj).f1183a);
        }

        public final int hashCode() {
            return this.f1183a.hashCode();
        }

        public final String toString() {
            return "OnCrashLoggingRequired(crashlyticsLog=" + this.f1183a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouIntent$OnMapLoaded;", "Lapp/chalo/busesaroundyou/BusesAroundYouIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnMapLoaded extends BusesAroundYouIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnMapLoaded f1184a = new OnMapLoaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnMapLoaded);
        }

        public final int hashCode() {
            return 981483458;
        }

        public final String toString() {
            return "OnMapLoaded";
        }
    }
}
