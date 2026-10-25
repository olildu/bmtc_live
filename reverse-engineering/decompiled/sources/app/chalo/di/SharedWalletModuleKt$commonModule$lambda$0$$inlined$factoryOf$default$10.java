package app.chalo.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
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
public final class SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10 implements Function2<Scope, ParametersHolder, WalletAllTransactionsComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(WalletAllTransactionsArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(WalletRepository.class), null, null);
        Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD6 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD7 = scope.d(Reflection.a(TimeUtilsContract.class), null, null);
        Object objD8 = scope.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null);
        Object objD9 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        return new WalletAllTransactionsComponent((ComponentContext) objD, (WalletAllTransactionsArgs) objD2, (WalletRepository) objD3, (StringProvider) objD4, (AnalyticsContract) objD5, (CurrencyFeature) objD6, (TimeUtilsContract) objD7, (GetWalletSetupConfigurationUseCase) objD8, (ChaloNavigationManager) objD9, (WalletResolver) scope.d(Reflection.a(WalletResolver.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null));
    }
}
