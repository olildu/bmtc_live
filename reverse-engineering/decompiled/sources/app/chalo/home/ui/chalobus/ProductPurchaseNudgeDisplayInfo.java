package app.chalo.home.ui.chalobus;

import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUIState;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ProductPurchaseNudgeDisplayInfo;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductPurchaseNudgeDisplayInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3298a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final PricingEngineRuleExpiryBannerUIState h;

    public ProductPurchaseNudgeDisplayInfo(String productName, String productId, String str, String productDesc, String str2, String str3, Long l, PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState) {
        Intrinsics.i(productName, "productName");
        Intrinsics.i(productId, "productId");
        Intrinsics.i(productDesc, "productDesc");
        this.f3298a = productName;
        this.b = productId;
        this.c = str;
        this.d = productDesc;
        this.e = str2;
        this.f = str3;
        this.g = l;
        this.h = pricingEngineRuleExpiryBannerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchaseNudgeDisplayInfo)) {
            return false;
        }
        ProductPurchaseNudgeDisplayInfo productPurchaseNudgeDisplayInfo = (ProductPurchaseNudgeDisplayInfo) obj;
        return Intrinsics.d(this.f3298a, productPurchaseNudgeDisplayInfo.f3298a) && Intrinsics.d(this.b, productPurchaseNudgeDisplayInfo.b) && Intrinsics.d(this.c, productPurchaseNudgeDisplayInfo.c) && Intrinsics.d(this.d, productPurchaseNudgeDisplayInfo.d) && Intrinsics.d(this.e, productPurchaseNudgeDisplayInfo.e) && Intrinsics.d(this.f, productPurchaseNudgeDisplayInfo.f) && Intrinsics.d(this.g, productPurchaseNudgeDisplayInfo.g) && Intrinsics.d(this.h, productPurchaseNudgeDisplayInfo.h);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f3298a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iE2 = nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.g;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState = this.h;
        return iHashCode3 + (pricingEngineRuleExpiryBannerUIState != null ? pricingEngineRuleExpiryBannerUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductPurchaseNudgeDisplayInfo(productName=", this.f3298a, ", productId=", this.b, ", productHighlightCopy=");
        cb0.t(sbE, this.c, ", productDesc=", this.d, ", productImageUrl=");
        cb0.t(sbE, this.e, ", applicableRuleCopy=", this.f, ", expiryAt=");
        sbE.append(this.g);
        sbE.append(", expiryBannerUIState=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
