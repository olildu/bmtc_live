package app.chalo.walletframework.wallet.data.mapper;

import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletAppModelToEntityModelMapperKt {
    public static final WalletEntity a(WalletAppModel walletAppModel) {
        Intrinsics.i(walletAppModel, "<this>");
        if (walletAppModel instanceof WalletAppModel.SemiClosedLoop) {
            WalletAppModel.SemiClosedLoop semiClosedLoop = (WalletAppModel.SemiClosedLoop) walletAppModel;
            return new WalletEntity(semiClosedLoop.b, semiClosedLoop.f11008a, WalletType.SEMI_CLOSED, "", semiClosedLoop.c, semiClosedLoop.d, semiClosedLoop.e, semiClosedLoop.f);
        }
        if (!(walletAppModel instanceof WalletAppModel.ClosedLoop)) {
            throw new NoWhenBranchMatchedException();
        }
        WalletAppModel.ClosedLoop closedLoop = (WalletAppModel.ClosedLoop) walletAppModel;
        return new WalletEntity(closedLoop.b, closedLoop.f11007a, WalletType.CLOSED, closedLoop.g, closedLoop.c, closedLoop.d, closedLoop.e, closedLoop.f);
    }
}
