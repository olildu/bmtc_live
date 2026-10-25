package app.chalo.productsummary.ui.ticket;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/ProductBookingSummaryFareSplitUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductBookingSummaryFareSplitUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8787a;
    public final String b;

    public ProductBookingSummaryFareSplitUiModel(String fareTypeCopy, String fareAmount) {
        Intrinsics.i(fareTypeCopy, "fareTypeCopy");
        Intrinsics.i(fareAmount, "fareAmount");
        this.f8787a = fareTypeCopy;
        this.b = fareAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBookingSummaryFareSplitUiModel)) {
            return false;
        }
        ProductBookingSummaryFareSplitUiModel productBookingSummaryFareSplitUiModel = (ProductBookingSummaryFareSplitUiModel) obj;
        return Intrinsics.d(this.f8787a, productBookingSummaryFareSplitUiModel.f8787a) && Intrinsics.d(this.b, productBookingSummaryFareSplitUiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8787a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("ProductBookingSummaryFareSplitUiModel(fareTypeCopy=", this.f8787a, ", fareAmount=", this.b, ")");
    }
}
