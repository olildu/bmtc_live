package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.constants.Source;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent;", "", "InitializationIntent", "BookRideButtonClickIntent", "RemoveSlotClickIntent", "TermsAndConditionsTextClickIntent", "TnCBottomSheetOkClickIntent", "TnCBottomSheetDismissIntent", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$BookRideButtonClickIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$RemoveSlotClickIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$TermsAndConditionsTextClickIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$TnCBottomSheetDismissIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$TnCBottomSheetOkClickIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusBulkBookingConfirmationIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$BookRideButtonClickIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookRideButtonClickIntent extends PremiumBusBulkBookingConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BookRideButtonClickIntent f7496a = new BookRideButtonClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BookRideButtonClickIntent);
        }

        public final int hashCode() {
            return -1735466991;
        }

        public final String toString() {
            return "BookRideButtonClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusBulkBookingConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusSeatSelectionFlowType.BulkBooking f7497a;
        public final Source b;

        public InitializationIntent(PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking, Source previousSource) {
            Intrinsics.i(previousSource, "previousSource");
            this.f7497a = bulkBooking;
            this.b = previousSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f7497a, initializationIntent.f7497a) && this.b == initializationIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7497a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(flowType=" + this.f7497a + ", previousSource=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$RemoveSlotClickIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveSlotClickIntent extends PremiumBusBulkBookingConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateAndSlotSelectedForBulkBooking f7498a;

        public RemoveSlotClickIntent(DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking) {
            this.f7498a = dateAndSlotSelectedForBulkBooking;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveSlotClickIntent) && Intrinsics.d(this.f7498a, ((RemoveSlotClickIntent) obj).f7498a);
        }

        public final int hashCode() {
            return this.f7498a.hashCode();
        }

        public final String toString() {
            return "RemoveSlotClickIntent(slotToRemove=" + this.f7498a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$TermsAndConditionsTextClickIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TermsAndConditionsTextClickIntent extends PremiumBusBulkBookingConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermsAndConditionsTextClickIntent f7499a = new TermsAndConditionsTextClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TermsAndConditionsTextClickIntent);
        }

        public final int hashCode() {
            return 1673346543;
        }

        public final String toString() {
            return "TermsAndConditionsTextClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$TnCBottomSheetDismissIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TnCBottomSheetDismissIntent extends PremiumBusBulkBookingConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TnCBottomSheetDismissIntent f7500a = new TnCBottomSheetDismissIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TnCBottomSheetDismissIntent);
        }

        public final int hashCode() {
            return -1249662917;
        }

        public final String toString() {
            return "TnCBottomSheetDismissIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent$TnCBottomSheetOkClickIntent;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PremiumBusBulkBookingConfirmationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TnCBottomSheetOkClickIntent extends PremiumBusBulkBookingConfirmationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TnCBottomSheetOkClickIntent f7501a = new TnCBottomSheetOkClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TnCBottomSheetOkClickIntent);
        }

        public final int hashCode() {
            return 1613117;
        }

        public final String toString() {
            return "TnCBottomSheetOkClickIntent";
        }
    }
}
