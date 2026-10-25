package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionToolBarTitleUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSlotSelectionToolBarTitleUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7889a;
    public final TextUIState.ChaloTextUIState b;
    public final float c;
    public final ImageUIState d;

    public PremiumBusSlotSelectionToolBarTitleUIState(TextUIState.ChaloTextUIState fromStopName, TextUIState.ChaloTextUIState chaloTextUIState, float f, ImageUIState imageUIState) {
        Intrinsics.i(fromStopName, "fromStopName");
        this.f7889a = fromStopName;
        this.b = chaloTextUIState;
        this.c = f;
        this.d = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSlotSelectionToolBarTitleUIState)) {
            return false;
        }
        PremiumBusSlotSelectionToolBarTitleUIState premiumBusSlotSelectionToolBarTitleUIState = (PremiumBusSlotSelectionToolBarTitleUIState) obj;
        return Intrinsics.d(this.f7889a, premiumBusSlotSelectionToolBarTitleUIState.f7889a) && Intrinsics.d(this.b, premiumBusSlotSelectionToolBarTitleUIState.b) && Dp.m7283equalsimpl0(this.c, premiumBusSlotSelectionToolBarTitleUIState.c) && Intrinsics.d(this.d, premiumBusSlotSelectionToolBarTitleUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f7889a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        return this.d.hashCode() + uf0.a(this.c, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbJ = n21.j("PremiumBusSlotSelectionToolBarTitleUIState(fromStopName=", this.f7889a, ", toStopName=", this.b, ", btwIconAndTextSpacing=");
        sbJ.append(strM7289toStringimpl);
        sbJ.append(", btwIcon=");
        sbJ.append(this.d);
        sbJ.append(")");
        return sbJ.toString();
    }

    public PremiumBusSlotSelectionToolBarTitleUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this(chaloTextUIState, chaloTextUIState2, ChaloThemeHelper.a().d, imageUIState);
    }
}
