package app.chalo.multimodalticket.ui.uistates;

import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/GroupTicketPassengerFareUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketPassengerFareUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketPassengerFareUISpecs f5963a = new GroupTicketPassengerFareUISpecs();
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;

    public GroupTicketPassengerFareUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketPassengerFareUIState)) {
            return false;
        }
        GroupTicketPassengerFareUIState groupTicketPassengerFareUIState = (GroupTicketPassengerFareUIState) obj;
        return Intrinsics.d(this.f5963a, groupTicketPassengerFareUIState.f5963a) && Intrinsics.d(this.b, groupTicketPassengerFareUIState.b) && Intrinsics.d(this.c, groupTicketPassengerFareUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5963a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        return this.c.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupTicketPassengerFareUIState(specs=");
        sb.append(this.f5963a);
        sb.append(", originalFareTextUIState=");
        sb.append(this.b);
        sb.append(", payableFareTextUIState=");
        return py.f(sb, this.c, ")");
    }
}
