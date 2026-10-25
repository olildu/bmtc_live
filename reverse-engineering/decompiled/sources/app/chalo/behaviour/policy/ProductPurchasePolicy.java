package app.chalo.behaviour.policy;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/behaviour/policy/ProductPurchasePolicy;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductPurchasePolicy {
    public static final ProductPurchasePolicy c = new ProductPurchasePolicy(false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1026a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ProductPurchasePolicy$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductPurchasePolicy(boolean z, boolean z2) {
        this.f1026a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchasePolicy)) {
            return false;
        }
        ProductPurchasePolicy productPurchasePolicy = (ProductPurchasePolicy) obj;
        return this.f1026a == productPurchasePolicy.f1026a && this.b == productPurchasePolicy.b;
    }

    public final int hashCode() {
        return ((this.f1026a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ProductPurchasePolicy(showSuperPassProofOverviewConsentCheckbox=" + this.f1026a + ", hideValidationInfoTextWithExpirationInfo=" + this.b + ")";
    }
}
