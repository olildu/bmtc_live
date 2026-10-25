package app.chalo.wallet.ui.mainbalance;

import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "", "ViewCreated", "LoadWalletBalance", "AddMoneyClicked", "SeeAllTransactionsClicked", "TransactionClicked", "BannerTimerIntent", "BannerClickedIntent", "ScrollPromotionBanner", "RequestHistoryButtonClicked", "ContactSupportDialogOkayClicked", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$AddMoneyClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$BannerClickedIntent;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$BannerTimerIntent;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$ContactSupportDialogOkayClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$LoadWalletBalance;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$RequestHistoryButtonClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$ScrollPromotionBanner;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$SeeAllTransactionsClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$TransactionClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$ViewCreated;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletBalanceIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$AddMoneyClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddMoneyClicked extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddMoneyClicked f10862a = new AddMoneyClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddMoneyClicked);
        }

        public final int hashCode() {
            return 1970036973;
        }

        public final String toString() {
            return "AddMoneyClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$BannerClickedIntent;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerClickedIntent extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromotionCardItem f10863a;

        public BannerClickedIntent(PromotionCardItem promotionCardItem) {
            Intrinsics.i(promotionCardItem, "promotionCardItem");
            this.f10863a = promotionCardItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerClickedIntent) && Intrinsics.d(this.f10863a, ((BannerClickedIntent) obj).f10863a);
        }

        public final int hashCode() {
            return this.f10863a.hashCode();
        }

        public final String toString() {
            return "BannerClickedIntent(promotionCardItem=" + this.f10863a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$BannerTimerIntent;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerTimerIntent extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BannerTimerIntent f10864a = new BannerTimerIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BannerTimerIntent);
        }

        public final int hashCode() {
            return -371990374;
        }

        public final String toString() {
            return "BannerTimerIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$ContactSupportDialogOkayClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContactSupportDialogOkayClicked extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactSupportDialogOkayClicked f10865a = new ContactSupportDialogOkayClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContactSupportDialogOkayClicked);
        }

        public final int hashCode() {
            return 1064437921;
        }

        public final String toString() {
            return "ContactSupportDialogOkayClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$LoadWalletBalance;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadWalletBalance extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadWalletBalance f10866a = new LoadWalletBalance();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadWalletBalance);
        }

        public final int hashCode() {
            return -106179966;
        }

        public final String toString() {
            return "LoadWalletBalance";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$RequestHistoryButtonClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestHistoryButtonClicked extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestHistoryButtonClicked f10867a = new RequestHistoryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestHistoryButtonClicked);
        }

        public final int hashCode() {
            return 1008789621;
        }

        public final String toString() {
            return "RequestHistoryButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$ScrollPromotionBanner;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScrollPromotionBanner extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10868a;

        public ScrollPromotionBanner(int i) {
            this.f10868a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollPromotionBanner) && this.f10868a == ((ScrollPromotionBanner) obj).f10868a;
        }

        public final int hashCode() {
            return 38161 + this.f10868a;
        }

        public final String toString() {
            return b3.d(this.f10868a, "ScrollPromotionBanner(isManualScroll=true, currentPage=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$SeeAllTransactionsClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeAllTransactionsClicked extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeAllTransactionsClicked f10869a = new SeeAllTransactionsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeAllTransactionsClicked);
        }

        public final int hashCode() {
            return 1052365321;
        }

        public final String toString() {
            return "SeeAllTransactionsClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$TransactionClicked;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TransactionClicked extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletTransactionUiModel f10870a;

        public TransactionClicked(WalletTransactionUiModel transactionUiModel) {
            Intrinsics.i(transactionUiModel, "transactionUiModel");
            this.f10870a = transactionUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransactionClicked) && Intrinsics.d(this.f10870a, ((TransactionClicked) obj).f10870a);
        }

        public final int hashCode() {
            return this.f10870a.hashCode();
        }

        public final String toString() {
            return "TransactionClicked(transactionUiModel=" + this.f10870a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent$ViewCreated;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreated extends WalletBalanceIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletTypeIdentifier f10871a;

        public ViewCreated(WalletTypeIdentifier walletTypeIdentifier) {
            Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
            this.f10871a = walletTypeIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewCreated) && Intrinsics.d(this.f10871a, ((ViewCreated) obj).f10871a);
        }

        public final int hashCode() {
            return this.f10871a.hashCode();
        }

        public final String toString() {
            return "ViewCreated(walletTypeIdentifier=" + this.f10871a + ")";
        }
    }
}
