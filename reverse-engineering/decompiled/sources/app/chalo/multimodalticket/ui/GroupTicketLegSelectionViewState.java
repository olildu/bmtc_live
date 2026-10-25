package app.chalo.multimodalticket.ui;

import app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketLegSelectionViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketLegSelectionUISpecs f5946a;
    public final ToolbarUIState b;
    public final TicketSelectionContainerUIState c;
    public final ButtonUIState d;
    public final LoadingDialogUIState e;
    public final GroupTicketLegSelectionBottomSheetUIStateType f;

    public GroupTicketLegSelectionViewState(ToolbarUIState toolbarUIState, TicketSelectionContainerUIState ticketSelectionContainerUIState, ButtonUIState continueBtnUIState, LoadingDialogUIState loadingDialogUIState, GroupTicketLegSelectionBottomSheetUIStateType bottomSheetUIStateType) {
        GroupTicketLegSelectionUISpecs groupTicketLegSelectionUISpecs = new GroupTicketLegSelectionUISpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(ticketSelectionContainerUIState, "ticketSelectionContainerUIState");
        Intrinsics.i(continueBtnUIState, "continueBtnUIState");
        Intrinsics.i(bottomSheetUIStateType, "bottomSheetUIStateType");
        this.f5946a = groupTicketLegSelectionUISpecs;
        this.b = toolbarUIState;
        this.c = ticketSelectionContainerUIState;
        this.d = continueBtnUIState;
        this.e = loadingDialogUIState;
        this.f = bottomSheetUIStateType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketLegSelectionViewState)) {
            return false;
        }
        GroupTicketLegSelectionViewState groupTicketLegSelectionViewState = (GroupTicketLegSelectionViewState) obj;
        return Intrinsics.d(this.f5946a, groupTicketLegSelectionViewState.f5946a) && Intrinsics.d(this.b, groupTicketLegSelectionViewState.b) && Intrinsics.d(this.c, groupTicketLegSelectionViewState.c) && Intrinsics.d(this.d, groupTicketLegSelectionViewState.d) && Intrinsics.d(this.e, groupTicketLegSelectionViewState.e) && Intrinsics.d(this.f, groupTicketLegSelectionViewState.f);
    }

    public final int hashCode() {
        int iD = r30.d(this.d, (this.c.hashCode() + t8.d(this.b, this.f5946a.f5945a.hashCode() * 31, 31)) * 31, 31);
        LoadingDialogUIState loadingDialogUIState = this.e;
        return this.f.hashCode() + ((iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "GroupTicketLegSelectionViewState(specs=" + this.f5946a + ", toolbarUIState=" + this.b + ", ticketSelectionContainerUIState=" + this.c + ", continueBtnUIState=" + this.d + ", loadingUIState=" + this.e + ", bottomSheetUIStateType=" + this.f + ")";
    }
}
