package app.chalo.walletframework.wallet.data.model.appmodel;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/ClosedLoopWalletResponseAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClosedLoopWalletResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11003a;
    public final String b;

    public ClosedLoopWalletResponseAppModel(String walletId, String agency) {
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(agency, "agency");
        this.f11003a = walletId;
        this.b = agency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedLoopWalletResponseAppModel)) {
            return false;
        }
        ClosedLoopWalletResponseAppModel closedLoopWalletResponseAppModel = (ClosedLoopWalletResponseAppModel) obj;
        return Intrinsics.d(this.f11003a, closedLoopWalletResponseAppModel.f11003a) && Intrinsics.d(this.b, closedLoopWalletResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11003a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("ClosedLoopWalletResponseAppModel(walletId=", this.f11003a, ", agency=", this.b, ")");
    }
}
