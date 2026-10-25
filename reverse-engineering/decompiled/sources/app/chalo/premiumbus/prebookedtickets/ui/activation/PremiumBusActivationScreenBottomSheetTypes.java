package app.chalo.premiumbus.prebookedtickets.ui.activation;

import app.chalo.data.PremiumBusProductOptionsAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "", "TripNotStarted", "Confirmation", "Expired", "BleFeatureNotAvailable", "TrackingNotAvailable", "BookingAckRequired", "SeeMoreOptions", "Error", "UpdateOptionsLoading", "ActionNotAllowed", "ShowTripCancellationBottomSheet", "ShowAllocatedSeatsBottomSheet", "ShowRescheduleConfirmationBottomSheet", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$ActionNotAllowed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$BleFeatureNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$BookingAckRequired;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$Confirmation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$Error;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$Expired;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$SeeMoreOptions;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$ShowAllocatedSeatsBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$ShowRescheduleConfirmationBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$ShowTripCancellationBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$TrackingNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$TripNotStarted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$UpdateOptionsLoading;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusActivationScreenBottomSheetTypes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7356a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$ActionNotAllowed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionNotAllowed extends PremiumBusActivationScreenBottomSheetTypes {
        public final PremiumBusProductOptionsAppModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionNotAllowed(PremiumBusProductOptionsAppModel options) {
            super(true, null, 2);
            Intrinsics.i(options, "options");
            this.c = options;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionNotAllowed) && Intrinsics.d(this.c, ((ActionNotAllowed) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "ActionNotAllowed(options=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$BleFeatureNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BleFeatureNotAvailable extends PremiumBusActivationScreenBottomSheetTypes {
        public static final BleFeatureNotAvailable c = new BleFeatureNotAvailable(false, "BLE_NOT_AVAILABLE", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BleFeatureNotAvailable);
        }

        public final int hashCode() {
            return 1331067272;
        }

        public final String toString() {
            return "BleFeatureNotAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$BookingAckRequired;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookingAckRequired extends PremiumBusActivationScreenBottomSheetTypes {
        public final PremiumBusInAppCommunicationBottomSheetData c;

        public BookingAckRequired(PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData) {
            super(false, null, 2);
            this.c = premiumBusInAppCommunicationBottomSheetData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookingAckRequired) && Intrinsics.d(this.c, ((BookingAckRequired) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "BookingAckRequired(data=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$Confirmation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Confirmation extends PremiumBusActivationScreenBottomSheetTypes {
        public static final Confirmation c = new Confirmation(false, "CONFIRMATION", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirmation);
        }

        public final int hashCode() {
            return 1892768908;
        }

        public final String toString() {
            return "Confirmation";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$Error;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends PremiumBusActivationScreenBottomSheetTypes {
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String errorMsg) {
            super(true, null, 2);
            Intrinsics.i(errorMsg, "errorMsg");
            this.c = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.c, ((Error) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("Error(errorMsg=", this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$Expired;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Expired extends PremiumBusActivationScreenBottomSheetTypes {
        public static final Expired c = new Expired(false, "EXPIRED", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expired);
        }

        public final int hashCode() {
            return -1491420050;
        }

        public final String toString() {
            return "Expired";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$SeeMoreOptions;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeMoreOptions extends PremiumBusActivationScreenBottomSheetTypes {
        public final List c;
        public final boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SeeMoreOptions(List options, boolean z) {
            super(true, null, 2);
            Intrinsics.i(options, "options");
            this.c = options;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SeeMoreOptions)) {
                return false;
            }
            SeeMoreOptions seeMoreOptions = (SeeMoreOptions) obj;
            return Intrinsics.d(this.c, seeMoreOptions.c) && this.d == seeMoreOptions.d;
        }

        public final int hashCode() {
            return (this.c.hashCode() * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            return "SeeMoreOptions(options=" + this.c + ", isRescheduleOptionAvailableAndEnabled=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$ShowAllocatedSeatsBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowAllocatedSeatsBottomSheet extends PremiumBusActivationScreenBottomSheetTypes {
        public final List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAllocatedSeatsBottomSheet(List allocatedSeatNumbers) {
            super(false, null, 3);
            Intrinsics.i(allocatedSeatNumbers, "allocatedSeatNumbers");
            this.c = allocatedSeatNumbers;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAllocatedSeatsBottomSheet) && Intrinsics.d(this.c, ((ShowAllocatedSeatsBottomSheet) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return r1.d("ShowAllocatedSeatsBottomSheet(allocatedSeatNumbers=", ")", this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$ShowRescheduleConfirmationBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowRescheduleConfirmationBottomSheet extends PremiumBusActivationScreenBottomSheetTypes {
        public final PremiumBusProductOptionsAppModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowRescheduleConfirmationBottomSheet(PremiumBusProductOptionsAppModel option) {
            super(false, null, 3);
            Intrinsics.i(option, "option");
            this.c = option;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowRescheduleConfirmationBottomSheet) && Intrinsics.d(this.c, ((ShowRescheduleConfirmationBottomSheet) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "ShowRescheduleConfirmationBottomSheet(option=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$ShowTripCancellationBottomSheet;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowTripCancellationBottomSheet extends PremiumBusActivationScreenBottomSheetTypes {
        public final PremiumBusProductOptionsAppModel c;
        public final boolean d;
        public final PremiumBusProductOptionsAppModel e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTripCancellationBottomSheet(PremiumBusProductOptionsAppModel option, boolean z, PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel) {
            super(false, null, 3);
            Intrinsics.i(option, "option");
            this.c = option;
            this.d = z;
            this.e = premiumBusProductOptionsAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowTripCancellationBottomSheet)) {
                return false;
            }
            ShowTripCancellationBottomSheet showTripCancellationBottomSheet = (ShowTripCancellationBottomSheet) obj;
            return Intrinsics.d(this.c, showTripCancellationBottomSheet.c) && this.d == showTripCancellationBottomSheet.d && Intrinsics.d(this.e, showTripCancellationBottomSheet.e);
        }

        public final int hashCode() {
            int iHashCode = ((this.c.hashCode() * 31) + (this.d ? 1231 : 1237)) * 31;
            PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel = this.e;
            return iHashCode + (premiumBusProductOptionsAppModel == null ? 0 : premiumBusProductOptionsAppModel.hashCode());
        }

        public final String toString() {
            return "ShowTripCancellationBottomSheet(option=" + this.c + ", showRescheduleButton=" + this.d + ", rescheduleOptionIfOptionAvailableAndConfirmationNeedToBeShown=" + this.e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$TrackingNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingNotAvailable extends PremiumBusActivationScreenBottomSheetTypes {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TrackingNotAvailable);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "TrackingNotAvailable(msg=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$TripNotStarted;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripNotStarted extends PremiumBusActivationScreenBottomSheetTypes {
        public static final TripNotStarted c = new TripNotStarted(false, "TRIP_NOT_STARTED", 1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TripNotStarted);
        }

        public final int hashCode() {
            return 1765549770;
        }

        public final String toString() {
            return "TripNotStarted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes$UpdateOptionsLoading;", "Lapp/chalo/premiumbus/prebookedtickets/ui/activation/PremiumBusActivationScreenBottomSheetTypes;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateOptionsLoading extends PremiumBusActivationScreenBottomSheetTypes {
        public static final UpdateOptionsLoading c = new UpdateOptionsLoading(true, null, 2);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdateOptionsLoading);
        }

        public final int hashCode() {
            return 1466556222;
        }

        public final String toString() {
            return "UpdateOptionsLoading";
        }
    }

    public PremiumBusActivationScreenBottomSheetTypes(boolean z, String str, int i) {
        z = (i & 1) != 0 ? false : z;
        str = (i & 2) != 0 ? null : str;
        this.f7356a = z;
        this.b = str;
    }
}
