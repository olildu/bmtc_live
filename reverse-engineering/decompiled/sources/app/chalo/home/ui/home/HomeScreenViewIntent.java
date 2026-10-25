package app.chalo.home.ui.home;

import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.homescreen.data.model.app.HomeScreenAppModel;
import app.chalo.homescreen.data.model.app.ImageResourceCtaType;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import defpackage.cb0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "", "ProfileIconClickedIntent", "SosClickedIntent", "HomeScreenViewStoppedIntent", "LocationItemClickedIntent", "HomeScreenViewStartedIntent", "LocationTooltipCancelButtonClickedIntent", "ScanAndPayBackPressedIntent", "HomeScreenInitializationIntent", "ChaloSearchBarClickedIntent", "HomePageItemClickedIntent", "PremiumBusTripInfoClickedIntent", "PremiumBusAckBottomSheetPositiveCtaClickedIntent", "PremiumBusAckBottomSheetNegativeCtaClickedIntent", "GpsRequestCallbackReceivedEventIntent", "LocationTurnOnButtonClickedIntent", "TitoRideDetailInfoCardClickedIntent", "UpdatedRetainedStateIntent", "PermissionRationaleDialogInteraction", "JuspayPermissionRationaleDialogInteraction", "OnCrashLoggingRequired", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$ChaloSearchBarClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$GpsRequestCallbackReceivedEventIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$HomePageItemClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$HomeScreenInitializationIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$HomeScreenViewStartedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$HomeScreenViewStoppedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$JuspayPermissionRationaleDialogInteraction;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$LocationItemClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$LocationTooltipCancelButtonClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$LocationTurnOnButtonClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$OnCrashLoggingRequired;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$PremiumBusAckBottomSheetNegativeCtaClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$PremiumBusAckBottomSheetPositiveCtaClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$PremiumBusTripInfoClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$ProfileIconClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$ScanAndPayBackPressedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$SosClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$TitoRideDetailInfoCardClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent$UpdatedRetainedStateIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HomeScreenViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$ChaloSearchBarClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloSearchBarClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3557a;

        public ChaloSearchBarClickedIntent(String searchBarTitle) {
            Intrinsics.i(searchBarTitle, "searchBarTitle");
            this.f3557a = searchBarTitle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChaloSearchBarClickedIntent) && Intrinsics.d(this.f3557a, ((ChaloSearchBarClickedIntent) obj).f3557a);
        }

        public final int hashCode() {
            return this.f3557a.hashCode();
        }

        public final String toString() {
            return vo1.B("ChaloSearchBarClickedIntent(searchBarTitle=", this.f3557a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$GpsRequestCallbackReceivedEventIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GpsRequestCallbackReceivedEventIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3558a;

        public GpsRequestCallbackReceivedEventIntent(boolean z) {
            this.f3558a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GpsRequestCallbackReceivedEventIntent) && this.f3558a == ((GpsRequestCallbackReceivedEventIntent) obj).f3558a;
        }

        public final int hashCode() {
            return this.f3558a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("GpsRequestCallbackReceivedEventIntent(requestOk=", ")", this.f3558a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$HomePageItemClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomePageItemClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HomePageGridItemData f3559a;
        public final String b;
        public final HomePageFeature c;
        public final int d;
        public final String e;
        public final ImageResourceCtaType f;

        public HomePageItemClickedIntent(HomePageGridItemData homePageGridItemData, String str, HomePageFeature featureType, int i, String str2, ImageResourceCtaType imageResourceCtaType, int i2) {
            homePageGridItemData = (i2 & 1) != 0 ? null : homePageGridItemData;
            str = (i2 & 2) != 0 ? null : str;
            str2 = (i2 & 16) != 0 ? null : str2;
            imageResourceCtaType = (i2 & 32) != 0 ? null : imageResourceCtaType;
            Intrinsics.i(featureType, "featureType");
            this.f3559a = homePageGridItemData;
            this.b = str;
            this.c = featureType;
            this.d = i;
            this.e = str2;
            this.f = imageResourceCtaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomePageItemClickedIntent)) {
                return false;
            }
            HomePageItemClickedIntent homePageItemClickedIntent = (HomePageItemClickedIntent) obj;
            return Intrinsics.d(this.f3559a, homePageItemClickedIntent.f3559a) && Intrinsics.d(this.b, homePageItemClickedIntent.b) && this.c == homePageItemClickedIntent.c && this.d == homePageItemClickedIntent.d && Intrinsics.d(this.e, homePageItemClickedIntent.e) && this.f == homePageItemClickedIntent.f;
        }

        public final int hashCode() {
            HomePageGridItemData homePageGridItemData = this.f3559a;
            int iHashCode = (homePageGridItemData == null ? 0 : homePageGridItemData.hashCode()) * 31;
            String str = this.b;
            int iHashCode2 = (((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31) + this.d) * 31;
            String str2 = this.e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ImageResourceCtaType imageResourceCtaType = this.f;
            return iHashCode3 + (imageResourceCtaType != null ? imageResourceCtaType.hashCode() : 0);
        }

        public final String toString() {
            return "HomePageItemClickedIntent(itemData=" + this.f3559a + ", itemTitle=" + this.b + ", featureType=" + this.c + ", position=" + this.d + ", onClickUrl=" + this.e + ", ctaType=" + this.f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$HomeScreenInitializationIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomeScreenInitializationIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HomeScreenAppModel f3560a;

        static {
            HomeScreenAppModel.Companion companion = HomeScreenAppModel.INSTANCE;
        }

        public HomeScreenInitializationIntent(HomeScreenAppModel homeScreenData) {
            Intrinsics.i(homeScreenData, "homeScreenData");
            this.f3560a = homeScreenData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeScreenInitializationIntent) && Intrinsics.d(this.f3560a, ((HomeScreenInitializationIntent) obj).f3560a);
        }

        public final int hashCode() {
            return this.f3560a.hashCode();
        }

        public final String toString() {
            return "HomeScreenInitializationIntent(homeScreenData=" + this.f3560a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$HomeScreenViewStartedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeScreenViewStartedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HomeScreenViewStartedIntent f3561a = new HomeScreenViewStartedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$HomeScreenViewStoppedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeScreenViewStoppedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HomeScreenViewStoppedIntent f3562a = new HomeScreenViewStoppedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$JuspayPermissionRationaleDialogInteraction;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class JuspayPermissionRationaleDialogInteraction extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3563a;

        public JuspayPermissionRationaleDialogInteraction(boolean z) {
            this.f3563a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JuspayPermissionRationaleDialogInteraction) && this.f3563a == ((JuspayPermissionRationaleDialogInteraction) obj).f3563a;
        }

        public final int hashCode() {
            return this.f3563a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("JuspayPermissionRationaleDialogInteraction(shouldNavigateToSettings=", ")", this.f3563a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$LocationItemClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationItemClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationItemClickedIntent f3564a = new LocationItemClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$LocationTooltipCancelButtonClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationTooltipCancelButtonClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationTooltipCancelButtonClickedIntent f3565a = new LocationTooltipCancelButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$LocationTurnOnButtonClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationTurnOnButtonClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocationTurnOnTooltipType f3566a;

        public LocationTurnOnButtonClickedIntent(LocationTurnOnTooltipType locationTurnOnTooltipType) {
            this.f3566a = locationTurnOnTooltipType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationTurnOnButtonClickedIntent) && Intrinsics.d(this.f3566a, ((LocationTurnOnButtonClickedIntent) obj).f3566a);
        }

        public final int hashCode() {
            return this.f3566a.hashCode();
        }

        public final String toString() {
            return "LocationTurnOnButtonClickedIntent(locationTurnOnTooltipType=" + this.f3566a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$OnCrashLoggingRequired;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnCrashLoggingRequired extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CrashlyticsLog f3567a;

        public OnCrashLoggingRequired(CrashlyticsLog crashlyticsLog) {
            Intrinsics.i(crashlyticsLog, "crashlyticsLog");
            this.f3567a = crashlyticsLog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCrashLoggingRequired) && Intrinsics.d(this.f3567a, ((OnCrashLoggingRequired) obj).f3567a);
        }

        public final int hashCode() {
            return this.f3567a.hashCode();
        }

        public final String toString() {
            return "OnCrashLoggingRequired(crashlyticsLog=" + this.f3567a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionRationaleDialogInteraction extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3568a;

        public PermissionRationaleDialogInteraction(boolean z) {
            this.f3568a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionRationaleDialogInteraction) && this.f3568a == ((PermissionRationaleDialogInteraction) obj).f3568a;
        }

        public final int hashCode() {
            return this.f3568a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("PermissionRationaleDialogInteraction(shouldNavigateToSettings=", ")", this.f3568a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$PremiumBusAckBottomSheetNegativeCtaClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusAckBottomSheetNegativeCtaClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusInAppCommunicationBottomSheetData f3569a;

        public PremiumBusAckBottomSheetNegativeCtaClickedIntent(PremiumBusInAppCommunicationBottomSheetData data) {
            Intrinsics.i(data, "data");
            this.f3569a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumBusAckBottomSheetNegativeCtaClickedIntent) && Intrinsics.d(this.f3569a, ((PremiumBusAckBottomSheetNegativeCtaClickedIntent) obj).f3569a);
        }

        public final int hashCode() {
            return this.f3569a.hashCode();
        }

        public final String toString() {
            return "PremiumBusAckBottomSheetNegativeCtaClickedIntent(data=" + this.f3569a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$PremiumBusAckBottomSheetPositiveCtaClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusAckBottomSheetPositiveCtaClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusInAppCommunicationBottomSheetData f3570a;

        public PremiumBusAckBottomSheetPositiveCtaClickedIntent(PremiumBusInAppCommunicationBottomSheetData data) {
            Intrinsics.i(data, "data");
            this.f3570a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumBusAckBottomSheetPositiveCtaClickedIntent) && Intrinsics.d(this.f3570a, ((PremiumBusAckBottomSheetPositiveCtaClickedIntent) obj).f3570a);
        }

        public final int hashCode() {
            return this.f3570a.hashCode();
        }

        public final String toString() {
            return "PremiumBusAckBottomSheetPositiveCtaClickedIntent(data=" + this.f3570a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$PremiumBusTripInfoClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTripInfoClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusBookingCardData f3571a;

        public PremiumBusTripInfoClickedIntent(PremiumBusBookingCardData cardData) {
            Intrinsics.i(cardData, "cardData");
            this.f3571a = cardData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumBusTripInfoClickedIntent) && Intrinsics.d(this.f3571a, ((PremiumBusTripInfoClickedIntent) obj).f3571a);
        }

        public final int hashCode() {
            return this.f3571a.hashCode();
        }

        public final String toString() {
            return "PremiumBusTripInfoClickedIntent(cardData=" + this.f3571a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$ProfileIconClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProfileIconClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileIconClickedIntent f3572a = new ProfileIconClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$ScanAndPayBackPressedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScanAndPayBackPressedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ScanAndPayBackPressedIntent f3573a = new ScanAndPayBackPressedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$SosClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SosClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SosClickedIntent f3574a = new SosClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$TitoRideDetailInfoCardClickedIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitoRideDetailInfoCardClickedIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3575a;

        public TitoRideDetailInfoCardClickedIntent(String tapId) {
            Intrinsics.i(tapId, "tapId");
            this.f3575a = tapId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TitoRideDetailInfoCardClickedIntent) && Intrinsics.d(this.f3575a, ((TitoRideDetailInfoCardClickedIntent) obj).f3575a);
        }

        public final int hashCode() {
            return this.f3575a.hashCode();
        }

        public final String toString() {
            return vo1.B("TitoRideDetailInfoCardClickedIntent(tapId=", this.f3575a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewIntent$UpdatedRetainedStateIntent;", "Lapp/chalo/home/ui/home/HomeScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdatedRetainedStateIntent extends HomeScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HomeTabScreensRetainedData.HomeScreen f3576a;

        public UpdatedRetainedStateIntent(HomeTabScreensRetainedData.HomeScreen homeScreen) {
            this.f3576a = homeScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatedRetainedStateIntent) && Intrinsics.d(this.f3576a, ((UpdatedRetainedStateIntent) obj).f3576a);
        }

        public final int hashCode() {
            return this.f3576a.f3172a;
        }

        public final String toString() {
            return "UpdatedRetainedStateIntent(data=" + this.f3576a + ")";
        }
    }
}
