package app.chalo.checkout.di;

import app.chalo.checkout.data.repository.ICheckoutRepository;
import app.chalo.checkout.domain.MakeChaloWalletPaymentUseCase;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
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
public final class CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16 implements Function2<Scope, ParametersHolder, MakeChaloWalletPaymentUseCase> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", WalletRepository.class), null, null);
        Object objD2 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD3 = scope.d(Reflection.a(ICheckoutRepository.class), null, null);
        Object objD4 = scope.d(Reflection.a(CityProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD6 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        return new MakeChaloWalletPaymentUseCase((WalletRepository) objD, (UserProfileDetailsProvider) objD2, (ICheckoutRepository) objD3, (CityProvider) objD4, (StringProvider) objD5, (BasicInfoContract) objD6, (WalletSyncOrchestrator) scope.d(Reflection.a(WalletSyncOrchestrator.class), null, null), (WalletResolver) scope.d(Reflection.a(WalletResolver.class), null, null));
    }
}
