package app.chalo.checkout.di;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
import app.chalo.checkout.domain.checkoutitem.GetChaloPayCheckoutItemUseCase;
import app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutWalletArgs;
import app.chalo.walletframework.chalopay.ChaloPayManager;
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
public final class CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$26 implements Function2<Scope, ParametersHolder, CheckoutWalletAppsComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(CheckoutWalletArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(CheckoutPaymentDataResolver.class), null, null);
        Object objD4 = scope.d(Reflection.a(CommonCheckoutItemUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(ICheckoutAnalyticsHelper.class), null, null);
        Object objD6 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD7 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD8 = scope.d(Reflection.a(StringProvider.class), null, null);
        Object objD9 = scope.d(Reflection.a(WalletRepository.class), null, null);
        Object objD10 = scope.d(Reflection.a(ChaloPayManager.class), null, null);
        Object objD11 = scope.d(Reflection.a(WalletResolver.class), null, null);
        Object objD12 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        return new CheckoutWalletAppsComponent((ComponentContext) objD, (CheckoutWalletArgs) objD2, (CheckoutPaymentDataResolver) objD3, (CommonCheckoutItemUseCase) objD4, (ICheckoutAnalyticsHelper) objD5, (CurrencyFeature) objD6, (UserProfileDetailsProvider) objD7, (StringProvider) objD8, (WalletRepository) objD9, (ChaloPayManager) objD10, (WalletResolver) objD11, (CoroutineContextProvider) objD12, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (GetChaloPayCheckoutItemUseCase) scope.d(Reflection.a(GetChaloPayCheckoutItemUseCase.class), null, null));
    }
}
