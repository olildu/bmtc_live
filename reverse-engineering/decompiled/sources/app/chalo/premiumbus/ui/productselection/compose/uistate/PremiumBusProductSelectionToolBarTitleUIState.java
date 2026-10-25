package app.chalo.premiumbus.ui.productselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PremiumBusProductSelectionToolBarTitleUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusProductSelectionToolBarTitleUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7707a;
    public final TextUIState.ChaloTextUIState b;
    public final float c;
    public final ImageUIState d;

    public PremiumBusProductSelectionToolBarTitleUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        float f = ChaloThemeHelper.a().d;
        ImageUIState imageUIState = new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
        this.f7707a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = f;
        this.d = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductSelectionToolBarTitleUIState)) {
            return false;
        }
        PremiumBusProductSelectionToolBarTitleUIState premiumBusProductSelectionToolBarTitleUIState = (PremiumBusProductSelectionToolBarTitleUIState) obj;
        return Intrinsics.d(this.f7707a, premiumBusProductSelectionToolBarTitleUIState.f7707a) && Intrinsics.d(this.b, premiumBusProductSelectionToolBarTitleUIState.b) && Dp.m7283equalsimpl0(this.c, premiumBusProductSelectionToolBarTitleUIState.c) && Intrinsics.d(this.d, premiumBusProductSelectionToolBarTitleUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f7707a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        return this.d.hashCode() + uf0.a(this.c, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbJ = n21.j("PremiumBusProductSelectionToolBarTitleUIState(fromStopName=", this.f7707a, ", toStopName=", this.b, ", btwIconAndTextSpacing=");
        sbJ.append(strM7289toStringimpl);
        sbJ.append(", btwIcon=");
        sbJ.append(this.d);
        sbJ.append(")");
        return sbJ.toString();
    }
}
