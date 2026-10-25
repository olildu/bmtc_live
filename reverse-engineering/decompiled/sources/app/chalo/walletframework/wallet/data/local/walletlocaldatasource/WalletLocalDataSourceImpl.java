package app.chalo.walletframework.wallet.data.local.walletlocaldatasource;

import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest;
import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.NoWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.repository.dao.WalletDao;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletlocaldatasource/WalletLocalDataSourceImpl;", "Lapp/chalo/walletframework/wallet/data/local/walletlocaldatasource/WalletLocalDataSource;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletLocalDataSourceImpl implements WalletLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletDao f10954a;
    public final WalletEncryptedSharedPrefs b;

    public WalletLocalDataSourceImpl(WalletDao walletDao, WalletEncryptedSharedPrefs walletEncryptedSharedPrefs) {
        this.f10954a = walletDao;
        this.b = walletEncryptedSharedPrefs;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object A(ContinuationImpl continuationImpl) {
        return this.f10954a.j(continuationImpl);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 B(String str) {
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f10954a.h(str));
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 C() {
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f10954a.f());
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object D(String str, String str2, Continuation continuation) {
        this.b.e(-1L, str, str2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 E(String userId, String walletId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f10954a.o(userId, walletId));
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object F(String str, String str2, Continuation continuation) {
        this.b.g(-1L, str, str2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object G(int i, Continuation continuation) {
        return this.f10954a.v(i, continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object H(String str, String str2, Continuation continuation) {
        Object objK = this.f10954a.k(str, str2, continuation);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object I(Continuation continuation) {
        return this.f10954a.g(continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object a(WalletTransactionEntity walletTransactionEntity, int i, ContinuationImpl continuationImpl) {
        Object objA = this.f10954a.a(walletTransactionEntity, i, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object b(Continuation continuation) {
        Object objB = this.f10954a.b(continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object c(String str, String str2, CachedWalletStatus cachedWalletStatus, Continuation continuation) {
        Object objC = this.f10954a.c(str, str2, cachedWalletStatus, continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object d(Continuation continuation) {
        Object objD = this.f10954a.d(continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object e(Continuation continuation) {
        Object objE = this.f10954a.e(continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object i(NoWalletStatus noWalletStatus, Continuation continuation) {
        this.b.d(noWalletStatus);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object j(String str, String str2, long j, ContinuationImpl continuationImpl) {
        WalletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1 walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1;
        if (continuationImpl instanceof WalletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1) {
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1 = (WalletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1) continuationImpl;
            int i = walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1 = new WalletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1(this, continuationImpl);
            }
        } else {
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1 = new WalletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1(this, continuationImpl);
        }
        Object objA = walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.label;
        WalletEncryptedSharedPrefs walletEncryptedSharedPrefs = this.b;
        Object obj2 = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.L$0 = str;
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.L$1 = str2;
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.J$0 = j;
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.label = 1;
            objA = walletEncryptedSharedPrefs.a(str, str2);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return obj2;
        }
        j = walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.J$0;
        str2 = (String) walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.L$1;
        str = (String) walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.L$0;
        ResultKt.b(objA);
        if (((Number) objA).longValue() == -1) {
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.L$0 = null;
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.L$1 = null;
            walletLocalDataSourceImpl$saveWalletOldestCachedAtTimeStampForUserIfRequired$1.label = 2;
            walletEncryptedSharedPrefs.e(j, str, str2);
            if (obj2 == obj) {
                return obj;
            }
        }
        return obj2;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object k(String str, String str2, long j, ContinuationImpl continuationImpl) {
        this.b.g(j, str, str2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object l(String str, Continuation continuation) {
        return this.f10954a.l(str, continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object m(String str, String str2, Continuation continuation) {
        return this.f10954a.m(str, str2, continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Flow n(String userId, WalletType type, String str) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(type, "type");
        return this.f10954a.n(userId, type, str);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object o(String str, String str2, ContinuationImpl continuationImpl) {
        return this.b.a(str, str2);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object p(String str, String str2, Continuation continuation) {
        return this.f10954a.p(str, str2, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object q(NoWalletStatusRequest noWalletStatusRequest, ContinuationImpl continuationImpl) {
        WalletLocalDataSourceImpl$getNoWalletStatusAsFlow$1 walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1;
        if (continuationImpl instanceof WalletLocalDataSourceImpl$getNoWalletStatusAsFlow$1) {
            walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1 = (WalletLocalDataSourceImpl$getNoWalletStatusAsFlow$1) continuationImpl;
            int i = walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1 = new WalletLocalDataSourceImpl$getNoWalletStatusAsFlow$1(this, continuationImpl);
            }
        } else {
            walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1 = new WalletLocalDataSourceImpl$getNoWalletStatusAsFlow$1(this, continuationImpl);
        }
        Object objB = walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            walletLocalDataSourceImpl$getNoWalletStatusAsFlow$1.label = 1;
            objB = this.b.b(noWalletStatusRequest);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(objB);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object r(String str, String str2, ContinuationImpl continuationImpl) {
        return this.f10954a.r(str, str2, continuationImpl);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object s(String str, String str2, Continuation continuation) {
        return this.b.f(str, str2);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object t(NoWalletStatusRequest noWalletStatusRequest, NoWalletStatus noWalletStatus, ContinuationImpl continuationImpl) {
        this.b.c(noWalletStatusRequest, noWalletStatus);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object u(String str, WalletType walletType, String str2, Continuation continuation) {
        return this.f10954a.u(str, walletType, str2, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object v(WalletEntity walletEntity, ContinuationImpl continuationImpl) {
        Object objW = this.f10954a.w(walletEntity, continuationImpl);
        return objW == CoroutineSingletons.COROUTINE_SUSPENDED ? objW : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object w(WalletTransactionEntity walletTransactionEntity, LoadMoneyEntity loadMoneyEntity, Continuation continuation) {
        Object objS = this.f10954a.s(walletTransactionEntity, loadMoneyEntity, continuation);
        return objS == CoroutineSingletons.COROUTINE_SUSPENDED ? objS : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object x(String str, String str2, ContinuationImpl continuationImpl) {
        return this.f10954a.i(str, str2, continuationImpl);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final Object y(WalletEntity walletEntity, ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, ArrayList arrayList4, List list2, ContinuationImpl continuationImpl) {
        Object objQ = this.f10954a.q(walletEntity, arrayList, arrayList2, list, arrayList3, arrayList4, list2, continuationImpl);
        return objQ == CoroutineSingletons.COROUTINE_SUSPENDED ? objQ : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 z() {
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f10954a.t());
    }
}
