package app.chalo.walletframework.wallet.data.model;

import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/WalletTypeIdentifier;", "", "Companion", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletTypeIdentifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletType f10959a;
    public final String b;
    public final boolean c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/WalletTypeIdentifier$Companion;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static WalletTypeIdentifier a(String agency) {
            Intrinsics.i(agency, "agency");
            WalletType walletType = WalletType.CLOSED;
            String lowerCase = agency.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            return new WalletTypeIdentifier(walletType, lowerCase);
        }

        public static WalletTypeIdentifier b(WalletAppModel wallet) {
            Intrinsics.i(wallet, "wallet");
            if (wallet instanceof WalletAppModel.ClosedLoop) {
                return a(((WalletAppModel.ClosedLoop) wallet).g);
            }
            if (wallet instanceof WalletAppModel.SemiClosedLoop) {
                return c();
            }
            throw new NoWhenBranchMatchedException();
        }

        public static WalletTypeIdentifier c() {
            return new WalletTypeIdentifier(WalletType.SEMI_CLOSED, "");
        }
    }

    public WalletTypeIdentifier(WalletType walletType, String str) {
        this.f10959a = walletType;
        this.b = str;
        this.c = walletType == WalletType.SEMI_CLOSED;
        this.d = walletType == WalletType.CLOSED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTypeIdentifier)) {
            return false;
        }
        WalletTypeIdentifier walletTypeIdentifier = (WalletTypeIdentifier) obj;
        return this.f10959a == walletTypeIdentifier.f10959a && Intrinsics.d(this.b, walletTypeIdentifier.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10959a.hashCode() * 31);
    }

    public final String toString() {
        return "WalletTypeIdentifier(type=" + this.f10959a + ", agency=" + this.b + ")";
    }
}
