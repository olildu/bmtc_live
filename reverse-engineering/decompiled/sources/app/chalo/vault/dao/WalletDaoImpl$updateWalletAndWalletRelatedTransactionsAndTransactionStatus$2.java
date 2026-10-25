package app.chalo.vault.dao;

import app.cash.sqldelight.BaseTransacterImpl;
import app.cash.sqldelight.db.SqlDriver;
import app.chalo.vault.Chalo_pay_tableQueries;
import app.chalo.vault.Quick_pay_tableQueries;
import app.chalo.vault.Wallet_tableQueries;
import app.chalo.vault.Wallet_transaction_tableQueries;
import app.chalo.vault.db.ChaloCoreDatabase;
import app.chalo.vault.mapper.ChaloPayEntityMapperKt;
import app.chalo.vault.mapper.QuickPayEntityMapperKt;
import app.chalo.vault.mapper.WalletEntityMapper;
import app.chalo.vault.mapper.WalletEntityMapperKt;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.repository.entity.ChaloPayEntity;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import app.chalo.walletframework.wallet.data.repository.entity.OrderIdProvider;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import defpackage.bj;
import defpackage.eu0;
import defpackage.hp1;
import defpackage.k2;
import defpackage.kz0;
import defpackage.on;
import defpackage.pn;
import defpackage.v21;
import defpackage.vi1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.WalletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2", f = "WalletDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<ChaloPayEntity> $chaloPayTransactionsList;
    final /* synthetic */ List<String> $finalChaloPayOrderIds;
    final /* synthetic */ List<String> $finalQuickPayOrderIds;
    final /* synthetic */ List<LoadMoneyEntity> $loadMoneyTransactionsList;
    final /* synthetic */ List<QuickPayEntity> $quickPayTransactionsList;
    final /* synthetic */ WalletEntity $walletEntity;
    final /* synthetic */ List<WalletTransactionEntity> $walletTransactionsList;
    int label;
    final /* synthetic */ WalletDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2(WalletDaoImpl walletDaoImpl, WalletEntity walletEntity, List list, List list2, List list3, List list4, List list5, List list6, Continuation continuation) {
        super(1, continuation);
        this.this$0 = walletDaoImpl;
        this.$walletEntity = walletEntity;
        this.$quickPayTransactionsList = list;
        this.$chaloPayTransactionsList = list2;
        this.$walletTransactionsList = list3;
        this.$finalQuickPayOrderIds = list4;
        this.$loadMoneyTransactionsList = list5;
        this.$finalChaloPayOrderIds = list6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2(this.this$0, this.$walletEntity, this.$quickPayTransactionsList, this.$chaloPayTransactionsList, this.$walletTransactionsList, this.$finalQuickPayOrderIds, this.$loadMoneyTransactionsList, this.$finalChaloPayOrderIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        WalletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2 walletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2 = (WalletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        walletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Wallet_tableQueries wallet_tableQueriesZ = this.this$0.z();
        final WalletDaoImpl walletDaoImpl = this.this$0;
        final WalletEntity walletEntity = this.$walletEntity;
        final List<QuickPayEntity> list = this.$quickPayTransactionsList;
        final List<ChaloPayEntity> list2 = this.$chaloPayTransactionsList;
        final List<WalletTransactionEntity> list3 = this.$walletTransactionsList;
        final List<String> list4 = this.$finalQuickPayOrderIds;
        final List<LoadMoneyEntity> list5 = this.$loadMoneyTransactionsList;
        final List<String> list6 = this.$finalChaloPayOrderIds;
        wallet_tableQueriesZ.V(new Function1() { // from class: app.chalo.vault.dao.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                String str;
                WalletDaoImpl walletDaoImpl2 = walletDaoImpl;
                Wallet_tableQueries wallet_tableQueriesZ2 = walletDaoImpl2.z();
                ChaloCoreDatabase chaloCoreDatabase = walletDaoImpl2.f10756a;
                WalletEntity walletEntity2 = walletEntity;
                String str2 = walletEntity2.f11032a;
                String strName = walletEntity2.c.name();
                String lowerCase = walletEntity2.d.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                WalletEntity walletEntity3 = (WalletEntity) wallet_tableQueriesZ2.X(str2, strName, lowerCase, new WalletDaoImpl$updateWalletAndWalletRelatedTransactionsAndTransactionStatus$2$1$walletCachedForSameConfig$1(8, WalletEntityMapper.f10763a, WalletEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;)Lapp/chalo/walletframework/wallet/data/repository/entity/WalletEntity;", 0)).d();
                if (walletEntity3 == null || (str = walletEntity3.b) == null) {
                    str = walletEntity2.b;
                }
                String str3 = str;
                List listB = walletDaoImpl2.A().Z(str2, "QUICK_PAY", str3).b();
                List listB2 = walletDaoImpl2.A().Z(str2, "CHALO_PAY", str3).b();
                walletDaoImpl2.z().Z(WalletEntityMapperKt.a(walletEntity2));
                List list7 = list;
                List list8 = list2;
                List<List> listS = CollectionsKt.S(list7, list8);
                ArrayList arrayList = new ArrayList();
                for (List list9 : listS) {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list9, 10));
                    Iterator it = list9.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((OrderIdProvider) it.next()).getI());
                    }
                    CollectionsKt.i(arrayList2, arrayList);
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    WalletTransactionStatus statusToUpdateTo = WalletTransactionStatus.PROCESSING;
                    WalletTransactionStatus statusToUpdateFrom = WalletTransactionStatus.UNSYNCED;
                    Intrinsics.i(statusToUpdateTo, "statusToUpdateTo");
                    Intrinsics.i(statusToUpdateFrom, "statusToUpdateFrom");
                    Wallet_transaction_tableQueries wallet_transaction_tableQueriesA = walletDaoImpl2.A();
                    String statusToUpdateTo2 = statusToUpdateTo.name();
                    String statusToUpdateFrom2 = statusToUpdateFrom.name();
                    wallet_transaction_tableQueriesA.getClass();
                    Intrinsics.i(statusToUpdateTo2, "statusToUpdateTo");
                    Intrinsics.i(statusToUpdateFrom2, "statusToUpdateFrom");
                    String strS = BaseTransacterImpl.S(arrayList.size());
                    SqlDriver sqlDriver = wallet_transaction_tableQueriesA.f697a;
                    String strY0 = StringsKt.y0("\n        |UPDATE wallet_transaction_table\n        |SET transactionStatus = ?\n        |WHERE transactionStatus = ? AND orderId IN " + strS + "\n        ");
                    arrayList.size();
                    sqlDriver.A0(null, strY0, new vi1(12, statusToUpdateTo2, statusToUpdateFrom2, arrayList));
                    wallet_transaction_tableQueriesA.T(798708622, new hp1(13));
                }
                List walletTransactionsList = list3;
                Intrinsics.i(walletTransactionsList, "walletTransactionsList");
                walletDaoImpl2.A().V(new v21((Object) walletDaoImpl2, (Object) str2, (Object) str3, walletTransactionsList, 9));
                List list10 = list4;
                ArrayList arrayListC0 = CollectionsKt.c0(list10, listB);
                Quick_pay_tableQueries quick_pay_tableQueriesG = chaloCoreDatabase.g();
                List listZ = CollectionsKt.z(arrayListC0);
                if (listZ.isEmpty()) {
                    listZ = null;
                }
                if (listZ != null) {
                    quick_pay_tableQueriesG.X(listZ);
                }
                if (list10.isEmpty()) {
                    Quick_pay_tableQueries quick_pay_tableQueriesG2 = chaloCoreDatabase.g();
                    quick_pay_tableQueriesG2.getClass();
                    quick_pay_tableQueriesG2.f697a.A0(-1007164591, "DELETE FROM quick_pay_table WHERE walletId = ?", new eu0(str3, 18));
                    quick_pay_tableQueriesG2.T(-1007164591, new kz0(24));
                } else {
                    Quick_pay_tableQueries quick_pay_tableQueriesG3 = chaloCoreDatabase.g();
                    List list11 = list10;
                    quick_pay_tableQueriesG3.getClass();
                    String strS2 = BaseTransacterImpl.S(list11.size());
                    SqlDriver sqlDriver2 = quick_pay_tableQueriesG3.f697a;
                    String strY1 = StringsKt.y0("\n        |DELETE FROM quick_pay_table\n        |WHERE orderId NOT IN " + strS2 + "\n        |AND walletId = ?\n        ");
                    list11.size();
                    sqlDriver2.A0(null, strY1, new pn(list11, str3, 1));
                    quick_pay_tableQueriesG3.T(1564697994, new kz0(21));
                }
                Iterator it2 = list7.iterator();
                while (it2.hasNext()) {
                    chaloCoreDatabase.g().f0(QuickPayEntityMapperKt.a((QuickPayEntity) it2.next()));
                }
                List loadMoneyEntityList = list5;
                Intrinsics.i(loadMoneyEntityList, "loadMoneyEntityList");
                walletDaoImpl2.y().V(new vi1(10, walletDaoImpl2, str3, loadMoneyEntityList));
                List list12 = list6;
                ArrayList arrayListC1 = CollectionsKt.c0(list12, listB2);
                Chalo_pay_tableQueries chalo_pay_tableQueriesX = walletDaoImpl2.x();
                List listZ2 = CollectionsKt.z(arrayListC1);
                if (listZ2.isEmpty()) {
                    listZ2 = null;
                }
                if (listZ2 != null) {
                    chalo_pay_tableQueriesX.W(listZ2);
                }
                if (list12.isEmpty()) {
                    Chalo_pay_tableQueries chalo_pay_tableQueriesX2 = walletDaoImpl2.x();
                    chalo_pay_tableQueriesX2.getClass();
                    chalo_pay_tableQueriesX2.f697a.A0(-1429712369, "DELETE FROM chalo_pay_table WHERE walletId = ?", new k2(str3, 11));
                    chalo_pay_tableQueriesX2.T(-1429712369, new on(0));
                } else {
                    Chalo_pay_tableQueries chalo_pay_tableQueriesX3 = walletDaoImpl2.x();
                    List list13 = list12;
                    chalo_pay_tableQueriesX3.getClass();
                    String strS3 = BaseTransacterImpl.S(list13.size());
                    SqlDriver sqlDriver3 = chalo_pay_tableQueriesX3.f697a;
                    String strY2 = StringsKt.y0("\n        |DELETE FROM chalo_pay_table\n        |WHERE orderId NOT IN " + strS3 + "\n        |AND walletId = ?\n        ");
                    list13.size();
                    sqlDriver3.A0(null, strY2, new pn(list13, str3, 0));
                    chalo_pay_tableQueriesX3.T(396931402, new bj(26));
                }
                Iterator it3 = list8.iterator();
                while (it3.hasNext()) {
                    walletDaoImpl2.x().Y(ChaloPayEntityMapperKt.a((ChaloPayEntity) it3.next()));
                }
                return Unit.f17538a;
            }
        });
        return Unit.f17538a;
    }
}
