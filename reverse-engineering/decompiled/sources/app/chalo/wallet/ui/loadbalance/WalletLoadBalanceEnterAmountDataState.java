package app.chalo.wallet.ui.loadbalance;

import app.chalo.walletframework.wallet.domain.model.WalletLoadBalanceConfigAndRechargeOrderCombined;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountDataState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletLoadBalanceEnterAmountDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10830a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List e;
    public final long f;
    public final String g;
    public final List h;
    public final WalletLoadBalanceDialogType i;
    public final String j;
    public final WalletLoadBalanceConfigAndRechargeOrderCombined k;
    public final String l;
    public final int m;
    public final boolean n;

    public WalletLoadBalanceEnterAmountDataState(boolean z, boolean z2, String str, String str2, List suggestedAmountsDenominations, long j, String str3, List promotionCardItems, WalletLoadBalanceDialogType walletLoadBalanceDialogType, String str4, WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined, String str5, int i, boolean z3) {
        Intrinsics.i(suggestedAmountsDenominations, "suggestedAmountsDenominations");
        Intrinsics.i(promotionCardItems, "promotionCardItems");
        this.f10830a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = suggestedAmountsDenominations;
        this.f = j;
        this.g = str3;
        this.h = promotionCardItems;
        this.i = walletLoadBalanceDialogType;
        this.j = str4;
        this.k = walletLoadBalanceConfigAndRechargeOrderCombined;
        this.l = str5;
        this.m = i;
        this.n = z3;
    }

    public static WalletLoadBalanceEnterAmountDataState a(WalletLoadBalanceEnterAmountDataState walletLoadBalanceEnterAmountDataState, boolean z, boolean z2, String str, String str2, ArrayList arrayList, long j, String str3, List list, WalletLoadBalanceDialogType.TncDialog tncDialog, String str4, WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined, String str5, int i, boolean z3, int i2) {
        boolean z4 = (i2 & 1) != 0 ? walletLoadBalanceEnterAmountDataState.f10830a : z;
        boolean z5 = (i2 & 2) != 0 ? walletLoadBalanceEnterAmountDataState.b : z2;
        String str6 = (i2 & 4) != 0 ? walletLoadBalanceEnterAmountDataState.c : str;
        String str7 = (i2 & 8) != 0 ? walletLoadBalanceEnterAmountDataState.d : str2;
        List suggestedAmountsDenominations = (i2 & 16) != 0 ? walletLoadBalanceEnterAmountDataState.e : arrayList;
        walletLoadBalanceEnterAmountDataState.getClass();
        long j2 = (i2 & 64) != 0 ? walletLoadBalanceEnterAmountDataState.f : j;
        String currentRemainingBalanceInCurrency = (i2 & 128) != 0 ? walletLoadBalanceEnterAmountDataState.g : str3;
        List promotionCardItems = (i2 & 256) != 0 ? walletLoadBalanceEnterAmountDataState.h : list;
        WalletLoadBalanceDialogType walletLoadBalanceDialogType = (i2 & 512) != 0 ? walletLoadBalanceEnterAmountDataState.i : tncDialog;
        String str8 = (i2 & 1024) != 0 ? walletLoadBalanceEnterAmountDataState.j : str4;
        WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined2 = (i2 & 2048) != 0 ? walletLoadBalanceEnterAmountDataState.k : walletLoadBalanceConfigAndRechargeOrderCombined;
        String currencySymbol = (i2 & 4096) != 0 ? walletLoadBalanceEnterAmountDataState.l : str5;
        int i3 = (i2 & 8192) != 0 ? walletLoadBalanceEnterAmountDataState.m : i;
        boolean z6 = (i2 & 16384) != 0 ? walletLoadBalanceEnterAmountDataState.n : z3;
        walletLoadBalanceEnterAmountDataState.getClass();
        Intrinsics.i(suggestedAmountsDenominations, "suggestedAmountsDenominations");
        Intrinsics.i(currentRemainingBalanceInCurrency, "currentRemainingBalanceInCurrency");
        Intrinsics.i(promotionCardItems, "promotionCardItems");
        Intrinsics.i(currencySymbol, "currencySymbol");
        return new WalletLoadBalanceEnterAmountDataState(z4, z5, str6, str7, suggestedAmountsDenominations, j2, currentRemainingBalanceInCurrency, promotionCardItems, walletLoadBalanceDialogType, str8, walletLoadBalanceConfigAndRechargeOrderCombined2, currencySymbol, i3, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadBalanceEnterAmountDataState)) {
            return false;
        }
        WalletLoadBalanceEnterAmountDataState walletLoadBalanceEnterAmountDataState = (WalletLoadBalanceEnterAmountDataState) obj;
        return this.f10830a == walletLoadBalanceEnterAmountDataState.f10830a && this.b == walletLoadBalanceEnterAmountDataState.b && Intrinsics.d(this.c, walletLoadBalanceEnterAmountDataState.c) && Intrinsics.d(this.d, walletLoadBalanceEnterAmountDataState.d) && Intrinsics.d(this.e, walletLoadBalanceEnterAmountDataState.e) && this.f == walletLoadBalanceEnterAmountDataState.f && this.g.equals(walletLoadBalanceEnterAmountDataState.g) && Intrinsics.d(this.h, walletLoadBalanceEnterAmountDataState.h) && Intrinsics.d(this.i, walletLoadBalanceEnterAmountDataState.i) && Intrinsics.d(this.j, walletLoadBalanceEnterAmountDataState.j) && Intrinsics.d(this.k, walletLoadBalanceEnterAmountDataState.k) && this.l.equals(walletLoadBalanceEnterAmountDataState.l) && this.m == walletLoadBalanceEnterAmountDataState.m && this.n == walletLoadBalanceEnterAmountDataState.n;
    }

    public final int hashCode() {
        int i = (((this.f10830a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.c;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iB = (r30.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e) + ((int) 1000)) * 31;
        long j = this.f;
        int iB2 = r30.b(nf1.e((iB + ((int) (j ^ (j >>> 32)))) * 31, 31, this.g), 31, this.h);
        WalletLoadBalanceDialogType walletLoadBalanceDialogType = this.i;
        int iHashCode2 = (iB2 + (walletLoadBalanceDialogType == null ? 0 : walletLoadBalanceDialogType.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined = this.k;
        return ((nf1.e((iHashCode3 + (walletLoadBalanceConfigAndRechargeOrderCombined != null ? walletLoadBalanceConfigAndRechargeOrderCombined.hashCode() : 0)) * 31, 31, this.l) + this.m) * 31) + (this.n ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("WalletLoadBalanceEnterAmountDataState(isLoading=", ", isAmountValid=", ", currentlyEnteredAmountString=", this.f10830a, this.b);
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
        sbR.append(", walletLoadConfigAndOrderCombined=");
        sbR.append(this.k);
        sbR.append(", currencySymbol=");
        sbR.append(this.l);
        sbR.append(", currentPromotionCardIndex=");
        sbR.append(this.m);
        sbR.append(", isWalletClosedLoopType=");
        sbR.append(this.n);
        sbR.append(")");
        return sbR.toString();
    }
}
