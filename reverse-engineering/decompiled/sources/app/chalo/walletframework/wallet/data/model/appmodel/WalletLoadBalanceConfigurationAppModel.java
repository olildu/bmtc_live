package app.chalo.walletframework.wallet.data.model.appmodel;

import defpackage.dd;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletLoadBalanceConfigurationAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletLoadBalanceConfigurationAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11011a;
    public final String b;
    public final List c;
    public final Boolean d;
    public final int e;
    public final int f;

    public WalletLoadBalanceConfigurationAppModel(String str, String str2, List list, Boolean bool, int i, int i2) {
        this.f11011a = str;
        this.b = str2;
        this.c = list;
        this.d = bool;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadBalanceConfigurationAppModel)) {
            return false;
        }
        WalletLoadBalanceConfigurationAppModel walletLoadBalanceConfigurationAppModel = (WalletLoadBalanceConfigurationAppModel) obj;
        return Intrinsics.d(this.f11011a, walletLoadBalanceConfigurationAppModel.f11011a) && Intrinsics.d(this.b, walletLoadBalanceConfigurationAppModel.b) && Intrinsics.d(this.c, walletLoadBalanceConfigurationAppModel.c) && Intrinsics.d(this.d, walletLoadBalanceConfigurationAppModel.d) && this.e == walletLoadBalanceConfigurationAppModel.e && this.f == walletLoadBalanceConfigurationAppModel.f;
    }

    public final int hashCode() {
        String str = this.f11011a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.d;
        return ((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletLoadBalanceConfigurationAppModel(configId=", this.f11011a, ", agency=", this.b, ", termsAndConditions=");
        sbE.append(this.c);
        sbE.append(", isActive=");
        sbE.append(this.d);
        sbE.append(", minAppVer=");
        return xs.h(this.e, this.f, ", maxAppVer=", ")", sbE);
    }
}
