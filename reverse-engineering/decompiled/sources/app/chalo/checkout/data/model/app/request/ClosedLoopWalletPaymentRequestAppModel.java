package app.chalo.checkout.data.model.app.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/app/request/ClosedLoopWalletPaymentRequestAppModel;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClosedLoopWalletPaymentRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1337a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;

    public ClosedLoopWalletPaymentRequestAppModel(int i, String walletId, String orderId, String userId, String str, String str2) {
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(userId, "userId");
        this.f1337a = walletId;
        this.b = orderId;
        this.c = userId;
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedLoopWalletPaymentRequestAppModel)) {
            return false;
        }
        ClosedLoopWalletPaymentRequestAppModel closedLoopWalletPaymentRequestAppModel = (ClosedLoopWalletPaymentRequestAppModel) obj;
        return Intrinsics.d(this.f1337a, closedLoopWalletPaymentRequestAppModel.f1337a) && Intrinsics.d(this.b, closedLoopWalletPaymentRequestAppModel.b) && Intrinsics.d(this.c, closedLoopWalletPaymentRequestAppModel.c) && this.d == closedLoopWalletPaymentRequestAppModel.d && Intrinsics.d(this.e, closedLoopWalletPaymentRequestAppModel.e) && Intrinsics.d(this.f, closedLoopWalletPaymentRequestAppModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + nf1.e((nf1.e(nf1.e(this.f1337a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ClosedLoopWalletPaymentRequestAppModel(walletId=", this.f1337a, ", orderId=", this.b, ", userId=");
        cb0.o(this.d, this.c, ", amount=", ", agency=", sbE);
        return r30.i(sbE, this.e, ", city=", this.f, ")");
    }
}
