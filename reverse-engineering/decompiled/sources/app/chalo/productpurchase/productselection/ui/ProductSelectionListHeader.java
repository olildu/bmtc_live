package app.chalo.productpurchase.productselection.ui;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionListHeader;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSelectionListHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8686a;
    public final TextUIState b;

    public ProductSelectionListHeader(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.f8686a = chaloTextUIState;
        this.b = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionListHeader)) {
            return false;
        }
        ProductSelectionListHeader productSelectionListHeader = (ProductSelectionListHeader) obj;
        return this.f8686a.equals(productSelectionListHeader.f8686a) && Intrinsics.d(this.b, productSelectionListHeader.b);
    }

    public final int hashCode() {
        int iHashCode = this.f8686a.hashCode() * 31;
        TextUIState textUIState = this.b;
        return iHashCode + (textUIState == null ? 0 : textUIState.hashCode());
    }

    public final String toString() {
        return "ProductSelectionListHeader(text=" + this.f8686a + ", seeMore=" + this.b + ")";
    }
}
