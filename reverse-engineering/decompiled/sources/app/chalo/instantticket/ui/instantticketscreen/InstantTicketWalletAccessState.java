package app.chalo.instantticket.ui.instantticketscreen;

import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import defpackage.b3;
import defpackage.nf1;
import defpackage.t10;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTicketWalletAccessState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletTypeIdentifier f3960a;
    public final boolean b;
    public final boolean c;
    public final WalletSubTextProperties d;
    public final String e;
    public final boolean f;
    public final WalletStatus g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public InstantTicketWalletAccessState(WalletTypeIdentifier walletTypeIdentifier, boolean z, boolean z2, WalletSubTextProperties walletSubTextProperties, String str, boolean z3, WalletStatus walletStatus, String str2, boolean z4, boolean z5, String str3, boolean z6, boolean z7) {
        Intrinsics.i(walletStatus, "walletStatus");
        this.f3960a = walletTypeIdentifier;
        this.b = z;
        this.c = z2;
        this.d = walletSubTextProperties;
        this.e = str;
        this.f = z3;
        this.g = walletStatus;
        this.h = str2;
        this.i = z4;
        this.j = z5;
        this.k = str3;
        this.l = z6;
        this.m = z7;
    }

    public static InstantTicketWalletAccessState a(InstantTicketWalletAccessState instantTicketWalletAccessState, WalletTypeIdentifier walletTypeIdentifier, boolean z, boolean z2, WalletSubTextProperties walletSubTextProperties, String str, boolean z3, WalletStatus walletStatus, String str2, boolean z4, boolean z5, String str3, boolean z6, boolean z7, int i) {
        if ((i & 1) != 0) {
            walletTypeIdentifier = instantTicketWalletAccessState.f3960a;
        }
        WalletTypeIdentifier walletTypeIdentifier2 = walletTypeIdentifier;
        boolean z8 = (i & 2) != 0 ? instantTicketWalletAccessState.b : z;
        boolean z9 = (i & 4) != 0 ? instantTicketWalletAccessState.c : z2;
        WalletSubTextProperties walletSubText = (i & 8) != 0 ? instantTicketWalletAccessState.d : walletSubTextProperties;
        String walletCTAString = (i & 16) != 0 ? instantTicketWalletAccessState.e : str;
        boolean z10 = (i & 32) != 0 ? instantTicketWalletAccessState.f : z3;
        WalletStatus walletStatus2 = (i & 64) != 0 ? instantTicketWalletAccessState.g : walletStatus;
        String amountEnteredInRupee = (i & 128) != 0 ? instantTicketWalletAccessState.h : str2;
        boolean z11 = (i & 256) != 0 ? instantTicketWalletAccessState.i : z4;
        boolean z12 = (i & 512) != 0 ? instantTicketWalletAccessState.j : z5;
        String activationDurationText = (i & 1024) != 0 ? instantTicketWalletAccessState.k : str3;
        boolean z13 = (i & 2048) != 0 ? instantTicketWalletAccessState.l : z6;
        boolean z14 = (i & 4096) != 0 ? instantTicketWalletAccessState.m : z7;
        instantTicketWalletAccessState.getClass();
        Intrinsics.i(walletSubText, "walletSubText");
        Intrinsics.i(walletCTAString, "walletCTAString");
        Intrinsics.i(walletStatus2, "walletStatus");
        Intrinsics.i(amountEnteredInRupee, "amountEnteredInRupee");
        Intrinsics.i(activationDurationText, "activationDurationText");
        return new InstantTicketWalletAccessState(walletTypeIdentifier2, z8, z9, walletSubText, walletCTAString, z10, walletStatus2, amountEnteredInRupee, z11, z12, activationDurationText, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketWalletAccessState)) {
            return false;
        }
        InstantTicketWalletAccessState instantTicketWalletAccessState = (InstantTicketWalletAccessState) obj;
        return Intrinsics.d(this.f3960a, instantTicketWalletAccessState.f3960a) && this.b == instantTicketWalletAccessState.b && this.c == instantTicketWalletAccessState.c && Intrinsics.d(this.d, instantTicketWalletAccessState.d) && Intrinsics.d(this.e, instantTicketWalletAccessState.e) && this.f == instantTicketWalletAccessState.f && this.g == instantTicketWalletAccessState.g && Intrinsics.d(this.h, instantTicketWalletAccessState.h) && this.i == instantTicketWalletAccessState.i && this.j == instantTicketWalletAccessState.j && Intrinsics.d(this.k, instantTicketWalletAccessState.k) && this.l == instantTicketWalletAccessState.l && this.m == instantTicketWalletAccessState.m;
    }

    public final int hashCode() {
        WalletTypeIdentifier walletTypeIdentifier = this.f3960a;
        return ((nf1.e((((nf1.e((this.g.hashCode() + ((nf1.e((this.d.hashCode() + ((((((walletTypeIdentifier == null ? 0 : walletTypeIdentifier.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31)) * 31, 31, this.e) + (this.f ? 1231 : 1237)) * 31)) * 31, 31, this.h) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31, 31, this.k) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantTicketWalletAccessState(walletTypeIdentifier=");
        sb.append(this.f3960a);
        sb.append(", attemptingLogin=");
        sb.append(this.b);
        sb.append(", attemptingKYC=");
        sb.append(this.c);
        sb.append(", walletSubText=");
        sb.append(this.d);
        sb.append(", walletCTAString=");
        t10.s(this.e, ", isWalletBlocked=", ", walletStatus=", sb, this.f);
        sb.append(this.g);
        sb.append(", amountEnteredInRupee=");
        sb.append(this.h);
        sb.append(", attemptingLoadMoney=");
        z40.r(sb, this.i, ", showShimmerLoading=", this.j, ", activationDurationText=");
        t10.s(this.k, ", showPayUsingWallet=", ", showOtherModes=", sb, this.l);
        return b3.g(")", sb, this.m);
    }

    public /* synthetic */ InstantTicketWalletAccessState() {
        this(null, false, false, new WalletSubTextProperties(false, ""), "", false, WalletStatus.DOES_NOT_EXIST, "", false, false, "", false, false);
    }
}
