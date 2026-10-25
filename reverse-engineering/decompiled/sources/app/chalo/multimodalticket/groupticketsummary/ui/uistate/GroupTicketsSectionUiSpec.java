package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketsSectionUiSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketsSectionUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5923a;
    public final float b;
    public final UiAlignment.Vertical c;
    public final float d;

    public GroupTicketsSectionUiSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().i);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().d;
        this.f5923a = chaloPadding;
        this.b = f;
        this.c = UiAlignment.Vertical.Center.f9888a;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketsSectionUiSpec)) {
            return false;
        }
        GroupTicketsSectionUiSpec groupTicketsSectionUiSpec = (GroupTicketsSectionUiSpec) obj;
        return Intrinsics.d(this.f5923a, groupTicketsSectionUiSpec.f5923a) && Dp.m7283equalsimpl0(this.b, groupTicketsSectionUiSpec.b) && Intrinsics.d(this.c, groupTicketsSectionUiSpec.c) && Dp.m7283equalsimpl0(this.d, groupTicketsSectionUiSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.e(this.c, uf0.a(this.b, this.f5923a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbN = t10.n("GroupTicketsSectionUiSpec(sectionPadding=", this.f5923a, ", ticketDetailsAndEditButtonSpacing=", strM7289toStringimpl, ", itemsVerticalAlignment=");
        sbN.append(this.c);
        sbN.append(", titleAndSummarySpacing=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(")");
        return sbN.toString();
    }
}
