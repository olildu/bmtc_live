package app.chalo.walletframework.wallet.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/CachedWalletStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "FULL_KYC_NEEDED", "BLOCKED_FOR_BACKEND_RECLAIM", "BLOCKED_USER", "BLOCKED_FOR_APP_RECLAIM", "WALLET_TIMED_OUT", "KYC_INITIATED", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum CachedWalletStatus {
    ACTIVE,
    FULL_KYC_NEEDED,
    BLOCKED_FOR_BACKEND_RECLAIM,
    BLOCKED_USER,
    BLOCKED_FOR_APP_RECLAIM,
    WALLET_TIMED_OUT,
    KYC_INITIATED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    public static EnumEntries<CachedWalletStatus> getEntries() {
        return $ENTRIES;
    }
}
