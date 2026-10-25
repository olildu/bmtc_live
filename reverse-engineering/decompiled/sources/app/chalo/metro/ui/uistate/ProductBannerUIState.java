package app.chalo.metro.ui.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/uistate/ProductBannerUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductBannerSpec f5557a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ProductBannerUIState(ProductBannerSpec spec, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState) {
        Intrinsics.i(spec, "spec");
        this.f5557a = spec;
        this.b = chaloTextUIState;
        this.c = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBannerUIState)) {
            return false;
        }
        ProductBannerUIState productBannerUIState = (ProductBannerUIState) obj;
        return Intrinsics.d(this.f5557a, productBannerUIState.f5557a) && this.b.equals(productBannerUIState.b) && Intrinsics.d(this.c, productBannerUIState.c);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f5557a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return (iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
    }

    public final String toString() {
        return "ProductBannerUIState(spec=" + this.f5557a + ", bannerText=" + this.b + ", bannerIcon=" + this.c + ", bannerCta=null)";
    }
}
