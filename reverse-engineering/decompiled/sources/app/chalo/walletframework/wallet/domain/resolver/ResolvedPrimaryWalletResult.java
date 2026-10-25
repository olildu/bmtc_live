package app.chalo.walletframework.wallet.domain.resolver;

import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult;", "", "NotLoggedIn", "ResolvedWallet", "NoWalletConfigEnabled", "Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult$NoWalletConfigEnabled;", "Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult$NotLoggedIn;", "Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult$ResolvedWallet;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ResolvedPrimaryWalletResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult$NoWalletConfigEnabled;", "Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoWalletConfigEnabled extends ResolvedPrimaryWalletResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoWalletConfigEnabled f11096a = new NoWalletConfigEnabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoWalletConfigEnabled);
        }

        public final int hashCode() {
            return -1347636663;
        }

        public final String toString() {
            return "NoWalletConfigEnabled";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult$NotLoggedIn;", "Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotLoggedIn extends ResolvedPrimaryWalletResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotLoggedIn f11097a = new NotLoggedIn();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotLoggedIn);
        }

        public final int hashCode() {
            return -1377796386;
        }

        public final String toString() {
            return "NotLoggedIn";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult$ResolvedWallet;", "Lapp/chalo/walletframework/wallet/domain/resolver/ResolvedPrimaryWalletResult;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResolvedWallet extends ResolvedPrimaryWalletResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletTypeIdentifier f11098a;
        public final WalletAppModel b;

        public ResolvedWallet(WalletTypeIdentifier walletTypeIdentifier, WalletAppModel walletAppModel) {
            Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
            this.f11098a = walletTypeIdentifier;
            this.b = walletAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResolvedWallet)) {
                return false;
            }
            ResolvedWallet resolvedWallet = (ResolvedWallet) obj;
            return Intrinsics.d(this.f11098a, resolvedWallet.f11098a) && Intrinsics.d(this.b, resolvedWallet.b);
        }

        public final int hashCode() {
            int iHashCode = this.f11098a.hashCode() * 31;
            WalletAppModel walletAppModel = this.b;
            return iHashCode + (walletAppModel == null ? 0 : walletAppModel.hashCode());
        }

        public final String toString() {
            return "ResolvedWallet(walletTypeIdentifier=" + this.f11098a + ", wallet=" + this.b + ")";
        }
    }
}
