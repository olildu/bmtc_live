package defpackage;

import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsIntent;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsState;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ap1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f696a;
    public final /* synthetic */ WalletAllTransactionsComponent b;

    public /* synthetic */ ap1(WalletAllTransactionsComponent walletAllTransactionsComponent, int i) {
        this.f696a = i;
        this.b = walletAllTransactionsComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f696a) {
            case 0:
                WalletAllTransactionsState currentState = (WalletAllTransactionsState) obj;
                Intrinsics.i(currentState, "currentState");
                WalletAllTransactionsComponent walletAllTransactionsComponent = this.b;
                boolean z = walletAllTransactionsComponent.k.c;
                return WalletAllTransactionsState.a(currentState, null, z ? EmptyList.f17557a : walletAllTransactionsComponent.G0(EmptyList.f17557a), z, z, null, false, false, 225);
            default:
                WalletAllTransactionsIntent it = (WalletAllTransactionsIntent) obj;
                Intrinsics.i(it, "it");
                this.b.H0(it);
                return Unit.f17538a;
        }
    }
}
