package app.chalo.walletframework.di;

import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.walletframework.chalopay.ChaloPayManagerImpl;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import app.chalo.walletframework.wallet.domain.RefreshQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.RegisterAndSyncClosedLoopWalletUseCase;
import app.chalo.walletframework.wallet.domain.SatisfiesQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
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
public final class SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$4 implements Function2<Scope, ParametersHolder, ChaloPayManagerImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", StringProvider.class), null, null);
        Object objD2 = scope.d(Reflection.a(SatisfiesQuickPayPrerequisitesUseCase.class), null, null);
        Object objD3 = scope.d(Reflection.a(RefreshQuickPayPrerequisitesUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(GetWalletStatusWithoutSyncUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(WalletSyncOrchestrator.class), null, null);
        Object objD6 = scope.d(Reflection.a(FetchWalletBalanceUseCase.class), null, null);
        return new ChaloPayManagerImpl((StringProvider) objD, (SatisfiesQuickPayPrerequisitesUseCase) objD2, (RefreshQuickPayPrerequisitesUseCase) objD3, (GetWalletStatusWithoutSyncUseCase) objD4, (WalletSyncOrchestrator) objD5, (FetchWalletBalanceUseCase) objD6, (PostDeviceIdForWalletMigrationUseCase) scope.d(Reflection.a(PostDeviceIdForWalletMigrationUseCase.class), null, null), (RegisterAndSyncClosedLoopWalletUseCase) scope.d(Reflection.a(RegisterAndSyncClosedLoopWalletUseCase.class), null, null));
    }
}
