package app.chalo.vault.mapper;

import app.chalo.vault.Wallet_transaction_table;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"vault_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletTransactionEntityMapperKt {
    public static final Wallet_transaction_table a(WalletTransactionEntity walletTransactionEntity) {
        Intrinsics.i(walletTransactionEntity, "<this>");
        return new Wallet_transaction_table(walletTransactionEntity.f, walletTransactionEntity.h, walletTransactionEntity.f11033a, walletTransactionEntity.b.name(), walletTransactionEntity.c, walletTransactionEntity.d, walletTransactionEntity.e, walletTransactionEntity.g.name());
    }
}
