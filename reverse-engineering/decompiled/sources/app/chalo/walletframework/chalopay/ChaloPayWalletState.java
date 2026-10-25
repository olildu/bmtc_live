package app.chalo.walletframework.chalopay;

import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPayWalletState;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloPayWalletState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f10909a;
    public final Boolean b;
    public final Boolean c;
    public final WalletError d;
    public final Boolean e;
    public final Long f;
    public final WalletStatusForUI g;
    public final WalletCTA h;
    public final WalletTypeIdentifier i;

    public ChaloPayWalletState(Boolean bool, Boolean bool2, Boolean bool3, WalletError walletError, Boolean bool4, Long l, WalletStatusForUI walletStatusForUI, WalletCTA walletCTA, WalletTypeIdentifier walletTypeIdentifier) {
        this.f10909a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = walletError;
        this.e = bool4;
        this.f = l;
        this.g = walletStatusForUI;
        this.h = walletCTA;
        this.i = walletTypeIdentifier;
    }

    public static ChaloPayWalletState a(ChaloPayWalletState chaloPayWalletState, Boolean bool, Boolean bool2, Boolean bool3, WalletError walletError, Boolean bool4, Long l, WalletStatusForUI walletStatusForUI, WalletCTA walletCTA, WalletTypeIdentifier walletTypeIdentifier, int i) {
        if ((i & 1) != 0) {
            bool = chaloPayWalletState.f10909a;
        }
        Boolean bool5 = bool;
        if ((i & 2) != 0) {
            bool2 = chaloPayWalletState.b;
        }
        Boolean bool6 = bool2;
        WalletError walletError2 = (i & 8) != 0 ? chaloPayWalletState.d : walletError;
        Boolean bool7 = (i & 16) != 0 ? chaloPayWalletState.e : bool4;
        Long l2 = (i & 32) != 0 ? chaloPayWalletState.f : l;
        WalletStatusForUI walletStatusForUI2 = (i & 64) != 0 ? chaloPayWalletState.g : walletStatusForUI;
        WalletCTA walletCTA2 = (i & 128) != 0 ? chaloPayWalletState.h : walletCTA;
        WalletTypeIdentifier walletTypeIdentifier2 = (i & 256) != 0 ? chaloPayWalletState.i : walletTypeIdentifier;
        chaloPayWalletState.getClass();
        return new ChaloPayWalletState(bool5, bool6, bool3, walletError2, bool7, l2, walletStatusForUI2, walletCTA2, walletTypeIdentifier2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayWalletState)) {
            return false;
        }
        ChaloPayWalletState chaloPayWalletState = (ChaloPayWalletState) obj;
        return Intrinsics.d(this.f10909a, chaloPayWalletState.f10909a) && Intrinsics.d(this.b, chaloPayWalletState.b) && Intrinsics.d(this.c, chaloPayWalletState.c) && this.d == chaloPayWalletState.d && Intrinsics.d(this.e, chaloPayWalletState.e) && Intrinsics.d(this.f, chaloPayWalletState.f) && this.g == chaloPayWalletState.g && this.h == chaloPayWalletState.h && Intrinsics.d(this.i, chaloPayWalletState.i);
    }

    public final int hashCode() {
        Boolean bool = this.f10909a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        WalletError walletError = this.d;
        int iHashCode4 = (iHashCode3 + (walletError == null ? 0 : walletError.hashCode())) * 31;
        Boolean bool4 = this.e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        WalletStatusForUI walletStatusForUI = this.g;
        int iHashCode7 = (iHashCode6 + (walletStatusForUI == null ? 0 : walletStatusForUI.hashCode())) * 31;
        WalletCTA walletCTA = this.h;
        int iHashCode8 = (iHashCode7 + (walletCTA == null ? 0 : walletCTA.hashCode())) * 31;
        WalletTypeIdentifier walletTypeIdentifier = this.i;
        return iHashCode8 + (walletTypeIdentifier != null ? walletTypeIdentifier.hashCode() : 0);
    }

    public final String toString() {
        return "ChaloPayWalletState(isWalletBlocked=" + this.f10909a + ", isWalletUsable=" + this.b + ", isLoadingWalletData=" + this.c + ", walletError=" + this.d + ", isKYCDone=" + this.e + ", walletBalance=" + this.f + ", walletUI=" + this.g + ", walletCTA=" + this.h + ", walletTypeIdentifier=" + this.i + ")";
    }
}
