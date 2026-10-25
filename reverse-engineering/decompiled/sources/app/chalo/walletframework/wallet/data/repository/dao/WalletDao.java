package app.chalo.walletframework.wallet.data.repository.dao;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/repository/dao/WalletDao;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WalletDao {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object a(WalletTransactionEntity walletTransactionEntity, int i, ContinuationImpl continuationImpl);

    Object b(Continuation continuation);

    Object c(String str, String str2, CachedWalletStatus cachedWalletStatus, Continuation continuation);

    Object d(Continuation continuation);

    Object e(Continuation continuation);

    FlowQuery$mapToList$$inlined$map$1 f();

    Object g(Continuation continuation);

    FlowQuery$mapToList$$inlined$map$1 h(String str);

    Object i(String str, String str2, ContinuationImpl continuationImpl);

    Object j(ContinuationImpl continuationImpl);

    Object k(String str, String str2, Continuation continuation);

    Object l(String str, Continuation continuation);

    Object m(String str, String str2, Continuation continuation);

    FlowQuery$mapToOneOrNull$$inlined$map$1 n(String str, WalletType walletType, String str2);

    FlowQuery$mapToList$$inlined$map$1 o(String str, String str2);

    Object p(String str, String str2, Continuation continuation);

    Object q(WalletEntity walletEntity, ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, ArrayList arrayList4, List list2, ContinuationImpl continuationImpl);

    Object r(String str, String str2, ContinuationImpl continuationImpl);

    Object s(WalletTransactionEntity walletTransactionEntity, LoadMoneyEntity loadMoneyEntity, Continuation continuation);

    FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 t();

    Object u(String str, WalletType walletType, String str2, ContinuationImpl continuationImpl);

    Object v(int i, Continuation continuation);

    Object w(WalletEntity walletEntity, ContinuationImpl continuationImpl);
}
