package app.chalo.wallet.ui.alltransactions;

import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent;", "", "LoadAllTransactions", "QuickPayTransactions", "SingleTransactionClicked", "RequestHistoryButtonClicked", "ContactSupportDialogOkayClicked", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$ContactSupportDialogOkayClicked;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$LoadAllTransactions;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$QuickPayTransactions;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$RequestHistoryButtonClicked;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$SingleTransactionClicked;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletAllTransactionsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$ContactSupportDialogOkayClicked;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContactSupportDialogOkayClicked extends WalletAllTransactionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactSupportDialogOkayClicked f10817a = new ContactSupportDialogOkayClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContactSupportDialogOkayClicked);
        }

        public final int hashCode() {
            return -807135922;
        }

        public final String toString() {
            return "ContactSupportDialogOkayClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$LoadAllTransactions;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadAllTransactions extends WalletAllTransactionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10818a;
        public final WalletTypeIdentifier b;

        public LoadAllTransactions(String str, WalletTypeIdentifier walletTypeIdentifier) {
            Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
            this.f10818a = str;
            this.b = walletTypeIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadAllTransactions)) {
                return false;
            }
            LoadAllTransactions loadAllTransactions = (LoadAllTransactions) obj;
            return Intrinsics.d(this.f10818a, loadAllTransactions.f10818a) && Intrinsics.d(this.b, loadAllTransactions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10818a.hashCode() * 31);
        }

        public final String toString() {
            return "LoadAllTransactions(userId=" + this.f10818a + ", walletTypeIdentifier=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$QuickPayTransactions;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPayTransactions extends WalletAllTransactionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10819a;
        public final WalletTypeIdentifier b;

        public QuickPayTransactions(String str, WalletTypeIdentifier walletTypeIdentifier) {
            Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
            this.f10819a = str;
            this.b = walletTypeIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPayTransactions)) {
                return false;
            }
            QuickPayTransactions quickPayTransactions = (QuickPayTransactions) obj;
            return Intrinsics.d(this.f10819a, quickPayTransactions.f10819a) && Intrinsics.d(this.b, quickPayTransactions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10819a.hashCode() * 31);
        }

        public final String toString() {
            return "QuickPayTransactions(userId=" + this.f10819a + ", walletTypeIdentifier=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$RequestHistoryButtonClicked;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestHistoryButtonClicked extends WalletAllTransactionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestHistoryButtonClicked f10820a = new RequestHistoryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestHistoryButtonClicked);
        }

        public final int hashCode() {
            return -1060744286;
        }

        public final String toString() {
            return "RequestHistoryButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent$SingleTransactionClicked;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleTransactionClicked extends WalletAllTransactionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletTransactionUiModel f10821a;

        public SingleTransactionClicked(WalletTransactionUiModel transaction) {
            Intrinsics.i(transaction, "transaction");
            this.f10821a = transaction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleTransactionClicked) && Intrinsics.d(this.f10821a, ((SingleTransactionClicked) obj).f10821a);
        }

        public final int hashCode() {
            return this.f10821a.hashCode();
        }

        public final String toString() {
            return "SingleTransactionClicked(transaction=" + this.f10821a + ")";
        }
    }
}
