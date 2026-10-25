package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchRequest;", "", "ToPassUpsellNudge", "ToFreshPurchase", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchRequest$ToFreshPurchase;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchRequest$ToPassUpsellNudge;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusFareDetailsSwitchRequest {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchRequest$ToFreshPurchase;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchRequest;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToFreshPurchase extends PremiumBusFareDetailsSwitchRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToFreshPurchase f7610a = new ToFreshPurchase();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToFreshPurchase);
        }

        public final int hashCode() {
            return 893851431;
        }

        public final String toString() {
            return "ToFreshPurchase";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchRequest$ToPassUpsellNudge;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchRequest;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToPassUpsellNudge extends PremiumBusFareDetailsSwitchRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusPassUpsellAppModel f7611a;

        public ToPassUpsellNudge(PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel) {
            this.f7611a = premiumBusPassUpsellAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToPassUpsellNudge) && Intrinsics.d(this.f7611a, ((ToPassUpsellNudge) obj).f7611a);
        }

        public final int hashCode() {
            return this.f7611a.hashCode();
        }

        public final String toString() {
            return "ToPassUpsellNudge(passUpsell=" + this.f7611a + ")";
        }
    }
}
