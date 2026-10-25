package app.chalo.multimodalticket.ui.uistates;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.passengercounter.PassengerCounterUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketPassengerSelectionItemUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketPassengerSelectionItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketPassengerSelectionItemUISpecs f5967a;
    public final TextUIState.ChaloTextUIState b;
    public final GroupTicketPassengerFareUIState c;
    public final ImageUIState d;
    public final boolean e;
    public final FareBreakupSectionUIState f;
    public final PassengerCounterUiState g;

    public GroupTicketPassengerSelectionItemUIState(TextUIState.ChaloTextUIState categoryTextUIState, GroupTicketPassengerFareUIState fareUIState, ImageUIState imageUIState, boolean z, FareBreakupSectionUIState fareBreakupSectionUIState, PassengerCounterUiState passengerCounterUiState) {
        GroupTicketPassengerSelectionItemUISpecs groupTicketPassengerSelectionItemUISpecs = new GroupTicketPassengerSelectionItemUISpecs();
        Intrinsics.i(categoryTextUIState, "categoryTextUIState");
        Intrinsics.i(fareUIState, "fareUIState");
        this.f5967a = groupTicketPassengerSelectionItemUISpecs;
        this.b = categoryTextUIState;
        this.c = fareUIState;
        this.d = imageUIState;
        this.e = z;
        this.f = fareBreakupSectionUIState;
        this.g = passengerCounterUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketPassengerSelectionItemUIState)) {
            return false;
        }
        GroupTicketPassengerSelectionItemUIState groupTicketPassengerSelectionItemUIState = (GroupTicketPassengerSelectionItemUIState) obj;
        return Intrinsics.d(this.f5967a, groupTicketPassengerSelectionItemUIState.f5967a) && Intrinsics.d(this.b, groupTicketPassengerSelectionItemUIState.b) && Intrinsics.d(this.c, groupTicketPassengerSelectionItemUIState.c) && Intrinsics.d(this.d, groupTicketPassengerSelectionItemUIState.d) && this.e == groupTicketPassengerSelectionItemUIState.e && Intrinsics.d(this.f, groupTicketPassengerSelectionItemUIState.f) && Intrinsics.d(this.g, groupTicketPassengerSelectionItemUIState.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + r30.f(this.b, this.f5967a.hashCode() * 31, 31)) * 31;
        ImageUIState imageUIState = this.d;
        int iHashCode2 = (((iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        FareBreakupSectionUIState fareBreakupSectionUIState = this.f;
        return this.g.hashCode() + ((iHashCode2 + (fareBreakupSectionUIState != null ? fareBreakupSectionUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GroupTicketPassengerSelectionItemUIState(specs=" + this.f5967a + ", categoryTextUIState=" + this.b + ", fareUIState=" + this.c + ", infoIconUIState=" + this.d + ", shouldShowToolTip=" + this.e + ", fareBreakupSectionUIState=" + this.f + ", counterUIState=" + this.g + ")";
    }
}
