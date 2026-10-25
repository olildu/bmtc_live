package app.chalo.premiumbus.prebookedtickets.productmodification;

import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import defpackage.b3;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "", "InitializationIntent", "RetryReasonsFetchIntent", "ReasonClickedIntent", "DismissConfirmationDialogIntent", "ConfirmActionIntent", "CancellationScreenOkCtaClickIntent", "BookAnotherRideCtaClickIntent", "SlotClickedIntent", "CloseBottomSheetBtnClickIntent", "ExploreAvailableRoutesClickIntent", "ConfirmSlotClickedIntent", "HandleSeatSelectionResultIntent", "OnBackPressedIntent", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$BookAnotherRideCtaClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$CancellationScreenOkCtaClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$CloseBottomSheetBtnClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$ConfirmActionIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$ConfirmSlotClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$DismissConfirmationDialogIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$ExploreAvailableRoutesClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$HandleSeatSelectionResultIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$InitializationIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$OnBackPressedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$ReasonClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$RetryReasonsFetchIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$SlotClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusProductModificationReasonsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$BookAnotherRideCtaClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BookAnotherRideCtaClickIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BookAnotherRideCtaClickIntent f7338a = new BookAnotherRideCtaClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$CancellationScreenOkCtaClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CancellationScreenOkCtaClickIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancellationScreenOkCtaClickIntent f7339a = new CancellationScreenOkCtaClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$CloseBottomSheetBtnClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CloseBottomSheetBtnClickIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseBottomSheetBtnClickIntent f7340a = new CloseBottomSheetBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$ConfirmActionIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfirmActionIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmActionIntent f7341a = new ConfirmActionIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$ConfirmSlotClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfirmSlotClickedIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmSlotClickedIntent f7342a = new ConfirmSlotClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$DismissConfirmationDialogIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissConfirmationDialogIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissConfirmationDialogIntent f7343a = new DismissConfirmationDialogIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$ExploreAvailableRoutesClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExploreAvailableRoutesClickIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExploreAvailableRoutesClickIntent f7344a = new ExploreAvailableRoutesClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$HandleSeatSelectionResultIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleSeatSelectionResultIntent extends PremiumBusProductModificationReasonsIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HandleSeatSelectionResultIntent);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "HandleSeatSelectionResultIntent(seats=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$InitializationIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7345a;
        public final String b;
        public final String c;
        public final PremiumReserveTicketOptionAction d;
        public final int e;

        public InitializationIntent(int i, PremiumReserveTicketOptionAction action, String bookingId, String productType, String productSubType) {
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(action, "action");
            this.f7345a = bookingId;
            this.b = productType;
            this.c = productSubType;
            this.d = action;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f7345a, initializationIntent.f7345a) && Intrinsics.d(this.b, initializationIntent.b) && Intrinsics.d(this.c, initializationIntent.c) && this.d == initializationIntent.d && this.e == initializationIntent.e;
        }

        public final int hashCode() {
            return ((this.d.hashCode() + nf1.e(nf1.e(this.f7345a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder sbE = dd.e("InitializationIntent(bookingId=", this.f7345a, ", productType=", this.b, ", productSubType=");
            sbE.append(this.c);
            sbE.append(", action=");
            sbE.append(this.d);
            sbE.append(", noOfSeatSelectedInCurrentBooking=");
            return b3.f(")", this.e, sbE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$OnBackPressedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackPressedIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressedIntent f7346a = new OnBackPressedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackPressedIntent);
        }

        public final int hashCode() {
            return 571380479;
        }

        public final String toString() {
            return "OnBackPressedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$ReasonClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReasonClickedIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductModificationReasonAppModel f7347a;

        public ReasonClickedIntent(PremiumBusProductModificationReasonAppModel reason) {
            Intrinsics.i(reason, "reason");
            this.f7347a = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReasonClickedIntent) && Intrinsics.d(this.f7347a, ((ReasonClickedIntent) obj).f7347a);
        }

        public final int hashCode() {
            return this.f7347a.hashCode();
        }

        public final String toString() {
            return "ReasonClickedIntent(reason=" + this.f7347a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$RetryReasonsFetchIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetryReasonsFetchIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryReasonsFetchIntent f7348a = new RetryReasonsFetchIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent$SlotClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotClickedIntent extends PremiumBusProductModificationReasonsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBAvailableSlotsTripAppModel f7349a;
        public final PBAvailableSlotsInfoAppModel b;

        static {
            PBAvailableSlotsInfoAppModel.Companion companion = PBAvailableSlotsInfoAppModel.INSTANCE;
            PBAvailableSlotsTripAppModel.Companion companion2 = PBAvailableSlotsTripAppModel.INSTANCE;
        }

        public SlotClickedIntent(PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PBAvailableSlotsInfoAppModel data) {
            Intrinsics.i(data, "data");
            this.f7349a = pBAvailableSlotsTripAppModel;
            this.b = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotClickedIntent)) {
                return false;
            }
            SlotClickedIntent slotClickedIntent = (SlotClickedIntent) obj;
            return Intrinsics.d(this.f7349a, slotClickedIntent.f7349a) && Intrinsics.d(this.b, slotClickedIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7349a.hashCode() * 31);
        }

        public final String toString() {
            return "SlotClickedIntent(trip=" + this.f7349a + ", data=" + this.b + ")";
        }
    }
}
