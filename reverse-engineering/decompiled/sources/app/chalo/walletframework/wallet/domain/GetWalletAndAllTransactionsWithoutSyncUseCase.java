package app.chalo.walletframework.wallet.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactionsFailure;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/GetWalletAndAllTransactionsWithoutSyncUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletAndAllTransactionsWithoutSyncUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11049a;
    public final UserProfileDetailsProvider b;
    public final GetWalletStatusWithoutSyncUseCase c;

    public GetWalletAndAllTransactionsWithoutSyncUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase) {
        this.f11049a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = getWalletStatusWithoutSyncUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$1 getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1;
        WalletTypeIdentifier walletTypeIdentifier2;
        String str;
        if (continuationImpl instanceof GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$1) {
            getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1 = (GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$1) continuationImpl;
            int i = getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1 = new GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1 = new GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strM = this.b.m();
            if (strM == null) {
                return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new ChaloUseCaseResult.Failure(new WalletAndAllTransactionsFailure(new Throwable("User not logged in"))));
            }
            getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.L$0 = walletTypeIdentifier;
            getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.L$1 = strM;
            getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.label = 1;
            Object objA = this.c.a(walletTypeIdentifier, getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            walletTypeIdentifier2 = walletTypeIdentifier;
            str = strM;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.L$1;
            walletTypeIdentifier2 = (WalletTypeIdentifier) getWalletAndAllTransactionsWithoutSyncUseCase$invoke$1.L$0;
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        return ((chaloUseCaseResult instanceof ChaloUseCaseResult.Success) && ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a == WalletStatus.ACTIVE) ? FlowKt.H(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f11049a.y(str, walletTypeIdentifier2)), new GetWalletAndAllTransactionsWithoutSyncUseCase$invoke$$inlined$flatMapLatest$1(null, this, str)) : new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new ChaloUseCaseResult.Failure(new WalletAndAllTransactionsFailure(new Throwable("not active wallet"))));
    }
}
