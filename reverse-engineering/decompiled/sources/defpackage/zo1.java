package defpackage;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.wallet.ui.access.WalletAccessManagerImpl;
import app.chalo.wallet.ui.access.WalletAccessState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zo1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20219a;
    public final /* synthetic */ WalletAccessManagerImpl b;

    public /* synthetic */ zo1(WalletAccessManagerImpl walletAccessManagerImpl, int i) {
        this.f20219a = i;
        this.b = walletAccessManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20219a) {
            case 0:
                WalletAccessManagerImpl walletAccessManagerImpl = this.b;
                ChaloNavigationManager chaloNavigationManager = walletAccessManagerImpl.i;
                WalletAccessState oldState = (WalletAccessState) obj;
                Intrinsics.i(oldState, "oldState");
                if (oldState.d) {
                    gf.u(null, chaloNavigationManager);
                    return WalletAccessState.a(oldState, null, null, false, false, null, null, 8183);
                }
                StateFlow stateFlow = walletAccessManagerImpl.t;
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.WALLET_ACCESS_BASE_FRAGMENT, true), null, null, 6));
                return new WalletAccessState(((WalletAccessState) stateFlow.getValue()).f10810a, ((WalletAccessState) stateFlow.getValue()).b, null, null, null, null, null, 8180);
            default:
                WalletAccessState walletAccessState = (WalletAccessState) obj;
                boolean z = walletAccessState.d;
                WalletAccessManagerImpl walletAccessManagerImpl2 = this.b;
                if (z) {
                    gf.u(null, walletAccessManagerImpl2.i);
                    return WalletAccessState.a(walletAccessState, null, null, false, false, null, null, 8183);
                }
                ChaloNavigationManager chaloNavigationManager2 = walletAccessManagerImpl2.i;
                StateFlow stateFlow2 = walletAccessManagerImpl2.t;
                chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.WALLET_ACCESS_BASE_FRAGMENT, true), null, null, 6));
                return new WalletAccessState(((WalletAccessState) stateFlow2.getValue()).f10810a, ((WalletAccessState) stateFlow2.getValue()).b, null, null, null, null, null, 8180);
        }
    }
}
