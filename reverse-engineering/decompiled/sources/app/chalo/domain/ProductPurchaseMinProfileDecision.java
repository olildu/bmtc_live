package app.chalo.domain;

import app.chalo.models.remoteconfig.ProductPurchaseMinProfileUpdateRemoteConfigModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/domain/ProductPurchaseMinProfileDecision;", "", "ProfileDetailsSatisfied", "RuleNotEligible", "RequireProfileDetails", "NotApplicable", "Lapp/chalo/domain/ProductPurchaseMinProfileDecision$NotApplicable;", "Lapp/chalo/domain/ProductPurchaseMinProfileDecision$ProfileDetailsSatisfied;", "Lapp/chalo/domain/ProductPurchaseMinProfileDecision$RequireProfileDetails;", "Lapp/chalo/domain/ProductPurchaseMinProfileDecision$RuleNotEligible;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductPurchaseMinProfileDecision {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/ProductPurchaseMinProfileDecision$NotApplicable;", "Lapp/chalo/domain/ProductPurchaseMinProfileDecision;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotApplicable implements ProductPurchaseMinProfileDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotApplicable f2515a = new NotApplicable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotApplicable);
        }

        public final int hashCode() {
            return 1725892153;
        }

        public final String toString() {
            return "NotApplicable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/ProductPurchaseMinProfileDecision$ProfileDetailsSatisfied;", "Lapp/chalo/domain/ProductPurchaseMinProfileDecision;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfileDetailsSatisfied implements ProductPurchaseMinProfileDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileDetailsSatisfied f2516a = new ProfileDetailsSatisfied();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileDetailsSatisfied);
        }

        public final int hashCode() {
            return 1665550976;
        }

        public final String toString() {
            return "ProfileDetailsSatisfied";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/ProductPurchaseMinProfileDecision$RequireProfileDetails;", "Lapp/chalo/domain/ProductPurchaseMinProfileDecision;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequireProfileDetails implements ProductPurchaseMinProfileDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductPurchaseMinProfileUpdateRemoteConfigModel f2517a;

        public RequireProfileDetails(ProductPurchaseMinProfileUpdateRemoteConfigModel config) {
            Intrinsics.i(config, "config");
            this.f2517a = config;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequireProfileDetails) && Intrinsics.d(this.f2517a, ((RequireProfileDetails) obj).f2517a);
        }

        public final int hashCode() {
            return this.f2517a.hashCode();
        }

        public final String toString() {
            return "RequireProfileDetails(config=" + this.f2517a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/ProductPurchaseMinProfileDecision$RuleNotEligible;", "Lapp/chalo/domain/ProductPurchaseMinProfileDecision;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RuleNotEligible implements ProductPurchaseMinProfileDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RuleNotEligible f2518a = new RuleNotEligible();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RuleNotEligible);
        }

        public final int hashCode() {
            return -1265780011;
        }

        public final String toString() {
            return "RuleNotEligible";
        }
    }
}
