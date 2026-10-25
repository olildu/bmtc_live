package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "", "Expired", "ActivationCurrentlyNotAllowed", "BleFeatureNotAvailable", "BookingAckRequired", "SeeMoreOptions", "Error", "FetchingTicketUpdateOptions", "TripCancellationConfirmation", "ActionNotAllowed", "ShowAllocatedSeats", "TripRescheduleConfirmation", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$ActionNotAllowed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$ActivationCurrentlyNotAllowed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$BleFeatureNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$BookingAckRequired;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$Error;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$Expired;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$FetchingTicketUpdateOptions;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$SeeMoreOptions;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$ShowAllocatedSeats;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$TripCancellationConfirmation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$TripRescheduleConfirmation;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusPostBookingBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$ActionNotAllowed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionNotAllowed extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductOptionsAppModel f7416a;

        public ActionNotAllowed(PremiumBusProductOptionsAppModel options) {
            Intrinsics.i(options, "options");
            this.f7416a = options;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionNotAllowed) && Intrinsics.d(this.f7416a, ((ActionNotAllowed) obj).f7416a);
        }

        public final int hashCode() {
            return this.f7416a.hashCode();
        }

        public final String toString() {
            return "ActionNotAllowed(options=" + this.f7416a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$ActivationCurrentlyNotAllowed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivationCurrentlyNotAllowed extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActivationCurrentlyNotAllowed f7417a = new ActivationCurrentlyNotAllowed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivationCurrentlyNotAllowed);
        }

        public final int hashCode() {
            return 208002908;
        }

        public final String toString() {
            return "ActivationCurrentlyNotAllowed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$BleFeatureNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BleFeatureNotAvailable extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BleFeatureNotAvailable f7418a = new BleFeatureNotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BleFeatureNotAvailable);
        }

        public final int hashCode() {
            return -197656006;
        }

        public final String toString() {
            return "BleFeatureNotAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$BookingAckRequired;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookingAckRequired extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusInAppCommunicationBottomSheetData f7419a;

        public BookingAckRequired(PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData) {
            this.f7419a = premiumBusInAppCommunicationBottomSheetData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookingAckRequired) && Intrinsics.d(this.f7419a, ((BookingAckRequired) obj).f7419a);
        }

        public final int hashCode() {
            return this.f7419a.hashCode();
        }

        public final String toString() {
            return "BookingAckRequired(data=" + this.f7419a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$Error;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7420a;

        public Error(String errorMsg) {
            Intrinsics.i(errorMsg, "errorMsg");
            this.f7420a = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f7420a, ((Error) obj).f7420a);
        }

        public final int hashCode() {
            return this.f7420a.hashCode();
        }

        public final String toString() {
            return vo1.B("Error(errorMsg=", this.f7420a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$Expired;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Expired extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Expired f7421a = new Expired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expired);
        }

        public final int hashCode() {
            return 1143154172;
        }

        public final String toString() {
            return "Expired";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$FetchingTicketUpdateOptions;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FetchingTicketUpdateOptions extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FetchingTicketUpdateOptions f7422a = new FetchingTicketUpdateOptions();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$SeeMoreOptions;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeMoreOptions extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7423a;

        public SeeMoreOptions(List options) {
            Intrinsics.i(options, "options");
            this.f7423a = options;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeeMoreOptions) && Intrinsics.d(this.f7423a, ((SeeMoreOptions) obj).f7423a);
        }

        public final int hashCode() {
            return this.f7423a.hashCode();
        }

        public final String toString() {
            return r1.d("SeeMoreOptions(options=", ")", this.f7423a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$ShowAllocatedSeats;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowAllocatedSeats extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7424a;

        public ShowAllocatedSeats(List allocatedSeatNumbers) {
            Intrinsics.i(allocatedSeatNumbers, "allocatedSeatNumbers");
            this.f7424a = allocatedSeatNumbers;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAllocatedSeats) && Intrinsics.d(this.f7424a, ((ShowAllocatedSeats) obj).f7424a);
        }

        public final int hashCode() {
            return this.f7424a.hashCode();
        }

        public final String toString() {
            return r1.d("ShowAllocatedSeats(allocatedSeatNumbers=", ")", this.f7424a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$TripCancellationConfirmation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripCancellationConfirmation extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductOptionsAppModel f7425a;
        public final boolean b;
        public final PremiumBusProductOptionsAppModel c;

        public TripCancellationConfirmation(PremiumBusProductOptionsAppModel options, boolean z, PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel) {
            Intrinsics.i(options, "options");
            this.f7425a = options;
            this.b = z;
            this.c = premiumBusProductOptionsAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TripCancellationConfirmation)) {
                return false;
            }
            TripCancellationConfirmation tripCancellationConfirmation = (TripCancellationConfirmation) obj;
            return Intrinsics.d(this.f7425a, tripCancellationConfirmation.f7425a) && this.b == tripCancellationConfirmation.b && Intrinsics.d(this.c, tripCancellationConfirmation.c);
        }

        public final int hashCode() {
            int iHashCode = ((this.f7425a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
            PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel = this.c;
            return iHashCode + (premiumBusProductOptionsAppModel == null ? 0 : premiumBusProductOptionsAppModel.hashCode());
        }

        public final String toString() {
            return "TripCancellationConfirmation(options=" + this.f7425a + ", isRescheduleOptionAvailable=" + this.b + ", rescheduleOptionIfOptionAvailableAndConfirmationNeedToBeShown=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType$TripRescheduleConfirmation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripRescheduleConfirmation extends PremiumBusPostBookingBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductOptionsAppModel f7426a;

        public TripRescheduleConfirmation(PremiumBusProductOptionsAppModel options) {
            Intrinsics.i(options, "options");
            this.f7426a = options;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TripRescheduleConfirmation) && Intrinsics.d(this.f7426a, ((TripRescheduleConfirmation) obj).f7426a);
        }

        public final int hashCode() {
            return this.f7426a.hashCode();
        }

        public final String toString() {
            return "TripRescheduleConfirmation(options=" + this.f7426a + ")";
        }
    }
}
