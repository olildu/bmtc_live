package app.chalo.premiumbus.ui.faredetails.contract;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOfferCardUiState;", "", "Coupon", "PassUpsell", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOfferCardUiState$Coupon;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOfferCardUiState$PassUpsell;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusOfferCardUiState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOfferCardUiState$Coupon;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOfferCardUiState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Coupon extends PremiumBusOfferCardUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusCouponCardUiState f7620a;

        public Coupon(PremiumBusCouponCardUiState premiumBusCouponCardUiState) {
            this.f7620a = premiumBusCouponCardUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Coupon) && Intrinsics.d(this.f7620a, ((Coupon) obj).f7620a);
        }

        public final int hashCode() {
            return this.f7620a.hashCode();
        }

        public final String toString() {
            return "Coupon(card=" + this.f7620a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOfferCardUiState$PassUpsell;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusOfferCardUiState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassUpsell extends PremiumBusOfferCardUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PassUpsellOfferCardUiState f7621a;

        public PassUpsell(PassUpsellOfferCardUiState card) {
            Intrinsics.i(card, "card");
            this.f7621a = card;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassUpsell) && Intrinsics.d(this.f7621a, ((PassUpsell) obj).f7621a);
        }

        public final int hashCode() {
            return this.f7621a.hashCode();
        }

        public final String toString() {
            return "PassUpsell(card=" + this.f7621a + ")";
        }
    }
}
