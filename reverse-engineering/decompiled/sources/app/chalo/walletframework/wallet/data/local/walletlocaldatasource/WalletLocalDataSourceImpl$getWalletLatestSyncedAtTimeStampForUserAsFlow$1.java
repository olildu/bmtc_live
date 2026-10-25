package app.chalo.walletframework.wallet.data.local.walletlocaldatasource;

import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSourceImpl", f = "WalletLocalDataSourceImpl.kt", l = {72}, m = "getWalletLatestSyncedAtTimeStampForUserAsFlow", v = 1)
final class WalletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1(WalletLocalDataSourceImpl walletLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = walletLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WalletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1 walletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        WalletLocalDataSourceImpl walletLocalDataSourceImpl = this.this$0;
        walletLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            walletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1 = this;
        } else {
            walletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1 = new WalletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1(walletLocalDataSourceImpl, this);
        }
        Object objF = walletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            WalletEncryptedSharedPrefs walletEncryptedSharedPrefs = walletLocalDataSourceImpl.b;
            walletLocalDataSourceImpl$getWalletLatestSyncedAtTimeStampForUserAsFlow$1.label = 1;
            objF = walletEncryptedSharedPrefs.f(null, null);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(objF);
    }
}
