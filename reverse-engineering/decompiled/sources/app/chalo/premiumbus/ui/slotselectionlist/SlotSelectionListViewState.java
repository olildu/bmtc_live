package app.chalo.premiumbus.ui.slotselectionlist;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotSelectionListViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotSelectionListViewSpecs f7928a;
    public final ToolbarUIState b;
    public final List c;
    public final ButtonUIState d;

    public SlotSelectionListViewState(ToolbarUIState toolbarUIState, List list, ButtonUIState buttonUIState) {
        SlotSelectionListViewSpecs slotSelectionListViewSpecs = new SlotSelectionListViewSpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        this.f7928a = slotSelectionListViewSpecs;
        this.b = toolbarUIState;
        this.c = list;
        this.d = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotSelectionListViewState)) {
            return false;
        }
        SlotSelectionListViewState slotSelectionListViewState = (SlotSelectionListViewState) obj;
        return Intrinsics.d(this.f7928a, slotSelectionListViewState.f7928a) && Intrinsics.d(this.b, slotSelectionListViewState.b) && Intrinsics.d(this.c, slotSelectionListViewState.c) && Intrinsics.d(this.d, slotSelectionListViewState.d);
    }

    public final int hashCode() {
        int iD = t8.d(this.b, this.f7928a.hashCode() * 31, 31);
        List list = this.c;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        ButtonUIState buttonUIState = this.d;
        return iHashCode + (buttonUIState != null ? buttonUIState.hashCode() : 0);
    }

    public final String toString() {
        return "SlotSelectionListViewState(specs=" + this.f7928a + ", toolbarUIState=" + this.b + ", slotCardUIStateList=" + this.c + ", confirmButtonUiState=" + this.d + ")";
    }
}
