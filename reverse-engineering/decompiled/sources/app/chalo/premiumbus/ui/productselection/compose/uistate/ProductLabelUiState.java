package app.chalo.premiumbus.ui.productselection.compose.uistate;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/ProductLabelUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductLabelUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7712a;
    public final ProductLabelSpecs b;

    public ProductLabelUiState(TextUIState.ChaloTextUIState chaloTextUIState, ProductLabelSpecs productLabelSpecs) {
        this.f7712a = chaloTextUIState;
        this.b = productLabelSpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductLabelUiState)) {
            return false;
        }
        ProductLabelUiState productLabelUiState = (ProductLabelUiState) obj;
        return Intrinsics.d(this.f7712a, productLabelUiState.f7712a) && Intrinsics.d(this.b, productLabelUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7712a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductLabelUiState(label=" + this.f7712a + ", specs=" + this.b + ")";
    }
}
