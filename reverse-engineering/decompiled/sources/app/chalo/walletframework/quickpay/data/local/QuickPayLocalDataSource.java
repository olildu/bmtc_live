package app.chalo.walletframework.quickpay.data.local;

import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/local/QuickPayLocalDataSource;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface QuickPayLocalDataSource {
    Flow a();

    Object b(QuickPayReceipt quickPayReceipt, Continuation continuation);

    Flow c(String str, String str2);

    Flow d(String str);

    Object e(Continuation continuation);

    Flow f(String str);

    Object g(Continuation continuation);

    Flow h(long j);

    Object i(List list, Continuation continuation);

    Object j(String str, Continuation continuation);

    Object k(List list, Continuation continuation);

    Object l(Continuation continuation);

    Object m(QuickPayEntity quickPayEntity, Continuation continuation);

    Object n(String str, String str2, ContinuationImpl continuationImpl);

    Object o(String str, ContinuationImpl continuationImpl);
}
