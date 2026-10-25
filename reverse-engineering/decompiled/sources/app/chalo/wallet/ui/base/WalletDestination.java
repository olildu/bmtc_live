package app.chalo.wallet.ui.base;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lapp/chalo/wallet/ui/base/WalletDestination;", "", "<init>", "(Ljava/lang/String;I)V", "WalletBalance", "QuickPay", "TransactionSummary", "WalletLoadMoney", "AllTransactions", "PayForTicket", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum WalletDestination {
    WalletBalance,
    QuickPay,
    TransactionSummary,
    WalletLoadMoney,
    AllTransactions,
    PayForTicket;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/base/WalletDestination$Companion;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static WalletDestination a(String value) {
            Intrinsics.i(value, "value");
            switch (value.hashCode()) {
                case -1202247549:
                    if (value.equals("WalletBalance")) {
                        return WalletDestination.WalletBalance;
                    }
                    break;
                case -1001778277:
                    if (value.equals("QuickPay")) {
                        return WalletDestination.QuickPay;
                    }
                    break;
                case -625552632:
                    if (value.equals("TransactionSummary")) {
                        return WalletDestination.TransactionSummary;
                    }
                    break;
                case 34498957:
                    if (value.equals("PayForTicket")) {
                        return WalletDestination.PayForTicket;
                    }
                    break;
                case 899315553:
                    if (value.equals("WalletLoadMoney")) {
                        return WalletDestination.WalletLoadMoney;
                    }
                    break;
                case 936551798:
                    if (value.equals("AllTransactions")) {
                        return WalletDestination.AllTransactions;
                    }
                    break;
            }
            throw new IllegalArgumentException();
        }
    }

    public static EnumEntries<WalletDestination> getEntries() {
        return $ENTRIES;
    }
}
