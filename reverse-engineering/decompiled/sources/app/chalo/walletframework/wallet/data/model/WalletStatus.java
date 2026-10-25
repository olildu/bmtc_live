package app.chalo.walletframework.wallet.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/WalletStatus;", "", "<init>", "(Ljava/lang/String;I)V", "USER_NOT_LOGGED_IN", "WALLET_FETCH_PENDING", "DOES_NOT_EXIST", "FULL_KYC_NEEDED", "ACTIVE", "BLOCKED_FOR_BACKEND_RECLAIM", "BLOCKED_USER", "BLOCKED_FOR_APP_RECLAIM", "WALLET_TIMED_OUT", "KYC_INITIATED", "CHALO_TIME_UNAVAILABLE", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum WalletStatus {
    USER_NOT_LOGGED_IN,
    WALLET_FETCH_PENDING,
    DOES_NOT_EXIST,
    FULL_KYC_NEEDED,
    ACTIVE,
    BLOCKED_FOR_BACKEND_RECLAIM,
    BLOCKED_USER,
    BLOCKED_FOR_APP_RECLAIM,
    WALLET_TIMED_OUT,
    KYC_INITIATED,
    CHALO_TIME_UNAVAILABLE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    public static EnumEntries<WalletStatus> getEntries() {
        return $ENTRIES;
    }
}
