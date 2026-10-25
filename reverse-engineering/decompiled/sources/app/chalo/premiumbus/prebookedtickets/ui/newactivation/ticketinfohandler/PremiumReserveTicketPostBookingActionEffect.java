package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "", "Exit", "RequestBLEPermissionIfNotGranted", "OpenTripCancellationConfirmationBottomSheet", "NavigateToValidation", "NavigateToCancellationFlow", "NavigateToRescheduleFlow", "NavigateToCallSupport", "NavigateToChatSupport", "UnknownErrorToast", "NavigateToRepurchaseFlow", "NavigateToPremiumActivationScreen", "NavigateToProductBookingSummary", "NavigateToPostRideFeedback", "DialogTypeUpdated", "RouteDataFetchFailed", "NavigateToSeatSelection", "NavigateToSOSScreen", "OpenTripRescheduleConfirmationBottomSheet", "NavigateToChangePickupStop", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$DialogTypeUpdated;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$Exit;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToCallSupport;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToCancellationFlow;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToChangePickupStop;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToChatSupport;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToPostRideFeedback;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToPremiumActivationScreen;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToProductBookingSummary;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToRepurchaseFlow;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToRescheduleFlow;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToSOSScreen;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToSeatSelection;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToValidation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$OpenTripCancellationConfirmationBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$OpenTripRescheduleConfirmationBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$RequestBLEPermissionIfNotGranted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$RouteDataFetchFailed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$UnknownErrorToast;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumReserveTicketPostBookingActionEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$DialogTypeUpdated;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DialogTypeUpdated extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DialogTypeUpdated f7431a = new DialogTypeUpdated();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogTypeUpdated);
        }

        public final int hashCode() {
            return -2108097037;
        }

        public final String toString() {
            return "DialogTypeUpdated";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$Exit;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Exit extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Exit f7432a = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1684776612;
        }

        public final String toString() {
            return "Exit";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToCallSupport;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToCallSupport extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7433a;

        public NavigateToCallSupport(String str) {
            this.f7433a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToCallSupport) && Intrinsics.d(this.f7433a, ((NavigateToCallSupport) obj).f7433a);
        }

        public final int hashCode() {
            return this.f7433a.hashCode();
        }

        public final String toString() {
            return vo1.B("NavigateToCallSupport(contactNumber=", this.f7433a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToCancellationFlow;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToCancellationFlow extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7434a;
        public final String b;
        public final String c;
        public final int d;

        public NavigateToCancellationFlow(String str, String str2, String str3, int i) {
            this.f7434a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToCancellationFlow)) {
                return false;
            }
            NavigateToCancellationFlow navigateToCancellationFlow = (NavigateToCancellationFlow) obj;
            return Intrinsics.d(this.f7434a, navigateToCancellationFlow.f7434a) && Intrinsics.d(this.b, navigateToCancellationFlow.b) && Intrinsics.d(this.c, navigateToCancellationFlow.c) && this.d == navigateToCancellationFlow.d;
        }

        public final int hashCode() {
            return nf1.e(nf1.e(this.f7434a.hashCode() * 31, 31, this.b), 31, this.c) + this.d;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("NavigateToCancellationFlow(bookingId=", this.f7434a, ", productType=", this.b, ", productSubType=");
            sbE.append(this.c);
            sbE.append(", noOfSeatCurrentlyBooked=");
            sbE.append(this.d);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToChangePickupStop;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToChangePickupStop extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7435a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;

        public NavigateToChangePickupStop(String str, String str2, String str3, String str4, String str5, boolean z) {
            this.f7435a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToChangePickupStop)) {
                return false;
            }
            NavigateToChangePickupStop navigateToChangePickupStop = (NavigateToChangePickupStop) obj;
            return Intrinsics.d(this.f7435a, navigateToChangePickupStop.f7435a) && Intrinsics.d(this.b, navigateToChangePickupStop.b) && Intrinsics.d(this.c, navigateToChangePickupStop.c) && Intrinsics.d(this.d, navigateToChangePickupStop.d) && Intrinsics.d(this.e, navigateToChangePickupStop.e) && this.f == navigateToChangePickupStop.f;
        }

        public final int hashCode() {
            return nf1.e(nf1.e(nf1.e(nf1.e(this.f7435a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e) + (this.f ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("NavigateToChangePickupStop(bookingId=", this.f7435a, ", currentFromStopId=", this.b, ", currentToStopId=");
            cb0.t(sbE, this.c, ", routeId=", this.d, ", vehicleNumber=");
            sbE.append(this.e);
            sbE.append(", isLiveTrackingActive=");
            sbE.append(this.f);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToChatSupport;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToChatSupport extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToChatSupport f7436a = new NavigateToChatSupport();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToChatSupport);
        }

        public final int hashCode() {
            return -1977370331;
        }

        public final String toString() {
            return "NavigateToChatSupport";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToPostRideFeedback;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToPostRideFeedback extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7437a;
        public final String b;
        public final String c;

        public NavigateToPostRideFeedback(String str, String productType, String productSubType) {
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            this.f7437a = str;
            this.b = productType;
            this.c = productSubType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToPostRideFeedback)) {
                return false;
            }
            NavigateToPostRideFeedback navigateToPostRideFeedback = (NavigateToPostRideFeedback) obj;
            return Intrinsics.d(this.f7437a, navigateToPostRideFeedback.f7437a) && Intrinsics.d(this.b, navigateToPostRideFeedback.b) && Intrinsics.d(this.c, navigateToPostRideFeedback.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f7437a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(dd.e("NavigateToPostRideFeedback(bookingData=", this.f7437a, ", productType=", this.b, ", productSubType="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToPremiumActivationScreen;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToPremiumActivationScreen extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7438a;
        public final String b;
        public final String c;

        public NavigateToPremiumActivationScreen(String str, String productType, String productSubType) {
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            this.f7438a = str;
            this.b = productType;
            this.c = productSubType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToPremiumActivationScreen)) {
                return false;
            }
            NavigateToPremiumActivationScreen navigateToPremiumActivationScreen = (NavigateToPremiumActivationScreen) obj;
            return Intrinsics.d(this.f7438a, navigateToPremiumActivationScreen.f7438a) && Intrinsics.d(this.b, navigateToPremiumActivationScreen.b) && Intrinsics.d(this.c, navigateToPremiumActivationScreen.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f7438a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(dd.e("NavigateToPremiumActivationScreen(bookingId=", this.f7438a, ", productType=", this.b, ", productSubType="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToProductBookingSummary;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToProductBookingSummary extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7439a;

        public NavigateToProductBookingSummary(String str) {
            this.f7439a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToProductBookingSummary) && Intrinsics.d(this.f7439a, ((NavigateToProductBookingSummary) obj).f7439a);
        }

        public final int hashCode() {
            return this.f7439a.hashCode();
        }

        public final String toString() {
            return vo1.B("NavigateToProductBookingSummary(bookingId=", this.f7439a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToRepurchaseFlow;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToRepurchaseFlow extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBOriginDestinationAppModel f7440a;
        public final long b;

        static {
            PBOriginDestinationAppModel.Companion companion = PBOriginDestinationAppModel.INSTANCE;
        }

        public NavigateToRepurchaseFlow(PBOriginDestinationAppModel pBOriginDestinationAppModel, long j) {
            this.f7440a = pBOriginDestinationAppModel;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToRepurchaseFlow)) {
                return false;
            }
            NavigateToRepurchaseFlow navigateToRepurchaseFlow = (NavigateToRepurchaseFlow) obj;
            return Intrinsics.d(this.f7440a, navigateToRepurchaseFlow.f7440a) && this.b == navigateToRepurchaseFlow.b;
        }

        public final int hashCode() {
            int iHashCode = this.f7440a.hashCode() * 31;
            long j = this.b;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "NavigateToRepurchaseFlow(stopsInfo=" + this.f7440a + ", tripStartTime=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToRescheduleFlow;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToRescheduleFlow extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7441a;
        public final String b;
        public final String c;
        public final int d;

        public NavigateToRescheduleFlow(String str, String str2, String str3, int i) {
            this.f7441a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToRescheduleFlow)) {
                return false;
            }
            NavigateToRescheduleFlow navigateToRescheduleFlow = (NavigateToRescheduleFlow) obj;
            return Intrinsics.d(this.f7441a, navigateToRescheduleFlow.f7441a) && Intrinsics.d(this.b, navigateToRescheduleFlow.b) && Intrinsics.d(this.c, navigateToRescheduleFlow.c) && this.d == navigateToRescheduleFlow.d;
        }

        public final int hashCode() {
            return nf1.e(nf1.e(this.f7441a.hashCode() * 31, 31, this.b), 31, this.c) + this.d;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("NavigateToRescheduleFlow(bookingId=", this.f7441a, ", productType=", this.b, ", productSubType=");
            sbE.append(this.c);
            sbE.append(", noOfSeatCurrentlyBooked=");
            sbE.append(this.d);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToSOSScreen;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToSOSScreen extends PremiumReserveTicketPostBookingActionEffect {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToSOSScreen);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NavigateToSOSScreen(sosRequestParams=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToSeatSelection;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToSeatSelection extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusSeatSelectionFlowType.ChangeSeat f7442a;

        static {
            PremiumBusSeatSelectionFlowType.Companion companion = PremiumBusSeatSelectionFlowType.INSTANCE;
        }

        public NavigateToSeatSelection(PremiumBusSeatSelectionFlowType.ChangeSeat changeSeat) {
            this.f7442a = changeSeat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToSeatSelection) && this.f7442a.equals(((NavigateToSeatSelection) obj).f7442a);
        }

        public final int hashCode() {
            return this.f7442a.hashCode();
        }

        public final String toString() {
            return "NavigateToSeatSelection(premiumBusSeatSelectionFlowType=" + this.f7442a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$NavigateToValidation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToValidation extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ValidationProduct f7443a;
        public final ValidationProcessFlowDetails b;

        static {
            ValidationProcessFlowDetails.Companion companion = ValidationProcessFlowDetails.INSTANCE;
            ValidationProduct.Companion companion2 = ValidationProduct.INSTANCE;
        }

        public NavigateToValidation(ValidationProduct validationProduct, ValidationProcessFlowDetails.ConductorValidation validationProcessFlowDetails) {
            Intrinsics.i(validationProcessFlowDetails, "validationProcessFlowDetails");
            this.f7443a = validationProduct;
            this.b = validationProcessFlowDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToValidation)) {
                return false;
            }
            NavigateToValidation navigateToValidation = (NavigateToValidation) obj;
            return Intrinsics.d(this.f7443a, navigateToValidation.f7443a) && Intrinsics.d(this.b, navigateToValidation.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7443a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToValidation(validationProduct=" + this.f7443a + ", validationProcessFlowDetails=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$OpenTripCancellationConfirmationBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenTripCancellationConfirmationBottomSheet extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenTripCancellationConfirmationBottomSheet f7444a = new OpenTripCancellationConfirmationBottomSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenTripCancellationConfirmationBottomSheet);
        }

        public final int hashCode() {
            return -1960526425;
        }

        public final String toString() {
            return "OpenTripCancellationConfirmationBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$OpenTripRescheduleConfirmationBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenTripRescheduleConfirmationBottomSheet extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenTripRescheduleConfirmationBottomSheet f7445a = new OpenTripRescheduleConfirmationBottomSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenTripRescheduleConfirmationBottomSheet);
        }

        public final int hashCode() {
            return 1582106560;
        }

        public final String toString() {
            return "OpenTripRescheduleConfirmationBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$RequestBLEPermissionIfNotGranted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestBLEPermissionIfNotGranted extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestBLEPermissionIfNotGranted f7446a = new RequestBLEPermissionIfNotGranted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestBLEPermissionIfNotGranted);
        }

        public final int hashCode() {
            return 662071494;
        }

        public final String toString() {
            return "RequestBLEPermissionIfNotGranted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$RouteDataFetchFailed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteDataFetchFailed extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteDataFetchFailed f7447a = new RouteDataFetchFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteDataFetchFailed);
        }

        public final int hashCode() {
            return -1662228086;
        }

        public final String toString() {
            return "RouteDataFetchFailed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect$UnknownErrorToast;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownErrorToast extends PremiumReserveTicketPostBookingActionEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7448a;

        public UnknownErrorToast(String msg) {
            Intrinsics.i(msg, "msg");
            this.f7448a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownErrorToast) && Intrinsics.d(this.f7448a, ((UnknownErrorToast) obj).f7448a);
        }

        public final int hashCode() {
            return this.f7448a.hashCode();
        }

        public final String toString() {
            return vo1.B("UnknownErrorToast(msg=", this.f7448a, ")");
        }
    }
}
