package app.chalo.premiumbus.ui.productselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/ProductBookingImageLoadingShimmerUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductBookingImageLoadingShimmerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7710a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final ChaloColorToken d;

    public ProductBookingImageLoadingShimmerUiState() {
        float f = ChaloThemeHelper.a().w;
        UIShape.Rectangle pbProductImageShape = UIShape.d;
        Intrinsics.i(pbProductImageShape, "pbProductImageShape");
        this.f7710a = f;
        this.b = pbProductImageShape;
        this.c = ChaloColorToken.ShimmerBackground.f9852a;
        this.d = ChaloColorToken.ShimmerColor.f9853a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBookingImageLoadingShimmerUiState)) {
            return false;
        }
        ProductBookingImageLoadingShimmerUiState productBookingImageLoadingShimmerUiState = (ProductBookingImageLoadingShimmerUiState) obj;
        return Dp.m7283equalsimpl0(this.f7710a, productBookingImageLoadingShimmerUiState.f7710a) && Intrinsics.d(this.b, productBookingImageLoadingShimmerUiState.b) && Intrinsics.d(this.c, productBookingImageLoadingShimmerUiState.c) && Intrinsics.d(this.d, productBookingImageLoadingShimmerUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, pk0.b(this.b, Dp.m7284hashCodeimpl(this.f7710a) * 31, 31), 31);
    }

    public final String toString() {
        return "ProductBookingImageLoadingShimmerUiState(pbProductImageShimmerHeight=" + Dp.m7289toStringimpl(this.f7710a) + ", pbProductImageShape=" + this.b + ", shimmerBackgroundColor=" + this.c + ", shimmerColor=" + this.d + ")";
    }
}
