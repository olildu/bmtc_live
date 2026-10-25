package app.chalo.productpurchase.productselection.ui;

import app.chalo.constants.Source;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModel;
import defpackage.hq0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f8674a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final ProductSelectionErrorDialog e;
    public final boolean f;
    public final AllProductConfigsResponseAppModel g;
    public final List h;
    public final List i;

    public ProductSelectionDataState(Source previousScreenSource, boolean z, boolean z2, List list, ProductSelectionErrorDialog productSelectionErrorDialog, boolean z3, AllProductConfigsResponseAppModel allProductConfigsResponseAppModel, List list2, List list3) {
        Intrinsics.i(previousScreenSource, "previousScreenSource");
        this.f8674a = previousScreenSource;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = productSelectionErrorDialog;
        this.f = z3;
        this.g = allProductConfigsResponseAppModel;
        this.h = list2;
        this.i = list3;
    }

    public static ProductSelectionDataState a(ProductSelectionDataState productSelectionDataState, Source source, boolean z, boolean z2, List list, ProductSelectionErrorDialog productSelectionErrorDialog, boolean z3, AllProductConfigsResponseAppModel allProductConfigsResponseAppModel, List list2, List list3, int i) {
        if ((i & 1) != 0) {
            source = productSelectionDataState.f8674a;
        }
        Source previousScreenSource = source;
        productSelectionDataState.getClass();
        if ((i & 4) != 0) {
            z = productSelectionDataState.b;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = productSelectionDataState.c;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            list = productSelectionDataState.d;
        }
        List list4 = list;
        if ((i & 32) != 0) {
            productSelectionErrorDialog = productSelectionDataState.e;
        }
        ProductSelectionErrorDialog productSelectionErrorDialog2 = productSelectionErrorDialog;
        boolean z6 = (i & 64) != 0 ? productSelectionDataState.f : z3;
        AllProductConfigsResponseAppModel allProductConfigsResponseAppModel2 = (i & 128) != 0 ? productSelectionDataState.g : allProductConfigsResponseAppModel;
        List list5 = (i & 256) != 0 ? productSelectionDataState.h : list2;
        List list6 = (i & 512) != 0 ? productSelectionDataState.i : list3;
        productSelectionDataState.getClass();
        Intrinsics.i(previousScreenSource, "previousScreenSource");
        return new ProductSelectionDataState(previousScreenSource, z4, z5, list4, productSelectionErrorDialog2, z6, allProductConfigsResponseAppModel2, list5, list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionDataState)) {
            return false;
        }
        ProductSelectionDataState productSelectionDataState = (ProductSelectionDataState) obj;
        return this.f8674a == productSelectionDataState.f8674a && this.b == productSelectionDataState.b && this.c == productSelectionDataState.c && Intrinsics.d(this.d, productSelectionDataState.d) && Intrinsics.d(this.e, productSelectionDataState.e) && this.f == productSelectionDataState.f && Intrinsics.d(this.g, productSelectionDataState.g) && Intrinsics.d(this.h, productSelectionDataState.h) && Intrinsics.d(this.i, productSelectionDataState.i);
    }

    public final int hashCode() {
        int iHashCode = ((((this.f8674a.hashCode() * 961) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ProductSelectionErrorDialog productSelectionErrorDialog = this.e;
        int iHashCode3 = (((iHashCode2 + (productSelectionErrorDialog == null ? 0 : productSelectionErrorDialog.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31;
        AllProductConfigsResponseAppModel allProductConfigsResponseAppModel = this.g;
        int iHashCode4 = (iHashCode3 + (allProductConfigsResponseAppModel == null ? 0 : allProductConfigsResponseAppModel.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.i;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductSelectionDataState(previousScreenSource=");
        sb.append(this.f8674a);
        sb.append(", targetConfigId=null, shouldShowLoading=");
        sb.append(this.b);
        sb.append(", shouldShowError=");
        hq0.w(sb, this.c, ", userRecentBookings=", this.d, ", errorDialog=");
        sb.append(this.e);
        sb.append(", showLoader=");
        sb.append(this.f);
        sb.append(", completeConfigResponse=");
        sb.append(this.g);
        sb.append(", allActiveAndEnabledProducts=");
        sb.append(this.h);
        sb.append(", visibleProducts=");
        return xs.l(sb, this.i, ")");
    }
}
