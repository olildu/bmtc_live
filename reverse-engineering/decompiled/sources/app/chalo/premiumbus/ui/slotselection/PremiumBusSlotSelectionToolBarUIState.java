package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import defpackage.py;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionToolBarUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSlotSelectionToolBarUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusSlotSelectionToolBarTitleUIState f7890a;
    public final ImageUIState b;
    public final float c;
    public final ChaloColorToken d;
    public final ChaloColorToken e;
    public final float f;
    public final ChaloPadding g;

    public PremiumBusSlotSelectionToolBarUIState(PremiumBusSlotSelectionToolBarTitleUIState premiumBusSlotSelectionToolBarTitleUIState, ImageUIState imageUIState, float f, int i) {
        premiumBusSlotSelectionToolBarTitleUIState = (i & 1) != 0 ? null : premiumBusSlotSelectionToolBarTitleUIState;
        imageUIState = (i & 2) != 0 ? new ImageUIState(IconType.IC_ARROW_BACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254) : imageUIState;
        float f2 = ChaloThemeHelper.c.f1917a;
        f = (i & 64) != 0 ? ChaloThemeHelper.a().q : f;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().h, 0.0f, 11);
        this.f7890a = premiumBusSlotSelectionToolBarTitleUIState;
        this.b = imageUIState;
        this.c = f2;
        this.d = ChaloColorToken.White.f9870a;
        this.e = ChaloColorToken.SectionDividerColor.f9849a;
        this.f = f;
        this.g = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSlotSelectionToolBarUIState)) {
            return false;
        }
        PremiumBusSlotSelectionToolBarUIState premiumBusSlotSelectionToolBarUIState = (PremiumBusSlotSelectionToolBarUIState) obj;
        return Intrinsics.d(this.f7890a, premiumBusSlotSelectionToolBarUIState.f7890a) && Intrinsics.d(this.b, premiumBusSlotSelectionToolBarUIState.b) && Dp.m7283equalsimpl0(this.c, premiumBusSlotSelectionToolBarUIState.c) && Intrinsics.d(this.d, premiumBusSlotSelectionToolBarUIState.d) && Intrinsics.d(this.e, premiumBusSlotSelectionToolBarUIState.e) && Dp.m7283equalsimpl0(this.f, premiumBusSlotSelectionToolBarUIState.f) && Intrinsics.d(this.g, premiumBusSlotSelectionToolBarUIState.g);
    }

    public final int hashCode() {
        PremiumBusSlotSelectionToolBarTitleUIState premiumBusSlotSelectionToolBarTitleUIState = this.f7890a;
        int iHashCode = (premiumBusSlotSelectionToolBarTitleUIState == null ? 0 : premiumBusSlotSelectionToolBarTitleUIState.hashCode()) * 31;
        ImageUIState imageUIState = this.b;
        return this.g.hashCode() + uf0.a(this.f, z40.b(this.e, z40.b(this.d, uf0.a(this.c, (iHashCode + (imageUIState != null ? imageUIState.hashCode() : 0)) * 961, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("PremiumBusSlotSelectionToolBarUIState(titleUI=");
        sb.append(this.f7890a);
        sb.append(", navigationIcon=");
        sb.append(this.b);
        sb.append(", navIconEventHandler=null, elevation=");
        sb.append(strM7289toStringimpl);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", dividerColor=");
        sb.append(this.e);
        sb.append(", toolbarHeight=");
        sb.append(strM7289toStringimpl2);
        sb.append(", contentPadding=");
        return py.e(sb, this.g, ")");
    }
}
