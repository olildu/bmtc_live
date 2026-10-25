package app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/multipleorigindestinationselectionscreen/OriginDestinationSelectionCtaItemUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OriginDestinationSelectionCtaItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7687a;
    public final float b;
    public final TextUIState.ChaloTextUIState c;
    public final ButtonUIState d;

    public OriginDestinationSelectionCtaItemUIState(TextUIState.ChaloTextUIState viewStopsUIState, ButtonUIState buttonUIState) {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().n;
        Intrinsics.i(viewStopsUIState, "viewStopsUIState");
        this.f7687a = f;
        this.b = f2;
        this.c = viewStopsUIState;
        this.d = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginDestinationSelectionCtaItemUIState)) {
            return false;
        }
        OriginDestinationSelectionCtaItemUIState originDestinationSelectionCtaItemUIState = (OriginDestinationSelectionCtaItemUIState) obj;
        return Dp.m7283equalsimpl0(this.f7687a, originDestinationSelectionCtaItemUIState.f7687a) && Dp.m7283equalsimpl0(this.b, originDestinationSelectionCtaItemUIState.b) && Intrinsics.d(this.c, originDestinationSelectionCtaItemUIState.c) && Intrinsics.d(this.d, originDestinationSelectionCtaItemUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f7687a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OriginDestinationSelectionCtaItemUIState(viewStopAndSelectSlotBtnSpacing=", Dp.m7289toStringimpl(this.f7687a), ", selectOriginDestinationButtonHeight=", Dp.m7289toStringimpl(this.b), ", viewStopsUIState=");
        sbE.append(this.c);
        sbE.append(", selectOriginDestinationButtonUIState=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
