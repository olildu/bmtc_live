package app.chalo.walletframework.wallet.data.model.appmodel;

import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/LoadMoneyAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoadMoneyAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11004a;
    public final int b;
    public final long c;
    public final String d;
    public final LoadMoneyOrderStatus e;
    public final String f;
    public final String g;
    public final String h;

    public LoadMoneyAppModel(String orderId, int i, long j, String transactionId, LoadMoneyOrderStatus status, String str, String userId, String walletId) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(status, "status");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        this.f11004a = orderId;
        this.b = i;
        this.c = j;
        this.d = transactionId;
        this.e = status;
        this.f = str;
        this.g = userId;
        this.h = walletId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoneyAppModel)) {
            return false;
        }
        LoadMoneyAppModel loadMoneyAppModel = (LoadMoneyAppModel) obj;
        return Intrinsics.d(this.f11004a, loadMoneyAppModel.f11004a) && this.b == loadMoneyAppModel.b && this.c == loadMoneyAppModel.c && Intrinsics.d(this.d, loadMoneyAppModel.d) && this.e == loadMoneyAppModel.e && Intrinsics.d(this.f, loadMoneyAppModel.f) && Intrinsics.d(this.g, loadMoneyAppModel.g) && Intrinsics.d(this.h, loadMoneyAppModel.h);
    }

    public final int hashCode() {
        int iHashCode = ((this.f11004a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        int iHashCode2 = (this.e.hashCode() + nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d)) * 31;
        String str = this.f;
        return this.h.hashCode() + nf1.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "LoadMoneyAppModel(orderId=", this.f11004a, ", amount=", ", transactionTime=");
        dd.k(this.c, ", transactionId=", this.d, sbM);
        sbM.append(", status=");
        sbM.append(this.e);
        sbM.append(", paymentMode=");
        sbM.append(this.f);
        cb0.t(sbM, ", userId=", this.g, ", walletId=", this.h);
        sbM.append(")");
        return sbM.toString();
    }
}
