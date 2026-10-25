package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBSlotSelectionTabItemUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBSlotSelectionTabItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PBSlotSelectionTabItemUISpecs f7828a;
    public final TextUIState.ChaloTextUIState b;

    public PBSlotSelectionTabItemUIState(PBSlotSelectionTabItemUISpecs pBSlotSelectionTabItemUISpecs, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.f7828a = pBSlotSelectionTabItemUISpecs;
        this.b = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBSlotSelectionTabItemUIState)) {
            return false;
        }
        PBSlotSelectionTabItemUIState pBSlotSelectionTabItemUIState = (PBSlotSelectionTabItemUIState) obj;
        return Intrinsics.d(this.f7828a, pBSlotSelectionTabItemUIState.f7828a) && Intrinsics.d(this.b, pBSlotSelectionTabItemUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7828a.hashCode() * 31);
    }

    public final String toString() {
        return "PBSlotSelectionTabItemUIState(pbSlotSelectionTabItemUISpecs=" + this.f7828a + ", text=" + this.b + ")";
    }

    public /* synthetic */ PBSlotSelectionTabItemUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
        this(new PBSlotSelectionTabItemUISpecs(null, 127), chaloTextUIState);
    }
}
