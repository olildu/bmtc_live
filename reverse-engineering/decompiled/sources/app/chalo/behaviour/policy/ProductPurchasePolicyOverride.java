package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/ProductPurchasePolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductPurchasePolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1027a;
    public final Boolean b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/ProductPurchasePolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/ProductPurchasePolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductPurchasePolicyOverride> serializer() {
            return ProductPurchasePolicyOverride$$serializer.f1028a;
        }
    }

    public ProductPurchasePolicyOverride() {
        Boolean bool = Boolean.TRUE;
        this.f1027a = bool;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchasePolicyOverride)) {
            return false;
        }
        ProductPurchasePolicyOverride productPurchasePolicyOverride = (ProductPurchasePolicyOverride) obj;
        return Intrinsics.d(this.f1027a, productPurchasePolicyOverride.f1027a) && Intrinsics.d(this.b, productPurchasePolicyOverride.b);
    }

    public final int hashCode() {
        Boolean bool = this.f1027a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "ProductPurchasePolicyOverride(showSuperPassProofOverviewConsentCheckbox=" + this.f1027a + ", hideValidationInfoTextWithExpirationInfo=" + this.b + ")";
    }

    public /* synthetic */ ProductPurchasePolicyOverride(Boolean bool, Boolean bool2, int i) {
        if ((i & 1) == 0) {
            this.f1027a = null;
        } else {
            this.f1027a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
    }
}
