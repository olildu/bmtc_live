package app.chalo.walletframework.wallet.data.repository;

import app.chalo.features.wallet.WalletSyncRequest;
import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.NoWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletMigrationRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletMigrationRequestApiModel;
import app.chalo.walletframework.wallet.data.model.appmodel.LoadMoneyAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletSyncRequestAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/repository/WalletRepository;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WalletRepository {
    Serializable A(String str, String str2, ContinuationImpl continuationImpl);

    Object B(int i, String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object C(WalletAppModel walletAppModel, List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ContinuationImpl continuationImpl);

    Object D(ContinuationImpl continuationImpl);

    Object E(int i, Continuation continuation);

    Serializable F(String str, ContinuationImpl continuationImpl);

    Object G(String str, String str2, ContinuationImpl continuationImpl);

    Object H(String str, String str2, NoWalletStatusRequest noWalletStatusRequest, ContinuationImpl continuationImpl);

    WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2 I(String str, String str2);

    Object J(String str, String str2, ContinuationImpl continuationImpl);

    Serializable K(String str, String str2, ContinuationImpl continuationImpl);

    Object L(String str, String str2, ContinuationImpl continuationImpl);

    Object a(WalletTransactionEntity walletTransactionEntity, int i, ContinuationImpl continuationImpl);

    Object b(Continuation continuation);

    Object c(String str, String str2, CachedWalletStatus cachedWalletStatus, Continuation continuation);

    Object d(Continuation continuation);

    Object e(Continuation continuation);

    Object f(WalletMigrationRequestApiModel walletMigrationRequestApiModel, ContinuationImpl continuationImpl);

    Object g(ClosedLoopWalletMigrationRequestApiModel closedLoopWalletMigrationRequestApiModel, ContinuationImpl continuationImpl);

    Object h(WalletMigrationRequestApiModel walletMigrationRequestApiModel, ContinuationImpl continuationImpl);

    Object i(NoWalletStatus noWalletStatus, Continuation continuation);

    Object j(String str, String str2, long j, ContinuationImpl continuationImpl);

    Object k(String str, String str2, long j, ContinuationImpl continuationImpl);

    WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$1 l(String str);

    Object m(String str, String str2, String str3, ContinuationImpl continuationImpl);

    Object n(WalletSyncRequestAppModel walletSyncRequestAppModel, WalletSyncRequest walletSyncRequest, ContinuationImpl continuationImpl);

    Object o(String str, String str2, ContinuationImpl continuationImpl);

    Object p(int i, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl);

    Object q(NoWalletStatusRequest noWalletStatusRequest, ContinuationImpl continuationImpl);

    Object r(String str, ContinuationImpl continuationImpl);

    Object s(String str, String str2, Continuation continuation);

    Object t(NoWalletStatusRequest noWalletStatusRequest, NoWalletStatus noWalletStatus, ContinuationImpl continuationImpl);

    Object u(WalletTransactionAppModel walletTransactionAppModel, LoadMoneyAppModel loadMoneyAppModel, Continuation continuation);

    WalletRepositoryImpl$getChaloPayTransactionAppModelListAsFlow$$inlined$map$1 v();

    ChannelFlowTransformLatest w(String str, WalletTypeIdentifier walletTypeIdentifier);

    Object x(String str, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl);

    WalletRepositoryImpl$getWalletAppModelFlow$$inlined$map$1 y(String str, WalletTypeIdentifier walletTypeIdentifier);

    Object z(WalletAppModel walletAppModel, ContinuationImpl continuationImpl);
}
