package app.chalo.wallet.ui.loadbalancesuccess;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.wallet.loadmoney.WalletLoadMoneyResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs;
import com.arkivanov.decompose.ComponentContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessIntent;", "Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessViewState;", "Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessDataState;", "Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessSideEffect;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletLoadBalanceSuccessComponent extends ChaloBaseStateMviComponent<WalletLoadBalanceSuccessIntent, WalletLoadBalanceSuccessViewState, WalletLoadBalanceSuccessViewState, WalletLoadBalanceSuccessSideEffect> {
    public final WalletLoadBalanceSuccessArgs k;
    public final CurrencyFeature l;
    public final StringProvider m;
    public final ChaloNavigationManager n;
    public final WalletLoadMoneyResultStateManager o;

    public WalletLoadBalanceSuccessComponent(ComponentContext componentContext, WalletLoadBalanceSuccessArgs walletLoadBalanceSuccessArgs, CurrencyFeature currencyFeature, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, WalletLoadMoneyResultStateManager walletLoadMoneyResultStateManager) {
        super(componentContext);
        this.k = walletLoadBalanceSuccessArgs;
        this.l = currencyFeature;
        this.m = stringProvider;
        this.n = chaloNavigationManager;
        this.o = walletLoadMoneyResultStateManager;
        F0(new WalletLoadBalanceSuccessIntent.InitialIntent(walletLoadBalanceSuccessArgs.c));
    }

    public final void F0(WalletLoadBalanceSuccessIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        if (!intent.equals(WalletLoadBalanceSuccessIntent.ExitScreen.f10854a)) {
            if (!(intent instanceof WalletLoadBalanceSuccessIntent.InitialIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(this.j, null, null, new WalletLoadBalanceSuccessComponent$handleInitialIntent$1(this, (WalletLoadBalanceSuccessIntent.InitialIntent) intent, null), 3);
            return;
        }
        WalletLoadBalanceSuccessArgs walletLoadBalanceSuccessArgs = this.k;
        boolean z = walletLoadBalanceSuccessArgs.d;
        ChaloNavigationManager chaloNavigationManager = this.n;
        if (!z) {
            chaloNavigationManager.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Scene(ChaloScenes.WalletLoadMoney, true)));
            return;
        }
        String str = walletLoadBalanceSuccessArgs.e;
        if (str == null) {
            str = "";
        }
        this.o.c(Unit.f17538a, str);
        chaloNavigationManager.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(walletLoadBalanceSuccessArgs)));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (WalletLoadBalanceSuccessViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new WalletLoadBalanceSuccessViewState("");
    }
}
