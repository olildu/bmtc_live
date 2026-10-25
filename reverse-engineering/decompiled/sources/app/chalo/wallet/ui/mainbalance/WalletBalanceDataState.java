package app.chalo.wallet.ui.mainbalance;

import app.chalo.wallet.ui.access.ProductFlow;
import defpackage.dd;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceDataState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletBalanceDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10861a;
    public final Integer b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final List f;
    public final int g;
    public final int h;
    public final ProductFlow i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final Boolean n;

    public WalletBalanceDataState(boolean z, Integer num, boolean z2, boolean z3, List transactions, List promotionCardItems, int i, int i2, ProductFlow productFlow, boolean z4, boolean z5, String str, boolean z6, Boolean bool) {
        Intrinsics.i(transactions, "transactions");
        Intrinsics.i(promotionCardItems, "promotionCardItems");
        Intrinsics.i(productFlow, "productFlow");
        this.f10861a = z;
        this.b = num;
        this.c = z2;
        this.d = z3;
        this.e = transactions;
        this.f = promotionCardItems;
        this.g = i;
        this.h = i2;
        this.i = productFlow;
        this.j = z4;
        this.k = z5;
        this.l = str;
        this.m = z6;
        this.n = bool;
    }

    public static WalletBalanceDataState a(WalletBalanceDataState walletBalanceDataState, boolean z, Integer num, boolean z2, List list, List list2, int i, int i2, ProductFlow productFlow, boolean z3, boolean z4, String str, boolean z5, Boolean bool, int i3) {
        boolean z6 = (i3 & 1) != 0 ? walletBalanceDataState.f10861a : z;
        Integer num2 = (i3 & 2) != 0 ? walletBalanceDataState.b : num;
        boolean z7 = (i3 & 4) != 0 ? walletBalanceDataState.c : true;
        boolean z8 = (i3 & 8) != 0 ? walletBalanceDataState.d : z2;
        List transactions = (i3 & 16) != 0 ? walletBalanceDataState.e : list;
        List promotionCardItems = (i3 & 32) != 0 ? walletBalanceDataState.f : list2;
        int i4 = (i3 & 64) != 0 ? walletBalanceDataState.g : i;
        int i5 = (i3 & 128) != 0 ? walletBalanceDataState.h : i2;
        ProductFlow productFlow2 = (i3 & 256) != 0 ? walletBalanceDataState.i : productFlow;
        boolean z9 = (i3 & 512) != 0 ? walletBalanceDataState.j : z3;
        boolean z10 = (i3 & 1024) != 0 ? walletBalanceDataState.k : z4;
        String str2 = (i3 & 2048) != 0 ? walletBalanceDataState.l : str;
        boolean z11 = (i3 & 4096) != 0 ? walletBalanceDataState.m : z5;
        Boolean bool2 = (i3 & 8192) != 0 ? walletBalanceDataState.n : bool;
        walletBalanceDataState.getClass();
        Intrinsics.i(transactions, "transactions");
        Intrinsics.i(promotionCardItems, "promotionCardItems");
        Intrinsics.i(productFlow2, "productFlow");
        return new WalletBalanceDataState(z6, num2, z7, z8, transactions, promotionCardItems, i4, i5, productFlow2, z9, z10, str2, z11, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletBalanceDataState)) {
            return false;
        }
        WalletBalanceDataState walletBalanceDataState = (WalletBalanceDataState) obj;
        return this.f10861a == walletBalanceDataState.f10861a && Intrinsics.d(this.b, walletBalanceDataState.b) && this.c == walletBalanceDataState.c && this.d == walletBalanceDataState.d && Intrinsics.d(this.e, walletBalanceDataState.e) && Intrinsics.d(this.f, walletBalanceDataState.f) && this.g == walletBalanceDataState.g && this.h == walletBalanceDataState.h && this.i == walletBalanceDataState.i && this.j == walletBalanceDataState.j && this.k == walletBalanceDataState.k && Intrinsics.d(this.l, walletBalanceDataState.l) && this.m == walletBalanceDataState.m && Intrinsics.d(this.n, walletBalanceDataState.n);
    }

    public final int hashCode() {
        int i = (this.f10861a ? 1231 : 1237) * 31;
        Integer num = this.b;
        int iHashCode = (((((this.i.hashCode() + ((((r30.b(r30.b((((((i + (num == null ? 0 : num.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31, 31, this.e), 31, this.f) + this.g) * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31;
        String str = this.l;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.m ? 1231 : 1237)) * 31;
        Boolean bool = this.n;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletBalanceDataState(isLoading=");
        sb.append(this.f10861a);
        sb.append(", balanceInSubcurrency=");
        sb.append(this.b);
        sb.append(", hasInitializedWallet=");
        z40.r(sb, this.c, ", isWalletActive=", this.d, ", transactions=");
        dd.o(sb, this.e, ", promotionCardItems=", this.f, ", currentPromotionCardIndex=");
        hq0.p(this.g, this.h, ", totalTransactionCount=", ", productFlow=", sb);
        sb.append(this.i);
        sb.append(", isCheckingWalletAccess=");
        sb.append(this.j);
        sb.append(", pendingWalletAccessCheck=");
        pk0.x(", lastError=", this.l, ", showContactSupportDialog=", sb, this.k);
        sb.append(this.m);
        sb.append(", isWalletClosedLoopType=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
