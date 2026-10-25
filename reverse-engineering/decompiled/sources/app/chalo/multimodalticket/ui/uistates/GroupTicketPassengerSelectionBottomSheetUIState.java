package app.chalo.multimodalticket.ui.uistates;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketPassengerSelectionBottomSheetUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketPassengerSelectionBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketPassengerSelectionBottomSheetUISpecs f5965a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final PassengerSelectionItemsContainerUIState e;
    public final ButtonUIState f;

    public GroupTicketPassengerSelectionBottomSheetUIState(TextUIState.ChaloTextUIState titleTextUIState, TextUIState.ChaloTextUIState subTitleTextUIState, ImageUIState imageUIState, PassengerSelectionItemsContainerUIState passengerSelectionItemsContainerUIState, ButtonUIState buttonUIState) {
        GroupTicketPassengerSelectionBottomSheetUISpecs groupTicketPassengerSelectionBottomSheetUISpecs = new GroupTicketPassengerSelectionBottomSheetUISpecs();
        Intrinsics.i(titleTextUIState, "titleTextUIState");
        Intrinsics.i(subTitleTextUIState, "subTitleTextUIState");
        Intrinsics.i(passengerSelectionItemsContainerUIState, "passengerSelectionItemsContainerUIState");
        this.f5965a = groupTicketPassengerSelectionBottomSheetUISpecs;
        this.b = titleTextUIState;
        this.c = subTitleTextUIState;
        this.d = imageUIState;
        this.e = passengerSelectionItemsContainerUIState;
        this.f = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketPassengerSelectionBottomSheetUIState)) {
            return false;
        }
        GroupTicketPassengerSelectionBottomSheetUIState groupTicketPassengerSelectionBottomSheetUIState = (GroupTicketPassengerSelectionBottomSheetUIState) obj;
        return Intrinsics.d(this.f5965a, groupTicketPassengerSelectionBottomSheetUIState.f5965a) && Intrinsics.d(this.b, groupTicketPassengerSelectionBottomSheetUIState.b) && Intrinsics.d(this.c, groupTicketPassengerSelectionBottomSheetUIState.c) && Intrinsics.d(this.d, groupTicketPassengerSelectionBottomSheetUIState.d) && Intrinsics.d(this.e, groupTicketPassengerSelectionBottomSheetUIState.e) && Intrinsics.d(this.f, groupTicketPassengerSelectionBottomSheetUIState.f);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.f(this.b, this.f5965a.hashCode() * 31, 31), 31);
        ImageUIState imageUIState = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "GroupTicketPassengerSelectionBottomSheetUIState(specs=" + this.f5965a + ", titleTextUIState=" + this.b + ", subTitleTextUIState=" + this.c + ", closeIconUIState=" + this.d + ", passengerSelectionItemsContainerUIState=" + this.e + ", proceedButtonUIState=" + this.f + ")";
    }
}
