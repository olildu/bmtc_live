package app.chalo.home.ui.history.uistate.regularbusticket;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/regularbusticket/ProductBannerUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductBannerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductBannerSpec f3519a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final RegularBusTicketCtaUiState d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ProductBannerUiState(ProductBannerSpec spec, TextUIState.ChaloTextUIState bannerText, ImageUIState imageUIState, RegularBusTicketCtaUiState regularBusTicketCtaUiState) {
        Intrinsics.i(spec, "spec");
        Intrinsics.i(bannerText, "bannerText");
        this.f3519a = spec;
        this.b = bannerText;
        this.c = imageUIState;
        this.d = regularBusTicketCtaUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBannerUiState)) {
            return false;
        }
        ProductBannerUiState productBannerUiState = (ProductBannerUiState) obj;
        return Intrinsics.d(this.f3519a, productBannerUiState.f3519a) && Intrinsics.d(this.b, productBannerUiState.b) && Intrinsics.d(this.c, productBannerUiState.c) && Intrinsics.d(this.d, productBannerUiState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f3519a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        int iHashCode = (iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        RegularBusTicketCtaUiState regularBusTicketCtaUiState = this.d;
        return iHashCode + (regularBusTicketCtaUiState != null ? regularBusTicketCtaUiState.hashCode() : 0);
    }

    public final String toString() {
        return "ProductBannerUiState(spec=" + this.f3519a + ", bannerText=" + this.b + ", bannerIcon=" + this.c + ", bannerCta=" + this.d + ")";
    }
}
