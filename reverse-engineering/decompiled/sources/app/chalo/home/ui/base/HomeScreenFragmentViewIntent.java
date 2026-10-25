package app.chalo.home.ui.base;

import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot;
import app.chalo.ridehailing.feedback.RatingReaction;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "", "ViewCreatedIntent", "BottomSheetPositiveButtonClickIntent", "BottomSheetNegativeButtonClickIntent", "HandleNotificationPermissionGrantedIntent", "HandleNotificationPermissionDeniedIntent", "OnRetryHomeScreenConfigFetchIntent", "LocationItemClickedIntent", "SelectBottomNavTab", "BackClicked", "HomeScreenBottomNavSearchTabClickedIntent", "HomeSurfaceReadinessChangedIntent", "UserProfilingStickyBannerClickedIntent", "ChaloBusStickyBannerClickedIntent", "DismissHomeDrawerIntent", "UserProfilingHookDisplayedIntent", "RideHailingUserFeedbackBottomsheetDataChangedIntent", "RideHailingUserFeedbackBottomsheetUserCommentChangedIntent", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$BackClicked;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$BottomSheetNegativeButtonClickIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$BottomSheetPositiveButtonClickIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$ChaloBusStickyBannerClickedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$DismissHomeDrawerIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$HandleNotificationPermissionDeniedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$HandleNotificationPermissionGrantedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$HomeScreenBottomNavSearchTabClickedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$HomeSurfaceReadinessChangedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$LocationItemClickedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$OnRetryHomeScreenConfigFetchIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$RideHailingUserFeedbackBottomsheetDataChangedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$RideHailingUserFeedbackBottomsheetUserCommentChangedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$SelectBottomNavTab;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$UserProfilingHookDisplayedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$UserProfilingStickyBannerClickedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$ViewCreatedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HomeScreenFragmentViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$BackClicked;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackClicked extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClicked f3208a = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 1907369444;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$BottomSheetNegativeButtonClickIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomSheetNegativeButtonClickIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CommonBottomSheetType f3209a;

        public BottomSheetNegativeButtonClickIntent(CommonBottomSheetType bottomSheetType) {
            Intrinsics.i(bottomSheetType, "bottomSheetType");
            this.f3209a = bottomSheetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BottomSheetNegativeButtonClickIntent) && Intrinsics.d(this.f3209a, ((BottomSheetNegativeButtonClickIntent) obj).f3209a);
        }

        public final int hashCode() {
            return this.f3209a.hashCode();
        }

        public final String toString() {
            return "BottomSheetNegativeButtonClickIntent(bottomSheetType=" + this.f3209a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$BottomSheetPositiveButtonClickIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomSheetPositiveButtonClickIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CommonBottomSheetType f3210a;

        public BottomSheetPositiveButtonClickIntent(CommonBottomSheetType bottomSheetType) {
            Intrinsics.i(bottomSheetType, "bottomSheetType");
            this.f3210a = bottomSheetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BottomSheetPositiveButtonClickIntent) && Intrinsics.d(this.f3210a, ((BottomSheetPositiveButtonClickIntent) obj).f3210a);
        }

        public final int hashCode() {
            return this.f3210a.hashCode();
        }

        public final String toString() {
            return "BottomSheetPositiveButtonClickIntent(bottomSheetType=" + this.f3210a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$ChaloBusStickyBannerClickedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloBusStickyBannerClickedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloBusStickyBannerClickedIntent f3211a = new ChaloBusStickyBannerClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChaloBusStickyBannerClickedIntent);
        }

        public final int hashCode() {
            return -849346831;
        }

        public final String toString() {
            return "ChaloBusStickyBannerClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$DismissHomeDrawerIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissHomeDrawerIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissHomeDrawerIntent f3212a = new DismissHomeDrawerIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissHomeDrawerIntent);
        }

        public final int hashCode() {
            return -1308907846;
        }

        public final String toString() {
            return "DismissHomeDrawerIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$HandleNotificationPermissionDeniedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HandleNotificationPermissionDeniedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HandleNotificationPermissionDeniedIntent f3213a = new HandleNotificationPermissionDeniedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$HandleNotificationPermissionGrantedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HandleNotificationPermissionGrantedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HandleNotificationPermissionGrantedIntent f3214a = new HandleNotificationPermissionGrantedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$HomeScreenBottomNavSearchTabClickedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomeScreenBottomNavSearchTabClickedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3215a;

        public HomeScreenBottomNavSearchTabClickedIntent(String searchBarTitle) {
            Intrinsics.i(searchBarTitle, "searchBarTitle");
            this.f3215a = searchBarTitle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeScreenBottomNavSearchTabClickedIntent) && Intrinsics.d(this.f3215a, ((HomeScreenBottomNavSearchTabClickedIntent) obj).f3215a);
        }

        public final int hashCode() {
            return this.f3215a.hashCode();
        }

        public final String toString() {
            return vo1.B("HomeScreenBottomNavSearchTabClickedIntent(searchBarTitle=", this.f3215a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$HomeSurfaceReadinessChangedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomeSurfaceReadinessChangedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3216a;

        public HomeSurfaceReadinessChangedIntent(boolean z) {
            this.f3216a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeSurfaceReadinessChangedIntent) && this.f3216a == ((HomeSurfaceReadinessChangedIntent) obj).f3216a;
        }

        public final int hashCode() {
            return this.f3216a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("HomeSurfaceReadinessChangedIntent(isReady=", ")", this.f3216a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$LocationItemClickedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationItemClickedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationItemClickedIntent f3217a = new LocationItemClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$OnRetryHomeScreenConfigFetchIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRetryHomeScreenConfigFetchIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnRetryHomeScreenConfigFetchIntent f3218a = new OnRetryHomeScreenConfigFetchIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$RideHailingUserFeedbackBottomsheetDataChangedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RideHailingUserFeedbackBottomsheetDataChangedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RatingReaction f3219a;
        public final Integer b;

        public RideHailingUserFeedbackBottomsheetDataChangedIntent(RatingReaction rating, Integer num) {
            Intrinsics.i(rating, "rating");
            this.f3219a = rating;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RideHailingUserFeedbackBottomsheetDataChangedIntent)) {
                return false;
            }
            RideHailingUserFeedbackBottomsheetDataChangedIntent rideHailingUserFeedbackBottomsheetDataChangedIntent = (RideHailingUserFeedbackBottomsheetDataChangedIntent) obj;
            return this.f3219a == rideHailingUserFeedbackBottomsheetDataChangedIntent.f3219a && Intrinsics.d(this.b, rideHailingUserFeedbackBottomsheetDataChangedIntent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f3219a.hashCode() * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "RideHailingUserFeedbackBottomsheetDataChangedIntent(rating=" + this.f3219a + ", reasonId=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$RideHailingUserFeedbackBottomsheetUserCommentChangedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RideHailingUserFeedbackBottomsheetUserCommentChangedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3220a;

        public RideHailingUserFeedbackBottomsheetUserCommentChangedIntent(String str) {
            this.f3220a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RideHailingUserFeedbackBottomsheetUserCommentChangedIntent) && Intrinsics.d(this.f3220a, ((RideHailingUserFeedbackBottomsheetUserCommentChangedIntent) obj).f3220a);
        }

        public final int hashCode() {
            String str = this.f3220a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("RideHailingUserFeedbackBottomsheetUserCommentChangedIntent(comment=", this.f3220a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$SelectBottomNavTab;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectBottomNavTab extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigationTabAppModel f3221a;

        static {
            NavigationTabAppModel.Companion companion = NavigationTabAppModel.INSTANCE;
        }

        public SelectBottomNavTab(NavigationTabAppModel tab) {
            Intrinsics.i(tab, "tab");
            this.f3221a = tab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectBottomNavTab) && Intrinsics.d(this.f3221a, ((SelectBottomNavTab) obj).f3221a);
        }

        public final int hashCode() {
            return (this.f3221a.hashCode() * 31) + 1237;
        }

        public final String toString() {
            return "SelectBottomNavTab(tab=" + this.f3221a + ", shouldStartFresh=false)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$UserProfilingHookDisplayedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserProfilingHookDisplayedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserProfilingHookSlot f3222a;
        public final Integer b;
        public final Integer c;

        public UserProfilingHookDisplayedIntent(UserProfilingHookSlot slot, Integer num, Integer num2) {
            Intrinsics.i(slot, "slot");
            this.f3222a = slot;
            this.b = num;
            this.c = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserProfilingHookDisplayedIntent)) {
                return false;
            }
            UserProfilingHookDisplayedIntent userProfilingHookDisplayedIntent = (UserProfilingHookDisplayedIntent) obj;
            return this.f3222a == userProfilingHookDisplayedIntent.f3222a && Intrinsics.d(this.b, userProfilingHookDisplayedIntent.b) && Intrinsics.d(this.c, userProfilingHookDisplayedIntent.c);
        }

        public final int hashCode() {
            int iHashCode = this.f3222a.hashCode() * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserProfilingHookDisplayedIntent(slot=");
            sb.append(this.f3222a);
            sb.append(", completedStepCount=");
            sb.append(this.b);
            sb.append(", totalStepCount=");
            return pk0.k(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$UserProfilingStickyBannerClickedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserProfilingStickyBannerClickedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserProfilingStickyBannerClickedIntent f3223a = new UserProfilingStickyBannerClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserProfilingStickyBannerClickedIntent);
        }

        public final int hashCode() {
            return 1783711151;
        }

        public final String toString() {
            return "UserProfilingStickyBannerClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent$ViewCreatedIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewCreatedIntent extends HomeScreenFragmentViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewCreatedIntent f3224a = new ViewCreatedIntent();
    }
}
