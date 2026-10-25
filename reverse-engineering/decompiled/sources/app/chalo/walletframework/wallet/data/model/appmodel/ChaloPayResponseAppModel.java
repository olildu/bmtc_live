package app.chalo.walletframework.wallet.data.model.appmodel;

import app.chalo.walletframework.wallet.data.model.ChaloPayOrderStatus;
import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/ChaloPayResponseAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloPayResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11002a;
    public final int b;
    public final String c;
    public final long d;
    public final ChaloPayOrderStatus e;
    public final String f;
    public final String g;
    public final String h;

    public ChaloPayResponseAppModel(String orderId, int i, String transactionId, long j, ChaloPayOrderStatus status, String str, String str2, String walletId) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(status, "status");
        Intrinsics.i(walletId, "walletId");
        this.f11002a = orderId;
        this.b = i;
        this.c = transactionId;
        this.d = j;
        this.e = status;
        this.f = str;
        this.g = str2;
        this.h = walletId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayResponseAppModel)) {
            return false;
        }
        ChaloPayResponseAppModel chaloPayResponseAppModel = (ChaloPayResponseAppModel) obj;
        return Intrinsics.d(this.f11002a, chaloPayResponseAppModel.f11002a) && this.b == chaloPayResponseAppModel.b && Intrinsics.d(this.c, chaloPayResponseAppModel.c) && this.d == chaloPayResponseAppModel.d && this.e == chaloPayResponseAppModel.e && Intrinsics.d(this.f, chaloPayResponseAppModel.f) && Intrinsics.d(this.g, chaloPayResponseAppModel.g) && Intrinsics.d(this.h, chaloPayResponseAppModel.h);
    }

    public final int hashCode() {
        int iE = nf1.e(((this.f11002a.hashCode() * 31) + this.b) * 31, 31, this.c);
        long j = this.d;
        int iHashCode = (this.e.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return this.h.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "ChaloPayResponseAppModel(orderId=", this.f11002a, ", amount=", ", transactionId=");
        n21.p(this.d, this.c, ", transactionTime=", sbM);
        sbM.append(", status=");
        sbM.append(this.e);
        sbM.append(", productType=");
        sbM.append(this.f);
        cb0.t(sbM, ", productName=", this.g, ", walletId=", this.h);
        sbM.append(")");
        return sbM.toString();
    }
}
