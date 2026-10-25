package app.chalo.walletframework.quickpay.data.repository.dao;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/repository/dao/QuickPayDao;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface QuickPayDao {
    FlowQuery$mapToList$$inlined$map$1 a();

    Object b(QuickPayReceipt quickPayReceipt, Continuation continuation);

    FlowQuery$mapToOneOrNull$$inlined$map$1 c(String str, String str2);

    FlowQuery$mapToList$$inlined$map$1 d(String str);

    Object e(Continuation continuation);

    FlowQuery$mapToOneOrNull$$inlined$map$1 f(String str);

    Object g(Continuation continuation);

    FlowQuery$mapToList$$inlined$map$1 h(long j);

    Object i(List list, Continuation continuation);

    Object j(String str, Continuation continuation);

    Object k(String str, String str2, ContinuationImpl continuationImpl);

    Object l(Continuation continuation);

    void m(List list);

    void n(QuickPayEntity quickPayEntity);

    Object o(String str, ContinuationImpl continuationImpl);
}
