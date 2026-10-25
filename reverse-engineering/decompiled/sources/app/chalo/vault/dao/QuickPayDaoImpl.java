package app.chalo.vault.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.Quick_pay_receipt_tableQueries;
import app.chalo.vault.db.ChaloCoreDatabase;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import app.chalo.vault.mapper.QuickPayEntityMapper;
import app.chalo.vault.mapper.QuickPayReceiptMapper;
import app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import defpackage.lu0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/dao/QuickPayDaoImpl;", "Lapp/chalo/walletframework/quickpay/data/repository/dao/QuickPayDao;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayDaoImpl implements QuickPayDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCoreDatabase f10755a;
    public final CoroutineContextProvider b;

    public QuickPayDaoImpl(ChaloCoreDatabase chaloCoreDatabase, CoroutineContextProvider coroutineContextProvider) {
        this.f10755a = chaloCoreDatabase;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final FlowQuery$mapToList$$inlined$map$1 a() {
        return FlowQuery.a(FlowQuery.c(this.f10755a.g().Z(new QuickPayDaoImpl$getAllQuickPaysAsFlow$1(11, QuickPayEntityMapper.f10761a, QuickPayEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final Object b(QuickPayReceipt quickPayReceipt, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new QuickPayDaoImpl$saveQuickPayReceipt$2(this, quickPayReceipt, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 c(String orderId, String transactionId) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        return FlowQuery.b(FlowQuery.c(this.f10755a.g().a0(orderId, transactionId, new QuickPayDaoImpl$getQuickPayAsFlow$1(11, QuickPayEntityMapper.f10761a, QuickPayEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final FlowQuery$mapToList$$inlined$map$1 d(String orderId) {
        Intrinsics.i(orderId, "orderId");
        return FlowQuery.a(FlowQuery.c(this.f10755a.g().c0(orderId, new QuickPayDaoImpl$getQuickPaysForOrderIdAsFlow$1(11, QuickPayEntityMapper.f10761a, QuickPayEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final Object e(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new QuickPayDaoImpl$deleteAllQuickPayReceipts$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 f(String transactionId) {
        Intrinsics.i(transactionId, "transactionId");
        return FlowQuery.b(FlowQuery.c(p().W(transactionId, new QuickPayDaoImpl$getQuickPayReceipt$1(21, QuickPayReceiptMapper.f10762a, QuickPayReceiptMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayReceipt;", 0))), this.b.b());
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final Object g(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new QuickPayDaoImpl$deleteAllQuickPays$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final FlowQuery$mapToList$$inlined$map$1 h(long j) {
        return FlowQuery.a(FlowQuery.c(this.f10755a.g().Y(j, new QuickPayDaoImpl$getActiveQuickPaysAsFlow$1(11, QuickPayEntityMapper.f10761a, QuickPayEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final Object i(List list, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new QuickPayDaoImpl$getQuickPaysForOrderIds$2(this, list, null), continuation);
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final Object j(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new QuickPayDaoImpl$getQuickPaysForOrderId$2(this, str, null), continuation);
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final Object k(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new QuickPayDaoImpl$getQuickPayForOrderIdAndTransactionId$2(this, str, str2, null), continuationImpl);
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final Object l(Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new QuickPayDaoImpl$getAllQuickPays$2(this, null), continuation);
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final void m(List list) throws Throwable {
        p().V(new lu0(23, list, this));
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final void n(QuickPayEntity quickPayEntity) throws Throwable {
        this.f10755a.g().V(new lu0(22, this, quickPayEntity));
    }

    @Override // app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao
    public final Object o(String str, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new QuickPayDaoImpl$getQuickPayForTransactionId$2(this, str, null), continuationImpl);
    }

    public final Quick_pay_receipt_tableQueries p() {
        return this.f10755a.e().getF();
    }
}
