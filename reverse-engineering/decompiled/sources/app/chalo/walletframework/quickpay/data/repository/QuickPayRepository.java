package app.chalo.walletframework.quickpay.data.repository;

import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/repository/QuickPayRepository;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface QuickPayRepository {
    QuickPayRepositoryImpl$getAllQuickPaysAsFlow$$inlined$map$1 a();

    Object b(QuickPayReceipt quickPayReceipt, Continuation continuation);

    QuickPayRepositoryImpl$getQuickPayAsFlow$$inlined$map$1 c(String str, String str2);

    QuickPayRepositoryImpl$getQuickPaysForOrderIdAsFlow$$inlined$map$1 d(String str);

    Object e(Continuation continuation);

    Flow f(String str);

    Object g(Continuation continuation);

    Object h(String str, ContinuationImpl continuationImpl);

    Object i(String str, ContinuationImpl continuationImpl);

    Serializable j(String str, ContinuationImpl continuationImpl);

    Object k(List list, Continuation continuation);

    Object l(ContinuationImpl continuationImpl);

    Serializable m(ArrayList arrayList, ContinuationImpl continuationImpl);

    Object n(QuickPayAppModel quickPayAppModel, Continuation continuation);

    Serializable o(String str, ContinuationImpl continuationImpl);

    Object p(String str, String str2, ContinuationImpl continuationImpl);

    Object q(String str, ContinuationImpl continuationImpl);
}
