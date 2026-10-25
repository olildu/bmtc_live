package app.chalo.productpurchase.productselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import defpackage.dd;
import defpackage.gf;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionLoadingItemUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSelectionLoadingItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8687a;
    public final float b;
    public final UIShape c;

    public ProductSelectionLoadingItemUIState(float f, float f2) {
        float f3 = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f3, f3, f3, f3);
        this.f8687a = f;
        this.b = f2;
        this.c = rectangle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionLoadingItemUIState)) {
            return false;
        }
        ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState = (ProductSelectionLoadingItemUIState) obj;
        return Dp.m7283equalsimpl0(this.f8687a, productSelectionLoadingItemUIState.f8687a) && Dp.m7283equalsimpl0(this.b, productSelectionLoadingItemUIState.b) && Intrinsics.d(this.c, productSelectionLoadingItemUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.a(this.b, Dp.m7284hashCodeimpl(this.f8687a) * 31, 31);
    }

    public final String toString() {
        return gf.j(dd.e("ProductSelectionLoadingItemUIState(height=", Dp.m7289toStringimpl(this.f8687a), ", width=", Dp.m7289toStringimpl(this.b), ", shape="), this.c, ")");
    }
}
