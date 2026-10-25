package app.chalo.home.ui.history.uistate;

import defpackage.b3;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/ProductsTabUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductsTabUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductTabSpec f3480a;
    public final List b;
    public final int c;

    public ProductsTabUiState(ArrayList arrayList, int i, int i2) {
        ProductTabSpec productTabSpec = new ProductTabSpec();
        List tabUiState = arrayList;
        tabUiState = (i2 & 2) != 0 ? EmptyList.f17557a : tabUiState;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.i(tabUiState, "tabUiState");
        this.f3480a = productTabSpec;
        this.b = tabUiState;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsTabUiState)) {
            return false;
        }
        ProductsTabUiState productsTabUiState = (ProductsTabUiState) obj;
        return Intrinsics.d(this.f3480a, productsTabUiState.f3480a) && Intrinsics.d(this.b, productsTabUiState.b) && this.c == productsTabUiState.c;
    }

    public final int hashCode() {
        return r30.b(this.f3480a.f3479a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductsTabUiState(spec=");
        sb.append(this.f3480a);
        sb.append(", tabUiState=");
        sb.append(this.b);
        sb.append(", currentlySelectedIndex=");
        return b3.f(")", this.c, sb);
    }
}
