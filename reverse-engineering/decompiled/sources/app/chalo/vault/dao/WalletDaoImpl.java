package app.chalo.vault.dao;

import app.cash.sqldelight.QueryKt;
import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.Chalo_pay_tableQueries;
import app.chalo.vault.Load_money_tableQueries;
import app.chalo.vault.Wallet_tableQueries;
import app.chalo.vault.Wallet_transaction_tableQueries;
import app.chalo.vault.db.ChaloCoreDatabase;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import app.chalo.vault.mapper.ChaloPayEntityMapper;
import app.chalo.vault.mapper.WalletEntityMapper;
import app.chalo.vault.mapper.WalletTransactionEntityMapper;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.repository.dao.WalletDao;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import defpackage.nn;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/dao/WalletDaoImpl;", "Lapp/chalo/walletframework/wallet/data/repository/dao/WalletDao;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletDaoImpl implements WalletDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCoreDatabase f10756a;
    public final CoroutineContextProvider b;

    public WalletDaoImpl(ChaloCoreDatabase chaloCoreDatabase, CoroutineContextProvider coroutineContextProvider) {
        this.f10756a = chaloCoreDatabase;
        this.b = coroutineContextProvider;
    }

    public final Wallet_transaction_tableQueries A() {
        return this.f10756a.e().getI();
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object a(WalletTransactionEntity walletTransactionEntity, int i, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$insertWalletTransactionAndUpdateBalance$2(this, walletTransactionEntity, i, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object b(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$deleteAllChaloPayTransactions$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object c(String str, String str2, CachedWalletStatus cachedWalletStatus, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$updateCachedWalletStatus$2(this, cachedWalletStatus, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object d(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$deleteAllWalletTransactions$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object e(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$deleteAllLoadMoneyTransactions$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final FlowQuery$mapToList$$inlined$map$1 f() {
        Chalo_pay_tableQueries chalo_pay_tableQueriesX = x();
        WalletDaoImpl$getAllChaloPayTransactionsFlow$1 walletDaoImpl$getAllChaloPayTransactionsFlow$1 = new WalletDaoImpl$getAllChaloPayTransactionsFlow$1(8, ChaloPayEntityMapper.f10759a, ChaloPayEntityMapper.class, "mapper", "mapper(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/walletframework/wallet/data/repository/entity/ChaloPayEntity;", 0);
        chalo_pay_tableQueriesX.getClass();
        return FlowQuery.a(FlowQuery.c(QueryKt.a(-1267071702, new String[]{"chalo_pay_table"}, chalo_pay_tableQueriesX.f697a, "chalo_pay_table.sq", "getAllChaloPayTransactions", "SELECT chalo_pay_table.orderId, chalo_pay_table.amount, chalo_pay_table.transactionId, chalo_pay_table.transactionTime, chalo_pay_table.status, chalo_pay_table.productType, chalo_pay_table.productName, chalo_pay_table.walletId FROM chalo_pay_table", new nn(walletDaoImpl$getAllChaloPayTransactionsFlow$1, 1))), this.b.b());
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object g(Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getWalletTransaction$2(this, null, null, null), continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final FlowQuery$mapToList$$inlined$map$1 h(String str) {
        return FlowQuery.a(FlowQuery.c(A().X(str, new WalletDaoImpl$getAllWalletTransactionsFlow$1(8, WalletTransactionEntityMapper.f10764a, WalletTransactionEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lapp/chalo/walletframework/wallet/data/repository/entity/WalletTransactionEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object i(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getAllWalletTransactions$4(this, str, str2, null), continuationImpl);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object j(ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getAllWalletTransactions$2(this, null, null), continuationImpl);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object k(String str, String str2, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$deleteWalletEntity$2(this, str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object l(String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getAllWalletsForUser$2(this, str, null), continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object m(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getChaloPayData$2(this, str, str2, null), continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final FlowQuery$mapToOneOrNull$$inlined$map$1 n(String userId, WalletType type, String str) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(type, "type");
        Wallet_tableQueries wallet_tableQueriesZ = z();
        String strName = type.name();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return FlowQuery.b(FlowQuery.c(wallet_tableQueriesZ.X(userId, strName, lowerCase, new WalletDaoImpl$getWalletForUserAndTypeAndAgencyAsFlow$1(8, WalletEntityMapper.f10763a, WalletEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;)Lapp/chalo/walletframework/wallet/data/repository/entity/WalletEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final FlowQuery$mapToList$$inlined$map$1 o(String userId, String walletId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        return FlowQuery.a(FlowQuery.c(A().Y(userId, walletId, new WalletDaoImpl$getAllWalletTransactionsFlow$2(8, WalletTransactionEntityMapper.f10764a, WalletTransactionEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lapp/chalo/walletframework/wallet/data/repository/entity/WalletTransactionEntity;", 0))), this.b.b());
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object p(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getLoadMoneyData$2(this, str, str2, null), continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object q(WalletEntity walletEntity, ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, ArrayList arrayList4, List list2, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2(this, walletEntity, arrayList2, arrayList4, arrayList, list, arrayList3, list2, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object r(String str, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getWalletForUserAndWalletId$2(this, str, str2, null), continuationImpl);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object s(WalletTransactionEntity walletTransactionEntity, LoadMoneyEntity loadMoneyEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$insertWalletTransactionAndLoadMoney$2(this, walletTransactionEntity, loadMoneyEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 t() {
        Intrinsics.i(null, "userId");
        Intrinsics.i(null, "transactionId");
        A().a0(null, null, new WalletDaoImpl$getWalletTransactionAsFlow$1(8, WalletTransactionEntityMapper.f10764a, WalletTransactionEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lapp/chalo/walletframework/wallet/data/repository/entity/WalletTransactionEntity;", 0));
        throw null;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object u(String str, WalletType walletType, String str2, ContinuationImpl continuationImpl) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getWalletForUserAndTypeAndAgency$2(this, str, walletType, str2, null), continuationImpl);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object v(int i, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$getListOfLastXNumberOfDistinctLoadMoneyAmounts$2(this, i, null), continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.dao.WalletDao
    public final Object w(WalletEntity walletEntity, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new WalletDaoImpl$insertWalletEntity$2(this, walletEntity, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    public final Chalo_pay_tableQueries x() {
        return this.f10756a.e().getB();
    }

    public final Load_money_tableQueries y() {
        return this.f10756a.e().getE();
    }

    public final Wallet_tableQueries z() {
        return this.f10756a.e().getH();
    }
}
