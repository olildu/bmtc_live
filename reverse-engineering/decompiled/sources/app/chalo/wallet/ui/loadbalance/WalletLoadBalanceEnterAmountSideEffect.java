package app.chalo.wallet.ui.loadbalance;

import defpackage.b3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountSideEffect;", "", "SuggestedDenominationClicked", "ScrollBannerSideEffect", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountSideEffect$ScrollBannerSideEffect;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountSideEffect$SuggestedDenominationClicked;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletLoadBalanceEnterAmountSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountSideEffect$ScrollBannerSideEffect;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountSideEffect;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScrollBannerSideEffect extends WalletLoadBalanceEnterAmountSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ScrollBannerSideEffect f10847a = new ScrollBannerSideEffect();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScrollBannerSideEffect);
        }

        public final int hashCode() {
            return 1760320987;
        }

        public final String toString() {
            return "ScrollBannerSideEffect";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountSideEffect$SuggestedDenominationClicked;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountSideEffect;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestedDenominationClicked extends WalletLoadBalanceEnterAmountSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10848a;

        public SuggestedDenominationClicked(int i) {
            this.f10848a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestedDenominationClicked) && this.f10848a == ((SuggestedDenominationClicked) obj).f10848a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF10848a() {
            return this.f10848a;
        }

        public final String toString() {
            return b3.d(this.f10848a, "SuggestedDenominationClicked(clickedAmount=", ")");
        }
    }
}
