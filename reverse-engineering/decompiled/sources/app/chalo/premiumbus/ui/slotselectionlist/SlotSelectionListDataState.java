package app.chalo.premiumbus.ui.slotselectionlist;

import app.chalo.constants.Source;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import defpackage.q7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselectionlist/SlotSelectionListDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotSelectionListDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7923a;
    public final List b;
    public final SlotsAvailableForSelection c;
    public final Source d;

    public SlotSelectionListDataState(String toolbarTitle, List list, SlotsAvailableForSelection slotsAvailableForSelection, Source source) {
        Intrinsics.i(toolbarTitle, "toolbarTitle");
        Intrinsics.i(source, "source");
        this.f7923a = toolbarTitle;
        this.b = list;
        this.c = slotsAvailableForSelection;
        this.d = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotSelectionListDataState)) {
            return false;
        }
        SlotSelectionListDataState slotSelectionListDataState = (SlotSelectionListDataState) obj;
        return Intrinsics.d(this.f7923a, slotSelectionListDataState.f7923a) && Intrinsics.d(this.b, slotSelectionListDataState.b) && Intrinsics.d(this.c, slotSelectionListDataState.c) && this.d == slotSelectionListDataState.d;
    }

    public final int hashCode() {
        int iHashCode = this.f7923a.hashCode() * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SlotsAvailableForSelection slotsAvailableForSelection = this.c;
        return this.d.hashCode() + ((iHashCode2 + (slotsAvailableForSelection != null ? slotsAvailableForSelection.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbH = q7.h("SlotSelectionListDataState(toolbarTitle=", this.f7923a, ", nearBySlots=", ", selectedSlot=", this.b);
        sbH.append(this.c);
        sbH.append(", source=");
        sbH.append(this.d);
        sbH.append(")");
        return sbH.toString();
    }
}
