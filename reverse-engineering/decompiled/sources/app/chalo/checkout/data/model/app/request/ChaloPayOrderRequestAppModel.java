package app.chalo.checkout.data.model.app.request;

import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/app/request/ChaloPayOrderRequestAppModel;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloPayOrderRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1335a;
    public final int b;
    public final String c;
    public final String d;

    public ChaloPayOrderRequestAppModel(String chaloOrderId, int i, String str, String walletId) {
        Intrinsics.i(chaloOrderId, "chaloOrderId");
        Intrinsics.i(walletId, "walletId");
        this.f1335a = chaloOrderId;
        this.b = i;
        this.c = str;
        this.d = walletId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayOrderRequestAppModel)) {
            return false;
        }
        ChaloPayOrderRequestAppModel chaloPayOrderRequestAppModel = (ChaloPayOrderRequestAppModel) obj;
        return Intrinsics.d(this.f1335a, chaloPayOrderRequestAppModel.f1335a) && this.b == chaloPayOrderRequestAppModel.b && Intrinsics.d(this.c, chaloPayOrderRequestAppModel.c) && Intrinsics.d(this.d, chaloPayOrderRequestAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(((this.f1335a.hashCode() * 31) + this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return r30.i(xs.m(this.b, "ChaloPayOrderRequestAppModel(chaloOrderId=", this.f1335a, ", providerId=", ", city="), this.c, ", walletId=", this.d, ")");
    }
}
