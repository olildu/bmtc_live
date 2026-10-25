package app.chalo.premiumbus.ui.productselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PremiumBusProductSelectionToolBarUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusProductSelectionToolBarUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusProductSelectionToolBarTitleUIState f7708a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final UiEventHandler d;
    public final ToolbarActionsUIState e;
    public final float f;
    public final ChaloColorToken g;
    public final ChaloColorToken h;
    public final float i;
    public final ChaloPadding j;

    public PremiumBusProductSelectionToolBarUIState(PremiumBusProductSelectionToolBarTitleUIState premiumBusProductSelectionToolBarTitleUIState, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, ToolbarActionsUIState toolbarActionsUIState, float f, int i) {
        premiumBusProductSelectionToolBarTitleUIState = (i & 1) != 0 ? null : premiumBusProductSelectionToolBarTitleUIState;
        chaloTextUIState = (i & 2) != 0 ? null : chaloTextUIState;
        ImageUIState imageUIState2 = (i & 4) != 0 ? new ImageUIState(IconType.IC_ARROW_BACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254) : imageUIState;
        ToolbarActionsUIState toolbarActionsUIState2 = (i & 16) == 0 ? toolbarActionsUIState : null;
        float f2 = (i & 32) != 0 ? ChaloThemeHelper.c.f1917a : f;
        float f3 = ChaloThemeHelper.a().q;
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().h, 0.0f, 11);
        this.f7708a = premiumBusProductSelectionToolBarTitleUIState;
        this.b = chaloTextUIState;
        this.c = imageUIState2;
        this.d = UiEventHandler.Companion.f9897a;
        this.e = toolbarActionsUIState2;
        this.f = f2;
        this.g = ChaloColorToken.White.f9870a;
        this.h = ChaloColorToken.SectionDividerColor.f9849a;
        this.i = f3;
        this.j = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductSelectionToolBarUIState)) {
            return false;
        }
        PremiumBusProductSelectionToolBarUIState premiumBusProductSelectionToolBarUIState = (PremiumBusProductSelectionToolBarUIState) obj;
        return Intrinsics.d(this.f7708a, premiumBusProductSelectionToolBarUIState.f7708a) && Intrinsics.d(this.b, premiumBusProductSelectionToolBarUIState.b) && Intrinsics.d(this.c, premiumBusProductSelectionToolBarUIState.c) && Intrinsics.d(this.d, premiumBusProductSelectionToolBarUIState.d) && Intrinsics.d(this.e, premiumBusProductSelectionToolBarUIState.e) && Dp.m7283equalsimpl0(this.f, premiumBusProductSelectionToolBarUIState.f) && Intrinsics.d(this.g, premiumBusProductSelectionToolBarUIState.g) && Intrinsics.d(this.h, premiumBusProductSelectionToolBarUIState.h) && Dp.m7283equalsimpl0(this.i, premiumBusProductSelectionToolBarUIState.i) && Intrinsics.d(this.j, premiumBusProductSelectionToolBarUIState.j);
    }

    public final int hashCode() {
        PremiumBusProductSelectionToolBarTitleUIState premiumBusProductSelectionToolBarTitleUIState = this.f7708a;
        int iHashCode = (premiumBusProductSelectionToolBarTitleUIState == null ? 0 : premiumBusProductSelectionToolBarTitleUIState.hashCode()) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (this.d.hashCode() + r30.e(this.c, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31)) * 31;
        ToolbarActionsUIState toolbarActionsUIState = this.e;
        return this.j.hashCode() + uf0.a(this.i, z40.b(this.h, z40.b(this.g, uf0.a(this.f, (iHashCode2 + (toolbarActionsUIState != null ? toolbarActionsUIState.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "PremiumBusProductSelectionToolBarUIState(titleUIWithIcon=" + this.f7708a + ", title=" + this.b + ", navigationIcon=" + this.c + ", navIconEventHandler=" + this.d + ", toolbarAction=" + this.e + ", elevation=" + Dp.m7289toStringimpl(this.f) + ", backgroundColor=" + this.g + ", dividerColor=" + this.h + ", toolbarHeight=" + Dp.m7289toStringimpl(this.i) + ", contentPadding=" + this.j + ")";
    }
}
