package app.chalo.wallet.ui.loadbalance;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountViewState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletLoadBalanceEnterAmountViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10849a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List e;
    public final long f;
    public final String g;
    public final List h;
    public final WalletLoadBalanceDialogType i;
    public final String j;
    public final String k;
    public final int l;
    public final boolean m;

    public WalletLoadBalanceEnterAmountViewState(boolean z, boolean z2, String str, String str2, List suggestedAmountsDenominations, long j, String str3, List promotionCardItems, WalletLoadBalanceDialogType walletLoadBalanceDialogType, String str4, String str5, int i, boolean z3) {
        Intrinsics.i(suggestedAmountsDenominations, "suggestedAmountsDenominations");
        Intrinsics.i(promotionCardItems, "promotionCardItems");
        this.f10849a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = suggestedAmountsDenominations;
        this.f = j;
        this.g = str3;
        this.h = promotionCardItems;
        this.i = walletLoadBalanceDialogType;
        this.j = str4;
        this.k = str5;
        this.l = i;
        this.m = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadBalanceEnterAmountViewState)) {
            return false;
        }
        WalletLoadBalanceEnterAmountViewState walletLoadBalanceEnterAmountViewState = (WalletLoadBalanceEnterAmountViewState) obj;
        return this.f10849a == walletLoadBalanceEnterAmountViewState.f10849a && this.b == walletLoadBalanceEnterAmountViewState.b && Intrinsics.d(this.c, walletLoadBalanceEnterAmountViewState.c) && Intrinsics.d(this.d, walletLoadBalanceEnterAmountViewState.d) && Intrinsics.d(this.e, walletLoadBalanceEnterAmountViewState.e) && this.f == walletLoadBalanceEnterAmountViewState.f && this.g.equals(walletLoadBalanceEnterAmountViewState.g) && Intrinsics.d(this.h, walletLoadBalanceEnterAmountViewState.h) && Intrinsics.d(this.i, walletLoadBalanceEnterAmountViewState.i) && Intrinsics.d(this.j, walletLoadBalanceEnterAmountViewState.j) && this.k.equals(walletLoadBalanceEnterAmountViewState.k) && this.l == walletLoadBalanceEnterAmountViewState.l && this.m == walletLoadBalanceEnterAmountViewState.m;
    }

    public final int hashCode() {
        int i = (((this.f10849a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.c;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iB = (r30.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e) + ((int) 1000)) * 31;
        long j = this.f;
        int iB2 = r30.b(nf1.e((iB + ((int) (j ^ (j >>> 32)))) * 31, 31, this.g), 31, this.h);
        WalletLoadBalanceDialogType walletLoadBalanceDialogType = this.i;
        int iHashCode2 = (iB2 + (walletLoadBalanceDialogType == null ? 0 : walletLoadBalanceDialogType.hashCode())) * 31;
        String str3 = this.j;
        return ((nf1.e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.k) + this.l) * 31) + (this.m ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("WalletLoadBalanceEnterAmountViewState(isLoading=", ", isNextBtnEnabled=", ", currentlyEnteredAmountString=", this.f10849a, this.b);
        cb0.t(sbR, this.c, ", enteredAmountError=", this.d, ", suggestedAmountsDenominations=");
        sbR.append(this.e);
        sbR.append(", minimumRechargeAmount=1000, currentRemainingBalance=");
        sbR.append(this.f);
        sbR.append(", currentRemainingBalanceInCurrency=");
        sbR.append(this.g);
        sbR.append(", promotionCardItems=");
        sbR.append(this.h);
        sbR.append(", dialogType=");
        sbR.append(this.i);
        sbR.append(", snackBarError=");
        sbR.append(this.j);
        sbR.append(", currencySymbol=");
        sbR.append(this.k);
        sbR.append(", currentPromotionCardIndex=");
        sbR.append(this.l);
        sbR.append(", shouldShowYesBankBranding=");
        sbR.append(this.m);
        sbR.append(")");
        return sbR.toString();
    }
}
