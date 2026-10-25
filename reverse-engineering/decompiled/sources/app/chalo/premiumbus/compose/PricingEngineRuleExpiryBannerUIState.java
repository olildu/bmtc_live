package app.chalo.premiumbus.compose;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/compose/PricingEngineRuleExpiryBannerUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PricingEngineRuleExpiryBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.StyledTextUIState f6945a;
    public final ImageUIState b;
    public final PricingEngineRuleExpiryBannerUISpecs c;

    public PricingEngineRuleExpiryBannerUIState(TextUIState.StyledTextUIState styledTextUIState, ImageUIState imageUIState, PricingEngineRuleExpiryBannerUISpecs pricingEngineRuleExpiryBannerUISpecs) {
        this.f6945a = styledTextUIState;
        this.b = imageUIState;
        this.c = pricingEngineRuleExpiryBannerUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingEngineRuleExpiryBannerUIState)) {
            return false;
        }
        PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState = (PricingEngineRuleExpiryBannerUIState) obj;
        return Intrinsics.d(this.f6945a, pricingEngineRuleExpiryBannerUIState.f6945a) && Intrinsics.d(this.b, pricingEngineRuleExpiryBannerUIState.b) && Intrinsics.d(this.c, pricingEngineRuleExpiryBannerUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.e(this.b, this.f6945a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PricingEngineRuleExpiryBannerUIState(text=" + this.f6945a + ", icon=" + this.b + ", specs=" + this.c + ")";
    }
}
