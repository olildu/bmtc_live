package app.chalo.walletframework.wallet.domain;

import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/GetWalletIdUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletResolver f11054a;

    public GetWalletIdUseCase(WalletResolver walletResolver) {
        this.f11054a = walletResolver;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        GetWalletIdUseCase$invoke$1 getWalletIdUseCase$invoke$1;
        WalletAppModel walletAppModel;
        if (continuationImpl instanceof GetWalletIdUseCase$invoke$1) {
            getWalletIdUseCase$invoke$1 = (GetWalletIdUseCase$invoke$1) continuationImpl;
            int i = getWalletIdUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getWalletIdUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getWalletIdUseCase$invoke$1 = new GetWalletIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getWalletIdUseCase$invoke$1 = new GetWalletIdUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = getWalletIdUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getWalletIdUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            getWalletIdUseCase$invoke$1.label = 1;
            objE = this.f11054a.e(walletTypeIdentifier, getWalletIdUseCase$invoke$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objE;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            walletAppModel = (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            walletAppModel = null;
        }
        if (walletAppModel != null) {
            return walletAppModel.getF11008a();
        }
        return null;
    }
}
