package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import app.chalo.productbooking.common.uistate.FareLineUiState;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketLegFareUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketLegFareUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketLegFareUiSpec f5915a = new GroupTicketLegFareUiSpec();
    public final FareLineUiState b;
    public final ImageUIState c;
    public final boolean d;
    public final UiEventHandler e;
    public final ArrayList f;

    public GroupTicketLegFareUiState(FareLineUiState fareLineUiState, ImageUIState imageUIState, boolean z, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ArrayList arrayList) {
        this.b = fareLineUiState;
        this.c = imageUIState;
        this.d = z;
        this.e = uiEventHandler$Companion$fromLambda$1;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketLegFareUiState)) {
            return false;
        }
        GroupTicketLegFareUiState groupTicketLegFareUiState = (GroupTicketLegFareUiState) obj;
        return Intrinsics.d(this.f5915a, groupTicketLegFareUiState.f5915a) && Intrinsics.d(this.b, groupTicketLegFareUiState.b) && Intrinsics.d(this.c, groupTicketLegFareUiState.c) && this.d == groupTicketLegFareUiState.d && Intrinsics.d(this.e, groupTicketLegFareUiState.e) && Intrinsics.d(this.f, groupTicketLegFareUiState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f5915a.f5914a.hashCode() * 31)) * 31;
        ImageUIState imageUIState = this.c;
        int iHashCode2 = (((iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31;
        UiEventHandler uiEventHandler = this.e;
        return this.f.hashCode() + ((iHashCode2 + (uiEventHandler != null ? uiEventHandler.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GroupTicketLegFareUiState(spec=" + this.f5915a + ", legFare=" + this.b + ", expandIcon=" + this.c + ", isExpanded=" + this.d + ", onLegFareClicked=" + this.e + ", breakup=" + this.f + ")";
    }
}
