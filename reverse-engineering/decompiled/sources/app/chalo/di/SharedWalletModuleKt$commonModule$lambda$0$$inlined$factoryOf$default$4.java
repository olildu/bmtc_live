package app.chalo.di;

import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.wallet.domain.GetLoadMoneyDenominationsUseCase;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4 implements Function2<Scope, ParametersHolder, GetLoadMoneyDenominationsUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        return new GetLoadMoneyDenominationsUseCase((WalletRepository) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", WalletRepository.class), null, null), (GetWalletSetupConfigurationUseCase) scope.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null));
    }
}
