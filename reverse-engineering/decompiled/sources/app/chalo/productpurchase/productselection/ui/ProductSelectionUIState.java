package app.chalo.productpurchase.productselection.ui;

import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSelectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f8699a;
    public final ProductSelectionSkeletonLoadingUIState b;
    public final StandardErrorScreenUIState c;
    public final LoadingDialogUIState d;
    public final ProductSelectionProductsListUIState e;
    public final ConfirmationDialogUiState f;
    public final ProductSelectionUISpec g;

    public ProductSelectionUIState(ToolbarUIState toolbarUIState, ProductSelectionSkeletonLoadingUIState productSelectionSkeletonLoadingUIState, StandardErrorScreenUIState standardErrorScreenUIState, LoadingDialogUIState loadingDialogUIState, ProductSelectionProductsListUIState productSelectionProductsListUIState, ConfirmationDialogUiState confirmationDialogUiState) {
        ProductSelectionUISpec productSelectionUISpec = new ProductSelectionUISpec();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        this.f8699a = toolbarUIState;
        this.b = productSelectionSkeletonLoadingUIState;
        this.c = standardErrorScreenUIState;
        this.d = loadingDialogUIState;
        this.e = productSelectionProductsListUIState;
        this.f = confirmationDialogUiState;
        this.g = productSelectionUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionUIState)) {
            return false;
        }
        ProductSelectionUIState productSelectionUIState = (ProductSelectionUIState) obj;
        return Intrinsics.d(this.f8699a, productSelectionUIState.f8699a) && Intrinsics.d(this.b, productSelectionUIState.b) && Intrinsics.d(this.c, productSelectionUIState.c) && Intrinsics.d(this.d, productSelectionUIState.d) && Intrinsics.d(this.e, productSelectionUIState.e) && Intrinsics.d(this.f, productSelectionUIState.f) && Intrinsics.d(this.g, productSelectionUIState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f8699a.hashCode() * 31;
        ProductSelectionSkeletonLoadingUIState productSelectionSkeletonLoadingUIState = this.b;
        int iHashCode2 = (iHashCode + (productSelectionSkeletonLoadingUIState == null ? 0 : productSelectionSkeletonLoadingUIState.hashCode())) * 31;
        StandardErrorScreenUIState standardErrorScreenUIState = this.c;
        int iHashCode3 = (iHashCode2 + (standardErrorScreenUIState == null ? 0 : standardErrorScreenUIState.hashCode())) * 31;
        LoadingDialogUIState loadingDialogUIState = this.d;
        int iHashCode4 = (iHashCode3 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
        ProductSelectionProductsListUIState productSelectionProductsListUIState = this.e;
        int iHashCode5 = (iHashCode4 + (productSelectionProductsListUIState == null ? 0 : productSelectionProductsListUIState.f8690a.hashCode())) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.f;
        return this.g.f8698a.hashCode() + ((iHashCode5 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ProductSelectionUIState(toolbarUIState=" + this.f8699a + ", loadingScreen=" + this.b + ", errorScreen=" + this.c + ", loadingDialog=" + this.d + ", products=" + this.e + ", errorDialog=" + this.f + ", spec=" + this.g + ")";
    }
}
