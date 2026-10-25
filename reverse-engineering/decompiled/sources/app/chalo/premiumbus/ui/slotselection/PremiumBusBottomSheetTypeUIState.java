package app.chalo.premiumbus.ui.slotselection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState;", "", "AvailablePurchaseOptions", "ViewAllSlots", "NoSlotAvailableBottomSheet", "NoODPairAvailableBottomSheet", "MultipleSlotSelectionCalendar", "NearBySlotsAvailableSelectionBottomSheet", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$AvailablePurchaseOptions;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$MultipleSlotSelectionCalendar;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$NearBySlotsAvailableSelectionBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$NoODPairAvailableBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$NoSlotAvailableBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$ViewAllSlots;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusBottomSheetTypeUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$AvailablePurchaseOptions;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvailablePurchaseOptions extends PremiumBusBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusPurchaseOptionUIState f7836a;

        public AvailablePurchaseOptions(PremiumBusPurchaseOptionUIState premiumBusPurchaseOptionUIState) {
            this.f7836a = premiumBusPurchaseOptionUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvailablePurchaseOptions) && Intrinsics.d(this.f7836a, ((AvailablePurchaseOptions) obj).f7836a);
        }

        public final int hashCode() {
            return this.f7836a.hashCode();
        }

        public final String toString() {
            return "AvailablePurchaseOptions(options=" + this.f7836a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$MultipleSlotSelectionCalendar;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleSlotSelectionCalendar extends PremiumBusBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultipleSlotSelectionCalendarUIState f7837a;

        public MultipleSlotSelectionCalendar(MultipleSlotSelectionCalendarUIState multipleSlotSelectionCalendarUIState) {
            this.f7837a = multipleSlotSelectionCalendarUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultipleSlotSelectionCalendar) && Intrinsics.d(this.f7837a, ((MultipleSlotSelectionCalendar) obj).f7837a);
        }

        public final int hashCode() {
            return this.f7837a.hashCode();
        }

        public final String toString() {
            return "MultipleSlotSelectionCalendar(state=" + this.f7837a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$NearBySlotsAvailableSelectionBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearBySlotsAvailableSelectionBottomSheet extends PremiumBusBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NearBySlotsAvailableSelectionBottomSheetUIState f7838a;

        public NearBySlotsAvailableSelectionBottomSheet(NearBySlotsAvailableSelectionBottomSheetUIState nearBySlotsAvailableSelectionBottomSheetUIState) {
            this.f7838a = nearBySlotsAvailableSelectionBottomSheetUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearBySlotsAvailableSelectionBottomSheet) && Intrinsics.d(this.f7838a, ((NearBySlotsAvailableSelectionBottomSheet) obj).f7838a);
        }

        public final int hashCode() {
            return this.f7838a.hashCode();
        }

        public final String toString() {
            return "NearBySlotsAvailableSelectionBottomSheet(state=" + this.f7838a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$NoODPairAvailableBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoODPairAvailableBottomSheet extends PremiumBusBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoODPairAvailableBottomSheet f7839a = new NoODPairAvailableBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$NoSlotAvailableBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoSlotAvailableBottomSheet extends PremiumBusBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoSlotAvailableBottomSheet f7840a = new NoSlotAvailableBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState$ViewAllSlots;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusBottomSheetTypeUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewAllSlots extends PremiumBusBottomSheetTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewAllSlotsBottomSheetUIState f7841a;

        public ViewAllSlots(ViewAllSlotsBottomSheetUIState viewAllSlotsBottomSheetUIState) {
            this.f7841a = viewAllSlotsBottomSheetUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewAllSlots) && Intrinsics.d(this.f7841a, ((ViewAllSlots) obj).f7841a);
        }

        public final int hashCode() {
            return this.f7841a.hashCode();
        }

        public final String toString() {
            return "ViewAllSlots(state=" + this.f7841a + ")";
        }
    }
}
