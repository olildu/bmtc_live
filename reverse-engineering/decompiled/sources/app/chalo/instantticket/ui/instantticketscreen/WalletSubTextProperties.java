package app.chalo.instantticket.ui.instantticketscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/WalletSubTextProperties;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletSubTextProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3961a;
    public final String b;

    public WalletSubTextProperties(boolean z, String subtext) {
        Intrinsics.i(subtext, "subtext");
        this.f3961a = z;
        this.b = subtext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSubTextProperties)) {
            return false;
        }
        WalletSubTextProperties walletSubTextProperties = (WalletSubTextProperties) obj;
        return this.f3961a == walletSubTextProperties.f3961a && Intrinsics.d(this.b, walletSubTextProperties.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f3961a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "WalletSubTextProperties(isError=" + this.f3961a + ", subtext=" + this.b + ")";
    }
}
