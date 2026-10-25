package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketsSectionUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketsSectionUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketsSectionUiSpec f5924a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ToolbarActionsUIState d;

    public GroupTicketsSectionUiState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState summary, ToolbarActionsUIState toolbarActionsUIState) {
        GroupTicketsSectionUiSpec groupTicketsSectionUiSpec = new GroupTicketsSectionUiSpec();
        Intrinsics.i(title, "title");
        Intrinsics.i(summary, "summary");
        this.f5924a = groupTicketsSectionUiSpec;
        this.b = title;
        this.c = summary;
        this.d = toolbarActionsUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketsSectionUiState)) {
            return false;
        }
        GroupTicketsSectionUiState groupTicketsSectionUiState = (GroupTicketsSectionUiState) obj;
        return Intrinsics.d(this.f5924a, groupTicketsSectionUiState.f5924a) && Intrinsics.d(this.b, groupTicketsSectionUiState.b) && Intrinsics.d(this.c, groupTicketsSectionUiState.c) && Intrinsics.d(this.d, groupTicketsSectionUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.f(this.b, this.f5924a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "GroupTicketsSectionUiState(uiSpec=" + this.f5924a + ", title=" + this.b + ", summary=" + this.c + ", editButtonUiState=" + this.d + ")";
    }
}
