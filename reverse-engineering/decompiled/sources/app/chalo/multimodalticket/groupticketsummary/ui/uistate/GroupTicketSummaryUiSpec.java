package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketSummaryUiSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSummaryUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5921a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;

    public GroupTicketSummaryUiSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 3);
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding3 = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        this.f5921a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = chaloPadding4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryUiSpec)) {
            return false;
        }
        GroupTicketSummaryUiSpec groupTicketSummaryUiSpec = (GroupTicketSummaryUiSpec) obj;
        return Intrinsics.d(this.f5921a, groupTicketSummaryUiSpec.f5921a) && Intrinsics.d(this.b, groupTicketSummaryUiSpec.b) && Intrinsics.d(this.c, groupTicketSummaryUiSpec.c) && Intrinsics.d(this.d, groupTicketSummaryUiSpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, r30.c(this.b, this.f5921a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("GroupTicketSummaryUiSpec(contentPadding=", this.f5921a, ", snackBarContainerPadding=", this.b, ", proceedButtonPadding=");
        sbM.append(this.c);
        sbM.append(", ticketDetailsDividerPadding=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
