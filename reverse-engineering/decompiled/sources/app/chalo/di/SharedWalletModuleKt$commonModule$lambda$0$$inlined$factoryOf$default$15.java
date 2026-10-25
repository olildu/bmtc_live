package app.chalo.di;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.quickpay.ui.payforticket.PayForTicketComponent;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
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
public final class SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15 implements Function2<Scope, ParametersHolder, PayForTicketComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(TicketPurchaseArgs.PayForTicketArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(GetWalletSetupConfigurationUseCase.class), null, null);
        Object objD4 = scope.d(Reflection.a(FetchWalletBalanceUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(AnalyticsContract.class), null, null);
        Object objD6 = scope.d(Reflection.a(ChaloNavigationManager.class), null, null);
        Object objD7 = scope.d(Reflection.a(TicketPurchaseSceneResolverUseCase.class), null, null);
        Object objD8 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD9 = scope.d(Reflection.a(CityProvider.class), null, null);
        return new PayForTicketComponent((ComponentContext) objD, (TicketPurchaseArgs.PayForTicketArgs) objD2, (GetWalletSetupConfigurationUseCase) objD3, (FetchWalletBalanceUseCase) objD4, (AnalyticsContract) objD5, (ChaloNavigationManager) objD6, (TicketPurchaseSceneResolverUseCase) objD7, (CurrencyFeature) objD8, (CityProvider) objD9, (GetClusterConfigForCityUseCase) scope.d(Reflection.a(GetClusterConfigForCityUseCase.class), null, null), (WalletResolver) scope.d(Reflection.a(WalletResolver.class), null, null));
    }
}
