package app.chalo.checkout.ui.screen.wallet;

import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/wallet/WalletAppsDataState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletAppsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1609a;
    public final List b;

    public WalletAppsDataState(String str, List list) {
        this.f1609a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAppsDataState)) {
            return false;
        }
        WalletAppsDataState walletAppsDataState = (WalletAppsDataState) obj;
        return Intrinsics.d(this.f1609a, walletAppsDataState.f1609a) && Intrinsics.d(this.b, walletAppsDataState.b);
    }

    public final int hashCode() {
        String str = this.f1609a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return nf1.m("WalletAppsDataState(toolbarTitle=", this.f1609a, ", walletAppList=", ")", this.b);
    }
}
