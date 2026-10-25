package app.chalo.vault.mapper;

import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/mapper/WalletTransactionEntityMapper;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletTransactionEntityMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WalletTransactionEntityMapper f10764a = new WalletTransactionEntityMapper();

    public static WalletTransactionEntity a(long j, long j2, String transactionId, String transactionType, String walletId, String userId, String orderId, String transactionStatus) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(transactionType, "transactionType");
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionStatus, "transactionStatus");
        return new WalletTransactionEntity(transactionId, WalletTransactionType.valueOf(transactionType), walletId, userId, orderId, (int) j, WalletTransactionStatus.valueOf(transactionStatus), j2);
    }
}
