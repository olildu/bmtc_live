package app.chalo.walletframework.di;

import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3 implements Function2<Scope, ParametersHolder, GetAllQuickPaysUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", QuickPayRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(GetWalletStatusWithoutSyncUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD4 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        return new GetAllQuickPaysUseCase((QuickPayRepository) objD, (GetWalletStatusWithoutSyncUseCase) objD2, (BasicInfoContract) objD3, (CoroutineContextProvider) objD4, (WalletRepository) scope.d(Reflection.a(WalletRepository.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
    }
}
