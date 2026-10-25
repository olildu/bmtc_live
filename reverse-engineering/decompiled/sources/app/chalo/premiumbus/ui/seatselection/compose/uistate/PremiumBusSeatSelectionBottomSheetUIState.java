package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.compose.theme.UIShape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState;", "", "GenderConfirmationBottomSheet", "WomenReservedSeatsChoiceBottomSheet", "WomenReservedSeatsUnavailableBottomSheet", "PassengerCountSelectionBottomSheet", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState$GenderConfirmationBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState$PassengerCountSelectionBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState$WomenReservedSeatsChoiceBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState$WomenReservedSeatsUnavailableBottomSheet;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusSeatSelectionBottomSheetUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState$GenderConfirmationBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderConfirmationBottomSheet extends PremiumBusSeatSelectionBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GenderConfirmationBottomSheetUIState f7777a;

        public GenderConfirmationBottomSheet(GenderConfirmationBottomSheetUIState genderConfirmationBottomSheetUIState) {
            Intrinsics.i(genderConfirmationBottomSheetUIState, "genderConfirmationBottomSheetUIState");
            this.f7777a = genderConfirmationBottomSheetUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenderConfirmationBottomSheet) && Intrinsics.d(this.f7777a, ((GenderConfirmationBottomSheet) obj).f7777a);
        }

        public final int hashCode() {
            return this.f7777a.hashCode();
        }

        public final String toString() {
            return "GenderConfirmationBottomSheet(genderConfirmationBottomSheetUIState=" + this.f7777a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState$PassengerCountSelectionBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerCountSelectionBottomSheet extends PremiumBusSeatSelectionBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PassengerCountSelectionBottomSheetUIState f7778a;

        static {
            UIShape.Rectangle rectangle = UIShape.f1926a;
        }

        public PassengerCountSelectionBottomSheet(PassengerCountSelectionBottomSheetUIState passengerCountSelectionBottomSheetUIState) {
            this.f7778a = passengerCountSelectionBottomSheetUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassengerCountSelectionBottomSheet) && Intrinsics.d(this.f7778a, ((PassengerCountSelectionBottomSheet) obj).f7778a);
        }

        public final int hashCode() {
            return this.f7778a.hashCode();
        }

        public final String toString() {
            return "PassengerCountSelectionBottomSheet(passengerCountSelectionBottomSheetUIState=" + this.f7778a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState$WomenReservedSeatsChoiceBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WomenReservedSeatsChoiceBottomSheet extends PremiumBusSeatSelectionBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WomenReservedSeatsChoiceBottomSheetUIState f7779a;

        public WomenReservedSeatsChoiceBottomSheet(WomenReservedSeatsChoiceBottomSheetUIState womenReservedSeatsChoiceBottomSheetUIState) {
            this.f7779a = womenReservedSeatsChoiceBottomSheetUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WomenReservedSeatsChoiceBottomSheet) && Intrinsics.d(this.f7779a, ((WomenReservedSeatsChoiceBottomSheet) obj).f7779a);
        }

        public final int hashCode() {
            return this.f7779a.hashCode();
        }

        public final String toString() {
            return "WomenReservedSeatsChoiceBottomSheet(womenReservedSeatsChoiceBottomSheetUIState=" + this.f7779a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState$WomenReservedSeatsUnavailableBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionBottomSheetUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WomenReservedSeatsUnavailableBottomSheet extends PremiumBusSeatSelectionBottomSheetUIState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WomenReservedSeatsUnavailableBottomSheet);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "WomenReservedSeatsUnavailableBottomSheet(womenReservedSeatsUnavailableBottomSheetUIState=null)";
        }
    }
}
