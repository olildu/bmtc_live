package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketJourneyOverviewUiSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketJourneyOverviewUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5912a;
    public final float b;

    public GroupTicketJourneyOverviewUiSpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().f;
        this.f5912a = chaloPadding;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketJourneyOverviewUiSpec)) {
            return false;
        }
        GroupTicketJourneyOverviewUiSpec groupTicketJourneyOverviewUiSpec = (GroupTicketJourneyOverviewUiSpec) obj;
        return Intrinsics.d(this.f5912a, groupTicketJourneyOverviewUiSpec.f5912a) && Dp.m7283equalsimpl0(this.b, groupTicketJourneyOverviewUiSpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f5912a.hashCode() * 31);
    }

    public final String toString() {
        return t8.h("GroupTicketJourneyOverviewUiSpec(sectionPadding=", this.f5912a, ", fullJourneyBottomPadding=", Dp.m7289toStringimpl(this.b), ")");
    }
}
