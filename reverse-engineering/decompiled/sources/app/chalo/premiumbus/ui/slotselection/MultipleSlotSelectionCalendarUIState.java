package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.dialog.ErrorBottomSheetUIState;
import app.chalo.uistate.dialog.MultiSelectDatePickerUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState;", "", "LoadingState", "CalendarDataState", "ErrorState", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState$CalendarDataState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState$ErrorState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState$LoadingState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MultipleSlotSelectionCalendarUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState$CalendarDataState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CalendarDataState extends MultipleSlotSelectionCalendarUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiSelectDatePickerUIState f7801a;

        public CalendarDataState(MultiSelectDatePickerUIState calendarUIState) {
            Intrinsics.i(calendarUIState, "calendarUIState");
            this.f7801a = calendarUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CalendarDataState) && Intrinsics.d(this.f7801a, ((CalendarDataState) obj).f7801a);
        }

        public final int hashCode() {
            return this.f7801a.hashCode();
        }

        public final String toString() {
            return "CalendarDataState(calendarUIState=" + this.f7801a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState$ErrorState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorState extends MultipleSlotSelectionCalendarUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ErrorBottomSheetUIState f7802a;

        public ErrorState(ErrorBottomSheetUIState errorBottomSheetUIState) {
            this.f7802a = errorBottomSheetUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorState) && Intrinsics.d(this.f7802a, ((ErrorState) obj).f7802a);
        }

        public final int hashCode() {
            return this.f7802a.hashCode();
        }

        public final String toString() {
            return "ErrorState(errorUIState=" + this.f7802a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState$LoadingState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadingState extends MultipleSlotSelectionCalendarUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiSelectDatePickerUIState f7803a;

        public LoadingState(MultiSelectDatePickerUIState calendarUIState) {
            Intrinsics.i(calendarUIState, "calendarUIState");
            this.f7803a = calendarUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingState) && Intrinsics.d(this.f7803a, ((LoadingState) obj).f7803a);
        }

        public final int hashCode() {
            return this.f7803a.hashCode();
        }

        public final String toString() {
            return "LoadingState(calendarUIState=" + this.f7803a + ")";
        }
    }
}
