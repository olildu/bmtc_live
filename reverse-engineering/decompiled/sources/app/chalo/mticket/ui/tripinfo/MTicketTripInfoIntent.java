package app.chalo.mticket.ui.tripinfo;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.constants.Source;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import defpackage.b3;
import defpackage.cb0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "", "InitialisationIntent", "RetryFetchFreeRideValidityIntent", "RetryFetchProductConfigurationIntent", "RouteOptionClickedIntent", "RouteDataReceivedIntent", "StopOptionClickedIntent", "StopDataReceivedIntent", "NextClickedIntent", "FreeRideBannerClickedIntent", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$FreeRideBannerClickedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$InitialisationIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$NextClickedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$RetryFetchFreeRideValidityIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$RetryFetchProductConfigurationIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$RouteDataReceivedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$RouteOptionClickedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$StopDataReceivedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$StopOptionClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MTicketTripInfoIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$FreeRideBannerClickedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FreeRideBannerClickedIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FreeRideBannerClickedIntent f5766a = new FreeRideBannerClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FreeRideBannerClickedIntent);
        }

        public final int hashCode() {
            return -1598717669;
        }

        public final String toString() {
            return "FreeRideBannerClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$InitialisationIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f5767a;
        public final RouteAppModel b;
        public final String c;

        public InitialisationIntent(Source source, RouteAppModel routeAppModel, String str) {
            this.f5767a = source;
            this.b = routeAppModel;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialisationIntent)) {
                return false;
            }
            InitialisationIntent initialisationIntent = (InitialisationIntent) obj;
            return this.f5767a == initialisationIntent.f5767a && Intrinsics.d(this.b, initialisationIntent.b) && Intrinsics.d(this.c, initialisationIntent.c);
        }

        public final int hashCode() {
            Source source = this.f5767a;
            int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
            RouteAppModel routeAppModel = this.b;
            int iHashCode2 = (iHashCode + (routeAppModel == null ? 0 : routeAppModel.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialisationIntent(source=");
            sb.append(this.f5767a);
            sb.append(", routeDetails=");
            sb.append(this.b);
            sb.append(", productId=");
            return vo1.p(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$NextClickedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextClickedIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextClickedIntent f5768a = new NextClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NextClickedIntent);
        }

        public final int hashCode() {
            return 1723293400;
        }

        public final String toString() {
            return "NextClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$RetryFetchFreeRideValidityIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryFetchFreeRideValidityIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryFetchFreeRideValidityIntent f5769a = new RetryFetchFreeRideValidityIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryFetchFreeRideValidityIntent);
        }

        public final int hashCode() {
            return -845714372;
        }

        public final String toString() {
            return "RetryFetchFreeRideValidityIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$RetryFetchProductConfigurationIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryFetchProductConfigurationIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5770a;

        public RetryFetchProductConfigurationIntent(boolean z) {
            this.f5770a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryFetchProductConfigurationIntent) && this.f5770a == ((RetryFetchProductConfigurationIntent) obj).f5770a;
        }

        public final int hashCode() {
            return this.f5770a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("RetryFetchProductConfigurationIntent(autoClickNext=", ")", this.f5770a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$RouteDataReceivedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteDataReceivedIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductBookingRouteDetails f5771a;
        public final boolean b;

        static {
            ProductBookingRouteDetails.Companion companion = ProductBookingRouteDetails.INSTANCE;
        }

        public RouteDataReceivedIntent(ProductBookingRouteDetails productBookingRouteDetails, boolean z) {
            this.f5771a = productBookingRouteDetails;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteDataReceivedIntent)) {
                return false;
            }
            RouteDataReceivedIntent routeDataReceivedIntent = (RouteDataReceivedIntent) obj;
            return Intrinsics.d(this.f5771a, routeDataReceivedIntent.f5771a) && this.b == routeDataReceivedIntent.b;
        }

        public final int hashCode() {
            return (this.f5771a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "RouteDataReceivedIntent(routeDetails=" + this.f5771a + ", restoringStateFromProcessDeath=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$RouteOptionClickedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteOptionClickedIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteOptionClickedIntent f5772a = new RouteOptionClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteOptionClickedIntent);
        }

        public final int hashCode() {
            return -1380009027;
        }

        public final String toString() {
            return "RouteOptionClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$StopDataReceivedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopDataReceivedIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5773a;
        public final ProductBookingStopDetails b;
        public final boolean c;

        public StopDataReceivedIntent(boolean z, ProductBookingStopDetails stopDetails, boolean z2) {
            Intrinsics.i(stopDetails, "stopDetails");
            this.f5773a = z;
            this.b = stopDetails;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopDataReceivedIntent)) {
                return false;
            }
            StopDataReceivedIntent stopDataReceivedIntent = (StopDataReceivedIntent) obj;
            return this.f5773a == stopDataReceivedIntent.f5773a && Intrinsics.d(this.b, stopDataReceivedIntent.b) && this.c == stopDataReceivedIntent.c;
        }

        public final int hashCode() {
            return ((this.b.hashCode() + ((this.f5773a ? 1231 : 1237) * 31)) * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StopDataReceivedIntent(isFromStop=");
            sb.append(this.f5773a);
            sb.append(", stopDetails=");
            sb.append(this.b);
            sb.append(", restoringStateFromProcessDeath=");
            return b3.g(")", sb, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent$StopOptionClickedIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopOptionClickedIntent extends MTicketTripInfoIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5774a;

        public StopOptionClickedIntent(boolean z) {
            this.f5774a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopOptionClickedIntent) && this.f5774a == ((StopOptionClickedIntent) obj).f5774a;
        }

        public final int hashCode() {
            return this.f5774a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("StopOptionClickedIntent(isFromStop=", ")", this.f5774a);
        }
    }
}
