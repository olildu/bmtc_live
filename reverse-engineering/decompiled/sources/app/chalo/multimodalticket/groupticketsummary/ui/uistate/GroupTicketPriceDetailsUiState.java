package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.productbooking.common.uistate.FareLineUiState;
import app.chalo.uistate.divider.DashedDividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketPriceDetailsUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketPriceDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketPriceDetailsUiSpec f5917a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final FareLineUiState d;
    public final DashedDividerUIState e;

    public GroupTicketPriceDetailsUiState(TextUIState.ChaloTextUIState title, List legFareList, FareLineUiState fareLineUiState) {
        GroupTicketPriceDetailsUiSpec groupTicketPriceDetailsUiSpec = new GroupTicketPriceDetailsUiSpec();
        DashedDividerUIState dashedDividerUIState = new DashedDividerUIState(ChaloThemeHelper.a().b, 14, null);
        Intrinsics.i(title, "title");
        Intrinsics.i(legFareList, "legFareList");
        this.f5917a = groupTicketPriceDetailsUiSpec;
        this.b = title;
        this.c = legFareList;
        this.d = fareLineUiState;
        this.e = dashedDividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketPriceDetailsUiState)) {
            return false;
        }
        GroupTicketPriceDetailsUiState groupTicketPriceDetailsUiState = (GroupTicketPriceDetailsUiState) obj;
        return Intrinsics.d(this.f5917a, groupTicketPriceDetailsUiState.f5917a) && Intrinsics.d(this.b, groupTicketPriceDetailsUiState.b) && Intrinsics.d(this.c, groupTicketPriceDetailsUiState.c) && Intrinsics.d(this.d, groupTicketPriceDetailsUiState.d) && Intrinsics.d(this.e, groupTicketPriceDetailsUiState.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + r30.b(r30.f(this.b, this.f5917a.hashCode() * 31, 31), 31, this.c)) * 31;
        DashedDividerUIState dashedDividerUIState = this.e;
        return iHashCode + (dashedDividerUIState == null ? 0 : dashedDividerUIState.hashCode());
    }

    public final String toString() {
        return "GroupTicketPriceDetailsUiState(uiSpec=" + this.f5917a + ", title=" + this.b + ", legFareList=" + this.c + ", totalFare=" + this.d + ", totalFareDivider=" + this.e + ")";
    }
}
