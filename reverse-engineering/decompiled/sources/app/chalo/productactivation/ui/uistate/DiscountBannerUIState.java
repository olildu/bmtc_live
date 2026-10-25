package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/DiscountBannerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DiscountBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscountBannerUISpecs f8069a;
    public final ImageUIState b;
    public final TextUIState.StyledTextUIState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public DiscountBannerUIState(ImageUIState bannerImageUIState, TextUIState.StyledTextUIState styledTextUIState) {
        DiscountBannerUISpecs discountBannerUISpecs = new DiscountBannerUISpecs();
        Intrinsics.i(bannerImageUIState, "bannerImageUIState");
        this.f8069a = discountBannerUISpecs;
        this.b = bannerImageUIState;
        this.c = styledTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountBannerUIState)) {
            return false;
        }
        DiscountBannerUIState discountBannerUIState = (DiscountBannerUIState) obj;
        return Intrinsics.d(this.f8069a, discountBannerUIState.f8069a) && Intrinsics.d(this.b, discountBannerUIState.b) && Intrinsics.d(this.c, discountBannerUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.e(this.b, this.f8069a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DiscountBannerUIState(specs=" + this.f8069a + ", bannerImageUIState=" + this.b + ", bannerTextUIState=" + this.c + ")";
    }
}
