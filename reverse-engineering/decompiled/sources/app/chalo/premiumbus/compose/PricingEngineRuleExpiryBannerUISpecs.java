package app.chalo.premiumbus.compose;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import defpackage.pk0;
import defpackage.py;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/compose/PricingEngineRuleExpiryBannerUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PricingEngineRuleExpiryBannerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6944a;
    public final UIShape b;
    public final ChaloPadding c;

    public PricingEngineRuleExpiryBannerUISpecs(List backgroundGradientColor, UIShape backgroundShape, ChaloPadding contentPadding) {
        Intrinsics.i(backgroundGradientColor, "backgroundGradientColor");
        Intrinsics.i(backgroundShape, "backgroundShape");
        Intrinsics.i(contentPadding, "contentPadding");
        this.f6944a = backgroundGradientColor;
        this.b = backgroundShape;
        this.c = contentPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingEngineRuleExpiryBannerUISpecs)) {
            return false;
        }
        PricingEngineRuleExpiryBannerUISpecs pricingEngineRuleExpiryBannerUISpecs = (PricingEngineRuleExpiryBannerUISpecs) obj;
        return Intrinsics.d(this.f6944a, pricingEngineRuleExpiryBannerUISpecs.f6944a) && Intrinsics.d(this.b, pricingEngineRuleExpiryBannerUISpecs.b) && Intrinsics.d(this.c, pricingEngineRuleExpiryBannerUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pk0.b(this.b, this.f6944a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PricingEngineRuleExpiryBannerUISpecs(backgroundGradientColor=");
        sb.append(this.f6944a);
        sb.append(", backgroundShape=");
        sb.append(this.b);
        sb.append(", contentPadding=");
        return py.e(sb, this.c, ")");
    }
}
