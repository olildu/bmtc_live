package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import defpackage.b3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType;", "", "AvailablePurchaseOptions", "ViewAllSlots", "MultipleSlotSelectionCalendar", "NearBySlotsAvailableSelectionBottomSheet", "Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType$AvailablePurchaseOptions;", "Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType$MultipleSlotSelectionCalendar;", "Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType$NearBySlotsAvailableSelectionBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType$ViewAllSlots;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PBSlotSelectionScreenBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType$AvailablePurchaseOptions;", "Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvailablePurchaseOptions extends PBSlotSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7823a;
        public final boolean b;

        public AvailablePurchaseOptions(ArrayList arrayList, boolean z) {
            this.f7823a = arrayList;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvailablePurchaseOptions)) {
                return false;
            }
            AvailablePurchaseOptions availablePurchaseOptions = (AvailablePurchaseOptions) obj;
            return this.f7823a.equals(availablePurchaseOptions.f7823a) && this.b == availablePurchaseOptions.b;
        }

        public final int hashCode() {
            return (this.f7823a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "AvailablePurchaseOptions(options=" + this.f7823a + ", isOnlySingleUnsupportedValuePassAvailable=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType$MultipleSlotSelectionCalendar;", "Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleSlotSelectionCalendar extends PBSlotSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultipleSlotSelectionCalendarState f7824a;

        public MultipleSlotSelectionCalendar(MultipleSlotSelectionCalendarState multipleSlotSelectionCalendarState) {
            this.f7824a = multipleSlotSelectionCalendarState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultipleSlotSelectionCalendar) && Intrinsics.d(this.f7824a, ((MultipleSlotSelectionCalendar) obj).f7824a);
        }

        public final int hashCode() {
            return this.f7824a.hashCode();
        }

        public final String toString() {
            return "MultipleSlotSelectionCalendar(state=" + this.f7824a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType$NearBySlotsAvailableSelectionBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearBySlotsAvailableSelectionBottomSheet extends PBSlotSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7825a;
        public final PBAvailableSlotsTripAppModel b;

        public NearBySlotsAvailableSelectionBottomSheet(ArrayList arrayList, PBAvailableSlotsTripAppModel selectedSlot) {
            Intrinsics.i(selectedSlot, "selectedSlot");
            this.f7825a = arrayList;
            this.b = selectedSlot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearBySlotsAvailableSelectionBottomSheet)) {
                return false;
            }
            NearBySlotsAvailableSelectionBottomSheet nearBySlotsAvailableSelectionBottomSheet = (NearBySlotsAvailableSelectionBottomSheet) obj;
            return this.f7825a.equals(nearBySlotsAvailableSelectionBottomSheet.f7825a) && Intrinsics.d(this.b, nearBySlotsAvailableSelectionBottomSheet.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7825a.hashCode() * 31);
        }

        public final String toString() {
            return "NearBySlotsAvailableSelectionBottomSheet(slotsSelectedForBulkBooking=" + this.f7825a + ", selectedSlot=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType$ViewAllSlots;", "Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewAllSlots extends PBSlotSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBAvailableSlotsInfoAppModel f7826a;
        public final PBAvailableSlotsTripAppModel b;
        public final PBOriginDestinationAppModel c;
        public final List d;
        public final int e;

        public ViewAllSlots(PBAvailableSlotsInfoAppModel data, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PBOriginDestinationAppModel pBOriginDestinationAppModel, List list, int i) {
            Intrinsics.i(data, "data");
            this.f7826a = data;
            this.b = pBAvailableSlotsTripAppModel;
            this.c = pBOriginDestinationAppModel;
            this.d = list;
            this.e = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PBAvailableSlotsTripAppModel getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAllSlots)) {
                return false;
            }
            ViewAllSlots viewAllSlots = (ViewAllSlots) obj;
            return Intrinsics.d(this.f7826a, viewAllSlots.f7826a) && Intrinsics.d(this.b, viewAllSlots.b) && Intrinsics.d(this.c, viewAllSlots.c) && Intrinsics.d(this.d, viewAllSlots.d) && this.e == viewAllSlots.e;
        }

        public final int hashCode() {
            int iHashCode = this.f7826a.hashCode() * 31;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.b;
            int iHashCode2 = (iHashCode + (pBAvailableSlotsTripAppModel == null ? 0 : pBAvailableSlotsTripAppModel.hashCode())) * 31;
            PBOriginDestinationAppModel pBOriginDestinationAppModel = this.c;
            int iHashCode3 = (iHashCode2 + (pBOriginDestinationAppModel == null ? 0 : pBOriginDestinationAppModel.hashCode())) * 31;
            List list = this.d;
            return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewAllSlots(data=");
            sb.append(this.f7826a);
            sb.append(", selectedSlot=");
            sb.append(this.b);
            sb.append(", odPairData=");
            sb.append(this.c);
            sb.append(", odPairsWithSlots=");
            sb.append(this.d);
            sb.append(", odCardIndex=");
            return b3.f(")", this.e, sb);
        }
    }
}
