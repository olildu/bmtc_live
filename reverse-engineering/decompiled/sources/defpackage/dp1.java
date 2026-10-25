package defpackage;

import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountDataState;
import app.chalo.wallet.ui.mainbalance.WalletBalanceDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dp1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15484a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    public /* synthetic */ dp1(boolean z, int i, int i2) {
        this.f15484a = i2;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15484a) {
            case 0:
                WalletBalanceDataState state = (WalletBalanceDataState) obj;
                Intrinsics.i(state, "state");
                boolean z = this.b;
                int i = this.c;
                if (!z) {
                    i++;
                }
                return WalletBalanceDataState.a(state, false, null, false, null, null, i % state.f.size(), 0, null, false, false, null, false, null, 16319);
            default:
                WalletLoadBalanceEnterAmountDataState state2 = (WalletLoadBalanceEnterAmountDataState) obj;
                Intrinsics.i(state2, "state");
                boolean z2 = this.b;
                int i2 = this.c;
                if (!z2) {
                    i2++;
                }
                return WalletLoadBalanceEnterAmountDataState.a(state2, false, false, null, null, null, 0L, null, null, null, null, null, null, i2 % state2.h.size(), false, 24575);
        }
    }
}
