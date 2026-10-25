package app.chalo.productpurchase.productselection.ui;

import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSkeletonLoadingUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSelectionSkeletonLoadingUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8697a;
    public final ProductSelectionLoadingItemUIState b;
    public final ProductSelectionLoadingItemUIState c;
    public final ProductSelectionLoadingItemUIState d;
    public final ProductSelectionLoadingItemUIState e;
    public final ProductSelectionSkeletonLoadingUISpec f;

    public ProductSelectionSkeletonLoadingUIState() {
        ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState = new ProductSelectionLoadingItemUIState(ChaloThemeHelper.a().i, ChaloThemeHelper.a().u);
        ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState2 = new ProductSelectionLoadingItemUIState(ChaloThemeHelper.a().g, ChaloThemeHelper.a().m);
        ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState3 = new ProductSelectionLoadingItemUIState(ChaloThemeHelper.a().i, ChaloThemeHelper.a().u);
        ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState4 = new ProductSelectionLoadingItemUIState(ChaloThemeHelper.a().h, ChaloThemeHelper.a().v);
        ProductSelectionSkeletonLoadingUISpec productSelectionSkeletonLoadingUISpec = new ProductSelectionSkeletonLoadingUISpec();
        this.f8697a = 6;
        this.b = productSelectionLoadingItemUIState;
        this.c = productSelectionLoadingItemUIState2;
        this.d = productSelectionLoadingItemUIState3;
        this.e = productSelectionLoadingItemUIState4;
        this.f = productSelectionSkeletonLoadingUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionSkeletonLoadingUIState)) {
            return false;
        }
        ProductSelectionSkeletonLoadingUIState productSelectionSkeletonLoadingUIState = (ProductSelectionSkeletonLoadingUIState) obj;
        return this.f8697a == productSelectionSkeletonLoadingUIState.f8697a && Intrinsics.d(this.b, productSelectionSkeletonLoadingUIState.b) && Intrinsics.d(this.c, productSelectionSkeletonLoadingUIState.c) && Intrinsics.d(this.d, productSelectionSkeletonLoadingUIState.d) && Intrinsics.d(this.e, productSelectionSkeletonLoadingUIState.e) && Intrinsics.d(this.f, productSelectionSkeletonLoadingUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f8697a * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProductSelectionSkeletonLoadingUIState(contentCount=" + this.f8697a + ", screenTitle=" + this.b + ", label=" + this.c + ", title=" + this.d + ", additionalInfo=" + this.e + ", spec=" + this.f + ")";
    }
}
