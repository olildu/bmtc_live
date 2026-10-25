package app.chalo.wallet.ui.access;

import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import defpackage.py;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletAccessState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f10810a;
    public final WalletTypeIdentifier b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final WalletAccessSheet h;
    public final Long i;
    public final String j;
    public final String k;
    public final ProductFlow l;
    public final WalletAutoReclaimStatus m;

    public WalletAccessState(Boolean bool, WalletTypeIdentifier walletTypeIdentifier, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, WalletAccessSheet walletAccessSheet, Long l, String str, String str2, ProductFlow productFlow, WalletAutoReclaimStatus walletAutoReclaimStatus) {
        Intrinsics.i(productFlow, "productFlow");
        Intrinsics.i(walletAutoReclaimStatus, "walletAutoReclaimStatus");
        this.f10810a = bool;
        this.b = walletTypeIdentifier;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = walletAccessSheet;
        this.i = l;
        this.j = str;
        this.k = str2;
        this.l = productFlow;
        this.m = walletAutoReclaimStatus;
    }

    public static WalletAccessState a(WalletAccessState walletAccessState, Boolean bool, WalletTypeIdentifier walletTypeIdentifier, boolean z, boolean z2, WalletAccessSheet walletAccessSheet, ProductFlow productFlow, int i) {
        Boolean bool2 = (i & 1) != 0 ? walletAccessState.f10810a : bool;
        WalletTypeIdentifier walletTypeIdentifier2 = (i & 2) != 0 ? walletAccessState.b : walletTypeIdentifier;
        boolean z3 = walletAccessState.c;
        boolean z4 = (i & 8) != 0 ? walletAccessState.d : false;
        boolean z5 = (i & 16) != 0 ? walletAccessState.e : false;
        boolean z6 = (i & 32) != 0 ? walletAccessState.f : z;
        boolean z7 = (i & 64) != 0 ? walletAccessState.g : z2;
        WalletAccessSheet walletAccessSheet2 = (i & 128) != 0 ? walletAccessState.h : walletAccessSheet;
        Long l = walletAccessState.i;
        String str = walletAccessState.j;
        String str2 = walletAccessState.k;
        ProductFlow productFlow2 = (i & 2048) != 0 ? walletAccessState.l : productFlow;
        WalletAutoReclaimStatus walletAutoReclaimStatus = walletAccessState.m;
        walletAccessState.getClass();
        Intrinsics.i(productFlow2, "productFlow");
        Intrinsics.i(walletAutoReclaimStatus, "walletAutoReclaimStatus");
        return new WalletAccessState(bool2, walletTypeIdentifier2, z3, z4, z5, z6, z7, walletAccessSheet2, l, str, str2, productFlow2, walletAutoReclaimStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAccessState)) {
            return false;
        }
        WalletAccessState walletAccessState = (WalletAccessState) obj;
        return Intrinsics.d(this.f10810a, walletAccessState.f10810a) && Intrinsics.d(this.b, walletAccessState.b) && this.c == walletAccessState.c && this.d == walletAccessState.d && this.e == walletAccessState.e && this.f == walletAccessState.f && this.g == walletAccessState.g && this.h == walletAccessState.h && Intrinsics.d(this.i, walletAccessState.i) && Intrinsics.d(this.j, walletAccessState.j) && Intrinsics.d(this.k, walletAccessState.k) && this.l == walletAccessState.l && Intrinsics.d(this.m, walletAccessState.m);
    }

    public final int hashCode() {
        Boolean bool = this.f10810a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        WalletTypeIdentifier walletTypeIdentifier = this.b;
        int iHashCode2 = (((((((((((iHashCode + (walletTypeIdentifier == null ? 0 : walletTypeIdentifier.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31;
        WalletAccessSheet walletAccessSheet = this.h;
        int iHashCode3 = (iHashCode2 + (walletAccessSheet == null ? 0 : walletAccessSheet.hashCode())) * 31;
        Long l = this.i;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.j;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return this.m.hashCode() + ((this.l.hashCode() + ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletAccessState(isFullScreen=");
        sb.append(this.f10810a);
        sb.append(", walletTypeIdentifier=");
        sb.append(this.b);
        sb.append(", walletActive=");
        z40.r(sb, this.c, ", attemptingLogin=", this.d, ", attemptingKYC=");
        z40.r(sb, this.e, ", refreshingWalletAfterKyc=", this.f, ", loadingWalletStatus=");
        sb.append(this.g);
        sb.append(", showBottomSheet=");
        sb.append(this.h);
        sb.append(", appReclaimCompletionTime=");
        py.t(this.i, ", appReclaimCompletionTimeString=", this.j, ", appReclaimCompletionDateTimeString=", sb);
        sb.append(this.k);
        sb.append(", productFlow=");
        sb.append(this.l);
        sb.append(", walletAutoReclaimStatus=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WalletAccessState(Boolean bool, WalletTypeIdentifier walletTypeIdentifier, WalletAccessSheet walletAccessSheet, Long l, String str, String str2, WalletAutoReclaimStatus walletAutoReclaimStatus, int i) {
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        WalletTypeIdentifier walletTypeIdentifier2 = (i & 2) != 0 ? null : walletTypeIdentifier;
        boolean z = false;
        if ((i & 4) == 0) {
            z = true;
        }
        this(bool2, walletTypeIdentifier2, z, (i & 8) == 0, (i & 16) != 0 ? z : true, false, false, (i & 128) != 0 ? null : walletAccessSheet, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : str2, ProductFlow.WALLET_BALANCE, (i & 4096) != 0 ? WalletAutoReclaimStatus.TransferChaloPay.f10813a : walletAutoReclaimStatus);
    }
}
