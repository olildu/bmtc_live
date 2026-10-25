package app.chalo.wallet.ui.transactionsummary;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletTransactionSummaryState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10895a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final IconType m;
    public final long n;
    public final boolean o;

    public WalletTransactionSummaryState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, IconType walletTransactionStatusForIcon, long j, boolean z5) {
        Intrinsics.i(walletTransactionStatusForIcon, "walletTransactionStatusForIcon");
        this.f10895a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = walletTransactionStatusForIcon;
        this.n = j;
        this.o = z5;
    }

    public static WalletTransactionSummaryState a(WalletTransactionSummaryState walletTransactionSummaryState, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, IconType iconType, long j, boolean z5, int i) {
        String transactionAmount = (i & 1) != 0 ? walletTransactionSummaryState.f10895a : str;
        String transactionDate = (i & 2) != 0 ? walletTransactionSummaryState.b : str2;
        String bookingId = (i & 4) != 0 ? walletTransactionSummaryState.c : str3;
        String transactionId = (i & 8) != 0 ? walletTransactionSummaryState.d : str4;
        String modeOfPayment = (i & 16) != 0 ? walletTransactionSummaryState.e : str5;
        String transactionStatus = (i & 32) != 0 ? walletTransactionSummaryState.f : str6;
        String productName = (i & 64) != 0 ? walletTransactionSummaryState.g : str7;
        String displayBookingId = (i & 128) != 0 ? walletTransactionSummaryState.h : str8;
        boolean z6 = (i & 256) != 0 ? walletTransactionSummaryState.i : z;
        boolean z7 = (i & 512) != 0 ? walletTransactionSummaryState.j : z2;
        boolean z8 = (i & 1024) != 0 ? walletTransactionSummaryState.k : z3;
        boolean z9 = (i & 2048) != 0 ? walletTransactionSummaryState.l : z4;
        IconType walletTransactionStatusForIcon = (i & 4096) != 0 ? walletTransactionSummaryState.m : iconType;
        boolean z10 = z6;
        boolean z11 = z7;
        long j2 = (i & 8192) != 0 ? walletTransactionSummaryState.n : j;
        boolean z12 = (i & 16384) != 0 ? walletTransactionSummaryState.o : z5;
        walletTransactionSummaryState.getClass();
        Intrinsics.i(transactionAmount, "transactionAmount");
        Intrinsics.i(transactionDate, "transactionDate");
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(modeOfPayment, "modeOfPayment");
        Intrinsics.i(transactionStatus, "transactionStatus");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(displayBookingId, "displayBookingId");
        Intrinsics.i(walletTransactionStatusForIcon, "walletTransactionStatusForIcon");
        return new WalletTransactionSummaryState(transactionAmount, transactionDate, bookingId, transactionId, modeOfPayment, transactionStatus, productName, displayBookingId, z10, z11, z8, z9, walletTransactionStatusForIcon, j2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTransactionSummaryState)) {
            return false;
        }
        WalletTransactionSummaryState walletTransactionSummaryState = (WalletTransactionSummaryState) obj;
        return Intrinsics.d(this.f10895a, walletTransactionSummaryState.f10895a) && Intrinsics.d(this.b, walletTransactionSummaryState.b) && Intrinsics.d(this.c, walletTransactionSummaryState.c) && Intrinsics.d(this.d, walletTransactionSummaryState.d) && Intrinsics.d(this.e, walletTransactionSummaryState.e) && Intrinsics.d(this.f, walletTransactionSummaryState.f) && Intrinsics.d(this.g, walletTransactionSummaryState.g) && Intrinsics.d(this.h, walletTransactionSummaryState.h) && this.i == walletTransactionSummaryState.i && this.j == walletTransactionSummaryState.j && this.k == walletTransactionSummaryState.k && this.l == walletTransactionSummaryState.l && this.m == walletTransactionSummaryState.m && this.n == walletTransactionSummaryState.n && this.o == walletTransactionSummaryState.o;
    }

    public final int hashCode() {
        int iHashCode = (this.m.hashCode() + ((((((((nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f10895a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31)) * 31;
        long j = this.n;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.o ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletTransactionSummaryState(transactionAmount=", this.f10895a, ", transactionDate=", this.b, ", bookingId=");
        cb0.t(sbE, this.c, ", transactionId=", this.d, ", modeOfPayment=");
        cb0.t(sbE, this.e, ", transactionStatus=", this.f, ", productName=");
        cb0.t(sbE, this.g, ", displayBookingId=", this.h, ", shouldShowQuickPayProcessingSummaryText=");
        z40.r(sbE, this.i, ", shouldShowModeOfPayment=", this.j, ", shouldShowProductName=");
        z40.r(sbE, this.k, ", shouldShowViewReceipt=", this.l, ", walletTransactionStatusForIcon=");
        sbE.append(this.m);
        sbE.append(", reclaimDuration=");
        sbE.append(this.n);
        sbE.append(", shouldShowYesBankBranding=");
        sbE.append(this.o);
        sbE.append(")");
        return sbE.toString();
    }
}
