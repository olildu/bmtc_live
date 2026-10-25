package app.chalo.wallet.ui.loadbalancesuccess;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessViewState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletLoadBalanceSuccessViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10857a;

    public WalletLoadBalanceSuccessViewState(String amountInCurrencyString) {
        Intrinsics.i(amountInCurrencyString, "amountInCurrencyString");
        this.f10857a = amountInCurrencyString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletLoadBalanceSuccessViewState) && Intrinsics.d(this.f10857a, ((WalletLoadBalanceSuccessViewState) obj).f10857a);
    }

    public final int hashCode() {
        return this.f10857a.hashCode();
    }

    public final String toString() {
        return vo1.B("WalletLoadBalanceSuccessViewState(amountInCurrencyString=", this.f10857a, ")");
    }
}
