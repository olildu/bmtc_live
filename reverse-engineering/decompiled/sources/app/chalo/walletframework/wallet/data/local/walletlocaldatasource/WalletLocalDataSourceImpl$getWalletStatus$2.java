package app.chalo.walletframework.wallet.data.local.walletlocaldatasource;

import app.chalo.walletframework.wallet.data.repository.dao.WalletDao;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSourceImpl", f = "WalletLocalDataSourceImpl.kt", l = {29}, m = "getWalletStatus", v = 1)
final class WalletLocalDataSourceImpl$getWalletStatus$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLocalDataSourceImpl$getWalletStatus$2(WalletLocalDataSourceImpl walletLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = walletLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WalletLocalDataSourceImpl$getWalletStatus$2 walletLocalDataSourceImpl$getWalletStatus$2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        WalletLocalDataSourceImpl walletLocalDataSourceImpl = this.this$0;
        walletLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            walletLocalDataSourceImpl$getWalletStatus$2 = this;
        } else {
            walletLocalDataSourceImpl$getWalletStatus$2 = new WalletLocalDataSourceImpl$getWalletStatus$2(walletLocalDataSourceImpl, this);
        }
        Object objU = walletLocalDataSourceImpl$getWalletStatus$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletLocalDataSourceImpl$getWalletStatus$2.label;
        if (i2 == 0) {
            ResultKt.b(objU);
            WalletDao walletDao = walletLocalDataSourceImpl.f10954a;
            walletLocalDataSourceImpl$getWalletStatus$2.label = 1;
            objU = walletDao.u(null, null, null, walletLocalDataSourceImpl$getWalletStatus$2);
            if (objU == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objU);
        }
        WalletEntity walletEntity = (WalletEntity) objU;
        if (walletEntity != null) {
            return walletEntity.e;
        }
        return null;
    }
}
