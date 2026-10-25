package app.chalo.walletframework.wallet.domain.resolver;

import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolverSimplifiedResult;", "", "UserNotLogged", "Wallet", "Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolverSimplifiedResult$UserNotLogged;", "Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolverSimplifiedResult$Wallet;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletResolverSimplifiedResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolverSimplifiedResult$UserNotLogged;", "Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolverSimplifiedResult;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserNotLogged extends WalletResolverSimplifiedResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserNotLogged f11102a = new UserNotLogged();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserNotLogged);
        }

        public final int hashCode() {
            return 1375216638;
        }

        public final String toString() {
            return "UserNotLogged";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolverSimplifiedResult$Wallet;", "Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolverSimplifiedResult;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Wallet extends WalletResolverSimplifiedResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletAppModel f11103a;

        public Wallet(WalletAppModel walletAppModel) {
            this.f11103a = walletAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Wallet) && Intrinsics.d(this.f11103a, ((Wallet) obj).f11103a);
        }

        public final int hashCode() {
            WalletAppModel walletAppModel = this.f11103a;
            if (walletAppModel == null) {
                return 0;
            }
            return walletAppModel.hashCode();
        }

        public final String toString() {
            return "Wallet(wallet=" + this.f11103a + ")";
        }
    }
}
