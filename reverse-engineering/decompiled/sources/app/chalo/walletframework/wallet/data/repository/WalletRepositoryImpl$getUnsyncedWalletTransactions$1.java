package app.chalo.walletframework.wallet.data.repository;

import app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource;
import app.chalo.walletframework.wallet.data.mapper.WalletEntityToAppModelMapperKt;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl", f = "WalletRepositoryImpl.kt", l = {277}, m = "getUnsyncedWalletTransactions", v = 1)
final class WalletRepositoryImpl$getUnsyncedWalletTransactions$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletRepositoryImpl$getUnsyncedWalletTransactions$1(WalletRepositoryImpl walletRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = walletRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WalletRepositoryImpl$getUnsyncedWalletTransactions$1 walletRepositoryImpl$getUnsyncedWalletTransactions$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        WalletRepositoryImpl walletRepositoryImpl = this.this$0;
        walletRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            walletRepositoryImpl$getUnsyncedWalletTransactions$1 = this;
        } else {
            walletRepositoryImpl$getUnsyncedWalletTransactions$1 = new WalletRepositoryImpl$getUnsyncedWalletTransactions$1(walletRepositoryImpl, this);
        }
        Object objA = walletRepositoryImpl$getUnsyncedWalletTransactions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getUnsyncedWalletTransactions$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            WalletLocalDataSource walletLocalDataSource = walletRepositoryImpl.f11019a;
            walletRepositoryImpl$getUnsyncedWalletTransactions$1.label = 1;
            objA = walletLocalDataSource.A(walletRepositoryImpl$getUnsyncedWalletTransactions$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objA) {
            if (((WalletTransactionEntity) obj2).g == WalletTransactionStatus.UNSYNCED) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            arrayList2.add(WalletEntityToAppModelMapperKt.b((WalletTransactionEntity) obj3));
        }
        return arrayList2;
    }
}
