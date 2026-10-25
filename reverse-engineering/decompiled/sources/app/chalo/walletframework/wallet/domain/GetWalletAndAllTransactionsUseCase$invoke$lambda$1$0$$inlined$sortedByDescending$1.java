package app.chalo.walletframework.wallet.domain;

import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class GetWalletAndAllTransactionsUseCase$invoke$lambda$1$0$$inlined$sortedByDescending$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Long.valueOf(((WalletTransactionAppModel) obj2).h), Long.valueOf(((WalletTransactionAppModel) obj).h));
    }
}
