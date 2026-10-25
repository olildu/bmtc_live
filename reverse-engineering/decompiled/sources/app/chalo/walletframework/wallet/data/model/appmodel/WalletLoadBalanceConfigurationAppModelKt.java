package app.chalo.walletframework.wallet.data.model.appmodel;

import app.chalo.contract.BasicInfoContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletLoadBalanceConfigurationAppModelKt {
    public static final boolean a(WalletLoadBalanceConfigurationAppModel walletLoadBalanceConfigurationAppModel, BasicInfoContract basicInfoContract) {
        int i = walletLoadBalanceConfigurationAppModel.f;
        int iH = basicInfoContract.h();
        int i2 = walletLoadBalanceConfigurationAppModel.e;
        if (i2 == -1 && i == -1) {
            return true;
        }
        if (i2 == -1) {
            return i >= iH;
        }
        if (i == -1) {
            return i2 <= iH;
        }
        return iH <= i && i2 <= iH;
    }
}
