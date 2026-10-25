package app.chalo.walletframework.wallet.data.model.appmodel;

import app.chalo.features.wallet.WalletSyncRequest;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletAppModelKt {
    public static final WalletSyncRequest a(WalletAppModel walletAppModel) {
        Intrinsics.i(walletAppModel, "<this>");
        if (walletAppModel instanceof WalletAppModel.ClosedLoop) {
            WalletAppModel.ClosedLoop closedLoop = (WalletAppModel.ClosedLoop) walletAppModel;
            return new WalletSyncRequest.ClosedLoop(closedLoop.f11007a, closedLoop.g);
        }
        if (walletAppModel instanceof WalletAppModel.SemiClosedLoop) {
            return WalletSyncRequest.SemiClosed.f2769a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
