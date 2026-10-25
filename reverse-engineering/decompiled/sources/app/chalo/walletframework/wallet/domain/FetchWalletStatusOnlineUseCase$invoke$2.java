package app.chalo.walletframework.wallet.domain;

import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletStatusKt;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.wallet.domain.FetchWalletStatusOnlineUseCase", f = "FetchWalletStatusOnlineUseCase.kt", l = {27}, m = "invoke", v = 1)
final class FetchWalletStatusOnlineUseCase$invoke$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchWalletStatusOnlineUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchWalletStatusOnlineUseCase$invoke$2(FetchWalletStatusOnlineUseCase fetchWalletStatusOnlineUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = fetchWalletStatusOnlineUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FetchWalletStatusOnlineUseCase$invoke$2 fetchWalletStatusOnlineUseCase$invoke$2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        FetchWalletStatusOnlineUseCase fetchWalletStatusOnlineUseCase = this.this$0;
        fetchWalletStatusOnlineUseCase.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            fetchWalletStatusOnlineUseCase$invoke$2 = this;
        } else {
            fetchWalletStatusOnlineUseCase$invoke$2 = new FetchWalletStatusOnlineUseCase$invoke$2(fetchWalletStatusOnlineUseCase, this);
        }
        Object objD = fetchWalletStatusOnlineUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchWalletStatusOnlineUseCase$invoke$2.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            WalletSyncOrchestrator walletSyncOrchestrator = fetchWalletStatusOnlineUseCase.f11041a;
            fetchWalletStatusOnlineUseCase$invoke$2.label = 1;
            objD = walletSyncOrchestrator.d(null, true, fetchWalletStatusOnlineUseCase$invoke$2);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objD;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return new ChaloUseCaseResult.Failure(((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a);
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ChaloUseCaseResult.Success(WalletStatusKt.b(((WalletAndAllTransactions) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f11093a.getC()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
