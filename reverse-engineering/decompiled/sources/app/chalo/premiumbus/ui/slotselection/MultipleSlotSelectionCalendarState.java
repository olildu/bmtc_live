package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState;", "", "LoadingState", "DataState", "ErrorState", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState$DataState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState$ErrorState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState$LoadingState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MultipleSlotSelectionCalendarState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState$DataState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DataState extends MultipleSlotSelectionCalendarState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7798a;
        public final String b;
        public final MultiSelectionCalendarDataState c;

        public DataState(String userSelectionSlotTimeInString, String str, MultiSelectionCalendarDataState state) {
            Intrinsics.i(userSelectionSlotTimeInString, "userSelectionSlotTimeInString");
            Intrinsics.i(state, "state");
            this.f7798a = userSelectionSlotTimeInString;
            this.b = str;
            this.c = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataState)) {
                return false;
            }
            DataState dataState = (DataState) obj;
            return Intrinsics.d(this.f7798a, dataState.f7798a) && Intrinsics.d(this.b, dataState.b) && Intrinsics.d(this.c, dataState.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7798a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("DataState(userSelectionSlotTimeInString=", this.f7798a, ", passRideLeftString=", this.b, ", state=");
            sbE.append(this.c);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState$ErrorState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorState extends MultipleSlotSelectionCalendarState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBAvailableSlotsTripAppModel f7799a;
        public final SelectedPassInfo b;

        public ErrorState(PBAvailableSlotsTripAppModel slot, SelectedPassInfo selectedPassInfo) {
            Intrinsics.i(slot, "slot");
            Intrinsics.i(selectedPassInfo, "selectedPassInfo");
            this.f7799a = slot;
            this.b = selectedPassInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorState)) {
                return false;
            }
            ErrorState errorState = (ErrorState) obj;
            return Intrinsics.d(this.f7799a, errorState.f7799a) && Intrinsics.d(this.b, errorState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7799a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorState(slot=" + this.f7799a + ", selectedPassInfo=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState$LoadingState;", "Lapp/chalo/premiumbus/ui/slotselection/MultipleSlotSelectionCalendarState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadingState extends MultipleSlotSelectionCalendarState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7800a;

        public LoadingState(String userSelectionSlotTimeInString) {
            Intrinsics.i(userSelectionSlotTimeInString, "userSelectionSlotTimeInString");
            this.f7800a = userSelectionSlotTimeInString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingState) && Intrinsics.d(this.f7800a, ((LoadingState) obj).f7800a);
        }

        public final int hashCode() {
            return this.f7800a.hashCode();
        }

        public final String toString() {
            return vo1.B("LoadingState(userSelectionSlotTimeInString=", this.f7800a, ")");
        }
    }
}
