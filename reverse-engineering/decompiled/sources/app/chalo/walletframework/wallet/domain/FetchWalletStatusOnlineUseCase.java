package app.chalo.walletframework.wallet.domain;

import app.chalo.features.wallet.WalletSyncRequest;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletStatusKt;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/FetchWalletStatusOnlineUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchWalletStatusOnlineUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletSyncOrchestrator f11041a;

    public FetchWalletStatusOnlineUseCase(WalletSyncOrchestrator walletSyncOrchestrator) {
        this.f11041a = walletSyncOrchestrator;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WalletSyncRequest.SemiClosed semiClosed, ContinuationImpl continuationImpl) {
        FetchWalletStatusOnlineUseCase$invoke$1 fetchWalletStatusOnlineUseCase$invoke$1;
        if (continuationImpl instanceof FetchWalletStatusOnlineUseCase$invoke$1) {
            fetchWalletStatusOnlineUseCase$invoke$1 = (FetchWalletStatusOnlineUseCase$invoke$1) continuationImpl;
            int i = fetchWalletStatusOnlineUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchWalletStatusOnlineUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchWalletStatusOnlineUseCase$invoke$1 = new FetchWalletStatusOnlineUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchWalletStatusOnlineUseCase$invoke$1 = new FetchWalletStatusOnlineUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = fetchWalletStatusOnlineUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchWalletStatusOnlineUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            fetchWalletStatusOnlineUseCase$invoke$1.label = 1;
            objB = this.f11041a.b(semiClosed, fetchWalletStatusOnlineUseCase$invoke$1, true);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return new ChaloUseCaseResult.Failure(((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a);
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ChaloUseCaseResult.Success(WalletStatusKt.b(((WalletAndAllTransactions) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f11093a.getC()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
