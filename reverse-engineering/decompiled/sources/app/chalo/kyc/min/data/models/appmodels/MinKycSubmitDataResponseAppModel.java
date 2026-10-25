package app.chalo.kyc.min.data.models.appmodels;

import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/data/models/appmodels/MinKycSubmitDataResponseAppModel;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinKycSubmitDataResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4103a;
    public final CachedWalletStatus b;
    public final String c;
    public final int d;
    public final long e;

    public MinKycSubmitDataResponseAppModel(String userId, CachedWalletStatus walletStatus, String walletId, int i, long j) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletStatus, "walletStatus");
        Intrinsics.i(walletId, "walletId");
        this.f4103a = userId;
        this.b = walletStatus;
        this.c = walletId;
        this.d = i;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycSubmitDataResponseAppModel)) {
            return false;
        }
        MinKycSubmitDataResponseAppModel minKycSubmitDataResponseAppModel = (MinKycSubmitDataResponseAppModel) obj;
        return Intrinsics.d(this.f4103a, minKycSubmitDataResponseAppModel.f4103a) && this.b == minKycSubmitDataResponseAppModel.b && Intrinsics.d(this.c, minKycSubmitDataResponseAppModel.c) && this.d == minKycSubmitDataResponseAppModel.d && this.e == minKycSubmitDataResponseAppModel.e;
    }

    public final int hashCode() {
        int iE = (nf1.e((this.b.hashCode() + (this.f4103a.hashCode() * 31)) * 31, 31, this.c) + this.d) * 31;
        long j = this.e;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinKycSubmitDataResponseAppModel(userId=");
        sb.append(this.f4103a);
        sb.append(", walletStatus=");
        sb.append(this.b);
        sb.append(", walletId=");
        cb0.o(this.d, this.c, ", balance=", ", remainingLoadLimit=", sb);
        return uf0.m(this.e, ")", sb);
    }
}
