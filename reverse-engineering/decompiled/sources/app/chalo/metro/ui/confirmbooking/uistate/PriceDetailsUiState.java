package app.chalo.metro.ui.confirmbooking.uistate;

import app.chalo.metro.ui.uistate.ProductBannerUIState;
import app.chalo.productbooking.common.uistate.FareLineUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/uistate/PriceDetailsUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PriceDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriceDetailsUiSpec f5481a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final FareLineUiState d;
    public final DividerUIState e;
    public final ProductBannerUIState f;

    public PriceDetailsUiState(TextUIState.ChaloTextUIState chaloTextUIState, List fareBreakupList, FareLineUiState totalFare, ProductBannerUIState productBannerUIState) {
        PriceDetailsUiSpec priceDetailsUiSpec = new PriceDetailsUiSpec();
        DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
        Intrinsics.i(fareBreakupList, "fareBreakupList");
        Intrinsics.i(totalFare, "totalFare");
        this.f5481a = priceDetailsUiSpec;
        this.b = chaloTextUIState;
        this.c = fareBreakupList;
        this.d = totalFare;
        this.e = dividerUIState;
        this.f = productBannerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDetailsUiState)) {
            return false;
        }
        PriceDetailsUiState priceDetailsUiState = (PriceDetailsUiState) obj;
        return Intrinsics.d(this.f5481a, priceDetailsUiState.f5481a) && Intrinsics.d(this.b, priceDetailsUiState.b) && Intrinsics.d(this.c, priceDetailsUiState.c) && Intrinsics.d(this.d, priceDetailsUiState.d) && Intrinsics.d(this.e, priceDetailsUiState.e) && Intrinsics.d(this.f, priceDetailsUiState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + r30.b(r30.f(this.b, this.f5481a.hashCode() * 31, 31), 31, this.c)) * 31;
        DividerUIState dividerUIState = this.e;
        int iHashCode2 = (iHashCode + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31;
        ProductBannerUIState productBannerUIState = this.f;
        return iHashCode2 + (productBannerUIState != null ? productBannerUIState.hashCode() : 0);
    }

    public final String toString() {
        return "PriceDetailsUiState(uiSpec=" + this.f5481a + ", title=" + this.b + ", fareBreakupList=" + this.c + ", totalFare=" + this.d + ", totalFareDivider=" + this.e + ", savingsBanner=" + this.f + ")";
    }
}
