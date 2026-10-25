package app.chalo.mticket.ui.passengerselection;

import app.chalo.constants.Source;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import defpackage.cb0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "", "InitialisationIntent", "RestoreFromProcessDeathIntent", "RetryProductFetchIntent", "RetryFareFetchIntent", "IncrementPassengerCount", "DecrementPassengerCount", "PayClickedIntent", "TncClickedIntent", "TncActionClicked", "ToggleTripDetailsVisibility", "DismissFareChangedDialog", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$DecrementPassengerCount;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$DismissFareChangedDialog;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$IncrementPassengerCount;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$InitialisationIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$PayClickedIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$RestoreFromProcessDeathIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$RetryFareFetchIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$RetryProductFetchIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$TncActionClicked;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$TncClickedIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$ToggleTripDetailsVisibility;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MTicketPassengerSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$DecrementPassengerCount;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DecrementPassengerCount extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5744a;

        public DecrementPassengerCount(String passengerType) {
            Intrinsics.i(passengerType, "passengerType");
            this.f5744a = passengerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DecrementPassengerCount) && Intrinsics.d(this.f5744a, ((DecrementPassengerCount) obj).f5744a);
        }

        public final int hashCode() {
            return this.f5744a.hashCode();
        }

        public final String toString() {
            return vo1.B("DecrementPassengerCount(passengerType=", this.f5744a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$DismissFareChangedDialog;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissFareChangedDialog extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissFareChangedDialog f5745a = new DismissFareChangedDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissFareChangedDialog);
        }

        public final int hashCode() {
            return 1130780990;
        }

        public final String toString() {
            return "DismissFareChangedDialog";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$IncrementPassengerCount;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IncrementPassengerCount extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5746a;

        public IncrementPassengerCount(String passengerType) {
            Intrinsics.i(passengerType, "passengerType");
            this.f5746a = passengerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncrementPassengerCount) && Intrinsics.d(this.f5746a, ((IncrementPassengerCount) obj).f5746a);
        }

        public final int hashCode() {
            return this.f5746a.hashCode();
        }

        public final String toString() {
            return vo1.B("IncrementPassengerCount(passengerType=", this.f5746a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$InitialisationIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductBookingRouteDetails f5747a;
        public final ProductBookingStopDetails b;
        public final ProductBookingStopDetails c;
        public final String d;
        public final Source e;

        static {
            ProductBookingRouteDetails.Companion companion = ProductBookingRouteDetails.INSTANCE;
        }

        public InitialisationIntent(ProductBookingRouteDetails route, ProductBookingStopDetails fromStop, ProductBookingStopDetails toStop, String str, Source source) {
            Intrinsics.i(route, "route");
            Intrinsics.i(fromStop, "fromStop");
            Intrinsics.i(toStop, "toStop");
            this.f5747a = route;
            this.b = fromStop;
            this.c = toStop;
            this.d = str;
            this.e = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialisationIntent)) {
                return false;
            }
            InitialisationIntent initialisationIntent = (InitialisationIntent) obj;
            return Intrinsics.d(this.f5747a, initialisationIntent.f5747a) && Intrinsics.d(this.b, initialisationIntent.b) && Intrinsics.d(this.c, initialisationIntent.c) && Intrinsics.d(this.d, initialisationIntent.d) && this.e == initialisationIntent.e;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f5747a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Source source = this.e;
            return iHashCode2 + (source != null ? source.hashCode() : 0);
        }

        public final String toString() {
            return "InitialisationIntent(route=" + this.f5747a + ", fromStop=" + this.b + ", toStop=" + this.c + ", productConfigId=" + this.d + ", source=" + this.e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$PayClickedIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayClickedIntent extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayClickedIntent f5748a = new PayClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PayClickedIntent);
        }

        public final int hashCode() {
            return 2127160053;
        }

        public final String toString() {
            return "PayClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$RestoreFromProcessDeathIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RestoreFromProcessDeathIntent extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MTicketPassengerSelectionRestoredState f5749a;

        public RestoreFromProcessDeathIntent(MTicketPassengerSelectionRestoredState mTicketPassengerSelectionRestoredState) {
            this.f5749a = mTicketPassengerSelectionRestoredState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestoreFromProcessDeathIntent) && Intrinsics.d(this.f5749a, ((RestoreFromProcessDeathIntent) obj).f5749a);
        }

        public final int hashCode() {
            return this.f5749a.hashCode();
        }

        public final String toString() {
            return "RestoreFromProcessDeathIntent(restoredState=" + this.f5749a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$RetryFareFetchIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryFareFetchIntent extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryFareFetchIntent f5750a = new RetryFareFetchIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryFareFetchIntent);
        }

        public final int hashCode() {
            return -1805752006;
        }

        public final String toString() {
            return "RetryFareFetchIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$RetryProductFetchIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryProductFetchIntent extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryProductFetchIntent f5751a = new RetryProductFetchIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryProductFetchIntent);
        }

        public final int hashCode() {
            return -2024861707;
        }

        public final String toString() {
            return "RetryProductFetchIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$TncActionClicked;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncActionClicked extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5752a;

        public TncActionClicked(boolean z) {
            this.f5752a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TncActionClicked) && this.f5752a == ((TncActionClicked) obj).f5752a;
        }

        public final int hashCode() {
            return this.f5752a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("TncActionClicked(accept=", ")", this.f5752a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$TncClickedIntent;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncClickedIntent extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TncClickedIntent f5753a = new TncClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TncClickedIntent);
        }

        public final int hashCode() {
            return 740715540;
        }

        public final String toString() {
            return "TncClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent$ToggleTripDetailsVisibility;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToggleTripDetailsVisibility extends MTicketPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToggleTripDetailsVisibility f5754a = new ToggleTripDetailsVisibility();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleTripDetailsVisibility);
        }

        public final int hashCode() {
            return -1196407551;
        }

        public final String toString() {
            return "ToggleTripDetailsVisibility";
        }
    }
}
