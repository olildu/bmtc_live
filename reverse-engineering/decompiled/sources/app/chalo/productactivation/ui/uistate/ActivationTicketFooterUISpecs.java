package app.chalo.productactivation.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiArrangement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketFooterUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationTicketFooterUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8059a;
    public final UiArrangement.HorizontalOrVertical b;

    public ActivationTicketFooterUISpecs() {
        float f = ChaloThemeHelper.a().g;
        UiArrangement.HorizontalOrVertical.SpacedBy spacedBy = new UiArrangement.HorizontalOrVertical.SpacedBy(ChaloThemeHelper.a().g);
        this.f8059a = f;
        this.b = spacedBy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationTicketFooterUISpecs)) {
            return false;
        }
        ActivationTicketFooterUISpecs activationTicketFooterUISpecs = (ActivationTicketFooterUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f8059a, activationTicketFooterUISpecs.f8059a) && Intrinsics.d(this.b, activationTicketFooterUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Dp.m7284hashCodeimpl(this.f8059a) * 31);
    }

    public final String toString() {
        return "ActivationTicketFooterUISpecs(detailsContainerAndDividerSpacing=" + Dp.m7289toStringimpl(this.f8059a) + ", ctaButtonsVerticalArrangement=" + this.b + ")";
    }
}
