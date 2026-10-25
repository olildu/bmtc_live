package app.chalo.deeplink;

import app.chalo.chalocard.ChaloCardEntryDestination;
import defpackage.dd;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction;", "", "StartSplashScreen", "SendFeedback", "LaunchWebActivity", "StartCardRechargeActivity", "FinishActivity", "None", "StartPassBooking", "StartWallet", "StartInstantTicketOrWallet", "StartInstantTicket", "StartPremiumBusFlow", "LaunchStopTripDetails", "LaunchRouteDetails", "LaunchHomeActivity", "LaunchPbPassPurchaseLanding", "LaunchPremiumPlotlineNotificationScreen", "LaunchSummaryScreen", "LaunchMetroBooking", "Lapp/chalo/deeplink/DeepLinkAction$FinishActivity;", "Lapp/chalo/deeplink/DeepLinkAction$LaunchHomeActivity;", "Lapp/chalo/deeplink/DeepLinkAction$LaunchMetroBooking;", "Lapp/chalo/deeplink/DeepLinkAction$LaunchPbPassPurchaseLanding;", "Lapp/chalo/deeplink/DeepLinkAction$LaunchPremiumPlotlineNotificationScreen;", "Lapp/chalo/deeplink/DeepLinkAction$LaunchRouteDetails;", "Lapp/chalo/deeplink/DeepLinkAction$LaunchStopTripDetails;", "Lapp/chalo/deeplink/DeepLinkAction$LaunchSummaryScreen;", "Lapp/chalo/deeplink/DeepLinkAction$LaunchWebActivity;", "Lapp/chalo/deeplink/DeepLinkAction$None;", "Lapp/chalo/deeplink/DeepLinkAction$SendFeedback;", "Lapp/chalo/deeplink/DeepLinkAction$StartCardRechargeActivity;", "Lapp/chalo/deeplink/DeepLinkAction$StartInstantTicket;", "Lapp/chalo/deeplink/DeepLinkAction$StartInstantTicketOrWallet;", "Lapp/chalo/deeplink/DeepLinkAction$StartPassBooking;", "Lapp/chalo/deeplink/DeepLinkAction$StartPremiumBusFlow;", "Lapp/chalo/deeplink/DeepLinkAction$StartSplashScreen;", "Lapp/chalo/deeplink/DeepLinkAction$StartWallet;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeepLinkAction {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$FinishActivity;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinishActivity implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FinishActivity f2425a = new FinishActivity();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FinishActivity);
        }

        public final int hashCode() {
            return 2085469032;
        }

        public final String toString() {
            return "FinishActivity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$LaunchHomeActivity;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchHomeActivity implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeepLinkHomeTab f2426a;
        public final String b;

        public LaunchHomeActivity(DeepLinkHomeTab tab, String str) {
            Intrinsics.i(tab, "tab");
            this.f2426a = tab;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchHomeActivity)) {
                return false;
            }
            LaunchHomeActivity launchHomeActivity = (LaunchHomeActivity) obj;
            return this.f2426a == launchHomeActivity.f2426a && Intrinsics.d(this.b, launchHomeActivity.b);
        }

        public final int hashCode() {
            int iHashCode = this.f2426a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "LaunchHomeActivity(tab=" + this.f2426a + ", deeplinkAttribution=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$LaunchMetroBooking;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchMetroBooking implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LaunchMetroBooking f2427a = new LaunchMetroBooking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LaunchMetroBooking);
        }

        public final int hashCode() {
            return -1868656647;
        }

        public final String toString() {
            return "LaunchMetroBooking";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$LaunchPbPassPurchaseLanding;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchPbPassPurchaseLanding implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PbPassPurchaseLandingDeepLinkData f2428a;
        public final String b;

        public LaunchPbPassPurchaseLanding(PbPassPurchaseLandingDeepLinkData pbPassPurchaseLandingDeepLinkData, String str) {
            this.f2428a = pbPassPurchaseLandingDeepLinkData;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchPbPassPurchaseLanding)) {
                return false;
            }
            LaunchPbPassPurchaseLanding launchPbPassPurchaseLanding = (LaunchPbPassPurchaseLanding) obj;
            return Intrinsics.d(this.f2428a, launchPbPassPurchaseLanding.f2428a) && Intrinsics.d(this.b, launchPbPassPurchaseLanding.b);
        }

        public final int hashCode() {
            int iHashCode = this.f2428a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "LaunchPbPassPurchaseLanding(data=" + this.f2428a + ", deeplinkAttribution=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$LaunchPremiumPlotlineNotificationScreen;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchPremiumPlotlineNotificationScreen implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LaunchPremiumPlotlineNotificationScreen f2429a = new LaunchPremiumPlotlineNotificationScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LaunchPremiumPlotlineNotificationScreen);
        }

        public final int hashCode() {
            return 1184314570;
        }

        public final String toString() {
            return "LaunchPremiumPlotlineNotificationScreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$LaunchRouteDetails;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchRouteDetails implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteDetailsDeepLinkData f2430a;

        public LaunchRouteDetails(RouteDetailsDeepLinkData routeDetailsDeepLinkData) {
            this.f2430a = routeDetailsDeepLinkData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchRouteDetails) && Intrinsics.d(this.f2430a, ((LaunchRouteDetails) obj).f2430a);
        }

        public final int hashCode() {
            return this.f2430a.hashCode();
        }

        public final String toString() {
            return "LaunchRouteDetails(data=" + this.f2430a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$LaunchStopTripDetails;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchStopTripDetails implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopTripDetailsDeepLinkData f2431a;

        public LaunchStopTripDetails(StopTripDetailsDeepLinkData stopTripDetailsDeepLinkData) {
            this.f2431a = stopTripDetailsDeepLinkData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchStopTripDetails) && Intrinsics.d(this.f2431a, ((LaunchStopTripDetails) obj).f2431a);
        }

        public final int hashCode() {
            return this.f2431a.hashCode();
        }

        public final String toString() {
            return "LaunchStopTripDetails(data=" + this.f2431a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$LaunchSummaryScreen;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchSummaryScreen implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2432a;
        public final String b;
        public final String c;
        public final String d;

        public LaunchSummaryScreen(String str, String str2, String str3, String str4) {
            this.f2432a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchSummaryScreen)) {
                return false;
            }
            LaunchSummaryScreen launchSummaryScreen = (LaunchSummaryScreen) obj;
            return Intrinsics.d(this.f2432a, launchSummaryScreen.f2432a) && Intrinsics.d(this.b, launchSummaryScreen.b) && Intrinsics.d(this.c, launchSummaryScreen.c) && Intrinsics.d(this.d, launchSummaryScreen.d);
        }

        public final int hashCode() {
            String str = this.f2432a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return r30.i(dd.e("LaunchSummaryScreen(id=", this.f2432a, ", productType=", this.b, ", productSubType="), this.c, ", transactionId=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$LaunchWebActivity;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchWebActivity implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LaunchWebActivity f2433a = new LaunchWebActivity();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LaunchWebActivity);
        }

        public final int hashCode() {
            return 1487138922;
        }

        public final String toString() {
            return "LaunchWebActivity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$None;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f2434a = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -632438434;
        }

        public final String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$SendFeedback;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendFeedback implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SendFeedback f2435a = new SendFeedback();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendFeedback);
        }

        public final int hashCode() {
            return -2972845;
        }

        public final String toString() {
            return "SendFeedback";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$StartCardRechargeActivity;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartCardRechargeActivity implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloCardEntryDestination f2436a;

        public StartCardRechargeActivity(ChaloCardEntryDestination startDestination) {
            Intrinsics.i(startDestination, "startDestination");
            this.f2436a = startDestination;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartCardRechargeActivity) && this.f2436a == ((StartCardRechargeActivity) obj).f2436a;
        }

        public final int hashCode() {
            return this.f2436a.hashCode();
        }

        public final String toString() {
            return "StartCardRechargeActivity(startDestination=" + this.f2436a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$StartInstantTicket;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartInstantTicket implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeepLinkWalletDestination f2437a;
        public final boolean b;

        public StartInstantTicket(DeepLinkWalletDestination origin, boolean z) {
            Intrinsics.i(origin, "origin");
            this.f2437a = origin;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartInstantTicket)) {
                return false;
            }
            StartInstantTicket startInstantTicket = (StartInstantTicket) obj;
            return this.f2437a == startInstantTicket.f2437a && this.b == startInstantTicket.b;
        }

        public final int hashCode() {
            return (this.f2437a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "StartInstantTicket(origin=" + this.f2437a + ", isRouteBasedSelection=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$StartInstantTicketOrWallet;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartInstantTicketOrWallet implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeepLinkWalletDestination f2438a;

        public StartInstantTicketOrWallet(DeepLinkWalletDestination destination) {
            Intrinsics.i(destination, "destination");
            this.f2438a = destination;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartInstantTicketOrWallet) && this.f2438a == ((StartInstantTicketOrWallet) obj).f2438a;
        }

        public final int hashCode() {
            return this.f2438a.hashCode();
        }

        public final String toString() {
            return "StartInstantTicketOrWallet(destination=" + this.f2438a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$StartPassBooking;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartPassBooking implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2439a;
        public final String b;

        public StartPassBooking(String str, String str2) {
            this.f2439a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartPassBooking)) {
                return false;
            }
            StartPassBooking startPassBooking = (StartPassBooking) obj;
            return Intrinsics.d(this.f2439a, startPassBooking.f2439a) && Intrinsics.d(this.b, startPassBooking.b);
        }

        public final int hashCode() {
            String str = this.f2439a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return vo1.o("StartPassBooking(configId=", this.f2439a, ", deeplinkAttribution=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$StartPremiumBusFlow;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartPremiumBusFlow implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeepLinkPremiumBusDestination f2440a;
        public final String b;

        public StartPremiumBusFlow(DeepLinkPremiumBusDestination destination, String str) {
            Intrinsics.i(destination, "destination");
            this.f2440a = destination;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartPremiumBusFlow)) {
                return false;
            }
            StartPremiumBusFlow startPremiumBusFlow = (StartPremiumBusFlow) obj;
            return this.f2440a == startPremiumBusFlow.f2440a && Intrinsics.d(this.b, startPremiumBusFlow.b);
        }

        public final int hashCode() {
            int iHashCode = this.f2440a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "StartPremiumBusFlow(destination=" + this.f2440a + ", deeplinkAttribution=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$StartSplashScreen;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartSplashScreen implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StartSplashScreen f2441a = new StartSplashScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartSplashScreen);
        }

        public final int hashCode() {
            return -1065951537;
        }

        public final String toString() {
            return "StartSplashScreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkAction$StartWallet;", "Lapp/chalo/deeplink/DeepLinkAction;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartWallet implements DeepLinkAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeepLinkWalletDestination f2442a;

        public StartWallet(DeepLinkWalletDestination destination) {
            Intrinsics.i(destination, "destination");
            this.f2442a = destination;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartWallet) && this.f2442a == ((StartWallet) obj).f2442a;
        }

        public final int hashCode() {
            return this.f2442a.hashCode();
        }

        public final String toString() {
            return "StartWallet(destination=" + this.f2442a + ")";
        }
    }
}
