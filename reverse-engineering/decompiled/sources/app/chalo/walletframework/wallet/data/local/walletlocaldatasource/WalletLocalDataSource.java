package app.chalo.walletframework.wallet.data.local.walletlocaldatasource;

import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.NoWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletlocaldatasource/WalletLocalDataSource;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WalletLocalDataSource {
    Object A(ContinuationImpl continuationImpl);

    FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 B(String str);

    FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 C();

    Object D(String str, String str2, Continuation continuation);

    FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 E(String str, String str2);

    Object F(String str, String str2, Continuation continuation);

    Object G(int i, Continuation continuation);

    Object H(String str, String str2, Continuation continuation);

    Object I(Continuation continuation);

    Object a(WalletTransactionEntity walletTransactionEntity, int i, ContinuationImpl continuationImpl);

    Object b(Continuation continuation);

    Object c(String str, String str2, CachedWalletStatus cachedWalletStatus, Continuation continuation);

    Object d(Continuation continuation);

    Object e(Continuation continuation);

    Object i(NoWalletStatus noWalletStatus, Continuation continuation);

    Object j(String str, String str2, long j, ContinuationImpl continuationImpl);

    Object k(String str, String str2, long j, ContinuationImpl continuationImpl);

    Object l(String str, Continuation continuation);

    Object m(String str, String str2, Continuation continuation);

    Flow n(String str, WalletType walletType, String str2);

    Object o(String str, String str2, ContinuationImpl continuationImpl);

    Object p(String str, String str2, Continuation continuation);

    Object q(NoWalletStatusRequest noWalletStatusRequest, ContinuationImpl continuationImpl);

    Object r(String str, String str2, ContinuationImpl continuationImpl);

    Object s(String str, String str2, Continuation continuation);

    Object t(NoWalletStatusRequest noWalletStatusRequest, NoWalletStatus noWalletStatus, ContinuationImpl continuationImpl);

    Object u(String str, WalletType walletType, String str2, Continuation continuation);

    Object v(WalletEntity walletEntity, ContinuationImpl continuationImpl);

    Object w(WalletTransactionEntity walletTransactionEntity, LoadMoneyEntity loadMoneyEntity, Continuation continuation);

    Object x(String str, String str2, ContinuationImpl continuationImpl);

    Object y(WalletEntity walletEntity, ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, ArrayList arrayList4, List list2, ContinuationImpl continuationImpl);

    FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 z();
}
