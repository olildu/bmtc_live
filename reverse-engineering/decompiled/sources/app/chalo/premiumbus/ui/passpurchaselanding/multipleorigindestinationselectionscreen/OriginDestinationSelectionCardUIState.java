package app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen;

import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.productselection.compose.uistate.ProductLabelUiState;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.gr0;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/multipleorigindestinationselectionscreen/OriginDestinationSelectionCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OriginDestinationSelectionCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OriginDestinationSelectionCardUISpec f7686a;
    public final ProductLabelUiState b;
    public final DividerUIState c;
    public final OriginDestinationInfoUIState d;
    public final OriginDestinationSelectionCtaItemUIState e;
    public final gr0 f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public OriginDestinationSelectionCardUIState(ProductLabelUiState productLabelUiState, DividerUIState dividerUiState, OriginDestinationInfoUIState originDestinationInfoUIState, OriginDestinationSelectionCtaItemUIState originDestinationSelectionCtaItemUIState, gr0 gr0Var) {
        OriginDestinationSelectionCardUISpec originDestinationSelectionCardUISpec = new OriginDestinationSelectionCardUISpec();
        Intrinsics.i(dividerUiState, "dividerUiState");
        Intrinsics.i(originDestinationInfoUIState, "originDestinationInfoUIState");
        this.f7686a = originDestinationSelectionCardUISpec;
        this.b = productLabelUiState;
        this.c = dividerUiState;
        this.d = originDestinationInfoUIState;
        this.e = originDestinationSelectionCtaItemUIState;
        this.f = gr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginDestinationSelectionCardUIState)) {
            return false;
        }
        OriginDestinationSelectionCardUIState originDestinationSelectionCardUIState = (OriginDestinationSelectionCardUIState) obj;
        return Intrinsics.d(this.f7686a, originDestinationSelectionCardUIState.f7686a) && Intrinsics.d(this.b, originDestinationSelectionCardUIState.b) && Intrinsics.d(this.c, originDestinationSelectionCardUIState.c) && Intrinsics.d(this.d, originDestinationSelectionCardUIState.d) && Intrinsics.d(this.e, originDestinationSelectionCardUIState.e) && Intrinsics.d(this.f, originDestinationSelectionCardUIState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f7686a.hashCode() * 31;
        ProductLabelUiState productLabelUiState = this.b;
        int iHashCode2 = (this.d.hashCode() + py.c(this.c, (iHashCode + (productLabelUiState == null ? 0 : productLabelUiState.hashCode())) * 31, 31)) * 31;
        OriginDestinationSelectionCtaItemUIState originDestinationSelectionCtaItemUIState = this.e;
        return this.f.hashCode() + ((iHashCode2 + (originDestinationSelectionCtaItemUIState != null ? originDestinationSelectionCtaItemUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OriginDestinationSelectionCardUIState(spec=" + this.f7686a + ", labelText=" + this.b + ", dividerUiState=" + this.c + ", originDestinationInfoUIState=" + this.d + ", originDestinationSelectionCtaItemUIState=" + this.e + ", cardClickEventHandler=" + this.f + ")";
    }
}
