package app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs;

import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import defpackage.vo1;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/NoWalletStatusRequest;", "", "SemiClosedWallet", "ClosedLoopWallet", "Companion", "Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/NoWalletStatusRequest$ClosedLoopWallet;", "Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/NoWalletStatusRequest$SemiClosedWallet;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NoWalletStatusRequest {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/NoWalletStatusRequest$ClosedLoopWallet;", "Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/NoWalletStatusRequest;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClosedLoopWallet extends NoWalletStatusRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10950a;

        public ClosedLoopWallet(String str) {
            this.f10950a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClosedLoopWallet) && Intrinsics.d(this.f10950a, ((ClosedLoopWallet) obj).f10950a);
        }

        public final int hashCode() {
            return this.f10950a.hashCode();
        }

        public final String toString() {
            return vo1.B("ClosedLoopWallet(agency=", this.f10950a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/NoWalletStatusRequest$Companion;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10951a;

            static {
                int[] iArr = new int[WalletType.values().length];
                try {
                    iArr[WalletType.SEMI_CLOSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WalletType.CLOSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f10951a = iArr;
            }
        }

        public static NoWalletStatusRequest a(WalletTypeIdentifier identifier) {
            Intrinsics.i(identifier, "identifier");
            int i = WhenMappings.f10951a[identifier.f10959a.ordinal()];
            if (i == 1) {
                return SemiClosedWallet.f10952a;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String lowerCase = identifier.b.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            return new ClosedLoopWallet(lowerCase);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/NoWalletStatusRequest$SemiClosedWallet;", "Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/NoWalletStatusRequest;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SemiClosedWallet extends NoWalletStatusRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SemiClosedWallet f10952a = new SemiClosedWallet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SemiClosedWallet);
        }

        public final int hashCode() {
            return 1677747541;
        }

        public final String toString() {
            return "SemiClosedWallet";
        }
    }
}
