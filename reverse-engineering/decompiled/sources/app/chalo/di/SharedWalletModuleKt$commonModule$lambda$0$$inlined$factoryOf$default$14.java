package app.chalo.di;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.wallet.loadmoney.WalletLoadMoneyResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessComponent;
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
public final class SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14 implements Function2<Scope, ParametersHolder, WalletLoadBalanceSuccessComponent> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null);
        Object objD2 = scope.d(Reflection.a(WalletLoadBalanceSuccessArgs.class), null, null);
        Object objD3 = scope.d(Reflection.a(CurrencyFeature.class), null, null);
        Object objD4 = scope.d(Reflection.a(StringProvider.class), null, null);
        return new WalletLoadBalanceSuccessComponent((ComponentContext) objD, (WalletLoadBalanceSuccessArgs) objD2, (CurrencyFeature) objD3, (StringProvider) objD4, (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (WalletLoadMoneyResultStateManager) scope.d(Reflection.a(WalletLoadMoneyResultStateManager.class), null, null));
    }
}
