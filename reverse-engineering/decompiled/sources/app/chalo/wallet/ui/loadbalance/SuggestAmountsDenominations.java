package app.chalo.wallet.ui.loadbalance;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/SuggestAmountsDenominations;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuggestAmountsDenominations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10826a;
    public final String b;

    public SuggestAmountsDenominations(int i, String amountInString) {
        Intrinsics.i(amountInString, "amountInString");
        this.f10826a = i;
        this.b = amountInString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestAmountsDenominations)) {
            return false;
        }
        SuggestAmountsDenominations suggestAmountsDenominations = (SuggestAmountsDenominations) obj;
        return this.f10826a == suggestAmountsDenominations.f10826a && Intrinsics.d(this.b, suggestAmountsDenominations.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10826a * 31);
    }

    public final String toString() {
        return hq0.d(this.f10826a, "SuggestAmountsDenominations(amount=", ", amountInString=", this.b, ")");
    }
}
