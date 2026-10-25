package app.chalo.wallet.ui.loadbalance;

import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletLoadBalanceConfigurationAppModel;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import defpackage.b3;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "", "ViewCreated", "AmountEnteredIntent", "NextBtnClickIntent", "SuggestedDenominationClickedIntent", "TnCAcceptClickIntent", "PaymentCompletedIntent", "BannerTimerIntent", "BannerClickedIntent", "DismissDialog", "ScrollPromotionBanner", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$AmountEnteredIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$BannerClickedIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$BannerTimerIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$DismissDialog;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$NextBtnClickIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$PaymentCompletedIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$ScrollPromotionBanner;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$SuggestedDenominationClickedIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$TnCAcceptClickIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$ViewCreated;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletLoadBalanceEnterAmountIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$AmountEnteredIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AmountEnteredIntent extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10831a;

        public AmountEnteredIntent(String enteredAmountString) {
            Intrinsics.i(enteredAmountString, "enteredAmountString");
            this.f10831a = enteredAmountString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountEnteredIntent) && Intrinsics.d(this.f10831a, ((AmountEnteredIntent) obj).f10831a);
        }

        public final int hashCode() {
            return this.f10831a.hashCode();
        }

        public final String toString() {
            return vo1.B("AmountEnteredIntent(enteredAmountString=", this.f10831a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$BannerClickedIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerClickedIntent extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromotionCardItem f10832a;

        public BannerClickedIntent(PromotionCardItem promotionCardItem) {
            Intrinsics.i(promotionCardItem, "promotionCardItem");
            this.f10832a = promotionCardItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerClickedIntent) && Intrinsics.d(this.f10832a, ((BannerClickedIntent) obj).f10832a);
        }

        public final int hashCode() {
            return this.f10832a.hashCode();
        }

        public final String toString() {
            return "BannerClickedIntent(promotionCardItem=" + this.f10832a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$BannerTimerIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerTimerIntent extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BannerTimerIntent f10833a = new BannerTimerIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BannerTimerIntent);
        }

        public final int hashCode() {
            return -3342801;
        }

        public final String toString() {
            return "BannerTimerIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$DismissDialog;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissDialog extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissDialog f10834a = new DismissDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialog);
        }

        public final int hashCode() {
            return 1760845868;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$NextBtnClickIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextBtnClickIntent extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextBtnClickIntent f10835a = new NextBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NextBtnClickIntent);
        }

        public final int hashCode() {
            return 363666593;
        }

        public final String toString() {
            return "NextBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$PaymentCompletedIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentCompletedIntent extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10836a;

        public PaymentCompletedIntent(String str) {
            this.f10836a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentCompletedIntent) && Intrinsics.d(this.f10836a, ((PaymentCompletedIntent) obj).f10836a);
        }

        public final int hashCode() {
            return this.f10836a.hashCode();
        }

        public final String toString() {
            return vo1.B("PaymentCompletedIntent(paymentMode=", this.f10836a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$ScrollPromotionBanner;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScrollPromotionBanner extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10837a;

        public ScrollPromotionBanner(int i) {
            this.f10837a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollPromotionBanner) && this.f10837a == ((ScrollPromotionBanner) obj).f10837a;
        }

        public final int hashCode() {
            return 38161 + this.f10837a;
        }

        public final String toString() {
            return b3.d(this.f10837a, "ScrollPromotionBanner(isManualScroll=true, currentPage=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$SuggestedDenominationClickedIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuggestedDenominationClickedIntent extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10838a;

        public SuggestedDenominationClickedIntent(int i) {
            this.f10838a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestedDenominationClickedIntent) && this.f10838a == ((SuggestedDenominationClickedIntent) obj).f10838a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF10838a() {
            return this.f10838a;
        }

        public final String toString() {
            return b3.d(this.f10838a, "SuggestedDenominationClickedIntent(clickedAmount=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$TnCAcceptClickIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TnCAcceptClickIntent extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletLoadBalanceConfigurationAppModel f10839a;

        public TnCAcceptClickIntent(WalletLoadBalanceConfigurationAppModel config) {
            Intrinsics.i(config, "config");
            this.f10839a = config;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TnCAcceptClickIntent) && Intrinsics.d(this.f10839a, ((TnCAcceptClickIntent) obj).f10839a);
        }

        public final int hashCode() {
            return this.f10839a.hashCode();
        }

        public final String toString() {
            return "TnCAcceptClickIntent(config=" + this.f10839a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent$ViewCreated;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreated extends WalletLoadBalanceEnterAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletTypeIdentifier f10840a;

        public ViewCreated(WalletTypeIdentifier walletTypeIdentifier) {
            Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
            this.f10840a = walletTypeIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewCreated) && Intrinsics.d(this.f10840a, ((ViewCreated) obj).f10840a);
        }

        public final int hashCode() {
            return this.f10840a.hashCode();
        }

        public final String toString() {
            return "ViewCreated(walletTypeIdentifier=" + this.f10840a + ")";
        }
    }
}
