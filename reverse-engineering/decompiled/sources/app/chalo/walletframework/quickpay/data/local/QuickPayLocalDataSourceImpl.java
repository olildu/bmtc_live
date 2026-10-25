package app.chalo.walletframework.quickpay.data.local;

import app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/local/QuickPayLocalDataSourceImpl;", "Lapp/chalo/walletframework/quickpay/data/local/QuickPayLocalDataSource;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayLocalDataSourceImpl implements QuickPayLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayDao f10914a;

    public QuickPayLocalDataSourceImpl(QuickPayDao quickPayDao) {
        this.f10914a = quickPayDao;
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Flow a() {
        return this.f10914a.a();
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object b(QuickPayReceipt quickPayReceipt, Continuation continuation) {
        Object objB = this.f10914a.b(quickPayReceipt, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Flow c(String orderId, String transactionId) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        return this.f10914a.c(orderId, transactionId);
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Flow d(String orderId) {
        Intrinsics.i(orderId, "orderId");
        return this.f10914a.d(orderId);
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object e(Continuation continuation) {
        Object objE = this.f10914a.e(continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Flow f(String transactionId) {
        Intrinsics.i(transactionId, "transactionId");
        return this.f10914a.f(transactionId);
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object g(Continuation continuation) {
        Object objG = this.f10914a.g(continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Flow h(long j) {
        return this.f10914a.h(j);
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object i(List list, Continuation continuation) {
        return this.f10914a.i(list, continuation);
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object j(String str, Continuation continuation) {
        return this.f10914a.j(str, continuation);
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object k(List list, Continuation continuation) {
        this.f10914a.m(list);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object l(Continuation continuation) {
        return this.f10914a.l(continuation);
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object m(QuickPayEntity quickPayEntity, Continuation continuation) {
        this.f10914a.n(quickPayEntity);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object n(String str, String str2, ContinuationImpl continuationImpl) {
        return this.f10914a.k(str, str2, continuationImpl);
    }

    @Override // app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource
    public final Object o(String str, ContinuationImpl continuationImpl) {
        return this.f10914a.o(str, continuationImpl);
    }
}
