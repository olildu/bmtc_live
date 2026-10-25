package app.chalo.checkout.ui.screen.wallet;

import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/wallet/WalletAppsUiSpecs;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletAppsUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f1610a = ChaloColorToken.White.f9870a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletAppsUiSpecs) && Intrinsics.d(this.f1610a, ((WalletAppsUiSpecs) obj).f1610a);
    }

    public final int hashCode() {
        return this.f1610a.hashCode();
    }

    public final String toString() {
        return "WalletAppsUiSpecs(backgroundColor=" + this.f1610a + ")";
    }
}
