package app.chalo.walletframework.wallet.domain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletSaveMode;", "", "<init>", "(Ljava/lang/String;I)V", "MERGE_WITH_CACHED", "NO_CACHED_WALLET", "REPLACEMENT_SNAPSHOT", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
enum WalletSaveMode {
    MERGE_WITH_CACHED,
    NO_CACHED_WALLET,
    REPLACEMENT_SNAPSHOT;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    public static EnumEntries<WalletSaveMode> getEntries() {
        return $ENTRIES;
    }
}
