package app.chalo.home.ui.regularbus;

import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.home.data.model.app.LocationTurnOnTooltipType;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.homescreen.data.model.app.ImageResourceCtaType;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.homescreen.data.model.app.RegularBusScreenConfigAppModel;
import app.chalo.recent.model.app.RecentsType;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import defpackage.cb0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001a\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "", "ProfileIconClickedIntent", "SosClickedIntent", "LocationItemClickedIntent", "SeeAllPassesClickedIntent", "MapClickedIntent", "SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent", "SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent", "BottomSheetDismissIntent", "ScanAndPayBackPressedIntent", "RegularBusScreenViewStartedIntent", "RegularBusScreenViewStoppedIntent", "LocationTooltipCancelButtonClickedIntent", "UpdatedRetainedStateIntent", "RegularBusScreenInitializationIntent", "ChaloSearchBarClickedIntent", "RecentSearchItemClicked", "RegularBusPageItemClickedIntent", "StopClickedIntent", "SeeAllStopsClickedIntent", "SeeAllBusesClickedIntent", "RouteClickedIntent", "GpsRequestCallbackReceivedEventIntent", "LocationTurnOnButtonClickedIntent", "PermissionRationaleDialogInteraction", "JuspayPermissionRationaleDialogInteraction", "OnCrashLoggingRequired", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$ChaloSearchBarClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$GpsRequestCallbackReceivedEventIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$JuspayPermissionRationaleDialogInteraction;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$LocationItemClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$LocationTooltipCancelButtonClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$LocationTurnOnButtonClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$MapClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$OnCrashLoggingRequired;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$ProfileIconClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RecentSearchItemClicked;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RegularBusPageItemClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RegularBusScreenInitializationIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RegularBusScreenViewStartedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RegularBusScreenViewStoppedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RouteClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$ScanAndPayBackPressedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeeAllBusesClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeeAllPassesClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeeAllStopsClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SosClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$StopClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$UpdatedRetainedStateIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RegularBusViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomSheetDismissIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissIntent f3638a = new BottomSheetDismissIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BottomSheetDismissIntent);
        }

        public final int hashCode() {
            return -604754984;
        }

        public final String toString() {
            return "BottomSheetDismissIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$ChaloSearchBarClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloSearchBarClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3639a;

        public ChaloSearchBarClickedIntent(String searchBarTitle) {
            Intrinsics.i(searchBarTitle, "searchBarTitle");
            this.f3639a = searchBarTitle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChaloSearchBarClickedIntent) && Intrinsics.d(this.f3639a, ((ChaloSearchBarClickedIntent) obj).f3639a);
        }

        public final int hashCode() {
            return this.f3639a.hashCode();
        }

        public final String toString() {
            return vo1.B("ChaloSearchBarClickedIntent(searchBarTitle=", this.f3639a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$GpsRequestCallbackReceivedEventIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GpsRequestCallbackReceivedEventIntent extends RegularBusViewIntent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GpsRequestCallbackReceivedEventIntent) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$JuspayPermissionRationaleDialogInteraction;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class JuspayPermissionRationaleDialogInteraction extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3640a;

        public JuspayPermissionRationaleDialogInteraction(boolean z) {
            this.f3640a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JuspayPermissionRationaleDialogInteraction) && this.f3640a == ((JuspayPermissionRationaleDialogInteraction) obj).f3640a;
        }

        public final int hashCode() {
            return this.f3640a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("JuspayPermissionRationaleDialogInteraction(shouldNavigateToSettings=", ")", this.f3640a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$LocationItemClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationItemClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationItemClickedIntent f3641a = new LocationItemClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocationItemClickedIntent);
        }

        public final int hashCode() {
            return 1160428341;
        }

        public final String toString() {
            return "LocationItemClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$LocationTooltipCancelButtonClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationTooltipCancelButtonClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationTooltipCancelButtonClickedIntent f3642a = new LocationTooltipCancelButtonClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocationTooltipCancelButtonClickedIntent);
        }

        public final int hashCode() {
            return 777024367;
        }

        public final String toString() {
            return "LocationTooltipCancelButtonClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$LocationTurnOnButtonClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationTurnOnButtonClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocationTurnOnTooltipType f3643a;

        public LocationTurnOnButtonClickedIntent(LocationTurnOnTooltipType locationTurnOnTooltipType) {
            this.f3643a = locationTurnOnTooltipType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationTurnOnButtonClickedIntent) && Intrinsics.d(this.f3643a, ((LocationTurnOnButtonClickedIntent) obj).f3643a);
        }

        public final int hashCode() {
            return this.f3643a.hashCode();
        }

        public final String toString() {
            return "LocationTurnOnButtonClickedIntent(locationTurnOnTooltipType=" + this.f3643a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$MapClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MapClickedIntent f3644a = new MapClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapClickedIntent);
        }

        public final int hashCode() {
            return 946519885;
        }

        public final String toString() {
            return "MapClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$OnCrashLoggingRequired;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnCrashLoggingRequired extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CrashlyticsLog f3645a;

        public OnCrashLoggingRequired(CrashlyticsLog crashlyticsLog) {
            Intrinsics.i(crashlyticsLog, "crashlyticsLog");
            this.f3645a = crashlyticsLog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCrashLoggingRequired) && Intrinsics.d(this.f3645a, ((OnCrashLoggingRequired) obj).f3645a);
        }

        public final int hashCode() {
            return this.f3645a.hashCode();
        }

        public final String toString() {
            return "OnCrashLoggingRequired(crashlyticsLog=" + this.f3645a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionRationaleDialogInteraction extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3646a;

        public PermissionRationaleDialogInteraction(boolean z) {
            this.f3646a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionRationaleDialogInteraction) && this.f3646a == ((PermissionRationaleDialogInteraction) obj).f3646a;
        }

        public final int hashCode() {
            return this.f3646a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("PermissionRationaleDialogInteraction(shouldNavigateToSettings=", ")", this.f3646a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$ProfileIconClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfileIconClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileIconClickedIntent f3647a = new ProfileIconClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileIconClickedIntent);
        }

        public final int hashCode() {
            return -1516603737;
        }

        public final String toString() {
            return "ProfileIconClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RecentSearchItemClicked;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentSearchItemClicked extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentsType f3648a;
        public final int b;

        public RecentSearchItemClicked(RecentsType recentItem, int i) {
            Intrinsics.i(recentItem, "recentItem");
            this.f3648a = recentItem;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentSearchItemClicked)) {
                return false;
            }
            RecentSearchItemClicked recentSearchItemClicked = (RecentSearchItemClicked) obj;
            return Intrinsics.d(this.f3648a, recentSearchItemClicked.f3648a) && this.b == recentSearchItemClicked.b;
        }

        public final int hashCode() {
            return (this.f3648a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "RecentSearchItemClicked(recentItem=" + this.f3648a + ", position=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RegularBusPageItemClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegularBusPageItemClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RegularBusPageFeature f3649a;
        public final RegularBusProductItemData b;
        public final String c;
        public final int d;
        public final String e;
        public final ImageResourceCtaType f;
        public final String g;

        public RegularBusPageItemClickedIntent(RegularBusPageFeature featureType, RegularBusProductItemData regularBusProductItemData, String str, int i, String str2, ImageResourceCtaType imageResourceCtaType, String str3, int i2) {
            regularBusProductItemData = (i2 & 2) != 0 ? null : regularBusProductItemData;
            str = (i2 & 4) != 0 ? null : str;
            str2 = (i2 & 16) != 0 ? null : str2;
            imageResourceCtaType = (i2 & 32) != 0 ? null : imageResourceCtaType;
            str3 = (i2 & 64) != 0 ? null : str3;
            Intrinsics.i(featureType, "featureType");
            this.f3649a = featureType;
            this.b = regularBusProductItemData;
            this.c = str;
            this.d = i;
            this.e = str2;
            this.f = imageResourceCtaType;
            this.g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegularBusPageItemClickedIntent)) {
                return false;
            }
            RegularBusPageItemClickedIntent regularBusPageItemClickedIntent = (RegularBusPageItemClickedIntent) obj;
            return this.f3649a == regularBusPageItemClickedIntent.f3649a && Intrinsics.d(this.b, regularBusPageItemClickedIntent.b) && Intrinsics.d(this.c, regularBusPageItemClickedIntent.c) && this.d == regularBusPageItemClickedIntent.d && Intrinsics.d(this.e, regularBusPageItemClickedIntent.e) && this.f == regularBusPageItemClickedIntent.f && Intrinsics.d(this.g, regularBusPageItemClickedIntent.g);
        }

        public final int hashCode() {
            int iHashCode = this.f3649a.hashCode() * 31;
            RegularBusProductItemData regularBusProductItemData = this.b;
            int iHashCode2 = (iHashCode + (regularBusProductItemData == null ? 0 : regularBusProductItemData.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.d) * 31;
            String str2 = this.e;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ImageResourceCtaType imageResourceCtaType = this.f;
            int iHashCode5 = (iHashCode4 + (imageResourceCtaType == null ? 0 : imageResourceCtaType.hashCode())) * 31;
            String str3 = this.g;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RegularBusPageItemClickedIntent(featureType=");
            sb.append(this.f3649a);
            sb.append(", passDisplayData=");
            sb.append(this.b);
            sb.append(", itemTitle=");
            cb0.o(this.d, this.c, ", position=", ", onClickUrl=", sb);
            sb.append(this.e);
            sb.append(", ctaType=");
            sb.append(this.f);
            sb.append(", sectionId=");
            return vo1.p(sb, this.g, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RegularBusScreenInitializationIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegularBusScreenInitializationIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RegularBusScreenConfigAppModel f3650a;

        static {
            RegularBusScreenConfigAppModel.Companion companion = RegularBusScreenConfigAppModel.INSTANCE;
        }

        public RegularBusScreenInitializationIntent(RegularBusScreenConfigAppModel regularBusScreenData) {
            Intrinsics.i(regularBusScreenData, "regularBusScreenData");
            this.f3650a = regularBusScreenData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegularBusScreenInitializationIntent) && Intrinsics.d(this.f3650a, ((RegularBusScreenInitializationIntent) obj).f3650a);
        }

        public final int hashCode() {
            return this.f3650a.hashCode();
        }

        public final String toString() {
            return "RegularBusScreenInitializationIntent(regularBusScreenData=" + this.f3650a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RegularBusScreenViewStartedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegularBusScreenViewStartedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RegularBusScreenViewStartedIntent f3651a = new RegularBusScreenViewStartedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RegularBusScreenViewStartedIntent);
        }

        public final int hashCode() {
            return -2037587454;
        }

        public final String toString() {
            return "RegularBusScreenViewStartedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RegularBusScreenViewStoppedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegularBusScreenViewStoppedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RegularBusScreenViewStoppedIntent f3652a = new RegularBusScreenViewStoppedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RegularBusScreenViewStoppedIntent);
        }

        public final int hashCode() {
            return 1902774862;
        }

        public final String toString() {
            return "RegularBusScreenViewStoppedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$RouteClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopTripDetailsUiModel f3653a;
        public final String b;

        public RouteClickedIntent(StopTripDetailsUiModel summary, String stopId) {
            Intrinsics.i(summary, "summary");
            Intrinsics.i(stopId, "stopId");
            this.f3653a = summary;
            this.b = stopId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteClickedIntent)) {
                return false;
            }
            RouteClickedIntent routeClickedIntent = (RouteClickedIntent) obj;
            return Intrinsics.d(this.f3653a, routeClickedIntent.f3653a) && Intrinsics.d(this.b, routeClickedIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3653a.hashCode() * 31);
        }

        public final String toString() {
            return "RouteClickedIntent(summary=" + this.f3653a + ", stopId=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$ScanAndPayBackPressedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScanAndPayBackPressedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ScanAndPayBackPressedIntent f3654a = new ScanAndPayBackPressedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScanAndPayBackPressedIntent);
        }

        public final int hashCode() {
            return -1515002941;
        }

        public final String toString() {
            return "ScanAndPayBackPressedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent f3655a = new SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent);
        }

        public final int hashCode() {
            return 1046557708;
        }

        public final String toString() {
            return "SeatOccupancyInfoBottomSheetNegativeCtaClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent f3656a = new SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent);
        }

        public final int hashCode() {
            return -815744560;
        }

        public final String toString() {
            return "SeatOccupancyInfoBottomSheetPositiveCtaClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeeAllBusesClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeAllBusesClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NearbyStopAndTripsUiModel f3657a;

        public SeeAllBusesClickedIntent(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel) {
            this.f3657a = nearbyStopAndTripsUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeeAllBusesClickedIntent) && Intrinsics.d(this.f3657a, ((SeeAllBusesClickedIntent) obj).f3657a);
        }

        public final int hashCode() {
            return this.f3657a.hashCode();
        }

        public final String toString() {
            return "SeeAllBusesClickedIntent(data=" + this.f3657a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeeAllPassesClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeAllPassesClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeAllPassesClickedIntent f3658a = new SeeAllPassesClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeAllPassesClickedIntent);
        }

        public final int hashCode() {
            return -492049072;
        }

        public final String toString() {
            return "SeeAllPassesClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SeeAllStopsClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeAllStopsClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NearbyStopAndTripsUiModel f3659a;

        public SeeAllStopsClickedIntent(NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel) {
            this.f3659a = nearbyStopAndTripsUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeeAllStopsClickedIntent) && Intrinsics.d(this.f3659a, ((SeeAllStopsClickedIntent) obj).f3659a);
        }

        public final int hashCode() {
            return this.f3659a.hashCode();
        }

        public final String toString() {
            return "SeeAllStopsClickedIntent(data=" + this.f3659a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$SosClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SosClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SosClickedIntent f3660a = new SosClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SosClickedIntent);
        }

        public final int hashCode() {
            return 292495090;
        }

        public final String toString() {
            return "SosClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$StopClickedIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopClickedIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NearbyStopAndTripsUiModel f3661a;

        public StopClickedIntent(NearbyStopAndTripsUiModel data) {
            Intrinsics.i(data, "data");
            this.f3661a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopClickedIntent) && Intrinsics.d(this.f3661a, ((StopClickedIntent) obj).f3661a);
        }

        public final int hashCode() {
            return this.f3661a.hashCode();
        }

        public final String toString() {
            return "StopClickedIntent(data=" + this.f3661a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewIntent$UpdatedRetainedStateIntent;", "Lapp/chalo/home/ui/regularbus/RegularBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdatedRetainedStateIntent extends RegularBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HomeTabScreensRetainedData.RegularScreen f3662a;

        public UpdatedRetainedStateIntent(HomeTabScreensRetainedData.RegularScreen regularScreen) {
            this.f3662a = regularScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatedRetainedStateIntent) && Intrinsics.d(this.f3662a, ((UpdatedRetainedStateIntent) obj).f3662a);
        }

        public final int hashCode() {
            return this.f3662a.f3174a;
        }

        public final String toString() {
            return "UpdatedRetainedStateIntent(data=" + this.f3662a + ")";
        }
    }
}
