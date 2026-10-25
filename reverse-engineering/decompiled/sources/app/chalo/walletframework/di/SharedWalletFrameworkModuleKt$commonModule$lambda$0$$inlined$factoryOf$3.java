package app.chalo.walletframework.di;

import app.chalo.contract.ProductInfoContract;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.walletframework.helper.WalletSyncHelperImpl;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
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
public final class SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$3 implements Function2<Scope, ParametersHolder, WalletSyncHelperImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", GetWalletSetupConfigurationUseCase.class), null, null);
        Object objD2 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD3 = scope.d(Reflection.a(ProductInfoContract.class), null, null);
        return new WalletSyncHelperImpl((GetWalletSetupConfigurationUseCase) objD, (CityProvider) objD2, (ProductInfoContract) objD3, (ApplicationBackgroundWorkersManager) scope.d(Reflection.a(ApplicationBackgroundWorkersManager.class), null, null), (WalletSyncOrchestrator) scope.d(Reflection.a(WalletSyncOrchestrator.class), null, null));
    }
}
