package app.chalo.walletframework.wallet.data.remote;

import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletMigrationRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletRegisterRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletSyncHistoryRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletMigrationRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletRechargeOrderRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletSyncHistoryRequestApiModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/remote/WalletRemoteDataSource;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WalletRemoteDataSource {
    Object f(WalletMigrationRequestApiModel walletMigrationRequestApiModel, ContinuationImpl continuationImpl);

    Object g(ClosedLoopWalletMigrationRequestApiModel closedLoopWalletMigrationRequestApiModel, ContinuationImpl continuationImpl);

    Object h(WalletMigrationRequestApiModel walletMigrationRequestApiModel, ContinuationImpl continuationImpl);

    Object i(ClosedLoopWalletSyncHistoryRequestApiModel closedLoopWalletSyncHistoryRequestApiModel, ContinuationImpl continuationImpl);

    Object j(WalletSyncHistoryRequestApiModel walletSyncHistoryRequestApiModel, ContinuationImpl continuationImpl);

    Object k(WalletRechargeOrderRequestApiModel walletRechargeOrderRequestApiModel, ContinuationImpl continuationImpl);

    Object l(ContinuationImpl continuationImpl);

    Object m(ClosedLoopWalletRegisterRequestApiModel closedLoopWalletRegisterRequestApiModel, ContinuationImpl continuationImpl);

    Object n(WalletRechargeOrderRequestApiModel walletRechargeOrderRequestApiModel, ContinuationImpl continuationImpl);

    Object o(String str, ContinuationImpl continuationImpl);
}
