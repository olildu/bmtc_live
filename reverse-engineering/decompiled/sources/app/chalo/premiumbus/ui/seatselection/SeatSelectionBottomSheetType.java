package app.chalo.premiumbus.ui.seatselection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType;", "", "GenderPreferenceBottomSheet", "WomenReservedSeatsChoice", "PassengerCountSelection", "Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType$GenderPreferenceBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType$PassengerCountSelection;", "Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType$WomenReservedSeatsChoice;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SeatSelectionBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType$GenderPreferenceBottomSheet;", "Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderPreferenceBottomSheet extends SeatSelectionBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GenderConfirmationBottomSheetType f7754a;

        public GenderPreferenceBottomSheet(GenderConfirmationBottomSheetType genderConfirmationBottomSheetType) {
            this.f7754a = genderConfirmationBottomSheetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenderPreferenceBottomSheet) && Intrinsics.d(this.f7754a, ((GenderPreferenceBottomSheet) obj).f7754a);
        }

        public final int hashCode() {
            return this.f7754a.hashCode();
        }

        public final String toString() {
            return "GenderPreferenceBottomSheet(genderConfirmationBottomSheetType=" + this.f7754a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType$PassengerCountSelection;", "Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerCountSelection extends SeatSelectionBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassengerCountSelection f7755a = new PassengerCountSelection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PassengerCountSelection);
        }

        public final int hashCode() {
            return -1475429688;
        }

        public final String toString() {
            return "PassengerCountSelection";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType$WomenReservedSeatsChoice;", "Lapp/chalo/premiumbus/ui/seatselection/SeatSelectionBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WomenReservedSeatsChoice extends SeatSelectionBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WomenReservedSeatsChoice f7756a = new WomenReservedSeatsChoice();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WomenReservedSeatsChoice);
        }

        public final int hashCode() {
            return -1794474760;
        }

        public final String toString() {
            return "WomenReservedSeatsChoice";
        }
    }
}
