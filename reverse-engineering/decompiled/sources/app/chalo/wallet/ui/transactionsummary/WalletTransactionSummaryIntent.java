package app.chalo.wallet.ui.transactionsummary;

import app.chalo.wallet.ui.transactionsummary.model.WalletTransactionSummaryNavigationModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryIntent;", "", "LoadTransactionDetailsAndReclaimDuration", "ViewReceiptClicked", "Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryIntent$LoadTransactionDetailsAndReclaimDuration;", "Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryIntent$ViewReceiptClicked;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletTransactionSummaryIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryIntent$LoadTransactionDetailsAndReclaimDuration;", "Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadTransactionDetailsAndReclaimDuration extends WalletTransactionSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10893a;
        public final WalletTransactionSummaryNavigationModel b;

        public LoadTransactionDetailsAndReclaimDuration(String str, WalletTransactionSummaryNavigationModel walletTransactionSummaryNavigationModel) {
            this.f10893a = str;
            this.b = walletTransactionSummaryNavigationModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadTransactionDetailsAndReclaimDuration)) {
                return false;
            }
            LoadTransactionDetailsAndReclaimDuration loadTransactionDetailsAndReclaimDuration = (LoadTransactionDetailsAndReclaimDuration) obj;
            return Intrinsics.d(this.f10893a, loadTransactionDetailsAndReclaimDuration.f10893a) && Intrinsics.d(this.b, loadTransactionDetailsAndReclaimDuration.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10893a.hashCode() * 31);
        }

        public final String toString() {
            return "LoadTransactionDetailsAndReclaimDuration(userId=" + this.f10893a + ", transaction=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryIntent$ViewReceiptClicked;", "Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewReceiptClicked extends WalletTransactionSummaryIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewReceiptClicked f10894a = new ViewReceiptClicked();
    }
}
