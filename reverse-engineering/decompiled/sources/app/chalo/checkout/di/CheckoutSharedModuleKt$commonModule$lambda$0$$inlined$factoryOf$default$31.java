package app.chalo.checkout.di;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
import app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutUpiArgs;
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
public final class CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$31 implements Function2<Scope, ParametersHolder, CheckoutUpiAppsComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", CheckoutUpiArgs.class), null, null);
        Object objD2 = scope.d(Reflection.a(ComponentContext.class), null, null);
        Object objD3 = scope.d(Reflection.a(CheckoutPaymentDataResolver.class), null, null);
        Object objD4 = scope.d(Reflection.a(CommonCheckoutItemUseCase.class), null, null);
        Object objD5 = scope.d(Reflection.a(ICheckoutAnalyticsHelper.class), null, null);
        Object objD6 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        return new CheckoutUpiAppsComponent((CheckoutUpiArgs) objD, (ComponentContext) objD2, (CheckoutPaymentDataResolver) objD3, (CommonCheckoutItemUseCase) objD4, (ICheckoutAnalyticsHelper) objD5, (CurrencyFeature) objD6, (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null));
    }
}
