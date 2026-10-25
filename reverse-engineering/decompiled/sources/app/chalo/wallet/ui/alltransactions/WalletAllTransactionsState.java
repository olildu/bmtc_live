package app.chalo.wallet.ui.alltransactions;

import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import defpackage.n21;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletAllTransactionsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10822a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final WalletTypeIdentifier f;
    public final boolean g;
    public final boolean h;

    public WalletAllTransactionsState(List allTransactions, List wrapperList, boolean z, boolean z2, boolean z3, WalletTypeIdentifier walletTypeIdentifier, boolean z4, boolean z5) {
        Intrinsics.i(allTransactions, "allTransactions");
        Intrinsics.i(wrapperList, "wrapperList");
        this.f10822a = allTransactions;
        this.b = wrapperList;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = walletTypeIdentifier;
        this.g = z4;
        this.h = z5;
    }

    public static WalletAllTransactionsState a(WalletAllTransactionsState walletAllTransactionsState, List list, List list2, boolean z, boolean z2, WalletTypeIdentifier walletTypeIdentifier, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            list = walletAllTransactionsState.f10822a;
        }
        List allTransactions = list;
        if ((i & 2) != 0) {
            list2 = walletAllTransactionsState.b;
        }
        List wrapperList = list2;
        boolean z5 = (i & 4) != 0 ? walletAllTransactionsState.c : false;
        if ((i & 8) != 0) {
            z = walletAllTransactionsState.d;
        }
        boolean z6 = z;
        if ((i & 16) != 0) {
            z2 = walletAllTransactionsState.e;
        }
        boolean z7 = z2;
        if ((i & 32) != 0) {
            walletTypeIdentifier = walletAllTransactionsState.f;
        }
        WalletTypeIdentifier walletTypeIdentifier2 = walletTypeIdentifier;
        if ((i & 64) != 0) {
            z3 = walletAllTransactionsState.g;
        }
        boolean z8 = z3;
        boolean z9 = (i & 128) != 0 ? walletAllTransactionsState.h : z4;
        walletAllTransactionsState.getClass();
        Intrinsics.i(allTransactions, "allTransactions");
        Intrinsics.i(wrapperList, "wrapperList");
        return new WalletAllTransactionsState(allTransactions, wrapperList, z5, z6, z7, walletTypeIdentifier2, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAllTransactionsState)) {
            return false;
        }
        WalletAllTransactionsState walletAllTransactionsState = (WalletAllTransactionsState) obj;
        return Intrinsics.d(this.f10822a, walletAllTransactionsState.f10822a) && Intrinsics.d(this.b, walletAllTransactionsState.b) && this.c == walletAllTransactionsState.c && this.d == walletAllTransactionsState.d && this.e == walletAllTransactionsState.e && Intrinsics.d(this.f, walletAllTransactionsState.f) && this.g == walletAllTransactionsState.g && this.h == walletAllTransactionsState.h;
    }

    public final int hashCode() {
        int iB = (((((r30.b(this.f10822a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31;
        WalletTypeIdentifier walletTypeIdentifier = this.f;
        return ((((iB + (walletTypeIdentifier == null ? 0 : walletTypeIdentifier.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletAllTransactionsState(allTransactions=");
        sb.append(this.f10822a);
        sb.append(", wrapperList=");
        sb.append(this.b);
        sb.append(", isLoading=");
        z40.r(sb, this.c, ", isListEmpty=", this.d, ", onlyShowQuickPayTransactions=");
        sb.append(this.e);
        sb.append(", walletTypeIdentifier=");
        sb.append(this.f);
        sb.append(", showContactSupportDialog=");
        return n21.h(sb, this.g, ", isWalletClosedLoopType=", this.h, ")");
    }
}
