package app.chalo.checkout.data.model.app.request;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/app/request/ChaloPayPaymentRequestAppModel;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloPayPaymentRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1336a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public ChaloPayPaymentRequestAppModel(String walletId, String orderId, String mobileNumber, String str, int i) {
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(mobileNumber, "mobileNumber");
        this.f1336a = walletId;
        this.b = orderId;
        this.c = mobileNumber;
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloPayPaymentRequestAppModel)) {
            return false;
        }
        ChaloPayPaymentRequestAppModel chaloPayPaymentRequestAppModel = (ChaloPayPaymentRequestAppModel) obj;
        return Intrinsics.d(this.f1336a, chaloPayPaymentRequestAppModel.f1336a) && Intrinsics.d(this.b, chaloPayPaymentRequestAppModel.b) && Intrinsics.d(this.c, chaloPayPaymentRequestAppModel.c) && Intrinsics.d(this.d, chaloPayPaymentRequestAppModel.d) && this.e == chaloPayPaymentRequestAppModel.e;
    }

    public final int hashCode() {
        return nf1.e(nf1.e(nf1.e(this.f1336a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d) + this.e;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ChaloPayPaymentRequestAppModel(walletId=", this.f1336a, ", orderId=", this.b, ", mobileNumber=");
        cb0.t(sbE, this.c, ", countryCode=", this.d, ", amount=");
        return b3.f(")", this.e, sbE);
    }
}
