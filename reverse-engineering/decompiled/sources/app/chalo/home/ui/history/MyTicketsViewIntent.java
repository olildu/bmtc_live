package app.chalo.home.ui.history;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.homescreen.data.model.app.TicketsPageFeature;
import app.chalo.homescreen.data.model.app.TicketsPassesAppModel;
import app.chalo.homescreen.data.model.app.TicketsTabHooksCardSectionData;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel;
import app.chalo.superpass.data.models.entities.SuperPass;
import defpackage.cb0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u001d\u001f !\"#$%&'()*+,-./0123456789:;¨\u0006<"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "", "ProductPurchaseClickedIntent", "BottomSheetDismissIntent", "TicketsScreenViewStoppedIntent", "ReclaimButtonClickedIntent", "ReclaimDialogPositiveCtaClickedIntent", "ReclaimDialogNegativeCtaClickedIntent", "TabHeaderIconClickedIntent", "TicketsScreenViewStartedIntent", "DismissAlertDialogIntent", "NavigateToNotificationSettingsIntent", "NotificationExplainerSkippedIntent", "BackPressedOnNotificationExplainerScreen", "NotificationPermissionUpdatedIntent", "MyTicketsPageInitializationIntent", "QuickFilterTabClickedIntent", "TicketsPageItemClickedIntent", "UseNowClickedIntent", "BookAgainClickedIntent", "OnDropDownMenuSummaryClickedIntent", "MultiModalChildTicketSelectedIntent", "OnProductStatusCtaClickedIntent", "InfoBottomSheetPositiveCtaClickedIntent", "InfoBottomSheetNegativeCtaClickedIntent", "SeeMoreTicketsClickedIntent", "SeeMorePassesClickedIntent", "UpdatedRetainedStateIntent", "LogInClickedIntent", "RequestHistoryButtonClicked", "ContactSupportDialogOkayClicked", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$BackPressedOnNotificationExplainerScreen;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$BookAgainClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$ContactSupportDialogOkayClicked;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$DismissAlertDialogIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$InfoBottomSheetNegativeCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$InfoBottomSheetPositiveCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$LogInClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$MultiModalChildTicketSelectedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$MyTicketsPageInitializationIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$NavigateToNotificationSettingsIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$NotificationExplainerSkippedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$NotificationPermissionUpdatedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$OnDropDownMenuSummaryClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$OnProductStatusCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$ProductPurchaseClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$QuickFilterTabClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$ReclaimButtonClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$ReclaimDialogNegativeCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$ReclaimDialogPositiveCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$RequestHistoryButtonClicked;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$SeeMorePassesClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$SeeMoreTicketsClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$TabHeaderIconClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$TicketsPageItemClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$TicketsScreenViewStartedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$TicketsScreenViewStoppedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$UpdatedRetainedStateIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent$UseNowClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MyTicketsViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$BackPressedOnNotificationExplainerScreen;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackPressedOnNotificationExplainerScreen extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackPressedOnNotificationExplainerScreen f3414a = new BackPressedOnNotificationExplainerScreen();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$BookAgainClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookAgainClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloUserBookingType f3415a;

        public BookAgainClickedIntent(ChaloUserBookingType bookingType) {
            Intrinsics.i(bookingType, "bookingType");
            this.f3415a = bookingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookAgainClickedIntent) && Intrinsics.d(this.f3415a, ((BookAgainClickedIntent) obj).f3415a);
        }

        public final int hashCode() {
            return this.f3415a.hashCode();
        }

        public final String toString() {
            return "BookAgainClickedIntent(bookingType=" + this.f3415a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomSheetDismissIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissIntent f3416a = new BottomSheetDismissIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BottomSheetDismissIntent);
        }

        public final int hashCode() {
            return -1349611515;
        }

        public final String toString() {
            return "BottomSheetDismissIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$ContactSupportDialogOkayClicked;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContactSupportDialogOkayClicked extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactSupportDialogOkayClicked f3417a = new ContactSupportDialogOkayClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContactSupportDialogOkayClicked);
        }

        public final int hashCode() {
            return 2126380297;
        }

        public final String toString() {
            return "ContactSupportDialogOkayClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$DismissAlertDialogIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissAlertDialogIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissAlertDialogIntent f3418a = new DismissAlertDialogIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$InfoBottomSheetNegativeCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfoBottomSheetNegativeCtaClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TicketsPageInfoBottomSheetNegativeCtaType f3419a;
        public final SuperPass b;
        public final BookableSuperPassConfiguration c;
        public final ChaloUserBookingType d;

        public InfoBottomSheetNegativeCtaClickedIntent(TicketsPageInfoBottomSheetNegativeCtaType bottomSheetCtaType, SuperPass superPass, BookableSuperPassConfiguration bookableSuperPassConfiguration, ChaloUserBookingType chaloUserBookingType) {
            Intrinsics.i(bottomSheetCtaType, "bottomSheetCtaType");
            this.f3419a = bottomSheetCtaType;
            this.b = superPass;
            this.c = bookableSuperPassConfiguration;
            this.d = chaloUserBookingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoBottomSheetNegativeCtaClickedIntent)) {
                return false;
            }
            InfoBottomSheetNegativeCtaClickedIntent infoBottomSheetNegativeCtaClickedIntent = (InfoBottomSheetNegativeCtaClickedIntent) obj;
            return this.f3419a == infoBottomSheetNegativeCtaClickedIntent.f3419a && Intrinsics.d(this.b, infoBottomSheetNegativeCtaClickedIntent.b) && Intrinsics.d(this.c, infoBottomSheetNegativeCtaClickedIntent.c) && Intrinsics.d(this.d, infoBottomSheetNegativeCtaClickedIntent.d);
        }

        public final int hashCode() {
            int iHashCode = this.f3419a.hashCode() * 31;
            SuperPass superPass = this.b;
            int iHashCode2 = (iHashCode + (superPass == null ? 0 : superPass.hashCode())) * 31;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = this.c;
            int iHashCode3 = (iHashCode2 + (bookableSuperPassConfiguration == null ? 0 : bookableSuperPassConfiguration.hashCode())) * 31;
            ChaloUserBookingType chaloUserBookingType = this.d;
            return iHashCode3 + (chaloUserBookingType != null ? chaloUserBookingType.hashCode() : 0);
        }

        public final String toString() {
            return "InfoBottomSheetNegativeCtaClickedIntent(bottomSheetCtaType=" + this.f3419a + ", superPass=" + this.b + ", bookableSuperPassConfiguration=" + this.c + ", chaloUserBookingType=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$InfoBottomSheetPositiveCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfoBottomSheetPositiveCtaClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TicketsPageInfoBottomSheetPositiveCtaType f3420a;
        public final SuperPass b;
        public final BookableSuperPassConfiguration c;
        public final ChaloUserBookingType d;

        public InfoBottomSheetPositiveCtaClickedIntent(TicketsPageInfoBottomSheetPositiveCtaType bottomSheetCtaType, SuperPass superPass, BookableSuperPassConfiguration bookableSuperPassConfiguration, ChaloUserBookingType chaloUserBookingType) {
            Intrinsics.i(bottomSheetCtaType, "bottomSheetCtaType");
            Intrinsics.i(chaloUserBookingType, "chaloUserBookingType");
            this.f3420a = bottomSheetCtaType;
            this.b = superPass;
            this.c = bookableSuperPassConfiguration;
            this.d = chaloUserBookingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoBottomSheetPositiveCtaClickedIntent)) {
                return false;
            }
            InfoBottomSheetPositiveCtaClickedIntent infoBottomSheetPositiveCtaClickedIntent = (InfoBottomSheetPositiveCtaClickedIntent) obj;
            return this.f3420a == infoBottomSheetPositiveCtaClickedIntent.f3420a && Intrinsics.d(this.b, infoBottomSheetPositiveCtaClickedIntent.b) && Intrinsics.d(this.c, infoBottomSheetPositiveCtaClickedIntent.c) && Intrinsics.d(this.d, infoBottomSheetPositiveCtaClickedIntent.d);
        }

        public final int hashCode() {
            int iHashCode = this.f3420a.hashCode() * 31;
            SuperPass superPass = this.b;
            int iHashCode2 = (iHashCode + (superPass == null ? 0 : superPass.hashCode())) * 31;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = this.c;
            return this.d.hashCode() + ((iHashCode2 + (bookableSuperPassConfiguration != null ? bookableSuperPassConfiguration.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "InfoBottomSheetPositiveCtaClickedIntent(bottomSheetCtaType=" + this.f3420a + ", superPass=" + this.b + ", bookableSuperPassConfiguration=" + this.c + ", chaloUserBookingType=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$LogInClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LogInClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogInClickedIntent f3421a = new LogInClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LogInClickedIntent);
        }

        public final int hashCode() {
            return 1506943661;
        }

        public final String toString() {
            return "LogInClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$MultiModalChildTicketSelectedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiModalChildTicketSelectedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiModalGroupTicketChildAppModel f3422a;

        public MultiModalChildTicketSelectedIntent(MultiModalGroupTicketChildAppModel child) {
            Intrinsics.i(child, "child");
            this.f3422a = child;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiModalChildTicketSelectedIntent) && Intrinsics.d(this.f3422a, ((MultiModalChildTicketSelectedIntent) obj).f3422a);
        }

        public final int hashCode() {
            return this.f3422a.hashCode();
        }

        public final String toString() {
            return "MultiModalChildTicketSelectedIntent(child=" + this.f3422a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$MyTicketsPageInitializationIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MyTicketsPageInitializationIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TicketsPassesAppModel f3423a;

        static {
            TicketsPassesAppModel.Companion companion = TicketsPassesAppModel.INSTANCE;
        }

        public MyTicketsPageInitializationIntent(TicketsPassesAppModel ticketsPassesAppModel) {
            Intrinsics.i(ticketsPassesAppModel, "ticketsPassesAppModel");
            this.f3423a = ticketsPassesAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MyTicketsPageInitializationIntent) && Intrinsics.d(this.f3423a, ((MyTicketsPageInitializationIntent) obj).f3423a);
        }

        public final int hashCode() {
            return this.f3423a.hashCode();
        }

        public final String toString() {
            return "MyTicketsPageInitializationIntent(ticketsPassesAppModel=" + this.f3423a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$NavigateToNotificationSettingsIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToNotificationSettingsIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToNotificationSettingsIntent f3424a = new NavigateToNotificationSettingsIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$NotificationExplainerSkippedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotificationExplainerSkippedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotificationExplainerSkippedIntent f3425a = new NotificationExplainerSkippedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$NotificationPermissionUpdatedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationPermissionUpdatedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3426a;

        public NotificationPermissionUpdatedIntent(boolean z) {
            this.f3426a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationPermissionUpdatedIntent) && this.f3426a == ((NotificationPermissionUpdatedIntent) obj).f3426a;
        }

        public final int hashCode() {
            return this.f3426a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("NotificationPermissionUpdatedIntent(isNotificationPermissionGranted=", ")", this.f3426a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$OnDropDownMenuSummaryClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnDropDownMenuSummaryClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloUserBookingType f3427a;

        public OnDropDownMenuSummaryClickedIntent(ChaloUserBookingType bookingType) {
            Intrinsics.i(bookingType, "bookingType");
            this.f3427a = bookingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDropDownMenuSummaryClickedIntent) && Intrinsics.d(this.f3427a, ((OnDropDownMenuSummaryClickedIntent) obj).f3427a);
        }

        public final int hashCode() {
            return this.f3427a.hashCode();
        }

        public final String toString() {
            return "OnDropDownMenuSummaryClickedIntent(bookingType=" + this.f3427a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$OnProductStatusCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnProductStatusCtaClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloUserBookingType f3428a;

        public OnProductStatusCtaClickedIntent(ChaloUserBookingType bookingType) {
            Intrinsics.i(bookingType, "bookingType");
            this.f3428a = bookingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductStatusCtaClickedIntent) && Intrinsics.d(this.f3428a, ((OnProductStatusCtaClickedIntent) obj).f3428a);
        }

        public final int hashCode() {
            return this.f3428a.hashCode();
        }

        public final String toString() {
            return "OnProductStatusCtaClickedIntent(bookingType=" + this.f3428a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$ProductPurchaseClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductPurchaseClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductPurchaseClickedIntent f3429a = new ProductPurchaseClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductPurchaseClickedIntent);
        }

        public final int hashCode() {
            return 280374982;
        }

        public final String toString() {
            return "ProductPurchaseClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$QuickFilterTabClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickFilterTabClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TicketsPassesTabType f3430a;

        public QuickFilterTabClickedIntent(TicketsPassesTabType ticketsPassesTabType) {
            this.f3430a = ticketsPassesTabType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickFilterTabClickedIntent) && this.f3430a == ((QuickFilterTabClickedIntent) obj).f3430a;
        }

        public final int hashCode() {
            return this.f3430a.hashCode();
        }

        public final String toString() {
            return "QuickFilterTabClickedIntent(tabType=" + this.f3430a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$ReclaimButtonClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReclaimButtonClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReclaimButtonClickedIntent f3431a = new ReclaimButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$ReclaimDialogNegativeCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReclaimDialogNegativeCtaClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReclaimDialogNegativeCtaClickedIntent f3432a = new ReclaimDialogNegativeCtaClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$ReclaimDialogPositiveCtaClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReclaimDialogPositiveCtaClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReclaimDialogPositiveCtaClickedIntent f3433a = new ReclaimDialogPositiveCtaClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$RequestHistoryButtonClicked;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestHistoryButtonClicked extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestHistoryButtonClicked f3434a = new RequestHistoryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestHistoryButtonClicked);
        }

        public final int hashCode() {
            return -1356377891;
        }

        public final String toString() {
            return "RequestHistoryButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$SeeMorePassesClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeMorePassesClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeMorePassesClickedIntent f3435a = new SeeMorePassesClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeMorePassesClickedIntent);
        }

        public final int hashCode() {
            return 1671340815;
        }

        public final String toString() {
            return "SeeMorePassesClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$SeeMoreTicketsClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeMoreTicketsClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeMoreTicketsClickedIntent f3436a = new SeeMoreTicketsClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeMoreTicketsClickedIntent);
        }

        public final int hashCode() {
            return -158288975;
        }

        public final String toString() {
            return "SeeMoreTicketsClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$TabHeaderIconClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TabHeaderIconClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TabHeaderIconClickedIntent f3437a = new TabHeaderIconClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$TicketsPageItemClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketsPageItemClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TicketsTabHooksCardSectionData f3438a;
        public final TicketsPageFeature b;
        public final String c;
        public final String d;

        public TicketsPageItemClickedIntent(TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData, TicketsPageFeature featureType, String str, String str2, int i) {
            ticketsTabHooksCardSectionData = (i & 1) != 0 ? null : ticketsTabHooksCardSectionData;
            str = (i & 4) != 0 ? null : str;
            str2 = (i & 8) != 0 ? null : str2;
            Intrinsics.i(featureType, "featureType");
            this.f3438a = ticketsTabHooksCardSectionData;
            this.b = featureType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketsPageItemClickedIntent)) {
                return false;
            }
            TicketsPageItemClickedIntent ticketsPageItemClickedIntent = (TicketsPageItemClickedIntent) obj;
            return Intrinsics.d(this.f3438a, ticketsPageItemClickedIntent.f3438a) && this.b == ticketsPageItemClickedIntent.b && Intrinsics.d(this.c, ticketsPageItemClickedIntent.c) && Intrinsics.d(this.d, ticketsPageItemClickedIntent.d);
        }

        public final int hashCode() {
            TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData = this.f3438a;
            int iHashCode = (this.b.hashCode() + ((ticketsTabHooksCardSectionData == null ? 0 : ticketsTabHooksCardSectionData.hashCode()) * 31)) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TicketsPageItemClickedIntent(itemData=");
            sb.append(this.f3438a);
            sb.append(", featureType=");
            sb.append(this.b);
            sb.append(", title=");
            return r30.i(sb, this.c, ", position=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$TicketsScreenViewStartedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TicketsScreenViewStartedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TicketsScreenViewStartedIntent f3439a = new TicketsScreenViewStartedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$TicketsScreenViewStoppedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketsScreenViewStoppedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TicketsScreenViewStoppedIntent f3440a = new TicketsScreenViewStoppedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TicketsScreenViewStoppedIntent);
        }

        public final int hashCode() {
            return -576758844;
        }

        public final String toString() {
            return "TicketsScreenViewStoppedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$UpdatedRetainedStateIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdatedRetainedStateIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HomeTabScreensRetainedData.MyTicketsScreen f3441a;

        public UpdatedRetainedStateIntent(HomeTabScreensRetainedData.MyTicketsScreen myTicketsScreen) {
            this.f3441a = myTicketsScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatedRetainedStateIntent) && Intrinsics.d(this.f3441a, ((UpdatedRetainedStateIntent) obj).f3441a);
        }

        public final int hashCode() {
            return this.f3441a.hashCode();
        }

        public final String toString() {
            return "UpdatedRetainedStateIntent(data=" + this.f3441a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/MyTicketsViewIntent$UseNowClickedIntent;", "Lapp/chalo/home/ui/history/MyTicketsViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UseNowClickedIntent extends MyTicketsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloUserBookingType f3442a;
        public final boolean b;

        public UseNowClickedIntent(ChaloUserBookingType bookingType, boolean z) {
            Intrinsics.i(bookingType, "bookingType");
            this.f3442a = bookingType;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UseNowClickedIntent)) {
                return false;
            }
            UseNowClickedIntent useNowClickedIntent = (UseNowClickedIntent) obj;
            return Intrinsics.d(this.f3442a, useNowClickedIntent.f3442a) && this.b == useNowClickedIntent.b;
        }

        public final int hashCode() {
            return (this.f3442a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "UseNowClickedIntent(bookingType=" + this.f3442a + ", isPremiumBus=" + this.b + ")";
        }
    }
}
