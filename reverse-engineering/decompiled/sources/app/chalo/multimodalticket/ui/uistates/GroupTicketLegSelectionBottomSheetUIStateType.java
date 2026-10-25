package app.chalo.multimodalticket.ui.uistates;

import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType;", "", "None", "PassengerSelection", "Error", "Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType$Error;", "Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType$None;", "Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType$PassengerSelection;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GroupTicketLegSelectionBottomSheetUIStateType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f5961a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType$Error;", "Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends GroupTicketLegSelectionBottomSheetUIStateType {
        public final BottomSheetUiState b;
        public final BottomSheetStandardContentUiState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(BottomSheetUiState sheetUiState, BottomSheetStandardContentUiState bottomSheetStandardContentUiState) {
            super(sheetUiState);
            Intrinsics.i(sheetUiState, "sheetUiState");
            this.b = sheetUiState;
            this.c = bottomSheetStandardContentUiState;
        }

        @Override // app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetUiState getF5961a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.d(this.b, error.b) && Intrinsics.d(this.c, error.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(sheetUiState=" + this.b + ", contentUiState=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType$None;", "Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None extends GroupTicketLegSelectionBottomSheetUIStateType {
        public static final None b = new None(new BottomSheetUiState((BottomSheetEventHandler) null, 3));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1821022090;
        }

        public final String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType$PassengerSelection;", "Lapp/chalo/multimodalticket/ui/uistates/GroupTicketLegSelectionBottomSheetUIStateType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerSelection extends GroupTicketLegSelectionBottomSheetUIStateType {
        public final BottomSheetUiState b;
        public final GroupTicketPassengerSelectionBottomSheetUIState c;

        public PassengerSelection(BottomSheetUiState bottomSheetUiState, GroupTicketPassengerSelectionBottomSheetUIState groupTicketPassengerSelectionBottomSheetUIState) {
            super(bottomSheetUiState);
            this.b = bottomSheetUiState;
            this.c = groupTicketPassengerSelectionBottomSheetUIState;
        }

        @Override // app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetUiState getF5961a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassengerSelection)) {
                return false;
            }
            PassengerSelection passengerSelection = (PassengerSelection) obj;
            return Intrinsics.d(this.b, passengerSelection.b) && Intrinsics.d(this.c, passengerSelection.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "PassengerSelection(sheetUiState=" + this.b + ", contentUiState=" + this.c + ")";
        }
    }

    public GroupTicketLegSelectionBottomSheetUIStateType(BottomSheetUiState bottomSheetUiState) {
        this.f5961a = bottomSheetUiState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public BottomSheetUiState getF5961a() {
        return this.f5961a;
    }
}
