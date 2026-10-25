package app.chalo.productpurchase.productselection.ui;

import app.chalo.uistate.plotline.PlotlineWidgetUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionProductsListSectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSelectionProductsListSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSelectionListHeader f8689a;
    public final PlotlineWidgetUIState b;
    public final ProductAnnouncementTextUIState c;
    public final List d;
    public final ProductSelectionProductsListSectionUISpec e;

    public ProductSelectionProductsListSectionUIState(ProductSelectionListHeader header, PlotlineWidgetUIState plotlineWidgetUIState, ProductAnnouncementTextUIState productAnnouncementTextUIState, List items) {
        ProductSelectionProductsListSectionUISpec productSelectionProductsListSectionUISpec = new ProductSelectionProductsListSectionUISpec();
        Intrinsics.i(header, "header");
        Intrinsics.i(items, "items");
        this.f8689a = header;
        this.b = plotlineWidgetUIState;
        this.c = productAnnouncementTextUIState;
        this.d = items;
        this.e = productSelectionProductsListSectionUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionProductsListSectionUIState)) {
            return false;
        }
        ProductSelectionProductsListSectionUIState productSelectionProductsListSectionUIState = (ProductSelectionProductsListSectionUIState) obj;
        return Intrinsics.d(this.f8689a, productSelectionProductsListSectionUIState.f8689a) && Intrinsics.d(this.b, productSelectionProductsListSectionUIState.b) && Intrinsics.d(this.c, productSelectionProductsListSectionUIState.c) && Intrinsics.d(this.d, productSelectionProductsListSectionUIState.d) && Intrinsics.d(this.e, productSelectionProductsListSectionUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8689a.hashCode() * 31;
        PlotlineWidgetUIState plotlineWidgetUIState = this.b;
        int iHashCode2 = (iHashCode + (plotlineWidgetUIState == null ? 0 : plotlineWidgetUIState.f10064a.hashCode())) * 31;
        ProductAnnouncementTextUIState productAnnouncementTextUIState = this.c;
        return this.e.hashCode() + r30.b((iHashCode2 + (productAnnouncementTextUIState != null ? productAnnouncementTextUIState.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "ProductSelectionProductsListSectionUIState(header=" + this.f8689a + ", plotlineWidget=" + this.b + ", announcement=" + this.c + ", items=" + this.d + ", spec=" + this.e + ")";
    }
}
