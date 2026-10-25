package app.chalo.premiumbus.ui.productselection.compose.uistate;

import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUIState;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PBProductCardUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBProductCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PbProductCardUISpecs f7703a;
    public final ImageUrlUIState b;
    public final ProductLabelUiState c;
    public final TitleSubtitleUiState d;
    public final DividerUIState e;
    public final ProductBookingImageLoadingShimmerUiState f;
    public final PbProductItemCardPlanHighlightUIState g;
    public final OfferTagUIState h;
    public final Long i;
    public final PricingEngineRuleExpiryBannerUIState j;
    public final UiEventHandler$Companion$fromLambda$1 k;

    public PBProductCardUiState(ImageUrlUIState imageUrlUIState, ProductLabelUiState productLabelUiState, TitleSubtitleUiState productTitleSubTitle, DividerUIState dividerUIState, PbProductItemCardPlanHighlightUIState pbProductItemCardPlanHighlightUIState, OfferTagUIState offerTagUIState, Long l, PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        PbProductCardUISpecs pbProductCardUISpecs = new PbProductCardUISpecs();
        ProductBookingImageLoadingShimmerUiState productBookingImageLoadingShimmerUiState = new ProductBookingImageLoadingShimmerUiState();
        Intrinsics.i(productTitleSubTitle, "productTitleSubTitle");
        Intrinsics.i(pbProductItemCardPlanHighlightUIState, "pbProductItemCardPlanHighlightUIState");
        this.f7703a = pbProductCardUISpecs;
        this.b = imageUrlUIState;
        this.c = productLabelUiState;
        this.d = productTitleSubTitle;
        this.e = dividerUIState;
        this.f = productBookingImageLoadingShimmerUiState;
        this.g = pbProductItemCardPlanHighlightUIState;
        this.h = offerTagUIState;
        this.i = l;
        this.j = pricingEngineRuleExpiryBannerUIState;
        this.k = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBProductCardUiState)) {
            return false;
        }
        PBProductCardUiState pBProductCardUiState = (PBProductCardUiState) obj;
        return Intrinsics.d(this.f7703a, pBProductCardUiState.f7703a) && Intrinsics.d(this.b, pBProductCardUiState.b) && Intrinsics.d(this.c, pBProductCardUiState.c) && Intrinsics.d(this.d, pBProductCardUiState.d) && Intrinsics.d(this.e, pBProductCardUiState.e) && Intrinsics.d(this.f, pBProductCardUiState.f) && Intrinsics.d(this.g, pBProductCardUiState.g) && Intrinsics.d(this.h, pBProductCardUiState.h) && Intrinsics.d(this.i, pBProductCardUiState.i) && Intrinsics.d(this.j, pBProductCardUiState.j) && Intrinsics.d(this.k, pBProductCardUiState.k);
    }

    public final int hashCode() {
        int iHashCode = this.f7703a.hashCode() * 31;
        ImageUrlUIState imageUrlUIState = this.b;
        int iHashCode2 = (iHashCode + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31;
        ProductLabelUiState productLabelUiState = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (productLabelUiState == null ? 0 : productLabelUiState.hashCode())) * 31)) * 31;
        DividerUIState dividerUIState = this.e;
        int iHashCode4 = (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31)) * 31)) * 31;
        OfferTagUIState offerTagUIState = this.h;
        int iHashCode5 = (iHashCode4 + (offerTagUIState == null ? 0 : offerTagUIState.hashCode())) * 31;
        Long l = this.i;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState = this.j;
        return this.k.hashCode() + ((iHashCode6 + (pricingEngineRuleExpiryBannerUIState != null ? pricingEngineRuleExpiryBannerUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBProductCardUiState(specs=");
        sb.append(this.f7703a);
        sb.append(", productCardImageUrlUIState=");
        sb.append(this.b);
        sb.append(", productLabel=");
        sb.append(this.c);
        sb.append(", productTitleSubTitle=");
        sb.append(this.d);
        sb.append(", productInfoAndPriceDividerUiState=");
        sb.append(this.e);
        sb.append(", productBookingImageLoadingShimmerUiState=");
        sb.append(this.f);
        sb.append(", pbProductItemCardPlanHighlightUIState=");
        sb.append(this.g);
        sb.append(", offerTagUIState=");
        sb.append(this.h);
        sb.append(", expiryAt=");
        sb.append(this.i);
        sb.append(", expiryBannerUIState=");
        sb.append(this.j);
        sb.append(", uiEventHandler=");
        return nf1.n(sb, this.k, ")");
    }
}
