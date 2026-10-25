package app.chalo.premiumbus.ui.slotselectionlist;

import app.chalo.constants.Source;
import app.chalo.premiumbus.data.PremiumBusSlotListScreenData;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent;", "", "InitializationIntent", "ConfirmButtonClickIntent", "OnSlotSelectionClickIntent", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent$ConfirmButtonClickIntent;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent$OnSlotSelectionClickIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SlotSelectionListViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent$ConfirmButtonClickIntent;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmButtonClickIntent extends SlotSelectionListViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmButtonClickIntent f7924a = new ConfirmButtonClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmButtonClickIntent);
        }

        public final int hashCode() {
            return -1071600378;
        }

        public final String toString() {
            return "ConfirmButtonClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SlotSelectionListViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7925a;
        public final Source b;
        public final PremiumBusSlotListScreenData c;

        public InitializationIntent(String requestId, Source source, PremiumBusSlotListScreenData nearBySlots) {
            Intrinsics.i(requestId, "requestId");
            Intrinsics.i(source, "source");
            Intrinsics.i(nearBySlots, "nearBySlots");
            this.f7925a = requestId;
            this.b = source;
            this.c = nearBySlots;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f7925a, initializationIntent.f7925a) && this.b == initializationIntent.b && Intrinsics.d(this.c, initializationIntent.c);
        }

        public final int hashCode() {
            return this.c.f6961a.hashCode() + nf1.f(this.b, this.f7925a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "InitializationIntent(requestId=" + this.f7925a + ", source=" + this.b + ", nearBySlots=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent$OnSlotSelectionClickIntent;", "Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSlotSelectionClickIntent extends SlotSelectionListViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlotsAvailableForSelection f7926a;

        public OnSlotSelectionClickIntent(SlotsAvailableForSelection slotsAvailableForSelection) {
            this.f7926a = slotsAvailableForSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSlotSelectionClickIntent) && Intrinsics.d(this.f7926a, ((OnSlotSelectionClickIntent) obj).f7926a);
        }

        public final int hashCode() {
            return this.f7926a.hashCode();
        }

        public final String toString() {
            return "OnSlotSelectionClickIntent(selectedSlot=" + this.f7926a + ")";
        }
    }
}
